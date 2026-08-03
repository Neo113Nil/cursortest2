package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* loaded from: classes3.dex */
public abstract class w {
    public static void a(java.lang.String str) {
        if (com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a >= 18) {
            android.os.Trace.beginSection(str);
        }
    }

    public static void a() {
        if (com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a >= 18) {
            android.os.Trace.endSection();
        }
    }
}
