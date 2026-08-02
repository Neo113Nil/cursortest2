package com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u001c\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/shoppingrewards/shopping/iab/ui/benefit/BenefitsUiDataItem;", "", "", "icon", "title", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/shoppingrewards/shopping/iab/ui/benefit/BenefitsUiDataItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIcon", "getTitle", "getDescription", "getLink"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class BenefitsUiDataItem {
    public static final int $stable = 0;
    private final java.lang.String description;
    private final java.lang.String icon;
    private final java.lang.String link;
    private final java.lang.String title;

    public BenefitsUiDataItem(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        this.icon = str;
        this.title = str2;
        this.description = str3;
        this.link = str4;
    }

    public final java.lang.String getIcon() {
        return this.icon;
    }

    public final java.lang.String getTitle() {
        return this.title;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final java.lang.String getLink() {
        return this.link;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.icon;
        java.lang.String str2 = this.title;
        java.lang.String str3 = this.description;
        java.lang.String str4 = this.link;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BenefitsUiDataItem(icon=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        sb.append(", link=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.icon.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.link.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsUiDataItem)) {
            return false;
        }
        com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsUiDataItem benefitsUiDataItem = (com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsUiDataItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.icon, benefitsUiDataItem.icon) && kotlin.jvm.internal.Intrinsics.areEqual(this.title, benefitsUiDataItem.title) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, benefitsUiDataItem.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.link, benefitsUiDataItem.link);
    }

    public final com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsUiDataItem copy(java.lang.String icon, java.lang.String title, java.lang.String description, java.lang.String link) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(icon, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(title, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(link, "");
        return new com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsUiDataItem(icon, title, description, link);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getLink() {
        return this.link;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getTitle() {
        return this.title;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getIcon() {
        return this.icon;
    }

    public static /* synthetic */ com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsUiDataItem copy$default(com.paypal.oslo.feature.shoppingrewards.shopping.iab.ui.benefit.BenefitsUiDataItem benefitsUiDataItem, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = benefitsUiDataItem.icon;
        }
        if ((i & 2) != 0) {
            str2 = benefitsUiDataItem.title;
        }
        if ((i & 4) != 0) {
            str3 = benefitsUiDataItem.description;
        }
        if ((i & 8) != 0) {
            str4 = benefitsUiDataItem.link;
        }
        return benefitsUiDataItem.copy(str, str2, str3, str4);
    }
}
