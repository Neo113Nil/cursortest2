package com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a3\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002"}, d2 = {"DocumentReviewScreen", "", "navigator", "Lcom/paypal/oslo/feature/verificationcapture/ui/util/Navigator;", "viewModel", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/viewmodel/DocumentReviewViewModel;", "(Lcom/paypal/oslo/feature/verificationcapture/ui/util/Navigator;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/viewmodel/DocumentReviewViewModel;Landroidx/compose/runtime/Composer;II)V", "DocumentReviewScreenContent", "uiState", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewUiState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewEvent;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/paypal/oslo/feature/verificationcapture/ui/screens/documentreview/contract/DocumentReviewUiState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "verification-capture_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DocumentReviewScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DocumentReviewScreen(final com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator, com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel documentReviewViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel documentReviewViewModel2;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel documentReviewViewModel3;
        boolean changedInstance;
        boolean changedInstance2;
        java.lang.Object rememberedValue;
        boolean changedInstance3;
        java.lang.Object rememberedValue2;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1990771256);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(navigator) : startRestartGroup.changedInstance(navigator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                documentReviewViewModel2 = documentReviewViewModel;
                if (startRestartGroup.changedInstance(documentReviewViewModel2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                documentReviewViewModel2 = documentReviewViewModel;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            documentReviewViewModel2 = documentReviewViewModel;
        }
        int i6 = i3;
        int i7 = 1;
        if (startRestartGroup.shouldExecute((i6 & 19) != 18, i6 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 2) != 0) {
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
                    i4 = 0;
                    i6 &= -113;
                    documentReviewViewModel3 = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1990771256, i6, -1, "com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreen (DocumentReviewScreen.kt:53)");
                    }
                    androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(documentReviewViewModel3.getUiState(), null, startRestartGroup, i4, 1);
                    android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    changedInstance = startRestartGroup.changedInstance(documentReviewViewModel3);
                    if ((i6 & 14) != 4 && ((i6 & 8) == 0 || !startRestartGroup.changedInstance(navigator))) {
                        i7 = i4;
                    }
                    changedInstance2 = startRestartGroup.changedInstance(context);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (((changedInstance ? 1 : 0) | i7 | (changedInstance2 ? 1 : 0)) == 0 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt$DocumentReviewScreen$1$1(documentReviewViewModel3, navigator, context, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                    com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState documentReviewUiState = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState) collectAsState.getValue();
                    changedInstance3 = startRestartGroup.changedInstance(documentReviewViewModel3);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt$DocumentReviewScreen$2$1(documentReviewViewModel3);
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    DocumentReviewScreenContent(documentReviewUiState, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2), null, startRestartGroup, 0, 4);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    documentReviewViewModel2 = documentReviewViewModel3;
                }
                i4 = 0;
                documentReviewViewModel3 = documentReviewViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(documentReviewViewModel3.getUiState(), null, startRestartGroup, i4, 1);
                android.content.Context context2 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(documentReviewViewModel3);
                if ((i6 & 14) != 4) {
                    i7 = i4;
                }
                changedInstance2 = startRestartGroup.changedInstance(context2);
                rememberedValue = startRestartGroup.rememberedValue();
                if (((changedInstance ? 1 : 0) | i7 | (changedInstance2 ? 1 : 0)) == 0) {
                }
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt$DocumentReviewScreen$1$1(documentReviewViewModel3, navigator, context2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState documentReviewUiState2 = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState) collectAsState2.getValue();
                changedInstance3 = startRestartGroup.changedInstance(documentReviewViewModel3);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance3) {
                }
                rememberedValue2 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt$DocumentReviewScreen$2$1(documentReviewViewModel3);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                DocumentReviewScreenContent(documentReviewUiState2, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2), null, startRestartGroup, 0, 4);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                documentReviewViewModel2 = documentReviewViewModel3;
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i6 &= -113;
                    documentReviewViewModel3 = documentReviewViewModel2;
                    i4 = 0;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    androidx.compose.runtime.State collectAsState22 = androidx.compose.runtime.SnapshotStateKt.collectAsState(documentReviewViewModel3.getUiState(), null, startRestartGroup, i4, 1);
                    android.content.Context context22 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    kotlin.Unit unit22 = kotlin.Unit.INSTANCE;
                    changedInstance = startRestartGroup.changedInstance(documentReviewViewModel3);
                    if ((i6 & 14) != 4) {
                    }
                    changedInstance2 = startRestartGroup.changedInstance(context22);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (((changedInstance ? 1 : 0) | i7 | (changedInstance2 ? 1 : 0)) == 0) {
                    }
                    rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt$DocumentReviewScreen$1$1(documentReviewViewModel3, navigator, context22, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                    com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState documentReviewUiState22 = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState) collectAsState22.getValue();
                    changedInstance3 = startRestartGroup.changedInstance(documentReviewViewModel3);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance3) {
                    }
                    rememberedValue2 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt$DocumentReviewScreen$2$1(documentReviewViewModel3);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    DocumentReviewScreenContent(documentReviewUiState22, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2), null, startRestartGroup, 0, 4);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    documentReviewViewModel2 = documentReviewViewModel3;
                }
                i4 = 0;
                documentReviewViewModel3 = documentReviewViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                androidx.compose.runtime.State collectAsState222 = androidx.compose.runtime.SnapshotStateKt.collectAsState(documentReviewViewModel3.getUiState(), null, startRestartGroup, i4, 1);
                android.content.Context context222 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                kotlin.Unit unit222 = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(documentReviewViewModel3);
                if ((i6 & 14) != 4) {
                }
                changedInstance2 = startRestartGroup.changedInstance(context222);
                rememberedValue = startRestartGroup.rememberedValue();
                if (((changedInstance ? 1 : 0) | i7 | (changedInstance2 ? 1 : 0)) == 0) {
                }
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt$DocumentReviewScreen$1$1(documentReviewViewModel3, navigator, context222, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit222, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
                com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState documentReviewUiState222 = (com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState) collectAsState222.getValue();
                changedInstance3 = startRestartGroup.changedInstance(documentReviewViewModel3);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance3) {
                }
                rememberedValue2 = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt$DocumentReviewScreen$2$1(documentReviewViewModel3);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                DocumentReviewScreenContent(documentReviewUiState222, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2), null, startRestartGroup, 0, 4);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                documentReviewViewModel2 = documentReviewViewModel3;
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt.$r8$lambda$TkBkmy8akaUXSWXeyS0OVM7ibfs(com.paypal.oslo.feature.verificationcapture.ui.util.Navigator.this, documentReviewViewModel2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DocumentReviewScreenContent(final com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState documentReviewUiState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent, kotlin.Unit> function1, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(documentReviewUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(192561105);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(documentReviewUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(192561105, i4, -1, "com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenContent (DocumentReviewScreen.kt:94)");
                }
                androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing24());
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getSpaceBetween(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
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
                modifier3 = modifier4;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Review Your ID", androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, false, 0, 0, null, null, startRestartGroup, 54, 0, 2044);
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                androidx.compose.ui.Modifier fillMaxWidth$default = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
                if (documentReviewUiState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState.Loading) {
                    startRestartGroup.startReplaceGroup(66394861);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Loading image...", null, null, null, null, null, false, 0, 0, null, null, startRestartGroup, 6, 0, 2046);
                    startRestartGroup.endReplaceGroup();
                } else if (documentReviewUiState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState.Ready) {
                    startRestartGroup.startReplaceGroup(66520845);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Image: ".concat(java.lang.String.valueOf(((com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState.Ready) documentReviewUiState).getImageUri())), null, null, null, null, null, false, 0, 0, null, null, startRestartGroup, 0, 0, 2046);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (!(documentReviewUiState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState.Uploading)) {
                        startRestartGroup.startReplaceGroup(-690596672);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(66739953);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4("Uploading...", null, null, null, null, null, false, 0, 0, null, null, startRestartGroup, 6, 0, 2046);
                    startRestartGroup.endReplaceGroup();
                }
                startRestartGroup.endNode();
                androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                androidx.compose.ui.Modifier fillMaxWidth$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
                int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                com.paypal.pds.components.ButtonSize.Large large = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                com.paypal.pds.components.ButtonStyle.Secondary secondary = com.paypal.pds.components.ButtonStyle.Secondary.INSTANCE;
                boolean z = documentReviewUiState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState.Ready;
                androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                int i6 = i4 & 112;
                boolean z2 = i6 == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt.$r8$lambda$etPv8msSB2oePSBb6iZvmFB4Szc(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                boolean z3 = true;
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue, "Retake", weight$default, null, null, secondary, large, z, false, startRestartGroup, 1769520, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PERSON_CIRCLE_SOLID_VALUE);
                com.paypal.pds.components.ButtonSize.Large large2 = com.paypal.pds.components.ButtonSize.Large.INSTANCE;
                com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
                boolean z4 = documentReviewUiState instanceof com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState.Uploading;
                androidx.compose.ui.Modifier weight$default2 = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                if (i6 != 32) {
                    z3 = false;
                }
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt.m20652$r8$lambda$CBkI_3QmjHrPOWOQASOupmHGAM(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue2, "Confirm", weight$default2, null, null, primary, large2, z, z4, startRestartGroup, 1769520, 24);
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.screen.DocumentReviewScreenKt.$r8$lambda$JfNDDlyUI9GWZEDHoamYsbDh_PI(com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState.this, function1, modifier5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: $r8$lambda$CBkI_3-QmjHrPOWOQASOupmHGAM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m20652$r8$lambda$CBkI_3QmjHrPOWOQASOupmHGAM(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.ConfirmTapped.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JfNDDlyUI9GWZEDHoamYsbDh_PI(com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewUiState documentReviewUiState, kotlin.jvm.functions.Function1 function1, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DocumentReviewScreenContent(documentReviewUiState, function1, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$TkBkmy8akaUXSWXeyS0OVM7ibfs(com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator, com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.viewmodel.DocumentReviewViewModel documentReviewViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DocumentReviewScreen(navigator, documentReviewViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$etPv8msSB2oePSBb6iZvmFB4Szc(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.verificationcapture.ui.screens.documentreview.contract.DocumentReviewEvent.RetakeTapped.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }
}
