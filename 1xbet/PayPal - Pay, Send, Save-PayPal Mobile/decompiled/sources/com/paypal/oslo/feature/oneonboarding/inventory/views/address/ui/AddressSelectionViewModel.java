package com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ/\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00100\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u00102\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/inventory/views/address/ui/AddressSelectionViewModel;", "Landroidx/lifecycle/ViewModel;", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;", "formatAddressUseCase", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "Lcom/paypal/oslo/core/i18n/domain/model/Address$Style;", com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, "Lkotlinx/coroutines/flow/Flow;", "", "formatAddress", "(Lcom/paypal/oslo/core/i18n/domain/model/Address;Lcom/paypal/oslo/core/i18n/domain/model/Address$Style;)Lkotlinx/coroutines/flow/Flow;", "", "addresses", "formatAddresses", "(Ljava/util/List;Lcom/paypal/oslo/core/i18n/domain/model/Address$Style;)Lkotlinx/coroutines/flow/Flow;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/i18n/domain/usecase/FormatAddressUseCase;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/CoroutineDispatcher;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AddressSelectionViewModel extends androidx.view.ViewModel {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.CoroutineDispatcher getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public AddressSelectionViewModel(com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatAddressUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcher, "");
        this.Camera2StreamConfigurationMap = formatAddressUseCase;
        this.getHighSpeedVideoFpsRangesFor = coroutineDispatcher;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$formatSingleAddress(com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel addressSelectionViewModel, com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.core.i18n.domain.model.Address.Style style, kotlin.coroutines.Continuation continuation) {
        com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel$formatSingleAddress$1 addressSelectionViewModel$formatSingleAddress$1;
        int i;
        com.paypal.oslo.core.i18n.domain.model.Address m11247copye42MVwM;
        com.paypal.oslo.core.i18n.domain.model.Address address2;
        com.paypal.oslo.core.i18n.domain.model.Address.Style style2;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel$formatSingleAddress$1) {
            addressSelectionViewModel$formatSingleAddress$1 = (com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel$formatSingleAddress$1) continuation;
            if ((addressSelectionViewModel$formatSingleAddress$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                addressSelectionViewModel$formatSingleAddress$1.getHighSpeedVideoFpsRanges -= 2147483648;
                java.lang.Object obj = addressSelectionViewModel$formatSingleAddress$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = addressSelectionViewModel$formatSingleAddress$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase = addressSelectionViewModel.Camera2StreamConfigurationMap;
                    m11247copye42MVwM = address.m11247copye42MVwM((r22 & 1) != 0 ? address.addressLine1 : null, (r22 & 2) != 0 ? address.addressLine2 : null, (r22 & 4) != 0 ? address.addressLine3 : null, (r22 & 8) != 0 ? address.adminArea4 : null, (r22 & 16) != 0 ? address.adminArea3 : null, (r22 & 32) != 0 ? address.adminArea2 : null, (r22 & 64) != 0 ? address.adminArea1 : null, (r22 & 128) != 0 ? address.postalCode : null, (r22 & 256) != 0 ? address.countryCode : null, (r22 & 512) != 0 ? address.detail : null);
                    com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration = new com.paypal.oslo.core.i18n.domain.model.AddressConfiguration(null, null, null, null, style, null, null, 111, null);
                    addressSelectionViewModel$formatSingleAddress$1.getHighResolutionOutputSizeshNQ4ISI = address;
                    addressSelectionViewModel$formatSingleAddress$1.Camera2StreamConfigurationMap = style;
                    addressSelectionViewModel$formatSingleAddress$1.getHighSpeedVideoFpsRanges = 1;
                    obj = formatAddressUseCase.invoke(m11247copye42MVwM, addressConfiguration, addressSelectionViewModel$formatSingleAddress$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    address2 = address;
                    style2 = style;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    style2 = (com.paypal.oslo.core.i18n.domain.model.Address.Style) addressSelectionViewModel$formatSingleAddress$1.Camera2StreamConfigurationMap;
                    address2 = (com.paypal.oslo.core.i18n.domain.model.Address) addressSelectionViewModel$formatSingleAddress$1.getHighResolutionOutputSizeshNQ4ISI;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either instanceof arrow.core.Either.Left) {
                    if (either instanceof arrow.core.Either.Right) {
                        return ((arrow.core.Either.Right) either).getValue();
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                com.paypal.oslo.core.i18n.domain.model.AddressFormattingError addressFormattingError = (com.paypal.oslo.core.i18n.domain.model.AddressFormattingError) ((arrow.core.Either.Left) either).getValue();
                com.paypal.android.logger.Logger logger = com.paypal.oslo.feature.oneonboarding.LoggerKt.log;
                kotlin.Pair[] pairArr = new kotlin.Pair[3];
                pairArr[0] = kotlin.TuplesKt.to(com.adobe.marketing.mobile.messaging.MessagingConstants.ContentCard.UIKeys.STYLE, style2.name());
                java.lang.String m11255getCountryCodeiSWX8ZM = address2.m11255getCountryCodeiSWX8ZM();
                if (m11255getCountryCodeiSWX8ZM == null) {
                    m11255getCountryCodeiSWX8ZM = null;
                }
                if (m11255getCountryCodeiSWX8ZM == null) {
                    m11255getCountryCodeiSWX8ZM = "";
                }
                pairArr[1] = kotlin.TuplesKt.to("countryCode", m11255getCountryCodeiSWX8ZM);
                pairArr[2] = kotlin.TuplesKt.to("error", addressFormattingError.getDescription());
                com.paypal.android.logger.Logger.w$default(logger, "Address formatting failed", kotlin.collections.MapsKt.mapOf(pairArr), null, 4, null);
                return "";
            }
        }
        addressSelectionViewModel$formatSingleAddress$1 = new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel$formatSingleAddress$1(addressSelectionViewModel, continuation);
        java.lang.Object obj2 = addressSelectionViewModel$formatSingleAddress$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = addressSelectionViewModel$formatSingleAddress$1.getHighSpeedVideoFpsRanges;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either instanceof arrow.core.Either.Left) {
        }
    }

    public /* synthetic */ AddressSelectionViewModel(com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(formatAddressUseCase, (i & 2) != 0 ? kotlinx.coroutines.Dispatchers.getDefault() : coroutineDispatcher);
    }

    public final kotlinx.coroutines.flow.Flow<java.lang.String> formatAddress(com.paypal.oslo.core.i18n.domain.model.Address address, com.paypal.oslo.core.i18n.domain.model.Address.Style style) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "");
        return kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel$formatAddress$1(this, address, style, null)), this.getHighSpeedVideoFpsRangesFor);
    }

    public final kotlinx.coroutines.flow.Flow<java.util.List<java.lang.String>> formatAddresses(java.util.List<com.paypal.oslo.core.i18n.domain.model.Address> addresses, com.paypal.oslo.core.i18n.domain.model.Address.Style style) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addresses, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(style, "");
        return kotlinx.coroutines.flow.FlowKt.flowOn(kotlinx.coroutines.flow.FlowKt.flow(new com.paypal.oslo.feature.oneonboarding.inventory.views.address.ui.AddressSelectionViewModel$formatAddresses$1(addresses, this, style, null)), this.getHighSpeedVideoFpsRangesFor);
    }
}
