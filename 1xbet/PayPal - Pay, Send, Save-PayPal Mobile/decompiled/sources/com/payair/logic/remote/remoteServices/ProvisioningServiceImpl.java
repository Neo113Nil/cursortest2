package com.payair.logic.remote.remoteServices;

@kotlin.Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000b\u0010\u000eJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020#2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b\u000b\u0010&J1\u0010*\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'2\b\u0010)\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010/\u001a\u00020.2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b/\u00100J7\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u00102\u001a\u0002012\u0006\u0010%\u001a\u00020$2\u0006\u00103\u001a\u00020\u00062\u0006\u00104\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u00105"}, d2 = {"Lcom/payair/logic/remote/remoteServices/ProvisioningServiceImpl;", "Lcom/payair/logic/remote/remoteServices/ProvisioningService;", "Lcom/payair/logic/implementation/HceSDKInterface;", "hceSDKInterface", "<init>", "(Lcom/payair/logic/implementation/HceSDKInterface;)V", "", "paymentAppInstanceId", "Lcom/payair/logic/remote/model/RequestStartTokenizeDto;", "startTokenizeRequest", "Lcom/payair/logic/remote/model/ResponseStartTokenizeDto;", "startTokenize", "(Ljava/lang/String;Lcom/payair/logic/remote/model/RequestStartTokenizeDto;)Lcom/payair/logic/remote/model/ResponseStartTokenizeDto;", "Lcom/payair/logic/remote/model/RequestStartTokenizePushReceipt;", "(Ljava/lang/String;Lcom/payair/logic/remote/model/RequestStartTokenizePushReceipt;)Lcom/payair/logic/remote/model/ResponseStartTokenizeDto;", "tokenizationId", "Lcom/payair/logic/remote/model/RequestCompleteTokenizeDto;", "requestCompleteTokenizeDto", "Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto;", "completeTokenize", "(Ljava/lang/String;Ljava/lang/String;Lcom/payair/logic/remote/model/RequestCompleteTokenizeDto;)Lcom/payair/logic/remote/model/ResponseCompleteTokenizeDto;", "networkTokenReference", "Lcom/payair/logic/remote/model/RequestAuthenticationCodeDto;", "requestAuthenticationCodeRequest", "Lcom/payair/hce/communication/JsonResponse;", "requestActivationCode", "(Ljava/lang/String;Ljava/lang/String;Lcom/payair/logic/remote/model/RequestAuthenticationCodeDto;)Lcom/payair/hce/communication/JsonResponse;", "Lcom/payair/logic/remote/model/SendAuthenticationCodeDto;", "sendAuthenticationCodeRequest", "Lcom/payair/logic/remote/model/ResponseSendAuthenticationCodeDto;", "sendAuthenticationCode", "(Ljava/lang/String;Ljava/lang/String;Lcom/payair/logic/remote/model/SendAuthenticationCodeDto;)Lcom/payair/logic/remote/model/ResponseSendAuthenticationCodeDto;", "Lcom/payair/logic/remote/model/ResponseGetCSDKPKCertificateDto;", "getCsdkCertificate", "()Lcom/payair/logic/remote/model/ResponseGetCSDKPKCertificateDto;", "Lcom/payair/logic/remote/model/RequestStartTokenizeCardDataDto;", "Lcom/payair/model/CardScheme;", "scheme", "(Ljava/lang/String;Lcom/payair/logic/remote/model/RequestStartTokenizeCardDataDto;Lcom/payair/model/CardScheme;)Lcom/payair/logic/remote/model/ResponseStartTokenizeDto;", "Lcom/payair/model/ReasonCode;", "reasonCode", "reason", "deleteToken", "(Ljava/lang/String;Ljava/lang/String;Lcom/payair/model/ReasonCode;Ljava/lang/String;)Lcom/payair/hce/communication/JsonResponse;", "Lcom/payair/logic/remote/model/RequestStartTokenizeAllCardsDto;", "startTokenizeAllCardsRequest", "Lcom/payair/logic/remote/model/ResponseStartTokenizeAllCardsDto;", "startTokenizeAllCards", "(Ljava/lang/String;Lcom/payair/logic/remote/model/RequestStartTokenizeAllCardsDto;)Lcom/payair/logic/remote/model/ResponseStartTokenizeAllCardsDto;", "Lcom/payair/model/EncryptedCardForTokenization;", "cardForTokenization", "locale", "consumerEntryMode", "(Ljava/lang/String;Lcom/payair/model/EncryptedCardForTokenization;Lcom/payair/model/CardScheme;Ljava/lang/String;Ljava/lang/String;)Lcom/payair/logic/remote/model/ResponseStartTokenizeDto;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProvisioningServiceImpl implements com.payair.logic.remote.remoteServices.ProvisioningService {

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.logic.implementation.HceSDKInterface f4466a;

    public ProvisioningServiceImpl(com.payair.logic.implementation.HceSDKInterface hceSDKInterface) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSDKInterface, "");
        this.f4466a = hceSDKInterface;
    }

    @Override // com.payair.logic.remote.remoteServices.ProvisioningService
    public final com.payair.logic.remote.model.ResponseCompleteTokenizeDto completeTokenize(java.lang.String paymentAppInstanceId, java.lang.String tokenizationId, com.payair.logic.remote.model.RequestCompleteTokenizeDto requestCompleteTokenizeDto) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAppInstanceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenizationId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestCompleteTokenizeDto, "");
        com.payair.logic.remote.ConnectionService.Companion companion = com.payair.logic.remote.ConnectionService.INSTANCE;
        com.payair.logic.remote.ConnectionService.Builder builder = new com.payair.logic.remote.ConnectionService.Builder(com.payair.logic.remote.model.ResponseCompleteTokenizeDto.class, this.f4466a);
        java.lang.String format = java.lang.String.format(com.payair.logic.remote.remoteServices.Endpoints.COMPLETE_TOKENIZE, java.util.Arrays.copyOf(new java.lang.Object[]{paymentAppInstanceId, tokenizationId}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return (com.payair.logic.remote.model.ResponseCompleteTokenizeDto) builder.endpoint(format).payload(requestCompleteTokenizeDto).method(com.payair.logic.remote.HTTPmethod.PUT).sendRequest();
    }

    @Override // com.payair.logic.remote.remoteServices.ProvisioningService
    public final com.payair.hce.communication.JsonResponse deleteToken(java.lang.String paymentAppInstanceId, java.lang.String networkTokenReference, com.payair.model.ReasonCode reasonCode, java.lang.String reason) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAppInstanceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reasonCode, "");
        com.payair.logic.remote.ConnectionService.Companion companion = com.payair.logic.remote.ConnectionService.INSTANCE;
        com.payair.logic.remote.ConnectionService.Builder builder = new com.payair.logic.remote.ConnectionService.Builder(com.payair.hce.communication.JsonResponse.class, this.f4466a);
        java.lang.String value = reasonCode.getValue();
        if (reason == null) {
            reason = "";
        }
        java.lang.String format = java.lang.String.format(com.payair.logic.remote.remoteServices.Endpoints.DELETE_TOKEN, java.util.Arrays.copyOf(new java.lang.Object[]{paymentAppInstanceId, networkTokenReference, value, reason}, 4));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return builder.endpoint(format).method(com.payair.logic.remote.HTTPmethod.DELETE).sendRequest();
    }

    @Override // com.payair.logic.remote.remoteServices.ProvisioningService
    public final com.payair.logic.remote.model.ResponseGetCSDKPKCertificateDto getCsdkCertificate() {
        com.payair.logic.remote.ConnectionService.Companion companion = com.payair.logic.remote.ConnectionService.INSTANCE;
        return (com.payair.logic.remote.model.ResponseGetCSDKPKCertificateDto) new com.payair.logic.remote.ConnectionService.Builder(com.payair.logic.remote.model.ResponseGetCSDKPKCertificateDto.class, this.f4466a).endpoint(com.payair.logic.remote.remoteServices.Endpoints.GET_CSDK_CERTIFICATE).method(com.payair.logic.remote.HTTPmethod.GET).sendRequest();
    }

    @Override // com.payair.logic.remote.remoteServices.ProvisioningService
    public final com.payair.hce.communication.JsonResponse requestActivationCode(java.lang.String paymentAppInstanceId, java.lang.String networkTokenReference, com.payair.logic.remote.model.RequestAuthenticationCodeDto requestAuthenticationCodeRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAppInstanceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(requestAuthenticationCodeRequest, "");
        com.payair.logic.remote.ConnectionService.Companion companion = com.payair.logic.remote.ConnectionService.INSTANCE;
        com.payair.logic.remote.ConnectionService.Builder builder = new com.payair.logic.remote.ConnectionService.Builder(com.payair.hce.communication.JsonResponse.class, this.f4466a);
        java.lang.String format = java.lang.String.format(com.payair.logic.remote.remoteServices.Endpoints.AUTHENTICATION_CODE, java.util.Arrays.copyOf(new java.lang.Object[]{paymentAppInstanceId, networkTokenReference}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return builder.endpoint(format).payload(requestAuthenticationCodeRequest).method(com.payair.logic.remote.HTTPmethod.POST).sendRequest();
    }

    @Override // com.payair.logic.remote.remoteServices.ProvisioningService
    public final com.payair.logic.remote.model.ResponseSendAuthenticationCodeDto sendAuthenticationCode(java.lang.String paymentAppInstanceId, java.lang.String networkTokenReference, com.payair.logic.remote.model.SendAuthenticationCodeDto sendAuthenticationCodeRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAppInstanceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sendAuthenticationCodeRequest, "");
        com.payair.logic.remote.ConnectionService.Companion companion = com.payair.logic.remote.ConnectionService.INSTANCE;
        com.payair.logic.remote.ConnectionService.Builder builder = new com.payair.logic.remote.ConnectionService.Builder(com.payair.logic.remote.model.ResponseSendAuthenticationCodeDto.class, this.f4466a);
        java.lang.String format = java.lang.String.format(com.payair.logic.remote.remoteServices.Endpoints.SEND_AUTHENTICATION_CODE, java.util.Arrays.copyOf(new java.lang.Object[]{paymentAppInstanceId, networkTokenReference}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return (com.payair.logic.remote.model.ResponseSendAuthenticationCodeDto) builder.endpoint(format).payload(sendAuthenticationCodeRequest).method(com.payair.logic.remote.HTTPmethod.POST).sendRequest();
    }

    @Override // com.payair.logic.remote.remoteServices.ProvisioningService
    public final com.payair.logic.remote.model.ResponseStartTokenizeDto startTokenize(java.lang.String paymentAppInstanceId, com.payair.logic.remote.model.RequestStartTokenizeDto startTokenizeRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAppInstanceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startTokenizeRequest, "");
        com.payair.logic.remote.ConnectionService.Companion companion = com.payair.logic.remote.ConnectionService.INSTANCE;
        com.payair.logic.remote.ConnectionService.Builder builder = new com.payair.logic.remote.ConnectionService.Builder(com.payair.logic.remote.model.ResponseStartTokenizeDto.class, this.f4466a);
        java.lang.String format = java.lang.String.format(com.payair.logic.remote.remoteServices.Endpoints.START_TOKENIZE, java.util.Arrays.copyOf(new java.lang.Object[]{paymentAppInstanceId, com.payair.model.CardScheme.MASTERCARD.getValue()}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return (com.payair.logic.remote.model.ResponseStartTokenizeDto) builder.endpoint(format).payload(startTokenizeRequest).method(com.payair.logic.remote.HTTPmethod.POST).sendRequest();
    }

    @Override // com.payair.logic.remote.remoteServices.ProvisioningService
    public final com.payair.logic.remote.model.ResponseStartTokenizeAllCardsDto startTokenizeAllCards(java.lang.String paymentAppInstanceId, com.payair.logic.remote.model.RequestStartTokenizeAllCardsDto startTokenizeAllCardsRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAppInstanceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startTokenizeAllCardsRequest, "");
        com.payair.logic.remote.ConnectionService.Companion companion = com.payair.logic.remote.ConnectionService.INSTANCE;
        com.payair.logic.remote.ConnectionService.Builder builder = new com.payair.logic.remote.ConnectionService.Builder(com.payair.logic.remote.model.ResponseStartTokenizeAllCardsDto.class, this.f4466a);
        java.lang.String format = java.lang.String.format(com.payair.logic.remote.remoteServices.Endpoints.START_TOKENIZE_ALL_CARDS, java.util.Arrays.copyOf(new java.lang.Object[]{paymentAppInstanceId}, 1));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return (com.payair.logic.remote.model.ResponseStartTokenizeAllCardsDto) builder.endpoint(format).method(com.payair.logic.remote.HTTPmethod.POST).payload(startTokenizeAllCardsRequest).sendRequest();
    }

    @Override // com.payair.logic.remote.remoteServices.ProvisioningService
    public final com.payair.logic.remote.model.ResponseStartTokenizeDto startTokenize(java.lang.String paymentAppInstanceId, com.payair.logic.remote.model.RequestStartTokenizePushReceipt startTokenizeRequest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAppInstanceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startTokenizeRequest, "");
        com.payair.logic.remote.ConnectionService.Companion companion = com.payair.logic.remote.ConnectionService.INSTANCE;
        com.payair.logic.remote.ConnectionService.Builder builder = new com.payair.logic.remote.ConnectionService.Builder(com.payair.logic.remote.model.ResponseStartTokenizeDto.class, this.f4466a);
        java.lang.String format = java.lang.String.format(com.payair.logic.remote.remoteServices.Endpoints.START_TOKENIZE, java.util.Arrays.copyOf(new java.lang.Object[]{paymentAppInstanceId, com.payair.model.CardScheme.MASTERCARD.getValue()}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return (com.payair.logic.remote.model.ResponseStartTokenizeDto) builder.endpoint(format).payload(startTokenizeRequest).method(com.payair.logic.remote.HTTPmethod.POST).sendRequest();
    }

    @Override // com.payair.logic.remote.remoteServices.ProvisioningService
    public final com.payair.logic.remote.model.ResponseStartTokenizeDto startTokenize(java.lang.String paymentAppInstanceId, com.payair.logic.remote.model.RequestStartTokenizeCardDataDto startTokenizeRequest, com.payair.model.CardScheme scheme) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAppInstanceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startTokenizeRequest, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "");
        com.payair.logic.remote.ConnectionService.Companion companion = com.payair.logic.remote.ConnectionService.INSTANCE;
        com.payair.logic.remote.ConnectionService.Builder builder = new com.payair.logic.remote.ConnectionService.Builder(com.payair.logic.remote.model.ResponseStartTokenizeDto.class, this.f4466a);
        java.lang.String format = java.lang.String.format(com.payair.logic.remote.remoteServices.Endpoints.START_TOKENIZE, java.util.Arrays.copyOf(new java.lang.Object[]{paymentAppInstanceId, scheme.getValue()}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return (com.payair.logic.remote.model.ResponseStartTokenizeDto) builder.endpoint(format).payload(startTokenizeRequest).method(com.payair.logic.remote.HTTPmethod.POST).sendRequest();
    }

    @Override // com.payair.logic.remote.remoteServices.ProvisioningService
    public final com.payair.logic.remote.model.ResponseStartTokenizeDto startTokenize(java.lang.String paymentAppInstanceId, com.payair.model.EncryptedCardForTokenization cardForTokenization, com.payair.model.CardScheme scheme, java.lang.String locale, java.lang.String consumerEntryMode) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAppInstanceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardForTokenization, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(scheme, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(consumerEntryMode, "");
        com.payair.logic.remote.ConnectionService.Companion companion = com.payair.logic.remote.ConnectionService.INSTANCE;
        com.payair.logic.remote.ConnectionService.Builder builder = new com.payair.logic.remote.ConnectionService.Builder(com.payair.logic.remote.model.ResponseStartTokenizeDto.class, this.f4466a);
        java.lang.String format = java.lang.String.format(com.payair.logic.remote.remoteServices.Endpoints.START_TOKENIZE, java.util.Arrays.copyOf(new java.lang.Object[]{paymentAppInstanceId, scheme}, 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
        return (com.payair.logic.remote.model.ResponseStartTokenizeDto) builder.endpoint(format).payload(new com.payair.logic.remote.model.RequestStartTokenizeCardDataDto(new com.payair.logic.remote.model.EncryptedCard("RSA", cardForTokenization.getEncryptedCard()), cardForTokenization.getIssuerId(), locale, consumerEntryMode)).method(com.payair.logic.remote.HTTPmethod.POST).sendRequest();
    }
}
