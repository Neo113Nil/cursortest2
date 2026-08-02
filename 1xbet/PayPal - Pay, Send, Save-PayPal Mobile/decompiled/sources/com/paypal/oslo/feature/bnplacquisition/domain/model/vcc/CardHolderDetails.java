package com.paypal.oslo.feature.bnplacquisition.domain.model.vcc;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/domain/model/vcc/CardHolderDetails;", "", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/UserName;", "name", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;", "billingAddress", "", "phoneNumber", "<init>", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/UserName;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;Ljava/lang/String;)V", "component1", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/UserName;", "component2", "()Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;", "component3", "()Ljava/lang/String;", "copy", "(Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/UserName;Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;Ljava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/domain/model/vcc/CardHolderDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/createcreditapplication/UserName;", "getName", "Lcom/paypal/oslo/feature/bnplacquisition/domain/model/address/Address;", "getBillingAddress", "Ljava/lang/String;", "getPhoneNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CardHolderDetails {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address billingAddress;
    private final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName name;
    private final java.lang.String phoneNumber;

    public CardHolderDetails(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName userName, com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address, java.lang.String str) {
        this.name = userName;
        this.billingAddress = address;
        this.phoneNumber = str;
    }

    public /* synthetic */ CardHolderDetails(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName userName, com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address, java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : userName, (i & 2) != 0 ? null : address, (i & 4) != 0 ? null : str);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName getName() {
        return this.name;
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address getBillingAddress() {
        return this.billingAddress;
    }

    public final java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName userName = this.name;
        com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address = this.billingAddress;
        java.lang.String str = this.phoneNumber;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CardHolderDetails(name=");
        sb.append(userName);
        sb.append(", billingAddress=");
        sb.append(address);
        sb.append(", phoneNumber=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName userName = this.name;
        int hashCode = userName == null ? 0 : userName.hashCode();
        com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address = this.billingAddress;
        int hashCode2 = address == null ? 0 : address.hashCode();
        java.lang.String str = this.phoneNumber;
        return (((hashCode * 31) + hashCode2) * 31) + (str != null ? str.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.CardHolderDetails)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.CardHolderDetails cardHolderDetails = (com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.CardHolderDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.name, cardHolderDetails.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.billingAddress, cardHolderDetails.billingAddress) && kotlin.jvm.internal.Intrinsics.areEqual(this.phoneNumber, cardHolderDetails.phoneNumber);
    }

    public final com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.CardHolderDetails copy(com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName name2, com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address billingAddress, java.lang.String phoneNumber) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.CardHolderDetails(name2, billingAddress, phoneNumber);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPhoneNumber() {
        return this.phoneNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address getBillingAddress() {
        return this.billingAddress;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName getName() {
        return this.name;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.CardHolderDetails copy$default(com.paypal.oslo.feature.bnplacquisition.domain.model.vcc.CardHolderDetails cardHolderDetails, com.paypal.oslo.feature.bnplacquisition.domain.model.createcreditapplication.UserName userName, com.paypal.oslo.feature.bnplacquisition.domain.model.address.Address address, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            userName = cardHolderDetails.name;
        }
        if ((i & 2) != 0) {
            address = cardHolderDetails.billingAddress;
        }
        if ((i & 4) != 0) {
            str = cardHolderDetails.phoneNumber;
        }
        return cardHolderDetails.copy(userName, address, str);
    }

    public CardHolderDetails() {
        this(null, null, null, 7, null);
    }
}
