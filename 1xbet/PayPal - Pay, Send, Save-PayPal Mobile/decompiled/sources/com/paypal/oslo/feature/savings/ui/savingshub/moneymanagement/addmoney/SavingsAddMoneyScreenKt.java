package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.addmoney;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a]\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u000528\b\u0002\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\u0007H\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"SavingsAddMoneyScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "goalZone", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalZoneDTO;", "onAddMoney", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "amount", "goalId", "(Landroidx/compose/ui/Modifier;Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalZoneDTO;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "savings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsAddMoneyScreenKt {
    public static final void SavingsAddMoneyScreen(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO, kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function2, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        androidx.compose.ui.Modifier modifier2;
        int i3;
        final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO2;
        final androidx.compose.ui.Modifier modifier3;
        final kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function22;
        kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, kotlin.Unit> function23;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1586327243);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (startRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if (!startRestartGroup.shouldExecute((i3 & 3) != 2, i3 & 1)) {
            startRestartGroup.skipToGroupEnd();
            goalZoneDTO2 = goalZoneDTO;
            modifier3 = modifier2;
            function22 = function2;
        } else {
            androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO3 = (i2 & 2) != 0 ? null : goalZoneDTO;
            if ((i2 & 4) != 0) {
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.addmoney.SavingsAddMoneyScreenKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                            return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.addmoney.SavingsAddMoneyScreenKt.$r8$lambda$NewJ5F5vEi2UGOZ07uxcHtpHnCc((java.lang.String) obj, (java.lang.String) obj2);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                function23 = (kotlin.jvm.functions.Function2) rememberedValue;
            } else {
                function23 = function2;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1586327243, i3, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.addmoney.SavingsAddMoneyScreen (SavingsAddMoneyScreen.kt:43)");
            }
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new com.paypal.pds.components.BottomSheetController();
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            final com.paypal.pds.components.BottomSheetController bottomSheetController = (com.paypal.pds.components.BottomSheetController) rememberedValue2;
            androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1706padding3ABfNKs(androidx.compose.foundation.layout.SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16()), com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.SavingsAddMoney.SCREEN);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
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
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, currentCompositionLocalMap, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl, java.lang.Integer.valueOf(hashCode), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
            androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
            androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl, materializeModifier, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
            androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
            java.lang.String stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_add_money, startRestartGroup, 0);
            com.paypal.pds.components.ButtonStyle.Primary primary = com.paypal.pds.components.ButtonStyle.Primary.INSTANCE;
            androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.SavingsAddMoney.ADD_MONEY_BUTTON);
            boolean changedInstance = startRestartGroup.changedInstance(bottomSheetController);
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.addmoney.SavingsAddMoneyScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.addmoney.SavingsAddMoneyScreenKt.m19023$r8$lambda$vf7Mmepj9U58vb4V2iGFlLbEsI(com.paypal.pds.components.BottomSheetController.this);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            com.paypal.pds.components.ButtonKt.Button((kotlin.jvm.functions.Function0) rememberedValue3, stringResource, testTag2, null, null, primary, null, false, false, startRestartGroup, 196992, 472);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
            modifier3 = modifier4;
            goalZoneDTO2 = goalZoneDTO3;
            function22 = function23;
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.addmoney.SavingsAddMoneyScreenKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.addmoney.SavingsAddMoneyScreenKt.$r8$lambda$_J7SjTgt25XfQk5QWwoXxEX7uis(androidx.compose.ui.Modifier.this, goalZoneDTO2, function22, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$NewJ5F5vEi2UGOZ07uxcHtpHnCc(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$_J7SjTgt25XfQk5QWwoXxEX7uis(androidx.compose.ui.Modifier modifier, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO, kotlin.jvm.functions.Function2 function2, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        SavingsAddMoneyScreen(modifier, goalZoneDTO, function2, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$vf7M-mepj9U58vb4V2iGFlLbEsI, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19023$r8$lambda$vf7Mmepj9U58vb4V2iGFlLbEsI(com.paypal.pds.components.BottomSheetController bottomSheetController) {
        bottomSheetController.showSheet();
        return kotlin.Unit.INSTANCE;
    }
}
