package com.instagram.common.viewpoint.core;

import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;

/* renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C17926y implements InterfaceC2360Tv {
    public NativeAdBase A00;
    public NativeAdListener A01;

    public C17926y(NativeAdListener nativeAdListener, NativeAdBase nativeAdBase) {
        this.A01 = nativeAdListener;
        this.A00 = nativeAdBase;
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void ACm() {
        WT.A00(new C2355Tq(this));
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void ACq() {
        WT.A00(new C2356Tr(this));
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void ADp(C2402Vm c2402Vm) {
        WT.A00(new C2358Tt(this, c2402Vm));
    }

    @Override // com.instagram.common.viewpoint.core.VP
    public final void AEl() {
        WT.A00(new C2354Tp(this));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2360Tv
    public final void AEq() {
        WT.A00(new C2357Ts(this));
    }
}
