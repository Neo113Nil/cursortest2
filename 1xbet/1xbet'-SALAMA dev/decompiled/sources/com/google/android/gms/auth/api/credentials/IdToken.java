package com.google.android.gms.auth.api.credentials;

import Z2.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class IdToken extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<IdToken> CREATOR = new a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10940b;

    public IdToken(String str, String str2) {
        D.a("account type string cannot be null or empty", !TextUtils.isEmpty(str));
        D.a("id token string cannot be null or empty", !TextUtils.isEmpty(str2));
        this.f10939a = str;
        this.f10940b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IdToken)) {
            return false;
        }
        IdToken idToken = (IdToken) obj;
        return D.m(this.f10939a, idToken.f10939a) && D.m(this.f10940b, idToken.f10940b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.s0(parcel, 1, this.f10939a, false);
        Y4.D.s0(parcel, 2, this.f10940b, false);
        Y4.D.z0(iX0, parcel);
    }
}
