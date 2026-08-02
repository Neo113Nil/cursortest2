package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement;

@kotlin.Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a_\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"GoalSelector", "", "goalZone", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalZoneDTO;", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;", "onGoalSelect", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "onCancel", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "isSelectingDestination", "", "selectedGoal", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalZoneDTO;Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Landroidx/compose/runtime/Composer;II)V", "savings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class GoalSelectorKt {
    /* JADX WARN: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoalSelector(final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO, final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, boolean z, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO2;
        androidx.compose.runtime.Composer composer2;
        final boolean z3;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalZoneDTO, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyManagementFlowType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1636993418);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(goalZoneDTO) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(moneyManagementFlowType.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((196608 & i) == 0) {
                z2 = z;
                i3 |= startRestartGroup.changed(z2) ? 131072 : 65536;
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    goalSummaryDTO2 = goalSummaryDTO;
                    i3 |= startRestartGroup.changed(goalSummaryDTO2) ? 1048576 : 524288;
                    if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                        composer2 = startRestartGroup;
                        composer2.skipToGroupEnd();
                        z3 = z2;
                        modifier3 = modifier2;
                    } else {
                        androidx.compose.ui.Modifier modifier4 = i6 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                        boolean z4 = i4 == 0 ? z2 : false;
                        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO3 = i5 != 0 ? null : goalSummaryDTO2;
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventStart(1636993418, i3, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.GoalSelector (GoalSelector.kt:44)");
                        }
                        int i7 = i3 << 3;
                        androidx.compose.ui.Modifier modifier5 = modifier4;
                        composer2 = startRestartGroup;
                        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt.MoneyMovementGoalsList(goalZoneDTO, moneyManagementFlowType, function1, function0, androidx.compose.ui.platform.TestTagKt.testTag(modifier4, com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.GoalSelector.CONTAINER), false, z4, goalSummaryDTO3, true, false, null, null, composer2, (i3 & 7168) | (i3 & 14) | 100663296 | (i3 & 112) | (i3 & 896) | (3670016 & i7) | (i7 & 29360128), 0, 3616);
                        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                            androidx.compose.runtime.ComposerKt.traceEventEnd();
                        }
                        z3 = z4;
                        goalSummaryDTO2 = goalSummaryDTO3;
                        modifier3 = modifier5;
                    }
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup == null) {
                        endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.GoalSelectorKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.GoalSelectorKt.$r8$lambda$eLKascWCmLrmBIgvpORTCqKTsBs(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO.this, moneyManagementFlowType, function1, function0, modifier3, z3, goalSummaryDTO2, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                goalSummaryDTO2 = goalSummaryDTO;
                if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
                }
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            goalSummaryDTO2 = goalSummaryDTO;
            if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        goalSummaryDTO2 = goalSummaryDTO;
        if (startRestartGroup.shouldExecute((599187 & i3) == 599186, i3 & 1)) {
        }
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eLKascWCmLrmBIgvpORTCqKTsBs(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, boolean z, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        GoalSelector(goalZoneDTO, moneyManagementFlowType, function1, function0, modifier, z, goalSummaryDTO, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }
}
