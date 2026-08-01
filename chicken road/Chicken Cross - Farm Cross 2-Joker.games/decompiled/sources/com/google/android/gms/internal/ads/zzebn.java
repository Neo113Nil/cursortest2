package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzebn {
    public final long zza;
    public final int[] zzb;

    private zzebn(long j, int[] iArr) {
        this.zza = j;
        this.zzb = iArr;
    }

    public static zzgxm zza(JsonReader jsonReader) throws IOException {
        int[] iArr;
        int i = zzgxm.zzd;
        zzgxj zzgxjVar = new zzgxj();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            zzgxm zzi = zzgxm.zzi();
            jsonReader.beginObject();
            zzebn zzebnVar = null;
            Long l = null;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if (Objects.equals(nextName, "id")) {
                    l = Long.valueOf(jsonReader.nextLong());
                } else if (Objects.equals(nextName, "event_types")) {
                    zzgxj zzgxjVar2 = new zzgxj();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzgxjVar2.zzf(Integer.valueOf(jsonReader.nextInt()));
                    }
                    jsonReader.endArray();
                    zzi = zzgxjVar2.zzi();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            if (l != null && !zzi.isEmpty()) {
                long longValue = l.longValue();
                if (zzi == null) {
                    iArr = new int[0];
                } else {
                    int[] iArr2 = new int[zzi.size()];
                    for (int i2 = 0; i2 < zzi.size(); i2++) {
                        iArr2[i2] = ((Integer) zzi.get(i2)).intValue();
                    }
                    iArr = iArr2;
                }
                zzebnVar = new zzebn(longValue, iArr);
            }
            if (zzebnVar != null) {
                zzgxjVar.zzf(zzebnVar);
            }
        }
        jsonReader.endArray();
        return zzgxjVar.zzi();
    }
}
