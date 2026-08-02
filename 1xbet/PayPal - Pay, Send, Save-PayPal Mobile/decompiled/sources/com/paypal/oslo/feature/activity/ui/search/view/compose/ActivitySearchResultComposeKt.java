package com.paypal.oslo.feature.activity.ui.search.view.compose;

@kotlin.Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\u001aY\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00010\b2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00010\fH\u0001¢\u0006\u0002\u0010\r\u001aS\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00010\u001aH\u0001¢\u0006\u0002\u0010\u001b\u001a\u001a\u0010\u001c\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001e\u001a\u00020\u001fH\u0000¨\u0006 "}, d2 = {"SearchResultCompose", "", "isQueryValid", "", "pagingItems", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "onItemClick", "Lkotlin/Function2;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityTransactionModel;", "Lcom/paypal/oslo/feature/activity/domain/common/models/ActivityActionModel;", "onItemPrimaryActionClick", "Lkotlin/Function1;", "(ZLandroidx/paging/compose/LazyPagingItems;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "SearchEmptyState", "title", "", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "avatarIcon", "Lcom/paypal/pds/core/Icon;", "avatarEmphasis", "Lcom/paypal/pds/components/AvatarEmphasis;", "modifier", "Landroidx/compose/ui/Modifier;", "buttonText", "onRetryClick", "Lkotlin/Function0;", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/pds/core/Icon;Lcom/paypal/pds/components/AvatarEmphasis;Landroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "generateKey", "activityItem", "index", "", "activity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivitySearchResultComposeKt {
    /* JADX WARN: Removed duplicated region for block: B:130:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchResultCompose(final boolean z, final androidx.paging.compose.LazyPagingItems<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> lazyPagingItems, kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel, ? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function2, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel, ? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function22;
        int i3;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function12;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function13;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23;
        final kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel, ? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function24;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function14;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function15;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function16;
        kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel, ? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function25;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyPagingItems, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1057029715);
        int i4 = (i & 6) == 0 ? (startRestartGroup.changed(z) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i4 |= (i & 64) == 0 ? startRestartGroup.changed(lazyPagingItems) : startRestartGroup.changedInstance(lazyPagingItems) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            function22 = function2;
            i4 |= startRestartGroup.changedInstance(function22) ? 256 : 128;
            i3 = i2 & 8;
            if (i3 == 0) {
                i4 |= 3072;
            } else if ((i & 3072) == 0) {
                function12 = function1;
                i4 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
                if (!startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    function13 = function12;
                } else {
                    if (i5 != 0) {
                        java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                        if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt.$r8$lambda$sFw3qQEy5uOpdXrmLrEUgh9WQR4((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel) obj, (com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj2);
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue);
                        }
                        function24 = (kotlin.jvm.functions.Function2) rememberedValue;
                    } else {
                        function24 = function22;
                    }
                    if (i3 != 0) {
                        java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                        if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function1
                                public final java.lang.Object invoke(java.lang.Object obj) {
                                    kotlin.Unit unit;
                                    unit = kotlin.Unit.INSTANCE;
                                    return unit;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue2);
                        }
                        function14 = (kotlin.jvm.functions.Function1) rememberedValue2;
                    } else {
                        function14 = function12;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-1057029715, i4, -1, "com.paypal.oslo.feature.activity.ui.search.view.compose.SearchResultCompose (ActivitySearchResultCompose.kt:63)");
                    }
                    java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                    if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue3;
                    if (!z) {
                        startRestartGroup.startReplaceGroup(728371664);
                        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function17 = function14;
                        final kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel, ? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function26 = function24;
                        SearchEmptyState(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_search_validation_error_title, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_search_validation_error_description, startRestartGroup, 0), com.paypal.pds.core.Icon.Warning.INSTANCE, com.paypal.pds.components.AvatarEmphasis.Default.INSTANCE, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "search_validation_error_state"), null, null, startRestartGroup, 28032, 96);
                        startRestartGroup.endReplaceGroup();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        endRestartGroup = startRestartGroup.endRestartGroup();
                        if (endRestartGroup != null) {
                            function23 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function2
                                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                    return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt.$r8$lambda$H03DJBs6Xv4cso1TbCeXT6NNliA(z, lazyPagingItems, function26, function17, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                                }
                            };
                            endRestartGroup.updateScope(function23);
                            return;
                        }
                        return;
                    }
                    kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function18 = function14;
                    startRestartGroup.startReplaceGroup(728776245);
                    startRestartGroup.endReplaceGroup();
                    androidx.paging.LoadState refresh = lazyPagingItems.getLoadState().getRefresh();
                    if (!(refresh instanceof androidx.paging.LoadState.Loading)) {
                        if (refresh instanceof androidx.paging.LoadState.Error) {
                            startRestartGroup.startReplaceGroup(729270695);
                            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_details_error_screen_title, startRestartGroup, 0);
                            java.lang.String stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_details_error_screen_subtitle, startRestartGroup, 0);
                            com.paypal.pds.core.Icon.Alert alert = com.paypal.pds.core.Icon.Alert.INSTANCE;
                            com.paypal.pds.components.AvatarEmphasis.Custom custom = new com.paypal.pds.components.AvatarEmphasis.Custom(com.paypal.pds.core.Color.ContentRoleBaseNegative.INSTANCE, com.paypal.pds.core.Color.BackgroundRoleBaseNegative.INSTANCE);
                            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "search_error_empty_state");
                            java.lang.String stringResource3 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_error_state_retry_text, startRestartGroup, 0);
                            if ((i4 & 112) != 32 && ((i4 & 64) == 0 || !startRestartGroup.changedInstance(lazyPagingItems))) {
                                r16 = false;
                            }
                            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                            if (r16 || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt$$ExternalSyntheticLambda9
                                    @Override // kotlin.jvm.functions.Function0
                                    public final java.lang.Object invoke() {
                                        return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt.$r8$lambda$dSUezLkgWbfwESKduTR6aJ93uRw(androidx.paging.compose.LazyPagingItems.this);
                                    }
                                };
                                startRestartGroup.updateRememberedValue(rememberedValue4);
                            }
                            SearchEmptyState(stringResource, stringResource2, alert, custom, testTag, stringResource3, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 24960, 0);
                            startRestartGroup.endReplaceGroup();
                            function16 = function18;
                            function25 = function24;
                        } else if (refresh instanceof androidx.paging.LoadState.NotLoading) {
                            startRestartGroup.startReplaceGroup(730152211);
                            if (lazyPagingItems.getItemCount() == 0) {
                                startRestartGroup.startReplaceGroup(730135750);
                                function25 = function24;
                                SearchEmptyState(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_search_no_results_title, startRestartGroup, 0), androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_search_no_results_description, startRestartGroup, 0), com.paypal.pds.core.Icon.MagnifyingGlass.INSTANCE, com.paypal.pds.components.AvatarEmphasis.Default.INSTANCE, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "search_empty_results_state"), null, null, startRestartGroup, 28032, 96);
                                startRestartGroup.endReplaceGroup();
                                function16 = function18;
                            } else {
                                startRestartGroup.startReplaceGroup(730646816);
                                kotlin.Unit unit = kotlin.Unit.INSTANCE;
                                com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt$SearchResultCompose$6$1 rememberedValue5 = startRestartGroup.rememberedValue();
                                if (rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    rememberedValue5 = new com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt$SearchResultCompose$6$1(null);
                                    startRestartGroup.updateRememberedValue(rememberedValue5);
                                }
                                androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue5, startRestartGroup, 6);
                                boolean z2 = (i4 & 112) == 32 || ((i4 & 64) != 0 && startRestartGroup.changedInstance(lazyPagingItems));
                                boolean z3 = (i4 & 896) == 256;
                                r16 = (i4 & 7168) == 2048;
                                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                                if (((z2 || z3) || r16) || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                    function15 = function18;
                                    rememberedValue6 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt$$ExternalSyntheticLambda10
                                        @Override // kotlin.jvm.functions.Function1
                                        public final java.lang.Object invoke(java.lang.Object obj) {
                                            return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt.m11945$r8$lambda$oKJwsWrXjSa7MkIUzJxWHvjml8(androidx.paging.compose.LazyPagingItems.this, mutableState, function24, function15, (androidx.compose.foundation.lazy.LazyListScope) obj);
                                        }
                                    };
                                    startRestartGroup.updateRememberedValue(rememberedValue6);
                                } else {
                                    function15 = function18;
                                }
                                kotlin.jvm.functions.Function1 function19 = (kotlin.jvm.functions.Function1) rememberedValue6;
                                function16 = function15;
                                function25 = function24;
                                androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(null, null, null, false, null, null, null, false, null, function19, startRestartGroup, 0, 511);
                                startRestartGroup.endReplaceGroup();
                            }
                            startRestartGroup.endReplaceGroup();
                        } else {
                            startRestartGroup.startReplaceGroup(2101726333);
                            startRestartGroup.endReplaceGroup();
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                    } else {
                        startRestartGroup.startReplaceGroup(728955239);
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
                        startRestartGroup.startReplaceGroup(688302926);
                        for (int i6 = 0; i6 < 2; i6++) {
                            com.paypal.oslo.feature.activity.ui.common.ActivityShimmerComposeKt.ActivityLedgerPaginationShimmerCompose(androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "refreshLoader"), startRestartGroup, 6, 0);
                        }
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceGroup();
                        function16 = function18;
                        function25 = function24;
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    function22 = function25;
                    function13 = function16;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final kotlin.jvm.functions.Function2<? super com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel, ? super com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel, kotlin.Unit> function27 = function22;
                    function23 = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt.$r8$lambda$v79zwK93z3EKOPyuLPaUDMSnZKs(z, lazyPagingItems, function27, function13, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    };
                    endRestartGroup.updateScope(function23);
                    return;
                }
                return;
            }
            function12 = function1;
            if (!startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        function22 = function2;
        i3 = i2 & 8;
        if (i3 == 0) {
        }
        function12 = function1;
        if (!startRestartGroup.shouldExecute((i4 & 1171) != 1170, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SearchEmptyState(final java.lang.String str, final java.lang.String str2, final com.paypal.pds.core.Icon icon, final com.paypal.pds.components.AvatarEmphasis avatarEmphasis, androidx.compose.ui.Modifier modifier, java.lang.String str3, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        java.lang.String str4;
        int i5;
        final kotlin.jvm.functions.Function0<kotlin.Unit> function02;
        final java.lang.String str5;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.functions.Function0<kotlin.Unit> function03;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(avatarEmphasis, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-497498437);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changed(icon) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changed(avatarEmphasis) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                str4 = str3;
                i3 |= startRestartGroup.changed(str4) ? 131072 : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    function02 = function0;
                    i3 |= startRestartGroup.changedInstance(function02) ? 1048576 : 524288;
                    if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                        startRestartGroup.skipToGroupEnd();
                        str5 = str4;
                        modifier3 = modifier2;
                    } else {
                        androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        java.lang.String str6 = i4 != 0 ? null : str4;
                        if (i5 != 0) {
                            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt$$ExternalSyntheticLambda4
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
                            androidx.compose.runtime.ComposerKt.traceEventStart(-497498437, i3, -1, "com.paypal.oslo.feature.activity.ui.search.view.compose.SearchEmptyState (ActivitySearchResultCompose.kt:183)");
                        }
                        androidx.compose.ui.Modifier fillMaxSize$default = androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                        androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
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
                        int i7 = i3 << 9;
                        androidx.compose.ui.Modifier modifier5 = modifier4;
                        com.paypal.pds.components.EmptyStateKt.EmptyState(icon, null, avatarEmphasis, str, str2, str6, function03, startRestartGroup, (i7 & 57344) | ((i3 >> 6) & 14) | ((i3 >> 3) & 896) | (i7 & 7168) | (458752 & i3) | (i3 & 3670016), 2);
                        startRestartGroup.endNode();
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        str5 = str6;
                        function02 = function03;
                        modifier3 = modifier5;
                    }
                    endRestartGroup = startRestartGroup.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt.$r8$lambda$kooMTsjra2nLgkl_xhfL1RO41_0(str, str2, icon, avatarEmphasis, modifier3, str5, function02, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                function02 = function0;
                if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            str4 = str3;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            function02 = function0;
            if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        str4 = str3;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        function02 = function0;
        if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final java.lang.String generateKey(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem, int i) {
        java.lang.String assignLazyColumnKeys;
        return (activityItem == null || (assignLazyColumnKeys = com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt.assignLazyColumnKeys(activityItem)) == null) ? "pagination_item_".concat(java.lang.String.valueOf(i)) : assignLazyColumnKeys;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$H03DJBs6Xv4cso1TbCeXT6NNliA(boolean z, androidx.paging.compose.LazyPagingItems lazyPagingItems, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SearchResultCompose(z, lazyPagingItems, function2, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NsyQOOdNEvhihEa9vs6J69FzBEs(androidx.paging.compose.LazyPagingItems lazyPagingItems, final kotlin.jvm.functions.Function2 function2, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if ((i2 & 48) == 0) {
            i2 |= composer.changed(i) ? 32 : 16;
        }
        if (composer.shouldExecute((i2 & 145) != 144, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1847060843, i2, -1, "com.paypal.oslo.feature.activity.ui.search.view.compose.SearchResultCompose.<anonymous>.<anonymous>.<anonymous> (ActivitySearchResultCompose.kt:142)");
            }
            final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem) lazyPagingItems.get(i);
            if (activityItem == null) {
                composer.startReplaceGroup(-1331337164);
            } else {
                composer.startReplaceGroup(-1331337163);
                if (activityItem instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) {
                    composer.startReplaceGroup(120699503);
                    com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel data = ((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) activityItem).getData();
                    boolean changed = composer.changed(function2);
                    boolean changed2 = composer.changed(activityItem);
                    java.lang.Object rememberedValue = composer.rememberedValue();
                    if ((changed | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt.$r8$lambda$zZD72SSk1K8QGEkn7c29eCeeW30(kotlin.jvm.functions.Function2.this, activityItem, (com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue;
                    boolean changed3 = composer.changed(function1);
                    java.lang.Object rememberedValue2 = composer.rememberedValue();
                    if (changed3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final java.lang.Object invoke(java.lang.Object obj) {
                                return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt.$r8$lambda$mhxnMLM0r6J2oyeMewYFF6OalkY(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj);
                            }
                        };
                        composer.updateRememberedValue(rememberedValue2);
                    }
                    com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityLedgerTransactionSectionsContentComposeKt.ActivityItemView(data, function12, (kotlin.jvm.functions.Function1) rememberedValue2, composer, 0);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(121494250);
                    composer.endReplaceGroup();
                }
            }
            composer.endReplaceGroup();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$dSUezLkgWbfwESKduTR6aJ93uRw(androidx.paging.compose.LazyPagingItems lazyPagingItems) {
        lazyPagingItems.refresh();
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$kooMTsjra2nLgkl_xhfL1RO41_0(java.lang.String str, java.lang.String str2, com.paypal.pds.core.Icon icon, com.paypal.pds.components.AvatarEmphasis avatarEmphasis, androidx.compose.ui.Modifier modifier, java.lang.String str3, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SearchEmptyState(str, str2, icon, avatarEmphasis, modifier, str3, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mhxnMLM0r6J2oyeMewYFF6OalkY(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        function1.invoke(activityActionModel);
        com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsTrackerKt.trackSearchActionCtaPressed(activityActionModel.getType().getRawValue());
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$oKJwsWrXjSa7MkIUz-JxWHvjml8, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11945$r8$lambda$oKJwsWrXjSa7MkIUzJxWHvjml8(final androidx.paging.compose.LazyPagingItems lazyPagingItems, androidx.compose.runtime.MutableState mutableState, final kotlin.jvm.functions.Function2 function2, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, "result_count_header", null, com.paypal.oslo.feature.activity.ui.search.view.compose.ComposableSingletons$ActivitySearchResultComposeKt.INSTANCE.getLambda$1453211028$activity_prodRelease(), 2, null);
        androidx.compose.foundation.lazy.LazyListScope.items$default(lazyListScope, lazyPagingItems.getItemCount(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.Object generateKey;
                generateKey = com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt.generateKey((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem) androidx.paging.compose.LazyPagingItems.this.peek(r2), ((java.lang.Integer) obj).intValue());
                return generateKey;
            }
        }, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1847060843, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function4
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                return com.paypal.oslo.feature.activity.ui.search.view.compose.ActivitySearchResultComposeKt.$r8$lambda$NsyQOOdNEvhihEa9vs6J69FzBEs(androidx.paging.compose.LazyPagingItems.this, function2, function1, (androidx.compose.foundation.lazy.LazyItemScope) obj, ((java.lang.Integer) obj2).intValue(), (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
            }
        }), 4, null);
        com.paypal.oslo.feature.activity.ui.common.ComposableUtilsKt.lazyPagingItemsStateListener(lazyListScope, mutableState, lazyPagingItems, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "appendLoader"));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$sFw3qQEy5uOpdXrmLrEUgh9WQR4(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$v79zwK93z3EKOPyuLPaUDMSnZKs(boolean z, androidx.paging.compose.LazyPagingItems lazyPagingItems, kotlin.jvm.functions.Function2 function2, kotlin.jvm.functions.Function1 function1, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SearchResultCompose(z, lazyPagingItems, function2, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zZD72SSk1K8QGEkn7c29eCeeW30(kotlin.jvm.functions.Function2 function2, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem, com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        function2.invoke(((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) activityItem).getData(), activityActionModel);
        return kotlin.Unit.INSTANCE;
    }
}
