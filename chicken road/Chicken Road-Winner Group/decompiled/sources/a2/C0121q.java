package a2;

import g2.InterfaceC0319c;
import i2.AbstractC0343b;

/* renamed from: a2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0121q extends AbstractC0343b {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f1863d;

    /* renamed from: e, reason: collision with root package name */
    public int f1864e;
    public final /* synthetic */ A2.u f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0121q(A2.u uVar, InterfaceC0319c interfaceC0319c) {
        super(interfaceC0319c);
        this.f = uVar;
    }

    @Override // i2.AbstractC0343b
    public final Object g(Object obj) {
        this.f1863d = obj;
        this.f1864e |= Integer.MIN_VALUE;
        return this.f.a(null, this);
    }
}
