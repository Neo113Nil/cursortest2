package com.zettle.sdk.core.auth.merchant;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\t\u001a\u00020\b2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\rJ\u001f\u0010\u000e\u001a\u00020\b2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0016\u0010\u0004\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/zettle/sdk/core/auth/merchant/MutableUserConfigState;", "Lcom/zettle/sdk/commons/state/MutableState;", "Lcom/zettle/sdk/core/user/userconfig/UserConfig;", "Lcom/izettle/android/auth/ZettleAuth;", "p0", "<init>", "(Lcom/izettle/android/auth/ZettleAuth;)V", "Lcom/zettle/sdk/commons/state/StateObserver;", "", "addObserver", "(Lcom/zettle/sdk/commons/state/StateObserver;)V", "Lcom/zettle/sdk/commons/thread/EventsLoop;", "p1", "(Lcom/zettle/sdk/commons/state/StateObserver;Lcom/zettle/sdk/commons/thread/EventsLoop;)V", "removeObserver", "Lkotlin/Function1;", "", "update", "(Lkotlin/jvm/functions/Function1;)Z", "Lcom/zettle/sdk/core/user/userconfig/DetailedUserConfig;", "getHighSpeedVideoSizes", "Lcom/zettle/sdk/core/user/userconfig/DetailedUserConfig;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "Lcom/zettle/sdk/commons/state/MutableState;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
final class MutableUserConfigState implements com.zettle.sdk.commons.state.MutableState<com.zettle.sdk.core.user.userconfig.UserConfig> {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.zettle.sdk.commons.state.MutableState<com.zettle.sdk.core.user.userconfig.UserConfig> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private com.zettle.sdk.core.user.userconfig.DetailedUserConfig Camera2StreamConfigurationMap;

    public MutableUserConfigState(com.izettle.android.auth.ZettleAuth zettleAuth) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(zettleAuth, "");
        this.getHighResolutionOutputSizeshNQ4ISI = com.zettle.sdk.commons.state.MutableState.Companion.create$default(com.zettle.sdk.commons.state.MutableState.INSTANCE, null, null, 2, null);
        zettleAuth.registerUserConfigUpdateListener(new kotlin.jvm.functions.Function1<com.zettle.android.entities.UserConfig, kotlin.Unit>() { // from class: com.zettle.sdk.core.auth.merchant.MutableUserConfigState.1
            public final void getHighSpeedVideoSizes(com.zettle.android.entities.UserConfig userConfig) {
                com.zettle.sdk.core.auth.merchant.MutableUserConfigState.getHighResolutionOutputSizeshNQ4ISI(com.zettle.sdk.core.auth.merchant.MutableUserConfigState.this, userConfig != null ? com.zettle.sdk.core.auth.UserKt.toDetailedUserConfig(userConfig) : null);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.zettle.android.entities.UserConfig userConfig) {
                getHighSpeedVideoSizes(userConfig);
                return kotlin.Unit.INSTANCE;
            }

            {
                super(1);
            }
        });
        zettleAuth.registerAuthStateUpdateListener(new kotlin.jvm.functions.Function1<com.izettle.android.auth.AuthState, kotlin.Unit>() { // from class: com.zettle.sdk.core.auth.merchant.MutableUserConfigState.2
            public final void getHighResolutionOutputSizeshNQ4ISI(com.izettle.android.auth.AuthState authState) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(authState, "");
                com.zettle.sdk.core.auth.merchant.MutableUserConfigState.getHighSpeedVideoFpsRanges(com.zettle.sdk.core.auth.merchant.MutableUserConfigState.this, authState);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ kotlin.Unit invoke(com.izettle.android.auth.AuthState authState) {
                getHighResolutionOutputSizeshNQ4ISI(authState);
                return kotlin.Unit.INSTANCE;
            }

            {
                super(1);
            }
        });
    }

    @Override // com.zettle.sdk.commons.state.State
    public final void addObserver(com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.core.user.userconfig.UserConfig> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighResolutionOutputSizeshNQ4ISI.addObserver(p0);
    }

    @Override // com.zettle.sdk.commons.state.State
    public final void addObserver(com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.core.user.userconfig.UserConfig> p0, com.zettle.sdk.commons.thread.EventsLoop p1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p1, "");
        this.getHighResolutionOutputSizeshNQ4ISI.addObserver(p0, p1);
    }

    @Override // com.zettle.sdk.commons.state.State
    public final void removeObserver(com.zettle.sdk.commons.state.StateObserver<com.zettle.sdk.core.user.userconfig.UserConfig> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        this.getHighResolutionOutputSizeshNQ4ISI.removeObserver(p0);
    }

    @Override // com.zettle.sdk.commons.state.MutableState
    public final boolean update(kotlin.jvm.functions.Function1<? super com.zettle.sdk.core.user.userconfig.UserConfig, ? extends com.zettle.sdk.core.user.userconfig.UserConfig> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        return this.getHighResolutionOutputSizeshNQ4ISI.update(p0);
    }

    public static final /* synthetic */ void getHighResolutionOutputSizeshNQ4ISI(com.zettle.sdk.core.auth.merchant.MutableUserConfigState mutableUserConfigState, final com.zettle.sdk.core.user.userconfig.DetailedUserConfig detailedUserConfig) {
        com.zettle.sdk.core.auth.User.AuthState.LoggedIn loggedIn;
        java.util.Set<androidx.view.MutableLiveData> set;
        mutableUserConfigState.Camera2StreamConfigurationMap = detailedUserConfig;
        mutableUserConfigState.update(new kotlin.jvm.functions.Function1<com.zettle.sdk.core.user.userconfig.UserConfig, com.zettle.sdk.core.user.userconfig.UserConfig>() { // from class: com.zettle.sdk.core.auth.merchant.MutableUserConfigState$updateConfig$1
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
            public final com.zettle.sdk.core.user.userconfig.UserConfig invoke(com.zettle.sdk.core.user.userconfig.UserConfig userConfig) {
                return com.zettle.sdk.core.user.userconfig.DetailedUserConfig.this;
            }

            {
                super(1);
            }
        });
        if (detailedUserConfig == null) {
            loggedIn = com.zettle.sdk.core.auth.User.AuthState.LoggedOut.INSTANCE;
        } else {
            loggedIn = new com.zettle.sdk.core.auth.User.AuthState.LoggedIn(com.zettle.sdk.core.auth.UserKt.toInfo(detailedUserConfig), com.zettle.sdk.core.auth.UserKt.toPaymentInfo(detailedUserConfig));
        }
        set = com.zettle.sdk.core.auth.merchant.MerchantDefaultDetailedConfigKt.getHighSpeedVideoSizes;
        for (androidx.view.MutableLiveData mutableLiveData : set) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(mutableLiveData.getValue(), loggedIn)) {
                mutableLiveData.postValue(loggedIn);
            }
        }
    }

    public static final /* synthetic */ void getHighSpeedVideoFpsRanges(com.zettle.sdk.core.auth.merchant.MutableUserConfigState mutableUserConfigState, com.izettle.android.auth.AuthState authState) {
        com.zettle.sdk.core.auth.User.AuthState.Initial initial;
        java.util.Set<androidx.view.MutableLiveData> set;
        int i = com.zettle.sdk.core.auth.merchant.MutableUserConfigState.WhenMappings.$EnumSwitchMapping$0[authState.ordinal()];
        if (i == 1) {
            initial = com.zettle.sdk.core.auth.User.AuthState.Initial.INSTANCE;
        } else if (i == 2 || i == 3) {
            initial = com.zettle.sdk.core.auth.User.AuthState.LoggedOut.INSTANCE;
        } else if (i == 4) {
            com.zettle.sdk.core.user.userconfig.DetailedUserConfig detailedUserConfig = mutableUserConfigState.Camera2StreamConfigurationMap;
            com.zettle.sdk.core.auth.User.Info info = detailedUserConfig != null ? com.zettle.sdk.core.auth.UserKt.toInfo(detailedUserConfig) : null;
            if (info == null) {
                initial = com.zettle.sdk.core.auth.User.AuthState.LoggingIn.INSTANCE;
            } else {
                com.zettle.sdk.core.user.userconfig.DetailedUserConfig detailedUserConfig2 = mutableUserConfigState.Camera2StreamConfigurationMap;
                initial = new com.zettle.sdk.core.auth.User.AuthState.LoggedIn(info, detailedUserConfig2 != null ? com.zettle.sdk.core.auth.UserKt.toPaymentInfo(detailedUserConfig2) : null);
            }
        } else {
            if (i != 5) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            initial = com.zettle.sdk.core.auth.User.AuthState.LoggingIn.INSTANCE;
        }
        set = com.zettle.sdk.core.auth.merchant.MerchantDefaultDetailedConfigKt.getHighSpeedVideoSizes;
        for (androidx.view.MutableLiveData mutableLiveData : set) {
            if (!kotlin.jvm.internal.Intrinsics.areEqual(mutableLiveData.getValue(), initial)) {
                mutableLiveData.postValue(initial);
            }
        }
    }

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.izettle.android.auth.AuthState.values().length];
            try {
                iArr[com.izettle.android.auth.AuthState.INITIALIZING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.izettle.android.auth.AuthState.LOGGED_OUT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.izettle.android.auth.AuthState.LOGGING_OUT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.izettle.android.auth.AuthState.LOGGED_IN.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.izettle.android.auth.AuthState.LOGGING_IN.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
