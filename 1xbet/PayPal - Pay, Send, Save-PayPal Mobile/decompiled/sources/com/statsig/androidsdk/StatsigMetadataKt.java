package com.statsig.androidsdk;

@kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0002"}, d2 = {"Lcom/statsig/androidsdk/StatsigMetadata;", "createCoreStatsigMetadata", "()Lcom/statsig/androidsdk/StatsigMetadata;", "createStatsigMetadata"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StatsigMetadataKt {
    public static final com.statsig.androidsdk.StatsigMetadata createStatsigMetadata() {
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return new com.statsig.androidsdk.StatsigMetadata(null, "android-client", com.statsig.androidsdk.BuildConfig.VERSION_NAME, obj, null, null, android.os.Build.MANUFACTURER, android.os.Build.MODEL, "Android", java.util.Locale.getDefault().toString(), java.util.Locale.getDefault().toLanguageTag(), java.lang.String.valueOf(android.os.Build.VERSION.SDK_INT), "Android");
    }

    public static final com.statsig.androidsdk.StatsigMetadata createCoreStatsigMetadata() {
        java.lang.String obj = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return new com.statsig.androidsdk.StatsigMetadata(null, "android-client", com.statsig.androidsdk.BuildConfig.VERSION_NAME, obj, null, null, null, null, null, null, null, null, null);
    }
}
