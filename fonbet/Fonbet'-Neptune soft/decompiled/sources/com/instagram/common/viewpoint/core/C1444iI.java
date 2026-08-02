package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.iI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1444iI implements InterfaceC0724Re {
    public final /* synthetic */ C7B A00;

    public C1444iI(C7B c7b) {
        this.A00 = c7b;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0724Re
    public final void ACM() {
        AtomicBoolean atomicBoolean;
        InterfaceC0600Mh interfaceC0600Mh;
        atomicBoolean = this.A00.A0C;
        atomicBoolean.set(true);
        interfaceC0600Mh = this.A00.A01;
        interfaceC0600Mh.AF4(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0724Re
    public final void ACN() {
        InterfaceC0600Mh interfaceC0600Mh;
        interfaceC0600Mh = this.A00.A01;
        interfaceC0600Mh.AF7(this.A00, AdError.CACHE_ERROR);
    }
}
