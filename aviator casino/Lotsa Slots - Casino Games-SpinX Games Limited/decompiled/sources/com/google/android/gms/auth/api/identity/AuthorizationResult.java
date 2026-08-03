package com.google.android.gms.auth.api.identity;

/* compiled from: com.google.android.gms:play-services-auth@@21.0.0 */
/* loaded from: classes3.dex */
public final class AuthorizationResult extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.AuthorizationResult> CREATOR = new com.google.android.gms.auth.api.identity.zbe();
    private final java.lang.String zba;
    private final java.lang.String zbb;
    private final java.lang.String zbc;
    private final java.util.List zbd;
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount zbe;
    private final android.app.PendingIntent zbf;

    public AuthorizationResult(java.lang.String str, java.lang.String str2, java.lang.String str3, java.util.List<java.lang.String> list, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, android.app.PendingIntent pendingIntent) {
        this.zba = str;
        this.zbb = str2;
        this.zbc = str3;
        this.zbd = (java.util.List) com.google.android.gms.common.internal.Preconditions.checkNotNull(list);
        this.zbf = pendingIntent;
        this.zbe = googleSignInAccount;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.auth.api.identity.AuthorizationResult)) {
            return false;
        }
        com.google.android.gms.auth.api.identity.AuthorizationResult authorizationResult = (com.google.android.gms.auth.api.identity.AuthorizationResult) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zba, authorizationResult.zba) && com.google.android.gms.common.internal.Objects.equal(this.zbb, authorizationResult.zbb) && com.google.android.gms.common.internal.Objects.equal(this.zbc, authorizationResult.zbc) && com.google.android.gms.common.internal.Objects.equal(this.zbd, authorizationResult.zbd) && com.google.android.gms.common.internal.Objects.equal(this.zbf, authorizationResult.zbf) && com.google.android.gms.common.internal.Objects.equal(this.zbe, authorizationResult.zbe);
    }

    public java.lang.String getAccessToken() {
        return this.zbb;
    }

    public java.util.List<java.lang.String> getGrantedScopes() {
        return this.zbd;
    }

    public android.app.PendingIntent getPendingIntent() {
        return this.zbf;
    }

    public java.lang.String getServerAuthCode() {
        return this.zba;
    }

    public boolean hasResolution() {
        return this.zbf != null;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zba, this.zbb, this.zbc, this.zbd, this.zbf, this.zbe);
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInAccount toGoogleSignInAccount() {
        return this.zbe;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getServerAuthCode(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getAccessToken(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, this.zbc, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeStringList(parcel, 4, getGrantedScopes(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, toGoogleSignInAccount(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 6, getPendingIntent(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
