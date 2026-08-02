package com.paypal.oslo.feature.identity.devicebinding.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/identity/devicebinding/data/mapper/DeviceBindingMethodDataMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;", "method", "", "getGrantType", "(Lcom/paypal/oslo/feature/identity/shared/domain/model/DeviceAuthMethod;)Ljava/lang/String;", "getBodyKey", "getStorageKey", "getKeyIdentifier"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeviceBindingMethodDataMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.identity.devicebinding.data.mapper.DeviceBindingMethodDataMapper INSTANCE = new com.paypal.oslo.feature.identity.devicebinding.data.mapper.DeviceBindingMethodDataMapper();

    private DeviceBindingMethodDataMapper() {
    }

    public final java.lang.String getGrantType(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod method) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        int i = com.paypal.oslo.feature.identity.devicebinding.data.mapper.DeviceBindingMethodDataMapper.WhenMappings.$EnumSwitchMapping$0[method.ordinal()];
        if (i == 1) {
            return "user_preview";
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "biometric_fingerprint";
    }

    public final java.lang.String getBodyKey(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod method) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        int i = com.paypal.oslo.feature.identity.devicebinding.data.mapper.DeviceBindingMethodDataMapper.WhenMappings.$EnumSwitchMapping$0[method.ordinal()];
        if (i == 1) {
            return "refreshToken";
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "userBindToken";
    }

    public final java.lang.String getStorageKey(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod method) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        int i = com.paypal.oslo.feature.identity.devicebinding.data.mapper.DeviceBindingMethodDataMapper.WhenMappings.$EnumSwitchMapping$0[method.ordinal()];
        if (i == 1) {
            return "isLLSDisabledByUser";
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "isBiometricDisabledByUser";
    }

    public final java.lang.String getKeyIdentifier(com.paypal.oslo.feature.identity.shared.domain.model.DeviceAuthMethod method) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(method, "");
        int i = com.paypal.oslo.feature.identity.devicebinding.data.mapper.DeviceBindingMethodDataMapper.WhenMappings.$EnumSwitchMapping$0[method.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.identity.devicebinding.security.NonBiometricKeyWrapper.LLS_KEY_ALIAS;
        }
        if (i != 2) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return "deviceAuthBiometricAsymmetricKey";
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
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
}
