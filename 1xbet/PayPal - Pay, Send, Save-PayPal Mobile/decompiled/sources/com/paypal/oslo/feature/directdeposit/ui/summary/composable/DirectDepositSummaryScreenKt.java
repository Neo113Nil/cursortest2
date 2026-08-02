package com.paypal.oslo.feature.directdeposit.ui.summary.composable;

@kotlin.Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001aÐ\u0001\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072M\b\u0002\u0010\f\u001aG\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00010\r2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u008e\u0002"}, d2 = {"DirectDepositSummaryScreen", "", "viewModel", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/viewmodel/DirectDepositSummaryViewModel;", "atomicTransactManager", "Lcom/paypal/oslo/feature/directdeposit/manager/AtomicTransactManager;", "onBackClick", "Lkotlin/Function0;", "onCopyAccountClick", "onCopyRoutingClick", "onEasySetupClick", "onSetupPayPalSmartRoute", "onNavigateToDepositForm", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "routingNumber", com.paypal.oslo.feature.wallet.banks.ui.addbankmanual.entry.BankFieldStateManagerKt.FieldNameAccountNumber, "bankName", "onNavigateToIntro", "(Lcom/paypal/oslo/feature/directdeposit/ui/summary/viewmodel/DirectDepositSummaryViewModel;Lcom/paypal/oslo/feature/directdeposit/manager/AtomicTransactManager;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "directdeposit_prodRelease", "uiState", "Lcom/paypal/oslo/feature/directdeposit/ui/summary/viewmodel/DirectDepositUiState;", "showDepositSwitchSuccess", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DirectDepositSummaryScreenKt {
    /* JADX WARN: Removed duplicated region for block: B:117:0x1219  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x1254  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x12d5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x1347  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x13d2  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x145d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x14e8  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x1572  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x159a  */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:202:0x1560  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x14d5  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x144a  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x13bf  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x1334  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x125f  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x1249  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x1583  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:467:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:474:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DirectDepositSummaryScreen(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, com.paypal.oslo.feature.directdeposit.manager.AtomicTransactManager atomicTransactManager, kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, kotlin.jvm.functions.Function0<kotlin.Unit> function04, kotlin.jvm.functions.Function0<kotlin.Unit> function05, kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function3, kotlin.jvm.functions.Function0<kotlin.Unit> function06, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel2;
        int i3;
        com.paypal.oslo.feature.directdeposit.manager.AtomicTransactManager atomicTransactManager2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        kotlin.jvm.functions.Function0<kotlin.Unit> function08;
        kotlin.jvm.functions.Function0<kotlin.Unit> function09;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function010;
        int i5;
        int i6;
        int i7;
        int i8;
        kotlin.jvm.functions.Function0<kotlin.Unit> function011;
        int i9;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function012;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function013;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function014;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function015;
        final kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function32;
        kotlin.jvm.functions.Function0<kotlin.Unit> function016;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function017;
        final com.paypal.oslo.feature.directdeposit.manager.AtomicTransactManager atomicTransactManager3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        int i10;
        kotlin.jvm.functions.Function0<kotlin.Unit> function018;
        kotlin.jvm.functions.Function0<kotlin.Unit> function019;
        kotlin.jvm.functions.Function0<kotlin.Unit> function020;
        kotlin.jvm.functions.Function0<kotlin.Unit> function021;
        kotlin.jvm.functions.Function0<kotlin.Unit> function022;
        kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function33;
        kotlin.jvm.functions.Function0<kotlin.Unit> function023;
        int i11;
        kotlin.jvm.functions.Function0<kotlin.Unit> function024;
        kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function34;
        final com.paypal.oslo.feature.directdeposit.manager.AtomicTransactManager atomicTransactManager4;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i12;
        int i13;
        kotlin.jvm.functions.Function0<kotlin.Unit> function025;
        kotlin.jvm.functions.Function3<? super java.lang.String, ? super java.lang.String, ? super java.lang.String, kotlin.Unit> function35;
        kotlin.jvm.functions.Function0<kotlin.Unit> function026;
        kotlin.jvm.functions.Function0<kotlin.Unit> function027;
        androidx.compose.runtime.MutableState mutableState;
        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function028;
        java.lang.String toastMessage;
        com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType directDepositErrorType;
        com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType directDepositErrorType2;
        com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType directDepositErrorType3;
        com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType directDepositErrorType4;
        final androidx.compose.runtime.MutableState mutableState2;
        com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType directDepositErrorType5;
        int i14;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1844482543);
        if ((i & 6) == 0) {
            if ((i2 & 1) == 0) {
                directDepositSummaryViewModel2 = directDepositSummaryViewModel;
                if (startRestartGroup.changedInstance(directDepositSummaryViewModel2)) {
                    i14 = 4;
                    i3 = i14 | i;
                }
            } else {
                directDepositSummaryViewModel2 = directDepositSummaryViewModel;
            }
            i14 = 2;
            i3 = i14 | i;
        } else {
            directDepositSummaryViewModel2 = directDepositSummaryViewModel;
            i3 = i;
        }
        if ((i & 48) == 0) {
            atomicTransactManager2 = atomicTransactManager;
            i3 |= ((i2 & 2) == 0 && startRestartGroup.changedInstance(atomicTransactManager2)) ? 32 : 16;
        } else {
            atomicTransactManager2 = atomicTransactManager;
        }
        int i15 = i2 & 4;
        if (i15 != 0) {
            i3 |= 384;
            function07 = function0;
        } else {
            function07 = function0;
            if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function07) ? 256 : 128;
            }
        }
        int i16 = i2 & 8;
        if (i16 != 0) {
            i3 |= 3072;
            function08 = function02;
        } else {
            function08 = function02;
            if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function08) ? 2048 : 1024;
            }
        }
        int i17 = i2 & 16;
        if (i17 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            function09 = function03;
            i3 |= startRestartGroup.changedInstance(function09) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function010 = function04;
            } else {
                function010 = function04;
                if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    i3 |= startRestartGroup.changedInstance(function010) ? 131072 : 65536;
                }
            }
            i5 = i2 & 64;
            if (i5 == 0) {
                i3 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i3 |= startRestartGroup.changedInstance(function05) ? 1048576 : 524288;
            }
            i6 = i2 & 128;
            if (i6 == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= startRestartGroup.changedInstance(function3) ? 8388608 : 4194304;
            }
            i7 = i2 & 256;
            if (i7 == 0) {
                i9 = i3 | 100663296;
                i8 = i7;
                function011 = function06;
            } else {
                if ((i & 100663296) == 0) {
                    i8 = i7;
                    function011 = function06;
                    i3 |= startRestartGroup.changedInstance(function011) ? 67108864 : 33554432;
                } else {
                    i8 = i7;
                    function011 = function06;
                }
                i9 = i3;
            }
            if (!startRestartGroup.shouldExecute((i9 & 38347923) == 38347922, i9 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    if ((i2 & 1) != 0) {
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
                        i10 = i8;
                        directDepositSummaryViewModel2 = (com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        i9 &= -15;
                    } else {
                        i10 = i8;
                    }
                    if ((i2 & 2) != 0) {
                        atomicTransactManager2 = new com.paypal.oslo.feature.directdeposit.manager.AtomicTransactManager();
                        i9 &= -113;
                    }
                    if (i15 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda11
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function018 = (kotlin.jvm.functions.Function0) rememberedValue;
                    } else {
                        function018 = function0;
                    }
                    if (i16 != 0) {
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        function019 = (kotlin.jvm.functions.Function0) rememberedValue2;
                    } else {
                        function019 = function02;
                    }
                    if (i17 != 0) {
                        java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                        if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda15
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        function020 = (kotlin.jvm.functions.Function0) rememberedValue3;
                    } else {
                        function020 = function03;
                    }
                    if (i4 != 0) {
                        java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda21
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        function021 = (kotlin.jvm.functions.Function0) rememberedValue4;
                    } else {
                        function021 = function010;
                    }
                    if (i5 != 0) {
                        java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda23
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        function022 = (kotlin.jvm.functions.Function0) rememberedValue5;
                    } else {
                        function022 = function05;
                    }
                    if (i6 != 0) {
                        java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                        if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda24
                                @Override // kotlin.jvm.functions.Function3
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                                    return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.$r8$lambda$KINJ77tbKaIqhmJMEi1bMHGOvsk((java.lang.String) obj, (java.lang.String) obj2, (java.lang.String) obj3);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue6);
                        }
                        function33 = (kotlin.jvm.functions.Function3) rememberedValue6;
                    } else {
                        function33 = function3;
                    }
                    if (i10 != 0) {
                        java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                        if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda25
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue7);
                        }
                        function023 = (kotlin.jvm.functions.Function0) rememberedValue7;
                    } else {
                        function023 = function06;
                    }
                    function011 = function023;
                    i11 = i9;
                    function07 = function018;
                    function024 = function021;
                    function08 = function019;
                    function34 = function33;
                    atomicTransactManager4 = atomicTransactManager2;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 1) != 0) {
                        i9 &= -15;
                    }
                    if ((i2 & 2) != 0) {
                        i9 &= -113;
                    }
                    function022 = function05;
                    function020 = function09;
                    function024 = function010;
                    atomicTransactManager4 = atomicTransactManager2;
                    i11 = i9;
                    function34 = function3;
                }
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1844482543, i11, -1, "com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreen (DirectDepositSummaryScreen.kt:121)");
                    i13 = 1;
                    i12 = 0;
                } else {
                    i12 = 0;
                    i13 = 1;
                }
                androidx.compose.foundation.ScrollState rememberScrollState = androidx.compose.foundation.ScrollKt.rememberScrollState(i12, startRestartGroup, i12, i13);
                final androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(directDepositSummaryViewModel2.getState(), null, startRestartGroup, i12, i13);
                final android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                final androidx.compose.ui.platform.Clipboard clipboard = (androidx.compose.ui.platform.Clipboard) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalClipboard());
                java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                if (rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    function025 = function024;
                    rememberedValue8 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue8);
                } else {
                    function025 = function024;
                }
                androidx.compose.runtime.MutableState mutableState3 = (androidx.compose.runtime.MutableState) rememberedValue8;
                final androidx.view.LifecycleOwner lifecycleOwner = (androidx.view.LifecycleOwner) startRestartGroup.consume(androidx.view.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                boolean changedInstance = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                boolean changedInstance2 = startRestartGroup.changedInstance(lifecycleOwner);
                final kotlin.jvm.functions.Function0<kotlin.Unit> function029 = function020;
                java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                if ((changedInstance | changedInstance2) || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda26
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.$r8$lambda$E3Hef7trexcaMiCGILuKOmr8fSM(androidx.view.LifecycleOwner.this, directDepositSummaryViewModel2, (androidx.compose.runtime.DisposableEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue9);
                }
                androidx.compose.runtime.EffectsKt.DisposableEffect(lifecycleOwner, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue9, startRestartGroup, 0);
                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                boolean changedInstance3 = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                if (changedInstance3 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$DirectDepositSummaryScreen$9$1(directDepositSummaryViewModel2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue10, startRestartGroup, 6);
                kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                boolean changedInstance4 = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                boolean changedInstance5 = startRestartGroup.changedInstance(context);
                boolean changedInstance6 = startRestartGroup.changedInstance(atomicTransactManager4);
                final kotlin.jvm.functions.Function0<kotlin.Unit> function030 = function08;
                boolean z = (i11 & 3670016) == 1048576;
                boolean z2 = (29360128 & i11) == 8388608;
                java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
                if ((z | changedInstance4 | changedInstance5 | changedInstance6 | z2) || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue11 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$DirectDepositSummaryScreen$10$1(directDepositSummaryViewModel2, context, atomicTransactManager4, function022, function34, mutableState3, null);
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue11, startRestartGroup, 6);
                kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                boolean changedInstance7 = startRestartGroup.changedInstance(context);
                boolean changedInstance8 = startRestartGroup.changedInstance(atomicTransactManager4);
                java.lang.Object rememberedValue12 = startRestartGroup.rememberedValue();
                if ((changedInstance7 | changedInstance8) || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda27
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.m14757$r8$lambda$CozlgEy49iXIZGpZnkF2wm8rQ(context, atomicTransactManager4, (androidx.compose.runtime.DisposableEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue12);
                }
                androidx.compose.runtime.EffectsKt.DisposableEffect(unit3, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue12, startRestartGroup, 6);
                androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                com.paypal.oslo.feature.directdeposit.manager.AtomicTransactManager atomicTransactManager5 = atomicTransactManager4;
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
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                if (getHighResolutionOutputSizeshNQ4ISI(collectAsState).getShowErrorScreen()) {
                    startRestartGroup.startReplaceGroup(-1246565740);
                    int i18 = com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.WhenMappings.$EnumSwitchMapping$0[getHighResolutionOutputSizeshNQ4ISI(collectAsState).getErrorType().ordinal()];
                    if (i18 == 1) {
                        directDepositErrorType5 = com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType.NO_NETWORK;
                    } else if (i18 != 2) {
                        if (i18 == 3) {
                            directDepositErrorType5 = com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType.RETRY;
                        } else if (i18 == 4) {
                            directDepositErrorType5 = com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType.FEATURE_UNAVAILABLE;
                        } else {
                            directDepositErrorType5 = com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType.RETRY;
                        }
                    } else if (getHighResolutionOutputSizeshNQ4ISI(collectAsState).getRetryCount() >= 3) {
                        directDepositErrorType5 = com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType.FATAL;
                    } else {
                        directDepositErrorType5 = com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType.RETRY;
                    }
                    boolean changed = startRestartGroup.changed(collectAsState);
                    boolean changedInstance9 = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                    int i19 = i11 & 896;
                    boolean z3 = i19 == 256;
                    java.lang.Object rememberedValue13 = startRestartGroup.rememberedValue();
                    if ((changed | changedInstance9 | z3) || rememberedValue13 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue13 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda28
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.$r8$lambda$4gog9IxBLdKn6buRprUxgnlmB7M(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.this, function07, collectAsState);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue13);
                    }
                    kotlin.jvm.functions.Function0 function031 = (kotlin.jvm.functions.Function0) rememberedValue13;
                    boolean changedInstance10 = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                    boolean z4 = i19 == 256;
                    java.lang.Object rememberedValue14 = startRestartGroup.rememberedValue();
                    if ((changedInstance10 | z4) || rememberedValue14 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue14 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda22
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.m14756$r8$lambda$AR14YbFg5zpA8lDl0Q266edtQg(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.this, function07);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue14);
                    }
                    com.paypal.oslo.feature.directdeposit.ui.error.composable.DirectDepositErrorScreenKt.DirectDepositErrorScreen(directDepositErrorType5, function031, (kotlin.jvm.functions.Function0) rememberedValue14, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), false, startRestartGroup, 3072, 16);
                    startRestartGroup.endReplaceGroup();
                } else if (getHighResolutionOutputSizeshNQ4ISI(collectAsState).getShowIntroScreen()) {
                    startRestartGroup.startReplaceGroup(-1244460747);
                    kotlin.Unit unit4 = kotlin.Unit.INSTANCE;
                    boolean z5 = (234881024 & i11) == 67108864;
                    java.lang.Object rememberedValue15 = startRestartGroup.rememberedValue();
                    if (z5 || rememberedValue15 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue15 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$DirectDepositSummaryScreen$12$1$3$1(function011, null);
                        startRestartGroup.updateRememberedValue(rememberedValue15);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit4, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue15, startRestartGroup, 6);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-1243577619);
                    androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 54, 2), androidx.compose.foundation.layout.WindowInsets_androidKt.getSystemBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6)), rememberScrollState, false, null, false, 14, null), "directDepositScreen");
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    function35 = function34;
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
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    com.paypal.oslo.core.commonui.components.TopBarKt.TopBar("", androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositScreenTopBar"), null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1294141598, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda29
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.$r8$lambda$_DZyFcCnBg1umLJLFoDuciFLsL0(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), null, startRestartGroup, 196662, 92);
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_heading, startRestartGroup, 0);
                    final java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_heading_emphasized, startRestartGroup, 0);
                    final java.lang.String substringBefore$default = kotlin.text.StringsKt.substringBefore$default(stringResource, stringResource2, (java.lang.String) null, 2, (java.lang.Object) null);
                    com.paypal.pds.core.RichText.Companion companion = com.paypal.pds.core.RichText.INSTANCE;
                    boolean changed2 = startRestartGroup.changed(substringBefore$default);
                    boolean changed3 = startRestartGroup.changed(stringResource2);
                    java.lang.Object rememberedValue16 = startRestartGroup.rememberedValue();
                    if ((changed2 | changed3) || rememberedValue16 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue16 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda30
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.m14758$r8$lambda$LOEJi5AsMJ29WmP9tq4tOeyMhU(substringBefore$default, stringResource2, (com.paypal.pds.core.Builder) obj);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue16);
                    }
                    com.paypal.pds.core.RichText invoke = companion.invoke((kotlin.jvm.functions.Function1) rememberedValue16);
                    function026 = function022;
                    function027 = function07;
                    com.paypal.pds.core.Typography.HeadingMedium headingMedium = com.paypal.pds.core.Typography.HeadingMedium.INSTANCE;
                    int i20 = i11;
                    com.paypal.pds.components.LabelKt.m21916LabeljZ06gk0(invoke, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1709paddingqDBjuR0(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSize0(), com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSize0()), "directDepositScreenHeaderText"), null, null, null, null, false, 0, 0, null, null, headingMedium, null, startRestartGroup, 0, 48, 6140);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 0);
                    function016 = function011;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_account_routing_heading, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), "directDepositScreenAccountSectionTitle"), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    final java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_account_number_label, startRestartGroup, 0);
                    final java.lang.String stringResource4 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_account_routing_label, startRestartGroup, 0);
                    java.lang.String accountNumber = getHighResolutionOutputSizeshNQ4ISI(collectAsState).getAccountNumber();
                    java.lang.String routingNumber = getHighResolutionOutputSizeshNQ4ISI(collectAsState).getRoutingNumber();
                    boolean isAccountNumberVisible = getHighResolutionOutputSizeshNQ4ISI(collectAsState).isAccountNumberVisible();
                    java.lang.String maskedAccountNumber = getHighResolutionOutputSizeshNQ4ISI(collectAsState).getMaskedAccountNumber();
                    boolean changedInstance11 = startRestartGroup.changedInstance(clipboard);
                    boolean changed4 = startRestartGroup.changed(stringResource3);
                    boolean changed5 = startRestartGroup.changed(collectAsState);
                    boolean changedInstance12 = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                    mutableState = mutableState3;
                    boolean z6 = (i20 & 7168) == 2048;
                    java.lang.Object rememberedValue17 = startRestartGroup.rememberedValue();
                    if ((z6 | changedInstance11 | changed4 | changed5 | changedInstance12) || rememberedValue17 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        final com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel3 = directDepositSummaryViewModel2;
                        rememberedValue17 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda31
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.$r8$lambda$SES3SrKh2ks70CIYi3bRBIaWJ20(androidx.compose.ui.platform.Clipboard.this, stringResource3, directDepositSummaryViewModel3, function030, collectAsState);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue17);
                    }
                    kotlin.jvm.functions.Function0 function032 = (kotlin.jvm.functions.Function0) rememberedValue17;
                    boolean changedInstance13 = startRestartGroup.changedInstance(clipboard);
                    boolean changed6 = startRestartGroup.changed(stringResource4);
                    boolean changed7 = startRestartGroup.changed(collectAsState);
                    boolean changedInstance14 = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                    boxScopeInstance = boxScopeInstance2;
                    boolean z7 = (i20 & 57344) == 16384;
                    java.lang.Object rememberedValue18 = startRestartGroup.rememberedValue();
                    if ((z7 | changedInstance13 | changed6 | changed7 | changedInstance14) || rememberedValue18 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        final com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel4 = directDepositSummaryViewModel2;
                        rememberedValue18 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda32
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.m14762$r8$lambda$pswSajxTu5Kh7Dp2qBrdO5bIWA(androidx.compose.ui.platform.Clipboard.this, stringResource4, directDepositSummaryViewModel4, function029, collectAsState);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue18);
                    }
                    kotlin.jvm.functions.Function0 function033 = (kotlin.jvm.functions.Function0) rememberedValue18;
                    boolean changedInstance15 = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                    java.lang.Object rememberedValue19 = startRestartGroup.rememberedValue();
                    if (changedInstance15 || rememberedValue19 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue19 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda33
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.m14751$r8$lambda$T6ixG2uBmAWkCD4J5PQlq3z70(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue19);
                    }
                    com.paypal.oslo.feature.directdeposit.ui.summary.composable.AccountInfoSectionCardKt.AccountInfoSectionCard(accountNumber, routingNumber, isAccountNumberVisible, maskedAccountNumber, function032, function033, (kotlin.jvm.functions.Function0) rememberedValue19, androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), getHighResolutionOutputSizeshNQ4ISI(collectAsState).isLoading(), startRestartGroup, 0, 0);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing32()), startRestartGroup, 0);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_otherways_heading, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing20(), 0.0f, 2, null), "directDepositScreenSetupOptionsTitle"), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                    androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.background(com.paypal.pds.core.ModifierExtensionsKt.m22099borderDzVHIIc(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24())), androidx.compose.ui.unit.Dp.m8601constructorimpl(1.0f), com.paypal.pds.core.Color.BorderBase.INSTANCE, androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24()), startRestartGroup, 432, 0), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundBase.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), com.paypal.pds.core.ConstantsKt.getSpacing16()), "directDepositScreenEasyOnlineSetupCard");
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag2);
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
                    androidx.compose.ui.Alignment.Vertical top = androidx.compose.ui.Alignment.INSTANCE.getTop();
                    androidx.compose.ui.Modifier.Companion companion2 = androidx.compose.ui.Modifier.INSTANCE;
                    androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), top, startRestartGroup, 48);
                    int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion2);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor4);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                    androidx.compose.ui.Modifier m1706padding3ABfNKs = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundRoleBaseInfo.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), com.paypal.pds.core.ConstantsKt.getSpacing8());
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode5 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap5 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier5 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor5 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor5);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl5 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, currentCompositionLocalMap5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl5, java.lang.Integer.valueOf(hashCode5), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl5, materializeModifier5, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance3 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.Bill.INSTANCE, null, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositScreenEasyOnlineSetupIcon"), null, com.paypal.pds.core.Color.ContentBrandPrimary.INSTANCE, startRestartGroup, 25014, 8);
                    startRestartGroup.endNode();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                    androidx.compose.ui.Modifier weight$default = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                    androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy3 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                    int hashCode6 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap6 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier6 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor6 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor6);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl6 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, columnMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, currentCompositionLocalMap6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl6, java.lang.Integer.valueOf(hashCode6), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl6, materializeModifier6, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance3 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_otherways_depositswitch_title, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositScreenEasyOnlineSetupTitle"), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 432, 6, 1016);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), startRestartGroup, 0);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_otherways_depositswitch_caption, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositScreenEasyOnlineSetupSubtitle"), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 432, 6, 1016);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
                    com.paypal.pds.components.BadgeKt.Badge(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_otherways_depositswitch_badge, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositScreenEasyOnlineSetupFastestLabel"), com.paypal.pds.components.BadgeStyle.Info.INSTANCE, com.paypal.pds.components.BadgeEmphasis.High, com.paypal.pds.components.BadgeSize.Small.INSTANCE, com.paypal.pds.core.Icon.NoIcon.INSTANCE, null, startRestartGroup, 224688, 64);
                    startRestartGroup.endNode();
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                    com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
                    com.paypal.pds.core.Icon.ChevronRight chevronRight = com.paypal.pds.core.Icon.ChevronRight.INSTANCE;
                    androidx.compose.ui.Modifier testTag3 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositScreenEasyOnlineSetupButton");
                    com.paypal.pds.core.Icon.ChevronRight chevronRight2 = chevronRight;
                    boolean changedInstance16 = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                    boolean z8 = (458752 & i20) == 131072;
                    java.lang.Object rememberedValue20 = startRestartGroup.rememberedValue();
                    if ((changedInstance16 || z8) || rememberedValue20 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        function028 = function025;
                        rememberedValue20 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda34
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.$r8$lambda$m9vJa101TFzk7noGxBb4oaiBgC4(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.this, function028);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue20);
                    } else {
                        function028 = function025;
                    }
                    com.paypal.pds.components.IconButtonKt.IconButton(chevronRight2, (kotlin.jvm.functions.Function0) rememberedValue20, testTag3, tertiary, null, null, null, false, false, startRestartGroup, 3462, 496);
                    startRestartGroup.endNode();
                    if (getHighResolutionOutputSizeshNQ4ISI(collectAsState).isFillOutFormEnabled()) {
                        startRestartGroup.startReplaceGroup(-1467353700);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                        androidx.compose.ui.Alignment.Vertical top2 = androidx.compose.ui.Alignment.INSTANCE.getTop();
                        androidx.compose.ui.Modifier.Companion companion3 = androidx.compose.ui.Modifier.INSTANCE;
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy2 = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), top2, startRestartGroup, 48);
                        int hashCode7 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap7 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier7 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion3);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor7 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor7);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl7 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, rowMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, currentCompositionLocalMap7, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl7, java.lang.Integer.valueOf(hashCode7), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl7, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl7, materializeModifier7, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance2 = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        androidx.compose.ui.Modifier m1706padding3ABfNKs2 = androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.foundation.shape.RoundedCornerShapeKt.getCircleShape()), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundRoleBaseInfo.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2), com.paypal.pds.core.ConstantsKt.getSpacing8());
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy3 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                        int hashCode8 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap8 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier8 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1706padding3ABfNKs2);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor8 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor8);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl8 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl8, maybeCachedBoxMeasurePolicy3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl8, currentCompositionLocalMap8, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl8, java.lang.Integer.valueOf(hashCode8), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl8, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl8, materializeModifier8, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance4 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                        com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.MagnifyingGlass.INSTANCE, null, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositFormScreenSetupIcon"), null, com.paypal.pds.core.Color.ContentBrandPrimary.INSTANCE, startRestartGroup, 25014, 8);
                        startRestartGroup.endNode();
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                        androidx.compose.ui.Modifier weight$default2 = androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance2, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null);
                        androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy4 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                        int hashCode9 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                        androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap9 = startRestartGroup.getCurrentCompositionLocalMap();
                        androidx.compose.ui.Modifier materializeModifier9 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, weight$default2);
                        kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor9 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                        if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                            androidx.compose.runtime.ComposablesKt.invalidApplier();
                        }
                        startRestartGroup.startReusableNode();
                        if (startRestartGroup.getInserting()) {
                            startRestartGroup.createNode(constructor9);
                        } else {
                            startRestartGroup.useNode();
                        }
                        androidx.compose.runtime.Composer m5299constructorimpl9 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl9, columnMeasurePolicy4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl9, currentCompositionLocalMap9, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl9, java.lang.Integer.valueOf(hashCode9), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl9, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl9, materializeModifier9, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance4 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_otherways_form_title, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositFormScreenSetupTitle"), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 432, 6, 1016);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing4()), startRestartGroup, 0);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_otherways_form_caption, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositFormScreenSetupSubtitle"), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodySmall.INSTANCE, startRestartGroup, 432, 6, 1016);
                        startRestartGroup.endNode();
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
                        com.paypal.pds.components.ButtonStyle.Tertiary tertiary2 = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
                        com.paypal.pds.core.Icon.ChevronRight chevronRight3 = com.paypal.pds.core.Icon.ChevronRight.INSTANCE;
                        androidx.compose.ui.Modifier testTag4 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositFormScreenSetupButton");
                        com.paypal.pds.core.Icon.ChevronRight chevronRight4 = chevronRight3;
                        boolean changedInstance17 = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                        java.lang.Object rememberedValue21 = startRestartGroup.rememberedValue();
                        if (changedInstance17 || rememberedValue21 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue21 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda35
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.m14752$r8$lambda$1VJKKth_j6hV9RQOvD9anCkU(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue21);
                        }
                        com.paypal.pds.components.IconButtonKt.IconButton(chevronRight4, (kotlin.jvm.functions.Function0) rememberedValue21, testTag4, tertiary2, null, null, null, false, false, startRestartGroup, 3462, 496);
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1464368834);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endNode();
                    int i21 = 0;
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing32()), startRestartGroup, 0);
                    if (getHighResolutionOutputSizeshNQ4ISI(collectAsState).getSmartRoutePreferences() != null) {
                        startRestartGroup.startReplaceGroup(-885074420);
                        com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_smartroute_heading, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing20(), 0.0f, 2, null), "directDepositScreenSmartRouteTitle"), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                        com.paypal.oslo.feature.directdeposit.domain.model.SmartRoutePreferences smartRoutePreferences = getHighResolutionOutputSizeshNQ4ISI(collectAsState).getSmartRoutePreferences();
                        androidx.compose.ui.Modifier testTag5 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositScreenSmartRouteCard");
                        boolean changedInstance18 = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                        java.lang.Object rememberedValue22 = startRestartGroup.rememberedValue();
                        if (changedInstance18 || rememberedValue22 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue22 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.m14761$r8$lambda$nVRqwXyS0j1VBSFBXrWnhARJcI(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue22);
                        }
                        kotlin.jvm.functions.Function0 function034 = (kotlin.jvm.functions.Function0) rememberedValue22;
                        boolean changedInstance19 = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                        java.lang.Object rememberedValue23 = startRestartGroup.rememberedValue();
                        if (changedInstance19 || rememberedValue23 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue23 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.$r8$lambda$O4iuZARoxvnbPQ_Cgdm_n5ukO4g(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue23);
                        }
                        com.paypal.oslo.feature.directdeposit.ui.summary.composable.SmartRouteCardKt.SmartRouteCard(smartRoutePreferences, function034, testTag5, (kotlin.jvm.functions.Function0) rememberedValue23, startRestartGroup, 384, 0);
                        i21 = 0;
                        androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing32()), startRestartGroup, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-883867404);
                        startRestartGroup.endReplaceGroup();
                    }
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_directdebit_heading, startRestartGroup, i21), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), "directDepositScreenDirectDebitTitle"), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                    boolean isDirectDebitEnabled = getHighResolutionOutputSizeshNQ4ISI(collectAsState).isDirectDebitEnabled();
                    boolean changedInstance20 = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                    java.lang.Object rememberedValue24 = startRestartGroup.rememberedValue();
                    if (changedInstance20 || rememberedValue24 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue24 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.$r8$lambda$oHsidVt6eym4VnAw17g3sOmGn4o(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.this, ((java.lang.Boolean) obj).booleanValue());
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue24);
                    }
                    com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDebitCardKt.DirectDebitCard(isDirectDebitEnabled, (kotlin.jvm.functions.Function1) rememberedValue24, null, startRestartGroup, 0, 4);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing32()), startRestartGroup, 0);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_faq_heading, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null), "directDepositScreenFaqTitle"), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.TitleMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                    boolean isDirectDepositInfoExpanded = getHighResolutionOutputSizeshNQ4ISI(collectAsState).isDirectDepositInfoExpanded();
                    boolean isDirectDebitInfoExpanded = getHighResolutionOutputSizeshNQ4ISI(collectAsState).isDirectDebitInfoExpanded();
                    boolean changedInstance21 = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                    java.lang.Object rememberedValue25 = startRestartGroup.rememberedValue();
                    if (changedInstance21 || rememberedValue25 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue25 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.m14764$r8$lambda$ubGRtJVL1zIHSrL1qUBTVf5VgI(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue25);
                    }
                    kotlin.jvm.functions.Function0 function035 = (kotlin.jvm.functions.Function0) rememberedValue25;
                    boolean changedInstance22 = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                    java.lang.Object rememberedValue26 = startRestartGroup.rememberedValue();
                    if (changedInstance22 || rememberedValue26 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue26 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.$r8$lambda$gNIi2yDVOilgOaL9L7tEKcXoSXk(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.this);
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue26);
                    }
                    com.paypal.oslo.feature.directdeposit.ui.summary.composable.FaqAccordionCardKt.FaqAccordionCard(isDirectDepositInfoExpanded, isDirectDebitInfoExpanded, function035, (kotlin.jvm.functions.Function0) rememberedValue26, context, null, startRestartGroup, 0, 32);
                    androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_disclaimer_earlyaccess, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing20(), com.paypal.pds.core.ConstantsKt.getSpacing8()), "directDepositScreenFooterEarlyAccess"), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
                    com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_summary_disclaimer_availability, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing20(), 0.0f, 2, null), "directDepositScreenFooterAvailability"), com.paypal.pds.core.Color.ContentMuted.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
                    startRestartGroup.endNode();
                    startRestartGroup.endReplaceGroup();
                    toastMessage = getHighResolutionOutputSizeshNQ4ISI(collectAsState).getToastMessage();
                    if (toastMessage != null) {
                        startRestartGroup.startReplaceGroup(-1226072911);
                        java.lang.Integer toastMessageResId = getHighResolutionOutputSizeshNQ4ISI(collectAsState).getToastMessageResId();
                        if (toastMessageResId == null) {
                            startRestartGroup.startReplaceGroup(-1226072912);
                            startRestartGroup.endReplaceGroup();
                            toastMessage = null;
                        } else {
                            startRestartGroup.startReplaceGroup(-1226072911);
                            toastMessage = androidx.compose.ui.res.StringResources_androidKt.stringResource(toastMessageResId.intValue(), startRestartGroup, 0);
                            startRestartGroup.endReplaceGroup();
                        }
                    } else {
                        startRestartGroup.startReplaceGroup(98995012);
                    }
                    startRestartGroup.endReplaceGroup();
                    if (toastMessage != null) {
                        startRestartGroup.startReplaceGroup(-1226004836);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1226004835);
                        androidx.compose.ui.Modifier testTag6 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null), "DirectDepositSummaryScreen_Toast");
                        boolean changedInstance23 = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                        java.lang.Object rememberedValue27 = startRestartGroup.rememberedValue();
                        if (changedInstance23 || rememberedValue27 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue27 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.m14760$r8$lambda$aqPTWiBRbj5S148yPEe9JOCDE(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.this, ((java.lang.Boolean) obj).booleanValue());
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue27);
                        }
                        com.paypal.pds.components.ToastKt.Toast(toastMessage, testTag6, null, (kotlin.jvm.functions.Function1) rememberedValue27, startRestartGroup, 0, 4);
                        kotlin.Unit unit5 = kotlin.Unit.INSTANCE;
                        startRestartGroup.endReplaceGroup();
                        kotlin.Unit unit6 = kotlin.Unit.INSTANCE;
                    }
                    if (!getHighSpeedVideoSizes(mutableState)) {
                        startRestartGroup.startReplaceGroup(-1225391221);
                        androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
                        java.lang.Object rememberedValue28 = startRestartGroup.rememberedValue();
                        if (rememberedValue28 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            mutableState2 = mutableState;
                            rememberedValue28 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.$r8$lambda$BoM9oL1QTSS6CFosgK5CdHwMXgw(androidx.compose.runtime.MutableState.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue28);
                        } else {
                            mutableState2 = mutableState;
                        }
                        kotlin.jvm.functions.Function0 function036 = (kotlin.jvm.functions.Function0) rememberedValue28;
                        boolean changedInstance24 = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                        java.lang.Object rememberedValue29 = startRestartGroup.rememberedValue();
                        if (changedInstance24 || rememberedValue29 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue29 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.$r8$lambda$s5AyUXjahiHfrB6A9EbZ7cEXRac(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.this, mutableState2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue29);
                        }
                        com.paypal.oslo.feature.directdeposit.ui.summary.composable.DepositSwitchSuccessHalfSheetKt.DepositSwitchSuccessHalfSheet(fillMaxSize$default2, function036, (kotlin.jvm.functions.Function0) rememberedValue29, startRestartGroup, 54, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1225022197);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (!getHighResolutionOutputSizeshNQ4ISI(collectAsState).getShowDirectDebitErrorHalfSheet()) {
                        startRestartGroup.startReplaceGroup(-1224873955);
                        if (getHighResolutionOutputSizeshNQ4ISI(collectAsState).getDirectDebitErrorRetryCount() >= 3) {
                            directDepositErrorType4 = com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType.FATAL;
                        } else {
                            directDepositErrorType4 = com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType.RETRY;
                        }
                        boolean changed8 = startRestartGroup.changed(collectAsState);
                        boolean changedInstance25 = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                        java.lang.Object rememberedValue30 = startRestartGroup.rememberedValue();
                        if ((changed8 | changedInstance25) || rememberedValue30 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue30 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.m14755$r8$lambda$A76QJNwsmqpbvUw1I_lUJVLN6Y(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.this, collectAsState);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue30);
                        }
                        kotlin.jvm.functions.Function0 function037 = (kotlin.jvm.functions.Function0) rememberedValue30;
                        boolean changedInstance26 = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                        java.lang.Object rememberedValue31 = startRestartGroup.rememberedValue();
                        if (changedInstance26 || rememberedValue31 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue31 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda12
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.$r8$lambda$7HUKDuccmCv5kBQcZB7F5KLzx5Y(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue31);
                        }
                        com.paypal.oslo.feature.directdeposit.ui.error.composable.DirectDepositErrorHalfSheetKt.DirectDepositErrorHalfSheet(directDepositErrorType4, function037, (kotlin.jvm.functions.Function0) rememberedValue31, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 3072, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1223999445);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (!getHighResolutionOutputSizeshNQ4ISI(collectAsState).getShowAtomicSetupErrorHalfSheet()) {
                        startRestartGroup.startReplaceGroup(-1223851389);
                        if (getHighResolutionOutputSizeshNQ4ISI(collectAsState).getAtomicSetupErrorRetryCount() >= 3) {
                            directDepositErrorType3 = com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType.FATAL;
                        } else {
                            directDepositErrorType3 = com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType.RETRY;
                        }
                        boolean changed9 = startRestartGroup.changed(collectAsState);
                        boolean changedInstance27 = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                        java.lang.Object rememberedValue32 = startRestartGroup.rememberedValue();
                        if ((changed9 | changedInstance27) || rememberedValue32 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue32 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda13
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.$r8$lambda$B3U9YfyxrNVK5Q6XkykYJtZwE8E(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.this, collectAsState);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue32);
                        }
                        kotlin.jvm.functions.Function0 function038 = (kotlin.jvm.functions.Function0) rememberedValue32;
                        boolean changedInstance28 = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                        java.lang.Object rememberedValue33 = startRestartGroup.rememberedValue();
                        if (changedInstance28 || rememberedValue33 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue33 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda14
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.$r8$lambda$PYimGn4z9o0PIf_WYVxHy47MO6w(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue33);
                        }
                        com.paypal.oslo.feature.directdeposit.ui.error.composable.DirectDepositErrorHalfSheetKt.DirectDepositErrorHalfSheet(directDepositErrorType3, function038, (kotlin.jvm.functions.Function0) rememberedValue33, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 3072, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1222982645);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (!getHighResolutionOutputSizeshNQ4ISI(collectAsState).getShowLinkAccountErrorHalfSheet()) {
                        startRestartGroup.startReplaceGroup(-1222834589);
                        if (getHighResolutionOutputSizeshNQ4ISI(collectAsState).getLinkAccountErrorRetryCount() >= 3) {
                            directDepositErrorType2 = com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType.FATAL;
                        } else {
                            directDepositErrorType2 = com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType.RETRY;
                        }
                        boolean changed10 = startRestartGroup.changed(collectAsState);
                        boolean changedInstance29 = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                        java.lang.Object rememberedValue34 = startRestartGroup.rememberedValue();
                        if ((changed10 | changedInstance29) || rememberedValue34 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue34 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda16
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.$r8$lambda$cJBf7PHDIeEl4qrmQPKNeQj9jCE(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.this, collectAsState);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue34);
                        }
                        kotlin.jvm.functions.Function0 function039 = (kotlin.jvm.functions.Function0) rememberedValue34;
                        boolean changedInstance30 = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                        java.lang.Object rememberedValue35 = startRestartGroup.rememberedValue();
                        if (changedInstance30 || rememberedValue35 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue35 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda17
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.$r8$lambda$p091MIRap9pqc6sfRE7mtj224jQ(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue35);
                        }
                        com.paypal.oslo.feature.directdeposit.ui.error.composable.DirectDepositErrorHalfSheetKt.DirectDepositErrorHalfSheet(directDepositErrorType2, function039, (kotlin.jvm.functions.Function0) rememberedValue35, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 3072, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1221965845);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (!getHighResolutionOutputSizeshNQ4ISI(collectAsState).getShowSmartRoutePreferencesErrorHalfSheet()) {
                        startRestartGroup.startReplaceGroup(-1221796399);
                        if (getHighResolutionOutputSizeshNQ4ISI(collectAsState).getSmartRoutePreferencesErrorRetryCount() >= 3) {
                            directDepositErrorType = com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType.FATAL;
                        } else {
                            directDepositErrorType = com.paypal.oslo.feature.directdeposit.ui.error.model.DirectDepositErrorType.RETRY;
                        }
                        boolean changed11 = startRestartGroup.changed(collectAsState);
                        boolean changedInstance31 = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                        java.lang.Object rememberedValue36 = startRestartGroup.rememberedValue();
                        if ((changed11 | changedInstance31) || rememberedValue36 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue36 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda18
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.m14754$r8$lambda$6YYqSi5omRBRfYql3zj7Q6Zi7M(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.this, collectAsState);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue36);
                        }
                        kotlin.jvm.functions.Function0 function040 = (kotlin.jvm.functions.Function0) rememberedValue36;
                        boolean changedInstance32 = startRestartGroup.changedInstance(directDepositSummaryViewModel2);
                        java.lang.Object rememberedValue37 = startRestartGroup.rememberedValue();
                        if (changedInstance32 || rememberedValue37 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue37 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda19
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.$r8$lambda$DqK_2sGyHZI6fQGKr8rZhQeRlZU(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.this);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue37);
                        }
                        com.paypal.oslo.feature.directdeposit.ui.error.composable.DirectDepositErrorHalfSheetKt.DirectDepositErrorHalfSheet(directDepositErrorType, function040, (kotlin.jvm.functions.Function0) rememberedValue37, androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 3072, 0);
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1220879605);
                        startRestartGroup.endReplaceGroup();
                    }
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function017 = function028;
                    function014 = function029;
                    function013 = function030;
                    atomicTransactManager3 = atomicTransactManager5;
                    function32 = function35;
                    function015 = function026;
                    function012 = function027;
                }
                boxScopeInstance = boxScopeInstance2;
                function35 = function34;
                function026 = function022;
                function027 = function07;
                function016 = function011;
                mutableState = mutableState3;
                function028 = function025;
                toastMessage = getHighResolutionOutputSizeshNQ4ISI(collectAsState).getToastMessage();
                if (toastMessage != null) {
                }
                startRestartGroup.endReplaceGroup();
                if (toastMessage != null) {
                }
                if (!getHighSpeedVideoSizes(mutableState)) {
                }
                if (!getHighResolutionOutputSizeshNQ4ISI(collectAsState).getShowDirectDebitErrorHalfSheet()) {
                }
                if (!getHighResolutionOutputSizeshNQ4ISI(collectAsState).getShowAtomicSetupErrorHalfSheet()) {
                }
                if (!getHighResolutionOutputSizeshNQ4ISI(collectAsState).getShowLinkAccountErrorHalfSheet()) {
                }
                if (!getHighResolutionOutputSizeshNQ4ISI(collectAsState).getShowSmartRoutePreferencesErrorHalfSheet()) {
                }
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                function017 = function028;
                function014 = function029;
                function013 = function030;
                atomicTransactManager3 = atomicTransactManager5;
                function32 = function35;
                function015 = function026;
                function012 = function027;
            } else {
                startRestartGroup.skipToGroupEnd();
                function012 = function0;
                function013 = function02;
                function014 = function03;
                function015 = function05;
                function32 = function3;
                function016 = function06;
                function017 = function010;
                atomicTransactManager3 = atomicTransactManager2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final kotlin.jvm.functions.Function0<kotlin.Unit> function041 = function016;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.$r8$lambda$fo8aTMsYvZStVwAsn_39px_Z3Qc(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.this, atomicTransactManager3, function012, function013, function014, function017, function015, function32, function041, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function09 = function03;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        if (!startRestartGroup.shouldExecute((i9 & 38347923) == 38347922, i9 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final boolean getHighSpeedVideoSizes(androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.State<com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState> state) {
        return state.getValue();
    }

    /* renamed from: $r8$lambda$-T6ixG2uBmAWkCD4J5-PQlq3z70, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14751$r8$lambda$T6ixG2uBmAWkCD4J5PQlq3z70(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel) {
        directDepositSummaryViewModel.toggleAccountNumberVisibility();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$1VJKKth_j6-hV-9RQOv-D9anCkU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14752$r8$lambda$1VJKKth_j6hV9RQOvD9anCkU(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel) {
        directDepositSummaryViewModel.onFillFormClick();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$4gog9IxBLdKn6buRprUxgnlmB7M(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.State state) {
        if (com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.WhenMappings.$EnumSwitchMapping$0[((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) state.getValue()).getErrorType().ordinal()] == 4) {
            directDepositSummaryViewModel.dismissErrorScreen();
            function0.invoke();
        } else if (((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) state.getValue()).getRetryCount() < 3) {
            directDepositSummaryViewModel.retryLoading();
        } else {
            directDepositSummaryViewModel.dismissErrorScreen();
            function0.invoke();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$6YYqSi5omRBRfYql3-zj7Q6Zi7M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14754$r8$lambda$6YYqSi5omRBRfYql3zj7Q6Zi7M(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, androidx.compose.runtime.State state) {
        if (((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) state.getValue()).getSmartRoutePreferencesErrorRetryCount() < 3) {
            directDepositSummaryViewModel.retrySmartRoutePreferences();
        } else {
            directDepositSummaryViewModel.dismissSmartRoutePreferencesErrorHalfSheet();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7HUKDuccmCv5kBQcZB7F5KLzx5Y(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel) {
        directDepositSummaryViewModel.dismissDirectDebitErrorHalfSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$AR14-YbFg5zpA8lDl0Q266edtQg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14756$r8$lambda$AR14YbFg5zpA8lDl0Q266edtQg(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, kotlin.jvm.functions.Function0 function0) {
        directDepositSummaryViewModel.dismissErrorScreen();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$A76QJNwsmq-pbvUw1I_lUJVLN6Y, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14755$r8$lambda$A76QJNwsmqpbvUw1I_lUJVLN6Y(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, androidx.compose.runtime.State state) {
        if (((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) state.getValue()).getDirectDebitErrorRetryCount() < 3) {
            directDepositSummaryViewModel.retryDirectDebitUpdate();
        } else {
            directDepositSummaryViewModel.dismissDirectDebitErrorHalfSheet();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$B3U9YfyxrNVK5Q6XkykYJtZwE8E(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, androidx.compose.runtime.State state) {
        if (((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) state.getValue()).getAtomicSetupErrorRetryCount() < 3) {
            directDepositSummaryViewModel.retryAtomicSetup();
        } else {
            directDepositSummaryViewModel.dismissAtomicSetupErrorHalfSheet();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$BoM9oL1QTSS6CFosgK5CdHwMXgw(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$CozlgEy49iXIZGp-Zn-kF2wm8rQ, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult m14757$r8$lambda$CozlgEy49iXIZGpZnkF2wm8rQ(final android.content.Context context, final com.paypal.oslo.feature.directdeposit.manager.AtomicTransactManager atomicTransactManager, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$DirectDepositSummaryScreen$lambda$14$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                android.content.Context context2 = context;
                if (context2 instanceof android.app.Activity) {
                    atomicTransactManager.unRegisterAtomicTransactReceiver(context2);
                }
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DqK_2sGyHZI6fQGKr8rZhQeRlZU(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel) {
        directDepositSummaryViewModel.dismissSmartRoutePreferencesErrorHalfSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$E3Hef7trexcaMiCGILuKOmr8fSM(final androidx.view.LifecycleOwner lifecycleOwner, final com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        final androidx.view.LifecycleEventObserver lifecycleEventObserver = new androidx.view.LifecycleEventObserver() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$$ExternalSyntheticLambda0
            @Override // androidx.view.LifecycleEventObserver
            public final void onStateChanged(androidx.view.LifecycleOwner lifecycleOwner2, androidx.lifecycle.Lifecycle.Event event) {
                com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt.m14763$r8$lambda$tzFID7O3Qtz_X9R4EDiAkOMfdw(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel.this, lifecycleOwner2, event);
            }
        };
        lifecycleOwner.getLifecycle().addObserver(lifecycleEventObserver);
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreenKt$DirectDepositSummaryScreen$lambda$11$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                androidx.view.LifecycleOwner.this.getLifecycle().removeObserver(lifecycleEventObserver);
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KINJ77tbKaIqhmJMEi1bMHGOvsk(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$LOEJi5A-sMJ29WmP9tq4tOeyMhU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14758$r8$lambda$LOEJi5AsMJ29WmP9tq4tOeyMhU(java.lang.String str, java.lang.String str2, com.paypal.pds.core.Builder builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "");
        com.paypal.pds.core.Builder.append$default(builder, str, com.paypal.pds.core.Color.ContentBase.INSTANCE, false, 4, null);
        com.paypal.pds.core.Builder.append$default(builder, str2, com.paypal.pds.core.Color.ContentRoleBaseInfo.INSTANCE, false, 4, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$O4iuZARoxvnbPQ_Cgdm_n5ukO4g(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel) {
        directDepositSummaryViewModel.onSmartRouteSetupClick();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$PYimGn4z9o0PIf_WYVxHy47MO6w(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel) {
        directDepositSummaryViewModel.dismissAtomicSetupErrorHalfSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SES3SrKh2ks70CIYi3bRBIaWJ20(androidx.compose.ui.platform.Clipboard clipboard, java.lang.String str, com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.State state) {
        clipboard.getCamera2StreamConfigurationMap().setPrimaryClip(android.content.ClipData.newPlainText(str, ((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) state.getValue()).getAccountNumber()));
        directDepositSummaryViewModel.copyAccountNumber();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_DZyFcCnBg1umLJLFoDuciFLsL0(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1294141598, i, -1, "com.paypal.oslo.feature.directdeposit.ui.summary.composable.DirectDepositSummaryScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DirectDepositSummaryScreen.kt:303)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "directDepositScreenBackButton");
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, testTag);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarBackButton(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.directdeposit.R.string.feature_directdeposit_back_button_voiceover, composer, 0), composer, 0, 0);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$aqP-TWiBRbj5S148yPEe9-JOCDE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14760$r8$lambda$aqPTWiBRbj5S148yPEe9JOCDE(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, boolean z) {
        if (!z) {
            directDepositSummaryViewModel.clearToastMessage();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fo8aTMsYvZStVwAsn_39px_Z3Qc(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, com.paypal.oslo.feature.directdeposit.manager.AtomicTransactManager atomicTransactManager, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, kotlin.jvm.functions.Function0 function04, kotlin.jvm.functions.Function0 function05, kotlin.jvm.functions.Function3 function3, kotlin.jvm.functions.Function0 function06, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DirectDepositSummaryScreen(directDepositSummaryViewModel, atomicTransactManager, function0, function02, function03, function04, function05, function3, function06, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cJBf7PHDIeEl4qrmQPKNeQj9jCE(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, androidx.compose.runtime.State state) {
        if (((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) state.getValue()).getLinkAccountErrorRetryCount() < 3) {
            directDepositSummaryViewModel.retryLinkAccount();
        } else {
            directDepositSummaryViewModel.dismissLinkAccountErrorHalfSheet();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gNIi2yDVOilgOaL9L7tEKcXoSXk(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel) {
        directDepositSummaryViewModel.toggleDirectDebitInfoExpanded();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m9vJa101TFzk7noGxBb4oaiBgC4(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, kotlin.jvm.functions.Function0 function0) {
        directDepositSummaryViewModel.onEasySetupClick();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$nVRqwXyS-0j1VBSFBXrWnhARJcI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14761$r8$lambda$nVRqwXyS0j1VBSFBXrWnhARJcI(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel) {
        directDepositSummaryViewModel.onSmartRouteSetupClick();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oHsidVt6eym4VnAw17g3sOmGn4o(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, boolean z) {
        directDepositSummaryViewModel.onDirectDebitToggle(z);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$p091MIRap9pqc6sfRE7mtj224jQ(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel) {
        directDepositSummaryViewModel.dismissLinkAccountErrorHalfSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pswSaj-xTu5Kh7Dp2qBrdO5bIWA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14762$r8$lambda$pswSajxTu5Kh7Dp2qBrdO5bIWA(androidx.compose.ui.platform.Clipboard clipboard, java.lang.String str, com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.State state) {
        clipboard.getCamera2StreamConfigurationMap().setPrimaryClip(android.content.ClipData.newPlainText(str, ((com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositUiState) state.getValue()).getRoutingNumber()));
        directDepositSummaryViewModel.copyRoutingNumber();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$s5AyUXjahiHfrB6A9EbZ7cEXRac(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, androidx.compose.runtime.MutableState mutableState) {
        directDepositSummaryViewModel.onEmployerSetupDonePressed();
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$tzFID7O3Qtz_-X9R4EDiAkOMfdw, reason: not valid java name */
    public static /* synthetic */ void m14763$r8$lambda$tzFID7O3Qtz_X9R4EDiAkOMfdw(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel, androidx.view.LifecycleOwner lifecycleOwner, androidx.lifecycle.Lifecycle.Event event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lifecycleOwner, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "");
        if (event == androidx.lifecycle.Lifecycle.Event.ON_RESUME) {
            directDepositSummaryViewModel.refreshSmartRoutePreferences();
        }
    }

    /* renamed from: $r8$lambda$u-bGRtJVL1zIHSrL1qUBTVf5VgI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14764$r8$lambda$ubGRtJVL1zIHSrL1qUBTVf5VgI(com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.DirectDepositSummaryViewModel directDepositSummaryViewModel) {
        directDepositSummaryViewModel.toggleDirectDepositInfoExpanded();
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType.values().length];
            try {
                iArr[com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType.NETWORK.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType.SERVER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType.AUTHENTICATION.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.directdeposit.ui.summary.viewmodel.ErrorType.FEATURE_UNAVAILABLE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
