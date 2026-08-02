package com.google.android.gms.internal.p002firebaseauthapi;

import m3.f;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzahj implements zzadt<zzahj> {
    private static final String zza = "zzahj";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadt
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzahj zza(String str) {
        try {
            JSONObject optJSONObject = new JSONObject(str).optJSONObject("phoneResponseInfo");
            if (optJSONObject != null) {
                this.zzb = f.a(optJSONObject.optString("sessionInfo"));
            }
            return this;
        } catch (NullPointerException | JSONException e7) {
            throw zzaid.zza(e7, zza, str);
        }
    }

    public final String zza() {
        return this.zzb;
    }
}
