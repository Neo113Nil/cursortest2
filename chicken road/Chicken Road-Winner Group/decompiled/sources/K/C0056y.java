package K;

import i2.AbstractC0343b;

/* renamed from: K.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0056y extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public O f910d;

    /* renamed from: e, reason: collision with root package name */
    public E2.d f911e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O f912g;

    /* renamed from: h, reason: collision with root package name */
    public int f913h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0056y(O o3, AbstractC0343b abstractC0343b) {
        super(abstractC0343b);
        this.f912g = o3;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f = obj;
        this.f913h |= Integer.MIN_VALUE;
        return O.d(this.f912g, this);
    }
}
