package com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen;

@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\f\u0010\n\u001a\u0004\u0018\u00010\u0003X\u008a\u0084\u0002²\u0006\n\u0010\u000b\u001a\u00020\fX\u008a\u0084\u0002"}, d2 = {"VerificationCaptureOrchestratorScreen", "", "workflowContext", "Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowContext;", "navigator", "Lcom/paypal/oslo/feature/verificationcapture/ui/util/Navigator;", "viewModel", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel;", "(Lcom/paypal/oslo/feature/verificationcapture/domain/model/WorkflowContext;Lcom/paypal/oslo/feature/verificationcapture/ui/util/Navigator;Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel;Landroidx/compose/runtime/Composer;II)V", "verification-capture_prodRelease", "workflowContextState", "uploadState", "Lcom/paypal/oslo/feature/verificationcapture/ui/screens/orchestrator/viewmodel/VerificationCaptureOrchestratorViewModel$UploadState;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class VerificationCaptureOrchestratorKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void VerificationCaptureOrchestratorScreen(final com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext workflowContext, final com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator, com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel verificationCaptureOrchestratorViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel verificationCaptureOrchestratorViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel verificationCaptureOrchestratorViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        int i5;
        final com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel verificationCaptureOrchestratorViewModel4;
        boolean changedInstance;
        int i6;
        int i7;
        boolean changedInstance2;
        java.lang.Object rememberedValue;
        boolean changed;
        boolean changedInstance3;
        boolean changedInstance4;
        boolean changedInstance5;
        int i8;
        boolean changedInstance6;
        java.lang.Object rememberedValue2;
        int i9;
        int i10;
        boolean changed2;
        boolean changedInstance7;
        boolean z;
        java.lang.Object rememberedValue3;
        boolean changedInstance8;
        boolean z2;
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager;
        java.lang.Object obj;
        java.lang.Object rememberedValue4;
        boolean changedInstance9;
        boolean z3;
        com.paypal.oslo.core.navigation.result.NavResultManager navResultManager2;
        java.lang.Object obj2;
        java.lang.Object rememberedValue5;
        int i11;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(workflowContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1631665887);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(workflowContext) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? startRestartGroup.changed(navigator) : startRestartGroup.changedInstance(navigator) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                verificationCaptureOrchestratorViewModel2 = verificationCaptureOrchestratorViewModel;
                if (startRestartGroup.changedInstance(verificationCaptureOrchestratorViewModel2)) {
                    i11 = 256;
                    i3 |= i11;
                }
            } else {
                verificationCaptureOrchestratorViewModel2 = verificationCaptureOrchestratorViewModel;
            }
            i11 = 128;
            i3 |= i11;
        } else {
            verificationCaptureOrchestratorViewModel2 = verificationCaptureOrchestratorViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 4) != 0) {
                    i5 = i3 & (-897);
                    verificationCaptureOrchestratorViewModel4 = verificationCaptureOrchestratorViewModel2;
                    i4 = 0;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(verificationCaptureOrchestratorViewModel4.getWorkflowContext(), null, startRestartGroup, i4, 1);
                    androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(verificationCaptureOrchestratorViewModel4.getUploadState(), null, startRestartGroup, i4, 1);
                    android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    androidx.activity.result.contract.ActivityResultContracts.RequestPermission requestPermission = new androidx.activity.result.contract.ActivityResultContracts.RequestPermission();
                    changedInstance = startRestartGroup.changedInstance(workflowContext);
                    i6 = i5 & 112;
                    if (i6 != 32) {
                    }
                    changedInstance2 = startRestartGroup.changedInstance(verificationCaptureOrchestratorViewModel4);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (((changedInstance ? 1 : 0) | i7 | (changedInstance2 ? 1 : 0)) == 0) {
                    }
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt.$r8$lambda$rMRglF7kaGzMSNG5PLfXy5iwir0(com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext.this, navigator, verificationCaptureOrchestratorViewModel4, ((java.lang.Boolean) obj3).booleanValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, i4);
                    changed = startRestartGroup.changed(collectAsState);
                    changedInstance3 = startRestartGroup.changedInstance(verificationCaptureOrchestratorViewModel4);
                    changedInstance4 = startRestartGroup.changedInstance(workflowContext);
                    changedInstance5 = startRestartGroup.changedInstance(context);
                    if (i6 != 32) {
                    }
                    changedInstance6 = startRestartGroup.changedInstance(rememberLauncherForActivityResult);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (((changed ? 1 : 0) | (changedInstance3 ? 1 : 0) | (changedInstance4 ? 1 : 0) | (changedInstance5 ? 1 : 0) | i8 | (changedInstance6 ? 1 : 0)) == 0) {
                    }
                    i9 = i6;
                    i10 = 32;
                    composer2 = startRestartGroup;
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$1$1(verificationCaptureOrchestratorViewModel4, workflowContext, context, navigator, rememberLauncherForActivityResult, collectAsState, null);
                    composer2.updateRememberedValue(rememberedValue2);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(workflowContext, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer2, i5 & 14);
                    com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState uploadState = (com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState) collectAsState2.getValue();
                    changed2 = composer2.changed(collectAsState2);
                    changedInstance7 = composer2.changedInstance(verificationCaptureOrchestratorViewModel4);
                    if (i9 != i10) {
                    }
                    rememberedValue3 = composer2.rememberedValue();
                    if (!(changed2 | changedInstance7 | z)) {
                    }
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$2$1(verificationCaptureOrchestratorViewModel4, navigator, collectAsState2, null);
                    composer2.updateRememberedValue(rememberedValue3);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(uploadState, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer2, 0);
                    java.lang.String documentCaptureRequestId = verificationCaptureOrchestratorViewModel4.getDocumentCaptureRequestId();
                    changedInstance8 = composer2.changedInstance(verificationCaptureOrchestratorViewModel4);
                    if (i9 != i10) {
                    }
                    java.lang.Object rememberedValue6 = composer2.rememberedValue();
                    if (!(changedInstance8 | z2)) {
                    }
                    navResultManager = null;
                    obj = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$3$1(verificationCaptureOrchestratorViewModel4, navigator, null);
                    composer2.updateRememberedValue(obj);
                    kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) obj;
                    com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager, composer2, 0);
                    rememberedValue4 = composer2.rememberedValue();
                    if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(documentCaptureRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue4, composer2, 3072);
                    java.lang.String livenessRequestId = verificationCaptureOrchestratorViewModel4.getLivenessRequestId();
                    changedInstance9 = composer2.changedInstance(verificationCaptureOrchestratorViewModel4);
                    if (i9 != i10) {
                    }
                    java.lang.Object rememberedValue7 = composer2.rememberedValue();
                    if (!(changedInstance9 | z3)) {
                    }
                    navResultManager2 = null;
                    obj2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$4$1(verificationCaptureOrchestratorViewModel4, navigator, null);
                    composer2.updateRememberedValue(obj2);
                    kotlin.jvm.functions.Function2 function22 = (kotlin.jvm.functions.Function2) obj2;
                    com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager2 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager2, composer2, 0);
                    rememberedValue5 = composer2.rememberedValue();
                    if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(livenessRequestId, resolveNavResultManager2, function22, (kotlin.jvm.functions.Function2) rememberedValue5, composer2, 3072);
                    androidx.compose.foundation.layout.BoxKt.Box(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer2, 54, 2), composer2, 0);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    verificationCaptureOrchestratorViewModel3 = verificationCaptureOrchestratorViewModel4;
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
                i4 = 0;
                verificationCaptureOrchestratorViewModel2 = (com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i3 &= -897;
                i5 = i3;
                verificationCaptureOrchestratorViewModel4 = verificationCaptureOrchestratorViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1631665887, i5, -1, "com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorScreen (VerificationCaptureOrchestrator.kt:49)");
                }
                androidx.compose.runtime.State collectAsState3 = androidx.compose.runtime.SnapshotStateKt.collectAsState(verificationCaptureOrchestratorViewModel4.getWorkflowContext(), null, startRestartGroup, i4, 1);
                androidx.compose.runtime.State collectAsState22 = androidx.compose.runtime.SnapshotStateKt.collectAsState(verificationCaptureOrchestratorViewModel4.getUploadState(), null, startRestartGroup, i4, 1);
                android.content.Context context2 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                androidx.activity.result.contract.ActivityResultContracts.RequestPermission requestPermission2 = new androidx.activity.result.contract.ActivityResultContracts.RequestPermission();
                changedInstance = startRestartGroup.changedInstance(workflowContext);
                i6 = i5 & 112;
                i7 = (i6 != 32 || ((i5 & 64) != 0 && startRestartGroup.changedInstance(navigator))) ? 1 : i4;
                changedInstance2 = startRestartGroup.changedInstance(verificationCaptureOrchestratorViewModel4);
                rememberedValue = startRestartGroup.rememberedValue();
                if (((changedInstance ? 1 : 0) | i7 | (changedInstance2 ? 1 : 0)) == 0 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj3) {
                            return com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt.$r8$lambda$rMRglF7kaGzMSNG5PLfXy5iwir0(com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext.this, navigator, verificationCaptureOrchestratorViewModel4, ((java.lang.Boolean) obj3).booleanValue());
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult2 = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission2, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, i4);
                changed = startRestartGroup.changed(collectAsState3);
                changedInstance3 = startRestartGroup.changedInstance(verificationCaptureOrchestratorViewModel4);
                changedInstance4 = startRestartGroup.changedInstance(workflowContext);
                changedInstance5 = startRestartGroup.changedInstance(context2);
                i8 = (i6 != 32 || ((i5 & 64) != 0 && startRestartGroup.changedInstance(navigator))) ? 1 : i4;
                changedInstance6 = startRestartGroup.changedInstance(rememberLauncherForActivityResult2);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (((changed ? 1 : 0) | (changedInstance3 ? 1 : 0) | (changedInstance4 ? 1 : 0) | (changedInstance5 ? 1 : 0) | i8 | (changedInstance6 ? 1 : 0)) == 0 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    i9 = i6;
                    i10 = 32;
                    composer2 = startRestartGroup;
                    rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$1$1(verificationCaptureOrchestratorViewModel4, workflowContext, context2, navigator, rememberLauncherForActivityResult2, collectAsState3, null);
                    composer2.updateRememberedValue(rememberedValue2);
                } else {
                    i9 = i6;
                    i10 = 32;
                    composer2 = startRestartGroup;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(workflowContext, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer2, i5 & 14);
                com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState uploadState2 = (com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState) collectAsState22.getValue();
                changed2 = composer2.changed(collectAsState22);
                changedInstance7 = composer2.changedInstance(verificationCaptureOrchestratorViewModel4);
                z = i9 != i10 || ((i5 & 64) != 0 && composer2.changedInstance(navigator));
                rememberedValue3 = composer2.rememberedValue();
                if (!(changed2 | changedInstance7 | z) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$2$1(verificationCaptureOrchestratorViewModel4, navigator, collectAsState22, null);
                    composer2.updateRememberedValue(rememberedValue3);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(uploadState2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer2, 0);
                java.lang.String documentCaptureRequestId2 = verificationCaptureOrchestratorViewModel4.getDocumentCaptureRequestId();
                changedInstance8 = composer2.changedInstance(verificationCaptureOrchestratorViewModel4);
                z2 = i9 != i10 || ((i5 & 64) != 0 && composer2.changedInstance(navigator));
                java.lang.Object rememberedValue62 = composer2.rememberedValue();
                if ((!changedInstance8 && !z2) || rememberedValue62 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    navResultManager = null;
                    obj = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$3$1(verificationCaptureOrchestratorViewModel4, navigator, null);
                    composer2.updateRememberedValue(obj);
                } else {
                    obj = rememberedValue62;
                    navResultManager = null;
                }
                kotlin.jvm.functions.Function2 function23 = (kotlin.jvm.functions.Function2) obj;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager3 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager, composer2, 0);
                rememberedValue4 = composer2.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$$inlined$NavResultEffect-rtGRyWw$1
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager3, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m20683invokehN0UB1M(navResultManager3, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m20683invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager3, java.lang.String str) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager3, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                            return navResultManager3.m11582getScopedResultFlowInternalDpEMydE(str);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue4);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(documentCaptureRequestId2, resolveNavResultManager3, function23, (kotlin.jvm.functions.Function2) rememberedValue4, composer2, 3072);
                java.lang.String livenessRequestId2 = verificationCaptureOrchestratorViewModel4.getLivenessRequestId();
                changedInstance9 = composer2.changedInstance(verificationCaptureOrchestratorViewModel4);
                z3 = i9 != i10 || ((i5 & 64) != 0 && composer2.changedInstance(navigator));
                java.lang.Object rememberedValue72 = composer2.rememberedValue();
                if ((!changedInstance9 && !z3) || rememberedValue72 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    navResultManager2 = null;
                    obj2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$4$1(verificationCaptureOrchestratorViewModel4, navigator, null);
                    composer2.updateRememberedValue(obj2);
                } else {
                    obj2 = rememberedValue72;
                    navResultManager2 = null;
                }
                kotlin.jvm.functions.Function2 function222 = (kotlin.jvm.functions.Function2) obj2;
                com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager22 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager2, composer2, 0);
                rememberedValue5 = composer2.rememberedValue();
                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = (kotlin.jvm.functions.Function2) new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$$inlined$NavResultEffect-rtGRyWw$2
                        @Override // kotlin.jvm.functions.Function2
                        public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager3, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                            return m20684invokehN0UB1M(navResultManager3, navResultRequestId.m11592unboximpl());
                        }

                        /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                        public final kotlinx.coroutines.flow.Flow<java.lang.Object> m20684invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager3, java.lang.String str) {
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager3, "");
                            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                            return navResultManager3.m11582getScopedResultFlowInternalDpEMydE(str);
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue5);
                }
                com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(livenessRequestId2, resolveNavResultManager22, function222, (kotlin.jvm.functions.Function2) rememberedValue5, composer2, 3072);
                androidx.compose.foundation.layout.BoxKt.Box(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer2, 54, 2), composer2, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                verificationCaptureOrchestratorViewModel3 = verificationCaptureOrchestratorViewModel4;
            }
            i4 = 0;
            i5 = i3;
            verificationCaptureOrchestratorViewModel4 = verificationCaptureOrchestratorViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            androidx.compose.runtime.State collectAsState32 = androidx.compose.runtime.SnapshotStateKt.collectAsState(verificationCaptureOrchestratorViewModel4.getWorkflowContext(), null, startRestartGroup, i4, 1);
            androidx.compose.runtime.State collectAsState222 = androidx.compose.runtime.SnapshotStateKt.collectAsState(verificationCaptureOrchestratorViewModel4.getUploadState(), null, startRestartGroup, i4, 1);
            android.content.Context context22 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            androidx.activity.result.contract.ActivityResultContracts.RequestPermission requestPermission22 = new androidx.activity.result.contract.ActivityResultContracts.RequestPermission();
            changedInstance = startRestartGroup.changedInstance(workflowContext);
            i6 = i5 & 112;
            if (i6 != 32) {
            }
            changedInstance2 = startRestartGroup.changedInstance(verificationCaptureOrchestratorViewModel4);
            rememberedValue = startRestartGroup.rememberedValue();
            if (((changedInstance ? 1 : 0) | i7 | (changedInstance2 ? 1 : 0)) == 0) {
            }
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj3) {
                    return com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt.$r8$lambda$rMRglF7kaGzMSNG5PLfXy5iwir0(com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext.this, navigator, verificationCaptureOrchestratorViewModel4, ((java.lang.Boolean) obj3).booleanValue());
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            androidx.view.compose.ManagedActivityResultLauncher rememberLauncherForActivityResult22 = androidx.view.compose.ActivityResultRegistryKt.rememberLauncherForActivityResult(requestPermission22, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, i4);
            changed = startRestartGroup.changed(collectAsState32);
            changedInstance3 = startRestartGroup.changedInstance(verificationCaptureOrchestratorViewModel4);
            changedInstance4 = startRestartGroup.changedInstance(workflowContext);
            changedInstance5 = startRestartGroup.changedInstance(context22);
            if (i6 != 32) {
            }
            changedInstance6 = startRestartGroup.changedInstance(rememberLauncherForActivityResult22);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (((changed ? 1 : 0) | (changedInstance3 ? 1 : 0) | (changedInstance4 ? 1 : 0) | (changedInstance5 ? 1 : 0) | i8 | (changedInstance6 ? 1 : 0)) == 0) {
            }
            i9 = i6;
            i10 = 32;
            composer2 = startRestartGroup;
            rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$1$1(verificationCaptureOrchestratorViewModel4, workflowContext, context22, navigator, rememberLauncherForActivityResult22, collectAsState32, null);
            composer2.updateRememberedValue(rememberedValue2);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(workflowContext, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, composer2, i5 & 14);
            com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState uploadState22 = (com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState) collectAsState222.getValue();
            changed2 = composer2.changed(collectAsState222);
            changedInstance7 = composer2.changedInstance(verificationCaptureOrchestratorViewModel4);
            if (i9 != i10) {
            }
            rememberedValue3 = composer2.rememberedValue();
            if (!(changed2 | changedInstance7 | z)) {
            }
            rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$2$1(verificationCaptureOrchestratorViewModel4, navigator, collectAsState222, null);
            composer2.updateRememberedValue(rememberedValue3);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(uploadState22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, composer2, 0);
            java.lang.String documentCaptureRequestId22 = verificationCaptureOrchestratorViewModel4.getDocumentCaptureRequestId();
            changedInstance8 = composer2.changedInstance(verificationCaptureOrchestratorViewModel4);
            if (i9 != i10) {
            }
            java.lang.Object rememberedValue622 = composer2.rememberedValue();
            if (!(changedInstance8 | z2)) {
            }
            navResultManager = null;
            obj = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$3$1(verificationCaptureOrchestratorViewModel4, navigator, null);
            composer2.updateRememberedValue(obj);
            kotlin.jvm.functions.Function2 function232 = (kotlin.jvm.functions.Function2) obj;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager32 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager, composer2, 0);
            rememberedValue4 = composer2.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(documentCaptureRequestId22, resolveNavResultManager32, function232, (kotlin.jvm.functions.Function2) rememberedValue4, composer2, 3072);
            java.lang.String livenessRequestId22 = verificationCaptureOrchestratorViewModel4.getLivenessRequestId();
            changedInstance9 = composer2.changedInstance(verificationCaptureOrchestratorViewModel4);
            if (i9 != i10) {
            }
            java.lang.Object rememberedValue722 = composer2.rememberedValue();
            if (!(changedInstance9 | z3)) {
            }
            navResultManager2 = null;
            obj2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$VerificationCaptureOrchestratorScreen$4$1(verificationCaptureOrchestratorViewModel4, navigator, null);
            composer2.updateRememberedValue(obj2);
            kotlin.jvm.functions.Function2 function2222 = (kotlin.jvm.functions.Function2) obj2;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager222 = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(navResultManager2, composer2, 0);
            rememberedValue5 = composer2.rememberedValue();
            if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(livenessRequestId22, resolveNavResultManager222, function2222, (kotlin.jvm.functions.Function2) rememberedValue5, composer2, 3072);
            androidx.compose.foundation.layout.BoxKt.Box(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, composer2, 54, 2), composer2, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            verificationCaptureOrchestratorViewModel3 = verificationCaptureOrchestratorViewModel4;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            verificationCaptureOrchestratorViewModel3 = verificationCaptureOrchestratorViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.screen.VerificationCaptureOrchestratorKt.$r8$lambda$G5epzyntMuseMKvGVRk3dEObra8(com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext.this, navigator, verificationCaptureOrchestratorViewModel3, i, i2, (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$G5epzyntMuseMKvGVRk3dEObra8(com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext workflowContext, com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator, com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel verificationCaptureOrchestratorViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        VerificationCaptureOrchestratorScreen(workflowContext, navigator, verificationCaptureOrchestratorViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$rMRglF7kaGzMSNG5PLfXy5iwir0(com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext workflowContext, com.paypal.oslo.feature.verificationcapture.ui.util.Navigator navigator, com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel verificationCaptureOrchestratorViewModel, boolean z) {
        if (z) {
            com.paypal.android.logger.Logger.d$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[Orchestrator] Camera permission granted — routing to entry point", null, null, 6, null);
            com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.routing.FlowRouter.INSTANCE.m20682routeToEntryPointhEdsvIk(workflowContext, navigator, verificationCaptureOrchestratorViewModel.getDocumentCaptureRequestId(), verificationCaptureOrchestratorViewModel.getLivenessRequestId());
        } else {
            com.paypal.android.logger.Logger.w$default(com.paypal.oslo.feature.verificationcapture.ui.util.TempMaterial3CompatKt.getLog(), "[Orchestrator] Camera permission denied — aborting flow", null, null, 6, null);
            navigator.popBackStack();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext access$VerificationCaptureOrchestratorScreen$lambda$0(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.verificationcapture.domain.model.WorkflowContext) state.getValue();
    }

    public static final /* synthetic */ com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState access$VerificationCaptureOrchestratorScreen$lambda$1(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.verificationcapture.ui.screens.orchestrator.viewmodel.VerificationCaptureOrchestratorViewModel.UploadState) state.getValue();
    }
}
