package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.zzan;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p090m3.f;

/* JADX INFO: loaded from: classes.dex */
public class zzagb implements zzadt<zzagb> {
    private static final String zza = "zzagb";
    private zzagd zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadt
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagb zza(String str) throws zzabg {
        zzagd zzagdVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("users");
                if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() == 0) {
                    zzagdVar = new zzagd(new ArrayList());
                } else {
                    ArrayList arrayList = new ArrayList(jSONArrayOptJSONArray.length());
                    boolean z4 = false;
                    int i7 = 0;
                    while (i7 < jSONArrayOptJSONArray.length()) {
                        JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i7);
                        arrayList.add(jSONObject2 == null ? new zzage() : new zzage(f.a(jSONObject2.optString("localId", null)), f.a(jSONObject2.optString("email", null)), jSONObject2.optBoolean("emailVerified", z4), f.a(jSONObject2.optString("displayName", null)), f.a(jSONObject2.optString("photoUrl", null)), zzagu.zza(jSONObject2.optJSONArray("providerUserInfo")), f.a(jSONObject2.optString("rawPassword", null)), f.a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, zzags.zza(jSONObject2.optJSONArray("mfaInfo")), zzan.j(jSONObject2.optJSONArray("passkeyInfo"))));
                        i7++;
                        z4 = false;
                    }
                    zzagdVar = new zzagd(arrayList);
                }
            } else {
                zzagdVar = new zzagd();
            }
            this.zzb = zzagdVar;
            return this;
        } catch (NullPointerException e7) {
            e = e7;
            throw zzaid.zza(e, zza, str);
        } catch (JSONException e8) {
            e = e8;
            throw zzaid.zza(e, zza, str);
        }
    }

    public final List<zzage> zza() {
        return this.zzb.zza();
    }
}
