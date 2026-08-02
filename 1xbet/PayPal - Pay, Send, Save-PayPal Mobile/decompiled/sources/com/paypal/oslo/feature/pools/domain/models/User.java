package com.paypal.oslo.feature.pools.domain.models;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J>\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b\"\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/pools/domain/models/User;", "", "", "id", "Lcom/paypal/oslo/feature/pools/domain/models/UserName;", "name", "profilePhotoUrl", "Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;", "accountBalance", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/pools/domain/models/UserName;Ljava/lang/String;Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/pools/domain/models/UserName;", "component3", "component4", "()Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/pools/domain/models/UserName;Ljava/lang/String;Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;)Lcom/paypal/oslo/feature/pools/domain/models/User;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Lcom/paypal/oslo/feature/pools/domain/models/UserName;", "getName", "getProfilePhotoUrl", "Lcom/paypal/oslo/feature/pools/domain/models/PoolAmount;", "getAccountBalance"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class User {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.pools.domain.models.PoolAmount accountBalance;
    private final java.lang.String id;
    private final com.paypal.oslo.feature.pools.domain.models.UserName name;
    private final java.lang.String profilePhotoUrl;

    public User(java.lang.String str, com.paypal.oslo.feature.pools.domain.models.UserName userName, java.lang.String str2, com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.id = str;
        this.name = userName;
        this.profilePhotoUrl = str2;
        this.accountBalance = poolAmount;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final com.paypal.oslo.feature.pools.domain.models.UserName getName() {
        return this.name;
    }

    public final java.lang.String getProfilePhotoUrl() {
        return this.profilePhotoUrl;
    }

    public final com.paypal.oslo.feature.pools.domain.models.PoolAmount getAccountBalance() {
        return this.accountBalance;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        com.paypal.oslo.feature.pools.domain.models.UserName userName = this.name;
        java.lang.String str2 = this.profilePhotoUrl;
        com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount = this.accountBalance;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("User(id=");
        sb.append(str);
        sb.append(", name=");
        sb.append(userName);
        sb.append(", profilePhotoUrl=");
        sb.append(str2);
        sb.append(", accountBalance=");
        sb.append(poolAmount);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        com.paypal.oslo.feature.pools.domain.models.UserName userName = this.name;
        int hashCode2 = userName == null ? 0 : userName.hashCode();
        java.lang.String str = this.profilePhotoUrl;
        int hashCode3 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount = this.accountBalance;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (poolAmount != null ? poolAmount.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.pools.domain.models.User)) {
            return false;
        }
        com.paypal.oslo.feature.pools.domain.models.User user = (com.paypal.oslo.feature.pools.domain.models.User) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, user.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.name, user.name) && kotlin.jvm.internal.Intrinsics.areEqual(this.profilePhotoUrl, user.profilePhotoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.accountBalance, user.accountBalance);
    }

    public final com.paypal.oslo.feature.pools.domain.models.User copy(java.lang.String id, com.paypal.oslo.feature.pools.domain.models.UserName name2, java.lang.String profilePhotoUrl, com.paypal.oslo.feature.pools.domain.models.PoolAmount accountBalance) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        return new com.paypal.oslo.feature.pools.domain.models.User(id, name2, profilePhotoUrl, accountBalance);
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.pools.domain.models.PoolAmount getAccountBalance() {
        return this.accountBalance;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getProfilePhotoUrl() {
        return this.profilePhotoUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.pools.domain.models.UserName getName() {
        return this.name;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.feature.pools.domain.models.User copy$default(com.paypal.oslo.feature.pools.domain.models.User user, java.lang.String str, com.paypal.oslo.feature.pools.domain.models.UserName userName, java.lang.String str2, com.paypal.oslo.feature.pools.domain.models.PoolAmount poolAmount, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = user.id;
        }
        if ((i & 2) != 0) {
            userName = user.name;
        }
        if ((i & 4) != 0) {
            str2 = user.profilePhotoUrl;
        }
        if ((i & 8) != 0) {
            poolAmount = user.accountBalance;
        }
        return user.copy(str, userName, str2, poolAmount);
    }
}
