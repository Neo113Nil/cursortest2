package K;

import i2.AbstractC0343b;

/* loaded from: classes.dex */
public final class M extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public kotlin.jvm.internal.p f771d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f772e;
    public final /* synthetic */ O f;

    /* renamed from: g, reason: collision with root package name */
    public int f773g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(O o3, AbstractC0343b abstractC0343b) {
        super(abstractC0343b);
        this.f = o3;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f772e = obj;
        this.f773g |= Integer.MIN_VALUE;
        return this.f.j(null, false, this);
    }
}
