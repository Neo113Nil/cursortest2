package com.zettle.sdk.core.permission;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/zettle/sdk/core/permission/Prerequisite$Authentication;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.permission.PermissionModule$checkAuth$2", f = "PermissionModule.kt", i = {0, 1, 2, 2, 3, 4}, l = {82, 97, 119, 121, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 188}, m = "invokeSuspend", n = {"$this$withContext", "$this$withContext", "$this$withContext", "permissionStillNeeded", "permissionStillNeeded", "permissionStillNeeded"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$0"})
/* loaded from: classes17.dex */
final class PermissionModule$checkAuth$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.permission.Prerequisite.Authentication>, java.lang.Object> {
    final /* synthetic */ com.zettle.sdk.core.permission.PermissionModule Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    private /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ com.zettle.sdk.core.permission.Prerequisite.Authentication getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:25:0x01af, code lost:
    
        if (r2 == null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01ab, code lost:
    
        if (r2 != r1) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0122, code lost:
    
        if (r7 != r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x008e, code lost:
    
        if (r7 != r1) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0249, code lost:
    
        if (r2 == r1) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01d9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.CoroutineScope coroutineScope;
        com.zettle.sdk.core.auth.AuthModule authModule;
        com.zettle.sdk.core.auth.AuthProvider authProvider;
        com.zettle.sdk.core.auth.AuthProvider authProvider2;
        java.lang.Object result;
        com.zettle.sdk.core.auth.AuthModule authModule2;
        java.lang.Object first;
        com.zettle.sdk.core.user.UserModule userModule;
        com.zettle.sdk.core.auth.AuthModule authModule3;
        com.zettle.sdk.core.auth.AuthModule authModule4;
        java.lang.Object accessToken;
        com.zettle.sdk.core.user.userconfig.UserConfig getHighResolutionOutputSizeshNQ4ISI;
        com.zettle.sdk.core.auth.AuthModule authModule5;
        com.zettle.sdk.core.auth.AuthModule authModule6;
        com.zettle.sdk.core.permission.Prerequisite.Authentication.Elevated elevated;
        com.zettle.sdk.core.user.UserModule userModule2;
        com.zettle.sdk.core.user.UserModule userModule3;
        java.lang.Object awaitUserId;
        com.zettle.sdk.core.permission.PermissionModule permissionModule;
        com.zettle.sdk.core.auth.AuthModule authModule7;
        com.zettle.sdk.core.permission.Prerequisite.Authentication authentication;
        java.lang.String str;
        com.zettle.sdk.core.user.UserModule userModule4;
        java.lang.Object awaitUserId2;
        com.zettle.sdk.core.permission.Prerequisite.Authentication authentication2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        java.lang.String str2 = null;
        switch (this.getHighSpeedVideoFpsRanges) {
            case 0:
                kotlin.ResultKt.throwOnFailure(obj);
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRangesFor;
                authModule = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                if (authModule != null) {
                    authModule2 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                    this.getHighSpeedVideoFpsRangesFor = coroutineScope;
                    this.getHighSpeedVideoFpsRanges = 1;
                    first = kotlinx.coroutines.flow.FlowKt.first(authModule2.getAuthFlow(), this);
                    break;
                } else {
                    authProvider = this.Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
                    if (authProvider == null) {
                        return null;
                    }
                    final com.zettle.sdk.core.permission.PermissionModule permissionModule2 = this.Camera2StreamConfigurationMap;
                    final com.zettle.sdk.core.permission.Prerequisite.Authentication authentication3 = this.getHighSpeedVideoSizes;
                    this.getHighSpeedVideoFpsRangesFor = permissionModule2;
                    this.getHighResolutionOutputSizeshNQ4ISI = authentication3;
                    this.getHighSpeedVideoFpsRanges = 6;
                    com.zettle.sdk.core.permission.PermissionModule$checkAuth$2 permissionModule$checkAuth$2 = this;
                    kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(permissionModule$checkAuth$2), 1);
                    cancellableContinuationImpl.initCancellability();
                    final kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
                    authProvider2 = permissionModule2.getHighSpeedVideoSizes;
                    authProvider2.getAccessTokenOrNullAsync(authentication3.getScope(), true, new kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit>() { // from class: com.zettle.sdk.core.permission.PermissionModule$checkAuth$2$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(java.lang.String str3) {
                            Camera2StreamConfigurationMap(str3);
                            return kotlin.Unit.INSTANCE;
                        }

                        public final void Camera2StreamConfigurationMap(java.lang.String str3) {
                            com.zettle.sdk.core.auth.AuthProvider authProvider3;
                            com.zettle.sdk.core.network.NetworkModule networkModule;
                            com.zettle.sdk.core.permission.PermissionModule permissionModule3 = com.zettle.sdk.core.permission.PermissionModule.this;
                            com.zettle.sdk.commons.network.Scope scope = authentication3.getScope();
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("Get access token for scope[");
                            sb.append(scope);
                            sb.append("]");
                            com.zettle.sdk.core.log.LogKt.log(permissionModule3, sb.toString());
                            if (str3 == null) {
                                authProvider3 = com.zettle.sdk.core.permission.PermissionModule.this.getHighSpeedVideoSizes;
                                boolean isLoggedIn = authProvider3.isLoggedIn();
                                if (!isLoggedIn) {
                                    kotlinx.coroutines.CancellableContinuation<com.zettle.sdk.core.permission.Prerequisite.Authentication> cancellableContinuation = cancellableContinuationImpl2;
                                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                    cancellableContinuation.resumeWith(kotlin.Result.m23436constructorimpl(authentication3));
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                    com.zettle.sdk.core.permission.PermissionModule permissionModule4 = com.zettle.sdk.core.permission.PermissionModule.this;
                                    com.zettle.sdk.commons.network.Scope scope2 = authentication3.getScope();
                                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Access token for scope[");
                                    sb2.append(scope2);
                                    sb2.append("] is null, show Login page");
                                    com.zettle.sdk.core.log.LogKt.log(permissionModule4, sb2.toString());
                                    return;
                                }
                                if (isLoggedIn) {
                                    com.zettle.sdk.core.permission.Prerequisite.Authentication authentication4 = authentication3;
                                    if (!(authentication4 instanceof com.zettle.sdk.core.permission.Prerequisite.Authentication.Granted) || !((com.zettle.sdk.core.permission.Prerequisite.Authentication.Granted) authentication4).getOfflineMode()) {
                                        networkModule = com.zettle.sdk.core.permission.PermissionModule.this.getOutputMinFrameDuration;
                                        if (kotlin.jvm.internal.Intrinsics.areEqual(networkModule != null ? networkModule.getConnection() : null, com.zettle.sdk.core.network.Connection.Disconnected.INSTANCE)) {
                                            kotlinx.coroutines.CancellableContinuation<com.zettle.sdk.core.permission.Prerequisite.Authentication> cancellableContinuation2 = cancellableContinuationImpl2;
                                            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                            cancellableContinuation2.resumeWith(kotlin.Result.m23436constructorimpl(null));
                                            return;
                                        }
                                        kotlinx.coroutines.CancellableContinuation<com.zettle.sdk.core.permission.Prerequisite.Authentication> cancellableContinuation3 = cancellableContinuationImpl2;
                                        kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                                        cancellableContinuation3.resumeWith(kotlin.Result.m23436constructorimpl(new com.zettle.sdk.core.permission.Prerequisite.Authentication.Elevated(authentication3.getScope())));
                                        kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                        com.zettle.sdk.core.permission.PermissionModule permissionModule5 = com.zettle.sdk.core.permission.PermissionModule.this;
                                        com.zettle.sdk.commons.network.Scope scope3 = authentication3.getScope();
                                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("User logged in but Access token for scope[");
                                        sb3.append(scope3);
                                        sb3.append("] is null, show Elevation");
                                        com.zettle.sdk.core.log.LogKt.log(permissionModule5, sb3.toString());
                                        return;
                                    }
                                    kotlinx.coroutines.CancellableContinuation<com.zettle.sdk.core.permission.Prerequisite.Authentication> cancellableContinuation4 = cancellableContinuationImpl2;
                                    kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                                    cancellableContinuation4.resumeWith(kotlin.Result.m23436constructorimpl(null));
                                    return;
                                }
                                return;
                            }
                            kotlinx.coroutines.CancellableContinuation<com.zettle.sdk.core.permission.Prerequisite.Authentication> cancellableContinuation5 = cancellableContinuationImpl2;
                            kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
                            cancellableContinuation5.resumeWith(kotlin.Result.m23436constructorimpl(null));
                            kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                            com.zettle.sdk.core.permission.PermissionModule permissionModule6 = com.zettle.sdk.core.permission.PermissionModule.this;
                            com.zettle.sdk.commons.network.Scope scope4 = authentication3.getScope();
                            java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Access token for scope[");
                            sb4.append(scope4);
                            sb4.append("] is available");
                            com.zettle.sdk.core.log.LogKt.log(permissionModule6, sb4.toString());
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(1);
                        }
                    });
                    result = cancellableContinuationImpl.getResult();
                    if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(permissionModule$checkAuth$2);
                        break;
                    }
                }
                return coroutine_suspended;
            case 1:
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                first = obj;
                com.zettle.sdk.core.auth.LoggedInState loggedInState = (com.zettle.sdk.core.auth.LoggedInState) first;
                if (!(loggedInState instanceof com.zettle.sdk.core.auth.LoggedInState.LoggedIn) || !((com.zettle.sdk.core.auth.LoggedInState.LoggedIn) loggedInState).getFailedToRetrieveToken()) {
                    userModule = this.Camera2StreamConfigurationMap.getInputFormats;
                    if (((userModule == null || (getHighResolutionOutputSizeshNQ4ISI = userModule.getGetHighResolutionOutputSizeshNQ4ISI()) == null) ? null : com.zettle.sdk.core.user.userconfig.UserConfigKt.tokenProviderStatus(getHighResolutionOutputSizeshNQ4ISI)) == com.zettle.sdk.core.auth.TokenProviderStatus.CAN_NOT_PROVIDE_TOKEN) {
                        com.zettle.sdk.core.log.LogKt.log(this.Camera2StreamConfigurationMap, "Token provider cannot provide token, skipping token fetch (offline mode)");
                        return null;
                    }
                    com.zettle.sdk.core.permission.PermissionModule permissionModule3 = this.Camera2StreamConfigurationMap;
                    com.zettle.sdk.core.permission.PermissionModule permissionModule4 = permissionModule3;
                    authModule3 = permissionModule3.getHighResolutionOutputSizeshNQ4ISI;
                    com.zettle.sdk.core.log.LogKt.debug(permissionModule4, "Fetching token for ".concat(java.lang.String.valueOf(kotlin.collections.ArraysKt.joinToString$default(authModule3.getScopeProvider().invoke(this.getHighSpeedVideoSizes.getScope()), ", ", (java.lang.CharSequence) null, (java.lang.CharSequence) null, 0, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 62, (java.lang.Object) null))));
                    authModule4 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                    this.getHighSpeedVideoFpsRangesFor = coroutineScope;
                    this.getHighSpeedVideoFpsRanges = 2;
                    accessToken = authModule4.getAccessToken(this.getHighSpeedVideoSizes.getScope(), false, java.util.concurrent.TimeUnit.MINUTES.toMillis(2L), this);
                    break;
                } else {
                    com.zettle.sdk.core.log.LogKt.log(this.Camera2StreamConfigurationMap, "Auth state indicates no-token login, skipping token fetch (offline mode)");
                    return null;
                }
            case 2:
                coroutineScope = (kotlinx.coroutines.CoroutineScope) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                accessToken = obj;
                com.zettle.sdk.core.auth.OAuthTokensInternal oAuthTokensInternal = (com.zettle.sdk.core.auth.OAuthTokensInternal) accessToken;
                java.lang.String accessToken2 = oAuthTokensInternal.getAccessToken();
                com.zettle.sdk.core.permission.PermissionModule permissionModule5 = this.Camera2StreamConfigurationMap;
                com.zettle.sdk.core.permission.PermissionModule permissionModule6 = permissionModule5;
                authModule5 = permissionModule5.getHighResolutionOutputSizeshNQ4ISI;
                com.zettle.sdk.core.log.LogKt.debug(permissionModule6, "auth.isLoggedIn is ".concat(java.lang.String.valueOf(authModule5.isLoggedIn())));
                boolean z = oAuthTokensInternal instanceof com.zettle.sdk.core.auth.ConnectionOAuthToken;
                if (!(z && ((com.zettle.sdk.core.auth.ConnectionOAuthToken) oAuthTokensInternal).getFailedToRetrieveToken()) && accessToken2 == null) {
                    authModule6 = this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI;
                    boolean isLoggedIn = authModule6.isLoggedIn();
                    if (!isLoggedIn) {
                        elevated = this.getHighSpeedVideoSizes;
                    } else {
                        if (!isLoggedIn) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        elevated = new com.zettle.sdk.core.permission.Prerequisite.Authentication.Elevated(this.getHighSpeedVideoSizes.getScope());
                    }
                } else {
                    elevated = null;
                }
                if (elevated == null && z) {
                    userModule2 = this.Camera2StreamConfigurationMap.getInputFormats;
                    if ((userModule2 != null ? userModule2.getGetHighResolutionOutputSizeshNQ4ISI() : null) == null) {
                        com.zettle.sdk.core.log.LogKt.log(this.Camera2StreamConfigurationMap, "Waiting for user config to be available");
                        userModule3 = this.Camera2StreamConfigurationMap.getInputFormats;
                        if (userModule3 != null) {
                            this.getHighSpeedVideoFpsRangesFor = coroutineScope;
                            this.getHighResolutionOutputSizeshNQ4ISI = elevated;
                            this.getHighSpeedVideoFpsRanges = 3;
                            awaitUserId = com.zettle.sdk.core.user.UserModuleKt.awaitUserId(userModule3, 5000L, this);
                            break;
                        }
                        permissionModule = this.Camera2StreamConfigurationMap;
                        com.zettle.sdk.core.permission.Prerequisite.Authentication authentication4 = this.getHighSpeedVideoSizes;
                        com.zettle.sdk.core.log.LogKt.log(permissionModule, "Most probably user config fail to fetch, trying to verify auth token again");
                        authModule7 = permissionModule.getHighResolutionOutputSizeshNQ4ISI;
                        com.zettle.sdk.commons.network.Scope scope = authentication4.getScope();
                        this.getHighSpeedVideoFpsRangesFor = elevated;
                        this.getHighResolutionOutputSizeshNQ4ISI = permissionModule;
                        this.getHighSpeedVideoFpsRanges = 4;
                        if (authModule7.mo23159verify0E7RQCE(scope, true, this) != coroutine_suspended) {
                            authentication = elevated;
                            userModule4 = permissionModule.getInputFormats;
                            if (userModule4 != null) {
                                this.getHighSpeedVideoFpsRangesFor = authentication;
                                this.getHighResolutionOutputSizeshNQ4ISI = null;
                                this.getHighSpeedVideoFpsRanges = 5;
                                awaitUserId2 = com.zettle.sdk.core.user.UserModuleKt.awaitUserId(userModule4, 5000L, this);
                                if (awaitUserId2 != coroutine_suspended) {
                                    authentication2 = authentication;
                                    str2 = (java.lang.String) awaitUserId2;
                                    authentication = authentication2;
                                }
                            }
                            elevated = authentication;
                            str = str2;
                            if (str == null) {
                                com.zettle.sdk.core.log.LogKt.log(this.Camera2StreamConfigurationMap, "Not logged in after asking token");
                                return new com.zettle.sdk.core.permission.Prerequisite.Authentication.Elevated(this.getHighSpeedVideoSizes.getScope());
                            }
                        }
                        return coroutine_suspended;
                    }
                }
                return elevated;
            case 3:
                com.zettle.sdk.core.permission.Prerequisite.Authentication authentication5 = (com.zettle.sdk.core.permission.Prerequisite.Authentication) this.getHighResolutionOutputSizeshNQ4ISI;
                kotlin.ResultKt.throwOnFailure(obj);
                elevated = authentication5;
                awaitUserId = obj;
                str = (java.lang.String) awaitUserId;
                break;
            case 4:
                permissionModule = (com.zettle.sdk.core.permission.PermissionModule) this.getHighResolutionOutputSizeshNQ4ISI;
                authentication = (com.zettle.sdk.core.permission.Prerequisite.Authentication) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                ((kotlin.Result) obj).getCamera2StreamConfigurationMap();
                userModule4 = permissionModule.getInputFormats;
                if (userModule4 != null) {
                }
                elevated = authentication;
                str = str2;
                if (str == null) {
                }
                return elevated;
            case 5:
                authentication2 = (com.zettle.sdk.core.permission.Prerequisite.Authentication) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                awaitUserId2 = obj;
                str2 = (java.lang.String) awaitUserId2;
                authentication = authentication2;
                elevated = authentication;
                str = str2;
                if (str == null) {
                }
                return elevated;
            case 6:
                kotlin.ResultKt.throwOnFailure(obj);
                result = obj;
                return (com.zettle.sdk.core.permission.Prerequisite.Authentication) result;
            default:
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.permission.Prerequisite.Authentication> continuation) {
        return ((com.zettle.sdk.core.permission.PermissionModule$checkAuth$2) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        com.zettle.sdk.core.permission.PermissionModule$checkAuth$2 permissionModule$checkAuth$2 = new com.zettle.sdk.core.permission.PermissionModule$checkAuth$2(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
        permissionModule$checkAuth$2.getHighSpeedVideoFpsRangesFor = obj;
        return permissionModule$checkAuth$2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PermissionModule$checkAuth$2(com.zettle.sdk.core.permission.PermissionModule permissionModule, com.zettle.sdk.core.permission.Prerequisite.Authentication authentication, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.permission.PermissionModule$checkAuth$2> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = permissionModule;
        this.getHighSpeedVideoSizes = authentication;
    }
}
