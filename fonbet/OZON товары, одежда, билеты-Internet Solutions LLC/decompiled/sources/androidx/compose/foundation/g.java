package androidx.compose.foundation;

import D1.C2820u;
import D1.InterfaceC2819t;
import D1.J;
import D1.r0;
import androidx.compose.ui.e;
import k1.C7455a;
import k1.C7456b;
import k1.C7460f;
import k1.C7462h;
import k1.C7464j;
import k1.C7465k;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import l1.AbstractC7799Q;
import l1.AbstractC7839p0;
import l1.C7807Z;
import l1.J0;
import l1.q0;
import l1.s0;
import l1.y0;
import n1.C8415h;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
final class g extends e.c implements InterfaceC2819t, r0 {

    /* renamed from: a, reason: collision with root package name */
    private long f38931a;

    /* renamed from: b, reason: collision with root package name */
    private AbstractC7799Q f38932b;

    /* renamed from: c, reason: collision with root package name */
    private float f38933c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private J0 f38934d;

    /* renamed from: e, reason: collision with root package name */
    private long f38935e = 9205357640488583168L;

    /* renamed from: f, reason: collision with root package name */
    private Z1.s f38936f;

    /* renamed from: g, reason: collision with root package name */
    private AbstractC7839p0 f38937g;

    /* renamed from: h, reason: collision with root package name */
    private J0 f38938h;

    public g(long j11, AbstractC7799Q abstractC7799Q, float f7, J0 j02) {
        this.f38931a = j11;
        this.f38932b = abstractC7799Q;
        this.f38933c = f7;
        this.f38934d = j02;
    }

    public final void I1(AbstractC7799Q abstractC7799Q) {
        this.f38932b = abstractC7799Q;
    }

    public final void J1(long j11) {
        this.f38931a = j11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [T, java.lang.Object, l1.p0] */
    @Override // D1.InterfaceC2819t
    public final void draw(@NotNull InterfaceC8410c interfaceC8410c) {
        long j11;
        s0 b11;
        long j12;
        if (this.f38934d == y0.a()) {
            long j13 = this.f38931a;
            j12 = C7807Z.f72259m;
            if (!C7807Z.p(j13, j12)) {
                InterfaceC8412e.Q(interfaceC8410c, this.f38931a, 0L, 0L, 0.0f, null, 126);
            }
            AbstractC7799Q abstractC7799Q = this.f38932b;
            if (abstractC7799Q != null) {
                InterfaceC8412e.k0(interfaceC8410c, abstractC7799Q, 0L, 0L, this.f38933c, null, 0, 118);
            }
        } else {
            M m11 = new M();
            J j14 = (J) interfaceC8410c;
            if (C7464j.c(j14.i(), this.f38935e) && j14.getLayoutDirection() == this.f38936f && Intrinsics.d(this.f38938h, this.f38934d)) {
                ?? r42 = this.f38937g;
                Intrinsics.f(r42);
                m11.f71787a = r42;
            } else {
                D1.s0.a(this, new f(m11, this, j14));
            }
            this.f38937g = (AbstractC7839p0) m11.f71787a;
            this.f38935e = j14.i();
            this.f38936f = j14.getLayoutDirection();
            this.f38938h = this.f38934d;
            T t2 = m11.f71787a;
            Intrinsics.f(t2);
            AbstractC7839p0 abstractC7839p0 = (AbstractC7839p0) t2;
            long j15 = this.f38931a;
            j11 = C7807Z.f72259m;
            if (!C7807Z.p(j15, j11)) {
                q0.a(interfaceC8410c, abstractC7839p0, this.f38931a);
            }
            AbstractC7799Q abstractC7799Q2 = this.f38932b;
            if (abstractC7799Q2 != null) {
                float f7 = this.f38933c;
                C8415h c8415h = C8415h.f76287a;
                if (abstractC7839p0 instanceof AbstractC7839p0.b) {
                    C7460f b12 = ((AbstractC7839p0.b) abstractC7839p0).b();
                    interfaceC8410c.V0(abstractC7799Q2, P9.a.a(b12.n(), b12.q()), C7465k.a(b12.u(), b12.m()), f7, c8415h, 3);
                } else {
                    if (abstractC7839p0 instanceof AbstractC7839p0.c) {
                        AbstractC7839p0.c cVar = (AbstractC7839p0.c) abstractC7839p0;
                        b11 = cVar.c();
                        if (b11 == null) {
                            C7462h b13 = cVar.b();
                            float d11 = C7455a.d(b13.b());
                            interfaceC8410c.H1(abstractC7799Q2, P9.a.a(b13.e(), b13.g()), C7465k.a(b13.j(), b13.d()), C7456b.a(d11, d11), f7, c8415h);
                        }
                    } else {
                        if (!(abstractC7839p0 instanceof AbstractC7839p0.a)) {
                            throw new Sc.o();
                        }
                        b11 = ((AbstractC7839p0.a) abstractC7839p0).b();
                    }
                    interfaceC8410c.S0(b11, abstractC7799Q2, f7, c8415h, 3);
                }
            }
        }
        ((J) interfaceC8410c).F0();
    }

    @NotNull
    public final J0 getShape() {
        return this.f38934d;
    }

    @Override // D1.r0
    public final void onObservedReadsChanged() {
        this.f38935e = 9205357640488583168L;
        this.f38936f = null;
        this.f38937g = null;
        this.f38938h = null;
        C2820u.a(this);
    }

    public final void setAlpha(float f7) {
        this.f38933c = f7;
    }

    public final void setShape(@NotNull J0 j02) {
        this.f38934d = j02;
    }
}
