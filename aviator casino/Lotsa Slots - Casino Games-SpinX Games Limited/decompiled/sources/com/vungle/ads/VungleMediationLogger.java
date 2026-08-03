package com.vungle.ads;

/* compiled from: VungleMediationLogger.kt */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/vungle/ads/VungleMediationLogger;", "", "()V", "logError", "", "ad", "Lcom/vungle/ads/VungleAdType;", "message", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes6.dex */
public final class VungleMediationLogger {
    public static final com.vungle.ads.VungleMediationLogger INSTANCE = new com.vungle.ads.VungleMediationLogger();

    private VungleMediationLogger() {
    }

    @kotlin.jvm.JvmStatic
    public static final void logError(com.vungle.ads.VungleAdType ad, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        com.vungle.ads.AnalyticsClient.INSTANCE.logError$vungle_ads_release(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.MEDIATION_ERROR, message, ad != null ? com.vungle.ads.VungleMediationLoggerKt.getAdLogEntry(ad) : null);
    }
}
