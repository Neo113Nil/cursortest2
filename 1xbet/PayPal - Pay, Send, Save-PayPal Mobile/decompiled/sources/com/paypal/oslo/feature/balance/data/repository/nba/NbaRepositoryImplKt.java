package com.paypal.oslo.feature.balance.data.repository.nba;

@kotlin.Metadata(d1 = {"\u0000\u0000"}, d2 = {}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class NbaRepositoryImplKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final /* synthetic */ com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation access$toNbaRecommendation(com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.MoneyManagementNextBestAction moneyManagementNextBestAction) {
        com.paypal.oslo.feature.balance.api.models.nba.NbaIcon nbaIcon;
        java.lang.String trackingId = moneyManagementNextBestAction.getTrackingId();
        java.lang.String title = moneyManagementNextBestAction.getTitle();
        java.lang.String description = moneyManagementNextBestAction.getDescription();
        com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.Icon icon = moneyManagementNextBestAction.getIcon();
        if (icon != null) {
            java.lang.Object url = icon.getUrl();
            java.lang.String str = url instanceof java.lang.String ? (java.lang.String) url : null;
            if (str != null) {
                nbaIcon = new com.paypal.oslo.feature.balance.api.models.nba.NbaIcon(str, icon.getAlt());
                com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.OnMoneyManagementDestinationNextBestAction onMoneyManagementDestinationNextBestAction = moneyManagementNextBestAction.getOnMoneyManagementDestinationNextBestAction();
                java.lang.String destinationId = onMoneyManagementDestinationNextBestAction == null ? onMoneyManagementDestinationNextBestAction.getDestinationId() : null;
                com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.OnMoneyManagementURLNextBestAction onMoneyManagementURLNextBestAction = moneyManagementNextBestAction.getOnMoneyManagementURLNextBestAction();
                java.lang.Object url2 = onMoneyManagementURLNextBestAction == null ? onMoneyManagementURLNextBestAction.getUrl() : null;
                java.lang.String str2 = !(url2 instanceof java.lang.String) ? (java.lang.String) url2 : null;
                com.paypal.oslo.api.graphql.schema.type.MoneyManagementNextBestActionNavigationType navigationType = moneyManagementNextBestAction.getNavigationType();
                return new com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation(trackingId, title, description, nbaIcon, destinationId, str2, navigationType == null ? navigationType.getRawValue() : null, java.lang.Boolean.valueOf(moneyManagementNextBestAction.isAuthenticationRequired()));
            }
        }
        nbaIcon = null;
        com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.OnMoneyManagementDestinationNextBestAction onMoneyManagementDestinationNextBestAction2 = moneyManagementNextBestAction.getOnMoneyManagementDestinationNextBestAction();
        if (onMoneyManagementDestinationNextBestAction2 == null) {
        }
        com.paypal.oslo.feature.balance.graphql.GetBalanceNextBestActionsQuery.OnMoneyManagementURLNextBestAction onMoneyManagementURLNextBestAction2 = moneyManagementNextBestAction.getOnMoneyManagementURLNextBestAction();
        if (onMoneyManagementURLNextBestAction2 == null) {
        }
        if (!(url2 instanceof java.lang.String)) {
        }
        com.paypal.oslo.api.graphql.schema.type.MoneyManagementNextBestActionNavigationType navigationType2 = moneyManagementNextBestAction.getNavigationType();
        return new com.paypal.oslo.feature.balance.domain.model.nba.NbaRecommendation(trackingId, title, description, nbaIcon, destinationId, str2, navigationType2 == null ? navigationType2.getRawValue() : null, java.lang.Boolean.valueOf(moneyManagementNextBestAction.isAuthenticationRequired()));
    }
}
