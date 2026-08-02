package com.paypal.oslo.feature.activity.ui.search.view.compose;

@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001a?\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\u0011\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0007¢\u0006\u0002\u0010\u0013¨\u0006\u0014²\u0006\n\u0010\u0005\u001a\u00020\u0006X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002"}, d2 = {"ActivitySearchFilterCompose", "", "viewModel", "Lcom/paypal/oslo/feature/activity/ui/search/model/ActivitySearchViewModel;", "(Lcom/paypal/oslo/feature/activity/ui/search/model/ActivitySearchViewModel;Landroidx/compose/runtime/Composer;I)V", "uiState", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiState;", "searchResults", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchEvent;", "searchSuggestions", "Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState;", "(Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiState;Landroidx/paging/compose/LazyPagingItems;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState;Landroidx/compose/runtime/Composer;I)V", "filterLabel", "", "Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType;", "(Lcom/paypal/oslo/feature/activity/domain/search/models/ActivitySearchFilterType;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "activity_prodRelease", "needsLedgerRefresh", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivitySearchFilterComposeKt {
    public static final void ActivitySearchFilterCompose(final com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel activitySearchViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activitySearchViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1056434084);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(activitySearchViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1056434084, i2, -1, "com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterCompose (ActivitySearchFilterCompose.kt:69)");
            }
            androidx.compose.runtime.State collectAsStateWithLifecycle = androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(activitySearchViewModel.getUiState$activity_prodRelease(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7);
            androidx.paging.compose.LazyPagingItems collectAsLazyPagingItems = androidx.paging.compose.LazyPagingItemsKt.collectAsLazyPagingItems(activitySearchViewModel.getSearchResults$activity_prodRelease(), null, startRestartGroup, 0, 1);
            com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState activityUiState = (com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(activitySearchViewModel.getSearchSuggestion$activity_prodRelease(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue();
            boolean booleanValue = ((java.lang.Boolean) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(activitySearchViewModel.getActivitySearchResultRefresh$activity_prodRelease(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue()).booleanValue();
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt.m11941$r8$lambda$hmPxE9j79JVdkPu8xypUaqSaGI(androidx.compose.runtime.MutableState.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.feature.activity.ui.search.view.compose.result.ActivitySearchNavResultKt.SetActivitySearchResultEffect(activitySearchViewModel, collectAsLazyPagingItems, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, (androidx.paging.compose.LazyPagingItems.$stable << 3) | (i2 & 14) | 384);
            boolean changedInstance = startRestartGroup.changedInstance(activitySearchViewModel);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt.$r8$lambda$6IEVINCkOtNSuqH36RCNbyNIP0w(com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.view.compose.BackHandlerKt.BackHandler(false, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 0, 1);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changedInstance2 = startRestartGroup.changedInstance(activitySearchViewModel);
            com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$ActivitySearchFilterCompose$3$1 rememberedValue4 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$ActivitySearchFilterCompose$3$1(activitySearchViewModel, mutableState, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue4, startRestartGroup, 6);
            boolean changed = startRestartGroup.changed(booleanValue);
            boolean changedInstance3 = startRestartGroup.changedInstance(collectAsLazyPagingItems);
            boolean changedInstance4 = startRestartGroup.changedInstance(activitySearchViewModel);
            com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$ActivitySearchFilterCompose$4$1 rememberedValue5 = startRestartGroup.rememberedValue();
            if ((changed | changedInstance3 | changedInstance4) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$ActivitySearchFilterCompose$4$1(booleanValue, collectAsLazyPagingItems, activitySearchViewModel, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(java.lang.Boolean.valueOf(booleanValue), (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 0);
            com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState activitySearchUiState = (com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState) collectAsStateWithLifecycle.getValue();
            boolean changedInstance5 = startRestartGroup.changedInstance(activitySearchViewModel);
            com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$ActivitySearchFilterCompose$5$1 rememberedValue6 = startRestartGroup.rememberedValue();
            if (changedInstance5 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$ActivitySearchFilterCompose$5$1(activitySearchViewModel);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            ActivitySearchFilterCompose(activitySearchUiState, collectAsLazyPagingItems, (kotlin.jvm.functions.Function1) ((kotlin.reflect.KFunction) rememberedValue6), activityUiState, startRestartGroup, androidx.paging.compose.LazyPagingItems.$stable << 3);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt.m11939$r8$lambda$dHgQLSmZ__XeAw5lDzDmf3JMg8(com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void ActivitySearchFilterCompose(final com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState activitySearchUiState, final androidx.paging.compose.LazyPagingItems<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> lazyPagingItems, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent, kotlin.Unit> function1, final com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState activityUiState, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activitySearchUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyPagingItems, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityUiState, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1757092992);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changedInstance(activitySearchUiState) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(lazyPagingItems) : startRestartGroup.changedInstance(lazyPagingItems) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changed(activityUiState) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1757092992, i2, -1, "com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterCompose (ActivitySearchFilterCompose.kt:128)");
            }
            androidx.compose.foundation.layout.PaddingValues m1703PaddingValuesa9UjIt4$default = androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing16(), com.paypal.pds.core.ConstantsKt.getSpacing16(), 2, null);
            final androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController = (androidx.compose.ui.platform.SoftwareKeyboardController) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalSoftwareKeyboardController());
            final androidx.compose.ui.focus.FocusManager focusManager = (androidx.compose.ui.focus.FocusManager) startRestartGroup.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalFocusManager());
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new androidx.compose.ui.focus.FocusRequester();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.ui.focus.FocusRequester focusRequester = (androidx.compose.ui.focus.FocusRequester) rememberedValue;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = (kotlin.jvm.functions.Function2) new com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$ActivitySearchFilterCompose$7$1(focusRequester, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
            java.lang.String submittedQuery = activitySearchUiState.getSubmittedQuery();
            boolean z = submittedQuery != null && submittedQuery.length() >= 3;
            startRestartGroup.startReplaceGroup(-644194174);
            final java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(kotlin.collections.CollectionsKt.collectionSizeOrDefault(activitySearchUiState.getAvailableFilters(), 10)), 16));
            for (java.util.Iterator it = r13.iterator(); it.hasNext(); it = it) {
                java.lang.Object next = it.next();
                linkedHashMap.put(next, filterLabel((com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType) next, startRestartGroup, 0));
            }
            startRestartGroup.endReplaceGroup();
            androidx.compose.ui.Modifier navigationBarsPadding = androidx.compose.foundation.layout.WindowInsetsPadding_androidKt.navigationBarsPadding(androidx.compose.ui.Modifier.INSTANCE);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, navigationBarsPadding);
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
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBar("", androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "top_bar_back_button"), null, null, false, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(-2116582214, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt.$r8$lambda$vMKILuIBmx9836bjKdeVPEeJzms(kotlin.jvm.functions.Function1.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), null, startRestartGroup, 196662, 92);
            androidx.compose.ui.Modifier padding = androidx.compose.foundation.layout.PaddingKt.padding(androidx.compose.ui.Modifier.INSTANCE, m1703PaddingValuesa9UjIt4$default);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy2 = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, padding);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance2 = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            androidx.compose.ui.Modifier focusRequester2 = androidx.compose.ui.focus.FocusRequesterModifierKt.focusRequester(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "activity_search_field"), focusRequester);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt.m11942$r8$lambda$iuZOQ01roYvQs0MMaNKb_isj8((androidx.compose.ui.focus.FocusState) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            androidx.compose.ui.Modifier onFocusChanged = androidx.compose.ui.focus.FocusChangedModifierKt.onFocusChanged(focusRequester2, (kotlin.jvm.functions.Function1) rememberedValue3);
            java.lang.String currentQuery = activitySearchUiState.getCurrentQuery();
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_search_text, startRestartGroup, 0);
            androidx.compose.foundation.text.KeyboardOptions keyboardOptions = new androidx.compose.foundation.text.KeyboardOptions(0, (java.lang.Boolean) null, 0, androidx.compose.ui.text.input.ImeAction.INSTANCE.m8219getSearcheUduSuo(), (androidx.compose.ui.text.input.PlatformImeOptions) null, (java.lang.Boolean) null, (androidx.compose.ui.text.intl.LocaleList) null, 119, (kotlin.jvm.internal.DefaultConstructorMarker) null);
            boolean changed = startRestartGroup.changed(softwareKeyboardController);
            boolean changedInstance = startRestartGroup.changedInstance(focusManager);
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            boolean changedInstance2 = startRestartGroup.changedInstance(activitySearchUiState);
            boolean z3 = z;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if ((changed | changedInstance | z2 | changedInstance2) || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt.m11943$r8$lambda$jbBMFtEjKvJzbO6Q0tMH3hBlf0(androidx.compose.ui.platform.SoftwareKeyboardController.this, focusManager, function1, activitySearchUiState, (androidx.compose.foundation.text.KeyboardActionScope) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            androidx.compose.foundation.text.KeyboardActions keyboardActions = new androidx.compose.foundation.text.KeyboardActions(null, null, null, null, (kotlin.jvm.functions.Function1) rememberedValue4, null, 47, null);
            boolean z4 = i3 == 256;
            java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (z4 || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt.m11937$r8$lambda$IyOVvVqsFA4lbQM7aJxqq0gWs(kotlin.jvm.functions.Function1.this, (java.lang.String) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue5;
            boolean z5 = i3 == 256;
            java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
            if (z5 || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt.$r8$lambda$paw3llK3rj5iZsAuB91PmW3HDC0(kotlin.jvm.functions.Function1.this, focusRequester);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue6);
            }
            com.paypal.pds.components.SearchKt.Search(onFocusChanged, currentQuery, function12, (kotlin.jvm.functions.Function0) rememberedValue6, keyboardOptions, keyboardActions, stringResource, startRestartGroup, 24576, 0);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0);
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "activity_search_filter_chips");
            java.util.List<com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType> availableFilters = activitySearchUiState.getAvailableFilters();
            boolean changedInstance3 = startRestartGroup.changedInstance(linkedHashMap);
            java.lang.Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (changedInstance3 || rememberedValue7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt.$r8$lambda$kJ_qvjEXlqQFQpHu3KMF3br2yWk(linkedHashMap, (com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue7;
            boolean changedInstance4 = startRestartGroup.changedInstance(focusManager);
            boolean z6 = i3 == 256;
            java.lang.Object rememberedValue8 = startRestartGroup.rememberedValue();
            if ((changedInstance4 | z6) || rememberedValue8 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt.$r8$lambda$5SwkhNB4KTY7BLCCh1YCTUrF_18(androidx.compose.ui.focus.FocusManager.this, function1, (com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            kotlin.jvm.functions.Function1 function14 = (kotlin.jvm.functions.Function1) rememberedValue8;
            boolean changedInstance5 = startRestartGroup.changedInstance(activitySearchUiState);
            java.lang.Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (changedInstance5 || rememberedValue9 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return java.lang.Boolean.valueOf(com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt.m11938$r8$lambda$U1QmlPXIbLrTKwbNmYlqj5n69w(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState.this, (com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType) obj));
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            com.paypal.pds.components.ChipsKt.Chips(availableFilters, function13, function14, testTag, (kotlin.jvm.functions.Function1) rememberedValue9, null, null, null, false, null, startRestartGroup, 3072, 992);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing16()), startRestartGroup, 0);
            boolean z7 = activitySearchUiState.getSelectedFilter() != null;
            if (activitySearchUiState.getSubmittedQuery() == null && !z7) {
                startRestartGroup.startReplaceGroup(-631032402);
                boolean changedInstance6 = startRestartGroup.changedInstance(focusManager);
                boolean z8 = i3 == 256;
                java.lang.Object rememberedValue10 = startRestartGroup.rememberedValue();
                if ((changedInstance6 | z8) || rememberedValue10 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt.$r8$lambda$cafZqCf6J8TNrKhsfEtnK5et3QM(androidx.compose.ui.focus.FocusManager.this, function1, (java.lang.String) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue10);
                }
                com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchSuggestionComposeKt.SearchSuggestionCompose(activityUiState, (kotlin.jvm.functions.Function1) rememberedValue10, startRestartGroup, (i2 >> 9) & 14);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            } else {
                startRestartGroup.startReplaceGroup(-630650389);
                boolean z9 = z3 || z7;
                boolean z10 = i3 == 256;
                java.lang.Object rememberedValue11 = startRestartGroup.rememberedValue();
                if (z10 || rememberedValue11 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue11 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt.$r8$lambda$3HKfA7M47ArtT7q2I68M8xJsQkE(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel) obj, (com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue11);
                }
                kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue11;
                boolean z11 = i3 == 256;
                java.lang.Object rememberedValue12 = startRestartGroup.rememberedValue();
                if (z11 || rememberedValue12 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt.m11936$r8$lambda$BvV3E044emr8QJqr_UrJjeTU(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue12);
                }
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt.SearchResultCompose(z9, lazyPagingItems, function2, (kotlin.jvm.functions.Function1) rememberedValue12, startRestartGroup, (androidx.paging.compose.LazyPagingItems.$stable << 3) | (i2 & 112), 0);
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt.$r8$lambda$zlxLfEZ5BwgPwAeQtA_qRdrca74(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState.this, lazyPagingItems, function1, activityUiState, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final java.lang.String filterLabel(com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType activitySearchFilterType, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activitySearchFilterType, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-371446720, i, -1, "com.paypal.oslo.feature.activity.ui.search.view.compose.filterLabel (ActivitySearchFilterCompose.kt:252)");
        }
        if (activitySearchFilterType instanceof com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.SearchTextFilterType.Refunds) {
            composer.startReplaceGroup(-478009313);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_search_filter_refunds, composer, 0);
            composer.endReplaceGroup();
        } else if (activitySearchFilterType instanceof com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.SearchTextFilterType.Invoices) {
            composer.startReplaceGroup(-478006528);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_search_filter_invoices, composer, 0);
            composer.endReplaceGroup();
        } else if (activitySearchFilterType instanceof com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.MoneyMovementFilterType.MoneyIn) {
            composer.startReplaceGroup(-478003744);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_search_filter_money_in, composer, 0);
            composer.endReplaceGroup();
        } else {
            if (!(activitySearchFilterType instanceof com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType.MoneyMovementFilterType.MoneyOut)) {
                composer.startReplaceGroup(-478010159);
                composer.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-478000927);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_search_filter_money_out, composer, 0);
            composer.endReplaceGroup();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3HKfA7M47ArtT7q2I68M8xJsQkE(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionModel, "");
        com.paypal.oslo.feature.activity.domain.navigation.model.TransactionTileNavigationTypes.XoomTransactionNavigation isXoomNavigationTypeIfApplicable = com.paypal.oslo.feature.activity.ui.common.ActivityActionExtensionsKt.isXoomNavigationTypeIfApplicable(activityTransactionModel);
        if (isXoomNavigationTypeIfApplicable != null) {
            androidx.navigation3.runtime.NavKey destinationKey = isXoomNavigationTypeIfApplicable.getDestinationKey();
            com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination activityDetailsDestination = destinationKey instanceof com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination ? (com.paypal.oslo.feature.xoom.api.navigation.ActivityDetailsDestination) destinationKey : null;
            if (activityDetailsDestination != null) {
                function1.invoke(new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.XoomTransactionTileActionPressedEvent(activityDetailsDestination));
            }
        } else if (com.paypal.oslo.feature.activity.ui.common.ActivityActionExtensionsKt.isPrimaryActionFlow(activityActionModel)) {
            function1.invoke(new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchResultItemPrimaryActionClicked(activityActionModel));
        } else {
            function1.invoke(new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchResultItemClicked(activityTransactionModel));
        }
        com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsTrackerKt.trackSearchResultsPressed();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$5SwkhNB4KTY7BLCCh1YCTUrF_18(androidx.compose.ui.focus.FocusManager focusManager, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType activitySearchFilterType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activitySearchFilterType, "");
        androidx.compose.ui.focus.FocusManager.clearFocus$default(focusManager, false, 1, null);
        function1.invoke(new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.FilterChipClicked(activitySearchFilterType));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$6IEVINCkOtNSuqH36RCNbyNIP0w(com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel activitySearchViewModel) {
        activitySearchViewModel.processEvent$activity_prodRelease(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.BackClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$BvV3E-0--44emr8QJqr_UrJjeTU, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11936$r8$lambda$BvV3E044emr8QJqr_UrJjeTU(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        function1.invoke(new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchResultItemPrimaryActionClicked(activityActionModel));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$IyOVvVqsFA4lbQM7aJ--xqq0gWs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11937$r8$lambda$IyOVvVqsFA4lbQM7aJxqq0gWs(kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        function1.invoke(new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchQueryChanged(str));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$U1QmlPXIbLrTKwbNmYlqj5-n69w, reason: not valid java name */
    public static /* synthetic */ boolean m11938$r8$lambda$U1QmlPXIbLrTKwbNmYlqj5n69w(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState activitySearchUiState, com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType activitySearchFilterType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activitySearchFilterType, "");
        return kotlin.jvm.internal.Intrinsics.areEqual(activitySearchFilterType, activitySearchUiState.getSelectedFilter());
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$cafZqCf6J8TNrKhsfEtnK5et3QM(androidx.compose.ui.focus.FocusManager focusManager, kotlin.jvm.functions.Function1 function1, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        androidx.compose.ui.focus.FocusManager.clearFocus$default(focusManager, false, 1, null);
        function1.invoke(new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SuggestionItemClicked(str));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$dHgQLSmZ__XeAw5lDzDmf-3JMg8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11939$r8$lambda$dHgQLSmZ__XeAw5lDzDmf3JMg8(com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel activitySearchViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        ActivitySearchFilterCompose(activitySearchViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hPlw-i3-lFRnhFPIimInUPWvTwE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11940$r8$lambda$hPlwi3lFRnhFPIimInUPWvTwE(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.BackClicked.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$hmPxE9j79JVdkPu8xypUaqSa-GI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11941$r8$lambda$hmPxE9j79JVdkPu8xypUaqSaGI(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.TRUE);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$i-uZOQ01r-oYvQs0MMaNKb_isj8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11942$r8$lambda$iuZOQ01roYvQs0MMaNKb_isj8(androidx.compose.ui.focus.FocusState focusState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(focusState, "");
        if (focusState.isFocused()) {
            com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsTrackerKt.trackSearchBarFocused();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$jbBM-FtEjKvJzbO6Q0tMH3hBlf0, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11943$r8$lambda$jbBMFtEjKvJzbO6Q0tMH3hBlf0(androidx.compose.ui.platform.SoftwareKeyboardController softwareKeyboardController, androidx.compose.ui.focus.FocusManager focusManager, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState activitySearchUiState, androidx.compose.foundation.text.KeyboardActionScope keyboardActionScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(keyboardActionScope, "");
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        androidx.compose.ui.focus.FocusManager.clearFocus$default(focusManager, false, 1, null);
        function1.invoke(new com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchSubmitted(activitySearchUiState.getCurrentQuery()));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.String $r8$lambda$kJ_qvjEXlqQFQpHu3KMF3br2yWk(java.util.Map map, com.paypal.oslo.feature.activity.domain.search.models.ActivitySearchFilterType activitySearchFilterType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activitySearchFilterType, "");
        java.lang.String str = (java.lang.String) map.get(activitySearchFilterType);
        return str == null ? "" : str;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$paw3llK3rj5iZsAuB91PmW3HDC0(kotlin.jvm.functions.Function1 function1, androidx.compose.ui.focus.FocusRequester focusRequester) {
        function1.invoke(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchEvent.SearchCleared.INSTANCE);
        androidx.compose.ui.focus.FocusRequester.m5670requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vMKILuIBmx9836bjKdeVPEeJzms(final kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-2116582214, i, -1, "com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterCompose.<anonymous>.<anonymous> (ActivitySearchFilterCompose.kt:147)");
            }
            boolean changed = composer.changed(function1);
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchFilterComposeKt.m11940$r8$lambda$hPlwi3lFRnhFPIimInUPWvTwE(kotlin.jvm.functions.Function1.this);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.core.commonui.components.TopBarKt.TopBarBackButton((kotlin.jvm.functions.Function0) rememberedValue, null, composer, 0, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zlxLfEZ5BwgPwAeQtA_qRdrca74(com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState activitySearchUiState, androidx.paging.compose.LazyPagingItems lazyPagingItems, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState activityUiState, int i, androidx.compose.runtime.Composer composer, int i2) {
        ActivitySearchFilterCompose(activitySearchUiState, lazyPagingItems, function1, activityUiState, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
