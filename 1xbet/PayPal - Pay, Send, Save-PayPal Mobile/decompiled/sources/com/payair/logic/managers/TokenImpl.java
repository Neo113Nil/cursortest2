package com.payair.logic.managers;

@kotlin.Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001e\u001a\u00020\u001d2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b#\u0010$J\"\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010!\u001a\u00020 2\u0006\u0010&\u001a\u00020%H\u0096@¢\u0006\u0004\b(\u0010)J\u0018\u0010+\u001a\u00020\"2\u0006\u0010*\u001a\u00020 H\u0096@¢\u0006\u0004\b+\u0010$J\u001e\u0010-\u001a\b\u0012\u0004\u0012\u00020'0,2\u0006\u0010&\u001a\u00020%H\u0096@¢\u0006\u0004\b-\u0010.J\u0018\u0010/\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b/\u0010$J\u0018\u00100\u001a\u00020\"2\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b0\u0010$J \u00102\u001a\u00020\"2\u0006\u0010*\u001a\u00020 2\u0006\u00101\u001a\u00020 H\u0096@¢\u0006\u0004\b2\u00103J#\u00102\u001a\u00020\"2\u0006\u00105\u001a\u0002042\u0006\u00101\u001a\u00020 H\u0096@ø\u0001\u0000¢\u0006\u0004\b6\u00103J(\u00102\u001a\u00020\"2\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020 H\u0096@¢\u0006\u0004\b2\u0010<J \u0010@\u001a\u00020\"2\u0006\u0010=\u001a\u00020 2\u0006\u0010?\u001a\u00020>H\u0096@¢\u0006\u0004\b@\u0010AJ\u0018\u0010D\u001a\u00020\"2\u0006\u0010C\u001a\u00020BH\u0096@¢\u0006\u0004\bD\u0010EJ\u0011\u0010F\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\bF\u0010GJ\u0017\u0010H\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\bH\u0010IJ\u0011\u0010J\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\bJ\u0010GJ\u0017\u0010K\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\bK\u0010IJ \u0010M\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\u0006\u0010L\u001a\u00020 H\u0096@¢\u0006\u0004\bM\u00103J \u0010N\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\u0006\u0010L\u001a\u00020 H\u0096@¢\u0006\u0004\bN\u00103J \u0010P\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\u0006\u0010O\u001a\u00020 H\u0096@¢\u0006\u0004\bP\u00103J \u0010R\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\u0006\u0010Q\u001a\u00020 H\u0096@¢\u0006\u0004\bR\u00103J \u0010T\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\u0006\u0010S\u001a\u00020 H\u0096@¢\u0006\u0004\bT\u00103J \u00102\u001a\u00020\"2\u0006\u0010V\u001a\u00020U2\u0006\u00101\u001a\u00020 H\u0096@¢\u0006\u0004\b2\u0010WJ*\u0010[\u001a\u00020\"2\u0006\u0010!\u001a\u00020 2\u0006\u0010Y\u001a\u00020X2\b\u0010Z\u001a\u0004\u0018\u00010 H\u0096@¢\u0006\u0004\b[\u0010\\J\u001e\u0010]\u001a\u00020%2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0096@¢\u0006\u0004\b]\u0010\u001fJ\u001b\u0010_\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0,0^H\u0016¢\u0006\u0004\b_\u0010`J\u0018\u0010a\u001a\u00020\u001d2\u0006\u0010:\u001a\u000209H\u0096@¢\u0006\u0004\ba\u0010b\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Lcom/payair/logic/managers/TokenImpl;", "Lcom/payair/logic/managers/TokenManager;", "Lcom/payair/logic/remote/repositories/TokenRemoteRepository;", "tokenRemoteRepository", "Lcom/payair/logic/remote/repositories/UserRemoteRepository;", "userRemoteRepository", "Lcom/payair/logic/remote/repositories/HceRemoteRepository;", "hceRemote", "Lcom/payair/logic/storage/StorageService;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "Lcom/payair/logic/implementation/HceSDKInterface;", "hceSDK", "Lcom/payair/logic/managers/CoroutineDispatcherProvider;", "dispatcherProvider", "Lcom/payair/db/Database;", "database", "Lcom/payair/logic/storage/TokenizationTimestampStorage;", "timestampStorage", "Lcom/payair/logic/storage/EnrollmentIdStorage;", "enrollmentIdStorage", "Lcom/payair/logic/storage/SchemeStorage;", "schemeStorage", "<init>", "(Lcom/payair/logic/remote/repositories/TokenRemoteRepository;Lcom/payair/logic/remote/repositories/UserRemoteRepository;Lcom/payair/logic/remote/repositories/HceRemoteRepository;Lcom/payair/logic/storage/StorageService;Lcom/payair/logic/implementation/HceSDKInterface;Lcom/payair/logic/managers/CoroutineDispatcherProvider;Lcom/payair/db/Database;Lcom/payair/logic/storage/TokenizationTimestampStorage;Lcom/payair/logic/storage/EnrollmentIdStorage;Lcom/payair/logic/storage/SchemeStorage;)V", "", "Lcom/payair/model/NetworkTokenReference;", "getNetworkTokenReferencesPendingHandle", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "networkTokenReferences", "", "setNetworkTokenReferencesPendingUpdate", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "networkTokenReference", "Lcom/payair/model/Response;", "getTokenDetails", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "forceRefresh", "Lcom/payair/model/TokenDetailsWithAsset;", "getLocalTokenDetails", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cardReference", "getTokenList", "", "getAllLocalTokensWithDetails", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTokensCardReference", "getAuthenticationMethods", "issuerId", "startTokenize", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/payair/model/PushAccountReceipt;", "pushAccountReceipt", "startTokenize-N1mnpSo", "Lcom/payair/model/EncryptedCardForTokenization;", "encryptedCardForTokenization", "Lcom/payair/model/CardScheme;", "scheme", "consumerEntryMode", "(Lcom/payair/model/EncryptedCardForTokenization;Lcom/payair/model/CardScheme;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tokenizationSessionId", "", "termsAndConditionsAcceptedAt", "completeTokenize", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/payair/model/StartTokenizeAllCardsRequestData;", "startTokenizeAllCardsRequestData", "startTokenizeAllCards", "(Lcom/payair/model/StartTokenizeAllCardsRequestData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getActiveToken", "()Ljava/lang/String;", "setActiveToken", "(Ljava/lang/String;)V", "getDefaultToken", "setDefaultToken", "authenticationMethodId", "requestActivationCode", "request3dsUrl", "authenticationCode", "sendActivationCode", "threeDSecureAuthenticationValue", "send3dsAuthenticationValue", "tav", "sendActivationTav", "Lcom/payair/model/CardData;", "cardData", "(Lcom/payair/model/CardData;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/payair/model/ReasonCode;", "reasonCode", "reason", "deleteToken", "(Ljava/lang/String;Lcom/payair/model/ReasonCode;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshTokens", "Lkotlinx/coroutines/flow/Flow;", "observeTokenList", "()Lkotlinx/coroutines/flow/Flow;", "selectScheme", "(Lcom/payair/model/CardScheme;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TokenImpl implements com.payair.logic.managers.TokenManager {

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.logic.remote.repositories.TokenRemoteRepository f4453a;
    public final com.payair.logic.remote.repositories.HceRemoteRepository b;
    public final com.payair.logic.storage.StorageService c;
    public final com.payair.logic.implementation.HceSDKInterface d;
    public final com.payair.db.Database e;
    public final com.payair.logic.storage.TokenizationTimestampStorage f;
    public final com.payair.logic.storage.EnrollmentIdStorage g;
    public final com.payair.logic.storage.SchemeStorage h;
    public final com.payair.logic.managers.TokenListManagerSuspendImpl i;

    public TokenImpl(com.payair.logic.remote.repositories.TokenRemoteRepository tokenRemoteRepository, com.payair.logic.remote.repositories.UserRemoteRepository userRemoteRepository, com.payair.logic.remote.repositories.HceRemoteRepository hceRemoteRepository, com.payair.logic.storage.StorageService storageService, com.payair.logic.implementation.HceSDKInterface hceSDKInterface, com.payair.logic.managers.CoroutineDispatcherProvider coroutineDispatcherProvider, com.payair.db.Database database, com.payair.logic.storage.TokenizationTimestampStorage tokenizationTimestampStorage, com.payair.logic.storage.EnrollmentIdStorage enrollmentIdStorage, com.payair.logic.storage.SchemeStorage schemeStorage) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenRemoteRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userRemoteRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceRemoteRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storageService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSDKInterface, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenizationTimestampStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrollmentIdStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(schemeStorage, "");
        this.f4453a = tokenRemoteRepository;
        this.b = hceRemoteRepository;
        this.c = storageService;
        this.d = hceSDKInterface;
        this.e = database;
        this.f = tokenizationTimestampStorage;
        this.g = enrollmentIdStorage;
        this.h = schemeStorage;
        this.i = new com.payair.logic.managers.TokenListManagerSuspendImpl(tokenRemoteRepository, userRemoteRepository, hceSDKInterface, coroutineDispatcherProvider, storageService, database);
    }

    public static final boolean a(kotlin.jvm.functions.Function1 function1, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return ((java.lang.Boolean) function1.invoke(obj)).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.payair.logic.managers.TokenManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object completeTokenize(java.lang.String str, long j, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.csdk.w2 w2Var;
        int i;
        com.payair.logic.managers.TokenImpl tokenImpl;
        if (continuation instanceof com.payair.csdk.w2) {
            w2Var = (com.payair.csdk.w2) continuation;
            int i2 = w2Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w2Var.f = i2 - 2147483648;
                com.payair.csdk.w2 w2Var2 = w2Var;
                java.lang.Object obj = w2Var2.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = w2Var2.f;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.Flow<java.lang.String> currentPanEnrollmentId = this.g.currentPanEnrollmentId();
                    w2Var2.f4330a = this;
                    w2Var2.b = str;
                    w2Var2.c = j;
                    w2Var2.f = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(currentPanEnrollmentId, w2Var2);
                    if (obj != coroutine_suspended) {
                        tokenImpl = this;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                j = w2Var2.c;
                str = w2Var2.b;
                tokenImpl = w2Var2.f4330a;
                kotlin.ResultKt.throwOnFailure(obj);
                com.payair.logic.remote.repositories.HceRemoteRepository hceRemoteRepository = tokenImpl.b;
                java.lang.String paymentAppInstanceId = tokenImpl.d.getPaymentAppInstanceId();
                w2Var2.f4330a = null;
                w2Var2.b = null;
                w2Var2.f = 2;
                java.lang.Object completeTokenization = hceRemoteRepository.completeTokenization(paymentAppInstanceId, str, j, (java.lang.String) obj, w2Var2);
                return completeTokenization != coroutine_suspended ? coroutine_suspended : completeTokenization;
            }
        }
        w2Var = new com.payair.csdk.w2(this, continuation);
        com.payair.csdk.w2 w2Var22 = w2Var;
        java.lang.Object obj2 = w2Var22.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = w2Var22.f;
        if (i != 0) {
        }
        com.payair.logic.remote.repositories.HceRemoteRepository hceRemoteRepository2 = tokenImpl.b;
        java.lang.String paymentAppInstanceId2 = tokenImpl.d.getPaymentAppInstanceId();
        w2Var22.f4330a = null;
        w2Var22.b = null;
        w2Var22.f = 2;
        java.lang.Object completeTokenization2 = hceRemoteRepository2.completeTokenization(paymentAppInstanceId2, str, j, (java.lang.String) obj2, w2Var22);
        if (completeTokenization2 != coroutine_suspended2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.payair.logic.managers.TokenManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object deleteToken(java.lang.String str, com.payair.model.ReasonCode reasonCode, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.csdk.x2 x2Var;
        java.lang.Object coroutine_suspended;
        int i;
        com.payair.model.Response deleteToken;
        com.payair.logic.managers.TokenImpl tokenImpl;
        com.payair.db.transactionhistory.TransactionHistoryEntryDao transactionHistoryDao;
        java.lang.String str3;
        com.payair.model.Response response;
        if (continuation instanceof com.payair.csdk.x2) {
            x2Var = (com.payair.csdk.x2) continuation;
            int i2 = x2Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x2Var.f = i2 - 2147483648;
                java.lang.Object obj = x2Var.d;
                coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = x2Var.f;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    deleteToken = this.b.deleteToken(this.d.getPaymentAppInstanceId(), str, reasonCode, str2);
                    if (!(deleteToken instanceof com.payair.model.Response.Success)) {
                        return deleteToken;
                    }
                    com.payair.logic.implementation.HceSDKInterface hceSDKInterface = this.d;
                    byte[] bytes = str.getBytes(kotlin.text.Charsets.UTF_8);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
                    hceSDKInterface.removeCard(bytes);
                    com.payair.db.token.TokenDetailsDao tokenDetailsDao = this.e.getTokenDetailsDao();
                    x2Var.f4334a = this;
                    x2Var.b = str;
                    x2Var.c = deleteToken;
                    x2Var.f = 1;
                    if (tokenDetailsDao.delete(str, x2Var) != coroutine_suspended) {
                        tokenImpl = this;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.payair.model.Response response2 = (com.payair.model.Response) x2Var.f4334a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return response2;
                    }
                    response = x2Var.c;
                    str3 = x2Var.b;
                    tokenImpl = (com.payair.logic.managers.TokenImpl) x2Var.f4334a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.logic.storage.EnrollmentIdStorage enrollmentIdStorage = tokenImpl.g;
                    x2Var.f4334a = response;
                    x2Var.b = null;
                    x2Var.c = null;
                    x2Var.f = 3;
                    return enrollmentIdStorage.deleteEnrollmentId(str3, x2Var) != coroutine_suspended ? coroutine_suspended : response;
                }
                com.payair.model.Response response3 = x2Var.c;
                java.lang.String str4 = x2Var.b;
                tokenImpl = (com.payair.logic.managers.TokenImpl) x2Var.f4334a;
                kotlin.ResultKt.throwOnFailure(obj);
                deleteToken = response3;
                str = str4;
                transactionHistoryDao = tokenImpl.e.getTransactionHistoryDao();
                x2Var.f4334a = tokenImpl;
                x2Var.b = str;
                x2Var.c = deleteToken;
                x2Var.f = 2;
                if (transactionHistoryDao.delete(str, x2Var) != coroutine_suspended) {
                    com.payair.model.Response response4 = deleteToken;
                    str3 = str;
                    response = response4;
                    com.payair.logic.storage.EnrollmentIdStorage enrollmentIdStorage2 = tokenImpl.g;
                    x2Var.f4334a = response;
                    x2Var.b = null;
                    x2Var.c = null;
                    x2Var.f = 3;
                    if (enrollmentIdStorage2.deleteEnrollmentId(str3, x2Var) != coroutine_suspended) {
                    }
                }
            }
        }
        x2Var = new com.payair.csdk.x2(this, continuation);
        java.lang.Object obj2 = x2Var.d;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = x2Var.f;
        if (i != 0) {
        }
        transactionHistoryDao = tokenImpl.e.getTransactionHistoryDao();
        x2Var.f4334a = tokenImpl;
        x2Var.b = str;
        x2Var.c = deleteToken;
        x2Var.f = 2;
        if (transactionHistoryDao.delete(str, x2Var) != coroutine_suspended) {
        }
    }

    @Override // com.payair.logic.managers.TokenManager
    public final java.lang.String getActiveToken() {
        byte[] selectedCard = this.d.getSelectedCard();
        if (selectedCard != null) {
            return new java.lang.String(selectedCard, kotlin.text.Charsets.UTF_8);
        }
        return null;
    }

    @Override // com.payair.logic.managers.TokenManager
    public final java.lang.Object getAllLocalTokensWithDetails(boolean z, kotlin.coroutines.Continuation<? super java.util.List<com.payair.model.TokenDetailsWithAsset>> continuation) {
        return this.i.getAllTokensWithDetails(z, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.payair.logic.managers.TokenManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getAuthenticationMethods(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.csdk.y2 y2Var;
        int i;
        com.payair.logic.managers.TokenImpl tokenImpl;
        com.payair.model.Response response;
        com.payair.logic.managers.TokenImpl tokenImpl2;
        java.lang.String str2;
        com.payair.model.Response response2;
        if (continuation instanceof com.payair.csdk.y2) {
            y2Var = (com.payair.csdk.y2) continuation;
            int i2 = y2Var.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                y2Var.f = i2 - 2147483648;
                java.lang.Object obj = y2Var.d;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = y2Var.f;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.logic.remote.repositories.TokenRemoteRepository tokenRemoteRepository = this.f4453a;
                    java.lang.String paymentAppInstanceId = this.d.getPaymentAppInstanceId();
                    y2Var.f4339a = this;
                    y2Var.b = str;
                    y2Var.f = 1;
                    obj = tokenRemoteRepository.getAuthenticationMethods(paymentAppInstanceId, str, y2Var);
                    if (obj != coroutine_suspended) {
                        tokenImpl = this;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.payair.model.Response response3 = (com.payair.model.Response) y2Var.f4339a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return response3;
                    }
                    response2 = y2Var.c;
                    str2 = y2Var.b;
                    tokenImpl2 = (com.payair.logic.managers.TokenImpl) y2Var.f4339a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.model.ReasonCode reasonCode = com.payair.model.ReasonCode.OTHER;
                    y2Var.f4339a = response2;
                    y2Var.b = null;
                    y2Var.c = null;
                    y2Var.f = 3;
                    return tokenImpl2.deleteToken(str2, reasonCode, "No authentication methods available", y2Var) != coroutine_suspended ? coroutine_suspended : response2;
                }
                str = y2Var.b;
                tokenImpl = (com.payair.logic.managers.TokenImpl) y2Var.f4339a;
                kotlin.ResultKt.throwOnFailure(obj);
                response = (com.payair.model.Response) obj;
                if (response instanceof com.payair.model.Response.Success) {
                    com.payair.model.Response.Success success = (com.payair.model.Response.Success) response;
                    if ((success.getData() instanceof java.util.List) && ((java.util.List) success.getData()).isEmpty()) {
                        com.payair.logic.storage.TokenizationTimestampStorage tokenizationTimestampStorage = tokenImpl.f;
                        y2Var.f4339a = tokenImpl;
                        y2Var.b = str;
                        y2Var.c = success;
                        y2Var.f = 2;
                        if (tokenizationTimestampStorage.delete(str, y2Var) != coroutine_suspended) {
                            tokenImpl2 = tokenImpl;
                            str2 = str;
                            response2 = response;
                            com.payair.model.ReasonCode reasonCode2 = com.payair.model.ReasonCode.OTHER;
                            y2Var.f4339a = response2;
                            y2Var.b = null;
                            y2Var.c = null;
                            y2Var.f = 3;
                            if (tokenImpl2.deleteToken(str2, reasonCode2, "No authentication methods available", y2Var) != coroutine_suspended) {
                            }
                        }
                    }
                }
                return response;
            }
        }
        y2Var = new com.payair.csdk.y2(this, continuation);
        java.lang.Object obj2 = y2Var.d;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = y2Var.f;
        if (i != 0) {
        }
        response = (com.payair.model.Response) obj2;
        if (response instanceof com.payair.model.Response.Success) {
        }
        return response;
    }

    @Override // com.payair.logic.managers.TokenManager
    public final java.lang.String getDefaultToken() {
        byte[] defaultCard = this.d.getDefaultCard();
        if (defaultCard != null) {
            return new java.lang.String(defaultCard, kotlin.text.Charsets.UTF_8);
        }
        return null;
    }

    @Override // com.payair.logic.managers.TokenManager
    public final java.lang.Object getLocalTokenDetails(java.lang.String str, boolean z, kotlin.coroutines.Continuation<? super com.payair.model.TokenDetailsWithAsset> continuation) {
        return this.i.getLocalTokenDetails(str, z, continuation);
    }

    @Override // com.payair.logic.managers.TokenManager
    public final java.lang.Object getNetworkTokenReferencesPendingHandle(kotlin.coroutines.Continuation<? super java.util.Set<com.payair.model.NetworkTokenReference>> continuation) {
        return this.c.getNetworkTokenReferencesPendingHandle(continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e2, code lost:
    
        if (r6.markEnrollmentDone(r9, false, r0) != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // com.payair.logic.managers.TokenManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getTokenDetails(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.csdk.z2 z2Var;
        int i;
        com.payair.logic.managers.TokenImpl tokenImpl;
        com.payair.model.Response response;
        java.lang.String str2;
        com.payair.logic.managers.TokenImpl tokenImpl2;
        com.payair.model.TokenDetails tokenDetails;
        com.payair.model.Response response2;
        com.payair.logic.managers.TokenImpl tokenImpl3;
        com.payair.db.token.TokenDetailsEntry tokenDetailsEntry;
        if (continuation instanceof com.payair.csdk.z2) {
            z2Var = (com.payair.csdk.z2) continuation;
            int i2 = z2Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z2Var.g = i2 - 2147483648;
                java.lang.Object obj = z2Var.e;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = z2Var.g;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.logic.remote.repositories.TokenRemoteRepository tokenRemoteRepository = this.f4453a;
                    java.lang.String paymentAppInstanceId = this.d.getPaymentAppInstanceId();
                    z2Var.f4344a = this;
                    z2Var.b = str;
                    z2Var.g = 1;
                    obj = tokenRemoteRepository.getTokenDetailsAsync(paymentAppInstanceId, str, z2Var);
                    if (obj != coroutine_suspended) {
                        tokenImpl = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i == 2) {
                        com.payair.model.Response response3 = (com.payair.model.Response) z2Var.f4344a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return response3;
                    }
                    if (i == 3) {
                        tokenDetails = z2Var.d;
                        response2 = (com.payair.model.Response) z2Var.c;
                        str2 = (java.lang.String) z2Var.b;
                        tokenImpl2 = (com.payair.logic.managers.TokenImpl) z2Var.f4344a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        com.payair.db.token.TokenDetailsDao tokenDetailsDao = tokenImpl2.e.getTokenDetailsDao();
                        z2Var.f4344a = tokenImpl2;
                        z2Var.b = response2;
                        z2Var.c = tokenDetails;
                        z2Var.d = null;
                        z2Var.g = 4;
                        obj = tokenDetailsDao.getByNetworkTokenReference(str2, z2Var);
                        if (obj != coroutine_suspended) {
                            tokenImpl3 = tokenImpl2;
                            tokenDetailsEntry = (com.payair.db.token.TokenDetailsEntry) obj;
                            if (tokenDetailsEntry != null) {
                            }
                            return response2;
                        }
                        return coroutine_suspended;
                    }
                    if (i != 4) {
                        if (i != 5) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        com.payair.model.Response response4 = (com.payair.model.Response) z2Var.f4344a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return response4;
                    }
                    tokenDetails = (com.payair.model.TokenDetails) z2Var.c;
                    response2 = (com.payair.model.Response) z2Var.b;
                    tokenImpl3 = (com.payair.logic.managers.TokenImpl) z2Var.f4344a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    tokenDetailsEntry = (com.payair.db.token.TokenDetailsEntry) obj;
                    if (tokenDetailsEntry != null) {
                        com.payair.db.token.TokenDetailsEntry tokenDetailsEntry2 = com.payair.db.token.TokenDetailsEntryKt.toTokenDetailsEntry(tokenDetails, tokenDetailsEntry.getAsset());
                        z2Var.f4344a = response2;
                        z2Var.b = null;
                        z2Var.c = null;
                        z2Var.g = 5;
                        if (tokenImpl3.e.getTokenDetailsDao().insert(new com.payair.db.token.TokenDetailsEntry[]{tokenDetailsEntry2}, z2Var) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return response2;
                }
                str = (java.lang.String) z2Var.b;
                tokenImpl = (com.payair.logic.managers.TokenImpl) z2Var.f4344a;
                kotlin.ResultKt.throwOnFailure(obj);
                response = (com.payair.model.Response) obj;
                if (response instanceof com.payair.model.Response.Success) {
                    java.lang.Object data = ((com.payair.model.Response.Success) response).getData();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(data, "");
                    com.payair.model.TokenDetails tokenDetails2 = (com.payair.model.TokenDetails) data;
                    if (tokenDetails2.getTokenStatus() == com.payair.model.TokenStatus.DEACTIVATED) {
                        com.payair.db.token.TokenDetailsDao tokenDetailsDao2 = tokenImpl.e.getTokenDetailsDao();
                        java.lang.String networkTokenReference = tokenDetails2.getNetworkTokenReference();
                        z2Var.f4344a = response;
                        z2Var.b = null;
                        z2Var.g = 2;
                        if (tokenDetailsDao2.delete(networkTokenReference, z2Var) == coroutine_suspended) {
                        }
                    } else {
                        if (tokenDetails2.getTokenStatus() == com.payair.model.TokenStatus.ACTIVE) {
                            com.payair.logic.storage.EnrollmentIdStorage enrollmentIdStorage = tokenImpl.g;
                            java.lang.String networkTokenReference2 = tokenDetails2.getNetworkTokenReference();
                            z2Var.f4344a = tokenImpl;
                            z2Var.b = str;
                            z2Var.c = response;
                            z2Var.d = tokenDetails2;
                            z2Var.g = 3;
                        }
                        str2 = str;
                        tokenImpl2 = tokenImpl;
                        tokenDetails = tokenDetails2;
                        response2 = response;
                        com.payair.db.token.TokenDetailsDao tokenDetailsDao3 = tokenImpl2.e.getTokenDetailsDao();
                        z2Var.f4344a = tokenImpl2;
                        z2Var.b = response2;
                        z2Var.c = tokenDetails;
                        z2Var.d = null;
                        z2Var.g = 4;
                        obj = tokenDetailsDao3.getByNetworkTokenReference(str2, z2Var);
                        if (obj != coroutine_suspended) {
                        }
                    }
                    return coroutine_suspended;
                }
                return response;
            }
        }
        z2Var = new com.payair.csdk.z2(this, continuation);
        java.lang.Object obj2 = z2Var.e;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = z2Var.g;
        if (i != 0) {
        }
        response = (com.payair.model.Response) obj2;
        if (response instanceof com.payair.model.Response.Success) {
        }
        return response;
    }

    @Override // com.payair.logic.managers.TokenManager
    public final java.lang.Object getTokenList(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        return this.f4453a.getTokenList(this.d.getPaymentAppInstanceId(), str, continuation);
    }

    @Override // com.payair.logic.managers.TokenManager
    public final java.lang.Object getTokensCardReference(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        return this.f4453a.getTokensCardReference(this.d.getPaymentAppInstanceId(), str, continuation);
    }

    @Override // com.payair.logic.managers.TokenManager
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.payair.model.TokenDetailsWithAsset>> observeTokenList() {
        final kotlinx.coroutines.flow.Flow<java.util.List<com.payair.db.token.TokenDetailsEntry>> observeAll = this.e.getTokenDetailsDao().observeAll();
        return new kotlinx.coroutines.flow.Flow<java.util.List<? extends com.payair.model.TokenDetailsWithAsset>>() { // from class: com.payair.logic.managers.TokenImpl$observeTokenList$$inlined$map$1
            @Override // kotlinx.coroutines.flow.Flow
            public final java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends com.payair.model.TokenDetailsWithAsset>> flowCollector, kotlin.coroutines.Continuation continuation) {
                java.lang.Object collect = kotlinx.coroutines.flow.Flow.this.collect(new com.payair.logic.managers.TokenImpl$observeTokenList$$inlined$map$1.AnonymousClass2(flowCollector, this), continuation);
                return collect == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? collect : kotlin.Unit.INSTANCE;
            }

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.payair.logic.managers.TokenImpl$observeTokenList$$inlined$map$1$2, reason: invalid class name */
            public static final class AnonymousClass2<T> implements kotlinx.coroutines.flow.FlowCollector {

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ kotlinx.coroutines.flow.FlowCollector f4455a;
                public final /* synthetic */ com.payair.logic.managers.TokenImpl b;

                /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
                    com.payair.logic.managers.TokenImpl$observeTokenList$$inlined$map$1.AnonymousClass2.AnonymousClass1 anonymousClass1;
                    int i;
                    com.payair.logic.storage.StorageService storageService;
                    if (continuation instanceof com.payair.logic.managers.TokenImpl$observeTokenList$$inlined$map$1.AnonymousClass2.AnonymousClass1) {
                        anonymousClass1 = (com.payair.logic.managers.TokenImpl$observeTokenList$$inlined$map$1.AnonymousClass2.AnonymousClass1) continuation;
                        int i2 = anonymousClass1.b;
                        if ((i2 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.b = i2 - 2147483648;
                            java.lang.Object obj2 = anonymousClass1.f4456a;
                            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                            i = anonymousClass1.b;
                            if (i != 0) {
                                kotlin.ResultKt.throwOnFailure(obj2);
                                kotlinx.coroutines.flow.FlowCollector flowCollector = this.f4455a;
                                java.util.List<com.payair.db.token.TokenDetailsEntry> list = (java.util.List) obj;
                                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                                for (com.payair.db.token.TokenDetailsEntry tokenDetailsEntry : list) {
                                    storageService = this.b.c;
                                    arrayList.add(com.payair.db.token.TokenDetailsEntryKt.toTokenDetails(tokenDetailsEntry, storageService.getTokenAlias(tokenDetailsEntry.getNetworkTokenReference())));
                                }
                                anonymousClass1.b = 1;
                                if (flowCollector.emit(arrayList, anonymousClass1) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            } else {
                                if (i != 1) {
                                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                kotlin.ResultKt.throwOnFailure(obj2);
                            }
                            return kotlin.Unit.INSTANCE;
                        }
                    }
                    anonymousClass1 = new com.payair.logic.managers.TokenImpl$observeTokenList$$inlined$map$1.AnonymousClass2.AnonymousClass1(continuation);
                    java.lang.Object obj22 = anonymousClass1.f4456a;
                    java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = anonymousClass1.b;
                    if (i != 0) {
                    }
                    return kotlin.Unit.INSTANCE;
                }

                @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.payair.logic.managers.TokenImpl$observeTokenList$$inlined$map$1$2", f = "TokenManager.kt", i = {}, l = {com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_REJECTED_REC_VALUE}, m = "emit", n = {}, s = {})
                /* renamed from: com.payair.logic.managers.TokenImpl$observeTokenList$$inlined$map$1$2$1, reason: invalid class name */
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {

                    /* renamed from: a, reason: collision with root package name */
                    public /* synthetic */ java.lang.Object f4456a;
                    public int b;

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                        this.f4456a = obj;
                        this.b |= Integer.MIN_VALUE;
                        return com.payair.logic.managers.TokenImpl$observeTokenList$$inlined$map$1.AnonymousClass2.this.emit(null, this);
                    }

                    public AnonymousClass1(kotlin.coroutines.Continuation continuation) {
                        super(continuation);
                    }
                }

                public AnonymousClass2(kotlinx.coroutines.flow.FlowCollector flowCollector, com.payair.logic.managers.TokenImpl tokenImpl) {
                    this.f4455a = flowCollector;
                    this.b = tokenImpl;
                }
            }
        };
    }

    @Override // com.payair.logic.managers.TokenManager
    public final java.lang.Object refreshTokens(java.util.Set<com.payair.model.NetworkTokenReference> set, kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return this.i.refreshTokens$core_release(set, continuation);
    }

    @Override // com.payair.logic.managers.TokenManager
    public final java.lang.Object request3dsUrl(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        return this.b.request3dsUrl(this.d.getPaymentAppInstanceId(), str, str2);
    }

    @Override // com.payair.logic.managers.TokenManager
    public final java.lang.Object requestActivationCode(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        return this.b.requestActivationCode(this.d.getPaymentAppInstanceId(), str, str2);
    }

    @Override // com.payair.logic.managers.TokenManager
    public final java.lang.Object selectScheme(com.payair.model.CardScheme cardScheme, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object storeScheme = this.h.storeScheme(cardScheme, continuation);
        return storeScheme == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? storeScheme : kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.payair.logic.managers.TokenManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object send3dsAuthenticationValue(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.csdk.a3 a3Var;
        int i;
        if (continuation instanceof com.payair.csdk.a3) {
            a3Var = (com.payair.csdk.a3) continuation;
            int i2 = a3Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a3Var.d = i2 - 2147483648;
                java.lang.Object obj = a3Var.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = a3Var.d;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.payair.model.Response.Success success = a3Var.f4228a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return success;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.payair.model.Response sendAuthenticationCode$default = com.payair.logic.remote.repositories.HceRemoteRepository.DefaultImpls.sendAuthenticationCode$default(this.b, this.d.getPaymentAppInstanceId(), str, null, null, str2, 12, null);
                if (sendAuthenticationCode$default instanceof com.payair.model.Response.Success) {
                    com.payair.model.Response.Success success2 = (com.payair.model.Response.Success) sendAuthenticationCode$default;
                    if (success2.getData() == com.payair.model.ActivateCodeResponse.SUCCESS) {
                        com.payair.logic.storage.TokenizationTimestampStorage tokenizationTimestampStorage = this.f;
                        a3Var.f4228a = success2;
                        a3Var.d = 1;
                        if (tokenizationTimestampStorage.delete(str, a3Var) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return sendAuthenticationCode$default;
            }
        }
        a3Var = new com.payair.csdk.a3(this, continuation);
        java.lang.Object obj2 = a3Var.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = a3Var.d;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.payair.logic.managers.TokenManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object sendActivationCode(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.csdk.b3 b3Var;
        int i;
        if (continuation instanceof com.payair.csdk.b3) {
            b3Var = (com.payair.csdk.b3) continuation;
            int i2 = b3Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b3Var.d = i2 - 2147483648;
                java.lang.Object obj = b3Var.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = b3Var.d;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.payair.model.Response.Success success = b3Var.f4234a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return success;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.payair.model.Response sendAuthenticationCode$default = com.payair.logic.remote.repositories.HceRemoteRepository.DefaultImpls.sendAuthenticationCode$default(this.b, this.d.getPaymentAppInstanceId(), str, str2, null, null, 24, null);
                if (sendAuthenticationCode$default instanceof com.payair.model.Response.Success) {
                    com.payair.model.Response.Success success2 = (com.payair.model.Response.Success) sendAuthenticationCode$default;
                    if (success2.getData() == com.payair.model.ActivateCodeResponse.SUCCESS) {
                        com.payair.logic.storage.TokenizationTimestampStorage tokenizationTimestampStorage = this.f;
                        b3Var.f4234a = success2;
                        b3Var.d = 1;
                        if (tokenizationTimestampStorage.delete(str, b3Var) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return sendAuthenticationCode$default;
            }
        }
        b3Var = new com.payair.csdk.b3(this, continuation);
        java.lang.Object obj2 = b3Var.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = b3Var.d;
        if (i == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.payair.logic.managers.TokenManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object sendActivationTav(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.csdk.c3 c3Var;
        int i;
        if (continuation instanceof com.payair.csdk.c3) {
            c3Var = (com.payair.csdk.c3) continuation;
            int i2 = c3Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3Var.d = i2 - 2147483648;
                java.lang.Object obj = c3Var.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c3Var.d;
                if (i == 0) {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    com.payair.model.Response.Success success = c3Var.f4239a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    return success;
                }
                kotlin.ResultKt.throwOnFailure(obj);
                com.payair.model.Response sendAuthenticationCode$default = com.payair.logic.remote.repositories.HceRemoteRepository.DefaultImpls.sendAuthenticationCode$default(this.b, this.d.getPaymentAppInstanceId(), str, null, str2, null, 20, null);
                if (sendAuthenticationCode$default instanceof com.payair.model.Response.Success) {
                    com.payair.model.Response.Success success2 = (com.payair.model.Response.Success) sendAuthenticationCode$default;
                    if (success2.getData() == com.payair.model.ActivateCodeResponse.SUCCESS) {
                        com.payair.logic.storage.TokenizationTimestampStorage tokenizationTimestampStorage = this.f;
                        c3Var.f4239a = success2;
                        c3Var.d = 1;
                        if (tokenizationTimestampStorage.delete(str, c3Var) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return sendAuthenticationCode$default;
            }
        }
        c3Var = new com.payair.csdk.c3(this, continuation);
        java.lang.Object obj2 = c3Var.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c3Var.d;
        if (i == 0) {
        }
    }

    @Override // com.payair.logic.managers.TokenManager
    public final void setActiveToken(java.lang.String networkTokenReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        com.payair.logic.implementation.HceSDKInterface hceSDKInterface = this.d;
        byte[] bytes = networkTokenReference.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        hceSDKInterface.setSelectedCard(bytes);
    }

    @Override // com.payair.logic.managers.TokenManager
    public final void setDefaultToken(java.lang.String networkTokenReference) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        com.payair.logic.implementation.HceSDKInterface hceSDKInterface = this.d;
        byte[] bytes = networkTokenReference.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        hceSDKInterface.setDefaultCard(bytes);
    }

    @Override // com.payair.logic.managers.TokenManager
    public final java.lang.Object setNetworkTokenReferencesPendingUpdate(java.util.Set<com.payair.model.NetworkTokenReference> set, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.util.Set<com.payair.model.NetworkTokenReference> mutableSet = kotlin.collections.CollectionsKt.toMutableSet(set);
        final com.payair.csdk.d3 d3Var = com.payair.csdk.d3.f4243a;
        mutableSet.removeIf(new java.util.function.Predicate() { // from class: com.payair.logic.managers.TokenImpl$$ExternalSyntheticLambda0
            @Override // java.util.function.Predicate
            public final boolean test(java.lang.Object obj) {
                return com.payair.logic.managers.TokenImpl.a(kotlin.jvm.functions.Function1.this, obj);
            }
        });
        java.lang.Object networkTokenReferences = this.c.setNetworkTokenReferences(mutableSet, continuation);
        return networkTokenReferences == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? networkTokenReferences : kotlin.Unit.INSTANCE;
    }

    @Override // com.payair.logic.managers.TokenManager
    public final java.lang.Object startTokenize(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        return this.b.startTokenization(this.d.getPaymentAppInstanceId(), str, str2, continuation);
    }

    @Override // com.payair.logic.managers.TokenManager
    /* renamed from: startTokenize-N1mnpSo, reason: not valid java name */
    public final java.lang.Object mo10971startTokenizeN1mnpSo(java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        return this.b.mo10972startTokenizationUF1who8(this.d.getPaymentAppInstanceId(), str, str2, continuation);
    }

    @Override // com.payair.logic.managers.TokenManager
    public final java.lang.Object startTokenizeAllCards(com.payair.model.StartTokenizeAllCardsRequestData startTokenizeAllCardsRequestData, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        return this.b.startTokenizeAllCards(this.d.getPaymentAppInstanceId(), startTokenizeAllCardsRequestData);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0074 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.payair.logic.managers.TokenManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object startTokenize(com.payair.model.EncryptedCardForTokenization encryptedCardForTokenization, com.payair.model.CardScheme cardScheme, java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.csdk.e3 e3Var;
        int i;
        com.payair.logic.managers.TokenImpl tokenImpl;
        if (continuation instanceof com.payair.csdk.e3) {
            e3Var = (com.payair.csdk.e3) continuation;
            int i2 = e3Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e3Var.g = i2 - 2147483648;
                com.payair.csdk.e3 e3Var2 = e3Var;
                java.lang.Object obj = e3Var2.e;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = e3Var2.g;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    e3Var2.f4246a = this;
                    e3Var2.b = encryptedCardForTokenization;
                    e3Var2.c = cardScheme;
                    e3Var2.d = str;
                    e3Var2.g = 1;
                    if (selectScheme(cardScheme, e3Var2) != coroutine_suspended) {
                        tokenImpl = this;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                str = e3Var2.d;
                cardScheme = e3Var2.c;
                encryptedCardForTokenization = e3Var2.b;
                tokenImpl = e3Var2.f4246a;
                kotlin.ResultKt.throwOnFailure(obj);
                com.payair.logic.remote.repositories.HceRemoteRepository hceRemoteRepository = tokenImpl.b;
                java.lang.String paymentAppInstanceId = tokenImpl.d.getPaymentAppInstanceId();
                e3Var2.f4246a = null;
                e3Var2.b = null;
                e3Var2.c = null;
                e3Var2.d = null;
                e3Var2.g = 2;
                java.lang.Object startTokenization = hceRemoteRepository.startTokenization(paymentAppInstanceId, encryptedCardForTokenization, cardScheme, str, e3Var2);
                return startTokenization != coroutine_suspended ? coroutine_suspended : startTokenization;
            }
        }
        e3Var = new com.payair.csdk.e3(this, continuation);
        com.payair.csdk.e3 e3Var22 = e3Var;
        java.lang.Object obj2 = e3Var22.e;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = e3Var22.g;
        if (i != 0) {
        }
        com.payair.logic.remote.repositories.HceRemoteRepository hceRemoteRepository2 = tokenImpl.b;
        java.lang.String paymentAppInstanceId2 = tokenImpl.d.getPaymentAppInstanceId();
        e3Var22.f4246a = null;
        e3Var22.b = null;
        e3Var22.c = null;
        e3Var22.d = null;
        e3Var22.g = 2;
        java.lang.Object startTokenization2 = hceRemoteRepository2.startTokenization(paymentAppInstanceId2, encryptedCardForTokenization, cardScheme, str, e3Var22);
        if (startTokenization2 != coroutine_suspended2) {
        }
    }

    @Override // com.payair.logic.managers.TokenManager
    public final java.lang.Object startTokenize(com.payair.model.CardData cardData, java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        return this.b.startTokenization(this.d.getPaymentAppInstanceId(), cardData, str, continuation);
    }
}
