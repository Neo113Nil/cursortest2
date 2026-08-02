package com.paypal.oslo.feature.identity.storage;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004H¦@¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0004H&¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\fH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\fH¦@¢\u0006\u0004\b\u000f\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0010\u0010\bJ\u0018\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H¦@¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0011H¦@¢\u0006\u0004\b\u0015\u0010\bJ\u0010\u0010\u0016\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0016\u0010\bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "", "Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "saveUserAccessToken", "(Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserAccessToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearUserAccessToken", "clearUserAccessTokenSilently", "()V", "", "saveClientAccessToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getClientAccessToken", "clearClientAccessToken", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "intent", "saveAuthIntent", "(Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAuthIntent", "clearAuthIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface IdentityTokenStorage {
    java.lang.Object clearAuthIntent(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object clearClientAccessToken(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object clearUserAccessToken(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    void clearUserAccessTokenSilently();

    java.lang.Object getAuthIntent(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.domain.model.AuthIntent> continuation);

    java.lang.Object getClientAccessToken(kotlin.coroutines.Continuation<? super java.lang.String> continuation);

    java.lang.Object getUserAccessToken(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData> continuation);

    java.lang.Object saveAuthIntent(com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object saveClientAccessToken(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object saveUserAccessToken(com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
