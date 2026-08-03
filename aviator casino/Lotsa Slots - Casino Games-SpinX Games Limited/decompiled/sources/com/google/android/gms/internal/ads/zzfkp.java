package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfkp {
    public final java.util.List zza;
    public final com.google.android.gms.internal.ads.zzfki zzb;
    public final java.util.List zzc;
    public final android.os.Bundle zzd;

    zzfkp(android.util.JsonReader jsonReader, android.os.Bundle bundle) throws java.lang.IllegalStateException, java.io.IOException, org.json.JSONException, java.lang.NumberFormatException, java.lang.AssertionError {
        this.zzd = bundle;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcN)).booleanValue() && bundle != null) {
            bundle.putLong(com.google.android.gms.internal.ads.zzdyu.SERVER_RESPONSE_PARSE_START.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        java.util.List emptyList = java.util.Collections.emptyList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        jsonReader.beginObject();
        com.google.android.gms.internal.ads.zzfki zzfkiVar = null;
        while (jsonReader.hasNext()) {
            java.lang.String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    java.lang.String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new java.util.ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new com.google.android.gms.internal.ads.zzfkf(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        zzfkiVar = new com.google.android.gms.internal.ads.zzfki(jsonReader);
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcO)).booleanValue() && bundle != null) {
                            bundle.putLong(com.google.android.gms.internal.ads.zzdyu.NORMALIZATION_AD_RESPONSE_START.zza(), zzfkiVar.zzs);
                            bundle.putLong(com.google.android.gms.internal.ads.zzdyu.NORMALIZATION_AD_RESPONSE_END.zza(), zzfkiVar.zzt);
                        }
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    java.lang.String str = null;
                    org.json.JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        java.lang.String nextName3 = jsonReader.nextName();
                        if ("name".equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new com.google.android.gms.internal.ads.zzfko(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.zzc = arrayList;
        this.zza = emptyList;
        this.zzb = zzfkiVar == null ? new com.google.android.gms.internal.ads.zzfki(new android.util.JsonReader(new java.io.StringReader("{}"))) : zzfkiVar;
    }

    public static com.google.android.gms.internal.ads.zzfkp zza(java.io.Reader reader, android.os.Bundle bundle) throws com.google.android.gms.internal.ads.zzfkj {
        try {
            try {
                return new com.google.android.gms.internal.ads.zzfkp(new android.util.JsonReader(reader), bundle);
            } finally {
                com.google.android.gms.common.util.IOUtils.closeQuietly(reader);
            }
        } catch (java.io.IOException | java.lang.AssertionError | java.lang.IllegalStateException | java.lang.NumberFormatException | org.json.JSONException e) {
            throw new com.google.android.gms.internal.ads.zzfkj("unable to parse ServerResponse", e);
        }
    }
}
