package com.paypal.oslo.app;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 3, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(c = "com.paypal.oslo.app.MainActivity$onCreate$1", f = "MainActivity.kt", i = {1, 1}, l = {126, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_NEW_WINDOW_VALUE}, m = "invokeSuspend", n = {"initialBackstack", "notificationLaunchInfo"}, nl = {127, com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_PAUSE_VALUE}, s = {"L$0", "L$1"}, v = 2)
/* loaded from: classes10.dex */
final class MainActivity$onCreate$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.CoroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ com.paypal.oslo.app.MainActivity Camera2StreamConfigurationMap;
    java.lang.Object getHighResolutionOutputSizeshNQ4ISI;
    int getHighSpeedVideoFpsRanges;
    java.lang.Object getHighSpeedVideoFpsRangesFor;
    final /* synthetic */ android.os.Bundle getHighSpeedVideoSizes;

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r8 != r0) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.paypal.oslo.app.navigation.InitialBackstack initialBackstack;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationLaunchInfo notificationLaunchInfo;
        java.lang.Object token;
        com.paypal.oslo.core.pushnotification.domain.notification.NotificationLaunchInfo notificationLaunchInfo2;
        java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.getHighSpeedVideoFpsRanges;
        if (i == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            this.getHighSpeedVideoFpsRanges = 1;
            obj = this.Camera2StreamConfigurationMap.getStartDestinationProvider().getInitialBackstack(this.Camera2StreamConfigurationMap.getIntent(), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                notificationLaunchInfo2 = (com.paypal.oslo.core.pushnotification.domain.notification.NotificationLaunchInfo) this.getHighResolutionOutputSizeshNQ4ISI;
                initialBackstack = (com.paypal.oslo.app.navigation.InitialBackstack) this.getHighSpeedVideoFpsRangesFor;
                kotlin.ResultKt.throwOnFailure(obj);
                notificationLaunchInfo = notificationLaunchInfo2;
                this.Camera2StreamConfigurationMap.getAppLaunchSourceTracker().setLaunchSource(com.paypal.oslo.app.MainActivity.access$resolveLaunchSource(this.Camera2StreamConfigurationMap, initialBackstack, notificationLaunchInfo));
                return kotlin.Unit.INSTANCE;
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        initialBackstack = (com.paypal.oslo.app.navigation.InitialBackstack) obj;
        this.Camera2StreamConfigurationMap.getNavigator().setInitialBackstack(initialBackstack.getStack());
        com.paypal.oslo.app.MainActivity mainActivity = this.Camera2StreamConfigurationMap;
        mainActivity.getHighSpeedVideoSizes = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.core.telemetry.compose.ScreenLifecycleObserver[]{com.paypal.oslo.app.MainActivity.access$startTtfdTracking(mainActivity, (androidx.navigation3.runtime.NavKey) kotlin.collections.CollectionsKt.last((java.util.List) initialBackstack.getStack())), new com.paypal.oslo.core.telemetry.cpl.ScreenCPLTracker(null, 1, null)});
        final com.paypal.oslo.app.MainActivity mainActivity2 = this.Camera2StreamConfigurationMap;
        androidx.view.compose.ComponentActivityKt.setContent$default(mainActivity2, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1515424686, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.app.MainActivity$onCreate$1$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function2
            public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.app.MainActivity$onCreate$1.Camera2StreamConfigurationMap(com.paypal.oslo.app.MainActivity.this, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 1, null);
        if (this.getHighSpeedVideoSizes == null) {
            com.paypal.oslo.core.pushnotification.domain.notification.NotificationIntentHandler notificationIntentHandler = this.Camera2StreamConfigurationMap.getNotificationIntentHandler();
            android.content.Intent intent = this.Camera2StreamConfigurationMap.getIntent();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intent, "");
            notificationLaunchInfo = notificationIntentHandler.handleIfNotificationIntent(intent);
        } else {
            notificationLaunchInfo = null;
        }
        if (initialBackstack.getIsDeepLink()) {
            com.paypal.oslo.app.MainActivity mainActivity3 = this.Camera2StreamConfigurationMap;
            if (com.paypal.oslo.app.MainActivity.access$shouldAcquireDeeplinkToken(mainActivity3, mainActivity3.getIntent())) {
                com.paypal.oslo.app.MainActivity mainActivity4 = this.Camera2StreamConfigurationMap;
                this.getHighSpeedVideoFpsRangesFor = initialBackstack;
                this.getHighResolutionOutputSizeshNQ4ISI = notificationLaunchInfo;
                this.getHighSpeedVideoFpsRanges = 2;
                token = mainActivity4.getTokenProvider().getToken(new com.paypal.oslo.core.identity.domain.model.TokenType.UserAccessTokenType(new com.paypal.oslo.core.identity.domain.model.AuthenticationContext(com.paypal.oslo.core.identity.domain.model.AuthenticationState.REMEMBERED, new com.paypal.oslo.core.identity.domain.model.AuthenticationFlowInfo("deeplink", (java.util.Map) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null))), this);
                if (token != coroutine_suspended) {
                    notificationLaunchInfo2 = notificationLaunchInfo;
                    notificationLaunchInfo = notificationLaunchInfo2;
                }
                return coroutine_suspended;
            }
        }
        this.Camera2StreamConfigurationMap.getAppLaunchSourceTracker().setLaunchSource(com.paypal.oslo.app.MainActivity.access$resolveLaunchSource(this.Camera2StreamConfigurationMap, initialBackstack, notificationLaunchInfo));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.app.MainActivity mainActivity, com.paypal.oslo.core.navigation.ui.TopBarConfig topBarConfig, com.paypal.oslo.core.navigation.ui.BottomNavigationConfig bottomNavigationConfig, androidx.compose.runtime.State state, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1844923508, i, -1, "com.paypal.oslo.app.MainActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:170)");
            }
            com.paypal.oslo.core.navigation.AppNavigator navigator = mainActivity.getNavigator();
            com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker nav3ViewTracker = mainActivity.getNav3ViewTracker();
            androidx.navigation3.runtime.EntryProviderScope entryProviderScope = new androidx.navigation3.runtime.EntryProviderScope(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.MainActivity$onCreate$1$invokeSuspend$lambda$0$7$0$0$$inlined$entryProvider$default$1
                @Override // kotlin.jvm.functions.Function1
                public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                    return invoke((androidx.navigation3.runtime.NavKey) obj);
                }

                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Void invoke(androidx.navigation3.runtime.NavKey navKey) {
                    throw new java.lang.IllegalStateException("Unknown screen ".concat(java.lang.String.valueOf(navKey)));
                }
            });
            java.util.Iterator<T> it = mainActivity.getEntryProviderInstallers().iterator();
            while (it.hasNext()) {
                ((kotlin.jvm.functions.Function1) it.next()).invoke(entryProviderScope);
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            com.paypal.oslo.core.navigation.ui.AppNavigationScaffoldKt.AppNavigationScaffold(navigator, topBarConfig, bottomNavigationConfig, nav3ViewTracker, com.paypal.oslo.core.navigation.EntryProviderExtensionsKt.enrichEntryProvider(entryProviderScope.build()), new com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination((com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null), null, mainActivity.getOverlayProviders(), null, ((java.lang.Boolean) state.getValue()).booleanValue(), composer, (com.paypal.oslo.core.navigation.ui.TopBarConfig.$stable << 3) | (com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker.$stable << 9) | (com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.$stable << 15), 320);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.app.MainActivity mainActivity) {
        mainActivity.getNavigator().navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.MainActivity$onCreate$1$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.app.MainActivity$onCreate$1.getHighSpeedVideoSizes((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRanges(final com.paypal.oslo.app.MainActivity mainActivity, final com.paypal.oslo.core.navigation.ui.TopBarConfig topBarConfig, final com.paypal.oslo.core.navigation.ui.BottomNavigationConfig bottomNavigationConfig, final androidx.compose.runtime.State state, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(695455912, i, -1, "com.paypal.oslo.app.MainActivity.onCreate.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:168)");
            }
            com.paypal.oslo.app.profileerror.ProfileErrorGateKt.ProfileErrorGate(null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1812495168, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.app.MainActivity$onCreate$1$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.app.MainActivity$onCreate$1.getHighSpeedVideoSizes(com.paypal.oslo.app.MainActivity.this, topBarConfig, bottomNavigationConfig, state, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 48, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.push(com.paypal.oslo.feature.identity.api.navigation.AccountSwitchBottomSheetDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.app.MainActivity mainActivity) {
        mainActivity.getNavigator().navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.MainActivity$onCreate$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.app.MainActivity$onCreate$1.Camera2StreamConfigurationMap((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoSizes(final com.paypal.oslo.app.MainActivity mainActivity, final com.paypal.oslo.core.navigation.ui.TopBarConfig topBarConfig, final com.paypal.oslo.core.navigation.ui.BottomNavigationConfig bottomNavigationConfig, final androidx.compose.runtime.State state, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1812495168, i, -1, "com.paypal.oslo.app.MainActivity.onCreate.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainActivity.kt:169)");
            }
            com.paypal.oslo.app.georestriction.GeoRestrictionGateKt.GeoRestrictionGate(null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1844923508, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.app.MainActivity$onCreate$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.app.MainActivity$onCreate$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.app.MainActivity.this, topBarConfig, bottomNavigationConfig, state, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 48, 1);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit getHighSpeedVideoFpsRangesFor(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.pushIfNotCurrent(new com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination((com.paypal.oslo.feature.searchandintelligence.api.navigation.SearchAndIntelligenceDestination.InitialMessage) null, 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(final com.paypal.oslo.app.MainActivity mainActivity, androidx.compose.runtime.Composer composer, int i) {
        java.util.List list;
        java.util.List list2;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1515424686, i, -1, "com.paypal.oslo.app.MainActivity.onCreate.<anonymous>.<anonymous> (MainActivity.kt:131)");
            }
            androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(mainActivity.getNavigationConfigProvider().getTopBarUiState(), new com.paypal.oslo.app.navigation.TopBarUiState(false, null, null, 0, false, 31, null), null, composer, 0, 2);
            androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(mainActivity.getNavigationConfigProvider().getBottomNavUiConfig(), new com.paypal.oslo.app.navigation.BottomNavUiConfig(kotlin.collections.CollectionsKt.emptyList()), null, composer, 0, 2);
            final androidx.compose.runtime.State collectAsState3 = androidx.compose.runtime.SnapshotStateKt.collectAsState(mainActivity.getNavigationConfigProvider().isL0EntryEnabled(), java.lang.Boolean.TRUE, null, composer, 48, 2);
            androidx.compose.runtime.State collectAsState4 = androidx.compose.runtime.SnapshotStateKt.collectAsState(mainActivity.getPdsHighlightProvider().getEnabled(), null, composer, 0, 1);
            com.paypal.oslo.app.navigation.TopBarUiState topBarUiState = (com.paypal.oslo.app.navigation.TopBarUiState) collectAsState.getValue();
            boolean changedInstance = composer.changedInstance(mainActivity);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.app.MainActivity$onCreate$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.app.MainActivity$onCreate$1.Camera2StreamConfigurationMap(com.paypal.oslo.app.MainActivity.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changedInstance2 = composer.changedInstance(mainActivity);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.app.MainActivity$onCreate$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.app.MainActivity$onCreate$1.getHighSpeedVideoFpsRangesFor(com.paypal.oslo.app.MainActivity.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changedInstance3 = composer.changedInstance(mainActivity);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.app.MainActivity$onCreate$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.app.MainActivity$onCreate$1.getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.app.MainActivity.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            final com.paypal.oslo.core.navigation.ui.TopBarConfig rememberTopBarConfig = com.paypal.oslo.app.navigation.TopBarConfigMapperKt.rememberTopBarConfig(topBarUiState, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, composer, 0);
            final com.paypal.oslo.core.navigation.ui.BottomNavigationConfig rememberBottomNavConfig = com.paypal.oslo.app.navigation.BottomNavigationConfigMapperKt.rememberBottomNavConfig((com.paypal.oslo.app.navigation.BottomNavUiConfig) collectAsState2.getValue(), composer, 0);
            com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker nav3ViewTracker = mainActivity.getNav3ViewTracker();
            list = mainActivity.getHighSpeedVideoSizes;
            if (list == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("");
                list2 = null;
            } else {
                list2 = list;
            }
            com.paypal.pds.core.ThemeKt.PDSAppHost(com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProviderKt.rememberOsloAnalyticsProvider(nav3ViewTracker, list2, null, composer, com.paypal.oslo.core.telemetry.compose.Nav3ViewTracker.$stable, 4), null, ((java.lang.Boolean) collectAsState4.getValue()).booleanValue(), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(695455912, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.app.MainActivity$onCreate$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.app.MainActivity$onCreate$1.getHighSpeedVideoFpsRanges(com.paypal.oslo.app.MainActivity.this, rememberTopBarConfig, rememberBottomNavConfig, collectAsState3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, com.paypal.oslo.core.telemetry.compose.OsloAnalyticsProvider.$stable | 3072, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        navigationScope.pushIfNotCurrent(com.paypal.oslo.feature.notificationcenter.api.navigation.NotificationCenterDestination.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit Camera2StreamConfigurationMap(com.paypal.oslo.app.MainActivity mainActivity) {
        mainActivity.getNavigator().navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.app.MainActivity$onCreate$1$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.app.MainActivity$onCreate$1.getHighSpeedVideoFpsRangesFor((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.CoroutineScope coroutineScope, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return ((com.paypal.oslo.app.MainActivity$onCreate$1) create(coroutineScope, continuation)).invokeSuspend(kotlin.Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object obj, kotlin.coroutines.Continuation<?> continuation) {
        return new com.paypal.oslo.app.MainActivity$onCreate$1(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MainActivity$onCreate$1(com.paypal.oslo.app.MainActivity mainActivity, android.os.Bundle bundle, kotlin.coroutines.Continuation<? super com.paypal.oslo.app.MainActivity$onCreate$1> continuation) {
        super(2, continuation);
        this.Camera2StreamConfigurationMap = mainActivity;
        this.getHighSpeedVideoSizes = bundle;
    }
}
