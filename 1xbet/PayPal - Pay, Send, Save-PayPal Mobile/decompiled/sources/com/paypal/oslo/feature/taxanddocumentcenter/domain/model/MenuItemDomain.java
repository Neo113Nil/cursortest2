package com.paypal.oslo.feature.taxanddocumentcenter.domain.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001e\u0010\f"}, d2 = {"Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/MenuItemDomain;", "", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/MenuCardTypeDomain;", com.zettle.sdk.commons.network.JsonKt.KEY_CARD_PAYMENT_INFO_CARD_TYPE, "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TextResource;", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "<init>", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/MenuCardTypeDomain;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TextResource;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TextResource;)V", "component1", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/MenuCardTypeDomain;", "component2", "()Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TextResource;", "component3", "copy", "(Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/MenuCardTypeDomain;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TextResource;Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TextResource;)Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/MenuItemDomain;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/MenuCardTypeDomain;", "getCardType", "Lcom/paypal/oslo/feature/taxanddocumentcenter/domain/model/TextResource;", "getTitle", "getDescription"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class MenuItemDomain {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain cardType;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource description;
    private final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource title;

    public MenuItemDomain(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain menuCardTypeDomain, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource textResource, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource textResource2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(menuCardTypeDomain, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textResource, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(textResource2, "");
        this.cardType = menuCardTypeDomain;
        this.title = textResource;
        this.description = textResource2;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain getCardType() {
        return this.cardType;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource getTitle() {
        return this.title;
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource getDescription() {
        return this.description;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain menuCardTypeDomain = this.cardType;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource textResource = this.title;
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource textResource2 = this.description;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MenuItemDomain(cardType=");
        sb.append(menuCardTypeDomain);
        sb.append(", title=");
        sb.append(textResource);
        sb.append(", description=");
        sb.append(textResource2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.cardType.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuItemDomain)) {
            return false;
        }
        com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuItemDomain menuItemDomain = (com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuItemDomain) other;
        return this.cardType == menuItemDomain.cardType && kotlin.jvm.internal.Intrinsics.areEqual(this.title, menuItemDomain.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, menuItemDomain.description);
    }

    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuItemDomain copy(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain cardType, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource title, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource description) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cardType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        return new com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuItemDomain(cardType, title, description);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain getCardType() {
        return this.cardType;
    }

    public static /* synthetic */ com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuItemDomain copy$default(com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuItemDomain menuItemDomain, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.MenuCardTypeDomain menuCardTypeDomain, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource textResource, com.paypal.oslo.feature.taxanddocumentcenter.domain.model.TextResource textResource2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            menuCardTypeDomain = menuItemDomain.cardType;
        }
        if ((i & 2) != 0) {
            textResource = menuItemDomain.title;
        }
        if ((i & 4) != 0) {
            textResource2 = menuItemDomain.description;
        }
        return menuItemDomain.copy(menuCardTypeDomain, textResource, textResource2);
    }
}
