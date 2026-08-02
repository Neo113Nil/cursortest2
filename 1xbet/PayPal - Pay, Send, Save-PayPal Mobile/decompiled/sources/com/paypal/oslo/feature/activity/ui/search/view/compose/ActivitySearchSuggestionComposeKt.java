package com.paypal.oslo.feature.activity.ui.search.view.compose;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0006\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u000f\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState;", "searchSuggestions", "Lkotlin/Function1;", "", "", "onItemClick", "SearchSuggestionCompose", "(Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/runtime/Composer;I)V", "SearchSuggestionShimmerCompose"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivitySearchSuggestionComposeKt {
    public static final void SearchSuggestionCompose(final com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState activityUiState, final kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-428640169);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changed(activityUiState) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if (!startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-428640169, i2, -1, "com.paypal.oslo.feature.activity.ui.search.view.compose.SearchSuggestionCompose (ActivitySearchSuggestionCompose.kt:39)");
            }
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, companion);
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
            if (activityUiState instanceof com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Loading) {
                startRestartGroup.startReplaceGroup(392913216);
                getHighResolutionOutputSizeshNQ4ISI(startRestartGroup, 0);
                for (int i3 = 0; i3 < 3; i3++) {
                    SearchSuggestionShimmerCompose(startRestartGroup, 0);
                }
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            } else {
                if (activityUiState instanceof com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Failure) {
                    startRestartGroup.startReplaceGroup(393142616);
                    composer2 = startRestartGroup;
                } else {
                    if (!(activityUiState instanceof com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success)) {
                        startRestartGroup.startReplaceGroup(-1926989341);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(393246094);
                    com.paypal.oslo.feature.activity.domain.base.result.ActivityNetworkSuccessResult result = ((com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success) activityUiState).getResult();
                    com.paypal.oslo.feature.activity.domain.base.result.IActivityRemoteBaseResult data = result != null ? result.getData() : null;
                    com.paypal.oslo.feature.activity.domain.search.remote.ActivitySearchSuggestionResult activitySearchSuggestionResult = data instanceof com.paypal.oslo.feature.activity.domain.search.remote.ActivitySearchSuggestionResult ? (com.paypal.oslo.feature.activity.domain.search.remote.ActivitySearchSuggestionResult) data : null;
                    final java.util.List<java.lang.String> searchSuggestionsDomainList$activity_prodRelease = activitySearchSuggestionResult != null ? activitySearchSuggestionResult.getSearchSuggestionsDomainList$activity_prodRelease() : null;
                    if (searchSuggestionsDomainList$activity_prodRelease == null) {
                        searchSuggestionsDomainList$activity_prodRelease = kotlin.collections.CollectionsKt.emptyList();
                    }
                    if (!searchSuggestionsDomainList$activity_prodRelease.isEmpty()) {
                        startRestartGroup.startReplaceGroup(393484949);
                        getHighResolutionOutputSizeshNQ4ISI(startRestartGroup, 0);
                        boolean changedInstance = startRestartGroup.changedInstance(searchSuggestionsDomainList$activity_prodRelease);
                        boolean z = (i2 & 112) == 32;
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if ((changedInstance | z) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchSuggestionComposeKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchSuggestionComposeKt.$r8$lambda$pTQ3Q21EgYEd5Wk6w1hqMff1_94(searchSuggestionsDomainList$activity_prodRelease, function1, (androidx.compose.foundation.lazy.LazyListScope) obj);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue, startRestartGroup, 0, 511);
                        startRestartGroup.endReplaceGroup();
                        composer2 = startRestartGroup;
                    } else {
                        composer2 = startRestartGroup;
                        composer2.startReplaceGroup(393896257);
                        composer2.endReplaceGroup();
                    }
                }
                composer2.endReplaceGroup();
            }
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchSuggestionComposeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchSuggestionComposeKt.m11948$r8$lambda$zoCzVh3h25SHy4YzYDVqn7Up8Q(com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.this, function1, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1108158381);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1108158381, i, -1, "com.paypal.oslo.feature.activity.ui.search.view.compose.SuggestedLabelCompose (ActivitySearchSuggestionCompose.kt:74)");
            }
            com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_search_suggested, startRestartGroup, 0), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "search_suggested_label"), com.paypal.pds.core.Color.ContentFaint.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 432, 6, 1016);
            composer2 = startRestartGroup;
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), composer2, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchSuggestionComposeKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchSuggestionComposeKt.m11947$r8$lambda$MHzEKIx969lvrXVe6Gy6nGbDy4(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SearchSuggestionShimmerCompose(androidx.compose.runtime.Composer composer, final int i) {
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1883289925);
        if (!startRestartGroup.shouldExecute(i != 0, i & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1883289925, i, -1, "com.paypal.oslo.feature.activity.ui.search.view.compose.SearchSuggestionShimmerCompose (ActivitySearchSuggestionCompose.kt:86)");
            }
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "search_suggestion_shimmer_container");
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
            com.paypal.pds.components.ShimmerKt.Shimmer((androidx.compose.ui.Modifier) null, (com.paypal.pds.components.ShimmerStyle) com.paypal.pds.components.ShimmerStyle.Container.INSTANCE, true, (kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) com.paypal.oslo.feature.activity.ui.search.view.compose.ComposableSingletons$ActivitySearchSuggestionComposeKt.INSTANCE.m11950getLambda$715675716$activity_prodRelease(), startRestartGroup, 3504, 1);
            androidx.compose.foundation.layout.SpacerKt.Spacer(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing12()), startRestartGroup, 0);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchSuggestionComposeKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchSuggestionComposeKt.m11946$r8$lambda$ADdL2QMyQgQHfbDPSIyk0Diejs(i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$ADdL2QMyQgQHfbDPSIyk-0Diejs, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11946$r8$lambda$ADdL2QMyQgQHfbDPSIyk0Diejs(int i, androidx.compose.runtime.Composer composer, int i2) {
        SearchSuggestionShimmerCompose(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$MHzEKIx969lv-rXVe6Gy6nGbDy4, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11947$r8$lambda$MHzEKIx969lvrXVe6Gy6nGbDy4(int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighResolutionOutputSizeshNQ4ISI(composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$pTQ3Q21EgYEd5Wk6w1hqMff1_94(final java.util.List list, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        final com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchSuggestionComposeKt$SearchSuggestionCompose$lambda$0$1$0$$inlined$items$default$1 activitySearchSuggestionComposeKt$SearchSuggestionCompose$lambda$0$1$0$$inlined$items$default$1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchSuggestionComposeKt$SearchSuggestionCompose$lambda$0$1$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Void invoke(java.lang.String str) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                return invoke((java.lang.String) obj);
            }
        };
        lazyListScope.items(list.size(), null, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchSuggestionComposeKt$SearchSuggestionCompose$lambda$0$1$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(802480018, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchSuggestionComposeKt$SearchSuggestionCompose$lambda$0$1$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                final java.lang.String str = (java.lang.String) list.get(i);
                composer.startReplaceGroup(661756534);
                com.paypal.pds.components.ListItem listItem = new com.paypal.pds.components.ListItem(str, null, null, null, false, false, null, null, null, null, null, null, null, 8190, null);
                boolean changed = composer.changed(function1);
                boolean changed2 = composer.changed(str);
                java.lang.Object rememberedValue = composer.rememberedValue();
                if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    final kotlin.jvm.functions.Function1 function12 = function1;
                    rememberedValue = (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<kotlin.Unit>() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchSuggestionComposeKt$SearchSuggestionCompose$1$2$1$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public final /* bridge */ /* synthetic */ kotlin.Unit invoke() {
                            function12.invoke(str);
                            return kotlin.Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                com.paypal.pds.components.ListKt.ListItemView(listItem, null, false, (kotlin.jvm.functions.Function0) rememberedValue, null, null, false, composer, com.paypal.pds.components.ListItem.$stable, 118);
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$zoCzVh3h25SHy4YzYDVqn-7Up8Q, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11948$r8$lambda$zoCzVh3h25SHy4YzYDVqn7Up8Q(com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState activityUiState, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        SearchSuggestionCompose(activityUiState, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
