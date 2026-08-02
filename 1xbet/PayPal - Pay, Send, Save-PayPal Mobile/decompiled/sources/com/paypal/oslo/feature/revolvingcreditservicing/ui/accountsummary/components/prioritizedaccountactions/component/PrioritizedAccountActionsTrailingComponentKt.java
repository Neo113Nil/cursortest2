package com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.component;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/PrioritizedAccountActionsUiModel$ActionType;", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.ACTION_TYPE_KEY, "Lkotlin/Function0;", "", "onDismissClick", "PrioritizedAccountActionsTrailingComponent", "(Lcom/paypal/oslo/feature/revolvingcreditservicing/ui/accountsummary/uimodel/PrioritizedAccountActionsUiModel$ActionType;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PrioritizedAccountActionsTrailingComponentKt {
    public static final void PrioritizedAccountActionsTrailingComponent(final com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType actionType, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer composer2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1698259103);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(actionType.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i2 & 19) != 18, i2 & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1698259103, i2, -1, "com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.component.PrioritizedAccountActionsTrailingComponent (PrioritizedAccountActionsTrailingComponent.kt:26)");
            }
            int i3 = com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.component.PrioritizedAccountActionsTrailingComponentKt.WhenMappings.$EnumSwitchMapping$0[actionType.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    startRestartGroup.startReplaceGroup(-1877206827);
                    com.paypal.pds.components.IconButtonKt.IconButton(com.paypal.pds.core.Icon.XMark.INSTANCE, function0, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Medium.INSTANCE, androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.revolvingcreditservicing.R.string.feature_revolvingcredit_servicing_nba_dismiss, startRestartGroup, 0), null, true, false, startRestartGroup, (i2 & 112) | 12610566, 324);
                    startRestartGroup.endReplaceGroup();
                } else {
                    if (i3 != 3) {
                        startRestartGroup.startReplaceGroup(-60568854);
                        startRestartGroup.endReplaceGroup();
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    startRestartGroup.startReplaceGroup(-1876813003);
                    startRestartGroup.endReplaceGroup();
                }
                composer2 = startRestartGroup;
            } else {
                startRestartGroup.startReplaceGroup(-1877555453);
                com.paypal.pds.core.Icon.ChevronRight chevronRight = com.paypal.pds.core.Icon.ChevronRight.INSTANCE;
                com.paypal.pds.components.ButtonStyle.Tertiary tertiary = com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE;
                com.paypal.pds.components.ButtonSize.Medium medium = com.paypal.pds.components.ButtonSize.Medium.INSTANCE;
                com.paypal.pds.core.Icon.ChevronRight chevronRight2 = chevronRight;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.component.PrioritizedAccountActionsTrailingComponentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit unit;
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                composer2 = startRestartGroup;
                com.paypal.pds.components.IconButtonKt.IconButton(chevronRight2, (kotlin.jvm.functions.Function0) rememberedValue, null, tertiary, medium, null, null, true, false, composer2, 12610614, 356);
                composer2.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.component.PrioritizedAccountActionsTrailingComponentKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.components.prioritizedaccountactions.component.PrioritizedAccountActionsTrailingComponentKt.m18242$r8$lambda$1EoeYVSh8zsB4hHOfkmBDQRWIE(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType.this, function0, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* renamed from: $r8$lambda$1EoeYVSh8zsB4hHOfkmB-DQRWIE, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18242$r8$lambda$1EoeYVSh8zsB4hHOfkmBDQRWIE(com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType actionType, kotlin.jvm.functions.Function0 function0, int i, androidx.compose.runtime.Composer composer, int i2) {
        PrioritizedAccountActionsTrailingComponent(actionType, function0, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType.values().length];
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType.NAVIGATION.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType.DISMISSIBLE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.revolvingcreditservicing.ui.accountsummary.uimodel.PrioritizedAccountActionsUiModel.ActionType.NONE.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
