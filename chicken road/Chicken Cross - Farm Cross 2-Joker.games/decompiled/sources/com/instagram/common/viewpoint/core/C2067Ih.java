package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ih, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2067Ih implements InterfaceC2586b8 {
    public final /* synthetic */ C17495h A00;

    public C2067Ih(C17495h c17495h) {
        this.A00 = c17495h;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC2586b8
    public final void AE7(C2585b7 c2585b7) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.A00.A08;
        atomicBoolean.set(c2585b7.A00() != null);
        this.A00.A07();
    }
}
