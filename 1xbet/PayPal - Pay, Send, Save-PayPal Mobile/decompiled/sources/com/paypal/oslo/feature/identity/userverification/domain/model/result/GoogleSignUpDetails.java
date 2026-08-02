package com.paypal.oslo.feature.identity.userverification.domain.model.result;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001a\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpDetails;", "", "", "idToken", "email", "firstName", "lastName", "profilePictureUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/identity/userverification/domain/model/result/GoogleSignUpDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIdToken", "getEmail", "getFirstName", "getLastName", "getProfilePictureUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class GoogleSignUpDetails {
    public static final int $stable = 0;
    private final java.lang.String email;
    private final java.lang.String firstName;
    private final java.lang.String idToken;
    private final java.lang.String lastName;
    private final java.lang.String profilePictureUrl;

    public GoogleSignUpDetails(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.idToken = str;
        this.email = str2;
        this.firstName = str3;
        this.lastName = str4;
        this.profilePictureUrl = str5;
    }

    public final java.lang.String getIdToken() {
        return this.idToken;
    }

    public final java.lang.String getEmail() {
        return this.email;
    }

    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    public final java.lang.String getLastName() {
        return this.lastName;
    }

    public final java.lang.String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.idToken;
        java.lang.String str2 = this.email;
        java.lang.String str3 = this.firstName;
        java.lang.String str4 = this.lastName;
        java.lang.String str5 = this.profilePictureUrl;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("GoogleSignUpDetails(idToken=");
        sb.append(str);
        sb.append(", email=");
        sb.append(str2);
        sb.append(", firstName=");
        sb.append(str3);
        sb.append(", lastName=");
        sb.append(str4);
        sb.append(", profilePictureUrl=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.idToken.hashCode() * 31) + this.email.hashCode()) * 31) + this.firstName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.profilePictureUrl.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpDetails)) {
            return false;
        }
        com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpDetails googleSignUpDetails = (com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.idToken, googleSignUpDetails.idToken) && kotlin.jvm.internal.Intrinsics.areEqual(this.email, googleSignUpDetails.email) && kotlin.jvm.internal.Intrinsics.areEqual(this.firstName, googleSignUpDetails.firstName) && kotlin.jvm.internal.Intrinsics.areEqual(this.lastName, googleSignUpDetails.lastName) && kotlin.jvm.internal.Intrinsics.areEqual(this.profilePictureUrl, googleSignUpDetails.profilePictureUrl);
    }

    public final com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpDetails copy(java.lang.String idToken, java.lang.String email, java.lang.String firstName, java.lang.String lastName, java.lang.String profilePictureUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(idToken, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(email, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(firstName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lastName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(profilePictureUrl, "");
        return new com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpDetails(idToken, email, firstName, lastName, profilePictureUrl);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getProfilePictureUrl() {
        return this.profilePictureUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getLastName() {
        return this.lastName;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getFirstName() {
        return this.firstName;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getEmail() {
        return this.email;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getIdToken() {
        return this.idToken;
    }

    public static /* synthetic */ com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpDetails copy$default(com.paypal.oslo.feature.identity.userverification.domain.model.result.GoogleSignUpDetails googleSignUpDetails, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = googleSignUpDetails.idToken;
        }
        if ((i & 2) != 0) {
            str2 = googleSignUpDetails.email;
        }
        java.lang.String str6 = str2;
        if ((i & 4) != 0) {
            str3 = googleSignUpDetails.firstName;
        }
        java.lang.String str7 = str3;
        if ((i & 8) != 0) {
            str4 = googleSignUpDetails.lastName;
        }
        java.lang.String str8 = str4;
        if ((i & 16) != 0) {
            str5 = googleSignUpDetails.profilePictureUrl;
        }
        return googleSignUpDetails.copy(str, str6, str7, str8, str5);
    }
}
