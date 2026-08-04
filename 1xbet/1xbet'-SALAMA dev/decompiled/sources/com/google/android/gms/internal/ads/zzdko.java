package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class zzdko {
    private final Executor zza;
    private final zzdkj zzb;

    public zzdko(Executor executor, zzdkj zzdkjVar) {
        this.zza = executor;
        this.zzb = zzdkjVar;
    }

    public final I3.b zza(JSONObject jSONObject, String str) {
        I3.b bVarZzh;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("custom_assets");
        if (jSONArrayOptJSONArray == null) {
            return zzgbc.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = jSONArrayOptJSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i7);
            if (jSONObjectOptJSONObject == null) {
                bVarZzh = zzgbc.zzh(null);
            } else {
                final String strOptString = jSONObjectOptJSONObject.optString("name");
                if (strOptString == null) {
                    bVarZzh = zzgbc.zzh(null);
                } else {
                    String strOptString2 = jSONObjectOptJSONObject.optString("type");
                    bVarZzh = "string".equals(strOptString2) ? zzgbc.zzh(new zzdkn(strOptString, jSONObjectOptJSONObject.optString("string_value"))) : "image".equals(strOptString2) ? zzgbc.zzm(this.zzb.zze(jSONObjectOptJSONObject, "image_value"), new zzfsw() { // from class: com.google.android.gms.internal.ads.zzdkl
                        @Override // com.google.android.gms.internal.ads.zzfsw
                        public final Object apply(Object obj) {
                            return new zzdkn(strOptString, (zzbew) obj);
                        }
                    }, this.zza) : zzgbc.zzh(null);
                }
            }
            arrayList.add(bVarZzh);
        }
        return zzgbc.zzm(zzgbc.zzd(arrayList), new zzfsw() { // from class: com.google.android.gms.internal.ads.zzdkm
            @Override // com.google.android.gms.internal.ads.zzfsw
            public final Object apply(Object obj) {
                ArrayList arrayList2 = new ArrayList();
                for (zzdkn zzdknVar : (List) obj) {
                    if (zzdknVar != null) {
                        arrayList2.add(zzdknVar);
                    }
                }
                return arrayList2;
            }
        }, this.zza);
    }
}
