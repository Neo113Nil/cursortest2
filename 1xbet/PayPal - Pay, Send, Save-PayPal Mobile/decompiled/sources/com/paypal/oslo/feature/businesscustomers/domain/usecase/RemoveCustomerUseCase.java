package com.paypal.oslo.feature.businesscustomers.domain.usecase;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000e\u001a\u0012\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\r0\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/RemoveCustomerUseCase;", "", "Lcom/paypal/oslo/feature/businesscustomers/domain/repository/CustomersRepository;", "customersRepository", "Lcom/paypal/oslo/feature/businesscustomers/domain/repository/CustomersUpdatesEventBus;", "customersUpdatesEventBus", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/domain/repository/CustomersRepository;Lcom/paypal/oslo/feature/businesscustomers/domain/repository/CustomersUpdatesEventBus;)V", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "customer", "Larrow/core/Either;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "", "invoke", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/businesscustomers/domain/repository/CustomersRepository;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/businesscustomers/domain/repository/CustomersUpdatesEventBus;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RemoveCustomerUseCase {
    public static final int $stable = 0;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository getHighSpeedVideoSizes;

    @javax.inject.Inject
    public RemoveCustomerUseCase(com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository customersRepository, com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus customersUpdatesEventBus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customersRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customersUpdatesEventBus, "");
        this.getHighSpeedVideoSizes = customersRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = customersUpdatesEventBus;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r8 != r1) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invoke(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, kotlin.Unit>> continuation) {
        com.paypal.oslo.feature.businesscustomers.domain.usecase.RemoveCustomerUseCase$invoke$1 removeCustomerUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.businesscustomers.domain.usecase.RemoveCustomerUseCase$invoke$1) {
            removeCustomerUseCase$invoke$1 = (com.paypal.oslo.feature.businesscustomers.domain.usecase.RemoveCustomerUseCase$invoke$1) continuation;
            if ((removeCustomerUseCase$invoke$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                removeCustomerUseCase$invoke$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = removeCustomerUseCase$invoke$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = removeCustomerUseCase$invoke$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository customersRepository = this.getHighSpeedVideoSizes;
                    removeCustomerUseCase$invoke$1.getHighSpeedVideoSizes = customer;
                    removeCustomerUseCase$invoke$1.getOutputFormats = 1;
                    obj = customersRepository.removeCustomer(customer, removeCustomerUseCase$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = removeCustomerUseCase$invoke$1.Camera2StreamConfigurationMap;
                        int i3 = removeCustomerUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        int i4 = removeCustomerUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        arrow.core.Either either2 = (arrow.core.Either) removeCustomerUseCase$invoke$1.getOutputMinFrameDuration;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return either2;
                    }
                    customer = (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) removeCustomerUseCase$invoke$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either.isRight()) {
                    kotlin.Unit unit = (kotlin.Unit) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus customersUpdatesEventBus = this.getHighResolutionOutputSizeshNQ4ISI;
                    com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerRemoved customerRemoved = new com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerRemoved(customer);
                    removeCustomerUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customer);
                    removeCustomerUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    removeCustomerUseCase$invoke$1.getOutputMinFrameDuration = either;
                    removeCustomerUseCase$invoke$1.getHighSpeedVideoSizesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    removeCustomerUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(unit);
                    removeCustomerUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    removeCustomerUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                    removeCustomerUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                    removeCustomerUseCase$invoke$1.getOutputFormats = 2;
                    if (customersUpdatesEventBus.publish(customerRemoved, removeCustomerUseCase$invoke$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return either;
            }
        }
        removeCustomerUseCase$invoke$1 = new com.paypal.oslo.feature.businesscustomers.domain.usecase.RemoveCustomerUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = removeCustomerUseCase$invoke$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = removeCustomerUseCase$invoke$1.getOutputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either.isRight()) {
        }
        return either;
    }
}
