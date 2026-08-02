package com.zettle.sdk.feature.taptopay.core.attestation.analytics;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ*\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsEndedUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/analytics/AttestationAnalyticsEndedUseCase;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "proxy", "Lcom/zettle/sdk/analytics/Analytics;", "analytics", "Lcom/zettle/sdk/meta/AppInfo;", "appInfo", "<init>", "(Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;Lcom/zettle/sdk/analytics/Analytics;Lcom/zettle/sdk/meta/AppInfo;)V", "Landroid/content/Context;", "context", "Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;", "info", "Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResult;", "attestationResult", "", "invoke", "(Landroid/content/Context;Lcom/zettle/sdk/feature/taptopay/core/transaction/models/TransactionInfo;Lcom/zettle/sdk/feature/taptopay/core/attestation/AttestationResult;)V", "getHighSpeedVideoFpsRanges", "Lcom/zettle/sdk/analytics/Analytics;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/meta/AppInfo;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AttestationAnalyticsEndedUseCaseImpl implements com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsEndedUseCase, com.zettle.sdk.core.log.Loggable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.meta.AppInfo getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.analytics.Analytics getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy Camera2StreamConfigurationMap;

    public AttestationAnalyticsEndedUseCaseImpl(com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy, com.zettle.sdk.analytics.Analytics analytics, com.zettle.sdk.meta.AppInfo appInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceProxy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(analytics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appInfo, "");
        this.Camera2StreamConfigurationMap = softspaceProxy;
        this.getHighResolutionOutputSizeshNQ4ISI = analytics;
        this.getHighSpeedVideoFpsRangesFor = appInfo;
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* bridge */ /* synthetic */ kotlin.Unit invoke(android.content.Context context, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo transactionInfo, com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult attestationResult) {
        invoke2(context, transactionInfo, attestationResult);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsEndedUseCase
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(android.content.Context context, com.zettle.sdk.feature.taptopay.core.transaction.models.TransactionInfo info, com.zettle.sdk.feature.taptopay.core.attestation.AttestationResult attestationResult) {
        com.zettle.sdk.feature.taptopay.core.transaction.models.TapToPayReference getOutputFormats;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(attestationResult, "");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        com.zettle.sdk.feature.taptopay.core.models.SoftspaceReaderInfo softspaceReaderInfo = this.Camera2StreamConfigurationMap.getSoftspaceReaderInfo();
        jSONObject.putOpt("paymentSessionId", info != null ? info.getGetHighSpeedVideoSizes() : null);
        jSONObject.putOpt(androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, (info == null || (getOutputFormats = info.getGetOutputFormats()) == null) ? null : getOutputFormats.getGetHighResolutionOutputSizeshNQ4ISI());
        jSONObject.putOpt("attestationEvent", attestationResult);
        jSONObject.putOpt("softspaceSdkVersion", softspaceReaderInfo != null ? softspaceReaderInfo.getSdkVersion() : null);
        jSONObject.putOpt("cotsId", softspaceReaderInfo != null ? softspaceReaderInfo.getCotsId() : null);
        jSONObject.putOpt(com.zettle.sdk.feature.taptopay.core.attestation.analytics.AttestationAnalyticsKt.KEY_SDK_VERSION_V2, this.getHighSpeedVideoFpsRangesFor.getSdkVersion());
        this.getHighResolutionOutputSizeshNQ4ISI.dispatch(new com.zettle.sdk.analytics.Gdp.Event("PaymentsExperience", "TapOnPhone", com.datadog.android.rum.internal.domain.scope.RumViewManagerScope.RUM_BACKGROUND_VIEW_NAME, "AttestationEnded", jSONObject));
    }
}
