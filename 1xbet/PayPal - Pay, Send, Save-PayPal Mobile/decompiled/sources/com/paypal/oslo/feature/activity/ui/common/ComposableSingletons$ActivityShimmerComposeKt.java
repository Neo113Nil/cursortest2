package com.paypal.oslo.feature.activity.ui.common;

@kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ComposableSingletons$ActivityShimmerComposeKt {
    public static final com.paypal.oslo.feature.activity.ui.common.ComposableSingletons$ActivityShimmerComposeKt INSTANCE = new com.paypal.oslo.feature.activity.ui.common.ComposableSingletons$ActivityShimmerComposeKt();
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(1987779286, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.common.ComposableSingletons$ActivityShimmerComposeKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.activity.ui.common.ComposableSingletons$ActivityShimmerComposeKt.m11800$r8$lambda$9xAIUenfSDHJZ5BJhWLeueiBco((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });
    private static kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getHighSpeedVideoFpsRanges = androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(809955455, false, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.activity.ui.common.ComposableSingletons$ActivityShimmerComposeKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            return com.paypal.oslo.feature.activity.ui.common.ComposableSingletons$ActivityShimmerComposeKt.$r8$lambda$3HkymzCH_Ku5iyvlIbWV_l7ce3U((androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
        }
    });

    public static /* synthetic */ kotlin.Unit $r8$lambda$3HkymzCH_Ku5iyvlIbWV_l7ce3U(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(809955455, i, -1, "com.paypal.oslo.feature.activity.ui.common.ComposableSingletons$ActivityShimmerComposeKt.lambda$809955455.<anonymous> (ActivityShimmerCompose.kt:89)");
            }
            androidx.compose.ui.Modifier wrapContentHeight$default = androidx.compose.foundation.layout.SizeKt.wrapContentHeight$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), null, false, 3, null);
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), composer, 0);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(composer, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(composer, wrapContentHeight$default);
            kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
            if (!(composer.getApplier() instanceof androidx.compose.runtime.Applier)) {
                androidx.compose.runtime.ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            androidx.compose.runtime.Composer m5299constructorimpl = androidx.compose.runtime.Updater.m5299constructorimpl(composer);
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
            com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityCounterPartyNameAndAmountComposeKt.RenderCounterPartyNameAndAmount(com.paypal.oslo.feature.activity.ui.common.ActivityShimmerComposeKt.getShimmerPlaceholderTransaction().getTitle(), com.paypal.oslo.feature.activity.ui.common.ActivityShimmerComposeKt.getShimmerPlaceholderTransaction(), 0.0f, composer, 48, 4);
            com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityDateTransactionDescriptionAndRewardPointsComposeKt.RenderDateTransactionDescriptionAndRewardPoints(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.activity.R.string.feature_activity_date_payment_type_format, new java.lang.Object[]{com.paypal.oslo.feature.activity.ui.common.ActivityShimmerComposeKt.getShimmerPlaceholderTransaction().getDate(), com.paypal.oslo.feature.activity.ui.common.ActivityShimmerComposeKt.getShimmerPlaceholderTransaction().getTransactionShortDescription()}, composer, 0), com.paypal.oslo.feature.activity.ui.common.ActivityShimmerComposeKt.getShimmerPlaceholderTransaction().getRewardInfo(), composer, 48);
            com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel shimmerPlaceholderTransaction = com.paypal.oslo.feature.activity.ui.common.ActivityShimmerComposeKt.getShimmerPlaceholderTransaction();
            java.lang.Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.ui.common.ComposableSingletons$ActivityShimmerComposeKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.activity.ui.common.ComposableSingletons$ActivityShimmerComposeKt.m11801$r8$lambda$pz9CxC4QhF1gw4PTG12gDJYrAk((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj);
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            com.paypal.oslo.feature.activity.ui.ledger.view.compose.sections.transaction.ActivityStatusBadgeOrPrimaryCTAOrAdditionalInfoComposeKt.RenderStatusBadgeOrPrimaryCTAOrAdditionalInfo(shimmerPlaceholderTransaction, null, (kotlin.jvm.functions.Function1) rememberedValue, composer, 390, 2);
            composer.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$9xAI-UenfSDHJZ5BJhWLeueiBco, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11800$r8$lambda$9xAIUenfSDHJZ5BJhWLeueiBco(androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1987779286, i, -1, "com.paypal.oslo.feature.activity.ui.common.ComposableSingletons$ActivityShimmerComposeKt.lambda$1987779286.<anonymous> (ActivityShimmerCompose.kt:74)");
            }
            com.paypal.oslo.feature.activity.ui.common.PopulatePaypalActivityAvatarKt.PopulatePaypalActivityAvatar(com.paypal.oslo.feature.activity.ui.common.ActivityShimmerComposeKt.getShimmerPlaceholderTransaction().getAvatar().getAvatarType(), com.paypal.pds.components.AvatarSize.Large.INSTANCE, androidx.compose.ui.Modifier.INSTANCE, null, composer, (com.paypal.pds.components.AvatarSize.Large.$stable << 3) | 384, 8);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$pz9CxC4QhF1-gw4PTG12gDJYrAk, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m11801$r8$lambda$pz9CxC4QhF1gw4PTG12gDJYrAk(com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel activityActionModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionModel, "");
        return kotlin.Unit.INSTANCE;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$809955455$activity_prodRelease() {
        return getHighSpeedVideoFpsRanges;
    }

    public final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> getLambda$1987779286$activity_prodRelease() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
