package com.payair.logic.remote.repositories;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/payair/logic/remote/repositories/PushRemoteRepositoryImpl;", "Lcom/payair/logic/remote/repositories/PushRemoteRepository;", "Lcom/payair/logic/implementation/HceSDKInterface;", "hceSDK", "<init>", "(Lcom/payair/logic/implementation/HceSDKInterface;)V", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Lcom/payair/model/PushTokenType;", "type", "Lcom/payair/model/Response;", "updateFirebaseToken", "(Ljava/lang/String;Lcom/payair/model/PushTokenType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PushRemoteRepositoryImpl implements com.payair.logic.remote.repositories.PushRemoteRepository {

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.logic.implementation.HceSDKInterface f4470a;

    public PushRemoteRepositoryImpl(com.payair.logic.implementation.HceSDKInterface hceSDKInterface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSDKInterface, "");
        this.f4470a = hceSDKInterface;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.List] */
    @Override // com.payair.logic.remote.repositories.PushRemoteRepository
    public final java.lang.Object updateFirebaseToken(java.lang.String str, com.payair.model.PushTokenType pushTokenType, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.model.Response error;
        java.lang.Integer statusCode;
        ?? emptyList;
        com.payair.hce.communication.JsonResponse updateFirebaseToken = this.f4470a.updateFirebaseToken(str, pushTokenType);
        if (updateFirebaseToken.isSuccessful()) {
            try {
                error = new com.payair.model.Response.Success(updateFirebaseToken);
            } catch (java.lang.ClassCastException unused) {
                error = new com.payair.model.Response.Error(101, null, 2, null);
            }
        } else {
            java.lang.Integer statusCode2 = updateFirebaseToken.getStatusCode();
            int i = 100;
            if ((statusCode2 == null || statusCode2.intValue() != 0) && updateFirebaseToken.getStatusCode() != null) {
                statusCode = updateFirebaseToken.getStatusCode();
            } else {
                java.lang.Integer statusCodeFromServer = updateFirebaseToken.getStatusCodeFromServer();
                statusCode = ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && updateFirebaseToken.getStatusCodeFromServer() != null) ? updateFirebaseToken.getStatusCodeFromServer() : kotlin.coroutines.jvm.internal.Boxing.boxInt(100);
            }
            if (statusCode != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
                i = statusCode.intValue();
            }
            java.util.List<com.payair.hce.ErrorModel> errors = updateFirebaseToken.getErrors();
            if (errors != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(errors);
                emptyList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(errors, 10));
                for (com.payair.hce.ErrorModel errorModel : errors) {
                    com.payair.csdk.w1.a(errorModel, errorModel, emptyList);
                }
            } else {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            error = new com.payair.model.Response.Error(i, emptyList);
        }
        return com.payair.model.ResponseKt.mapIfSuccess(error, com.payair.csdk.d2.f4242a);
    }
}
