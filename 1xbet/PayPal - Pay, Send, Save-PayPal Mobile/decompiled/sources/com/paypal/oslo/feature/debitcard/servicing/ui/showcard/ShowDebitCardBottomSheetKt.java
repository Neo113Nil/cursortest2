package com.paypal.oslo.feature.debitcard.servicing.ui.showcard;

@kotlin.Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001a?\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0012H\u0003¢\u0006\u0002\u0010\u0014\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0017\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016\u001a\r\u0010\u0018\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0016¨\u0006\u0019²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002"}, d2 = {"ShowDebitCardBottomSheet", "", "cardId", "", com.paypal.oslo.feature.debitcard.shared.constants.DebitCardLoggerConstants.PRODUCT_NAME, "Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;", "onDismiss", "Lkotlin/Function0;", "viewModel", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/viewmodel/ShowDebitCardViewModel;", "(Ljava/lang/String;Lcom/paypal/oslo/feature/debitcard/api/model/DebitCardProductName;Lkotlin/jvm/functions/Function0;Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/viewmodel/ShowDebitCardViewModel;Landroidx/compose/runtime/Composer;II)V", "ShowDebitCardBottomSheetContent", "bottomSheetController", "Lcom/paypal/pds/components/BottomSheetController;", "uiState", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardState;", "onCloseBottomSheet", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardEvent;", "(Lcom/paypal/pds/components/BottomSheetController;Lcom/paypal/oslo/feature/debitcard/servicing/ui/showcard/mvi/ShowDebitCardState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "ShowDebitCardBottomSheetContentSuccessPreview", "(Landroidx/compose/runtime/Composer;I)V", "ShowDebitCardBottomSheetContentLoadingPreview", "ShowDebitCardBottomSheetContentErrorPreview", "debit-card_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ShowDebitCardBottomSheetKt {
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0381, code lost:
    
        if (r4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x019c, code lost:
    
        if (r1 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0348, code lost:
    
        if (r2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L141;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0342  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ShowDebitCardBottomSheet(final java.lang.String str, final com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel showDebitCardViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel showDebitCardViewModel2;
        final com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel showDebitCardViewModel3;
        androidx.view.viewmodel.CreationExtras withCreationCallback;
        int i4;
        final com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel showDebitCardViewModel4;
        int i5;
        int i6;
        java.lang.Object rememberedValue;
        java.lang.Object rememberedValue2;
        androidx.compose.runtime.MutableState mutableState;
        int i7;
        boolean changed;
        java.lang.Object obj;
        boolean changed2;
        java.lang.Object rememberedValue3;
        boolean changedInstance;
        boolean changedInstance2;
        boolean z;
        com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$ShowDebitCardBottomSheet$3$1 rememberedValue4;
        kotlin.Unit unit;
        boolean changedInstance3;
        boolean changed3;
        boolean changedInstance4;
        boolean z2;
        boolean z3;
        boolean changedInstance5;
        com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$ShowDebitCardBottomSheet$4$1 rememberedValue5;
        androidx.compose.runtime.MutableState mutableState2;
        kotlin.Unit unit2;
        boolean changed4;
        boolean z4;
        java.lang.Object obj2;
        com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$ShowDebitCardBottomSheet$5$1 showDebitCardBottomSheetKt$ShowDebitCardBottomSheet$5$1;
        boolean changedInstance6;
        java.lang.Object obj3;
        boolean changed5;
        java.lang.Object obj4;
        int i8;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(debitCardProductName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1363417036);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(debitCardProductName.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                showDebitCardViewModel2 = showDebitCardViewModel;
                if (startRestartGroup.changedInstance(showDebitCardViewModel2)) {
                    i8 = 2048;
                    i3 |= i8;
                }
            } else {
                showDebitCardViewModel2 = showDebitCardViewModel;
            }
            i8 = 1024;
            i3 |= i8;
        } else {
            showDebitCardViewModel2 = showDebitCardViewModel;
        }
        int i9 = i3;
        if (startRestartGroup.shouldExecute((i9 & 1171) != 1170, i9 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i6 = i9 & (-7169);
                    i4 = 0;
                    showDebitCardViewModel4 = showDebitCardViewModel2;
                    i5 = i6;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    final com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
                    java.lang.Object[] objArr = new java.lang.Object[i4];
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    }
                    mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 48);
                    androidx.compose.runtime.State collectAsState = androidx.compose.runtime.SnapshotStateKt.collectAsState(showDebitCardViewModel4.getUiState(), null, startRestartGroup, i4, 1);
                    int i10 = i5 & 896;
                    if (i10 == 256) {
                    }
                    changed = startRestartGroup.changed(bottomSheetController);
                    java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                    if ((i7 | (changed ? 1 : 0)) == 0) {
                    }
                    kotlin.jvm.functions.Function0 function02 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$00DSWN0GQUJRnt24dhCN7ooXZas(com.paypal.pds.components.BottomSheetController.this, function0);
                        }
                    };
                    startRestartGroup.updateRememberedValue(function02);
                    obj = function02;
                    final kotlin.jvm.functions.Function0 function03 = (kotlin.jvm.functions.Function0) obj;
                    boolean visible = bottomSheetController.getVisible();
                    changed2 = startRestartGroup.changed(function03);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed2) {
                    }
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$RtKWU0gqblZoHUMjT6r2dkYzYpY(kotlin.jvm.functions.Function0.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                    androidx.view.compose.BackHandlerKt.BackHandler(visible, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 0, 0);
                    kotlin.Unit unit3 = kotlin.Unit.INSTANCE;
                    changedInstance = startRestartGroup.changedInstance(bottomSheetController);
                    changedInstance2 = startRestartGroup.changedInstance(showDebitCardViewModel4);
                    int i11 = i5 & 14;
                    int i12 = i5;
                    if (i11 == 4) {
                    }
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!(z | changedInstance | changedInstance2)) {
                    }
                    rememberedValue4 = new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$ShowDebitCardBottomSheet$3$1(bottomSheetController, showDebitCardViewModel4, str, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit3, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
                    unit = kotlin.Unit.INSTANCE;
                    changedInstance3 = startRestartGroup.changedInstance(showDebitCardViewModel4);
                    changed3 = startRestartGroup.changed(mutableState);
                    changedInstance4 = startRestartGroup.changedInstance(bottomSheetController);
                    if (i10 == 256) {
                    }
                    if (i11 == 4) {
                    }
                    changedInstance5 = startRestartGroup.changedInstance(context);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!(z2 | changedInstance3 | changed3 | changedInstance4 | z3 | changedInstance5)) {
                    }
                    mutableState2 = mutableState;
                    unit2 = unit;
                    rememberedValue5 = new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$ShowDebitCardBottomSheet$4$1(showDebitCardViewModel4, mutableState, bottomSheetController, function0, str, context, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 6);
                    kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState) collectAsState.getValue()).getClass());
                    changed4 = startRestartGroup.changed(collectAsState);
                    if ((i12 & 112) == 32) {
                    }
                    java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                    if (!(changed4 | z4)) {
                    }
                    obj2 = null;
                    showDebitCardBottomSheetKt$ShowDebitCardBottomSheet$5$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$ShowDebitCardBottomSheet$5$1(debitCardProductName, collectAsState, null);
                    startRestartGroup.updateRememberedValue(showDebitCardBottomSheetKt$ShowDebitCardBottomSheet$5$1);
                    androidx.compose.runtime.EffectsKt.LaunchedEffect(orCreateKotlinClass, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) showDebitCardBottomSheetKt$ShowDebitCardBottomSheet$5$1, startRestartGroup, 0);
                    androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.debitcard.shared.analytics.ShowCardAnalytics.INSTANCE.getUserIntent(debitCardProductName))), 0.0f, 1, obj2);
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState showDebitCardState = (com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState) collectAsState.getValue();
                    changedInstance6 = startRestartGroup.changedInstance(showDebitCardViewModel4);
                    java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
                    if (!changedInstance6) {
                    }
                    kotlin.jvm.functions.Function1 function1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj5) {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$z3tZ_qCzyrFZ8YMV0D9JwDHeonk(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel.this, (com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent) obj5);
                        }
                    };
                    startRestartGroup.updateRememberedValue(function1);
                    obj3 = function1;
                    Camera2StreamConfigurationMap(bottomSheetController, showDebitCardState, function03, (kotlin.jvm.functions.Function1) obj3, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable);
                    java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_toast_show_card_copied, startRestartGroup, 0);
                    boolean booleanValue = ((java.lang.Boolean) mutableState2.getValue()).booleanValue();
                    final androidx.compose.runtime.MutableState mutableState3 = mutableState2;
                    changed5 = startRestartGroup.changed(mutableState3);
                    java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
                    if (!changed5) {
                    }
                    kotlin.jvm.functions.Function0 function04 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$qU2E3SioXAD01flmouEdiJDKPLk(androidx.compose.runtime.MutableState.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(function04);
                    obj4 = function04;
                    com.paypal.oslo.feature.debitcard.shared.ui.components.ShowToastKt.ShowToast(stringResource, booleanValue, (kotlin.jvm.functions.Function0) obj4, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(boxScopeInstance.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 0.0f, 0.0f, 13, null), startRestartGroup, 0, 0);
                    startRestartGroup.endNode();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    showDebitCardViewModel3 = showDebitCardViewModel4;
                }
            } else if ((i2 & 8) != 0) {
                boolean z5 = (i9 & 14) == 4;
                java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                if (z5 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj5) {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$T8U6SFkPnwb7lp2kYkNAOq5lpsI(str, (com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel.Factory) obj5);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                }
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue10;
                androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                if (current == null) {
                    throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                }
                androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                    withCreationCallback = dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras(), function12);
                } else {
                    withCreationCallback = dagger.hilt.android.lifecycle.HiltViewModelExtensions.withCreationCallback(androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE, function12);
                }
                i4 = 0;
                showDebitCardViewModel4 = (com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel.class), current, str, createHiltViewModelFactory, withCreationCallback, startRestartGroup, (((i9 << 3) & 112) << 3) & 896, 0);
                i5 = i9 & (-7169);
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1363417036, i5, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheet (ShowDebitCardBottomSheet.kt:78)");
                }
                android.content.Context context2 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
                rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.pds.components.BottomSheetController();
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                final com.paypal.pds.components.BottomSheetController bottomSheetController2 = (com.paypal.pds.components.BottomSheetController) rememberedValue;
                java.lang.Object[] objArr2 = new java.lang.Object[i4];
                rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            androidx.compose.runtime.MutableState mutableStateOf$default;
                            mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                            return mutableStateOf$default;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr2, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 48);
                androidx.compose.runtime.State collectAsState2 = androidx.compose.runtime.SnapshotStateKt.collectAsState(showDebitCardViewModel4.getUiState(), null, startRestartGroup, i4, 1);
                int i102 = i5 & 896;
                i7 = i102 == 256 ? 1 : i4;
                changed = startRestartGroup.changed(bottomSheetController2);
                java.lang.Object rememberedValue62 = startRestartGroup.rememberedValue();
                if ((i7 | (changed ? 1 : 0)) == 0) {
                    obj = rememberedValue62;
                }
                kotlin.jvm.functions.Function0 function022 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$00DSWN0GQUJRnt24dhCN7ooXZas(com.paypal.pds.components.BottomSheetController.this, function0);
                    }
                };
                startRestartGroup.updateRememberedValue(function022);
                obj = function022;
                final kotlin.jvm.functions.Function0 function032 = (kotlin.jvm.functions.Function0) obj;
                boolean visible2 = bottomSheetController2.getVisible();
                changed2 = startRestartGroup.changed(function032);
                rememberedValue3 = startRestartGroup.rememberedValue();
                if (!changed2 || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$RtKWU0gqblZoHUMjT6r2dkYzYpY(kotlin.jvm.functions.Function0.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                androidx.view.compose.BackHandlerKt.BackHandler(visible2, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 0, 0);
                kotlin.Unit unit32 = kotlin.Unit.INSTANCE;
                changedInstance = startRestartGroup.changedInstance(bottomSheetController2);
                changedInstance2 = startRestartGroup.changedInstance(showDebitCardViewModel4);
                int i112 = i5 & 14;
                int i122 = i5;
                z = i112 == 4;
                rememberedValue4 = startRestartGroup.rememberedValue();
                if (!(z | changedInstance | changedInstance2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$ShowDebitCardBottomSheet$3$1(bottomSheetController2, showDebitCardViewModel4, str, null);
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit32, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
                unit = kotlin.Unit.INSTANCE;
                changedInstance3 = startRestartGroup.changedInstance(showDebitCardViewModel4);
                changed3 = startRestartGroup.changed(mutableState);
                changedInstance4 = startRestartGroup.changedInstance(bottomSheetController2);
                z2 = i102 == 256;
                z3 = i112 == 4;
                changedInstance5 = startRestartGroup.changedInstance(context2);
                rememberedValue5 = startRestartGroup.rememberedValue();
                if ((!(z2 | changedInstance3 | changed3 | changedInstance4 | z3) && !changedInstance5) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    mutableState2 = mutableState;
                    unit2 = unit;
                    rememberedValue5 = new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$ShowDebitCardBottomSheet$4$1(showDebitCardViewModel4, mutableState, bottomSheetController2, function0, str, context2, null);
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                } else {
                    mutableState2 = mutableState;
                    unit2 = unit;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 6);
                kotlin.reflect.KClass orCreateKotlinClass2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState) collectAsState2.getValue()).getClass());
                changed4 = startRestartGroup.changed(collectAsState2);
                z4 = (i122 & 112) == 32;
                java.lang.Object rememberedValue72 = startRestartGroup.rememberedValue();
                if ((!changed4 && !z4) || rememberedValue72 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    obj2 = null;
                    showDebitCardBottomSheetKt$ShowDebitCardBottomSheet$5$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$ShowDebitCardBottomSheet$5$1(debitCardProductName, collectAsState2, null);
                    startRestartGroup.updateRememberedValue(showDebitCardBottomSheetKt$ShowDebitCardBottomSheet$5$1);
                } else {
                    showDebitCardBottomSheetKt$ShowDebitCardBottomSheet$5$1 = rememberedValue72;
                    obj2 = null;
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(orCreateKotlinClass2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) showDebitCardBottomSheetKt$ShowDebitCardBottomSheet$5$1, startRestartGroup, 0);
                androidx.compose.ui.Modifier fillMaxSize$default2 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.debitcard.shared.analytics.ShowCardAnalytics.INSTANCE.getUserIntent(debitCardProductName))), 0.0f, 1, obj2);
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default2);
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
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState showDebitCardState2 = (com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState) collectAsState2.getValue();
                changedInstance6 = startRestartGroup.changedInstance(showDebitCardViewModel4);
                java.lang.Object rememberedValue82 = startRestartGroup.rememberedValue();
                if (!changedInstance6) {
                    obj3 = rememberedValue82;
                }
                kotlin.jvm.functions.Function1 function13 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj5) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$z3tZ_qCzyrFZ8YMV0D9JwDHeonk(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel.this, (com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent) obj5);
                    }
                };
                startRestartGroup.updateRememberedValue(function13);
                obj3 = function13;
                Camera2StreamConfigurationMap(bottomSheetController2, showDebitCardState2, function032, (kotlin.jvm.functions.Function1) obj3, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable);
                java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_toast_show_card_copied, startRestartGroup, 0);
                boolean booleanValue2 = ((java.lang.Boolean) mutableState2.getValue()).booleanValue();
                final androidx.compose.runtime.MutableState mutableState32 = mutableState2;
                changed5 = startRestartGroup.changed(mutableState32);
                java.lang.Object rememberedValue92 = startRestartGroup.rememberedValue();
                if (!changed5) {
                    obj4 = rememberedValue92;
                }
                kotlin.jvm.functions.Function0 function042 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$qU2E3SioXAD01flmouEdiJDKPLk(androidx.compose.runtime.MutableState.this);
                    }
                };
                startRestartGroup.updateRememberedValue(function042);
                obj4 = function042;
                com.paypal.oslo.feature.debitcard.shared.ui.components.ShowToastKt.ShowToast(stringResource2, booleanValue2, (kotlin.jvm.functions.Function0) obj4, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(boxScopeInstance2.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 0.0f, 0.0f, 13, null), startRestartGroup, 0, 0);
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                showDebitCardViewModel3 = showDebitCardViewModel4;
            }
            i4 = 0;
            i6 = i9;
            showDebitCardViewModel4 = showDebitCardViewModel2;
            i5 = i6;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            android.content.Context context22 = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController22 = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            java.lang.Object[] objArr22 = new java.lang.Object[i4];
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
            }
            mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr22, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 48);
            androidx.compose.runtime.State collectAsState22 = androidx.compose.runtime.SnapshotStateKt.collectAsState(showDebitCardViewModel4.getUiState(), null, startRestartGroup, i4, 1);
            int i1022 = i5 & 896;
            if (i1022 == 256) {
            }
            changed = startRestartGroup.changed(bottomSheetController22);
            java.lang.Object rememberedValue622 = startRestartGroup.rememberedValue();
            if ((i7 | (changed ? 1 : 0)) == 0) {
            }
            kotlin.jvm.functions.Function0 function0222 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$00DSWN0GQUJRnt24dhCN7ooXZas(com.paypal.pds.components.BottomSheetController.this, function0);
                }
            };
            startRestartGroup.updateRememberedValue(function0222);
            obj = function0222;
            final kotlin.jvm.functions.Function0 function0322 = (kotlin.jvm.functions.Function0) obj;
            boolean visible22 = bottomSheetController22.getVisible();
            changed2 = startRestartGroup.changed(function0322);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$RtKWU0gqblZoHUMjT6r2dkYzYpY(kotlin.jvm.functions.Function0.this);
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue3);
            androidx.view.compose.BackHandlerKt.BackHandler(visible22, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 0, 0);
            kotlin.Unit unit322 = kotlin.Unit.INSTANCE;
            changedInstance = startRestartGroup.changedInstance(bottomSheetController22);
            changedInstance2 = startRestartGroup.changedInstance(showDebitCardViewModel4);
            int i1122 = i5 & 14;
            int i1222 = i5;
            if (i1122 == 4) {
            }
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!(z | changedInstance | changedInstance2)) {
            }
            rememberedValue4 = new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$ShowDebitCardBottomSheet$3$1(bottomSheetController22, showDebitCardViewModel4, str, null);
            startRestartGroup.updateRememberedValue(rememberedValue4);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit322, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
            unit = kotlin.Unit.INSTANCE;
            changedInstance3 = startRestartGroup.changedInstance(showDebitCardViewModel4);
            changed3 = startRestartGroup.changed(mutableState);
            changedInstance4 = startRestartGroup.changedInstance(bottomSheetController22);
            if (i1022 == 256) {
            }
            if (i1122 == 4) {
            }
            changedInstance5 = startRestartGroup.changedInstance(context22);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!(z2 | changedInstance3 | changed3 | changedInstance4 | z3 | changedInstance5)) {
            }
            mutableState2 = mutableState;
            unit2 = unit;
            rememberedValue5 = new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$ShowDebitCardBottomSheet$4$1(showDebitCardViewModel4, mutableState, bottomSheetController22, function0, str, context22, null);
            startRestartGroup.updateRememberedValue(rememberedValue5);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 6);
            kotlin.reflect.KClass orCreateKotlinClass22 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(((com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState) collectAsState22.getValue()).getClass());
            changed4 = startRestartGroup.changed(collectAsState22);
            if ((i1222 & 112) == 32) {
            }
            java.lang.Object rememberedValue722 = startRestartGroup.rememberedValue();
            if (!(changed4 | z4)) {
            }
            obj2 = null;
            showDebitCardBottomSheetKt$ShowDebitCardBottomSheet$5$1 = new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$ShowDebitCardBottomSheet$5$1(debitCardProductName, collectAsState22, null);
            startRestartGroup.updateRememberedValue(showDebitCardBottomSheetKt$ShowDebitCardBottomSheet$5$1);
            androidx.compose.runtime.EffectsKt.LaunchedEffect(orCreateKotlinClass22, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) showDebitCardBottomSheetKt$ShowDebitCardBottomSheet$5$1, startRestartGroup, 0);
            androidx.compose.ui.Modifier fillMaxSize$default22 = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.context(androidx.compose.ui.Modifier.INSTANCE, kotlin.collections.CollectionsKt.listOf(com.paypal.oslo.feature.debitcard.shared.analytics.ShowCardAnalytics.INSTANCE.getUserIntent(debitCardProductName))), 0.0f, 1, obj2);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy22 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
            int hashCode22 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap22 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier22 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default22);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor22 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
            }
            androidx.compose.runtime.Composer m5299constructorimpl22 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, maybeCachedBoxMeasurePolicy22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, currentCompositionLocalMap22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl22, java.lang.Integer.valueOf(hashCode22), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl22, materializeModifier22, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance22 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState showDebitCardState22 = (com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState) collectAsState22.getValue();
            changedInstance6 = startRestartGroup.changedInstance(showDebitCardViewModel4);
            java.lang.Object rememberedValue822 = startRestartGroup.rememberedValue();
            if (!changedInstance6) {
            }
            kotlin.jvm.functions.Function1 function132 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj5) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$z3tZ_qCzyrFZ8YMV0D9JwDHeonk(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel.this, (com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent) obj5);
                }
            };
            startRestartGroup.updateRememberedValue(function132);
            obj3 = function132;
            Camera2StreamConfigurationMap(bottomSheetController22, showDebitCardState22, function0322, (kotlin.jvm.functions.Function1) obj3, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable);
            java.lang.String stringResource22 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_toast_show_card_copied, startRestartGroup, 0);
            boolean booleanValue22 = ((java.lang.Boolean) mutableState2.getValue()).booleanValue();
            final androidx.compose.runtime.MutableState mutableState322 = mutableState2;
            changed5 = startRestartGroup.changed(mutableState322);
            java.lang.Object rememberedValue922 = startRestartGroup.rememberedValue();
            if (!changed5) {
            }
            kotlin.jvm.functions.Function0 function0422 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function0
                public final java.lang.Object invoke() {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$qU2E3SioXAD01flmouEdiJDKPLk(androidx.compose.runtime.MutableState.this);
                }
            };
            startRestartGroup.updateRememberedValue(function0422);
            obj4 = function0422;
            com.paypal.oslo.feature.debitcard.shared.ui.components.ShowToastKt.ShowToast(stringResource22, booleanValue22, (kotlin.jvm.functions.Function0) obj4, androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(boxScopeInstance22.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getTopCenter()), 0.0f, com.paypal.pds.core.ConstantsKt.getSize16(), 0.0f, 0.0f, 13, null), startRestartGroup, 0, 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            showDebitCardViewModel3 = showDebitCardViewModel4;
        } else {
            startRestartGroup.skipToGroupEnd();
            showDebitCardViewModel3 = showDebitCardViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj5, java.lang.Object obj6) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$qmJE74UTri_ycTo6zfJYmei6bPs(str, debitCardProductName, function0, showDebitCardViewModel3, i, i2, (androidx.compose.runtime.Composer) obj5, ((java.lang.Integer) obj6).intValue());
                }
            });
        }
    }

    private static final void Camera2StreamConfigurationMap(final com.paypal.pds.components.BottomSheetController bottomSheetController, final com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState showDebitCardState, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        java.lang.String str;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(230448340);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(bottomSheetController) : startRestartGroup.changedInstance(bottomSheetController) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(showDebitCardState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(230448340, i2, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetContent (ShowDebitCardBottomSheet.kt:184)");
            }
            if (!(showDebitCardState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Error)) {
                startRestartGroup.startReplaceGroup(1929064307);
                str = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.debitcard.R.string.feature_debit_card_show_card_title, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1929158826);
                startRestartGroup.endReplaceGroup();
                str = null;
            }
            com.paypal.pds.components.TopNavConfig topNavConfig = new com.paypal.pds.components.TopNavConfig(str, false, null, 6, null);
            int i3 = i2 & 896;
            boolean z = i3 == 256;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$xPHEbDQgz2ILecXbJqqwZttw_Fg(kotlin.jvm.functions.Function0.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function02 = (kotlin.jvm.functions.Function0) rememberedValue;
            boolean z2 = i3 == 256;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.m14503$r8$lambda$w19MzL0uJ6fTQjy2V49RMHFk8A(kotlin.jvm.functions.Function0.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            composer2 = startRestartGroup;
            com.paypal.pds.components.ModalKt.Modal(bottomSheetController, function02, topNavConfig, null, null, null, (kotlin.jvm.functions.Function0) rememberedValue2, false, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(233261403, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.m14502$r8$lambda$ejHRVcyJgFYbQ6IpNUGwgpKfg(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.this, function1, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 805306368 | (i2 & 14) | (com.paypal.pds.components.TopNavConfig.$stable << 6), 440);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$jcJSktWwBaAv5I02WTRbOoqTaII(com.paypal.pds.components.BottomSheetController.this, showDebitCardState, function0, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$00DSWN0GQUJRnt24dhCN7ooXZas(com.paypal.pds.components.BottomSheetController bottomSheetController, kotlin.jvm.functions.Function0 function0) {
        bottomSheetController.hideSheet();
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0V0yvQOHkOEa3Ov_T6vJjDM85yQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(628586445);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(628586445, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetContentErrorPreview (ShowDebitCardBottomSheet.kt:283)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Error error = new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Error(com.paypal.oslo.feature.publicprofile.analytics.PublicProfileAnalyticsConstants.ERROR_CODE_UNKNOWN_ERROR, com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType.RECOVERABLE, 0, 4, null);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda23
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
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda24
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$8XDLclrr_ihMdybMs0QGQyD3z7U((com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Camera2StreamConfigurationMap(bottomSheetController, error, function0, (kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 3456);
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.ui.Modifier align = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenter());
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$5Tp5apncAImIlJItpPnYJQEMc0U(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue4, "Show Error Modal", align, null, null, null, null, false, false, startRestartGroup, 48, 504);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$0V0yvQOHkOEa3Ov_T6vJjDM85yQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$1nZ4FtAtaXL9dC5fGaYC7kYQuuM(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.showSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5Tp5apncAImIlJItpPnYJQEMc0U(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.showSheet();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$8XDLclrr_ihMdybMs0QGQyD3z7U(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent showDebitCardEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showDebitCardEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$8jrCWwf-Nfzh8745qlrLZMbhLBU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14500$r8$lambda$8jrCWwfNfzh8745qlrLZMbhLBU(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent showDebitCardEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showDebitCardEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$G_7y8ogrCYWYjWHXZT4sb3NJmxE(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1093033592);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1093033592, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetContentSuccessPreview (ShowDebitCardBottomSheet.kt:235)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Success success = new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Success(new com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails("", "5581585227012198", "2198", "088", "2029-11", com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardScheme.MASTER_CARD, com.paypal.oslo.feature.debitcard.shared.domain.model.DebitInstrumentLifecycleState.ACTIVE));
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda19
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
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$xYjgx_a_C_qWIscuf_uIoJQXu2I((com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Camera2StreamConfigurationMap(bottomSheetController, success, function0, (kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 3456);
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.ui.Modifier align = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenter());
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$1nZ4FtAtaXL9dC5fGaYC7kYQuuM(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue4, "Show Success Modal", align, null, null, null, null, false, false, startRestartGroup, 48, 504);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda22
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$G_7y8ogrCYWYjWHXZT4sb3NJmxE(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$RtKWU0gqblZoHUMjT6r2dkYzYpY(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel $r8$lambda$T8U6SFkPnwb7lp2kYkNAOq5lpsI(java.lang.String str, com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel.Factory factory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        return factory.create(str);
    }

    /* renamed from: $r8$lambda$Vg8KcVaF5z-QUI5WMxnFpz9Q_6M, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14501$r8$lambda$Vg8KcVaF5zQUI5WMxnFpz9Q_6M(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.CopyButtonClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eY1n4QX05XcU3zPpUplAlydwwZQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-853449855);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-853449855, updateChangedFlags, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetContentLoadingPreview (ShowDebitCardBottomSheet.kt:264)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue;
            com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Loading loading = new com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Loading(0, 1, null);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda0
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
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.m14500$r8$lambda$8jrCWwfNfzh8745qlrLZMbhLBU((com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            Camera2StreamConfigurationMap(bottomSheetController, loading, function0, (kotlin.jvm.functions.Function1) rememberedValue3, startRestartGroup, com.paypal.pds.components.BottomSheetController.$stable | 3456);
            androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.ui.Modifier align = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE.align(androidx.compose.ui.Modifier.INSTANCE, androidx.compose.ui.Alignment.INSTANCE.getCenter());
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$sFqGxJg0yZBPGxXt0kNhJEslenM(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue4, "Show Loading Modal", align, null, null, null, null, false, false, startRestartGroup, 48, 504);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$eY1n4QX05XcU3zPpUplAlydwwZQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$ejHRVcyJg-FYbQ6-IpNUGwgpKfg, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14502$r8$lambda$ejHRVcyJgFYbQ6IpNUGwgpKfg(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState showDebitCardState, final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(233261403, i, -1, "com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetContent.<anonymous> (ShowDebitCardBottomSheet.kt:201)");
            }
            if ((showDebitCardState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Initial) || (showDebitCardState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Loading)) {
                composer.startReplaceGroup(-166508679);
                com.paypal.oslo.feature.debitcard.servicing.ui.showcard.components.ShowDebitCardContentKt.ShowDebitCardContent(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardStateKt.getPlaceholderCardDetails(), null, true, null, composer, 390, 10);
                composer.endReplaceGroup();
            } else if (showDebitCardState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Success) {
                composer.startReplaceGroup(-166285510);
                com.paypal.oslo.feature.debitcard.servicing.domain.showcard.model.DebitCardDetails cardDetails = ((com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Success) showDebitCardState).getCardDetails();
                boolean changed = composer.changed(function1);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.m14501$r8$lambda$Vg8KcVaF5zQUI5WMxnFpz9Q_6M(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.oslo.feature.debitcard.servicing.ui.showcard.components.ShowDebitCardContentKt.ShowDebitCardContent(cardDetails, null, false, (kotlin.jvm.functions.Function0) rememberedValue, composer, 384, 2);
                composer.endReplaceGroup();
            } else {
                if (!(showDebitCardState instanceof com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Error)) {
                    composer.startReplaceGroup(825910206);
                    composer.endReplaceGroup();
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-165941906);
                com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Error error = (com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState.Error) showDebitCardState;
                com.paypal.oslo.feature.debitcard.shared.ui.model.DebitErrorType errorType = error.getErrorType();
                int retryCount = error.getRetryCount();
                boolean changed2 = composer.changed(function1);
                java.lang.Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.debitcard.servicing.ui.showcard.ShowDebitCardBottomSheetKt.$r8$lambda$pKILUlwGfZMf19s8PNuXpk7zIzU(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.debitcard.servicing.ui.showcard.components.ShowDebitCardErrorContentKt.ShowDebitCardErrorContent(errorType, java.lang.Integer.valueOf(retryCount), (kotlin.jvm.functions.Function0) rememberedValue2, null, composer, 0, 8);
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

    public static /* synthetic */ kotlin.Unit $r8$lambda$jcJSktWwBaAv5I02WTRbOoqTaII(com.paypal.pds.components.BottomSheetController bottomSheetController, com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState showDebitCardState, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(bottomSheetController, showDebitCardState, function0, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pKILUlwGfZMf19s8PNuXpk7zIzU(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent.ErrorStateCtaClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qU2E3SioXAD01flmouEdiJDKPLk(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qmJE74UTri_ycTo6zfJYmei6bPs(java.lang.String str, com.paypal.oslo.feature.debitcard.api.model.DebitCardProductName debitCardProductName, kotlin.jvm.functions.Function0 function0, com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel showDebitCardViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ShowDebitCardBottomSheet(str, debitCardProductName, function0, showDebitCardViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sFqGxJg0yZBPGxXt0kNhJEslenM(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.showSheet();
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$w19MzL-0uJ6fTQjy2V49RMHFk8A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m14503$r8$lambda$w19MzL0uJ6fTQjy2V49RMHFk8A(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xPHEbDQgz2ILecXbJqqwZttw_Fg(kotlin.jvm.functions.Function0 function0) {
        function0.invoke();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$xYjgx_a_C_qWIscuf_uIoJQXu2I(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent showDebitCardEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showDebitCardEvent, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$z3tZ_qCzyrFZ8YMV0D9JwDHeonk(com.paypal.oslo.feature.debitcard.servicing.ui.showcard.viewmodel.ShowDebitCardViewModel showDebitCardViewModel, com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardEvent showDebitCardEvent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(showDebitCardEvent, "");
        showDebitCardViewModel.processEvent(showDebitCardEvent);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState access$ShowDebitCardBottomSheet$lambda$3(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.debitcard.servicing.ui.showcard.mvi.ShowDebitCardState) state.getValue();
    }
}
