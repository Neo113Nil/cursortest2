package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b²\u0006\n\u0010\t\u001a\u00020\nX\u008a\u008e\u0002"}, d2 = {"RedeemScreen", "", "redeemSectionUiData", "Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/redeem/RedeemSectionUiData;", "onCardClick", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/actioncard/ActionCardUiData;", "(Lcom/paypal/oslo/feature/shoppingrewards/rewards/summary/ui/components/redeem/RedeemSectionUiData;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "shopping-rewards_prodRelease", "showZeroStateDialog", ""}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RedeemScreenKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void RedeemScreen(final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem.RedeemSectionUiData redeemSectionUiData, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardUiData, kotlin.Unit> function1, androidx.compose.runtime.Composer composer, final int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(redeemSectionUiData, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(420271865);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changedInstance(redeemSectionUiData) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2;
        if (!startRestartGroup.shouldExecute((i3 & 19) != 18, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(420271865, i3, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem.RedeemScreen (RedeemScreen.kt:32)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(java.lang.Boolean.FALSE, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final androidx.compose.runtime.MutableState mutableState = (androidx.compose.runtime.MutableState) rememberedValue;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), "redeem_screen");
            androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing24()), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
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
            startRestartGroup.startReplaceGroup(927553294);
            int i4 = 0;
            for (java.lang.Object obj : redeemSectionUiData.getCards()) {
                if (i4 < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardUiData actionCardUiData = (com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardUiData) obj;
                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, "redeem_item_".concat(java.lang.String.valueOf(i4)));
                boolean changedInstance = startRestartGroup.changedInstance(redeemSectionUiData);
                boolean changed = startRestartGroup.changed(actionCardUiData);
                boolean z = (i3 & 112) == 32;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changedInstance | changed | z) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem.RedeemScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem.RedeemScreenKt.$r8$lambda$9TZAGh8kbUOEXElGziGFNfXd4lU(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem.RedeemSectionUiData.this, actionCardUiData, function1, mutableState);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardKt.ActionCard(actionCardUiData, testTag2, (kotlin.jvm.functions.Function0) rememberedValue2, startRestartGroup, 0, 0);
                i4++;
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.endNode();
            if (((java.lang.Boolean) mutableState.getValue()).booleanValue()) {
                startRestartGroup.startReplaceGroup(490365345);
                java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem.RedeemScreenKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem.RedeemScreenKt.$r8$lambda$x6AspCfMocgb97QIlJ1GEgcx_r4(androidx.compose.runtime.MutableState.this);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem.RedeemZeroStateDialogKt.RedeemZeroStateDialog((kotlin.jvm.functions.Function0) rememberedValue3, startRestartGroup, 6);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(490465289);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem.RedeemScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj2, java.lang.Object obj3) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem.RedeemScreenKt.$r8$lambda$fTy6vcB2OWciFwCosjvhQqUvhpk(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem.RedeemSectionUiData.this, function1, i, (androidx.compose.runtime.Composer) obj2, ((java.lang.Integer) obj3).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9TZAGh8kbUOEXElGziGFNfXd4lU(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem.RedeemSectionUiData redeemSectionUiData, com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.actioncard.ActionCardUiData actionCardUiData, kotlin.jvm.functions.Function1 function1, androidx.compose.runtime.MutableState mutableState) {
        if (!redeemSectionUiData.getHasZeroPoints() || !(actionCardUiData.getDestination() instanceof com.paypal.oslo.feature.shoppingrewards.api.rewards.redeem.navigation.RedeemFlowDestination)) {
            function1.invoke(actionCardUiData);
        } else {
            mutableState.setValue(java.lang.Boolean.TRUE);
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$fTy6vcB2OWciFwCosjvhQqUvhpk(com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem.RedeemSectionUiData redeemSectionUiData, kotlin.jvm.functions.Function1 function1, int i, androidx.compose.runtime.Composer composer, int i2) {
        RedeemScreen(redeemSectionUiData, function1, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$x6AspCfMocgb97QIlJ1GEgcx_r4(androidx.compose.runtime.MutableState mutableState) {
        mutableState.setValue(java.lang.Boolean.FALSE);
        return kotlin.Unit.INSTANCE;
    }
}
