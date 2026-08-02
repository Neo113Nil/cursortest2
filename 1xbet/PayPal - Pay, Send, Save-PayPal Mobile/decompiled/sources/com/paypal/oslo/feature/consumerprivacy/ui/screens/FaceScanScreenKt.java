package com.paypal.oslo.feature.consumerprivacy.ui.screens;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001a}\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\r2\u001e\b\u0002\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u00112\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0001¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0018¨\u0006\u0019²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, d2 = {"FaceScanScreen", "", "appNavigator", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "modifier", "Landroidx/compose/ui/Modifier;", "viewModel", "Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/ManageFaceScanViewModel;", "(Lcom/paypal/oslo/core/navigation/AppNavigator;Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/consumerprivacy/ui/viewmodel/ManageFaceScanViewModel;Landroidx/compose/runtime/Composer;II)V", "FaceScanScreenContent", "uiState", "Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ManageFaceScanUiState;", "onBackClick", "Lkotlin/Function0;", "onClearBanner", "onDeleteClick", "onDeleteConfirm", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "onDeleteSuccessAcknowledge", "(Lcom/paypal/oslo/feature/consumerprivacy/ui/state/ManageFaceScanUiState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "FaceScanScreenPreview", "(Landroidx/compose/runtime/Composer;I)V", "consumer-privacy_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FaceScanScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FaceScanScreen(final com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel manageFaceScanViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel manageFaceScanViewModel2;
        androidx.compose.ui.Modifier modifier3;
        final com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel manageFaceScanViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel manageFaceScanViewModel4;
        int i4;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1068749504);
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
                    manageFaceScanViewModel2 = manageFaceScanViewModel;
                    if (startRestartGroup.changedInstance(manageFaceScanViewModel2)) {
                        i5 = 256;
                        i3 |= i5;
                    }
                } else {
                    manageFaceScanViewModel2 = manageFaceScanViewModel;
                }
                i5 = 128;
                i3 |= i5;
            } else {
                manageFaceScanViewModel2 = manageFaceScanViewModel;
            }
            if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                manageFaceScanViewModel3 = manageFaceScanViewModel2;
            } else {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) != 0) {
                        androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                        }
                        manageFaceScanViewModel4 = (com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel.class), current, (java.lang.String) null, androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0), current instanceof androidx.view.HasDefaultViewModelProviderFactory ? ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, startRestartGroup, 0, 0);
                        i3 &= -897;
                    } else {
                        manageFaceScanViewModel4 = manageFaceScanViewModel2;
                    }
                    com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel manageFaceScanViewModel5 = manageFaceScanViewModel4;
                    i4 = i3;
                    manageFaceScanViewModel3 = manageFaceScanViewModel5;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                    manageFaceScanViewModel3 = manageFaceScanViewModel2;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1068749504, i4, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreen (FaceScanScreen.kt:40)");
                }
                com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState manageFaceScanUiState = (com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState) androidx.compose.runtime.SnapshotStateKt.collectAsState(manageFaceScanViewModel3.getUiState(), null, startRestartGroup, 0, 1).getValue();
                boolean changedInstance = startRestartGroup.changedInstance(manageFaceScanViewModel3);
                com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt$FaceScanScreen$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt$FaceScanScreen$1$1(manageFaceScanViewModel3);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.reflect.KFunction kFunction = (kotlin.reflect.KFunction) rememberedValue;
                boolean changedInstance2 = startRestartGroup.changedInstance(manageFaceScanViewModel3);
                com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt$FaceScanScreen$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt$FaceScanScreen$2$1(manageFaceScanViewModel3);
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.reflect.KFunction kFunction2 = (kotlin.reflect.KFunction) rememberedValue2;
                boolean z = (i4 & 14) == 4;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt.m13622$r8$lambda$hDqXt4CifI373fspM55W9TPy9Q(com.paypal.oslo.core.navigation.AppNavigator.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue3;
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) kFunction;
                boolean changedInstance3 = startRestartGroup.changedInstance(manageFaceScanViewModel3);
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt.m13619$r8$lambda$3sLFlCNOCenmK3sr6k7QAVcaSE(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) rememberedValue4;
                boolean changedInstance4 = startRestartGroup.changedInstance(manageFaceScanViewModel3);
                com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt$FaceScanScreen$5$1 rememberedValue5 = startRestartGroup.rememberedValue();
                if (changedInstance4 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt$FaceScanScreen$5$1(manageFaceScanViewModel3, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                FaceScanScreenContent(manageFaceScanUiState, function0, modifier3, function02, function03, (kotlin.jvm.functions.Function1) rememberedValue5, (kotlin.jvm.functions.Function0) kFunction2, startRestartGroup, (i4 << 3) & 896, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier4 = modifier3;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt.$r8$lambda$Q9SKXfZRFKg0rUDQm9N3CnUonT8(com.paypal.oslo.core.navigation.AppNavigator.this, modifier4, manageFaceScanViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 147) == 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FaceScanScreenContent(final com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState manageFaceScanUiState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function04, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function12;
        int i6;
        kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function08;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function09;
        final kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function13;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function010;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.ui.Modifier.Companion companion;
        int i7;
        kotlin.jvm.functions.Function0<kotlin.Unit> function011;
        kotlin.jvm.functions.Function0<kotlin.Unit> function012;
        kotlin.jvm.functions.Function0<kotlin.Unit> function013;
        kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super java.lang.Boolean>, ? extends java.lang.Object> function14;
        int i8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(manageFaceScanUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(24288914);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(manageFaceScanUiState) : startRestartGroup.changedInstance(manageFaceScanUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function05 = function02;
                i3 |= startRestartGroup.changedInstance(function05) ? 2048 : 1024;
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    function06 = function03;
                    i3 |= startRestartGroup.changedInstance(function06) ? 16384 : 8192;
                    if ((196608 & i) != 0) {
                        if ((i2 & 32) == 0) {
                            function12 = function1;
                            if (startRestartGroup.changedInstance(function12)) {
                                i8 = 131072;
                                i3 |= i8;
                            }
                        } else {
                            function12 = function1;
                        }
                        i8 = 65536;
                        i3 |= i8;
                    } else {
                        function12 = function1;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((1572864 & i) == 0) {
                        function07 = function04;
                        i3 |= startRestartGroup.changedInstance(function07) ? 1048576 : 524288;
                        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                            startRestartGroup.startDefaults();
                            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                                startRestartGroup.skipToGroupEnd();
                                if ((i2 & 32) != 0) {
                                    i3 &= -458753;
                                }
                                companion = modifier;
                            } else {
                                companion = i9 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier;
                                if (i4 != 0) {
                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                kotlin.Unit unit;
                                                unit = kotlin.Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    function05 = (kotlin.jvm.functions.Function0) rememberedValue;
                                }
                                if (i5 != 0) {
                                    java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                kotlin.Unit unit;
                                                unit = kotlin.Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue2);
                                    }
                                    function06 = (kotlin.jvm.functions.Function0) rememberedValue2;
                                }
                                if ((i2 & 32) != 0) {
                                    com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt$FaceScanScreenContent$3$1 rememberedValue3 = startRestartGroup.rememberedValue();
                                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue3 = new com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt$FaceScanScreenContent$3$1(null);
                                        startRestartGroup.updateRememberedValue(rememberedValue3);
                                    }
                                    i3 &= -458753;
                                    function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
                                }
                                if (i6 != 0) {
                                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                                    if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                kotlin.Unit unit;
                                                unit = kotlin.Unit.INSTANCE;
                                                return unit;
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue4);
                                    }
                                    i7 = i3;
                                    function011 = (kotlin.jvm.functions.Function0) rememberedValue4;
                                    function012 = function05;
                                    function013 = function06;
                                    function14 = function12;
                                    startRestartGroup.endDefaults();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(24288914, i7, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenContent (FaceScanScreen.kt:63)");
                                    }
                                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), "manage_face_scan_screen");
                                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
                                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                                    }
                                    startRestartGroup.startReusableNode();
                                    if (!startRestartGroup.getInserting()) {
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
                                    com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarKt.PrivacyToolbar(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_security_and_privacy_navigation_title, startRestartGroup, 0), function0, "face_scan_top_bar", "face_scan_back_button", com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarNavigationType.BACK, startRestartGroup, (i7 & 112) | 28032, 0);
                                    if (!kotlin.jvm.internal.Intrinsics.areEqual(manageFaceScanUiState, com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Loading.INSTANCE)) {
                                        startRestartGroup.startReplaceGroup(336236757);
                                        int i10 = i7 << 6;
                                        int i11 = (234881024 & i10) | (i10 & 29360128) | (3670016 & i10) | (458752 & i10) | 28080;
                                        composer2 = startRestartGroup;
                                        com.paypal.oslo.feature.consumerprivacy.ui.compose.ManageFaceScanComposeKt.ManageFaceScanCompose(null, false, true, false, null, function012, function013, function14, function011, composer2, i11, 1);
                                        composer2.endReplaceGroup();
                                    } else {
                                        composer2 = startRestartGroup;
                                        if (manageFaceScanUiState instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Content) {
                                            composer2.startReplaceGroup(336748009);
                                            com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Content content = (com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Content) manageFaceScanUiState;
                                            boolean isFaceScanEnabled = content.isFaceScanEnabled();
                                            boolean isDeleting = content.isDeleting();
                                            com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState banner = content.getBanner();
                                            int i12 = i7 << 6;
                                            com.paypal.oslo.feature.consumerprivacy.ui.compose.ManageFaceScanComposeKt.ManageFaceScanCompose(null, isFaceScanEnabled, false, isDeleting, banner, function012, function013, function14, function011, composer2, (234881024 & i12) | (29360128 & i12) | (3670016 & i12) | (458752 & i12) | 384, 1);
                                            composer2.endReplaceGroup();
                                        } else {
                                            if (!(manageFaceScanUiState instanceof com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Error)) {
                                                composer2.startReplaceGroup(-2067364446);
                                                composer2.endReplaceGroup();
                                                throw new kotlin.NoWhenBranchMatchedException();
                                            }
                                            composer2.startReplaceGroup(337299158);
                                            com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Error error = (com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Error) manageFaceScanUiState;
                                            boolean isFaceScanEnabled2 = error.isFaceScanEnabled();
                                            com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyBannerState.Error banner2 = error.getBanner();
                                            int i13 = i7 << 6;
                                            com.paypal.oslo.feature.consumerprivacy.ui.compose.ManageFaceScanComposeKt.ManageFaceScanCompose(null, isFaceScanEnabled2, false, false, banner2, function012, function013, function14, function011, composer2, (29360128 & i13) | (3670016 & i13) | (458752 & i13) | 3456 | (i13 & 234881024), 1);
                                            composer2.endReplaceGroup();
                                        }
                                    }
                                    composer2.endNode();
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    modifier2 = companion;
                                    function08 = function012;
                                    function09 = function013;
                                    function13 = function14;
                                    function010 = function011;
                                }
                            }
                            i7 = i3;
                            function012 = function05;
                            function013 = function06;
                            function14 = function12;
                            function011 = function07;
                            startRestartGroup.endDefaults();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), "manage_face_scan_screen");
                            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag2);
                            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            }
                            startRestartGroup.startReusableNode();
                            if (!startRestartGroup.getInserting()) {
                            }
                            androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                            com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarKt.PrivacyToolbar(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.consumerprivacy.R.string.feature_consumer_privacy_security_and_privacy_navigation_title, startRestartGroup, 0), function0, "face_scan_top_bar", "face_scan_back_button", com.paypal.oslo.feature.consumerprivacy.ui.components.PrivacyToolbarNavigationType.BACK, startRestartGroup, (i7 & 112) | 28032, 0);
                            if (!kotlin.jvm.internal.Intrinsics.areEqual(manageFaceScanUiState, com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Loading.INSTANCE)) {
                            }
                            composer2.endNode();
                            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = companion;
                            function08 = function012;
                            function09 = function013;
                            function13 = function14;
                            function010 = function011;
                        } else {
                            composer2 = startRestartGroup;
                            composer2.skipToGroupEnd();
                            modifier2 = modifier;
                            function08 = function05;
                            function09 = function06;
                            function13 = function12;
                            function010 = function07;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt.$r8$lambda$Ksrgs7taQrIhCzm6GXTgKfcmHCI(com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.this, function0, modifier2, function08, function09, function13, function010, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    function07 = function04;
                    if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function06 = function03;
                if ((196608 & i) != 0) {
                }
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                function07 = function04;
                if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            function05 = function02;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            function06 = function03;
            if ((196608 & i) != 0) {
            }
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            function07 = function04;
            if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function05 = function02;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        function06 = function03;
        if ((196608 & i) != 0) {
        }
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        function07 = function04;
        if (startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$3-sLFlCNOCenmK3sr6k7QAVcaSE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13619$r8$lambda$3sLFlCNOCenmK3sr6k7QAVcaSE(com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel manageFaceScanViewModel) {
        manageFaceScanViewModel.onDeleteClick$consumer_privacy_prodRelease();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Ksrgs7taQrIhCzm6GXTgKfcmHCI(com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState manageFaceScanUiState, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function04, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FaceScanScreenContent(manageFaceScanUiState, function0, modifier, function02, function03, function1, function04, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Q9SKXfZRFKg0rUDQm9N3CnUonT8(com.paypal.oslo.core.navigation.AppNavigator appNavigator, androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.consumerprivacy.ui.viewmodel.ManageFaceScanViewModel manageFaceScanViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        FaceScanScreen(appNavigator, modifier, manageFaceScanViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$UPviHJfUcOTZoR-Va9_dkW6L1e4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13621$r8$lambda$UPviHJfUcOTZoRVa9_dkW6L1e4(com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.goBack();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hDqXt4Ci-fI373fspM55W9TPy9Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m13622$r8$lambda$hDqXt4CifI373fspM55W9TPy9Q(com.paypal.oslo.core.navigation.AppNavigator appNavigator) {
        appNavigator.navigate(new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt.m13621$r8$lambda$UPviHJfUcOTZoRVa9_dkW6L1e4((com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$s7GcatHxEk5qmwz3UhvMcgyvxzw(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1361401054);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1361401054, updateChangedFlags, -1, "com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenPreview (FaceScanScreen.kt:123)");
            }
            com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Content content = new com.paypal.oslo.feature.consumerprivacy.ui.state.ManageFaceScanUiState.Content(true, null, false, 6, null);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            FaceScanScreenContent(content, (kotlin.jvm.functions.Function0) rememberedValue, null, null, null, null, null, startRestartGroup, 48, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.consumerprivacy.ui.screens.FaceScanScreenKt.$r8$lambda$s7GcatHxEk5qmwz3UhvMcgyvxzw(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }
}
