package com.zettle.sdk.feature.taptopay.ui.settings;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 12\u00020\u00012\u00020\u00022\u00020\u0003:\u00011B7\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J#\u0010\u0018\u001a\u00020\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010!R\u0016\u0010%\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0(8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010+R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\r0(8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010*R\u0014\u00100\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010/"}, d2 = {"Lcom/zettle/sdk/feature/taptopay/ui/settings/TapToPaySettingsStorageImpl;", "Lcom/zettle/sdk/feature/taptopay/ui/settings/TapToPaySettingsStorage;", "Landroid/content/SharedPreferences$OnSharedPreferenceChangeListener;", "Lcom/zettle/sdk/core/log/Loggable;", "Landroid/content/SharedPreferences;", "prefs", "Lcom/zettle/sdk/core/user/UserModule;", "userModule", "Lkotlinx/coroutines/CoroutineScope;", "zettleScope", "Lcom/zettle/sdk/commons/util/ExternalConfig;", "config", "Lkotlin/Function0;", "", "isDebug", "<init>", "(Landroid/content/SharedPreferences;Lcom/zettle/sdk/core/user/UserModule;Lkotlinx/coroutines/CoroutineScope;Lcom/zettle/sdk/commons/util/ExternalConfig;Lkotlin/jvm/functions/Function0;)V", "isCurrentUserEnabled", "()Z", "isCurrentUserOnboardCTAInteractedWith", "sharedPreferences", "", "key", "", "onSharedPreferenceChanged", "(Landroid/content/SharedPreferences;Ljava/lang/String;)V", "enabled", "setEnabled", "(Z)Z", "interactedWith", "setInteractedWithOnboardCTA", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRanges", "Lkotlinx/coroutines/flow/MutableStateFlow;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lcom/zettle/sdk/commons/util/ExternalConfig;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Lkotlin/jvm/functions/Function0;", "Lkotlinx/coroutines/flow/Flow;", "isEnabledFlow", "()Lkotlinx/coroutines/flow/Flow;", "Landroid/content/SharedPreferences;", "getShouldShowOnboardCTAFlow", "shouldShowOnboardCTAFlow", "getOutputMinFrameDuration", "Lcom/zettle/sdk/core/user/UserModule;", "getInputFormats", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class TapToPaySettingsStorageImpl implements com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorage, android.content.SharedPreferences.OnSharedPreferenceChangeListener, com.zettle.sdk.core.log.Loggable {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.util.ExternalConfig getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.SharedPreferences Camera2StreamConfigurationMap;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighSpeedVideoFpsRanges;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> getHighSpeedVideoFpsRangesFor;
    private final kotlin.jvm.functions.Function0<java.lang.Boolean> getHighSpeedVideoSizes;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private final com.zettle.sdk.core.user.UserModule getInputFormats;

    public TapToPaySettingsStorageImpl(android.content.SharedPreferences sharedPreferences, com.zettle.sdk.core.user.UserModule userModule, kotlinx.coroutines.CoroutineScope coroutineScope, com.zettle.sdk.commons.util.ExternalConfig externalConfig, kotlin.jvm.functions.Function0<java.lang.Boolean> function0) {
        java.lang.String userId;
        java.lang.String userId2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sharedPreferences, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userModule, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        this.Camera2StreamConfigurationMap = sharedPreferences;
        this.getInputFormats = userModule;
        this.getHighResolutionOutputSizeshNQ4ISI = externalConfig;
        this.getHighSpeedVideoSizes = function0;
        com.zettle.sdk.core.auth.Merchant.LoggedIn currentLoggedInMerchant = userModule.getCurrentLoggedInMerchant();
        boolean z = false;
        this.getHighSpeedVideoFpsRangesFor = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.valueOf((currentLoggedInMerchant == null || (userId2 = currentLoggedInMerchant.getUserId()) == null) ? false : sharedPreferences.getBoolean("onboardingCTA".concat(java.lang.String.valueOf(userId2)), isCurrentUserOnboardCTAInteractedWith())));
        com.zettle.sdk.core.auth.Merchant.LoggedIn currentLoggedInMerchant2 = userModule.getCurrentLoggedInMerchant();
        if (currentLoggedInMerchant2 != null && (userId = currentLoggedInMerchant2.getUserId()) != null) {
            z = sharedPreferences.getBoolean("enabled".concat(java.lang.String.valueOf(userId)), isCurrentUserEnabled());
        }
        this.getHighSpeedVideoFpsRanges = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(java.lang.Boolean.valueOf(z));
        sharedPreferences.registerOnSharedPreferenceChangeListener(this);
        com.zettle.sdk.core.ZettleScopeKt.monitoredLaunch(coroutineScope, new com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorageImpl.AnonymousClass1(null));
    }

    @Override // com.zettle.sdk.core.log.Loggable
    /* renamed from: getLogTag */
    public final java.lang.String getGetHighSpeedVideoFpsRangesFor() {
        return com.zettle.sdk.core.log.Loggable.DefaultImpls.getLogTag(this);
    }

    @Override // com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorage
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> getShouldShowOnboardCTAFlow() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorage
    public final kotlinx.coroutines.flow.Flow<java.lang.Boolean> isEnabledFlow() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u008a@"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorageImpl$1", f = "TapToPaySettingsStorage.kt", i = {}, l = {80}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorageImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        int Camera2StreamConfigurationMap;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object obj) {
            java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.Camera2StreamConfigurationMap;
            if (i == 0) {
                kotlin.ResultKt.throwOnFailure(obj);
                kotlinx.coroutines.flow.Flow<com.zettle.sdk.core.auth.Merchant> merchant = com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorageImpl.this.getInputFormats.getMerchant();
                final com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorageImpl tapToPaySettingsStorageImpl = com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorageImpl.this;
                this.Camera2StreamConfigurationMap = 1;
                if (merchant.collect(new kotlinx.coroutines.flow.FlowCollector<com.zettle.sdk.core.auth.Merchant>() { // from class: com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorageImpl.1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public final /* synthetic */ java.lang.Object emit(com.zettle.sdk.core.auth.Merchant merchant2, kotlin.coroutines.Continuation continuation) {
                        java.lang.String userId;
                        com.zettle.sdk.core.auth.Merchant merchant3 = merchant2;
                        if ((merchant3 instanceof com.zettle.sdk.core.auth.Merchant.LoggedIn) && (userId = ((com.zettle.sdk.core.auth.Merchant.LoggedIn) merchant3).getUserId()) != null && com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorageImpl.access$isActivated(com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorageImpl.this, userId)) {
                            com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorageImpl.this.setInteractedWithOnboardCTA(true);
                        }
                        return kotlin.Unit.INSTANCE;
                    }
                }, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(obj);
            }
            return kotlin.Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ java.lang.Object invoke(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
            return ((com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorageImpl.AnonymousClass1) create(continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(kotlin.coroutines.Continuation<?> continuation) {
            return com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorageImpl.this.new AnonymousClass1(continuation);
        }

        AnonymousClass1(kotlin.coroutines.Continuation<? super com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorageImpl.AnonymousClass1> continuation) {
            super(1, continuation);
        }
    }

    @Override // com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorage
    public final boolean isCurrentUserEnabled() {
        java.lang.String userId;
        com.zettle.sdk.core.auth.Merchant.LoggedIn currentLoggedInMerchant = this.getInputFormats.getCurrentLoggedInMerchant();
        if (currentLoggedInMerchant == null || (userId = currentLoggedInMerchant.getUserId()) == null) {
            return false;
        }
        return this.Camera2StreamConfigurationMap.getBoolean("enabled".concat(java.lang.String.valueOf(userId)), true);
    }

    @Override // com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorage
    public final boolean setEnabled(boolean enabled) {
        java.lang.String userId;
        com.zettle.sdk.core.auth.Merchant.LoggedIn currentLoggedInMerchant = this.getInputFormats.getCurrentLoggedInMerchant();
        if (currentLoggedInMerchant == null || (userId = currentLoggedInMerchant.getUserId()) == null) {
            return false;
        }
        this.Camera2StreamConfigurationMap.edit().putBoolean("enabled".concat(java.lang.String.valueOf(userId)), enabled).apply();
        return enabled;
    }

    @Override // com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorage
    public final boolean setInteractedWithOnboardCTA(boolean interactedWith) {
        java.lang.String userId;
        com.zettle.sdk.core.auth.Merchant.LoggedIn currentLoggedInMerchant = this.getInputFormats.getCurrentLoggedInMerchant();
        if (currentLoggedInMerchant == null || (userId = currentLoggedInMerchant.getUserId()) == null) {
            return false;
        }
        this.Camera2StreamConfigurationMap.edit().putBoolean("onboardingCTA".concat(java.lang.String.valueOf(userId)), interactedWith).apply();
        return interactedWith;
    }

    @Override // com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorage
    public final boolean isCurrentUserOnboardCTAInteractedWith() {
        java.lang.String userId;
        com.zettle.sdk.commons.util.ExternalConfig externalConfig;
        com.zettle.sdk.core.auth.Merchant.LoggedIn currentLoggedInMerchant = this.getInputFormats.getCurrentLoggedInMerchant();
        if (currentLoggedInMerchant == null || (userId = currentLoggedInMerchant.getUserId()) == null) {
            return false;
        }
        if (this.getHighSpeedVideoSizes.invoke().booleanValue() && (externalConfig = this.getHighResolutionOutputSizeshNQ4ISI) != null && externalConfig.getBoolean("TapToPay: Show First payment prompt", false)) {
            return false;
        }
        return this.Camera2StreamConfigurationMap.getBoolean("onboardingCTA".concat(java.lang.String.valueOf(userId)), this.Camera2StreamConfigurationMap.getBoolean("activated".concat(java.lang.String.valueOf(userId)), false));
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences, java.lang.String key) {
        if (sharedPreferences == null) {
            return;
        }
        if (key != null && kotlin.text.StringsKt.startsWith$default(key, "onboardingCTA", false, 2, (java.lang.Object) null)) {
            this.getHighSpeedVideoFpsRangesFor.setValue(java.lang.Boolean.valueOf(sharedPreferences.getBoolean(key, false)));
        }
        if (key == null || !kotlin.text.StringsKt.startsWith$default(key, "enabled", false, 2, (java.lang.Object) null)) {
            return;
        }
        this.getHighSpeedVideoFpsRanges.setValue(java.lang.Boolean.valueOf(sharedPreferences.getBoolean(key, false)));
    }

    public static final /* synthetic */ boolean access$isActivated(com.zettle.sdk.feature.taptopay.ui.settings.TapToPaySettingsStorageImpl tapToPaySettingsStorageImpl, java.lang.String str) {
        return tapToPaySettingsStorageImpl.Camera2StreamConfigurationMap.getBoolean("activated".concat(java.lang.String.valueOf(str)), false);
    }
}
