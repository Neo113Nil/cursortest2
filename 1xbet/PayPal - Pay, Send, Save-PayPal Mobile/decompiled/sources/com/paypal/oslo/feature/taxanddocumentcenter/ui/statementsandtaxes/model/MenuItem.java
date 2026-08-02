package com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/model/MenuItem;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/model/MenuCardType;", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, "", "titleResId", "descriptionResId", "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/model/MenuCardType;II)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/model/MenuCardType;", "component2", "()I", "component3", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/model/MenuCardType;II)Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/model/MenuItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/ui/statementsandtaxes/model/MenuCardType;", "getCardType", com.visa.cbp.getEncExpo.warmup, "getTitleResId", "getDescriptionResId"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MenuItem {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType cardType;
    private final int descriptionResId;
    private final int titleResId;

    public MenuItem(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType menuCardType, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuCardType, "");
        this.cardType = menuCardType;
        this.titleResId = i;
        this.descriptionResId = i2;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType getCardType() {
        return this.cardType;
    }

    public final int getTitleResId() {
        return this.titleResId;
    }

    public final int getDescriptionResId() {
        return this.descriptionResId;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType menuCardType = this.cardType;
        int i = this.titleResId;
        int i2 = this.descriptionResId;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MenuItem(cardType=");
        sb.append(menuCardType);
        sb.append(", titleResId=");
        sb.append(i);
        sb.append(", descriptionResId=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.cardType.hashCode() * 31) + java.lang.Integer.hashCode(this.titleResId)) * 31) + java.lang.Integer.hashCode(this.descriptionResId);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuItem)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuItem menuItem = (com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuItem) other;
        return this.cardType == menuItem.cardType && this.titleResId == menuItem.titleResId && this.descriptionResId == menuItem.descriptionResId;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuItem copy(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType cardType, int titleResId, int descriptionResId) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardType, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuItem(cardType, titleResId, descriptionResId);
    }

    /* renamed from: component3, reason: from getter */
    public final int getDescriptionResId() {
        return this.descriptionResId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTitleResId() {
        return this.titleResId;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType getCardType() {
        return this.cardType;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuItem copy$default(com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuItem menuItem, com.paypal.oslo.feature.taxanddocumentcenter.ui.statementsandtaxes.model.MenuCardType menuCardType, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            menuCardType = menuItem.cardType;
        }
        if ((i3 & 2) != 0) {
            i = menuItem.titleResId;
        }
        if ((i3 & 4) != 0) {
            i2 = menuItem.descriptionResId;
        }
        return menuItem.copy(menuCardType, i, i2);
    }
}
