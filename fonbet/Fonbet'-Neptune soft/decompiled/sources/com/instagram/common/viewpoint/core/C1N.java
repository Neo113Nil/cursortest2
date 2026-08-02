package com.instagram.common.viewpoint.core;

import android.media.AudioAttributes;

/* renamed from: com.facebook.ads.redexgen.X.1N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C1N {
    public final AudioAttributes A00;

    public C1N(C1836oy c1836oy) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c1836oy.A02).setFlags(c1836oy.A03).setUsage(c1836oy.A05);
        if (AbstractC01424a.A02 >= 29) {
            C1L.A00(usage, c1836oy.A01);
        }
        if (AbstractC01424a.A02 >= 32) {
            C1M.A00(usage, c1836oy.A04);
        }
        this.A00 = usage.build();
    }
}
