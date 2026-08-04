package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.E;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;

/* JADX INFO: loaded from: classes2.dex */
public class EmailAuthCredential extends AuthCredential {
    public static final Parcelable.Creator<EmailAuthCredential> CREATOR = new E(21);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11845e;

    public EmailAuthCredential(String str, String str2, String str3, String str4, boolean z4) {
        D.e(str);
        this.f11841a = str;
        if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
            throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
        }
        this.f11842b = str2;
        this.f11843c = str3;
        this.f11844d = str4;
        this.f11845e = z4;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String j() {
        return URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD;
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final String k() {
        return !TextUtils.isEmpty(this.f11842b) ? URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD : "emailLink";
    }

    @Override // com.google.firebase.auth.AuthCredential
    public final AuthCredential m() {
        return new EmailAuthCredential(this.f11841a, this.f11842b, this.f11843c, this.f11844d, this.f11845e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.s0(parcel, 1, this.f11841a, false);
        Y4.D.s0(parcel, 2, this.f11842b, false);
        Y4.D.s0(parcel, 3, this.f11843c, false);
        Y4.D.s0(parcel, 4, this.f11844d, false);
        boolean z4 = this.f11845e;
        Y4.D.B0(parcel, 5, 4);
        parcel.writeInt(z4 ? 1 : 0);
        Y4.D.z0(iX0, parcel);
    }
}
