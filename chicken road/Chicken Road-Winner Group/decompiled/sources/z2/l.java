package z2;

import a2.C0118n;
import g2.InterfaceC0319c;
import i2.AbstractC0343b;

/* loaded from: classes.dex */
public final class l extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f10730d;

    /* renamed from: e, reason: collision with root package name */
    public int f10731e;
    public final /* synthetic */ V1.b f;

    /* renamed from: g, reason: collision with root package name */
    public C0118n f10732g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(V1.b bVar, InterfaceC0319c interfaceC0319c) {
        super(interfaceC0319c);
        this.f = bVar;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f10730d = obj;
        this.f10731e |= Integer.MIN_VALUE;
        return this.f.l(null, this);
    }
}
