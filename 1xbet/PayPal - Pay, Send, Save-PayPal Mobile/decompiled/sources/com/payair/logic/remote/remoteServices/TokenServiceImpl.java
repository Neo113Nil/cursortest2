package com.payair.logic.remote.remoteServices;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000e\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0010\u0010\u000bJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0012\u0010\u000b"}, d2 = {"Lcom/payair/logic/remote/remoteServices/TokenServiceImpl;", "Lcom/payair/logic/remote/remoteServices/TokenService;", "Lcom/payair/logic/implementation/HceSDKInterface;", "hceSDKInterface", "<init>", "(Lcom/payair/logic/implementation/HceSDKInterface;)V", "", "paymentAppInstanceId", "networkTokenReference", "Lcom/payair/logic/remote/model/TokenDetailsDto;", "getTokenDetailsAsync", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cardReference", "Lcom/payair/logic/remote/model/TokensListDto;", "getTokenList", "Lcom/payair/logic/remote/model/TokensCardReferenceDto;", "getTokensCardReference", "Lcom/payair/logic/remote/model/ResponseGetAuthenticationMethodsDto;", "getAuthenticationMethods"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TokenServiceImpl implements com.payair.logic.remote.remoteServices.TokenService {

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.logic.implementation.HceSDKInterface f4467a;

    public TokenServiceImpl(com.payair.logic.implementation.HceSDKInterface hceSDKInterface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSDKInterface, "");
        this.f4467a = hceSDKInterface;
    }

    @Override // com.payair.logic.remote.remoteServices.TokenService
    public final java.lang.Object getAuthenticationMethods(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.logic.remote.model.ResponseGetAuthenticationMethodsDto> continuation) {
        com.payair.logic.remote.ConnectionService.Companion companion = com.payair.logic.remote.ConnectionService.INSTANCE;
        com.payair.logic.remote.ConnectionService.Builder builder = new com.payair.logic.remote.ConnectionService.Builder(com.payair.logic.remote.model.ResponseGetAuthenticationMethodsDto.class, this.f4467a);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("/devices/");
        sb.append(str);
        sb.append("/tokens/");
        sb.append(str2);
        sb.append("/authenticationMethods");
        return builder.endpoint(sb.toString()).method(com.payair.logic.remote.HTTPmethod.GET).sendRequest();
    }

    @Override // com.payair.logic.remote.remoteServices.TokenService
    public final java.lang.Object getTokenDetailsAsync(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.logic.remote.model.TokenDetailsDto> continuation) {
        com.payair.logic.remote.ConnectionService.Companion companion = com.payair.logic.remote.ConnectionService.INSTANCE;
        com.payair.logic.remote.ConnectionService.Builder builder = new com.payair.logic.remote.ConnectionService.Builder(com.payair.logic.remote.model.TokenDetailsDto.class, this.f4467a);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("/devices/");
        sb.append(str);
        sb.append("/tokens/");
        sb.append(str2);
        return builder.endpoint(sb.toString()).method(com.payair.logic.remote.HTTPmethod.GET).sendRequest();
    }

    @Override // com.payair.logic.remote.remoteServices.TokenService
    public final java.lang.Object getTokenList(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.logic.remote.model.TokensListDto> continuation) {
        com.payair.logic.remote.ConnectionService.Companion companion = com.payair.logic.remote.ConnectionService.INSTANCE;
        com.payair.logic.remote.ConnectionService.Builder builder = new com.payair.logic.remote.ConnectionService.Builder(com.payair.logic.remote.model.TokensListDto.class, this.f4467a);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("/devices/");
        sb.append(str);
        sb.append("/tokens?issuerPanReference=");
        sb.append(str2);
        return builder.endpoint(sb.toString()).method(com.payair.logic.remote.HTTPmethod.GET).sendRequest();
    }

    @Override // com.payair.logic.remote.remoteServices.TokenService
    public final java.lang.Object getTokensCardReference(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.logic.remote.model.TokensCardReferenceDto> continuation) {
        com.payair.logic.remote.ConnectionService.Companion companion = com.payair.logic.remote.ConnectionService.INSTANCE;
        com.payair.logic.remote.ConnectionService.Builder builder = new com.payair.logic.remote.ConnectionService.Builder(com.payair.logic.remote.model.TokensCardReferenceDto.class, this.f4467a);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("/devices/");
        sb.append(str);
        sb.append("/tokens/");
        sb.append(str2);
        sb.append("/issuerPanRef");
        return builder.endpoint(sb.toString()).method(com.payair.logic.remote.HTTPmethod.GET).sendRequest();
    }
}
