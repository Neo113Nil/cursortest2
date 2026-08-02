package com.payair.logic.remote.repositories;

@kotlin.Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 F2\u00020\u0001:\u0001FB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J(\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001f\u0010 J2\u0010%\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u001a2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u001aH\u0096@¢\u0006\u0004\b%\u0010&J'\u0010)\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001aH\u0016¢\u0006\u0004\b)\u0010*J'\u0010+\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001aH\u0016¢\u0006\u0004\b+\u0010*J=\u0010/\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u001a2\b\u0010,\u001a\u0004\u0018\u00010\u001a2\b\u0010-\u001a\u0004\u0018\u00010\u001a2\b\u0010.\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b/\u00100J(\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00102\u001a\u0002012\u0006\u0010\u001d\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001f\u00103J+\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00105\u001a\u0002042\u0006\u0010\u001d\u001a\u00020\u001aH\u0096@ø\u0001\u0000¢\u0006\u0004\b6\u0010 J1\u0010:\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u001a2\u0006\u00108\u001a\u0002072\b\u00109\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b:\u0010;J\u001f\u0010>\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J0\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020B2\u0006\u0010D\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b\u001f\u0010E\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001"}, d2 = {"Lcom/payair/logic/remote/repositories/HceRemoteRepositoryImpl;", "Lcom/payair/logic/remote/repositories/HceRemoteRepository;", "Lcom/payair/logic/remote/remoteServices/ProvisioningService;", "provisioningService", "Lcom/payair/logic/storage/implementation/CertificateStorage;", "certificateStorage", "Lcom/payair/logic/implementation/CardEncryptionManager;", "cardEncryption", "Lcom/payair/logic/storage/TokenizationTimestampStorage;", "timestampStorage", "Lcom/payair/logic/storage/SchemeStorage;", "schemeStorage", "Lcom/payair/logic/storage/EnrollmentIdStorage;", "enrollmentIdStorage", "Lcom/payair/db/Database;", "database", "Lcom/payair/hce/visa/tokenization/VisaTokenization;", "visaTokenization", "Lcom/payair/logic/managers/CoroutineDispatcherProvider;", "dispatcherProvider", "Lcom/payair/logic/implementation/HceSDKInterface;", "hceSDK", "Landroid/content/Context;", "context", "<init>", "(Lcom/payair/logic/remote/remoteServices/ProvisioningService;Lcom/payair/logic/storage/implementation/CertificateStorage;Lcom/payair/logic/implementation/CardEncryptionManager;Lcom/payair/logic/storage/TokenizationTimestampStorage;Lcom/payair/logic/storage/SchemeStorage;Lcom/payair/logic/storage/EnrollmentIdStorage;Lcom/payair/db/Database;Lcom/payair/hce/visa/tokenization/VisaTokenization;Lcom/payair/logic/managers/CoroutineDispatcherProvider;Lcom/payair/logic/implementation/HceSDKInterface;Landroid/content/Context;)V", "", "paymentAppInstanceId", "cardReference", "issuerId", "Lcom/payair/model/Response;", "startTokenization", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "tokenizationId", "", "termsAndConditionsAcceptedAt", "panEnrollmentId", "completeTokenization", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "networkTokenReference", "authenticationMethodId", "requestActivationCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payair/model/Response;", "request3dsUrl", "authenticationCode", "tav", "threeDSecureAuthenticationValue", "sendAuthenticationCode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/payair/model/Response;", "Lcom/payair/model/CardData;", "cardData", "(Ljava/lang/String;Lcom/payair/model/CardData;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/payair/model/PushAccountReceipt;", "pushAccountReceipt", "startTokenization-UF1who8", "Lcom/payair/model/ReasonCode;", "reasonCode", "reason", "deleteToken", "(Ljava/lang/String;Ljava/lang/String;Lcom/payair/model/ReasonCode;Ljava/lang/String;)Lcom/payair/model/Response;", "Lcom/payair/model/StartTokenizeAllCardsRequestData;", "startTokenizeAllCardsRequestData", "startTokenizeAllCards", "(Ljava/lang/String;Lcom/payair/model/StartTokenizeAllCardsRequestData;)Lcom/payair/model/Response;", "Lcom/payair/model/EncryptedCardForTokenization;", "encryptedCardForTokenization", "Lcom/payair/model/CardScheme;", "scheme", "consumerEntryMode", "(Ljava/lang/String;Lcom/payair/model/EncryptedCardForTokenization;Lcom/payair/model/CardScheme;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HceRemoteRepositoryImpl implements com.payair.logic.remote.repositories.HceRemoteRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.payair.logic.remote.repositories.HceRemoteRepositoryImpl.Companion INSTANCE = new com.payair.logic.remote.repositories.HceRemoteRepositoryImpl.Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.logic.remote.remoteServices.ProvisioningService f4469a;
    public final com.payair.logic.storage.implementation.CertificateStorage b;
    public final com.payair.logic.implementation.CardEncryptionManager c;
    public final com.payair.logic.storage.TokenizationTimestampStorage d;
    public final com.payair.logic.storage.SchemeStorage e;
    public final com.payair.logic.storage.EnrollmentIdStorage f;
    public final com.payair.db.Database g;
    public final com.payair.hce.visa.tokenization.VisaTokenization h;
    public final com.payair.logic.managers.CoroutineDispatcherProvider i;
    public final com.payair.logic.implementation.HceSDKInterface j;
    public final android.content.Context k;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/payair/logic/remote/repositories/HceRemoteRepositoryImpl$Companion;", "", "Lcom/payair/hce/visa/dao/ResponseCompleteTokenizeDto;", "Lcom/payair/model/CompleteTokenizeData;", "toCompleteTokenizeData$core_release", "(Lcom/payair/hce/visa/dao/ResponseCompleteTokenizeDto;)Lcom/payair/model/CompleteTokenizeData;"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final com.payair.model.CompleteTokenizeData toCompleteTokenizeData$core_release(com.payair.hce.visa.dao.ResponseCompleteTokenizeDto responseCompleteTokenizeDto) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(responseCompleteTokenizeDto, "");
            try {
                java.lang.reflect.Type type = new com.google.gson.reflect.TypeToken<java.util.ArrayList<com.payair.model.CompleteTokenizeData.AuthenticationMethod>>() { // from class: com.payair.logic.remote.repositories.HceRemoteRepositoryImpl$Companion$toCompleteTokenizeData$authenticationMethodsListType$1
                }.getType();
                java.lang.String networkTokenReference = responseCompleteTokenizeDto.getNetworkTokenReference();
                com.payair.model.ProductConfig productConfig = (com.payair.model.ProductConfig) new com.google.gson.Gson().fromJson(responseCompleteTokenizeDto.getProductConfig(), com.payair.model.ProductConfig.class);
                com.payair.model.TokenStatus fromStatusName = com.payair.model.TokenStatus.INSTANCE.fromStatusName(responseCompleteTokenizeDto.getStatus());
                com.google.gson.Gson gson = new com.google.gson.Gson();
                java.util.List<java.lang.String> authenticationMethods = responseCompleteTokenizeDto.getAuthenticationMethods();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : authenticationMethods) {
                    if (kotlin.text.StringsKt.contains$default((java.lang.CharSequence) obj, (java.lang.CharSequence) "type", false, 2, (java.lang.Object) null)) {
                        arrayList.add(obj);
                    }
                }
                return new com.payair.model.CompleteTokenizeData(networkTokenReference, productConfig, fromStatusName, (java.util.List) gson.fromJson(arrayList.toString(), type));
            } catch (java.lang.Exception e) {
                com.paypal.android.logger.Logger.e$default(com.payair.logging.LoggerKt.getLog(), "Exception converting ResponseCompleteTokenizeDto to CompleteTokenizeData: ".concat(java.lang.String.valueOf(e)), null, null, null, 14, null);
                throw e;
            }
        }
    }

    public HceRemoteRepositoryImpl(com.payair.logic.remote.remoteServices.ProvisioningService provisioningService, com.payair.logic.storage.implementation.CertificateStorage certificateStorage, com.payair.logic.implementation.CardEncryptionManager cardEncryptionManager, com.payair.logic.storage.TokenizationTimestampStorage tokenizationTimestampStorage, com.payair.logic.storage.SchemeStorage schemeStorage, com.payair.logic.storage.EnrollmentIdStorage enrollmentIdStorage, com.payair.db.Database database, com.payair.hce.visa.tokenization.VisaTokenization visaTokenization, com.payair.logic.managers.CoroutineDispatcherProvider coroutineDispatcherProvider, com.payair.logic.implementation.HceSDKInterface hceSDKInterface, android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(provisioningService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(certificateStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardEncryptionManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tokenizationTimestampStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(schemeStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(enrollmentIdStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(database, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visaTokenization, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineDispatcherProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSDKInterface, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.f4469a = provisioningService;
        this.b = certificateStorage;
        this.c = cardEncryptionManager;
        this.d = tokenizationTimestampStorage;
        this.e = schemeStorage;
        this.f = enrollmentIdStorage;
        this.g = database;
        this.h = visaTokenization;
        this.i = coroutineDispatcherProvider;
        this.j = hceSDKInterface;
        this.k = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a2, code lost:
    
        if (((java.lang.Boolean) r15).booleanValue() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00cf, code lost:
    
        if (r2.a(r14, r0) != r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009a, code lost:
    
        if (r15 != r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.payair.model.Response response, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.g1 g1Var;
        int i;
        com.payair.model.StartTokenizeData startTokenizeData;
        com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl;
        java.util.Set set;
        if (continuation instanceof com.payair.csdk.g1) {
            g1Var = (com.payair.csdk.g1) continuation;
            int i2 = g1Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                g1Var.e = i2 - 2147483648;
                java.lang.Object obj = g1Var.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = g1Var.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!(response instanceof com.payair.model.Response.Success)) {
                        return response;
                    }
                    java.lang.Object data = ((com.payair.model.Response.Success) response).getData();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(data, "");
                    startTokenizeData = com.payair.logic.remote.model.ResponseStartTokenizeDtoKt.toStartTokenizeData((com.payair.logic.remote.model.ResponseStartTokenizeDto) data);
                    kotlinx.coroutines.flow.Flow<java.util.Set<java.lang.String>> panEnrollmentIds = this.f.panEnrollmentIds();
                    g1Var.f4253a = this;
                    g1Var.b = startTokenizeData;
                    g1Var.e = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(panEnrollmentIds, g1Var);
                    if (obj != coroutine_suspended) {
                        hceRemoteRepositoryImpl = this;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    startTokenizeData = g1Var.b;
                    hceRemoteRepositoryImpl = (com.payair.logic.remote.repositories.HceRemoteRepositoryImpl) g1Var.f4253a;
                    kotlin.ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        startTokenizeData = (com.payair.model.StartTokenizeData) g1Var.f4253a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return new com.payair.model.Response.Success(startTokenizeData);
                    }
                    startTokenizeData = g1Var.b;
                    hceRemoteRepositoryImpl = (com.payair.logic.remote.repositories.HceRemoteRepositoryImpl) g1Var.f4253a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                set = (java.util.Set) obj;
                if (set != null) {
                    if (!set.contains(startTokenizeData.getPanEnrollmentId())) {
                        com.payair.logic.storage.EnrollmentIdStorage enrollmentIdStorage = hceRemoteRepositoryImpl.f;
                        java.lang.String panEnrollmentId = startTokenizeData.getPanEnrollmentId();
                        g1Var.f4253a = hceRemoteRepositoryImpl;
                        g1Var.b = startTokenizeData;
                        g1Var.e = 2;
                        obj = enrollmentIdStorage.isUnfinishedTokenizationRepeated(panEnrollmentId, g1Var);
                    }
                    com.paypal.android.logger.Logger.d$default(com.payair.logging.LoggerKt.getLog(), "DUPLICATE_PROVISIONING of panEnrollmentId: ".concat(java.lang.String.valueOf(startTokenizeData.getPanEnrollmentId())), null, null, 6, null);
                    return new com.payair.model.Response.Error(110, null, 2, null);
                }
                g1Var.f4253a = startTokenizeData;
                g1Var.b = null;
                g1Var.e = 3;
            }
        }
        g1Var = new com.payair.csdk.g1(this, continuation);
        java.lang.Object obj2 = g1Var.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = g1Var.e;
        if (i != 0) {
        }
        set = (java.util.Set) obj2;
        if (set != null) {
        }
        g1Var.f4253a = startTokenizeData;
        g1Var.b = null;
        g1Var.e = 3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.util.ArrayList] */
    @Override // com.payair.logic.remote.repositories.HceRemoteRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object completeTokenization(java.lang.String str, java.lang.String str2, long j, java.lang.String str3, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.csdk.z0 z0Var;
        int i;
        com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        long j2;
        int i2;
        com.payair.model.Response error;
        java.lang.Object mapIfSuccess;
        java.lang.Integer statusCode;
        ?? emptyList;
        java.lang.String str7;
        com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl2;
        if (continuation instanceof com.payair.csdk.z0) {
            z0Var = (com.payair.csdk.z0) continuation;
            int i3 = z0Var.h;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                z0Var.h = i3 - 2147483648;
                java.lang.Object obj = z0Var.f;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = z0Var.h;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.Flow<com.payair.model.CardScheme> currentScheme = this.e.getCurrentScheme();
                    z0Var.f4342a = this;
                    z0Var.b = str;
                    z0Var.c = str2;
                    z0Var.d = str3;
                    z0Var.e = j;
                    z0Var.h = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(currentScheme, z0Var);
                    if (obj != coroutine_suspended) {
                        hceRemoteRepositoryImpl = this;
                        str4 = str;
                        str5 = str2;
                        str6 = str3;
                        j2 = j;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str7 = z0Var.b;
                    hceRemoteRepositoryImpl2 = z0Var.f4342a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    mapIfSuccess = (com.payair.model.Response) obj;
                    hceRemoteRepositoryImpl = hceRemoteRepositoryImpl2;
                    str5 = str7;
                    if (mapIfSuccess instanceof com.payair.model.Response.Success) {
                        java.lang.Object data = ((com.payair.model.Response.Success) mapIfSuccess).getData();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(data, "");
                        com.payair.model.CompleteTokenizeData completeTokenizeData = (com.payair.model.CompleteTokenizeData) data;
                        if (completeTokenizeData.getStatus() != com.payair.model.TokenStatus.DECLINED) {
                            kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(hceRemoteRepositoryImpl.i.getIOScope(), null, null, new com.payair.csdk.a1(hceRemoteRepositoryImpl, completeTokenizeData, str5, null), 3, null);
                        }
                    }
                    return mapIfSuccess;
                }
                j2 = z0Var.e;
                str6 = z0Var.d;
                str5 = z0Var.c;
                str4 = z0Var.b;
                hceRemoteRepositoryImpl = z0Var.f4342a;
                kotlin.ResultKt.throwOnFailure(obj);
                com.payair.model.CardScheme cardScheme = (com.payair.model.CardScheme) obj;
                i2 = cardScheme != null ? -1 : com.payair.logic.remote.repositories.HceRemoteRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[cardScheme.ordinal()];
                if (i2 != 1) {
                    com.payair.logic.remote.model.ResponseCompleteTokenizeDto completeTokenize = hceRemoteRepositoryImpl.f4469a.completeTokenize(str4, str5, new com.payair.logic.remote.model.RequestCompleteTokenizeDto(j2));
                    if (completeTokenize.isSuccessful()) {
                        try {
                            error = new com.payair.model.Response.Success(completeTokenize);
                        } catch (java.lang.ClassCastException unused) {
                            error = new com.payair.model.Response.Error(101, null, 2, null);
                        }
                    } else {
                        java.lang.Integer statusCode2 = completeTokenize.getStatusCode();
                        int i4 = 100;
                        if ((statusCode2 == null || statusCode2.intValue() != 0) && completeTokenize.getStatusCode() != null) {
                            statusCode = completeTokenize.getStatusCode();
                        } else {
                            java.lang.Integer statusCodeFromServer = completeTokenize.getStatusCodeFromServer();
                            statusCode = ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && completeTokenize.getStatusCodeFromServer() != null) ? completeTokenize.getStatusCodeFromServer() : 100;
                        }
                        if (statusCode != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
                            i4 = statusCode.intValue();
                        }
                        java.util.List<com.payair.hce.ErrorModel> errors = completeTokenize.getErrors();
                        if (errors != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(errors);
                            emptyList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(errors, 10));
                            for (com.payair.hce.ErrorModel errorModel : errors) {
                                com.payair.csdk.w1.a(errorModel, errorModel, emptyList);
                            }
                        } else {
                            emptyList = kotlin.collections.CollectionsKt.emptyList();
                        }
                        error = new com.payair.model.Response.Error(i4, emptyList);
                    }
                    mapIfSuccess = com.payair.model.ResponseKt.mapIfSuccess(error, com.payair.csdk.b1.f4232a);
                } else {
                    if (i2 == 2) {
                        if (str6 == null) {
                            str6 = "";
                        }
                        z0Var.f4342a = hceRemoteRepositoryImpl;
                        z0Var.b = str5;
                        z0Var.c = null;
                        z0Var.d = null;
                        z0Var.h = 2;
                        obj = hceRemoteRepositoryImpl.a(j2, str5, str6, z0Var);
                        if (obj != coroutine_suspended) {
                            str7 = str5;
                            hceRemoteRepositoryImpl2 = hceRemoteRepositoryImpl;
                            mapIfSuccess = (com.payair.model.Response) obj;
                            hceRemoteRepositoryImpl = hceRemoteRepositoryImpl2;
                            str5 = str7;
                        }
                        return coroutine_suspended;
                    }
                    mapIfSuccess = new com.payair.model.Response.Error(111, null, 2, null);
                }
                if (mapIfSuccess instanceof com.payair.model.Response.Success) {
                }
                return mapIfSuccess;
            }
        }
        z0Var = new com.payair.csdk.z0(this, continuation);
        java.lang.Object obj2 = z0Var.f;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = z0Var.h;
        if (i != 0) {
        }
        com.payair.model.CardScheme cardScheme2 = (com.payair.model.CardScheme) obj2;
        if (cardScheme2 != null) {
        }
        if (i2 != 1) {
        }
        if (mapIfSuccess instanceof com.payair.model.Response.Success) {
        }
        return mapIfSuccess;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.util.List] */
    @Override // com.payair.logic.remote.repositories.HceRemoteRepository
    public final com.payair.model.Response deleteToken(java.lang.String paymentAppInstanceId, java.lang.String networkTokenReference, com.payair.model.ReasonCode reasonCode, java.lang.String reason) {
        com.payair.model.Response error;
        java.lang.Integer statusCode;
        ?? emptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAppInstanceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(reasonCode, "");
        com.payair.hce.communication.JsonResponse deleteToken = this.f4469a.deleteToken(paymentAppInstanceId, networkTokenReference, reasonCode, reason);
        if (deleteToken.isSuccessful()) {
            try {
                error = new com.payair.model.Response.Success(deleteToken);
            } catch (java.lang.ClassCastException unused) {
                error = new com.payair.model.Response.Error(101, null, 2, null);
            }
        } else {
            java.lang.Integer statusCode2 = deleteToken.getStatusCode();
            int i = 100;
            if ((statusCode2 == null || statusCode2.intValue() != 0) && deleteToken.getStatusCode() != null) {
                statusCode = deleteToken.getStatusCode();
            } else {
                java.lang.Integer statusCodeFromServer = deleteToken.getStatusCodeFromServer();
                statusCode = ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && deleteToken.getStatusCodeFromServer() != null) ? deleteToken.getStatusCodeFromServer() : 100;
            }
            if (statusCode != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
                i = statusCode.intValue();
            }
            java.util.List<com.payair.hce.ErrorModel> errors = deleteToken.getErrors();
            if (errors != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(errors);
                emptyList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(errors, 10));
                for (com.payair.hce.ErrorModel errorModel : errors) {
                    com.payair.csdk.w1.a(errorModel, errorModel, emptyList);
                }
            } else {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            error = new com.payair.model.Response.Error(i, emptyList);
        }
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.i.getIOScope(), null, null, new com.payair.csdk.d1(this, networkTokenReference, null), 3, null);
        return error;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List] */
    @Override // com.payair.logic.remote.repositories.HceRemoteRepository
    public final com.payair.model.Response request3dsUrl(java.lang.String paymentAppInstanceId, java.lang.String networkTokenReference, java.lang.String authenticationMethodId) {
        com.payair.model.Response error;
        java.lang.Integer statusCode;
        ?? emptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAppInstanceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationMethodId, "");
        com.payair.hce.communication.JsonResponse requestActivationCode = this.f4469a.requestActivationCode(paymentAppInstanceId, networkTokenReference, new com.payair.logic.remote.model.RequestAuthenticationCodeDto(authenticationMethodId));
        if (requestActivationCode.isSuccessful()) {
            try {
                error = new com.payair.model.Response.Success((com.payair.logic.remote.model.ResponseRequestAuthenticationCodeDto) requestActivationCode);
            } catch (java.lang.ClassCastException unused) {
                error = new com.payair.model.Response.Error(101, null, 2, null);
            }
        } else {
            java.lang.Integer statusCode2 = requestActivationCode.getStatusCode();
            int i = 100;
            if ((statusCode2 == null || statusCode2.intValue() != 0) && requestActivationCode.getStatusCode() != null) {
                statusCode = requestActivationCode.getStatusCode();
            } else {
                java.lang.Integer statusCodeFromServer = requestActivationCode.getStatusCodeFromServer();
                statusCode = ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && requestActivationCode.getStatusCodeFromServer() != null) ? requestActivationCode.getStatusCodeFromServer() : 100;
            }
            if (statusCode != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
                i = statusCode.intValue();
            }
            java.util.List<com.payair.hce.ErrorModel> errors = requestActivationCode.getErrors();
            if (errors != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(errors);
                emptyList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(errors, 10));
                for (com.payair.hce.ErrorModel errorModel : errors) {
                    com.payair.csdk.w1.a(errorModel, errorModel, emptyList);
                }
            } else {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            error = new com.payair.model.Response.Error(i, emptyList);
        }
        return com.payair.model.ResponseKt.mapIfSuccess(error, com.payair.csdk.k1.f4273a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.List] */
    @Override // com.payair.logic.remote.repositories.HceRemoteRepository
    public final com.payair.model.Response requestActivationCode(java.lang.String paymentAppInstanceId, java.lang.String networkTokenReference, java.lang.String authenticationMethodId) {
        com.payair.model.Response error;
        java.lang.Integer statusCode;
        ?? emptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAppInstanceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authenticationMethodId, "");
        com.payair.hce.communication.JsonResponse requestActivationCode = this.f4469a.requestActivationCode(paymentAppInstanceId, networkTokenReference, new com.payair.logic.remote.model.RequestAuthenticationCodeDto(authenticationMethodId));
        if (requestActivationCode.isSuccessful()) {
            try {
                error = new com.payair.model.Response.Success(requestActivationCode);
            } catch (java.lang.ClassCastException unused) {
                error = new com.payair.model.Response.Error(101, null, 2, null);
            }
        } else {
            java.lang.Integer statusCode2 = requestActivationCode.getStatusCode();
            int i = 100;
            if ((statusCode2 == null || statusCode2.intValue() != 0) && requestActivationCode.getStatusCode() != null) {
                statusCode = requestActivationCode.getStatusCode();
            } else {
                java.lang.Integer statusCodeFromServer = requestActivationCode.getStatusCodeFromServer();
                statusCode = ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && requestActivationCode.getStatusCodeFromServer() != null) ? requestActivationCode.getStatusCodeFromServer() : 100;
            }
            if (statusCode != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
                i = statusCode.intValue();
            }
            java.util.List<com.payair.hce.ErrorModel> errors = requestActivationCode.getErrors();
            if (errors != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(errors);
                emptyList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(errors, 10));
                for (com.payair.hce.ErrorModel errorModel : errors) {
                    com.payair.csdk.w1.a(errorModel, errorModel, emptyList);
                }
            } else {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            error = new com.payair.model.Response.Error(i, emptyList);
        }
        return com.payair.model.ResponseKt.mapIfSuccess(error, com.payair.csdk.l1.f4278a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.util.List] */
    @Override // com.payair.logic.remote.repositories.HceRemoteRepository
    public final com.payair.model.Response sendAuthenticationCode(java.lang.String paymentAppInstanceId, java.lang.String networkTokenReference, java.lang.String authenticationCode, java.lang.String tav, java.lang.String threeDSecureAuthenticationValue) {
        com.payair.model.Response error;
        java.lang.Integer statusCode;
        ?? emptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAppInstanceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTokenReference, "");
        com.payair.logic.remote.model.ResponseSendAuthenticationCodeDto sendAuthenticationCode = this.f4469a.sendAuthenticationCode(paymentAppInstanceId, networkTokenReference, new com.payair.logic.remote.model.SendAuthenticationCodeDto(authenticationCode, tav, threeDSecureAuthenticationValue, java.lang.String.valueOf(java.lang.System.currentTimeMillis() / 1000)));
        if (sendAuthenticationCode.isSuccessful()) {
            try {
                error = new com.payair.model.Response.Success(sendAuthenticationCode);
            } catch (java.lang.ClassCastException unused) {
                error = new com.payair.model.Response.Error(101, null, 2, null);
            }
        } else {
            java.lang.Integer statusCode2 = sendAuthenticationCode.getStatusCode();
            int i = 100;
            if ((statusCode2 == null || statusCode2.intValue() != 0) && sendAuthenticationCode.getStatusCode() != null) {
                statusCode = sendAuthenticationCode.getStatusCode();
            } else {
                java.lang.Integer statusCodeFromServer = sendAuthenticationCode.getStatusCodeFromServer();
                statusCode = ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && sendAuthenticationCode.getStatusCodeFromServer() != null) ? sendAuthenticationCode.getStatusCodeFromServer() : 100;
            }
            if (statusCode != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
                i = statusCode.intValue();
            }
            java.util.List<com.payair.hce.ErrorModel> errors = sendAuthenticationCode.getErrors();
            if (errors != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(errors);
                emptyList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(errors, 10));
                for (com.payair.hce.ErrorModel errorModel : errors) {
                    com.payair.csdk.w1.a(errorModel, errorModel, emptyList);
                }
            } else {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            error = new com.payair.model.Response.Error(i, emptyList);
        }
        return com.payair.model.ResponseKt.mapIfSuccess(error, com.payair.csdk.m1.f4283a);
    }

    @Override // com.payair.logic.remote.repositories.HceRemoteRepository
    public final java.lang.Object startTokenization(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.model.Response error;
        java.lang.Integer statusCode;
        java.util.List emptyList;
        com.payair.logic.remote.model.ResponseStartTokenizeDto startTokenize = this.f4469a.startTokenize(str, new com.payair.logic.remote.model.RequestStartTokenizeDto(str2, str3));
        if (startTokenize.isSuccessful()) {
            try {
                error = new com.payair.model.Response.Success(startTokenize);
            } catch (java.lang.ClassCastException unused) {
                error = new com.payair.model.Response.Error(101, null, 2, null);
            }
        } else {
            java.lang.Integer statusCode2 = startTokenize.getStatusCode();
            int i = 100;
            if ((statusCode2 == null || statusCode2.intValue() != 0) && startTokenize.getStatusCode() != null) {
                statusCode = startTokenize.getStatusCode();
            } else {
                java.lang.Integer statusCodeFromServer = startTokenize.getStatusCodeFromServer();
                statusCode = ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && startTokenize.getStatusCodeFromServer() != null) ? startTokenize.getStatusCodeFromServer() : kotlin.coroutines.jvm.internal.Boxing.boxInt(100);
            }
            if (statusCode != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
                i = statusCode.intValue();
            }
            java.util.List<com.payair.hce.ErrorModel> errors = startTokenize.getErrors();
            if (errors != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(errors);
                emptyList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(errors, 10));
                for (com.payair.hce.ErrorModel errorModel : errors) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(errorModel);
                    emptyList.add(com.payair.logic.implementation.HceSDKinterfaceKt.toNetworkError(errorModel));
                }
            } else {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            error = new com.payair.model.Response.Error(i, emptyList);
        }
        return a(error, continuation);
    }

    @Override // com.payair.logic.remote.repositories.HceRemoteRepository
    /* renamed from: startTokenization-UF1who8 */
    public final java.lang.Object mo10972startTokenizationUF1who8(java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.model.Response error;
        java.lang.Integer statusCode;
        java.util.List emptyList;
        com.payair.logic.remote.model.ResponseStartTokenizeDto startTokenize = this.f4469a.startTokenize(str, new com.payair.logic.remote.model.RequestStartTokenizePushReceipt(str2, str3));
        if (startTokenize.isSuccessful()) {
            try {
                error = new com.payair.model.Response.Success(startTokenize);
            } catch (java.lang.ClassCastException unused) {
                error = new com.payair.model.Response.Error(101, null, 2, null);
            }
        } else {
            java.lang.Integer statusCode2 = startTokenize.getStatusCode();
            int i = 100;
            if ((statusCode2 == null || statusCode2.intValue() != 0) && startTokenize.getStatusCode() != null) {
                statusCode = startTokenize.getStatusCode();
            } else {
                java.lang.Integer statusCodeFromServer = startTokenize.getStatusCodeFromServer();
                statusCode = ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && startTokenize.getStatusCodeFromServer() != null) ? startTokenize.getStatusCodeFromServer() : kotlin.coroutines.jvm.internal.Boxing.boxInt(100);
            }
            if (statusCode != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
                i = statusCode.intValue();
            }
            java.util.List<com.payair.hce.ErrorModel> errors = startTokenize.getErrors();
            if (errors != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(errors);
                emptyList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(errors, 10));
                for (com.payair.hce.ErrorModel errorModel : errors) {
                    kotlin.jvm.internal.Intrinsics.checkNotNull(errorModel);
                    emptyList.add(com.payair.logic.implementation.HceSDKinterfaceKt.toNetworkError(errorModel));
                }
            } else {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            error = new com.payair.model.Response.Error(i, emptyList);
        }
        return a(error, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.util.ArrayList] */
    @Override // com.payair.logic.remote.repositories.HceRemoteRepository
    public final com.payair.model.Response startTokenizeAllCards(java.lang.String paymentAppInstanceId, com.payair.model.StartTokenizeAllCardsRequestData startTokenizeAllCardsRequestData) {
        com.payair.model.Response error;
        java.lang.Integer statusCode;
        ?? emptyList;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(paymentAppInstanceId, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(startTokenizeAllCardsRequestData, "");
        com.payair.logic.remote.remoteServices.ProvisioningService provisioningService = this.f4469a;
        java.lang.String userReference = startTokenizeAllCardsRequestData.getUserReference();
        java.lang.String authRef = startTokenizeAllCardsRequestData.getAuthRef();
        java.lang.String issuerId = startTokenizeAllCardsRequestData.getIssuerId();
        java.lang.String issuerSubSection = startTokenizeAllCardsRequestData.getIssuerSubSection();
        com.payair.logic.remote.model.ResponseStartTokenizeAllCardsDto startTokenizeAllCards = provisioningService.startTokenizeAllCards(paymentAppInstanceId, new com.payair.logic.remote.model.RequestStartTokenizeAllCardsDto(userReference, authRef, issuerId, issuerSubSection != null ? issuerSubSection : ""));
        if (startTokenizeAllCards.isSuccessful()) {
            try {
                error = new com.payair.model.Response.Success(startTokenizeAllCards);
            } catch (java.lang.ClassCastException unused) {
                error = new com.payair.model.Response.Error(101, null, 2, null);
            }
        } else {
            java.lang.Integer statusCode2 = startTokenizeAllCards.getStatusCode();
            int i = 100;
            if ((statusCode2 == null || statusCode2.intValue() != 0) && startTokenizeAllCards.getStatusCode() != null) {
                statusCode = startTokenizeAllCards.getStatusCode();
            } else {
                java.lang.Integer statusCodeFromServer = startTokenizeAllCards.getStatusCodeFromServer();
                statusCode = ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && startTokenizeAllCards.getStatusCodeFromServer() != null) ? startTokenizeAllCards.getStatusCodeFromServer() : 100;
            }
            if (statusCode != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
                i = statusCode.intValue();
            }
            java.util.List<com.payair.hce.ErrorModel> errors = startTokenizeAllCards.getErrors();
            if (errors != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(errors);
                emptyList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(errors, 10));
                for (com.payair.hce.ErrorModel errorModel : errors) {
                    com.payair.csdk.w1.a(errorModel, errorModel, emptyList);
                }
            } else {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            error = new com.payair.model.Response.Error(i, emptyList);
        }
        return com.payair.model.ResponseKt.mapIfSuccess(error, new com.payair.csdk.s1(this));
    }

    public static final java.lang.String access$decodeStringFromBase64(com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl, java.lang.String str) {
        byte[] decodeBase64 = codec.binary.Base64.decodeBase64(str);
        kotlin.jvm.internal.Intrinsics.checkNotNull(decodeBase64);
        return new java.lang.String(decodeBase64, kotlin.text.Charsets.UTF_8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0101, code lost:
    
        if (r0.g.getTokenDetailsDao().insert(new com.payair.db.token.TokenDetailsEntry[]{r1}, r2) != r3) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object access$insertIntoDb(com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl, com.payair.model.CompleteTokenizeData completeTokenizeData, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.h1 h1Var;
        int i;
        java.lang.String networkTokenReference;
        com.payair.model.TokenInfoModel tokenInfoModel;
        com.payair.model.ProductConfig productConfig;
        com.payair.model.TokenStatus tokenStatus;
        com.payair.model.CardScheme cardScheme;
        com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl2 = hceRemoteRepositoryImpl;
        if (continuation instanceof com.payair.csdk.h1) {
            h1Var = (com.payair.csdk.h1) continuation;
            int i2 = h1Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h1Var.h = i2 - 2147483648;
                java.lang.Object obj = h1Var.f;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = h1Var.h;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    networkTokenReference = completeTokenizeData.getNetworkTokenReference();
                    com.payair.model.TokenStatus tokenStatus2 = com.payair.model.TokenStatus.UNKNOWN;
                    com.payair.model.TokenInfoModel tokenInfoModel2 = new com.payair.model.TokenInfoModel(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
                    com.payair.model.ProductConfig productConfig2 = completeTokenizeData.getProductConfig();
                    if (productConfig2 == null) {
                        productConfig2 = new com.payair.model.ProductConfig(null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, 33554431, null);
                    }
                    kotlinx.coroutines.flow.Flow<com.payair.model.CardScheme> currentScheme = hceRemoteRepositoryImpl2.e.getCurrentScheme();
                    h1Var.f4258a = hceRemoteRepositoryImpl2;
                    h1Var.b = networkTokenReference;
                    h1Var.c = tokenStatus2;
                    h1Var.d = tokenInfoModel2;
                    h1Var.e = productConfig2;
                    h1Var.h = 1;
                    java.lang.Object firstOrNull = kotlinx.coroutines.flow.FlowKt.firstOrNull(currentScheme, h1Var);
                    if (firstOrNull != coroutine_suspended) {
                        tokenInfoModel = tokenInfoModel2;
                        productConfig = productConfig2;
                        tokenStatus = tokenStatus2;
                        obj = firstOrNull;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return kotlin.Unit.INSTANCE;
                }
                com.payair.model.ProductConfig productConfig3 = h1Var.e;
                com.payair.model.TokenInfoModel tokenInfoModel3 = h1Var.d;
                com.payair.model.TokenStatus tokenStatus3 = h1Var.c;
                networkTokenReference = h1Var.b;
                com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl3 = h1Var.f4258a;
                kotlin.ResultKt.throwOnFailure(obj);
                productConfig = productConfig3;
                tokenInfoModel = tokenInfoModel3;
                hceRemoteRepositoryImpl2 = hceRemoteRepositoryImpl3;
                tokenStatus = tokenStatus3;
                cardScheme = (com.payair.model.CardScheme) obj;
                if (cardScheme == null) {
                    cardScheme = com.payair.model.CardScheme.MASTERCARD;
                }
                com.payair.db.token.TokenDetailsEntry tokenDetailsEntry = new com.payair.db.token.TokenDetailsEntry(networkTokenReference, tokenStatus, tokenInfoModel, productConfig, cardScheme, null, null, 96, null);
                h1Var.f4258a = null;
                h1Var.b = null;
                h1Var.c = null;
                h1Var.d = null;
                h1Var.e = null;
                h1Var.h = 2;
            }
        }
        h1Var = new com.payair.csdk.h1(hceRemoteRepositoryImpl2, continuation);
        java.lang.Object obj2 = h1Var.f;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = h1Var.h;
        if (i != 0) {
        }
        cardScheme = (com.payair.model.CardScheme) obj2;
        if (cardScheme == null) {
        }
        com.payair.db.token.TokenDetailsEntry tokenDetailsEntry2 = new com.payair.db.token.TokenDetailsEntry(networkTokenReference, tokenStatus, tokenInfoModel, productConfig, cardScheme, null, null, 96, null);
        h1Var.f4258a = null;
        h1Var.b = null;
        h1Var.c = null;
        h1Var.d = null;
        h1Var.e = null;
        h1Var.h = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v16, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(long j, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.c1 c1Var;
        int i;
        java.lang.Object error;
        com.payair.model.CompleteTokenizeData completeTokenizeData$core_release;
        java.lang.Integer statusCode;
        ?? emptyList;
        if (continuation instanceof com.payair.csdk.c1) {
            c1Var = (com.payair.csdk.c1) continuation;
            int i2 = c1Var.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1Var.d = i2 - 2147483648;
                java.lang.Object obj = c1Var.b;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = c1Var.d;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.hce.communication.JsonResponse completeTokenize = this.h.completeTokenize(j, str, str2);
                    if (completeTokenize.isSuccessful()) {
                        try {
                            error = new com.payair.model.Response.Success((com.payair.hce.visa.dao.ResponseCompleteTokenizeDto) completeTokenize);
                        } catch (java.lang.ClassCastException unused) {
                            error = new com.payair.model.Response.Error(101, null, 2, null);
                        }
                    } else {
                        java.lang.Integer statusCode2 = completeTokenize.getStatusCode();
                        int i3 = 100;
                        if ((statusCode2 == null || statusCode2.intValue() != 0) && completeTokenize.getStatusCode() != null) {
                            statusCode = completeTokenize.getStatusCode();
                        } else {
                            java.lang.Integer statusCodeFromServer = completeTokenize.getStatusCodeFromServer();
                            if ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && completeTokenize.getStatusCodeFromServer() != null) {
                                statusCode = completeTokenize.getStatusCodeFromServer();
                            } else {
                                statusCode = kotlin.coroutines.jvm.internal.Boxing.boxInt(100);
                            }
                        }
                        if (statusCode != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
                            i3 = statusCode.intValue();
                        }
                        java.util.List<com.payair.hce.ErrorModel> errors = completeTokenize.getErrors();
                        if (errors != null) {
                            kotlin.jvm.internal.Intrinsics.checkNotNull(errors);
                            emptyList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(errors, 10));
                            for (com.payair.hce.ErrorModel errorModel : errors) {
                                com.payair.csdk.w1.a(errorModel, errorModel, emptyList);
                            }
                        } else {
                            emptyList = kotlin.collections.CollectionsKt.emptyList();
                        }
                        error = new com.payair.model.Response.Error(i3, emptyList);
                    }
                    if (!(error instanceof com.payair.model.Response.Success)) {
                        return error;
                    }
                    java.lang.Object data = ((com.payair.model.Response.Success) error).getData();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(data, "");
                    completeTokenizeData$core_release = INSTANCE.toCompleteTokenizeData$core_release((com.payair.hce.visa.dao.ResponseCompleteTokenizeDto) data);
                    com.payair.logic.storage.EnrollmentIdStorage enrollmentIdStorage = this.f;
                    java.lang.String networkTokenReference = completeTokenizeData$core_release.getNetworkTokenReference();
                    c1Var.f4237a = completeTokenizeData$core_release;
                    c1Var.d = 1;
                    if (enrollmentIdStorage.assignNtrToEnrollmentId(str2, networkTokenReference, c1Var) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    completeTokenizeData$core_release = c1Var.f4237a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return new com.payair.model.Response.Success(completeTokenizeData$core_release);
            }
        }
        c1Var = new com.payair.csdk.c1(this, continuation);
        java.lang.Object obj2 = c1Var.b;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = c1Var.d;
        if (i != 0) {
        }
        return new com.payair.model.Response.Success(completeTokenizeData$core_release);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0134, code lost:
    
        if (r0 == r13) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ef, code lost:
    
        if (r0 != r13) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // com.payair.logic.remote.repositories.HceRemoteRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object startTokenization(java.lang.String str, com.payair.model.CardData cardData, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.csdk.p1 p1Var;
        int i;
        java.lang.String str3;
        com.payair.model.CardData cardData2;
        java.lang.String str4;
        com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl;
        com.payair.model.Response response;
        com.payair.model.CardScheme cardScheme;
        if (continuation instanceof com.payair.csdk.p1) {
            p1Var = (com.payair.csdk.p1) continuation;
            int i2 = p1Var.g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p1Var.g = i2 - 2147483648;
                com.payair.csdk.p1 p1Var2 = p1Var;
                java.lang.Object obj = p1Var2.e;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = p1Var2.g;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.model.Response a2 = a(true);
                    if (!(a2 instanceof com.payair.model.Response.Success)) {
                        return a2;
                    }
                    java.lang.Object data = ((com.payair.model.Response.Success) a2).getData();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(data, "");
                    p1Var2.f4298a = this;
                    str3 = str;
                    p1Var2.b = str3;
                    cardData2 = cardData;
                    p1Var2.c = cardData2;
                    str4 = str2;
                    p1Var2.d = str4;
                    p1Var2.g = 1;
                    obj = a(str, (java.lang.String) data, cardData, str2, p1Var2);
                    if (obj != coroutine_suspended) {
                        hceRemoteRepositoryImpl = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i == 2) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        return (com.payair.model.Response) obj;
                    }
                    if (i != 3) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    response = (com.payair.model.Response) p1Var2.b;
                    com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl2 = p1Var2.f4298a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (((java.lang.Boolean) obj).booleanValue()) {
                        return new com.payair.model.Response.Error(115, ((com.payair.model.Response.Error) response).getNetworkErrors());
                    }
                    return a((com.payair.model.Response.Error) response);
                }
                java.lang.String str5 = p1Var2.d;
                com.payair.model.CardData cardData3 = p1Var2.c;
                java.lang.String str6 = (java.lang.String) p1Var2.b;
                hceRemoteRepositoryImpl = p1Var2.f4298a;
                kotlin.ResultKt.throwOnFailure(obj);
                str4 = str5;
                cardData2 = cardData3;
                str3 = str6;
                response = (com.payair.model.Response) obj;
                if (response instanceof com.payair.model.Response.Error) {
                    return response;
                }
                com.payair.model.Response.Error error = (com.payair.model.Response.Error) response;
                java.util.List<com.payair.model.NetworkError> networkErrors = error.getNetworkErrors();
                if (!(networkErrors instanceof java.util.Collection) || !networkErrors.isEmpty()) {
                    java.util.Iterator<T> it = networkErrors.iterator();
                    while (it.hasNext()) {
                        if (kotlin.jvm.internal.Intrinsics.areEqual(((com.payair.model.NetworkError) it.next()).getReasonCode(), "CRYPTOGRAPHY_ERROR")) {
                            com.payair.model.Response a3 = hceRemoteRepositoryImpl.a(false);
                            if (!(a3 instanceof com.payair.model.Response.Success)) {
                                return a3 instanceof com.payair.model.Response.Error ? a((com.payair.model.Response.Error) a3) : a3;
                            }
                            java.lang.Object data2 = ((com.payair.model.Response.Success) a3).getData();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(data2, "");
                            p1Var2.f4298a = null;
                            p1Var2.b = null;
                            p1Var2.c = null;
                            p1Var2.d = null;
                            p1Var2.g = 2;
                            obj = hceRemoteRepositoryImpl.a(str3, (java.lang.String) data2, cardData2, str4, p1Var2);
                        }
                    }
                }
                int i3 = com.payair.logic.remote.repositories.HceRemoteRepositoryImpl.WhenMappings.$EnumSwitchMapping$1[com.payair.logic.cardvalidation.IssuerCardSpecs.INSTANCE.getIssuer(cardData2.getPan()).ordinal()];
                if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4 && i3 == 5) {
                    cardScheme = com.payair.model.CardScheme.VISA;
                } else {
                    cardScheme = com.payair.model.CardScheme.MASTERCARD;
                }
                p1Var2.f4298a = hceRemoteRepositoryImpl;
                p1Var2.b = response;
                p1Var2.c = null;
                p1Var2.d = null;
                p1Var2.g = 3;
                obj = hceRemoteRepositoryImpl.a(error, cardScheme, p1Var2);
            }
        }
        p1Var = new com.payair.csdk.p1(this, continuation);
        com.payair.csdk.p1 p1Var22 = p1Var;
        java.lang.Object obj2 = p1Var22.e;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = p1Var22.g;
        if (i != 0) {
        }
        response = (com.payair.model.Response) obj2;
        if (response instanceof com.payair.model.Response.Error) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        if (r6.deleteEnrolledVisa(r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
    
        if (r6.deleteEnrolledMastercard(r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.payair.model.Response.Error error, com.payair.model.CardScheme cardScheme, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.i1 i1Var;
        int i;
        if (continuation instanceof com.payair.csdk.i1) {
            i1Var = (com.payair.csdk.i1) continuation;
            int i2 = i1Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i1Var.c = i2 - 2147483648;
                java.lang.Object obj = i1Var.f4263a;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = i1Var.c;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (error.getErrorCode() == 412) {
                        int i3 = com.payair.logic.remote.repositories.HceRemoteRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[cardScheme.ordinal()];
                        if (i3 == 1) {
                            com.payair.logic.storage.SchemeStorage schemeStorage = this.e;
                            i1Var.c = 1;
                        } else if (i3 == 2) {
                            com.payair.logic.storage.SchemeStorage schemeStorage2 = this.e;
                            i1Var.c = 2;
                        }
                    } else {
                        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                    }
                } else {
                    if (i != 1 && i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
            }
        }
        i1Var = new com.payair.csdk.i1(this, continuation);
        java.lang.Object obj2 = i1Var.f4263a;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = i1Var.c;
        if (i != 0) {
        }
        return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
    }

    public static com.payair.model.Response.Error a(com.payair.model.Response.Error error) {
        java.util.List<com.payair.model.NetworkError> networkErrors = error.getNetworkErrors();
        if (!(networkErrors instanceof java.util.Collection) || !networkErrors.isEmpty()) {
            java.util.Iterator<T> it = networkErrors.iterator();
            while (it.hasNext()) {
                if (kotlin.jvm.internal.Intrinsics.areEqual(((com.payair.model.NetworkError) it.next()).getReasonCode(), "DUPLICATE_REQUEST")) {
                    return new com.payair.model.Response.Error(110, error.getNetworkErrors());
                }
            }
        }
        return error;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.util.ArrayList] */
    public final com.payair.model.Response a(boolean z) {
        com.payair.model.Response error;
        java.lang.Integer statusCode;
        ?? emptyList;
        if (z) {
            java.lang.String storedCertificate = this.b.getStoredCertificate();
            if (!kotlin.text.StringsKt.isBlank(storedCertificate)) {
                return new com.payair.model.Response.Success(storedCertificate);
            }
        }
        com.payair.logic.remote.model.ResponseGetCSDKPKCertificateDto csdkCertificate = this.f4469a.getCsdkCertificate();
        if (csdkCertificate.isSuccessful()) {
            try {
                error = new com.payair.model.Response.Success(csdkCertificate);
            } catch (java.lang.ClassCastException unused) {
                error = new com.payair.model.Response.Error(101, null, 2, null);
            }
        } else {
            java.lang.Integer statusCode2 = csdkCertificate.getStatusCode();
            int i = 100;
            if ((statusCode2 == null || statusCode2.intValue() != 0) && csdkCertificate.getStatusCode() != null) {
                statusCode = csdkCertificate.getStatusCode();
            } else {
                java.lang.Integer statusCodeFromServer = csdkCertificate.getStatusCodeFromServer();
                if ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && csdkCertificate.getStatusCodeFromServer() != null) {
                    statusCode = csdkCertificate.getStatusCodeFromServer();
                } else {
                    statusCode = 100;
                }
            }
            if (statusCode != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
                i = statusCode.intValue();
            }
            java.util.List<com.payair.hce.ErrorModel> errors = csdkCertificate.getErrors();
            if (errors != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(errors);
                emptyList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(errors, 10));
                for (com.payair.hce.ErrorModel errorModel : errors) {
                    com.payair.csdk.w1.a(errorModel, errorModel, emptyList);
                }
            } else {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            error = new com.payair.model.Response.Error(i, emptyList);
        }
        com.payair.model.Response mapIfSuccess = com.payair.model.ResponseKt.mapIfSuccess(error, new com.payair.csdk.f1(this));
        if (mapIfSuccess instanceof com.payair.model.Response.Success) {
            com.payair.logic.storage.implementation.CertificateStorage certificateStorage = this.b;
            java.lang.Object data = ((com.payair.model.Response.Success) mapIfSuccess).getData();
            kotlin.jvm.internal.Intrinsics.checkNotNull(data, "");
            certificateStorage.storeCertificate((java.lang.String) data);
        }
        return mapIfSuccess;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, java.lang.String str2, com.payair.model.CardData cardData, java.lang.String str3, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.e1 e1Var;
        java.lang.Object coroutine_suspended;
        int i;
        com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl;
        java.lang.String str4;
        java.lang.String str5;
        com.payair.model.CardScheme cardScheme;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        try {
            if (continuation instanceof com.payair.csdk.e1) {
                e1Var = (com.payair.csdk.e1) continuation;
                int i2 = e1Var.h;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    e1Var.h = i2 - 2147483648;
                    com.payair.csdk.e1 e1Var2 = e1Var;
                    java.lang.Object obj = e1Var2.f;
                    coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = e1Var2.h;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        java.lang.String encryptionAlgorithm = this.c.getEncryptionAlgorithm(str2);
                        java.lang.String encryptCardData = this.c.encryptCardData(str2, cardData);
                        int i3 = com.payair.logic.remote.repositories.HceRemoteRepositoryImpl.WhenMappings.$EnumSwitchMapping$1[com.payair.logic.cardvalidation.IssuerCardSpecs.INSTANCE.getIssuer(cardData.getPan()).ordinal()];
                        if (i3 == 1 || i3 == 2 || i3 == 3 || i3 == 4) {
                            hceRemoteRepositoryImpl = this;
                            str4 = str;
                            str5 = encryptCardData;
                            cardScheme = com.payair.model.CardScheme.MASTERCARD;
                            str6 = str3;
                            str7 = encryptionAlgorithm;
                            e1Var2.f4245a = null;
                            e1Var2.b = null;
                            e1Var2.c = null;
                            e1Var2.d = null;
                            e1Var2.e = null;
                            e1Var2.h = 2;
                            java.lang.Object a2 = hceRemoteRepositoryImpl.a(str4, str7, str5, str6, cardScheme, e1Var2);
                            return a2 == coroutine_suspended ? coroutine_suspended : a2;
                        }
                        if (i3 != 5) {
                            return new com.payair.model.Response.Error(111, null, 2, null);
                        }
                        java.lang.String cvv = cardData.getCvv();
                        e1Var2.f4245a = this;
                        e1Var2.b = str;
                        e1Var2.c = str3;
                        e1Var2.d = encryptionAlgorithm;
                        e1Var2.e = encryptCardData;
                        e1Var2.h = 1;
                        if (a(cvv, e1Var2) != coroutine_suspended) {
                            hceRemoteRepositoryImpl = this;
                            str8 = str3;
                            str9 = str;
                            str5 = encryptCardData;
                            str7 = encryptionAlgorithm;
                        }
                    }
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    str5 = e1Var2.e;
                    str7 = e1Var2.d;
                    str8 = e1Var2.c;
                    str9 = e1Var2.b;
                    hceRemoteRepositoryImpl = e1Var2.f4245a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    str6 = str8;
                    str4 = str9;
                    cardScheme = com.payair.model.CardScheme.VISA;
                    e1Var2.f4245a = null;
                    e1Var2.b = null;
                    e1Var2.c = null;
                    e1Var2.d = null;
                    e1Var2.e = null;
                    e1Var2.h = 2;
                    java.lang.Object a22 = hceRemoteRepositoryImpl.a(str4, str7, str5, str6, cardScheme, e1Var2);
                    if (a22 == coroutine_suspended) {
                    }
                }
            }
            if (i != 0) {
            }
            str6 = str8;
            str4 = str9;
            cardScheme = com.payair.model.CardScheme.VISA;
            e1Var2.f4245a = null;
            e1Var2.b = null;
            e1Var2.c = null;
            e1Var2.d = null;
            e1Var2.e = null;
            e1Var2.h = 2;
            java.lang.Object a222 = hceRemoteRepositoryImpl.a(str4, str7, str5, str6, cardScheme, e1Var2);
            if (a222 == coroutine_suspended) {
            }
        } catch (java.lang.Exception e) {
            com.payair.logging.LoggerKt.getLog().e("Error in encryptCardDataAndStartTokenize", e);
            return new com.payair.model.Response.Error(113, null, 2, null);
        }
        e1Var = new com.payair.csdk.e1(this, continuation);
        com.payair.csdk.e1 e1Var22 = e1Var;
        java.lang.Object obj2 = e1Var22.f;
        coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = e1Var22.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0135, code lost:
    
        if (r2 != r4) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.util.ArrayList] */
    @Override // com.payair.logic.remote.repositories.HceRemoteRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object startTokenization(java.lang.String str, com.payair.model.EncryptedCardForTokenization encryptedCardForTokenization, com.payair.model.CardScheme cardScheme, java.lang.String str2, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.csdk.q1 q1Var;
        java.lang.Object obj;
        int i;
        java.lang.String str3;
        com.payair.model.EncryptedCardForTokenization encryptedCardForTokenization2;
        java.lang.String str4;
        com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl;
        com.payair.model.Response error;
        java.lang.Integer statusCode;
        ?? emptyList;
        com.payair.model.Response response;
        com.payair.model.CardScheme cardScheme2 = cardScheme;
        if (continuation instanceof com.payair.csdk.q1) {
            q1Var = (com.payair.csdk.q1) continuation;
            int i2 = q1Var.h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q1Var.h = i2 - 2147483648;
                obj = q1Var.f;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = q1Var.h;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    q1Var.f4303a = this;
                    q1Var.b = str;
                    q1Var.c = encryptedCardForTokenization;
                    q1Var.d = cardScheme2;
                    q1Var.e = str2;
                    q1Var.h = 1;
                    java.lang.Object a2 = a(cardScheme2, q1Var);
                    if (a2 != coroutine_suspended) {
                        str3 = str;
                        encryptedCardForTokenization2 = encryptedCardForTokenization;
                        obj = a2;
                        str4 = str2;
                        hceRemoteRepositoryImpl = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        response = (com.payair.model.Response) q1Var.b;
                        com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl2 = q1Var.f4303a;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                            return new com.payair.model.Response.Error(115, ((com.payair.model.Response.Error) response).getNetworkErrors());
                        }
                        return a((com.payair.model.Response.Error) response);
                    }
                    cardScheme2 = (com.payair.model.CardScheme) q1Var.b;
                    hceRemoteRepositoryImpl = q1Var.f4303a;
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.model.Response response2 = (com.payair.model.Response) obj;
                    if (!(response2 instanceof com.payair.model.Response.Error)) {
                        return response2;
                    }
                    q1Var.f4303a = hceRemoteRepositoryImpl;
                    q1Var.b = response2;
                    q1Var.h = 3;
                    java.lang.Object a3 = hceRemoteRepositoryImpl.a((com.payair.model.Response.Error) response2, cardScheme2, q1Var);
                    if (a3 != coroutine_suspended) {
                        obj = a3;
                        response = response2;
                        if (!((java.lang.Boolean) obj).booleanValue()) {
                        }
                    }
                    return coroutine_suspended;
                }
                java.lang.String str5 = q1Var.e;
                com.payair.model.CardScheme cardScheme3 = q1Var.d;
                com.payair.model.EncryptedCardForTokenization encryptedCardForTokenization3 = q1Var.c;
                java.lang.String str6 = (java.lang.String) q1Var.b;
                com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl3 = q1Var.f4303a;
                kotlin.ResultKt.throwOnFailure(obj);
                str4 = str5;
                cardScheme2 = cardScheme3;
                encryptedCardForTokenization2 = encryptedCardForTokenization3;
                hceRemoteRepositoryImpl = hceRemoteRepositoryImpl3;
                str3 = str6;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return new com.payair.model.Response.Error(113, null, 2, null);
                }
                com.payair.logic.remote.model.ResponseStartTokenizeDto startTokenize = hceRemoteRepositoryImpl.f4469a.startTokenize(str3, encryptedCardForTokenization2, cardScheme2, a(), str4);
                if (startTokenize.isSuccessful()) {
                    try {
                        error = new com.payair.model.Response.Success(startTokenize);
                    } catch (java.lang.ClassCastException unused) {
                        error = new com.payair.model.Response.Error(101, null, 2, null);
                    }
                } else {
                    java.lang.Integer statusCode2 = startTokenize.getStatusCode();
                    int i3 = 100;
                    if ((statusCode2 == null || statusCode2.intValue() != 0) && startTokenize.getStatusCode() != null) {
                        statusCode = startTokenize.getStatusCode();
                    } else {
                        java.lang.Integer statusCodeFromServer = startTokenize.getStatusCodeFromServer();
                        if ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && startTokenize.getStatusCodeFromServer() != null) {
                            statusCode = startTokenize.getStatusCodeFromServer();
                        } else {
                            statusCode = kotlin.coroutines.jvm.internal.Boxing.boxInt(100);
                        }
                    }
                    if (statusCode != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
                        i3 = statusCode.intValue();
                    }
                    java.util.List<com.payair.hce.ErrorModel> errors = startTokenize.getErrors();
                    if (errors != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(errors);
                        emptyList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(errors, 10));
                        for (com.payair.hce.ErrorModel errorModel : errors) {
                            com.payair.csdk.w1.a(errorModel, errorModel, emptyList);
                        }
                    } else {
                        emptyList = kotlin.collections.CollectionsKt.emptyList();
                    }
                    error = new com.payair.model.Response.Error(i3, emptyList);
                }
                q1Var.f4303a = hceRemoteRepositoryImpl;
                q1Var.b = cardScheme2;
                q1Var.c = null;
                q1Var.d = null;
                q1Var.e = null;
                q1Var.h = 2;
                obj = hceRemoteRepositoryImpl.a(error, q1Var);
            }
        }
        q1Var = new com.payair.csdk.q1(this, continuation);
        obj = q1Var.f;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = q1Var.h;
        if (i != 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.payair.model.CardScheme cardScheme, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.n1 n1Var;
        java.lang.Object obj;
        int i;
        com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl;
        com.payair.model.Response error;
        java.lang.Integer statusCode;
        ?? emptyList;
        if (continuation instanceof com.payair.csdk.n1) {
            n1Var = (com.payair.csdk.n1) continuation;
            int i2 = n1Var.i;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n1Var.i = i2 - 2147483648;
                obj = n1Var.g;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = n1Var.i;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    n1Var.f4288a = this;
                    n1Var.b = str;
                    n1Var.c = str2;
                    n1Var.d = str3;
                    n1Var.e = str4;
                    n1Var.f = cardScheme;
                    n1Var.i = 1;
                    obj = a(cardScheme, n1Var);
                    if (obj != coroutine_suspended) {
                        hceRemoteRepositoryImpl = this;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    return obj;
                }
                cardScheme = n1Var.f;
                str4 = n1Var.e;
                str3 = n1Var.d;
                str2 = n1Var.c;
                str = n1Var.b;
                hceRemoteRepositoryImpl = n1Var.f4288a;
                kotlin.ResultKt.throwOnFailure(obj);
                if (((java.lang.Boolean) obj).booleanValue()) {
                    return new com.payair.model.Response.Error(113, null, 2, null);
                }
                com.payair.logic.remote.model.ResponseStartTokenizeDto startTokenize = hceRemoteRepositoryImpl.f4469a.startTokenize(str, new com.payair.logic.remote.model.RequestStartTokenizeCardDataDto(new com.payair.logic.remote.model.EncryptedCard(str2, str3), str4, a(), "UNKNOWN"), cardScheme);
                if (startTokenize.isSuccessful()) {
                    try {
                        error = new com.payair.model.Response.Success(startTokenize);
                    } catch (java.lang.ClassCastException unused) {
                        error = new com.payair.model.Response.Error(101, null, 2, null);
                    }
                } else {
                    java.lang.Integer statusCode2 = startTokenize.getStatusCode();
                    int i3 = 100;
                    if ((statusCode2 == null || statusCode2.intValue() != 0) && startTokenize.getStatusCode() != null) {
                        statusCode = startTokenize.getStatusCode();
                    } else {
                        java.lang.Integer statusCodeFromServer = startTokenize.getStatusCodeFromServer();
                        if ((statusCodeFromServer == null || statusCodeFromServer.intValue() != 0) && startTokenize.getStatusCodeFromServer() != null) {
                            statusCode = startTokenize.getStatusCodeFromServer();
                        } else {
                            statusCode = kotlin.coroutines.jvm.internal.Boxing.boxInt(100);
                        }
                    }
                    if (statusCode != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(statusCode);
                        i3 = statusCode.intValue();
                    }
                    java.util.List<com.payair.hce.ErrorModel> errors = startTokenize.getErrors();
                    if (errors != null) {
                        kotlin.jvm.internal.Intrinsics.checkNotNull(errors);
                        emptyList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(errors, 10));
                        for (com.payair.hce.ErrorModel errorModel : errors) {
                            com.payair.csdk.w1.a(errorModel, errorModel, emptyList);
                        }
                    } else {
                        emptyList = kotlin.collections.CollectionsKt.emptyList();
                    }
                    error = new com.payair.model.Response.Error(i3, emptyList);
                }
                n1Var.f4288a = null;
                n1Var.b = null;
                n1Var.c = null;
                n1Var.d = null;
                n1Var.e = null;
                n1Var.f = null;
                n1Var.i = 2;
                java.lang.Object a2 = hceRemoteRepositoryImpl.a(error, n1Var);
                return a2 == coroutine_suspended ? coroutine_suspended : a2;
            }
        }
        n1Var = new com.payair.csdk.n1(this, continuation);
        obj = n1Var.g;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = n1Var.i;
        if (i != 0) {
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0161, code lost:
    
        if (r2.storeScheme(r0, r3) != r4) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b8, code lost:
    
        if (r2 != r4) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0134, code lost:
    
        if (r2.mastercardEnrolled(r3) == r4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x011f, code lost:
    
        if (r2 != r4) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a2 A[Catch: Exception -> 0x004c, TRY_ENTER, TryCatch #0 {Exception -> 0x004c, blocks: (B:16:0x003e, B:21:0x0047, B:22:0x00ba, B:24:0x00c2, B:27:0x00d3, B:32:0x00a2), top: B:7:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.payair.model.CardScheme cardScheme, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.j1 j1Var;
        com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl;
        com.payair.model.CardScheme cardScheme2 = cardScheme;
        try {
            if (continuation instanceof com.payair.csdk.j1) {
                j1Var = (com.payair.csdk.j1) continuation;
                int i = j1Var.e;
                if ((i & Integer.MIN_VALUE) != 0) {
                    j1Var.e = i - 2147483648;
                    java.lang.Object obj = j1Var.c;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    switch (j1Var.e) {
                        case 0:
                            kotlin.ResultKt.throwOnFailure(obj);
                            int i2 = com.payair.logic.remote.repositories.HceRemoteRepositoryImpl.WhenMappings.$EnumSwitchMapping$0[cardScheme.ordinal()];
                            if (i2 == 1) {
                                kotlinx.coroutines.flow.Flow<java.lang.Boolean> isMastercardEnrolled = this.e.isMastercardEnrolled();
                                j1Var.f4268a = this;
                                j1Var.b = cardScheme2;
                                j1Var.e = 1;
                                obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(isMastercardEnrolled, j1Var);
                                if (obj != coroutine_suspended) {
                                    hceRemoteRepositoryImpl = this;
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(obj, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false))) {
                                        com.payair.logic.implementation.HceSDKInterface hceSDKInterface = hceRemoteRepositoryImpl.j;
                                        j1Var.f4268a = hceRemoteRepositoryImpl;
                                        j1Var.b = cardScheme2;
                                        j1Var.e = 2;
                                        obj = hceSDKInterface.registerMastercard(null, j1Var);
                                        break;
                                    }
                                    com.payair.logic.storage.SchemeStorage schemeStorage = hceRemoteRepositoryImpl.e;
                                    j1Var.f4268a = null;
                                    j1Var.b = null;
                                    j1Var.e = 7;
                                }
                            } else if (i2 == 2) {
                                kotlinx.coroutines.flow.Flow<java.lang.Boolean> isVisaEnrolled = this.e.isVisaEnrolled();
                                j1Var.f4268a = this;
                                j1Var.b = cardScheme2;
                                j1Var.e = 4;
                                obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(isVisaEnrolled, j1Var);
                                if (obj != coroutine_suspended) {
                                    hceRemoteRepositoryImpl = this;
                                    if (kotlin.jvm.internal.Intrinsics.areEqual(obj, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false))) {
                                        android.content.Context applicationContext = hceRemoteRepositoryImpl.k.getApplicationContext();
                                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                                        j1Var.f4268a = hceRemoteRepositoryImpl;
                                        j1Var.b = cardScheme2;
                                        j1Var.e = 5;
                                        obj = com.payair.hce.visa.Initializer.register(applicationContext, null, j1Var);
                                        break;
                                    }
                                    com.payair.logic.storage.SchemeStorage schemeStorage2 = hceRemoteRepositoryImpl.e;
                                    j1Var.f4268a = null;
                                    j1Var.b = null;
                                    j1Var.e = 7;
                                }
                            } else {
                                hceRemoteRepositoryImpl = this;
                                com.payair.logic.storage.SchemeStorage schemeStorage22 = hceRemoteRepositoryImpl.e;
                                j1Var.f4268a = null;
                                j1Var.b = null;
                                j1Var.e = 7;
                                break;
                            }
                            return coroutine_suspended;
                        case 1:
                            cardScheme2 = j1Var.b;
                            hceRemoteRepositoryImpl = j1Var.f4268a;
                            kotlin.ResultKt.throwOnFailure(obj);
                            if (kotlin.jvm.internal.Intrinsics.areEqual(obj, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false))) {
                            }
                            com.payair.logic.storage.SchemeStorage schemeStorage222 = hceRemoteRepositoryImpl.e;
                            j1Var.f4268a = null;
                            j1Var.b = null;
                            j1Var.e = 7;
                            break;
                        case 2:
                            cardScheme2 = j1Var.b;
                            hceRemoteRepositoryImpl = j1Var.f4268a;
                            kotlin.ResultKt.throwOnFailure(obj);
                            com.payair.model.Response response = (com.payair.model.Response) obj;
                            if (response instanceof com.payair.model.Response.Success) {
                                com.payair.logic.storage.SchemeStorage schemeStorage3 = hceRemoteRepositoryImpl.e;
                                j1Var.f4268a = hceRemoteRepositoryImpl;
                                j1Var.b = cardScheme2;
                                j1Var.e = 3;
                                break;
                            } else {
                                com.paypal.android.logger.Logger.e$default(com.payair.logging.LoggerKt.getLog(), "registerMastercard failed with a response ".concat(java.lang.String.valueOf(response)), null, null, null, 14, null);
                                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                            }
                        case 3:
                            cardScheme2 = j1Var.b;
                            hceRemoteRepositoryImpl = j1Var.f4268a;
                            kotlin.ResultKt.throwOnFailure(obj);
                            com.payair.logic.storage.SchemeStorage schemeStorage2222 = hceRemoteRepositoryImpl.e;
                            j1Var.f4268a = null;
                            j1Var.b = null;
                            j1Var.e = 7;
                            break;
                        case 4:
                            cardScheme2 = j1Var.b;
                            hceRemoteRepositoryImpl = j1Var.f4268a;
                            kotlin.ResultKt.throwOnFailure(obj);
                            if (kotlin.jvm.internal.Intrinsics.areEqual(obj, kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false))) {
                            }
                            com.payair.logic.storage.SchemeStorage schemeStorage22222 = hceRemoteRepositoryImpl.e;
                            j1Var.f4268a = null;
                            j1Var.b = null;
                            j1Var.e = 7;
                            break;
                        case 5:
                            cardScheme2 = j1Var.b;
                            hceRemoteRepositoryImpl = j1Var.f4268a;
                            kotlin.ResultKt.throwOnFailure(obj);
                            if (((java.lang.Boolean) obj).booleanValue()) {
                                com.payair.logic.storage.SchemeStorage schemeStorage4 = hceRemoteRepositoryImpl.e;
                                j1Var.f4268a = hceRemoteRepositoryImpl;
                                j1Var.b = cardScheme2;
                                j1Var.e = 6;
                                if (schemeStorage4.visaEnrolled(j1Var) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                com.payair.logic.storage.SchemeStorage schemeStorage222222 = hceRemoteRepositoryImpl.e;
                                j1Var.f4268a = null;
                                j1Var.b = null;
                                j1Var.e = 7;
                                break;
                            } else {
                                com.paypal.android.logger.Logger.e$default(com.payair.logging.LoggerKt.getLog(), "Visa registration failed in startCardDataTokenization", null, null, null, 14, null);
                                return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
                            }
                        case 6:
                            cardScheme2 = j1Var.b;
                            hceRemoteRepositoryImpl = j1Var.f4268a;
                            kotlin.ResultKt.throwOnFailure(obj);
                            com.payair.logic.storage.SchemeStorage schemeStorage2222222 = hceRemoteRepositoryImpl.e;
                            j1Var.f4268a = null;
                            j1Var.b = null;
                            j1Var.e = 7;
                            break;
                        case 7:
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(true);
                        default:
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (j1Var.e) {
            }
        } catch (java.lang.Exception e) {
            com.payair.logging.LoggerKt.getLog().e("Visa registration failed in startCardDataTokenization with exception", e);
            return kotlin.coroutines.jvm.internal.Boxing.boxBoolean(false);
        }
        j1Var = new com.payair.csdk.j1(this, continuation);
        java.lang.Object obj2 = j1Var.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(java.lang.String str, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.o1 o1Var;
        int i;
        com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl;
        com.payair.model.Response a2;
        if (continuation instanceof com.payair.csdk.o1) {
            o1Var = (com.payair.csdk.o1) continuation;
            int i2 = o1Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o1Var.e = i2 - 2147483648;
                java.lang.Object obj = o1Var.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = o1Var.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (!com.payair.hce.visa.Initializer.isSessionAvailable()) {
                        android.content.Context context = this.k;
                        o1Var.f4293a = this;
                        o1Var.b = str;
                        o1Var.e = 1;
                        if (com.payair.hce.visa.Initializer.initialize(context, o1Var) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    hceRemoteRepositoryImpl = this;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = o1Var.b;
                    hceRemoteRepositoryImpl = o1Var.f4293a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                a2 = hceRemoteRepositoryImpl.a(true);
                if (a2 instanceof com.payair.model.Response.Success) {
                    return a2;
                }
                com.payair.logic.implementation.CardEncryptionManager cardEncryptionManager = hceRemoteRepositoryImpl.c;
                java.lang.Object data = ((com.payair.model.Response.Success) a2).getData();
                kotlin.jvm.internal.Intrinsics.checkNotNull(data, "");
                java.lang.String str2 = (java.lang.String) data;
                if (str == null) {
                    str = "";
                }
                hceRemoteRepositoryImpl.h.startTokenize(cardEncryptionManager.encryptCvv(str2, str));
                return new com.payair.model.Response.Success(kotlin.Unit.INSTANCE);
            }
        }
        o1Var = new com.payair.csdk.o1(this, continuation);
        java.lang.Object obj2 = o1Var.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = o1Var.e;
        if (i != 0) {
        }
        a2 = hceRemoteRepositoryImpl.a(true);
        if (a2 instanceof com.payair.model.Response.Success) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (r11.storeCurrent(r10, r0) != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        if (r11.store(r2, r0) != r1) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(com.payair.model.StartTokenizeData startTokenizeData, kotlin.coroutines.Continuation continuation) {
        com.payair.csdk.t1 t1Var;
        int i;
        com.payair.logic.remote.repositories.HceRemoteRepositoryImpl hceRemoteRepositoryImpl;
        if (continuation instanceof com.payair.csdk.t1) {
            t1Var = (com.payair.csdk.t1) continuation;
            int i2 = t1Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t1Var.e = i2 - 2147483648;
                java.lang.Object obj = t1Var.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = t1Var.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    java.lang.Long expirationTimestamp = startTokenizeData.getExpirationTimestamp();
                    if (expirationTimestamp != null) {
                        long longValue = expirationTimestamp.longValue();
                        com.payair.logic.storage.TokenizationTimestampStorage tokenizationTimestampStorage = this.d;
                        java.util.Map<java.lang.Long, java.lang.Long> mapOf = kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to(kotlin.coroutines.jvm.internal.Boxing.boxLong(startTokenizeData.getTokenizationSessionId()), kotlin.coroutines.jvm.internal.Boxing.boxLong(longValue)));
                        t1Var.f4316a = this;
                        t1Var.b = startTokenizeData;
                        t1Var.e = 1;
                    }
                    hceRemoteRepositoryImpl = this;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.ResultKt.throwOnFailure(obj);
                        return kotlin.Unit.INSTANCE;
                    }
                    startTokenizeData = t1Var.b;
                    hceRemoteRepositoryImpl = t1Var.f4316a;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                com.payair.logic.storage.EnrollmentIdStorage enrollmentIdStorage = hceRemoteRepositoryImpl.f;
                java.lang.String panEnrollmentId = startTokenizeData.getPanEnrollmentId();
                t1Var.f4316a = null;
                t1Var.b = null;
                t1Var.e = 2;
            }
        }
        t1Var = new com.payair.csdk.t1(this, continuation);
        java.lang.Object obj2 = t1Var.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = t1Var.e;
        if (i != 0) {
        }
        com.payair.logic.storage.EnrollmentIdStorage enrollmentIdStorage2 = hceRemoteRepositoryImpl.f;
        java.lang.String panEnrollmentId2 = startTokenizeData.getPanEnrollmentId();
        t1Var.f4316a = null;
        t1Var.b = null;
        t1Var.e = 2;
    }

    public static java.lang.String a() {
        java.lang.String languageTag = java.util.Locale.getDefault().toLanguageTag();
        if (languageTag.length() == 2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(languageTag);
            sb.append("-GB");
            return sb.toString();
        }
        int length = languageTag.length();
        kotlin.jvm.internal.Intrinsics.checkNotNull(languageTag);
        if (length <= 5) {
            return languageTag;
        }
        java.lang.String substring = languageTag.substring(0, 5);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    @kotlin.Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes10.dex */
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[com.payair.model.CardScheme.values().length];
            try {
                iArr[com.payair.model.CardScheme.MASTERCARD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.payair.model.CardScheme.VISA.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[com.payair.logic.cardvalidation.IssuerCardSpecs.values().length];
            try {
                iArr2[com.payair.logic.cardvalidation.IssuerCardSpecs.MAESTRO.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr2[com.payair.logic.cardvalidation.IssuerCardSpecs.MAESTRO_UK.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr2[com.payair.logic.cardvalidation.IssuerCardSpecs.MASTERCARD.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr2[com.payair.logic.cardvalidation.IssuerCardSpecs.MASTERCARD_NEW.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr2[com.payair.logic.cardvalidation.IssuerCardSpecs.VISA.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }
}
