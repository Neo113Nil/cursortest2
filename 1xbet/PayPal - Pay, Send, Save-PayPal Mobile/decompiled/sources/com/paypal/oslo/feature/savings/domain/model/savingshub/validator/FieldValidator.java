package com.paypal.oslo.feature.savings.domain.model.savingshub.validator;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/validator/FieldValidator;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/BalanceData;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "hasAllRequiredBalanceDataFields", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/BalanceData;)Z", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/Goal;", "goal", "hasInvalidGoalFields", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/Goal;)Z", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/MoneyAmount;", "totalBalance", "isTotalBalanceValid", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/MoneyAmount;)Z", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/BalanceFeatures;", "features", "isFeaturesValid", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/BalanceFeatures;)Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class FieldValidator {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.validator.FieldValidator INSTANCE = new com.paypal.oslo.feature.savings.domain.model.savingshub.validator.FieldValidator();

    private FieldValidator() {
    }

    public final boolean hasAllRequiredBalanceDataFields(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.BalanceData data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return (data.getTotalBalance() == null || data.getFeatures() == null || data.getApyBps() == null || data.getCurrencyCode() == null) ? false : true;
    }

    public final boolean hasInvalidGoalFields(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.Goal goal) {
        java.lang.String title;
        java.lang.String iconName;
        java.lang.String amount;
        java.lang.String autoSave;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
        java.lang.String id = goal.getId();
        return id == null || id.length() == 0 || (title = goal.getTitle()) == null || title.length() == 0 || (iconName = goal.getIconName()) == null || iconName.length() == 0 || (amount = goal.getAmount()) == null || amount.length() == 0 || (autoSave = goal.getAutoSave()) == null || autoSave.length() == 0;
    }

    public final boolean isTotalBalanceValid(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.MoneyAmount totalBalance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalBalance, "");
        java.lang.String amountUnit = totalBalance.getAmountUnit();
        return (amountUnit == null || amountUnit.length() == 0 || totalBalance.getAmount() == null) ? false : true;
    }

    public final boolean isFeaturesValid(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.BalanceFeatures features) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(features, "");
        return (features.getAutoSave() == null || features.getSmartRoute() == null) ? false : true;
    }
}
