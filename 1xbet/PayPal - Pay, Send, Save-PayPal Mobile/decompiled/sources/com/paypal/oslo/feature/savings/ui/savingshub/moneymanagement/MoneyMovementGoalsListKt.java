package com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement;

@kotlin.Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\u00ad\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0001¢\u0006\u0002\u0010\u0018\u001a(\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0011H\u0002\u001aA\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000b2\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0003¢\u0006\u0002\u0010\u001e\u001ai\u0010\u001f\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nH\u0003¢\u0006\u0002\u0010#\u001a\u001f\u0010$\u001a\u00020\u00062\u0006\u0010%\u001a\u00020&2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0001¢\u0006\u0002\u0010'\u001a3\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020 2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\n2\b\b\u0002\u0010*\u001a\u00020+H\u0003¢\u0006\u0002\u0010,\u001a\u0010\u0010-\u001a\u00020\u00012\u0006\u0010)\u001a\u00020 H\u0002\u001a\u0015\u0010.\u001a\u00020\u00062\u0006\u0010)\u001a\u00020 H\u0003¢\u0006\u0002\u0010/\u001a\"\u00100\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r¢\u0006\u0002\b12\u0006\u0010)\u001a\u00020 H\u0003¢\u0006\u0002\u00102\u001a\u0010\u0010\u001a\u001a\u00020\u00112\u0006\u00103\u001a\u00020\u0001H\u0000\u001a\u000e\u00104\u001a\b\u0012\u0004\u0012\u00020\u000b05H\u0001\u001a\r\u00106\u001a\u00020\u0006H\u0003¢\u0006\u0002\u00107\u001a\r\u00108\u001a\u00020\u0006H\u0003¢\u0006\u0002\u00107\u001a\r\u00109\u001a\u00020\u0006H\u0003¢\u0006\u0002\u00107¨\u0006:"}, d2 = {"getMoneyMovementTitle", "", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.FLOW_TYPE, "Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;", "(Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "MoneyMovementGoalsList", "", "goalZone", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalZoneDTO;", "onGoalSelect", "Lkotlin/Function1;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;", "onCancel", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "isInsetPaddingRequired", "", "isSelectingDestination", "selectedGoal", "showSelectionIndicator", "isInFiSelectionContext", "onSetUpClick", "onManageClick", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalZoneDTO;Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZZLcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "isGoalEnabled", "isZeroAmount", "getAutoSaveData", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/AutoSaveData;", "goalSummary", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/AutoSaveData;", "createGoalListItemData", "Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/GoalListItemData;", "isEnabled", "isSelected", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/dto/GoalSummaryDTO;Lcom/paypal/oslo/feature/savings/navigation/MoneyManagementFlowType;ZZZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/GoalListItemData;", "GoalIcon", "icon", "Lcom/paypal/pds/core/Icon;", "(Lcom/paypal/pds/core/Icon;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CustomGoalListItem", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "index", "", "(Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/GoalListItemData;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;II)V", "getGoalDescription", "GoalTrailingSlot", "(Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/GoalListItemData;Landroidx/compose/runtime/Composer;I)V", "getGoalBottomSlot", "Landroidx/compose/runtime/Composable;", "(Lcom/paypal/oslo/feature/savings/ui/savingshub/moneymanagement/GoalListItemData;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function2;", "formattedAmount", "createSampleGoals", "", "MoneyMovementGoalsListAutoSavePreview", "(Landroidx/compose/runtime/Composer;I)V", "MoneyMovementGoalsListAddMoneyPreview", "MoneyMovementGoalsListTransferMoneyPreview", "savings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MoneyMovementGoalsListKt {
    public static final java.lang.String getMoneyMovementTitle(com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, androidx.compose.runtime.Composer composer, int i) {
        java.lang.String stringResource;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyManagementFlowType, "");
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(2004512715, i, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.getMoneyMovementTitle (MoneyMovementGoalsList.kt:74)");
        }
        int i2 = com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt.WhenMappings.$EnumSwitchMapping$0[moneyManagementFlowType.ordinal()];
        if (i2 == 1 || i2 == 2 || i2 == 3) {
            composer.startReplaceGroup(-2103589408);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_add_money_to, composer, 0);
            composer.endReplaceGroup();
        } else if (i2 == 4 || i2 == 5) {
            composer.startReplaceGroup(-2103584473);
            stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_transfer_money_from, composer, 0);
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-2103593798);
            composer.endReplaceGroup();
            throw new kotlin.NoWhenBranchMatchedException();
        }
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return stringResource;
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0365 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:178:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MoneyMovementGoalsList(final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO, final com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, kotlin.Unit> function1, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, boolean z3, boolean z4, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, kotlin.Unit> function13, androidx.compose.runtime.Composer composer, final int i, final int i2, final int i3) {
        int i4;
        androidx.compose.ui.Modifier modifier2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        final boolean z5;
        final boolean z6;
        final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO2;
        boolean z7;
        final boolean z8;
        final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, kotlin.Unit> function14;
        kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, kotlin.Unit> function15;
        androidx.compose.ui.Modifier.Companion companion;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        boolean z9;
        boolean z10;
        com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO3;
        java.lang.String str;
        int i14;
        boolean z11;
        int i15;
        boolean z12;
        java.util.Iterator it;
        com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AutoSaveData autoSaveData;
        java.lang.String stringResource;
        com.paypal.pds.core.Color.ContentMuted contentMuted;
        java.lang.String stringResource2;
        com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType2 = moneyManagementFlowType;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalZoneDTO, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyManagementFlowType2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-280936416);
        if ((i & 6) == 0) {
            i4 = (startRestartGroup.changedInstance(goalZoneDTO) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(moneyManagementFlowType2.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        int i16 = i3 & 16;
        if (i16 != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i & androidx.profileinstaller.ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                i4 |= startRestartGroup.changed(z) ? 131072 : 65536;
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
            } else if ((i & 1572864) == 0) {
                i4 |= startRestartGroup.changed(z2) ? 1048576 : 524288;
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i4 |= startRestartGroup.changed(goalSummaryDTO) ? 8388608 : 4194304;
            }
            i8 = i3 & 256;
            if (i8 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= startRestartGroup.changed(z3) ? 67108864 : 33554432;
            }
            i9 = i3 & 512;
            if (i9 == 0) {
                i4 |= 805306368;
            } else if ((i & 805306368) == 0) {
                i4 |= startRestartGroup.changed(z4) ? 536870912 : 268435456;
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
                i11 = i2 | 6;
            } else if ((i2 & 6) == 0) {
                i11 = i2 | (startRestartGroup.changedInstance(function12) ? 4 : 2);
            } else {
                i11 = i2;
            }
            i12 = i3 & 2048;
            if (i12 == 0) {
                i11 |= 48;
            } else if ((i2 & 48) == 0) {
                i11 |= startRestartGroup.changedInstance(function13) ? 32 : 16;
            }
            i13 = i11;
            if (startRestartGroup.shouldExecute((i4 & 306782355) == 306782354 || (i13 & 19) != 18, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                z5 = z;
                z6 = z2;
                goalSummaryDTO2 = goalSummaryDTO;
                z7 = z3;
                z8 = z4;
                function14 = function12;
                function15 = function13;
                companion = modifier2;
            } else {
                companion = i16 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                boolean z13 = i5 != 0 ? true : z;
                boolean z14 = i6 != 0 ? false : z2;
                com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO4 = i7 != 0 ? null : goalSummaryDTO;
                z7 = i8 != 0 ? false : z3;
                boolean z15 = i9 != 0 ? false : z4;
                final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, kotlin.Unit> function16 = i10 != 0 ? null : function12;
                final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, kotlin.Unit> function17 = i12 != 0 ? null : function13;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-280936416, i4, i13, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsList (MoneyMovementGoalsList.kt:120)");
                }
                startRestartGroup.startReplaceGroup(603062794);
                java.util.ArrayList<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> goals = goalZoneDTO.getGoals();
                java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(goals, 10));
                java.util.Iterator it2 = goals.iterator();
                while (it2.hasNext()) {
                    final com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO5 = (com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) it2.next();
                    boolean isZeroAmount = isZeroAmount(goalSummaryDTO5.getCurrentAmountFormatted());
                    if (z15 || z14) {
                        z9 = z15;
                    } else {
                        z9 = z15;
                        if (moneyManagementFlowType2 != com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.ADD_MONEY) {
                            if (moneyManagementFlowType2 != com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.TRANSFER_MONEY) {
                                com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType3 = com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.AUTO_SAVE;
                            } else if (isZeroAmount) {
                                z10 = false;
                                if (goalSummaryDTO4 == null) {
                                    str = goalSummaryDTO4.getId();
                                    goalSummaryDTO3 = goalSummaryDTO4;
                                } else {
                                    goalSummaryDTO3 = goalSummaryDTO4;
                                    str = null;
                                }
                                boolean areEqual = kotlin.jvm.internal.Intrinsics.areEqual(str, goalSummaryDTO5.getId());
                                int i17 = i13 << 18;
                                int i18 = (i17 & 29360128) | (i4 & 112) | ((i4 >> 9) & 458752) | (i17 & 3670016);
                                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    i14 = i13;
                                    z11 = z14;
                                } else {
                                    i14 = i13;
                                    z11 = z14;
                                    androidx.compose.runtime.ComposerKt.traceEventStart(1633755871, i18, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.createGoalListItemData (MoneyMovementGoalsList.kt:273)");
                                }
                                if (moneyManagementFlowType2 != com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.AUTO_SAVE) {
                                    startRestartGroup.startReplaceGroup(652197402);
                                    int i19 = i18 >> 15;
                                    int i20 = (i19 & 896) | (i19 & 112);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventStart(1340490850, i20, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.getAutoSaveData (MoneyMovementGoalsList.kt:213)");
                                    }
                                    final boolean isAutoSaveEnabled = goalSummaryDTO5.isAutoSaveEnabled();
                                    if (isAutoSaveEnabled) {
                                        startRestartGroup.startReplaceGroup(-42752524);
                                        stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_auto_save_status_on, startRestartGroup, 0);
                                        startRestartGroup.endReplaceGroup();
                                    } else {
                                        startRestartGroup.startReplaceGroup(-42671149);
                                        stringResource = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_auto_save_status_off, startRestartGroup, 0);
                                        startRestartGroup.endReplaceGroup();
                                    }
                                    if (isAutoSaveEnabled) {
                                        contentMuted = com.paypal.pds.core.Color.ContentRoleBasePositive.INSTANCE;
                                    } else {
                                        contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                                    }
                                    if (isAutoSaveEnabled) {
                                        startRestartGroup.startReplaceGroup(-42428233);
                                        it = it2;
                                        stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_auto_save_manage, startRestartGroup, 0);
                                        startRestartGroup.endReplaceGroup();
                                    } else {
                                        it = it2;
                                        startRestartGroup.startReplaceGroup(-42349865);
                                        stringResource2 = androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_auto_save_set_up, startRestartGroup, 0);
                                        startRestartGroup.endReplaceGroup();
                                    }
                                    boolean changed = startRestartGroup.changed(isAutoSaveEnabled);
                                    boolean z16 = (((i20 & 896) ^ 384) > 256 && startRestartGroup.changed(function17)) || (i20 & 384) == 256;
                                    boolean changed2 = startRestartGroup.changed(goalSummaryDTO5);
                                    i15 = i4;
                                    z12 = z13;
                                    boolean z17 = (((i20 & 112) ^ 48) > 32 && startRestartGroup.changed(function16)) || (i20 & 48) == 32;
                                    java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                                    if ((z17 | changed | z16 | changed2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                                        rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt$$ExternalSyntheticLambda18
                                            @Override // kotlin.jvm.functions.Function0
                                            public final java.lang.Object invoke() {
                                                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt.$r8$lambda$0AH7z9_Y3BqT4z7Ftx90pJcqvFU(isAutoSaveEnabled, function17, goalSummaryDTO5, function16);
                                            }
                                        };
                                        startRestartGroup.updateRememberedValue(rememberedValue);
                                    }
                                    autoSaveData = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.AutoSaveData(stringResource, contentMuted, stringResource2, (kotlin.jvm.functions.Function0) rememberedValue);
                                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                        androidx.compose.runtime.ComposerKt.traceEventEnd();
                                    }
                                    startRestartGroup.endReplaceGroup();
                                } else {
                                    i15 = i4;
                                    z12 = z13;
                                    it = it2;
                                    startRestartGroup.startReplaceGroup(652274127);
                                    startRestartGroup.endReplaceGroup();
                                    autoSaveData = null;
                                }
                                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.GoalListItemData goalListItemData = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.GoalListItemData(goalSummaryDTO5, z10, areEqual, z10 && isZeroAmount, z7, autoSaveData == null ? autoSaveData.getHighSpeedVideoFpsRangesFor : null, autoSaveData == null ? autoSaveData.getHighSpeedVideoFpsRanges : null, autoSaveData == null ? autoSaveData.getHighSpeedVideoSizes : null, autoSaveData == null ? autoSaveData.Camera2StreamConfigurationMap : null);
                                if (!androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                                }
                                arrayList.add(goalListItemData);
                                moneyManagementFlowType2 = moneyManagementFlowType;
                                z15 = z9;
                                goalSummaryDTO4 = goalSummaryDTO3;
                                it2 = it;
                                i13 = i14;
                                z14 = z11;
                                i4 = i15;
                                z13 = z12;
                            }
                        }
                    }
                    z10 = true;
                    if (goalSummaryDTO4 == null) {
                    }
                    boolean areEqual2 = kotlin.jvm.internal.Intrinsics.areEqual(str, goalSummaryDTO5.getId());
                    int i172 = i13 << 18;
                    int i182 = (i172 & 29360128) | (i4 & 112) | ((i4 >> 9) & 458752) | (i172 & 3670016);
                    if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    if (moneyManagementFlowType2 != com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.AUTO_SAVE) {
                    }
                    com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.GoalListItemData goalListItemData2 = new com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.GoalListItemData(goalSummaryDTO5, z10, areEqual2, z10 && isZeroAmount, z7, autoSaveData == null ? autoSaveData.getHighSpeedVideoFpsRangesFor : null, autoSaveData == null ? autoSaveData.getHighSpeedVideoFpsRanges : null, autoSaveData == null ? autoSaveData.getHighSpeedVideoSizes : null, autoSaveData == null ? autoSaveData.Camera2StreamConfigurationMap : null);
                    if (!androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    }
                    arrayList.add(goalListItemData2);
                    moneyManagementFlowType2 = moneyManagementFlowType;
                    z15 = z9;
                    goalSummaryDTO4 = goalSummaryDTO3;
                    it2 = it;
                    i13 = i14;
                    z14 = z11;
                    i4 = i15;
                    z13 = z12;
                }
                boolean z18 = z15;
                int i21 = i4;
                com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO6 = goalSummaryDTO4;
                boolean z19 = z13;
                boolean z20 = z14;
                final java.util.ArrayList arrayList2 = arrayList;
                startRestartGroup.endReplaceGroup();
                androidx.compose.ui.Modifier m1708paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), com.paypal.pds.core.ConstantsKt.getSpacing16(), 0.0f, 2, null);
                if (z19) {
                    startRestartGroup.startReplaceGroup(1515959351);
                    androidx.compose.foundation.layout.WindowInsetsPaddingKt.windowInsetsPadding(m1708paddingVpY3zN4$default, androidx.compose.foundation.layout.WindowInsets_androidKt.getSystemBars(androidx.compose.foundation.layout.WindowInsets.INSTANCE, startRestartGroup, 6));
                    startRestartGroup.endReplaceGroup();
                } else {
                    startRestartGroup.startReplaceGroup(1516031426);
                    startRestartGroup.endReplaceGroup();
                }
                androidx.compose.ui.Modifier module = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.module(m1708paddingVpY3zN4$default, com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AddMoney.INSTANCE.getGOAL_SELECTION_ZONE());
                boolean changedInstance = startRestartGroup.changedInstance(arrayList2);
                boolean z21 = (i21 & 896) == 256;
                java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
                if ((changedInstance | z21) || rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final java.lang.Object invoke(java.lang.Object obj) {
                            return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt.$r8$lambda$mD24apoWYGUvP3ZZovd57Bm2qOE(arrayList2, function1, (androidx.compose.foundation.lazy.LazyListScope) obj);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue2);
                }
                androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(module, null, null, false, null, null, null, false, null, (kotlin.jvm.functions.Function1) rememberedValue2, startRestartGroup, 0, 510);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                z8 = z18;
                goalSummaryDTO2 = goalSummaryDTO6;
                function14 = function16;
                function15 = function17;
                z6 = z20;
                z5 = z19;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final androidx.compose.ui.Modifier modifier3 = companion;
                final boolean z22 = z7;
                final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, kotlin.Unit> function18 = function15;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt.$r8$lambda$QHlOjtrf09Wg0VBu1LqXM0IYdeM(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO.this, moneyManagementFlowType, function1, function0, modifier3, z5, z6, goalSummaryDTO2, z22, z8, function14, function18, i, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        i12 = i3 & 2048;
        if (i12 == 0) {
        }
        i13 = i11;
        if (startRestartGroup.shouldExecute((i4 & 306782355) == 306782354 || (i13 & 19) != 18, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void GoalIcon(final com.paypal.pds.core.Icon icon, final androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1847173984);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(icon) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i3;
        if (!startRestartGroup.shouldExecute((i5 & 19) != 18, i5 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = androidx.compose.ui.Modifier.INSTANCE;
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1847173984, i5, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.GoalIcon (MoneyMovementGoalsList.kt:309)");
            }
            androidx.compose.ui.Modifier background = com.paypal.pds.core.ModifierExtensionsKt.background(androidx.compose.ui.draw.ClipKt.clip(androidx.compose.foundation.layout.SizeKt.m1726height3ABfNKs(androidx.compose.foundation.layout.SizeKt.m1745width3ABfNKs(modifier, com.paypal.pds.core.ConstantsKt.getSpacing48()), com.paypal.pds.core.ConstantsKt.getSpacing40()), androidx.compose.foundation.shape.RoundedCornerShapeKt.m1971RoundedCornerShape0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing8())), (com.paypal.pds.core.Color) com.paypal.pds.core.Color.BackgroundRoleBaseNeutral.INSTANCE, (androidx.compose.ui.graphics.Shape) null, startRestartGroup, 48, 2);
            androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getCenter(), false);
            int hashCode = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
            androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            androidx.compose.ui.Modifier materializeModifier = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, background);
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
            com.paypal.pds.components.IconKt.Icon(icon, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, (i5 & 14) | 27696, 4);
            startRestartGroup.endNode();
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt.$r8$lambda$m4Pk5sGVbuBIRvGK1H9G2BbDJg8(com.paypal.pds.core.Icon.this, modifier, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0057  */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v29 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.GoalListItemData goalListItemData, final kotlin.jvm.functions.Function1<? super com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO, kotlin.Unit> function1, int i, androidx.compose.runtime.Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        java.lang.String currentAmountFormatted;
        ?? r9;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1013812569);
        if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(goalListItemData) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i5 = i;
            i4 |= startRestartGroup.changed(i5) ? 256 : 128;
            if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
                startRestartGroup.skipToGroupEnd();
                i6 = i5;
            } else {
                i6 = i7 != 0 ? 0 : i5;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(-1013812569, i4, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.CustomGoalListItem (MoneyMovementGoalsList.kt:337)");
                }
                java.lang.String id = goalListItemData.Camera2StreamConfigurationMap.getId();
                androidx.compose.ui.Modifier item = com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.item(com.paypal.oslo.core.telemetry.compose.ModifierExtensionsKt.component(androidx.compose.foundation.layout.SizeKt.fillMaxWidth$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, 1, null), com.paypal.oslo.core.telemetry.analytics.schema.context.UIContext.Component.copy$default(com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AddMoney.INSTANCE.getGOAL_SELECTION_ITEM(), null, 0, null, java.lang.Integer.valueOf(i6), 7, null)), com.paypal.oslo.feature.savings.analytics.SavingsAnalyticsConstants.AddMoney.INSTANCE.getGOAL_SELECT_TAP());
                boolean z = goalListItemData.getHighSpeedVideoFpsRanges;
                boolean z2 = (i4 & 112) == 32;
                int i8 = i4 & 14;
                boolean z3 = i8 == 4;
                java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
                if ((z3 | z2) || rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final java.lang.Object invoke() {
                            return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt.$r8$lambda$9cASigxJPU2EuLWNjiIEv8VkSpE(kotlin.jvm.functions.Function1.this, goalListItemData);
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                androidx.compose.ui.Modifier testTag = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1708paddingVpY3zN4$default(com.paypal.pds.core.ModifierExtensionsKt.m22100clickable_mRqjOc(item, null, null, z, null, null, (kotlin.jvm.functions.Function0) rememberedValue, startRestartGroup, 0, 27), 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing12(), 1, null), com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.MoneyMovementGoalsList.INSTANCE.listItem(id));
                androidx.compose.ui.layout.MeasurePolicy rowMeasurePolicy = androidx.compose.foundation.layout.RowKt.rowMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.m1602spacedBy0680j_4(com.paypal.pds.core.ConstantsKt.getSpacing12()), androidx.compose.ui.Alignment.INSTANCE.getCenterVertically(), startRestartGroup, 48);
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
                GoalIcon(goalListItemData.Camera2StreamConfigurationMap.getIcon(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.MoneyMovementGoalsList.INSTANCE.icon(id)), startRestartGroup, 0, 0);
                androidx.compose.ui.Modifier testTag2 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.RowScope.weight$default(rowScopeInstance, androidx.compose.ui.Modifier.INSTANCE, 1.0f, false, 2, null), com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.MoneyMovementGoalsList.INSTANCE.content(id));
                androidx.compose.ui.layout.MeasurePolicy columnMeasurePolicy = androidx.compose.foundation.layout.ColumnKt.columnMeasurePolicy(androidx.compose.foundation.layout.Arrangement.INSTANCE.getTop(), androidx.compose.ui.Alignment.INSTANCE.getStart(), startRestartGroup, 0);
                int hashCode2 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier2 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag2);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor2 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor2);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl2 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, columnMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, currentCompositionLocalMap2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl2, java.lang.Integer.valueOf(hashCode2), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl2, materializeModifier2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.ColumnScopeInstance columnScopeInstance = androidx.compose.foundation.layout.ColumnScopeInstance.INSTANCE;
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(goalListItemData.Camera2StreamConfigurationMap.getTitle(), androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.MoneyMovementGoalsList.INSTANCE.title(id)), com.paypal.pds.core.Color.ContentBase.INSTANCE, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 384, 6, 1016);
                if (goalListItemData.getOutputFormats == null) {
                    currentAmountFormatted = goalListItemData.Camera2StreamConfigurationMap.getCurrentAmountFormatted();
                } else {
                    currentAmountFormatted = goalListItemData.getOutputFormats;
                }
                com.paypal.pds.core.Color.ContentMuted contentMuted = goalListItemData.getOutputMinFrameDuration;
                if (contentMuted == null) {
                    contentMuted = com.paypal.pds.core.Color.ContentMuted.INSTANCE;
                }
                com.paypal.pds.components.LabelKt.m21914LabelPL_sNV4(currentAmountFormatted, androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing2(), 0.0f, 0.0f, 13, null), com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.MoneyMovementGoalsList.INSTANCE.description(id)), contentMuted, null, null, null, false, 0, 0, null, com.paypal.pds.core.Typography.BodyMedium.INSTANCE, startRestartGroup, 0, 6, 1016);
                kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(goalListItemData, i8);
                if (Camera2StreamConfigurationMap != null) {
                    startRestartGroup.startReplaceGroup(360094855);
                    androidx.compose.ui.Modifier testTag3 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.foundation.layout.PaddingKt.m1710paddingqDBjuR0$default(androidx.compose.ui.Modifier.INSTANCE, 0.0f, com.paypal.pds.core.ConstantsKt.getSpacing8(), 0.0f, 0.0f, 13, null), com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.MoneyMovementGoalsList.INSTANCE.bottomSlot(id));
                    r9 = 0;
                    androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), false);
                    int hashCode3 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, 0));
                    androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    androidx.compose.ui.Modifier materializeModifier3 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag3);
                    kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor3 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                    if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                        androidx.compose.runtime.ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor3);
                    } else {
                        startRestartGroup.useNode();
                    }
                    androidx.compose.runtime.Composer m5299constructorimpl3 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, maybeCachedBoxMeasurePolicy, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, currentCompositionLocalMap3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl3, java.lang.Integer.valueOf(hashCode3), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                    androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                    androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl3, materializeModifier3, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                    androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                    Camera2StreamConfigurationMap.invoke(startRestartGroup, 0);
                    startRestartGroup.endNode();
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                    startRestartGroup.endReplaceGroup();
                    kotlin.Unit unit2 = kotlin.Unit.INSTANCE;
                } else {
                    startRestartGroup.startReplaceGroup(360094854);
                    startRestartGroup.endReplaceGroup();
                    r9 = 0;
                }
                startRestartGroup.endNode();
                androidx.compose.ui.Modifier testTag4 = androidx.compose.ui.platform.TestTagKt.testTag(androidx.compose.ui.Modifier.INSTANCE, com.paypal.oslo.feature.savings.ui.testtags.MoneyManagementTestTags.MoneyMovementGoalsList.INSTANCE.trailingSlot(id));
                androidx.compose.ui.layout.MeasurePolicy maybeCachedBoxMeasurePolicy2 = androidx.compose.foundation.layout.BoxKt.maybeCachedBoxMeasurePolicy(androidx.compose.ui.Alignment.INSTANCE.getTopStart(), r9);
                int hashCode4 = java.lang.Long.hashCode(androidx.compose.runtime.ComposablesKt.getCurrentCompositeKeyHashCode(startRestartGroup, r9));
                androidx.compose.runtime.CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
                androidx.compose.ui.Modifier materializeModifier4 = androidx.compose.ui.ComposedModifierKt.materializeModifier(startRestartGroup, testTag4);
                kotlin.jvm.functions.Function0<androidx.compose.ui.node.ComposeUiNode> constructor4 = androidx.compose.ui.node.ComposeUiNode.INSTANCE.getConstructor();
                if (!(startRestartGroup.getApplier() instanceof androidx.compose.runtime.Applier)) {
                    androidx.compose.runtime.ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor4);
                } else {
                    startRestartGroup.useNode();
                }
                androidx.compose.runtime.Composer m5299constructorimpl4 = androidx.compose.runtime.Updater.m5299constructorimpl(startRestartGroup);
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, maybeCachedBoxMeasurePolicy2, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, currentCompositionLocalMap4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                androidx.compose.runtime.Updater.m5303initimpl(m5299constructorimpl4, java.lang.Integer.valueOf(hashCode4), androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetCompositeKeyHash());
                androidx.compose.runtime.Updater.m5305reconcileimpl(m5299constructorimpl4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getApplyOnDeactivatedNodeAssertion());
                androidx.compose.runtime.Updater.m5307setimpl(m5299constructorimpl4, materializeModifier4, androidx.compose.ui.node.ComposeUiNode.INSTANCE.getSetModifier());
                androidx.compose.foundation.layout.BoxScopeInstance boxScopeInstance2 = androidx.compose.foundation.layout.BoxScopeInstance.INSTANCE;
                getHighSpeedVideoFpsRanges(goalListItemData, startRestartGroup, i8);
                startRestartGroup.endNode();
                startRestartGroup.endNode();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final int i9 = i6;
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt.$r8$lambda$hxS4eY7k8WYojZvoOxg1PHvxk1U(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.GoalListItemData.this, function1, i9, i2, i3, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 = i;
        if (startRestartGroup.shouldExecute((i4 & 147) == 146, i4 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void getHighSpeedVideoFpsRanges(final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.GoalListItemData goalListItemData, androidx.compose.runtime.Composer composer, final int i) {
        int i2;
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1320033119);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(goalListItemData) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!startRestartGroup.shouldExecute((i2 & 3) != 2, i2 & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1320033119, i2, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.GoalTrailingSlot (MoneyMovementGoalsList.kt:422)");
            }
            if (goalListItemData.getHighResolutionOutputSizeshNQ4ISI && goalListItemData.getHighSpeedVideoSizes) {
                startRestartGroup.startReplaceGroup(386296972);
                com.paypal.pds.components.IconKt.Icon(com.paypal.pds.core.Icon.CheckCircleFill.INSTANCE, null, null, com.paypal.pds.components.IconSize.Medium.INSTANCE, com.paypal.pds.core.Color.ContentBase.INSTANCE, startRestartGroup, 27702, 4);
                startRestartGroup.endReplaceGroup();
            } else if (goalListItemData.getHighSpeedVideoSizesFor != null && goalListItemData.getInputFormats != null) {
                startRestartGroup.startReplaceGroup(386668662);
                com.paypal.pds.components.ButtonKt.Button(goalListItemData.getInputFormats, goalListItemData.getHighSpeedVideoSizesFor, null, null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, com.paypal.pds.components.ButtonSize.Small.INSTANCE, false, false, startRestartGroup, 1769472, 412);
                startRestartGroup.endReplaceGroup();
            } else {
                startRestartGroup.startReplaceGroup(386881539);
                startRestartGroup.endReplaceGroup();
            }
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt.$r8$lambda$wP1LpWD9Ctz9y_P3agcKLofgHEk(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.GoalListItemData.this, i, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
    }

    private static final kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> Camera2StreamConfigurationMap(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.GoalListItemData goalListItemData, int i) {
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventStart(850104541, i, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.getGoalBottomSlot (MoneyMovementGoalsList.kt:449)");
        }
        kotlin.jvm.functions.Function2<androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit> m19002getLambda$497675717$savings_prodRelease = goalListItemData.getHighSpeedVideoFpsRangesFor ? com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.ComposableSingletons$MoneyMovementGoalsListKt.INSTANCE.m19002getLambda$497675717$savings_prodRelease() : null;
        if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
            androidx.compose.runtime.ComposerKt.traceEventEnd();
        }
        return m19002getLambda$497675717$savings_prodRelease;
    }

    public static final boolean isZeroAmount(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(kotlin.text.StringsKt.replace$default(new kotlin.text.Regex("[^0-9.,]").replace(str, ""), ",", ".", false, 4, (java.lang.Object) null));
        return doubleOrNull != null && doubleOrNull.doubleValue() == 0.0d;
    }

    public static final java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO> createSampleGoals() {
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO[]{new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO("1", "General Savings", "NoIcon", com.paypal.oslo.feature.p2p.ui.review.composables.accordions.PreviewConstants.SAMPLE_BALANCE, (java.lang.String) null, 0.0d, false, true, (com.paypal.oslo.feature.savings.domain.model.TransferSettingsData) null, (com.paypal.oslo.feature.savings.domain.model.transfers.Money) null, false, (com.paypal.oslo.feature.savings.domain.model.transfers.Money) null, 3840, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_2D, "Vacation Fund", "Trophy", "$500.00", "$2,000.00", 25.0d, true, false, (com.paypal.oslo.feature.savings.domain.model.TransferSettingsData) null, (com.paypal.oslo.feature.savings.domain.model.transfers.Money) null, false, (com.paypal.oslo.feature.savings.domain.model.transfers.Money) null, 3840, (kotlin.jvm.internal.DefaultConstructorMarker) null), new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO(androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D, "Emergency Fund", "Trophy", "$0.00", "$5,000.00", 0.0d, false, false, (com.paypal.oslo.feature.savings.domain.model.TransferSettingsData) null, (com.paypal.oslo.feature.savings.domain.model.transfers.Money) null, false, (com.paypal.oslo.feature.savings.domain.model.transfers.Money) null, 3840, (kotlin.jvm.internal.DefaultConstructorMarker) null)});
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$0AH7z9_Y3BqT4z7Ftx90pJcqvFU(boolean z, kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, kotlin.jvm.functions.Function1 function12) {
        if (z) {
            if (function1 != null) {
                function1.invoke(goalSummaryDTO);
            }
        } else if (function12 != null) {
            function12.invoke(goalSummaryDTO);
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$1lGkp8wPYTcrVPmu-iGNNt7DxFA, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m19012$r8$lambda$1lGkp8wPYTcrVPmuiGNNt7DxFA(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7f603esjQ_rXTnN0tTzpHnyNiVQ(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1504686304);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1504686304, updateChangedFlags, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListAddMoneyPreview (MoneyMovementGoalsList.kt:533)");
            }
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO(new java.util.ArrayList(createSampleGoals()));
            com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType = com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.ADD_MONEY;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt.$r8$lambda$jGCwp7a_r_lZgwRjUSRg_FPQRRE((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            composer2 = startRestartGroup;
            MoneyMovementGoalsList(goalZoneDTO, moneyManagementFlowType, function1, function0, null, false, false, null, false, false, null, null, startRestartGroup, 3504, 0, 4080);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt.$r8$lambda$7f603esjQ_rXTnN0tTzpHnyNiVQ(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$9cASigxJPU2EuLWNjiIEv8VkSpE(kotlin.jvm.functions.Function1 function1, com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.GoalListItemData goalListItemData) {
        function1.invoke(goalListItemData.Camera2StreamConfigurationMap);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$OHkVmNOYr05BmfLaGe4aeg24AWI(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(88153852);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(88153852, updateChangedFlags, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListTransferMoneyPreview (MoneyMovementGoalsList.kt:544)");
            }
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO(new java.util.ArrayList(createSampleGoals()));
            com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType = com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.TRANSFER_MONEY;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt.$r8$lambda$b4zZWotOvOtZRvdnVTRZIszcFWQ((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            composer2 = startRestartGroup;
            MoneyMovementGoalsList(goalZoneDTO, moneyManagementFlowType, function1, function0, null, false, false, null, false, false, null, null, startRestartGroup, 3504, 0, 4080);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt.$r8$lambda$OHkVmNOYr05BmfLaGe4aeg24AWI(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$QHlOjtrf09Wg0VBu1LqXM0IYdeM(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO, com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType, kotlin.jvm.functions.Function1 function1, kotlin.jvm.functions.Function0 function0, androidx.compose.ui.Modifier modifier, boolean z, boolean z2, com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO, boolean z3, boolean z4, kotlin.jvm.functions.Function1 function12, kotlin.jvm.functions.Function1 function13, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        MoneyMovementGoalsList(goalZoneDTO, moneyManagementFlowType, function1, function0, modifier, z, z2, goalSummaryDTO, z3, z4, function12, function13, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$b4zZWotOvOtZRvdnVTRZIszcFWQ(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$eDgJS5TFLVE1B49paH7uxKIrx90(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$hxS4eY7k8WYojZvoOxg1PHvxk1U(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.GoalListItemData goalListItemData, kotlin.jvm.functions.Function1 function1, int i, int i2, int i3, androidx.compose.runtime.Composer composer, int i4) {
        getHighSpeedVideoFpsRanges(goalListItemData, function1, i, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$jGCwp7a_r_lZgwRjUSRg_FPQRRE(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$k1lV9XUua2GYUbVu2sDesfhu2WI(com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO goalSummaryDTO) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalSummaryDTO, "");
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ java.lang.Object $r8$lambda$kAHmzr2FYeggISLWQjFnUq0GFEo(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.GoalListItemData goalListItemData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalListItemData, "");
        return goalListItemData.Camera2StreamConfigurationMap.getId();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$m4Pk5sGVbuBIRvGK1H9G2BbDJg8(com.paypal.pds.core.Icon icon, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        GoalIcon(icon, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$mD24apoWYGUvP3ZZovd57Bm2qOE(final java.util.List list, final kotlin.jvm.functions.Function1 function1, androidx.compose.foundation.lazy.LazyListScope lazyListScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyListScope, "");
        final kotlin.jvm.functions.Function1 function12 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt.$r8$lambda$kAHmzr2FYeggISLWQjFnUq0GFEo((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.GoalListItemData) obj);
            }
        };
        final com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt$MoneyMovementGoalsList$lambda$1$0$$inlined$items$default$1 moneyMovementGoalsListKt$MoneyMovementGoalsList$lambda$1$0$$inlined$items$default$1 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt$MoneyMovementGoalsList$lambda$1$0$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Void invoke(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.GoalListItemData goalListItemData) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object obj) {
                return invoke((com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.GoalListItemData) obj);
            }
        };
        lazyListScope.items(list.size(), new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt$MoneyMovementGoalsList$lambda$1$0$$inlined$items$default$2
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
            }
        }, new kotlin.jvm.functions.Function1<java.lang.Integer, java.lang.Object>() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt$MoneyMovementGoalsList$lambda$1$0$$inlined$items$default$3
            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ java.lang.Object invoke(java.lang.Integer num) {
                return invoke(num.intValue());
            }

            public final java.lang.Object invoke(int i) {
                return kotlin.jvm.functions.Function1.this.invoke(list.get(i));
            }
        }, androidx.compose.runtime.internal.ComposableLambdaKt.composableLambdaInstance(802480018, true, new kotlin.jvm.functions.Function4<androidx.compose.foundation.lazy.LazyItemScope, java.lang.Integer, androidx.compose.runtime.Composer, java.lang.Integer, kotlin.Unit>() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt$MoneyMovementGoalsList$lambda$1$0$$inlined$items$default$4
            @Override // kotlin.jvm.functions.Function4
            public final /* synthetic */ kotlin.Unit invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, java.lang.Integer num, androidx.compose.runtime.Composer composer, java.lang.Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return kotlin.Unit.INSTANCE;
            }

            public final void invoke(androidx.compose.foundation.lazy.LazyItemScope lazyItemScope, int i, androidx.compose.runtime.Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(802480018, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.GoalListItemData goalListItemData = (com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.GoalListItemData) list.get(i);
                composer.startReplaceGroup(-1446198947);
                com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt.getHighSpeedVideoFpsRanges(goalListItemData, function1, list.indexOf(goalListItemData), composer, 0, 0);
                composer.endReplaceGroup();
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
            }
        }));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$wP1LpWD9Ctz9y_P3agcKLofgHEk(com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.GoalListItemData goalListItemData, int i, androidx.compose.runtime.Composer composer, int i2) {
        getHighSpeedVideoFpsRanges(goalListItemData, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zPye5W17mMP6W52k2SfntmcgNxM(int i, androidx.compose.runtime.Composer composer, int i2) {
        androidx.compose.runtime.Composer composer2;
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1774325427);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            composer2 = startRestartGroup;
            composer2.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1774325427, updateChangedFlags, -1, "com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListAutoSavePreview (MoneyMovementGoalsList.kt:520)");
            }
            com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO goalZoneDTO = new com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalZoneDTO(new java.util.ArrayList(createSampleGoals()));
            com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType moneyManagementFlowType = com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.AUTO_SAVE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt.m19012$r8$lambda$1lGkp8wPYTcrVPmuiGNNt7DxFA((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function1 function1 = (kotlin.jvm.functions.Function1) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue2;
            java.lang.Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt.$r8$lambda$k1lV9XUua2GYUbVu2sDesfhu2WI((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            kotlin.jvm.functions.Function1 function12 = (kotlin.jvm.functions.Function1) rememberedValue3;
            java.lang.Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt.$r8$lambda$eDgJS5TFLVE1B49paH7uxKIrx90((com.paypal.oslo.feature.savings.domain.model.savingshub.dto.GoalSummaryDTO) obj);
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            kotlin.jvm.functions.Function1 function13 = (kotlin.jvm.functions.Function1) rememberedValue4;
            composer2 = startRestartGroup;
            MoneyMovementGoalsList(goalZoneDTO, moneyManagementFlowType, function1, function0, null, false, false, null, false, false, function12, function13, startRestartGroup, 3504, 54, 1008);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.savingshub.moneymanagement.MoneyMovementGoalsListKt.$r8$lambda$zPye5W17mMP6W52k2SfntmcgNxM(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.values().length];
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.ADD_MONEY.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.AUTO_SAVE.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.CREATE_GOAL.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.TRANSFER_MONEY.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.navigation.MoneyManagementFlowType.DELETE_GOAL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
