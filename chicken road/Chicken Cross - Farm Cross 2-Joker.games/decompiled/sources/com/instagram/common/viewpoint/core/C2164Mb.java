package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Mb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2164Mb implements XN {
    public final /* synthetic */ MW A00;

    public C2164Mb(MW mw) {
        this.A00 = mw;
    }

    public /* synthetic */ C2164Mb(MW mw, C2175Mm c2175Mm) {
        this(mw);
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        AtomicBoolean atomicBoolean;
        boolean z;
        C2202No c2202No;
        boolean z2;
        this.A00.A0D();
        atomicBoolean = this.A00.A0R;
        if (!atomicBoolean.get()) {
            z = this.A00.A0T;
            if (!z) {
                z2 = this.A00.A0D;
                if (z2) {
                    this.A00.A0U.setToolbarActionMode(0);
                    return;
                }
            }
            c2202No = this.A00.A0H;
            if (c2202No.A0V()) {
                this.A00.A0U.setToolbarActionMode(1);
            } else {
                this.A00.A0U.setToolbarActionMode(0);
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f) {
        C2202No c2202No;
        C2202No c2202No2;
        c2202No = this.A00.A0H;
        if (c2202No.A0A() > 0) {
            c2202No2 = this.A00.A0H;
            if (f == c2202No2.A0A()) {
                this.A00.A0U.setToolbarActionMode(8);
            }
        }
    }
}
