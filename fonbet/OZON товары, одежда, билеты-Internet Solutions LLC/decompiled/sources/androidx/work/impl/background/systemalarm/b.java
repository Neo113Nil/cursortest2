package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.work.impl.InterfaceC5476d;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.f;
import androidx.work.impl.t;
import androidx.work.impl.u;
import androidx.work.o;
import g5.C6627B;
import g5.C6643p;
import i5.C7009b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes8.dex */
public final class b implements InterfaceC5476d {

    /* renamed from: e, reason: collision with root package name */
    private static final String f45373e = o.i("CommandHandler");

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f45374f = 0;

    /* renamed from: a, reason: collision with root package name */
    private final Context f45375a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f45376b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final Object f45377c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private final u f45378d;

    b(@NonNull Context context, @NonNull u uVar) {
        this.f45375a = context;
        this.f45378d = uVar;
    }

    static Intent a(@NonNull Context context, @NonNull C6643p c6643p) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        i(intent, c6643p);
        return intent;
    }

    static Intent c(@NonNull Context context, @NonNull C6643p c6643p, boolean z11) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z11);
        i(intent, c6643p);
        return intent;
    }

    static Intent d(@NonNull Context context, @NonNull C6643p c6643p) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        i(intent, c6643p);
        return intent;
    }

    static Intent e(@NonNull Context context, @NonNull C6643p c6643p) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        i(intent, c6643p);
        return intent;
    }

    static C6643p h(@NonNull Intent intent) {
        return new C6643p(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    private static void i(@NonNull Intent intent, @NonNull C6643p c6643p) {
        intent.putExtra("KEY_WORKSPEC_ID", c6643p.b());
        intent.putExtra("KEY_WORKSPEC_GENERATION", c6643p.a());
    }

    @Override // androidx.work.impl.InterfaceC5476d
    public final void b(@NonNull C6643p c6643p, boolean z11) {
        synchronized (this.f45377c) {
            try {
                e eVar = (e) this.f45376b.remove(c6643p);
                this.f45378d.b(c6643p);
                if (eVar != null) {
                    eVar.h(z11);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final boolean f() {
        boolean z11;
        synchronized (this.f45377c) {
            z11 = !this.f45376b.isEmpty();
        }
        return z11;
    }

    final void g(int i11, @NonNull Intent intent, @NonNull f fVar) {
        List<t> list;
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            o.e().a(f45373e, "Handling constraints changed " + intent);
            new c(this.f45375a, i11, fVar).a();
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            o.e().a(f45373e, "Handling reschedule " + intent + ", " + i11);
            fVar.f().s();
            return;
        }
        Bundle extras = intent.getExtras();
        String[] strArr = {"KEY_WORKSPEC_ID"};
        if (extras == null || extras.isEmpty() || extras.get(strArr[0]) == null) {
            o.e().c(f45373e, "Invalid request for " + action + " , requires KEY_WORKSPEC_ID .");
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            C6643p h11 = h(intent);
            String str = f45373e;
            o.e().a(str, "Handling schedule work for " + h11);
            WorkDatabase n11 = fVar.f().n();
            n11.beginTransaction();
            try {
                C6627B m11 = n11.f().m(h11.b());
                if (m11 == null) {
                    o.e().k(str, "Skipping scheduling " + h11 + " because it's no longer in the DB");
                    return;
                }
                if (m11.f63800b.a()) {
                    o.e().k(str, "Skipping scheduling " + h11 + "because it is finished.");
                    return;
                }
                long a11 = m11.a();
                boolean e11 = m11.e();
                Context context = this.f45375a;
                if (e11) {
                    o.e().a(str, "Opportunistically setting an alarm for " + h11 + "at " + a11);
                    a.c(context, n11, h11, a11);
                    Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
                    ((C7009b) fVar.f45401b).b().execute(new f.b(i11, intent2, fVar));
                } else {
                    o.e().a(str, "Setting up Alarms for " + h11 + "at " + a11);
                    a.c(context, n11, h11, a11);
                }
                n11.setTransactionSuccessful();
                return;
            } finally {
                n11.endTransaction();
            }
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            synchronized (this.f45377c) {
                try {
                    C6643p h12 = h(intent);
                    o e12 = o.e();
                    String str2 = f45373e;
                    e12.a(str2, "Handing delay met for " + h12);
                    if (this.f45376b.containsKey(h12)) {
                        o.e().a(str2, "WorkSpec " + h12 + " is is already being handled for ACTION_DELAY_MET");
                    } else {
                        e eVar = new e(this.f45375a, i11, fVar, this.f45378d.d(h12));
                        this.f45376b.put(h12, eVar);
                        eVar.g();
                    }
                } finally {
                }
            }
            return;
        }
        if (!"ACTION_STOP_WORK".equals(action)) {
            if (!"ACTION_EXECUTION_COMPLETED".equals(action)) {
                o.e().k(f45373e, "Ignoring intent " + intent);
                return;
            }
            C6643p h13 = h(intent);
            boolean z11 = intent.getExtras().getBoolean("KEY_NEEDS_RESCHEDULE");
            o.e().a(f45373e, "Handling onExecutionCompleted " + intent + ", " + i11);
            b(h13, z11);
            return;
        }
        Bundle extras2 = intent.getExtras();
        String string = extras2.getString("KEY_WORKSPEC_ID");
        boolean containsKey = extras2.containsKey("KEY_WORKSPEC_GENERATION");
        u uVar = this.f45378d;
        if (containsKey) {
            int i12 = extras2.getInt("KEY_WORKSPEC_GENERATION");
            ArrayList arrayList = new ArrayList(1);
            t b11 = uVar.b(new C6643p(string, i12));
            list = arrayList;
            if (b11 != null) {
                arrayList.add(b11);
                list = arrayList;
            }
        } else {
            list = uVar.c(string);
        }
        for (t tVar : list) {
            o.e().a(f45373e, Nk.a.b("Handing stopWork work for ", string));
            fVar.f().w(tVar);
            a.a(this.f45375a, fVar.f().n(), tVar.a());
            fVar.b(tVar.a(), false);
        }
    }
}
