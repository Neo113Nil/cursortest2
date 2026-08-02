package com.paypal.oslo.feature.businesscustomers.data.repository;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/data/repository/CustomersUpdatesEventBusImpl;", "Lcom/paypal/oslo/feature/businesscustomers/domain/repository/CustomersUpdatesEventBus;", "<init>", "()V", "Lcom/paypal/oslo/feature/businesscustomers/domain/model/CustomersUpdate;", "event", "", "publish", "(Lcom/paypal/oslo/feature/businesscustomers/domain/model/CustomersUpdate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getEventsFlow", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomersUpdatesEventBusImpl implements com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus {
    public static final com.paypal.oslo.feature.businesscustomers.data.repository.CustomersUpdatesEventBusImpl INSTANCE = new com.paypal.oslo.feature.businesscustomers.data.repository.CustomersUpdatesEventBusImpl();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private static final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate> getHighSpeedVideoSizes = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 7, null);
    public static final int $stable = 8;

    private CustomersUpdatesEventBusImpl() {
    }

    @Override // com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus
    public final java.lang.Object publish(com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate customersUpdate, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object emit = getHighSpeedVideoSizes.emit(customersUpdate, continuation);
        return emit == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emit : kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.businesscustomers.domain.repository.CustomersUpdatesEventBus
    public final kotlinx.coroutines.flow.MutableSharedFlow<com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate> getEventsFlow() {
        return getHighSpeedVideoSizes;
    }
}
