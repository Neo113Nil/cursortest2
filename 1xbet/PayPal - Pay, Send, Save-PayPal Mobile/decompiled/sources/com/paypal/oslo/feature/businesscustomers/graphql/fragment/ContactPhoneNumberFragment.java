package com.paypal.oslo.feature.businesscustomers.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactPhoneNumberFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "countryCode", com.microblink.blinkid.entities.recognizers.blinkid.jordan.JordanCombinedRecognizer.VerificationConstants.NationalNumber, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesscustomers/graphql/fragment/ContactPhoneNumberFragment;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getCountryCode", "getNationalNumber"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ContactPhoneNumberFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 0;
    private final java.lang.String countryCode;
    private final java.lang.String nationalNumber;

    public ContactPhoneNumberFragment(java.lang.String str, java.lang.String str2) {
        this.countryCode = str;
        this.nationalNumber = str2;
    }

    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public final java.lang.String getNationalNumber() {
        return this.nationalNumber;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.countryCode;
        java.lang.String str2 = this.nationalNumber;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ContactPhoneNumberFragment(countryCode=");
        sb.append(str);
        sb.append(", nationalNumber=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.countryCode;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.nationalNumber;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactPhoneNumberFragment)) {
            return false;
        }
        com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactPhoneNumberFragment contactPhoneNumberFragment = (com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactPhoneNumberFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.countryCode, contactPhoneNumberFragment.countryCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.nationalNumber, contactPhoneNumberFragment.nationalNumber);
    }

    public final com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactPhoneNumberFragment copy(java.lang.String countryCode, java.lang.String nationalNumber) {
        return new com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactPhoneNumberFragment(countryCode, nationalNumber);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getNationalNumber() {
        return this.nationalNumber;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getCountryCode() {
        return this.countryCode;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactPhoneNumberFragment copy$default(com.paypal.oslo.feature.businesscustomers.graphql.fragment.ContactPhoneNumberFragment contactPhoneNumberFragment, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = contactPhoneNumberFragment.countryCode;
        }
        if ((i & 2) != 0) {
            str2 = contactPhoneNumberFragment.nationalNumber;
        }
        return contactPhoneNumberFragment.copy(str, str2);
    }
}
