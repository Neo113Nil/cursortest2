package com.google.android.gms.internal.p002firebaseauthapi;

import m3.f;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzahv implements zzadt<zzahv> {
    private static final String zza = "zzahv";
    private String zzb;
    private String zzc;
    private long zzd;
    private boolean zze;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadt
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahv zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = f.a(jSONObject.optString("idToken", null));
            this.zzc = f.a(jSONObject.optString("refreshToken", null));
            this.zzd = jSONObject.optLong("expiresIn", 0L);
            this.zze = jSONObject.optBoolean("isNewUser", false);
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

    public final boolean zzd() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzb;
    }
}
