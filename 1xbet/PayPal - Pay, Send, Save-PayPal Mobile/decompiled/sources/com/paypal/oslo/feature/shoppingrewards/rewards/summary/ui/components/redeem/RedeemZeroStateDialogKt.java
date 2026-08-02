package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "onDismiss", "RedeemZeroStateDialog", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RedeemZeroStateDialogKt {
    public static final void RedeemZeroStateDialog(final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1456583987);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1456583987, i2, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem.RedeemZeroStateDialog (RedeemZeroStateDialog.kt:36)");
            }
            com.paypal.oslo.feature.shoppingrewards.rewards.common.ui.components.ShoppingRewardsDialogKt.ShoppingRewardsDialog(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_zero_state_title, startRestartGroup, 0), null, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_zero_state_description, startRestartGroup, 0), androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1171446211, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem.RedeemZeroStateDialogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem.RedeemZeroStateDialogKt.m19542$r8$lambda$A_PmjlSXIZtFRMe4HvqPNMmkuE(kotlin.jvm.functions.Function0.this, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            }, startRestartGroup, 54), function0, startRestartGroup, ((i2 << 12) & 57344) | 3072, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem.RedeemZeroStateDialogKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem.RedeemZeroStateDialogKt.$r8$lambda$VlvJiG4cuu_0bPCwFaYE5QpRfRc(kotlin.jvm.functions.Function0.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9JWkFZpyJ5VFzLwjajGA_0TD0qo(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(346779133);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(346779133, updateChangedFlags, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem.RedeemZeroStateDialogPreview (RedeemZeroStateDialog.kt:58)");
            }
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem.RedeemZeroStateDialogKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            RedeemZeroStateDialog((kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem.RedeemZeroStateDialogKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem.RedeemZeroStateDialogKt.$r8$lambda$9JWkFZpyJ5VFzLwjajGA_0TD0qo(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$A_PmjlSXIZtFRMe4HvqPNM-mkuE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19542$r8$lambda$A_PmjlSXIZtFRMe4HvqPNMmkuE(kotlin.jvm.functions.Function0 function0, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1171446211, i, -1, "com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.components.redeem.RedeemZeroStateDialog.<anonymous> (RedeemZeroStateDialog.kt:41)");
            }
            com.paypal.pds.components.ButtonGroupKt.ButtonGroup(new com.paypal.pds.components.ButtonGroupItem[]{new com.paypal.pds.components.ButtonGroupItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_redeem_zero_state_cta, composer, 0), function0, null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, null, 108, null)}, null, com.paypal.pds.components.ButtonSize.Large.INSTANCE, com.paypal.pds.components.ButtonGroupAlignment.Vertical.INSTANCE, composer, (com.paypal.pds.components.ButtonGroupAlignment.Vertical.$stable << 9) | 384, 2);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VlvJiG4cuu_0bPCwFaYE5QpRfRc(kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        RedeemZeroStateDialog(function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }
}
