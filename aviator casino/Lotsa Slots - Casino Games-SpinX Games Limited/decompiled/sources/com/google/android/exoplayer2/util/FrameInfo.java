package com.google.android.exoplayer2.util;

/* loaded from: classes3.dex */
public class FrameInfo {
    public final int height;
    public final float pixelWidthHeightRatio;
    public final long streamOffsetUs;
    public final int width;

    public FrameInfo(int i, int i2, float f, long j) {
        com.google.android.exoplayer2.util.Assertions.checkArgument(i > 0, "width must be positive, but is: " + i);
        com.google.android.exoplayer2.util.Assertions.checkArgument(i2 > 0, "height must be positive, but is: " + i2);
        this.width = i;
        this.height = i2;
        this.pixelWidthHeightRatio = f;
        this.streamOffsetUs = j;
    }
}
