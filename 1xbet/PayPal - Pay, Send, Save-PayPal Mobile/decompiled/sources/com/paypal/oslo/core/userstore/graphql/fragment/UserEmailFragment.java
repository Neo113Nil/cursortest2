package com.paypal.oslo.core.userstore.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000fJD\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010!\u001a\u0004\b#\u0010\u0011R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001f\u001a\u0004\b$\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/core/userstore/graphql/fragment/UserEmailFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "id", "", androidx.autofill.HintConstants.AUTOFILL_HINT_EMAIL_ADDRESS, "", "primary", "confirmed", "createdTime", "<init>", "(Ljava/lang/String;Ljava/lang/Object;ZZLjava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Object;", "component3", "()Z", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Object;ZZLjava/lang/Object;)Lcom/paypal/oslo/core/userstore/graphql/fragment/UserEmailFragment;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getId", "Ljava/lang/Object;", "getEmailAddress", "Z", "getPrimary", "getConfirmed", "getCreatedTime"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserEmailFragment implements com.apollographql.apollo.api.Fragment.Data {
    private final boolean confirmed;
    private final java.lang.Object createdTime;
    private final java.lang.Object emailAddress;
    private final java.lang.String id;
    private final boolean primary;

    public UserEmailFragment(java.lang.String str, java.lang.Object obj, boolean z, boolean z2, java.lang.Object obj2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "");
        this.id = str;
        this.emailAddress = obj;
        this.primary = z;
        this.confirmed = z2;
        this.createdTime = obj2;
    }

    public final java.lang.String getId() {
        return this.id;
    }

    public final java.lang.Object getEmailAddress() {
        return this.emailAddress;
    }

    public final boolean getPrimary() {
        return this.primary;
    }

    public final boolean getConfirmed() {
        return this.confirmed;
    }

    public final java.lang.Object getCreatedTime() {
        return this.createdTime;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.id;
        java.lang.Object obj = this.emailAddress;
        boolean z = this.primary;
        boolean z2 = this.confirmed;
        java.lang.Object obj2 = this.createdTime;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("UserEmailFragment(id=");
        sb.append(str);
        sb.append(", emailAddress=");
        sb.append(obj);
        sb.append(", primary=");
        sb.append(z);
        sb.append(", confirmed=");
        sb.append(z2);
        sb.append(", createdTime=");
        sb.append(obj2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.id.hashCode();
        int hashCode2 = this.emailAddress.hashCode();
        int hashCode3 = java.lang.Boolean.hashCode(this.primary);
        int hashCode4 = java.lang.Boolean.hashCode(this.confirmed);
        java.lang.Object obj = this.createdTime;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (obj == null ? 0 : obj.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment)) {
            return false;
        }
        com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment userEmailFragment = (com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.id, userEmailFragment.id) && kotlin.jvm.internal.Intrinsics.areEqual(this.emailAddress, userEmailFragment.emailAddress) && this.primary == userEmailFragment.primary && this.confirmed == userEmailFragment.confirmed && kotlin.jvm.internal.Intrinsics.areEqual(this.createdTime, userEmailFragment.createdTime);
    }

    public final com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment copy(java.lang.String id, java.lang.Object emailAddress, boolean primary, boolean confirmed, java.lang.Object createdTime) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(id, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(emailAddress, "");
        return new com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment(id, emailAddress, primary, confirmed, createdTime);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.Object getCreatedTime() {
        return this.createdTime;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getConfirmed() {
        return this.confirmed;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getPrimary() {
        return this.primary;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.Object getEmailAddress() {
        return this.emailAddress;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getId() {
        return this.id;
    }

    public static /* synthetic */ com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment copy$default(com.paypal.oslo.core.userstore.graphql.fragment.UserEmailFragment userEmailFragment, java.lang.String str, java.lang.Object obj, boolean z, boolean z2, java.lang.Object obj2, int i, java.lang.Object obj3) {
        if ((i & 1) != 0) {
            str = userEmailFragment.id;
        }
        if ((i & 2) != 0) {
            obj = userEmailFragment.emailAddress;
        }
        java.lang.Object obj4 = obj;
        if ((i & 4) != 0) {
            z = userEmailFragment.primary;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = userEmailFragment.confirmed;
        }
        boolean z4 = z2;
        if ((i & 16) != 0) {
            obj2 = userEmailFragment.createdTime;
        }
        return userEmailFragment.copy(str, obj4, z3, z4, obj2);
    }
}
