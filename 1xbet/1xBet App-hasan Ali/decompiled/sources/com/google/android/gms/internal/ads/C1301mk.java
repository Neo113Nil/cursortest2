package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mk, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1301mk implements InterfaceC1897zw {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14527a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1537rw f14528b;

    public /* synthetic */ C1301mk(C1537rw c1537rw, int i) {
        this.f14527a = i;
        this.f14528b = c1537rw;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1897zw
    public final E3.a k(Object obj) {
        InterfaceC0677Re interfaceC0677Re = (InterfaceC0677Re) obj;
        switch (this.f14527a) {
            case 0:
                if (interfaceC0677Re == null || interfaceC0677Re.s() == null) {
                    throw new C0858co("Retrieve video view in html5 ad response failed.", 1);
                }
                return this.f14528b;
            default:
                if (interfaceC0677Re != null) {
                    return this.f14528b;
                }
                throw new C0858co("Retrieve Web View from image ad response failed.", 1);
        }
    }
}
