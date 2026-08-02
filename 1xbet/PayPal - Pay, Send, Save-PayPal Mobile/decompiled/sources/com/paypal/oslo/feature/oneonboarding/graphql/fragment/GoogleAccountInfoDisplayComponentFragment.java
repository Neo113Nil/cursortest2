package com.paypal.oslo.feature.oneonboarding.graphql.fragment;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ2\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0018\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/GoogleAccountInfoDisplayComponentFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "", "__typename", "email", "", "profilePictureUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Object;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lcom/paypal/oslo/feature/oneonboarding/graphql/fragment/GoogleAccountInfoDisplayComponentFragment;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "get__typename", "getEmail", "Ljava/lang/Object;", "getProfilePictureUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GoogleAccountInfoDisplayComponentFragment implements com.apollographql.apollo.api.Fragment.Data {
    public static final int $stable = 8;
    private final java.lang.String __typename;
    private final java.lang.String email;
    private final java.lang.Object profilePictureUrl;

    public GoogleAccountInfoDisplayComponentFragment(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.__typename = str;
        this.email = str2;
        this.profilePictureUrl = obj;
    }

    public final java.lang.String get__typename() {
        return this.__typename;
    }

    public final java.lang.String getEmail() {
        return this.email;
    }

    public final java.lang.Object getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.__typename;
        java.lang.String str2 = this.email;
        java.lang.Object obj = this.profilePictureUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GoogleAccountInfoDisplayComponentFragment(__typename=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", profilePictureUrl=");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.__typename.hashCode();
        java.lang.String str = this.email;
        int hashCode2 = str == null ? 0 : str.hashCode();
        java.lang.Object obj = this.profilePictureUrl;
        return (((hashCode * 31) + hashCode2) * 31) + (obj != null ? obj.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.oneonboarding.graphql.fragment.GoogleAccountInfoDisplayComponentFragment)) {
            return false;
        }
        com.paypal.oslo.feature.oneonboarding.graphql.fragment.GoogleAccountInfoDisplayComponentFragment googleAccountInfoDisplayComponentFragment = (com.paypal.oslo.feature.oneonboarding.graphql.fragment.GoogleAccountInfoDisplayComponentFragment) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.__typename, googleAccountInfoDisplayComponentFragment.__typename) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, googleAccountInfoDisplayComponentFragment.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.profilePictureUrl, googleAccountInfoDisplayComponentFragment.profilePictureUrl);
    }

    public final com.paypal.oslo.feature.oneonboarding.graphql.fragment.GoogleAccountInfoDisplayComponentFragment copy(java.lang.String __typename, java.lang.String email, java.lang.Object profilePictureUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(__typename, "");
        return new com.paypal.oslo.feature.oneonboarding.graphql.fragment.GoogleAccountInfoDisplayComponentFragment(__typename, email, profilePictureUrl);
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.Object getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String get__typename() {
        return this.__typename;
    }

    public static /* synthetic */ com.paypal.oslo.feature.oneonboarding.graphql.fragment.GoogleAccountInfoDisplayComponentFragment copy$default(com.paypal.oslo.feature.oneonboarding.graphql.fragment.GoogleAccountInfoDisplayComponentFragment googleAccountInfoDisplayComponentFragment, java.lang.String str, java.lang.String str2, java.lang.Object obj, int i, java.lang.Object obj2) {
        if ((i & 1) != 0) {
            str = googleAccountInfoDisplayComponentFragment.__typename;
        }
        if ((i & 2) != 0) {
            str2 = googleAccountInfoDisplayComponentFragment.email;
        }
        if ((i & 4) != 0) {
            obj = googleAccountInfoDisplayComponentFragment.profilePictureUrl;
        }
        return googleAccountInfoDisplayComponentFragment.copy(str, str2, obj);
    }
}
