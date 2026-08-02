package com.payair.logic.remote.remoteServices;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/payair/logic/remote/remoteServices/TransactionHistoryServiceImpl;", "Lcom/payair/logic/remote/remoteServices/TransactionHistoryService;", "Lcom/payair/logic/implementation/HceSDKInterface;", "hceSDKInterface", "<init>", "(Lcom/payair/logic/implementation/HceSDKInterface;)V", "", "paymentAppInstanceId", "networkTokenReference", "", "transactionsFromTimestamp", "Lcom/payair/logic/remote/model/ResponseTransactionHistoryDto;", "getTransactionHistory", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TransactionHistoryServiceImpl implements com.payair.logic.remote.remoteServices.TransactionHistoryService {

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.logic.implementation.HceSDKInterface f4468a;

    public TransactionHistoryServiceImpl(com.payair.logic.implementation.HceSDKInterface hceSDKInterface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSDKInterface, "");
        this.f4468a = hceSDKInterface;
    }

    @Override // com.payair.logic.remote.remoteServices.TransactionHistoryService
    public final java.lang.Object getTransactionHistory(java.lang.String str, java.lang.String str2, java.lang.Long l, kotlin.coroutines.Continuation<? super com.payair.logic.remote.model.ResponseTransactionHistoryDto> continuation) {
        java.lang.String format;
        com.payair.logic.remote.ConnectionService.Companion companion = com.payair.logic.remote.ConnectionService.INSTANCE;
        com.payair.logic.remote.ConnectionService.Builder builder = new com.payair.logic.remote.ConnectionService.Builder(com.payair.logic.remote.model.ResponseTransactionHistoryDto.class, this.f4468a);
        if (l != null) {
            format = java.lang.String.format(com.payair.logic.remote.remoteServices.Endpoints.GET_HISTORY_WITH_TIMESTAMP, java.util.Arrays.copyOf(new java.lang.Object[]{str, str2, l}, 3));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        } else {
            format = java.lang.String.format(com.payair.logic.remote.remoteServices.Endpoints.GET_HISTORY, java.util.Arrays.copyOf(new java.lang.Object[]{str, str2}, 2));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        }
        return builder.endpoint(format).method(com.payair.logic.remote.HTTPmethod.GET).sendRequest();
    }
}
