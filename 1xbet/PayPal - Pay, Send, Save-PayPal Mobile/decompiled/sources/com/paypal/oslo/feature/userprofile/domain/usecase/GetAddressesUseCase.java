package com.paypal.oslo.feature.userprofile.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00070\u0006H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/usecase/GetAddressesUseCase;", "", "Lcom/paypal/oslo/feature/userprofile/domain/repository/AddressRepository;", "addressRepository", "<init>", "(Lcom/paypal/oslo/feature/userprofile/domain/repository/AddressRepository;)V", "Lkotlinx/coroutines/flow/Flow;", "Lcom/paypal/oslo/feature/userprofile/domain/model/DataResult;", "", "Lcom/paypal/oslo/feature/userprofile/domain/ProfileDataItem;", "Lcom/paypal/oslo/core/userstore/model/ProfileAddress;", "invoke", "()Lkotlinx/coroutines/flow/Flow;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/userprofile/domain/repository/AddressRepository;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetAddressesUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.userprofile.domain.repository.AddressRepository getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public GetAddressesUseCase(com.paypal.oslo.feature.userprofile.domain.repository.AddressRepository addressRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressRepository, "");
        this.getHighSpeedVideoFpsRanges = addressRepository;
    }

    public final kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.userprofile.domain.model.DataResult<java.util.List<com.paypal.oslo.feature.userprofile.domain.ProfileDataItem<com.paypal.oslo.core.userstore.model.ProfileAddress>>>> invoke() {
        return this.getHighSpeedVideoFpsRanges.getAddresses();
    }
}
