package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.E;

/* JADX INFO: loaded from: classes2.dex */
public class TwitterAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<TwitterAuthCredential> CREATOR = new E(17);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11892b;

    public TwitterAuthCredential(String str, String str2) {
        D.e(str);
        this.f11891a = str;
        D.e(str2);
        this.f11892b = str2;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String j() {
        return "twitter.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String k() {
        return "twitter.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential m() {
        return new TwitterAuthCredential(this.f11891a, this.f11892b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.s0(parcel, 1, this.f11891a, false);
        Y4.D.s0(parcel, 2, this.f11892b, false);
        Y4.D.z0(iX0, parcel);
    }
}
