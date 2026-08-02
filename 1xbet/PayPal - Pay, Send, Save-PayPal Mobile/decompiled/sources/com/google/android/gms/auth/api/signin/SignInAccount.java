package com.google.android.gms.auth.api.signin;

/* loaded from: classes8.dex */
public class SignInAccount extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable implements com.google.android.gms.common.internal.ReflectedParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.auth.api.signin.SignInAccount> CREATOR = new com.google.android.gms.auth.api.signin.zbb();

    @java.lang.Deprecated
    final java.lang.String zba;

    @java.lang.Deprecated
    final java.lang.String zbb;
    private final com.google.android.gms.auth.api.signin.GoogleSignInAccount zbc;

    SignInAccount(java.lang.String str, com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, java.lang.String str2) {
        this.zbc = googleSignInAccount;
        this.zba = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str, "8.3 and 8.4 SDKs require non-null email");
        this.zbb = com.google.android.gms.common.internal.Preconditions.checkNotEmpty(str2, "8.3 and 8.4 SDKs require non-null userId");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(android.os.Parcel parcel, int i) {
        java.lang.String str = this.zba;
        int beginObjectHeader = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(parcel);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 4, str, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(parcel, 7, this.zbc, i, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeString(parcel, 8, this.zbb, false);
        com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final com.google.android.gms.auth.api.signin.GoogleSignInAccount zba() {
        return this.zbc;
    }
}
