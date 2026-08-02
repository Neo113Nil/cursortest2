package com.zettle.sdk.feature.taptopay.ui.settings;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/settings/PrerequisitesCheckUseCaseImpl;", "Lcom/zettle/sdk/feature/taptopay/ui/settings/PrerequisitesCheckUseCase;", "Landroid/content/Context;", "p0", "Lcom/zettle/sdk/commons/util/ExternalConfig;", "p1", "", "p2", "<init>", "(Landroid/content/Context;Lcom/zettle/sdk/commons/util/ExternalConfig;Z)V", "Lcom/zettle/sdk/feature/taptopay/ui/settings/Prerequisites;", "invoke", "()Lcom/zettle/sdk/feature/taptopay/ui/settings/Prerequisites;", "getHighSpeedVideoSizes", "()Z", "Landroid/content/Context;", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/commons/util/ExternalConfig;", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class PrerequisitesCheckUseCaseImpl implements com.zettle.sdk.feature.taptopay.ui.settings.PrerequisitesCheckUseCase {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.util.ExternalConfig getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;

    public PrerequisitesCheckUseCaseImpl(android.content.Context context, com.zettle.sdk.commons.util.ExternalConfig externalConfig, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.Camera2StreamConfigurationMap = context;
        this.getHighSpeedVideoFpsRanges = externalConfig;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    private final boolean getHighSpeedVideoSizes() {
        java.lang.Object m23436constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.zettle.sdk.feature.taptopay.ui.settings.PrerequisitesCheckUseCaseImpl prerequisitesCheckUseCaseImpl = this;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(android.nfc.NfcAdapter.getDefaultAdapter(this.Camera2StreamConfigurationMap));
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m23441isFailureimpl(m23436constructorimpl)) {
            m23436constructorimpl = null;
        }
        android.nfc.NfcAdapter nfcAdapter = (android.nfc.NfcAdapter) m23436constructorimpl;
        return (nfcAdapter == null || nfcAdapter.isEnabled()) ? false : true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final com.zettle.sdk.feature.taptopay.ui.settings.Prerequisites invoke() {
        com.zettle.sdk.commons.util.ExternalConfig externalConfig;
        com.zettle.sdk.commons.util.ExternalConfig externalConfig2;
        boolean z = this.getHighSpeedVideoFpsRangesFor && (externalConfig2 = this.getHighSpeedVideoFpsRanges) != null && externalConfig2.getBoolean("TapToPay: Simulate DevOptions Detected", false);
        int i = android.provider.Settings.Secure.getInt(this.Camera2StreamConfigurationMap.getContentResolver(), "development_settings_enabled", 0);
        int i2 = android.provider.Settings.Global.getInt(this.Camera2StreamConfigurationMap.getContentResolver(), "adb_enabled", 0);
        boolean z2 = this.getHighSpeedVideoFpsRangesFor;
        if ((!z2 && (i != 0 || i2 != 0)) || z) {
            return com.zettle.sdk.feature.taptopay.ui.settings.Prerequisites.DeveloperOptionsDetected.INSTANCE;
        }
        boolean z3 = z2 && (externalConfig = this.getHighSpeedVideoFpsRanges) != null && externalConfig.getBoolean("TapToPay: Simulate RequiredPermissions Missing", false);
        if (androidx.core.content.ContextCompat.checkSelfPermission(this.Camera2StreamConfigurationMap, "android.permission.ACCESS_FINE_LOCATION") != 0 || z3) {
            return com.zettle.sdk.feature.taptopay.ui.settings.Prerequisites.RequiredPermissionsMissing.INSTANCE;
        }
        if (getHighSpeedVideoSizes()) {
            return com.zettle.sdk.feature.taptopay.ui.settings.Prerequisites.NfcDisabled.INSTANCE;
        }
        return com.zettle.sdk.feature.taptopay.ui.settings.Prerequisites.None.INSTANCE;
    }
}
