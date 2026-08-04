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

/* JADX INFO: loaded from: classes.dex */
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

    public zzfai(JsonReader jsonReader) throws JSONException, IOException {
        List listEmptyList = Collections.emptyList();
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jsonReader.beginObject();
        String strNextString = "";
        String strNextString2 = "";
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        int iNextInt = 0;
        int iNextInt2 = 0;
        boolean zNextBoolean = false;
        zzfah zzfahVar = null;
        long jZza = -1;
        long jZza2 = -1;
        long jNextLong = 0;
        int iNextInt3 = -1;
        int iMax = 1;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if (Objects.equals(strNextName, "nofill_urls")) {
                listEmptyList = D.C0(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if (Objects.equals(strNextName, "refresh_load_delay_time_interval")) {
                iNextInt3 = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString6 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if ("response_code".equals(strNextName)) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("latency".equals(strNextName)) {
                jNextLong = jsonReader.nextLong();
            } else {
                zzbbp zzbbpVar = zzbby.zzin;
                String str = strNextString3;
                C0254t c0254t = C0254t.f2723d;
                JSONObject jSONObject3 = jSONObject2;
                if (((Boolean) c0254t.f2726c.zzb(zzbbpVar)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    zzfahVar = new zzfah(jsonReader);
                } else if ("bidding_data".equals(strNextName)) {
                    strNextString7 = jsonReader.nextString();
                } else {
                    zzbbp zzbbpVar2 = zzbby.zzkt;
                    zzbbw zzbbwVar = c0254t.f2726c;
                    if (((Boolean) zzbbwVar.zzb(zzbbpVar2)).booleanValue() && Objects.equals(strNextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else if ("adapter_response_replacement_key".equals(strNextName)) {
                        strNextString3 = jsonReader.nextString();
                        jSONObject2 = jSONObject3;
                    } else if ("response_info_extras".equals(strNextName)) {
                        if (((Boolean) zzbbwVar.zzb(zzbby.zzgJ)).booleanValue()) {
                            try {
                                Bundle bundleY0 = D.y0(D.F0(jsonReader));
                                if (bundleY0 != null) {
                                    bundle = bundleY0;
                                }
                            } catch (IOException | JSONException unused) {
                                strNextString3 = str;
                                jSONObject2 = jSONObject3;
                            } catch (IllegalStateException unused2) {
                                jsonReader.skipValue();
                                strNextString3 = str;
                                jSONObject2 = jSONObject3;
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if ("adRequestPostBody".equals(strNextName)) {
                        if (((Boolean) zzbbwVar.zzb(zzbby.zzjn)).booleanValue()) {
                            strNextString5 = jsonReader.nextString();
                        } else {
                            jsonReader.skipValue();
                        }
                    } else if (!"adRequestUrl".equals(strNextName)) {
                        zzbbp zzbbpVar3 = zzbby.zzjo;
                        if (((Boolean) zzbbwVar.zzb(zzbbpVar3)).booleanValue() && Objects.equals(strNextName, "adResponseBody")) {
                            strNextString2 = jsonReader.nextString();
                        } else if (((Boolean) zzbbwVar.zzb(zzbbpVar3)).booleanValue() && Objects.equals(strNextName, "adResponseHeaders")) {
                            jSONObject = D.F0(jsonReader);
                        } else {
                            if (Objects.equals(strNextName, "max_parallel_renderers")) {
                                iMax = Math.max(1, jsonReader.nextInt());
                            } else if (((Boolean) zzbbwVar.zzb(zzbby.zzjv)).booleanValue() && Objects.equals(strNextName, "inspector_ad_transaction_extras")) {
                                jSONObject2 = D.F0(jsonReader);
                                strNextString3 = str;
                            } else if (((Boolean) zzbbwVar.zzb(zzbby.zzcp)).booleanValue() && Objects.equals(strNextName, "latency_extras")) {
                                try {
                                    Bundle bundleY1 = D.y0(D.F0(jsonReader));
                                    if (bundleY1 != null) {
                                        jZza2 = zza(bundleY1.getDouble("start_time"));
                                        jZza = zza(bundleY1.getDouble("end_time"));
                                    }
                                } catch (IOException | JSONException unused3) {
                                } catch (IllegalStateException unused4) {
                                    jsonReader.skipValue();
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                            strNextString3 = str;
                            jSONObject2 = jSONObject3;
                        }
                    } else if (((Boolean) zzbbwVar.zzb(zzbby.zzjn)).booleanValue()) {
                        strNextString4 = jsonReader.nextString();
                    } else {
                        jsonReader.skipValue();
                    }
                    strNextString3 = str;
                    jSONObject2 = jSONObject3;
                }
                strNextString3 = str;
                jSONObject2 = jSONObject3;
            }
        }
        JSONObject jSONObject4 = jSONObject2;
        String str2 = strNextString3;
        jsonReader.endObject();
        this.zza = listEmptyList;
        this.zzc = iNextInt;
        if (((Boolean) zzbee.zzc.zze()).booleanValue()) {
            this.zzd = -1;
        } else {
            zzbdi zzbdiVar = zzbdm.zza;
            if (((Long) zzbdiVar.zze()).longValue() > -1) {
                this.zzd = ((Long) zzbdiVar.zze()).intValue();
            } else {
                this.zzd = iNextInt3;
            }
        }
        this.zzb = strNextString;
        this.zze = strNextString6;
        this.zzf = iNextInt2;
        this.zzg = jNextLong;
        this.zzj = zzfahVar;
        this.zzh = zNextBoolean;
        this.zzi = strNextString7;
        this.zzk = bundle;
        this.zzl = strNextString4;
        this.zzm = strNextString5;
        this.zzn = strNextString2;
        this.zzo = jSONObject;
        this.zzp = jSONObject4;
        this.zzq = str2;
        zzbdi zzbdiVar2 = zzbec.zza;
        this.zzr = ((Long) zzbdiVar2.zze()).longValue() > 0 ? ((Long) zzbdiVar2.zze()).intValue() : iMax;
        this.zzs = jZza2;
        this.zzt = jZza;
    }

    private static final long zza(double d7) {
        if (d7 > 9.223372036854776E18d || d7 < -9.223372036854776E18d) {
            return -1L;
        }
        return (long) d7;
    }
}
