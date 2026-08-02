package com.paypal.oslo.feature.savings.ui.home;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b\"\u0010#"}, d2 = {"Lcom/paypal/oslo/feature/savings/navigation/result/MoneyManagementSuccessNavResult;", "result", "", "toastMessage", "Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeViewModel;", "viewModel", "", "handleMoneyManagementSuccess", "(Lcom/paypal/oslo/feature/savings/navigation/result/MoneyManagementSuccessNavResult;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeViewModel;)V", "Lcom/paypal/oslo/feature/savings/api/navigation/result/SavingsAutoSaveNavResult;", "handleAutoSaveResult", "(Lcom/paypal/oslo/feature/savings/api/navigation/result/SavingsAutoSaveNavResult;Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeViewModel;)V", "Lcom/paypal/oslo/feature/savings/navigation/result/DeleteGoalNavResult;", "Landroid/content/Context;", "context", "handleDeleteGoalResult", "(Lcom/paypal/oslo/feature/savings/navigation/result/DeleteGoalNavResult;Landroid/content/Context;Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeViewModel;)V", "Lcom/paypal/oslo/feature/savings/navigation/result/GoalDetailsNavResult;", "deleteGoalSuccessTemplate", "handleGoalDetailsResult", "(Lcom/paypal/oslo/feature/savings/navigation/result/GoalDetailsNavResult;Ljava/lang/String;Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeViewModel;)V", "handleSmartRouteResult", "(Lcom/paypal/oslo/feature/savings/ui/home/SavingsHomeViewModel;)V", "Lcom/paypal/oslo/feature/savings/navigation/result/CreateGoalSuccessNavResult;", "Lcom/paypal/oslo/core/navigation/AppNavigator;", "appNavigator", "Lcom/paypal/oslo/core/navigation/result/NavResultRequestId;", "goalDetailsRequestId", "handleCreateGoalSuccess-vFXjZRc", "(Lcom/paypal/oslo/feature/savings/navigation/result/CreateGoalSuccessNavResult;Lcom/paypal/oslo/core/navigation/AppNavigator;Ljava/lang/String;)V", "handleCreateGoalSuccess", "Lcom/paypal/oslo/feature/savings/ui/home/AutoSaveHalfSheetAction;", "action", "Lcom/paypal/oslo/feature/savings/ui/home/AutoSaveNavigationDestination;", "getAutoSaveNavigationDestination", "(Lcom/paypal/oslo/feature/savings/ui/home/AutoSaveHalfSheetAction;)Lcom/paypal/oslo/feature/savings/ui/home/AutoSaveNavigationDestination;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsHomeHelpersKt {
    public static final void handleMoneyManagementSuccess(com.paypal.oslo.feature.savings.navigation.result.MoneyManagementSuccessNavResult moneyManagementSuccessNavResult, java.lang.String str, com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel savingsHomeViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyManagementSuccessNavResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsHomeViewModel, "");
        savingsHomeViewModel.processIntent(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.MoneyManagementSuccess(moneyManagementSuccessNavResult, str));
    }

    public static final void handleAutoSaveResult(com.paypal.oslo.feature.savings.api.navigation.result.SavingsAutoSaveNavResult savingsAutoSaveNavResult, com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel savingsHomeViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAutoSaveNavResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsHomeViewModel, "");
        int i = com.paypal.oslo.feature.savings.ui.home.SavingsHomeHelpersKt.WhenMappings.$EnumSwitchMapping$0[savingsAutoSaveNavResult.getType().ordinal()];
        if (i == 1) {
            savingsHomeViewModel.processIntent(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveSuccess(savingsAutoSaveNavResult.getMessage()));
        } else if (i == 2) {
            savingsHomeViewModel.processIntent(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.AutoSaveError(savingsAutoSaveNavResult.getMessage()));
        } else if (i != 3) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
    }

    public static final void handleDeleteGoalResult(com.paypal.oslo.feature.savings.navigation.result.DeleteGoalNavResult deleteGoalNavResult, android.content.Context context, com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel savingsHomeViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(deleteGoalNavResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsHomeViewModel, "");
        java.lang.String string = context.getString(com.paypal.oslo.feature.savings.R.string.feature_savings_toast_delete_goal_success, deleteGoalNavResult.getGoalName());
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "");
        savingsHomeViewModel.processIntent(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.DeleteGoalSuccess(string));
    }

    public static final void handleGoalDetailsResult(com.paypal.oslo.feature.savings.navigation.result.GoalDetailsNavResult goalDetailsNavResult, java.lang.String str, com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel savingsHomeViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalDetailsNavResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsHomeViewModel, "");
        java.lang.String deletedGoalName = goalDetailsNavResult.getDeletedGoalName();
        if (deletedGoalName != null) {
            java.lang.String format = java.lang.String.format(str, java.util.Arrays.copyOf(new java.lang.Object[]{deletedGoalName}, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(format, "");
            savingsHomeViewModel.processIntent(new com.paypal.oslo.feature.savings.ui.home.SavingsHomeIntent.DeleteGoalSuccess(format));
        }
        if (goalDetailsNavResult.getShouldRefresh()) {
            savingsHomeViewModel.initialize();
        }
    }

    public static final void handleSmartRouteResult(com.paypal.oslo.feature.savings.ui.home.SavingsHomeViewModel savingsHomeViewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsHomeViewModel, "");
        savingsHomeViewModel.initialize();
    }

    /* renamed from: handleCreateGoalSuccess-vFXjZRc, reason: not valid java name */
    public static final void m18865handleCreateGoalSuccessvFXjZRc(final com.paypal.oslo.feature.savings.navigation.result.CreateGoalSuccessNavResult createGoalSuccessNavResult, com.paypal.oslo.core.navigation.AppNavigator appNavigator, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createGoalSuccessNavResult, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appNavigator, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        appNavigator.m11575navigateForResultInternaluBl809w(str, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(com.paypal.oslo.feature.savings.navigation.result.GoalDetailsNavResult.class).toString(), new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.savings.ui.home.SavingsHomeHelpersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.savings.ui.home.SavingsHomeHelpersKt.$r8$lambda$JOUQMFvckIzfmQXmdMP1vF93nas(com.paypal.oslo.feature.savings.navigation.result.CreateGoalSuccessNavResult.this, (com.paypal.oslo.core.navigation.AppNavigator.NavigationScope) obj);
            }
        });
    }

    public static final com.paypal.oslo.feature.savings.ui.home.AutoSaveNavigationDestination getAutoSaveNavigationDestination(com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction autoSaveHalfSheetAction) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoSaveHalfSheetAction, "");
        if (autoSaveHalfSheetAction instanceof com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.Dismiss) {
            return null;
        }
        if (autoSaveHalfSheetAction instanceof com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.SetUp) {
            return new com.paypal.oslo.feature.savings.ui.home.AutoSaveNavigationDestination.SetUp(((com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.SetUp) autoSaveHalfSheetAction).getGoal());
        }
        if (autoSaveHalfSheetAction instanceof com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.Manage) {
            return new com.paypal.oslo.feature.savings.ui.home.AutoSaveNavigationDestination.Manage(((com.paypal.oslo.feature.savings.ui.home.AutoSaveHalfSheetAction.Manage) autoSaveHalfSheetAction).getGoal());
        }
        throw new kotlin.NoWhenBranchMatchedException();
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$JOUQMFvckIzfmQXmdMP1vF93nas(com.paypal.oslo.feature.savings.navigation.result.CreateGoalSuccessNavResult createGoalSuccessNavResult, com.paypal.oslo.core.navigation.AppNavigator.NavigationScope navigationScope) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(navigationScope, "");
        navigationScope.push(new com.paypal.oslo.feature.savings.di.navigation.SavingsGoalDetailsDestination((java.lang.String) null, createGoalSuccessNavResult.getGoal(), createGoalSuccessNavResult.getShouldRefreshAfterCreate(), createGoalSuccessNavResult.getShouldShowTransferError(), 1, (kotlin.jvm.internal.DefaultConstructorMarker) null));
        return kotlin.Unit.INSTANCE;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.feature.savings.api.navigation.result.AutoSaveResultType.values().length];
            try {
                iArr[com.paypal.oslo.feature.savings.api.navigation.result.AutoSaveResultType.SUCCESS.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.api.navigation.result.AutoSaveResultType.ERROR.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.feature.savings.api.navigation.result.AutoSaveResultType.CANCELLED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
