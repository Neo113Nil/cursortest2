package com.google.android.gms.internal.p002firebaseauthapi;

import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzahl extends zzahh {
    private static final String zza = "zzahl";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahh
    /* renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final zzahl zza(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneSessionInfo");
            if (optJSONObject != null) {
                this.zzb = zzag.zza(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzaid.zza(e7, zza, str);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahh, com.google.android.gms.internal.p002firebaseauthapi.zzadt
    public final /* synthetic */ zzahh zza(String str) {
        return (zzahl) zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzahh
    public final String zza() {
        return this.zzb;
    }
}
