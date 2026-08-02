package com.paypal.oslo.feature.cashin.domain.repository;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00060\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u000b\u0010\fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cashin/domain/repository/LocationRepository;", "", "Lcom/paypal/oslo/feature/cashin/domain/model/CashInStore;", "getUserLocation", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "", "getLocations", "()Lkotlinx/coroutines/flow/Flow;", "", "id", "getLocationById", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LocationRepository {
    java.lang.Object getLocationById(java.lang.String str, kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.domain.model.CashInStore> continuation);

    kotlinx.coroutines.flow.Flow<java.util.List<com.paypal.oslo.feature.cashin.domain.model.CashInStore>> getLocations();

    java.lang.Object getUserLocation(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.cashin.domain.model.CashInStore> continuation);
}
