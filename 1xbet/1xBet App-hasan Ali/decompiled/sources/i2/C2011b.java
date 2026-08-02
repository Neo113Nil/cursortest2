package i2;

import a3.AbstractC0467k;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import f2.C1945c;
import f2.m;
import g2.InterfaceC1977a;
import g2.l;
import java.util.ArrayList;
import java.util.HashMap;
import k2.C2032c;
import o2.i;

/* renamed from: i2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2011b implements InterfaceC1977a {

    /* renamed from: n, reason: collision with root package name */
    public static final String f17305n = m.f("CommandHandler");

    /* renamed from: k, reason: collision with root package name */
    public final Context f17306k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f17307l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final Object f17308m = new Object();

    public C2011b(Context context) {
        this.f17306k = context;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    @Override // g2.InterfaceC1977a
    public final void a(String str, boolean z3) {
        synchronized (this.f17308m) {
            try {
                InterfaceC1977a interfaceC1977a = (InterfaceC1977a) this.f17307l.remove(str);
                if (interfaceC1977a != null) {
                    interfaceC1977a.a(str, z3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean d() {
        boolean z3;
        synchronized (this.f17308m) {
            z3 = !this.f17307l.isEmpty();
        }
        return z3;
    }

    public final void e(Intent intent, int i, h hVar) {
        String action = intent.getAction();
        int i5 = 0;
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            m.d().a(f17305n, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            C2013d c2013d = new C2013d(this.f17306k, i, hVar);
            ArrayList d5 = hVar.f17335o.f17130m.n().d();
            String str = AbstractC2012c.f17309a;
            int size = d5.size();
            boolean z3 = false;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            int i6 = 0;
            while (i6 < size) {
                Object obj = d5.get(i6);
                i6++;
                C1945c c1945c = ((i) obj).f18640j;
                z3 |= c1945c.f16985d;
                z5 |= c1945c.f16983b;
                z6 |= c1945c.f16986e;
                z7 |= c1945c.f16982a != 1;
                if (z3 && z5 && z6 && z7) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f7108a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = c2013d.f17311a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z3).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z5).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z6).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z7);
            context.sendBroadcast(intent2);
            C2032c c2032c = c2013d.f17313c;
            c2032c.c(d5);
            ArrayList arrayList = new ArrayList(d5.size());
            long currentTimeMillis = System.currentTimeMillis();
            int size2 = d5.size();
            int i7 = 0;
            while (i7 < size2) {
                Object obj2 = d5.get(i7);
                i7++;
                i iVar = (i) obj2;
                String str3 = iVar.f18633a;
                if (currentTimeMillis >= iVar.a() && (!iVar.b() || c2032c.a(str3))) {
                    arrayList.add(iVar);
                }
            }
            int size3 = arrayList.size();
            int i8 = 0;
            while (i8 < size3) {
                Object obj3 = arrayList.get(i8);
                i8++;
                String str4 = ((i) obj3).f18633a;
                Intent b3 = b(context, str4);
                m.d().a(C2013d.f17310d, L1.a.n("Creating a delay_met command for workSpec with id (", str4, ")"), new Throwable[0]);
                hVar.f(new g(c2013d.f17312b, i5, hVar, b3));
            }
            c2032c.d();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            m.d().a(f17305n, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
            hVar.f17335o.T();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            m.d().b(f17305n, L1.a.n("Invalid request for ", action, ", requires KEY_WORKSPEC_ID."), new Throwable[0]);
            return;
        }
        if (!"ACTION_SCHEDULE_WORK".equals(action)) {
            if ("ACTION_DELAY_MET".equals(action)) {
                Bundle extras2 = intent.getExtras();
                synchronized (this.f17308m) {
                    try {
                        String string = extras2.getString("KEY_WORKSPEC_ID");
                        m d6 = m.d();
                        String str5 = f17305n;
                        d6.a(str5, "Handing delay met for " + string, new Throwable[0]);
                        if (this.f17307l.containsKey(string)) {
                            m.d().a(str5, "WorkSpec " + string + " is already being handled for ACTION_DELAY_MET", new Throwable[0]);
                        } else {
                            e eVar = new e(this.f17306k, i, string, hVar);
                            this.f17307l.put(string, eVar);
                            eVar.d();
                        }
                    } finally {
                    }
                }
                return;
            }
            if (!"ACTION_STOP_WORK".equals(action)) {
                if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                    m.d().h(f17305n, String.format("Ignoring intent %s", intent), new Throwable[0]);
                    return;
                }
                Bundle extras3 = intent.getExtras();
                String string2 = extras3.getString("KEY_WORKSPEC_ID");
                boolean z8 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                m.d().a(f17305n, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i)), new Throwable[0]);
                a(string2, z8);
                return;
            }
            String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
            m.d().a(f17305n, L1.a.m("Handing stopWork work for ", string3), new Throwable[0]);
            hVar.f17335o.V(string3);
            String str6 = AbstractC2010a.f17304a;
            v3.e k5 = hVar.f17335o.f17130m.k();
            o2.d B5 = k5.B(string3);
            if (B5 != null) {
                AbstractC2010a.a(B5.f18626b, this.f17306k, string3);
                m.d().a(AbstractC2010a.f17304a, L1.a.n("Removing SystemIdInfo for workSpecId (", string3, ")"), new Throwable[0]);
                k5.K(string3);
            }
            hVar.a(string3, false);
            return;
        }
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        String str7 = f17305n;
        m.d().a(str7, L1.a.m("Handling schedule work for ", string4), new Throwable[0]);
        WorkDatabase workDatabase = hVar.f17335o.f17130m;
        workDatabase.c();
        try {
            i h3 = workDatabase.n().h(string4);
            if (h3 == null) {
                m.d().h(str7, "Skipping scheduling " + string4 + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (AbstractC0467k.f(h3.f18634b)) {
                m.d().h(str7, "Skipping scheduling " + string4 + "because it is finished.", new Throwable[0]);
                return;
            }
            long a5 = h3.a();
            boolean b5 = h3.b();
            Context context2 = this.f17306k;
            l lVar = hVar.f17335o;
            if (b5) {
                m.d().a(str7, "Opportunistically setting an alarm for " + string4 + " at " + a5, new Throwable[0]);
                AbstractC2010a.b(context2, lVar, string4, a5);
                Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                hVar.f(new g(i, i5, hVar, intent3));
            } else {
                m.d().a(str7, "Setting up Alarms for " + string4 + " at " + a5, new Throwable[0]);
                AbstractC2010a.b(context2, lVar, string4, a5);
            }
            workDatabase.h();
        } finally {
            workDatabase.f();
        }
    }
}
