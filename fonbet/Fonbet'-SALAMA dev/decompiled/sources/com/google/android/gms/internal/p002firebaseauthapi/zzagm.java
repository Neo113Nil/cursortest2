package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.D;
import java.util.ArrayList;
import m3.f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class zzagm implements zzadt<zzagm> {
    private static final String zza = "zzagm";
    private String zzb;
    private zzal<zzagt> zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadt
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzagm zza(String str) {
        zzal<zzagt> zza2;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = f.a(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    zzao zzg = zzal.zzg();
                    for (int i7 = 0; i7 < optJSONArray.length(); i7++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i7);
                        zzg.zza(jSONObject2 == null ? zzagt.zza(null, null) : zzagt.zza(f.a(jSONObject2.optString("provider")), f.a(jSONObject2.optString("enforcementState"))));
                    }
                    zza2 = zzg.zza();
                    this.zzc = zza2;
                }
                zza2 = zzal.zza(new ArrayList());
                this.zzc = zza2;
            }
            return this;
        } catch (NullPointerException e7) {
            e = e7;
            throw zzaid.zza(e, zza, str);
        } catch (JSONException e8) {
            e = e8;
            throw zzaid.zza(e, zza, str);
        }
    }

    public final String zzb(String str) {
        D.e(str);
        zzal<zzagt> zzalVar = this.zzc;
        if (zzalVar != null && !zzalVar.isEmpty()) {
            zzal<zzagt> zzalVar2 = this.zzc;
            int size = zzalVar2.size();
            int i7 = 0;
            while (i7 < size) {
                zzagt zzagtVar = zzalVar2.get(i7);
                i7++;
                zzagt zzagtVar2 = zzagtVar;
                String zza2 = zzagtVar2.zza();
                String zzb = zzagtVar2.zzb();
                if (zza2 != null && zzb != null && zzb.equals(str)) {
                    return zzagtVar2.zza();
                }
            }
        }
        return null;
    }

    public final boolean zzc(String str) {
        String zzb = zzb(str);
        if (zzb == null) {
            return false;
        }
        return zzb.equals("ENFORCE") || zzb.equals("AUDIT");
    }

    public final String zza() {
        return this.zzb;
    }
}
