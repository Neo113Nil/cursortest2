package u;

import c4.AbstractC0548i;

/* renamed from: u.G, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2436G extends AbstractC0548i implements i4.e {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ float f19672k;

    @Override // c4.AbstractC0540a
    public final a4.c create(Object obj, a4.c cVar) {
        C2436G c2436g = new C2436G(2, cVar);
        c2436g.f19672k = ((Number) obj).floatValue();
        return c2436g;
    }

    @Override // i4.e
    public final Object invoke(Object obj, Object obj2) {
        return ((C2436G) create(Float.valueOf(((Number) obj).floatValue()), (a4.c) obj2)).invokeSuspend(W3.o.f6046a);
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        G4.l.N(obj);
        return Boolean.valueOf(this.f19672k > 0.0f);
    }
}
