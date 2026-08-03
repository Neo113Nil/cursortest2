package com.unity3d.ads.core.extensions;

/* compiled from: TimeExtensions.kt */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"elapsedMillis", "", "Lkotlin/time/TimeMark;", "unity-ads_defaultRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TimeExtensionsKt {
    public static final double elapsedMillis(kotlin.time.TimeMark timeMark) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeMark, "<this>");
        return kotlin.time.Duration.m12182toDoubleimpl(timeMark.mo12136elapsedNowUwyO8pc(), kotlin.time.DurationUnit.MILLISECONDS);
    }
}
