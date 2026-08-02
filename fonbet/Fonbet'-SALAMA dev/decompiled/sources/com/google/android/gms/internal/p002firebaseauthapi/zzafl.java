package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzafl implements zzadt<zzafl> {
    private static final String zza = "zzafl";
    private List<String> zzb;

    public zzafl() {
        zzahq.zza();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadt
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzafl zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            jSONObject.optString("authUri", null);
            jSONObject.optBoolean("registered", false);
            jSONObject.optString("providerId", null);
            jSONObject.optBoolean("forExistingProvider", false);
            if (jSONObject.has("allProviders")) {
                new zzahq(1, zzaid.zza(jSONObject.optJSONArray("allProviders")));
            } else {
                zzahq.zza();
            }
            this.zzb = zzaid.zza(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException e7) {
            e = e7;
            throw zzaid.zza(e, zza, str);
        } catch (JSONException e8) {
            e = e8;
            throw zzaid.zza(e, zza, str);
        }
    }

    public final List<String> zza() {
        return this.zzb;
    }
}
