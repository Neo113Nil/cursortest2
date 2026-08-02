package com.google.android.gms.internal.p002firebaseauthapi;

import m3.f;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzahf implements zzadt<zzahf> {
    private static final String zza = "zzahf";
    private String zzb;
    private String zzc;
    private long zzd;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadt
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahf zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = f.a(jSONObject.optString("idToken", null));
            f.a(jSONObject.optString("displayName", null));
            f.a(jSONObject.optString("email", null));
            this.zzc = f.a(jSONObject.optString("refreshToken", null));
            this.zzd = jSONObject.optLong("expiresIn", 0L);
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzaid.zza(e7, zza, str);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zzb;
    }
}
