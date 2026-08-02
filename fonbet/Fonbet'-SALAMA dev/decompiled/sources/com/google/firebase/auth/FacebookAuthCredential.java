package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.E;

/* loaded from: classes2.dex */
public class FacebookAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<FacebookAuthCredential> CREATOR = new E(22);

    /* renamed from: a, reason: collision with root package name */
    public final String f11846a;

    public FacebookAuthCredential(String str) {
        D.e(str);
        this.f11846a = str;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String j() {
        return "facebook.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String k() {
        return "facebook.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential m() {
        return new FacebookAuthCredential(this.f11846a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = Y4.D.x0(20293, parcel);
        Y4.D.s0(parcel, 1, this.f11846a, false);
        Y4.D.z0(x02, parcel);
    }
}
