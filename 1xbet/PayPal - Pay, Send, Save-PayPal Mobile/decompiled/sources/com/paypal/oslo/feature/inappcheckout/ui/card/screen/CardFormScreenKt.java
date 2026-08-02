package com.paypal.oslo.feature.inappcheckout.ui.card.screen;

@kotlin.Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0001¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u008a\u0084\u0002²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u008a\u0084\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002"}, d2 = {"CardFormScreen", "", "inAppCheckoutCoordinator", "Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutCoordinator;", "cardSharedViewModel", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/viewmodel/CardSharedViewModel;", "viewModel", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/viewmodel/CardFormViewModel;", "operationType", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$OperationType;", "updateCardParams", "Lcom/paypal/oslo/feature/inappcheckout/domain/model/UpdateCardParams;", "(Lcom/paypal/oslo/feature/inappcheckout/navigation/coordinator/InAppCheckoutCoordinator;Lcom/paypal/oslo/feature/inappcheckout/ui/card/viewmodel/CardSharedViewModel;Lcom/paypal/oslo/feature/inappcheckout/ui/card/viewmodel/CardFormViewModel;Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$OperationType;Lcom/paypal/oslo/feature/inappcheckout/domain/model/UpdateCardParams;Landroidx/compose/runtime/Composer;II)V", "inappcheckout_prodRelease", "state", "Lcom/paypal/oslo/feature/inappcheckout/ui/card/contract/CardFormContract$State;", "cardFormData", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/CardFormDataEntity;", "fiMetadata", "Lcom/paypal/oslo/feature/inappcheckout/domain/entity/FIMetadataEntity;", "isCardFormDataLoading", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CardFormScreenKt {
    public static final void CardFormScreen(final com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel cardSharedViewModel, com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel cardFormViewModel, com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType, com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel cardSharedViewModel2;
        com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel cardFormViewModel2;
        com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams2;
        final com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel cardFormViewModel3;
        final com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType2;
        com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams3;
        final com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel cardSharedViewModel3;
        int i4;
        com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel cardSharedViewModel4;
        com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel cardFormViewModel4;
        int i5;
        com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams4;
        final com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel cardFormViewModel5;
        int i6;
        com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty2;
        androidx.compose.runtime.State state;
        com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType4;
        com.paypal.pds.components.DropdownState dropdownState;
        int i7;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inAppCheckoutCoordinator, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(939908670);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(inAppCheckoutCoordinator) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                cardSharedViewModel2 = cardSharedViewModel;
                if (startRestartGroup.changedInstance(cardSharedViewModel2)) {
                    i7 = 32;
                    i3 |= i7;
                }
            } else {
                cardSharedViewModel2 = cardSharedViewModel;
            }
            i7 = 16;
            i3 |= i7;
        } else {
            cardSharedViewModel2 = cardSharedViewModel;
        }
        if ((i & 384) == 0) {
            cardFormViewModel2 = cardFormViewModel;
            i3 |= ((i2 & 4) == 0 && startRestartGroup.changedInstance(cardFormViewModel2)) ? 256 : 128;
        } else {
            cardFormViewModel2 = cardFormViewModel;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(operationType == null ? -1 : operationType.ordinal()) ? 2048 : 1024;
        }
        int i9 = i2 & 16;
        if (i9 != 0) {
            i3 |= 24576;
            updateCardParams2 = updateCardParams;
        } else {
            updateCardParams2 = updateCardParams;
            if ((i & 24576) == 0) {
                i3 |= startRestartGroup.changed(updateCardParams2) ? 16384 : 8192;
            }
        }
        if (startRestartGroup.shouldExecute((i3 & 9363) != 9362, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                i4 = -1;
                cardFormViewModel5 = cardFormViewModel2;
                operationType3 = operationType;
                i6 = i3;
                cardSharedViewModel4 = cardSharedViewModel2;
                updateCardParams4 = updateCardParams2;
            } else {
                if ((i2 & 2) != 0) {
                    java.lang.Object consume = startRestartGroup.consume(androidx.view.compose.LocalActivityKt.getLocalActivity());
                    kotlin.jvm.internal.Intrinsics.checkNotNull(consume, "");
                    androidx.view.ComponentActivity componentActivity = (androidx.view.ComponentActivity) consume;
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(componentActivity, startRestartGroup, 0);
                    if (componentActivity instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty2 = componentActivity.getDefaultViewModelCreationExtras();
                    } else {
                        empty2 = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    i4 = -1;
                    cardSharedViewModel2 = (com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel.class), componentActivity, (java.lang.String) null, createHiltViewModelFactory, empty2, startRestartGroup, 0, 0);
                    i3 &= -113;
                } else {
                    i4 = -1;
                }
                int i10 = i3;
                cardSharedViewModel4 = cardSharedViewModel2;
                if ((i2 & 4) != 0) {
                    androidx.view.ViewModelStoreOwner current = androidx.view.viewmodel.compose.LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, androidx.view.viewmodel.compose.LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
                    }
                    androidx.lifecycle.ViewModelProvider.Factory createHiltViewModelFactory2 = androidx.hilt.lifecycle.viewmodel.compose.HiltViewModelKt.createHiltViewModelFactory(current, startRestartGroup, 0);
                    if (current instanceof androidx.view.HasDefaultViewModelProviderFactory) {
                        empty = ((androidx.view.HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                    } else {
                        empty = androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
                    }
                    cardFormViewModel4 = (com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory2, empty, startRestartGroup, 0, 0);
                    i5 = i10 & (-897);
                } else {
                    cardFormViewModel4 = cardFormViewModel;
                    i5 = i10;
                }
                com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType5 = i8 != 0 ? com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType.ADD : operationType;
                if (i9 != 0) {
                    cardFormViewModel5 = cardFormViewModel4;
                    i6 = i5;
                    operationType3 = operationType5;
                    updateCardParams4 = null;
                } else {
                    updateCardParams4 = updateCardParams;
                    cardFormViewModel5 = cardFormViewModel4;
                    i6 = i5;
                    operationType3 = operationType5;
                }
            }
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(939908670, i6, i4, "com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreen (CardFormScreen.kt:63)");
            }
            android.content.Context context = (android.content.Context) startRestartGroup.consume(androidx.compose.ui.platform.AndroidCompositionLocals_androidKt.getLocalContext());
            int i11 = i6;
            com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams5 = updateCardParams4;
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(cardFormViewModel5.getState(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            com.paypal.oslo.feature.inappcheckout.domain.model.ValidationErrors validateFields = cardFormViewModel5.validateFields((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State) collectAsStateWithLifecycle.getValue());
            androidx.compose.runtime.State collectAsStateWithLifecycle2 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(cardSharedViewModel4.getCardFormData(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            androidx.compose.runtime.State collectAsStateWithLifecycle3 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(cardSharedViewModel4.getFiMetadata(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            androidx.compose.runtime.State collectAsStateWithLifecycle4 = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(cardSharedViewModel4.isCardFormDataLoading(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            int i12 = i11 & 7168;
            boolean z = i12 == 2048;
            int i13 = 57344 & i11;
            boolean z2 = i13 == 16384;
            boolean changedInstance = startRestartGroup.changedInstance(cardSharedViewModel4);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if ((z | z2 | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt$CardFormScreen$1$1(operationType3, updateCardParams5, cardSharedViewModel4, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 6);
            com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormDataEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity) collectAsStateWithLifecycle2.getValue();
            com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity fIMetadataEntity = (com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity) collectAsStateWithLifecycle3.getValue();
            boolean booleanValue = ((java.lang.Boolean) collectAsStateWithLifecycle4.getValue()).booleanValue();
            boolean changedInstance2 = startRestartGroup.changedInstance(cardFormViewModel5);
            boolean z3 = i12 == 2048;
            boolean z4 = i13 == 16384;
            boolean changed = startRestartGroup.changed(collectAsStateWithLifecycle2);
            boolean changed2 = startRestartGroup.changed(collectAsStateWithLifecycle3);
            boolean changed3 = startRestartGroup.changed(collectAsStateWithLifecycle4);
            com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel cardSharedViewModel5 = cardSharedViewModel4;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (((changedInstance2 | z3 | z4 | changed | changed2) || changed3) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                state = collectAsStateWithLifecycle4;
                operationType4 = operationType3;
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt$CardFormScreen$2$1(cardFormViewModel5, operationType3, updateCardParams5, collectAsStateWithLifecycle2, collectAsStateWithLifecycle3, collectAsStateWithLifecycle4, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            } else {
                state = collectAsStateWithLifecycle4;
                operationType4 = operationType3;
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(cardFormDataEntity, fIMetadataEntity, java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 0);
            kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
            boolean changedInstance3 = startRestartGroup.changedInstance(cardFormViewModel5);
            boolean z5 = (i11 & 14) == 4;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if ((z5 | changedInstance3) || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt$CardFormScreen$3$1(cardFormViewModel5, inAppCheckoutCoordinator, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit2, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue3, startRestartGroup, 6);
            com.paypal.pds.components.DropdownState rememberDropdownState = com.paypal.pds.components.DropdownKt.rememberDropdownState(startRestartGroup, 0);
            com.paypal.pds.components.DropdownState rememberDropdownState2 = com.paypal.pds.components.DropdownKt.rememberDropdownState(startRestartGroup, 0);
            boolean z6 = ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State) collectAsStateWithLifecycle.getValue()).getOperationType() == com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType.ADD;
            int cardFormScreenTitle = com.paypal.oslo.feature.inappcheckout.ui.util.CardUtilsKt.getCardFormScreenTitle(((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State) collectAsStateWithLifecycle.getValue()).getOperationType());
            boolean isBillingAddressExpanded = ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State) collectAsStateWithLifecycle.getValue()).isBillingAddressExpanded();
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
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier imePadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.imePadding(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null));
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, imePadding);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.pds.core.Icon.ChevronLeft chevronLeft = com.paypal.pds.core.Icon.ChevronLeft.INSTANCE;
            boolean changedInstance4 = startRestartGroup.changedInstance(cardFormViewModel5);
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance4 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt.$r8$lambda$87owZDzSz24WvHPChVygkHnDyac(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderKt.InAppCheckoutHeader(new com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderLeftContent.IconContent(chevronLeft, (kotlin.jvm.functions.Function0) rememberedValue4, null, com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, com.paypal.oslo.feature.inappcheckout.R.string.feature_inappcheckout_back_button_content_description, new java.lang.Object[0], startRestartGroup, 0), 4, null), new com.paypal.oslo.feature.inappcheckout.ui.common.InAppCheckoutHeaderCenterContent.Title(com.paypal.oslo.feature.inappcheckout.ui.UiUtilsKt.rememberStringValue(context, cardFormScreenTitle, new java.lang.Object[0], startRestartGroup, 0), com.paypal.pds.core.Typography.TitleLarge.INSTANCE), androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 1, null), null, startRestartGroup, 0, 8);
            com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error error = ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State) collectAsStateWithLifecycle.getValue()).getError();
            if (error instanceof com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error.ApiError) {
                startRestartGroup.startReplaceGroup(423586039);
                dropdownState = rememberDropdownState2;
                com.paypal.oslo.feature.inappcheckout.ui.ryp.screen.RypPageAlertKt.PageAlert(com.paypal.oslo.feature.inappcheckout.domain.model.PageAlertType.CARD_SAVE_ERROR, null, com.paypal.pds.components.BannerStyle.Negative.INSTANCE, ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Error.ApiError) error).getMessage(), null, startRestartGroup, 390, 18);
                startRestartGroup.endReplaceGroup();
            } else {
                dropdownState = rememberDropdownState2;
                startRestartGroup.startReplaceGroup(423786888);
                startRestartGroup.endReplaceGroup();
            }
            androidx.compose.ui.Modifier m1710paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.ColumnScope.weight$default(columnScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), androidx.compose.foundation.ScrollKt.rememberScrollState(0, startRestartGroup, 0, 1), false, null, false, 14, null), com.paypal.pds.core.ConstantsKt.getSpacing20(), 0.0f, 2, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 0.0f, 13, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing16()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, m1710paddingqDBjuR0$default);
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
            com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails = ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State) collectAsStateWithLifecycle.getValue()).getCardDetails();
            boolean changedInstance5 = startRestartGroup.changedInstance(cardFormViewModel5);
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (changedInstance5 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt.$r8$lambda$QaL1xN2rSm6dX0gufimXPHjQQvo(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel.this, (com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            cardFormViewModel3 = cardFormViewModel5;
            com.paypal.oslo.feature.inappcheckout.ui.card.screen.NameInputSectionKt.NameInputSection(cardDetails, (kotlin.jvm.functions.Function1) rememberedValue5, validateFields, ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State) collectAsStateWithLifecycle.getValue()).getCardValidations(), null, ((java.lang.Boolean) state.getValue()).booleanValue(), z6, startRestartGroup, 0, 16);
            com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails2 = ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State) collectAsStateWithLifecycle.getValue()).getCardDetails();
            com.paypal.oslo.feature.inappcheckout.domain.entity.FinancialInstrumentMetadataDefinition cardValidations = ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State) collectAsStateWithLifecycle.getValue()).getCardValidations();
            boolean booleanValue2 = ((java.lang.Boolean) state.getValue()).booleanValue();
            boolean changedInstance6 = startRestartGroup.changedInstance(cardFormViewModel3);
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (changedInstance6 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt.$r8$lambda$3EoWEt9EPQ0hGkhwC2WU7GJ11Wk(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel.this, (com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardDetailsFieldsKt.CardDetailsFields(cardDetails2, (kotlin.jvm.functions.Function1) rememberedValue6, validateFields, cardValidations, null, z6, booleanValue2, startRestartGroup, 0, 16);
            if (!isBillingAddressExpanded) {
                startRestartGroup.startReplaceGroup(363687495);
                com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity cardFormDataResponse = ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State) collectAsStateWithLifecycle.getValue()).getCardFormDataResponse();
                java.util.List<com.paypal.oslo.feature.inappcheckout.domain.entity.SavedAddress> addresses = cardFormDataResponse != null ? cardFormDataResponse.getAddresses() : null;
                java.lang.String selectedAddressId = ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State) collectAsStateWithLifecycle.getValue()).getSelectedAddressId();
                boolean changedInstance7 = startRestartGroup.changedInstance(cardFormViewModel3);
                java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
                if (changedInstance7 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt.$r8$lambda$m2fp2TwO0AnWbnHN4Ao7Bxbg5BA(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel.this, (java.lang.String) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue7);
                }
                com.paypal.oslo.feature.inappcheckout.ui.card.screen.AddressDropdownKt.AddressDropdown(dropdownState, addresses, selectedAddressId, (kotlin.jvm.functions.Function1) rememberedValue7, null, ((java.lang.Boolean) state.getValue()).booleanValue(), startRestartGroup, com.paypal.pds.components.DropdownState.$stable, 16);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(364190098);
                startRestartGroup.endReplaceGroup();
            }
            com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress billingAddress = ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State) collectAsStateWithLifecycle.getValue()).getBillingAddress();
            boolean changedInstance8 = startRestartGroup.changedInstance(cardFormViewModel3);
            java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (changedInstance8 || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt.m15481$r8$lambda$PG9Wzk1SAUzFxf2GUP4dt9Fie0(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel.this, (com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue8;
            java.util.Map<java.lang.String, java.lang.String> stateList = ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State) collectAsStateWithLifecycle.getValue()).getStateList();
            boolean z7 = ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State) collectAsStateWithLifecycle.getValue()).getSelectedAddressId() != null && isBillingAddressExpanded;
            boolean z8 = ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State) collectAsStateWithLifecycle.getValue()).isLoading() || ((java.lang.Boolean) state.getValue()).booleanValue();
            boolean changedInstance9 = startRestartGroup.changedInstance(cardFormViewModel3);
            java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (changedInstance9 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt.$r8$lambda$ECyu1CkIlqapTyBqLzMobuA5MTg(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue9;
            boolean changedInstance10 = startRestartGroup.changedInstance(cardFormViewModel3);
            java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
            if (changedInstance10 || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue10 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt.m15482$r8$lambda$VXvpCzZuwyYGeSsaDxhCEopc8(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue10);
            }
            com.paypal.oslo.feature.inappcheckout.ui.card.screen.BillingAddressFormKt.BillingAddressForm(billingAddress, function1, rememberDropdownState, validateFields, null, stateList, isBillingAddressExpanded, !isBillingAddressExpanded, z7, z8, function0, (kotlin.jvm.functions.Function0) rememberedValue10, startRestartGroup, com.paypal.pds.components.DropdownState.$stable << 6, 0, 16);
            startRestartGroup.endNode();
            boolean changedInstance11 = startRestartGroup.changedInstance(cardFormViewModel3);
            java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
            if (changedInstance11 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue11 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt.$r8$lambda$nloGPXvTNJAblcjaCOOT9wuV6tY(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue11);
            }
            com.paypal.oslo.feature.inappcheckout.ui.card.screen.SaveButtonKt.SaveButton((kotlin.jvm.functions.Function0) rememberedValue11, null, null, false, ((com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.State) collectAsStateWithLifecycle.getValue()).isLoading(), startRestartGroup, 0, 14);
            startRestartGroup.endNode();
            com.paypal.pds.components.DropdownKt.DropdownBottomSheet(dropdownState, startRestartGroup, com.paypal.pds.components.DropdownState.$stable);
            com.paypal.pds.components.DropdownKt.DropdownBottomSheet(rememberDropdownState, startRestartGroup, com.paypal.pds.components.DropdownState.$stable);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            updateCardParams3 = updateCardParams5;
            operationType2 = operationType4;
            cardSharedViewModel3 = cardSharedViewModel5;
        } else {
            startRestartGroup.skipToGroupEnd();
            cardFormViewModel3 = cardFormViewModel;
            operationType2 = operationType;
            updateCardParams3 = updateCardParams;
            cardSharedViewModel3 = cardSharedViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel cardFormViewModel6 = cardFormViewModel3;
            final com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams6 = updateCardParams3;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.inappcheckout.ui.card.screen.CardFormScreenKt.$r8$lambda$On3g8dXnqNnDVPrYvgqZajwGUIA(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator.this, cardSharedViewModel3, cardFormViewModel6, operationType2, updateCardParams6, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3EoWEt9EPQ0hGkhwC2WU7GJ11Wk(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel cardFormViewModel, com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetails, "");
        cardFormViewModel.onEvent(new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.UpdateUserInput(new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput.CardDetailsInput(cardDetails)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$87owZDzSz24WvHPChVygkHnDyac(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel cardFormViewModel) {
        cardFormViewModel.onEvent(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.BackClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ECyu1CkIlqapTyBqLzMobuA5MTg(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel cardFormViewModel) {
        cardFormViewModel.onEvent(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.AddBillingAddressClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$On3g8dXnqNnDVPrYvgqZajwGUIA(com.paypal.oslo.feature.inappcheckout.navigation.coordinator.InAppCheckoutCoordinator inAppCheckoutCoordinator, com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardSharedViewModel cardSharedViewModel, com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel cardFormViewModel, com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.OperationType operationType, com.paypal.oslo.feature.inappcheckout.domain.model.UpdateCardParams updateCardParams, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        CardFormScreen(inAppCheckoutCoordinator, cardSharedViewModel, cardFormViewModel, operationType, updateCardParams, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$PG9Wzk1SAU-zFxf2GUP4dt9Fie0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15481$r8$lambda$PG9Wzk1SAUzFxf2GUP4dt9Fie0(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel cardFormViewModel, com.paypal.oslo.feature.inappcheckout.domain.model.BillingAddress billingAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(billingAddress, "");
        cardFormViewModel.onEvent(new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.UpdateUserInput(new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput.BillingAddressInput(billingAddress)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QaL1xN2rSm6dX0gufimXPHjQQvo(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel cardFormViewModel, com.paypal.oslo.feature.inappcheckout.domain.model.CardDetails cardDetails) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardDetails, "");
        cardFormViewModel.onEvent(new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.UpdateUserInput(new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.UserInput.CardDetailsInput(cardDetails)));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$VX-vpCzZuwyYGeS-saDxhCEopc8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m15482$r8$lambda$VXvpCzZuwyYGeSsaDxhCEopc8(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel cardFormViewModel) {
        cardFormViewModel.onEvent(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.CancelBillingAddressClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m2fp2TwO0AnWbnHN4Ao7Bxbg5BA(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel cardFormViewModel, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        cardFormViewModel.onEvent(new com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.AddressSelected(str));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$nloGPXvTNJAblcjaCOOT9wuV6tY(com.paypal.oslo.feature.inappcheckout.ui.card.viewmodel.CardFormViewModel cardFormViewModel) {
        cardFormViewModel.onEvent(com.paypal.oslo.feature.inappcheckout.ui.card.contract.CardFormContract.Event.SaveCardClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity access$CardFormScreen$lambda$1(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.inappcheckout.domain.entity.CardFormDataEntity) state.getValue();
    }

    public static final /* synthetic */ com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity access$CardFormScreen$lambda$2(androidx.compose.runtime.State state) {
        return (com.paypal.oslo.feature.inappcheckout.domain.entity.FIMetadataEntity) state.getValue();
    }
}
