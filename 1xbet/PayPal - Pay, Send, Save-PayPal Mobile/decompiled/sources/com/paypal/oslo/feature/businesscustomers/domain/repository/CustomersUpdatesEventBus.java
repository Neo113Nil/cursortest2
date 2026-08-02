package com.paypal.oslo.feature.businesscustomers.domain.repository;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/domain/repository/CustomersUpdatesEventBus;", "", "Lcom/paypal/oslo/feature/businesscustomers/domain/model/CustomersUpdate;", "event", "", "publish", "(Lcom/paypal/oslo/feature/businesscustomers/domain/model/CustomersUpdate;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventsFlow", "()Lkotlinx/coroutines/flow/SharedFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface CustomersUpdatesEventBus {
    kotlinx.coroutines.flow.SharedFlow<com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate> getEventsFlow();

    java.lang.Object publish(com.paypal.oslo.feature.businesscustomers.domain.model.CustomersUpdate customersUpdate, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
