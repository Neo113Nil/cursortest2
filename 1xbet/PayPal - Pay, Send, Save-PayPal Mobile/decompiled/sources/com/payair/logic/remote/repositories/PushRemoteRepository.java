package com.payair.logic.remote.repositories;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/payair/logic/remote/repositories/PushRemoteRepository;", "", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Lcom/payair/model/PushTokenType;", "type", "Lcom/payair/model/Response;", "updateFirebaseToken", "(Ljava/lang/String;Lcom/payair/model/PushTokenType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PushRemoteRepository {
    java.lang.Object updateFirebaseToken(java.lang.String str, com.payair.model.PushTokenType pushTokenType, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);
}
