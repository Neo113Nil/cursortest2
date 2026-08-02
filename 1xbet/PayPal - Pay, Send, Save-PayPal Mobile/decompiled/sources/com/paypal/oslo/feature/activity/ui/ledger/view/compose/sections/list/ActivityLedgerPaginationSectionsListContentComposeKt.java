package com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aq\u0010\u0012\u001a\u00020\u0010*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a5\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0017\u0010\u0018"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListScope;", "Landroidx/compose/runtime/State;", "", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "activityItems", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityLedgerViewModel;", "activityLedgerViewModel", "Landroidx/paging/compose/LazyPagingItems;", "paginatedItems", "Landroidx/compose/runtime/MutableState;", "", "thresholdForPaginationReached", "showPaginationShimmer", "Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState;", "activityUIState", "Lkotlin/Function0;", "", "renderPaginationItems", "addActivityLedgerItemsPaginationSource", "(Landroidx/compose/foundation/lazy/LazyListScope;Landroidx/compose/runtime/State;Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityLedgerViewModel;Landroidx/paging/compose/LazyPagingItems;Landroidx/compose/runtime/MutableState;Landroidx/compose/runtime/MutableState;Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState;Lkotlin/jvm/functions/Function0;)V", "shouldCollectPageItems", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState;", "ledgerScreenState", "rememberPaginatedItemsCollector", "(Landroidx/compose/runtime/MutableState;Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState;Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityLedgerViewModel;Landroidx/compose/runtime/Composer;I)Landroidx/paging/compose/LazyPagingItems;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLedgerPaginationSectionsListContentComposeKt {
    public static final androidx.paging.compose.LazyPagingItems<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> rememberPaginatedItemsCollector(androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState activityLedgerScreenState, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerScreenState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerViewModel, "");
        composer.startReplaceGroup(46342768);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(46342768, i, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.rememberPaginatedItemsCollector (ActivityLedgerPaginationSectionsListContentCompose.kt:91)");
        }
        if (mutableState.getValue().booleanValue()) {
            composer.startReplaceGroup(1913174816);
            androidx.paging.compose.LazyPagingItems<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> collectAsLazyPagingItems = androidx.paging.compose.LazyPagingItemsKt.collectAsLazyPagingItems(activityLedgerViewModel.userActivitiesActivityItems$activity_prodRelease(activityLedgerScreenState.getActivityFilterType()), null, composer, 0, 1);
            composer.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return collectAsLazyPagingItems;
        }
        composer.startReplaceGroup(1913561138);
        composer.endReplaceGroup();
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return null;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Fd1YV8_cxM6dNn3jmBP7ugy0PAA(androidx.compose.runtime.MutableState mutableState, boolean z, androidx.compose.runtime.MutableState mutableState2, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(578616294, i, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.addActivityLedgerItemsPaginationSource.<anonymous>.<anonymous> (ActivityLedgerPaginationSectionsListContentCompose.kt:51)");
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            boolean changed = composer.changed(mutableState);
            boolean changed2 = composer.changed(z);
            boolean changed3 = composer.changed(mutableState2);
            com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerPaginationSectionsListContentComposeKt$addActivityLedgerItemsPaginationSource$1$1$1$1 rememberedValue = composer.rememberedValue();
            if ((changed | changed2 | changed3) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerPaginationSectionsListContentComposeKt$addActivityLedgerItemsPaginationSource$1$1$1$1(mutableState, z, mutableState2, null);
                composer.updateRememberedValue(rememberedValue);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue, composer, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final void addActivityLedgerItemsPaginationSource(androidx.compose.foundation.lazy.LazyListScope lazyListScope, androidx.compose.runtime.State<? extends java.util.List<? extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> state, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, androidx.paging.compose.LazyPagingItems<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> lazyPagingItems, final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, final androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState2, com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState activityUiState, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        java.lang.String value = activityLedgerViewModel.getNextPageCursor().getValue();
        if (value != null && !kotlin.text.StringsKt.isBlank(value) && !state.getValue().isEmpty() && !mutableState.getValue().booleanValue()) {
            final boolean z = activityUiState instanceof com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success;
            androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.KEY_PAGINATION_TRIGGER, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(578616294, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerPaginationSectionsListContentComposeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerPaginationSectionsListContentComposeKt.$r8$lambda$Fd1YV8_cxM6dNn3jmBP7ugy0PAA(androidx.compose.runtime.MutableState.this, z, mutableState2, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }), 2, null);
        }
        if (mutableState.getValue().booleanValue()) {
            function0.invoke();
        }
        com.paypal.oslo.feature.activity.ui.common.ComposableUtilsKt.lazyPagingItemsStateListener(lazyListScope, mutableState2, lazyPagingItems, androidx.compose.ui.Modifier.INSTANCE);
    }
}
