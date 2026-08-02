package U3;

import c4.AbstractC0542c;

/* loaded from: classes.dex */
public final class e extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f5904k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g f5905l;

    /* renamed from: m, reason: collision with root package name */
    public int f5906m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f5905l = gVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f5904k = obj;
        this.f5906m |= Integer.MIN_VALUE;
        return this.f5905l.e(0, 0, this);
    }
}
