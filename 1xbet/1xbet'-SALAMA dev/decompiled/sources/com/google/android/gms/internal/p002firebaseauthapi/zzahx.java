package com.google.android.gms.internal.p002firebaseauthapi;

import android.text.TextUtils;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p090m3.f;

/* JADX INFO: loaded from: classes.dex */
public class zzahx implements zzadt<zzahx> {
    private static final String zza = "zzahx";
    private String zzb;
    private String zzc;
    private long zzd;
    private List<zzags> zze;
    private String zzf;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadt
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahx zza(String str) throws zzabg {
        try {
            JSONObject jSONObject = new JSONObject(str);
            f.a(jSONObject.optString("localId", null));
            f.a(jSONObject.optString("email", null));
            f.a(jSONObject.optString("displayName", null));
            this.zzb = f.a(jSONObject.optString("idToken", null));
            f.a(jSONObject.optString("photoUrl", null));
            this.zzc = f.a(jSONObject.optString("refreshToken", null));
            this.zzd = jSONObject.optLong("expiresIn", 0L);
            this.zze = zzags.zza(jSONObject.optJSONArray("mfaInfo"));
            this.zzf = jSONObject.optString("mfaPendingCredential", null);
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzaid.zza(e7, zza, str);
        }
    }

    public final long zza() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzc;
    }

    public final List<zzags> zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return !TextUtils.isEmpty(this.zzf);
    }

    public final String zzb() {
        return this.zzb;
    }
}
