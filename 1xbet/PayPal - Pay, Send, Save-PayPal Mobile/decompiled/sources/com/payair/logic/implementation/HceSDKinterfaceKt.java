package com.payair.logic.implementation;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/payair/hce/ErrorModel;", "Lcom/payair/model/NetworkError;", "toNetworkError", "(Lcom/payair/hce/ErrorModel;)Lcom/payair/model/NetworkError;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HceSDKinterfaceKt {
    public static final com.payair.model.NetworkError toNetworkError(com.payair.hce.ErrorModel errorModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorModel, "");
        return new com.payair.model.NetworkError(errorModel.getErrorCode(), errorModel.getReasonCode(), errorModel.getDescription());
    }
}
