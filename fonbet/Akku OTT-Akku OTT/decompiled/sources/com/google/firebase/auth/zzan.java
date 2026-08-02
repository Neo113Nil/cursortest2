package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.a;
import com.google.android.gms.common.internal.safeparcel.c;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzan extends a {
    public static final Parcelable.Creator<zzan> CREATOR = new zzam();
    private final String zza;
    private final String zzb;
    private final String zzc;

    public zzan(String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
    }

    public static com.google.android.gms.internal.p002firebaseauthapi.zzah<zzan> zza(@Nullable JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() == 0) {
            return com.google.android.gms.internal.p002firebaseauthapi.zzah.zzg();
        }
        com.google.android.gms.internal.p002firebaseauthapi.zzak zzf = com.google.android.gms.internal.p002firebaseauthapi.zzah.zzf();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            zzf.zza(new zzan(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName")));
        }
        return zzf.zza();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int q = c.q(parcel, 20293);
        c.l(parcel, 1, this.zza, false);
        c.l(parcel, 2, this.zzb, false);
        c.l(parcel, 3, this.zzc, false);
        c.r(parcel, q);
    }

    public static final zzan zza(JSONObject jSONObject) throws JSONException {
        return new zzan(jSONObject.getString("credentialId"), jSONObject.getString("name"), jSONObject.getString("displayName"));
    }

    public static final JSONObject zza(zzan zzanVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("credentialId", zzanVar.zza);
        jSONObject.put("name", zzanVar.zzb);
        jSONObject.put("displayName", zzanVar.zzc);
        return jSONObject;
    }
}
