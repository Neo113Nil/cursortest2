package d;

import W3.o;
import c4.AbstractC0548i;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class g extends AbstractC0548i implements i4.f {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s f16813k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(s sVar, a4.c cVar) {
        super(3, cVar);
        this.f16813k = sVar;
    }

    @Override // i4.f
    public final Object b(Object obj, Object obj2, Object obj3) {
        g gVar = new g(this.f16813k, (a4.c) obj3);
        o oVar = o.f6046a;
        gVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        G4.l.N(obj);
        this.f16813k.f17620k = true;
        return o.f6046a;
    }
}
