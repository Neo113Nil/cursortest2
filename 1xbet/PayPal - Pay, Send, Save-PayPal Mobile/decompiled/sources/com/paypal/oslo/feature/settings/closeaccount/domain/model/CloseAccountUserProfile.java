package com.paypal.oslo.feature.settings.closeaccount.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ2\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0019\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountUserProfile;", "", "", "accountType", "userEmail", "userCountry", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/settings/closeaccount/domain/model/CloseAccountUserProfile;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAccountType", "getUserEmail", "getUserCountry"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class CloseAccountUserProfile {
    public static final int $stable = 0;
    private final java.lang.String accountType;
    private final java.lang.String userCountry;
    private final java.lang.String userEmail;

    public CloseAccountUserProfile(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.accountType = str;
        this.userEmail = str2;
        this.userCountry = str3;
    }

    public final java.lang.String getAccountType() {
        return this.accountType;
    }

    public final java.lang.String getUserEmail() {
        return this.userEmail;
    }

    public final java.lang.String getUserCountry() {
        return this.userCountry;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.accountType;
        java.lang.String str2 = this.userEmail;
        java.lang.String str3 = this.userCountry;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CloseAccountUserProfile(accountType=");
        sb.append(str);
        sb.append(", userEmail=");
        sb.append(str2);
        sb.append(", userCountry=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.accountType.hashCode();
        java.lang.String str = this.userEmail;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.userCountry;
        return (((hashCode * 31) + hashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserProfile)) {
            return false;
        }
        com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserProfile closeAccountUserProfile = (com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserProfile) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.accountType, closeAccountUserProfile.accountType) && kotlin.jvm.internal.Intrinsics.areEqual(this.userEmail, closeAccountUserProfile.userEmail) && kotlin.jvm.internal.Intrinsics.areEqual(this.userCountry, closeAccountUserProfile.userCountry);
    }

    public final com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserProfile copy(java.lang.String accountType, java.lang.String userEmail, java.lang.String userCountry) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(accountType, "");
        return new com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserProfile(accountType, userEmail, userCountry);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getUserCountry() {
        return this.userCountry;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getUserEmail() {
        return this.userEmail;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAccountType() {
        return this.accountType;
    }

    public static /* synthetic */ com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserProfile copy$default(com.paypal.oslo.feature.settings.closeaccount.domain.model.CloseAccountUserProfile closeAccountUserProfile, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = closeAccountUserProfile.accountType;
        }
        if ((i & 2) != 0) {
            str2 = closeAccountUserProfile.userEmail;
        }
        if ((i & 4) != 0) {
            str3 = closeAccountUserProfile.userCountry;
        }
        return closeAccountUserProfile.copy(str, str2, str3);
    }
}
