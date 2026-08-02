package com.zettle.sdk.core.auth.merchant;

@kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003BG\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0016ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ,\u0010 \u001a\u00020\u001e2\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020\u001e0\u001dH\u0016ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001eH\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u001eH\u0016¢\u0006\u0004\b'\u0010&J5\u0010)\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020\"2\u0018\u0010\u001f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u0018\u0012\u0004\u0012\u00020\u001e0\u001dH\u0096@ø\u0001\u0000¢\u0006\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0019008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00101R\u0014\u00102\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00104R\u0018\u00108\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u00106\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010>R\u0014\u0010;\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010?R\u001c\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190@8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bD\u0010:\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/core/auth/merchant/MerchantProviderSimplifiedConfig;", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "Lcom/zettle/sdk/core/Module;", "Lcom/zettle/sdk/core/log/Loggable;", "Lcom/zettle/sdk/core/auth/AuthModule;", "auth", "Landroidx/lifecycle/MutableLiveData;", "Lcom/zettle/sdk/core/auth/User$AuthState;", "publicApi", "Lcom/zettle/sdk/commons/SecureStorage;", com.google.android.libraries.places.api.model.PlaceTypes.STORAGE, "Lcom/zettle/sdk/core/auth/merchant/UserConfigRepository;", "userConfigRepository", "Lcom/zettle/sdk/core/network/NetworkModule;", "networkModule", "Lcom/zettle/sdk/core/auth/ServiceProvider;", "service", "Lkotlinx/coroutines/CoroutineScope;", "zettleScope", "<init>", "(Lcom/zettle/sdk/core/auth/AuthModule;Landroidx/lifecycle/MutableLiveData;Lcom/zettle/sdk/commons/SecureStorage;Lcom/zettle/sdk/core/auth/merchant/UserConfigRepository;Lcom/zettle/sdk/core/network/NetworkModule;Lcom/zettle/sdk/core/auth/ServiceProvider;Lkotlinx/coroutines/CoroutineScope;)V", "Lcom/zettle/sdk/core/user/userconfig/SimplifiedUserConfig;", "getHighSpeedVideoFpsRanges", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/Result;", "Lcom/zettle/sdk/core/user/userconfig/UserConfig;", "getUserConfig-d1pmJ48", "()Ljava/lang/Object;", "getUserConfig", "Lkotlin/Function1;", "", "onResult", "getUserConfigAsync", "(Lkotlin/jvm/functions/Function1;)V", "", "isLoggedIn", "()Z", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "()V", "stop", "force", "syncUserConfig", "(ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/zettle/sdk/core/auth/AuthModule;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/core/user/userconfig/UserConfig;", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/commons/state/MutableState;", "Lcom/zettle/sdk/commons/state/MutableState;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/zettle/sdk/core/network/NetworkModule;", "Landroidx/lifecycle/MutableLiveData;", "Lkotlinx/coroutines/Job;", "getHighSpeedVideoSizesFor", "Lkotlinx/coroutines/Job;", "getOutputMinFrameDuration", "getInputFormats", "Lkotlinx/coroutines/CoroutineScope;", "getOutputFormats", "Lcom/zettle/sdk/core/auth/ServiceProvider;", "getInputSizeshNQ4ISI", "Lcom/zettle/sdk/commons/SecureStorage;", "Lcom/zettle/sdk/core/auth/merchant/UserConfigRepository;", "Lcom/zettle/sdk/commons/state/State;", "getUserConfigState", "()Lcom/zettle/sdk/commons/state/State;", "userConfigState", "getOutputStallDurationlomOqCM", "getOutputSizes"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MerchantProviderSimplifiedConfig implements com.zettle.sdk.core.auth.merchant.MerchantConfig, com.zettle.sdk.core.Module, com.zettle.sdk.core.log.Loggable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.state.MutableState<com.zettle.sdk.core.user.userconfig.UserConfig> getHighSpeedVideoFpsRangesFor;
    private final com.zettle.sdk.core.network.NetworkModule getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.zettle.sdk.core.auth.AuthModule getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private com.zettle.sdk.core.user.userconfig.UserConfig Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.view.MutableLiveData<com.zettle.sdk.core.auth.User.AuthState> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private kotlinx.coroutines.Job getOutputMinFrameDuration;
    private final kotlinx.coroutines.CoroutineScope getInputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.zettle.sdk.core.auth.merchant.UserConfigRepository getOutputFormats;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final com.zettle.sdk.core.auth.ServiceProvider getInputSizeshNQ4ISI;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.SecureStorage getHighSpeedVideoSizesFor;

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getOutputSizes;

    public MerchantProviderSimplifiedConfig(com.zettle.sdk.core.auth.AuthModule authModule, androidx.view.MutableLiveData<com.zettle.sdk.core.auth.User.AuthState> mutableLiveData, com.zettle.sdk.commons.SecureStorage secureStorage, com.zettle.sdk.core.auth.merchant.UserConfigRepository userConfigRepository, com.zettle.sdk.core.network.NetworkModule networkModule, com.zettle.sdk.core.auth.ServiceProvider serviceProvider, kotlinx.coroutines.CoroutineScope coroutineScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableLiveData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(secureStorage, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userConfigRepository, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(serviceProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        this.getHighSpeedVideoSizes = authModule;
        this.getHighSpeedVideoFpsRanges = mutableLiveData;
        this.getHighSpeedVideoSizesFor = secureStorage;
        this.getOutputFormats = userConfigRepository;
        this.getHighResolutionOutputSizeshNQ4ISI = networkModule;
        this.getInputSizeshNQ4ISI = serviceProvider;
        this.getOutputSizes = coroutineScope;
        this.getInputFormats = com.zettle.sdk.core.ZettleScope.scope$default(com.zettle.sdk.core.ZettleScope.INSTANCE, "MerchantConfig", null, null, 6, null);
        this.getHighSpeedVideoFpsRangesFor = com.zettle.sdk.commons.state.MutableState.Companion.create$default(com.zettle.sdk.commons.state.MutableState.INSTANCE, null, null, 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ java.lang.Object access$syncUserConfig(com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig merchantProviderSimplifiedConfig, kotlin.coroutines.Continuation continuation) {
        com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$syncUserConfig$2 merchantProviderSimplifiedConfig$syncUserConfig$2;
        int i;
        if (continuation instanceof com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$syncUserConfig$2) {
            merchantProviderSimplifiedConfig$syncUserConfig$2 = (com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$syncUserConfig$2) continuation;
            if ((merchantProviderSimplifiedConfig$syncUserConfig$2.getHighResolutionOutputSizeshNQ4ISI & Integer.MIN_VALUE) != 0) {
                merchantProviderSimplifiedConfig$syncUserConfig$2.getHighResolutionOutputSizeshNQ4ISI -= 2147483648;
                java.lang.Object obj = merchantProviderSimplifiedConfig$syncUserConfig$2.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = merchantProviderSimplifiedConfig$syncUserConfig$2.getHighResolutionOutputSizeshNQ4ISI;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.zettle.sdk.core.auth.merchant.UserConfigRepository userConfigRepository = merchantProviderSimplifiedConfig.getOutputFormats;
                    merchantProviderSimplifiedConfig$syncUserConfig$2.getHighSpeedVideoFpsRangesFor = merchantProviderSimplifiedConfig;
                    merchantProviderSimplifiedConfig$syncUserConfig$2.getHighResolutionOutputSizeshNQ4ISI = 1;
                    obj = userConfigRepository.fetchRemoteUserConfig(merchantProviderSimplifiedConfig$syncUserConfig$2);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    merchantProviderSimplifiedConfig = (com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig) merchantProviderSimplifiedConfig$syncUserConfig$2.getHighSpeedVideoFpsRangesFor;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                final com.zettle.sdk.core.user.userconfig.UserConfig userConfig = (com.zettle.sdk.core.user.userconfig.UserConfig) obj;
                com.zettle.sdk.core.log.LogKt.log(merchantProviderSimplifiedConfig, "## Updating with config -> ".concat(java.lang.String.valueOf(userConfig)));
                merchantProviderSimplifiedConfig.getHighSpeedVideoFpsRangesFor.update(new kotlin.jvm.functions.Function1<com.zettle.sdk.core.user.userconfig.UserConfig, com.zettle.sdk.core.user.userconfig.UserConfig>() { // from class: com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$syncUserConfig$3
                    @Override // kotlin.jvm.functions.Function1
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final com.zettle.sdk.core.user.userconfig.UserConfig invoke(com.zettle.sdk.core.user.userconfig.UserConfig userConfig2) {
                        return com.zettle.sdk.core.user.userconfig.UserConfig.this;
                    }

                    {
                        super(1);
                    }
                });
                merchantProviderSimplifiedConfig.Camera2StreamConfigurationMap = userConfig;
                return userConfig;
            }
        }
        merchantProviderSimplifiedConfig$syncUserConfig$2 = new com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$syncUserConfig$2(merchantProviderSimplifiedConfig, continuation);
        java.lang.Object obj2 = merchantProviderSimplifiedConfig$syncUserConfig$2.getHighSpeedVideoSizes;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = merchantProviderSimplifiedConfig$syncUserConfig$2.getHighResolutionOutputSizeshNQ4ISI;
        if (i != 0) {
        }
        final com.zettle.sdk.core.user.userconfig.UserConfig userConfig2 = (com.zettle.sdk.core.user.userconfig.UserConfig) obj2;
        com.zettle.sdk.core.log.LogKt.log(merchantProviderSimplifiedConfig, "## Updating with config -> ".concat(java.lang.String.valueOf(userConfig2)));
        merchantProviderSimplifiedConfig.getHighSpeedVideoFpsRangesFor.update(new kotlin.jvm.functions.Function1<com.zettle.sdk.core.user.userconfig.UserConfig, com.zettle.sdk.core.user.userconfig.UserConfig>() { // from class: com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$syncUserConfig$3
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final com.zettle.sdk.core.user.userconfig.UserConfig invoke(com.zettle.sdk.core.user.userconfig.UserConfig userConfig22) {
                return com.zettle.sdk.core.user.userconfig.UserConfig.this;
            }

            {
                super(1);
            }
        });
        merchantProviderSimplifiedConfig.Camera2StreamConfigurationMap = userConfig2;
        return userConfig2;
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    public /* synthetic */ MerchantProviderSimplifiedConfig(com.zettle.sdk.core.auth.AuthModule authModule, androidx.view.MutableLiveData mutableLiveData, com.zettle.sdk.commons.SecureStorage secureStorage, com.zettle.sdk.core.auth.merchant.UserConfigRepository userConfigRepository, com.zettle.sdk.core.network.NetworkModule networkModule, com.zettle.sdk.core.auth.ServiceProvider serviceProvider, kotlinx.coroutines.CoroutineScope coroutineScope, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(authModule, mutableLiveData, secureStorage, userConfigRepository, networkModule, serviceProvider, (i & 64) != 0 ? com.zettle.sdk.core.ZettleScope.scope$default(com.zettle.sdk.core.ZettleScope.INSTANCE, "MerchantProviderSimplifiedConfig", null, null, 6, null) : coroutineScope);
    }

    @Override // com.zettle.sdk.core.Module
    public final void start() {
        kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getOutputSizes, kotlinx.coroutines.Dispatchers.getIO(), null, new com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$performAutomaticLoginOnStart$1(this, new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$start$1

            @kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/zettle/sdk/core/auth/LoggedInState;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$start$1$1", f = "MerchantProviderSimplifiedConfig.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$start$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<com.zettle.sdk.core.auth.LoggedInState, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
                int getHighResolutionOutputSizeshNQ4ISI;
                /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges;
                final /* synthetic */ com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig getHighSpeedVideoSizes;

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final java.lang.Object invokeSuspend(java.lang.Object obj) {
                    com.zettle.sdk.commons.state.MutableState mutableState;
                    androidx.view.MutableLiveData mutableLiveData;
                    androidx.view.MutableLiveData mutableLiveData2;
                    final com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig simplifiedUserConfig;
                    com.zettle.sdk.commons.state.MutableState mutableState2;
                    androidx.view.MutableLiveData mutableLiveData3;
                    androidx.view.MutableLiveData mutableLiveData4;
                    kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.getHighResolutionOutputSizeshNQ4ISI != 0) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                    com.zettle.sdk.core.auth.LoggedInState loggedInState = (com.zettle.sdk.core.auth.LoggedInState) this.getHighSpeedVideoFpsRanges;
                    if (loggedInState instanceof com.zettle.sdk.core.auth.LoggedInState.LoggedIn) {
                        if (((com.zettle.sdk.core.auth.LoggedInState.LoggedIn) loggedInState).getFailedToRetrieveToken()) {
                            java.lang.Object m23164access$forceGetCachedUserConfigd1pmJ48 = com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig.m23164access$forceGetCachedUserConfigd1pmJ48(this.getHighSpeedVideoSizes);
                            if (kotlin.Result.m23441isFailureimpl(m23164access$forceGetCachedUserConfigd1pmJ48)) {
                                m23164access$forceGetCachedUserConfigd1pmJ48 = null;
                            }
                            simplifiedUserConfig = (com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig) m23164access$forceGetCachedUserConfigd1pmJ48;
                        } else {
                            java.lang.Object mo23163getUserConfigd1pmJ48 = this.getHighSpeedVideoSizes.mo23163getUserConfigd1pmJ48();
                            if (kotlin.Result.m23441isFailureimpl(mo23163getUserConfigd1pmJ48)) {
                                mo23163getUserConfigd1pmJ48 = null;
                            }
                            simplifiedUserConfig = mo23163getUserConfigd1pmJ48 instanceof com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig ? (com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig) mo23163getUserConfigd1pmJ48 : null;
                        }
                        com.zettle.sdk.core.log.LogKt.log(this.getHighSpeedVideoSizes, "## Updating with config -> ".concat(java.lang.String.valueOf(simplifiedUserConfig)));
                        if (simplifiedUserConfig != null) {
                            com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig merchantProviderSimplifiedConfig = this.getHighSpeedVideoSizes;
                            mutableState2 = merchantProviderSimplifiedConfig.getHighSpeedVideoFpsRangesFor;
                            mutableState2.update(
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0060: INVOKE 
                                  (r2v2 'mutableState2' com.zettle.sdk.commons.state.MutableState)
                                  (wrap:kotlin.jvm.functions.Function1<com.zettle.sdk.core.user.userconfig.UserConfig, com.zettle.sdk.core.user.userconfig.UserConfig>:0x005b: CONSTRUCTOR (r5v25 'simplifiedUserConfig' com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig A[DONT_INLINE]) A[MD:(com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig):void (m), WRAPPED] call: com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$start$1$1$1$1.<init>(com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig):void type: CONSTRUCTOR)
                                 INTERFACE call: com.zettle.sdk.commons.state.MutableState.update(kotlin.jvm.functions.Function1):boolean A[MD:(kotlin.jvm.functions.Function1<? super T, ? extends T>):boolean (m)] in method: com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$start$1.1.invokeSuspend(java.lang.Object):java.lang.Object, file: classes17.dex
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$start$1$1$1$1, state: NOT_LOADED
                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
                                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
                                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
                                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                	... 31 more
                                */
                            /*
                                this = this;
                                kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r0 = r4.getHighResolutionOutputSizeshNQ4ISI
                                if (r0 != 0) goto Lcd
                                kotlin.ResultKt.throwOnFailure(r5)
                                java.lang.Object r5 = r4.getHighSpeedVideoFpsRanges
                                com.zettle.sdk.core.auth.LoggedInState r5 = (com.zettle.sdk.core.auth.LoggedInState) r5
                                boolean r0 = r5 instanceof com.zettle.sdk.core.auth.LoggedInState.LoggedIn
                                r1 = 0
                                if (r0 == 0) goto L8d
                                com.zettle.sdk.core.auth.LoggedInState$LoggedIn r5 = (com.zettle.sdk.core.auth.LoggedInState.LoggedIn) r5
                                boolean r5 = r5.getFailedToRetrieveToken()
                                if (r5 == 0) goto L2b
                                com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig r5 = r4.getHighSpeedVideoSizes
                                java.lang.Object r5 = com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig.m23164access$forceGetCachedUserConfigd1pmJ48(r5)
                                boolean r0 = kotlin.Result.m23441isFailureimpl(r5)
                                if (r0 == 0) goto L28
                                r5 = r1
                            L28:
                                com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig r5 = (com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig) r5
                                goto L40
                            L2b:
                                com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig r5 = r4.getHighSpeedVideoSizes
                                java.lang.Object r5 = r5.mo23163getUserConfigd1pmJ48()
                                boolean r0 = kotlin.Result.m23441isFailureimpl(r5)
                                if (r0 == 0) goto L38
                                r5 = r1
                            L38:
                                boolean r0 = r5 instanceof com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig
                                if (r0 == 0) goto L3f
                                com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig r5 = (com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig) r5
                                goto L40
                            L3f:
                                r5 = r1
                            L40:
                                com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig r0 = r4.getHighSpeedVideoSizes
                                com.zettle.sdk.core.log.Loggable r0 = (com.zettle.sdk.core.log.Loggable) r0
                                java.lang.String r2 = "## Updating with config -> "
                                java.lang.String r3 = java.lang.String.valueOf(r5)
                                java.lang.String r2 = r2.concat(r3)
                                com.zettle.sdk.core.log.LogKt.log(r0, r2)
                                if (r5 == 0) goto L87
                                com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig r0 = r4.getHighSpeedVideoSizes
                                com.zettle.sdk.commons.state.MutableState r2 = com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig.access$getDelegate$p(r0)
                                com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$start$1$1$1$1 r3 = new com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$start$1$1$1$1
                                r3.<init>(r5)
                                kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
                                r2.update(r3)
                                r2 = r5
                                com.zettle.sdk.core.user.userconfig.UserConfig r2 = (com.zettle.sdk.core.user.userconfig.UserConfig) r2
                                com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig.access$setCurrentUserConfig$p(r0, r2)
                                com.zettle.sdk.core.auth.User$AuthState$LoggedIn r2 = new com.zettle.sdk.core.auth.User$AuthState$LoggedIn
                                com.zettle.sdk.core.auth.User$Info r5 = com.zettle.sdk.core.auth.UserKt.toInfo(r5)
                                r2.<init>(r5, r1)
                                androidx.lifecycle.MutableLiveData r5 = com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig.access$getPublicApi$p(r0)
                                java.lang.Object r5 = r5.getValue()
                                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r2)
                                if (r5 != 0) goto L87
                                androidx.lifecycle.MutableLiveData r5 = com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig.access$getPublicApi$p(r0)
                                r5.postValue(r2)
                            L87:
                                com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig r5 = r4.getHighSpeedVideoSizes
                                com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig.access$startUserConfigAutoRefreshJob(r5)
                                goto Lca
                            L8d:
                                com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig r5 = r4.getHighSpeedVideoSizes
                                com.zettle.sdk.core.log.Loggable r5 = (com.zettle.sdk.core.log.Loggable) r5
                                java.lang.String r0 = "## Clearing user config."
                                com.zettle.sdk.core.log.LogKt.log(r5, r0)
                                com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig r5 = r4.getHighSpeedVideoSizes
                                com.zettle.sdk.commons.state.MutableState r5 = com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig.access$getDelegate$p(r5)
                                com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$start$1$1$2 r0 = new kotlin.jvm.functions.Function1<com.zettle.sdk.core.user.userconfig.UserConfig, com.zettle.sdk.core.user.userconfig.UserConfig>() { // from class: com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig.start.1.1.2
                                    @Override // kotlin.jvm.functions.Function1
                                    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                                    public final com.zettle.sdk.core.user.userconfig.UserConfig invoke(com.zettle.sdk.core.user.userconfig.UserConfig r1) {
                                        /*
                                            r0 = this;
                                            r1 = 0
                                            return r1
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$start$1.AnonymousClass1.AnonymousClass2.invoke(com.zettle.sdk.core.user.userconfig.UserConfig):com.zettle.sdk.core.user.userconfig.UserConfig");
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final /* synthetic */ com.zettle.sdk.core.user.userconfig.UserConfig invoke(com.zettle.sdk.core.user.userconfig.UserConfig r1) {
                                        /*
                                            r0 = this;
                                            com.zettle.sdk.core.user.userconfig.UserConfig r1 = (com.zettle.sdk.core.user.userconfig.UserConfig) r1
                                            com.zettle.sdk.core.user.userconfig.UserConfig r1 = r0.invoke(r1)
                                            return r1
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$start$1.AnonymousClass1.AnonymousClass2.invoke(java.lang.Object):java.lang.Object");
                                    }

                                    {
                                        /*
                                            r1 = this;
                                            r0 = 1
                                            r1.<init>(r0)
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$start$1.AnonymousClass1.AnonymousClass2.<init>():void");
                                    }

                                    static {
                                        /*
                                            com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$start$1$1$2 r0 = new com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$start$1$1$2
                                            r0.<init>()
                                            
                                            // error: 0x0005: SPUT (r0 I:com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$start$1$1$2) com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig.start.1.1.2.getHighSpeedVideoFpsRanges com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$start$1$1$2
                                            return
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$start$1.AnonymousClass1.AnonymousClass2.<clinit>():void");
                                    }
                                }
                                kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
                                r5.update(r0)
                                com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig r5 = r4.getHighSpeedVideoSizes
                                com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig.access$setCurrentUserConfig$p(r5, r1)
                                com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig r5 = r4.getHighSpeedVideoSizes
                                androidx.lifecycle.MutableLiveData r5 = com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig.access$getPublicApi$p(r5)
                                java.lang.Object r5 = r5.getValue()
                                com.zettle.sdk.core.auth.User$AuthState$LoggedOut r0 = com.zettle.sdk.core.auth.User.AuthState.LoggedOut.INSTANCE
                                boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r5, r0)
                                if (r5 != 0) goto Lca
                                com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig r5 = r4.getHighSpeedVideoSizes
                                androidx.lifecycle.MutableLiveData r5 = com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig.access$getPublicApi$p(r5)
                                com.zettle.sdk.core.auth.User$AuthState$LoggedOut r0 = com.zettle.sdk.core.auth.User.AuthState.LoggedOut.INSTANCE
                                r5.postValue(r0)
                                com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig r5 = r4.getHighSpeedVideoSizes
                                com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig.access$stopUserConfigAutoRefreshJob(r5)
                            Lca:
                                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                                return r5
                            Lcd:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r0)
                                throw r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$start$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ java.lang.Object invoke(com.zettle.sdk.core.auth.LoggedInState loggedInState, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                            return ((com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$start$1.AnonymousClass1) create(loggedInState, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
                            com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$start$1.AnonymousClass1 anonymousClass1 = new com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$start$1.AnonymousClass1(this.getHighSpeedVideoSizes, continuation);
                            anonymousClass1.getHighSpeedVideoFpsRanges = obj;
                            return anonymousClass1;
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        AnonymousClass1(com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig merchantProviderSimplifiedConfig, kotlin.coroutines.Continuation<? super com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$start$1.AnonymousClass1> continuation) {
                            super(2, continuation);
                            this.getHighSpeedVideoSizes = merchantProviderSimplifiedConfig;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final /* synthetic */ kotlin.Unit invoke() {
                        getHighSpeedVideoFpsRangesFor();
                        return kotlin.Unit.INSTANCE;
                    }

                    public final void getHighSpeedVideoFpsRangesFor() {
                        com.zettle.sdk.core.auth.AuthModule authModule;
                        kotlinx.coroutines.CoroutineScope coroutineScope;
                        authModule = com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig.this.getHighSpeedVideoSizes;
                        kotlinx.coroutines.flow.Flow onEach = kotlinx.coroutines.flow.FlowKt.onEach(authModule.getAuthFlow(), new com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$start$1.AnonymousClass1(com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig.this, null));
                        coroutineScope = com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig.this.getInputFormats;
                        kotlinx.coroutines.flow.FlowKt.launchIn(onEach, coroutineScope);
                    }

                    {
                        super(0);
                    }
                }, null), 2, null);
            }

            @Override // com.zettle.sdk.core.Module
            public final void stop() {
                com.zettle.sdk.core.auth.merchant.MerchantConfig.DefaultImpls.stop(this);
                kotlinx.coroutines.Job job = this.getOutputMinFrameDuration;
                if (job != null) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
                this.getOutputMinFrameDuration = null;
            }

            @Override // com.zettle.sdk.core.auth.merchant.MerchantConfig
            public final com.zettle.sdk.commons.state.State<com.zettle.sdk.core.user.userconfig.UserConfig> getUserConfigState() {
                return this.getHighSpeedVideoFpsRangesFor;
            }

            @Override // com.zettle.sdk.core.auth.merchant.MerchantConfig
            public final void getUserConfigAsync(kotlin.jvm.functions.Function1<? super kotlin.Result<? extends com.zettle.sdk.core.user.userconfig.UserConfig>, kotlin.Unit> onResult) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onResult, "");
                kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(this.getInputFormats, null, null, new com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$getUserConfigAsync$1(this, onResult, null), 3, null);
            }

            @Override // com.zettle.sdk.core.auth.merchant.MerchantConfig
            /* renamed from: getUserConfig-d1pmJ48 */
            public final java.lang.Object mo23163getUserConfigd1pmJ48() {
                java.lang.Object runBlocking$default;
                runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$getUserConfig$1(this, null), 1, null);
                return ((kotlin.Result) runBlocking$default).getCamera2StreamConfigurationMap();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX WARN: Removed duplicated region for block: B:12:0x004e A[EXC_TOP_SPLITTER, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final java.lang.Object getHighSpeedVideoFpsRanges(kotlin.coroutines.Continuation<? super com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig> continuation) {
                com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$getCachedUserConfig$1 merchantProviderSimplifiedConfig$getCachedUserConfig$1;
                int i;
                com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig merchantProviderSimplifiedConfig;
                java.lang.String str;
                if (continuation instanceof com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$getCachedUserConfig$1) {
                    merchantProviderSimplifiedConfig$getCachedUserConfig$1 = (com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$getCachedUserConfig$1) continuation;
                    if ((merchantProviderSimplifiedConfig$getCachedUserConfig$1.getHighSpeedVideoFpsRanges & Integer.MIN_VALUE) != 0) {
                        merchantProviderSimplifiedConfig$getCachedUserConfig$1.getHighSpeedVideoFpsRanges -= 2147483648;
                        java.lang.Object obj = merchantProviderSimplifiedConfig$getCachedUserConfig$1.getHighSpeedVideoSizes;
                        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i = merchantProviderSimplifiedConfig$getCachedUserConfig$1.getHighSpeedVideoFpsRanges;
                        if (i != 0) {
                            kotlin.ResultKt.throwOnFailure(obj);
                            com.zettle.sdk.commons.SecureStorage secureStorage = this.getHighSpeedVideoSizesFor;
                            merchantProviderSimplifiedConfig$getCachedUserConfig$1.Camera2StreamConfigurationMap = this;
                            merchantProviderSimplifiedConfig$getCachedUserConfig$1.getHighSpeedVideoFpsRanges = 1;
                            obj = secureStorage.get(com.zettle.sdk.core.auth.merchant.MerchantConfigKt.USER_CONFIG_KEY, merchantProviderSimplifiedConfig$getCachedUserConfig$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            merchantProviderSimplifiedConfig = this;
                        } else {
                            if (i != 1) {
                                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            merchantProviderSimplifiedConfig = (com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig) merchantProviderSimplifiedConfig$getCachedUserConfig$1.Camera2StreamConfigurationMap;
                            kotlin.ResultKt.throwOnFailure(obj);
                        }
                        str = (java.lang.String) obj;
                        if (str != null) {
                            return null;
                        }
                        try {
                            kotlinx.serialization.json.Json.Companion companion = kotlinx.serialization.json.Json.INSTANCE;
                            companion.getSerializersModule();
                            com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig simplifiedUserConfig = (com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig) companion.decodeFromString(com.zettle.sdk.core.user.userconfig.SimplifiedUserConfig.INSTANCE.serializer(), str);
                            merchantProviderSimplifiedConfig.Camera2StreamConfigurationMap = simplifiedUserConfig;
                            java.lang.StringBuilder sb = new java.lang.StringBuilder("## Cached user config retrieved -> ");
                            sb.append(simplifiedUserConfig);
                            com.zettle.sdk.core.log.LogKt.log(merchantProviderSimplifiedConfig, sb.toString());
                            return simplifiedUserConfig;
                        } catch (java.lang.Exception e) {
                            com.zettle.sdk.core.log.LogKt.warn(merchantProviderSimplifiedConfig, "Failed to deserialize cached user config", e);
                            return null;
                        }
                    }
                }
                merchantProviderSimplifiedConfig$getCachedUserConfig$1 = new com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$getCachedUserConfig$1(this, continuation);
                java.lang.Object obj2 = merchantProviderSimplifiedConfig$getCachedUserConfig$1.getHighSpeedVideoSizes;
                java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = merchantProviderSimplifiedConfig$getCachedUserConfig$1.getHighSpeedVideoFpsRanges;
                if (i != 0) {
                }
                str = (java.lang.String) obj2;
                if (str != null) {
                }
            }

            @Override // com.zettle.sdk.core.auth.merchant.MerchantConfig
            public final boolean isLoggedIn() {
                return this.getHighSpeedVideoSizes.isLoggedIn();
            }

            @Override // com.zettle.sdk.core.auth.merchant.MerchantConfig
            public final java.lang.Object syncUserConfig(boolean z, kotlin.jvm.functions.Function1<? super kotlin.Result<? extends com.zettle.sdk.core.user.userconfig.UserConfig>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
                function1.invoke(kotlin.Result.m23435boximpl(mo23163getUserConfigd1pmJ48()));
                return kotlin.Unit.INSTANCE;
            }

            /* renamed from: access$forceGetCachedUserConfig-d1pmJ48, reason: not valid java name */
            public static final /* synthetic */ java.lang.Object m23164access$forceGetCachedUserConfigd1pmJ48(com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig merchantProviderSimplifiedConfig) {
                java.lang.Object runBlocking$default;
                runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$forceGetCachedUserConfig$1(merchantProviderSimplifiedConfig, null), 1, null);
                return ((kotlin.Result) runBlocking$default).getCamera2StreamConfigurationMap();
            }

            /* renamed from: access$getRefreshDelay-UwyO8pc, reason: not valid java name */
            public static final /* synthetic */ long m23165access$getRefreshDelayUwyO8pc(com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig merchantProviderSimplifiedConfig) {
                long duration;
                com.zettle.sdk.core.user.userconfig.UserConfig userConfig = merchantProviderSimplifiedConfig.Camera2StreamConfigurationMap;
                com.zettle.sdk.core.auth.TokenProviderStatus tokenProviderStatus = userConfig != null ? com.zettle.sdk.core.user.userconfig.UserConfigKt.tokenProviderStatus(userConfig) : null;
                if (tokenProviderStatus != null && com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig.WhenMappings.$EnumSwitchMapping$0[tokenProviderStatus.ordinal()] == 1) {
                    kotlin.time.Duration.Companion companion = kotlin.time.Duration.INSTANCE;
                    duration = kotlin.time.DurationKt.toDuration(5, kotlin.time.DurationUnit.MINUTES);
                } else {
                    kotlin.time.Duration.Companion companion2 = kotlin.time.Duration.INSTANCE;
                    duration = kotlin.time.DurationKt.toDuration(15, kotlin.time.DurationUnit.MINUTES);
                }
                java.lang.String m23977toStringimpl = kotlin.time.Duration.m23977toStringimpl(duration);
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Schedule startUserConfigAutoRefreshJob in ");
                sb.append(m23977toStringimpl);
                sb.append(" (tokenProviderStatus=");
                sb.append(tokenProviderStatus);
                sb.append(")");
                com.zettle.sdk.core.log.LogKt.log(merchantProviderSimplifiedConfig, sb.toString());
                return duration;
            }

            public static final /* synthetic */ void access$startUserConfigAutoRefreshJob(com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig merchantProviderSimplifiedConfig) {
                kotlinx.coroutines.Job launch$default;
                kotlinx.coroutines.Job job = merchantProviderSimplifiedConfig.getOutputMinFrameDuration;
                if (job == null || !job.isActive()) {
                    launch$default = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(merchantProviderSimplifiedConfig.getOutputSizes, null, kotlinx.coroutines.CoroutineStart.LAZY, new com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig$startUserConfigAutoRefreshJob$1(merchantProviderSimplifiedConfig, null), 1, null);
                    merchantProviderSimplifiedConfig.getOutputMinFrameDuration = launch$default;
                    if (launch$default != null) {
                        launch$default.start();
                    }
                }
            }

            public static final /* synthetic */ void access$stopUserConfigAutoRefreshJob(com.zettle.sdk.core.auth.merchant.MerchantProviderSimplifiedConfig merchantProviderSimplifiedConfig) {
                kotlinx.coroutines.Job job = merchantProviderSimplifiedConfig.getOutputMinFrameDuration;
                if (job != null) {
                    kotlinx.coroutines.Job.DefaultImpls.cancel$default(job, (java.util.concurrent.CancellationException) null, 1, (java.lang.Object) null);
                }
                merchantProviderSimplifiedConfig.getOutputMinFrameDuration = null;
            }

            @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            public final /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[com.zettle.sdk.core.auth.TokenProviderStatus.values().length];
                    try {
                        iArr[com.zettle.sdk.core.auth.TokenProviderStatus.CAN_NOT_PROVIDE_TOKEN.ordinal()] = 1;
                    } catch (java.lang.NoSuchFieldError unused) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }
        }
