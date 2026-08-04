package com.google.firebase.auth;

import Y4.D;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes2.dex */
public class UserProfileChangeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<UserProfileChangeRequest> CREATOR = new E(18);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f11895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f11896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri f11897e;

    public UserProfileChangeRequest(String str, String str2, boolean z4, boolean z7) {
        this.f11893a = str;
        this.f11894b = str2;
        this.f11895c = z4;
        this.f11896d = z7;
        this.f11897e = TextUtils.isEmpty(str2) ? null : Uri.parse(str2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.s0(parcel, 2, this.f11893a, false);
        D.s0(parcel, 3, this.f11894b, false);
        D.B0(parcel, 4, 4);
        parcel.writeInt(this.f11895c ? 1 : 0);
        D.B0(parcel, 5, 4);
        parcel.writeInt(this.f11896d ? 1 : 0);
        D.z0(iX0, parcel);
    }
}
