package com.paypal.oslo.app.identity;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0082@¢\u0006\u0004\b\u0013\u0010\u0012J$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0014\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019R\u0014\u0010\u0011\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR*\u0010\u001b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!"}, d2 = {"Lcom/paypal/oslo/app/identity/AppTokenProvider;", "Lcom/paypal/oslo/core/identity/domain/TokenProvider;", "Lcom/paypal/oslo/feature/identity/api/IdentityTokenProvider;", "identityTokenProvider", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "<init>", "(Lcom/paypal/oslo/feature/identity/api/IdentityTokenProvider;Lcom/paypal/oslo/core/navigation/AppNavigator;)V", "Lcom/paypal/oslo/core/identity/domain/model/TokenType;", "tokenType", "Larrow/core/Either;", "Lcom/paypal/oslo/core/identity/domain/model/TokenError;", "Lcom/paypal/oslo/core/identity/domain/model/Token;", "getToken", "(Lcom/paypal/oslo/core/identity/domain/model/TokenType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/paypal/oslo/core/identity/domain/model/TokenType$UserAccessTokenType;", "p0", "getHighSpeedVideoSizes", "(Lcom/paypal/oslo/core/identity/domain/model/TokenType$UserAccessTokenType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "getTokenWithFreshAuth", "", "invalidateToken", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/identity/api/IdentityTokenProvider;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "Lkotlinx/coroutines/sync/Mutex;", "getHighSpeedVideoFpsRangesFor", "Lkotlinx/coroutines/sync/Mutex;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CompletableDeferred;", "Lkotlinx/coroutines/CompletableDeferred;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppTokenProvider implements com.paypal.oslo.core.identity.domain.TokenProvider {
    public static final int $stable = 8;
    private final kotlinx.coroutines.CoroutineDispatcher Camera2StreamConfigurationMap;
    private final com.paypal.oslo.feature.identity.api.IdentityTokenProvider getHighResolutionOutputSizeshNQ4ISI;
    private final com.paypal.oslo.core.navigation.AppNavigator getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final kotlinx.coroutines.sync.Mutex getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>> getHighSpeedVideoFpsRangesFor;

    @javax.inject.Inject
    public AppTokenProvider(com.paypal.oslo.feature.identity.api.IdentityTokenProvider identityTokenProvider, com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(identityTokenProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        this.getHighResolutionOutputSizeshNQ4ISI = identityTokenProvider;
        this.getHighSpeedVideoFpsRanges = appNavigator;
        this.getHighSpeedVideoSizes = kotlinx.coroutines.sync.MutexKt.Mutex$default(false, 1, null);
        this.Camera2StreamConfigurationMap = kotlinx.coroutines.Dispatchers.getMain();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (r7 == r1) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c7, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x005a, code lost:
    
        if (r7 != r1) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // com.paypal.oslo.core.identity.domain.TokenProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getToken(com.paypal.oslo.core.identity.domain.model.TokenType tokenType, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError, ? extends com.paypal.oslo.core.identity.domain.model.Token>> continuation) {
        com.paypal.oslo.app.identity.AppTokenProvider$getToken$1 appTokenProvider$getToken$1;
        int i;
        arrow.core.Either either;
        if (continuation instanceof com.paypal.oslo.app.identity.AppTokenProvider$getToken$1) {
            appTokenProvider$getToken$1 = (com.paypal.oslo.app.identity.AppTokenProvider$getToken$1) continuation;
            if ((appTokenProvider$getToken$1.getOutputFormats & Integer.MIN_VALUE) != 0) {
                appTokenProvider$getToken$1.getOutputFormats -= 2147483648;
                java.lang.Object obj = appTokenProvider$getToken$1.getInputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = appTokenProvider$getToken$1.getOutputFormats;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.paypal.oslo.feature.identity.api.IdentityTokenProvider identityTokenProvider = this.getHighResolutionOutputSizeshNQ4ISI;
                    appTokenProvider$getToken$1.getHighSpeedVideoFpsRangesFor = tokenType;
                    appTokenProvider$getToken$1.getOutputFormats = 1;
                    obj = identityTokenProvider.getToken(tokenType, appTokenProvider$getToken$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        int i2 = appTokenProvider$getToken$1.getHighResolutionOutputSizeshNQ4ISI;
                        int i3 = appTokenProvider$getToken$1.Camera2StreamConfigurationMap;
                        kotlin.ResultKt.throwOnFailure(obj);
                        return (arrow.core.Either) obj;
                    }
                    tokenType = (com.paypal.oslo.core.identity.domain.model.TokenType) appTokenProvider$getToken$1.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                either = (arrow.core.Either) obj;
                if (!(either instanceof arrow.core.Either.Right)) {
                    return arrow.core.EitherKt.right((com.paypal.oslo.core.identity.domain.model.Token) ((arrow.core.Either.Right) either).getValue());
                }
                if (either instanceof arrow.core.Either.Left) {
                    com.paypal.oslo.core.identity.domain.model.TokenError tokenError = (com.paypal.oslo.core.identity.domain.model.TokenError) ((arrow.core.Either.Left) either).getValue();
                    if (!(tokenError instanceof com.paypal.oslo.core.identity.domain.model.TokenError.NotFound)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    if (tokenType instanceof com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType) {
                        appTokenProvider$getToken$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenType);
                        appTokenProvider$getToken$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(either);
                        appTokenProvider$getToken$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenError);
                        appTokenProvider$getToken$1.Camera2StreamConfigurationMap = 0;
                        appTokenProvider$getToken$1.getHighResolutionOutputSizeshNQ4ISI = 0;
                        appTokenProvider$getToken$1.getOutputFormats = 2;
                        obj = getHighSpeedVideoSizes((com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType) tokenType, appTokenProvider$getToken$1);
                    } else {
                        if (!(tokenType instanceof com.paypal.oslo.core.identity.domain.model.TokenType.ClientAccessTokenType)) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        return arrow.core.EitherKt.left(com.paypal.oslo.core.identity.domain.model.TokenError.NotFound.INSTANCE);
                    }
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
        }
        appTokenProvider$getToken$1 = new com.paypal.oslo.app.identity.AppTokenProvider$getToken$1(this, continuation);
        java.lang.Object obj2 = appTokenProvider$getToken$1.getInputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appTokenProvider$getToken$1.getOutputFormats;
        if (i != 0) {
        }
        either = (arrow.core.Either) obj2;
        if (!(either instanceof arrow.core.Either.Right)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00e0, code lost:
    
        if (r15 == null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01d8 A[Catch: all -> 0x01e0, TryCatch #0 {all -> 0x01e0, blocks: (B:13:0x01d4, B:15:0x01d8, B:16:0x01da), top: B:12:0x01d4 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0194 A[Catch: all -> 0x019c, TryCatch #6 {all -> 0x019c, blocks: (B:25:0x0190, B:27:0x0194, B:28:0x0196), top: B:24:0x0190 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d1 A[Catch: all -> 0x01e5, TryCatch #3 {all -> 0x01e5, blocks: (B:75:0x00cd, B:77:0x00d1, B:91:0x00e2), top: B:74:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x011c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getHighSpeedVideoSizes(com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError, ? extends com.paypal.oslo.core.identity.domain.model.Token>> continuation) {
        com.paypal.oslo.app.identity.AppTokenProvider$getOrWaitForUserToken$1 appTokenProvider$getOrWaitForUserToken$1;
        com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType2;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlinx.coroutines.sync.Mutex mutex2;
        kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>> completableDeferred;
        kotlin.Pair pair;
        kotlinx.coroutines.CompletableDeferred completableDeferred2;
        kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>> completableDeferred3;
        kotlinx.coroutines.CompletableDeferred completableDeferred4;
        com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType3;
        kotlinx.coroutines.CompletableDeferred completableDeferred5;
        kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>> completableDeferred6;
        com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType4;
        kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>> completableDeferred7;
        java.lang.Throwable th;
        arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token> either;
        kotlinx.coroutines.sync.Mutex mutex3;
        kotlinx.coroutines.sync.Mutex mutex4;
        kotlinx.coroutines.sync.Mutex mutex5;
        java.lang.Throwable th2;
        kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>> completableDeferred8;
        kotlinx.coroutines.sync.Mutex mutex6;
        arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token> either2;
        if (continuation instanceof com.paypal.oslo.app.identity.AppTokenProvider$getOrWaitForUserToken$1) {
            appTokenProvider$getOrWaitForUserToken$1 = (com.paypal.oslo.app.identity.AppTokenProvider$getOrWaitForUserToken$1) continuation;
            if ((appTokenProvider$getOrWaitForUserToken$1.getInputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                appTokenProvider$getOrWaitForUserToken$1.getInputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = appTokenProvider$getOrWaitForUserToken$1.getOutputFormats;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (appTokenProvider$getOrWaitForUserToken$1.getInputSizeshNQ4ISI) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        kotlinx.coroutines.sync.Mutex mutex7 = this.getHighSpeedVideoSizes;
                        appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizes = userAccessTokenType;
                        appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRangesFor = mutex7;
                        appTokenProvider$getOrWaitForUserToken$1.Camera2StreamConfigurationMap = 0;
                        appTokenProvider$getOrWaitForUserToken$1.getInputSizeshNQ4ISI = 1;
                        if (mutex7.lock(null, appTokenProvider$getOrWaitForUserToken$1) != coroutine_suspended) {
                            userAccessTokenType2 = userAccessTokenType;
                            mutex = mutex7;
                            try {
                                completableDeferred = this.getHighSpeedVideoFpsRangesFor;
                                if (completableDeferred != null) {
                                    com.paypal.android.logger.Logger.d$default(com.paypal.oslo.app.LoggerKt.log, "Authentication already in progress, waiting for existing request to complete", null, null, 6, null);
                                    pair = kotlin.TuplesKt.to(completableDeferred, null);
                                    break;
                                }
                                com.paypal.oslo.app.identity.AppTokenProvider appTokenProvider = this;
                                kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>> CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                                this.getHighSpeedVideoFpsRangesFor = CompletableDeferred$default;
                                pair = kotlin.TuplesKt.to(null, CompletableDeferred$default);
                                mutex2.unlock(null);
                                completableDeferred2 = (kotlinx.coroutines.CompletableDeferred) pair.component1();
                                completableDeferred3 = (kotlinx.coroutines.CompletableDeferred) pair.component2();
                                if (completableDeferred2 == null) {
                                    appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenType2);
                                    appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(completableDeferred2);
                                    appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRanges = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(completableDeferred3);
                                    appTokenProvider$getOrWaitForUserToken$1.getInputSizeshNQ4ISI = 2;
                                    java.lang.Object await = completableDeferred2.await(appTokenProvider$getOrWaitForUserToken$1);
                                    if (await != coroutine_suspended) {
                                        return await;
                                    }
                                } else {
                                    try {
                                        appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenType2);
                                        appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(completableDeferred2);
                                        appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRanges = completableDeferred3;
                                        appTokenProvider$getOrWaitForUserToken$1.getInputSizeshNQ4ISI = 3;
                                        java.lang.Object highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(userAccessTokenType2, appTokenProvider$getOrWaitForUserToken$1);
                                        if (highSpeedVideoFpsRanges != coroutine_suspended) {
                                            com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType5 = userAccessTokenType2;
                                            completableDeferred5 = completableDeferred2;
                                            completableDeferred6 = completableDeferred3;
                                            obj = highSpeedVideoFpsRanges;
                                            userAccessTokenType4 = userAccessTokenType5;
                                            either = (arrow.core.Either) obj;
                                            mutex3 = this.getHighSpeedVideoSizes;
                                            appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenType4);
                                            appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(completableDeferred5);
                                            appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRanges = completableDeferred6;
                                            appTokenProvider$getOrWaitForUserToken$1.getHighResolutionOutputSizeshNQ4ISI = either;
                                            appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizesFor = mutex3;
                                            appTokenProvider$getOrWaitForUserToken$1.Camera2StreamConfigurationMap = 0;
                                            appTokenProvider$getOrWaitForUserToken$1.getInputSizeshNQ4ISI = 4;
                                            if (mutex3.lock(null, appTokenProvider$getOrWaitForUserToken$1) != coroutine_suspended) {
                                                userAccessTokenType3 = userAccessTokenType4;
                                                kotlinx.coroutines.CompletableDeferred completableDeferred9 = completableDeferred5;
                                                completableDeferred7 = completableDeferred6;
                                                mutex4 = mutex3;
                                                completableDeferred4 = completableDeferred9;
                                                try {
                                                    try {
                                                        completableDeferred8 = this.getHighSpeedVideoFpsRangesFor;
                                                        if (completableDeferred8 == completableDeferred7 && completableDeferred8 != null) {
                                                            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(completableDeferred8.complete(either));
                                                        }
                                                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                                        mutex6 = this.getHighSpeedVideoSizes;
                                                        appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenType3);
                                                        appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(completableDeferred4);
                                                        appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRanges = completableDeferred7;
                                                        appTokenProvider$getOrWaitForUserToken$1.getHighResolutionOutputSizeshNQ4ISI = either;
                                                        appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizesFor = mutex6;
                                                        appTokenProvider$getOrWaitForUserToken$1.Camera2StreamConfigurationMap = 0;
                                                        appTokenProvider$getOrWaitForUserToken$1.getInputSizeshNQ4ISI = 5;
                                                        if (mutex6.lock(null, appTokenProvider$getOrWaitForUserToken$1) != coroutine_suspended) {
                                                            either2 = either;
                                                            try {
                                                                if (this.getHighSpeedVideoFpsRangesFor == completableDeferred7) {
                                                                    this.getHighSpeedVideoFpsRangesFor = null;
                                                                }
                                                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                                                return either2;
                                                            } finally {
                                                            }
                                                        }
                                                    } finally {
                                                    }
                                                } catch (java.lang.Throwable th3) {
                                                    th = th3;
                                                    mutex5 = this.getHighSpeedVideoSizes;
                                                    appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenType3);
                                                    appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(completableDeferred4);
                                                    appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRanges = completableDeferred7;
                                                    appTokenProvider$getOrWaitForUserToken$1.getHighResolutionOutputSizeshNQ4ISI = th;
                                                    appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizesFor = mutex5;
                                                    appTokenProvider$getOrWaitForUserToken$1.Camera2StreamConfigurationMap = 0;
                                                    appTokenProvider$getOrWaitForUserToken$1.getInputSizeshNQ4ISI = 6;
                                                    if (mutex5.lock(null, appTokenProvider$getOrWaitForUserToken$1) != coroutine_suspended) {
                                                    }
                                                    return coroutine_suspended;
                                                }
                                            }
                                        }
                                    } catch (java.lang.Throwable th4) {
                                        th = th4;
                                        completableDeferred4 = completableDeferred2;
                                        userAccessTokenType3 = userAccessTokenType2;
                                        completableDeferred7 = completableDeferred3;
                                        th = th;
                                        mutex5 = this.getHighSpeedVideoSizes;
                                        appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenType3);
                                        appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(completableDeferred4);
                                        appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRanges = completableDeferred7;
                                        appTokenProvider$getOrWaitForUserToken$1.getHighResolutionOutputSizeshNQ4ISI = th;
                                        appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizesFor = mutex5;
                                        appTokenProvider$getOrWaitForUserToken$1.Camera2StreamConfigurationMap = 0;
                                        appTokenProvider$getOrWaitForUserToken$1.getInputSizeshNQ4ISI = 6;
                                        if (mutex5.lock(null, appTokenProvider$getOrWaitForUserToken$1) != coroutine_suspended) {
                                        }
                                        return coroutine_suspended;
                                    }
                                }
                            } finally {
                            }
                        }
                        return coroutine_suspended;
                    case 1:
                        int i = appTokenProvider$getOrWaitForUserToken$1.Camera2StreamConfigurationMap;
                        mutex = (kotlinx.coroutines.sync.Mutex) appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRangesFor;
                        userAccessTokenType2 = (com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType) appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        completableDeferred = this.getHighSpeedVideoFpsRangesFor;
                        if (completableDeferred != null) {
                        }
                        com.paypal.oslo.app.identity.AppTokenProvider appTokenProvider2 = this;
                        kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>> CompletableDeferred$default2 = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                        this.getHighSpeedVideoFpsRangesFor = CompletableDeferred$default2;
                        pair = kotlin.TuplesKt.to(null, CompletableDeferred$default2);
                        mutex2.unlock(null);
                        completableDeferred2 = (kotlinx.coroutines.CompletableDeferred) pair.component1();
                        completableDeferred3 = (kotlinx.coroutines.CompletableDeferred) pair.component2();
                        if (completableDeferred2 == null) {
                        }
                        return coroutine_suspended;
                    case 2:
                        kotlin.ResultKt.throwOnFailure(obj);
                        return obj;
                    case 3:
                        completableDeferred6 = (kotlinx.coroutines.CompletableDeferred) appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRanges;
                        completableDeferred5 = (kotlinx.coroutines.CompletableDeferred) appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRangesFor;
                        userAccessTokenType4 = (com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType) appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizes;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            either = (arrow.core.Either) obj;
                            mutex3 = this.getHighSpeedVideoSizes;
                            appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenType4);
                            appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(completableDeferred5);
                            appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRanges = completableDeferred6;
                            appTokenProvider$getOrWaitForUserToken$1.getHighResolutionOutputSizeshNQ4ISI = either;
                            appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizesFor = mutex3;
                            appTokenProvider$getOrWaitForUserToken$1.Camera2StreamConfigurationMap = 0;
                            appTokenProvider$getOrWaitForUserToken$1.getInputSizeshNQ4ISI = 4;
                            if (mutex3.lock(null, appTokenProvider$getOrWaitForUserToken$1) != coroutine_suspended) {
                            }
                        } catch (java.lang.Throwable th5) {
                            completableDeferred4 = completableDeferred5;
                            userAccessTokenType3 = userAccessTokenType4;
                            th = th5;
                            completableDeferred3 = completableDeferred6;
                            completableDeferred7 = completableDeferred3;
                            th = th;
                            mutex5 = this.getHighSpeedVideoSizes;
                            appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenType3);
                            appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(completableDeferred4);
                            appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRanges = completableDeferred7;
                            appTokenProvider$getOrWaitForUserToken$1.getHighResolutionOutputSizeshNQ4ISI = th;
                            appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizesFor = mutex5;
                            appTokenProvider$getOrWaitForUserToken$1.Camera2StreamConfigurationMap = 0;
                            appTokenProvider$getOrWaitForUserToken$1.getInputSizeshNQ4ISI = 6;
                            if (mutex5.lock(null, appTokenProvider$getOrWaitForUserToken$1) != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        return coroutine_suspended;
                    case 4:
                        int i2 = appTokenProvider$getOrWaitForUserToken$1.Camera2StreamConfigurationMap;
                        mutex4 = (kotlinx.coroutines.sync.Mutex) appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizesFor;
                        arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token> either3 = (arrow.core.Either) appTokenProvider$getOrWaitForUserToken$1.getHighResolutionOutputSizeshNQ4ISI;
                        kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>> completableDeferred10 = (kotlinx.coroutines.CompletableDeferred) appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRanges;
                        completableDeferred4 = (kotlinx.coroutines.CompletableDeferred) appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRangesFor;
                        userAccessTokenType3 = (com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType) appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizes;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            either = either3;
                            completableDeferred7 = completableDeferred10;
                            completableDeferred8 = this.getHighSpeedVideoFpsRangesFor;
                            if (completableDeferred8 == completableDeferred7) {
                                kotlin.coroutines.jvm.internal.Boxing.boxBoolean(completableDeferred8.complete(either));
                            }
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                            mutex6 = this.getHighSpeedVideoSizes;
                            appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenType3);
                            appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(completableDeferred4);
                            appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRanges = completableDeferred7;
                            appTokenProvider$getOrWaitForUserToken$1.getHighResolutionOutputSizeshNQ4ISI = either;
                            appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizesFor = mutex6;
                            appTokenProvider$getOrWaitForUserToken$1.Camera2StreamConfigurationMap = 0;
                            appTokenProvider$getOrWaitForUserToken$1.getInputSizeshNQ4ISI = 5;
                            if (mutex6.lock(null, appTokenProvider$getOrWaitForUserToken$1) != coroutine_suspended) {
                            }
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            completableDeferred7 = completableDeferred10;
                            mutex5 = this.getHighSpeedVideoSizes;
                            appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizes = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenType3);
                            appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(completableDeferred4);
                            appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRanges = completableDeferred7;
                            appTokenProvider$getOrWaitForUserToken$1.getHighResolutionOutputSizeshNQ4ISI = th;
                            appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizesFor = mutex5;
                            appTokenProvider$getOrWaitForUserToken$1.Camera2StreamConfigurationMap = 0;
                            appTokenProvider$getOrWaitForUserToken$1.getInputSizeshNQ4ISI = 6;
                            if (mutex5.lock(null, appTokenProvider$getOrWaitForUserToken$1) != coroutine_suspended) {
                                th2 = th;
                                mutex2 = mutex5;
                                try {
                                    if (this.getHighSpeedVideoFpsRangesFor == completableDeferred7) {
                                    }
                                    kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                    throw th2;
                                } finally {
                                }
                            }
                            return coroutine_suspended;
                        }
                        return coroutine_suspended;
                    case 5:
                        int i3 = appTokenProvider$getOrWaitForUserToken$1.Camera2StreamConfigurationMap;
                        mutex6 = (kotlinx.coroutines.sync.Mutex) appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizesFor;
                        either2 = (arrow.core.Either) appTokenProvider$getOrWaitForUserToken$1.getHighResolutionOutputSizeshNQ4ISI;
                        completableDeferred7 = (kotlinx.coroutines.CompletableDeferred) appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (this.getHighSpeedVideoFpsRangesFor == completableDeferred7) {
                        }
                        kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                        return either2;
                    case 6:
                        int i4 = appTokenProvider$getOrWaitForUserToken$1.Camera2StreamConfigurationMap;
                        mutex2 = (kotlinx.coroutines.sync.Mutex) appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoSizesFor;
                        th2 = (java.lang.Throwable) appTokenProvider$getOrWaitForUserToken$1.getHighResolutionOutputSizeshNQ4ISI;
                        completableDeferred7 = (kotlinx.coroutines.CompletableDeferred) appTokenProvider$getOrWaitForUserToken$1.getHighSpeedVideoFpsRanges;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (this.getHighSpeedVideoFpsRangesFor == completableDeferred7) {
                            this.getHighSpeedVideoFpsRangesFor = null;
                        }
                        kotlin.Unit unit42 = kotlin.Unit.INSTANCE;
                        throw th2;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        appTokenProvider$getOrWaitForUserToken$1 = new com.paypal.oslo.app.identity.AppTokenProvider$getOrWaitForUserToken$1(this, continuation);
        java.lang.Object obj2 = appTokenProvider$getOrWaitForUserToken$1.getOutputFormats;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (appTokenProvider$getOrWaitForUserToken$1.getInputSizeshNQ4ISI) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Object getHighSpeedVideoFpsRanges(com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError, ? extends com.paypal.oslo.core.identity.domain.model.Token>> continuation) {
        if (this.getHighSpeedVideoFpsRanges.getBackStack().isEmpty()) {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.app.LoggerKt.log, "Cannot navigate to authentication - backstack is empty", null, null, 6, null);
            return arrow.core.EitherKt.left(com.paypal.oslo.core.identity.domain.model.TokenError.NotFound.INSTANCE);
        }
        return kotlinx.coroutines.BuildersKt.withContext(this.Camera2StreamConfigurationMap, new com.paypal.oslo.app.identity.AppTokenProvider$navigateToAuthenticationAndWaitForResult$2(this, com.paypal.oslo.core.navigation.result.NavResultRequestId.INSTANCE.m11594generateQDVFmTU(), userAccessTokenType, null), continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x00af, code lost:
    
        if (r15 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x01a7 A[Catch: all -> 0x01af, TryCatch #7 {all -> 0x01af, blocks: (B:13:0x01a3, B:15:0x01a7, B:16:0x01a9), top: B:12:0x01a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016a A[Catch: all -> 0x0172, TryCatch #1 {all -> 0x0172, blocks: (B:25:0x0166, B:27:0x016a, B:28:0x016c), top: B:24:0x0166 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e7 A[Catch: all -> 0x01b4, TryCatch #2 {all -> 0x01b4, blocks: (B:73:0x00e3, B:75:0x00e7, B:76:0x00ff), top: B:72:0x00e3 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object getTokenWithFreshAuth(com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType, kotlin.coroutines.Continuation<? super arrow.core.Either<? extends com.paypal.oslo.core.identity.domain.model.TokenError, ? extends com.paypal.oslo.core.identity.domain.model.Token>> continuation) {
        com.paypal.oslo.app.identity.AppTokenProvider$getTokenWithFreshAuth$1 appTokenProvider$getTokenWithFreshAuth$1;
        com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType2;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlinx.coroutines.sync.Mutex mutex2;
        kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>> completableDeferred;
        kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>> CompletableDeferred$default;
        java.lang.Throwable th;
        kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>> completableDeferred2;
        java.lang.Object highSpeedVideoFpsRanges;
        com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType userAccessTokenType3;
        kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>> completableDeferred3;
        java.lang.Throwable th2;
        arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token> either;
        kotlinx.coroutines.sync.Mutex mutex3;
        kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>> completableDeferred4;
        kotlinx.coroutines.sync.Mutex mutex4;
        kotlinx.coroutines.sync.Mutex mutex5;
        java.lang.Throwable th3;
        kotlinx.coroutines.sync.Mutex mutex6;
        kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>> completableDeferred5;
        kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>> completableDeferred6;
        arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token> either2;
        if (continuation instanceof com.paypal.oslo.app.identity.AppTokenProvider$getTokenWithFreshAuth$1) {
            appTokenProvider$getTokenWithFreshAuth$1 = (com.paypal.oslo.app.identity.AppTokenProvider$getTokenWithFreshAuth$1) continuation;
            if ((appTokenProvider$getTokenWithFreshAuth$1.getOutputMinFrameDuration & Integer.MIN_VALUE) != 0) {
                appTokenProvider$getTokenWithFreshAuth$1.getOutputMinFrameDuration -= 2147483648;
                java.lang.Object obj = appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoSizesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (appTokenProvider$getTokenWithFreshAuth$1.getOutputMinFrameDuration) {
                    case 0:
                        kotlin.ResultKt.throwOnFailure(obj);
                        appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRangesFor = userAccessTokenType;
                        appTokenProvider$getTokenWithFreshAuth$1.getOutputMinFrameDuration = 1;
                        obj = this.getHighResolutionOutputSizeshNQ4ISI.getToken(userAccessTokenType, appTokenProvider$getTokenWithFreshAuth$1);
                        break;
                    case 1:
                        userAccessTokenType = (com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType) appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        arrow.core.Either either3 = (arrow.core.Either) obj;
                        if (either3 instanceof arrow.core.Either.Right) {
                            return arrow.core.EitherKt.right((com.paypal.oslo.core.identity.domain.model.Token) ((arrow.core.Either.Right) either3).getValue());
                        }
                        if (either3 instanceof arrow.core.Either.Left) {
                            kotlinx.coroutines.sync.Mutex mutex7 = this.getHighSpeedVideoSizes;
                            appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRangesFor = userAccessTokenType;
                            appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoSizes = mutex7;
                            appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRanges = 0;
                            appTokenProvider$getTokenWithFreshAuth$1.getOutputMinFrameDuration = 2;
                            if (mutex7.lock(null, appTokenProvider$getTokenWithFreshAuth$1) != coroutine_suspended) {
                                userAccessTokenType2 = userAccessTokenType;
                                mutex = mutex7;
                                try {
                                    completableDeferred = this.getHighSpeedVideoFpsRangesFor;
                                    if (completableDeferred != null) {
                                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.app.LoggerKt.log, "getTokenWithFreshAuth: clearing stale pending auth deferred", null, null, 6, null);
                                        kotlin.coroutines.jvm.internal.Boxing.boxBoolean(completableDeferred.complete(arrow.core.EitherKt.left(com.paypal.oslo.core.identity.domain.model.TokenError.NotFound.INSTANCE)));
                                    }
                                    CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                                    this.getHighSpeedVideoFpsRangesFor = CompletableDeferred$default;
                                    try {
                                        appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenType2);
                                        appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoSizes = CompletableDeferred$default;
                                        appTokenProvider$getTokenWithFreshAuth$1.getOutputMinFrameDuration = 3;
                                        highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(userAccessTokenType2, appTokenProvider$getTokenWithFreshAuth$1);
                                        if (highSpeedVideoFpsRanges != coroutine_suspended) {
                                            obj = highSpeedVideoFpsRanges;
                                            completableDeferred2 = CompletableDeferred$default;
                                            either = (arrow.core.Either) obj;
                                            mutex3 = this.getHighSpeedVideoSizes;
                                            appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenType2);
                                            appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoSizes = completableDeferred2;
                                            appTokenProvider$getTokenWithFreshAuth$1.getHighResolutionOutputSizeshNQ4ISI = either;
                                            appTokenProvider$getTokenWithFreshAuth$1.Camera2StreamConfigurationMap = mutex3;
                                            appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRanges = 0;
                                            appTokenProvider$getTokenWithFreshAuth$1.getOutputMinFrameDuration = 4;
                                            if (mutex3.lock(null, appTokenProvider$getTokenWithFreshAuth$1) != coroutine_suspended) {
                                                userAccessTokenType3 = userAccessTokenType2;
                                                completableDeferred4 = completableDeferred2;
                                                mutex4 = mutex3;
                                                try {
                                                    try {
                                                        completableDeferred6 = this.getHighSpeedVideoFpsRangesFor;
                                                        if (completableDeferred6 == completableDeferred4 && completableDeferred6 != null) {
                                                            kotlin.coroutines.jvm.internal.Boxing.boxBoolean(completableDeferred6.complete(either));
                                                        }
                                                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                                        mutex2 = this.getHighSpeedVideoSizes;
                                                        appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenType3);
                                                        appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoSizes = completableDeferred4;
                                                        appTokenProvider$getTokenWithFreshAuth$1.getHighResolutionOutputSizeshNQ4ISI = either;
                                                        appTokenProvider$getTokenWithFreshAuth$1.Camera2StreamConfigurationMap = mutex2;
                                                        appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRanges = 0;
                                                        appTokenProvider$getTokenWithFreshAuth$1.getOutputMinFrameDuration = 5;
                                                        if (mutex2.lock(null, appTokenProvider$getTokenWithFreshAuth$1) != coroutine_suspended) {
                                                            either2 = either;
                                                            try {
                                                                if (this.getHighSpeedVideoFpsRangesFor == completableDeferred4) {
                                                                    this.getHighSpeedVideoFpsRangesFor = null;
                                                                }
                                                                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                                                return either2;
                                                            } finally {
                                                            }
                                                        }
                                                    } finally {
                                                    }
                                                } catch (java.lang.Throwable th4) {
                                                    th2 = th4;
                                                    completableDeferred5 = completableDeferred4;
                                                    completableDeferred3 = completableDeferred5;
                                                    mutex5 = this.getHighSpeedVideoSizes;
                                                    appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenType3);
                                                    appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoSizes = completableDeferred3;
                                                    appTokenProvider$getTokenWithFreshAuth$1.getHighResolutionOutputSizeshNQ4ISI = th2;
                                                    appTokenProvider$getTokenWithFreshAuth$1.Camera2StreamConfigurationMap = mutex5;
                                                    appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRanges = 0;
                                                    appTokenProvider$getTokenWithFreshAuth$1.getOutputMinFrameDuration = 6;
                                                    if (mutex5.lock(null, appTokenProvider$getTokenWithFreshAuth$1) != coroutine_suspended) {
                                                    }
                                                    return coroutine_suspended;
                                                }
                                            }
                                        }
                                    } catch (java.lang.Throwable th5) {
                                        th = th5;
                                        completableDeferred2 = CompletableDeferred$default;
                                        userAccessTokenType3 = userAccessTokenType2;
                                        completableDeferred3 = completableDeferred2;
                                        th2 = th;
                                        mutex5 = this.getHighSpeedVideoSizes;
                                        appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenType3);
                                        appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoSizes = completableDeferred3;
                                        appTokenProvider$getTokenWithFreshAuth$1.getHighResolutionOutputSizeshNQ4ISI = th2;
                                        appTokenProvider$getTokenWithFreshAuth$1.Camera2StreamConfigurationMap = mutex5;
                                        appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRanges = 0;
                                        appTokenProvider$getTokenWithFreshAuth$1.getOutputMinFrameDuration = 6;
                                        if (mutex5.lock(null, appTokenProvider$getTokenWithFreshAuth$1) != coroutine_suspended) {
                                            th3 = th2;
                                            mutex6 = mutex5;
                                            try {
                                                if (this.getHighSpeedVideoFpsRangesFor == completableDeferred3) {
                                                }
                                                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                                throw th3;
                                            } finally {
                                            }
                                        }
                                        return coroutine_suspended;
                                    }
                                } finally {
                                }
                            }
                            return coroutine_suspended;
                        }
                        throw new kotlin.NoWhenBranchMatchedException();
                    case 2:
                        int i = appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRanges;
                        mutex = (kotlinx.coroutines.sync.Mutex) appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoSizes;
                        userAccessTokenType2 = (com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType) appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                        completableDeferred = this.getHighSpeedVideoFpsRangesFor;
                        if (completableDeferred != null) {
                        }
                        CompletableDeferred$default = kotlinx.coroutines.CompletableDeferredKt.CompletableDeferred$default(null, 1, null);
                        this.getHighSpeedVideoFpsRangesFor = CompletableDeferred$default;
                        appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenType2);
                        appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoSizes = CompletableDeferred$default;
                        appTokenProvider$getTokenWithFreshAuth$1.getOutputMinFrameDuration = 3;
                        highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(userAccessTokenType2, appTokenProvider$getTokenWithFreshAuth$1);
                        if (highSpeedVideoFpsRanges != coroutine_suspended) {
                        }
                        return coroutine_suspended;
                    case 3:
                        completableDeferred2 = (kotlinx.coroutines.CompletableDeferred) appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoSizes;
                        userAccessTokenType2 = (com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType) appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRangesFor;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            either = (arrow.core.Either) obj;
                            mutex3 = this.getHighSpeedVideoSizes;
                            appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenType2);
                            appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoSizes = completableDeferred2;
                            appTokenProvider$getTokenWithFreshAuth$1.getHighResolutionOutputSizeshNQ4ISI = either;
                            appTokenProvider$getTokenWithFreshAuth$1.Camera2StreamConfigurationMap = mutex3;
                            appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRanges = 0;
                            appTokenProvider$getTokenWithFreshAuth$1.getOutputMinFrameDuration = 4;
                            if (mutex3.lock(null, appTokenProvider$getTokenWithFreshAuth$1) != coroutine_suspended) {
                            }
                        } catch (java.lang.Throwable th6) {
                            th = th6;
                            userAccessTokenType3 = userAccessTokenType2;
                            completableDeferred3 = completableDeferred2;
                            th2 = th;
                            mutex5 = this.getHighSpeedVideoSizes;
                            appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenType3);
                            appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoSizes = completableDeferred3;
                            appTokenProvider$getTokenWithFreshAuth$1.getHighResolutionOutputSizeshNQ4ISI = th2;
                            appTokenProvider$getTokenWithFreshAuth$1.Camera2StreamConfigurationMap = mutex5;
                            appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRanges = 0;
                            appTokenProvider$getTokenWithFreshAuth$1.getOutputMinFrameDuration = 6;
                            if (mutex5.lock(null, appTokenProvider$getTokenWithFreshAuth$1) != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        return coroutine_suspended;
                    case 4:
                        int i2 = appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRanges;
                        mutex4 = (kotlinx.coroutines.sync.Mutex) appTokenProvider$getTokenWithFreshAuth$1.Camera2StreamConfigurationMap;
                        arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token> either4 = (arrow.core.Either) appTokenProvider$getTokenWithFreshAuth$1.getHighResolutionOutputSizeshNQ4ISI;
                        completableDeferred5 = (kotlinx.coroutines.CompletableDeferred) appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoSizes;
                        userAccessTokenType3 = (com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType) appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRangesFor;
                        try {
                            kotlin.ResultKt.throwOnFailure(obj);
                            either = either4;
                            completableDeferred4 = completableDeferred5;
                            completableDeferred6 = this.getHighSpeedVideoFpsRangesFor;
                            if (completableDeferred6 == completableDeferred4) {
                                kotlin.coroutines.jvm.internal.Boxing.boxBoolean(completableDeferred6.complete(either));
                            }
                            kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                            mutex2 = this.getHighSpeedVideoSizes;
                            appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenType3);
                            appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoSizes = completableDeferred4;
                            appTokenProvider$getTokenWithFreshAuth$1.getHighResolutionOutputSizeshNQ4ISI = either;
                            appTokenProvider$getTokenWithFreshAuth$1.Camera2StreamConfigurationMap = mutex2;
                            appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRanges = 0;
                            appTokenProvider$getTokenWithFreshAuth$1.getOutputMinFrameDuration = 5;
                            if (mutex2.lock(null, appTokenProvider$getTokenWithFreshAuth$1) != coroutine_suspended) {
                            }
                        } catch (java.lang.Throwable th7) {
                            th2 = th7;
                            completableDeferred3 = completableDeferred5;
                            mutex5 = this.getHighSpeedVideoSizes;
                            appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(userAccessTokenType3);
                            appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoSizes = completableDeferred3;
                            appTokenProvider$getTokenWithFreshAuth$1.getHighResolutionOutputSizeshNQ4ISI = th2;
                            appTokenProvider$getTokenWithFreshAuth$1.Camera2StreamConfigurationMap = mutex5;
                            appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRanges = 0;
                            appTokenProvider$getTokenWithFreshAuth$1.getOutputMinFrameDuration = 6;
                            if (mutex5.lock(null, appTokenProvider$getTokenWithFreshAuth$1) != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        return coroutine_suspended;
                    case 5:
                        int i3 = appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRanges;
                        mutex2 = (kotlinx.coroutines.sync.Mutex) appTokenProvider$getTokenWithFreshAuth$1.Camera2StreamConfigurationMap;
                        either2 = (arrow.core.Either) appTokenProvider$getTokenWithFreshAuth$1.getHighResolutionOutputSizeshNQ4ISI;
                        completableDeferred4 = (kotlinx.coroutines.CompletableDeferred) appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (this.getHighSpeedVideoFpsRangesFor == completableDeferred4) {
                        }
                        kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                        return either2;
                    case 6:
                        int i4 = appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoFpsRanges;
                        mutex6 = (kotlinx.coroutines.sync.Mutex) appTokenProvider$getTokenWithFreshAuth$1.Camera2StreamConfigurationMap;
                        th3 = (java.lang.Throwable) appTokenProvider$getTokenWithFreshAuth$1.getHighResolutionOutputSizeshNQ4ISI;
                        completableDeferred3 = (kotlinx.coroutines.CompletableDeferred) appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoSizes;
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (this.getHighSpeedVideoFpsRangesFor == completableDeferred3) {
                            this.getHighSpeedVideoFpsRangesFor = null;
                        }
                        kotlin.Unit unit32 = kotlin.Unit.INSTANCE;
                        throw th3;
                    default:
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        appTokenProvider$getTokenWithFreshAuth$1 = new com.paypal.oslo.app.identity.AppTokenProvider$getTokenWithFreshAuth$1(this, continuation);
        java.lang.Object obj2 = appTokenProvider$getTokenWithFreshAuth$1.getHighSpeedVideoSizesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (appTokenProvider$getTokenWithFreshAuth$1.getOutputMinFrameDuration) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0098, code lost:
    
        if (r14.invalidateToken(r13, r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[Catch: all -> 0x0083, TRY_LEAVE, TryCatch #0 {all -> 0x0083, blocks: (B:18:0x0062, B:20:0x0066), top: B:17:0x0062 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.paypal.oslo.core.identity.domain.TokenProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invalidateToken(com.paypal.oslo.core.identity.domain.model.TokenType tokenType, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        com.paypal.oslo.app.identity.AppTokenProvider$invalidateToken$1 appTokenProvider$invalidateToken$1;
        int i;
        com.paypal.oslo.core.identity.domain.model.TokenType tokenType2;
        kotlinx.coroutines.sync.Mutex mutex;
        kotlinx.coroutines.CompletableDeferred<arrow.core.Either<com.paypal.oslo.core.identity.domain.model.TokenError, com.paypal.oslo.core.identity.domain.model.Token>> completableDeferred;
        try {
            if (continuation instanceof com.paypal.oslo.app.identity.AppTokenProvider$invalidateToken$1) {
                appTokenProvider$invalidateToken$1 = (com.paypal.oslo.app.identity.AppTokenProvider$invalidateToken$1) continuation;
                if ((appTokenProvider$invalidateToken$1.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                    appTokenProvider$invalidateToken$1.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                    java.lang.Object obj = appTokenProvider$invalidateToken$1.getHighSpeedVideoSizes;
                    java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = appTokenProvider$invalidateToken$1.getHighResolutionOutputSizeshNQ4ISI;
                    if (i != 0) {
                        kotlin.ResultKt.throwOnFailure(obj);
                        if (tokenType instanceof com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType) {
                            kotlinx.coroutines.sync.Mutex mutex2 = this.getHighSpeedVideoSizes;
                            appTokenProvider$invalidateToken$1.getHighSpeedVideoFpsRangesFor = tokenType;
                            appTokenProvider$invalidateToken$1.Camera2StreamConfigurationMap = mutex2;
                            appTokenProvider$invalidateToken$1.getHighSpeedVideoFpsRanges = 0;
                            appTokenProvider$invalidateToken$1.getHighResolutionOutputSizeshNQ4ISI = 1;
                            if (mutex2.lock(null, appTokenProvider$invalidateToken$1) != coroutine_suspended) {
                                tokenType2 = tokenType;
                                mutex = mutex2;
                            }
                            return coroutine_suspended;
                        }
                        com.paypal.oslo.feature.identity.api.IdentityTokenProvider identityTokenProvider = this.getHighResolutionOutputSizeshNQ4ISI;
                        appTokenProvider$invalidateToken$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenType);
                        appTokenProvider$invalidateToken$1.Camera2StreamConfigurationMap = null;
                        appTokenProvider$invalidateToken$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            kotlin.ResultKt.throwOnFailure(obj);
                            return kotlin.Unit.INSTANCE;
                        }
                        int i2 = appTokenProvider$invalidateToken$1.getHighSpeedVideoFpsRanges;
                        mutex = (kotlinx.coroutines.sync.Mutex) appTokenProvider$invalidateToken$1.Camera2StreamConfigurationMap;
                        tokenType2 = (com.paypal.oslo.core.identity.domain.model.TokenType) appTokenProvider$invalidateToken$1.getHighSpeedVideoFpsRangesFor;
                        kotlin.ResultKt.throwOnFailure(obj);
                    }
                    completableDeferred = this.getHighSpeedVideoFpsRangesFor;
                    if (completableDeferred != null) {
                        com.paypal.android.logger.Logger.d$default(com.paypal.oslo.app.LoggerKt.log, "invalidateToken: clearing pending auth deferred", null, null, 6, null);
                        completableDeferred.complete(arrow.core.EitherKt.left(com.paypal.oslo.core.identity.domain.model.TokenError.NotFound.INSTANCE));
                        this.getHighSpeedVideoFpsRangesFor = null;
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    }
                    mutex.unlock(null);
                    tokenType = tokenType2;
                    com.paypal.oslo.feature.identity.api.IdentityTokenProvider identityTokenProvider2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    appTokenProvider$invalidateToken$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenType);
                    appTokenProvider$invalidateToken$1.Camera2StreamConfigurationMap = null;
                    appTokenProvider$invalidateToken$1.getHighResolutionOutputSizeshNQ4ISI = 2;
                }
            }
            completableDeferred = this.getHighSpeedVideoFpsRangesFor;
            if (completableDeferred != null) {
            }
            mutex.unlock(null);
            tokenType = tokenType2;
            com.paypal.oslo.feature.identity.api.IdentityTokenProvider identityTokenProvider22 = this.getHighResolutionOutputSizeshNQ4ISI;
            appTokenProvider$invalidateToken$1.getHighSpeedVideoFpsRangesFor = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(tokenType);
            appTokenProvider$invalidateToken$1.Camera2StreamConfigurationMap = null;
            appTokenProvider$invalidateToken$1.getHighResolutionOutputSizeshNQ4ISI = 2;
        } catch (java.lang.Throwable th) {
            mutex.unlock(null);
            throw th;
        }
        appTokenProvider$invalidateToken$1 = new com.paypal.oslo.app.identity.AppTokenProvider$invalidateToken$1(this, continuation);
        java.lang.Object obj2 = appTokenProvider$invalidateToken$1.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = appTokenProvider$invalidateToken$1.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
    }
}
