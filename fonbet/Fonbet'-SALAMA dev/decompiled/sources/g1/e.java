package g1;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import d1.n;
import e1.InterfaceC0994a;
import e1.k;
import i1.C1244c;
import i1.InterfaceC1243b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import m1.i;
import n1.AbstractC1455j;
import n1.InterfaceC1461p;
import w1.L;

/* loaded from: classes.dex */
public final class e implements InterfaceC1243b, InterfaceC0994a, InterfaceC1461p {

    /* renamed from: A, reason: collision with root package name */
    public static final String f13076A = n.g("DelayMetCommandHandler");

    /* renamed from: a, reason: collision with root package name */
    public final Context f13077a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13078b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13079c;

    /* renamed from: d, reason: collision with root package name */
    public final g f13080d;

    /* renamed from: e, reason: collision with root package name */
    public final C1244c f13081e;

    /* renamed from: y, reason: collision with root package name */
    public PowerManager.WakeLock f13084y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f13085z = false;

    /* renamed from: x, reason: collision with root package name */
    public int f13083x = 0;

    /* renamed from: f, reason: collision with root package name */
    public final Object f13082f = new Object();

    public e(Context context, int i7, String str, g gVar) {
        this.f13077a = context;
        this.f13078b = i7;
        this.f13080d = gVar;
        this.f13079c = str;
        this.f13081e = new C1244c(context, gVar.f13091b, this);
    }

    public final void a() {
        synchronized (this.f13082f) {
            try {
                this.f13081e.c();
                this.f13080d.f13092c.b(this.f13079c);
                PowerManager.WakeLock wakeLock = this.f13084y;
                if (wakeLock != null && wakeLock.isHeld()) {
                    n.d().b(f13076A, "Releasing wakelock " + this.f13084y + " for WorkSpec " + this.f13079c, new Throwable[0]);
                    this.f13084y.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // e1.InterfaceC0994a
    public final void b(String str, boolean z4) {
        n.d().b(f13076A, "onExecuted " + str + ", " + z4, new Throwable[0]);
        a();
        int i7 = this.f13078b;
        g gVar = this.f13080d;
        Context context = this.f13077a;
        if (z4) {
            gVar.e(new androidx.activity.g(gVar, b.c(context, this.f13079c), i7, 3));
        }
        if (this.f13085z) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            gVar.e(new androidx.activity.g(gVar, intent, i7, 3));
        }
    }

    public final void c() {
        StringBuilder sb = new StringBuilder();
        String str = this.f13079c;
        sb.append(str);
        sb.append(" (");
        this.f13084y = AbstractC1455j.a(this.f13077a, k.g(sb, this.f13078b, ")"));
        n d7 = n.d();
        PowerManager.WakeLock wakeLock = this.f13084y;
        String str2 = f13076A;
        d7.b(str2, "Acquiring wakelock " + wakeLock + " for WorkSpec " + str, new Throwable[0]);
        this.f13084y.acquire();
        i l7 = this.f13080d.f13094e.f12546f.n().l(str);
        if (l7 == null) {
            e();
            return;
        }
        boolean b7 = l7.b();
        this.f13085z = b7;
        if (b7) {
            this.f13081e.b(Collections.singletonList(l7));
        } else {
            n.d().b(str2, L.i("No constraints for ", str), new Throwable[0]);
            f(Collections.singletonList(str));
        }
    }

    @Override // i1.InterfaceC1243b
    public final void d(ArrayList arrayList) {
        e();
    }

    public final void e() {
        synchronized (this.f13082f) {
            try {
                if (this.f13083x < 2) {
                    this.f13083x = 2;
                    n d7 = n.d();
                    String str = f13076A;
                    d7.b(str, "Stopping work for WorkSpec " + this.f13079c, new Throwable[0]);
                    Context context = this.f13077a;
                    String str2 = this.f13079c;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    g gVar = this.f13080d;
                    gVar.e(new androidx.activity.g(gVar, intent, this.f13078b, 3));
                    if (this.f13080d.f13093d.d(this.f13079c)) {
                        n.d().b(str, "WorkSpec " + this.f13079c + " needs to be rescheduled", new Throwable[0]);
                        Intent c3 = b.c(this.f13077a, this.f13079c);
                        g gVar2 = this.f13080d;
                        gVar2.e(new androidx.activity.g(gVar2, c3, this.f13078b, 3));
                    } else {
                        n.d().b(str, "Processor does not have WorkSpec " + this.f13079c + ". No need to reschedule ", new Throwable[0]);
                    }
                } else {
                    n.d().b(f13076A, "Already stopped work for " + this.f13079c, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // i1.InterfaceC1243b
    public final void f(List list) {
        if (list.contains(this.f13079c)) {
            synchronized (this.f13082f) {
                try {
                    if (this.f13083x == 0) {
                        this.f13083x = 1;
                        n.d().b(f13076A, "onAllConstraintsMet for " + this.f13079c, new Throwable[0]);
                        if (this.f13080d.f13093d.g(this.f13079c, null)) {
                            this.f13080d.f13092c.a(this.f13079c, this);
                        } else {
                            a();
                        }
                    } else {
                        n.d().b(f13076A, "Already started work for " + this.f13079c, new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }
}
