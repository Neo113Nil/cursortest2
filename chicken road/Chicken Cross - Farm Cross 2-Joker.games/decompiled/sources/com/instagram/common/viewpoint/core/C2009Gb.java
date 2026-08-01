package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Gb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2009Gb implements InterfaceC2586b8 {
    public final /* synthetic */ C17394x A00;

    public C2009Gb(C17394x c17394x) {
        this.A00 = c17394x;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2586b8
    public final void AE7(C2585b7 c2585b7) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A05;
        atomicBoolean.set(c2585b7.A00() != null);
        this.A00.A06();
    }
}
