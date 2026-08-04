package p047g1;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.activity.g;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p023d1.n;
import p031e1.a;
import p031e1.k;
import p060i1.b;
import p060i1.c;
import p088m1.i;
import p096n1.j;
import p096n1.p;
import p155w1.L;

/* JADX INFO: loaded from: classes.dex */
public final class e implements b, a, p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final String f13082A = n.g("DelayMetCommandHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f13086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f13087e;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public PowerManager.WakeLock f13090y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f13091z = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13089x = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f13088f = new Object();

    public e(Context context, int i7, String str, g gVar) {
        this.f13083a = context;
        this.f13084b = i7;
        this.f13086d = gVar;
        this.f13085c = str;
        this.f13087e = new c(context, gVar.f13097b, this);
    }

    public final void a() {
        synchronized (this.f13088f) {
            try {
                this.f13087e.c();
                this.f13086d.f13098c.b(this.f13085c);
                PowerManager.WakeLock wakeLock = this.f13090y;
                if (wakeLock != null && wakeLock.isHeld()) {
                    n.d().b(f13082A, "Releasing wakelock " + this.f13090y + " for WorkSpec " + this.f13085c, new Throwable[0]);
                    this.f13090y.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p031e1.a
    public final void b(String str, boolean z4) {
        n.d().b(f13082A, "onExecuted " + str + ", " + z4, new Throwable[0]);
        a();
        int i7 = this.f13084b;
        g gVar = this.f13086d;
        Context context = this.f13083a;
        if (z4) {
            gVar.e(new g(gVar, b.c(context, this.f13085c), i7, 3));
        }
        if (this.f13091z) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            gVar.e(new g(gVar, intent, i7, 3));
        }
    }

    public final void c() {
        StringBuilder sb = new StringBuilder();
        String str = this.f13085c;
        sb.append(str);
        sb.append(" (");
        this.f13090y = j.a(this.f13083a, k.g(sb, this.f13084b, ")"));
        n nVarD = n.d();
        PowerManager.WakeLock wakeLock = this.f13090y;
        String str2 = f13082A;
        nVarD.b(str2, "Acquiring wakelock " + wakeLock + " for WorkSpec " + str, new Throwable[0]);
        this.f13090y.acquire();
        i iVarL = this.f13086d.f13100e.f12552f.n().l(str);
        if (iVarL == null) {
            e();
            return;
        }
        boolean zB = iVarL.b();
        this.f13091z = zB;
        if (zB) {
            this.f13087e.b(Collections.singletonList(iVarL));
        } else {
            n.d().b(str2, L.i("No constraints for ", str), new Throwable[0]);
            f(Collections.singletonList(str));
        }
    }

    @Override // p060i1.b
    public final void d(ArrayList arrayList) {
        e();
    }

    public final void e() {
        synchronized (this.f13088f) {
            try {
                if (this.f13089x < 2) {
                    this.f13089x = 2;
                    n nVarD = n.d();
                    String str = f13082A;
                    nVarD.b(str, "Stopping work for WorkSpec " + this.f13085c, new Throwable[0]);
                    Context context = this.f13083a;
                    String str2 = this.f13085c;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    g gVar = this.f13086d;
                    gVar.e(new g(gVar, intent, this.f13084b, 3));
                    if (this.f13086d.f13099d.d(this.f13085c)) {
                        n.d().b(str, "WorkSpec " + this.f13085c + " needs to be rescheduled", new Throwable[0]);
                        Intent intentC = b.c(this.f13083a, this.f13085c);
                        g gVar2 = this.f13086d;
                        gVar2.e(new g(gVar2, intentC, this.f13084b, 3));
                    } else {
                        n.d().b(str, "Processor does not have WorkSpec " + this.f13085c + ". No need to reschedule ", new Throwable[0]);
                    }
                } else {
                    n.d().b(f13082A, "Already stopped work for " + this.f13085c, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p060i1.b
    public final void f(List list) {
        if (list.contains(this.f13085c)) {
            synchronized (this.f13088f) {
                try {
                    if (this.f13089x == 0) {
                        this.f13089x = 1;
                        n.d().b(f13082A, "onAllConstraintsMet for " + this.f13085c, new Throwable[0]);
                        if (this.f13086d.f13099d.g(this.f13085c, null)) {
                            this.f13086d.f13098c.a(this.f13085c, this);
                        } else {
                            a();
                        }
                    } else {
                        n.d().b(f13082A, "Already started work for " + this.f13085c, new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
