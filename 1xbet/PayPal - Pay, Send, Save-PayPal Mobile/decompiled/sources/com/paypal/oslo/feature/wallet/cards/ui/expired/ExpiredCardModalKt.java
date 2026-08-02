package com.paypal.oslo.feature.wallet.cards.ui.expired;

@kotlin.Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aW\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012H\u0001¢\u0006\u0002\u0010\u0013\u001a\u0017\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0003¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u001a\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u0084\u0002²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\u001fX\u008a\u008e\u0002"}, d2 = {"TestTagExpiredCardExpiryDateInput", "", "TestTagExpiredCardCVVInput", "TestTagExpiredCardExpiryDateShimmer", "TestTagExpiredCardCVVShimmer", "TestTagExpiredCardButtonsShimmer", "TestTagExpiredCardCVVQuestionIcon", "ExpiredCardModal", "", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "onSubmit", "Lkotlin/Function0;", "cardBrand", "Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;", "onCancel", "onDismiss", "viewModelImpl", "Lcom/paypal/oslo/feature/wallet/cards/ui/expired/ExpiredCardViewModel;", "(Lcom/paypal/pds/components/BottomSheetController;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/wallet/cards/domain/add/model/CardBrand;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/wallet/cards/ui/expired/ExpiredCardViewModel;Landroidx/compose/runtime/Composer;II)V", "getExpiryDateValidationAlertData", "Lcom/paypal/pds/components/textinput/ValidationAlert;", "expiryDateError", "", "(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Lcom/paypal/pds/components/textinput/ValidationAlert;", "ExpiredCardModalPreview", "(Landroidx/compose/runtime/Composer;I)V", "wallet_prodRelease", "uiState", "Lcom/paypal/oslo/feature/wallet/cards/ui/expired/ExpiredCardViewModel$UiState;", "isExpiryDateFocused", "", "isCvvFocused", "isCvvCoachTipVisible"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ExpiredCardModalKt {
    public static final java.lang.String TestTagExpiredCardButtonsShimmer = "expired_card_buttons_shimmer";
    public static final java.lang.String TestTagExpiredCardCVVInput = "expired_card_cvv_input";
    public static final java.lang.String TestTagExpiredCardCVVQuestionIcon = "expired_card_cvv_question_icon";
    public static final java.lang.String TestTagExpiredCardCVVShimmer = "expired_card_cvv_shimmer";
    public static final java.lang.String TestTagExpiredCardExpiryDateInput = "expired_card_expiry_date_input";
    public static final java.lang.String TestTagExpiredCardExpiryDateShimmer = "expired_card_expiry_date_shimmer";

    /* JADX WARN: Removed duplicated region for block: B:104:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExpiredCardModal(final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand, kotlin.jvm.functions.Function0<kotlin.Unit> function02, kotlin.jvm.functions.Function0<kotlin.Unit> function03, com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel expiredCardViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        int i4;
        kotlin.jvm.functions.Function0<kotlin.Unit> function05;
        com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel expiredCardViewModel2;
        int i5;
        final com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand2;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function06;
        final com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel expiredCardViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function07;
        kotlin.jvm.functions.Function0<kotlin.Unit> function08;
        int i6;
        int i7;
        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1648106468);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(cardBrand == null ? -1 : cardBrand.ordinal()) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            function04 = function02;
            i3 |= startRestartGroup.changedInstance(function04) ? 2048 : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                function05 = function03;
                i3 |= startRestartGroup.changedInstance(function05) ? 16384 : 8192;
                if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                    expiredCardViewModel2 = expiredCardViewModel;
                    i3 |= ((i2 & 32) == 0 && startRestartGroup.changedInstance(expiredCardViewModel2)) ? 131072 : 65536;
                } else {
                    expiredCardViewModel2 = expiredCardViewModel;
                }
                i5 = i3;
                if (startRestartGroup.shouldExecute((i5 & 74899) != 74898, i5 & 1)) {
                    startRestartGroup.startDefaults();
                    if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                        startRestartGroup.skipToGroupEnd();
                        if ((i2 & 32) != 0) {
                            i5 &= -458753;
                        }
                        cardBrand3 = cardBrand;
                        function07 = function04;
                        function08 = function05;
                        i7 = i5;
                        i6 = -1;
                    } else {
                        com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand4 = i8 != 0 ? com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand.UNKNOWN : cardBrand;
                        if (i9 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$$ExternalSyntheticLambda4
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
                                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$$ExternalSyntheticLambda5
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
                        if ((i2 & 32) != 0) {
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
                            i6 = -1;
                            i5 &= -458753;
                            expiredCardViewModel2 = (com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModelImpl.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        } else {
                            i6 = -1;
                        }
                        i7 = i5;
                        cardBrand3 = cardBrand4;
                    }
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(1648106468, i7, i6, "com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModal (ExpiredCardModal.kt:78)");
                    }
                    int i10 = i7;
                    final com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel expiredCardViewModel4 = expiredCardViewModel2;
                    final androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(expiredCardViewModel2.getUiState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
                    final boolean isLoadingDefinitions = ((com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState) collectAsStateWithLifecycle.getValue()).isLoadingDefinitions();
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new androidx.compose.ui.focus.FocusRequester();
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    final androidx.compose.ui.focus.FocusRequester focusRequester = (androidx.compose.ui.focus.FocusRequester) rememberedValue3;
                    java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                    if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new androidx.compose.ui.focus.FocusRequester();
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    final androidx.compose.ui.focus.FocusRequester focusRequester2 = (androidx.compose.ui.focus.FocusRequester) rememberedValue4;
                    java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                    if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue5;
                    java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if (rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue6;
                    java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    final androidx.compose.runtime.MutableState mutableState3 = (androidx.compose.runtime.MutableState) rememberedValue7;
                    com.paypal.oslo.feature.wallet.cards.ui.components.AutoAdvanceFocusKt.AutoAdvanceFocus(((com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState) collectAsStateWithLifecycle.getValue()).getExpiryDate(), 4, focusRequester2, startRestartGroup, 432);
                    boolean isSuccess = ((com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState) collectAsStateWithLifecycle.getValue()).isSuccess();
                    boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle);
                    int i11 = i10 & 14;
                    boolean z = i11 == 4 || ((i10 & 8) != 0 && startRestartGroup.changedInstance(bottomSheetController));
                    boolean z2 = (i10 & 112) == 32;
                    com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$ExpiredCardModal$3$1 rememberedValue8 = startRestartGroup.rememberedValue();
                    if ((z | changed | z2) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue8 = new com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$ExpiredCardModal$3$1(bottomSheetController, function0, collectAsStateWithLifecycle, null);
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(isSuccess), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue8, startRestartGroup, 0);
                    boolean visible = bottomSheetController.getVisible();
                    boolean z3 = i11 == 4 || ((i10 & 8) != 0 && startRestartGroup.changedInstance(bottomSheetController));
                    boolean changedInstance = startRestartGroup.changedInstance(expiredCardViewModel4);
                    boolean z4 = (i10 & 896) == 256;
                    com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$ExpiredCardModal$4$1 rememberedValue9 = startRestartGroup.rememberedValue();
                    if ((z3 | changedInstance | z4) || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue9 = new com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$ExpiredCardModal$4$1(bottomSheetController, expiredCardViewModel4, cardBrand3, null);
                        startRestartGroup.updateRememberedValue(rememberedValue9);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(visible), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue9, startRestartGroup, 0);
                    boolean changed2 = startRestartGroup.changed(isLoadingDefinitions);
                    com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$ExpiredCardModal$5$1 rememberedValue10 = startRestartGroup.rememberedValue();
                    if (changed2 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue10 = new com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$ExpiredCardModal$5$1(isLoadingDefinitions, focusRequester, null);
                        startRestartGroup.updateRememberedValue(rememberedValue10);
                    }
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(isLoadingDefinitions), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue10, startRestartGroup, 0);
                    com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand5 = cardBrand3;
                    final kotlin.jvm.functions.Function0<kotlin.Unit> function09 = function07;
                    com.paypal.oslo.feature.wallet.cards.ui.components.AutoFocusModalKt.AutoFocusModal(bottomSheetController, new com.paypal.pds.components.TopNavConfig(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_update_card, startRestartGroup, 0), false, null, 6, null), function08, focusRequester, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1003065798, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt.m21170$r8$lambda$lv60J3tQoS59PvqhE88OMMb0nc(isLoadingDefinitions, expiredCardViewModel4, focusRequester, collectAsStateWithLifecycle, mutableState, focusRequester2, mutableState2, mutableState3, bottomSheetController, function09, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 199680 | i11 | (com.paypal.pds.components.TopNavConfig.$stable << 3) | ((i10 >> 6) & 896), 16);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    expiredCardViewModel3 = expiredCardViewModel4;
                    cardBrand2 = cardBrand5;
                    function04 = function07;
                    function06 = function08;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    cardBrand2 = cardBrand;
                    function06 = function05;
                    expiredCardViewModel3 = expiredCardViewModel2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt.m21168$r8$lambda$4vTFPkicgUiP14QPvTzVHwWc(com.paypal.pds.components.BottomSheetController.this, function0, cardBrand2, function04, function06, expiredCardViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function05 = function03;
            if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            }
            i5 = i3;
            if (startRestartGroup.shouldExecute((i5 & 74899) != 74898, i5 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function04 = function02;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function05 = function03;
        if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
        }
        i5 = i3;
        if (startRestartGroup.shouldExecute((i5 & 74899) != 74898, i5 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* renamed from: $r8$lambda$-4vTFPkicgUi-P14Q-PvTzVHwWc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21168$r8$lambda$4vTFPkicgUiP14QPvTzVHwWc(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.wallet.cards.domain.add.model.CardBrand cardBrand, kotlin.jvm.functions.Function0 function02, kotlin.jvm.functions.Function0 function03, com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel expiredCardViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ExpiredCardModal(bottomSheetController, function0, cardBrand, function02, function03, expiredCardViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6LTCyFJl5K50LCMYoedqtqq4pbY(final androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        if ((i & 6) == 0) {
            i |= composer.changed(modifier) ? 4 : 2;
        }
        if (composer.shouldExecute((i & 19) != 18, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(182317856, i, -1, "com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModal.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ExpiredCardModal.kt:187)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(modifier, TestTagExpiredCardCVVQuestionIcon);
            com.paypal.pds.core.Icon.QuestionCircle questionCircle = com.paypal.pds.core.Icon.QuestionCircle.INSTANCE;
            com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
            com.paypal.pds.components.ButtonSize.Medium medium = com.paypal.pds.components.ButtonSize.Medium.INSTANCE;
            com.paypal.pds.core.Icon.QuestionCircle questionCircle2 = questionCircle;
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt.$r8$lambda$QsA3Njy8IffbFFovWpV63gaQF1A(androidx.compose.runtime.MutableState.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.IconButtonKt.IconButton(questionCircle2, (kotlin.jvm.functions.Function0) rememberedValue, testTag, tertiary, medium, null, null, false, false, composer, 27702, androidx.window.core.layout.WindowSizeClass.HEIGHT_DP_MEDIUM_LOWER_BOUND);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8DFt7do161gezetzOL1zbrdp8QU(androidx.compose.runtime.MutableState mutableState, boolean z) {
        mutableState.setValue(java.lang.Boolean.valueOf(z));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9aY1-e5DBx3tzuaUUAXt6OoeMGE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21169$r8$lambda$9aY1e5DBx3tzuaUUAXt6OoeMGE(final com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel expiredCardViewModel, androidx.compose.ui.focus.FocusRequester focusRequester, final androidx.compose.runtime.State state, final androidx.compose.runtime.MutableState mutableState, final androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1173283738, i, -1, "com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModal.<anonymous>.<anonymous>.<anonymous> (ExpiredCardModal.kt:164)");
            }
            java.lang.String cvv = ((com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState) state.getValue()).getCvv();
            boolean changedInstance = composer.changedInstance(expiredCardViewModel);
            com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$ExpiredCardModal$6$1$2$1$1 rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$ExpiredCardModal$6$1$2$1$1(expiredCardViewModel);
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.reflect.KFunction kFunction = (kotlin.reflect.KFunction) rememberedValue;
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_cvv, composer, 0);
            androidx.compose.foundation.text.KeyboardOptions keyboardOptions = new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8268getNumberPjHm6EE(), 0, (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            java.util.List<com.paypal.pds.components.textinput.ValidationAlert> singleValidationAlert = com.paypal.oslo.feature.wallet.cards.ui.components.SingleValidationAlertKt.singleValidationAlert(((com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState) state.getValue()).getCvvError(), composer, 0);
            androidx.compose.ui.Modifier focusRequester2 = androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), focusRequester);
            boolean changedInstance2 = composer.changedInstance(expiredCardViewModel);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt.$r8$lambda$xm2hMlrn3pgmQY5KDVJN5UVX_0w(com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.this, mutableState, (androidx.compose.ui.focus.FocusState) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.TextInputKt.TextInput(cvv, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) kFunction, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.focus.FocusChangedModifierKt.onFocusChanged(focusRequester2, (kotlin.jvm.functions.Function1) rememberedValue2), TestTagExpiredCardCVVInput), stringResource, (java.lang.String) null, (java.lang.String) null, false, false, keyboardOptions, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) singleValidationAlert, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(275036869, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt.$r8$lambda$RdGIt0luEMOHd62IBpbJK8JFZSY(com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.this, mutableState, state, mutableState2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 100663296, 1572864, 48880);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$DD7rSuJBtLMCeEe_4q7EBZ64Cs0(com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel expiredCardViewModel, androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.focus.FocusState focusState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(focusState, "");
        mutableState.setValue(java.lang.Boolean.valueOf(focusState.isFocused()));
        expiredCardViewModel.onExpiryDateFocusChanged(focusState.isFocused());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData $r8$lambda$DXCFsZExapT3rDhsTwbcljF6EK8(com.paypal.pds.components.textinput.ValidationAlertData validationAlertData, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return validationAlertData;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$QsA3Njy8IffbFFovWpV63gaQF1A(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.valueOf(!((java.lang.Boolean) mutableState.getValue()).booleanValue()));
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$RdGIt0luEMOHd62IBpbJK8JFZSY(final com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel expiredCardViewModel, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.State state, final androidx.compose.runtime.MutableState mutableState2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(275036869, i, -1, "com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModal.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ExpiredCardModal.kt:171)");
            }
            androidx.compose.runtime.MutableState mutableState3 = mutableState;
            if (((java.lang.Boolean) mutableState3.getValue()).booleanValue() && ((com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState) state.getValue()).getCvv().length() > 0) {
                composer.startReplaceGroup(-1174125965);
                com.paypal.pds.core.Icon.XCircleFill xCircleFill = com.paypal.pds.core.Icon.XCircleFill.INSTANCE;
                com.paypal.pds.components.ButtonSize.Medium medium = com.paypal.pds.components.ButtonSize.Medium.INSTANCE;
                com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
                com.paypal.pds.core.Icon.XCircleFill xCircleFill2 = xCircleFill;
                boolean changedInstance = composer.changedInstance(expiredCardViewModel);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt.$r8$lambda$er4PviODOdXKyrQVKd5j_WrjXrw(com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.IconButtonKt.IconButton(xCircleFill2, (kotlin.jvm.functions.Function0) rememberedValue, null, tertiary, medium, null, null, false, false, composer, 27654, 484);
                composer.endReplaceGroup();
            } else if (((java.lang.Boolean) mutableState3.getValue()).booleanValue()) {
                composer.startReplaceGroup(-1172629347);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1173752756);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_cvv, composer, 0);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_cvv_coach_tip_description, composer, 0);
                boolean booleanValue = ((java.lang.Boolean) mutableState2.getValue()).booleanValue();
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt.$r8$lambda$8DFt7do161gezetzOL1zbrdp8QU(androidx.compose.runtime.MutableState.this, ((java.lang.Boolean) obj).booleanValue());
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                com.paypal.pds.components.CoachTipKt.CoachTip(stringResource, stringResource2, null, booleanValue, (kotlin.jvm.functions.Function1) rememberedValue2, null, 0, 0, null, null, null, null, false, com.paypal.pds.components.AnchorEdge.Top.INSTANCE, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(182317856, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function3
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                        return com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt.$r8$lambda$6LTCyFJl5K50LCMYoedqtqq4pbY(androidx.compose.runtime.MutableState.this, (androidx.compose.ui.Modifier) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                    }
                }, composer, 54), composer, 24576, (com.paypal.pds.components.AnchorEdge.Top.$stable << 9) | 196992, 20452);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$TIhl2tMd9u_NG0dirQlgLOSNMFA(final com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel expiredCardViewModel, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.State state, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1325262094, i, -1, "com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModal.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ExpiredCardModal.kt:137)");
            }
            if (!((java.lang.Boolean) mutableState.getValue()).booleanValue() || ((com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState) state.getValue()).getExpiryDate().length() <= 0) {
                composer.startReplaceGroup(1544100948);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1543782051);
                com.paypal.pds.core.Icon.XCircleFill xCircleFill = com.paypal.pds.core.Icon.XCircleFill.INSTANCE;
                com.paypal.pds.components.ButtonSize.Medium medium = com.paypal.pds.components.ButtonSize.Medium.INSTANCE;
                com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
                com.paypal.pds.core.Icon.XCircleFill xCircleFill2 = xCircleFill;
                boolean changedInstance = composer.changedInstance(expiredCardViewModel);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt.$r8$lambda$oJyNpV1FUQ9Vrj6DUA5XaiPXAGQ(com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.IconButtonKt.IconButton(xCircleFill2, (kotlin.jvm.functions.Function0) rememberedValue, null, tertiary, medium, null, null, false, false, composer, 27654, 484);
                composer.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$er4PviODOdXKyrQVKd5j_WrjXrw(com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel expiredCardViewModel) {
        expiredCardViewModel.onCvvChanged("");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gCG0FhxrJA7ADZ3c4KpVvNvDmQw(final com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel expiredCardViewModel, androidx.compose.ui.focus.FocusRequester focusRequester, final androidx.compose.runtime.State state, final androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.Composer composer, int i) {
        final com.paypal.pds.components.textinput.ValidationAlertData validationAlertData;
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(825638691, i, -1, "com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModal.<anonymous>.<anonymous>.<anonymous> (ExpiredCardModal.kt:127)");
            }
            java.lang.String expiryDate = ((com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState) state.getValue()).getExpiryDate();
            boolean changedInstance = composer.changedInstance(expiredCardViewModel);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.reflect.KFunction) new com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$ExpiredCardModal$6$1$1$1$1(expiredCardViewModel);
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.reflect.KFunction kFunction = (kotlin.reflect.KFunction) rememberedValue;
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_expiration_date, composer, 0);
            androidx.compose.foundation.text.KeyboardOptions keyboardOptions = new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, androidx.compose.ui.text.input.KeyboardType.INSTANCE.m8268getNumberPjHm6EE(), 0, (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_CALENDAR_VALUE, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            java.lang.Integer expiryDateError = ((com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState) state.getValue()).getExpiryDateError();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-907822770, 0, -1, "com.paypal.oslo.feature.wallet.cards.ui.expired.getExpiryDateValidationAlertData (ExpiredCardModal.kt:233)");
            }
            if (expiryDateError != null) {
                composer.startReplaceGroup(461048448);
                validationAlertData = new com.paypal.pds.components.textinput.ValidationAlertData(androidx.compose.ui.res.StringResources_androidKt.stringResource(expiryDateError.intValue(), composer, 0), com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(461202332);
                validationAlertData = new com.paypal.pds.components.textinput.ValidationAlertData(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_cards_enter_expiry_date_hint, composer, 0), com.paypal.pds.components.ContextualAlertStyle.Neutral.INSTANCE, false, null, null, 28, null);
                composer.endReplaceGroup();
            }
            com.paypal.pds.components.textinput.ValidationAlert.Companion companion = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
            boolean changedInstance2 = composer.changedInstance(validationAlertData);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt.$r8$lambda$DXCFsZExapT3rDhsTwbcljF6EK8(com.paypal.pds.components.textinput.ValidationAlertData.this, (java.lang.String) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.textinput.ValidationAlert invoke = companion.invoke((kotlin.jvm.functions.Function1) rememberedValue2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            java.util.List listOf = kotlin.collections.CollectionsKt.listOf(invoke);
            com.paypal.pds.components.textinput.VisualTransformation.Number number = new com.paypal.pds.components.textinput.VisualTransformation.Number("00/00");
            androidx.compose.ui.Modifier focusRequester2 = androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), focusRequester);
            boolean changedInstance3 = composer.changedInstance(expiredCardViewModel);
            java.lang.Object rememberedValue3 = composer.rememberedValue();
            if (changedInstance3 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt.$r8$lambda$DD7rSuJBtLMCeEe_4q7EBZ64Cs0(com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.this, mutableState, (androidx.compose.ui.focus.FocusState) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            com.paypal.pds.components.TextInputKt.TextInput(expiryDate, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) kFunction, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.focus.FocusChangedModifierKt.onFocusChanged(focusRequester2, (kotlin.jvm.functions.Function1) rememberedValue3), TestTagExpiredCardExpiryDateInput), stringResource, (java.lang.String) null, (java.lang.String) null, false, false, keyboardOptions, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, (com.paypal.pds.components.textinput.VisualTransformation) number, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) listOf, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1325262094, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt.$r8$lambda$TIhl2tMd9u_NG0dirQlgLOSNMFA(com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.this, mutableState, state, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 100663296, (com.paypal.pds.components.textinput.VisualTransformation.Number.$stable << 6) | 1572864 | (com.paypal.pds.components.textinput.ValidationAlert.$stable << 12), 44784);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jqz7r864gZrjq4QzG3hBwkatSPU(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(840860012);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(840860012, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalPreview (ExpiredCardModal.kt:252)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$$ExternalSyntheticLambda15
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
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$$ExternalSyntheticLambda16
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
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            ExpiredCardModal(bottomSheetController, function0, null, function02, (kotlin.jvm.functions.Function0) rememberedValue4, null, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 27696, 36);
            bottomSheetController.showSheet();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt.$r8$lambda$jqz7r864gZrjq4QzG3hBwkatSPU(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$lv60J3tQoS59PvqhE-88OMMb0nc, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21170$r8$lambda$lv60J3tQoS59PvqhE88OMMb0nc(boolean z, final com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel expiredCardViewModel, final androidx.compose.ui.focus.FocusRequester focusRequester, final androidx.compose.runtime.State state, final androidx.compose.runtime.MutableState mutableState, final androidx.compose.ui.focus.FocusRequester focusRequester2, final androidx.compose.runtime.MutableState mutableState2, final androidx.compose.runtime.MutableState mutableState3, final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1003065798, i, -1, "com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModal.<anonymous> (ExpiredCardModal.kt:114)");
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
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            com.paypal.pds.components.ShimmerKt.Shimmer(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagExpiredCardExpiryDateShimmer), com.paypal.pds.components.ShimmerStyle.Container.INSTANCE, z, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(825638691, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt.$r8$lambda$gCG0FhxrJA7ADZ3c4KpVvNvDmQw(com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.this, focusRequester, state, mutableState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 3126, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer, 0);
            com.paypal.pds.components.ShimmerKt.Shimmer(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagExpiredCardCVVShimmer), com.paypal.pds.components.ShimmerStyle.Container.INSTANCE, z, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1173283738, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt.m21169$r8$lambda$9aY1e5DBx3tzuaUUAXt6OoeMGE(com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.this, focusRequester2, state, mutableState2, mutableState3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 3126, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer, 0);
            com.paypal.pds.components.ShimmerKt.Shimmer(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, TestTagExpiredCardButtonsShimmer), com.paypal.pds.components.ShimmerStyle.Container.INSTANCE, z, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-1177711653, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt.$r8$lambda$mg1z5HajwgkmUBlYHeMkNGR8giI(com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.this, bottomSheetController, function0, state, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, composer, 54), composer, 3126, 0);
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$mg1z5HajwgkmUBlYHeMkNGR8giI(com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel expiredCardViewModel, final com.paypal.pds.components.BottomSheetController bottomSheetController, final kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.State state, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1177711653, i, -1, "com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModal.<anonymous>.<anonymous>.<anonymous> (ExpiredCardModal.kt:216)");
            }
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_confirm, composer, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_cancel, composer, 0);
            boolean changedInstance = composer.changedInstance(expiredCardViewModel);
            com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$ExpiredCardModal$6$1$3$1$1 rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$ExpiredCardModal$6$1$3$1$1(expiredCardViewModel);
                composer.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) ((kotlin.reflect.KFunction) rememberedValue);
            boolean changedInstance2 = composer.changedInstance(bottomSheetController);
            boolean changed = composer.changed(function0);
            java.lang.Object rememberedValue2 = composer.rememberedValue();
            if ((changedInstance2 | changed) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardModalKt.$r8$lambda$vhTxhb08gSzxrOFDI7LZdF9APRQ(com.paypal.pds.components.BottomSheetController.this, function0);
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.wallet.cards.ui.components.DualActionButtonsKt.DualActionButtons(stringResource, stringResource2, function02, (kotlin.jvm.functions.Function0) rememberedValue2, ((com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState) state.getValue()).isLoading(), null, composer, 0, 32);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oJyNpV1FUQ9Vrj6DUA5XaiPXAGQ(com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel expiredCardViewModel) {
        expiredCardViewModel.onExpiryDateChanged("");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vhTxhb08gSzxrOFDI7LZdF9APRQ(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0) {
        bottomSheetController.hideSheet();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xm2hMlrn3pgmQY5KDVJN5UVX_0w(com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel expiredCardViewModel, androidx.compose.runtime.MutableState mutableState, androidx.compose.ui.focus.FocusState focusState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(focusState, "");
        mutableState.setValue(java.lang.Boolean.valueOf(focusState.isFocused()));
        expiredCardViewModel.onCvvFocusChanged(focusState.isFocused());
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState access$ExpiredCardModal$lambda$2(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModel.UiState) state.getValue();
    }
}
