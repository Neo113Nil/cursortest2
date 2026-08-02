package com.paypal.oslo.core.remoteconfig;

@javax.inject.Singleton
@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJN\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u001b\b\u0002\u0010\u0016\u001a\u0015\u0012\t\u0012\u00070\u0013¢\u0006\u0002\b\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0013¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u0004\u0018\u00010\u00132\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u0004\u0018\u00010&2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u0004\u0018\u00010&2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b)\u0010(J\r\u0010*\u001a\u00020\u0010¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\f2\u0006\u0010-\u001a\u00020,H\u0000¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0015H\u0000¢\u0006\u0004\b0\u0010\u001dR\u0014\u00103\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00105\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00108\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107"}, d2 = {"Lcom/paypal/oslo/core/remoteconfig/StatsigWrapper;", "", "Lcom/paypal/oslo/core/remoteconfig/RemoteConfigStateHolder;", "remoteConfigStateHolder", "Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;", "appIdentity", "Lcom/paypal/oslo/core/userstore/UserStore;", "userStore", "<init>", "(Lcom/paypal/oslo/core/remoteconfig/RemoteConfigStateHolder;Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;Lcom/paypal/oslo/core/userstore/UserStore;)V", "Landroid/app/Application;", "application", "", "sdkKey", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigEnvironment;", "environment", "Lcom/paypal/oslo/core/remoteconfig/internal/RemoteConfigUser;", "initialUser", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "", "onInitialized", "init", "(Landroid/app/Application;Ljava/lang/String;Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigEnvironment;Lcom/paypal/oslo/core/remoteconfig/internal/RemoteConfigUser;Lkotlin/jvm/functions/Function1;)V", "user", "updateUser", "(Lcom/paypal/oslo/core/remoteconfig/internal/RemoteConfigUser;)V", "shutdown", "()V", "shutdownSuspend", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isInitialized", "()Z", "Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;", "key", "checkGateWithoutExposure", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;)Ljava/lang/Boolean;", "Lcom/statsig/androidsdk/DynamicConfig;", "getConfigWithoutExposure", "(Lcom/paypal/oslo/core/remoteconfig/contract/RemoteConfigKey;)Lcom/statsig/androidsdk/DynamicConfig;", "getExperimentWithExposureLoggingDisabled", "getUserFromInitialization", "()Lcom/paypal/oslo/core/remoteconfig/internal/RemoteConfigUser;", "Landroid/content/Context;", "context", "loadDataFileConfig$remote_config_release", "(Landroid/content/Context;)Ljava/lang/String;", "runningInitialAAExperiment$remote_config_release", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/remoteconfig/RemoteConfigStateHolder;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/core/appidentity/domain/AppIdentity;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/core/userstore/UserStore;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class StatsigWrapper {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.core.userstore.UserStore getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.appidentity.domain.AppIdentity getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.core.remoteconfig.RemoteConfigStateHolder getHighResolutionOutputSizeshNQ4ISI;

    @javax.inject.Inject
    public StatsigWrapper(com.paypal.oslo.core.remoteconfig.RemoteConfigStateHolder remoteConfigStateHolder, com.paypal.oslo.core.appidentity.domain.AppIdentity appIdentity, com.paypal.oslo.core.userstore.UserStore userStore) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(remoteConfigStateHolder, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appIdentity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(userStore, "");
        this.getHighResolutionOutputSizeshNQ4ISI = remoteConfigStateHolder;
        this.getHighSpeedVideoFpsRangesFor = appIdentity;
        this.getHighSpeedVideoSizes = userStore;
    }

    public final void init(android.app.Application application, java.lang.String sdkKey, final com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment environment, com.paypal.oslo.core.remoteconfig.internal.RemoteConfigUser initialUser, final kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onInitialized) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sdkKey, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(environment, "");
        com.statsig.androidsdk.StatsigOptions statsigOptions = new com.statsig.androidsdk.StatsigOptions(null, null, false, false, false, 0L, 0, false, 0.0d, null, false, null, false, null, null, null, null, null, null, false, false, null, null, false, false, 33554431, null);
        statsigOptions.setEnvironmentParameter("tier", environment.getTier());
        statsigOptions.setOverrideStableID(initialUser != null ? initialUser.getVisitorId() : null);
        statsigOptions.setOnDeviceEvalAdapter(new com.statsig.androidsdk.OnDeviceEvalAdapter(loadDataFileConfig$remote_config_release(application)));
        com.statsig.androidsdk.Statsig statsig = com.statsig.androidsdk.Statsig.INSTANCE;
        com.statsig.androidsdk.Statsig.initializeAsync(application, sdkKey, initialUser != null ? com.paypal.oslo.core.remoteconfig.internal.RemoteConfigUserKt.toStatsigUser(initialUser) : null, new com.statsig.androidsdk.IStatsigCallback() { // from class: com.paypal.oslo.core.remoteconfig.StatsigWrapper$init$1
            @Override // com.statsig.androidsdk.IStatsigCallback
            public final /* bridge */ void onStatsigInitialize() {
                super.onStatsigInitialize();
            }

            @Override // com.statsig.androidsdk.IStatsigCallback
            public final void onStatsigInitialize(com.statsig.androidsdk.InitializationDetails initDetails) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initDetails, "");
                if (initDetails.getSuccess()) {
                    com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "remote_config_initialization_successful", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("environment", com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment.this.getTier()), kotlin.TuplesKt.to("duration_ms", java.lang.Long.valueOf(initDetails.getDuration()))), null, 4, null);
                } else {
                    com.paypal.android.logger.Logger logger = com.paypal.oslo.core.remoteconfig.LoggerKt.log;
                    kotlin.Pair[] pairArr = new kotlin.Pair[4];
                    pairArr[0] = kotlin.TuplesKt.to("environment", com.paypal.oslo.core.remoteconfig.contract.RemoteConfigEnvironment.this.getTier());
                    com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse failureDetails = initDetails.getFailureDetails();
                    pairArr[1] = kotlin.TuplesKt.to("reason", failureDetails != null ? failureDetails.getReason() : null);
                    com.statsig.androidsdk.InitializeResponse.FailedInitializeResponse failureDetails2 = initDetails.getFailureDetails();
                    pairArr[2] = kotlin.TuplesKt.to("status_code", failureDetails2 != null ? failureDetails2.getStatusCode() : null);
                    pairArr[3] = kotlin.TuplesKt.to("duration_ms", java.lang.Long.valueOf(initDetails.getDuration()));
                    com.paypal.android.logger.Logger.e$default(logger, "remote_config_initialization_failed", kotlin.collections.MapsKt.mapOf(pairArr), null, null, 12, null);
                }
                kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> function1 = onInitialized;
                if (function1 != null) {
                    function1.invoke(java.lang.Boolean.valueOf(initDetails.getSuccess()));
                }
            }

            @Override // com.statsig.androidsdk.IStatsigCallback
            public final void onStatsigUpdateUser() {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "Statsig user updated", null, null, 6, null);
            }
        }, statsigOptions);
        if ((initialUser != null ? initialUser.getId() : null) != null) {
            this.getHighResolutionOutputSizeshNQ4ISI.updateUserState(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState.Authenticated.INSTANCE);
        } else {
            this.getHighResolutionOutputSizeshNQ4ISI.updateUserState(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState.NonAuthenticated.INSTANCE);
        }
    }

    public final void updateUser(final com.paypal.oslo.core.remoteconfig.internal.RemoteConfigUser user) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(user, "");
        final long m24028markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m24028markNowz9LOYto();
        com.statsig.androidsdk.Statsig.updateUserAsync$default(com.paypal.oslo.core.remoteconfig.internal.RemoteConfigUserKt.toStatsigUser(user), new com.statsig.androidsdk.IStatsigCallback() { // from class: com.paypal.oslo.core.remoteconfig.StatsigWrapper$updateUser$1
            @Override // com.statsig.androidsdk.IStatsigCallback
            public final /* bridge */ void onStatsigInitialize() {
                super.onStatsigInitialize();
            }

            @Override // com.statsig.androidsdk.IStatsigCallback
            public final /* bridge */ void onStatsigInitialize(com.statsig.androidsdk.InitializationDetails initializationDetails) {
                super.onStatsigInitialize(initializationDetails);
            }

            @Override // com.statsig.androidsdk.IStatsigCallback
            public final void onStatsigUpdateUser() {
                com.paypal.oslo.core.remoteconfig.RemoteConfigStateHolder remoteConfigStateHolder;
                com.paypal.oslo.core.remoteconfig.RemoteConfigStateHolder remoteConfigStateHolder2;
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "remote_config_updated_user", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("duration_ms", java.lang.Long.valueOf(kotlin.time.Duration.m23953getInWholeMillisecondsimpl(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m24033elapsedNowUwyO8pc(m24028markNowz9LOYto)))), kotlin.TuplesKt.to("user_id", user.getId()), kotlin.TuplesKt.to("visitor_id", user.getVisitorId())), null, 4, null);
                if (user.getId() == null) {
                    remoteConfigStateHolder = this.getHighResolutionOutputSizeshNQ4ISI;
                    remoteConfigStateHolder.updateUserState(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState.NonAuthenticated.INSTANCE);
                } else {
                    this.runningInitialAAExperiment$remote_config_release();
                    remoteConfigStateHolder2 = this.getHighResolutionOutputSizeshNQ4ISI;
                    remoteConfigStateHolder2.updateUserState(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigUserState.Authenticated.INSTANCE);
                }
            }
        }, null, 4, null);
    }

    public final void shutdown() {
        com.statsig.androidsdk.Statsig.shutdown();
    }

    public final java.lang.Object shutdownSuspend(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        java.lang.Object shutdownSuspend = com.statsig.androidsdk.Statsig.INSTANCE.shutdownSuspend(continuation);
        return shutdownSuspend == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED() ? shutdownSuspend : kotlin.Unit.INSTANCE;
    }

    public final boolean isInitialized() {
        return com.statsig.androidsdk.Statsig.isInitialized();
    }

    public final java.lang.Boolean checkGateWithoutExposure(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        try {
            return java.lang.Boolean.valueOf(com.statsig.androidsdk.Statsig.checkGateWithExposureLoggingDisabled(key.getKeyName()));
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final com.statsig.androidsdk.DynamicConfig getConfigWithoutExposure(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        try {
            return com.statsig.androidsdk.Statsig.getConfigWithExposureLoggingDisabled(key.getKeyName());
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final com.statsig.androidsdk.DynamicConfig getExperimentWithExposureLoggingDisabled(com.paypal.oslo.core.remoteconfig.contract.RemoteConfigKey key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "");
        try {
            return com.statsig.androidsdk.Statsig.getExperimentWithExposureLoggingDisabled$default(key.getKeyName(), false, 2, null);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }

    public final com.paypal.oslo.core.remoteconfig.internal.RemoteConfigUser getUserFromInitialization() {
        java.lang.Object runBlocking$default;
        com.paypal.oslo.core.remoteconfig.internal.RemoteConfigUser anonymous;
        long m24028markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m24028markNowz9LOYto();
        com.paypal.oslo.core.userstore.model.UserState value = this.getHighSpeedVideoSizes.getUserState().getValue();
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new com.paypal.oslo.core.remoteconfig.StatsigWrapper$getUserFromInitialization$visitorId$1(this, null), 1, null);
        java.lang.String str = (java.lang.String) runBlocking$default;
        if (value instanceof com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "User is logged in during initialization", null, null, 6, null);
            anonymous = com.paypal.oslo.core.remoteconfig.internal.RemoteConfigUserKt.toRemoteConfigUser(((com.paypal.oslo.core.userstore.model.UserState.ProfileLoaded) value).getUser(), str, this.getHighSpeedVideoFpsRangesFor.getDistributionChannel().getValue());
        } else {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "User state was not returned during initialization", null, null, 6, null);
            anonymous = com.paypal.oslo.core.remoteconfig.internal.RemoteConfigUser.INSTANCE.anonymous(str, this.getHighSpeedVideoFpsRangesFor.getDistributionChannel().getValue());
        }
        com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "remote_config_load_initial_user", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("duration", java.lang.Long.valueOf(kotlin.time.Duration.m23953getInWholeMillisecondsimpl(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m24033elapsedNowUwyO8pc(m24028markNowz9LOYto)))), kotlin.TuplesKt.to("user_state", value.getClass().getSimpleName())), null, 4, null);
        return anonymous;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v8, types: [T, java.lang.String] */
    public final java.lang.String loadDataFileConfig$remote_config_release(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        try {
            kotlin.jvm.internal.Ref.ObjectRef objectRef = new kotlin.jvm.internal.Ref.ObjectRef();
            objectRef.element = "";
            long m24028markNowz9LOYto = kotlin.time.TimeSource.Monotonic.INSTANCE.m24028markNowz9LOYto();
            java.io.InputStream openRawResource = context.getResources().openRawResource(com.paypal.oslo.core.remoteconfig.R.raw.core_remote_config_static_statsig_config);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(openRawResource, "");
            java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(openRawResource, kotlin.text.Charsets.UTF_8), 8192);
            try {
                ?? readText = kotlin.io.TextStreamsKt.readText(bufferedReader);
                kotlin.io.CloseableKt.closeFinally(bufferedReader, null);
                objectRef.element = readText;
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "remote_config_load_datafile_successful", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("duration", java.lang.Long.valueOf(kotlin.time.Duration.m23953getInWholeMillisecondsimpl(kotlin.time.TimeSource.Monotonic.ValueTimeMark.m24033elapsedNowUwyO8pc(m24028markNowz9LOYto)))), kotlin.TuplesKt.to("length", java.lang.Integer.valueOf(((java.lang.String) objectRef.element).length()))), null, 4, null);
                return (java.lang.String) objectRef.element;
            } finally {
            }
        } catch (java.lang.Exception e) {
            com.paypal.oslo.core.remoteconfig.LoggerKt.log.e("remote_config_load_datafile_failed", e);
            return "{}";
        }
    }

    public final void runningInitialAAExperiment$remote_config_release() {
        try {
            if (com.statsig.androidsdk.Statsig.isInitialized()) {
                com.paypal.android.logger.Logger.d$default(com.paypal.oslo.core.remoteconfig.LoggerKt.log, "remote_config_initial_aa_experiment", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("reason", com.statsig.androidsdk.Statsig.getExperiment$default("experiment_a_a_wh_dimension_slice", false, 2, null).getDetails().getReason())), null, 4, null);
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
