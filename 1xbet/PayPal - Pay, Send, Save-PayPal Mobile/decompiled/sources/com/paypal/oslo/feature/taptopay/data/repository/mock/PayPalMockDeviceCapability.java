package com.paypal.oslo.feature.taptopay.data.repository.mock;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/taptopay/data/repository/mock/PayPalMockDeviceCapability;", "Lcom/paypal/oslo/feature/taptopay/api/domain/capability/TapToPayDeviceCapability;", "<init>", "()V", "", "isNFCSupported", "()Z", "isDeviceScreenLockEnabled", "isNFCEnabled"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PayPalMockDeviceCapability implements com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability
    public final boolean isDeviceScreenLockEnabled() {
        return true;
    }

    @Override // com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability
    public final boolean isNFCEnabled() {
        return true;
    }

    @Override // com.paypal.oslo.feature.taptopay.api.domain.capability.TapToPayDeviceCapability
    public final boolean isNFCSupported() {
        return true;
    }

    @javax.inject.Inject
    public PayPalMockDeviceCapability() {
    }
}
