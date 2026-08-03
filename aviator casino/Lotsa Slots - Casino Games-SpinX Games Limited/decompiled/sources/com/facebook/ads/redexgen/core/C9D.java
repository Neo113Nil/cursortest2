package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.9D, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C9D {
    public static void A00(android.media.AudioTrack audioTrack, com.facebook.ads.redexgen.core.C8O c8o) {
        android.media.metrics.LogSessionId A00 = c8o.A00();
        android.media.metrics.LogSessionId logSessionId = android.media.metrics.LogSessionId.LOG_SESSION_ID_NONE;
        if (!A00.equals(logSessionId)) {
            audioTrack.setLogSessionId(A00);
        }
    }
}
