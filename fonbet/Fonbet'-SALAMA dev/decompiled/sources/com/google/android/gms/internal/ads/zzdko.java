package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzdko {
    private final Executor zza;
    private final zzdkj zzb;

    public zzdko(Executor executor, zzdkj zzdkjVar) {
        this.zza = executor;
        this.zzb = zzdkjVar;
    }

    public final I3.b zza(JSONObject jSONObject, String str) {
        I3.b zzh;
        JSONArray optJSONArray = jSONObject.optJSONArray("custom_assets");
        if (optJSONArray == null) {
            return zzgbc.zzh(Collections.emptyList());
        }
        ArrayList arrayList = new ArrayList();
        int length = optJSONArray.length();
        for (int i7 = 0; i7 < length; i7++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i7);
            if (optJSONObject == null) {
                zzh = zzgbc.zzh(null);
            } else {
                final String optString = optJSONObject.optString("name");
                if (optString == null) {
                    zzh = zzgbc.zzh(null);
                } else {
                    String optString2 = optJSONObject.optString("type");
                    zzh = "string".equals(optString2) ? zzgbc.zzh(new zzdkn(optString, optJSONObject.optString("string_value"))) : "image".equals(optString2) ? zzgbc.zzm(this.zzb.zze(optJSONObject, "image_value"), new zzfsw() { // from class: com.google.android.gms.internal.ads.zzdkl
                        @Override // com.google.android.gms.internal.ads.zzfsw
                        public final Object apply(Object obj) {
                            return new zzdkn(optString, (zzbew) obj);
                        }
                    }, this.zza) : zzgbc.zzh(null);
                }
            }
            arrayList.add(zzh);
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
