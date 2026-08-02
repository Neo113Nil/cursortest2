package com.google.android.gms.internal.ads;

import F2.C0254t;
import Y4.D;
import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfai {
    public final List zza;
    public final String zzb;
    public final int zzc;
    public final int zzd;
    public final String zze;
    public final int zzf;
    public final long zzg;
    public final boolean zzh;
    public final String zzi;
    public final zzfah zzj;
    public final Bundle zzk;
    public final String zzl;
    public final String zzm;
    public final String zzn;
    public final JSONObject zzo;
    public final JSONObject zzp;
    public final String zzq;
    public final int zzr;
    public long zzs;
    public long zzt;

    public zzfai(JsonReader jsonReader) {
        List emptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String str = "";
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        int i7 = 0;
        int i8 = 0;
        boolean z4 = false;
        zzfah zzfahVar = null;
        long j = -1;
        long j3 = -1;
        long j7 = 0;
        int i9 = -1;
        int i10 = 1;
        String str6 = str5;
        String str7 = str6;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if (Objects.equals(nextName, "nofill_urls")) {
                emptyList = D.C0(jsonReader);
            } else if ("refresh_interval".equals(nextName)) {
                i7 = jsonReader.nextInt();
            } else if (Objects.equals(nextName, "refresh_load_delay_time_interval")) {
                i9 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(nextName)) {
                str = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(nextName)) {
                str6 = jsonReader.nextString();
            } else if ("is_idless".equals(nextName)) {
                z4 = jsonReader.nextBoolean();
            } else if ("response_code".equals(nextName)) {
                i8 = jsonReader.nextInt();
            } else if ("latency".equals(nextName)) {
                j7 = jsonReader.nextLong();
            } else {
                zzbbp zzbbpVar = zzbby.zzin;
                String str8 = str3;
                C0254t c0254t = C0254t.f2723d;
                JSONObject jSONObject3 = jSONObject2;
                if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && "public_error".equals(nextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    zzfahVar = new zzfah(jsonReader);
                } else if ("bidding_data".equals(nextName)) {
                    str7 = jsonReader.nextString();
                } else {
                    zzbbp zzbbpVar2 = zzbby.zzkt;
                    zzbbw zzbbwVar = c0254t.f2726c;
                    if (((Boolean) zzbbwVar.zzb(zzbbpVar2)).booleanValue() && Objects.equals(nextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(nextName)) {
                        str3 = jsonReader.nextString();
                        jSONObject2 = jSONObject3;
                    } else if ("response_info_extras".equals(nextName)) {
                        if (((Boolean) zzbbwVar.zzb(zzbby.zzgJ)).booleanValue()) {
                            try {
                                Bundle y02 = D.y0(D.F0(jsonReader));
                                if (y02 != null) {
                                    bundle = y02;
                                }
                            } catch (IOException | JSONException unused) {
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(nextName)) {
                        if (((Boolean) zzbbwVar.zzb(zzbby.zzjn)).booleanValue()) {
                            str5 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (!"adRequestUrl".equals(nextName)) {
                        zzbbp zzbbpVar3 = zzbby.zzjo;
                        if (((Boolean) zzbbwVar.zzb(zzbbpVar3)).booleanValue() && Objects.equals(nextName, "adResponseBody")) {
                            str2 = jsonReader.nextString();
                        } else if (((Boolean) zzbbwVar.zzb(zzbbpVar3)).booleanValue() && Objects.equals(nextName, "adResponseHeaders")) {
                            jSONObject = D.F0(jsonReader);
                        } else {
                            if (Objects.equals(nextName, "max_parallel_renderers")) {
                                i10 = Math.max(1, jsonReader.nextInt());
                            } else if (((Boolean) zzbbwVar.zzb(zzbby.zzjv)).booleanValue() && Objects.equals(nextName, "inspector_ad_transaction_extras")) {
                                jSONObject2 = D.F0(jsonReader);
                                str3 = str8;
                            } else if (((Boolean) zzbbwVar.zzb(zzbby.zzcp)).booleanValue() && Objects.equals(nextName, "latency_extras")) {
                                try {
                                    Bundle y03 = D.y0(D.F0(jsonReader));
                                    if (y03 != null) {
                                        j3 = zza(y03.getDouble("start_time"));
                                        j = zza(y03.getDouble("end_time"));
                                    }
                                } catch (IOException | JSONException unused3) {
                                } catch (IllegalStateException unused4) {
                                    jsonReader.skipValue();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            str3 = str8;
                            jSONObject2 = jSONObject3;
                        }
                    } else if (((Boolean) zzbbwVar.zzb(zzbby.zzjn)).booleanValue()) {
                        str4 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    str3 = str8;
                    jSONObject2 = jSONObject3;
                }
                str3 = str8;
                jSONObject2 = jSONObject3;
            }
        }
        JSONObject jSONObject4 = jSONObject2;
        String str9 = str3;
        jsonReader.endObject();
        this.zza = emptyList;
        this.zzc = i7;
        if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
            this.zzd = -1;
        } else {
            zzbdi zzbdiVar = zzbdm.zza;
            if (((Long) zzbdiVar.zze()).longValue() > -1) {
                this.zzd = ((Long) zzbdiVar.zze()).intValue();
            } else {
                this.zzd = i9;
            }
        }
        this.zzb = str;
        this.zze = str6;
        this.zzf = i8;
        this.zzg = j7;
        this.zzj = zzfahVar;
        this.zzh = z4;
        this.zzi = str7;
        this.zzk = bundle;
        this.zzl = str4;
        this.zzm = str5;
        this.zzn = str2;
        this.zzo = jSONObject;
        this.zzp = jSONObject4;
        this.zzq = str9;
        zzbdi zzbdiVar2 = zzbec.zza;
        this.zzr = ((Long) zzbdiVar2.zze()).longValue() > 0 ? ((Long) zzbdiVar2.zze()).intValue() : i10;
        this.zzs = j3;
        this.zzt = j;
    }

    private static final long zza(double d7) {
        if (d7 > 9.223372036854776E18d || d7 < -9.223372036854776E18d) {
            return -1L;
        }
        return (long) d7;
    }
}
