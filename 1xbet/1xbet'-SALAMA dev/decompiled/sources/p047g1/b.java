package p047g1;

import W5.AbstractC0486a1;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.t;
import androidx.activity.g;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import p023d1.c;
import p023d1.n;
import p031e1.a;
import p031e1.l;
import p088m1.d;
import p088m1.i;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f13073d = n.g("CommandHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f13075b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13076c = new Object();

    public b(Context context) {
        this.f13074a = context;
    }

    public static Intent a(Context context, String str) {
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

    @Override // p031e1.a
    public final void b(String str, boolean z4) {
        synchronized (this.f13076c) {
            try {
                a aVar = (a) this.f13075b.remove(str);
                if (aVar != null) {
                    aVar.b(str, z4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(Intent intent, int i7, g gVar) {
        int i8 = 3;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            n.d().b(f13073d, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            d dVar = new d(this.f13074a, i7, gVar);
            ArrayList<i> arrayListG = gVar.f13100e.f12552f.n().g();
            String str = c.f13077a;
            Iterator it = arrayListG.iterator();
            boolean z4 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            while (it.hasNext()) {
                c cVar = ((i) it.next()).j;
                z4 |= cVar.f12352d;
                z7 |= cVar.f12350b;
                z8 |= cVar.f12353e;
                z9 |= cVar.f12349a != 1;
                if (z4 && z7 && z8 && z9) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f9878a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = dVar.f13079a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z4).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z7).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z8).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z9);
            context.sendBroadcast(intent2);
            p060i1.c cVar2 = dVar.f13081c;
            cVar2.b(arrayListG);
            ArrayList arrayList = new ArrayList(arrayListG.size());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (i iVar : arrayListG) {
                String str3 = iVar.f15222a;
                if (jCurrentTimeMillis >= iVar.a() && (!iVar.b() || cVar2.a(str3))) {
                    arrayList.add(iVar);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                String str4 = ((i) it2.next()).f15222a;
                Intent intentA = a(context, str4);
                n.d().b(d.f13078d, AbstractC0486a1.h("Creating a delay_met command for workSpec with id (", str4, ")"), new Throwable[0]);
                gVar.e(new g(gVar, intentA, dVar.f13080b, i8));
            }
            cVar2.c();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            n.d().b(f13073d, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i7)), new Throwable[0]);
            gVar.f13100e.p0();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            n.d().c(f13073d, AbstractC0486a1.h("Invalid request for ", action, ", requires KEY_WORKSPEC_ID."), new Throwable[0]);
            return;
        }
        if (!"ACTION_SCHEDULE_WORK".equals(action)) {
            if ("ACTION_DELAY_MET".equals(action)) {
                Bundle extras2 = intent.getExtras();
                synchronized (this.f13076c) {
                    try {
                        String string = extras2.getString("KEY_WORKSPEC_ID");
                        n nVarD = n.d();
                        String str5 = f13073d;
                        nVarD.b(str5, "Handing delay met for " + string, new Throwable[0]);
                        if (this.f13075b.containsKey(string)) {
                            n.d().b(str5, "WorkSpec " + string + " is already being handled for ACTION_DELAY_MET", new Throwable[0]);
                        } else {
                            e eVar = new e(this.f13074a, i7, string, gVar);
                            this.f13075b.put(string, eVar);
                            eVar.c();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            if (!"ACTION_STOP_WORK".equals(action)) {
                if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                    n.d().i(f13073d, String.format("Ignoring intent %s", intent), new Throwable[0]);
                    return;
                }
                Bundle extras3 = intent.getExtras();
                String string2 = extras3.getString("KEY_WORKSPEC_ID");
                boolean z10 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                n.d().b(f13073d, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i7)), new Throwable[0]);
                b(string2, z10);
                return;
            }
            String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
            n.d().b(f13073d, L.i("Handing stopWork work for ", string3), new Throwable[0]);
            gVar.f13100e.r0(string3);
            String str6 = a.f13072a;
            t tVarK = gVar.f13100e.f12552f.k();
            d dVarF0 = tVarK.f0(string3);
            if (dVarF0 != null) {
                a.a(this.f13074a, dVarF0.f15215b, string3);
                n.d().b(a.f13072a, AbstractC0486a1.h("Removing SystemIdInfo for workSpecId (", string3, ")"), new Throwable[0]);
                tVarK.v0(string3);
            }
            gVar.b(string3, false);
            return;
        }
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        String str7 = f13073d;
        n.d().b(str7, L.i("Handling schedule work for ", string4), new Throwable[0]);
        WorkDatabase workDatabase = gVar.f13100e.f12552f;
        workDatabase.c();
        try {
            i iVarL = workDatabase.n().l(string4);
            if (iVarL == null) {
                n.d().i(str7, "Skipping scheduling " + string4 + " because it's no longer in the DB", new Throwable[0]);
            } else if (AbstractC0486a1.b(iVarL.f15223b)) {
                n.d().i(str7, "Skipping scheduling " + string4 + "because it is finished.", new Throwable[0]);
            } else {
                long jA = iVarL.a();
                boolean zB = iVarL.b();
                Context context2 = this.f13074a;
                l lVar = gVar.f13100e;
                if (zB) {
                    n.d().b(str7, "Opportunistically setting an alarm for " + string4 + " at " + jA, new Throwable[0]);
                    a.b(context2, lVar, string4, jA);
                    Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                    gVar.e(new g(gVar, intent3, i7, i8));
                } else {
                    n.d().b(str7, "Setting up Alarms for " + string4 + " at " + jA, new Throwable[0]);
                    a.b(context2, lVar, string4, jA);
                }
                workDatabase.h();
            }
        } finally {
            workDatabase.f();
        }
    }
}
