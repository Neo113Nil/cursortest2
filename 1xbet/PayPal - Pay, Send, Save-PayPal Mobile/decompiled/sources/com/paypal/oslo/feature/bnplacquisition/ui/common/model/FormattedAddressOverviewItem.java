package com.paypal.oslo.feature.bnplacquisition.ui.common.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FormattedAddressOverviewItem;", "", "", "line1", "line2", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "address", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/Address;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/paypal/oslo/core/i18n/domain/model/Address;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/core/i18n/domain/model/Address;)Lcom/paypal/oslo/feature/bnplacquisition/ui/common/model/FormattedAddressOverviewItem;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getLine1", "getLine2", "Lcom/paypal/oslo/core/i18n/domain/model/Address;", "getAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class FormattedAddressOverviewItem {
    public static final int $stable = 8;
    private final com.paypal.oslo.core.i18n.domain.model.Address address;
    private final java.lang.String line1;
    private final java.lang.String line2;

    public FormattedAddressOverviewItem(java.lang.String str, java.lang.String str2, com.paypal.oslo.core.i18n.domain.model.Address address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        this.line1 = str;
        this.line2 = str2;
        this.address = address;
    }

    public final java.lang.String getLine1() {
        return this.line1;
    }

    public final java.lang.String getLine2() {
        return this.line2;
    }

    public final com.paypal.oslo.core.i18n.domain.model.Address getAddress() {
        return this.address;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.line1;
        java.lang.String str2 = this.line2;
        com.paypal.oslo.core.i18n.domain.model.Address address = this.address;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("FormattedAddressOverviewItem(line1=");
        sb.append(str);
        sb.append(", line2=");
        sb.append(str2);
        sb.append(", address=");
        sb.append(address);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.line1.hashCode() * 31) + this.line2.hashCode()) * 31) + this.address.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.ui.common.model.FormattedAddressOverviewItem)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.ui.common.model.FormattedAddressOverviewItem formattedAddressOverviewItem = (com.paypal.oslo.feature.bnplacquisition.ui.common.model.FormattedAddressOverviewItem) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.line1, formattedAddressOverviewItem.line1) && kotlin.jvm.internal.Intrinsics.areEqual(this.line2, formattedAddressOverviewItem.line2) && kotlin.jvm.internal.Intrinsics.areEqual(this.address, formattedAddressOverviewItem.address);
    }

    public final com.paypal.oslo.feature.bnplacquisition.ui.common.model.FormattedAddressOverviewItem copy(java.lang.String line1, java.lang.String line2, com.paypal.oslo.core.i18n.domain.model.Address address) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(line1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(line2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(address, "");
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.model.FormattedAddressOverviewItem(line1, line2, address);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.core.i18n.domain.model.Address getAddress() {
        return this.address;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getLine2() {
        return this.line2;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getLine1() {
        return this.line1;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.ui.common.model.FormattedAddressOverviewItem copy$default(com.paypal.oslo.feature.bnplacquisition.ui.common.model.FormattedAddressOverviewItem formattedAddressOverviewItem, java.lang.String str, java.lang.String str2, com.paypal.oslo.core.i18n.domain.model.Address address, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = formattedAddressOverviewItem.line1;
        }
        if ((i & 2) != 0) {
            str2 = formattedAddressOverviewItem.line2;
        }
        if ((i & 4) != 0) {
            address = formattedAddressOverviewItem.address;
        }
        return formattedAddressOverviewItem.copy(str, str2, address);
    }
}
