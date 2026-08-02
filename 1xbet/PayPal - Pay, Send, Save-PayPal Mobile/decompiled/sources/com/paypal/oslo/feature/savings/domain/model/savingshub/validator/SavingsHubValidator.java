package com.paypal.oslo.feature.savings.domain.model.savingshub.validator;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001b"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/validator/SavingsHubValidator;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/BalanceCardSection;", "card", "", "isBalanceCardValid", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/BalanceCardSection;)Z", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoZoneSection;", "isPromoZoneValid", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoZoneSection;)Z", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/GoalsZoneSection;", "goalsZone", "isGoalsZoneValid", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/GoalsZoneSection;)Z", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/EducationalZoneSection;", "educationalZone", "isEducationalZoneValid", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/EducationalZoneSection;)Z", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/DocumentZoneSection;", "documentZoneSection", "isDocumentZoneValid", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/DocumentZoneSection;)Z", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/Goal;", "goal", "isGoalValid", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/Goal;)Z", "isGoalInvalid"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsHubValidator {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.validator.SavingsHubValidator INSTANCE = new com.paypal.oslo.feature.savings.domain.model.savingshub.validator.SavingsHubValidator();

    private SavingsHubValidator() {
    }

    public final boolean isPromoZoneValid(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoZoneSection card) {
        java.lang.String type;
        java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile> tiles;
        return (card == null || card.getRank() == null || (type = card.getType()) == null || type.length() == 0 || (tiles = card.getTiles()) == null || tiles.isEmpty()) ? false : true;
    }

    public final boolean isGoalsZoneValid(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.GoalsZoneSection goalsZone) {
        java.lang.String type;
        java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.Goal> goals;
        return (goalsZone == null || goalsZone.getRank() == null || (type = goalsZone.getType()) == null || type.length() == 0 || (goals = goalsZone.getGoals()) == null || goals.isEmpty()) ? false : true;
    }

    public final boolean isEducationalZoneValid(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.EducationalZoneSection educationalZone) {
        java.lang.String type;
        java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.EducationalItem> items;
        return (educationalZone == null || (type = educationalZone.getType()) == null || type.length() == 0 || (items = educationalZone.getItems()) == null || items.isEmpty() || educationalZone.getRank() == null) ? false : true;
    }

    public final boolean isDocumentZoneValid(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.DocumentZoneSection documentZoneSection) {
        java.lang.String type;
        return (documentZoneSection == null || (type = documentZoneSection.getType()) == null || type.length() == 0 || documentZoneSection.getRank() == null) ? false : true;
    }

    public final boolean isGoalValid(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.Goal goal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
        return !isGoalInvalid(goal);
    }

    public final boolean isGoalInvalid(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.Goal goal) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goal, "");
        return com.paypal.oslo.feature.savings.domain.model.savingshub.validator.FieldValidator.INSTANCE.hasInvalidGoalFields(goal);
    }

    public final boolean isBalanceCardValid(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.BalanceCardSection card) {
        java.lang.String type;
        if (card == null || card.getRank() == null || (type = card.getType()) == null || type.length() == 0 || card.getData() == null) {
            return false;
        }
        com.paypal.oslo.feature.savings.domain.model.savingshub.parser.BalanceData data = card.getData();
        boolean hasAllRequiredBalanceDataFields = com.paypal.oslo.feature.savings.domain.model.savingshub.validator.FieldValidator.INSTANCE.hasAllRequiredBalanceDataFields(data);
        com.paypal.oslo.feature.savings.domain.model.savingshub.parser.MoneyAmount totalBalance = data.getTotalBalance();
        com.paypal.oslo.feature.savings.domain.model.savingshub.parser.BalanceFeatures features = data.getFeatures();
        if (totalBalance == null || features == null) {
            return false;
        }
        return hasAllRequiredBalanceDataFields && com.paypal.oslo.feature.savings.domain.model.savingshub.validator.FieldValidator.INSTANCE.isTotalBalanceValid(totalBalance) && com.paypal.oslo.feature.savings.domain.model.savingshub.validator.FieldValidator.INSTANCE.isFeaturesValid(features);
    }
}
