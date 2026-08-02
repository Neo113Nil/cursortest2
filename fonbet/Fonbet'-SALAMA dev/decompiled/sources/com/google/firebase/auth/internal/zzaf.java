package com.google.firebase.auth.internal;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import f4.C1092d;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzaf implements SafeParcelable {
    public static final Parcelable.Creator<zzaf> CREATOR = new C1092d(3);

    /* renamed from: a, reason: collision with root package name */
    public final long f11917a;

    /* renamed from: b, reason: collision with root package name */
    public final long f11918b;

    public zzaf(long j, long j3) {
        this.f11917a = j;
        this.f11918b = j3;
    }

    public static zzaf a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new zzaf(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int x02 = D.x0(20293, parcel);
        D.B0(parcel, 1, 8);
        parcel.writeLong(this.f11917a);
        D.B0(parcel, 2, 8);
        parcel.writeLong(this.f11918b);
        D.z0(x02, parcel);
    }
}
