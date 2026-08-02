package com.paypal.oslo.feature.debitcard.servicing.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/SaveAddressUseCase;", "Lcom/paypal/oslo/feature/debitcard/shared/domain/usecase/UseCase;", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/SaveAddressRequest;", "", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/repository/AddressRepository;", "repository", "<init>", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/repository/AddressRepository;)V", "request", "Lcom/paypal/oslo/feature/debitcard/shared/domain/model/UseCaseResult;", "invoke", "(Lcom/paypal/oslo/feature/debitcard/servicing/domain/usecase/SaveAddressRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/debitcard/servicing/domain/repository/AddressRepository;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SaveAddressUseCase implements com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase<com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressRequest, kotlin.Unit> {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.debitcard.servicing.domain.repository.AddressRepository getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public SaveAddressUseCase(com.paypal.oslo.feature.debitcard.servicing.domain.repository.AddressRepository addressRepository) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(addressRepository, "");
        this.getHighSpeedVideoFpsRangesFor = addressRepository;
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressRequest saveAddressRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<? extends kotlin.Unit>> continuation) {
        return invoke2(saveAddressRequest, (kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<kotlin.Unit>>) continuation);
    }

    @Override // com.paypal.oslo.feature.debitcard.shared.domain.usecase.UseCase
    public final /* bridge */ <T> com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<kotlin.Unit> toUseCaseResult(arrow.core.Ior<? extends com.paypal.oslo.feature.debitcard.shared.domain.model.DataResultError, ? extends T> ior, kotlin.jvm.functions.Function1<? super T, kotlin.Unit> function1) {
        return super.toUseCaseResult(ior, function1);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke2(com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressRequest saveAddressRequest, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.debitcard.shared.domain.model.UseCaseResult<kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase$invoke$1 saveAddressUseCase$invoke$1;
        int i;
        com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase saveAddressUseCase;
        if (continuation instanceof com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase$invoke$1) {
            saveAddressUseCase$invoke$1 = (com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase$invoke$1) continuation;
            if ((saveAddressUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                saveAddressUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = saveAddressUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = saveAddressUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.debitcard.servicing.domain.repository.AddressRepository addressRepository = this.getHighSpeedVideoFpsRangesFor;
                    java.lang.String debitInstrumentId = saveAddressRequest.getDebitInstrumentId();
                    com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress address = saveAddressRequest.getAddress();
                    saveAddressUseCase$invoke$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(saveAddressRequest);
                    saveAddressUseCase$invoke$1.getHighSpeedVideoSizes = this;
                    saveAddressUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = addressRepository.saveAddress(debitInstrumentId, address, saveAddressUseCase$invoke$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    saveAddressUseCase = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    saveAddressUseCase = (com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase) saveAddressUseCase$invoke$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return saveAddressUseCase.toUseCaseResult((arrow.core.Ior) obj, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj2) {
                        return com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase.$r8$lambda$L3spADXoOsOdPSWHhmUVIefZ7qk((kotlin.Unit) obj2);
                    }
                });
            }
        }
        saveAddressUseCase$invoke$1 = new com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = saveAddressUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = saveAddressUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        return saveAddressUseCase.toUseCaseResult((arrow.core.Ior) obj2, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj22) {
                return com.paypal.oslo.feature.debitcard.servicing.domain.usecase.SaveAddressUseCase.$r8$lambda$L3spADXoOsOdPSWHhmUVIefZ7qk((kotlin.Unit) obj22);
            }
        });
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$L3spADXoOsOdPSWHhmUVIefZ7qk(kotlin.Unit unit) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(unit, "");
        return kotlin.Unit.INSTANCE;
    }
}
