package com.payair.logic.managers;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014H¦@¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001b\u0010\u0006"}, d2 = {"Lcom/payair/logic/managers/ConfigurationManager;", "", "", "assetId", "Lcom/payair/model/Response;", "fetchTAC", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/payair/model/CardScheme;", "scheme", "getAsset", "(Ljava/lang/String;Lcom/payair/model/CardScheme;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getSdkKeyValidity", "()J", "Lcom/payair/listener/ClientListener;", "clientListener", "", "setClientListener", "(Lcom/payair/listener/ClientListener;)V", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Lcom/payair/model/PushTokenType;", "type", "updateFirebaseToken", "(Ljava/lang/String;Lcom/payair/model/PushTokenType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.android.threeds.utils.NetworkUtil.JWT, "updateJWT", "(Ljava/lang/String;)Lcom/payair/model/Response;", "updateUnlockKeys"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface ConfigurationManager {
    java.lang.Object fetchTAC(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    java.lang.Object getAsset(java.lang.String str, com.payair.model.CardScheme cardScheme, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    long getSdkKeyValidity();

    void setClientListener(com.payair.listener.ClientListener clientListener);

    java.lang.Object updateFirebaseToken(java.lang.String str, com.payair.model.PushTokenType pushTokenType, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    com.payair.model.Response updateJWT(java.lang.String jwt);

    java.lang.Object updateUnlockKeys(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);
}
