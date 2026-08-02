package com.payair.logic.managers;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u0000 (2\u00020\u0001:\u0001(B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b$\u0010\u0016J\u000f\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'"}, d2 = {"Lcom/payair/logic/managers/ConfigurationImpl;", "Lcom/payair/logic/managers/ConfigurationManager;", "Lcom/payair/logic/remote/repositories/UserRemoteRepository;", "remote", "Lcom/payair/logic/implementation/HceSDKInterface;", "hceSDK", "Lcom/payair/logic/managers/PushManager;", "pushManager", "Lcom/payair/logic/storage/SchemeStorage;", "schemeStorage", "Lcom/payair/listener/DefaultHceEventListenerImpl;", "defaultHceEventListenerImpl", "<init>", "(Lcom/payair/logic/remote/repositories/UserRemoteRepository;Lcom/payair/logic/implementation/HceSDKInterface;Lcom/payair/logic/managers/PushManager;Lcom/payair/logic/storage/SchemeStorage;Lcom/payair/listener/DefaultHceEventListenerImpl;)V", "", "assetId", "Lcom/payair/model/CardScheme;", "scheme", "Lcom/payair/model/Response;", "getAsset", "(Ljava/lang/String;Lcom/payair/model/CardScheme;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchTAC", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "Lcom/payair/model/PushTokenType;", "type", "updateFirebaseToken", "(Ljava/lang/String;Lcom/payair/model/PushTokenType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", com.paypal.android.threeds.utils.NetworkUtil.JWT, "updateJWT", "(Ljava/lang/String;)Lcom/payair/model/Response;", "Lcom/payair/listener/ClientListener;", "clientListener", "", "setClientListener", "(Lcom/payair/listener/ClientListener;)V", "updateUnlockKeys", "", "getSdkKeyValidity", "()J", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ConfigurationImpl implements com.payair.logic.managers.ConfigurationManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.payair.logic.managers.ConfigurationImpl.Companion INSTANCE = new com.payair.logic.managers.ConfigurationImpl.Companion(null);
    public static final long f;

    /* renamed from: a, reason: collision with root package name */
    public final com.payair.logic.remote.repositories.UserRemoteRepository f4442a;
    public final com.payair.logic.implementation.HceSDKInterface b;
    public final com.payair.logic.managers.PushManager c;
    public final com.payair.logic.storage.SchemeStorage d;
    public final com.payair.listener.DefaultHceEventListenerImpl e;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0007"}, d2 = {"Lcom/payair/logic/managers/ConfigurationImpl$Companion;", "", "Lkotlin/time/Duration;", "SDK_KEY_VALIDITY", "J", "getSDK_KEY_VALIDITY-UwyO8pc$core_release", "()J", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* renamed from: getSDK_KEY_VALIDITY-UwyO8pc$core_release, reason: not valid java name */
        public final long m10970getSDK_KEY_VALIDITYUwyO8pc$core_release() {
            return com.payair.logic.managers.ConfigurationImpl.f;
        }
    }

    static {
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        f = kotlin.time.Duration.m23968timesUwyO8pc(kotlin.time.DurationKt.toDuration(7, kotlin.time.DurationUnit.DAYS), 40);
    }

    public ConfigurationImpl(com.payair.logic.remote.repositories.UserRemoteRepository userRemoteRepository, com.payair.logic.implementation.HceSDKInterface hceSDKInterface, com.payair.logic.managers.PushManager pushManager, com.payair.logic.storage.SchemeStorage schemeStorage, com.payair.listener.DefaultHceEventListenerImpl defaultHceEventListenerImpl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userRemoteRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hceSDKInterface, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pushManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(schemeStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultHceEventListenerImpl, "");
        this.f4442a = userRemoteRepository;
        this.b = hceSDKInterface;
        this.c = pushManager;
        this.d = schemeStorage;
        this.e = defaultHceEventListenerImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r8 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.payair.logic.managers.ConfigurationManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fetchTAC(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        com.payair.csdk.g gVar;
        int i;
        com.payair.logic.managers.ConfigurationImpl configurationImpl;
        com.payair.model.CardScheme cardScheme;
        if (continuation instanceof com.payair.csdk.g) {
            gVar = (com.payair.csdk.g) continuation;
            int i2 = gVar.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gVar.e = i2 - 2147483648;
                java.lang.Object obj = gVar.c;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = gVar.e;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    kotlinx.coroutines.flow.Flow<com.payair.model.CardScheme> currentScheme = this.d.getCurrentScheme();
                    gVar.f4251a = this;
                    gVar.b = str;
                    gVar.e = 1;
                    obj = kotlinx.coroutines.flow.FlowKt.firstOrNull(currentScheme, gVar);
                    if (obj != coroutine_suspended) {
                        configurationImpl = this;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.payair.model.Response response = (com.payair.model.Response) obj;
                    if (response != null) {
                        return response;
                    }
                    return new com.payair.model.Response.Error(112, null, 2, null);
                }
                str = gVar.b;
                configurationImpl = gVar.f4251a;
                kotlin.ResultKt.throwOnFailure(obj);
                cardScheme = (com.payair.model.CardScheme) obj;
                if (cardScheme != null) {
                    gVar.f4251a = null;
                    gVar.b = null;
                    gVar.e = 2;
                    obj = configurationImpl.getAsset(str, cardScheme, gVar);
                }
                return new com.payair.model.Response.Error(112, null, 2, null);
            }
        }
        gVar = new com.payair.csdk.g(this, continuation);
        java.lang.Object obj2 = gVar.c;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = gVar.e;
        if (i != 0) {
        }
        cardScheme = (com.payair.model.CardScheme) obj2;
        if (cardScheme != null) {
        }
        return new com.payair.model.Response.Error(112, null, 2, null);
    }

    @Override // com.payair.logic.managers.ConfigurationManager
    public final java.lang.Object getAsset(java.lang.String str, com.payair.model.CardScheme cardScheme, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        return this.f4442a.getAssetAsync(str, cardScheme.getValue(), continuation);
    }

    @Override // com.payair.logic.managers.ConfigurationManager
    public final long getSdkKeyValidity() {
        kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
        return kotlin.time.Duration.m23953getInWholeMillisecondsimpl(kotlin.time.Duration.m23966plusLRDsOJo(kotlin.time.DurationKt.toDuration(this.b.getSdkKeyValidity(), kotlin.time.DurationUnit.MILLISECONDS), f));
    }

    @Override // com.payair.logic.managers.ConfigurationManager
    public final void setClientListener(com.payair.listener.ClientListener clientListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clientListener, "");
        this.b.setClientListener(clientListener, this.e);
    }

    @Override // com.payair.logic.managers.ConfigurationManager
    public final java.lang.Object updateFirebaseToken(java.lang.String str, com.payair.model.PushTokenType pushTokenType, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        return this.c.updateFirebaseToken(str, pushTokenType, continuation);
    }

    @Override // com.payair.logic.managers.ConfigurationManager
    public final com.payair.model.Response updateJWT(java.lang.String jwt) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jwt, "");
        try {
            this.b.setJWTToken(jwt);
            this.b.setupValuesAfterAuthenticate();
            return new com.payair.model.Response.Success(kotlin.Unit.INSTANCE);
        } catch (java.lang.Exception unused) {
            return new com.payair.model.Response.Error(100, null, 2, null);
        }
    }

    @Override // com.payair.logic.managers.ConfigurationManager
    public final java.lang.Object updateUnlockKeys(java.lang.String str, kotlin.coroutines.Continuation<? super com.payair.model.Response> continuation) {
        return this.b.uploadUnlockKeys(str, continuation);
    }
}
