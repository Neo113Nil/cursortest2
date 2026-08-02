package com.payair.logic.managers;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002H¦@¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0012\u001a\u00020\u0011H¦@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0019\u0010\u0010J$\u0010\u001a\u001a\u0004\u0018\u00010\u00142\u0006\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0011H¦@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH¦@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H¦@¢\u0006\u0004\b \u0010\u0018J\u0018\u0010\"\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0002H¦@¢\u0006\u0004\b\"\u0010\u0018J\u0018\u0010#\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H¦@¢\u0006\u0004\b#\u0010\u0018J\u001b\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u00130$H&¢\u0006\u0004\b%\u0010&J\u001e\u0010(\u001a\u00020\u00112\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH¦@¢\u0006\u0004\b(\u0010)J \u0010+\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0002H¦@¢\u0006\u0004\b+\u0010,J \u0010-\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010*\u001a\u00020\u0002H¦@¢\u0006\u0004\b-\u0010,J\u0018\u00101\u001a\u0002002\u0006\u0010/\u001a\u00020.H¦@¢\u0006\u0004\b1\u00102J \u00104\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u00103\u001a\u00020\u0002H¦@¢\u0006\u0004\b4\u0010,J \u00106\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0002H¦@¢\u0006\u0004\b6\u0010,J \u00108\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00022\u0006\u00107\u001a\u00020\u0002H¦@¢\u0006\u0004\b8\u0010,J\u0017\u00109\u001a\u0002002\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u0002002\u0006\u0010\t\u001a\u00020\u0002H&¢\u0006\u0004\b;\u0010:J\u001e\u0010<\u001a\u0002002\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH¦@¢\u0006\u0004\b<\u0010)J \u0010@\u001a\u00020\u00062\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020\u0002H¦@¢\u0006\u0004\b@\u0010AJ*\u0010@\u001a\u00020\u00062\u0006\u0010C\u001a\u00020B2\u0006\u0010/\u001a\u00020.2\b\b\u0002\u0010D\u001a\u00020\u0002H¦@¢\u0006\u0004\b@\u0010EJ#\u0010@\u001a\u00020\u00062\u0006\u0010G\u001a\u00020F2\u0006\u0010?\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\bH\u0010,J \u0010@\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u0002H¦@¢\u0006\u0004\b@\u0010,J\u0018\u0010K\u001a\u00020\u00062\u0006\u0010J\u001a\u00020IH¦@¢\u0006\u0004\bK\u0010L\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Lcom/payair/logic/managers/TokenManager;", "", "", "tokenizationSessionId", "", "termsAndConditionsAcceptedAt", "Lcom/payair/model/Response;", "completeTokenize", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "networkTokenReference", "Lcom/payair/model/ReasonCode;", "reasonCode", "reason", "deleteToken", "(Ljava/lang/String;Lcom/payair/model/ReasonCode;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActiveToken", "()Ljava/lang/String;", "", "forceRefresh", "", "Lcom/payair/model/TokenDetailsWithAsset;", "getAllLocalTokensWithDetails", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAuthenticationMethods", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDefaultToken", "getLocalTokenDetails", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/payair/model/NetworkTokenReference;", "getNetworkTokenReferencesPendingHandle", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTokenDetails", "cardReference", "getTokenList", "getTokensCardReference", "Lkotlinx/coroutines/flow/Flow;", "observeTokenList", "()Lkotlinx/coroutines/flow/Flow;", "networkTokenReferences", "refreshTokens", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authenticationMethodId", "request3dsUrl", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestActivationCode", "Lcom/payair/model/CardScheme;", "scheme", "", "selectScheme", "(Lcom/payair/model/CardScheme;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "threeDSecureAuthenticationValue", "send3dsAuthenticationValue", "authenticationCode", "sendActivationCode", "tav", "sendActivationTav", "setActiveToken", "(Ljava/lang/String;)V", "setDefaultToken", "setNetworkTokenReferencesPendingUpdate", "Lcom/payair/model/CardData;", "cardData", "issuerId", "startTokenize", "(Lcom/payair/model/CardData;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/payair/model/EncryptedCardForTokenization;", "encryptedCardForTokenization", "consumerEntryMode", "(Lcom/payair/model/EncryptedCardForTokenization;Lcom/payair/model/CardScheme;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/payair/model/PushAccountReceipt;", "pushAccountReceipt", "startTokenize-N1mnpSo", "Lcom/payair/model/StartTokenizeAllCardsRequestData;", "startTokenizeAllCardsRequestData", "startTokenizeAllCards", "(Lcom/payair/model/StartTokenizeAllCardsRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface TokenManager {

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ java.lang.Object deleteToken$default(com.payair.logic.managers.TokenManager tokenManager, java.lang.String str, com.payair.model.ReasonCode reasonCode, java.lang.String str2, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: deleteToken");
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            return tokenManager.deleteToken(str, reasonCode, str2, continuation);
        }

        public static /* synthetic */ java.lang.Object getAllLocalTokensWithDetails$default(com.payair.logic.managers.TokenManager tokenManager, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getAllLocalTokensWithDetails");
            }
            if ((i & 1) != 0) {
                z = false;
            }
            return tokenManager.getAllLocalTokensWithDetails(z, continuation);
        }

        public static /* synthetic */ java.lang.Object getLocalTokenDetails$default(com.payair.logic.managers.TokenManager tokenManager, java.lang.String str, boolean z, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLocalTokenDetails");
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return tokenManager.getLocalTokenDetails(str, z, continuation);
        }

        public static /* synthetic */ java.lang.Object startTokenize$default(com.payair.logic.managers.TokenManager tokenManager, com.payair.model.EncryptedCardForTokenization encryptedCardForTokenization, com.payair.model.CardScheme cardScheme, java.lang.String str, kotlin.coroutines.Continuation continuation, int i, java.lang.Object obj) {
            if (obj != null) {
                throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startTokenize");
            }
            if ((i & 4) != 0) {
                str = "UNKNOWN";
            }
            return tokenManager.startTokenize(encryptedCardForTokenization, cardScheme, str, continuation);
        }
    }

    java.lang.Object completeTokenize(java.lang.String str, long j, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    java.lang.Object deleteToken(java.lang.String str, com.payair.model.ReasonCode reasonCode, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    java.lang.String getActiveToken();

    java.lang.Object getAllLocalTokensWithDetails(boolean z, kotlin.coroutines.Continuation<? super java.util.List<com.payair.model.TokenDetailsWithAsset>> continuation);

    java.lang.Object getAuthenticationMethods(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    java.lang.String getDefaultToken();

    java.lang.Object getLocalTokenDetails(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super com.payair.model.TokenDetailsWithAsset> continuation);

    java.lang.Object getNetworkTokenReferencesPendingHandle(kotlin.coroutines.Continuation<? super java.util.Set<com.payair.model.NetworkTokenReference>> continuation);

    java.lang.Object getTokenDetails(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    java.lang.Object getTokenList(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    java.lang.Object getTokensCardReference(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    kotlinx.coroutines.flow.Flow<java.util.List<com.payair.model.TokenDetailsWithAsset>> observeTokenList();

    java.lang.Object refreshTokens(java.util.Set<com.payair.model.NetworkTokenReference> set, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation);

    java.lang.Object request3dsUrl(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    java.lang.Object requestActivationCode(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    java.lang.Object selectScheme(com.payair.model.CardScheme cardScheme, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object send3dsAuthenticationValue(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    java.lang.Object sendActivationCode(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    java.lang.Object sendActivationTav(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    void setActiveToken(java.lang.String networkTokenReference);

    void setDefaultToken(java.lang.String networkTokenReference);

    java.lang.Object setNetworkTokenReferencesPendingUpdate(java.util.Set<com.payair.model.NetworkTokenReference> set, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    java.lang.Object startTokenize(com.payair.model.CardData cardData, java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    java.lang.Object startTokenize(com.payair.model.EncryptedCardForTokenization encryptedCardForTokenization, com.payair.model.CardScheme cardScheme, java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    java.lang.Object startTokenize(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    /* renamed from: startTokenize-N1mnpSo */
    java.lang.Object mo10971startTokenizeN1mnpSo(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);

    java.lang.Object startTokenizeAllCards(com.payair.model.StartTokenizeAllCardsRequestData startTokenizeAllCardsRequestData, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation);
}
