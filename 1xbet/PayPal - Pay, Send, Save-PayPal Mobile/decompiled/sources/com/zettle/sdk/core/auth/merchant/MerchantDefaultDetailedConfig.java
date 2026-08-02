package com.zettle.sdk.core.auth.merchant;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u0011\u001a\u00020\u000f2\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000f0\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00132\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0004\u0012\u00020\u000f0\u000eH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR#\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u001e8WX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lcom/zettle/sdk/core/auth/merchant/MerchantDefaultDetailedConfig;", "Lcom/zettle/sdk/core/auth/merchant/MerchantConfig;", "Lcom/izettle/android/auth/ZettleAuth;", "auth", "Landroidx/lifecycle/MutableLiveData;", "Lcom/zettle/sdk/core/auth/User$AuthState;", "publicApi", "<init>", "(Lcom/izettle/android/auth/ZettleAuth;Landroidx/lifecycle/MutableLiveData;)V", "Lkotlin/Result;", "Lcom/zettle/sdk/core/user/userconfig/UserConfig;", "getUserConfig-d1pmJ48", "()Ljava/lang/Object;", "getUserConfig", "Lkotlin/Function1;", "", "onResult", "getUserConfigAsync", "(Lkotlin/jvm/functions/Function1;)V", "", "isLoggedIn", "()Z", "force", "syncUserConfig", "(ZLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/izettle/android/auth/ZettleAuth;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "Landroidx/lifecycle/MutableLiveData;", "Lcom/zettle/sdk/commons/state/State;", "userConfigState$delegate", "Lkotlin/Lazy;", "getUserConfigState", "()Lcom/zettle/sdk/commons/state/State;", "userConfigState"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class MerchantDefaultDetailedConfig implements com.zettle.sdk.core.auth.merchant.MerchantConfig {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.izettle.android.auth.ZettleAuth getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.view.MutableLiveData<com.zettle.sdk.core.auth.User.AuthState> getHighSpeedVideoFpsRanges;

    /* renamed from: userConfigState$delegate, reason: from kotlin metadata */
    private final kotlin.Lazy userConfigState;

    public MerchantDefaultDetailedConfig(com.izettle.android.auth.ZettleAuth zettleAuth, androidx.view.MutableLiveData<com.zettle.sdk.core.auth.User.AuthState> mutableLiveData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleAuth, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableLiveData, "");
        this.getHighResolutionOutputSizeshNQ4ISI = zettleAuth;
        this.getHighSpeedVideoFpsRanges = mutableLiveData;
        this.userConfigState = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<com.zettle.sdk.core.auth.merchant.MutableUserConfigState>() { // from class: com.zettle.sdk.core.auth.merchant.MerchantDefaultDetailedConfig$userConfigState$2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
            public final com.zettle.sdk.core.auth.merchant.MutableUserConfigState invoke() {
                java.util.Set set;
                androidx.view.MutableLiveData mutableLiveData2;
                com.zettle.sdk.core.auth.merchant.MutableUserConfigState mutableUserConfigState;
                com.izettle.android.auth.ZettleAuth zettleAuth2;
                set = com.zettle.sdk.core.auth.merchant.MerchantDefaultDetailedConfigKt.getHighSpeedVideoSizes;
                mutableLiveData2 = com.zettle.sdk.core.auth.merchant.MerchantDefaultDetailedConfig.this.getHighSpeedVideoFpsRanges;
                set.add(mutableLiveData2);
                mutableUserConfigState = com.zettle.sdk.core.auth.merchant.MerchantDefaultDetailedConfigKt.getHighSpeedVideoFpsRangesFor;
                if (mutableUserConfigState != null) {
                    return mutableUserConfigState;
                }
                zettleAuth2 = com.zettle.sdk.core.auth.merchant.MerchantDefaultDetailedConfig.this.getHighResolutionOutputSizeshNQ4ISI;
                com.zettle.sdk.core.auth.merchant.MutableUserConfigState mutableUserConfigState2 = new com.zettle.sdk.core.auth.merchant.MutableUserConfigState(zettleAuth2);
                com.zettle.sdk.core.auth.merchant.MerchantDefaultDetailedConfigKt.getHighSpeedVideoFpsRangesFor = mutableUserConfigState2;
                return mutableUserConfigState2;
            }

            {
                super(0);
            }
        });
    }

    @Override // com.zettle.sdk.core.Module
    public final void start() {
        com.zettle.sdk.core.auth.merchant.MerchantConfig.DefaultImpls.start(this);
    }

    @Override // com.zettle.sdk.core.Module
    public final void stop() {
        com.zettle.sdk.core.auth.merchant.MerchantConfig.DefaultImpls.stop(this);
    }

    @Override // com.zettle.sdk.core.auth.merchant.MerchantConfig
    public final com.zettle.sdk.commons.state.State<com.zettle.sdk.core.user.userconfig.UserConfig> getUserConfigState() {
        com.zettle.sdk.commons.state.State<com.zettle.sdk.core.user.userconfig.UserConfig> state;
        synchronized (this) {
            state = (com.zettle.sdk.commons.state.State) this.userConfigState.getValue();
        }
        return state;
    }

    @Override // com.zettle.sdk.core.auth.merchant.MerchantConfig
    public final void getUserConfigAsync(final kotlin.jvm.functions.Function1<? super kotlin.Result<? extends com.zettle.sdk.core.user.userconfig.UserConfig>, kotlin.Unit> onResult) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onResult, "");
        this.getHighResolutionOutputSizeshNQ4ISI.getUserConfigAsync(new kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.zettle.android.entities.UserConfig, ? extends java.lang.Throwable>, kotlin.Unit>() { // from class: com.zettle.sdk.core.auth.merchant.MerchantDefaultDetailedConfig$getUserConfigAsync$1
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.core.data.result.Result<? extends com.zettle.android.entities.UserConfig, ? extends java.lang.Throwable> result) {
                Camera2StreamConfigurationMap(result);
                return kotlin.Unit.INSTANCE;
            }

            public final void Camera2StreamConfigurationMap(com.izettle.android.core.data.result.Result<? extends com.zettle.android.entities.UserConfig, ? extends java.lang.Throwable> result) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                kotlin.jvm.functions.Function1<kotlin.Result<? extends com.zettle.sdk.core.user.userconfig.UserConfig>, kotlin.Unit> function1 = onResult;
                if (!(result instanceof com.izettle.android.core.data.result.Success)) {
                    if (!(result instanceof com.izettle.android.core.data.result.Failure)) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    java.lang.Throwable th = (java.lang.Throwable) ((com.izettle.android.core.data.result.Failure) result).getError();
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    function1.invoke(kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure(th))));
                    result = new com.izettle.android.core.data.result.Failure(kotlin.Unit.INSTANCE);
                }
                kotlin.jvm.functions.Function1<kotlin.Result<? extends com.zettle.sdk.core.user.userconfig.UserConfig>, kotlin.Unit> function12 = onResult;
                if (result instanceof com.izettle.android.core.data.result.Success) {
                    com.zettle.android.entities.UserConfig userConfig = (com.zettle.android.entities.UserConfig) ((com.izettle.android.core.data.result.Success) result).getValue();
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    function12.invoke(kotlin.Result.m23435boximpl(kotlin.Result.m23436constructorimpl(com.zettle.sdk.core.auth.UserKt.toDetailedUserConfig(userConfig))));
                    new com.izettle.android.core.data.result.Success(kotlin.Unit.INSTANCE);
                    return;
                }
                if (!(result instanceof com.izettle.android.core.data.result.Failure)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
    }

    @Override // com.zettle.sdk.core.auth.merchant.MerchantConfig
    /* renamed from: getUserConfig-d1pmJ48 */
    public final java.lang.Object mo23163getUserConfigd1pmJ48() {
        com.izettle.android.core.data.result.Result<com.zettle.android.entities.UserConfig, java.lang.Throwable> userConfig = this.getHighResolutionOutputSizeshNQ4ISI.getUserConfig();
        com.zettle.android.entities.UserConfig userConfig2 = (com.zettle.android.entities.UserConfig) com.izettle.android.core.data.result.ResultKt.getOrNull(userConfig);
        if (userConfig2 == null) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure((java.lang.Throwable) com.izettle.android.core.data.result.ResultKt.getError(userConfig)));
        }
        kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
        return kotlin.Result.m23436constructorimpl(com.zettle.sdk.core.auth.UserKt.toDetailedUserConfig(userConfig2));
    }

    @Override // com.zettle.sdk.core.auth.merchant.MerchantConfig
    public final boolean isLoggedIn() {
        return this.getHighResolutionOutputSizeshNQ4ISI.isLoggedIn();
    }

    @Override // com.zettle.sdk.core.auth.merchant.MerchantConfig
    public final java.lang.Object syncUserConfig(boolean z, final kotlin.jvm.functions.Function1<? super kotlin.Result<? extends com.zettle.sdk.core.user.userconfig.UserConfig>, kotlin.Unit> function1, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        this.getHighResolutionOutputSizeshNQ4ISI.syncUserConfig(z, new kotlin.jvm.functions.Function1<com.izettle.android.core.data.result.Result<? extends com.zettle.android.entities.UserConfig, ? extends java.lang.Throwable>, kotlin.Unit>() { // from class: com.zettle.sdk.core.auth.merchant.MerchantDefaultDetailedConfig$syncUserConfig$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.core.data.result.Result<? extends com.zettle.android.entities.UserConfig, ? extends java.lang.Throwable> result) {
                getHighResolutionOutputSizeshNQ4ISI(result);
                return kotlin.Unit.INSTANCE;
            }

            public final void getHighResolutionOutputSizeshNQ4ISI(final com.izettle.android.core.data.result.Result<? extends com.zettle.android.entities.UserConfig, ? extends java.lang.Throwable> result) {
                java.lang.Object m23436constructorimpl;
                com.zettle.sdk.core.auth.merchant.MutableUserConfigState mutableUserConfigState;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(result, "");
                kotlin.jvm.functions.Function1<kotlin.Result<? extends com.zettle.sdk.core.user.userconfig.UserConfig>, kotlin.Unit> function12 = function1;
                if (result instanceof com.izettle.android.core.data.result.Success) {
                    mutableUserConfigState = com.zettle.sdk.core.auth.merchant.MerchantDefaultDetailedConfigKt.getHighSpeedVideoFpsRangesFor;
                    if (mutableUserConfigState != null) {
                        mutableUserConfigState.update(new kotlin.jvm.functions.Function1<com.zettle.sdk.core.user.userconfig.UserConfig, com.zettle.sdk.core.user.userconfig.UserConfig>() { // from class: com.zettle.sdk.core.auth.merchant.MerchantDefaultDetailedConfig$syncUserConfig$2.1
                            @Override // kotlin.jvm.functions.Function1
                            /* renamed from: getHighSpeedVideoSizes, reason: merged with bridge method [inline-methods] */
                            public final com.zettle.sdk.core.user.userconfig.UserConfig invoke(com.zettle.sdk.core.user.userconfig.UserConfig userConfig) {
                                return com.zettle.sdk.core.auth.UserKt.toDetailedUserConfig((com.zettle.android.entities.UserConfig) ((com.izettle.android.core.data.result.Success) result).getValue());
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }
                        });
                    }
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(com.zettle.sdk.core.auth.UserKt.toDetailedUserConfig((com.zettle.android.entities.UserConfig) ((com.izettle.android.core.data.result.Success) result).getValue()));
                } else {
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    m23436constructorimpl = kotlin.Result.m23436constructorimpl(kotlin.ResultKt.createFailure((java.lang.Throwable) com.izettle.android.core.data.result.ResultKt.getError(result)));
                }
                function12.invoke(kotlin.Result.m23435boximpl(m23436constructorimpl));
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }
        });
        return kotlin.Unit.INSTANCE;
    }
}
