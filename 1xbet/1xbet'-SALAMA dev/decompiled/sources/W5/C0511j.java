package W5;

import U5.AbstractC0442i;
import U5.C0437d;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.atomic.AtomicInteger;
import p155w1.C1010l1;

/* JADX INFO: renamed from: W5.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0511j extends Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f7249a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile U5.l0 f7251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public U5.l0 f7252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public U5.l0 f7253e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0514k f7255g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f7250b = new AtomicInteger(-2147483647);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C1010l1 f7254f = new C1010l1(this);

    public C0511j(C0514k c0514k, A a2, String str) {
        this.f7255g = c0514k;
        p113p3.f.k(a2, "delegate");
        this.f7249a = a2;
    }

    public static void h(C0511j c0511j) {
        synchronized (c0511j) {
            try {
                if (c0511j.f7250b.get() != 0) {
                    return;
                }
                U5.l0 l0Var = c0511j.f7252d;
                U5.l0 l0Var2 = c0511j.f7253e;
                c0511j.f7252d = null;
                c0511j.f7253e = null;
                if (l0Var != null) {
                    super.e(l0Var);
                }
                if (l0Var2 != null) {
                    super.c(l0Var2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W5.InterfaceC0549w
    public final InterfaceC0540t a(H2.r rVar, U5.b0 b0Var, C0437d c0437d, AbstractC0442i[] abstractC0442iArr) {
        InterfaceC0540t interfaceC0540t;
        K4.m mVar = c0437d.f6476c;
        if (mVar == null) {
            this.f7255g.getClass();
            mVar = null;
        } else {
            this.f7255g.getClass();
        }
        if (mVar == null) {
            return this.f7250b.get() >= 0 ? new W(this.f7251c, abstractC0442iArr) : this.f7249a.a(rVar, b0Var, c0437d, abstractC0442iArr);
        }
        C0501f1 c0501f1 = new C0501f1(this.f7249a, rVar, b0Var, c0437d, this.f7254f, abstractC0442iArr);
        if (this.f7250b.incrementAndGet() > 0) {
            C0511j c0511j = (C0511j) this.f7254f.f17777a;
            if (c0511j.f7250b.decrementAndGet() == 0) {
                h(c0511j);
            }
            return new W(this.f7251c, abstractC0442iArr);
        }
        try {
            H0 h6 = this.f7255g.f7261b;
            Task taskY = mVar.f4039a.Y();
            Task taskY2 = mVar.f4040b.Y();
            Tasks.whenAll((Task<?>[]) new Task[]{taskY, taskY2}).addOnCompleteListener(L4.l.f4377b, new K4.l(taskY, c0501f1, taskY2));
        } catch (Throwable th) {
            c0501f1.a(U5.l0.j.g("Credentials should use fail() instead of throwing exceptions").f(th));
        }
        synchronized (c0501f1.f7213h) {
            try {
                InterfaceC0540t interfaceC0540t2 = c0501f1.f7214i;
                interfaceC0540t = interfaceC0540t2;
                if (interfaceC0540t2 == null) {
                    P p5 = new P();
                    c0501f1.f7215k = p5;
                    c0501f1.f7214i = p5;
                    interfaceC0540t = p5;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return interfaceC0540t;
    }

    @Override // W5.Y, W5.Y0
    public final void c(U5.l0 l0Var) {
        p113p3.f.k(l0Var, "status");
        synchronized (this) {
            try {
                if (this.f7250b.get() < 0) {
                    this.f7251c = l0Var;
                    this.f7250b.addAndGet(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                } else if (this.f7253e != null) {
                    return;
                }
                if (this.f7250b.get() != 0) {
                    this.f7253e = l0Var;
                } else {
                    super.c(l0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W5.Y, W5.Y0
    public final void e(U5.l0 l0Var) {
        p113p3.f.k(l0Var, "status");
        synchronized (this) {
            try {
                if (this.f7250b.get() < 0) {
                    this.f7251c = l0Var;
                    this.f7250b.addAndGet(com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
                    if (this.f7250b.get() != 0) {
                        this.f7252d = l0Var;
                    } else {
                        super.e(l0Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // W5.Y
    public final A g() {
        return this.f7249a;
    }
}
