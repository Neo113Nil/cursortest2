package com.paypal.oslo.feature.savings.data.mapper;

@kotlin.Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0019\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\n\u001a\u00020\u0006*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0019\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u0005*\u00020\u0018H\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0013\u0010\"\u001a\u00020!*\u00020 H\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0013\u0010&\u001a\u00020%*\u00020$H\u0000¢\u0006\u0004\b&\u0010'\u001a\u0013\u0010*\u001a\u00020)*\u00020(H\u0000¢\u0006\u0004\b*\u0010+\u001a\u0013\u0010.\u001a\u00020-*\u00020,H\u0000¢\u0006\u0004\b.\u0010/\u001a\u0013\u00102\u001a\u000201*\u000200H\u0000¢\u0006\u0004\b2\u00103\u001a\u0013\u00106\u001a\u000205*\u000204H\u0000¢\u0006\u0004\b6\u00107\u001a\u0013\u0010:\u001a\u000209*\u000208H\u0000¢\u0006\u0004\b:\u0010;\"\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?"}, d2 = {"Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$Data;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsHubData;", "toSavingsHubData", "(Lcom/paypal/oslo/feature/savings/graphql/GetSavingsHubDataQuery$Data;)Lcom/paypal/oslo/feature/savings/domain/model/SavingsHubData;", "Lcom/paypal/oslo/feature/savings/graphql/GetGoalsQuery$Data;", "", "Lcom/paypal/oslo/feature/savings/domain/model/MoneyboxData;", "toMoneyboxes", "(Lcom/paypal/oslo/feature/savings/graphql/GetGoalsQuery$Data;)Ljava/util/List;", "Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment;", "getHighResolutionOutputSizeshNQ4ISI", "(Lcom/paypal/oslo/feature/savings/graphql/fragment/SavingsMoneyBoxFragment;)Lcom/paypal/oslo/feature/savings/domain/model/MoneyboxData;", "Lcom/paypal/oslo/feature/savings/graphql/GetBalancesQuery$Data;", "Lcom/paypal/oslo/feature/savings/domain/model/PayPalBalanceData;", "toPayPalBalanceData", "(Lcom/paypal/oslo/feature/savings/graphql/GetBalancesQuery$Data;)Lcom/paypal/oslo/feature/savings/domain/model/PayPalBalanceData;", "Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$Data;", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferResult;", "toMoneyboxTransferResult", "(Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxMutation$Data;)Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferResult;", "Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxScheduleMutation$Data;", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferScheduleResult;", "toMoneyboxTransferScheduleResult", "(Lcom/paypal/oslo/feature/savings/graphql/TransferMoneyboxScheduleMutation$Data;)Lcom/paypal/oslo/feature/savings/domain/model/transfers/MoneyboxTransferScheduleResult;", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsAccountQuery$Data;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsAccountInfo;", "toSavingsAccountInfoList", "(Lcom/paypal/oslo/feature/savings/graphql/GetSavingsAccountQuery$Data;)Ljava/util/List;", "Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$Data;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsAccountEligibility;", "toSavingsAccountEligibility", "(Lcom/paypal/oslo/feature/savings/graphql/SavingsAccountEligibilityQuery$Data;)Lcom/paypal/oslo/feature/savings/domain/model/SavingsAccountEligibility;", "Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$Data;", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/UpdateMoneyboxTransferScheduleResult;", "toUpdateMoneyboxTransferScheduleResult", "(Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxTransferScheduleMutation$Data;)Lcom/paypal/oslo/feature/savings/domain/model/transfers/UpdateMoneyboxTransferScheduleResult;", "Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxTransferScheduleMutation$Data;", "Lcom/paypal/oslo/feature/savings/domain/model/transfers/DeleteMoneyboxTransferScheduleResult;", "toDeleteMoneyboxTransferScheduleResult", "(Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxTransferScheduleMutation$Data;)Lcom/paypal/oslo/feature/savings/domain/model/transfers/DeleteMoneyboxTransferScheduleResult;", "Lcom/paypal/oslo/feature/savings/graphql/CreateMoneyboxMutation$Data;", "Lcom/paypal/oslo/feature/savings/domain/model/goals/CreateSavingsGoalResult;", "toCreateSavingsGoalResult", "(Lcom/paypal/oslo/feature/savings/graphql/CreateMoneyboxMutation$Data;)Lcom/paypal/oslo/feature/savings/domain/model/goals/CreateSavingsGoalResult;", "Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$Data;", "Lcom/paypal/oslo/feature/savings/domain/model/goals/UpdateMoneyboxResult;", "toUpdateMoneyboxResult", "(Lcom/paypal/oslo/feature/savings/graphql/UpdateMoneyboxMutation$Data;)Lcom/paypal/oslo/feature/savings/domain/model/goals/UpdateMoneyboxResult;", "Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxMutation$Data;", "Lcom/paypal/oslo/feature/savings/domain/model/goals/DeleteMoneyboxResult;", "toDeleteMoneyboxResult", "(Lcom/paypal/oslo/feature/savings/graphql/DeleteMoneyboxMutation$Data;)Lcom/paypal/oslo/feature/savings/domain/model/goals/DeleteMoneyboxResult;", "Lcom/paypal/oslo/feature/savings/graphql/GetSavingsLandingPageDataQuery$Data;", "Lcom/paypal/oslo/feature/savings/domain/model/SavingsLandingPageData;", "toSavingsLandingPageData", "(Lcom/paypal/oslo/feature/savings/graphql/GetSavingsLandingPageDataQuery$Data;)Lcom/paypal/oslo/feature/savings/domain/model/SavingsLandingPageData;", "Lcom/paypal/oslo/feature/savings/graphql/GetDepositOptionsQuery$Data;", "Lcom/paypal/oslo/feature/savings/domain/model/DepositOptionsData;", "toDepositOptionsData", "(Lcom/paypal/oslo/feature/savings/graphql/GetDepositOptionsQuery$Data;)Lcom/paypal/oslo/feature/savings/domain/model/DepositOptionsData;", "", "Lcom/paypal/oslo/api/graphql/schema/type/MoneyboxCategory;", "getHighSpeedVideoSizes", "Ljava/util/Set;", "Camera2StreamConfigurationMap"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsResponseMapperKt {
    private static final java.util.Set<com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory> getHighSpeedVideoSizes = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory[]{com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory.SAVINGS_GOAL, com.paypal.oslo.api.graphql.schema.type.MoneyboxCategory.SAVINGS_NON_GOAL});

    public static final com.paypal.oslo.feature.savings.domain.model.SavingsHubData toSavingsHubData(com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Data data) {
        java.util.ArrayList arrayList;
        com.paypal.oslo.feature.savings.domain.model.SavingsAccountData savingsAccountData;
        com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment savingsMoneyBoxFragment;
        com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment savingsMoneyFragment;
        com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment savingsMoneyFragment2;
        com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment savingsMoneyFragment3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.lang.String obj = data.getSavingsAccountFeatures().getAnnualPercentageYield().toString();
        java.lang.String obj2 = data.getSavingsAccountFeatures().getCountryCode().toString();
        java.util.List<com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccount> savingsAccounts = data.getSavingsAccounts();
        if (savingsAccounts != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsAccount savingsAccount : savingsAccounts) {
                if (savingsAccount != null) {
                    java.lang.String id = savingsAccount.getId();
                    java.lang.String rawValue = savingsAccount.getAccountStatus().getRawValue();
                    boolean electronic1099OptIn = savingsAccount.getElectronic1099OptIn();
                    boolean backupWithholdingEnabled = savingsAccount.getBackupWithholdingEnabled();
                    java.lang.String moneyboxId = savingsAccount.getMoneyboxId();
                    com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalBalance totalBalance = savingsAccount.getTotalBalance();
                    com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData = (totalBalance == null || (savingsMoneyFragment3 = totalBalance.getSavingsMoneyFragment()) == null) ? null : new com.paypal.oslo.feature.savings.domain.model.MoneyData(savingsMoneyFragment3.getValue(), savingsMoneyFragment3.getCurrencyCode().toString());
                    com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalNonGoalBalance totalNonGoalBalance = savingsAccount.getTotalNonGoalBalance();
                    com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData2 = (totalNonGoalBalance == null || (savingsMoneyFragment2 = totalNonGoalBalance.getSavingsMoneyFragment()) == null) ? null : new com.paypal.oslo.feature.savings.domain.model.MoneyData(savingsMoneyFragment2.getValue(), savingsMoneyFragment2.getCurrencyCode().toString());
                    com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.TotalGoalsBalance totalGoalsBalance = savingsAccount.getTotalGoalsBalance();
                    com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData3 = (totalGoalsBalance == null || (savingsMoneyFragment = totalGoalsBalance.getSavingsMoneyFragment()) == null) ? null : new com.paypal.oslo.feature.savings.domain.model.MoneyData(savingsMoneyFragment.getValue(), savingsMoneyFragment.getCurrencyCode().toString());
                    com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Moneybox moneybox = savingsAccount.getMoneybox();
                    savingsAccountData = new com.paypal.oslo.feature.savings.domain.model.SavingsAccountData(id, rawValue, java.lang.Boolean.valueOf(electronic1099OptIn), java.lang.Boolean.valueOf(backupWithholdingEnabled), moneyboxId, moneyData, moneyData2, moneyData3, (moneybox == null || (savingsMoneyBoxFragment = moneybox.getSavingsMoneyBoxFragment()) == null) ? null : getHighResolutionOutputSizeshNQ4ISI(savingsMoneyBoxFragment));
                } else {
                    savingsAccountData = null;
                }
                if (savingsAccountData != null) {
                    arrayList2.add(savingsAccountData);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        java.util.List emptyList = arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
        java.util.List<com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Item> items = data.getMoneyboxes().getItems();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj3 : items) {
            if (getHighSpeedVideoSizes.contains(((com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Item) obj3).getSavingsMoneyBoxFragment().getCategory())) {
                arrayList3.add(obj3);
            }
        }
        java.util.ArrayList arrayList4 = arrayList3;
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        java.util.Iterator it = arrayList4.iterator();
        while (it.hasNext()) {
            arrayList5.add(getHighResolutionOutputSizeshNQ4ISI(((com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.Item) it.next()).getSavingsMoneyBoxFragment()));
        }
        java.util.ArrayList arrayList6 = arrayList5;
        com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SavingsInterest savingsInterest = data.getSavingsInterest();
        com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.MonthToDateInterest monthToDateInterest = savingsInterest.getMonthToDateInterest();
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData4 = new com.paypal.oslo.feature.savings.domain.model.MoneyData(monthToDateInterest.getValue(), monthToDateInterest.getCurrencyCode().toString());
        com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.LifetimeInterest lifetimeInterest = savingsInterest.getLifetimeInterest();
        com.paypal.oslo.feature.savings.domain.model.SavingsInterestData savingsInterestData = new com.paypal.oslo.feature.savings.domain.model.SavingsInterestData(moneyData4, new com.paypal.oslo.feature.savings.domain.model.MoneyData(lifetimeInterest.getValue(), lifetimeInterest.getCurrencyCode().toString()));
        com.paypal.oslo.feature.savings.graphql.GetSavingsHubDataQuery.SmartRoutePreferences smartRoutePreferences = data.getSmartRoutePreferences();
        return new com.paypal.oslo.feature.savings.domain.model.SavingsHubData(obj, obj2, emptyList, arrayList6, savingsInterestData, smartRoutePreferences != null ? new com.paypal.oslo.feature.savings.domain.model.SmartRoutePreferencesData(smartRoutePreferences.getStatus().getRawValue(), smartRoutePreferences.getVersion()) : null);
    }

    public static final java.util.List<com.paypal.oslo.feature.savings.domain.model.MoneyboxData> toMoneyboxes(com.paypal.oslo.feature.savings.graphql.GetGoalsQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.util.List<com.paypal.oslo.feature.savings.graphql.GetGoalsQuery.Item> items = data.getMoneyboxes().getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : items) {
            if (getHighSpeedVideoSizes.contains(((com.paypal.oslo.feature.savings.graphql.GetGoalsQuery.Item) obj).getSavingsMoneyBoxFragment().getCategory())) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(getHighResolutionOutputSizeshNQ4ISI(((com.paypal.oslo.feature.savings.graphql.GetGoalsQuery.Item) it.next()).getSavingsMoneyBoxFragment()));
        }
        return arrayList3;
    }

    private static final com.paypal.oslo.feature.savings.domain.model.MoneyboxData getHighResolutionOutputSizeshNQ4ISI(com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment savingsMoneyBoxFragment) {
        java.lang.String str;
        com.paypal.oslo.feature.savings.domain.model.TransferSettingsData transferSettingsData;
        java.lang.String id = savingsMoneyBoxFragment.getId();
        java.lang.String name2 = savingsMoneyBoxFragment.getName();
        java.lang.String description = savingsMoneyBoxFragment.getDescription();
        java.lang.String rawValue = savingsMoneyBoxFragment.getType().getRawValue();
        com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment savingsMoneyFragment = savingsMoneyBoxFragment.getTargetAmount().getSavingsMoneyFragment();
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData = new com.paypal.oslo.feature.savings.domain.model.MoneyData(savingsMoneyFragment.getValue(), savingsMoneyFragment.getCurrencyCode().toString());
        com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment savingsMoneyFragment2 = savingsMoneyBoxFragment.getCurrentBalance().getSavingsMoneyFragment();
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData2 = new com.paypal.oslo.feature.savings.domain.model.MoneyData(savingsMoneyFragment2.getValue(), savingsMoneyFragment2.getCurrencyCode().toString());
        com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyFragment savingsMoneyFragment3 = savingsMoneyBoxFragment.getPendingAmount().getSavingsMoneyFragment();
        com.paypal.oslo.feature.savings.domain.model.MoneyData moneyData3 = new com.paypal.oslo.feature.savings.domain.model.MoneyData(savingsMoneyFragment3.getValue(), savingsMoneyFragment3.getCurrencyCode().toString());
        java.lang.String rawValue2 = savingsMoneyBoxFragment.getCategory().getRawValue();
        java.lang.String rawValue3 = savingsMoneyBoxFragment.getStatus().getRawValue();
        com.paypal.oslo.feature.savings.graphql.fragment.SavingsMoneyBoxFragment.TransferSettings transferSettings = savingsMoneyBoxFragment.getTransferSettings();
        if (transferSettings != null) {
            str = rawValue3;
            transferSettingsData = new com.paypal.oslo.feature.savings.domain.model.TransferSettingsData(transferSettings.getId(), transferSettings.getStartDate().toString(), transferSettings.getNextReloadDate().toString(), transferSettings.getRecurrence().getRawValue(), transferSettings.getFinancialInstrumentId(), transferSettings.getFinancialInstrumentName(), transferSettings.getLastFourChars(), new com.paypal.oslo.feature.savings.domain.model.MoneyData(transferSettings.getReloadAmount().getValue(), transferSettings.getReloadAmount().getCurrencyCode().toString()), transferSettings.getStatus().getRawValue(), transferSettings.getType().getRawValue());
        } else {
            str = rawValue3;
            transferSettingsData = null;
        }
        return new com.paypal.oslo.feature.savings.domain.model.MoneyboxData(id, name2, description, rawValue, moneyData, moneyData2, moneyData3, rawValue2, str, transferSettingsData);
    }

    public static final com.paypal.oslo.feature.savings.domain.model.PayPalBalanceData toPayPalBalanceData(com.paypal.oslo.feature.savings.graphql.GetBalancesQuery.Data data) {
        java.lang.Object obj;
        java.lang.Object obj2;
        com.paypal.oslo.feature.savings.graphql.GetBalancesQuery.Available available;
        com.paypal.oslo.feature.savings.graphql.GetBalancesQuery.Amount amount;
        com.paypal.oslo.feature.savings.graphql.GetBalancesQuery.Available available2;
        com.paypal.oslo.feature.savings.graphql.GetBalancesQuery.Amount amount2;
        com.paypal.oslo.feature.savings.graphql.GetBalancesQuery.Available available3;
        com.paypal.oslo.feature.savings.graphql.GetBalancesQuery.Amount amount3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.savings.graphql.GetBalancesQuery.Balances balances = data.getBalances();
        java.util.Iterator<T> it = balances.getItems().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (kotlin.jvm.internal.Intrinsics.areEqual(((com.paypal.oslo.feature.savings.graphql.GetBalancesQuery.Item) obj2).getAvailable().getAmount().getCurrencyCode().toString(), "USD")) {
                break;
            }
        }
        com.paypal.oslo.feature.savings.graphql.GetBalancesQuery.Item item = (com.paypal.oslo.feature.savings.graphql.GetBalancesQuery.Item) obj2;
        if (item == null) {
            item = (com.paypal.oslo.feature.savings.graphql.GetBalancesQuery.Item) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) balances.getItems());
        }
        java.lang.String id = item != null ? item.getId() : null;
        if (id == null) {
            id = "";
        }
        java.lang.String valueOf = java.lang.String.valueOf((item == null || (available3 = item.getAvailable()) == null || (amount3 = available3.getAmount()) == null) ? null : amount3.getCurrencyCode());
        java.lang.String value = (item == null || (available2 = item.getAvailable()) == null || (amount2 = available2.getAmount()) == null) ? null : amount2.getValue();
        java.lang.String str = value != null ? value : "";
        if (item != null && (available = item.getAvailable()) != null && (amount = available.getAmount()) != null) {
            obj = amount.getCurrencyCode();
        }
        return new com.paypal.oslo.feature.savings.domain.model.PayPalBalanceData(id, valueOf, new com.paypal.oslo.feature.savings.domain.model.MoneyData(str, java.lang.String.valueOf(obj)), java.lang.Boolean.valueOf(item != null ? item.isBalanceAccountPrimary() : true));
    }

    public static final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferResult toMoneyboxTransferResult(com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        boolean success = data.getTransferMoneybox().getSuccess();
        com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Transfer transfer = data.getTransferMoneybox().getTransfer();
        java.lang.String id = transfer.getId();
        java.lang.String moneyboxId = transfer.getMoneyboxId();
        com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType valueOf = com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferType.valueOf(transfer.getType().getRawValue());
        com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus safeValueOf = com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferStatus.INSTANCE.safeValueOf(transfer.getStatus().getRawValue());
        com.paypal.oslo.feature.savings.graphql.TransferMoneyboxMutation.Amount amount = transfer.getAmount();
        return new com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferResult(success, new com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransfer(id, moneyboxId, valueOf, safeValueOf, new com.paypal.oslo.feature.savings.domain.model.transfers.Money(amount.getCurrencyCode().toString(), amount.getValue())));
    }

    public static final com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferScheduleResult toMoneyboxTransferScheduleResult(com.paypal.oslo.feature.savings.graphql.TransferMoneyboxScheduleMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.paypal.oslo.feature.savings.domain.model.transfers.MoneyboxTransferScheduleResult(data.getCreateMoneyboxTransferSchedule().getSuccess());
    }

    public static final java.util.List<com.paypal.oslo.feature.savings.domain.model.SavingsAccountInfo> toSavingsAccountInfoList(com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.util.List<com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.SavingsAccount> savingsAccounts = data.getSavingsAccounts();
        java.util.ArrayList arrayList = null;
        if (savingsAccounts != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.paypal.oslo.feature.savings.graphql.GetSavingsAccountQuery.SavingsAccount savingsAccount : savingsAccounts) {
                com.paypal.oslo.feature.savings.domain.model.SavingsAccountInfo savingsAccountInfo = savingsAccount != null ? new com.paypal.oslo.feature.savings.domain.model.SavingsAccountInfo(savingsAccount.getId(), savingsAccount.getAccountStatus().getRawValue()) : null;
                if (savingsAccountInfo != null) {
                    arrayList2.add(savingsAccountInfo);
                }
            }
            arrayList = arrayList2;
        }
        return arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList;
    }

    public static final com.paypal.oslo.feature.savings.domain.model.SavingsAccountEligibility toSavingsAccountEligibility(com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsAccountEligibility savingsAccountEligibility = data.getSavingsAccountEligibility();
        com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.SavingsProductSubscription savingsProductSubscription = savingsAccountEligibility.getSavingsProductSubscription();
        java.lang.String id = savingsProductSubscription.getId();
        java.lang.String rawValue = savingsProductSubscription.getStatus().getRawValue();
        com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.IneligibilityReason ineligibilityReason = savingsProductSubscription.getIneligibilityReason();
        com.paypal.oslo.feature.savings.domain.model.OnboardingProperties onboardingProperties = null;
        java.util.ArrayList arrayList = null;
        com.paypal.oslo.feature.savings.domain.model.IneligibilityReason ineligibilityReason2 = ineligibilityReason != null ? new com.paypal.oslo.feature.savings.domain.model.IneligibilityReason(ineligibilityReason.getReasonCode().getRawValue(), ineligibilityReason.getDescription()) : null;
        com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.OnboardingProperties onboardingProperties2 = savingsProductSubscription.getOnboardingProperties();
        if (onboardingProperties2 != null) {
            boolean showDocUpload = onboardingProperties2.getShowDocUpload();
            java.util.List<com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Policy> policies = onboardingProperties2.getPolicies();
            if (policies != null) {
                java.util.List<com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Policy> list = policies;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                for (com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.Policy policy : list) {
                    arrayList2.add(new com.paypal.oslo.feature.savings.domain.model.Policy(policy.getId(), policy.getName().getRawValue()));
                }
                arrayList = arrayList2;
            }
            if (arrayList == null) {
                arrayList = kotlin.collections.CollectionsKt.emptyList();
            }
            onboardingProperties = new com.paypal.oslo.feature.savings.domain.model.OnboardingProperties(java.lang.Boolean.valueOf(showDocUpload), arrayList);
        }
        com.paypal.oslo.feature.savings.domain.model.ProductSubscription productSubscription = new com.paypal.oslo.feature.savings.domain.model.ProductSubscription(id, rawValue, ineligibilityReason2, onboardingProperties);
        com.paypal.oslo.feature.savings.graphql.SavingsAccountEligibilityQuery.CashPlusProductSubscription cashPlusProductSubscription = savingsAccountEligibility.getCashPlusProductSubscription();
        return new com.paypal.oslo.feature.savings.domain.model.SavingsAccountEligibility(productSubscription, new com.paypal.oslo.feature.savings.domain.model.CashPlusProductSubscription(cashPlusProductSubscription.getId(), cashPlusProductSubscription.getStatus().getRawValue()));
    }

    public static final com.paypal.oslo.feature.savings.domain.model.transfers.UpdateMoneyboxTransferScheduleResult toUpdateMoneyboxTransferScheduleResult(com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        boolean success = data.getUpdateMoneyboxTransferSchedule().getSuccess();
        com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxTransferScheduleMutation.TransferSchedule transferSchedule = data.getUpdateMoneyboxTransferSchedule().getTransferSchedule();
        return new com.paypal.oslo.feature.savings.domain.model.transfers.UpdateMoneyboxTransferScheduleResult(success, transferSchedule != null ? new com.paypal.oslo.feature.savings.domain.model.transfers.TransferScheduleDetails(transferSchedule.getId(), transferSchedule.getStartDate().toString(), transferSchedule.getRecurrence().getRawValue(), transferSchedule.getFinancialInstrumentId(), new com.paypal.oslo.feature.savings.domain.model.transfers.Money(transferSchedule.getReloadAmount().getCurrencyCode().toString(), transferSchedule.getReloadAmount().getValue()), transferSchedule.getStatus().getRawValue()) : null);
    }

    public static final com.paypal.oslo.feature.savings.domain.model.transfers.DeleteMoneyboxTransferScheduleResult toDeleteMoneyboxTransferScheduleResult(com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxTransferScheduleMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.paypal.oslo.feature.savings.domain.model.transfers.DeleteMoneyboxTransferScheduleResult(data.getDeleteMoneyboxTransferSchedule().getSuccess(), data.getDeleteMoneyboxTransferSchedule().getDeletedScheduleId());
    }

    public static final com.paypal.oslo.feature.savings.domain.model.goals.CreateSavingsGoalResult toCreateSavingsGoalResult(com.paypal.oslo.feature.savings.graphql.CreateMoneyboxMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.savings.graphql.CreateMoneyboxMutation.Moneybox moneybox = data.getCreateMoneybox().getMoneybox();
        return new com.paypal.oslo.feature.savings.domain.model.goals.CreateSavingsGoalResult(moneybox != null ? new com.paypal.oslo.feature.savings.domain.model.MoneyboxData(moneybox.getId(), moneybox.getName(), moneybox.getDescription(), moneybox.getType().getRawValue(), new com.paypal.oslo.feature.savings.domain.model.MoneyData(moneybox.getTargetAmount().getValue(), moneybox.getTargetAmount().getCurrencyCode().toString()), new com.paypal.oslo.feature.savings.domain.model.MoneyData(moneybox.getCurrentBalance().getValue(), moneybox.getCurrentBalance().getCurrencyCode().toString()), new com.paypal.oslo.feature.savings.domain.model.MoneyData(moneybox.getPendingAmount().getValue(), moneybox.getPendingAmount().getCurrencyCode().toString()), moneybox.getCategory().getRawValue(), moneybox.getStatus().getRawValue(), null) : null, data.getCreateMoneybox().getSuccess());
    }

    public static final com.paypal.oslo.feature.savings.domain.model.goals.UpdateMoneyboxResult toUpdateMoneyboxResult(com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.savings.graphql.UpdateMoneyboxMutation.Moneybox moneybox = data.getUpdateMoneybox().getMoneybox();
        return new com.paypal.oslo.feature.savings.domain.model.goals.UpdateMoneyboxResult(moneybox != null ? new com.paypal.oslo.feature.savings.domain.model.goals.UpdatedMoneyboxData(moneybox.getId(), moneybox.getName(), moneybox.getDescription(), new com.paypal.oslo.feature.savings.domain.model.transfers.Money(moneybox.getTargetAmount().getCurrencyCode().toString(), moneybox.getTargetAmount().getValue()), moneybox.getCategory().getRawValue(), moneybox.getType().getRawValue()) : null, data.getUpdateMoneybox().getSuccess());
    }

    public static final com.paypal.oslo.feature.savings.domain.model.goals.DeleteMoneyboxResult toDeleteMoneyboxResult(com.paypal.oslo.feature.savings.graphql.DeleteMoneyboxMutation.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return new com.paypal.oslo.feature.savings.domain.model.goals.DeleteMoneyboxResult(data.getDeleteMoneybox().getDeletedMoneyboxId(), data.getDeleteMoneybox().getSuccess());
    }

    public static final com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageData toSavingsLandingPageData(com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.savings.graphql.GetSavingsLandingPageDataQuery.SavingsAccountFeatures savingsAccountFeatures = data.getSavingsAccountFeatures();
        return new com.paypal.oslo.feature.savings.domain.model.SavingsLandingPageData(savingsAccountFeatures.getAnnualPercentageYield().toString(), savingsAccountFeatures.getCountryCode().toString(), savingsAccountFeatures.getMarketingNationalAverageRateMultiplierText(), savingsAccountFeatures.getMarketingNationalAverageReportDate().toString(), savingsAccountFeatures.getMarketingRateEffectiveDate().toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0166, code lost:
    
        if (r1 == null) goto L64;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final com.paypal.oslo.feature.savings.domain.model.DepositOptionsData toDepositOptionsData(com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.Data data) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        int i;
        java.lang.Object currencyCode;
        java.util.Iterator it;
        java.util.Iterator it2;
        com.paypal.oslo.feature.savings.domain.model.DepositInstrument.Unknown unknown;
        java.lang.String str;
        java.lang.String obj;
        com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.CardInstitutionImage cardInstitutionImage;
        java.lang.Object url;
        com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.PrimaryImage primaryImage;
        com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.PrimaryImage primaryImage2;
        java.lang.Object baseCdnLinkPath;
        com.paypal.oslo.api.graphql.schema.type.CardStatus value;
        com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage bankAccountInstitutionImage;
        java.lang.Object url2;
        com.paypal.oslo.api.graphql.schema.type.BankAccountStatus value2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.util.List<com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.Option> options = data.getDepositOptions().getOptions();
        int i2 = 10;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(options, 10));
        java.util.Iterator it3 = options.iterator();
        while (it3.hasNext()) {
            com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.Option option = (com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.Option) it3.next();
            java.lang.String id = option.getId();
            boolean isDefault = option.getPlan().isDefault();
            java.util.List<com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.FundingSource> fundingSources = option.getPlan().getFundingSources();
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(fundingSources, i2));
            java.util.Iterator it4 = fundingSources.iterator();
            while (true) {
                arrayList = null;
                r10 = null;
                r10 = null;
                java.lang.String str2 = null;
                r10 = null;
                r10 = null;
                java.lang.String str3 = null;
                if (!it4.hasNext()) {
                    break;
                }
                com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.FundingSource fundingSource = (com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.FundingSource) it4.next();
                java.lang.String rawValue = fundingSource.getType().getRawValue();
                com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.Instrument instrument = fundingSource.getInstrument();
                if (instrument.getOnBankAccount() == null) {
                    if (instrument.getOnCard() == null) {
                        it = it3;
                        it2 = it4;
                        unknown = com.paypal.oslo.feature.savings.domain.model.DepositInstrument.Unknown.INSTANCE;
                    } else {
                        com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.OnCard onCard = instrument.getOnCard();
                        java.lang.String id2 = onCard.getId();
                        java.lang.String rawValue2 = onCard.getBrand().getRawValue();
                        java.lang.String lastNChars = onCard.getLastNChars();
                        com.paypal.oslo.api.graphql.schema.type.CardProductClass productClass = onCard.getProductClass();
                        java.lang.String rawValue3 = productClass != null ? productClass.getRawValue() : null;
                        com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.CardStatus cardStatus = onCard.getCardStatus();
                        java.lang.String rawValue4 = (cardStatus == null || (value = cardStatus.getValue()) == null) ? null : value.getRawValue();
                        com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.CardIssuer cardIssuer = onCard.getCardIssuer();
                        java.lang.String name2 = cardIssuer != null ? cardIssuer.getName() : null;
                        com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.CardArt cardArt = onCard.getCardArt();
                        java.lang.String obj2 = (cardArt == null || (primaryImage2 = cardArt.getPrimaryImage()) == null || (baseCdnLinkPath = primaryImage2.getBaseCdnLinkPath()) == null) ? null : baseCdnLinkPath.toString();
                        com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.CardArt cardArt2 = onCard.getCardArt();
                        java.lang.String mimeType = (cardArt2 == null || (primaryImage = cardArt2.getPrimaryImage()) == null) ? null : primaryImage.getMimeType();
                        it = it3;
                        if (obj2 == null) {
                            it2 = it4;
                            obj = null;
                        } else {
                            if (mimeType != null) {
                                it2 = it4;
                                java.lang.String substringAfterLast$default = kotlin.text.StringsKt.substringAfterLast$default(mimeType, kotlinx.io.files.FileSystemKt.UnixPathSeparator, (java.lang.String) null, 2, (java.lang.Object) null);
                                if (substringAfterLast$default != null) {
                                    str = substringAfterLast$default.toLowerCase(java.util.Locale.ROOT);
                                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
                                }
                            } else {
                                it2 = it4;
                            }
                            str = "png";
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            sb.append(obj2);
                            sb.append("2.");
                            sb.append(str);
                            obj = sb.toString();
                        }
                        java.util.List<com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.CardInstitutionImage> cardInstitutionImages = onCard.getCardInstitutionImages();
                        if (cardInstitutionImages != null && (cardInstitutionImage = (com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.CardInstitutionImage) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) cardInstitutionImages)) != null && (url = cardInstitutionImage.getUrl()) != null) {
                            str3 = url.toString();
                        }
                        unknown = new com.paypal.oslo.feature.savings.domain.model.DepositInstrument.Card(id2, rawValue2, lastNChars, rawValue3, rawValue4, name2, obj, str3, onCard.getNickName());
                    }
                } else {
                    com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.OnBankAccount onBankAccount = instrument.getOnBankAccount();
                    java.lang.String id3 = onBankAccount.getId();
                    java.lang.String rawValue5 = onBankAccount.getType().getRawValue();
                    java.lang.String lastNChars2 = onBankAccount.getLastNChars();
                    com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.BankAccountStatus bankAccountStatus = onBankAccount.getBankAccountStatus();
                    java.lang.String rawValue6 = (bankAccountStatus == null || (value2 = bankAccountStatus.getValue()) == null) ? null : value2.getRawValue();
                    java.lang.String name3 = onBankAccount.getBankAccountIssuer().getName();
                    java.util.List<com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage> bankAccountInstitutionImages = onBankAccount.getBankAccountInstitutionImages();
                    if (bankAccountInstitutionImages != null && (bankAccountInstitutionImage = (com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.BankAccountInstitutionImage) kotlin.collections.CollectionsKt.getOrNull(bankAccountInstitutionImages, 1)) != null && (url2 = bankAccountInstitutionImage.getUrl()) != null) {
                        str2 = url2.toString();
                    }
                    unknown = new com.paypal.oslo.feature.savings.domain.model.DepositInstrument.BankAccount(id3, rawValue5, lastNChars2, rawValue6, name3, str2, onBankAccount.getNickname());
                    it = it3;
                    it2 = it4;
                }
                arrayList4.add(new com.paypal.oslo.feature.savings.domain.model.DepositFundingSource(rawValue, unknown));
                it3 = it;
                it4 = it2;
            }
            java.util.Iterator it5 = it3;
            java.util.ArrayList arrayList5 = arrayList4;
            java.lang.String rawValue7 = option.getPlan().getPaymentDelivery().getSpeed().getRawValue();
            java.util.List<com.paypal.oslo.api.graphql.schema.type.TransferTag> tags = option.getTags();
            if (tags != null) {
                java.util.List<com.paypal.oslo.api.graphql.schema.type.TransferTag> list = tags;
                java.util.ArrayList arrayList6 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list, 10));
                java.util.Iterator<T> it6 = list.iterator();
                while (it6.hasNext()) {
                    arrayList6.add(((com.paypal.oslo.api.graphql.schema.type.TransferTag) it6.next()).getRawValue());
                }
                arrayList2 = arrayList6;
            } else {
                arrayList2 = null;
            }
            java.util.List emptyList = arrayList2 == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList2;
            java.util.List<com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.Limit> limits = option.getLimits();
            if (limits != null) {
                java.util.List<com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.Limit> list2 = limits;
                i = 10;
                java.util.ArrayList arrayList7 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.Limit limit : list2) {
                    com.paypal.oslo.feature.savings.graphql.GetDepositOptionsQuery.OnMoney onMoney = limit.getAmount().getOnMoney();
                    java.lang.String rawValue8 = limit.getLimitType().getRawValue();
                    java.lang.String value3 = onMoney != null ? onMoney.getValue() : null;
                    if (value3 == null) {
                        value3 = "";
                    }
                    java.lang.String obj3 = (onMoney == null || (currencyCode = onMoney.getCurrencyCode()) == null) ? null : currencyCode.toString();
                    if (obj3 == null) {
                        obj3 = "";
                    }
                    arrayList7.add(new com.paypal.oslo.feature.savings.domain.model.DepositLimit(rawValue8, value3, obj3));
                }
                arrayList = arrayList7;
            } else {
                i = 10;
            }
            arrayList3.add(new com.paypal.oslo.feature.savings.domain.model.DepositOption(id, isDefault, arrayList5, rawValue7, emptyList, arrayList == null ? kotlin.collections.CollectionsKt.emptyList() : arrayList));
            i2 = i;
            it3 = it5;
        }
        return new com.paypal.oslo.feature.savings.domain.model.DepositOptionsData(arrayList3);
    }
}
