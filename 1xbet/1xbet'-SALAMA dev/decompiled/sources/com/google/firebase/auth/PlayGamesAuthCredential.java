package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.E;

/* JADX INFO: loaded from: classes2.dex */
public class PlayGamesAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<PlayGamesAuthCredential> CREATOR = new E(15);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11886a;

    public PlayGamesAuthCredential(String str) {
        D.e(str);
        this.f11886a = str;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String j() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String k() {
        return "playgames.google.com";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential m() {
        return new PlayGamesAuthCredential(this.f11886a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.s0(parcel, 1, this.f11886a, false);
        Y4.D.z0(iX0, parcel);
    }
}
