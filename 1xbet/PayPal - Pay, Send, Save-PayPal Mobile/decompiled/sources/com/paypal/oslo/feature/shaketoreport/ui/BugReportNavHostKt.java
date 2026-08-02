package com.paypal.oslo.feature.shaketoreport.ui;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aM\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0001¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"BugReportNavHost", "", "viewModel", "Lcom/paypal/oslo/feature/shaketoreport/ui/BugReportFlowViewModel;", "activityName", "", "agileTeamName", "startDestination", "onSuccess", "Lkotlin/Function0;", "onCancel", "(Lcom/paypal/oslo/feature/shaketoreport/ui/BugReportFlowViewModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "shake-to-report_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BugReportNavHostKt {
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
    
        if ((r36 & 8) != 0) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BugReportNavHost(final com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel bugReportFlowViewModel, final java.lang.String str, final java.lang.String str2, java.lang.String str3, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        java.lang.String str4;
        androidx.compose.runtime.Composer composer2;
        java.lang.String str5;
        androidx.view.NavHostController navHostController;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bugReportFlowViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1417725089);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(bugReportFlowViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                str4 = str3;
                if (startRestartGroup.changed(str4)) {
                    i4 = 2048;
                    i3 |= i4;
                }
            } else {
                str4 = str3;
            }
            i4 = 1024;
            i3 |= i4;
        } else {
            str4 = str3;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        if (startRestartGroup.shouldExecute((74899 & i3) != 74898, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 8) != 0) {
                    str4 = com.paypal.oslo.feature.shaketoreport.ui.BugReportDestination.Annotation.INSTANCE.getRoute();
                    i3 &= -7169;
                }
                int i5 = i3;
                str5 = str4;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1417725089, i5, -1, "com.paypal.oslo.feature.shaketoreport.ui.BugReportNavHost (BugReportNavHost.kt:36)");
                }
                final androidx.view.NavHostController rememberNavController = androidx.view.compose.NavHostControllerKt.rememberNavController(new androidx.view.Navigator[0], startRestartGroup, 0);
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                boolean changedInstance = startRestartGroup.changedInstance(bugReportFlowViewModel);
                boolean changedInstance2 = startRestartGroup.changedInstance(rememberNavController);
                boolean z = (458752 & i5) == 131072;
                boolean z2 = (i5 & 112) == 32;
                boolean z3 = (i5 & 896) == 256;
                boolean z4 = (57344 & i5) == 16384;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (((changedInstance | changedInstance2 | z | z2 | z3) || z4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    navHostController = rememberNavController;
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shaketoreport.ui.BugReportNavHostKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.shaketoreport.ui.BugReportNavHostKt.$r8$lambda$WqdPMMgvwJcpV6r0Z2mdkDFQV_s(com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel.this, rememberNavController, function02, str, str2, function0, (androidx.view.NavGraphBuilder) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                } else {
                    navHostController = rememberNavController;
                }
                composer2 = startRestartGroup;
                androidx.view.compose.NavHostKt.NavHost(navHostController, str5, fillMaxSize$default, null, null, null, null, null, null, null, (kotlin.jvm.functions.Function1) rememberedValue, composer2, ((i5 >> 6) & 112) | 384, 0, 1016);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            str5 = str4;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            final java.lang.String str6 = str5;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shaketoreport.ui.BugReportNavHostKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shaketoreport.ui.BugReportNavHostKt.m19330$r8$lambda$2gXdofShZ9NC79XwUAgujZaE(com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel.this, str, str2, str6, function0, function02, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$--2gXdofShZ9NC79XwUA-gujZaE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19330$r8$lambda$2gXdofShZ9NC79XwUAgujZaE(com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel bugReportFlowViewModel, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BugReportNavHost(bugReportFlowViewModel, str, str2, str3, function0, function02, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1WM4QnCZ_KAJghPAecg15nXIXUg(androidx.view.NavHostController navHostController) {
        navHostController.popBackStack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$D9qpkA64Ar-S6iYtlc6qeD0P7Qo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19331$r8$lambda$D9qpkA64ArS6iYtlc6qeD0P7Qo(androidx.view.NavHostController navHostController) {
        androidx.view.NavController.navigate$default((androidx.view.NavController) navHostController, com.paypal.oslo.feature.shaketoreport.ui.BugReportDestination.Report.INSTANCE.getRoute(), (androidx.view.NavOptions) null, (androidx.navigation.Navigator.Extras) null, 6, (java.lang.Object) null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$P1JyDM9wuxS5Ntvwi_ku6NDsyu8(com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel bugReportFlowViewModel, final androidx.view.NavHostController navHostController, androidx.compose.animation.AnimatedContentScope animatedContentScope, androidx.view.NavBackStackEntry navBackStackEntry, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedContentScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(748213628, i, -1, "com.paypal.oslo.feature.shaketoreport.ui.BugReportNavHost.<anonymous>.<anonymous>.<anonymous> (BugReportNavHost.kt:74)");
        }
        byte[] value = bugReportFlowViewModel.getScreenshot().getValue();
        byte[] finalScreenshot = value != null ? bugReportFlowViewModel.getFinalScreenshot(value) : null;
        boolean changedInstance = composer.changedInstance(navHostController);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shaketoreport.ui.BugReportNavHostKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.shaketoreport.ui.BugReportNavHostKt.$r8$lambda$1WM4QnCZ_KAJghPAecg15nXIXUg(androidx.view.NavHostController.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ScreenshotPreviewScreenKt.ScreenshotPreviewScreen(finalScreenshot, (kotlin.jvm.functions.Function0) rememberedValue, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$WqdPMMgvwJcpV6r0Z2mdkDFQV_s(final com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel bugReportFlowViewModel, final androidx.view.NavHostController navHostController, final kotlin.jvm.functions.Function0 function0, final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function0 function02, androidx.view.NavGraphBuilder navGraphBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraphBuilder, "");
        androidx.view.compose.NavGraphBuilderKt.composable$default(navGraphBuilder, com.paypal.oslo.feature.shaketoreport.ui.BugReportDestination.Annotation.INSTANCE.getRoute(), (java.util.List) null, (java.util.List) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-2113865212, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.shaketoreport.ui.BugReportNavHostKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function4
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return com.paypal.oslo.feature.shaketoreport.ui.BugReportNavHostKt.$r8$lambda$h66DKJVVO0N5gHr1BzukrDw7sYk(com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel.this, navHostController, function0, (androidx.compose.animation.AnimatedContentScope) obj, (androidx.view.NavBackStackEntry) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
            }
        }), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, (java.lang.Object) null);
        androidx.view.compose.NavGraphBuilderKt.composable$default(navGraphBuilder, com.paypal.oslo.feature.shaketoreport.ui.BugReportDestination.Report.INSTANCE.getRoute(), (java.util.List) null, (java.util.List) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-470065989, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.shaketoreport.ui.BugReportNavHostKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function4
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return com.paypal.oslo.feature.shaketoreport.ui.BugReportNavHostKt.$r8$lambda$jL_KXkMmqhTqeY7qff6ZzPtNB4I(com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel.this, str, str2, function02, navHostController, (androidx.compose.animation.AnimatedContentScope) obj, (androidx.view.NavBackStackEntry) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
            }
        }), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, (java.lang.Object) null);
        androidx.view.compose.NavGraphBuilderKt.composable$default(navGraphBuilder, com.paypal.oslo.feature.shaketoreport.ui.BugReportDestination.ScreenshotPreview.INSTANCE.getRoute(), (java.util.List) null, (java.util.List) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, (kotlin.jvm.functions.Function1) null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(748213628, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.shaketoreport.ui.BugReportNavHostKt$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function4
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return com.paypal.oslo.feature.shaketoreport.ui.BugReportNavHostKt.$r8$lambda$P1JyDM9wuxS5Ntvwi_ku6NDsyu8(com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel.this, navHostController, (androidx.compose.animation.AnimatedContentScope) obj, (androidx.view.NavBackStackEntry) obj2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
            }
        }), com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, (java.lang.Object) null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$h66DKJVVO0N5gHr1BzukrDw7sYk(com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel bugReportFlowViewModel, final androidx.view.NavHostController navHostController, kotlin.jvm.functions.Function0 function0, androidx.compose.animation.AnimatedContentScope animatedContentScope, androidx.view.NavBackStackEntry navBackStackEntry, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedContentScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-2113865212, i, -1, "com.paypal.oslo.feature.shaketoreport.ui.BugReportNavHost.<anonymous>.<anonymous>.<anonymous> (BugReportNavHost.kt:45)");
        }
        boolean changedInstance = composer.changedInstance(navHostController);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shaketoreport.ui.BugReportNavHostKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.shaketoreport.ui.BugReportNavHostKt.m19331$r8$lambda$D9qpkA64ArS6iYtlc6qeD0P7Qo(androidx.view.NavHostController.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.shaketoreport.ui.ScreenshotAnnotationScreenKt.ScreenshotAnnotationScreen(bugReportFlowViewModel, (kotlin.jvm.functions.Function0) rememberedValue, function0, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), composer, 3072, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jL_KXkMmqhTqeY7qff6ZzPtNB4I(com.paypal.oslo.feature.shaketoreport.ui.BugReportFlowViewModel bugReportFlowViewModel, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function0, final androidx.view.NavHostController navHostController, androidx.compose.animation.AnimatedContentScope animatedContentScope, androidx.view.NavBackStackEntry navBackStackEntry, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(animatedContentScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-470065989, i, -1, "com.paypal.oslo.feature.shaketoreport.ui.BugReportNavHost.<anonymous>.<anonymous>.<anonymous> (BugReportNavHost.kt:56)");
        }
        byte[] value = bugReportFlowViewModel.getScreenshot().getValue();
        byte[] finalScreenshot = value != null ? bugReportFlowViewModel.getFinalScreenshot(value) : null;
        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
        if (current == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel bugReportViewModel = (com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, composer, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, composer, 0, 0);
        boolean changedInstance = composer.changedInstance(navHostController);
        java.lang.Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shaketoreport.ui.BugReportNavHostKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.shaketoreport.ui.BugReportNavHostKt.$r8$lambda$lsDD5Ew3Ty5bKpH8PfL9bdNQiCo(androidx.view.NavHostController.this);
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt.BugReportScreen(finalScreenshot, str, str2, function0, bugReportViewModel, (kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 64);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lsDD5Ew3Ty5bKpH8PfL9bdNQiCo(androidx.view.NavHostController navHostController) {
        androidx.view.NavController.navigate$default((androidx.view.NavController) navHostController, com.paypal.oslo.feature.shaketoreport.ui.BugReportDestination.ScreenshotPreview.INSTANCE.getRoute(), (androidx.view.NavOptions) null, (androidx.navigation.Navigator.Extras) null, 6, (java.lang.Object) null);
        return kotlin.Unit.INSTANCE;
    }
}
