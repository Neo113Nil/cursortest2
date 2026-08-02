package com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list;

@kotlin.Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aO\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u0012\u001a\u001e\u0010\u0013\u001a\u00020\u00142\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u0002\u001a@\u0010\u0017\u001a\u00020\u0001*\u00020\u00182\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u001aH\u0000\u001a\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0005H\u0000\u001a9\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0003¢\u0006\u0002\u0010\u001f¨\u0006 "}, d2 = {"RenderActivityItemSections", "", "activityItems", "Landroidx/compose/runtime/State;", "", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "ledgerScreenState", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState;", "onEvent", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerEvent;", "activityLedgerViewModel", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityLedgerViewModel;", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/runtime/State;Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityLedgerViewModel;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "rememberActivityItemsListState", "Landroidx/compose/foundation/lazy/LazyListState;", "(Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityLedgerViewModel;Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/lazy/LazyListState;", "getContentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "l1Insets", "Lcom/paypal/oslo/core/navigation/scene/L1ContentInsets;", "renderPaginationItems", "Landroidx/compose/foundation/lazy/LazyListScope;", "paginatedItems", "Landroidx/paging/compose/LazyPagingItems;", "assignLazyColumnKeys", "", "item", "RenderActivityListItem", "(Lcom/paypal/oslo/feature/activity/ui/ledger/model/states/ActivityLedgerScreenState;Lkotlin/jvm/functions/Function1;Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityLedgerViewModel;Landroidx/compose/runtime/Composer;I)V", "activity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLedgerSectionsListContentComposeKt {
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RenderActivityItemSections(final androidx.compose.runtime.State<? extends java.util.List<? extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem>> state, final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState activityLedgerScreenState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent, kotlin.Unit> function1, final com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        androidx.compose.foundation.layout.PaddingValues m1701PaddingValuesYgX7TsA$default;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(state, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerScreenState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerViewModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1493000449);
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
            i3 |= startRestartGroup.changedInstance(activityLedgerViewModel) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i3;
            if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(1493000449, i4, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.RenderActivityItemSections (ActivityLedgerSectionsListContentCompose.kt:64)");
                }
                int i6 = i4 >> 9;
                int i7 = i6 & 14;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(563254687, i7, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.rememberActivityItemsListState (ActivityLedgerSectionsListContentCompose.kt:138)");
                }
                startRestartGroup.startReplaceGroup(121886860);
                final androidx.compose.foundation.lazy.LazyListState rememberLazyListState = androidx.compose.foundation.lazy.LazyListStateKt.rememberLazyListState(activityLedgerViewModel.getSavedScrollState().getFirstVisibleItemIndex(), activityLedgerViewModel.getSavedScrollState().getFirstVisibleItemScrollOffset(), startRestartGroup, 0, 0);
                boolean changedInstance = startRestartGroup.changedInstance(activityLedgerViewModel);
                boolean changed = startRestartGroup.changed(rememberLazyListState);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((changedInstance | changed) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt.$r8$lambda$j32cB8Z6ZVaMMflkkNyXXXcp3HQ(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel.this, rememberLazyListState, (androidx.compose.runtime.DisposableEffectScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.runtime.EffectsKt.DisposableEffect(activityLedgerViewModel, (kotlin.jvm.functions.Function1<? super androidx.compose.runtime.DisposableEffectScope, ? extends androidx.compose.runtime.DisposableEffectResult>) rememberedValue, startRestartGroup, i6 & 14);
                startRestartGroup.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                boolean changedInstance2 = startRestartGroup.changedInstance(activityLedgerViewModel);
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (changedInstance2 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt.$r8$lambda$JcT7u2CCyP5hE43iq0rYb9ymCK0(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.core.navigation.scene.TabReselectionHandlerKt.TabReselectionHandler(rememberLazyListState, (kotlin.jvm.functions.Function0<kotlin.Unit>) rememberedValue2, startRestartGroup, 0, 0);
                com.paypal.oslo.core.navigation.scene.L1ContentInsets l1ContentInsets = (com.paypal.oslo.core.navigation.scene.L1ContentInsets) startRestartGroup.consume(com.paypal.oslo.core.navigation.scene.LocalL1ContentInsetsKt.getLocalL1ContentInsets());
                final com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState activityUiState = (com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState) androidx.view.compose.FlowExtKt.collectAsStateWithLifecycle(activityLedgerViewModel.getActivityLedgerUIState$activity_prodRelease(), (androidx.view.LifecycleOwner) null, (androidx.lifecycle.Lifecycle.State) null, (kotlin.coroutines.CoroutineContext) null, startRestartGroup, 0, 7).getValue();
                java.lang.Object[] objArr = {activityLedgerScreenState.getActivityFilterType()};
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            androidx.compose.runtime.MutableState mutableStateOf$default;
                            mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                            return mutableStateOf$default;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 48);
                java.lang.Object[] objArr2 = {activityLedgerScreenState.getActivityFilterType()};
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            androidx.compose.runtime.MutableState mutableStateOf$default;
                            mutableStateOf$default = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                            return mutableStateOf$default;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                final androidx.compose.runtime.MutableState mutableState2 = (androidx.compose.runtime.MutableState) androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable(objArr2, (kotlin.jvm.functions.Function0) rememberedValue4, startRestartGroup, 48);
                int i8 = i4 & 112;
                final androidx.paging.compose.LazyPagingItems<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> rememberPaginatedItemsCollector = com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerPaginationSectionsListContentComposeKt.rememberPaginatedItemsCollector(mutableState, activityLedgerScreenState, activityLedgerViewModel, startRestartGroup, ((i4 >> 3) & 896) | i8);
                java.util.List<? extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> value = state.getValue();
                if (!value.isEmpty() && !com.paypal.oslo.feature.activity.domain.common.extensions.ActivityExtensionsKt.shouldShowFilterEmptyState(value)) {
                    m1701PaddingValuesYgX7TsA$default = androidx.compose.foundation.layout.PaddingKt.m1703PaddingValuesa9UjIt4$default(0.0f, 0.0f, 0.0f, l1ContentInsets.m11616getBottomD9Ej5fM(), 7, null);
                } else {
                    m1701PaddingValuesYgX7TsA$default = androidx.compose.foundation.layout.PaddingKt.m1701PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                }
                androidx.compose.foundation.layout.PaddingValues paddingValues = m1701PaddingValuesYgX7TsA$default;
                boolean z = (i4 & 14) == 4;
                boolean z2 = i8 == 32;
                boolean z3 = (i4 & 896) == 256;
                boolean changedInstance3 = startRestartGroup.changedInstance(activityLedgerViewModel);
                boolean changedInstance4 = startRestartGroup.changedInstance(rememberPaginatedItemsCollector);
                boolean changed2 = startRestartGroup.changed(mutableState);
                boolean changed3 = startRestartGroup.changed(mutableState2);
                boolean changed4 = startRestartGroup.changed(activityUiState);
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if ((z | z2 | z3 | changedInstance3 | changedInstance4 | changed2 | changed3 | changed4) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt.$r8$lambda$itE07Ixhi0Axngxk2Ec11kxNsho(androidx.compose.runtime.State.this, activityLedgerViewModel, rememberPaginatedItemsCollector, mutableState, mutableState2, activityUiState, activityLedgerScreenState, function1, (androidx.compose.foundation.lazy.LazyListScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                composer2 = startRestartGroup;
                androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(modifier4, rememberLazyListState, paddingValues, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue5, composer2, (i4 >> 12) & 14, 504);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt.$r8$lambda$LZJbGOmwazwedKnPRPIjxMXw5X8(androidx.compose.runtime.State.this, activityLedgerScreenState, function1, activityLedgerViewModel, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if (startRestartGroup.shouldExecute((i4 & 9363) == 9362, i4 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void renderPaginationItems(androidx.compose.foundation.lazy.LazyListScope lazyListScope, final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState activityLedgerScreenState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent, kotlin.Unit> function1, final com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, final androidx.paging.compose.LazyPagingItems<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> lazyPagingItems) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerScreenState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityLedgerViewModel, "");
        if (lazyPagingItems != null) {
            androidx.compose.foundation.lazy.LazyListScope.items$default(lazyListScope, lazyPagingItems.getItemCount(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt.$r8$lambda$7VVrICNQ4XedfY__Zxpzsbte_5M(androidx.paging.compose.LazyPagingItems.this, ((java.lang.Integer) obj).intValue());
                }
            }, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(-1547296694, true, new kotlin.jvm.functions.Function4() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function4
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt.$r8$lambda$Rv4LneGDxCniNeU1e6EPCqI9dS0(androidx.paging.compose.LazyPagingItems.this, activityLedgerScreenState, function1, activityLedgerViewModel, (androidx.compose.foundation.lazy.LazyItemScope) obj, ((java.lang.Integer) obj2).intValue(), (androidx.compose.runtime.Composer) obj3, ((java.lang.Integer) obj4).intValue());
                }
            }), 4, null);
        }
    }

    public static final java.lang.String assignLazyColumnKeys(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityItem, "");
        if (activityItem instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) {
            java.lang.String simpleName = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(activityItem.getClass()).getSimpleName();
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction transaction = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) activityItem;
            long uniqueID = transaction.getUniqueID();
            long uniqueID2 = transaction.getData().getUniqueID();
            int hashCode = transaction.hashCode();
            java.lang.String id = transaction.getData().getId();
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(simpleName);
            sb.append("_");
            sb.append(uniqueID);
            sb.append("_");
            sb.append(uniqueID2);
            sb.append("_");
            sb.append(hashCode);
            sb.append("_");
            sb.append(id);
            return sb.toString();
        }
        java.lang.String simpleName2 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(activityItem.getClass()).getSimpleName();
        long uniqueID3 = activityItem.getUniqueID();
        long uniqueID4 = activityItem.getData().getUniqueID();
        int hashCode2 = activityItem.hashCode();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
        sb2.append(simpleName2);
        sb2.append("_");
        sb2.append(uniqueID3);
        sb2.append("_");
        sb2.append(uniqueID4);
        sb2.append("_");
        sb2.append(hashCode2);
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Camera2StreamConfigurationMap(final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState activityLedgerScreenState, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent, kotlin.Unit> function1, final com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem, final com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        boolean z;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1074119457);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(activityLedgerScreenState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(activityItem) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(activityLedgerViewModel) ? 2048 : 1024;
        }
        if (!startRestartGroup.shouldExecute((i2 & 1171) != 1170, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1074119457, i2, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.RenderActivityListItem (ActivityLedgerSectionsListContentCompose.kt:238)");
            }
            com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType = activityLedgerScreenState.getActivityFilterType();
            if (activityItem instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.SectionHeader) {
                startRestartGroup.startReplaceGroup(1436658867);
                com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel data = ((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.SectionHeader) activityItem).getData();
                int i3 = i2 & 112;
                boolean z2 = i3 == 32;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt.$r8$lambda$KsERkTP3maoBMlHBDujmPkvYRqQ(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue;
                boolean z3 = i3 == 32;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (z3 || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt.$r8$lambda$vzFhrzLKa04INcL0JOnEKKyWTEA(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue2;
                z = i3 == 32;
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (z || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt$$ExternalSyntheticLambda11
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt.m11902$r8$lambda$DqODHpKLPvCEUiy4x0YsqyAs_A(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.header.ActivityItemSectionHeaderViewComposeKt.ActivityItemSectionView(data, activityFilterType, activityLedgerViewModel, function12, function13, (kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, (i2 >> 3) & 896, 0);
                startRestartGroup.endReplaceGroup();
            } else if (activityItem instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.DateHeader) {
                startRestartGroup.startReplaceGroup(1436677737);
                com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.header.ActivityItemDateHeaderViewComposeKt.ActivityItemDateHeaderView(((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.DateHeader) activityItem).getData(), androidx.compose.foundation.layout.PaddingKt.m1707paddingVpY3zN4(androidx.compose.ui.Modifier.INSTANCE, com.paypal.pds.core.ConstantsKt.getSpacing8(), com.paypal.pds.core.ConstantsKt.getSpacing8()), startRestartGroup, 0, 0);
                startRestartGroup.endReplaceGroup();
            } else if (activityItem instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.DayOfWeekHeader) {
                startRestartGroup.startReplaceGroup(1436684467);
                com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.header.ActivityItemDayOfWeekViewSectionHeaderViewComposeKt.ActivityItemDayOfWeekView(((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.DayOfWeekHeader) activityItem).getData(), startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (activityItem instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) {
                startRestartGroup.startReplaceGroup(1587673146);
                com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction transaction = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) activityItem;
                com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityLedgerTransactionSectionsContentComposeKt.ActivityItemView(transaction.getData(), com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.TransactionItemClickEventHandlerKt.performTransactionTileClickEvent(transaction, function1), com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.TransactionItemClickEventHandlerKt.performPrimaryCTAClickEvent(function1), startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (activityItem instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.UpcomingItemsSection) {
                startRestartGroup.startReplaceGroup(1587989036);
                java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel> upcomingSectionsList = ((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.UpcomingItemsSection) activityItem).getData().getUpcomingSectionsList();
                z = (i2 & 112) == 32;
                java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (z || rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt.m11903$r8$lambda$TrXKowgynUcfn1esSTVdSAWuo(kotlin.jvm.functions.Function1.this, (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.ActivityLedgerUpcomingSectionsContentComposeKt.UpcomingSectionItemView(upcomingSectionsList, (kotlin.jvm.functions.Function1) rememberedValue4, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else if (activityItem instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.TransactionWithActionCard) {
                startRestartGroup.startReplaceGroup(1588498583);
                com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.TransactionWithActionCard transactionWithActionCard = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.TransactionWithActionCard) activityItem;
                com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel data2 = transactionWithActionCard.getData();
                com.paypal.oslo.feature.activity.domain.ledger.models.ActionCardModel actionCard = transactionWithActionCard.getActionCard();
                int i4 = i2 & 112;
                boolean z4 = i4 == 32;
                boolean z5 = (i2 & 896) == 256;
                java.lang.Object rememberedValue5 = startRestartGroup.rememberedValue();
                if ((z5 | z4) || rememberedValue5 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt.$r8$lambda$o9O6x2bG_H8yk03JcDGfX68QE_g(kotlin.jvm.functions.Function1.this, activityItem);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue5;
                z = i4 == 32;
                java.lang.Object rememberedValue6 = startRestartGroup.rememberedValue();
                if (z || rememberedValue6 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt$$ExternalSyntheticLambda14
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt.$r8$lambda$qNcUACrUOSBAesV9is5FfCd8kdQ(kotlin.jvm.functions.Function1.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue6);
                }
                com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityActionCardItemViewKt.ActivityActionCardItemView(data2, actionCard, function0, (kotlin.jvm.functions.Function0) rememberedValue6, startRestartGroup, 0);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(1436659479);
                startRestartGroup.endReplaceGroup();
                throw new kotlin.NoWhenBranchMatchedException();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt$$ExternalSyntheticLambda15
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt.$r8$lambda$G4Sr8bT6BwuPdLQ2yjX6KQYvFWE(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState.this, function1, activityItem, activityLedgerViewModel, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7PDQv8E7HwHt_b3adKf4nxpQj2w(androidx.compose.foundation.lazy.LazyListScope lazyListScope, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState activityLedgerScreenState, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, androidx.paging.compose.LazyPagingItems lazyPagingItems) {
        renderPaginationItems(lazyListScope, activityLedgerScreenState, function1, activityLedgerViewModel, lazyPagingItems);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$7VVrICNQ4XedfY__Zxpzsbte_5M(androidx.paging.compose.LazyPagingItems lazyPagingItems, int i) {
        java.lang.String assignLazyColumnKeys;
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem) lazyPagingItems.peek(i);
        return (activityItem == null || (assignLazyColumnKeys = assignLazyColumnKeys(activityItem)) == null) ? "pagination_item_".concat(java.lang.String.valueOf(i)) : assignLazyColumnKeys;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$A53ZctdU39aRRmHOT5vWcgRwxA8(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityItem, "");
        return assignLazyColumnKeys(activityItem);
    }

    /* renamed from: $r8$lambda$DqODHpKLPvCEUiy4x0YsqyA-s_A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11902$r8$lambda$DqODHpKLPvCEUiy4x0YsqyAs_A(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.SearchActionClickedEvent.INSTANCE);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$G4Sr8bT6BwuPdLQ2yjX6KQYvFWE(com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState activityLedgerScreenState, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, int i, androidx.compose.runtime.Composer composer, int i2) {
        Camera2StreamConfigurationMap(activityLedgerScreenState, function1, activityItem, activityLedgerViewModel, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JcT7u2CCyP5hE43iq0rYb9ymCK0(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel) {
        com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel.fetchActivityLedgerItems$activity_prodRelease$default(activityLedgerViewModel, null, 1, null);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$KsERkTP3maoBMlHBDujmPkvYRqQ(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFilterType, "");
        function1.invoke(new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.FilterApplied(activityFilterType));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$LZJbGOmwazwedKnPRPIjxMXw5X8(androidx.compose.runtime.State state, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState activityLedgerScreenState, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RenderActivityItemSections(state, activityLedgerScreenState, function1, activityLedgerViewModel, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Rv4LneGDxCniNeU1e6EPCqI9dS0(androidx.paging.compose.LazyPagingItems lazyPagingItems, com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState activityLedgerScreenState, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if ((i2 & 48) == 0) {
            i2 |= composer.changed(i) ? 32 : 16;
        }
        if (composer.shouldExecute((i2 & 145) != 144, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1547296694, i2, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.renderPaginationItems.<anonymous>.<anonymous> (ActivityLedgerSectionsListContentCompose.kt:189)");
            }
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem) lazyPagingItems.get(i);
            if (activityItem == null) {
                composer.startReplaceGroup(-1926684881);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1926684880);
                Camera2StreamConfigurationMap(activityLedgerScreenState, function1, activityItem, activityLedgerViewModel, composer, 0);
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

    /* renamed from: $r8$lambda$TrXKowg-ynUcfn1esS-TVdSAWuo, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11903$r8$lambda$TrXKowgynUcfn1esSTVdSAWuo(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel activityTransactionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityTransactionModel, "");
        function1.invoke(new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.PackageTrackPressedEvent(com.paypal.oslo.feature.activity.domain.common.extensions.ActivityExtensionsKt.toPackageDetailsDestinationsKey(activityTransactionModel)));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$itE07Ixhi0Axngxk2Ec11kxNsho(androidx.compose.runtime.State state, final com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, final androidx.paging.compose.LazyPagingItems lazyPagingItems, androidx.compose.runtime.MutableState mutableState, androidx.compose.runtime.MutableState mutableState2, com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState activityUiState, final com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerScreenState activityLedgerScreenState, final kotlin.jvm.functions.Function1 function1, final androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        final java.util.List list = (java.util.List) state.getValue();
        final kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt.$r8$lambda$A53ZctdU39aRRmHOT5vWcgRwxA8((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem) obj);
            }
        };
        final com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt$RenderActivityItemSections$lambda$3$0$$inlined$items$default$1 activityLedgerSectionsListContentComposeKt$RenderActivityItemSections$lambda$3$0$$inlined$items$default$1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt$RenderActivityItemSections$lambda$3$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Void invoke(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                return invoke((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem) obj);
            }
        };
        lazyListScope.items(list.size(), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt$RenderActivityItemSections$lambda$3$0$$inlined$items$default$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
            }
        }, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt$RenderActivityItemSections$lambda$3$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(802480018, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt$RenderActivityItemSections$lambda$3$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
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
                com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem) list.get(i);
                composer.startReplaceGroup(-1269853312);
                com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt.Camera2StreamConfigurationMap(activityLedgerScreenState, function1, activityItem, activityLedgerViewModel, composer, 0);
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerPaginationSectionsListContentComposeKt.addActivityLedgerItemsPaginationSource(lazyListScope, state, activityLedgerViewModel, lazyPagingItems, mutableState, mutableState2, activityUiState, new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt.$r8$lambda$7PDQv8E7HwHt_b3adKf4nxpQj2w(androidx.compose.foundation.lazy.LazyListScope.this, activityLedgerScreenState, function1, activityLedgerViewModel, lazyPagingItems);
            }
        });
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ androidx.compose.runtime.DisposableEffectResult $r8$lambda$j32cB8Z6ZVaMMflkkNyXXXcp3HQ(final com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, final androidx.compose.foundation.lazy.LazyListState lazyListState, androidx.compose.runtime.DisposableEffectScope disposableEffectScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(disposableEffectScope, "");
        return new androidx.compose.runtime.DisposableEffectResult() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.list.ActivityLedgerSectionsListContentComposeKt$rememberActivityItemsListState$lambda$0$0$0$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public final void dispose() {
                com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel.this.setSavedScrollState$activity_prodRelease(new com.paypal.oslo.feature.activity.ui.ledger.model.ActivityScrollState(lazyListState.getFirstVisibleItemIndex(), lazyListState.getFirstVisibleItemScrollOffset()));
            }
        };
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$o9O6x2bG_H8yk03JcDGfX68QE_g(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem) {
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.TransactionWithActionCard transactionWithActionCard = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.TransactionWithActionCard) activityItem;
        function1.invoke(new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.TransactionTilePressedEvent(transactionWithActionCard.getData()));
        com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsTrackerKt.trackTransactionCardPressed(transactionWithActionCard.getData().getAmountInformation().getAmount(), transactionWithActionCard.getData().getType().getRawValue(), com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.ACTION_CARD);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$qNcUACrUOSBAesV9is5FfCd8kdQ(kotlin.jvm.functions.Function1 function1) {
        function1.invoke(new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.OnPackageTrackingLinkEmailClickedEvent(new com.paypal.oslo.feature.packagetracking.api.navigation.PackageSettingsDestination(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivitySourceConstants.KEY_SOURCE_LEDGER, (java.lang.String) null, (java.lang.String) null, 6, (kotlin.jvm.internal.DefaultConstructorMarker) null)));
        com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsTrackerKt.trackLedgerActionCtaPressed("link_email");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$vzFhrzLKa04INcL0JOnEKKyWTEA(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityFilterType, "");
        function1.invoke(new com.paypal.oslo.feature.activity.ui.ledger.model.states.ActivityLedgerEvent.ClearFilter(activityFilterType));
        return kotlin.Unit.INSTANCE;
    }
}
