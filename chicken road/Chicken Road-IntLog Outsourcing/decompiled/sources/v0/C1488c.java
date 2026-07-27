package v0;

import B0.j;
import B0.o;
import B0.q;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import b2.AbstractC0279e;
import c0.C0307i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import s0.C1416d;
import s0.s;
import t0.InterfaceC1425d;
import u1.AbstractC1477a;

/* renamed from: v0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1488c implements InterfaceC1425d {

    /* renamed from: e, reason: collision with root package name */
    public static final String f12056e = s.f("CommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f12057a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f12058b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Object f12059c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public final x1.e f12060d;

    public C1488c(Context context, x1.e eVar) {
        this.f12057a = context;
        this.f12060d = eVar;
    }

    public static j b(Intent intent) {
        return new j(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    public static void c(Intent intent, j jVar) {
        intent.putExtra("KEY_WORKSPEC_ID", jVar.f157a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", jVar.f158b);
    }

    public final void a(int i2, Intent intent, C1494i c1494i) {
        List<t0.j> list;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            s.d().a(f12056e, "Handling constraints changed " + intent);
            C1490e c1490e = new C1490e(this.f12057a, i2, c1494i);
            ArrayList d6 = c1494i.f12088e.f11884c.t().d();
            String str = AbstractC1489d.f12061a;
            Iterator it = d6.iterator();
            boolean z = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            while (it.hasNext()) {
                C1416d c1416d = ((q) it.next()).f182j;
                z |= c1416d.f11765d;
                z5 |= c1416d.f11763b;
                z6 |= c1416d.f11766e;
                z7 |= c1416d.f11762a != 1;
                if (z && z5 && z6 && z7) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f4736a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = c1490e.f12063a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z5).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z6).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z7);
            context.sendBroadcast(intent2);
            x0.c cVar = c1490e.f12065c;
            cVar.d(d6);
            ArrayList arrayList = new ArrayList(d6.size());
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = d6.iterator();
            while (it2.hasNext()) {
                q qVar = (q) it2.next();
                String str3 = qVar.f173a;
                if (currentTimeMillis >= qVar.a() && (!qVar.b() || cVar.a(str3))) {
                    arrayList.add(qVar);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                q qVar2 = (q) it3.next();
                String str4 = qVar2.f173a;
                j p5 = AbstractC1477a.p(qVar2);
                Intent intent3 = new Intent(context, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_DELAY_MET");
                c(intent3, p5);
                s.d().a(C1490e.f12062d, AbstractC0279e.f("Creating a delay_met command for workSpec with id (", str4, ")"));
                ((A.c) c1494i.f12085b.f313d).execute(new A0.d(c1490e.f12064b, intent3, c1494i));
            }
            cVar.e();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            s.d().a(f12056e, "Handling reschedule " + intent + ", " + i2);
            c1494i.f12088e.d();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            s.d().b(f12056e, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            j b6 = b(intent);
            String str5 = f12056e;
            s.d().a(str5, "Handling schedule work for " + b6);
            WorkDatabase workDatabase = c1494i.f12088e.f11884c;
            workDatabase.c();
            try {
                q g6 = workDatabase.t().g(b6.f157a);
                if (g6 == null) {
                    s.d().g(str5, "Skipping scheduling " + b6 + " because it's no longer in the DB");
                } else if (AbstractC0279e.a(g6.f174b)) {
                    s.d().g(str5, "Skipping scheduling " + b6 + "because it is finished.");
                } else {
                    long a6 = g6.a();
                    boolean b7 = g6.b();
                    Context context2 = this.f12057a;
                    if (b7) {
                        s.d().a(str5, "Opportunistically setting an alarm for " + b6 + "at " + a6);
                        AbstractC1487b.b(context2, workDatabase, b6, a6);
                        Intent intent4 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                        intent4.setAction("ACTION_CONSTRAINTS_CHANGED");
                        ((A.c) c1494i.f12085b.f313d).execute(new A0.d(i2, intent4, c1494i));
                    } else {
                        s.d().a(str5, "Setting up Alarms for " + b6 + "at " + a6);
                        AbstractC1487b.b(context2, workDatabase, b6, a6);
                    }
                    workDatabase.o();
                }
                return;
            } finally {
                workDatabase.k();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f12059c) {
                try {
                    j b8 = b(intent);
                    s d7 = s.d();
                    String str6 = f12056e;
                    d7.a(str6, "Handing delay met for " + b8);
                    if (this.f12058b.containsKey(b8)) {
                        s.d().a(str6, "WorkSpec " + b8 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        C1492g c1492g = new C1492g(this.f12057a, i2, c1494i, this.f12060d.u(b8));
                        this.f12058b.put(b8, c1492g);
                        c1492g.e();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                s.d().g(f12056e, "Ignoring intent " + intent);
                return;
            }
            j b9 = b(intent);
            boolean z8 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            s.d().a(f12056e, "Handling onExecutionCompleted " + intent + ", " + i2);
            d(b9, z8);
            return;
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean containsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        x1.e eVar = this.f12060d;
        if (containsKey) {
            int i3 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList2 = new ArrayList(1);
            t0.j t5 = eVar.t(new j(string, i3));
            list = arrayList2;
            if (t5 != null) {
                arrayList2.add(t5);
                list = arrayList2;
            }
        } else {
            list = eVar.s(string);
        }
        for (t0.j jVar : list) {
            s.d().a(f12056e, o.i("Handing stopWork work for ", string));
            t0.o oVar = c1494i.f12088e;
            oVar.f11885d.o(new C0.o(oVar, jVar, false));
            WorkDatabase workDatabase2 = c1494i.f12088e.f11884c;
            j jVar2 = jVar.f11867a;
            String str7 = AbstractC1487b.f12055a;
            B0.i p6 = workDatabase2.p();
            B0.g a7 = p6.a(jVar2);
            if (a7 != null) {
                AbstractC1487b.a(this.f12057a, jVar2, a7.f150c);
                s.d().a(AbstractC1487b.f12055a, "Removing SystemIdInfo for workSpecId (" + jVar2 + ")");
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) p6.f153b;
                workDatabase_Impl.b();
                B0.h hVar = (B0.h) p6.f155d;
                C0307i a8 = hVar.a();
                String str8 = jVar2.f157a;
                if (str8 == null) {
                    a8.j(1);
                } else {
                    a8.f(1, str8);
                }
                a8.t(2, jVar2.f158b);
                workDatabase_Impl.c();
                try {
                    a8.a();
                    workDatabase_Impl.o();
                } finally {
                    workDatabase_Impl.k();
                    hVar.n(a8);
                }
            }
            c1494i.d(jVar.f11867a, false);
        }
    }

    @Override // t0.InterfaceC1425d
    public final void d(j jVar, boolean z) {
        synchronized (this.f12059c) {
            try {
                C1492g c1492g = (C1492g) this.f12058b.remove(jVar);
                this.f12060d.t(jVar);
                if (c1492g != null) {
                    c1492g.f(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
