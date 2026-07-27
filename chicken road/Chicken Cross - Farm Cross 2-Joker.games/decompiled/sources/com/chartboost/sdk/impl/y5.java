package com.chartboost.sdk.impl;

import android.content.Context;
import androidx.media3.exoplayer.DefaultLoadControl;
import androidx.media3.exoplayer.ExoPlayer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes4.dex */
public final class y5 implements w7 {
    @Override // com.chartboost.sdk.impl.w7
    public ExoPlayer a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DefaultLoadControl build = new DefaultLoadControl.Builder().setBufferDurationsMs(50000, 50000, 0, 0).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        ExoPlayer build2 = new ExoPlayer.Builder(context).setLoadControl(build).build();
        Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
        return build2;
    }

    @Override // com.chartboost.sdk.impl.w7
    public ExoPlayer b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ExoPlayer build = new ExoPlayer.Builder(context).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    @Override // com.chartboost.sdk.impl.w7
    public ExoPlayer a(Context context, long j) {
        Intrinsics.checkNotNullParameter(context, "context");
        int coerceIn = (int) RangesKt.coerceIn(j, 0L, 50000L);
        if (coerceIn != j) {
            mb.e("bufferForPlaybackMs (" + j + ") clamped to " + coerceIn + " to satisfy ExoPlayer minBufferMs constraint", null, 2, null);
        }
        DefaultLoadControl build = new DefaultLoadControl.Builder().setBufferDurationsMs(50000, 50000, coerceIn, Math.max(coerceIn, 5000)).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        ExoPlayer build2 = new ExoPlayer.Builder(context).setLoadControl(build).build();
        Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
        return build2;
    }
}
