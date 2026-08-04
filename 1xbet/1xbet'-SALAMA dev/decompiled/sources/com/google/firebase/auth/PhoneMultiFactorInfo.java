package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.internal.p002firebaseauthapi.zzzh;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class PhoneMultiFactorInfo extends MultiFactorInfo {
    public static final Parcelable.Creator<PhoneMultiFactorInfo> CREATOR = new E(14);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11885d;

    public PhoneMultiFactorInfo(String str, String str2, long j, String str3) {
        D.e(str);
        this.f11882a = str;
        this.f11883b = str2;
        this.f11884c = j;
        D.e(str3);
        this.f11885d = str3;
    }

    public static PhoneMultiFactorInfo n(JSONObject jSONObject) {
        if (jSONObject.has("enrollmentTimestamp")) {
            return new PhoneMultiFactorInfo(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
        }
        throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final String a() {
        return this.f11882a;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final String e() {
        return this.f11883b;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final long j() {
        return this.f11884c;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final String k() {
        return "phone";
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final JSONObject m() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f11882a);
            jSONObject.putOpt("displayName", this.f11883b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f11884c));
            jSONObject.putOpt("phoneNumber", this.f11885d);
            return jSONObject;
        } catch (JSONException e7) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zzzh(e7);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.s0(parcel, 1, this.f11882a, false);
        Y4.D.s0(parcel, 2, this.f11883b, false);
        Y4.D.B0(parcel, 3, 8);
        parcel.writeLong(this.f11884c);
        Y4.D.s0(parcel, 4, this.f11885d, false);
        Y4.D.z0(iX0, parcel);
    }
}
