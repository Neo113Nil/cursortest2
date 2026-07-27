package w2;

import a.AbstractC0086a;
import g2.InterfaceC0322f;

/* loaded from: classes.dex */
public final class k0 implements InterfaceC0322f, g2.g {

    /* renamed from: a, reason: collision with root package name */
    public static final k0 f10510a = new k0();

    @Override // g2.h
    public final g2.h g(g2.g gVar) {
        return AbstractC0086a.H(this, gVar);
    }

    @Override // g2.h
    public final g2.h h(g2.h context) {
        kotlin.jvm.internal.j.e(context, "context");
        return context == g2.i.f4981a ? this : (g2.h) context.i(this, new com.startapp.sdk.components.c(2));
    }

    @Override // g2.h
    public final Object i(Object obj, o2.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // g2.h
    public final InterfaceC0322f k(g2.g gVar) {
        return AbstractC0086a.w(this, gVar);
    }

    @Override // g2.InterfaceC0322f
    public final g2.g getKey() {
        return this;
    }
}
