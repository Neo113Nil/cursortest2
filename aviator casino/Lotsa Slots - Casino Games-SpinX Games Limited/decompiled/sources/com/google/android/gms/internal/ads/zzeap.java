package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeap {
    public final long zza;
    public final int[] zzb;

    private zzeap(long j, int[] iArr) {
        this.zza = j;
        this.zzb = iArr;
    }

    public static com.google.android.gms.internal.ads.zzgwm zza(android.util.JsonReader jsonReader) throws java.io.IOException {
        int[] iArr;
        int i = com.google.android.gms.internal.ads.zzgwm.zzd;
        com.google.android.gms.internal.ads.zzgwj zzgwjVar = new com.google.android.gms.internal.ads.zzgwj();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            com.google.android.gms.internal.ads.zzgwm zzi = com.google.android.gms.internal.ads.zzgwm.zzi();
            jsonReader.beginObject();
            com.google.android.gms.internal.ads.zzeap zzeapVar = null;
            java.lang.Long l = null;
            while (jsonReader.hasNext()) {
                java.lang.String nextName = jsonReader.nextName();
                if (java.util.Objects.equals(nextName, "id")) {
                    l = java.lang.Long.valueOf(jsonReader.nextLong());
                } else if (java.util.Objects.equals(nextName, "event_types")) {
                    com.google.android.gms.internal.ads.zzgwj zzgwjVar2 = new com.google.android.gms.internal.ads.zzgwj();
                    jsonReader.beginArray();
                    while (jsonReader.hasNext()) {
                        zzgwjVar2.zzf(java.lang.Integer.valueOf(jsonReader.nextInt()));
                    }
                    jsonReader.endArray();
                    zzi = zzgwjVar2.zzi();
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
                        iArr2[i2] = ((java.lang.Integer) zzi.get(i2)).intValue();
                    }
                    iArr = iArr2;
                }
                zzeapVar = new com.google.android.gms.internal.ads.zzeap(longValue, iArr);
            }
            if (zzeapVar != null) {
                zzgwjVar.zzf(zzeapVar);
            }
        }
        jsonReader.endArray();
        return zzgwjVar.zzi();
    }
}
