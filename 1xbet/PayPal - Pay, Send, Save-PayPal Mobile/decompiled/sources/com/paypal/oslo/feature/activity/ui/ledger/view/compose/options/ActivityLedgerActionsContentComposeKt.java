package com.paypal.oslo.feature.activity.ui.ledger.view.compose.options;

@kotlin.Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ae\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0001¢\u0006\u0002\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u00020\u00012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\rH\u0003¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"ActivityLedgerTrailingOptionsComposable", "", "actionItems", "", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityActionItems;", "activityLedgerViewModel", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityLedgerViewModel;", "activityLedgerFilterApplied", "Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;", "onFilterApply", "Lkotlin/Function1;", "onFilterRemove", "onSearchAction", "Lkotlin/Function0;", "(Ljava/util/List;Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityLedgerViewModel;Lcom/paypal/oslo/feature/activity/domain/usecase/ledger/filters/ActivityFilterType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "RenderSearchActionIconComposable", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "activity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLedgerActionsContentComposeKt {
    /* JADX WARN: Type inference failed for: r5v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    public static final void ActivityLedgerTrailingOptionsComposable(final java.util.List<? extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems> list, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType, kotlin.Unit> function12, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel2;
        com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default r4;
        androidx.compose.runtime.Composer composer2;
        final com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel3;
        final com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType2;
        boolean z;
        androidx.lifecycle.viewmodel.CreationExtras.Empty empty;
        ?? r5;
        int i3;
        int i4;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1397113004);
        int i5 = (i & 6) == 0 ? (startRestartGroup.changedInstance(list) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                activityLedgerViewModel2 = activityLedgerViewModel;
                if (startRestartGroup.changedInstance(activityLedgerViewModel2)) {
                    i4 = 32;
                    i5 |= i4;
                }
            } else {
                activityLedgerViewModel2 = activityLedgerViewModel;
            }
            i4 = 16;
            i5 |= i4;
        } else {
            activityLedgerViewModel2 = activityLedgerViewModel;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                r4 = activityFilterType;
                if (startRestartGroup.changed(r4)) {
                    i3 = 256;
                    i5 |= i3;
                }
            } else {
                r4 = activityFilterType;
            }
            i3 = 128;
            i5 |= i3;
        } else {
            r4 = activityFilterType;
        }
        if ((i & 3072) == 0) {
            i5 |= startRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i5 |= startRestartGroup.changedInstance(function12) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i5 |= startRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if (startRestartGroup.shouldExecute((74899 & i5) != 74898, i5 & 1)) {
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
                    z = false;
                    activityLedgerViewModel2 = (com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel) androidx.view.viewmodel.compose.ViewModelKt.viewModel(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel.class), current, (java.lang.String) null, createHiltViewModelFactory, empty, startRestartGroup, 0, 0);
                    i5 &= -113;
                } else {
                    z = false;
                }
                r5 = z;
                if ((i2 & 4) != 0) {
                    r4 = new com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType.Default(null, 1, null);
                    i5 &= -897;
                    r5 = z;
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i5 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i5 &= -897;
                }
                r5 = 0;
            }
            int i6 = i5;
            com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel4 = activityLedgerViewModel2;
            com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType3 = r4;
            startRestartGroup.endDefaults();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1397113004, i6, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.options.ActivityLedgerTrailingOptionsComposable (ActivityLedgerActionsContentCompose.kt:44)");
            }
            androidx.compose.ui.Modifier wrapContentWidth$default = androidx.compose.foundation.layout.SizeKt.wrapContentWidth$default(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 11, null), null, r5, 3, null);
            androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8()), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, r5);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, r5));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, wrapContentWidth$default);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-1825421662);
            for (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems activityActionItems : list) {
                if (activityActionItems instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems.FilterIcon) {
                    startRestartGroup.startReplaceGroup(-744821224);
                    androidx.compose.runtime.Composer composer3 = startRestartGroup;
                    com.paypal.oslo.feature.activity.ui.ledger.view.compose.options.ActivityLedgerFilterMenuContentComposeKt.RenderFilterActionIconComposable(activityLedgerViewModel4, activityFilterType3, function1, function12, startRestartGroup, (i6 >> 3) & 8190, 0);
                    composer3.endReplaceGroup();
                    startRestartGroup = composer3;
                } else {
                    androidx.compose.runtime.Composer composer4 = startRestartGroup;
                    if (!(activityActionItems instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems.SearchIcon)) {
                        composer4.startReplaceGroup(1222897392);
                        composer4.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    composer4.startReplaceGroup(-744427586);
                    getHighSpeedVideoFpsRanges(function0, composer4, (i6 >> 15) & 14);
                    composer4.endReplaceGroup();
                    startRestartGroup = composer4;
                }
            }
            composer2 = startRestartGroup;
            composer2.endReplaceGroup();
            composer2.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            activityLedgerViewModel3 = activityLedgerViewModel4;
            activityFilterType2 = activityFilterType3;
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
            activityLedgerViewModel3 = activityLedgerViewModel2;
            activityFilterType2 = r4;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.options.ActivityLedgerActionsContentComposeKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.options.ActivityLedgerActionsContentComposeKt.$r8$lambda$_7OkH1DAG9UvJ6OQDNQnxMLHuTw(list, activityLedgerViewModel3, activityFilterType2, function1, function12, function0, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-810189358);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-810189358, i2, -1, "com.paypal.oslo.feature.activity.ui.ledger.view.compose.options.RenderSearchActionIconComposable (ActivityLedgerActionsContentCompose.kt:72)");
            }
            final java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_search_text, startRestartGroup, 0);
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed = startRestartGroup.changed(stringResource);
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.options.ActivityLedgerActionsContentComposeKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.ledger.view.compose.options.ActivityLedgerActionsContentComposeKt.$r8$lambda$ylm3Vm_dPBu4mqOdjuvA3mefLhY(stringResource, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            com.paypal.pds.components.AvatarKt.Avatar(new com.paypal.pds.components.AvatarSource.Icon(com.paypal.pds.core.Icon.MagnifyingGlass.INSTANCE), androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue, 1, null), com.paypal.pds.components.AvatarSize.Medium.INSTANCE, null, null, function0, startRestartGroup, (com.paypal.pds.components.AvatarSize.Medium.$stable << 6) | ((i2 << 15) & 458752), 24);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            com.paypal.oslo.feature.activity.ui.ledger.view.compose.options.ActivityLedgerActionsContentComposeKt$RenderSearchActionIconComposable$2$1 rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.oslo.feature.activity.ui.ledger.view.compose.options.ActivityLedgerActionsContentComposeKt$RenderSearchActionIconComposable$2$1(null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            androidx.compose.runtime.EffectsKt.LaunchedEffect(unit, (kotlin.jvm.functions.Function2<? super kotlinx.coroutines.CoroutineScope, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object>) rememberedValue2, startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.ledger.view.compose.options.ActivityLedgerActionsContentComposeKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.ledger.view.compose.options.ActivityLedgerActionsContentComposeKt.$r8$lambda$AfI_tnkiapJv8BTNWSw0HqogXKA(kotlin.jvm.functions.Function0.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$AfI_tnkiapJv8BTNWSw0HqogXKA(kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_7OkH1DAG9UvJ6OQDNQnxMLHuTw(java.util.List list, com.paypal.oslo.feature.activity.ui.ledger.model.ActivityLedgerViewModel activityLedgerViewModel, com.paypal.oslo.feature.activity.domain.usecase.ledger.filters.ActivityFilterType activityFilterType, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function0 function0, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        ActivityLedgerTrailingOptionsComposable(list, activityLedgerViewModel, activityFilterType, function1, function12, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$ylm3Vm_dPBu4mqOdjuvA3mefLhY(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setTestTag(semanticsPropertyReceiver, com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Search.SEARCH_ICON);
        return kotlin.Unit.INSTANCE;
    }
}
