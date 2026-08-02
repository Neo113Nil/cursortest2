package com.paypal.android.threeds;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"ThreeDsNavGraph", "", "challengeViewModel", "Lcom/paypal/android/threeds/viewmodel/ChallengeViewModel;", "challengeScreen", "", "navController", "Landroidx/navigation/NavHostController;", "navigateUp", "Lkotlin/Function0;", "(Lcom/paypal/android/threeds/viewmodel/ChallengeViewModel;Ljava/lang/String;Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "three-ds_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ThreeDsNavGraphKt {
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007c, code lost:
    
        if ((r15 & 2) != 0) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ThreeDsNavGraph(final com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel, java.lang.String str, final androidx.view.NavHostController navHostController, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(challengeViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navHostController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1360551543);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(challengeViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changed(str)) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(navHostController) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
                    str = com.paypal.android.threeds.utils.ChallengeUiType.OnBoardingProgress.INSTANCE.getName();
                    i3 &= -113;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1360551543, i3, -1, "com.paypal.android.threeds.ThreeDsNavGraph (ThreeDsNavGraph.kt:35)");
                }
                boolean changedInstance = startRestartGroup.changedInstance(challengeViewModel);
                boolean z = (i3 & 7168) == 2048;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.android.threeds.ThreeDsNavGraphKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.android.threeds.ThreeDsNavGraphKt.m10986$r8$lambda$M8dZKdO_yWXuj9ZNoetMuO2lqQ(com.paypal.android.threeds.viewmodel.ChallengeViewModel.this, function0, (androidx.view.NavGraphBuilder) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.view.compose.NavHostKt.NavHost(navHostController, str, null, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, ((i3 >> 6) & 14) | (i3 & 112), 12);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final java.lang.String str2 = str;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.android.threeds.ThreeDsNavGraphKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.android.threeds.ThreeDsNavGraphKt.$r8$lambda$EbYM_KnQKuROKm1AdYgFAdVU5NY(com.paypal.android.threeds.viewmodel.ChallengeViewModel.this, str2, navHostController, function0, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$67bfg20nY41d0KxjYFH2Uy_L014(com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel, kotlin.jvm.functions.Function0 function0, androidx.view.NavBackStackEntry navBackStackEntry, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1151030956, i, -1, "com.paypal.android.threeds.ThreeDsNavGraph.<anonymous>.<anonymous>.<anonymous> (ThreeDsNavGraph.kt:48)");
        }
        com.paypal.android.threeds.ui.NativeChallengeScreenKt.NativeChallengeScreen(challengeViewModel, com.paypal.android.threeds.utils.ChallengeUiType.MultiSelect.INSTANCE.getName(), function0, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EbYM_KnQKuROKm1AdYgFAdVU5NY(com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel, java.lang.String str, androidx.view.NavHostController navHostController, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ThreeDsNavGraph(challengeViewModel, str, navHostController, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$M8dZKdO_yWXuj9ZNoetMu-O2lqQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10986$r8$lambda$M8dZKdO_yWXuj9ZNoetMuO2lqQ(final com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel, final kotlin.jvm.functions.Function0 function0, androidx.view.NavGraphBuilder navGraphBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navGraphBuilder, "");
        androidx.view.compose.NavGraphBuilderKt.composable$default(navGraphBuilder, com.paypal.android.threeds.utils.ChallengeUiType.OnBoardingProgress.INSTANCE.getName(), null, null, com.paypal.android.threeds.ComposableSingletons$ThreeDsNavGraphKt.INSTANCE.getLambda$51528036$three_ds_release(), 6, null);
        androidx.view.compose.NavGraphBuilderKt.composable$default(navGraphBuilder, com.paypal.android.threeds.utils.ChallengeUiType.SingleSelect.INSTANCE.getName(), null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(907494093, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.android.threeds.ThreeDsNavGraphKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.android.threeds.ThreeDsNavGraphKt.$r8$lambda$o6MBIArtxbBeTMqxdCa4fJwd9oU(com.paypal.android.threeds.viewmodel.ChallengeViewModel.this, function0, (androidx.view.NavBackStackEntry) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 6, null);
        androidx.view.compose.NavGraphBuilderKt.composable$default(navGraphBuilder, com.paypal.android.threeds.utils.ChallengeUiType.MultiSelect.INSTANCE.getName(), null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1151030956, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.android.threeds.ThreeDsNavGraphKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.android.threeds.ThreeDsNavGraphKt.$r8$lambda$67bfg20nY41d0KxjYFH2Uy_L014(com.paypal.android.threeds.viewmodel.ChallengeViewModel.this, function0, (androidx.view.NavBackStackEntry) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 6, null);
        androidx.view.compose.NavGraphBuilderKt.composable$default(navGraphBuilder, com.paypal.android.threeds.utils.ChallengeUiType.OOB.INSTANCE.getName(), null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1394567819, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.android.threeds.ThreeDsNavGraphKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.android.threeds.ThreeDsNavGraphKt.$r8$lambda$Zjp12DjikLAkJ83tOxaUEeXZHd8(com.paypal.android.threeds.viewmodel.ChallengeViewModel.this, function0, (androidx.view.NavBackStackEntry) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 6, null);
        androidx.view.compose.NavGraphBuilderKt.composable$default(navGraphBuilder, com.paypal.android.threeds.utils.ChallengeUiType.Text.INSTANCE.getName(), null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1638104682, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.android.threeds.ThreeDsNavGraphKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.android.threeds.ThreeDsNavGraphKt.m10987$r8$lambda$vzytnekLFNyDhjnva2677jZZZQ(com.paypal.android.threeds.viewmodel.ChallengeViewModel.this, function0, (androidx.view.NavBackStackEntry) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 6, null);
        androidx.view.compose.NavGraphBuilderKt.composable$default(navGraphBuilder, com.paypal.android.threeds.utils.ChallengeUiType.HTML.INSTANCE.getName(), null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1881641545, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.android.threeds.ThreeDsNavGraphKt$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return com.paypal.android.threeds.ThreeDsNavGraphKt.$r8$lambda$_J13AGi6rD_wfslupz3AHcQN6UQ(com.paypal.android.threeds.viewmodel.ChallengeViewModel.this, function0, (androidx.view.NavBackStackEntry) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
            }
        }), 6, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Zjp12DjikLAkJ83tOxaUEeXZHd8(com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel, kotlin.jvm.functions.Function0 function0, androidx.view.NavBackStackEntry navBackStackEntry, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1394567819, i, -1, "com.paypal.android.threeds.ThreeDsNavGraph.<anonymous>.<anonymous>.<anonymous> (ThreeDsNavGraph.kt:55)");
        }
        com.paypal.android.threeds.ui.NativeChallengeScreenKt.NativeChallengeScreen(challengeViewModel, com.paypal.android.threeds.utils.ChallengeUiType.OOB.INSTANCE.getName(), function0, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_J13AGi6rD_wfslupz3AHcQN6UQ(com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel, kotlin.jvm.functions.Function0 function0, androidx.view.NavBackStackEntry navBackStackEntry, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1881641545, i, -1, "com.paypal.android.threeds.ThreeDsNavGraph.<anonymous>.<anonymous>.<anonymous> (ThreeDsNavGraph.kt:69)");
        }
        com.paypal.android.threeds.ui.WebViewChallengeScreenKt.WebViewChallengeScreen(challengeViewModel, false, function0, composer, 48, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$o6MBIArtxbBeTMqxdCa4fJwd9oU(com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel, kotlin.jvm.functions.Function0 function0, androidx.view.NavBackStackEntry navBackStackEntry, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(907494093, i, -1, "com.paypal.android.threeds.ThreeDsNavGraph.<anonymous>.<anonymous>.<anonymous> (ThreeDsNavGraph.kt:41)");
        }
        com.paypal.android.threeds.ui.NativeChallengeScreenKt.NativeChallengeScreen(challengeViewModel, com.paypal.android.threeds.utils.ChallengeUiType.SingleSelect.INSTANCE.getName(), function0, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$vzytnekLFNyDhjnva2677jZ-ZZQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m10987$r8$lambda$vzytnekLFNyDhjnva2677jZZZQ(com.paypal.android.threeds.viewmodel.ChallengeViewModel challengeViewModel, kotlin.jvm.functions.Function0 function0, androidx.view.NavBackStackEntry navBackStackEntry, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navBackStackEntry, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(1638104682, i, -1, "com.paypal.android.threeds.ThreeDsNavGraph.<anonymous>.<anonymous>.<anonymous> (ThreeDsNavGraph.kt:62)");
        }
        com.paypal.android.threeds.ui.NativeChallengeScreenKt.NativeChallengeScreen(challengeViewModel, com.paypal.android.threeds.utils.ChallengeUiType.Text.INSTANCE.getName(), function0, composer, 0);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
