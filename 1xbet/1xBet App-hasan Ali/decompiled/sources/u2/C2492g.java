package u2;

import s4.InterfaceC2369f;

/* renamed from: u2.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2492g implements InterfaceC2369f, kotlin.jvm.internal.g {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C2497l f19996k;

    public C2492g(C2497l c2497l) {
        this.f19996k = c2497l;
    }

    @Override // kotlin.jvm.internal.g
    public final W3.c b() {
        return new kotlin.jvm.internal.a(2, 4, C2497l.class, this.f19996k, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V");
    }

    @Override // s4.InterfaceC2369f
    public final Object d(Object obj, a4.c cVar) {
        this.f19996k.k((AbstractC2490e) obj);
        return W3.o.f6046a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC2369f) && (obj instanceof kotlin.jvm.internal.g)) {
            return b().equals(((kotlin.jvm.internal.g) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
