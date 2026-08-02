package com.paypal.oslo.feature.activity.ui.common;

@kotlin.Metadata(d1 = {"\u0000P\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0013\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a$\u0010\u0005\u001a\u00020\u00062\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¢\u0006\u0002\b\tH\u0007¢\u0006\u0002\u0010\n\u001a2\u0010\u000b\u001a\u00020\u0006*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0000\u001a \u0010\u0015\u001a\u00020\u0006*\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0013\u001a\u00020\u0014\u001a)\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0019\u001a\u00020\u001aH\u0007¢\u0006\u0002\u0010\u001b¨\u0006\u001c"}, d2 = {"dpToPx", "", "Landroidx/compose/ui/unit/Dp;", "dpToPx-8Feqmps", "(FLandroidx/compose/runtime/Composer;I)F", "WrapInCard", "", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "lazyPagingItemsStateListener", "Landroidx/compose/foundation/lazy/LazyListScope;", "showLoader", "Landroidx/compose/runtime/MutableState;", "", "paginatedItems", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "modifier", "Landroidx/compose/ui/Modifier;", "renderPaginationLoader", "RenderStatusBadge", "activityStatusModel", "Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityStatusModel;", io.ktor.http.ContentDisposition.Parameters.Size, "Lcom/paypal/pds/components/BadgeSize;", "(Lcom/paypal/oslo/feature/activity/ui/ledger/model/ActivityStatusModel;Landroidx/compose/ui/Modifier;Lcom/paypal/pds/components/BadgeSize;Landroidx/compose/runtime/Composer;II)V", "activity_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ComposableUtilsKt {
    /* renamed from: dpToPx-8Feqmps, reason: not valid java name */
    public static final float m11803dpToPx8Feqmps(float f, androidx.compose.runtime.Composer composer, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(-1653850460, i, -1, "com.paypal.oslo.feature.activity.ui.common.dpToPx (ComposableUtils.kt:38)");
        }
        float mo1418toPx0680j_4 = ((androidx.compose.ui.unit.Density) composer.consume(androidx.compose.ui.platform.CompositionLocalsKt.getLocalDensity())).mo1418toPx0680j_4(f);
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return mo1418toPx0680j_4;
    }

    public static final void WrapInCard(kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function22;
        int i3;
        androidx.compose.runtime.Composer composer2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1478999519);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            function22 = function2;
        } else if ((i & 6) == 0) {
            function22 = function2;
            i3 = (startRestartGroup.changedInstance(function22) ? 4 : 2) | i;
        } else {
            function22 = function2;
            i3 = i;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function23 = i4 != 0 ? null : function22;
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1478999519, i3, -1, "com.paypal.oslo.feature.activity.ui.common.WrapInCard (ComposableUtils.kt:46)");
            }
            kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> function24 = function23;
            composer2 = startRestartGroup;
            com.paypal.pds.components.CardKt.Card(null, com.paypal.pds.core.Color.BackgroundMuted.INSTANCE, null, com.paypal.pds.components.CardStyle.Filled.INSTANCE, null, null, null, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1695735737, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.common.ComposableUtilsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.common.ComposableUtilsKt.$r8$lambda$agjgFFJmmDPLw3D9nBbSCN0KLvI(kotlin.jvm.functions.Function2.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), startRestartGroup, (com.paypal.pds.components.CardStyle.Filled.$stable << 9) | 805306416, androidx.constraintlayout.core.motion.utils.TypedValues.PositionType.TYPE_TRANSITION_EASING);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            function22 = function24;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.common.ComposableUtilsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.activity.ui.common.ComposableUtilsKt.$r8$lambda$Sy6lhsUA6SKpWzUCslP68DXYVDw(kotlin.jvm.functions.Function2.this, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void lazyPagingItemsStateListener(androidx.compose.foundation.lazy.LazyListScope lazyListScope, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, androidx.paging.compose.LazyPagingItems<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> lazyPagingItems, androidx.compose.ui.Modifier modifier) {
        androidx.paging.CombinedLoadStates loadState;
        androidx.paging.LoadState append;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        if (lazyPagingItems != null && (loadState = lazyPagingItems.getLoadState()) != null && (append = loadState.getAppend()) != null) {
            if (append instanceof androidx.paging.LoadState.Loading) {
                mutableState.setValue(java.lang.Boolean.TRUE);
            } else if (append instanceof androidx.paging.LoadState.Error) {
                mutableState.setValue(java.lang.Boolean.FALSE);
            } else {
                if (!(append instanceof androidx.paging.LoadState.NotLoading)) {
                    throw new kotlin.NoWhenBranchMatchedException();
                }
                if (lazyPagingItems.getLoadState().getAppend().getEndOfPaginationReached()) {
                    mutableState.setValue(java.lang.Boolean.FALSE);
                }
            }
        }
        renderPaginationLoader(lazyListScope, mutableState, modifier);
    }

    public static final void renderPaginationLoader(androidx.compose.foundation.lazy.LazyListScope lazyListScope, androidx.compose.runtime.MutableState<java.lang.Boolean> mutableState, final androidx.compose.ui.Modifier modifier) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mutableState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modifier, "");
        if (mutableState.getValue().booleanValue()) {
            androidx.compose.foundation.lazy.LazyListScope.item$default(lazyListScope, null, null, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(90710848, true, new kotlin.jvm.functions.Function3() { // from class: com.paypal.oslo.feature.activity.ui.common.ComposableUtilsKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function3
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.activity.ui.common.ComposableUtilsKt.m11802$r8$lambda$p9hUNMNDwuwFpmktWlXmTVso(androidx.compose.ui.Modifier.this, (androidx.compose.foundation.lazy.LazyItemScope) obj, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            }), 3, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RenderStatusBadge(final com.paypal.oslo.feature.activity.ui.ledger.model.ActivityStatusModel activityStatusModel, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.BadgeSize badgeSize, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        com.paypal.pds.components.BadgeSize badgeSize2;
        androidx.compose.ui.Modifier modifier3;
        final com.paypal.pds.components.BadgeSize badgeSize3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityStatusModel, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-818943171);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(activityStatusModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                badgeSize2 = badgeSize;
                i3 |= startRestartGroup.changed(badgeSize2) ? 256 : 128;
                if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    startRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    badgeSize3 = badgeSize2;
                } else {
                    modifier3 = i5 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                    com.paypal.pds.components.BadgeSize badgeSize4 = i4 != 0 ? com.paypal.pds.components.BadgeSize.Medium.INSTANCE : badgeSize2;
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventStart(-818943171, i3, -1, "com.paypal.oslo.feature.activity.ui.common.RenderStatusBadge (ComposableUtils.kt:97)");
                    }
                    java.lang.String badgeDisplayMessage = activityStatusModel.getBadgeDisplayMessage();
                    if (badgeDisplayMessage != null && !kotlin.text.StringsKt.isBlank(badgeDisplayMessage)) {
                        startRestartGroup.startReplaceGroup(-1721543554);
                        androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(modifier3, "badge_container");
                        androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getStart(), androidx.compose.ui.Alignment.INSTANCE.getTop(), startRestartGroup, 0);
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
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, rowMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                        androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                        androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                        androidx.compose.foundation.layout.RowScopeInstance rowScopeInstance = androidx.compose.foundation.layout.RowScopeInstance.INSTANCE;
                        com.paypal.pds.components.BadgeKt.Badge(activityStatusModel.getBadgeDisplayMessage(), null, activityStatusModel.getBadgeStyle(), null, badgeSize4, activityStatusModel.getBadgeIcon(), null, startRestartGroup, (i3 << 6) & 57344, 74);
                        startRestartGroup.endNode();
                        startRestartGroup.endReplaceGroup();
                    } else {
                        startRestartGroup.startReplaceGroup(-1721229307);
                        startRestartGroup.endReplaceGroup();
                    }
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                    }
                    badgeSize3 = badgeSize4;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    final androidx.compose.ui.Modifier modifier4 = modifier3;
                    endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.common.ComposableUtilsKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.activity.ui.common.ComposableUtilsKt.$r8$lambda$X9NEHJAE0kcj9gB7YyquiLCZMxs(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityStatusModel.this, modifier4, badgeSize3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            badgeSize2 = badgeSize;
            if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        badgeSize2 = badgeSize;
        if (!startRestartGroup.shouldExecute((i3 & 147) != 146, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$Sy6lhsUA6SKpWzUCslP68DXYVDw(kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        WrapInCard(function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$X9NEHJAE0kcj9gB7YyquiLCZMxs(com.paypal.oslo.feature.activity.ui.ledger.model.ActivityStatusModel activityStatusModel, androidx.compose.ui.Modifier modifier, com.paypal.pds.components.BadgeSize badgeSize, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        RenderStatusBadge(activityStatusModel, modifier, badgeSize, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$agjgFFJmmDPLw3D9nBbSCN0KLvI(kotlin.jvm.functions.Function2 function2, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1695735737, i, -1, "com.paypal.oslo.feature.activity.ui.common.WrapInCard.<anonymous> (ComposableUtils.kt:51)");
            }
            if (function2 == null) {
                composer.startReplaceGroup(258024512);
            } else {
                composer.startReplaceGroup(1809438689);
                function2.invoke(composer, 0);
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

    /* renamed from: $r8$lambda$p-9hUNMNDwuwFpm-kt-WlXmTVso, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11802$r8$lambda$p9hUNMNDwuwFpmktWlXmTVso(androidx.compose.ui.Modifier modifier, androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, androidx.compose.runtime.Composer composer, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyItemScope, "");
        if (composer.shouldExecute((i & 17) != 16, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(90710848, i, -1, "com.paypal.oslo.feature.activity.ui.common.renderPaginationLoader.<anonymous> (ComposableUtils.kt:87)");
            }
            com.paypal.oslo.feature.activity.ui.common.ActivityShimmerComposeKt.ActivityLedgerPaginationShimmerCompose(modifier, composer, 0, 0);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
