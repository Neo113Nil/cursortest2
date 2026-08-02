package com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a>\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t¢\u0006\u0002\b\nH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aH\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\t2\u0015\b\u0002\u0010\b\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t¢\u0006\u0002\b\nH\u0003¢\u0006\u0002\u0010\u0012\u001a\r\u0010\u0013\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0018²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002"}, d2 = {"PostOnboardingFlowScreen", "", com.paypal.oslo.feature.identity.challenges.stepupwebview.StepupWebViewConstants.HeaderFields.FLOW_ID, "Lcom/paypal/oslo/feature/onboarding/api/steps/domain/FlowId;", "postOnboardingNavigator", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingNavigator;", "viewModel", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingViewModel;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "PostOnboardingFlowScreen-fVxw3D8", "(Ljava/lang/String;Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingNavigator;Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/PostOnboardingViewModel;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PostOnboardingFlowScreenContent", "uiState", "Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiState;", "onRetry", "onHome", "(Lcom/paypal/oslo/feature/onboarding/postonboarding/scaffolding/ui/mvi/PostOnboardingUiState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "PostOnboardingFlowScreenContentLoadingPreview", "(Landroidx/compose/runtime/Composer;I)V", "PostOnboardingFlowScreenContentErrorNetworkPreview", "PostOnboardingFlowScreenContentErrorApiFirstAttemptPreview", "PostOnboardingFlowScreenContentErrorApiSecondAttemptPreview", "onboarding_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PostOnboardingFlowScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0074  */
    /* renamed from: PostOnboardingFlowScreen-fVxw3D8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m16125PostOnboardingFlowScreenfVxw3D8(final java.lang.String str, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.Unit unit;
        kotlin.coroutines.Continuation continuation;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(postOnboardingViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-821851812);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(postOnboardingNavigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(postOnboardingViewModel) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function22 = function2;
            i3 |= startRestartGroup.changedInstance(function22) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                function23 = function22;
            } else {
                kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24 = i5 != 0 ? null : function22;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-821851812, i4, -1, "com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreen (PostOnboardingFlowScreen.kt:41)");
                }
                androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(postOnboardingViewModel.getStore$onboarding_prodRelease().getUiState(), null, startRestartGroup, 0, 1);
                boolean m16117isBackDisabled786ZxuM = com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.navigation.FlowsKt.m16117isBackDisabled786ZxuM(str);
                boolean changedInstance = startRestartGroup.changedInstance(postOnboardingViewModel);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt.$r8$lambda$jVFVw33gASZrvovi7xHDjtxOnMU(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.view.compose.BackHandlerKt.BackHandler(m16117isBackDisabled786ZxuM, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 0);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                boolean changedInstance2 = startRestartGroup.changedInstance(postOnboardingViewModel);
                boolean changedInstance3 = startRestartGroup.changedInstance(postOnboardingNavigator);
                boolean changed = startRestartGroup.changed(m16117isBackDisabled786ZxuM);
                int i6 = i4 & 7168;
                boolean z = i6 == 2048;
                com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt$PostOnboardingFlowScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (((changedInstance2 | changedInstance3 | changed) || z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    unit = unit2;
                    continuation = null;
                    rememberedValue2 = new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt$PostOnboardingFlowScreen$2$1(postOnboardingViewModel, postOnboardingNavigator, m16117isBackDisabled786ZxuM, function24, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                } else {
                    unit = unit2;
                    continuation = null;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
                if (function24 == null) {
                    startRestartGroup.startReplaceGroup(1823013642);
                    com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId m16020boximpl = com.paypal.oslo.feature.onboarding.api.steps.domain.FlowId.m16020boximpl(str);
                    boolean changedInstance4 = startRestartGroup.changedInstance(postOnboardingViewModel);
                    int i7 = i4 & 14;
                    boolean z2 = i7 == 4;
                    com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt$PostOnboardingFlowScreen$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
                    if ((changedInstance4 | z2) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt$PostOnboardingFlowScreen$3$1(postOnboardingViewModel, str, continuation);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(m16020boximpl, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, i7);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1823132806);
                    startRestartGroup.endReplaceGroup();
                }
                com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState postOnboardingUiState = (com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState) collectAsState.getValue();
                boolean changedInstance5 = startRestartGroup.changedInstance(postOnboardingViewModel);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changedInstance5 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt.$r8$lambda$cfOrNWWzS7PwfkzX8uCTR2FT3co(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue4;
                boolean changedInstance6 = startRestartGroup.changedInstance(postOnboardingViewModel);
                boolean z3 = (i4 & 14) == 4;
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if ((changedInstance6 | z3) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt.$r8$lambda$76fpJWE95y8vUolio7YY0nxTwic(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel.this, str);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                composer2 = startRestartGroup;
                getHighResolutionOutputSizeshNQ4ISI(postOnboardingUiState, function0, (kotlin.jvm.functions.Function0) rememberedValue5, function24, startRestartGroup, i6, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                function23 = function24;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt.$r8$lambda$UStg2w5a8vOsA8UdygqpHMEk0c0(str, postOnboardingNavigator, postOnboardingViewModel, function23, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function22 = function2;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(final com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState postOnboardingUiState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1278189489);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(postOnboardingUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                function2 = null;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1278189489, i3, -1, "com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenContent (PostOnboardingFlowScreen.kt:94)");
            }
            if (postOnboardingUiState instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Content) {
                startRestartGroup.startReplaceGroup(637223819);
                if (function2 == null) {
                    startRestartGroup.startReplaceGroup(637223818);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(20555607);
                    function2.invoke(startRestartGroup, java.lang.Integer.valueOf((i3 >> 9) & 14));
                    startRestartGroup.endReplaceGroup();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
                startRestartGroup.endReplaceGroup();
            } else if (postOnboardingUiState instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Loading) {
                startRestartGroup.startReplaceGroup(20557325);
                com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingLoadingContentKt.PostOnboardingLoadingContent(startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (postOnboardingUiState instanceof com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Error) {
                startRestartGroup.startReplaceGroup(20559770);
                com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorContentKt.PostOnboardingErrorContent(((com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.Error) postOnboardingUiState).getErrorType(), function0, function02, startRestartGroup, i3 & 1008, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(20553700);
                startRestartGroup.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22 = function2;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt.m16122$r8$lambda$3V_U9_lU7oAfpKQtg8iWhaAn2c(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState.this, function0, function02, function22, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$3V_U9_lU7oAfpKQt-g8iWhaAn2c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16122$r8$lambda$3V_U9_lU7oAfpKQtg8iWhaAn2c(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingUiState postOnboardingUiState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighResolutionOutputSizeshNQ4ISI(postOnboardingUiState, function0, function02, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$76fpJWE95y8vUolio7YY0nxTwic(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, java.lang.String str) {
        postOnboardingViewModel.processEvent(new com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestCloseFlowAndNavigate(str, null));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Da-rviqmalORM1lNXJArUN5gWvs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m16123$r8$lambda$DarviqmalORM1lNXJArUN5gWvs(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(103350544);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(103350544, updateChangedFlags, -1, "com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenContentLoadingPreview (PostOnboardingFlowScreen.kt:110)");
            }
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingLoadingContentKt.PostOnboardingLoadingContent(startRestartGroup, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt.m16123$r8$lambda$DarviqmalORM1lNXJArUN5gWvs(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$UStg2w5a8vOsA8UdygqpHMEk0c0(java.lang.String str, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingNavigator postOnboardingNavigator, com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        m16125PostOnboardingFlowScreenfVxw3D8(str, postOnboardingNavigator, postOnboardingViewModel, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ahB9FjUc47MaVCqKO4xVI9zEGuw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1787355098);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1787355098, updateChangedFlags, -1, "com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenContentErrorNetworkPreview (PostOnboardingFlowScreen.kt:120)");
            }
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.Network network = com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.Network.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorContentKt.PostOnboardingErrorContent(network, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 438, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt.$r8$lambda$ahB9FjUc47MaVCqKO4xVI9zEGuw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cfOrNWWzS7PwfkzX8uCTR2FT3co(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel) {
        postOnboardingViewModel.processEvent(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RetryFlow.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jVFVw33gASZrvovi7xHDjtxOnMU(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingViewModel postOnboardingViewModel) {
        postOnboardingViewModel.processEvent(com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.mvi.PostOnboardingEvent.RequestBack.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nkaf9J1vBN1ZpMogQpUniANrXz8(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1114254287);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1114254287, updateChangedFlags, -1, "com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenContentErrorApiFirstAttemptPreview (PostOnboardingFlowScreen.kt:134)");
            }
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ApiFirstAttempt apiFirstAttempt = com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ApiFirstAttempt.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorContentKt.PostOnboardingErrorContent(apiFirstAttempt, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 438, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt.$r8$lambda$nkaf9J1vBN1ZpMogQpUniANrXz8(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$t6sEgphMf4sdbcva8jVvhBiAQmI(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(261742597);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(261742597, updateChangedFlags, -1, "com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenContentErrorApiSecondAttemptPreview (PostOnboardingFlowScreen.kt:148)");
            }
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ApiSecondAttempt apiSecondAttempt = com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorType.ApiSecondAttempt.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingErrorContentKt.PostOnboardingErrorContent(apiSecondAttempt, function0, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 438, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.onboarding.postonboarding.scaffolding.ui.PostOnboardingFlowScreenKt.$r8$lambda$t6sEgphMf4sdbcva8jVvhBiAQmI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
