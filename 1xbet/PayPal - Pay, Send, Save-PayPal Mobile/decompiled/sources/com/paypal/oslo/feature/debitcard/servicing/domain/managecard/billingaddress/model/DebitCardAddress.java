package com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJF\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001f\u0010\u000eR\u0011\u0010!\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b \u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/debitcard/servicing/domain/managecard/billingaddress/model/DebitCardAddress;", "", "", "id", "addressLine1", "", "displayAddress", "normalizationInvalidFields", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Lcom/paypal/oslo/feature/debitcard/servicing/domain/managecard/billingaddress/model/DebitCardAddress;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "getAddressLine1", "Ljava/util/List;", "getDisplayAddress", "getNormalizationInvalidFields", "getAddress", "address"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class DebitCardAddress {
    public static final int $stable = 0;
    private final java.lang.String addressLine1;
    private final java.util.List<java.lang.String> displayAddress;
    private final java.lang.String id;
    private final java.util.List<java.lang.String> normalizationInvalidFields;

    public DebitCardAddress(java.lang.String str, java.lang.String str2, java.util.List<java.lang.String> list, java.util.List<java.lang.String> list2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        this.id = str;
        this.addressLine1 = str2;
        this.displayAddress = list;
        this.normalizationInvalidFields = list2;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.String getAddressLine1() {
        return this.addressLine1;
    }

    public /* synthetic */ DebitCardAddress(java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2);
    }

    public final java.util.List<java.lang.String> getDisplayAddress() {
        return this.displayAddress;
    }

    public final java.util.List<java.lang.String> getNormalizationInvalidFields() {
        return this.normalizationInvalidFields;
    }

    public final java.lang.String getAddress() {
        return kotlin.collections.CollectionsKt.joinToString$default(this.displayAddress, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, null, 62, null);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.String str2 = this.addressLine1;
        java.util.List<java.lang.String> list = this.displayAddress;
        java.util.List<java.lang.String> list2 = this.normalizationInvalidFields;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DebitCardAddress(id=");
        sb.append(str);
        sb.append(", addressLine1=");
        sb.append(str2);
        sb.append(", displayAddress=");
        sb.append(list);
        sb.append(", normalizationInvalidFields=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        java.lang.String str = this.addressLine1;
        return (((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.displayAddress.hashCode()) * 31) + this.normalizationInvalidFields.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress)) {
            return false;
        }
        com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress debitCardAddress = (com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, debitCardAddress.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.addressLine1, debitCardAddress.addressLine1) && kotlin.jvm.internal.Intrinsics.areEqual(this.displayAddress, debitCardAddress.displayAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.normalizationInvalidFields, debitCardAddress.normalizationInvalidFields);
    }

    public final com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress copy(java.lang.String id, java.lang.String addressLine1, java.util.List<java.lang.String> displayAddress, java.util.List<java.lang.String> normalizationInvalidFields) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayAddress, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(normalizationInvalidFields, "");
        return new com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress(id, addressLine1, displayAddress, normalizationInvalidFields);
    }

    public final java.util.List<java.lang.String> component4() {
        return this.normalizationInvalidFields;
    }

    public final java.util.List<java.lang.String> component3() {
        return this.displayAddress;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAddressLine1() {
        return this.addressLine1;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress copy$default(com.paypal.oslo.feature.debitcard.servicing.domain.managecard.billingaddress.model.DebitCardAddress debitCardAddress, java.lang.String str, java.lang.String str2, java.util.List list, java.util.List list2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = debitCardAddress.id;
        }
        if ((i & 2) != 0) {
            str2 = debitCardAddress.addressLine1;
        }
        if ((i & 4) != 0) {
            list = debitCardAddress.displayAddress;
        }
        if ((i & 8) != 0) {
            list2 = debitCardAddress.normalizationInvalidFields;
        }
        return debitCardAddress.copy(str, str2, list, list2);
    }
}
