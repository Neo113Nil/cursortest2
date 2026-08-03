package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class H {
    public static final int a(java.lang.String str, java.lang.String str2, com.inmobi.media.core.config.models.AdConfig adConfig) {
        return kotlin.jvm.internal.Intrinsics.areEqual("video", str) ? kotlin.jvm.internal.Intrinsics.areEqual("native", str2) ? adConfig.getNative().getViewabilityConfig().getImpressionConfig().getMinPercentageViewed() : adConfig.getViewability().getVideoImpressionMinPercentageViewed() : kotlin.jvm.internal.Intrinsics.areEqual("audio", str) ? kotlin.jvm.internal.Intrinsics.areEqual("audio", str2) ? adConfig.getViewability().getAudioImpressionMinPercentageViewed() : adConfig.getViewability().getWebImpressionMinPercentageViewed() : kotlin.jvm.internal.Intrinsics.areEqual("native", str2) ? adConfig.getNative().getViewabilityConfig().getImpressionConfig().getMinPercentageViewed() : adConfig.getViewability().getWebImpressionMinPercentageViewed();
    }

    public static final int b(java.lang.String str, java.lang.String str2, com.inmobi.media.core.config.models.AdConfig adConfig) {
        return kotlin.jvm.internal.Intrinsics.areEqual("video", str) ? kotlin.jvm.internal.Intrinsics.areEqual("native", str2) ? adConfig.getNative().getViewabilityConfig().getImpressionConfig().getVideoMinTimeViewed() : adConfig.getViewability().getVideoImpressionMinTimeViewed() : kotlin.jvm.internal.Intrinsics.areEqual("audio", str) ? kotlin.jvm.internal.Intrinsics.areEqual("audio", str2) ? adConfig.getViewability().getAudioImpressionMinTimeViewed() : adConfig.getViewability().getWebImpressionMinTimeViewed() : kotlin.jvm.internal.Intrinsics.areEqual("native", str2) ? adConfig.getNative().getViewabilityConfig().getImpressionConfig().getMinTimeViewed() : adConfig.getViewability().getWebImpressionMinTimeViewed();
    }

    public static final int a(java.lang.String str) {
        if (kotlin.text.StringsKt.startsWith$default(str, "track_", false, 2, (java.lang.Object) null)) {
            str = str.substring(6);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "substring(...)");
        }
        try {
            return java.lang.Integer.parseInt(str);
        } catch (java.lang.NumberFormatException unused) {
            return -1;
        }
    }
}
