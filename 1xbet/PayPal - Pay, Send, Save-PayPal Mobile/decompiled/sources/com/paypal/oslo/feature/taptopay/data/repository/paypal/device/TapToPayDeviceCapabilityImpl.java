package com.paypal.oslo.feature.taptopay.data.repository.paypal.device;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/paypal/device/TapToPayDeviceCapabilityImpl;", "Lcom/paypal/oslo/feature/taptopay/api/domain/capability/TapToPayDeviceCapability;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "isNFCSupported", "()Z", "isDeviceScreenLockEnabled", "isNFCEnabled", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TapToPayDeviceCapabilityImpl implements com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.content.Context Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public TapToPayDeviceCapabilityImpl(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.Camera2StreamConfigurationMap = context;
    }

    @Override // com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability
    public final boolean isNFCSupported() {
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(this.Camera2StreamConfigurationMap);
        return (defaultAdapter == null || android.nfc.cardemulation.CardEmulation.getInstance(defaultAdapter) == null) ? false : true;
    }

    @Override // com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability
    public final boolean isDeviceScreenLockEnabled() {
        java.lang.Object systemService = this.Camera2StreamConfigurationMap.getSystemService("keyguard");
        android.app.KeyguardManager keyguardManager = systemService instanceof android.app.KeyguardManager ? (android.app.KeyguardManager) systemService : null;
        if (keyguardManager == null) {
            return false;
        }
        return keyguardManager.isDeviceSecure();
    }

    @Override // com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability
    public final boolean isNFCEnabled() {
        android.nfc.NfcAdapter defaultAdapter = android.nfc.NfcAdapter.getDefaultAdapter(this.Camera2StreamConfigurationMap);
        if (defaultAdapter == null) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "NFC adapter not available", null, null, 6, null);
            return false;
        }
        boolean isEnabled = defaultAdapter.isEnabled();
        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.taptopay.LoggerKt.log, "NFC enabled: ".concat(java.lang.String.valueOf(isEnabled)), null, null, 6, null);
        return isEnabled;
    }
}
