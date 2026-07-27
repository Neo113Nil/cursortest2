package a2;

import K.C0051t;
import g2.InterfaceC0319c;
import i2.AbstractC0343b;

/* loaded from: classes.dex */
public final class z extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f1892d;

    /* renamed from: e, reason: collision with root package name */
    public int f1893e;
    public final /* synthetic */ C0051t f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C0051t c0051t, InterfaceC0319c interfaceC0319c) {
        super(interfaceC0319c);
        this.f = c0051t;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f1892d = obj;
        this.f1893e |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
