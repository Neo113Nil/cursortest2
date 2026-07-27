package z2;

import A2.u;
import g2.InterfaceC0319c;
import i2.AbstractC0343b;

/* loaded from: classes.dex */
public final class k extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public u f10726d;

    /* renamed from: e, reason: collision with root package name */
    public Object f10727e;
    public /* synthetic */ Object f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u f10728g;

    /* renamed from: h, reason: collision with root package name */
    public int f10729h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(u uVar, InterfaceC0319c interfaceC0319c) {
        super(interfaceC0319c);
        this.f10728g = uVar;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f = obj;
        this.f10729h |= Integer.MIN_VALUE;
        return this.f10728g.a(null, this);
    }
}
