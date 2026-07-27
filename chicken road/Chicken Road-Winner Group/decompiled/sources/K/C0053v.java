package K;

import i2.AbstractC0343b;

/* renamed from: K.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0053v extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public O f900d;

    /* renamed from: e, reason: collision with root package name */
    public E2.d f901e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ O f902g;

    /* renamed from: h, reason: collision with root package name */
    public int f903h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0053v(O o3, AbstractC0343b abstractC0343b) {
        super(abstractC0343b);
        this.f902g = o3;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f = obj;
        this.f903h |= Integer.MIN_VALUE;
        return O.a(this.f902g, this);
    }
}
