package com.paypal.oslo.feature.wallet.me.data.repository;

@kotlin.Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0018H\u0000¢\u0006\u0004\b\u0016\u0010\u0019\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u001aH\u0000¢\u0006\u0004\b\u0016\u0010\u001b\u001a\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010#\u001a\u00020\"*\u00060 j\u0002`!H\u0000¢\u0006\u0004\b#\u0010$"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnSavingsComponent;", "Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsProduct;", "asProduct", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnSavingsComponent;)Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsProduct;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$Savings;", "Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsOverview;", "asOverview", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$Savings;)Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsOverview;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$SavingsAccount;", "Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsAccount;", "asSavingsAccount", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$SavingsAccount;)Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsAccount;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$SavingsAccountFeatures;", "Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsFeatures;", "asSavingsFeatures", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$SavingsAccountFeatures;)Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsFeatures;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$Item2;", "Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsGoal;", "asSavingsGoal", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$Item2;)Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsGoal;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$CurrentBalance;", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "asMoney", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$CurrentBalance;)Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$TargetAmount;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$TargetAmount;)Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$TotalBalance;", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$TotalBalance;)Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$TransferSettings;", "Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsGoal$TransferSettings;", "asSavingsGoalTransferSettings", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$TransferSettings;)Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsGoal$TransferSettings;", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxScheduleStatus;", "Lcom/paypal/oslo/feature/wallet/graphql/type/MoneyboxScheduleStatus;", "Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsGoal$TransferSettings$ScheduleStatus;", "asSavingsGoalScheduleState", "(Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxScheduleStatus;)Lcom/paypal/oslo/feature/wallet/me/domain/savings/SavingsGoal$TransferSettings$ScheduleStatus;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class SavingsComponentMapperKtKt {
    public static final com.paypal.oslo.feature.wallet.me.domain.savings.SavingsProduct asProduct(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OnSavingsComponent onSavingsComponent) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onSavingsComponent, "");
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Wallet1 wallet = onSavingsComponent.getWallet();
        if (wallet == null) {
            return null;
        }
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Savings savings = wallet.getSavings();
        return new com.paypal.oslo.feature.wallet.me.domain.savings.SavingsProduct(true, savings != null ? asOverview(savings) : null);
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview asOverview(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Savings savings) {
        com.paypal.oslo.feature.wallet.me.domain.savings.SavingsAccount asSavingsAccount;
        java.util.ArrayList emptyList;
        java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Item2> items;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savings, "");
        if (savings.getSavingsAccount() == null || savings.getSavingsAccountFeatures() == null || (asSavingsAccount = asSavingsAccount(savings.getSavingsAccount())) == null) {
            return null;
        }
        com.paypal.oslo.feature.wallet.me.domain.savings.SavingsFeatures asSavingsFeatures = asSavingsFeatures(savings.getSavingsAccountFeatures());
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.SavingsGoals savingsGoals = savings.getSavingsGoals();
        if (savingsGoals == null || (items = savingsGoals.getItems()) == null) {
            emptyList = kotlin.collections.CollectionsKt.emptyList();
        } else {
            java.util.List<com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Item2> list = items;
            java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(asSavingsGoal((com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Item2) it.next()));
            }
            emptyList = arrayList;
        }
        return new com.paypal.oslo.feature.wallet.me.domain.savings.SavingsOverview(asSavingsAccount, asSavingsFeatures, emptyList);
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.savings.SavingsAccount asSavingsAccount(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.SavingsAccount savingsAccount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccount, "");
        if (savingsAccount.getTotalBalance() == null) {
            return null;
        }
        return new com.paypal.oslo.feature.wallet.me.domain.savings.SavingsAccount(asMoney(savingsAccount.getTotalBalance()));
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.savings.SavingsFeatures asSavingsFeatures(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.SavingsAccountFeatures savingsAccountFeatures) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(savingsAccountFeatures, "");
        return new com.paypal.oslo.feature.wallet.me.domain.savings.SavingsFeatures(savingsAccountFeatures.getAnnualPercentageYield().toString());
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoal asSavingsGoal(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Item2 item2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(item2, "");
        java.lang.String id = item2.getOnMoneybox().getId();
        java.lang.String name2 = item2.getOnMoneybox().getName();
        com.paypal.oslo.feature.wallet.common.domain.model.Money asMoney = asMoney(item2.getOnMoneybox().getTargetAmount());
        com.paypal.oslo.feature.wallet.common.domain.model.Money asMoney2 = asMoney(item2.getOnMoneybox().getCurrentBalance());
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.TransferSettings transferSettings = item2.getOnMoneybox().getTransferSettings();
        return new com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoal(id, name2, asMoney, asMoney2, transferSettings != null ? asSavingsGoalTransferSettings(transferSettings) : null);
    }

    public static final com.paypal.oslo.feature.wallet.common.domain.model.Money asMoney(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.CurrentBalance currentBalance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currentBalance, "");
        return new com.paypal.oslo.feature.wallet.common.domain.model.Money(currentBalance.getOnMoney().getCurrencyCode().toString(), currentBalance.getOnMoney().getValue());
    }

    public static final com.paypal.oslo.feature.wallet.common.domain.model.Money asMoney(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.TargetAmount targetAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(targetAmount, "");
        return new com.paypal.oslo.feature.wallet.common.domain.model.Money(targetAmount.getOnMoney().getCurrencyCode().toString(), targetAmount.getOnMoney().getValue());
    }

    public static final com.paypal.oslo.feature.wallet.common.domain.model.Money asMoney(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.TotalBalance totalBalance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalBalance, "");
        return new com.paypal.oslo.feature.wallet.common.domain.model.Money(totalBalance.getOnMoney().getCurrencyCode().toString(), totalBalance.getOnMoney().getValue());
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoal.TransferSettings asSavingsGoalTransferSettings(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.TransferSettings transferSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transferSettings, "");
        return new com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoal.TransferSettings(asSavingsGoalScheduleState(transferSettings.getStatus()));
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoal.TransferSettings.ScheduleStatus asSavingsGoalScheduleState(com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus moneyboxScheduleStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(moneyboxScheduleStatus, "");
        int i = com.paypal.oslo.feature.wallet.me.data.repository.SavingsComponentMapperKtKt.WhenMappings.$EnumSwitchMapping$0[moneyboxScheduleStatus.ordinal()];
        if (i == 1) {
            return com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoal.TransferSettings.ScheduleStatus.RUNNING;
        }
        if (i == 2) {
            return com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoal.TransferSettings.ScheduleStatus.STOPPED;
        }
        if (i == 3) {
            return com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoal.TransferSettings.ScheduleStatus.PAUSED;
        }
        if (i == 4) {
            return com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoal.TransferSettings.ScheduleStatus.SKIPPED;
        }
        return com.paypal.oslo.feature.wallet.me.domain.savings.SavingsGoal.TransferSettings.ScheduleStatus.UNKNOWN;
    }

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus.values().length];
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus.RUNNING.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus.STOPPED.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus.PAUSED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.paypal.oslo.api.graphql.schema.type.MoneyboxScheduleStatus.SKIPPED.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
