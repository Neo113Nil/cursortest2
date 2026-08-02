package b0;

import a.AbstractC0603a;
import i6.InterfaceC1290g;
import i6.InterfaceC1291h;
import i6.InterfaceC1292i;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class l0 implements InterfaceC1290g {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f10072a;

    /* renamed from: b, reason: collision with root package name */
    public final O f10073b;

    public l0(l0 l0Var, O o7) {
        t6.h.e(o7, "instance");
        this.f10072a = l0Var;
        this.f10073b = o7;
    }

    public final void a(O o7) {
        if (this.f10073b == o7) {
            throw new IllegalStateException("Calling updateData inside updateData on the same DataStore instance is not supported\nsince updates made in the parent updateData call will not be visible to the nested\nupdateData call. See https://issuetracker.google.com/issues/241760537 for details.");
        }
        l0 l0Var = this.f10072a;
        if (l0Var != null) {
            l0Var.a(o7);
        }
    }

    @Override // i6.InterfaceC1292i
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(obj, this);
    }

    @Override // i6.InterfaceC1292i
    public final InterfaceC1290g get(InterfaceC1291h interfaceC1291h) {
        return AbstractC0603a.W(this, interfaceC1291h);
    }

    @Override // i6.InterfaceC1290g
    public final InterfaceC1291h getKey() {
        return k0.f10067a;
    }

    @Override // i6.InterfaceC1292i
    public final InterfaceC1292i minusKey(InterfaceC1291h interfaceC1291h) {
        return AbstractC0603a.e0(this, interfaceC1291h);
    }

    @Override // i6.InterfaceC1292i
    public final InterfaceC1292i plus(InterfaceC1292i interfaceC1292i) {
        return AbstractC0603a.m0(this, interfaceC1292i);
    }
}
