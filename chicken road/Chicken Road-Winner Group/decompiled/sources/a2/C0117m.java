package a2;

import g2.InterfaceC0319c;
import i2.AbstractC0343b;

/* renamed from: a2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117m extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f1851d;

    /* renamed from: e, reason: collision with root package name */
    public int f1852e;
    public final /* synthetic */ C0118n f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0117m(C0118n c0118n, InterfaceC0319c interfaceC0319c) {
        super(interfaceC0319c);
        this.f = c0118n;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f1851d = obj;
        this.f1852e |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
