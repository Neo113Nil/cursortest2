package K;

import g2.InterfaceC0319c;
import i2.AbstractC0343b;

/* loaded from: classes.dex */
public final class C extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public O f735d;

    /* renamed from: e, reason: collision with root package name */
    public j0 f736e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ Object f737g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ O f738h;

    /* renamed from: i, reason: collision with root package name */
    public int f739i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(O o3, InterfaceC0319c interfaceC0319c) {
        super(interfaceC0319c);
        this.f738h = o3;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f737g = obj;
        this.f739i |= Integer.MIN_VALUE;
        return O.e(this.f738h, false, this);
    }
}
