package com.paypal.oslo.feature.dataprivacy.domain.model;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureRequest;", "", "isPending", "(Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureRequest;)Z"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErasureRequestKt {
    public static final boolean isPending(com.paypal.oslo.feature.dataprivacy.domain.model.ErasureRequest erasureRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(erasureRequest, "");
        return com.paypal.oslo.feature.dataprivacy.domain.model.ErasureStatus.INSTANCE.getPendingStatuses().contains(erasureRequest.getStatus());
    }
}
