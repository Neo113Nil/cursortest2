package com.paypal.oslo.feature.businessinventory.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/usecase/DeleteTaxUseCase;", "", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryTaxesRepository;", "repository", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryUpdatesEventBus;", "businessInventoryUpdatesEventBus", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryTaxesRepository;Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryUpdatesEventBus;)V", "", "taxId", "Larrow/core/Either;", "", "", "invoke", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryTaxesRepository;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryUpdatesEventBus;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeleteTaxUseCase {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public DeleteTaxUseCase(com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository businessInventoryTaxesRepository, com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus businessInventoryUpdatesEventBus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryTaxesRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryUpdatesEventBus, "");
        this.getHighSpeedVideoFpsRanges = businessInventoryTaxesRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = businessInventoryUpdatesEventBus;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r8 != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Throwable, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteTaxUseCase$invoke$1 deleteTaxUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteTaxUseCase$invoke$1) {
            deleteTaxUseCase$invoke$1 = (com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteTaxUseCase$invoke$1) continuation;
            if ((deleteTaxUseCase$invoke$1.getInputFormats & Integer.MIN_VALUE) != 0) {
                deleteTaxUseCase$invoke$1.getInputFormats -= 2147483648;
                java.lang.Object obj = deleteTaxUseCase$invoke$1.getInputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = deleteTaxUseCase$invoke$1.getInputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository businessInventoryTaxesRepository = this.getHighSpeedVideoFpsRanges;
                    deleteTaxUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    deleteTaxUseCase$invoke$1.getInputFormats = 1;
                    obj = businessInventoryTaxesRepository.deleteTax(str, deleteTaxUseCase$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = deleteTaxUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        int i3 = deleteTaxUseCase$invoke$1.getHighSpeedVideoSizes;
                        int i4 = deleteTaxUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                        arrow.core.Either either2 = (arrow.core.Either) deleteTaxUseCase$invoke$1.getOutputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return either2;
                    }
                    str = (java.lang.String) deleteTaxUseCase$invoke$1.Camera2StreamConfigurationMap;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either.isRight()) {
                    kotlin.Unit unit = (kotlin.Unit) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus businessInventoryUpdatesEventBus = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.businessinventory.api.domain.model.TaxInventoryUpdate.TaxDeleted taxDeleted = com.paypal.oslo.feature.businessinventory.api.domain.model.TaxInventoryUpdate.TaxDeleted.INSTANCE;
                    deleteTaxUseCase$invoke$1.Camera2StreamConfigurationMap = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    deleteTaxUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    deleteTaxUseCase$invoke$1.getOutputFormats = either;
                    deleteTaxUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    deleteTaxUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(unit);
                    deleteTaxUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = 0;
                    deleteTaxUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                    deleteTaxUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                    deleteTaxUseCase$invoke$1.getInputFormats = 2;
                    if (businessInventoryUpdatesEventBus.publish(taxDeleted, deleteTaxUseCase$invoke$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return either;
            }
        }
        deleteTaxUseCase$invoke$1 = new com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteTaxUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = deleteTaxUseCase$invoke$1.getInputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = deleteTaxUseCase$invoke$1.getInputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either.isRight()) {
        }
        return either;
    }
}
