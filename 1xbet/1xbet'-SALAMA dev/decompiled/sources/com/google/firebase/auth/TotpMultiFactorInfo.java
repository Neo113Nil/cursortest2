package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.internal.p002firebaseauthapi.zzahp;
import com.google.android.gms.internal.p002firebaseauthapi.zzzh;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class TotpMultiFactorInfo extends MultiFactorInfo {
    public static final Parcelable.Creator<TotpMultiFactorInfo> CREATOR = new E(16);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zzahp f11890d;

    public TotpMultiFactorInfo(String str, String str2, long j, zzahp zzahpVar) {
        D.e(str);
        this.f11887a = str;
        this.f11888b = str2;
        this.f11889c = j;
        D.j(zzahpVar, "totpInfo cannot be null.");
        this.f11890d = zzahpVar;
    }

    public static TotpMultiFactorInfo n(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a TotpMultiFactorInfo instance.");
        }
        long jOptLong = jSONObject.optLong("enrollmentTimestamp");
        if (jSONObject.opt("totpInfo") == null) {
            throw new IllegalArgumentException("A totpInfo is required to build a TotpMultiFactorInfo instance.");
        }
        return new TotpMultiFactorInfo(jSONObject.optString("uid"), jSONObject.optString("displayName"), jOptLong, new zzahp());
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final String a() {
        return this.f11887a;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final String e() {
        return this.f11888b;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final long j() {
        return this.f11889c;
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final String k() {
        return "totp";
    }

    @Override // com.google.firebase.auth.MultiFactorInfo
    public final JSONObject m() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "totp");
            jSONObject.putOpt("uid", this.f11887a);
            jSONObject.putOpt("displayName", this.f11888b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f11889c));
            jSONObject.putOpt("totpInfo", this.f11890d);
            return jSONObject;
        } catch (JSONException e7) {
            Log.d("TotpMultiFactorInfo", "Failed to jsonify this object");
            throw new zzzh(e7);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = Y4.D.x0(20293, parcel);
        Y4.D.s0(parcel, 1, this.f11887a, false);
        Y4.D.s0(parcel, 2, this.f11888b, false);
        Y4.D.B0(parcel, 3, 8);
        parcel.writeLong(this.f11889c);
        Y4.D.r0(parcel, 4, this.f11890d, i7, false);
        Y4.D.z0(iX0, parcel);
    }
}
