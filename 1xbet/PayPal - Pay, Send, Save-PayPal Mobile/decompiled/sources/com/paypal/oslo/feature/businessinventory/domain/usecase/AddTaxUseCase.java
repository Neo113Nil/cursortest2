package com.paypal.oslo.feature.businessinventory.domain.usecase;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/domain/usecase/AddTaxUseCase;", "", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryTaxesRepository;", "taxesRepository", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryUpdatesEventBus;", "eventBus", "<init>", "(Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryTaxesRepository;Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryUpdatesEventBus;)V", "", "label", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Larrow/core/Either;", "", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "invoke", "(Ljava/lang/String;DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryTaxesRepository;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/businessinventory/domain/repository/BusinessInventoryUpdatesEventBus;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AddTaxUseCase {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus getHighSpeedVideoSizes;

    @javax.inject.Inject
    public AddTaxUseCase(com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository businessInventoryTaxesRepository, com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus businessInventoryUpdatesEventBus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryTaxesRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(businessInventoryUpdatesEventBus, "");
        this.getHighSpeedVideoFpsRanges = businessInventoryTaxesRepository;
        this.getHighSpeedVideoSizes = businessInventoryUpdatesEventBus;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r10 != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(java.lang.String str, double d, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Throwable, com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption>> continuation) {
        com.paypal.oslo.feature.businessinventory.domain.usecase.AddTaxUseCase$invoke$1 addTaxUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.businessinventory.domain.usecase.AddTaxUseCase$invoke$1) {
            addTaxUseCase$invoke$1 = (com.paypal.oslo.feature.businessinventory.domain.usecase.AddTaxUseCase$invoke$1) continuation;
            if ((addTaxUseCase$invoke$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                addTaxUseCase$invoke$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = addTaxUseCase$invoke$1.getOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = addTaxUseCase$invoke$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryTaxesRepository businessInventoryTaxesRepository = this.getHighSpeedVideoFpsRanges;
                    addTaxUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    addTaxUseCase$invoke$1.Camera2StreamConfigurationMap = d;
                    addTaxUseCase$invoke$1.getOutputFormats = 1;
                    obj = businessInventoryTaxesRepository.addTax(str, d, addTaxUseCase$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = addTaxUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i3 = addTaxUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        int i4 = addTaxUseCase$invoke$1.getHighSpeedVideoSizes;
                        double d2 = addTaxUseCase$invoke$1.Camera2StreamConfigurationMap;
                        arrow.core.Either either2 = (arrow.core.Either) addTaxUseCase$invoke$1.getInputFormats;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return either2;
                    }
                    d = addTaxUseCase$invoke$1.Camera2StreamConfigurationMap;
                    str = (java.lang.String) addTaxUseCase$invoke$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either.isRight()) {
                    com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption = (com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.oslo.feature.businessinventory.domain.repository.BusinessInventoryUpdatesEventBus businessInventoryUpdatesEventBus = this.getHighSpeedVideoSizes;
                    com.paypal.oslo.feature.businessinventory.api.domain.model.TaxInventoryUpdate.TaxAdded taxAdded = com.paypal.oslo.feature.businessinventory.api.domain.model.TaxInventoryUpdate.TaxAdded.INSTANCE;
                    addTaxUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(str);
                    addTaxUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    addTaxUseCase$invoke$1.getInputFormats = either;
                    addTaxUseCase$invoke$1.getOutputMinFrameDuration = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    addTaxUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(taxOption);
                    addTaxUseCase$invoke$1.Camera2StreamConfigurationMap = d;
                    addTaxUseCase$invoke$1.getHighSpeedVideoSizes = 0;
                    addTaxUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                    addTaxUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    addTaxUseCase$invoke$1.getOutputFormats = 2;
                    if (businessInventoryUpdatesEventBus.publish(taxAdded, addTaxUseCase$invoke$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return either;
            }
        }
        addTaxUseCase$invoke$1 = new com.paypal.oslo.feature.businessinventory.domain.usecase.AddTaxUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = addTaxUseCase$invoke$1.getOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = addTaxUseCase$invoke$1.getOutputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either.isRight()) {
        }
        return either;
    }
}
