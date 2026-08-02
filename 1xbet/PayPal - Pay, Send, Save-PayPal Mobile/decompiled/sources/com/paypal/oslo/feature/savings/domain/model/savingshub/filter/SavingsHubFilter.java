package com.paypal.oslo.feature.savings.domain.model.savingshub.filter;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/savings/domain/model/savingshub/filter/SavingsHubFilter;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/EducationalZoneSection;", "section", "getFilteredEducationalZones", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/EducationalZoneSection;)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/EducationalZoneSection;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/GoalsZoneSection;", "goalsZone", "getFilteredGoalsZone", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/GoalsZoneSection;)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/GoalsZoneSection;", "Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoZoneSection;", com.datadog.trace.bootstrap.instrumentation.api.Tags.COMPONENT, "getFilteredPromoZones", "(Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoZoneSection;)Lcom/paypal/oslo/feature/savings/domain/model/savingshub/parser/PromoZoneSection;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class SavingsHubFilter {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.savings.domain.model.savingshub.filter.SavingsHubFilter INSTANCE = new com.paypal.oslo.feature.savings.domain.model.savingshub.filter.SavingsHubFilter();

    private SavingsHubFilter() {
    }

    public final com.paypal.oslo.feature.savings.domain.model.savingshub.parser.EducationalZoneSection getFilteredEducationalZones(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.EducationalZoneSection section) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(section, "");
        if (section.getItems() == null) {
            return section;
        }
        java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.EducationalItem> items = section.getItems();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : items) {
            java.lang.String type = ((com.paypal.oslo.feature.savings.domain.model.savingshub.parser.EducationalItem) obj).getType();
            if (type != null && type.length() != 0) {
                arrayList.add(obj);
            }
        }
        return com.paypal.oslo.feature.savings.domain.model.savingshub.parser.EducationalZoneSection.copy$default(section, null, null, arrayList, 3, null);
    }

    public final com.paypal.oslo.feature.savings.domain.model.savingshub.parser.GoalsZoneSection getFilteredGoalsZone(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.GoalsZoneSection goalsZone) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(goalsZone, "");
        if (goalsZone.getGoals() == null) {
            return goalsZone;
        }
        java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.Goal> goals = goalsZone.getGoals();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : goals) {
            if (!com.paypal.oslo.feature.savings.domain.model.savingshub.validator.SavingsHubValidator.INSTANCE.isGoalInvalid((com.paypal.oslo.feature.savings.domain.model.savingshub.parser.Goal) obj)) {
                arrayList.add(obj);
            }
        }
        return com.paypal.oslo.feature.savings.domain.model.savingshub.parser.GoalsZoneSection.copy$default(goalsZone, null, null, arrayList, 3, null);
    }

    public final com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoZoneSection getFilteredPromoZones(com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoZoneSection component) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(component, "");
        if (component.getTiles() == null) {
            return component;
        }
        java.util.List<com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile> tiles = component.getTiles();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : tiles) {
            java.lang.String type = ((com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoTile) obj).getType();
            if (type != null && type.length() != 0) {
                arrayList.add(obj);
            }
        }
        return com.paypal.oslo.feature.savings.domain.model.savingshub.parser.PromoZoneSection.copy$default(component, null, null, arrayList, 3, null);
    }
}
