package v;

import c4.AbstractC0542c;

/* renamed from: v.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2515j extends AbstractC0542c {

    /* renamed from: k, reason: collision with root package name */
    public C2518m f20254k;

    /* renamed from: l, reason: collision with root package name */
    public long f20255l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f20256m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C2518m f20257n;

    /* renamed from: o, reason: collision with root package name */
    public int f20258o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2515j(C2518m c2518m, AbstractC0542c abstractC0542c) {
        super(abstractC0542c);
        this.f20257n = c2518m;
    }

    @Override // c4.AbstractC0540a
    public final Object invokeSuspend(Object obj) {
        this.f20256m = obj;
        this.f20258o |= Integer.MIN_VALUE;
        return this.f20257n.e(0L, null, this);
    }
}
