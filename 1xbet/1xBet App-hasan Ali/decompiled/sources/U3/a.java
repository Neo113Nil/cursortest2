package U3;

import c4.AbstractC0542c;

/* loaded from: classes.dex */
public final class a extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public g f5887k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f5888l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ g f5889m;

    /* renamed from: n, reason: collision with root package name */
    public int f5890n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g gVar, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f5889m = gVar;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f5888l = obj;
        this.f5890n |= Integer.MIN_VALUE;
        return this.f5889m.a(this);
    }
}
