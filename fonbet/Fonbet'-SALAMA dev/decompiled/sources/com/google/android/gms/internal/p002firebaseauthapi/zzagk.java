package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzagk implements zzadt<zzagk> {
    private static final String zza = "zzagk";
    private List<String> zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadt
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagk zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (optJSONArray != null) {
                for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                    this.zzb.add(optJSONArray.getString(i7));
                }
            }
            return this;
        } catch (JSONException e7) {
            throw zzaid.zza(e7, zza, str);
        }
    }

    public final List<String> zza() {
        return this.zzb;
    }
}
