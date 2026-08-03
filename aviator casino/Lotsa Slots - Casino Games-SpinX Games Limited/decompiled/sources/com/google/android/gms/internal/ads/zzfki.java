package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfki {
    public final java.util.List zza;
    public final java.lang.String zzb;
    public final int zzc;
    public final int zzd;
    public final java.lang.String zze;
    public final int zzf;
    public final long zzg;
    public final boolean zzh;
    public final java.lang.String zzi;
    public final com.google.android.gms.internal.ads.zzfkh zzj;
    public final android.os.Bundle zzk;
    public final java.lang.String zzl;
    public final java.lang.String zzm;
    public final java.lang.String zzn;
    public final org.json.JSONObject zzo;
    public final org.json.JSONObject zzp;
    public final java.lang.String zzq;
    public final int zzr;
    public long zzs;
    public long zzt;

    zzfki(android.util.JsonReader jsonReader) throws java.lang.IllegalStateException, java.io.IOException, org.json.JSONException, java.lang.NumberFormatException {
        java.util.List emptyList = java.util.Collections.emptyList();
        android.os.Bundle bundle = new android.os.Bundle();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        jsonReader.beginObject();
        java.lang.String str = "";
        java.lang.String str2 = "";
        java.lang.String str3 = str2;
        java.lang.String str4 = str3;
        java.lang.String str5 = str4;
        java.lang.String str6 = str5;
        com.google.android.gms.internal.ads.zzfkh zzfkhVar = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        long j = -1;
        long j2 = -1;
        long j3 = 0;
        int i3 = -1;
        int i4 = 1;
        java.lang.String str7 = str6;
        while (jsonReader.hasNext()) {
            java.lang.String nextName = jsonReader.nextName();
            if (java.util.Objects.equals(nextName, "nofill_urls")) {
                emptyList = com.google.android.gms.ads.internal.util.zzbp.zzb(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i = jsonReader.nextInt();
            } else if (java.util.Objects.equals(nextName, "refresh_load_delay_time_interval")) {
                i3 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str2 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i2 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j3 = jsonReader.nextLong();
            } else {
                java.lang.String str8 = str4;
                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzjB)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == android.util.JsonToken.BEGIN_OBJECT) {
                    zzfkhVar = new com.google.android.gms.internal.ads.zzfkh(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str7 = jsonReader.nextString();
                } else {
                    if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzlP)).booleanValue() && java.util.Objects.equals(nextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(nextName)) {
                        str4 = jsonReader.nextString();
                    } else if ("response_info_extras".equals(nextName)) {
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhK)).booleanValue()) {
                            try {
                                try {
                                    android.os.Bundle zzl = com.google.android.gms.ads.internal.util.zzbp.zzl(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                                    if (zzl != null) {
                                        bundle = zzl;
                                    }
                                } catch (java.lang.IllegalStateException unused) {
                                    jsonReader.skipValue();
                                }
                            } catch (java.io.IOException | org.json.JSONException unused2) {
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(nextName)) {
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkH)).booleanValue()) {
                            str6 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestUrl".equals(nextName)) {
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkH)).booleanValue()) {
                            str5 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else {
                        com.google.android.gms.internal.ads.zzbih zzbihVar = com.google.android.gms.internal.ads.zzbiq.zzkI;
                        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue() && java.util.Objects.equals(nextName, "adResponseBody")) {
                            str3 = jsonReader.nextString();
                        } else if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbihVar)).booleanValue() && java.util.Objects.equals(nextName, "adResponseHeaders")) {
                            jSONObject = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                        } else if (java.util.Objects.equals(nextName, "max_parallel_renderers")) {
                            i4 = java.lang.Math.max(1, jsonReader.nextInt());
                        } else {
                            if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzkQ)).booleanValue() && java.util.Objects.equals(nextName, "inspector_ad_transaction_extras")) {
                                jSONObject2 = com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader);
                            } else {
                                if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcO)).booleanValue() && java.util.Objects.equals(nextName, "latency_extras")) {
                                    try {
                                        android.os.Bundle zzl2 = com.google.android.gms.ads.internal.util.zzbp.zzl(com.google.android.gms.ads.internal.util.zzbp.zzd(jsonReader));
                                        if (zzl2 != null) {
                                            j2 = zza(zzl2.getDouble("start_time"));
                                            j = zza(zzl2.getDouble("end_time"));
                                        }
                                    } catch (java.lang.IllegalStateException unused3) {
                                        jsonReader.skipValue();
                                    }
                                } else {
                                    jsonReader.skipValue();
                                }
                            }
                        }
                    }
                }
                str4 = str8;
            }
        }
        java.lang.String str9 = str4;
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzc = i;
        if (((java.lang.Boolean) com.google.android.gms.internal.ads.zzbkw.zzd.zze()).booleanValue()) {
            this.zzd = -1;
        } else {
            com.google.android.gms.internal.ads.zzbka zzbkaVar = com.google.android.gms.internal.ads.zzbke.zza;
            if (((java.lang.Long) zzbkaVar.zze()).longValue() > -1) {
                this.zzd = ((java.lang.Long) zzbkaVar.zze()).intValue();
            } else {
                this.zzd = i3;
            }
        }
        this.zzb = str;
        this.zze = str2;
        this.zzf = i2;
        this.zzg = j3;
        this.zzj = zzfkhVar;
        this.zzh = z;
        this.zzi = str7;
        this.zzk = bundle;
        this.zzl = str5;
        this.zzm = str6;
        this.zzn = str3;
        this.zzo = jSONObject;
        this.zzp = jSONObject2;
        this.zzq = str9;
        com.google.android.gms.internal.ads.zzbka zzbkaVar2 = com.google.android.gms.internal.ads.zzbku.zza;
        this.zzr = ((java.lang.Long) zzbkaVar2.zze()).longValue() > 0 ? ((java.lang.Long) zzbkaVar2.zze()).intValue() : i4;
        this.zzs = j2;
        this.zzt = j;
    }

    private static final long zza(double d) {
        if (d > 9.223372036854776E18d || d < -9.223372036854776E18d) {
            return -1L;
        }
        return (long) d;
    }
}
