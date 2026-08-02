package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.internal.ReflectedParcelable;

/* loaded from: classes4.dex */
public class SignInAccount extends com.google.android.gms.common.internal.safeparcel.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<SignInAccount> CREATOR = new f();

    @Deprecated
    public final String a;
    public final GoogleSignInAccount b;

    @Deprecated
    public final String c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.b = googleSignInAccount;
        C0875q.e(str, "8.3 and 8.4 SDKs require non-null email");
        this.a = str;
        C0875q.e(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int q = com.google.android.gms.common.internal.safeparcel.c.q(parcel, 20293);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 4, this.a, false);
        com.google.android.gms.common.internal.safeparcel.c.k(parcel, 7, this.b, i, false);
        com.google.android.gms.common.internal.safeparcel.c.l(parcel, 8, this.c, false);
        com.google.android.gms.common.internal.safeparcel.c.r(parcel, q);
    }
}
