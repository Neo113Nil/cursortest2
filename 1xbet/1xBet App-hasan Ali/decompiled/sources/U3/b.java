package U3;

import c4.AbstractC0542c;

/* loaded from: classes.dex */
public final class b extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f5891k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f5892l;

    /* renamed from: m, reason: collision with root package name */
    public int f5893m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g gVar, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f5892l = gVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f5891k = obj;
        this.f5893m |= Integer.MIN_VALUE;
        return this.f5892l.b(0, 0, this);
    }
}
