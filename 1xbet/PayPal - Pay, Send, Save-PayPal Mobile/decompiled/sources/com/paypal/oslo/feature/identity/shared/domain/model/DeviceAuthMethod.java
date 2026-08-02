package com.paypal.oslo.feature.identity.shared.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006j\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;", "", "<init>", "(Ljava/lang/String;I)V", "", "getDisplayName", "()Ljava/lang/String;", "displayName", "getKeyIdentifier", "keyIdentifier", "getStorageKey", "storageKey", "LLS", "BIOMETRIC"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DeviceAuthMethod {
    public static final com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod BIOMETRIC;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod LLS;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private DeviceAuthMethod(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod = new com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod("LLS", 0);
        LLS = deviceAuthMethod;
        com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod deviceAuthMethod2 = new com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod("BIOMETRIC", 1);
        BIOMETRIC = deviceAuthMethod2;
        com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod[] deviceAuthMethodArr = {deviceAuthMethod, deviceAuthMethod2};
        Camera2StreamConfigurationMap = deviceAuthMethodArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(deviceAuthMethodArr);
    }

    public final java.lang.String getDisplayName() {
        int i = com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "Long Lived Session";
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "Biometric Authentication";
    }

    public final java.lang.String getKeyIdentifier() {
        int i = com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.identity.devicebinding.security.NonBiometricKeyWrapper.LLS_KEY_ALIAS;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "deviceAuthBiometricAsymmetricKey";
    }

    public final java.lang.String getStorageKey() {
        int i = com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return "isUserPreviewDisabledByUser";
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "isBiometryDisabledByUser";
    }

    public static com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod[] values() {
        return (com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod[]) Camera2StreamConfigurationMap.clone();
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.values().length];
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.LLS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.BIOMETRIC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
