package com.google.android.gms.auth.api.identity;

@java.lang.Deprecated
/* loaded from: classes.dex */
public final class SignInCredential extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.identity.SignInCredential> CREATOR = new com.google.android.gms.auth.api.identity.zbu();
    private final java.lang.String zba;
    private final java.lang.String zbb;
    private final java.lang.String zbc;
    private final java.lang.String zbd;
    private final android.net.Uri zbe;
    private final java.lang.String zbf;
    private final java.lang.String zbg;
    private final java.lang.String zbh;
    private final com.google.android.gms.fido.fido2.api.common.PublicKeyCredential zbi;

    SignInCredential(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.net.Uri uri, java.lang.String str5, java.lang.String str6, java.lang.String str7, com.google.android.gms.fido.fido2.api.common.PublicKeyCredential publicKeyCredential) {
        this.zba = (java.lang.String) com.google.android.gms.common.internal.Preconditions.checkNotNull(str);
        this.zbb = str2;
        this.zbc = str3;
        this.zbd = str4;
        this.zbe = uri;
        this.zbf = str5;
        this.zbg = str6;
        this.zbh = str7;
        this.zbi = publicKeyCredential;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.gms.auth.api.identity.SignInCredential)) {
            return false;
        }
        com.google.android.gms.auth.api.identity.SignInCredential signInCredential = (com.google.android.gms.auth.api.identity.SignInCredential) obj;
        return com.google.android.gms.common.internal.Objects.equal(this.zba, signInCredential.zba) && com.google.android.gms.common.internal.Objects.equal(this.zbb, signInCredential.zbb) && com.google.android.gms.common.internal.Objects.equal(this.zbc, signInCredential.zbc) && com.google.android.gms.common.internal.Objects.equal(this.zbd, signInCredential.zbd) && com.google.android.gms.common.internal.Objects.equal(this.zbe, signInCredential.zbe) && com.google.android.gms.common.internal.Objects.equal(this.zbf, signInCredential.zbf) && com.google.android.gms.common.internal.Objects.equal(this.zbg, signInCredential.zbg) && com.google.android.gms.common.internal.Objects.equal(this.zbh, signInCredential.zbh) && com.google.android.gms.common.internal.Objects.equal(this.zbi, signInCredential.zbi);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zba, this.zbb, this.zbc, this.zbd, this.zbe, this.zbf, this.zbg, this.zbh, this.zbi);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 1, getId(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 2, getDisplayName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 3, getGivenName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, getFamilyName(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 5, getProfilePictureUri(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 6, getPassword(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 7, getGoogleIdToken(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, getPhoneNumber(), false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 9, getPublicKeyCredential(), i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final com.google.android.gms.fido.fido2.api.common.PublicKeyCredential getPublicKeyCredential() {
        return this.zbi;
    }

    public final android.net.Uri getProfilePictureUri() {
        return this.zbe;
    }

    @java.lang.Deprecated
    public final java.lang.String getPhoneNumber() {
        return this.zbh;
    }

    public final java.lang.String getPassword() {
        return this.zbf;
    }

    public final java.lang.String getId() {
        return this.zba;
    }

    public final java.lang.String getGoogleIdToken() {
        return this.zbg;
    }

    public final java.lang.String getGivenName() {
        return this.zbc;
    }

    public final java.lang.String getFamilyName() {
        return this.zbd;
    }

    public final java.lang.String getDisplayName() {
        return this.zbb;
    }
}
