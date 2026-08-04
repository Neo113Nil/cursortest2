package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class GetSignInIntentRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSignInIntentRequest> CREATOR = new Z2.a(8);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10982f;

    public GetSignInIntentRequest(String str, String str2, String str3, String str4, boolean z4, int i7) {
        D.i(str);
        this.f10977a = str;
        this.f10978b = str2;
        this.f10979c = str3;
        this.f10980d = str4;
        this.f10981e = z4;
        this.f10982f = i7;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GetSignInIntentRequest)) {
            return false;
        }
        GetSignInIntentRequest getSignInIntentRequest = (GetSignInIntentRequest) obj;
        return D.m(this.f10977a, getSignInIntentRequest.f10977a) && D.m(this.f10980d, getSignInIntentRequest.f10980d) && D.m(this.f10978b, getSignInIntentRequest.f10978b) && D.m(Boolean.valueOf(this.f10981e), Boolean.valueOf(getSignInIntentRequest.f10981e)) && this.f10982f == getSignInIntentRequest.f10982f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f10977a, this.f10978b, this.f10980d, Boolean.valueOf(this.f10981e), Integer.valueOf(this.f10982f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.s0(parcel, 1, this.f10977a, false);
        Y4.D.s0(parcel, 2, this.f10978b, false);
        Y4.D.s0(parcel, 3, this.f10979c, false);
        Y4.D.s0(parcel, 4, this.f10980d, false);
        Y4.D.B0(parcel, 5, 4);
        parcel.writeInt(this.f10981e ? 1 : 0);
        Y4.D.B0(parcel, 6, 4);
        parcel.writeInt(this.f10982f);
        Y4.D.z0(iX0, parcel);
    }
}
