package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.C0875q;
import com.google.android.gms.common.util.Strings;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class zzahs implements zzaez<zzahs> {
    private static final String zza = "zzahs";

    @Nullable
    private String zzb;
    private zzah<zzaid> zzc;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaez
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzahs zza(String str) throws zzacn {
        zzah<zzaid> zzg;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.zzb = Strings.emptyToNull(jSONObject.optString("recaptchaKey"));
            if (jSONObject.has("recaptchaEnforcementState")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("recaptchaEnforcementState");
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    zzak zzf = zzah.zzf();
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                        zzf.zza(jSONObject2 == null ? zzaid.zza(null, null) : zzaid.zza(Strings.emptyToNull(jSONObject2.optString("provider")), Strings.emptyToNull(jSONObject2.optString("enforcementState"))));
                    }
                    zzg = zzf.zza();
                    this.zzc = zzg;
                }
                zzg = zzah.zzg();
                this.zzc = zzg;
            }
            return this;
        } catch (NullPointerException e) {
            e = e;
            throw zzajk.zza(e, zza, str);
        } catch (JSONException e2) {
            e = e2;
            throw zzajk.zza(e, zza, str);
        }
    }

    @Nullable
    public final String zzb(String str) {
        C0875q.d(str);
        zzah<zzaid> zzahVar = this.zzc;
        if (zzahVar == null || zzahVar.isEmpty()) {
            return null;
        }
        zzah<zzaid> zzahVar2 = this.zzc;
        int size = zzahVar2.size();
        int i = 0;
        while (i < size) {
            zzaid zzaidVar = zzahVar2.get(i);
            i++;
            zzaid zzaidVar2 = zzaidVar;
            String zza2 = zzaidVar2.zza();
            String zzb = zzaidVar2.zzb();
            if (zza2 != null && zzb != null && zzb.equals(str)) {
                return zzaidVar2.zza();
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

    @Nullable
    public final String zza() {
        return this.zzb;
    }
}
