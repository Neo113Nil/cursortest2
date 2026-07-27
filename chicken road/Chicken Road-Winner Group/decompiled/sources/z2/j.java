package z2;

import g2.InterfaceC0319c;
import i2.AbstractC0343b;

/* loaded from: classes.dex */
public final class j extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10721d;

    /* renamed from: e, reason: collision with root package name */
    public int f10722e;
    public final /* synthetic */ V1.b f;

    /* renamed from: g, reason: collision with root package name */
    public V1.b f10723g;

    /* renamed from: h, reason: collision with root package name */
    public e f10724h;

    /* renamed from: i, reason: collision with root package name */
    public A2.n f10725i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(V1.b bVar, InterfaceC0319c interfaceC0319c) {
        super(interfaceC0319c);
        this.f = bVar;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f10721d = obj;
        this.f10722e |= Integer.MIN_VALUE;
        return this.f.l(null, this);
    }
}
