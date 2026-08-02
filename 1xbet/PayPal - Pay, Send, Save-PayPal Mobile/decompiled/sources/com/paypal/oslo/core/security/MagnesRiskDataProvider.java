package com.paypal.oslo.core.security;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lcom/paypal/oslo/core/security/MagnesRiskDataProvider;", "Lcom/paypal/oslo/core/security/RiskDataProvider;", "Landroid/content/Context;", "context", "Llib/android/paypal/com/magnessdk/MagnesSDK;", "magnesSDK", "Ljava/util/concurrent/CountDownLatch;", "securitySetupLatch", "<init>", "(Landroid/content/Context;Llib/android/paypal/com/magnessdk/MagnesSDK;Ljava/util/concurrent/CountDownLatch;)V", "", "sourceId", "cmId", "Lcom/paypal/oslo/core/security/RiskData;", "generateFreshDeviceRiskData", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/core/security/RiskData;", "getHighSpeedVideoSizes", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Llib/android/paypal/com/magnessdk/MagnesSDK;", "Camera2StreamConfigurationMap", "Ljava/util/concurrent/CountDownLatch;", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MagnesRiskDataProvider implements com.paypal.oslo.core.security.RiskDataProvider {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.concurrent.CountDownLatch getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final lib.android.paypal.com.magnessdk.MagnesSDK Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;
    public static final int $stable = 8;

    @javax.inject.Inject
    public MagnesRiskDataProvider(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context, lib.android.paypal.com.magnessdk.MagnesSDK magnesSDK, java.util.concurrent.CountDownLatch countDownLatch) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(magnesSDK, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countDownLatch, "");
        this.getHighSpeedVideoFpsRangesFor = context;
        this.Camera2StreamConfigurationMap = magnesSDK;
        this.getHighResolutionOutputSizeshNQ4ISI = countDownLatch;
    }

    @Override // com.paypal.oslo.core.security.RiskDataProvider
    public final com.paypal.oslo.core.security.RiskData generateFreshDeviceRiskData(java.lang.String sourceId, java.lang.String cmId) {
        if (!this.getHighResolutionOutputSizeshNQ4ISI.await(30L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.core.security.LoggerKt.log, "Magnes setup did not complete before collectAndSubmit", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("callerClass", "MagnesRiskDataProvider")), null, 4, null);
        }
        java.lang.String str = sourceId;
        lib.android.paypal.com.magnessdk.MagnesResult collectAndSubmit = this.Camera2StreamConfigurationMap.collectAndSubmit(this.getHighSpeedVideoFpsRangesFor, cmId, (str == null || str.length() == 0) ? new java.util.HashMap<>() : kotlin.collections.MapsKt.hashMapOf(kotlin.TuplesKt.to("source_id", sourceId)));
        java.lang.String jSONObject = collectAndSubmit.getDeviceInfo().toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObject, "");
        java.lang.String paypalClientMetaDataId = collectAndSubmit.getPaypalClientMetaDataId();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(paypalClientMetaDataId, "");
        return new com.paypal.oslo.core.security.RiskData(jSONObject, paypalClientMetaDataId);
    }
}
