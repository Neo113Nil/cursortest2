package com.paypal.oslo.feature.inappcheckout.domain.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0014\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/GetCardFormDataUseCase;", "", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/FormatSavedAddressesUseCase;", "formatSavedAddressesUseCase", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/CardFormDataRepository;", "cardFormDataRepository", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;", "appSwitchSession", "<init>", "(Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/FormatSavedAddressesUseCase;Lcom/paypal/oslo/feature/inappcheckout/domain/repository/CardFormDataRepository;Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;)V", "", "fiId", "Larrow/core/Either;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/NativeXOErrorEntity;", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardFormDataEntity;", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardFormDataEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/inappcheckout/domain/usecase/FormatSavedAddressesUseCase;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/inappcheckout/domain/repository/CardFormDataRepository;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/inappcheckout/features/session/AppSwitchSession;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GetCardFormDataUseCase {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.repository.CardFormDataRepository Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSavedAddressesUseCase getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetCardFormDataUseCase(com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSavedAddressesUseCase formatSavedAddressesUseCase, com.paypal.oslo.feature.inappcheckout.domain.repository.CardFormDataRepository cardFormDataRepository, com.paypal.oslo.feature.inappcheckout.features.session.AppSwitchSession appSwitchSession) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(formatSavedAddressesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardFormDataRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appSwitchSession, "");
        this.getHighSpeedVideoFpsRangesFor = formatSavedAddressesUseCase;
        this.Camera2StreamConfigurationMap = cardFormDataRepository;
        this.getHighSpeedVideoSizes = appSwitchSession;
    }

    public static /* synthetic */ java.lang.Object invoke$default(com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase getCardFormDataUseCase, java.lang.String str, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return getCardFormDataUseCase.invoke(str, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ad, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00c5, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        if (r8 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<com.paypal.oslo.feature.inappcheckout.domain.entity.NativeXOErrorEntity, com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity>> continuation) {
        com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase$invoke$1 getCardFormDataUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase$invoke$1) {
            getCardFormDataUseCase$invoke$1 = (com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase$invoke$1) continuation;
            if ((getCardFormDataUseCase$invoke$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                getCardFormDataUseCase$invoke$1.getInputFormats -= 2147483648;
                java.lang.Object obj = getCardFormDataUseCase$invoke$1.getOutputStallDurationlomOqCM;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getCardFormDataUseCase$invoke$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.inappcheckout.domain.repository.CardFormDataRepository cardFormDataRepository = this.Camera2StreamConfigurationMap;
                    java.lang.String checkoutTokenValueOrEmpty = this.getHighSpeedVideoSizes.getCheckoutTokenValueOrEmpty();
                    getCardFormDataUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    getCardFormDataUseCase$invoke$1.getInputFormats = 1;
                    obj = cardFormDataRepository.getCardFormData(checkoutTokenValueOrEmpty, str, getCardFormDataUseCase$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = getCardFormDataUseCase$invoke$1.getHighSpeedVideoSizes;
                        int i3 = getCardFormDataUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        int i4 = getCardFormDataUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        int i5 = getCardFormDataUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        java.lang.Object obj2 = getCardFormDataUseCase$invoke$1.getOutputMinFrameDuration;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return new arrow.core.Either.Right((com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity) obj);
                    }
                    str = (java.lang.String) getCardFormDataUseCase$invoke$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    java.lang.Object value = ((arrow.core.Either.Right) either).getValue();
                    com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormDataEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity) value;
                    getCardFormDataUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    getCardFormDataUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    getCardFormDataUseCase$invoke$1.getOutputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    getCardFormDataUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(value);
                    getCardFormDataUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(cardFormDataEntity);
                    getCardFormDataUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    getCardFormDataUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                    getCardFormDataUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                    getCardFormDataUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                    getCardFormDataUseCase$invoke$1.getInputFormats = 2;
                    obj = getHighResolutionOutputSizeshNQ4ISI(cardFormDataEntity, getCardFormDataUseCase$invoke$1);
                } else {
                    if (either instanceof arrow.core.Either.Left) {
                        return either;
                    }
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        }
        getCardFormDataUseCase$invoke$1 = new com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase$invoke$1(this, continuation);
        java.lang.Object obj3 = getCardFormDataUseCase$invoke$1.getOutputStallDurationlomOqCM;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getCardFormDataUseCase$invoke$1.getInputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj3;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormDataEntity, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity> continuation) {
        com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase$formatAddresses$1 getCardFormDataUseCase$formatAddresses$1;
        int i;
        if (continuation instanceof com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase$formatAddresses$1) {
            getCardFormDataUseCase$formatAddresses$1 = (com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase$formatAddresses$1) continuation;
            if ((getCardFormDataUseCase$formatAddresses$1.getHighSpeedVideoSizes & Integer.MIN_VALUE) != 0) {
                getCardFormDataUseCase$formatAddresses$1.getHighSpeedVideoSizes -= 2147483648;
                java.lang.Object obj = getCardFormDataUseCase$formatAddresses$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = getCardFormDataUseCase$formatAddresses$1.getHighSpeedVideoSizes;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress> addresses = cardFormDataEntity.getAddresses();
                    if (addresses == null) {
                        return cardFormDataEntity;
                    }
                    com.paypal.oslo.feature.inappcheckout.domain.usecase.FormatSavedAddressesUseCase formatSavedAddressesUseCase = this.getHighSpeedVideoFpsRangesFor;
                    getCardFormDataUseCase$formatAddresses$1.getHighSpeedVideoFpsRanges = cardFormDataEntity;
                    getCardFormDataUseCase$formatAddresses$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(addresses);
                    getCardFormDataUseCase$formatAddresses$1.getHighSpeedVideoSizes = 1;
                    obj = formatSavedAddressesUseCase.invoke(addresses, getCardFormDataUseCase$formatAddresses$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cardFormDataEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity) getCardFormDataUseCase$formatAddresses$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity.copy$default(cardFormDataEntity, null, (java.util.List) obj, null, 5, null);
            }
        }
        getCardFormDataUseCase$formatAddresses$1 = new com.paypal.oslo.feature.inappcheckout.domain.usecase.GetCardFormDataUseCase$formatAddresses$1(this, continuation);
        java.lang.Object obj2 = getCardFormDataUseCase$formatAddresses$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = getCardFormDataUseCase$formatAddresses$1.getHighSpeedVideoSizes;
        if (i != 0) {
        }
        return com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity.copy$default(cardFormDataEntity, null, (java.util.List) obj2, null, 5, null);
    }
}
