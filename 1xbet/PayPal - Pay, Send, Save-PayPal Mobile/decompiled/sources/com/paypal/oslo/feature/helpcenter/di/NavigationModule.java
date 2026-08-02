package com.paypal.oslo.feature.helpcenter.di;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\u000b\u001a\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0002\b\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/helpcenter/di/NavigationModule;", "", "<init>", "()V", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "navigator", "Lkotlin/Function1;", "Landroidx/navigation3/runtime/EntryProviderScope;", "", "Lcom/paypal/oslo/core/navigation/EntryProviderInstaller;", "Lkotlin/ExtensionFunctionType;", "provideEntryProviderInstaller", "(Lcom/paypal/oslo/core/navigation/AppNavigator;)Lkotlin/jvm/functions/Function1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes12.dex */
public final class NavigationModule {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.helpcenter.di.NavigationModule INSTANCE = new com.paypal.oslo.feature.helpcenter.di.NavigationModule();

    private NavigationModule() {
    }

    @dagger.Provides
    @dagger.multibindings.IntoSet
    public final kotlin.jvm.functions.Function1<androidx.navigation3.runtime.EntryProviderScope<java.lang.Object>, kotlin.Unit> provideEntryProviderInstaller(final com.paypal.oslo.core.navigation.AppNavigator navigator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        return new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.helpcenter.di.NavigationModule.$r8$lambda$ohisjRlP2AICwQHNAnufoEqcWW0(com.paypal.oslo.core.navigation.AppNavigator.this, (androidx.navigation3.runtime.EntryProviderScope) obj);
            }
        };
    }

    /* renamed from: $r8$lambda$-b4YH7PY_-Lmnh9rHN7-KDbosYc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14781$r8$lambda$b4YH7PY_Lmnh9rHN7KDbosYc(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterSearchDestination helpCenterSearchDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpCenterSearchDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(711888133, i, -1, "com.paypal.oslo.feature.helpcenter.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:185)");
        }
        com.paypal.oslo.feature.helpcenter.ui.screens.HelpCenterSearchScreenKt.HelpCenterSearchScreen(appNavigator, null, null, composer, 0, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0wk88LuhgtiGGKRCA9RD4pnjXkU(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleListDestination helpCenterArticleListDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpCenterArticleListDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1997502539, i, -1, "com.paypal.oslo.feature.helpcenter.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:78)");
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        androidx.compose.runtime.saveable.Saver<com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState, java.lang.Object> saver = com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState.INSTANCE.getSaver();
        boolean changedInstance = composer.changedInstance(helpCenterArticleListDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.helpcenter.di.NavigationModule.$r8$lambda$g5Lft_Pgu8GUdyT3iWgBDck8Fl8(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleListDestination.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        final com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState bottomSheetStackState = (com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.helpcenter.di.NavigationModule.$r8$lambda$Aa681TC1UUCfKdenBEZqbyS_mCY(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackKt.BottomSheetStack(bottomSheetStackState, (kotlin.jvm.functions.Function0) rememberedValue2, null, "Common Questions", androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(2142022394, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.helpcenter.di.NavigationModule.$r8$lambda$trUIvUCv8dh0rtvSPDAeK73NDds(com.paypal.oslo.core.navigation.AppNavigator.this, bottomSheetStackState, (com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }, composer, 54), composer, 27648, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2nlhAb2f6TDSd25HyccieXXQEgk(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterTopicsDestination helpCenterTopicsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpCenterTopicsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1784731385, i, -1, "com.paypal.oslo.feature.helpcenter.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:170)");
        }
        com.paypal.oslo.feature.helpcenter.ui.screens.TopicsScreenKt.TopicsScreen(appNavigator, null, composer, 0, 2);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8NBhnSvfHf72MLxk41E4h0iGfhA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterCallUsDestination helpCenterCallUsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpCenterCallUsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1622052755, i, -1, "com.paypal.oslo.feature.helpcenter.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:199)");
        }
        com.paypal.oslo.feature.helpcenter.ui.screens.CallUsScreenKt.CallUsScreen(appNavigator, null, null, composer, 0, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Aa681TC1UUCfKdenBEZqbyS_mCY(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.helpcenter.di.NavigationModule.$r8$lambda$VW1SDul042DMNoTzoEKH8jzsuiw((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState $r8$lambda$AajM6qjqYerpcKV8BKgKb2yB2E4(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleDetailsDestination helpCenterArticleDetailsDestination) {
        com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState bottomSheetStackState = new com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState();
        bottomSheetStackState.push(new com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleDetail(helpCenterArticleDetailsDestination.getArticleId()));
        return bottomSheetStackState;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BNoN2L8cCefhheKW30nPGXHfM4s(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterHome helpCenterHome, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpCenterHome, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(286560547, i, -1, "com.paypal.oslo.feature.helpcenter.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:68)");
        }
        com.paypal.oslo.feature.helpcenter.ui.screens.HelpCenterHomeScreenKt.HelpCenterHomeScreen(appNavigator, null, null, composer, 0, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EyRDKPInjbmUAeSrzMCjuTHpQlM(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.helpcenter.api.navigation.EducationalSheetDestination educationalSheetDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(educationalSheetDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-759959884, i, -1, "com.paypal.oslo.feature.helpcenter.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:131)");
        }
        final java.lang.String rememberNavResultRequestId = com.paypal.oslo.core.navigation.result.NavResultRequestIdKt.rememberNavResultRequestId(composer, 0);
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.helpcenter.di.NavigationModule$provideEntryProviderInstaller$1$5$1$1(appNavigator, null);
            composer.updateRememberedValue(rememberedValue);
        }
        kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
        com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, composer, 0);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$4$$inlined$NavResultEffect-rtGRyWw$1
                @Override // kotlin.jvm.functions.Function2
                public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                    return m14782invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                }

                /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                public final kotlinx.coroutines.flow.Flow<java.lang.Object> m14782invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                    return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(rememberNavResultRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, composer, 3072);
        boolean changed2 = composer.changed(appNavigator);
        boolean changed3 = composer.changed(rememberNavResultRequestId);
        boolean changedInstance = composer.changedInstance(educationalSheetDestination);
        java.lang.Object rememberedValue3 = composer.rememberedValue();
        if ((changed2 | changed3 | changedInstance) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.helpcenter.di.NavigationModule.$r8$lambda$vxa0pPFdr0NZIylP3w3Oc6z9mxA(com.paypal.oslo.core.navigation.AppNavigator.this, rememberNavResultRequestId, educationalSheetDestination);
                }
            };
            composer.updateRememberedValue(rememberedValue3);
        }
        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
        boolean changed4 = composer.changed(appNavigator);
        java.lang.Object rememberedValue4 = composer.rememberedValue();
        if (changed4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.helpcenter.di.NavigationModule.$r8$lambda$otEDb95vTZM9legPeqNRNC1zPtQ(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue4);
        }
        com.paypal.oslo.feature.helpcenter.ui.screens.EducationalSheetScreenKt.EducationalSheetScreen(function0, (kotlin.jvm.functions.Function0) rememberedValue4, null, null, composer, 0, 12);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$J1L5tyFmbjVLk4HKWH2Lb5Th9sU(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.helpcenter.di.NavigationModule.$r8$lambda$K1ACQEleMLlkqPcMQevU6tp4nH0((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$K1ACQEleMLlkqPcMQevU6tp4nH0(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$L0pfBvJizZgQ7StyD8VdSfk3K_A(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.helpcenter.di.NavigationModule.$r8$lambda$wsiub4k1QYft2eLwmzc_wx9bF0A((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$N8XT6o7f6GbhJUFyWthhY1r7RPE(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleFullScreenDestination helpCenterArticleFullScreenDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpCenterArticleFullScreenDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2035767706, i, -1, "com.paypal.oslo.feature.helpcenter.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:122)");
        }
        com.paypal.oslo.feature.helpcenter.ui.screens.ArticleFullScreenKt.ArticleFullScreen(helpCenterArticleFullScreenDestination.getArticleId(), appNavigator, null, composer, 0, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$R5cRvtvww8HN9vtx5kZPYIau8n4(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleDetailsDestination("FAQ4785"));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VW1SDul042DMNoTzoEKH8jzsuiw(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VddFpSNG337ufLrH0p6RwBbRcHw(com.paypal.oslo.feature.helpcenter.api.navigation.EducationalSheetDestination educationalSheetDestination, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        java.lang.String policyName = educationalSheetDestination.getPolicyName();
        if (policyName == null) {
            policyName = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.VALUE_POLICY_NAME_IRS_1099_K;
        }
        java.lang.String str = policyName;
        java.lang.String attemptIntention = educationalSheetDestination.getAttemptIntention();
        if (attemptIntention == null) {
            attemptIntention = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.VALUE_ATTEMPT_INTENTION_TAX_ON_HOLD;
        }
        java.lang.String str2 = attemptIntention;
        java.lang.String invocationPage = educationalSheetDestination.getInvocationPage();
        if (invocationPage == null) {
            invocationPage = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.VALUE_INVOCATION_PAGE_EDUCATIONAL_SHEET;
        }
        java.lang.String str3 = invocationPage;
        java.lang.String showAcknowledgementScreen = educationalSheetDestination.getShowAcknowledgementScreen();
        java.lang.String str4 = showAcknowledgementScreen == null ? "false" : showAcknowledgementScreen;
        java.lang.String showContextualMessage = educationalSheetDestination.getShowContextualMessage();
        java.lang.String str5 = showContextualMessage == null ? "false" : showContextualMessage;
        java.lang.String ppFlow = educationalSheetDestination.getPpFlow();
        if (ppFlow == null) {
            ppFlow = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityDeeplinkQueryParametersConstants.VALUE_PP_FLOW_EDUCATIONAL_SHEET_NATIVE;
        }
        navigationScope.push(new com.paypal.oslo.feature.mosaic.api.navigation.MosaicLegacyDestination(str, (java.lang.String) null, str2, str3, str4, str5, ppFlow, 2, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_EqwsTrIOg0IofL_kPUzWcqqoRk(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterVideoPlayerDestination helpCenterVideoPlayerDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpCenterVideoPlayerDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-855704398, i, -1, "com.paypal.oslo.feature.helpcenter.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:176)");
        }
        java.lang.String videoUrl = helpCenterVideoPlayerDestination.getVideoUrl();
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.helpcenter.di.NavigationModule.$r8$lambda$L0pfBvJizZgQ7StyD8VdSfk3K_A(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.helpcenter.ui.screens.VideoPlayerScreenKt.VideoPlayerScreen(videoUrl, (kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState $r8$lambda$g5Lft_Pgu8GUdyT3iWgBDck8Fl8(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleListDestination helpCenterArticleListDestination) {
        com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState bottomSheetStackState = new com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState();
        java.lang.String productRefId = helpCenterArticleListDestination.getProductRefId();
        if (productRefId == null) {
            productRefId = "";
        }
        java.lang.String pageRefId = helpCenterArticleListDestination.getPageRefId();
        if (pageRefId == null) {
            pageRefId = "";
        }
        java.lang.String fieldRefId = helpCenterArticleListDestination.getFieldRefId();
        bottomSheetStackState.push(new com.paypal.oslo.feature.helpcenter.ui.navigation.StackPage.ArticleList(productRefId, pageRefId, fieldRefId != null ? fieldRefId : ""));
        return bottomSheetStackState;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$g_xggQ9KaOiGlnCLi2q7TJmg5iQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState bottomSheetStackState, com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry stackEntry, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stackEntry, "");
        if ((i & 6) == 0) {
            i |= composer.changed(stackEntry) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1837455657, i, -1, "com.paypal.oslo.feature.helpcenter.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous>.<anonymous> (NavigationModule.kt:114)");
            }
            com.paypal.oslo.feature.helpcenter.ui.navigation.IpsPageKt.IpsPage(stackEntry, appNavigator, bottomSheetStackState, composer, i & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$i2_YvoqVcAsegqcaPbRii2i6SDs(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterContactUsDestination helpCenterContactUsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpCenterContactUsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1304508910, i, -1, "com.paypal.oslo.feature.helpcenter.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:193)");
        }
        com.paypal.oslo.feature.helpcenter.ui.screens.ContactUsScreenKt.ContactUsScreen(appNavigator, null, null, composer, 0, 6);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jXqnBK5ZYniYxenhUGZkb5okH2k(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, final com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleDetailsDestination helpCenterArticleDetailsDestination, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(helpCenterArticleDetailsDestination, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1028764612, i, -1, "com.paypal.oslo.feature.helpcenter.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous> (NavigationModule.kt:104)");
        }
        java.lang.Object[] objArr = new java.lang.Object[0];
        androidx.compose.runtime.saveable.Saver<com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState, java.lang.Object> saver = com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState.INSTANCE.getSaver();
        boolean changedInstance = composer.changedInstance(helpCenterArticleDetailsDestination);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.helpcenter.di.NavigationModule.$r8$lambda$AajM6qjqYerpcKV8BKgKb2yB2E4(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleDetailsDestination.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        final com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState bottomSheetStackState = (com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState) androidx.compose.runtime.saveable.RememberSaveableKt.m5465rememberSaveable(objArr, (androidx.compose.runtime.saveable.Saver) saver, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
        boolean changed = composer.changed(appNavigator);
        java.lang.Object rememberedValue2 = composer.rememberedValue();
        if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.helpcenter.di.NavigationModule.$r8$lambda$J1L5tyFmbjVLk4HKWH2Lb5Th9sU(com.paypal.oslo.core.navigation.AppNavigator.this);
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackKt.BottomSheetStack(bottomSheetStackState, (kotlin.jvm.functions.Function0) rememberedValue2, null, "Common Questions", androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1837455657, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.helpcenter.di.NavigationModule.$r8$lambda$g_xggQ9KaOiGlnCLi2q7TJmg5iQ(com.paypal.oslo.core.navigation.AppNavigator.this, bottomSheetStackState, (com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }, composer, 54), composer, 27648, 4);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ohisjRlP2AICwQHNAnufoEqcWW0(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.navigation3.runtime.EntryProviderScope entryProviderScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryProviderScope, "");
        final java.util.Map l2Metadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(286560547, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.helpcenter.di.NavigationModule.$r8$lambda$BNoN2L8cCefhheKW30nPGXHfM4s(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterHome) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterHome.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterHome, java.lang.Object>() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterHome helpCenterHome) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(helpCenterHome);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterHome, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$2
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterHome helpCenterHome) {
                return l2Metadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance);
        final java.util.Map bottomSheetMetadata$default = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, false, false, null, null, null, 119, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance2 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1997502539, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.helpcenter.di.NavigationModule.$r8$lambda$0wk88LuhgtiGGKRCA9RD4pnjXkU(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleListDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleListDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleListDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$3
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleListDestination helpCenterArticleListDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(helpCenterArticleListDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleListDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$4
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleListDestination helpCenterArticleListDestination) {
                return bottomSheetMetadata$default;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance2);
        final java.util.Map bottomSheetMetadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.bottomSheetMetadata$default(null, false, false, false, null, null, null, 119, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance3 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1028764612, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.helpcenter.di.NavigationModule.$r8$lambda$jXqnBK5ZYniYxenhUGZkb5okH2k(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleDetailsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleDetailsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleDetailsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$5
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleDetailsDestination helpCenterArticleDetailsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(helpCenterArticleDetailsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleDetailsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$6
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleDetailsDestination helpCenterArticleDetailsDestination) {
                return bottomSheetMetadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance3);
        final java.util.Map l2Metadata$default2 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance4 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(2035767706, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.helpcenter.di.NavigationModule.$r8$lambda$N8XT6o7f6GbhJUFyWthhY1r7RPE(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleFullScreenDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleFullScreenDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleFullScreenDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleFullScreenDestination helpCenterArticleFullScreenDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(helpCenterArticleFullScreenDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleFullScreenDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$8
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterArticleFullScreenDestination helpCenterArticleFullScreenDestination) {
                return l2Metadata$default2;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance4);
        final java.util.Map l2Metadata$default3 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 511, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance5 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-759959884, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.helpcenter.di.NavigationModule.$r8$lambda$EyRDKPInjbmUAeSrzMCjuTHpQlM(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.helpcenter.api.navigation.EducationalSheetDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.helpcenter.api.navigation.EducationalSheetDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.helpcenter.api.navigation.EducationalSheetDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$9
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.helpcenter.api.navigation.EducationalSheetDestination educationalSheetDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(educationalSheetDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.helpcenter.api.navigation.EducationalSheetDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$10
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.helpcenter.api.navigation.EducationalSheetDestination educationalSheetDestination) {
                return l2Metadata$default3;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance5);
        final java.util.Map l2Metadata$default4 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance6 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1784731385, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.helpcenter.di.NavigationModule.$r8$lambda$2nlhAb2f6TDSd25HyccieXXQEgk(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterTopicsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterTopicsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterTopicsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$11
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterTopicsDestination helpCenterTopicsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(helpCenterTopicsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterTopicsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$12
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterTopicsDestination helpCenterTopicsDestination) {
                return l2Metadata$default4;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance6);
        final java.util.Map l2Metadata$default5 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance7 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-855704398, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda22
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.helpcenter.di.NavigationModule.$r8$lambda$_EqwsTrIOg0IofL_kPUzWcqqoRk(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterVideoPlayerDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterVideoPlayerDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterVideoPlayerDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$13
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterVideoPlayerDestination helpCenterVideoPlayerDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(helpCenterVideoPlayerDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterVideoPlayerDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$14
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterVideoPlayerDestination helpCenterVideoPlayerDestination) {
                return l2Metadata$default5;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance7);
        final java.util.Map l2Metadata$default6 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance8 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(711888133, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda23
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.helpcenter.di.NavigationModule.m14781$r8$lambda$b4YH7PY_Lmnh9rHN7KDbosYc(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterSearchDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterSearchDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterSearchDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterSearchDestination helpCenterSearchDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(helpCenterSearchDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterSearchDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$16
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterSearchDestination helpCenterSearchDestination) {
                return l2Metadata$default6;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance8);
        final java.util.Map l2Metadata$default7 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance9 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1304508910, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda24
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.helpcenter.di.NavigationModule.$r8$lambda$i2_YvoqVcAsegqcaPbRii2i6SDs(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterContactUsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterContactUsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterContactUsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterContactUsDestination helpCenterContactUsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(helpCenterContactUsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterContactUsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$18
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterContactUsDestination helpCenterContactUsDestination) {
                return l2Metadata$default7;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance9);
        final java.util.Map l2Metadata$default8 = com.paypal.oslo.core.navigation.NavigationMetadataBuildersKt.l2Metadata$default(false, null, false, null, null, false, null, null, false, 510, null);
        androidx.compose.runtime.internal.ComposableLambda composableLambdaInstance10 = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1622052755, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.oslo.feature.helpcenter.di.NavigationModule.$r8$lambda$8NBhnSvfHf72MLxk41E4h0iGfhA(com.paypal.oslo.core.navigation.AppNavigator.this, (com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterCallUsDestination) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        });
        entryProviderScope.addEntryProvider(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterCallUsDestination.class), (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterCallUsDestination, java.lang.Object>() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$19
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterCallUsDestination helpCenterCallUsDestination) {
                return androidx.navigation3.runtime.NavEntryKt.defaultContentKey(helpCenterCallUsDestination);
            }
        }, (kotlin.jvm.functions.Function1) new kotlin.jvm.functions.Function1<com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterCallUsDestination, java.util.Map<java.lang.String, ? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$provideEntryProviderInstaller$lambda$0$$inlined$entry$default$20
            @Override // kotlin.jvm.functions.Function1
            public final java.util.Map<java.lang.String, ? extends java.lang.Object> invoke(com.paypal.oslo.feature.helpcenter.api.navigation.HelpCenterCallUsDestination helpCenterCallUsDestination) {
                return l2Metadata$default8;
            }
        }, (kotlin.jvm.functions.Function3) composableLambdaInstance10);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$otEDb95vTZM9legPeqNRNC1zPtQ(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.helpcenter.di.NavigationModule.$r8$lambda$R5cRvtvww8HN9vtx5kZPYIau8n4((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$trUIvUCv8dh0rtvSPDAeK73NDds(com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.helpcenter.ui.navigation.BottomSheetStackState bottomSheetStackState, com.paypal.oslo.feature.helpcenter.ui.navigation.StackEntry stackEntry, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stackEntry, "");
        if ((i & 6) == 0) {
            i |= composer.changed(stackEntry) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(2142022394, i, -1, "com.paypal.oslo.feature.helpcenter.di.NavigationModule.provideEntryProviderInstaller.<anonymous>.<anonymous>.<anonymous> (NavigationModule.kt:94)");
            }
            com.paypal.oslo.feature.helpcenter.ui.navigation.IpsPageKt.IpsPage(stackEntry, appNavigator, bottomSheetStackState, composer, i & 14);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vxa0pPFdr0NZIylP3w3Oc6z9mxA(com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str, final com.paypal.oslo.feature.helpcenter.api.navigation.EducationalSheetDestination educationalSheetDestination) {
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.mosaic.api.navigation.result.MosaicLegacyNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.helpcenter.di.NavigationModule$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.helpcenter.di.NavigationModule.$r8$lambda$VddFpSNG337ufLrH0p6RwBbRcHw(com.paypal.oslo.feature.helpcenter.api.navigation.EducationalSheetDestination.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wsiub4k1QYft2eLwmzc_wx9bF0A(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }
}
