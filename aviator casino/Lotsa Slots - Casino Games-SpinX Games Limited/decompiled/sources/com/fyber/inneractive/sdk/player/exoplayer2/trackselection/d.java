package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

/* loaded from: classes3.dex */
public final class d extends com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g {
    public final java.util.concurrent.atomic.AtomicReference c = new java.util.concurrent.atomic.AtomicReference(new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.c());

    public static boolean a(int i, boolean z) {
        int i2 = i & 3;
        return i2 == 3 || (z && i2 == 2);
    }
}
