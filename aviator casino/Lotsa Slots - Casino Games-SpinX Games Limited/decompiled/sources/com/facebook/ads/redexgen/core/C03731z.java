package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.1z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C03731z {
    public final android.media.AudioAttributes A00;

    public C03731z(com.facebook.ads.redexgen.core.C2202qQ c2202qQ) {
        android.media.AudioAttributes.Builder usage = new android.media.AudioAttributes.Builder().setContentType(c2202qQ.A02).setFlags(c2202qQ.A03).setUsage(c2202qQ.A05);
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 29) {
            com.facebook.ads.redexgen.core.C03711x.A00(usage, c2202qQ.A01);
        }
        if (com.facebook.ads.redexgen.core.C5C.A02 >= 32) {
            com.facebook.ads.redexgen.core.C03721y.A00(usage, c2202qQ.A04);
        }
        this.A00 = usage.build();
    }
}
