package com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a[\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0002\u0010\u000e\u001a+\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0003¢\u0006\u0002\u0010\u0014¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\u0017X\u008a\u0084\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0019X\u008a\u0084\u0002"}, d2 = {"BugReportScreen", "", "screenshot", "", "activityName", "", "agileTeamName", "onSuccess", "Lkotlin/Function0;", "viewModel", "Lcom/paypal/oslo/feature/shaketoreport/ui/bugreportscreen/BugReportViewModel;", "onViewScreenshot", "resultState", "Lcom/paypal/oslo/feature/shaketoreport/ui/bugreportscreen/BugReportResultState;", "([BLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/shaketoreport/ui/bugreportscreen/BugReportViewModel;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/shaketoreport/ui/bugreportscreen/BugReportResultState;Landroidx/compose/runtime/Composer;II)V", "rememberBugReportResultState", "successSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "errorSheetController", "onSuccessDismiss", "(Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/shaketoreport/ui/bugreportscreen/BugReportResultState;", "shake-to-report_prodRelease", "formUiState", "Lcom/paypal/oslo/feature/shaketoreport/ui/bugreportscreen/BugReportFormUiState;", "isLoading", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class BugReportScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:135:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BugReportScreen(final byte[] bArr, final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel bugReportViewModel, kotlin.jvm.functions.Function0<kotlin.Unit> function02, com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportResultState bugReportResultState, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        int i4;
        com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportResultState bugReportResultState2;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        final com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportResultState bugReportResultState3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportResultState bugReportResultState4;
        com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportResultState bugReportResultState5;
        java.lang.Object obj;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bugReportViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-921263029);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(bArr) ? 4 : 2) | i;
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
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= startRestartGroup.changedInstance(bugReportViewModel) ? 16384 : 8192;
        }
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((196608 & i) == 0) {
            function03 = function02;
            i3 |= startRestartGroup.changedInstance(function03) ? 131072 : 65536;
            i4 = i2 & 64;
            if (i4 == 0) {
                i3 |= 1572864;
            } else if ((1572864 & i) == 0) {
                bugReportResultState2 = bugReportResultState;
                i3 |= startRestartGroup.changed(bugReportResultState2) ? 1048576 : 524288;
                if (!startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    function04 = function03;
                    bugReportResultState3 = bugReportResultState2;
                } else {
                    if (i5 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function04 = (kotlin.jvm.functions.Function0) rememberedValue;
                    } else {
                        function04 = function03;
                    }
                    if (i4 != 0) {
                        bugReportResultState2 = null;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-921263029, i3, -1, "com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreen (BugReportScreen.kt:55)");
                    }
                    androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(bugReportViewModel.getFormUiState(), null, startRestartGroup, 0, 1);
                    androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(bugReportViewModel.getLoadingStatus(), null, startRestartGroup, 0, 1);
                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new com.paypal.pds.components.BottomSheetController();
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue2;
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new com.paypal.pds.components.BottomSheetController();
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    com.paypal.pds.components.BottomSheetController bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) rememberedValue3;
                    if (bugReportResultState2 == null) {
                        startRestartGroup.startReplaceGroup(-570486047);
                        int i6 = com.paypal.pds.components.BottomSheetController.$stable | (com.paypal.pds.components.BottomSheetController.$stable << 3) | ((i3 >> 3) & 896);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            bugReportResultState4 = bugReportResultState2;
                            androidx.compose.runtime.ComposerKt.traceEventStart(-1882838589, i6, -1, "com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.rememberBugReportResultState (BugReportScreen.kt:171)");
                        } else {
                            bugReportResultState4 = bugReportResultState2;
                        }
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportResultState(bottomSheetController, bottomSheetController2, function0);
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        bugReportResultState5 = (com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportResultState) rememberedValue4;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        startRestartGroup.endReplaceGroup();
                    } else {
                        bugReportResultState4 = bugReportResultState2;
                        startRestartGroup.startReplaceGroup(-570486512);
                        startRestartGroup.endReplaceGroup();
                        bugReportResultState5 = bugReportResultState4;
                    }
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    boolean changedInstance = startRestartGroup.changedInstance(bugReportViewModel);
                    boolean changed = startRestartGroup.changed(bugReportResultState5);
                    com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt$BugReportScreen$2$1 rememberedValue5 = startRestartGroup.rememberedValue();
                    if ((changedInstance | changed) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt$BugReportScreen$2$1(bugReportViewModel, bugReportResultState5, null);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 6);
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                    boolean changedInstance2 = startRestartGroup.changedInstance(bugReportViewModel);
                    boolean changed2 = startRestartGroup.changed(bugReportResultState5);
                    com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt$BugReportScreen$3$1 rememberedValue6 = startRestartGroup.rememberedValue();
                    if ((changedInstance2 || changed2) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        obj = null;
                        rememberedValue6 = new com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt$BugReportScreen$3$1(bugReportViewModel, bugReportResultState5, null);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    } else {
                        obj = null;
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue6, startRestartGroup, 6);
                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, obj);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormData bugReportFormData = new com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormData(((com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormUiState) collectAsState.getValue()).getTitle(), ((com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormUiState) collectAsState.getValue()).getStepsToReproduce(), ((com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormUiState) collectAsState.getValue()).getSelectedFrequency(), ((com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormUiState) collectAsState.getValue()).getEmployeeEmail(), ((com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormUiState) collectAsState.getValue()).isEmailValid(), bArr != null, ((java.lang.Boolean) collectAsState2.getValue()).booleanValue(), ((com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormUiState) collectAsState.getValue()).isSubmitEnabled());
                    boolean changedInstance3 = startRestartGroup.changedInstance(bugReportViewModel);
                    com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt$BugReportScreen$4$1$1 rememberedValue7 = startRestartGroup.rememberedValue();
                    if (changedInstance3 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt$BugReportScreen$4$1$1(bugReportViewModel);
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue7);
                    boolean changedInstance4 = startRestartGroup.changedInstance(bugReportViewModel);
                    com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt$BugReportScreen$4$2$1 rememberedValue8 = startRestartGroup.rememberedValue();
                    if (changedInstance4 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = new com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt$BugReportScreen$4$2$1(bugReportViewModel);
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                    }
                    kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue8);
                    boolean changedInstance5 = startRestartGroup.changedInstance(bugReportViewModel);
                    com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt$BugReportScreen$4$3$1 rememberedValue9 = startRestartGroup.rememberedValue();
                    if (changedInstance5 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue9 = new com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt$BugReportScreen$4$3$1(bugReportViewModel);
                        startRestartGroup.updateRememberedValue(rememberedValue9);
                    }
                    kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue9);
                    boolean changedInstance6 = startRestartGroup.changedInstance(bugReportViewModel);
                    boolean z = (i3 & 896) == 256;
                    boolean z2 = (i3 & 112) == 32;
                    boolean changedInstance7 = startRestartGroup.changedInstance(bArr);
                    java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                    if ((changedInstance6 | z | z2 | changedInstance7) || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt.$r8$lambda$KssrDSBDsvgrjyIkx6q1lNXkx74(com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel.this, str2, str, bArr);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue10);
                    }
                    com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormCallbacks bugReportFormCallbacks = new com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportFormCallbacks(function1, function12, function13, null, function04, (kotlin.jvm.functions.Function0) rememberedValue10, 8, null);
                    boolean changedInstance8 = startRestartGroup.changedInstance(bugReportViewModel);
                    com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt$BugReportScreen$4$5$1 rememberedValue11 = startRestartGroup.rememberedValue();
                    if (changedInstance8 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue11 = new com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt$BugReportScreen$4$5$1(bugReportViewModel);
                        startRestartGroup.updateRememberedValue(rememberedValue11);
                    }
                    com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenContentKt.BugReportScreenContent(bugReportFormData, bugReportFormCallbacks, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue11), startRestartGroup, 0);
                    com.paypal.pds.components.BottomSheetController successSheetController = bugReportResultState5.getSuccessSheetController();
                    com.paypal.oslo.feature.shaketoreport.domain.BugReportSuccess successResult = bugReportResultState5.getSuccessResult();
                    boolean changed3 = startRestartGroup.changed(bugReportResultState5);
                    com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt$BugReportScreen$4$6$1 rememberedValue12 = startRestartGroup.rememberedValue();
                    if (changed3 || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue12 = new com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt$BugReportScreen$4$6$1(bugReportResultState5);
                        startRestartGroup.updateRememberedValue(rememberedValue12);
                    }
                    com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt.ResultSuccessModal(successSheetController, successResult, (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue12), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable);
                    com.paypal.pds.components.BottomSheetController errorSheetController = bugReportResultState5.getErrorSheetController();
                    com.paypal.oslo.feature.shaketoreport.domain.BugReportError errorResult = bugReportResultState5.getErrorResult();
                    boolean changed4 = startRestartGroup.changed(bugReportResultState5);
                    com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt$BugReportScreen$4$7$1 rememberedValue13 = startRestartGroup.rememberedValue();
                    if (changed4 || rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue13 = new com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt$BugReportScreen$4$7$1(bugReportResultState5);
                        startRestartGroup.updateRememberedValue(rememberedValue13);
                    }
                    com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.ResultModalsKt.ResultErrorModal(errorSheetController, errorResult, (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue13), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable);
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    bugReportResultState3 = bugReportResultState4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final kotlin.jvm.functions.Function0<kotlin.Unit> function05 = function04;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                            return com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportScreenKt.$r8$lambda$EvtvCmzi2662XGrVZuOemernf7E(bArr, str, str2, function0, bugReportViewModel, function05, bugReportResultState3, i, i2, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            bugReportResultState2 = bugReportResultState;
            if (!startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function03 = function02;
        i4 = i2 & 64;
        if (i4 == 0) {
        }
        bugReportResultState2 = bugReportResultState;
        if (!startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$EvtvCmzi2662XGrVZuOemernf7E(byte[] bArr, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel bugReportViewModel, kotlin.jvm.functions.Function0 function02, com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportResultState bugReportResultState, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        BugReportScreen(bArr, str, str2, function0, bugReportViewModel, function02, bugReportResultState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KssrDSBDsvgrjyIkx6q1lNXkx74(com.paypal.oslo.feature.shaketoreport.ui.bugreportscreen.BugReportViewModel bugReportViewModel, java.lang.String str, java.lang.String str2, byte[] bArr) {
        bugReportViewModel.submitBugReport(str, str2, bArr);
        return kotlin.Unit.INSTANCE;
    }
}
