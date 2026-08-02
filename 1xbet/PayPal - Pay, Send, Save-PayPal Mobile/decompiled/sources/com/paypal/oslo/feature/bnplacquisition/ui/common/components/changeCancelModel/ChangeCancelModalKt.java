package com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel;

@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a_\u0010\t\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH\u0001¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, d2 = {"ChangeCancelModal", "", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "config", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelConfig;", "viewModel", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelViewModel;", "(Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelConfig;Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelViewModel;Landroidx/compose/runtime/Composer;II)V", "ChangeCancelModalContent", "isPrimaryButtonLoading", "", "isError", "onPrimaryButtonClick", "Lkotlin/Function0;", "onSecondaryButtonClick", "onCloseButtonClick", "(Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelConfig;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ChangeCancelModalChangeAmountPreview", "(Landroidx/compose/runtime/Composer;I)V", "ChangeCancelModalLoadingPreview", "ChangeCancelModalErrorPreview", "bnpl-acquisition_prodRelease", "uiState", "Lcom/paypal/oslo/feature/bnplacquisition/ui/common/components/changeCancelModel/ChangeCancelUiState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ChangeCancelModalKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e4  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChangeCancelModal(final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelConfig changeCancelConfig, com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel changeCancelViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel changeCancelViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel changeCancelViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        ?? r10;
        int i4;
        final com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel changeCancelViewModel4;
        com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState changeCancelUiState;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changeCancelConfig, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-428912020);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(changeCancelConfig) : startRestartGroup.changedInstance(changeCancelConfig) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                changeCancelViewModel2 = changeCancelViewModel;
                if (startRestartGroup.changedInstance(changeCancelViewModel2)) {
                    i5 = 256;
                    i3 |= i5;
                }
            } else {
                changeCancelViewModel2 = changeCancelViewModel;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            changeCancelViewModel2 = changeCancelViewModel;
        }
        int i6 = i3;
        if (startRestartGroup.shouldExecute((i6 & 147) != 146, i6 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i6 &= -897;
                }
            } else if ((i2 & 4) != 0) {
                androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                    empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                } else {
                    empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                }
                r10 = 0;
                i4 = i6 & (-897);
                changeCancelViewModel4 = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-428912020, i4, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModal (ChangeCancelModal.kt:110)");
                }
                changeCancelUiState = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(changeCancelViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue();
                if (!(changeCancelUiState instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState.Success)) {
                    com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState.Success success = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState.Success) changeCancelUiState;
                    kotlin.Pair pair = kotlin.TuplesKt.to(java.lang.Boolean.valueOf(success.isPrimaryButtonLoading()), java.lang.Boolean.valueOf(success.isError()));
                    final boolean booleanValue = ((java.lang.Boolean) pair.component1()).booleanValue();
                    final boolean booleanValue2 = ((java.lang.Boolean) pair.component2()).booleanValue();
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.view.compose.BackHandlerKt.BackHandler(booleanValue, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 48, r10);
                    boolean visible = bottomSheetController.getVisible();
                    int i7 = i4 & 14;
                    boolean z = (i7 == 4 || ((i4 & 8) != 0 && startRestartGroup.changedInstance(bottomSheetController))) ? true : r10;
                    boolean changedInstance = startRestartGroup.changedInstance(changeCancelViewModel4);
                    boolean z2 = ((i4 & 112) == 32 || ((i4 & 64) != 0 && startRestartGroup.changedInstance(changeCancelConfig))) ? true : r10;
                    com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt$ChangeCancelModal$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                    if ((z | changedInstance | z2) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt$ChangeCancelModal$2$1(bottomSheetController, changeCancelViewModel4, changeCancelConfig, null);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(visible), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, (int) r10);
                    com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel changeCancelViewModel5 = changeCancelViewModel4;
                    composer2 = startRestartGroup;
                    com.paypal.pds.components.ModalKt.Modal(bottomSheetController, null, null, null, null, null, null, !booleanValue, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-961371277, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt.m12356$r8$lambda$QndCEfYtLmgrcMBlGP4f4F1GrA(com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelConfig.this, booleanValue, booleanValue2, changeCancelViewModel4, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 805306368 | i7, 382);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    changeCancelViewModel3 = changeCancelViewModel5;
                } else {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
            }
            r10 = 0;
            i4 = i6;
            changeCancelViewModel4 = changeCancelViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            changeCancelUiState = (com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(changeCancelViewModel4.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue();
            if (!(changeCancelUiState instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelUiState.Success)) {
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            changeCancelViewModel3 = changeCancelViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt.$r8$lambda$ei8w2znb2DNgf_jDl1YnmJUDAzs(com.paypal.pds.components.BottomSheetController.this, changeCancelConfig, changeCancelViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x056b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChangeCancelModalContent(final com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelConfig changeCancelConfig, boolean z, boolean z2, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        int i6;
        int i7;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        final boolean z5;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        ?? r15;
        int i8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(changeCancelConfig, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1370818705);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(changeCancelConfig) : startRestartGroup.changedInstance(changeCancelConfig) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            z3 = z;
            i3 |= startRestartGroup.changed(z3) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                z4 = z2;
                i3 |= startRestartGroup.changed(z4) ? 256 : 128;
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
                    i6 = i2 & 16;
                    if (i6 == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
                        i7 = i2 & 32;
                        if (i7 != 0) {
                            i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((196608 & i) == 0) {
                            function04 = function03;
                            i3 |= startRestartGroup.changedInstance(function04) ? 131072 : 65536;
                            if (startRestartGroup.shouldExecute((i3 & 74899) == 74898, i3 & 1)) {
                                startRestartGroup.skipToGroupEnd();
                                function05 = function0;
                                function06 = function02;
                                z5 = z4;
                                function07 = function04;
                            } else {
                                if (i9 != 0) {
                                    z3 = false;
                                }
                                boolean z6 = i4 != 0 ? false : z4;
                                kotlin.jvm.functions.Function0<kotlin.Unit> function08 = i5 != 0 ? null : function0;
                                function06 = i6 != 0 ? null : function02;
                                if (i7 != 0) {
                                    function04 = null;
                                }
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventStart(-1370818705, i3, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalContent (ChangeCancelModal.kt:177)");
                                }
                                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing8()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
                                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                java.lang.String value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(changeCancelConfig.getToolBarContent().getBackButtonLabel(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                                java.lang.String value2 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(changeCancelConfig.getToolBarContent().getCloseButtonLabel(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
                                boolean z7 = (458752 & i3) == 131072;
                                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                if (z7 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final java.lang.Object invoke() {
                                            return com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt.$r8$lambda$CE8eWy0x3dVLvK8uwNJlcprj05E(kotlin.jvm.functions.Function0.this);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue);
                                }
                                boolean z8 = !z3;
                                kotlin.jvm.functions.Function0<kotlin.Unit> function09 = function04;
                                com.paypal.oslo.feature.bnplacquisition.ui.common.components.ToolBarKt.ToolBar(value, value2, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue, z8, startRestartGroup, 0, 28);
                                if (z6 && changeCancelConfig.getErrorMessage() != null) {
                                    startRestartGroup.startReplaceGroup(-1640891856);
                                    com.paypal.pds.components.BannerKt.Banner(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalTestTag.ERROR_BANNER), com.paypal.pds.components.BannerStyle.Negative.INSTANCE, changeCancelConfig.getErrorMessage(), (java.lang.String) null, (com.paypal.pds.components.BannerTrailingElement) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, startRestartGroup, 54, 120);
                                    r15 = 0;
                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    r15 = 0;
                                    startRestartGroup.startReplaceGroup(-1640571843);
                                    startRestartGroup.endReplaceGroup();
                                }
                                com.paypal.pds.core.Icon icon = changeCancelConfig.getIcon();
                                if (icon != null) {
                                    startRestartGroup.startReplaceGroup(-1640530024);
                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, r15);
                                    androidx.compose.ui.Modifier background2 = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1740size3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing48()), androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), r15);
                                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, r15));
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background2);
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (startRestartGroup.getInserting()) {
                                        startRestartGroup.createNode(constructor2);
                                    } else {
                                        startRestartGroup.useNode();
                                    }
                                    androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                                    i8 = r15;
                                    com.paypal.pds.components.IconKt.Icon(icon, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, 27696, 4);
                                    startRestartGroup.endNode();
                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, i8);
                                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                    startRestartGroup.endReplaceGroup();
                                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                                } else {
                                    startRestartGroup.startReplaceGroup(-1640530025);
                                    startRestartGroup.endReplaceGroup();
                                    i8 = r15;
                                }
                                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(changeCancelConfig.getTitle(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "Title"), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingMedium.INSTANCE, startRestartGroup, 432, 6, 1000);
                                java.lang.String description = changeCancelConfig.getDescription();
                                if (description != null) {
                                    startRestartGroup.startReplaceGroup(-1639539512);
                                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, i8);
                                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(description, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "Description"), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 432, 6, 1000);
                                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                                    startRestartGroup.endReplaceGroup();
                                    kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                                } else {
                                    startRestartGroup.startReplaceGroup(-1639539513);
                                    startRestartGroup.endReplaceGroup();
                                }
                                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, i8);
                                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, i8);
                                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, i8));
                                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor3);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                                com.paypal.pds.components.ButtonKt.Button(function08 == null ? changeCancelConfig.getPrimaryAction().getOnButtonClick() : function08, changeCancelConfig.getPrimaryAction().getButtonText(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "PrimaryButton"), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, z8, z3, startRestartGroup, ((i3 << 21) & 234881024) | 1769856, 24);
                                com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelContentAction secondaryAction = changeCancelConfig.getSecondaryAction();
                                if (secondaryAction != null) {
                                    startRestartGroup.startReplaceGroup(497000599);
                                    com.paypal.pds.components.ButtonKt.Button(function06 == null ? secondaryAction.getOnButtonClick() : function06, secondaryAction.getButtonText(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "SecondaryButton"), null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, z8, false, startRestartGroup, 1769856, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE);
                                    kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                                    startRestartGroup.endReplaceGroup();
                                    kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                                } else {
                                    startRestartGroup.startReplaceGroup(497000598);
                                    startRestartGroup.endReplaceGroup();
                                }
                                startRestartGroup.endNode();
                                startRestartGroup.endNode();
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                z5 = z6;
                                function05 = function08;
                                function07 = function09;
                            }
                            endRestartGroup = startRestartGroup.endRestartGroup();
                            if (endRestartGroup == null) {
                                final boolean z9 = z3;
                                final kotlin.jvm.functions.Function0<kotlin.Unit> function010 = function06;
                                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function2
                                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                        return com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt.$r8$lambda$QKbqnbdkNmRcHlr0iEzQLrp4VU0(com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelConfig.this, z9, z5, function05, function010, function07, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        function04 = function03;
                        if (startRestartGroup.shouldExecute((i3 & 74899) == 74898, i3 & 1)) {
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i7 = i2 & 32;
                    if (i7 != 0) {
                    }
                    function04 = function03;
                    if (startRestartGroup.shouldExecute((i3 & 74899) == 74898, i3 & 1)) {
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i6 = i2 & 16;
                if (i6 == 0) {
                }
                i7 = i2 & 32;
                if (i7 != 0) {
                }
                function04 = function03;
                if (startRestartGroup.shouldExecute((i3 & 74899) == 74898, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z4 = z2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            i6 = i2 & 16;
            if (i6 == 0) {
            }
            i7 = i2 & 32;
            if (i7 != 0) {
            }
            function04 = function03;
            if (startRestartGroup.shouldExecute((i3 & 74899) == 74898, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        z3 = z;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z4 = z2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        i6 = i2 & 16;
        if (i6 == 0) {
        }
        i7 = i2 & 32;
        if (i7 != 0) {
        }
        function04 = function03;
        if (startRestartGroup.shouldExecute((i3 & 74899) == 74898, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CE8eWy0x3dVLvK8uwNJlcprj05E(kotlin.jvm.functions.Function0 function0) {
        if (function0 != null) {
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Pfi_Pa_fYeTe0HsiRGINgxVgcMg(boolean z, com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel changeCancelViewModel) {
        if (!z) {
            changeCancelViewModel.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.ClosePressed.INSTANCE);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QKbqnbdkNmRcHlr0iEzQLrp4VU0(com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelConfig changeCancelConfig, boolean z, boolean z2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ChangeCancelModalContent(changeCancelConfig, z, z2, function0, function02, function03, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$QndCEfYtLmgrcMBlGP4f4F1-GrA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12356$r8$lambda$QndCEfYtLmgrcMBlGP4f4F1GrA(com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelConfig changeCancelConfig, final boolean z, boolean z2, final com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel changeCancelViewModel, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-961371277, i, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModal.<anonymous> (ChangeCancelModal.kt:149)");
            }
            boolean changedInstance = composer.changedInstance(changeCancelViewModel);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt.m12358$r8$lambda$XA0Dt78MQKSLE3EubhzjVIETkc(com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean changedInstance2 = composer.changedInstance(changeCancelViewModel);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt.m12359$r8$lambda$_ukHR9kCalj91Ti6Paa7BlAGyU(com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changed = composer.changed(z);
            boolean changedInstance3 = composer.changedInstance(changeCancelViewModel);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changed | changedInstance3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt.$r8$lambda$Pfi_Pa_fYeTe0HsiRGINgxVgcMg(z, changeCancelViewModel);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            ChangeCancelModalContent(changeCancelConfig, z, z2, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue3, composer, com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$TAsWpHK0M6aUHSXRBah0ak-bNLc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12357$r8$lambda$TAsWpHK0M6aUHSXRBah0akbNLc(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(789649376);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(789649376, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalChangeAmountPreview (ChangeCancelModal.kt:300)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewContentProvider virtualCardOverviewContentProvider = new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewContentProvider();
            java.lang.String value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(virtualCardOverviewContentProvider.getChangeAmountTitle(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            java.lang.String value2 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(virtualCardOverviewContentProvider.getChangeAmountDescription(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            com.paypal.pds.core.Icon.NoIcon noIcon = com.paypal.pds.core.Icon.NoIcon.INSTANCE;
            java.lang.String value3 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(virtualCardOverviewContentProvider.getYesChangeAmountButtonText(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelContentAction changeCancelContentAction = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelContentAction(value3, (kotlin.jvm.functions.Function0) rememberedValue);
            java.lang.String value4 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(virtualCardOverviewContentProvider.getDismissChangeButtonText(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ChangeCancelModalContent(new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelConfig(value, value2, noIcon, changeCancelContentAction, new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelContentAction(value4, (kotlin.jvm.functions.Function0) rememberedValue2), null, null, virtualCardOverviewContentProvider.getToolBarContent(), 96, null), false, false, null, null, null, startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable, 62);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt.m12357$r8$lambda$TAsWpHK0M6aUHSXRBah0akbNLc(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$XA0-Dt78MQKSLE3EubhzjVIETkc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12358$r8$lambda$XA0Dt78MQKSLE3EubhzjVIETkc(com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel changeCancelViewModel) {
        changeCancelViewModel.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.PrimaryButtonPressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$_u-kHR9kCalj91Ti6Paa7BlAGyU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m12359$r8$lambda$_ukHR9kCalj91Ti6Paa7BlAGyU(com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel changeCancelViewModel) {
        changeCancelViewModel.processEvent(com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelEvent.SecondaryButtonPressed.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$bYqnv5ToyUJvY6GhAXKVyxGJMxU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1926667542);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1926667542, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalLoadingPreview (ChangeCancelModal.kt:325)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewContentProvider virtualCardOverviewContentProvider = new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewContentProvider();
            java.lang.String value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(virtualCardOverviewContentProvider.getCancelLoanTitle(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            java.lang.String value2 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(virtualCardOverviewContentProvider.getCancelLoanDescription(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            java.lang.String value3 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(virtualCardOverviewContentProvider.getYesCancelLoanButtonText(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelContentAction changeCancelContentAction = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelContentAction(value3, (kotlin.jvm.functions.Function0) rememberedValue);
            java.lang.String value4 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(virtualCardOverviewContentProvider.getDismissCancelButtonText(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ChangeCancelModalContent(new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelConfig(value, value2, null, changeCancelContentAction, new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelContentAction(value4, (kotlin.jvm.functions.Function0) rememberedValue2), null, null, virtualCardOverviewContentProvider.getToolBarContent(), 100, null), true, false, null, null, null, startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | 48, 60);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt.$r8$lambda$bYqnv5ToyUJvY6GhAXKVyxGJMxU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dQLLZCBxFqBgiRSbFYdzJWJfzlQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1925929846);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1925929846, updateChangedFlags, -1, "com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalErrorPreview (ChangeCancelModal.kt:350)");
            }
            com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewContentProvider virtualCardOverviewContentProvider = new com.paypal.oslo.feature.bnplacquisition.ui.virtualcardoverview.VirtualCardOverviewContentProvider();
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider exitConfirmationContentProvider = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.ExitConfirmationContentProvider();
            java.lang.String value = com.paypal.oslo.core.commonui.utils.RefTextKt.value(virtualCardOverviewContentProvider.getChangeAmountTitle(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            java.lang.String value2 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(virtualCardOverviewContentProvider.getApiErrorDescription(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            java.lang.String value3 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(exitConfirmationContentProvider.getExitConfirmationContent().getPrimaryButtonText(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelContentAction changeCancelContentAction = new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelContentAction(value3, (kotlin.jvm.functions.Function0) rememberedValue);
            java.lang.String value4 = com.paypal.oslo.core.commonui.utils.RefTextKt.value(exitConfirmationContentProvider.getExitConfirmationContent().getSecondaryButtonText(), startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ChangeCancelModalContent(new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelConfig(value, null, null, changeCancelContentAction, new com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelContentAction(value4, (kotlin.jvm.functions.Function0) rememberedValue2), value2, null, virtualCardOverviewContentProvider.getToolBarContent(), 70, null), false, true, null, null, null, startRestartGroup, com.paypal.oslo.core.commonui.utils.RefText.$stable | com.paypal.oslo.core.commonui.utils.RefText.$stable | 384, 58);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelModalKt.$r8$lambda$dQLLZCBxFqBgiRSbFYdzJWJfzlQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ei8w2znb2DNgf_jDl1YnmJUDAzs(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelConfig changeCancelConfig, com.paypal.oslo.feature.bnplacquisition.ui.common.components.changeCancelModel.ChangeCancelViewModel changeCancelViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ChangeCancelModal(bottomSheetController, changeCancelConfig, changeCancelViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
