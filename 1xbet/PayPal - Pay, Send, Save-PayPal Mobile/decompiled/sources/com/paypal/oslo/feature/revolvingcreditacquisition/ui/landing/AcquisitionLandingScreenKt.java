package com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aI\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a5\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011H\u0001¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"AcquisitionLandingScreen", "", "onNavigateToNative", "Lkotlin/Function0;", "onNavigateToWebView", "onDismiss", "navigationArgs", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/arguments/AcquisitionLandingNavigationArgs;", "viewModel", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingViewModel;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/revolvingcreditacquisition/di/navigation/arguments/AcquisitionLandingNavigationArgs;Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingViewModel;Landroidx/compose/runtime/Composer;II)V", "AcquisitionLandingScreenContent", "uiState", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingState;", "modifier", "Landroidx/compose/ui/Modifier;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingEvent;", "(Lcom/paypal/oslo/feature/revolvingcreditacquisition/ui/landing/viewmodel/AcquisitionLandingState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "AcquisitionLandingScreenLoadingPreview", "(Landroidx/compose/runtime/Composer;I)V", "revolvingcredit-acquisition_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AcquisitionLandingScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:51:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AcquisitionLandingScreen(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final kotlin.jvm.functions.Function0<kotlin.Unit> function03, final com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionLandingNavigationArgs acquisitionLandingNavigationArgs, com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingViewModel acquisitionLandingViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingViewModel acquisitionLandingViewModel2;
        androidx.view.viewmodel.CreationExtras withCreationCallback;
        boolean z;
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingViewModel acquisitionLandingViewModel3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        java.lang.Object rememberedValue;
        boolean changedInstance;
        com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt$AcquisitionLandingScreen$3$1 rememberedValue2;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function03, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acquisitionLandingNavigationArgs, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1028754297);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function03) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(acquisitionLandingNavigationArgs) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                acquisitionLandingViewModel2 = acquisitionLandingViewModel;
                if (startRestartGroup.changedInstance(acquisitionLandingViewModel2)) {
                    i6 = 16384;
                    i3 |= i6;
                }
            } else {
                acquisitionLandingViewModel2 = acquisitionLandingViewModel;
            }
            i6 = 8192;
            i3 |= i6;
        } else {
            acquisitionLandingViewModel2 = acquisitionLandingViewModel;
        }
        int i7 = i3;
        if (startRestartGroup.shouldExecute((i7 & 9363) != 9362, i7 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 16) != 0) {
                    i5 = i7 & (-57345);
                    z = false;
                    acquisitionLandingViewModel3 = acquisitionLandingViewModel2;
                    i4 = i5;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    int i8 = i4;
                    androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(acquisitionLandingViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingUiEffect> uiEffect = acquisitionLandingViewModel3.getUiEffect();
                    if ((i8 & 14) == 4) {
                    }
                    if ((i8 & 112) == 32) {
                    }
                    if ((i8 & 896) != 256) {
                    }
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!(z3 | z2 | z4)) {
                    }
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt.$r8$lambda$XSxtzS82TL_alDocFiU14_eH_tM(kotlin.jvm.functions.Function0.this, function02, function03, (com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingUiEffect) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                    com.paypal.oslo.feature.revolvingcreditacquisition.utils.ComposeUtilsKt.CollectOnLifecycle(uiEffect, null, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0, 6);
                    com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState acquisitionLandingState = (com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState) collectAsStateWithLifecycle.getValue();
                    changedInstance = startRestartGroup.changedInstance(acquisitionLandingViewModel3);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue2 = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt$AcquisitionLandingScreen$3$1(acquisitionLandingViewModel3);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                    AcquisitionLandingScreenContent(acquisitionLandingState, null, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2), startRestartGroup, 0, 2);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    acquisitionLandingViewModel2 = acquisitionLandingViewModel3;
                }
            } else if ((i2 & 16) != 0) {
                boolean z5 = (i7 & 7168) == 2048;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z5 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt.m17992$r8$lambda$RqIHn_mbVc8gj6vHNwQS7Ilt0k(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionLandingNavigationArgs.this, (com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingViewModel.Factory) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
                androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                    withCreationCallback = dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function1);
                } else {
                    withCreationCallback = dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function1);
                }
                z = false;
                acquisitionLandingViewModel3 = (com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, withCreationCallback, startRestartGroup, 0, 0);
                i4 = i7 & (-57345);
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1028754297, i4, -1, "com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreen (AcquisitionLandingScreen.kt:46)");
                }
                int i82 = i4;
                androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(acquisitionLandingViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingUiEffect> uiEffect2 = acquisitionLandingViewModel3.getUiEffect();
                z2 = (i82 & 14) == 4 ? true : z;
                z3 = (i82 & 112) == 32 ? true : z;
                z4 = (i82 & 896) != 256 ? z : true;
                rememberedValue = startRestartGroup.rememberedValue();
                if (!(z3 | z2 | z4) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt.$r8$lambda$XSxtzS82TL_alDocFiU14_eH_tM(kotlin.jvm.functions.Function0.this, function02, function03, (com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingUiEffect) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.revolvingcreditacquisition.utils.ComposeUtilsKt.CollectOnLifecycle(uiEffect2, null, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0, 6);
                com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState acquisitionLandingState2 = (com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState) collectAsStateWithLifecycle2.getValue();
                changedInstance = startRestartGroup.changedInstance(acquisitionLandingViewModel3);
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt$AcquisitionLandingScreen$3$1(acquisitionLandingViewModel3);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                AcquisitionLandingScreenContent(acquisitionLandingState2, null, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2), startRestartGroup, 0, 2);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                acquisitionLandingViewModel2 = acquisitionLandingViewModel3;
            }
            z = false;
            i5 = i7;
            acquisitionLandingViewModel3 = acquisitionLandingViewModel2;
            i4 = i5;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            int i822 = i4;
            androidx.compose.runtime.State collectAsStateWithLifecycle22 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(acquisitionLandingViewModel3.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            kotlinx.coroutines.flow.Flow<com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingUiEffect> uiEffect22 = acquisitionLandingViewModel3.getUiEffect();
            if ((i822 & 14) == 4) {
            }
            if ((i822 & 112) == 32) {
            }
            if ((i822 & 896) != 256) {
            }
            rememberedValue = startRestartGroup.rememberedValue();
            if (!(z3 | z2 | z4)) {
            }
            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt.$r8$lambda$XSxtzS82TL_alDocFiU14_eH_tM(kotlin.jvm.functions.Function0.this, function02, function03, (com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingUiEffect) obj);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue);
            com.paypal.oslo.feature.revolvingcreditacquisition.utils.ComposeUtilsKt.CollectOnLifecycle(uiEffect22, null, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0, 6);
            com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState acquisitionLandingState22 = (com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState) collectAsStateWithLifecycle22.getValue();
            changedInstance = startRestartGroup.changedInstance(acquisitionLandingViewModel3);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue2 = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt$AcquisitionLandingScreen$3$1(acquisitionLandingViewModel3);
            startRestartGroup.updateRememberedValue(rememberedValue2);
            AcquisitionLandingScreenContent(acquisitionLandingState22, null, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue2), startRestartGroup, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            acquisitionLandingViewModel2 = acquisitionLandingViewModel3;
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingViewModel acquisitionLandingViewModel4 = acquisitionLandingViewModel2;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt.$r8$lambda$R8GHlvVwpBdXUlfDwRnBLkn7GrM(kotlin.jvm.functions.Function0.this, function02, function03, acquisitionLandingNavigationArgs, acquisitionLandingViewModel4, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void AcquisitionLandingScreenContent(final com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState acquisitionLandingState, androidx.compose.ui.Modifier modifier, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acquisitionLandingState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1782221876);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(acquisitionLandingState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (i5 != 0) {
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt.$r8$lambda$6_xPgLXGUF15iLv97ag2bXMM6W8((com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1782221876, i3, -1, "com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenContent (AcquisitionLandingScreen.kt:76)");
            }
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getCenter(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 54);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            if (acquisitionLandingState instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState.Initial) {
                startRestartGroup.startReplaceGroup(762524266);
                com.paypal.pds.components.LoaderKt.Loader(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenTestTag.LOADER_TEST_TAG), null, null, null, startRestartGroup, 6, 14);
                startRestartGroup.endReplaceGroup();
            } else {
                if (!(acquisitionLandingState instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState.Unavailable)) {
                    startRestartGroup.startReplaceGroup(762522389);
                    startRestartGroup.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                startRestartGroup.startReplaceGroup(762527773);
                boolean z = (i3 & 896) == 256;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt.m17993$r8$lambda$VIiFokXqSM9HQpY_OT6hMXm_Pk(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.error.AcquisitionUnavailableScreenKt.AcquisitionUnavailableScreen((kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            }
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        final androidx.compose.ui.Modifier modifier2 = modifier;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent, kotlin.Unit> function12 = function1;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt.m17994$r8$lambda$fc7OG1YndjlPC4sYwkExxWXGBY(com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState.this, modifier2, function12, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6_xPgLXGUF15iLv97ag2bXMM6W8(com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent acquisitionLandingEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acquisitionLandingEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$CKTePVPPXrzq5hD204di9m_-_YU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17990$r8$lambda$CKTePVPPXrzq5hD204di9m__YU(com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent acquisitionLandingEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acquisitionLandingEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ItPutOYiE-R5buM_NgPWgAiAEe0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17991$r8$lambda$ItPutOYiER5buM_NgPWgAiAEe0(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(123263976);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(123263976, updateChangedFlags, -1, "com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenLoadingPreview (AcquisitionLandingScreen.kt:98)");
            }
            com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState.Initial initial = new com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState.Initial(com.paypal.oslo.feature.revolvingcreditacquisition.api.model.CreditProductIdentifier.CREDIT_CARD_PAYPAL_CONSUMER_REWARDS_US, "https://www.paypal.com/credit-application/co/landing");
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt.m17990$r8$lambda$CKTePVPPXrzq5hD204di9m__YU((com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            AcquisitionLandingScreenContent(initial, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 384, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.AcquisitionLandingScreenKt.m17991$r8$lambda$ItPutOYiER5buM_NgPWgAiAEe0(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$R8GHlvVwpBdXUlfDwRnBLkn7GrM(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionLandingNavigationArgs acquisitionLandingNavigationArgs, com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingViewModel acquisitionLandingViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AcquisitionLandingScreen(function0, function02, function03, acquisitionLandingNavigationArgs, acquisitionLandingViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$RqI-Hn_mbVc8gj6vHNwQS7Ilt0k, reason: not valid java name */
    public static /* synthetic */ com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingViewModel m17992$r8$lambda$RqIHn_mbVc8gj6vHNwQS7Ilt0k(com.paypal.oslo.feature.revolvingcreditacquisition.di.navigation.arguments.AcquisitionLandingNavigationArgs acquisitionLandingNavigationArgs, com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(acquisitionLandingNavigationArgs);
    }

    /* renamed from: $r8$lambda$VIiFokXqSM9HQpY_OT6hMXm_-Pk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17993$r8$lambda$VIiFokXqSM9HQpY_OT6hMXm_Pk(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingEvent.OnDismissUnavailableScreen.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$XSxtzS82TL_alDocFiU14_eH_tM(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingUiEffect acquisitionLandingUiEffect) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acquisitionLandingUiEffect, "");
        if (acquisitionLandingUiEffect instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingUiEffect.NavigateToNativeFlow) {
            function0.invoke();
        } else if (acquisitionLandingUiEffect instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingUiEffect.NavigateToWebView) {
            function02.invoke();
        } else {
            if (!(acquisitionLandingUiEffect instanceof com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingUiEffect.DismissScreen)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            function03.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$fc7OG1YndjlPC4sYwkEx-xWXGBY, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m17994$r8$lambda$fc7OG1YndjlPC4sYwkExxWXGBY(com.paypal.oslo.feature.revolvingcreditacquisition.ui.landing.viewmodel.AcquisitionLandingState acquisitionLandingState, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AcquisitionLandingScreenContent(acquisitionLandingState, modifier, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
