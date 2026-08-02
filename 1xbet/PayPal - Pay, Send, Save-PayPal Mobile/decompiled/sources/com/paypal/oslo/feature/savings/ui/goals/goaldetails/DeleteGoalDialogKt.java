package com.paypal.oslo.feature.savings.ui.goals.goaldetails;

@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001a\r\u0010\f\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r\u001a\r\u0010\u000e\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\r¨\u0006\u000f"}, d2 = {"DeleteGoalDialog", "", "goalName", "", "deleteDialogType", "Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteDialogType;", "onConfirm", "Lkotlin/Function0;", "onDismiss", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lcom/paypal/oslo/feature/savings/ui/goals/goaldetails/DeleteDialogType;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DeleteGoalDialogZeroBalancePreview", "(Landroidx/compose/runtime/Composer;I)V", "DeleteGoalDialogWithBalancePreview", "savings_prodRelease"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class DeleteGoalDialogKt {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0077  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DeleteGoalDialog(final java.lang.String str, final com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteDialogType deleteDialogType, final kotlin.jvm.functions.Function0<kotlin.Unit> function0, final kotlin.jvm.functions.Function0<kotlin.Unit> function02, androidx.compose.ui.Modifier modifier, androidx.compose.runtime.Composer composer, final int i, final int i2) {
        int i3;
        androidx.compose.ui.Modifier modifier2;
        final androidx.compose.ui.Modifier modifier3;
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteDialogType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function0, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function02, "");
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(645284136);
        if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function02) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 16384 : 8192;
            if (startRestartGroup.shouldExecute((i3 & 9347) == 9346, i3 & 1)) {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                androidx.compose.ui.Modifier modifier4 = i4 != 0 ? androidx.compose.ui.Modifier.INSTANCE : modifier2;
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventStart(645284136, i3, -1, "com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalDialog (DeleteGoalDialog.kt:45)");
                }
                com.paypal.pds.components.DialogKt.Dialog(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_delete_goal_dialog_description, new java.lang.Object[]{str}, startRestartGroup, 0), modifier4, null, androidx.compose.runtime.internal.ComposableLambdaKt.rememberComposableLambda(1270073552, true, new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalDialogKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalDialogKt.m18783$r8$lambda$T3LU9h582glgXHhF5tbjNBRFjM(kotlin.jvm.functions.Function0.this, function02, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                }, startRestartGroup, 54), function02, startRestartGroup, ((i3 >> 9) & 112) | 3072 | ((i3 << 3) & 57344), 4);
                if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                    androidx.compose.runtime.ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalDialogKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                        return com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalDialogKt.$r8$lambda$2eTaBFX7qZhOqmDFcnXkw_o3hCk(str, deleteDialogType, function0, function02, modifier3, i, i2, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if (startRestartGroup.shouldExecute((i3 & 9347) == 9346, i3 & 1)) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$2eTaBFX7qZhOqmDFcnXkw_o3hCk(java.lang.String str, com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteDialogType deleteDialogType, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.ui.Modifier modifier, int i, int i2, androidx.compose.runtime.Composer composer, int i3) {
        DeleteGoalDialog(str, deleteDialogType, function0, function02, modifier, composer, androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$7naqNOj1doZRwPjdeQANGugq9_A(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(-1609820291);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(-1609820291, updateChangedFlags, -1, "com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalDialogWithBalancePreview (DeleteGoalDialog.kt:81)");
            }
            com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteDialogType.WithBalance withBalance = new com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteDialogType.WithBalance("$250.00");
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalDialogKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalDialogKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            DeleteGoalDialog("Vacation", withBalance, function0, (kotlin.jvm.functions.Function0) rememberedValue2, null, startRestartGroup, 3462, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalDialogKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalDialogKt.$r8$lambda$7naqNOj1doZRwPjdeQANGugq9_A(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$NHaBWLLQ_yACsyKV2-X8qJsll8A, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18782$r8$lambda$NHaBWLLQ_yACsyKV2X8qJsll8A(int i, androidx.compose.runtime.Composer composer, int i2) {
        final int updateChangedFlags = androidx.compose.runtime.RecomposeScopeImplKt.updateChangedFlags(i | 1);
        androidx.compose.runtime.Composer startRestartGroup = composer.startRestartGroup(1597103071);
        if (!startRestartGroup.shouldExecute(updateChangedFlags != 0, updateChangedFlags & 1)) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1597103071, updateChangedFlags, -1, "com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalDialogZeroBalancePreview (DeleteGoalDialog.kt:70)");
            }
            com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteDialogType.ZeroBalance zeroBalance = com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteDialogType.ZeroBalance.INSTANCE;
            java.lang.Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalDialogKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            kotlin.jvm.functions.Function0 function0 = (kotlin.jvm.functions.Function0) rememberedValue;
            java.lang.Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new kotlin.jvm.functions.Function0() { // from class: com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalDialogKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final java.lang.Object invoke() {
                        kotlin.Unit unit;
                        unit = kotlin.Unit.INSTANCE;
                        return unit;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            DeleteGoalDialog("Emergency Fund", zeroBalance, function0, (kotlin.jvm.functions.Function0) rememberedValue2, null, startRestartGroup, 3510, 16);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        }
        androidx.compose.runtime.ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new kotlin.jvm.functions.Function2() { // from class: com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalDialogKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                    return com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalDialogKt.m18782$r8$lambda$NHaBWLLQ_yACsyKV2X8qJsll8A(updateChangedFlags, (androidx.compose.runtime.Composer) obj, ((java.lang.Integer) obj2).intValue());
                }
            });
        }
        return kotlin.Unit.INSTANCE;
    }

    /* renamed from: $r8$lambda$T3LU9h582glgX-HhF5tbjNBRFjM, reason: not valid java name */
    public static /* synthetic */ kotlin.Unit m18783$r8$lambda$T3LU9h582glgXHhF5tbjNBRFjM(kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function02, androidx.compose.runtime.Composer composer, int i) {
        if (composer.shouldExecute((i & 3) != 2, i & 1)) {
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventStart(1270073552, i, -1, "com.paypal.oslo.feature.savings.ui.goals.goaldetails.DeleteGoalDialog.<anonymous> (DeleteGoalDialog.kt:49)");
            }
            com.paypal.pds.components.ButtonGroupKt.ButtonGroup(new com.paypal.pds.components.ButtonGroupItem[]{new com.paypal.pds.components.ButtonGroupItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_delete, composer, 0), function0, null, null, com.paypal.pds.components.ButtonStyle.Primary.INSTANCE, null, null, 108, null), new com.paypal.pds.components.ButtonGroupItem(androidx.compose.ui.res.StringResources_androidKt.stringResource(com.paypal.oslo.feature.savings.R.string.feature_savings_delete_goal_dialog_cancel, composer, 0), function02, null, null, com.paypal.pds.components.ButtonStyle.Tertiary.INSTANCE, null, null, 108, null)}, null, null, com.paypal.pds.components.ButtonGroupAlignment.Vertical.INSTANCE, composer, com.paypal.pds.components.ButtonGroupAlignment.Vertical.$stable << 9, 6);
            if (androidx.compose.runtime.ComposerKt.isTraceInProgress()) {
                androidx.compose.runtime.ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return kotlin.Unit.INSTANCE;
    }
}
