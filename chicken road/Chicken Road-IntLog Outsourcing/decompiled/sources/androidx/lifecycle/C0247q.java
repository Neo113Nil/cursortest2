package androidx.lifecycle;

import D4.C0021v;
import D4.InterfaceC0022w;
import k4.InterfaceC1223i;

/* renamed from: androidx.lifecycle.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0247q implements InterfaceC0249t, InterfaceC0022w {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC0245o f4585a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1223i f4586b;

    public C0247q(AbstractC0245o abstractC0245o, InterfaceC1223i coroutineContext) {
        D4.X x5;
        kotlin.jvm.internal.i.e(coroutineContext, "coroutineContext");
        this.f4585a = abstractC0245o;
        this.f4586b = coroutineContext;
        if (((C0252w) abstractC0245o).f4592d != EnumC0244n.f4576a || (x5 = (D4.X) coroutineContext.o(C0021v.f545b)) == null) {
            return;
        }
        x5.b(null);
    }

    @Override // androidx.lifecycle.InterfaceC0249t
    public final void a(InterfaceC0250u interfaceC0250u, EnumC0243m enumC0243m) {
        AbstractC0245o abstractC0245o = this.f4585a;
        if (((C0252w) abstractC0245o).f4592d.compareTo(EnumC0244n.f4576a) <= 0) {
            abstractC0245o.b(this);
            D4.X x5 = (D4.X) this.f4586b.o(C0021v.f545b);
            if (x5 != null) {
                x5.b(null);
            }
        }
    }

    @Override // D4.InterfaceC0022w
    public final InterfaceC1223i g() {
        return this.f4586b;
    }
}
