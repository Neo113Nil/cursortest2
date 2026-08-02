package com.paypal.oslo.feature.activity.ui.ledger.view.compose.states;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001aG\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001aG\u0010\u000e\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\u001aG\u0010\u000f\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r\u001a\u001f\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\u0011\u001a3\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\tH\u0003¢\u0006\u0002\u0010\u0015\u001a%\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00142\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010\u0018H\u0003¢\u0006\u0002\u0010\u0019¨\u0006\u001a²\u0006\f\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u008a\u0084\u0002"}, d2 = {"PopulateActivityItems", "", "activityItems", "Landroidx/compose/runtime/State;", "", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "ledgerScreenState", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent;", "activityLedgerViewModel", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityLedgerViewModel;", "(Landroidx/compose/runtime/State;Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityLedgerViewModel;Landroidx/compose/runtime/Composer;II)V", "PopulateFilterActivityItems", "RenderEmptyStateForActivityLedgerFilterState", "RenderEmptyStateForDefaultLedgerState", "(Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState;Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityLedgerViewModel;Landroidx/compose/runtime/Composer;II)V", "RenderEmptyStateForPackageTracking", "filterEmptyStateUIModel", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/factory/ActivityLedgerEmptyStateModel;", "(Lcom/paypal/oslo/feature/activity/ui/ledger/model/factory/ActivityLedgerEmptyStateModel;Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityLedgerViewModel;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "RenderEmptyStateViewForFilter", "onClick", "Lkotlin/Function0;", "(Lcom/paypal/oslo/feature/activity/ui/ledger/model/factory/ActivityLedgerEmptyStateModel;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "activity_prodRelease", "packageTrackingEmailLinkStatus", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLedgerSuccessContentComposeKt {
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:
    
        if ((r26 & 8) != 0) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PopulateActivityItems(final androidx.compose.runtime.State<? extends java.util.List<? extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> state, final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState activityLedgerScreenState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent, kotlin.Unit> function1, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerScreenState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(797863734);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(activityLedgerScreenState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                activityLedgerViewModel2 = activityLedgerViewModel;
                if (startRestartGroup.changedInstance(activityLedgerViewModel2)) {
                    i4 = 2048;
                    i3 |= i4;
                }
            } else {
                activityLedgerViewModel2 = activityLedgerViewModel;
            }
            i4 = 1024;
            i3 |= i4;
        } else {
            activityLedgerViewModel2 = activityLedgerViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 8) != 0) {
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
                    activityLedgerViewModel2 = (com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i3 &= -7169;
                }
                int i5 = i3;
                com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel4 = activityLedgerViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(797863734, i5, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.PopulateActivityItems (ActivityLedgerSuccessContentCompose.kt:78)");
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 1, null), "transaction_container");
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                if (((java.lang.Boolean) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(activityLedgerViewModel4.emptyUIStateFlow$activity_prodRelease(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue()).booleanValue()) {
                    startRestartGroup.startReplaceGroup(1051843777);
                    RenderEmptyStateForDefaultLedgerState(activityLedgerScreenState, activityLedgerViewModel4, startRestartGroup, ((i5 >> 3) & 14) | ((i5 >> 6) & 112), 0);
                    composer2 = startRestartGroup;
                } else {
                    startRestartGroup.startReplaceGroup(1052052562);
                    int i6 = i5 & 8190;
                    composer2 = startRestartGroup;
                    com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt.RenderActivityItemSections(state, activityLedgerScreenState, function1, activityLedgerViewModel4, null, composer2, i6, 16);
                    if (!state.getValue().isEmpty()) {
                        composer2.startReplaceGroup(1052350162);
                        kotlin.Unit unit = kotlin.Unit.INSTANCE;
                        com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerSuccessContentComposeKt$PopulateActivityItems$1$1$1 rememberedValue = composer2.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerSuccessContentComposeKt$PopulateActivityItems$1$1$1(null);
                            composer2.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer2, 6);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1052461638);
                        composer2.endReplaceGroup();
                    }
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                activityLedgerViewModel3 = activityLedgerViewModel4;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            activityLedgerViewModel3 = activityLedgerViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerSuccessContentComposeKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerSuccessContentComposeKt.$r8$lambda$oiLzdtnw_m3MuKcIHz2KjXYhH4I(androidx.compose.runtime.State.this, activityLedgerScreenState, function1, activityLedgerViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x008c, code lost:
    
        if ((r26 & 8) != 0) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PopulateFilterActivityItems(final androidx.compose.runtime.State<? extends java.util.List<? extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> state, final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState activityLedgerScreenState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent, kotlin.Unit> function1, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerScreenState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1719958882);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(activityLedgerScreenState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                activityLedgerViewModel2 = activityLedgerViewModel;
                if (startRestartGroup.changedInstance(activityLedgerViewModel2)) {
                    i4 = 2048;
                    i3 |= i4;
                }
            } else {
                activityLedgerViewModel2 = activityLedgerViewModel;
            }
            i4 = 1024;
            i3 |= i4;
        } else {
            activityLedgerViewModel2 = activityLedgerViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) == 0 || startRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 8) != 0) {
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
                    activityLedgerViewModel2 = (com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i3 &= -7169;
                }
                int i5 = i3;
                com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel4 = activityLedgerViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1719958882, i5, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.PopulateFilterActivityItems (ActivityLedgerSuccessContentCompose.kt:113)");
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 1, null), "transaction_container");
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag);
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
                boolean booleanValue = ((java.lang.Boolean) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(activityLedgerViewModel4.emptyUIStateFlow$activity_prodRelease(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue()).booleanValue();
                boolean changed = startRestartGroup.changed(booleanValue);
                boolean changedInstance = startRestartGroup.changedInstance(activityLedgerViewModel4);
                com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerSuccessContentComposeKt$PopulateFilterActivityItems$1$1$1 rememberedValue = startRestartGroup.rememberedValue();
                if ((changed | changedInstance) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerSuccessContentComposeKt$PopulateFilterActivityItems$1$1$1(booleanValue, activityLedgerViewModel4, null);
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, startRestartGroup, 0);
                int i6 = i5 & 8190;
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt.RenderActivityItemSections(state, activityLedgerScreenState, function1, activityLedgerViewModel4, null, composer2, i6, 16);
                if (booleanValue) {
                    composer2.startReplaceGroup(-941084817);
                    RenderEmptyStateForActivityLedgerFilterState(state, activityLedgerScreenState, function1, activityLedgerViewModel4, composer2, i6, 0);
                    composer2.endReplaceGroup();
                } else {
                    composer2.startReplaceGroup(-940809010);
                    composer2.endReplaceGroup();
                }
                composer2.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                activityLedgerViewModel3 = activityLedgerViewModel4;
            } else {
                startRestartGroup.skipToGroupEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            activityLedgerViewModel3 = activityLedgerViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerSuccessContentComposeKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerSuccessContentComposeKt.$r8$lambda$GesSBTmEvvkpPB_XahTO4UHdYx0(androidx.compose.runtime.State.this, activityLedgerScreenState, function1, activityLedgerViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RenderEmptyStateForActivityLedgerFilterState(final androidx.compose.runtime.State<? extends java.util.List<? extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> state, final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState activityLedgerScreenState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent, kotlin.Unit> function1, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel2;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel4;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerScreenState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-275016771);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(activityLedgerScreenState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                activityLedgerViewModel2 = activityLedgerViewModel;
                if (startRestartGroup.changedInstance(activityLedgerViewModel2)) {
                    i5 = 2048;
                    i3 |= i5;
                }
            } else {
                activityLedgerViewModel2 = activityLedgerViewModel;
            }
            i5 = 1024;
            i3 |= i5;
        } else {
            activityLedgerViewModel2 = activityLedgerViewModel;
        }
        if (startRestartGroup.shouldExecute((i3 & 1171) != 1170, i3 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    activityLedgerViewModel4 = activityLedgerViewModel2;
                    i4 = 0;
                    startRestartGroup.endDefaults();
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel emptyStateModel$activity_prodRelease = activityLedgerViewModel4.getEmptyStateModel$activity_prodRelease(activityLedgerScreenState);
                    if (com.paypal.oslo.feature.activity.domain.common.extensions.ActivityExtensionsKt.shouldShowFilterEmptyState(state.getValue())) {
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    activityLedgerViewModel3 = activityLedgerViewModel4;
                }
            } else if ((i2 & 8) != 0) {
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
                activityLedgerViewModel2 = (com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i3 &= -7169;
                activityLedgerViewModel4 = activityLedgerViewModel2;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-275016771, i3, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.RenderEmptyStateForActivityLedgerFilterState (ActivityLedgerSuccessContentCompose.kt:149)");
                }
                com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel emptyStateModel$activity_prodRelease2 = activityLedgerViewModel4.getEmptyStateModel$activity_prodRelease(activityLedgerScreenState);
                if (com.paypal.oslo.feature.activity.domain.common.extensions.ActivityExtensionsKt.shouldShowFilterEmptyState(state.getValue())) {
                    startRestartGroup.startReplaceGroup(1773713647);
                    if (activityLedgerScreenState.getActivityFilterType() instanceof com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Packages) {
                        startRestartGroup.startReplaceGroup(1773902716);
                        composer2 = startRestartGroup;
                        getHighSpeedVideoSizes(emptyStateModel$activity_prodRelease2, activityLedgerViewModel4, function1, startRestartGroup, ((i3 >> 6) & 112) | (i3 & 896), 0);
                        composer2.endReplaceGroup();
                    } else {
                        composer2 = startRestartGroup;
                        composer2.startReplaceGroup(1996896941);
                        getHighSpeedVideoFpsRangesFor(emptyStateModel$activity_prodRelease2, null, composer2, i4, 2);
                        composer2.endReplaceGroup();
                    }
                    composer2.endReplaceGroup();
                } else {
                    composer2 = startRestartGroup;
                    composer2.startReplaceGroup(1774355781);
                    composer2.endReplaceGroup();
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                activityLedgerViewModel3 = activityLedgerViewModel4;
            }
            i4 = 0;
            activityLedgerViewModel4 = activityLedgerViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel emptyStateModel$activity_prodRelease22 = activityLedgerViewModel4.getEmptyStateModel$activity_prodRelease(activityLedgerScreenState);
            if (com.paypal.oslo.feature.activity.domain.common.extensions.ActivityExtensionsKt.shouldShowFilterEmptyState(state.getValue())) {
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            activityLedgerViewModel3 = activityLedgerViewModel4;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            activityLedgerViewModel3 = activityLedgerViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerSuccessContentComposeKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerSuccessContentComposeKt.$r8$lambda$e1EmFzqoohQwcU20Ml4hBcFXKLI(androidx.compose.runtime.State.this, activityLedgerScreenState, function1, activityLedgerViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RenderEmptyStateForDefaultLedgerState(final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState activityLedgerScreenState, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel2;
        final com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel4;
        int i4;
        java.lang.Integer emptyStateDescriptionResId;
        java.lang.String str;
        int i5;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerScreenState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1546468915);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(activityLedgerScreenState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                activityLedgerViewModel2 = activityLedgerViewModel;
                if (startRestartGroup.changedInstance(activityLedgerViewModel2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                activityLedgerViewModel2 = activityLedgerViewModel;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            activityLedgerViewModel2 = activityLedgerViewModel;
        }
        int i6 = i3;
        if (startRestartGroup.shouldExecute((i6 & 19) != 18, i6 & 1)) {
            startRestartGroup.startDefaults();
            if ((i & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i6 &= -113;
                }
            } else if ((i2 & 2) != 0) {
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
                int i7 = i6 & (-113);
                activityLedgerViewModel4 = (com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                i4 = i7;
                startRestartGroup.endDefaults();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1546468915, i4, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.RenderEmptyStateForDefaultLedgerState (ActivityLedgerSuccessContentCompose.kt:175)");
                }
                com.paypal.oslo.core.navigation.scene.L1ContentInsets l1ContentInsets = (com.paypal.oslo.core.navigation.scene.L1ContentInsets) startRestartGroup.consume(com.paypal.oslo.core.navigation.scene.LocalL1ContentInsetsKt.getLocalL1ContentInsets());
                com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel emptyStateModel$activity_prodRelease = activityLedgerViewModel4.getEmptyStateModel$activity_prodRelease(activityLedgerScreenState);
                java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(emptyStateModel$activity_prodRelease.getEmptyStateTitleResId(), startRestartGroup, 0);
                emptyStateDescriptionResId = emptyStateModel$activity_prodRelease.getEmptyStateDescriptionResId();
                if (emptyStateDescriptionResId == null) {
                    startRestartGroup.startReplaceGroup(-1258140644);
                    java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(emptyStateDescriptionResId.intValue(), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                    str = stringResource2;
                } else {
                    startRestartGroup.startReplaceGroup(-1258140645);
                    startRestartGroup.endReplaceGroup();
                    str = null;
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 1, null), androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, l1ContentInsets.m11616getBottomD9Ej5fM(), 7, null)), "empty_state_container");
                activityLedgerViewModel3 = activityLedgerViewModel4;
                com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerEmptyContentComposeKt.RenderActivityLedgerUIEmptyState(stringResource, str, null, testTag, null, null, startRestartGroup, 384, 48);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            i4 = i6;
            activityLedgerViewModel4 = activityLedgerViewModel2;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
            com.paypal.oslo.core.navigation.scene.L1ContentInsets l1ContentInsets2 = (com.paypal.oslo.core.navigation.scene.L1ContentInsets) startRestartGroup.consume(com.paypal.oslo.core.navigation.scene.LocalL1ContentInsetsKt.getLocalL1ContentInsets());
            com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel emptyStateModel$activity_prodRelease2 = activityLedgerViewModel4.getEmptyStateModel$activity_prodRelease(activityLedgerScreenState);
            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(emptyStateModel$activity_prodRelease2.getEmptyStateTitleResId(), startRestartGroup, 0);
            emptyStateDescriptionResId = emptyStateModel$activity_prodRelease2.getEmptyStateDescriptionResId();
            if (emptyStateDescriptionResId == null) {
            }
            androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 1, null), androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, l1ContentInsets2.m11616getBottomD9Ej5fM(), 7, null)), "empty_state_container");
            activityLedgerViewModel3 = activityLedgerViewModel4;
            com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerEmptyContentComposeKt.RenderActivityLedgerUIEmptyState(stringResource3, str, null, testTag2, null, null, startRestartGroup, 384, 48);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            activityLedgerViewModel3 = activityLedgerViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerSuccessContentComposeKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerSuccessContentComposeKt.$r8$lambda$dNvN18OUNGywEAA93VA4i02tcjQ(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.this, activityLedgerViewModel3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoSizes(final com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel activityLedgerEmptyStateModel, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel activityLedgerEmptyStateModel2;
        int i3;
        com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel2;
        com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel3;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        int i4;
        com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel4;
        com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel activityLedgerEmptyStateModel3;
        int i5;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(930763028);
        if ((i & 6) == 0) {
            activityLedgerEmptyStateModel2 = activityLedgerEmptyStateModel;
            i3 = (startRestartGroup.changed(activityLedgerEmptyStateModel2) ? 4 : 2) | i;
        } else {
            activityLedgerEmptyStateModel2 = activityLedgerEmptyStateModel;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                activityLedgerViewModel2 = activityLedgerViewModel;
                if (startRestartGroup.changedInstance(activityLedgerViewModel2)) {
                    i5 = 32;
                    i3 |= i5;
                }
            } else {
                activityLedgerViewModel2 = activityLedgerViewModel;
            }
            i5 = 16;
            i3 |= i5;
        } else {
            activityLedgerViewModel2 = activityLedgerViewModel;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i6 = i3;
        if (startRestartGroup.shouldExecute((i6 & 147) != 146, i6 & 1)) {
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
                    activityLedgerViewModel4 = (com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i6 &= -113;
                    activityLedgerViewModel3 = activityLedgerViewModel4;
                }
                i4 = 0;
                activityLedgerViewModel3 = activityLedgerViewModel2;
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    activityLedgerViewModel4 = activityLedgerViewModel2;
                    i4 = 0;
                    i6 &= -113;
                    activityLedgerViewModel3 = activityLedgerViewModel4;
                }
                i4 = 0;
                activityLedgerViewModel3 = activityLedgerViewModel2;
            }
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(930763028, i6, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.RenderEmptyStateForPackageTracking (ActivityLedgerSuccessContentCompose.kt:201)");
            }
            if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Boolean) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(activityLedgerViewModel3.getPackageTrackingEmailLinkStatus$activity_prodRelease(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue(), java.lang.Boolean.FALSE)) {
                activityLedgerEmptyStateModel3 = com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel.copy$default(activityLedgerEmptyStateModel, 0, null, java.lang.Integer.valueOf(com.paypal.oslo.feature.activity.R.string.feature_activity_empty_package_tracking_filter_link_mail_cta_text), com.paypal.pds.core.Icon.Truck.INSTANCE, 3, null);
            } else {
                activityLedgerEmptyStateModel3 = activityLedgerEmptyStateModel2;
            }
            int i7 = (i6 & 896) == 256 ? 1 : i4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (i7 != 0 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerSuccessContentComposeKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerSuccessContentComposeKt.$r8$lambda$dvJwh2M50jyHwdIB2bAhquDR4tk(kotlin.jvm.functions.Function1.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            getHighSpeedVideoFpsRangesFor(activityLedgerEmptyStateModel3, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, i4, i4);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            activityLedgerViewModel3 = activityLedgerViewModel2;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            final com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel5 = activityLedgerViewModel3;
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerSuccessContentComposeKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerSuccessContentComposeKt.m11932$r8$lambda$uN7MoUG3Nx92Tsj3Bo19fBedKU(com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel.this, activityLedgerViewModel5, function1, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void getHighSpeedVideoFpsRangesFor(final com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel activityLedgerEmptyStateModel, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String stringResource;
        java.lang.String stringResource2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1202593493);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(activityLedgerEmptyStateModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            function02 = function0;
            i3 |= startRestartGroup.changedInstance(function02) ? 32 : 16;
            if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                function03 = function02;
            } else {
                if (i4 != 0) {
                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                    if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerSuccessContentComposeKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final java.lang.Object invoke() {
                                kotlin.Unit unit;
                                unit = kotlin.Unit.INSTANCE;
                                return unit;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    }
                    function03 = (kotlin.jvm.functions.Function0) rememberedValue;
                } else {
                    function03 = function02;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1202593493, i3, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.RenderEmptyStateViewForFilter (ActivityLedgerSuccessContentCompose.kt:230)");
                }
                com.paypal.oslo.core.navigation.scene.L1ContentInsets l1ContentInsets = (com.paypal.oslo.core.navigation.scene.L1ContentInsets) startRestartGroup.consume(com.paypal.oslo.core.navigation.scene.LocalL1ContentInsetsKt.getLocalL1ContentInsets());
                java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(activityLedgerEmptyStateModel.getEmptyStateTitleResId(), startRestartGroup, 0);
                java.lang.Integer emptyStateDescriptionResId = activityLedgerEmptyStateModel.getEmptyStateDescriptionResId();
                if (emptyStateDescriptionResId != null) {
                    startRestartGroup.startReplaceGroup(-2140142588);
                    stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(emptyStateDescriptionResId.intValue(), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-2140142589);
                    startRestartGroup.endReplaceGroup();
                    stringResource = null;
                }
                java.lang.Integer emptyStateCTAResId = activityLedgerEmptyStateModel.getEmptyStateCTAResId();
                if (emptyStateCTAResId != null) {
                    startRestartGroup.startReplaceGroup(-2139999740);
                    stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(emptyStateCTAResId.intValue(), startRestartGroup, 0);
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(-2139999741);
                    startRestartGroup.endReplaceGroup();
                    stringResource2 = null;
                }
                com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerEmptyContentComposeKt.RenderActivityLedgerUIEmptyState(stringResource3, stringResource, stringResource2, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.foundation.layout.SizeKt.fillMaxHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 1, null), androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, l1ContentInsets.m11616getBottomD9Ej5fM(), 7, null)), "empty_state_container"), activityLedgerEmptyStateModel.getEmptyStateIcon(), function03, startRestartGroup, (i3 << 12) & 458752, 0);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerSuccessContentComposeKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.activity.ui.ledger.view.compose.states.ActivityLedgerSuccessContentComposeKt.$r8$lambda$S73TQGfpITq5ZWiMGu_fL5wjxNw(com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel.this, function03, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        function02 = function0;
        if (startRestartGroup.shouldExecute((i3 & 19) == 18, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$GesSBTmEvvkpPB_XahTO4UHdYx0(androidx.compose.runtime.State state, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState activityLedgerScreenState, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PopulateFilterActivityItems(state, activityLedgerScreenState, function1, activityLedgerViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$S73TQGfpITq5ZWiMGu_fL5wjxNw(com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel activityLedgerEmptyStateModel, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoFpsRangesFor(activityLedgerEmptyStateModel, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dNvN18OUNGywEAA93VA4i02tcjQ(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState activityLedgerScreenState, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RenderEmptyStateForDefaultLedgerState(activityLedgerScreenState, activityLedgerViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dvJwh2M50jyHwdIB2bAhquDR4tk(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.OnPackageTrackingLinkEmailClickedEvent(new com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySourceConstants.KEY_SOURCE_LEDGER, (java.lang.String) null, (java.lang.String) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$e1EmFzqoohQwcU20Ml4hBcFXKLI(androidx.compose.runtime.State state, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState activityLedgerScreenState, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RenderEmptyStateForActivityLedgerFilterState(state, activityLedgerScreenState, function1, activityLedgerViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$oiLzdtnw_m3MuKcIHz2KjXYhH4I(androidx.compose.runtime.State state, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState activityLedgerScreenState, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        PopulateActivityItems(state, activityLedgerScreenState, function1, activityLedgerViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$uN7-MoUG3Nx92Tsj3Bo19fBedKU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11932$r8$lambda$uN7MoUG3Nx92Tsj3Bo19fBedKU(com.paypal.oslo.feature.activity.ui.ledger.model.factory.ActivityLedgerEmptyStateModel activityLedgerEmptyStateModel, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        getHighSpeedVideoSizes(activityLedgerEmptyStateModel, activityLedgerViewModel, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
