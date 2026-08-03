package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public static final long f7930a = 1000;

    public static final boolean b(kotlinx.coroutines.Job job) {
        return job == null || job.isCancelled() || job.isCompleted();
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a b(int i) {
        return i == 0 ? com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a.C0312a.b : new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d.a.b(i, null);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.g a(java.lang.Boolean bool, int i, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r rVar) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(bool, java.lang.Boolean.FALSE)) {
            rVar = null;
        } else if (kotlin.jvm.internal.Intrinsics.areEqual(bool, java.lang.Boolean.TRUE)) {
            rVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.r.b(i * 1000);
        } else if (bool != null) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h(rVar);
    }

    public static final int b(kotlin.ranges.IntRange intRange, int i) {
        return kotlin.UnsignedKt.doubleToUInt(kotlin.ranges.RangesKt.coerceAtLeast(((kotlin.ranges.RangesKt.coerceAtLeast(intRange.getLast() - intRange.getFirst(), 0) * i) / 100.0d) / 1000, 0.0d));
    }

    public static final long b(long j) {
        return j / 1000;
    }

    public static final int a(kotlin.ranges.LongRange longRange) {
        return kotlin.UInt.m10896constructorimpl((int) kotlin.ranges.RangesKt.coerceAtLeast((longRange.getLast() - longRange.getFirst()) / 1000, 0L));
    }
}
