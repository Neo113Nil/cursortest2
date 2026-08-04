package com.google.firebase.auth.internal;

import Y4.D;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzzh;
import org.json.JSONException;
import org.json.JSONObject;
import p034e4.p;
import p042f4.C0895d;

/* JADX INFO: loaded from: classes2.dex */
public final class zzz extends AbstractSafeParcelable implements p {
    public static final Parcelable.Creator<zzz> CREATOR = new C0895d(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f11939a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f11940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11941c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11942d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Uri f11943e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f11944f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String f11945x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f11946y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f11947z;

    public zzz(String str, String str2, String str3, String str4, String str5, String str6, boolean z4, String str7) {
        this.f11939a = str;
        this.f11940b = str2;
        this.f11944f = str3;
        this.f11945x = str4;
        this.f11941c = str5;
        this.f11942d = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f11943e = Uri.parse(str6);
        }
        this.f11946y = z4;
        this.f11947z = str7;
    }

    public static zzz j(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new zzz(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString("email"), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e7) {
            Log.d("DefaultAuthUserInfo", "Failed to unpack UserInfo from JSON");
            throw new zzzh(e7);
        }
    }

    @Override // p034e4.p
    public final String a() {
        return this.f11939a;
    }

    @Override // p034e4.p
    public final Uri b() {
        String str = this.f11942d;
        if (!TextUtils.isEmpty(str) && this.f11943e == null) {
            this.f11943e = Uri.parse(str);
        }
        return this.f11943e;
    }

    @Override // p034e4.p
    public final boolean c() {
        return this.f11946y;
    }

    @Override // p034e4.p
    public final String d() {
        return this.f11945x;
    }

    @Override // p034e4.p
    public final String e() {
        return this.f11941c;
    }

    @Override // p034e4.p
    public final String g() {
        return this.f11940b;
    }

    @Override // p034e4.p
    public final String i() {
        return this.f11944f;
    }

    public final String k() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.f11939a);
            jSONObject.putOpt("providerId", this.f11940b);
            jSONObject.putOpt("displayName", this.f11941c);
            jSONObject.putOpt("photoUrl", this.f11942d);
            jSONObject.putOpt("email", this.f11944f);
            jSONObject.putOpt("phoneNumber", this.f11945x);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.f11946y));
            jSONObject.putOpt("rawUserInfo", this.f11947z);
            return jSONObject.toString();
        } catch (JSONException e7) {
            Log.d("DefaultAuthUserInfo", "Failed to jsonify this object");
            throw new zzzh(e7);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.s0(parcel, 1, this.f11939a, false);
        D.s0(parcel, 2, this.f11940b, false);
        D.s0(parcel, 3, this.f11941c, false);
        D.s0(parcel, 4, this.f11942d, false);
        D.s0(parcel, 5, this.f11944f, false);
        D.s0(parcel, 6, this.f11945x, false);
        D.B0(parcel, 7, 4);
        parcel.writeInt(this.f11946y ? 1 : 0);
        D.s0(parcel, 8, this.f11947z, false);
        D.z0(iX0, parcel);
    }
}
