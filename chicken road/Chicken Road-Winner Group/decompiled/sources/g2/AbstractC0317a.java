package g2;

import a.AbstractC0086a;
import kotlin.jvm.internal.j;
import o2.p;

/* renamed from: g2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0317a implements InterfaceC0322f {

    /* renamed from: a, reason: collision with root package name */
    public final g f4977a;

    public AbstractC0317a(g gVar) {
        this.f4977a = gVar;
    }

    @Override // g2.h
    public h g(g gVar) {
        return AbstractC0086a.H(this, gVar);
    }

    @Override // g2.InterfaceC0322f
    public final g getKey() {
        return this.f4977a;
    }

    @Override // g2.h
    public final h h(h context) {
        j.e(context, "context");
        return context == i.f4981a ? this : (h) context.i(this, new com.startapp.sdk.components.c(2));
    }

    @Override // g2.h
    public final Object i(Object obj, p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // g2.h
    public InterfaceC0322f k(g gVar) {
        return AbstractC0086a.w(this, gVar);
    }
}
