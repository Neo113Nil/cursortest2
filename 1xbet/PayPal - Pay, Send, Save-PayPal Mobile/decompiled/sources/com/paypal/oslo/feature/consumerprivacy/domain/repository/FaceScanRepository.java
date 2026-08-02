package com.paypal.oslo.feature.consumerprivacy.domain.repository;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002H¦@¢\u0006\u0004\b\b\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/consumerprivacy/domain/repository/FaceScanRepository;", "", "Larrow/core/Ior;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/FaceScanError;", "Lcom/paypal/oslo/feature/consumerprivacy/domain/model/FaceScanStatus;", "getFaceScanStatus", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "deleteFaceScan"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface FaceScanRepository {
    java.lang.Object deleteFaceScan(kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanError, kotlin.Unit>> continuation);

    java.lang.Object getFaceScanStatus(kotlin.coroutines.Continuation<? super arrow.core.Ior<com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanError, com.paypal.oslo.feature.consumerprivacy.domain.model.FaceScanStatus>> continuation);
}
