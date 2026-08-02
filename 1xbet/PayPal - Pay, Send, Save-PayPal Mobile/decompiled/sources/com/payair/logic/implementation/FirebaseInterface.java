package com.payair.logic.implementation;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0004"}, d2 = {"Lcom/payair/logic/implementation/FirebaseInterface;", "", "", "generateCSDKPushToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "generateMdesPushToken"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface FirebaseInterface {
    java.lang.Object generateCSDKPushToken(kotlin.coroutines.Continuation<? super java.lang.String> continuation);

    java.lang.Object generateMdesPushToken(kotlin.coroutines.Continuation<? super java.lang.String> continuation);
}
