package com.payair.logic.remote.remoteServices;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@¢\u0006\u0004\b\t\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H¦@¢\u0006\u0004\b\f\u0010\u0007J \u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000e\u0010\u0007"}, d2 = {"Lcom/payair/logic/remote/remoteServices/TokenService;", "", "", "paymentAppInstanceId", "networkTokenReference", "Lcom/payair/logic/remote/model/ResponseGetAuthenticationMethodsDto;", "getAuthenticationMethods", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/payair/logic/remote/model/TokenDetailsDto;", "getTokenDetailsAsync", "cardReference", "Lcom/payair/logic/remote/model/TokensListDto;", "getTokenList", "Lcom/payair/logic/remote/model/TokensCardReferenceDto;", "getTokensCardReference"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TokenService {
    java.lang.Object getAuthenticationMethods(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.logic.remote.model.ResponseGetAuthenticationMethodsDto> continuation);

    java.lang.Object getTokenDetailsAsync(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.logic.remote.model.TokenDetailsDto> continuation);

    java.lang.Object getTokenList(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.logic.remote.model.TokensListDto> continuation);

    java.lang.Object getTokensCardReference(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.logic.remote.model.TokensCardReferenceDto> continuation);
}
