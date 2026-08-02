package P;

import p4.InterfaceC2280u;

/* renamed from: P.t0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0318t0 implements InterfaceC0289e0, InterfaceC2280u {

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0289e0 f4562k;

    /* renamed from: l, reason: collision with root package name */
    public final a4.h f4563l;

    public C0318t0(InterfaceC0289e0 interfaceC0289e0, a4.h hVar) {
        this.f4562k = interfaceC0289e0;
        this.f4563l = hVar;
    }

    @Override // P.d1
    public final Object getValue() {
        return this.f4562k.getValue();
    }

    @Override // p4.InterfaceC2280u
    public final a4.h i() {
        return this.f4563l;
    }

    @Override // P.InterfaceC0289e0
    public final void setValue(Object obj) {
        this.f4562k.setValue(obj);
    }
}
