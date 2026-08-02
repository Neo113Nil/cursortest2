package com.payair.logic.managers;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0004J \u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/payair/logic/managers/PushManager;", "", "", "generateCSDKPushToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateMdesPushToken", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Lcom/payair/model/PushTokenType;", "type", "Lcom/payair/model/Response;", "updateFirebaseToken", "(Ljava/lang/String;Lcom/payair/model/PushTokenType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface PushManager {
    java.lang.Object generateCSDKPushToken(kotlin.coroutines.Continuation<? super java.lang.String> continuation);

    java.lang.Object generateMdesPushToken(kotlin.coroutines.Continuation<? super java.lang.String> continuation);

    java.lang.Object updateFirebaseToken(java.lang.String str, com.payair.model.PushTokenType pushTokenType, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);
}
