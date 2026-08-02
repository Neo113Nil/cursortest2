package com.payair.logic.remote.repositories;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/payair/logic/remote/repositories/TransactionHistoryRepositoryImpl;", "Lcom/payair/logic/remote/repositories/TransactionHistoryRepository;", "Lcom/payair/logic/remote/remoteServices/TransactionHistoryService;", "transactionHistoryService", "<init>", "(Lcom/payair/logic/remote/remoteServices/TransactionHistoryService;)V", "", "paymentAppInstanceId", "networkTokenReference", "", "transactionsFromTimestamp", "Lcom/payair/model/Response;", "getTransactionHistory", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TransactionHistoryRepositoryImpl implements com.payair.logic.remote.repositories.TransactionHistoryRepository {

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.logic.remote.remoteServices.TransactionHistoryService f4472a;

    public TransactionHistoryRepositoryImpl(com.payair.logic.remote.remoteServices.TransactionHistoryService transactionHistoryService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionHistoryService, "");
        this.f4472a = transactionHistoryService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.util.List] */
    @Override // com.payair.logic.remote.repositories.TransactionHistoryRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getTransactionHistory(java.lang.String str, java.lang.String str2, java.lang.Long l, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.csdk.y3 y3Var;
        int i;
        com.payair.hce.communication.JsonResponse jsonResponse;
        com.payair.model.Response error;
        java.lang.Integer statusCode;
        ?? emptyList;
        if (continuation instanceof com.payair.csdk.y3) {
            y3Var = (com.payair.csdk.y3) continuation;
            int i2 = y3Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y3Var.d = i2 - 2147483648;
                java.lang.Object obj = y3Var.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = y3Var.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.logic.remote.remoteServices.TransactionHistoryService transactionHistoryService = this.f4472a;
                    y3Var.f4340a = str2;
                    y3Var.d = 1;
                    obj = transactionHistoryService.getTransactionHistory(str, str2, l, y3Var);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = y3Var.f4340a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                jsonResponse = (com.payair.hce.communication.JsonResponse) obj;
                if (jsonResponse.isSuccessful()) {
                    java.lang.Integer statusCode2 = jsonResponse.getStatusCode();
                    int i3 = 100;
                    if ((statusCode2 == null || statusCode2.intValue() != 0) && jsonResponse.getStatusCode() != null) {
                        statusCode = jsonResponse.getStatusCode();
                    } else {
                        java.lang.Integer statusCodeFromServer = jsonResponse.getStatusCodeFromServer();
                        statusCode = ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && jsonResponse.getStatusCodeFromServer() != null) ? jsonResponse.getStatusCodeFromServer() : kotlin.coroutines.jvm.internal.Boxing.boxInt(100);
                    }
                    if (statusCode != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
                        i3 = statusCode.intValue();
                    }
                    java.util.List<com.payair.hce.ErrorModel> errors = jsonResponse.getErrors();
                    if (errors != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(errors);
                        emptyList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(errors, 10));
                        for (com.payair.hce.ErrorModel errorModel : errors) {
                            com.payair.csdk.w1.a(errorModel, errorModel, emptyList);
                        }
                    } else {
                        emptyList = kotlin.collections.CollectionsKt.emptyList();
                    }
                    error = new com.payair.model.Response.Error(i3, emptyList);
                } else {
                    try {
                        error = new com.payair.model.Response.Success((com.payair.logic.remote.model.ResponseTransactionHistoryDto) jsonResponse);
                    } catch (java.lang.ClassCastException unused) {
                        error = new com.payair.model.Response.Error(101, null, 2, null);
                    }
                }
                return com.payair.model.ResponseKt.mapIfSuccess(error, new com.payair.csdk.z3(str2));
            }
        }
        y3Var = new com.payair.csdk.y3(this, continuation);
        java.lang.Object obj2 = y3Var.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = y3Var.d;
        if (i != 0) {
        }
        jsonResponse = (com.payair.hce.communication.JsonResponse) obj2;
        if (jsonResponse.isSuccessful()) {
        }
        return com.payair.model.ResponseKt.mapIfSuccess(error, new com.payair.csdk.z3(str2));
    }
}
