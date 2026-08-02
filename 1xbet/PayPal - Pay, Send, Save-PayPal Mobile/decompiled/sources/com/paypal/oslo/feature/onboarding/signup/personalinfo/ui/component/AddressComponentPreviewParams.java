package com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0012\u001a\u00020\u00068\u0007¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/personalinfo/ui/component/AddressComponentPreviewParams;", "", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/AddressComponentConfig;", "p0", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "p1", "", "p2", "<init>", "(Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/AddressComponentConfig;Lcom/paypal/oslo/core/i18n/domain/model/Address;Z)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/onboarding/steps/struct/domain/model/AddressComponentConfig;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* data */ class AddressComponentPreviewParams {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final com.paypal.oslo.feature.onboarding.steps.struct.domain.model.AddressComponentConfig getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final com.paypal.oslo.core.i18n.domain.model.Address Camera2StreamConfigurationMap;

    public AddressComponentPreviewParams(com.paypal.oslo.feature.onboarding.steps.struct.domain.model.AddressComponentConfig addressComponentConfig, com.paypal.oslo.core.i18n.domain.model.Address address, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressComponentConfig, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        this.getHighSpeedVideoFpsRangesFor = addressComponentConfig;
        this.Camera2StreamConfigurationMap = address;
        this.getHighSpeedVideoFpsRanges = z;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.onboarding.steps.struct.domain.model.AddressComponentConfig addressComponentConfig = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.core.i18n.domain.model.Address address = this.Camera2StreamConfigurationMap;
        boolean z = this.getHighSpeedVideoFpsRanges;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressComponentPreviewParams(getHighSpeedVideoFpsRangesFor=");
        sb.append(addressComponentConfig);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(address);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + this.Camera2StreamConfigurationMap.hashCode()) * 31) + java.lang.Boolean.hashCode(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component.AddressComponentPreviewParams)) {
            return false;
        }
        com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component.AddressComponentPreviewParams addressComponentPreviewParams = (com.paypal.oslo.feature.onboarding.signup.personalinfo.ui.component.AddressComponentPreviewParams) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, addressComponentPreviewParams.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, addressComponentPreviewParams.Camera2StreamConfigurationMap) && this.getHighSpeedVideoFpsRanges == addressComponentPreviewParams.getHighSpeedVideoFpsRanges;
    }
}
