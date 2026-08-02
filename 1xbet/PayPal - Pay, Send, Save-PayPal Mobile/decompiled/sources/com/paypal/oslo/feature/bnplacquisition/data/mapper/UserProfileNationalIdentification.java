package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0003\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/data/mapper/UserProfileNationalIdentification;", "", "", "isRequired", "", "valueShortMasked", "<init>", "(ZLjava/lang/String;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "copy", "(ZLjava/lang/String;)Lcom/paypal/oslo/feature/bnplacquisition/data/mapper/UserProfileNationalIdentification;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Z", "Ljava/lang/String;", "getValueShortMasked"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UserProfileNationalIdentification {
    public static final int $stable = 0;
    private final boolean isRequired;
    private final java.lang.String valueShortMasked;

    public UserProfileNationalIdentification(boolean z, java.lang.String str) {
        this.isRequired = z;
        this.valueShortMasked = str;
    }

    public final java.lang.String getValueShortMasked() {
        return this.valueShortMasked;
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public final java.lang.String toString() {
        boolean z = this.isRequired;
        java.lang.String str = this.valueShortMasked;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserProfileNationalIdentification(isRequired=");
        sb.append(z);
        sb.append(", valueShortMasked=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isRequired);
        java.lang.String str = this.valueShortMasked;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileNationalIdentification)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileNationalIdentification userProfileNationalIdentification = (com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileNationalIdentification) other;
        return this.isRequired == userProfileNationalIdentification.isRequired && kotlin.jvm.internal.Intrinsics.areEqual(this.valueShortMasked, userProfileNationalIdentification.valueShortMasked);
    }

    public final com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileNationalIdentification copy(boolean isRequired, java.lang.String valueShortMasked) {
        return new com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileNationalIdentification(isRequired, valueShortMasked);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getValueShortMasked() {
        return this.valueShortMasked;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileNationalIdentification copy$default(com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileNationalIdentification userProfileNationalIdentification, boolean z, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = userProfileNationalIdentification.isRequired;
        }
        if ((i & 2) != 0) {
            str = userProfileNationalIdentification.valueShortMasked;
        }
        return userProfileNationalIdentification.copy(z, str);
    }
}
