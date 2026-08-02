package com.paypal.oslo.feature.businesspayandgetpaid.zettle.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/data/mapper/DeviceRequirementMapper;", "", "<init>", "()V", "Lcom/zettle/sdk/feature/taptopay/ui/TapToPayDeviceRequirement;", "requirement", "Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/DeviceCompatibilityResult;", "mapToDeviceCompatibilityResult", "(Lcom/zettle/sdk/feature/taptopay/ui/TapToPayDeviceRequirement;)Lcom/paypal/oslo/feature/businesspayandgetpaid/zettle/domain/model/DeviceCompatibilityResult;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeviceRequirementMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public DeviceRequirementMapper() {
    }

    public final com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult mapToDeviceCompatibilityResult(com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirement requirement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requirement, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(requirement, com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirement.Ok.INSTANCE)) {
            return com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult.Compatible.INSTANCE;
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(requirement, com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirement.NfcCapabilitiesMissing.INSTANCE)) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult.Incompatible(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement.HARDWARE_CAPABILITY);
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(requirement, com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirement.GooglePlayServicesMissing.INSTANCE)) {
            return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult.Incompatible(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement.GOOGLE_PLAY_SERVICES);
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(requirement, com.zettle.sdk.feature.taptopay.ui.TapToPayDeviceRequirement.AndroidVersionBelowOreo.INSTANCE)) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return new com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityResult.Incompatible(com.paypal.oslo.feature.businesspayandgetpaid.zettle.domain.model.DeviceCompatibilityRequirement.OS_VERSION);
    }
}
