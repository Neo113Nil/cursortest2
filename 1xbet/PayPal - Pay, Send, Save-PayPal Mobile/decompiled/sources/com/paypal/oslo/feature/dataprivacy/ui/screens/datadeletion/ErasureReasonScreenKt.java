package com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion;

@kotlin.Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0005\u001a)\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\u001aO\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f2 \u0010\u0010\u001a\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00030\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\u0015\u001a+\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00142\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u001aH\u0003¢\u0006\u0002\u0010\u001b\u001a\r\u0010\u001c\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u001d\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001e²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u001f\u001a\u00020\u0014X\u008a\u008e\u0002"}, d2 = {"MaxCommentLength", "", "ErasureReasonScreen", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/ErasureReasonViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/ErasureReasonViewModel;Landroidx/compose/runtime/Composer;II)V", "ErasureReasonScreenContent", "uiState", "Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/ErasureReasonUiState;", "onBackClick", "Lkotlin/Function0;", "onSubmit", "Lkotlin/Function2;", "", "Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureReason;", "", "(Lcom/paypal/oslo/feature/dataprivacy/ui/viewmodel/ErasureReasonUiState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "ReasonCheckbox", "reason", "label", "selectedReasons", "", "(Lcom/paypal/oslo/feature/dataprivacy/domain/model/ErasureReason;Ljava/lang/String;Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "ErasureReasonScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "data-privacy_prodRelease", "comments"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErasureReasonScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ErasureReasonScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonViewModel erasureReasonViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonViewModel erasureReasonViewModel2;
        androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonViewModel erasureReasonViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        boolean changed;
        boolean z;
        boolean changedInstance;
        java.lang.Object rememberedValue;
        boolean z2;
        java.lang.Object rememberedValue2;
        boolean changedInstance2;
        java.lang.Object rememberedValue3;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(896527618);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(appNavigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    erasureReasonViewModel2 = erasureReasonViewModel;
                    if (startRestartGroup.changedInstance(erasureReasonViewModel2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    erasureReasonViewModel2 = erasureReasonViewModel;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                erasureReasonViewModel2 = erasureReasonViewModel;
            }
            if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                } else {
                    modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
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
                        com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonViewModel erasureReasonViewModel4 = (com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        i4 = i3 & (-897);
                        erasureReasonViewModel3 = erasureReasonViewModel4;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(896527618, i4, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreen (ErasureReasonScreen.kt:75)");
                        }
                        androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(erasureReasonViewModel3.getUiState(), null, startRestartGroup, 0, 1);
                        com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState erasureReasonUiState = (com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState) collectAsState.getValue();
                        changed = startRestartGroup.changed(collectAsState);
                        int i7 = i4 & 14;
                        z = i7 != 4;
                        changedInstance = startRestartGroup.changedInstance(erasureReasonViewModel3);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (!(changed | z | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt$ErasureReasonScreen$1$1(appNavigator, erasureReasonViewModel3, collectAsState, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(erasureReasonUiState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
                        com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState erasureReasonUiState2 = (com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState) collectAsState.getValue();
                        z2 = i7 == 4;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if (!z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt.$r8$lambda$ulvo3hXMKWz1ayXl_ysllFY0q0M(com.paypal.oslo.core.navigation.AppNavigator.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
                        changedInstance2 = startRestartGroup.changedInstance(erasureReasonViewModel3);
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!changedInstance2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt.m14144$r8$lambda$ioxRTGG3GhC3NY7uWiqiHg_5Q(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonViewModel.this, (java.util.List) obj, (java.lang.String) obj2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        ErasureReasonScreenContent(erasureReasonUiState2, function0, (kotlin.jvm.functions.Function2) rememberedValue3, modifier3, startRestartGroup, (i4 << 6) & 7168, 0);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                    } else {
                        i4 = i3;
                    }
                }
                erasureReasonViewModel3 = erasureReasonViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(erasureReasonViewModel3.getUiState(), null, startRestartGroup, 0, 1);
                com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState erasureReasonUiState3 = (com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState) collectAsState2.getValue();
                changed = startRestartGroup.changed(collectAsState2);
                int i72 = i4 & 14;
                if (i72 != 4) {
                }
                changedInstance = startRestartGroup.changedInstance(erasureReasonViewModel3);
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(changed | z | changedInstance)) {
                }
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt$ErasureReasonScreen$1$1(appNavigator, erasureReasonViewModel3, collectAsState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(erasureReasonUiState3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
                com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState erasureReasonUiState22 = (com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState) collectAsState2.getValue();
                if (i72 == 4) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!z2) {
                }
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt.$r8$lambda$ulvo3hXMKWz1ayXl_ysllFY0q0M(com.paypal.oslo.core.navigation.AppNavigator.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
                changedInstance2 = startRestartGroup.changedInstance(erasureReasonViewModel3);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changedInstance2) {
                }
                rememberedValue3 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt.m14144$r8$lambda$ioxRTGG3GhC3NY7uWiqiHg_5Q(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonViewModel.this, (java.util.List) obj, (java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
                ErasureReasonScreenContent(erasureReasonUiState22, function02, (kotlin.jvm.functions.Function2) rememberedValue3, modifier3, startRestartGroup, (i4 << 6) & 7168, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                erasureReasonViewModel3 = erasureReasonViewModel2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt.m14146$r8$lambda$y_bL0NTjxNdZe1lhswbZ8Mg574(com.paypal.oslo.core.navigation.AppNavigator.this, modifier4, erasureReasonViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ErasureReasonScreenContent(final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState erasureReasonUiState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function2<? super java.util.List<? extends com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason>, ? super java.lang.String, kotlin.Unit> function2, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(erasureReasonUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function2, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(990121142);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(erasureReasonUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function2) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(990121142, i4, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenContent (ErasureReasonScreen.kt:109)");
                }
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = androidx.compose.runtime.SnapshotStateKt.mutableStateListOf();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList = (androidx.compose.runtime.snapshots.SnapshotStateList) rememberedValue;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue2;
                boolean z = erasureReasonUiState instanceof com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState.Loading;
                androidx.compose.ui.Modifier modifier5 = modifier4;
                androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
                composer2 = startRestartGroup;
                com.paypal.oslo.core.commonui.components.TopBarKt.TopBar(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_security_privacy_title, startRestartGroup, 0), null, null, com.paypal.oslo.core.commonui.components.TopBarTitleAlignment.Center, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(486822332, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt.$r8$lambda$GxPl0KTHgR4sZZ_0ub7ls5CLeSc(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), null, startRestartGroup, 199680, 86);
                if (erasureReasonUiState instanceof com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState.Error) {
                    composer2.startReplaceGroup(-1346567865);
                    i5 = 0;
                    com.paypal.pds.components.BannerKt.Banner(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), "erasure_error_banner"), com.paypal.pds.components.BannerStyle.Negative.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_error_banner_description, composer2, 0), (java.lang.String) null, com.paypal.pds.components.BannerTrailingElement.None, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, (kotlin.jvm.functions.Function0<kotlin.Unit>) null, composer2, 24624, 104);
                    composer2.endReplaceGroup();
                } else {
                    i5 = 0;
                    composer2.startReplaceGroup(-1346205258);
                    composer2.endReplaceGroup();
                }
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(i5, composer2, i5, 1), false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, i5);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, i5));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1708paddingVpY3zN4$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_feedback_heading, composer2, i5), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 7, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.HeadingLarge.INSTANCE, composer2, 384, 6, 1016);
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_feedback_description, composer2, i5), androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing24(), 7, null), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, composer2, 384, 6, 1016);
                androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList2 = snapshotStateList;
                Camera2StreamConfigurationMap(com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason.ANOTHER_ACCOUNT, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_feedback_reason_another_account, composer2, i5), snapshotStateList2, composer2, 390);
                Camera2StreamConfigurationMap(com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason.DONT_USE_ACCOUNT, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_feedback_reason_dont_use, composer2, i5), snapshotStateList2, composer2, 390);
                Camera2StreamConfigurationMap(com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason.PRIVACY_CONCERN, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_feedback_reason_privacy_concern, composer2, i5), snapshotStateList2, composer2, 390);
                Camera2StreamConfigurationMap(com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason.TOO_MANY_EMAILS, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_feedback_reason_too_many_emails, composer2, i5), snapshotStateList2, composer2, 390);
                Camera2StreamConfigurationMap(com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason.OTHER, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_feedback_reason_other, composer2, i5), snapshotStateList2, composer2, 390);
                java.lang.String str = (java.lang.String) mutableState.getValue();
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_feedback_comments_placeholder, composer2, i5);
                androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null);
                java.lang.Object rememberedValue3 = composer2.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt.$r8$lambda$YL4TPEJlYvcpOj6kYWY68ftNWd0(androidx.compose.runtime.MutableState.this, (java.lang.String) obj);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue3);
                }
                com.paypal.pds.components.TextAreaKt.TextArea((kotlin.jvm.functions.Function1) rememberedValue3, m1710paddingqDBjuR0$default, 250, str, stringResource, false, null, 5, 0, null, composer2, 12583302, 864);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer2, i5);
                composer2.endNode();
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer2, i5);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer2, i5));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer2, m1706padding3ABfNKs);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(composer2.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor3);
                } else {
                    composer2.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(composer2);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.dataprivacy.R.string.feature_data_privacy_erasure_feedback_close_account_button, composer2, i5);
                com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                if ((i4 & 896) == 256) {
                    i5 = 1;
                }
                java.lang.Object rememberedValue4 = composer2.rememberedValue();
                if (i5 != 0 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt.m14145$r8$lambda$q5vAY2H6z19dRiclJ5qNaZpvU(kotlin.jvm.functions.Function2.this, snapshotStateList, mutableState);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue4);
                }
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue4, stringResource2, fillMaxWidth$default, null, null, primary, large, !z, false, composer2, 1769856, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE);
                composer2.endNode();
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt.$r8$lambda$0a2zOieSVQqTRgcmilsarOoTHAk(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState.this, function0, function2, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 1171) == 1170, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason erasureReason, final java.lang.String str, final java.util.List<com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason> list, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(617612634);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(erasureReason.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(list) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(617612634, i2, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ReasonCheckbox (ErasureReasonScreen.kt:228)");
            }
            boolean contains = list.contains(erasureReason);
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 7, null);
            boolean changedInstance = startRestartGroup.changedInstance(list);
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt.$r8$lambda$eLpK4K1o7YEGo1gWl5ODt8C3mUE(list, erasureReason, ((java.lang.Boolean) obj).booleanValue());
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.CheckboxKt.Checkbox(contains, str, (kotlin.jvm.functions.Function1) rememberedValue, m1710paddingqDBjuR0$default, false, null, null, null, startRestartGroup, i2 & 112, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt.$r8$lambda$REKnQJLoSUpKU2j65F3Rp61jJF0(com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason.this, str, list, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0a2zOieSVQqTRgcmilsarOoTHAk(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState erasureReasonUiState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function2 function2, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ErasureReasonScreenContent(erasureReasonUiState, function0, function2, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0kdtKlhCoFuHgGxoSKra32tCe4g(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1786383306);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1786383306, updateChangedFlags, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenPreview (ErasureReasonScreen.kt:246)");
            }
            com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState.Idle idle = com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState.Idle.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt$$ExternalSyntheticLambda5
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
                rememberedValue2 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt.m14143$r8$lambda$Gie0HvpkEzodNtLKHvuBot7dxs((java.util.List) obj, (java.lang.String) obj2);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            ErasureReasonScreenContent(idle, function0, (kotlin.jvm.functions.Function2) rememberedValue2, null, startRestartGroup, 438, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt.$r8$lambda$0kdtKlhCoFuHgGxoSKra32tCe4g(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4qMiiQmjv4WSziAoprBl0fZOySQ(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Gie0HvpkEzod-NtLKHvuBot7dxs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14143$r8$lambda$Gie0HvpkEzodNtLKHvuBot7dxs(java.util.List list, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GxPl0KTHgR4sZZ_0ub7ls5CLeSc(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(486822332, i, -1, "com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenContent.<anonymous>.<anonymous> (ErasureReasonScreen.kt:124)");
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarBackButton(function0, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$REKnQJLoSUpKU2j65F3Rp61jJF0(com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason erasureReason, java.lang.String str, java.util.List list, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(erasureReason, str, list, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$YL4TPEJlYvcpOj6kYWY68ftNWd0(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(kotlin.text.StringsKt.take(str, 250));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eLpK4K1o7YEGo1gWl5ODt8C3mUE(java.util.List list, com.paypal.oslo.feature.dataprivacy.domain.model.ErasureReason erasureReason, boolean z) {
        if (z) {
            list.add(erasureReason);
        } else {
            list.remove(erasureReason);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ioxRTGG3-GhC3NY7uWi-qiHg_5Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14144$r8$lambda$ioxRTGG3GhC3NY7uWiqiHg_5Q(com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonViewModel erasureReasonViewModel, java.util.List list, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        erasureReasonViewModel.submitErasureRequest(list, str);
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$q5vAY-2H6z19dRicl-J5qNaZpvU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14145$r8$lambda$q5vAY2H6z19dRiclJ5qNaZpvU(kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.snapshots.SnapshotStateList snapshotStateList, androidx.compose.runtime.MutableState mutableState) {
        java.util.List list = snapshotStateList.toList();
        java.lang.String str = (java.lang.String) mutableState.getValue();
        if (kotlin.text.StringsKt.isBlank(str)) {
            str = null;
        }
        function2.invoke(list, str);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ulvo3hXMKWz1ayXl_ysllFY0q0M(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.dataprivacy.ui.screens.datadeletion.ErasureReasonScreenKt.$r8$lambda$4qMiiQmjv4WSziAoprBl0fZOySQ((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$y_bL0NTjxNdZe1lhswbZ8Mg-574, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14146$r8$lambda$y_bL0NTjxNdZe1lhswbZ8Mg574(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonViewModel erasureReasonViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ErasureReasonScreen(appNavigator, modifier, erasureReasonViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState access$ErasureReasonScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ErasureReasonUiState) state.getValue();
    }
}
