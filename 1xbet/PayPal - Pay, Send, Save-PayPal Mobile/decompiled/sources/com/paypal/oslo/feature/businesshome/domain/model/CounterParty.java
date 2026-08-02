package com.paypal.oslo.feature.businesshome.domain.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/businesshome/domain/model/CounterParty;", "", "", "displayName", "profilePictureUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/businesshome/domain/model/CounterParty;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getDisplayName", "getProfilePictureUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CounterParty {
    public static final int $stable = 0;
    private final java.lang.String displayName;
    private final java.lang.String profilePictureUrl;

    public CounterParty(java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.displayName = str;
        this.profilePictureUrl = str2;
    }

    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    public final java.lang.String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.displayName;
        java.lang.String str2 = this.profilePictureUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CounterParty(displayName=");
        sb.append(str);
        sb.append(", profilePictureUrl=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.displayName.hashCode();
        java.lang.String str = this.profilePictureUrl;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.businesshome.domain.model.CounterParty)) {
            return false;
        }
        com.paypal.oslo.feature.businesshome.domain.model.CounterParty counterParty = (com.paypal.oslo.feature.businesshome.domain.model.CounterParty) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.displayName, counterParty.displayName) && kotlin.jvm.internal.Intrinsics.areEqual(this.profilePictureUrl, counterParty.profilePictureUrl);
    }

    public final com.paypal.oslo.feature.businesshome.domain.model.CounterParty copy(java.lang.String displayName, java.lang.String profilePictureUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayName, "");
        return new com.paypal.oslo.feature.businesshome.domain.model.CounterParty(displayName, profilePictureUrl);
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    public static /* synthetic */ com.paypal.oslo.feature.businesshome.domain.model.CounterParty copy$default(com.paypal.oslo.feature.businesshome.domain.model.CounterParty counterParty, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = counterParty.displayName;
        }
        if ((i & 2) != 0) {
            str2 = counterParty.profilePictureUrl;
        }
        return counterParty.copy(str, str2);
    }
}
