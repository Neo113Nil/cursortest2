package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aM\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"AutoSaveGoalsContent", "", com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.ActivityAvatarIconConstants.KEY_GENERIC_GOALS_VALUE, "", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "onSetUpClick", "Lkotlin/Function1;", "onManageClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "savings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AutoSaveGoalsContentKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AutoSaveGoalsContent(final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> list, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, kotlin.Unit> function1, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, kotlin.Unit> function12, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        androidx.compose.runtime.Composer composer2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function12, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(176698946);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 2048 : 1024;
            if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
                composer2 = startRestartGroup;
                composer2.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(176698946, i3, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveGoalsContent (AutoSaveGoalsContent.kt:46)");
                }
                com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO(new java.util.ArrayList(list));
                com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType = com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.AUTO_SAVE;
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AutoSave.INSTANCE.getGOAL_LIST_ZONE()), com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.AutoSaveGoals.CONTENT);
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveGoalsContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveGoalsContentKt.$r8$lambda$jM73_3BBlpS6hD2CYfih7O4JfIo((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveGoalsContentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            kotlin.Unit unit;
                            unit = kotlin.Unit.INSTANCE;
                            return unit;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.ui.Modifier modifier5 = modifier4;
                composer2 = startRestartGroup;
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt.MoneyMovementGoalsList(goalZoneDTO, moneyManagementFlowType, function13, (kotlin.jvm.functions.Function0) rememberedValue2, testTag, false, false, null, false, false, function1, function12, composer2, 3504, (i3 >> 3) & 126, 992);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveGoalsContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.autosave.AutoSaveGoalsContentKt.$r8$lambda$C6JgClnnj1z65j1YvivGrK16aNY(list, function1, function12, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 1171) == 1170, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$C6JgClnnj1z65j1YvivGrK16aNY(java.util.List list, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function1 function12, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        AutoSaveGoalsContent(list, function1, function12, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jM73_3BBlpS6hD2CYfih7O4JfIo(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
        return kotlin.Unit.INSTANCE;
    }
}
