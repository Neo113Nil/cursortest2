package com.google.firebase.auth;

import Y4.D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.E;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.p002firebaseauthapi.zzal;
import com.google.android.gms.internal.p002firebaseauthapi.zzao;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class zzan extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzan> CREATOR = new E(12);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11950c;

    public zzan(String str, String str2, String str3) {
        this.f11948a = str;
        this.f11949b = str2;
        this.f11950c = str3;
    }

    public static zzal j(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return zzal.zza(new ArrayList());
        }
        zzao zzaoVarZzg = zzal.zzg();
        for (int i7 = 0; i7 < jSONArray.length(); i7++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i7);
            zzaoVarZzg.zza(new zzan(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName")));
        }
        return zzaoVarZzg.zza();
    }

    public static final zzan k(JSONObject jSONObject) {
        return new zzan(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName"));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i7) {
        int iX0 = D.x0(20293, parcel);
        D.s0(parcel, 1, this.f11948a, false);
        D.s0(parcel, 2, this.f11949b, false);
        D.s0(parcel, 3, this.f11950c, false);
        D.z0(iX0, parcel);
    }
}
