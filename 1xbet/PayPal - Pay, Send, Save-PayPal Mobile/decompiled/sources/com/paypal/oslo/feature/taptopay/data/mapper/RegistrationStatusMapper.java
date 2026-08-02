package com.paypal.oslo.feature.taptopay.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/mapper/RegistrationStatusMapper;", "", "<init>", "()V", "Lcom/payair/model/RegistrationStatus;", "sdk", "Lcom/paypal/oslo/feature/taptopay/domain/model/setup/DeviceRegistrationStatus;", "sdkToDomain", "(Lcom/payair/model/RegistrationStatus;)Lcom/paypal/oslo/feature/taptopay/domain/model/setup/DeviceRegistrationStatus;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RegistrationStatusMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.taptopay.data.mapper.RegistrationStatusMapper INSTANCE = new com.paypal.oslo.feature.taptopay.data.mapper.RegistrationStatusMapper();

    private RegistrationStatusMapper() {
    }

    public final com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus sdkToDomain(com.payair.model.RegistrationStatus sdk) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdk, "");
        int i = com.paypal.oslo.feature.taptopay.data.mapper.RegistrationStatusMapper.WhenMappings.$EnumSwitchMapping$0[sdk.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus.REGISTERED;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus.SESSION_EXPIRED;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus.LOGOUT;
        }
        if (i != 4) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return com.paypal.oslo.feature.taptopay.domain.model.setup.DeviceRegistrationStatus.UNSUPPORTED_VERSION_DETECTED;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.payair.model.RegistrationStatus.values().length];
            try {
                iArr[com.payair.model.RegistrationStatus.REGISTERED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.payair.model.RegistrationStatus.SESSION_EXPIRED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.payair.model.RegistrationStatus.LOGOUT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.payair.model.RegistrationStatus.UNSUPPORTED_VERSION_DETECTED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
