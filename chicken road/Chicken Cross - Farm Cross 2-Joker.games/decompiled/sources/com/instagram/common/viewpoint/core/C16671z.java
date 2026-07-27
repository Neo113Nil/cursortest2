package com.instagram.common.viewpoint.core;

import android.media.AudioAttributes;

/* renamed from: com.facebook.ads.redexgen.X.1z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C16671z {
    public final AudioAttributes A00;

    public C16671z(C3496qQ c3496qQ) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(c3496qQ.A02).setFlags(c3496qQ.A03).setUsage(c3496qQ.A05);
        if (C5C.A02 >= 29) {
            C16651x.A00(usage, c3496qQ.A01);
        }
        if (C5C.A02 >= 32) {
            C16661y.A00(usage, c3496qQ.A04);
        }
        this.A00 = usage.build();
    }
}
