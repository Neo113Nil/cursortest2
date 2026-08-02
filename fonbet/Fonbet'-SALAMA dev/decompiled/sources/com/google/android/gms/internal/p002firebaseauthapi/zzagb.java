package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.zzan;
import java.util.ArrayList;
import java.util.List;
import m3.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzagb implements zzadt<zzagb> {
    private static final String zza = "zzagb";
    private zzagd zzb;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadt
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzagb zza(String str) {
        zzagd zzagdVar;
        int i7;
        zzage zzageVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    boolean z4 = false;
                    int i8 = 0;
                    while (i8 < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i8);
                        if (jSONObject2 == null) {
                            zzageVar = new zzage();
                            i7 = i8;
                        } else {
                            i7 = i8;
                            zzageVar = new zzage(f.a(jSONObject2.optString("localId", null)), f.a(jSONObject2.optString("email", null)), jSONObject2.optBoolean("emailVerified", z4), f.a(jSONObject2.optString("displayName", null)), f.a(jSONObject2.optString("photoUrl", null)), zzagu.zza(jSONObject2.optJSONArray("providerUserInfo")), f.a(jSONObject2.optString("rawPassword", null)), f.a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, zzags.zza(jSONObject2.optJSONArray("mfaInfo")), zzan.j(jSONObject2.optJSONArray("passkeyInfo")));
                        }
                        arrayList.add(zzageVar);
                        i8 = i7 + 1;
                        z4 = false;
                    }
                    zzagdVar = new zzagd(arrayList);
                }
                zzagdVar = new zzagd(new ArrayList());
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
