package i2;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import f2.m;
import g2.InterfaceC1977a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import k2.C2032c;
import k2.InterfaceC2031b;
import o2.i;
import p2.AbstractC2253k;
import p2.q;

/* loaded from: classes.dex */
public final class e implements InterfaceC2031b, InterfaceC1977a, q {

    /* renamed from: t, reason: collision with root package name */
    public static final String f17314t = m.f("DelayMetCommandHandler");

    /* renamed from: k, reason: collision with root package name */
    public final Context f17315k;

    /* renamed from: l, reason: collision with root package name */
    public final int f17316l;

    /* renamed from: m, reason: collision with root package name */
    public final String f17317m;

    /* renamed from: n, reason: collision with root package name */
    public final h f17318n;

    /* renamed from: o, reason: collision with root package name */
    public final C2032c f17319o;

    /* renamed from: r, reason: collision with root package name */
    public PowerManager.WakeLock f17322r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f17323s = false;

    /* renamed from: q, reason: collision with root package name */
    public int f17321q = 0;

    /* renamed from: p, reason: collision with root package name */
    public final Object f17320p = new Object();

    public e(Context context, int i, String str, h hVar) {
        this.f17315k = context;
        this.f17316l = i;
        this.f17318n = hVar;
        this.f17317m = str;
        this.f17319o = new C2032c(context, hVar.f17332l, this);
    }

    @Override // g2.InterfaceC1977a
    public final void a(String str, boolean z3) {
        m.d().a(f17314t, "onExecuted " + str + ", " + z3, new Throwable[0]);
        b();
        int i = this.f17316l;
        h hVar = this.f17318n;
        Context context = this.f17315k;
        if (z3) {
            hVar.f(new g(i, 0, hVar, C2011b.c(context, this.f17317m)));
        }
        if (this.f17323s) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            hVar.f(new g(i, 0, hVar, intent));
        }
    }

    public final void b() {
        synchronized (this.f17320p) {
            try {
                this.f17319o.d();
                this.f17318n.f17333m.b(this.f17317m);
                PowerManager.WakeLock wakeLock = this.f17322r;
                if (wakeLock != null && wakeLock.isHeld()) {
                    m.d().a(f17314t, "Releasing wakelock " + this.f17322r + " for WorkSpec " + this.f17317m, new Throwable[0]);
                    this.f17322r.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k2.InterfaceC2031b
    public final void c(ArrayList arrayList) {
        f();
    }

    public final void d() {
        StringBuilder sb = new StringBuilder();
        String str = this.f17317m;
        sb.append(str);
        sb.append(" (");
        this.f17322r = AbstractC2253k.a(this.f17315k, L1.a.o(sb, this.f17316l, ")"));
        m d5 = m.d();
        PowerManager.WakeLock wakeLock = this.f17322r;
        String str2 = f17314t;
        d5.a(str2, "Acquiring wakelock " + wakeLock + " for WorkSpec " + str, new Throwable[0]);
        this.f17322r.acquire();
        i h3 = this.f17318n.f17335o.f17130m.n().h(str);
        if (h3 == null) {
            f();
            return;
        }
        boolean b3 = h3.b();
        this.f17323s = b3;
        if (b3) {
            this.f17319o.c(Collections.singletonList(h3));
        } else {
            m.d().a(str2, L1.a.m("No constraints for ", str), new Throwable[0]);
            e(Collections.singletonList(str));
        }
    }

    @Override // k2.InterfaceC2031b
    public final void e(List list) {
        if (list.contains(this.f17317m)) {
            synchronized (this.f17320p) {
                try {
                    if (this.f17321q == 0) {
                        this.f17321q = 1;
                        m.d().a(f17314t, "onAllConstraintsMet for " + this.f17317m, new Throwable[0]);
                        if (this.f17318n.f17334n.h(this.f17317m, null)) {
                            this.f17318n.f17333m.a(this.f17317m, this);
                        } else {
                            b();
                        }
                    } else {
                        m.d().a(f17314t, "Already started work for " + this.f17317m, new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void f() {
        synchronized (this.f17320p) {
            try {
                if (this.f17321q < 2) {
                    this.f17321q = 2;
                    m d5 = m.d();
                    String str = f17314t;
                    d5.a(str, "Stopping work for WorkSpec " + this.f17317m, new Throwable[0]);
                    Context context = this.f17315k;
                    String str2 = this.f17317m;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    h hVar = this.f17318n;
                    hVar.f(new g(this.f17316l, 0, hVar, intent));
                    if (this.f17318n.f17334n.e(this.f17317m)) {
                        m.d().a(str, "WorkSpec " + this.f17317m + " needs to be rescheduled", new Throwable[0]);
                        Intent c5 = C2011b.c(this.f17315k, this.f17317m);
                        h hVar2 = this.f17318n;
                        hVar2.f(new g(this.f17316l, 0, hVar2, c5));
                    } else {
                        m.d().a(str, "Processor does not have WorkSpec " + this.f17317m + ". No need to reschedule ", new Throwable[0]);
                    }
                } else {
                    m.d().a(f17314t, "Already stopped work for " + this.f17317m, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
