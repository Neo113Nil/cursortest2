package com.paypal.oslo.feature.xoom.domain.model;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001e\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/xoom/domain/model/UserInfo;", "", "", "id", "", "transactionsFound", "countryOfResidence", "status", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "component4", "copy", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/xoom/domain/model/UserInfo;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Z", "getTransactionsFound", "getCountryOfResidence", "getStatus"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class UserInfo {
    public static final int $stable = 0;
    private final java.lang.String countryOfResidence;
    private final java.lang.String id;
    private final java.lang.String status;
    private final boolean transactionsFound;

    public UserInfo(java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.id = str;
        this.transactionsFound = z;
        this.countryOfResidence = str2;
        this.status = str3;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final boolean getTransactionsFound() {
        return this.transactionsFound;
    }

    public final java.lang.String getCountryOfResidence() {
        return this.countryOfResidence;
    }

    public final java.lang.String getStatus() {
        return this.status;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        boolean z = this.transactionsFound;
        java.lang.String str2 = this.countryOfResidence;
        java.lang.String str3 = this.status;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserInfo(id=");
        sb.append(str);
        sb.append(", transactionsFound=");
        sb.append(z);
        sb.append(", countryOfResidence=");
        sb.append(str2);
        sb.append(", status=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.id.hashCode() * 31) + java.lang.Boolean.hashCode(this.transactionsFound)) * 31) + this.countryOfResidence.hashCode()) * 31) + this.status.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.xoom.domain.model.UserInfo)) {
            return false;
        }
        com.paypal.oslo.feature.xoom.domain.model.UserInfo userInfo = (com.paypal.oslo.feature.xoom.domain.model.UserInfo) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, userInfo.id) && this.transactionsFound == userInfo.transactionsFound && kotlin.jvm.internal.Intrinsics.areEqual(this.countryOfResidence, userInfo.countryOfResidence) && kotlin.jvm.internal.Intrinsics.areEqual(this.status, userInfo.status);
    }

    public final com.paypal.oslo.feature.xoom.domain.model.UserInfo copy(java.lang.String id, boolean transactionsFound, java.lang.String countryOfResidence, java.lang.String status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(countryOfResidence, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "");
        return new com.paypal.oslo.feature.xoom.domain.model.UserInfo(id, transactionsFound, countryOfResidence, status);
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getStatus() {
        return this.status;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCountryOfResidence() {
        return this.countryOfResidence;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getTransactionsFound() {
        return this.transactionsFound;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.xoom.domain.model.UserInfo copy$default(com.paypal.oslo.feature.xoom.domain.model.UserInfo userInfo, java.lang.String str, boolean z, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = userInfo.id;
        }
        if ((i & 2) != 0) {
            z = userInfo.transactionsFound;
        }
        if ((i & 4) != 0) {
            str2 = userInfo.countryOfResidence;
        }
        if ((i & 8) != 0) {
            str3 = userInfo.status;
        }
        return userInfo.copy(str, z, str2, str3);
    }
}
