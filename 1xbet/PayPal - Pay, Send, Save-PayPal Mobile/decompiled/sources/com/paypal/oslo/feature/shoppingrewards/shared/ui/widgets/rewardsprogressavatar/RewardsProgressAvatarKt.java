package com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.rewardsprogressavatar;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/rewardsprogressavatar/RewardsProgressAvatarUiData;", "uiData", "", "RewardsProgressAvatar", "(Lcom/paypal/oslo/feature/shoppingrewards/shared/ui/widgets/rewardsprogressavatar/RewardsProgressAvatarUiData;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RewardsProgressAvatarKt {
    public static final void RewardsProgressAvatar(final com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.rewardsprogressavatar.RewardsProgressAvatarUiData rewardsProgressAvatarUiData, androidx.compose.runtime.Composer composer, final int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewardsProgressAvatarUiData, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(571927239);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changed(rewardsProgressAvatarUiData) ? 4 : 2) | i : i;
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(571927239, i2, -1, "com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.rewardsprogressavatar.RewardsProgressAvatar (RewardsProgressAvatar.kt:36)");
            }
            androidx.compose.ui.graphics.painter.Painter painterResource = androidx.compose.ui.res.PainterResources_androidKt.painterResource(rewardsProgressAvatarUiData.getDoneAvatarResourceId(), startRestartGroup, 0);
            androidx.compose.ui.graphics.painter.Painter painterResource2 = androidx.compose.ui.res.PainterResources_androidKt.painterResource(rewardsProgressAvatarUiData.getPendingAvatarResourceId(), startRestartGroup, 0);
            boolean z = (i2 & 14) == 4;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                int coerceIn = kotlin.ranges.RangesKt.coerceIn(rewardsProgressAvatarUiData.getProgressValue(), rewardsProgressAvatarUiData.getMinProgressValue(), rewardsProgressAvatarUiData.getMaxProgressValue());
                for (int i3 = 0; i3 < coerceIn; i3++) {
                    createListBuilder.add(new com.paypal.pds.components.AvatarSource.Image(painterResource, null, 2, null));
                }
                int maxProgressValue = rewardsProgressAvatarUiData.getMaxProgressValue();
                int coerceIn2 = kotlin.ranges.RangesKt.coerceIn(rewardsProgressAvatarUiData.getProgressValue(), rewardsProgressAvatarUiData.getMinProgressValue(), rewardsProgressAvatarUiData.getMaxProgressValue());
                for (int i4 = 0; i4 < maxProgressValue - coerceIn2; i4++) {
                    createListBuilder.add(new com.paypal.pds.components.AvatarSource.Image(painterResource2, null, 2, null));
                }
                rememberedValue = kotlin.collections.CollectionsKt.build(createListBuilder);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            java.util.List list = (java.util.List) rememberedValue;
            final java.lang.String resolveSingularOrOtherStringResource = com.paypal.oslo.feature.shoppingrewards.shared.utils.StringResourceUtilsKt.resolveSingularOrOtherStringResource(com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_activated_offer_progress_discrete_one, com.paypal.oslo.feature.shoppingrewards.R.string.feature_shopping_rewards_activated_offer_progress_discrete_other, rewardsProgressAvatarUiData.getMaxProgressValue(), new java.lang.Object[]{java.lang.Integer.valueOf(rewardsProgressAvatarUiData.getProgressValue()), java.lang.Integer.valueOf(rewardsProgressAvatarUiData.getMaxProgressValue())}, startRestartGroup, 0);
            com.paypal.pds.components.AvatarSize avatarSize = rewardsProgressAvatarUiData.getAvatarSize();
            androidx.compose.ui.Modifier.Companion companion = androidx.compose.ui.Modifier.INSTANCE;
            boolean changed = startRestartGroup.changed(resolveSingularOrOtherStringResource);
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.rewardsprogressavatar.RewardsProgressAvatarKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.rewardsprogressavatar.RewardsProgressAvatarKt.$r8$lambda$3begnWfAsLs4BuGOMT3NGDpLWGk(resolveSingularOrOtherStringResource, (androidx.compose.ui.semantics.SemanticsPropertyReceiver) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            com.paypal.pds.components.AvatarStackKt.AvatarSourceStack(list, androidx.compose.ui.semantics.SemanticsModifierKt.semantics$default(companion, false, (kotlin.jvm.functions.Function1) rememberedValue2, 1, null), avatarSize, null, null, null, startRestartGroup, com.paypal.pds.components.AvatarSize.$stable << 6, 56);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.rewardsprogressavatar.RewardsProgressAvatarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.rewardsprogressavatar.RewardsProgressAvatarKt.m19608$r8$lambda$NuILEwA7vL1665vr9c8JYnzOTM(com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.rewardsprogressavatar.RewardsProgressAvatarUiData.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$-NuILEwA7vL1665vr9c8JYnzOTM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19608$r8$lambda$NuILEwA7vL1665vr9c8JYnzOTM(com.paypal.oslo.feature.shoppingrewards.shared.ui.widgets.rewardsprogressavatar.RewardsProgressAvatarUiData rewardsProgressAvatarUiData, int i, androidx.compose.runtime.Composer composer, int i2) {
        RewardsProgressAvatar(rewardsProgressAvatarUiData, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$3begnWfAsLs4BuGOMT3NGDpLWGk(java.lang.String str, androidx.compose.ui.semantics.SemanticsPropertyReceiver semanticsPropertyReceiver) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(semanticsPropertyReceiver, "");
        androidx.compose.ui.semantics.SemanticsPropertiesKt.setContentDescription(semanticsPropertyReceiver, str);
        return kotlin.Unit.INSTANCE;
    }
}
