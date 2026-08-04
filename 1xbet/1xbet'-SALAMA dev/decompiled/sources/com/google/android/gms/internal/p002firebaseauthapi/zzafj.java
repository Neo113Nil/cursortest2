package com.google.android.gms.internal.p002firebaseauthapi;

import W5.AbstractC0486a1;
import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class zzafj implements zzadt<zzafj> {
    private static final String zza = "com.google.android.gms.internal.firebase-auth-api.zzafj";
    private String zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadt
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzafj zza(String str) throws zzabg {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.zzb = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e7) {
            Log.e(zza, "Failed to parse error for string [" + str + "] with exception: " + e7.getMessage());
            throw new zzabg(AbstractC0486a1.h("Failed to parse error for string [", str, "]"), e7);
        }
    }

    public final String zza() {
        return this.zzb;
    }

    public final boolean zzb() {
        return !TextUtils.isEmpty(this.zzb);
    }
}
