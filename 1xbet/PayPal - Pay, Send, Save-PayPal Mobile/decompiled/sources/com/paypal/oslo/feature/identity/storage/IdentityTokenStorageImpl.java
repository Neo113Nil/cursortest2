package com.paypal.oslo.feature.identity.storage;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u000eJ\u0010\u0010\u0016\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0016\u0010\u000eJ\u0018\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0017H\u0096@¢\u0006\u0004\b\u001b\u0010\u000eJ\u0010\u0010\u001c\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u001c\u0010\u000eR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010$\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010\"\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorageImpl;", "Lcom/paypal/oslo/feature/identity/storage/IdentityTokenStorage;", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "appStorage", "Lcom/paypal/oslo/core/identity/AuthStateSetter;", "authStateSetter", "<init>", "(Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;Lcom/paypal/oslo/core/identity/AuthStateSetter;)V", "Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.TOKEN_KEY, "", "saveUserAccessToken", "(Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserAccessToken", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearUserAccessToken", "clearUserAccessTokenSilently", "()V", "", "saveClientAccessToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getClientAccessToken", "clearClientAccessToken", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;", "intent", "saveAuthIntent", "(Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAuthIntent", "clearAuthIntent", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/persistence/appstorage/AppStorage;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/core/identity/AuthStateSetter;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/identity/storage/model/UserAccessTokenData;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/identity/login/domain/model/AuthIntent;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class IdentityTokenStorageImpl implements com.paypal.oslo.feature.identity.storage.IdentityTokenStorage {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.persistence.appstorage.AppStorage getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private volatile com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData Camera2StreamConfigurationMap;
    private final com.paypal.oslo.core.identity.AuthStateSetter getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private volatile com.paypal.oslo.feature.identity.login.domain.model.AuthIntent getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public IdentityTokenStorageImpl(com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.identity.AuthStateSetter authStateSetter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authStateSetter, "");
        this.getHighSpeedVideoSizes = appStorage;
        this.getHighSpeedVideoFpsRangesFor = authStateSetter;
    }

    @Override // com.paypal.oslo.feature.identity.storage.IdentityTokenStorage
    public final java.lang.Object saveUserAccessToken(com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData userAccessTokenData, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        this.Camera2StreamConfigurationMap = userAccessTokenData;
        this.getHighSpeedVideoFpsRangesFor.setUserAccessTokenState(new com.paypal.oslo.core.identity.UserAccessTokenState.Exists(userAccessTokenData.getPayerId()));
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.identity.storage.IdentityTokenStorage
    public final java.lang.Object getUserAccessToken(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.storage.model.UserAccessTokenData> continuation) {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.paypal.oslo.feature.identity.storage.IdentityTokenStorage
    public final java.lang.Object clearUserAccessToken(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        this.Camera2StreamConfigurationMap = null;
        this.getHighSpeedVideoFpsRangesFor.setUserAccessTokenState(com.paypal.oslo.core.identity.UserAccessTokenState.None.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.identity.storage.IdentityTokenStorage
    public final void clearUserAccessTokenSilently() {
        this.Camera2StreamConfigurationMap = null;
    }

    @Override // com.paypal.oslo.feature.identity.storage.IdentityTokenStorage
    public final java.lang.Object saveClientAccessToken(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object string = this.getHighSpeedVideoSizes.setString(com.paypal.oslo.feature.identity.storage.TokenStorageKeys.INSTANCE.getCLIENT_ACCESS_TOKEN(), str, continuation);
        return string == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? string : kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.identity.storage.IdentityTokenStorage
    public final java.lang.Object getClientAccessToken(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return this.getHighSpeedVideoSizes.getString(com.paypal.oslo.feature.identity.storage.TokenStorageKeys.INSTANCE.getCLIENT_ACCESS_TOKEN(), continuation);
    }

    @Override // com.paypal.oslo.feature.identity.storage.IdentityTokenStorage
    public final java.lang.Object clearClientAccessToken(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object remove = this.getHighSpeedVideoSizes.remove(com.paypal.oslo.feature.identity.storage.TokenStorageKeys.INSTANCE.getCLIENT_ACCESS_TOKEN(), continuation);
        return remove == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? remove : kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.identity.storage.IdentityTokenStorage
    public final java.lang.Object saveAuthIntent(com.paypal.oslo.feature.identity.login.domain.model.AuthIntent authIntent, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        this.getHighSpeedVideoFpsRanges = authIntent;
        return kotlin.Unit.INSTANCE;
    }

    @Override // com.paypal.oslo.feature.identity.storage.IdentityTokenStorage
    public final java.lang.Object getAuthIntent(kotlin.coroutines.Continuation<? super com.paypal.oslo.feature.identity.login.domain.model.AuthIntent> continuation) {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.paypal.oslo.feature.identity.storage.IdentityTokenStorage
    public final java.lang.Object clearAuthIntent(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        this.getHighSpeedVideoFpsRanges = null;
        return kotlin.Unit.INSTANCE;
    }
}
