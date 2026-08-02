package com.google.android.gms.internal.ads;

import J2.h;
import J2.i;
import J2.o;
import J2.p;
import Y4.D;
import android.util.JsonReader;
import com.google.android.gms.internal.ads.zzbbd;
import io.sentry.ProfilingTraceData;
import io.sentry.protocol.Device;
import io.sentry.protocol.SentryStackFrame;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class zzfaf {
    public final zzbwv zzA;
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
    public final zzfbd zzV;
    public final boolean zzW;
    public final boolean zzX;
    public final int zzY;
    public final String zzZ;
    public final List zza;
    public final int zzaa;
    public final String zzab;
    public final boolean zzac;
    public final zzbsu zzad;
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
    public final o zzax;
    public final p zzay;
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
    public final zzbvm zzl;
    public final List zzm;
    public final List zzn;
    public final List zzo;
    public final List zzp;
    public final int zzq;
    public final List zzr;
    public final zzfak zzs;
    public final List zzt;
    public final List zzu;
    public final JSONObject zzv;
    public final String zzw;
    public final String zzx;
    public final String zzy;
    public final String zzz;

    public zzfaf(JsonReader jsonReader) {
        List list;
        char c3;
        List list2;
        List list3;
        List list4;
        List emptyList = Collections.emptyList();
        List emptyList2 = Collections.emptyList();
        List emptyList3 = Collections.emptyList();
        List emptyList4 = Collections.emptyList();
        List emptyList5 = Collections.emptyList();
        List emptyList6 = Collections.emptyList();
        List emptyList7 = Collections.emptyList();
        List emptyList8 = Collections.emptyList();
        List emptyList9 = Collections.emptyList();
        List emptyList10 = Collections.emptyList();
        List emptyList11 = Collections.emptyList();
        List emptyList12 = Collections.emptyList();
        List emptyList13 = Collections.emptyList();
        List emptyList14 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzfwh.zzn();
        List zzn = zzfwh.zzn();
        HashMap hashMap = new HashMap();
        jsonReader.beginObject();
        JSONObject jSONObject7 = jSONObject;
        JSONObject jSONObject8 = jSONObject2;
        JSONObject jSONObject9 = jSONObject3;
        JSONObject jSONObject10 = jSONObject4;
        JSONObject jSONObject11 = jSONObject5;
        JSONObject jSONObject12 = jSONObject6;
        List list5 = zzn;
        HashMap hashMap2 = hashMap;
        double d7 = 0.0d;
        zzbvm zzbvmVar = null;
        zzfak zzfakVar = null;
        zzbwv zzbwvVar = null;
        zzbsu zzbsuVar = null;
        com.google.android.gms.ads.internal.client.zzt zztVar = null;
        String str = null;
        o oVar = null;
        h hVar = null;
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
        String str20 = str19;
        String str21 = str20;
        int i7 = -1;
        int i8 = -1;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z4 = false;
        boolean z7 = false;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        int i12 = 0;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        int i13 = 0;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        boolean z19 = false;
        boolean z20 = false;
        boolean z21 = false;
        boolean z22 = false;
        boolean z23 = false;
        int i14 = 0;
        boolean z24 = false;
        List list6 = emptyList14;
        List list7 = emptyList13;
        List list8 = emptyList12;
        List list9 = emptyList11;
        List list10 = emptyList10;
        List list11 = emptyList9;
        List list12 = emptyList8;
        List list13 = emptyList7;
        List list14 = emptyList6;
        List list15 = emptyList5;
        List list16 = emptyList4;
        List list17 = emptyList3;
        List list18 = emptyList2;
        List list19 = emptyList;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            String str22 = nextName == null ? "" : nextName;
            switch (str22.hashCode()) {
                case -2138196627:
                    list = list6;
                    if (str22.equals("ad_source_instance_name")) {
                        c3 = ';';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1980587809:
                    list = list6;
                    if (str22.equals("debug_signals")) {
                        c3 = 28;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1965512151:
                    list = list6;
                    if (str22.equals("omid_settings")) {
                        c3 = ')';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1964744830:
                    list = list6;
                    if (str22.equals("offline_ad_config")) {
                        c3 = 'O';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1871425831:
                    list = list6;
                    if (str22.equals("recursive_server_response_data")) {
                        c3 = 'E';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1843156475:
                    list = list6;
                    if (str22.equals("is_consent")) {
                        c3 = 'G';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1828733410:
                    list = list6;
                    if (str22.equals("network_ping_config")) {
                        c3 = 'N';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1812055556:
                    list = list6;
                    if (str22.equals("play_prewarm_options")) {
                        c3 = '1';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1785028569:
                    list = list6;
                    if (str22.equals("parallel_key")) {
                        c3 = 'I';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1776946669:
                    list = list6;
                    if (str22.equals("ad_source_name")) {
                        c3 = '9';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1662989631:
                    list = list6;
                    if (str22.equals("is_interscroller")) {
                        c3 = '5';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1620470467:
                    list = list6;
                    if (str22.equals("backend_query_id")) {
                        c3 = '/';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1550155393:
                    list = list6;
                    if (str22.equals("nofill_urls")) {
                        c3 = '\r';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1440104884:
                    list = list6;
                    if (str22.equals("is_custom_close_blocked")) {
                        c3 = '#';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1439500848:
                    list = list6;
                    if (str22.equals(Device.JsonKeys.ORIENTATION)) {
                        c3 = '%';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1428969291:
                    list = list6;
                    if (str22.equals("enable_omid")) {
                        c3 = '\'';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1406227629:
                    list = list6;
                    if (str22.equals("buffer_click_url_as_ready_to_ping")) {
                        c3 = 'C';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1403779768:
                    list = list6;
                    if (str22.equals("showable_impression_type")) {
                        c3 = ',';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1375413093:
                    list = list6;
                    if (str22.equals("ad_cover")) {
                        c3 = '6';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1360811658:
                    list = list6;
                    if (str22.equals("ad_sizes")) {
                        c3 = 19;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1306015996:
                    list = list6;
                    if (str22.equals("adapters")) {
                        c3 = 20;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1303332046:
                    list = list6;
                    if (str22.equals("test_mode_enabled")) {
                        c3 = '\"';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1289032093:
                    list = list6;
                    if (str22.equals("extras")) {
                        c3 = 29;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1240082064:
                    list = list6;
                    if (str22.equals("ad_event_value")) {
                        c3 = '3';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1234181075:
                    list = list6;
                    if (str22.equals("allow_pub_rendered_attribution")) {
                        c3 = 30;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1168140544:
                    list = list6;
                    if (str22.equals("presentation_error_urls")) {
                        c3 = 14;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1152230954:
                    list = list6;
                    if (str22.equals("ad_type")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1146534047:
                    list = list6;
                    if (str22.equals("is_scroll_aware")) {
                        c3 = '+';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1115838944:
                    list = list6;
                    if (str22.equals("fill_urls")) {
                        c3 = '\f';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1081936678:
                    list = list6;
                    if (str22.equals("allocation_id")) {
                        c3 = 21;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1078050970:
                    list = list6;
                    if (str22.equals("video_complete_urls")) {
                        c3 = '\b';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -1051269058:
                    list = list6;
                    if (str22.equals("active_view")) {
                        c3 = 25;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -982608540:
                    list = list6;
                    if (str22.equals("valid_from_timestamp")) {
                        c3 = '\n';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -972056451:
                    list = list6;
                    if (str22.equals("ad_source_instance_id")) {
                        c3 = '<';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -776859333:
                    list = list6;
                    if (str22.equals("click_urls")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -570101180:
                    list = list6;
                    if (str22.equals("late_load_urls")) {
                        c3 = 'J';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -544216775:
                    list = list6;
                    if (str22.equals("safe_browsing")) {
                        c3 = 26;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -437057161:
                    list = list6;
                    if (str22.equals("imp_urls")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                case -404433734:
                    list = list6;
                    if (str22.equals("rtb_native_required_assets")) {
                        c3 = '>';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -404326515:
                    list = list6;
                    if (str22.equals("render_timeout_ms")) {
                        c3 = '&';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -397704715:
                    list = list6;
                    if (str22.equals("ad_close_time_ms")) {
                        c3 = '-';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -388807511:
                    list = list6;
                    if (str22.equals("content_url")) {
                        c3 = '@';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -369773488:
                    list = list6;
                    if (str22.equals("is_close_button_enabled")) {
                        c3 = '2';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -213449460:
                    list = list6;
                    if (str22.equals("force_disable_hardware_acceleration")) {
                        c3 = 'A';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -213424028:
                    list = list6;
                    if (str22.equals("watermark")) {
                        c3 = '.';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -180214626:
                    list = list6;
                    if (str22.equals("native_required_asset_viewability")) {
                        c3 = '?';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -154616268:
                    list = list6;
                    if (str22.equals("is_offline_ad")) {
                        c3 = '=';
                        break;
                    }
                    c3 = 65535;
                    break;
                case -29338502:
                    list = list6;
                    if (str22.equals("allow_custom_click_gesture")) {
                        c3 = ' ';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3107:
                    list = list6;
                    if (str22.equals("ad")) {
                        c3 = 18;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3355:
                    list = list6;
                    if (str22.equals("id")) {
                        c3 = 23;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3076010:
                    list = list6;
                    if (str22.equals("data")) {
                        c3 = 22;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 37109963:
                    list = list6;
                    if (str22.equals("request_id")) {
                        c3 = 'D';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 63195984:
                    list = list6;
                    if (str22.equals("render_test_label")) {
                        c3 = '!';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 107433883:
                    list = list6;
                    if (str22.equals("qdata")) {
                        c3 = 24;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 230323073:
                    list = list6;
                    if (str22.equals("ad_load_urls")) {
                        c3 = 4;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 418392395:
                    list = list6;
                    if (str22.equals("is_closable_area_disabled")) {
                        c3 = '$';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 542250332:
                    list = list6;
                    if (str22.equals("consent_form_action_identifier")) {
                        c3 = 'H';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 549176928:
                    list = list6;
                    if (str22.equals("presentation_error_timeout_ms")) {
                        c3 = 16;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 597473788:
                    list = list6;
                    if (str22.equals("debug_dialog_string")) {
                        c3 = 27;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 754887508:
                    list = list6;
                    if (str22.equals("container_sizes")) {
                        c3 = 17;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 791122864:
                    list = list6;
                    if (str22.equals("impression_type")) {
                        c3 = 5;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 805095541:
                    list = list6;
                    if (str22.equals("analytics_event_name_to_parameters_map")) {
                        c3 = 'M';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1010584092:
                    list = list6;
                    if (str22.equals(ProfilingTraceData.JsonKeys.TRANSACTION_ID)) {
                        c3 = '\t';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1100650276:
                    list = list6;
                    if (str22.equals("rewards")) {
                        c3 = 11;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1141602460:
                    list = list6;
                    if (str22.equals("adapter_response_info_key")) {
                        c3 = '8';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1186014765:
                    list = list6;
                    if (str22.equals("cache_hit_urls")) {
                        c3 = 'B';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1303622534:
                    list = list6;
                    if (str22.equals("preload_sort_value")) {
                        c3 = 'L';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1321720943:
                    list = list6;
                    if (str22.equals("allow_pub_owned_ad_view")) {
                        c3 = 31;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1422388341:
                    list = list6;
                    if (str22.equals("is_collapsible")) {
                        c3 = 'F';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1437255331:
                    list = list6;
                    if (str22.equals("ad_source_id")) {
                        c3 = ':';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1637553475:
                    list = list6;
                    if (str22.equals("bid_response")) {
                        c3 = '(';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1638957285:
                    list = list6;
                    if (str22.equals("video_start_urls")) {
                        c3 = 6;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1686319423:
                    list = list6;
                    if (str22.equals("ad_network_class_name")) {
                        c3 = '7';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1688341040:
                    list = list6;
                    if (str22.equals("video_reward_urls")) {
                        c3 = 7;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1799285870:
                    list = list6;
                    if (str22.equals("use_third_party_container_height")) {
                        c3 = '0';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1839650832:
                    list = list6;
                    if (str22.equals("renderers")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 1875425491:
                    list = list6;
                    if (str22.equals("is_analytics_logging_enabled")) {
                        c3 = '*';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2068142375:
                    list = list6;
                    if (str22.equals("rule_line_external_id")) {
                        c3 = '4';
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2072888499:
                    list = list6;
                    if (str22.equals("manual_tracking_urls")) {
                        c3 = 15;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 2075506442:
                    list = list6;
                    if (str22.equals("render_serially")) {
                        c3 = 'K';
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    list = list6;
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                    list2 = list9;
                    list19 = D.C0(jsonReader);
                    list6 = list;
                    break;
                case 1:
                    list2 = list9;
                    i9 = zzc(jsonReader.nextString());
                    list6 = list;
                    break;
                case 2:
                    list2 = list9;
                    list18 = D.C0(jsonReader);
                    list6 = list;
                    break;
                case 3:
                    list2 = list9;
                    list17 = D.C0(jsonReader);
                    list6 = list;
                    break;
                case 4:
                    list2 = list9;
                    list16 = D.C0(jsonReader);
                    list6 = list;
                    break;
                case 5:
                    list2 = list9;
                    i10 = zze(jsonReader.nextInt());
                    list6 = list;
                    break;
                case 6:
                    list2 = list9;
                    list15 = D.C0(jsonReader);
                    list6 = list;
                    break;
                case 7:
                    list2 = list9;
                    list14 = D.C0(jsonReader);
                    list6 = list;
                    break;
                case '\b':
                    list2 = list9;
                    list13 = D.C0(jsonReader);
                    list6 = list;
                    break;
                case '\t':
                    list2 = list9;
                    str2 = jsonReader.nextString();
                    list6 = list;
                    break;
                case '\n':
                    list2 = list9;
                    str3 = jsonReader.nextString();
                    list6 = list;
                    break;
                case 11:
                    list2 = list9;
                    zzbvmVar = zzbvm.zza(D.D0(jsonReader));
                    list6 = list;
                    break;
                case '\f':
                    list2 = list9;
                    list12 = D.C0(jsonReader);
                    list6 = list;
                    break;
                case '\r':
                    list2 = list9;
                    list11 = D.C0(jsonReader);
                    list6 = list;
                    break;
                case 14:
                    list2 = list9;
                    list10 = D.C0(jsonReader);
                    list6 = list;
                    break;
                case 15:
                    list2 = D.C0(jsonReader);
                    list6 = list;
                    break;
                case 16:
                    list2 = list9;
                    i11 = jsonReader.nextInt();
                    list6 = list;
                    break;
                case 17:
                    list2 = list9;
                    list8 = zzfag.zza(jsonReader);
                    list6 = list;
                    break;
                case 18:
                    list2 = list9;
                    zzfakVar = new zzfak(jsonReader);
                    list6 = list;
                    break;
                case 19:
                    list2 = list9;
                    list6 = zzfag.zza(jsonReader);
                    break;
                case 20:
                    list2 = list9;
                    list7 = D.C0(jsonReader);
                    list6 = list;
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    list2 = list9;
                    str4 = jsonReader.nextString();
                    list6 = list;
                    break;
                case 22:
                    list2 = list9;
                    jSONObject7 = D.F0(jsonReader);
                    list6 = list;
                    break;
                case 23:
                    list2 = list9;
                    str5 = jsonReader.nextString();
                    list6 = list;
                    break;
                case 24:
                    list2 = list9;
                    str6 = jsonReader.nextString();
                    list6 = list;
                    break;
                case 25:
                    list2 = list9;
                    str7 = D.F0(jsonReader).toString();
                    list6 = list;
                    break;
                case 26:
                    list2 = list9;
                    zzbwvVar = zzbwv.zza(D.F0(jsonReader));
                    list6 = list;
                    break;
                case 27:
                    list2 = list9;
                    str8 = jsonReader.nextString();
                    list6 = list;
                    break;
                case 28:
                    list2 = list9;
                    jSONObject8 = D.F0(jsonReader);
                    list6 = list;
                    break;
                case 29:
                    list2 = list9;
                    jSONObject9 = D.F0(jsonReader);
                    list6 = list;
                    break;
                case 30:
                    list2 = list9;
                    z4 = jsonReader.nextBoolean();
                    list6 = list;
                    break;
                case 31:
                    list2 = list9;
                    z7 = jsonReader.nextBoolean();
                    list6 = list;
                    break;
                case ' ':
                    list2 = list9;
                    z8 = jsonReader.nextBoolean();
                    list6 = list;
                    break;
                case '!':
                    list2 = list9;
                    z9 = jsonReader.nextBoolean();
                    list6 = list;
                    break;
                case '\"':
                    list2 = list9;
                    z10 = jsonReader.nextBoolean();
                    list6 = list;
                    break;
                case '#':
                    list2 = list9;
                    z11 = jsonReader.nextBoolean();
                    list6 = list;
                    break;
                case '$':
                    list2 = list9;
                    z12 = jsonReader.nextBoolean();
                    list6 = list;
                    break;
                case '%':
                    list2 = list9;
                    i7 = zzd(jsonReader.nextString());
                    list6 = list;
                    break;
                case '&':
                    list2 = list9;
                    i12 = jsonReader.nextInt();
                    list6 = list;
                    break;
                case '\'':
                    list2 = list9;
                    z13 = jsonReader.nextBoolean();
                    list6 = list;
                    break;
                case '(':
                    list2 = list9;
                    str9 = jsonReader.nextString();
                    list6 = list;
                    break;
                case ')':
                    list2 = list9;
                    jSONObject10 = D.F0(jsonReader);
                    list6 = list;
                    break;
                case '*':
                    list2 = list9;
                    z14 = jsonReader.nextBoolean();
                    list6 = list;
                    break;
                case '+':
                    list2 = list9;
                    z15 = jsonReader.nextBoolean();
                    list6 = list;
                    break;
                case ',':
                    list2 = list9;
                    i13 = jsonReader.nextInt();
                    list6 = list;
                    break;
                case '-':
                    list2 = list9;
                    i8 = jsonReader.nextInt();
                    list6 = list;
                    break;
                case '.':
                    list2 = list9;
                    str10 = jsonReader.nextString();
                    list6 = list;
                    break;
                case '/':
                    list2 = list9;
                    str11 = jsonReader.nextString();
                    list6 = list;
                    break;
                case '0':
                    list2 = list9;
                    z16 = jsonReader.nextBoolean();
                    list6 = list;
                    break;
                case '1':
                    list2 = list9;
                    zzbsuVar = zzbsu.zza(D.F0(jsonReader));
                    list6 = list;
                    break;
                case '2':
                    list2 = list9;
                    list3 = list8;
                    list4 = list7;
                    jsonReader.nextBoolean();
                    list7 = list4;
                    list6 = list;
                    list8 = list3;
                    break;
                case '3':
                    list2 = list9;
                    list3 = list8;
                    list4 = list7;
                    JSONObject F02 = D.F0(jsonReader);
                    zztVar = new com.google.android.gms.ads.internal.client.zzt(F02.getInt("type_num"), F02.getInt("precision_num"), F02.getLong("value"), F02.getString("currency"));
                    list7 = list4;
                    list6 = list;
                    list8 = list3;
                    break;
                case '4':
                    list2 = list9;
                    str12 = jsonReader.nextString();
                    list6 = list;
                    break;
                case '5':
                    list2 = list9;
                    z17 = jsonReader.nextBoolean();
                    list6 = list;
                    break;
                case '6':
                    list2 = list9;
                    jSONObject11 = D.F0(jsonReader);
                    list6 = list;
                    break;
                case '7':
                    list2 = list9;
                    str13 = jsonReader.nextString();
                    list6 = list;
                    break;
                case '8':
                    list2 = list9;
                    str20 = jsonReader.nextString();
                    list6 = list;
                    break;
                case '9':
                    list2 = list9;
                    str14 = jsonReader.nextString();
                    list6 = list;
                    break;
                case ':':
                    list2 = list9;
                    str15 = jsonReader.nextString();
                    list6 = list;
                    break;
                case ';':
                    list2 = list9;
                    str16 = jsonReader.nextString();
                    list6 = list;
                    break;
                case '<':
                    list2 = list9;
                    str17 = jsonReader.nextString();
                    list6 = list;
                    break;
                case '=':
                    list2 = list9;
                    z18 = jsonReader.nextBoolean();
                    list6 = list;
                    break;
                case '>':
                    list2 = list9;
                    jSONObject12 = D.F0(jsonReader);
                    list6 = list;
                    break;
                case '?':
                    list2 = list9;
                    z19 = jsonReader.nextBoolean();
                    list6 = list;
                    break;
                case '@':
                    list2 = list9;
                    str = jsonReader.nextString();
                    list6 = list;
                    break;
                case 'A':
                    list2 = list9;
                    z20 = jsonReader.nextBoolean();
                    list6 = list;
                    break;
                case 'B':
                    list2 = list9;
                    list3 = list8;
                    list4 = list7;
                    D.C0(jsonReader);
                    list7 = list4;
                    list6 = list;
                    list8 = list3;
                    break;
                case 'C':
                    list2 = list9;
                    z21 = jsonReader.nextBoolean();
                    list6 = list;
                    break;
                case 'D':
                    list2 = list9;
                    str18 = jsonReader.nextString();
                    list6 = list;
                    break;
                case 'E':
                    list2 = list9;
                    str19 = jsonReader.nextString();
                    list6 = list;
                    break;
                case 'F':
                    list2 = list9;
                    z22 = jsonReader.nextBoolean();
                    list6 = list;
                    break;
                case 'G':
                    list2 = list9;
                    z23 = jsonReader.nextBoolean();
                    list6 = list;
                    break;
                case 'H':
                    list2 = list9;
                    i14 = jsonReader.nextInt();
                    list6 = list;
                    break;
                case 'I':
                    list2 = list9;
                    str21 = jsonReader.nextString();
                    list6 = list;
                    break;
                case 'J':
                    list2 = list9;
                    list5 = D.C0(jsonReader);
                    list6 = list;
                    break;
                case 'K':
                    list2 = list9;
                    z24 = jsonReader.nextBoolean();
                    list6 = list;
                    break;
                case 'L':
                    list2 = list9;
                    list3 = list8;
                    d7 = jsonReader.nextDouble();
                    list6 = list;
                    list8 = list3;
                    break;
                case 'M':
                    list2 = list9;
                    list3 = list8;
                    list4 = list7;
                    if (((Boolean) zzbby.zzap.zzj()).booleanValue()) {
                        HashMap hashMap3 = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String nextName2 = jsonReader.nextName();
                            HashMap hashMap4 = new HashMap();
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                hashMap4.put(jsonReader.nextName(), jsonReader.nextString());
                            }
                            jsonReader.endObject();
                            hashMap3.put(nextName2, hashMap4);
                        }
                        jsonReader.endObject();
                        hashMap2 = hashMap3;
                        list7 = list4;
                        list6 = list;
                        list8 = list3;
                        break;
                    } else {
                        jsonReader.skipValue();
                        list7 = list4;
                        list6 = list;
                        list8 = list3;
                    }
                case 'N':
                    list2 = list9;
                    list3 = list8;
                    list4 = list7;
                    if (!((Boolean) zzbby.zziB.zzj()).booleanValue()) {
                        jsonReader.skipValue();
                        list7 = list4;
                        list6 = list;
                        list8 = list3;
                        break;
                    } else {
                        JSONObject optJSONObject = D.F0(jsonReader).optJSONObject("ping_strategy");
                        oVar = new o(optJSONObject == null ? new i(1, 0, 1.0d, false) : new i(optJSONObject.optInt("max_attempts", 1), optJSONObject.optInt("initial_backoff_ms", 0), optJSONObject.optDouble("backoff_multiplier", 1.0d), optJSONObject.optBoolean("buffer_after_max_attempts", false)));
                        list7 = list4;
                        list6 = list;
                        list8 = list3;
                        break;
                    }
                case 'O':
                    if (!((Boolean) zzbby.zziD.zzj()).booleanValue()) {
                        list2 = list9;
                        list3 = list8;
                        list4 = list7;
                        jsonReader.skipValue();
                        list7 = list4;
                        list6 = list;
                        list8 = list3;
                        break;
                    } else {
                        JSONObject F03 = D.F0(jsonReader);
                        list4 = list7;
                        list3 = list8;
                        list2 = list9;
                        hVar = new h(F03.optInt("impression_prerequisite", 0), F03.optInt("click_prerequisite", 0), F03.optBoolean("notification_flow_enabled", false));
                        list7 = list4;
                        list6 = list;
                        list8 = list3;
                        break;
                    }
                default:
                    jsonReader.skipValue();
                    list2 = list9;
                    list3 = list8;
                    list4 = list7;
                    list7 = list4;
                    list6 = list;
                    list8 = list3;
                    break;
            }
            list9 = list2;
        }
        jsonReader.endObject();
        this.zza = list19;
        this.zzb = i9;
        this.zzc = list18;
        this.zzd = list17;
        this.zzf = list16;
        this.zze = i10;
        this.zzg = list15;
        this.zzh = list14;
        this.zzi = list13;
        this.zzj = str2;
        this.zzk = str3;
        this.zzl = zzbvmVar;
        this.zzm = list12;
        this.zzn = list11;
        this.zzo = list10;
        this.zzp = list9;
        this.zzq = i11;
        this.zzr = list8;
        this.zzs = zzfakVar;
        this.zzt = list7;
        this.zzu = list6;
        this.zzw = str4;
        this.zzv = jSONObject7;
        this.zzx = str5;
        this.zzy = str6;
        this.zzz = str7;
        this.zzA = zzbwvVar;
        this.zzB = str8;
        this.zzC = jSONObject8;
        this.zzD = jSONObject9;
        this.zzJ = z4;
        this.zzK = z7;
        this.zzL = z8;
        this.zzM = z9;
        this.zzN = z10;
        this.zzO = z11;
        this.zzP = z12;
        this.zzQ = i7;
        this.zzR = i12;
        this.zzT = z13;
        this.zzU = str9;
        this.zzV = new zzfbd(jSONObject10);
        this.zzW = z14;
        this.zzX = z15;
        this.zzY = i13;
        this.zzZ = str10;
        this.zzaa = i8;
        this.zzab = str11;
        this.zzac = z16;
        this.zzad = zzbsuVar;
        this.zzae = zztVar;
        this.zzaf = str12;
        this.zzag = z17;
        this.zzah = jSONObject11;
        this.zzE = str13;
        this.zzF = str14;
        this.zzG = str15;
        this.zzH = str16;
        this.zzI = str17;
        this.zzai = z18;
        this.zzaj = jSONObject12;
        this.zzak = z19;
        this.zzal = str;
        this.zzam = z20;
        this.zzS = z21;
        this.zzan = str18;
        this.zzao = str19;
        this.zzap = str20;
        this.zzaq = z22;
        this.zzar = z23;
        this.zzas = i14;
        this.zzau = list5;
        this.zzat = str21;
        this.zzav = z24;
        this.zzaw = hashMap2;
        this.zzax = oVar;
        this.zzay = hVar;
        this.zzaz = d7;
    }

    public static String zza(int i7) {
        switch (i7) {
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
        if (SentryStackFrame.JsonKeys.NATIVE.equals(str)) {
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

    private static int zze(int i7) {
        if (i7 == 0 || i7 == 1 || i7 == 3) {
            return i7;
        }
        return 0;
    }

    public final boolean zzb() {
        return this.zzai || this.zzay != null;
    }
}
