package com.paypal.oslo.feature.publicprofile.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/publicprofile/graphql/fragment/AddressPortableFields;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "adminArea2", "adminArea1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/publicprofile/graphql/fragment/AddressPortableFields;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAdminArea2", "getAdminArea1"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class AddressPortableFields implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 0;
    private final java.lang.String adminArea1;
    private final java.lang.String adminArea2;

    public AddressPortableFields(java.lang.String str, java.lang.String str2) {
        this.adminArea2 = str;
        this.adminArea1 = str2;
    }

    public final java.lang.String getAdminArea2() {
        return this.adminArea2;
    }

    public final java.lang.String getAdminArea1() {
        return this.adminArea1;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.adminArea2;
        java.lang.String str2 = this.adminArea1;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AddressPortableFields(adminArea2=");
        sb.append(str);
        sb.append(", adminArea1=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        java.lang.String str = this.adminArea2;
        int hashCode = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.adminArea1;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields)) {
            return false;
        }
        com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields addressPortableFields = (com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea2, addressPortableFields.adminArea2) && kotlin.jvm.internal.Intrinsics.areEqual(this.adminArea1, addressPortableFields.adminArea1);
    }

    public final com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields copy(java.lang.String adminArea2, java.lang.String adminArea1) {
        return new com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields(adminArea2, adminArea1);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAdminArea1() {
        return this.adminArea1;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAdminArea2() {
        return this.adminArea2;
    }

    public static /* synthetic */ com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields copy$default(com.paypal.oslo.feature.publicprofile.graphql.fragment.AddressPortableFields addressPortableFields, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = addressPortableFields.adminArea2;
        }
        if ((i & 2) != 0) {
            str2 = addressPortableFields.adminArea1;
        }
        return addressPortableFields.copy(str, str2);
    }
}
