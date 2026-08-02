package com.paypal.oslo.feature.businesscustomers.domain.usecase;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/domain/usecase/GetCustomersUpdatesUseCase;", "", "Lcom/paypal/oslo/feature/businesscustomers/domain/repository/CustomersUpdatesEventBus;", "eventsBus", "<init>", "(Lcom/paypal/oslo/feature/businesscustomers/domain/repository/CustomersUpdatesEventBus;)V", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/paypal/oslo/feature/businesscustomers/domain/model/CustomersUpdate;", "invoke", "()Lkotlinx/coroutines/flow/SharedFlow;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/businesscustomers/domain/repository/CustomersUpdatesEventBus;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GetCustomersUpdatesUseCase {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public GetCustomersUpdatesUseCase(com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus customersUpdatesEventBus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customersUpdatesEventBus, "");
        this.getHighSpeedVideoFpsRangesFor = customersUpdatesEventBus;
    }

    public final kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate> invoke() {
        return this.getHighSpeedVideoFpsRangesFor.getEventsFlow();
    }
}
