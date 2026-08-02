package com.zettle.sdk.feature.taptopay.core.attestation.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationRequirementsCheckUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationRequirementsCheckUseCase;", "Landroid/content/Context;", "context", "Lcom/zettle/sdk/commons/util/ExternalConfig;", "externalConfig", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;", "softspaceProxy", "Lkotlin/Function0;", "", "isDebug", "<init>", "(Landroid/content/Context;Lcom/zettle/sdk/commons/util/ExternalConfig;Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;Lkotlin/jvm/functions/Function0;)V", "Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationRequirementsResult;", "invoke", "()Lcom/zettle/sdk/feature/taptopay/core/attestation/usecase/AttestationRequirementsResult;", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/commons/util/ExternalConfig;", "Lkotlin/jvm/functions/Function0;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/feature/taptopay/core/proxy/SoftspaceProxy;"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AttestationRequirementsCheckUseCaseImpl implements com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsCheckUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.util.ExternalConfig getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;
    private final com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy getHighSpeedVideoSizes;

    public AttestationRequirementsCheckUseCaseImpl(android.content.Context context, com.zettle.sdk.commons.util.ExternalConfig externalConfig, com.zettle.sdk.feature.taptopay.core.proxy.SoftspaceProxy softspaceProxy, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(softspaceProxy, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.getHighResolutionOutputSizeshNQ4ISI = context;
        this.getHighSpeedVideoFpsRanges = externalConfig;
        this.getHighSpeedVideoSizes = softspaceProxy;
        this.getHighSpeedVideoFpsRangesFor = function0;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsResult invoke() {
        com.zettle.sdk.commons.util.ExternalConfig externalConfig;
        com.zettle.sdk.commons.util.ExternalConfig externalConfig2;
        if (!this.getHighSpeedVideoSizes.isInitialised()) {
            return com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsResult.NotInitialised.INSTANCE;
        }
        boolean z = this.getHighSpeedVideoFpsRangesFor.invoke().booleanValue() && (externalConfig2 = this.getHighSpeedVideoFpsRanges) != null && externalConfig2.getBoolean("TapToPay: Simulate DevOptions Detected", false);
        int i = android.provider.Settings.Secure.getInt(this.getHighResolutionOutputSizeshNQ4ISI.getContentResolver(), "development_settings_enabled", 0);
        int i2 = android.provider.Settings.Global.getInt(this.getHighResolutionOutputSizeshNQ4ISI.getContentResolver(), "adb_enabled", 0);
        if ((!this.getHighSpeedVideoFpsRangesFor.invoke().booleanValue() && (i != 0 || i2 != 0)) || z) {
            return com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsResult.DeveloperOptionsDetected.INSTANCE;
        }
        boolean z2 = this.getHighSpeedVideoFpsRangesFor.invoke().booleanValue() && (externalConfig = this.getHighSpeedVideoFpsRanges) != null && externalConfig.getBoolean("TapToPay: Simulate RequiredPermissions Missing", false);
        if (!this.getHighSpeedVideoSizes.hasRequiredPermission(this.getHighResolutionOutputSizeshNQ4ISI) || z2) {
            return com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsResult.RequiredPermissionsMissing.INSTANCE;
        }
        return com.zettle.sdk.feature.taptopay.core.attestation.usecase.AttestationRequirementsResult.AttestationRequirementsOk.INSTANCE;
    }
}
