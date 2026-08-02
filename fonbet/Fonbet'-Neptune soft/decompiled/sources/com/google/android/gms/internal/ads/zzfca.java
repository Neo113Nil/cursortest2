package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.firebase.messaging.Constants;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes3.dex */
public final class zzfca {
    public final zzbxx zzA;
    public final String zzB;
    public final JSONObject zzC;
    public final JSONObject zzD;
    public final String zzE;
    public final String zzF;
    public final String zzG;
    public final String zzH;
    public final String zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final int zzQ;
    public final int zzR;
    public final boolean zzS;
    public final boolean zzT;
    public final String zzU;
    public final zzfcz zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final int zzY;
    public final String zzZ;
    public final List zza;
    public final List zzaA;
    public final boolean zzaB;
    public final boolean zzaC;
    public final int zzaa;
    public final String zzab;
    public final boolean zzac;
    public final zzbtw zzad;
    public final com.google.android.gms.ads.internal.client.zzt zzae;
    public final String zzaf;
    public final boolean zzag;
    public final JSONObject zzah;
    public final boolean zzai;
    public final JSONObject zzaj;
    public final boolean zzak;
    public final String zzal;
    public final boolean zzam;
    public final String zzan;
    public final String zzao;
    public final String zzap;
    public final boolean zzaq;
    public final boolean zzar;
    public final int zzas;
    public final String zzat;
    public final List zzau;
    public final boolean zzav;
    public final Map zzaw;
    public final com.google.android.gms.ads.internal.util.client.zzv zzax;
    public final com.google.android.gms.ads.internal.util.client.zzw zzay;
    public final double zzaz;
    public final int zzb;
    public final List zzc;
    public final List zzd;
    public final int zze;
    public final List zzf;
    public final List zzg;
    public final List zzh;
    public final List zzi;
    public final String zzj;
    public final String zzk;
    public final zzbwo zzl;
    public final List zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final int zzq;
    public final List zzr;
    public final zzfcf zzs;
    public final List zzt;
    public final List zzu;
    public final JSONObject zzv;
    public final String zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v118, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v194, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v25, types: [java.util.List] */
    zzfca(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException {
        List list;
        List list2;
        List list3 = Collections.EMPTY_LIST;
        List list4 = Collections.EMPTY_LIST;
        List list5 = Collections.EMPTY_LIST;
        List list6 = Collections.EMPTY_LIST;
        List list7 = Collections.EMPTY_LIST;
        List list8 = Collections.EMPTY_LIST;
        List list9 = Collections.EMPTY_LIST;
        List list10 = Collections.EMPTY_LIST;
        List list11 = Collections.EMPTY_LIST;
        List list12 = Collections.EMPTY_LIST;
        List list13 = Collections.EMPTY_LIST;
        List list14 = Collections.EMPTY_LIST;
        List list15 = Collections.EMPTY_LIST;
        List list16 = Collections.EMPTY_LIST;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzfyq.zzn();
        zzfyq zzn = zzfyq.zzn();
        HashMap hashMap = new HashMap();
        zzfyq zzn2 = zzfyq.zzn();
        zzfyq.zzn();
        jsonReader.beginObject();
        JSONObject jSONObject7 = jSONObject2;
        JSONObject jSONObject8 = jSONObject3;
        JSONObject jSONObject9 = jSONObject4;
        JSONObject jSONObject10 = jSONObject5;
        JSONObject jSONObject11 = jSONObject6;
        zzfyq zzfyqVar = zzn;
        HashMap hashMap2 = hashMap;
        zzfyq zzfyqVar2 = zzn2;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i2 = 0;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        int i3 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        int i4 = 0;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        double d = 0.0d;
        zzfcf zzfcfVar = null;
        zzbxx zzbxxVar = null;
        zzbtw zzbtwVar = null;
        com.google.android.gms.ads.internal.client.zzt zztVar = null;
        String str = null;
        com.google.android.gms.ads.internal.util.client.zzv zzvVar = null;
        com.google.android.gms.ads.internal.util.client.zzw zzwVar = null;
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        String str6 = str5;
        String str7 = str6;
        String str8 = str7;
        String str9 = str8;
        String str10 = str9;
        String str11 = str10;
        String str12 = str11;
        String str13 = str12;
        String str14 = str13;
        String str15 = str14;
        String str16 = str15;
        String str17 = str16;
        String str18 = str17;
        String str19 = str18;
        int i5 = -1;
        int i6 = -1;
        List list17 = list13;
        List list18 = list14;
        List list19 = list15;
        List list20 = list16;
        JSONObject jSONObject12 = jSONObject;
        int i7 = 0;
        int i8 = 0;
        zzbwo zzbwoVar = null;
        String str20 = str19;
        String str21 = str20;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str22 = nextName == null ? "" : nextName;
            switch (str22.hashCode()) {
                case -2138196627:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("ad_source_instance_name")) {
                        str14 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1980587809:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("debug_signals")) {
                        jSONObject7 = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1965512151:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("omid_settings")) {
                        jSONObject9 = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1964744830:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("offline_ad_config")) {
                        if (((Boolean) zzbde.zziX.zzk()).booleanValue()) {
                            zzwVar = com.google.android.gms.ads.internal.util.client.zzw.zzd(com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader));
                        } else {
                            jsonReader.skipValue();
                        }
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1871425831:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("recursive_server_response_data")) {
                        str17 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1843156475:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("is_consent")) {
                        z18 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1840512279:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("presentation_urls")) {
                        zzfyqVar2 = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1828733410:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("network_ping_config")) {
                        if (((Boolean) zzbde.zziV.zzk()).booleanValue()) {
                            zzvVar = com.google.android.gms.ads.internal.util.client.zzv.zza(com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader));
                        } else {
                            jsonReader.skipValue();
                        }
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1812055556:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("play_prewarm_options")) {
                        zzbtwVar = zzbtw.zza(com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader));
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1785028569:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("parallel_key")) {
                        str19 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1776946669:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("ad_source_name")) {
                        str12 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1662989631:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("is_interscroller")) {
                        z12 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1620470467:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("backend_query_id")) {
                        str9 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1550155393:
                    list = list11;
                    list2 = list12;
                    if (!str22.equals("nofill_urls")) {
                        jsonReader.skipValue();
                        list12 = list2;
                        list11 = list;
                        break;
                    } else {
                        list11 = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                        list12 = list2;
                        break;
                    }
                case -1440104884:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("is_custom_close_blocked")) {
                        z6 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1439500848:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("orientation")) {
                        i5 = zzd(jsonReader.nextString());
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1428969291:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("enable_omid")) {
                        z8 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1406227629:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("buffer_click_url_as_ready_to_ping")) {
                        z16 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1403779768:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("showable_impression_type")) {
                        i3 = jsonReader.nextInt();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1375413093:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("ad_cover")) {
                        jSONObject10 = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1360811658:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("ad_sizes")) {
                        list20 = zzfcb.zza(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1306015996:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("adapters")) {
                        list19 = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1303332046:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("test_mode_enabled")) {
                        z5 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1289032093:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("extras")) {
                        jSONObject8 = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1240082064:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("ad_event_value")) {
                        zztVar = com.google.android.gms.ads.internal.client.zzt.zza(com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader));
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1234181075:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("allow_pub_rendered_attribution")) {
                        z = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1168140544:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("presentation_error_urls")) {
                        list12 = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1152230954:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("ad_type")) {
                        i8 = zzc(jsonReader.nextString());
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1146534047:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("is_scroll_aware")) {
                        z10 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1115838944:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("fill_urls")) {
                        list10 = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1081936678:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("allocation_id")) {
                        str2 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1078050970:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("video_complete_urls")) {
                        list9 = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -1051269058:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("active_view")) {
                        str5 = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader).toString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -982608540:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("valid_from_timestamp")) {
                        str20 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -972056451:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("ad_source_instance_id")) {
                        str15 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -776859333:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("click_urls")) {
                        list4 = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -652881372:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("on_device_storage_configs")) {
                        if (((Boolean) zzbde.zzie.zzk()).booleanValue()) {
                            zzfcg.zza(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -570101180:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("late_load_urls")) {
                        zzfyqVar = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -544216775:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("safe_browsing")) {
                        zzbxxVar = zzbxx.zza(com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader));
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -437057161:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("imp_urls")) {
                        list5 = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -404433734:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("rtb_native_required_assets")) {
                        jSONObject11 = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -404326515:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("render_timeout_ms")) {
                        i2 = jsonReader.nextInt();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -397704715:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("ad_close_time_ms")) {
                        i6 = jsonReader.nextInt();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -388807511:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("content_url")) {
                        str = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -369773488:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("is_close_button_enabled")) {
                        jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -213449460:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("force_disable_hardware_acceleration")) {
                        z15 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -213424028:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("watermark")) {
                        str8 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -180214626:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("native_required_asset_viewability")) {
                        z14 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -154616268:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("is_offline_ad")) {
                        z13 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case -29338502:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("allow_custom_click_gesture")) {
                        z3 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 3107:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("ad")) {
                        zzfcfVar = new zzfcf(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    } else {
                        jsonReader.skipValue();
                        list12 = list2;
                        list11 = list;
                    }
                case 3355:
                    list = list11;
                    list2 = list12;
                    if (str22.equals(FacebookMediationAdapter.KEY_ID)) {
                        str3 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 3076010:
                    list = list11;
                    list2 = list12;
                    if (str22.equals(Constants.ScionAnalytics.MessageType.DATA_MESSAGE)) {
                        jSONObject12 = com.google.android.gms.ads.internal.util.zzbs.zzi(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 37109963:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("request_id")) {
                        str16 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 63195984:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("render_test_label")) {
                        z4 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 107433883:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("qdata")) {
                        str4 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 230323073:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("ad_load_urls")) {
                        list6 = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 418392395:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("is_closable_area_disabled")) {
                        z7 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 542250332:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("consent_form_action_identifier")) {
                        i4 = jsonReader.nextInt();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 549176928:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("presentation_error_timeout_ms")) {
                        i = jsonReader.nextInt();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 597473788:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("debug_dialog_string")) {
                        str6 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 754887508:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("container_sizes")) {
                        list18 = zzfcb.zza(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 791122864:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("impression_type")) {
                        i7 = zze(jsonReader.nextInt());
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 805095541:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("analytics_event_name_to_parameters_map")) {
                        if (((Boolean) zzbde.zzas.zzk()).booleanValue()) {
                            hashMap2 = com.google.android.gms.ads.internal.util.zzbs.zze(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1010584092:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("transaction_id")) {
                        str21 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1100650276:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("rewards")) {
                        zzbwoVar = zzbwo.zza(com.google.android.gms.ads.internal.util.zzbs.zzf(jsonReader));
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1141602460:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("adapter_response_info_key")) {
                        str18 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1186014765:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("cache_hit_urls")) {
                        com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1303622534:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("preload_sort_value")) {
                        d = jsonReader.nextDouble();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1321720943:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("allow_pub_owned_ad_view")) {
                        z2 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1422388341:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("is_collapsible")) {
                        z17 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1437255331:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("ad_source_id")) {
                        str13 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1565514205:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("adapter_only_third_party_impression")) {
                        z21 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1637553475:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("bid_response")) {
                        str7 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1638957285:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("video_start_urls")) {
                        list7 = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1686319423:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("ad_network_class_name")) {
                        str11 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1688341040:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("video_reward_urls")) {
                        list8 = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1799285870:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("use_third_party_container_height")) {
                        z11 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1839650832:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("renderers")) {
                        list3 = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 1875425491:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("is_analytics_logging_enabled")) {
                        z9 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 2068142375:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("rule_line_external_id")) {
                        str10 = jsonReader.nextString();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 2072888499:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("manual_tracking_urls")) {
                        list17 = com.google.android.gms.ads.internal.util.zzbs.zzd(jsonReader);
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 2075506442:
                    list = list11;
                    list2 = list12;
                    if (str22.equals("render_serially")) {
                        z19 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                case 2117205836:
                    list2 = list12;
                    list = list11;
                    if (str22.equals("flow_control")) {
                        z20 = jsonReader.nextBoolean();
                        list12 = list2;
                        list11 = list;
                        break;
                    }
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                default:
                    list = list11;
                    list2 = list12;
                    jsonReader.skipValue();
                    list12 = list2;
                    list11 = list;
                    break;
            }
        }
        jsonReader.endObject();
        this.zza = list3;
        this.zzb = i8;
        this.zzc = list4;
        this.zzd = list5;
        this.zzf = list6;
        this.zze = i7;
        this.zzg = list7;
        this.zzh = list8;
        this.zzi = list9;
        this.zzj = str21;
        this.zzk = str20;
        this.zzl = zzbwoVar;
        this.zzm = list10;
        this.zzn = list11;
        this.zzo = list12;
        this.zzp = list17;
        this.zzq = i;
        this.zzr = list18;
        this.zzs = zzfcfVar;
        this.zzt = list19;
        this.zzu = list20;
        this.zzw = str2;
        this.zzv = jSONObject12;
        this.zzx = str3;
        this.zzy = str4;
        this.zzz = str5;
        this.zzA = zzbxxVar;
        this.zzB = str6;
        this.zzC = jSONObject7;
        this.zzD = jSONObject8;
        this.zzJ = z;
        this.zzK = z2;
        this.zzL = z3;
        this.zzM = z4;
        this.zzN = z5;
        this.zzO = z6;
        this.zzP = z7;
        this.zzQ = i5;
        this.zzR = i2;
        this.zzT = z8;
        this.zzU = str7;
        this.zzV = new zzfcz(jSONObject9);
        this.zzW = z9;
        this.zzX = z10;
        this.zzY = i3;
        this.zzZ = str8;
        this.zzaa = i6;
        this.zzab = str9;
        this.zzac = z11;
        this.zzad = zzbtwVar;
        this.zzae = zztVar;
        this.zzaf = str10;
        this.zzag = z12;
        this.zzah = jSONObject10;
        this.zzE = str11;
        this.zzF = str12;
        this.zzG = str13;
        this.zzH = str14;
        this.zzI = str15;
        this.zzai = z13;
        this.zzaj = jSONObject11;
        this.zzak = z14;
        this.zzal = str;
        this.zzam = z15;
        this.zzS = z16;
        this.zzan = str16;
        this.zzao = str17;
        this.zzap = str18;
        this.zzaq = z17;
        this.zzar = z18;
        this.zzas = i4;
        this.zzau = zzfyqVar;
        this.zzat = str19;
        this.zzav = z19;
        this.zzaw = hashMap2;
        this.zzax = zzvVar;
        this.zzay = zzwVar;
        this.zzaz = d;
        this.zzaA = zzfyqVar2;
        this.zzaB = z20;
        this.zzaC = z21;
    }

    public static String zza(int i) {
        switch (i) {
            case 1:
                return "BANNER";
            case 2:
                return "INTERSTITIAL";
            case 3:
                return "NATIVE_EXPRESS";
            case 4:
                return "NATIVE";
            case 5:
                return "REWARDED";
            case 6:
                return "APP_OPEN_AD";
            case 7:
                return "REWARDED_INTERSTITIAL";
            default:
                return "UNKNOWN";
        }
    }

    private static int zzc(String str) {
        if ("banner".equals(str)) {
            return 1;
        }
        if ("interstitial".equals(str)) {
            return 2;
        }
        if ("native_express".equals(str)) {
            return 3;
        }
        if ("native".equals(str)) {
            return 4;
        }
        if ("rewarded".equals(str)) {
            return 5;
        }
        if ("app_open_ad".equals(str)) {
            return 6;
        }
        return "rewarded_interstitial".equals(str) ? 7 : 0;
    }

    private static int zzd(String str) {
        if ("landscape".equalsIgnoreCase(str)) {
            return 6;
        }
        return "portrait".equalsIgnoreCase(str) ? 7 : -1;
    }

    private static int zze(int i) {
        if (i == 0 || i == 1 || i == 3 || i == 4) {
            return i;
        }
        return 0;
    }

    public final boolean zzb() {
        return this.zzai || this.zzay != null;
    }
}
