package com.paypal.oslo.feature.businesscustomers.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\r\u001a\u0012\u0012\b\u0012\u00060\u000bj\u0002`\f\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/CreateCustomerUseCase;", "", "Lcom/paypal/oslo/feature/businesscustomers/domain/repository/CustomersRepository;", "customersRepository", "Lcom/paypal/oslo/feature/businesscustomers/domain/repository/CustomersUpdatesEventBus;", "customersUpdatesEventBus", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/domain/repository/CustomersRepository;Lcom/paypal/oslo/feature/businesscustomers/domain/repository/CustomersUpdatesEventBus;)V", "Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;", "customer", "Larrow/core/Either;", "Ljava/lang/Exception;", "Lkotlin/getHighResolutionOutputSizeshNQ4ISI;", "invoke", "(Lcom/paypal/oslo/feature/businesscustomers/api/domain/model/Customer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/businesscustomers/domain/repository/CustomersRepository;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/businesscustomers/domain/repository/CustomersUpdatesEventBus;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CreateCustomerUseCase {
    public static final int $stable = 0;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public CreateCustomerUseCase(com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository customersRepository, com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus customersUpdatesEventBus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customersRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customersUpdatesEventBus, "");
        this.Camera2StreamConfigurationMap = customersRepository;
        this.getHighSpeedVideoFpsRanges = customersUpdatesEventBus;
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
    public final java.lang.Object invoke(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends java.lang.Exception, com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer>> continuation) {
        com.paypal.oslo.feature.businesscustomers.domain.usecase.CreateCustomerUseCase$invoke$1 createCustomerUseCase$invoke$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.feature.businesscustomers.domain.usecase.CreateCustomerUseCase$invoke$1) {
            createCustomerUseCase$invoke$1 = (com.paypal.oslo.feature.businesscustomers.domain.usecase.CreateCustomerUseCase$invoke$1) continuation;
            if ((createCustomerUseCase$invoke$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                createCustomerUseCase$invoke$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = createCustomerUseCase$invoke$1.getOutputMinFrameDuration;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = createCustomerUseCase$invoke$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersRepository customersRepository = this.Camera2StreamConfigurationMap;
                    createCustomerUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customer);
                    createCustomerUseCase$invoke$1.getOutputFormats = 1;
                    obj = customersRepository.createCustomer(customer, createCustomerUseCase$invoke$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = createCustomerUseCase$invoke$1.Camera2StreamConfigurationMap;
                        int i3 = createCustomerUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i4 = createCustomerUseCase$invoke$1.getHighSpeedVideoFpsRanges;
                        arrow.core.Either either2 = (arrow.core.Either) createCustomerUseCase$invoke$1.getHighSpeedVideoSizesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return either2;
                    }
                    customer = (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) createCustomerUseCase$invoke$1.getHighSpeedVideoSizes;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (either.isRight()) {
                    com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer2 = (com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer) ((arrow.core.Either.Right) either).getValue();
                    com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus customersUpdatesEventBus = this.getHighSpeedVideoFpsRanges;
                    com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerAdded customerAdded = new com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate.CustomerAdded(customer2);
                    createCustomerUseCase$invoke$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customer);
                    createCustomerUseCase$invoke$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    createCustomerUseCase$invoke$1.getHighSpeedVideoSizesFor = either;
                    createCustomerUseCase$invoke$1.getInputSizeshNQ4ISI = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                    createCustomerUseCase$invoke$1.getInputFormats = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(customer2);
                    createCustomerUseCase$invoke$1.getHighSpeedVideoFpsRanges = 0;
                    createCustomerUseCase$invoke$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                    createCustomerUseCase$invoke$1.Camera2StreamConfigurationMap = 0;
                    createCustomerUseCase$invoke$1.getOutputFormats = 2;
                    if (customersUpdatesEventBus.publish(customerAdded, createCustomerUseCase$invoke$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return either;
            }
        }
        createCustomerUseCase$invoke$1 = new com.paypal.oslo.feature.businesscustomers.domain.usecase.CreateCustomerUseCase$invoke$1(this, continuation);
        java.lang.Object obj2 = createCustomerUseCase$invoke$1.getOutputMinFrameDuration;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = createCustomerUseCase$invoke$1.getOutputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (either.isRight()) {
        }
        return either;
    }
}
