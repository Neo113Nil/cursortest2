package com.paypal.oslo.feature.userprofile.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J>\u0010\u000e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u00060\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/userprofile/domain/usecase/GetAddressLayoutUseCase;", "", "Lcom/paypal/oslo/core/i18n/domain/interfaces/AddressHandler;", "addressHandler", "<init>", "(Lcom/paypal/oslo/core/i18n/domain/interfaces/AddressHandler;)V", "", "countryCode", "Ljava/util/Locale;", "locale", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "Lkotlin/Pair;", "Lcom/paypal/oslo/core/i18n/domain/model/AddressLayout;", "invoke", "(Ljava/lang/String;Ljava/util/Locale;Lcom/paypal/oslo/core/i18n/domain/model/Address;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/i18n/domain/interfaces/AddressHandler;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class GetAddressLayoutUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.i18n.domain.interfaces.AddressHandler getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public GetAddressLayoutUseCase(com.paypal.oslo.core.i18n.domain.interfaces.AddressHandler addressHandler) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressHandler, "");
        this.getHighSpeedVideoFpsRanges = addressHandler;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, java.util.Locale locale, com.paypal.oslo.core.i18n.domain.model.Address address, kotlin.coroutines.Continuation<? super kotlin.Pair<com.paypal.oslo.core.i18n.domain.model.AddressLayout, java.lang.String>> continuation) {
        com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressLayoutUseCase$invoke$1 getAddressLayoutUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressLayoutUseCase$invoke$1) {
            getAddressLayoutUseCase$invoke$1 = (com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressLayoutUseCase$invoke$1) continuation;
            if ((getAddressLayoutUseCase$invoke$1.getHighSpeedVideoFpsRangesFor & Integer.MIN_VALUE) != 0) {
                getAddressLayoutUseCase$invoke$1.getHighSpeedVideoFpsRangesFor -= 2147483648;
                java.lang.Object obj = getAddressLayoutUseCase$invoke$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getAddressLayoutUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.core.i18n.domain.model.AddressConfiguration addressConfiguration = new com.paypal.oslo.core.i18n.domain.model.AddressConfiguration(null, null, locale, str, com.paypal.oslo.core.i18n.domain.model.Address.Style.MULTILINE, com.paypal.oslo.core.i18n.domain.model.Address.Resolution.LOW, null, 67, null);
                    com.paypal.oslo.core.i18n.domain.interfaces.AddressHandler addressHandler = this.getHighSpeedVideoFpsRanges;
                    getAddressLayoutUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    getAddressLayoutUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(locale);
                    getAddressLayoutUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(address);
                    getAddressLayoutUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addressConfiguration);
                    getAddressLayoutUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 1;
                    obj = addressHandler.getLayout(address, addressConfiguration, getAddressLayoutUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return kotlin.TuplesKt.to((com.paypal.oslo.core.i18n.domain.model.AddressLayout) ((arrow.core.Either.Right) either).getValue(), null);
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.core.i18n.domain.model.AddressFormattingError addressFormattingError = (com.paypal.oslo.core.i18n.domain.model.AddressFormattingError) ((arrow.core.Either.Left) either).getValue();
                    java.lang.String simpleName = addressFormattingError.getClass().getSimpleName();
                    java.lang.String description = addressFormattingError.getDescription();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Error: ");
                    sb.append(simpleName);
                    sb.append(" - ");
                    sb.append(description);
                    return kotlin.TuplesKt.to(null, sb.toString());
                }
                throw new kotlin.NoWhenBranchMatchedException();
            }
        }
        getAddressLayoutUseCase$invoke$1 = new com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressLayoutUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = getAddressLayoutUseCase$invoke$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getAddressLayoutUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressLayoutUseCase getAddressLayoutUseCase, java.lang.String str, java.util.Locale locale, com.paypal.oslo.core.i18n.domain.model.Address address, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            locale = java.util.Locale.US;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "");
        }
        if ((i & 4) != 0) {
            address = null;
        }
        return getAddressLayoutUseCase.invoke(str, locale, address, continuation);
    }
}
