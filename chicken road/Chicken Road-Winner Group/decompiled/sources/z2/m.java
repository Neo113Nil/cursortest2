package z2;

import a2.C0118n;
import g2.InterfaceC0319c;
import i2.AbstractC0343b;

/* loaded from: classes.dex */
public final class m extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public C0118n f10733d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f10734e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0118n f10735g;

    /* renamed from: h, reason: collision with root package name */
    public Object f10736h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(C0118n c0118n, InterfaceC0319c interfaceC0319c) {
        super(interfaceC0319c);
        this.f10735g = c0118n;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f10734e = obj;
        this.f |= Integer.MIN_VALUE;
        return this.f10735g.a(null, this);
    }
}
