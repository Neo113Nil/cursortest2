package com.paypal.oslo.feature.businessinventory.ui.edititem;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FormData;", "", "", "name", "Lcom/paypal/oslo/core/money/Money;", "price", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.DESCRIPTION, "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "taxOption", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/core/money/Money;Ljava/lang/String;Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/core/money/Money;", "component3", "component4", "()Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/core/money/Money;Ljava/lang/String;Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;)Lcom/paypal/oslo/feature/businessinventory/ui/edititem/FormData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getName", "Lcom/paypal/oslo/core/money/Money;", "getPrice", "getDescription", "Lcom/paypal/oslo/feature/businessinventory/api/domain/model/TaxOption;", "getTaxOption"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FormData {
    public static final int $stable = 8;
    private final java.lang.String description;
    private final java.lang.String name;
    private final com.paypal.oslo.core.money.Money price;
    private final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption;

    public FormData(java.lang.String str, com.paypal.oslo.core.money.Money money, java.lang.String str2, com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.name = str;
        this.price = money;
        this.description = str2;
        this.taxOption = taxOption;
    }

    public final java.lang.String getName() {
        return this.name;
    }

    public final com.paypal.oslo.core.money.Money getPrice() {
        return this.price;
    }

    public final java.lang.String getDescription() {
        return this.description;
    }

    public final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption getTaxOption() {
        return this.taxOption;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.name;
        com.paypal.oslo.core.money.Money money = this.price;
        java.lang.String str2 = this.description;
        com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption = this.taxOption;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FormData(name=");
        sb.append(str);
        sb.append(", price=");
        sb.append(money);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", taxOption=");
        sb.append(taxOption);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.name.hashCode();
        int hashCode2 = this.price.hashCode();
        int hashCode3 = this.description.hashCode();
        com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption = this.taxOption;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (taxOption == null ? 0 : taxOption.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businessinventory.ui.edititem.FormData)) {
            return false;
        }
        com.paypal.oslo.feature.businessinventory.ui.edititem.FormData formData = (com.paypal.oslo.feature.businessinventory.ui.edititem.FormData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, formData.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.price, formData.price) && kotlin.jvm.internal.Intrinsics.areEqual(this.description, formData.description) && kotlin.jvm.internal.Intrinsics.areEqual(this.taxOption, formData.taxOption);
    }

    public final com.paypal.oslo.feature.businessinventory.ui.edititem.FormData copy(java.lang.String name2, com.paypal.oslo.core.money.Money price, java.lang.String description, com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(name2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(price, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(description, "");
        return new com.paypal.oslo.feature.businessinventory.ui.edititem.FormData(name2, price, description, taxOption);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption getTaxOption() {
        return this.taxOption;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getDescription() {
        return this.description;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.money.Money getPrice() {
        return this.price;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businessinventory.ui.edititem.FormData copy$default(com.paypal.oslo.feature.businessinventory.ui.edititem.FormData formData, java.lang.String str, com.paypal.oslo.core.money.Money money, java.lang.String str2, com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = formData.name;
        }
        if ((i & 2) != 0) {
            money = formData.price;
        }
        if ((i & 4) != 0) {
            str2 = formData.description;
        }
        if ((i & 8) != 0) {
            taxOption = formData.taxOption;
        }
        return formData.copy(str, money, str2, taxOption);
    }
}
