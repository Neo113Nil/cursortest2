package M;

import y.C2654j;
import z0.AbstractC2749f;
import z0.AbstractC2756m;
import z0.InterfaceC2754k;

/* loaded from: classes.dex */
public final class B extends AbstractC2756m implements InterfaceC2754k, z0.i0 {

    /* renamed from: A, reason: collision with root package name */
    public final C2654j f3130A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f3131B;

    /* renamed from: C, reason: collision with root package name */
    public final float f3132C;

    /* renamed from: D, reason: collision with root package name */
    public final i0.q f3133D;

    /* renamed from: E, reason: collision with root package name */
    public L.w f3134E;

    public B(C2654j c2654j, boolean z3, float f, i0.q qVar) {
        this.f3130A = c2654j;
        this.f3131B = z3;
        this.f3132C = f;
        this.f3133D = qVar;
    }

    @Override // z0.i0
    public final void E() {
        AbstractC2749f.s(this, new A(this, 1));
    }

    @Override // b0.o
    public final void o0() {
        AbstractC2749f.s(this, new A(this, 1));
    }
}
