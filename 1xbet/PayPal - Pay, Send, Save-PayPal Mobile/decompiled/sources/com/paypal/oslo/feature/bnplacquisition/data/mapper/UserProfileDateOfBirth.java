package com.paypal.oslo.feature.bnplacquisition.data.mapper;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0001HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0003\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/data/mapper/UserProfileDateOfBirth;", "", "", "isRequired", "birthDate", "<init>", "(ZLjava/lang/Object;)V", "component1", "()Z", "component2", "()Ljava/lang/Object;", "copy", "(ZLjava/lang/Object;)Lcom/paypal/oslo/feature/bnplacquisition/data/mapper/UserProfileDateOfBirth;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Ljava/lang/Object;", "getBirthDate"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UserProfileDateOfBirth {
    public static final int $stable = 8;
    private final java.lang.Object birthDate;
    private final boolean isRequired;

    public UserProfileDateOfBirth(boolean z, java.lang.Object obj) {
        this.isRequired = z;
        this.birthDate = obj;
    }

    public final java.lang.Object getBirthDate() {
        return this.birthDate;
    }

    public final boolean isRequired() {
        return this.isRequired;
    }

    public final java.lang.String toString() {
        boolean z = this.isRequired;
        java.lang.Object obj = this.birthDate;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserProfileDateOfBirth(isRequired=");
        sb.append(z);
        sb.append(", birthDate=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isRequired);
        java.lang.Object obj = this.birthDate;
        return (hashCode * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileDateOfBirth)) {
            return false;
        }
        com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileDateOfBirth userProfileDateOfBirth = (com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileDateOfBirth) other;
        return this.isRequired == userProfileDateOfBirth.isRequired && kotlin.jvm.internal.Intrinsics.areEqual(this.birthDate, userProfileDateOfBirth.birthDate);
    }

    public final com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileDateOfBirth copy(boolean isRequired, java.lang.Object birthDate) {
        return new com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileDateOfBirth(isRequired, birthDate);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getBirthDate() {
        return this.birthDate;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsRequired() {
        return this.isRequired;
    }

    public static /* synthetic */ com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileDateOfBirth copy$default(com.paypal.oslo.feature.bnplacquisition.data.mapper.UserProfileDateOfBirth userProfileDateOfBirth, boolean z, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            z = userProfileDateOfBirth.isRequired;
        }
        if ((i & 2) != 0) {
            obj = userProfileDateOfBirth.birthDate;
        }
        return userProfileDateOfBirth.copy(z, obj);
    }
}
