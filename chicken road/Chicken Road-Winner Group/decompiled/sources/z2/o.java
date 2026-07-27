package z2;

import g2.InterfaceC0319c;
import h2.EnumC0326a;
import i2.AbstractC0343b;
import w2.P;

/* loaded from: classes.dex */
public final class o extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public p f10740d;

    /* renamed from: e, reason: collision with root package name */
    public e f10741e;
    public r f;

    /* renamed from: g, reason: collision with root package name */
    public P f10742g;

    /* renamed from: h, reason: collision with root package name */
    public Object f10743h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f10744i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ p f10745j;

    /* renamed from: k, reason: collision with root package name */
    public int f10746k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(p pVar, InterfaceC0319c interfaceC0319c) {
        super(interfaceC0319c);
        this.f10745j = pVar;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f10744i = obj;
        this.f10746k |= Integer.MIN_VALUE;
        this.f10745j.l(null, this);
        return EnumC0326a.f4994a;
    }
}
