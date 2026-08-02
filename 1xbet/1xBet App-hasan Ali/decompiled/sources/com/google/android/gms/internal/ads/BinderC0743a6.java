package com.google.android.gms.internal.ads;

import Q2.C0387u0;

/* renamed from: com.google.android.gms.internal.ads.a6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC0743a6 extends AbstractBinderC1056h6 {

    /* renamed from: k, reason: collision with root package name */
    public final L2.a f12639k;

    public BinderC0743a6(L2.a aVar, String str) {
        this.f12639k = aVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1101i6
    public final void e2(C0387u0 c0387u0) {
        L2.a aVar = this.f12639k;
        if (aVar != null) {
            aVar.b(c0387u0.b());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1101i6
    public final void n0(InterfaceC0966f6 interfaceC0966f6) {
        L2.a aVar = this.f12639k;
        if (aVar != null) {
            aVar.d(new C0788b6(interfaceC0966f6));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1101i6
    public final void z(int i) {
    }
}
