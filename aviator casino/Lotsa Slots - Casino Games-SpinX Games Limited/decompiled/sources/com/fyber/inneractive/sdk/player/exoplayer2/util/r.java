package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* loaded from: classes3.dex */
public final class r implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        float f = ((com.fyber.inneractive.sdk.player.exoplayer2.util.s) obj).c;
        float f2 = ((com.fyber.inneractive.sdk.player.exoplayer2.util.s) obj2).c;
        if (f < f2) {
            return -1;
        }
        return f2 < f ? 1 : 0;
    }
}
