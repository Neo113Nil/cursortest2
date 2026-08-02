package com.payair.logic.remote.repositories;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J2\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\t\u0010\nJ1\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0002H&¢\u0006\u0004\b\u0014\u0010\u0013JC\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001d\u0010\u001eJ0\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001d\u0010$J+\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b'\u0010(J(\u0010\u001d\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010)\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001d\u0010(J\u001f\u0010,\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H&¢\u0006\u0004\b,\u0010-\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Lcom/payair/logic/remote/repositories/HceRemoteRepository;", "", "", "paymentAppInstanceId", "tokenizationId", "", "termsAndConditionsAcceptedAt", "panEnrollmentId", "Lcom/payair/model/Response;", "completeTokenization", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "networkTokenReference", "Lcom/payair/model/ReasonCode;", "reasonCode", "reason", "deleteToken", "(Ljava/lang/String;Ljava/lang/String;Lcom/payair/model/ReasonCode;Ljava/lang/String;)Lcom/payair/model/Response;", "authenticationMethodId", "request3dsUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payair/model/Response;", "requestActivationCode", "authenticationCode", "tav", "threeDSecureAuthenticationValue", "sendAuthenticationCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payair/model/Response;", "Lcom/payair/model/CardData;", "cardData", "issuerId", "startTokenization", "(Ljava/lang/String;Lcom/payair/model/CardData;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/payair/model/EncryptedCardForTokenization;", "encryptedCardForTokenization", "Lcom/payair/model/CardScheme;", "scheme", "consumerEntryMode", "(Ljava/lang/String;Lcom/payair/model/EncryptedCardForTokenization;Lcom/payair/model/CardScheme;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/payair/model/PushAccountReceipt;", "pushAccountReceipt", "startTokenization-UF1who8", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cardReference", "Lcom/payair/model/StartTokenizeAllCardsRequestData;", "startTokenizeAllCardsRequestData", "startTokenizeAllCards", "(Ljava/lang/String;Lcom/payair/model/StartTokenizeAllCardsRequestData;)Lcom/payair/model/Response;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface HceRemoteRepository {

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ com.payair.model.Response sendAuthenticationCode$default(com.payair.logic.remote.repositories.HceRemoteRepository hceRemoteRepository, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
            if (obj == null) {
                return hceRemoteRepository.sendAuthenticationCode(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
            }
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendAuthenticationCode");
        }
    }

    java.lang.Object completeTokenization(java.lang.String str, java.lang.String str2, long j, java.lang.String str3, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    com.payair.model.Response deleteToken(java.lang.String paymentAppInstanceId, java.lang.String networkTokenReference, com.payair.model.ReasonCode reasonCode, java.lang.String reason);

    com.payair.model.Response request3dsUrl(java.lang.String paymentAppInstanceId, java.lang.String networkTokenReference, java.lang.String authenticationMethodId);

    com.payair.model.Response requestActivationCode(java.lang.String paymentAppInstanceId, java.lang.String networkTokenReference, java.lang.String authenticationMethodId);

    com.payair.model.Response sendAuthenticationCode(java.lang.String paymentAppInstanceId, java.lang.String networkTokenReference, java.lang.String authenticationCode, java.lang.String tav, java.lang.String threeDSecureAuthenticationValue);

    java.lang.Object startTokenization(java.lang.String str, com.payair.model.CardData cardData, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    java.lang.Object startTokenization(java.lang.String str, com.payair.model.EncryptedCardForTokenization encryptedCardForTokenization, com.payair.model.CardScheme cardScheme, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    java.lang.Object startTokenization(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    /* renamed from: startTokenization-UF1who8, reason: not valid java name */
    java.lang.Object mo10972startTokenizationUF1who8(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    com.payair.model.Response startTokenizeAllCards(java.lang.String paymentAppInstanceId, com.payair.model.StartTokenizeAllCardsRequestData startTokenizeAllCardsRequestData);
}
