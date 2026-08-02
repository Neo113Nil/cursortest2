package com.paypal.oslo.feature.wallet.cards.ui.confirm;

@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001aM\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\f\u001a\r\u0010\r\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0001X\u008a\u008e\u0002"}, d2 = {"TestTagConfirmCardCvvInput", "", "ConfirmCardModal", "", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "onSubmit", "Lkotlin/Function0;", "onCancel", "onDismiss", "viewModelImpl", "Lcom/paypal/oslo/feature/wallet/cards/ui/confirm/ConfirmCardViewModel;", "(Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/wallet/cards/ui/confirm/ConfirmCardViewModel;Landroidx/compose/runtime/Composer;II)V", "ConfirmCardModalPreview", "(Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease", "uiState", "Lcom/paypal/oslo/feature/wallet/cards/ui/confirm/ConfirmCardModalState;", com.microblink.blinkid.entities.recognizers.blinkcard.BlinkCardRecognizer.VerificationConstants.Cvv}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ConfirmCardModalKt {
    public static final java.lang.String TestTagConfirmCardCvvInput = "confirm_card_cvv_input";

    /* JADX WARN: Removed duplicated region for block: B:112:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ConfirmCardModal(final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardViewModel confirmCardViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardViewModel confirmCardViewModel2;
        androidx.compose.runtime.Composer composer2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        kotlin.jvm.functions.Function0<kotlin.Unit> function08;
        int i5;
        kotlin.jvm.functions.Function0<kotlin.Unit> function09;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        boolean z;
        boolean z2;
        int i6;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-265185073);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            function04 = function02;
            i3 |= startRestartGroup.changedInstance(function04) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function05 = function03;
                i3 |= startRestartGroup.changedInstance(function05) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        confirmCardViewModel2 = confirmCardViewModel;
                        if (startRestartGroup.changedInstance(confirmCardViewModel2)) {
                            i6 = 16384;
                            i3 |= i6;
                        }
                    } else {
                        confirmCardViewModel2 = confirmCardViewModel;
                    }
                    i6 = 8192;
                    i3 |= i6;
                } else {
                    confirmCardViewModel2 = confirmCardViewModel;
                }
                if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                        if (i7 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue);
                            }
                            function07 = (kotlin.jvm.functions.Function0) rememberedValue;
                        } else {
                            function07 = function04;
                        }
                        if (i4 != 0) {
                            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalKt$$ExternalSyntheticLambda5
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        kotlin.Unit unit;
                                        unit = kotlin.Unit.INSTANCE;
                                        return unit;
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue2);
                            }
                            function08 = (kotlin.jvm.functions.Function0) rememberedValue2;
                        } else {
                            function08 = function05;
                        }
                        if ((i2 & 16) != 0) {
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
                            com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardViewModel confirmCardViewModel3 = (com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardViewModelImpl.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                            i5 = i3 & (-57345);
                            function09 = function07;
                            function05 = function08;
                            confirmCardViewModel2 = confirmCardViewModel3;
                        } else {
                            i5 = i3;
                            function09 = function07;
                            function05 = function08;
                        }
                    } else {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 16) != 0) {
                            i3 &= -57345;
                        }
                        i5 = i3;
                        function09 = function04;
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-265185073, i5, -1, "com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModal (ConfirmCardModal.kt:79)");
                    }
                    androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(confirmCardViewModel2.getUiState(), null, startRestartGroup, 0, 1);
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default("", null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue3;
                    boolean z3 = ((com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalState) collectAsState.getValue()) instanceof com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalState.Loading;
                    com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalState confirmCardModalState = (com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalState) collectAsState.getValue();
                    com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalState.Error error = confirmCardModalState instanceof com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalState.Error ? (com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalState.Error) confirmCardModalState : null;
                    java.lang.Integer valueOf = error != null ? java.lang.Integer.valueOf(error.getErrorMessage()) : null;
                    com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalState confirmCardModalState2 = (com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalState) collectAsState.getValue();
                    boolean changed = startRestartGroup.changed(collectAsState);
                    boolean z4 = (i5 & 112) == 32;
                    int i8 = i5 & 14;
                    if (i8 == 4 || ((i5 & 8) != 0 && startRestartGroup.changedInstance(bottomSheetController))) {
                        z = z3;
                        z2 = true;
                    } else {
                        z = z3;
                        z2 = false;
                    }
                    com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalKt$ConfirmCardModal$3$1 rememberedValue4 = startRestartGroup.rememberedValue();
                    if ((z2 | z4 | changed) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalKt$ConfirmCardModal$3$1(function0, bottomSheetController, collectAsState, null);
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(confirmCardModalState2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 0);
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new androidx.compose.ui.focus.FocusRequester();
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    final androidx.compose.ui.focus.FocusRequester focusRequester = (androidx.compose.ui.focus.FocusRequester) rememberedValue5;
                    final java.lang.Integer num = valueOf;
                    final com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardViewModel confirmCardViewModel4 = confirmCardViewModel2;
                    final boolean z5 = z;
                    final kotlin.jvm.functions.Function0<kotlin.Unit> function010 = function09;
                    composer2 = startRestartGroup;
                    com.paypal.oslo.feature.wallet.cards.ui.components.AutoFocusModalKt.AutoFocusModal(bottomSheetController, new com.paypal.pds.components.TopNavConfig(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_enter_card_security_code, startRestartGroup, 0), false, null, 6, null), function05, focusRequester, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1172881061, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalKt.$r8$lambda$rUJsMKcvtLtQMDmb92NE1y_HEiU(num, focusRequester, confirmCardViewModel4, bottomSheetController, function010, z5, mutableState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 199680 | i8 | (com.paypal.pds.components.TopNavConfig.$stable << 3) | ((i5 >> 3) & 896), 16);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function06 = function09;
                } else {
                    composer2 = startRestartGroup;
                    composer2.skipToGroupEnd();
                    function06 = function04;
                }
                final kotlin.jvm.functions.Function0<kotlin.Unit> function011 = function05;
                final com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardViewModel confirmCardViewModel5 = confirmCardViewModel2;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalKt.$r8$lambda$pN0EklDtaz6sgi8TpJwk5Vocolk(com.paypal.pds.components.BottomSheetController.this, function0, function06, function011, confirmCardViewModel5, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function05 = function03;
            if ((i & 24576) == 0) {
            }
            if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            }
            final kotlin.jvm.functions.Function0 function0112 = function05;
            final com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardViewModel confirmCardViewModel52 = confirmCardViewModel2;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function04 = function02;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function05 = function03;
        if ((i & 24576) == 0) {
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
        }
        final kotlin.jvm.functions.Function0 function01122 = function05;
        final com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardViewModel confirmCardViewModel522 = confirmCardViewModel2;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LKn2QgIc0GFqTb0tPYOC8sZ4dnA(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(com.paypal.oslo.feature.wallet.cards.domain.add.StringKtKt.cvvDigits$default(str, 0, 1, null));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Webd_gsDOX70F-NnkcxvpPLbxqc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21115$r8$lambda$Webd_gsDOX70FNnkcxvpPLbxqc(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0) {
        bottomSheetController.hideSheet();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$gIH5TM4q1R0reGQpgplsilT6maY(com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardViewModel confirmCardViewModel, androidx.compose.runtime.MutableState mutableState) {
        confirmCardViewModel.onSubmit((java.lang.String) mutableState.getValue());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pN0EklDtaz6sgi8TpJwk5Vocolk(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardViewModel confirmCardViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ConfirmCardModal(bottomSheetController, function0, function02, function03, confirmCardViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$q3NWHO4RQ-3DhuiLkOUFXj6Jpgg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21116$r8$lambda$q3NWHO4RQ3DhuiLkOUFXj6Jpgg(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(837615569);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(837615569, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalPreview (ConfirmCardModal.kt:155)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ConfirmCardModal(bottomSheetController, function0, function02, (kotlin.jvm.functions.Function0) rememberedValue4, null, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 3504, 16);
            bottomSheetController.showSheet();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalKt.m21116$r8$lambda$q3NWHO4RQ3DhuiLkOUFXj6Jpgg(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$rUJsMKcvtLtQMDmb92NE1y_HEiU(java.lang.Integer num, androidx.compose.ui.focus.FocusRequester focusRequester, final com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardViewModel confirmCardViewModel, final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0 function0, boolean z, final androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1172881061, i, -1, "com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModal.<anonymous> (ConfirmCardModal.kt:101)");
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), composer, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, m1708paddingVpY3zN4$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.foundation.ImageKt.Image(androidx.compose.ui.res.PainterResources_androidKt.painterResource(com.paypal.oslo.feature.wallet.R.drawable.feature_wallet_cvv_illustration, composer, 0), (java.lang.String) null, (androidx.compose.ui.Modifier) null, (androidx.compose.ui.Alignment) null, (androidx.compose.ui.layout.ContentScale) null, 0.0f, (androidx.compose.ui.graphics.ColorFilter) null, composer, androidx.compose.ui.graphics.painter.Painter.$stable | 48, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer, 0);
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_reenter_security_code_description, composer, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, androidx.compose.ui.text.style.TextAlign.m8436boximpl(androidx.compose.ui.text.style.TextAlign.INSTANCE.m8443getCentere0LSkKk()), null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyLarge.INSTANCE, composer, 48, 6, 1004);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            java.lang.String str = (java.lang.String) mutableState.getValue();
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_cvv, composer, 0);
            androidx.compose.foundation.text.KeyboardOptions keyboardOptions = new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8268getNumberPjHm6EE(), 0, (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            java.util.List<com.paypal.pds.components.textinput.ValidationAlert> singleValidationAlert = com.paypal.oslo.feature.wallet.cards.ui.components.SingleValidationAlertKt.singleValidationAlert(num, composer, 0);
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), focusRequester), TestTagConfirmCardCvvInput);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalKt.$r8$lambda$LKn2QgIc0GFqTb0tPYOC8sZ4dnA(androidx.compose.runtime.MutableState.this, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.TextInputKt.TextInput(str, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue, testTag, stringResource, (java.lang.String) null, (java.lang.String) null, false, false, keyboardOptions, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) singleValidationAlert, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, composer, 100663344, 0, 114416);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_confirm, composer, 0);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_cancel, composer, 0);
            boolean changedInstance = composer.changedInstance(confirmCardViewModel);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalKt.$r8$lambda$gIH5TM4q1R0reGQpgplsilT6maY(com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardViewModel.this, mutableState);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue2;
            boolean changedInstance2 = composer.changedInstance(bottomSheetController);
            boolean changed = composer.changed(function0);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if ((changedInstance2 | changed) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalKt.m21115$r8$lambda$Webd_gsDOX70FNnkcxvpPLbxqc(com.paypal.pds.components.BottomSheetController.this, function0);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.oslo.feature.wallet.cards.ui.components.DualActionButtonsKt.DualActionButtons(stringResource2, stringResource3, function02, (kotlin.jvm.functions.Function0) rememberedValue3, z, null, composer, 0, 32);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalState access$ConfirmCardModal$lambda$2(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.wallet.cards.ui.confirm.ConfirmCardModalState) state.getValue();
    }
}
