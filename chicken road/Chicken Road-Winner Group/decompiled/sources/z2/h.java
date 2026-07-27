package z2;

import g2.InterfaceC0319c;
import i2.AbstractC0343b;

/* loaded from: classes.dex */
public final class h extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10715d;

    /* renamed from: e, reason: collision with root package name */
    public int f10716e;
    public final /* synthetic */ i f;

    /* renamed from: g, reason: collision with root package name */
    public Object f10717g;

    /* renamed from: h, reason: collision with root package name */
    public e f10718h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(i iVar, InterfaceC0319c interfaceC0319c) {
        super(interfaceC0319c);
        this.f = iVar;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f10715d = obj;
        this.f10716e |= Integer.MIN_VALUE;
        return this.f.l(null, this);
    }
}
