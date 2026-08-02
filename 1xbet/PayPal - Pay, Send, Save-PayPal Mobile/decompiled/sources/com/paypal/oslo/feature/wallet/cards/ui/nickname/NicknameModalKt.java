package com.paypal.oslo.feature.wallet.cards.ui.nickname;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\u001aS\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u00012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a]\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\u0007\u001a\u00020\u00012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0003¢\u0006\u0002\u0010\u0019\u001a1\u0010\u001a\u001a\u00020\u00032\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u0015\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010\u001d\u001a\u0015\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u001f\u001a\r\u0010 \u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010!\u001a\r\u0010\"\u001a\u00020\u0003H\u0003¢\u0006\u0002\u0010!\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006#²\u0006\n\u0010$\u001a\u00020%X\u008a\u0084\u0002²\u0006\n\u0010\u0011\u001a\u00020\u0001X\u008a\u008e\u0002²\u0006\n\u0010&\u001a\u00020\u0016X\u008a\u008e\u0002"}, d2 = {"TestTagNicknameInput", "", "NicknameModal", "", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "cardId", "initialNickname", "onNicknameUpdatedFromApi", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/wallet/cards/ui/details/CardDetailInfo;", "onDismiss", "Lkotlin/Function0;", "viewModel", "Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel;", "(Lcom/paypal/pds/components/BottomSheetController;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel;Landroidx/compose/runtime/Composer;II)V", "NicknameEditContent", "nickname", "onNicknameChange", "onSave", "onSecondaryButtonPress", "isLoading", "", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/focus/FocusRequester;Landroidx/compose/runtime/Composer;I)V", "RemoveConfirmationContent", "onConfirm", "onCancel", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;I)V", "getCancelButtonLabel", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "NicknameModalEditPreview", "(Landroidx/compose/runtime/Composer;I)V", "NicknameModalCreatePreview", "wallet_prodRelease", "uiState", "Lcom/paypal/oslo/feature/wallet/cards/ui/nickname/NicknameViewModel$NicknameModalState;", "showEmptyError"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NicknameModalKt {
    public static final java.lang.String TestTagNicknameInput = "nickname_input";

    /* JADX WARN: Removed duplicated region for block: B:106:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NicknameModal(final com.paypal.pds.components.BottomSheetController bottomSheetController, final java.lang.String str, final java.lang.String str2, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo, kotlin.Unit> function1, kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel nicknameViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel nicknameViewModel2;
        int i4;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        final com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel nicknameViewModel3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function04;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel nicknameViewModel4;
        androidx.compose.runtime.State collectAsState;
        java.lang.Object rememberedValue;
        java.lang.Boolean valueOf;
        int i5;
        boolean z;
        boolean z2;
        boolean changedInstance;
        boolean z3;
        com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$NicknameModal$2$1 rememberedValue2;
        int i6;
        java.lang.Boolean bool;
        androidx.compose.runtime.State state;
        kotlin.coroutines.Continuation continuation;
        boolean changed;
        boolean z4;
        boolean z5;
        com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$NicknameModal$3$1 rememberedValue3;
        java.lang.Object rememberedValue4;
        com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState nicknameModalState;
        com.paypal.pds.components.TopNavConfig topNavConfig;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bottomSheetController, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(2059894962);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
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
            i3 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    nicknameViewModel2 = nicknameViewModel;
                    if (startRestartGroup.changedInstance(nicknameViewModel2)) {
                        i7 = 131072;
                        i3 |= i7;
                    }
                } else {
                    nicknameViewModel2 = nicknameViewModel;
                }
                i7 = 65536;
                i3 |= i7;
            } else {
                nicknameViewModel2 = nicknameViewModel;
            }
            i4 = i3;
            if (!startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
                startRestartGroup.startDefaults();
                if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                    if (i8 != 0) {
                        java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                        if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final java.lang.Object invoke() {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue5);
                        }
                        function04 = (kotlin.jvm.functions.Function0) rememberedValue5;
                    } else {
                        function04 = function02;
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
                        i4 &= -458753;
                        nicknameViewModel4 = (com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModelImpl.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                        int i9 = i4;
                        startRestartGroup.endDefaults();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(2059894962, i9, -1, "com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModal (NicknameModal.kt:88)");
                        }
                        collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(nicknameViewModel4.getUiState(), null, startRestartGroup, 0, 1);
                        rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str2, null, 2, null);
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
                        valueOf = java.lang.Boolean.valueOf(bottomSheetController.getVisible());
                        i5 = i9 & 14;
                        z = i5 != 4 || ((i9 & 8) != 0 && startRestartGroup.changedInstance(bottomSheetController));
                        z2 = (i9 & 896) != 256;
                        changedInstance = startRestartGroup.changedInstance(nicknameViewModel4);
                        z3 = (i9 & 112) != 32;
                        rememberedValue2 = startRestartGroup.rememberedValue();
                        if ((!(z2 | z | changedInstance) && !z3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            i6 = i5;
                            bool = valueOf;
                            state = collectAsState;
                            continuation = null;
                            rememberedValue2 = new com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$NicknameModal$2$1(bottomSheetController, str2, nicknameViewModel4, str, mutableState, null);
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        } else {
                            i6 = i5;
                            bool = valueOf;
                            state = collectAsState;
                            continuation = null;
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(bool, str2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, (i9 >> 3) & 112);
                        com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState nicknameModalState2 = (com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState) state.getValue();
                        final androidx.compose.runtime.State state2 = state;
                        changed = startRestartGroup.changed(state2);
                        int i10 = i6;
                        z4 = (i9 & 7168) != 2048;
                        z5 = i10 != 4 || ((i9 & 8) != 0 && startRestartGroup.changedInstance(bottomSheetController));
                        rememberedValue3 = startRestartGroup.rememberedValue();
                        if (!(changed | z4 | z5) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$NicknameModal$3$1(bottomSheetController, state2, function1, continuation);
                            startRestartGroup.updateRememberedValue(rememberedValue3);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(nicknameModalState2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 0);
                        rememberedValue4 = startRestartGroup.rememberedValue();
                        if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new androidx.compose.ui.focus.FocusRequester();
                            startRestartGroup.updateRememberedValue(rememberedValue4);
                        }
                        final androidx.compose.ui.focus.FocusRequester focusRequester = (androidx.compose.ui.focus.FocusRequester) rememberedValue4;
                        nicknameModalState = (com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState) state2.getValue();
                        if (!(nicknameModalState instanceof com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveConfirm) || (nicknameModalState instanceof com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveLoading) || (nicknameModalState instanceof com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveSuccess)) {
                            startRestartGroup.startReplaceGroup(-420811552);
                            startRestartGroup.endReplaceGroup();
                            topNavConfig = new com.paypal.pds.components.TopNavConfig(null, false, null, 7, null);
                        } else {
                            startRestartGroup.startReplaceGroup(-420810491);
                            topNavConfig = new com.paypal.pds.components.TopNavConfig(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_enter_nickname, startRestartGroup, 0), false, null, 6, null);
                            startRestartGroup.endReplaceGroup();
                        }
                        final com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel nicknameViewModel5 = nicknameViewModel4;
                        com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel nicknameViewModel6 = nicknameViewModel4;
                        com.paypal.oslo.feature.wallet.cards.ui.components.AutoFocusModalKt.AutoFocusModal(bottomSheetController, topNavConfig, function04, focusRequester, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(678887816, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt.$r8$lambda$4t1_A0ASKSmAyZw1LuCS7nYGMDc(com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.this, str2, focusRequester, state2, mutableState, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 199680 | i10 | (com.paypal.pds.components.TopNavConfig.$stable << 3) | ((i9 >> 6) & 896), 16);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        nicknameViewModel3 = nicknameViewModel6;
                        function03 = function04;
                    }
                } else {
                    startRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i4 &= -458753;
                    }
                    function04 = function02;
                }
                nicknameViewModel4 = nicknameViewModel2;
                int i92 = i4;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(nicknameViewModel4.getUiState(), null, startRestartGroup, 0, 1);
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) rememberedValue;
                valueOf = java.lang.Boolean.valueOf(bottomSheetController.getVisible());
                i5 = i92 & 14;
                if (i5 != 4) {
                }
                if ((i92 & 896) != 256) {
                }
                changedInstance = startRestartGroup.changedInstance(nicknameViewModel4);
                if ((i92 & 112) != 32) {
                }
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (!(z2 | z | changedInstance | z3)) {
                }
                i6 = i5;
                bool = valueOf;
                state = collectAsState;
                continuation = null;
                rememberedValue2 = new com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$NicknameModal$2$1(bottomSheetController, str2, nicknameViewModel4, str, mutableState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(bool, str2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, (i92 >> 3) & 112);
                com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState nicknameModalState22 = (com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState) state.getValue();
                final androidx.compose.runtime.State state22 = state;
                changed = startRestartGroup.changed(state22);
                int i102 = i6;
                if ((i92 & 7168) != 2048) {
                }
                if (i102 != 4) {
                }
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!(changed | z4 | z5)) {
                }
                rememberedValue3 = new com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$NicknameModal$3$1(bottomSheetController, state22, function1, continuation);
                startRestartGroup.updateRememberedValue(rememberedValue3);
                androidx.compose.runtime.EffectsKt.LaunchedEffect(nicknameModalState22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 0);
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                }
                final androidx.compose.ui.focus.FocusRequester focusRequester2 = (androidx.compose.ui.focus.FocusRequester) rememberedValue4;
                nicknameModalState = (com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState) state22.getValue();
                if (!(nicknameModalState instanceof com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveConfirm)) {
                }
                startRestartGroup.startReplaceGroup(-420811552);
                startRestartGroup.endReplaceGroup();
                topNavConfig = new com.paypal.pds.components.TopNavConfig(null, false, null, 7, null);
                final com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel nicknameViewModel52 = nicknameViewModel4;
                com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel nicknameViewModel62 = nicknameViewModel4;
                com.paypal.oslo.feature.wallet.cards.ui.components.AutoFocusModalKt.AutoFocusModal(bottomSheetController, topNavConfig, function04, focusRequester2, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(678887816, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt.$r8$lambda$4t1_A0ASKSmAyZw1LuCS7nYGMDc(com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.this, str2, focusRequester2, state22, mutableState2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 199680 | i102 | (com.paypal.pds.components.TopNavConfig.$stable << 3) | ((i92 >> 6) & 896), 16);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                }
                nicknameViewModel3 = nicknameViewModel62;
                function03 = function04;
            } else {
                startRestartGroup.skipToGroupEnd();
                function03 = function02;
                nicknameViewModel3 = nicknameViewModel2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt.m21176$r8$lambda$jGW2j5ho77D97CUi8BbRIRCdkQ(com.paypal.pds.components.BottomSheetController.this, str, str2, function1, function03, nicknameViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function02 = function0;
        if ((196608 & i) != 0) {
        }
        i4 = i3;
        if (!startRestartGroup.shouldExecute((i4 & 74899) == 74898, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void getHighSpeedVideoFpsRanges(final java.lang.String str, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, final java.lang.String str2, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final boolean z, final androidx.compose.ui.focus.FocusRequester focusRequester, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        java.util.List emptyList;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-671936760);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= startRestartGroup.changed(focusRequester) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((599187 & i3) != 599186, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-671936760, i3, -1, "com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameEditContent (NicknameModal.kt:165)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
            final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_banks_nickname_add_a_nickname_to_continue, startRestartGroup, 0);
            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_nickname, startRestartGroup, 0);
            if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                startRestartGroup.startReplaceGroup(973753019);
                com.paypal.pds.components.textinput.ValidationAlert.Companion companion = com.paypal.pds.components.textinput.ValidationAlert.INSTANCE;
                boolean changed = startRestartGroup.changed(stringResource);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt.m21178$r8$lambda$zUbifykq2FofFGFjiSWUlmmQ(stringResource, (java.lang.String) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                emptyList = kotlin.collections.CollectionsKt.listOf(companion.invoke((kotlin.jvm.functions.Function1) rememberedValue2));
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(974057253);
                startRestartGroup.endReplaceGroup();
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            java.util.List list = emptyList;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), focusRequester), TestTagNicknameInput);
            boolean z2 = (i3 & 112) == 32;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt.$r8$lambda$CILNxavWvEs2Hb_9juzaim1J0r4(kotlin.jvm.functions.Function1.this, mutableState, (java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            int i4 = i3 & 14;
            boolean z3 = true;
            com.paypal.pds.components.TextInputKt.TextInput(str, (kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit>) rememberedValue3, testTag, stringResource2, (java.lang.String) null, (java.lang.String) null, false, false, (androidx.compose.foundation.text.KeyboardOptions) null, (kotlin.jvm.functions.Function1<? super kotlin.jvm.functions.Function0<kotlin.Unit>, kotlin.Unit>) null, (androidx.compose.foundation.interaction.MutableInteractionSource) null, false, (com.paypal.pds.components.textinput.VisualTransformation) null, (androidx.compose.ui.autofill.ContentType) null, (java.util.List<? extends com.paypal.pds.components.textinput.ValidationAlert>) list, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-17787587, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt.$r8$lambda$wtOMm9wW8XO8uhfgWlqenq49Gaw(str, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, i4, 1572864, 49136);
            composer2 = startRestartGroup;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing24()), composer2, 0);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_save, composer2, 0);
            java.lang.String highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(str2, composer2, (i3 >> 6) & 14);
            boolean z4 = i4 == 4;
            if ((i3 & 7168) != 2048) {
                z3 = false;
            }
            java.lang.Object rememberedValue4 = composer2.rememberedValue();
            if ((z4 | z3) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt.m21172$r8$lambda$2fZsxjqQkA_SVLMoWcuSjfcAXQ(str, function0, mutableState);
                    }
                };
                composer2.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.feature.wallet.cards.ui.components.DualActionButtonsKt.DualActionButtons(stringResource3, highSpeedVideoFpsRangesFor, (kotlin.jvm.functions.Function0) rememberedValue4, function02, z, null, composer2, (i3 >> 3) & 64512, 32);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), composer2, 0);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt.m21173$r8$lambda$EpJ7rsPXAA31HlnI15rSYVYEV4(str, function1, str2, function0, function02, z, focusRequester, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, final boolean z, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2098814944);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2098814944, i3, -1, "com.paypal.oslo.feature.wallet.cards.ui.nickname.RemoveConfirmationContent (NicknameModal.kt:233)");
            }
            androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getCenterHorizontally(), startRestartGroup, 48);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1708paddingVpY3zN4$default);
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
            com.paypal.pds.components.HeaderKt.Header(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_nickname_remove_title, startRestartGroup, 0), (androidx.compose.ui.Modifier) null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_nickname_remove_description, startRestartGroup, 0), (java.lang.String) null, com.paypal.pds.components.HeaderContentAlignment.Center, com.paypal.oslo.feature.wallet.cards.ui.nickname.ComposableSingletons$NicknameModalKt.INSTANCE.m21171getLambda$1811198219$wallet_prodRelease(), (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) null, startRestartGroup, 221184, 74);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
            composer2 = startRestartGroup;
            com.paypal.pds.components.ButtonKt.Button(function0, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_remove, startRestartGroup, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, z, startRestartGroup, (i3 & 14) | 1769856 | ((i3 << 18) & 234881024), 152);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
            com.paypal.pds.components.ButtonKt.Button(function02, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_cancel, composer2, 0), androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Large.INSTANCE, false, false, composer2, ((i3 >> 3) & 14) | 1769856, 408);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), composer2, 0);
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt.$r8$lambda$xnukE9U0EO0EpalHDGcujwcwGQM(kotlin.jvm.functions.Function0.this, function02, z, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1703148414, i, -1, "com.paypal.oslo.feature.wallet.cards.ui.nickname.getCancelButtonLabel (NicknameModal.kt:274)");
        }
        if (str.length() == 0) {
            composer.startReplaceGroup(-2045630501);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_cancel, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-2045556101);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.wallet.R.string.feature_wallet_common_remove, composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    /* renamed from: $r8$lambda$2fZsxjqQkA_SV-LMoWcuSjfcAXQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21172$r8$lambda$2fZsxjqQkA_SVLMoWcuSjfcAXQ(java.lang.String str, kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.MutableState mutableState) {
        if (!kotlin.text.StringsKt.isBlank(str)) {
            function0.invoke();
        } else {
            mutableState.setValue(java.lang.Boolean.TRUE);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ kotlin.Unit $r8$lambda$4t1_A0ASKSmAyZw1LuCS7nYGMDc(final com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel nicknameViewModel, java.lang.String str, androidx.compose.ui.focus.FocusRequester focusRequester, androidx.compose.runtime.State state, final androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(678887816, i, -1, "com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModal.<anonymous> (NicknameModal.kt:128)");
            }
            com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState nicknameModalState = (com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState) state.getValue();
            if ((nicknameModalState instanceof com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveConfirm) || (nicknameModalState instanceof com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveLoading) || (nicknameModalState instanceof com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveSuccess)) {
                composer.startReplaceGroup(-253833008);
                boolean changedInstance = composer.changedInstance(nicknameViewModel);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt.$r8$lambda$KyhYiC9pYW8nmOGf7Qj6WpddJ90(com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
                boolean changedInstance2 = composer.changedInstance(nicknameViewModel);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt.$r8$lambda$9wO4WEomybFhC5mPESl7krJqaSo(com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                getHighSpeedVideoFpsRanges(function0, (kotlin.jvm.functions.Function0) rememberedValue2, ((com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState) state.getValue()) instanceof com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.RemoveLoading, composer, 0);
                composer.endReplaceGroup();
            } else {
                if (!(nicknameModalState instanceof com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Idle) && !(nicknameModalState instanceof com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Loading) && !(nicknameModalState instanceof com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Success) && !(nicknameModalState instanceof com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Dismissed)) {
                    composer.startReplaceGroup(-423836211);
                    composer.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-253286757);
                java.lang.String str2 = (java.lang.String) mutableState.getValue();
                java.lang.Object rememberedValue3 = composer.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt.$r8$lambda$yErSNDAthdkqIzrlIPUaKufwW3U(androidx.compose.runtime.MutableState.this, (java.lang.String) obj);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue3;
                boolean changedInstance3 = composer.changedInstance(nicknameViewModel);
                java.lang.Object rememberedValue4 = composer.rememberedValue();
                if (changedInstance3 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt.m21174$r8$lambda$bSgVvezudvn1uKs3pH5Bv4yr54(com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.this, mutableState);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue4);
                }
                kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue4;
                boolean changedInstance4 = composer.changedInstance(nicknameViewModel);
                java.lang.Object rememberedValue5 = composer.rememberedValue();
                if (changedInstance4 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt.$r8$lambda$tDkRMiwxIVnyFbGYUuvNkn0fNm8(com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue5);
                }
                getHighSpeedVideoFpsRanges(str2, function1, str, function02, (kotlin.jvm.functions.Function0) rememberedValue5, ((com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState) state.getValue()) instanceof com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState.Loading, focusRequester, composer, 1572912);
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$9wO4WEomybFhC5mPESl7krJqaSo(com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel nicknameViewModel) {
        nicknameViewModel.onRemoveCancel();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$CILNxavWvEs2Hb_9juzaim1J0r4(kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(str);
        if (!kotlin.text.StringsKt.isBlank(str)) {
            mutableState.setValue(java.lang.Boolean.FALSE);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$Ep-J7rsPXAA31HlnI15rSYVYEV4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21173$r8$lambda$EpJ7rsPXAA31HlnI15rSYVYEV4(java.lang.String str, kotlin.jvm.functions.Function1 function1, java.lang.String str2, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, boolean z, androidx.compose.ui.focus.FocusRequester focusRequester, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(str, function1, str2, function0, function02, z, focusRequester, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KyhYiC9pYW8nmOGf7Qj6WpddJ90(com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel nicknameViewModel) {
        nicknameViewModel.onRemoveConfirm();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$SDchMgi9lJ5g97BWvewTbfyd3jc(com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo cardDetailInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetailInfo, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$T9U8OW2LCbzN6lt9QrtyxaagJPg(com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo cardDetailInfo) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetailInfo, "");
        return kotlin.Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: $r8$lambda$bSgVvezud-vn1uKs3pH5Bv4yr54, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21174$r8$lambda$bSgVvezudvn1uKs3pH5Bv4yr54(com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel nicknameViewModel, androidx.compose.runtime.MutableState mutableState) {
        nicknameViewModel.save((java.lang.String) mutableState.getValue());
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gUC32Nr3w1r4UriA0gW3_omW_AI(kotlin.jvm.functions.Function1 function1) {
        function1.invoke("");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$gm0oIQ4hOwqosHbXhm4q_35huNo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-2080690991);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2080690991, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalEditPreview (NicknameModal.kt:284)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt.$r8$lambda$SDchMgi9lJ5g97BWvewTbfyd3jc((com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            NicknameModal(bottomSheetController, "", "My Card", function1, (kotlin.jvm.functions.Function0) rememberedValue3, null, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 28080, 32);
            bottomSheetController.showSheet();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt.$r8$lambda$gm0oIQ4hOwqosHbXhm4q_35huNo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jGW2j5ho77D9-7CUi8BbRIRCdkQ, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21176$r8$lambda$jGW2j5ho77D97CUi8BbRIRCdkQ(com.paypal.pds.components.BottomSheetController bottomSheetController, java.lang.String str, java.lang.String str2, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel nicknameViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        NicknameModal(bottomSheetController, str, str2, function1, function0, nicknameViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pMMTG6vVgyjsgLmR1bq-ASNah9c, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m21177$r8$lambda$pMMTG6vVgyjsgLmR1bqASNah9c(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1738602883);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1738602883, updateChangedFlags, -1, "com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalCreatePreview (NicknameModal.kt:300)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt.$r8$lambda$T9U8OW2LCbzN6lt9QrtyxaagJPg((com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailInfo) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            NicknameModal(bottomSheetController, "", "", function1, (kotlin.jvm.functions.Function0) rememberedValue3, null, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 28080, 32);
            bottomSheetController.showSheet();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt.m21177$r8$lambda$pMMTG6vVgyjsgLmR1bqASNah9c(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$tDkRMiwxIVnyFbGYUuvNkn0fNm8(com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel nicknameViewModel) {
        nicknameViewModel.onSecondaryButtonPressed();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wtOMm9wW8XO8uhfgWlqenq49Gaw(java.lang.String str, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-17787587, i, -1, "com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameEditContent.<anonymous>.<anonymous> (NicknameModal.kt:196)");
            }
            if (str.length() > 0) {
                composer.startReplaceGroup(-1628952755);
                com.paypal.pds.core.Icon.XCircleFill xCircleFill = com.paypal.pds.core.Icon.XCircleFill.INSTANCE;
                com.paypal.pds.components.ButtonSize.Medium medium = com.paypal.pds.components.ButtonSize.Medium.INSTANCE;
                com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
                com.paypal.pds.core.Icon.XCircleFill xCircleFill2 = xCircleFill;
                boolean changed = composer.changed(function1);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameModalKt.$r8$lambda$gUC32Nr3w1r4UriA0gW3_omW_AI(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.IconButtonKt.IconButton(xCircleFill2, (kotlin.jvm.functions.Function0) rememberedValue, null, tertiary, medium, null, null, false, false, composer, 27654, 484);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1628696571);
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$xnukE9U0EO0EpalHDGcujwcwGQM(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, boolean z, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(function0, function02, z, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$yErSNDAthdkqIzrlIPUaKufwW3U(androidx.compose.runtime.MutableState mutableState, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        mutableState.setValue(str);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zUb-i-fykq2FofFGFjiSWUl-mmQ, reason: not valid java name */
    public static /* synthetic */ com.paypal.pds.components.textinput.ValidationAlertData m21178$r8$lambda$zUbifykq2FofFGFjiSWUlmmQ(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return new com.paypal.pds.components.textinput.ValidationAlertData(str, com.paypal.pds.components.ContextualAlertStyle.Negative.INSTANCE, false, null, null, 28, null);
    }

    public static final /* synthetic */ com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState access$NicknameModal$lambda$1(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModel.NicknameModalState) state.getValue();
    }
}
