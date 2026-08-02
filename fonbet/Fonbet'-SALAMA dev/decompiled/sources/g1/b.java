package g1;

import W5.AbstractC0486a1;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.media.session.t;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import d1.C0950c;
import d1.n;
import e1.InterfaceC0994a;
import e1.l;
import i1.C1244c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import m1.C1429d;
import m1.i;
import w1.L;

/* loaded from: classes.dex */
public final class b implements InterfaceC0994a {

    /* renamed from: d, reason: collision with root package name */
    public static final String f13067d = n.g("CommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f13068a;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f13069b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Object f13070c = new Object();

    public b(Context context) {
        this.f13068a = context;
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

    @Override // e1.InterfaceC0994a
    public final void b(String str, boolean z4) {
        synchronized (this.f13070c) {
            try {
                InterfaceC0994a interfaceC0994a = (InterfaceC0994a) this.f13069b.remove(str);
                if (interfaceC0994a != null) {
                    interfaceC0994a.b(str, z4);
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
            n.d().b(f13067d, String.format("Handling constraints changed %s", intent), new Throwable[0]);
            d dVar = new d(this.f13068a, i7, gVar);
            ArrayList g3 = gVar.f13094e.f12546f.n().g();
            String str = c.f13071a;
            Iterator it = g3.iterator();
            boolean z4 = false;
            boolean z7 = false;
            boolean z8 = false;
            boolean z9 = false;
            while (it.hasNext()) {
                C0950c c0950c = ((i) it.next()).j;
                z4 |= c0950c.f12346d;
                z7 |= c0950c.f12344b;
                z8 |= c0950c.f12347e;
                z9 |= c0950c.f12343a != 1;
                if (z4 && z7 && z8 && z9) {
                    break;
                }
            }
            String str2 = ConstraintProxyUpdateReceiver.f9878a;
            Intent intent2 = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
            Context context = dVar.f13073a;
            intent2.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
            intent2.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z4).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z7).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z8).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z9);
            context.sendBroadcast(intent2);
            C1244c c1244c = dVar.f13075c;
            c1244c.b(g3);
            ArrayList arrayList = new ArrayList(g3.size());
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it2 = g3.iterator();
            while (it2.hasNext()) {
                i iVar = (i) it2.next();
                String str3 = iVar.f15216a;
                if (currentTimeMillis >= iVar.a() && (!iVar.b() || c1244c.a(str3))) {
                    arrayList.add(iVar);
                }
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                String str4 = ((i) it3.next()).f15216a;
                Intent a2 = a(context, str4);
                n.d().b(d.f13072d, AbstractC0486a1.h("Creating a delay_met command for workSpec with id (", str4, ")"), new Throwable[0]);
                gVar.e(new androidx.activity.g(gVar, a2, dVar.f13074b, i8));
            }
            c1244c.c();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            n.d().b(f13067d, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i7)), new Throwable[0]);
            gVar.f13094e.p0();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            n.d().c(f13067d, AbstractC0486a1.h("Invalid request for ", action, ", requires KEY_WORKSPEC_ID."), new Throwable[0]);
            return;
        }
        if (!"ACTION_SCHEDULE_WORK".equals(action)) {
            if ("ACTION_DELAY_MET".equals(action)) {
                Bundle extras2 = intent.getExtras();
                synchronized (this.f13070c) {
                    try {
                        String string = extras2.getString("KEY_WORKSPEC_ID");
                        n d7 = n.d();
                        String str5 = f13067d;
                        d7.b(str5, "Handing delay met for " + string, new Throwable[0]);
                        if (this.f13069b.containsKey(string)) {
                            n.d().b(str5, "WorkSpec " + string + " is already being handled for ACTION_DELAY_MET", new Throwable[0]);
                        } else {
                            e eVar = new e(this.f13068a, i7, string, gVar);
                            this.f13069b.put(string, eVar);
                            eVar.c();
                        }
                    } finally {
                    }
                }
                return;
            }
            if (!"ACTION_STOP_WORK".equals(action)) {
                if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                    n.d().i(f13067d, String.format("Ignoring intent %s", intent), new Throwable[0]);
                    return;
                }
                Bundle extras3 = intent.getExtras();
                String string2 = extras3.getString("KEY_WORKSPEC_ID");
                boolean z10 = extras3.getBoolean("KEY_NEEDS_RESCHEDULE");
                n.d().b(f13067d, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i7)), new Throwable[0]);
                b(string2, z10);
                return;
            }
            String string3 = intent.getExtras().getString("KEY_WORKSPEC_ID");
            n.d().b(f13067d, L.i("Handing stopWork work for ", string3), new Throwable[0]);
            gVar.f13094e.r0(string3);
            String str6 = AbstractC1127a.f13066a;
            t k7 = gVar.f13094e.f12546f.k();
            C1429d f02 = k7.f0(string3);
            if (f02 != null) {
                AbstractC1127a.a(this.f13068a, f02.f15209b, string3);
                n.d().b(AbstractC1127a.f13066a, AbstractC0486a1.h("Removing SystemIdInfo for workSpecId (", string3, ")"), new Throwable[0]);
                k7.v0(string3);
            }
            gVar.b(string3, false);
            return;
        }
        String string4 = intent.getExtras().getString("KEY_WORKSPEC_ID");
        String str7 = f13067d;
        n.d().b(str7, L.i("Handling schedule work for ", string4), new Throwable[0]);
        WorkDatabase workDatabase = gVar.f13094e.f12546f;
        workDatabase.c();
        try {
            i l7 = workDatabase.n().l(string4);
            if (l7 == null) {
                n.d().i(str7, "Skipping scheduling " + string4 + " because it's no longer in the DB", new Throwable[0]);
            } else if (AbstractC0486a1.b(l7.f15217b)) {
                n.d().i(str7, "Skipping scheduling " + string4 + "because it is finished.", new Throwable[0]);
            } else {
                long a4 = l7.a();
                boolean b7 = l7.b();
                Context context2 = this.f13068a;
                l lVar = gVar.f13094e;
                if (b7) {
                    n.d().b(str7, "Opportunistically setting an alarm for " + string4 + " at " + a4, new Throwable[0]);
                    AbstractC1127a.b(context2, lVar, string4, a4);
                    Intent intent3 = new Intent(context2, (Class<?>) SystemAlarmService.class);
                    intent3.setAction("ACTION_CONSTRAINTS_CHANGED");
                    gVar.e(new androidx.activity.g(gVar, intent3, i7, i8));
                } else {
                    n.d().b(str7, "Setting up Alarms for " + string4 + " at " + a4, new Throwable[0]);
                    AbstractC1127a.b(context2, lVar, string4, a4);
                }
                workDatabase.h();
            }
            workDatabase.f();
        } catch (Throwable th) {
            workDatabase.f();
            throw th;
        }
    }
}
