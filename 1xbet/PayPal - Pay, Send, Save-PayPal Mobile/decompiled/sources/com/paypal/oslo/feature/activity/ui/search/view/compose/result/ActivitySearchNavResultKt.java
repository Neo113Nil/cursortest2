package com.paypal.oslo.feature.activity.ui.search.view.compose.result;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/search/model/ActivitySearchViewModel;", "activitySearchViewModel", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "searchResults", "Lkotlin/Function0;", "", "onRefresh", "SetActivitySearchResultEffect", "(Lcom/paypal/oslo/feature/activity/ui/search/model/ActivitySearchViewModel;Landroidx/paging/compose/LazyPagingItems;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivitySearchNavResultKt {
    public static final void SetActivitySearchResultEffect(final com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel activitySearchViewModel, final androidx.paging.compose.LazyPagingItems<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> lazyPagingItems, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activitySearchViewModel, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyPagingItems, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1312637607);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(activitySearchViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? startRestartGroup.changed(lazyPagingItems) : startRestartGroup.changedInstance(lazyPagingItems) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if (!startRestartGroup.shouldExecute((i2 & 147) != 146, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1312637607, i2, -1, "com.paypal.oslo.feature.activity.ui.search.view.compose.result.SetActivitySearchResultEffect (ActivitySearchNavResult.kt:27)");
            }
            java.lang.String navActivityDetailRequestId = activitySearchViewModel.getNavActivityDetailRequestId();
            boolean z = (i2 & 112) == 32 || ((i2 & 64) != 0 && startRestartGroup.changedInstance(lazyPagingItems));
            boolean z2 = (i2 & 896) == 256;
            com.paypal.oslo.feature.activity.ui.search.view.compose.result.ActivitySearchNavResultKt$SetActivitySearchResultEffect$1$1 rememberedValue = startRestartGroup.rememberedValue();
            if ((z | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new com.paypal.oslo.feature.activity.ui.search.view.compose.result.ActivitySearchNavResultKt$SetActivitySearchResultEffect$1$1(lazyPagingItems, function0, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function2 function2 = (kotlin.jvm.functions.Function2) rememberedValue;
            com.paypal.oslo.core.navigation.result.NavResultManager resolveNavResultManager = com.paypal.oslo.core.navigation.result.NavResultEffectKt.resolveNavResultManager(null, startRestartGroup, 0);
            com.paypal.oslo.feature.activity.ui.search.view.compose.result.ActivitySearchNavResultKt$SetActivitySearchResultEffect$$inlined$NavResultEffectrtGRyWw$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function2<com.paypal.oslo.core.navigation.result.NavResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId, kotlinx.coroutines.flow.Flow<? extends java.lang.Object>>() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.result.ActivitySearchNavResultKt$SetActivitySearchResultEffect$$inlined$NavResultEffect-rtGRyWw$1
                    @Override // kotlin.jvm.functions.Function2
                    public final /* synthetic */ kotlinx.coroutines.flow.Flow<? extends java.lang.Object> invoke(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, com.paypal.oslo.core.navigation.result.NavResultRequestId navResultRequestId) {
                        return m11951invokehN0UB1M(navResultManager, navResultRequestId.m11592unboximpl());
                    }

                    /* renamed from: invoke-hN0UB1M, reason: not valid java name */
                    public final kotlinx.coroutines.flow.Flow<java.lang.Object> m11951invokehN0UB1M(com.paypal.oslo.core.navigation.result.NavResultManager navResultManager, java.lang.String str) {
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navResultManager, "");
                        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
                        return navResultManager.m11582getScopedResultFlowInternalDpEMydE(str);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.oslo.core.navigation.result.NavResultEffectKt.m11578NavResultEffectImplrtGRyWw(navActivityDetailRequestId, resolveNavResultManager, function2, (kotlin.jvm.functions.Function2) rememberedValue2, startRestartGroup, 3072);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.result.ActivitySearchNavResultKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.search.view.compose.result.ActivitySearchNavResultKt.$r8$lambda$7MMm2qFZzhU2oqUY_W6OEDU_nKo(com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel.this, lazyPagingItems, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7MMm2qFZzhU2oqUY_W6OEDU_nKo(com.paypal.oslo.feature.activity.ui.search.model.ActivitySearchViewModel activitySearchViewModel, androidx.paging.compose.LazyPagingItems lazyPagingItems, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        SetActivitySearchResultEffect(activitySearchViewModel, lazyPagingItems, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static final /* synthetic */ void access$handleActivityNavResult(com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityNavResult activityNavResult, androidx.paging.compose.LazyPagingItems lazyPagingItems, kotlin.jvm.functions.Function0 function0) {
        com.paypal.oslo.feature.activity.api.navigation.result.options.ActivityResult navResults = activityNavResult.getNavResults();
        if (navResults.getNavResultOptions().getActions() == -1 && navResults.getNavResultOptions().isRefreshRequired()) {
            function0.invoke();
            lazyPagingItems.refresh();
        }
    }
}
