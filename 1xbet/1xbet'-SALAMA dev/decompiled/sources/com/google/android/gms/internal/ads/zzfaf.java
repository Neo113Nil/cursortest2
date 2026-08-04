package com.google.android.gms.internal.ads;

import J2.h;
import J2.i;
import J2.o;
import J2.p;
import Y4.D;
import android.util.JsonReader;
import io.sentry.ProfilingTraceData;
import io.sentry.protocol.Device;
import io.sentry.protocol.SentryStackFrame;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
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

    /* JADX WARN: Code duplicated, block: B:252:0x0610 A[PHI: r19
      0x0610: PHI (r19v83 java.util.List) = 
      (r19v2 java.util.List)
      (r19v3 java.util.List)
      (r19v4 java.util.List)
      (r19v5 java.util.List)
      (r19v6 java.util.List)
      (r19v7 java.util.List)
      (r19v8 java.util.List)
      (r19v9 java.util.List)
      (r19v10 java.util.List)
      (r19v11 java.util.List)
      (r19v12 java.util.List)
      (r19v13 java.util.List)
      (r19v14 java.util.List)
      (r19v15 java.util.List)
      (r19v16 java.util.List)
      (r19v17 java.util.List)
      (r19v18 java.util.List)
      (r19v19 java.util.List)
      (r19v20 java.util.List)
      (r19v21 java.util.List)
      (r19v22 java.util.List)
      (r19v23 java.util.List)
      (r19v24 java.util.List)
      (r19v25 java.util.List)
      (r19v26 java.util.List)
      (r19v27 java.util.List)
      (r19v28 java.util.List)
      (r19v29 java.util.List)
      (r19v30 java.util.List)
      (r19v31 java.util.List)
      (r19v32 java.util.List)
      (r19v33 java.util.List)
      (r19v34 java.util.List)
      (r19v35 java.util.List)
      (r19v36 java.util.List)
      (r19v37 java.util.List)
      (r19v38 java.util.List)
      (r19v39 java.util.List)
      (r19v40 java.util.List)
      (r19v41 java.util.List)
      (r19v42 java.util.List)
      (r19v43 java.util.List)
      (r19v44 java.util.List)
      (r19v45 java.util.List)
      (r19v46 java.util.List)
      (r19v47 java.util.List)
      (r19v48 java.util.List)
      (r19v49 java.util.List)
      (r19v50 java.util.List)
      (r19v51 java.util.List)
      (r19v52 java.util.List)
      (r19v53 java.util.List)
      (r19v54 java.util.List)
      (r19v55 java.util.List)
      (r19v56 java.util.List)
      (r19v57 java.util.List)
      (r19v58 java.util.List)
      (r19v59 java.util.List)
      (r19v60 java.util.List)
      (r19v61 java.util.List)
      (r19v62 java.util.List)
      (r19v63 java.util.List)
      (r19v64 java.util.List)
      (r19v65 java.util.List)
      (r19v66 java.util.List)
      (r19v67 java.util.List)
      (r19v68 java.util.List)
      (r19v69 java.util.List)
      (r19v70 java.util.List)
      (r19v71 java.util.List)
      (r19v72 java.util.List)
      (r19v73 java.util.List)
      (r19v74 java.util.List)
      (r19v75 java.util.List)
      (r19v76 java.util.List)
      (r19v77 java.util.List)
      (r19v78 java.util.List)
      (r19v79 java.util.List)
      (r19v80 java.util.List)
      (r19v81 java.util.List)
      (r19v84 java.util.List)
     binds: [B:250:0x060b, B:247:0x05fc, B:244:0x05ed, B:241:0x05de, B:238:0x05cf, B:235:0x05c0, B:232:0x05b1, B:229:0x05a1, B:226:0x0591, B:223:0x0581, B:220:0x0571, B:217:0x0561, B:214:0x0551, B:211:0x0541, B:208:0x0531, B:205:0x0521, B:202:0x0511, B:199:0x0501, B:196:0x04f1, B:193:0x04e1, B:190:0x04d1, B:187:0x04c1, B:184:0x04b1, B:181:0x04a1, B:178:0x0491, B:175:0x0481, B:172:0x0472, B:169:0x0462, B:166:0x0452, B:163:0x0442, B:160:0x0432, B:157:0x0422, B:154:0x0412, B:151:0x0402, B:148:0x03f3, B:145:0x03e3, B:142:0x03d3, B:139:0x03c4, B:136:0x03b4, B:133:0x03a4, B:130:0x0394, B:127:0x0384, B:124:0x0374, B:121:0x0364, B:118:0x0354, B:115:0x0344, B:112:0x0334, B:109:0x0324, B:106:0x0314, B:103:0x0304, B:100:0x02f4, B:97:0x02e4, B:94:0x02d4, B:91:0x02c4, B:88:0x02b5, B:85:0x02a5, B:82:0x0295, B:79:0x0285, B:76:0x0275, B:73:0x0265, B:70:0x0256, B:67:0x0246, B:64:0x0236, B:61:0x0226, B:58:0x0216, B:55:0x0206, B:52:0x01f6, B:49:0x01e6, B:46:0x01d6, B:43:0x01c6, B:40:0x01b6, B:37:0x01a7, B:34:0x0197, B:31:0x0188, B:28:0x0178, B:25:0x0169, B:22:0x0159, B:19:0x0149, B:16:0x0139, B:13:0x0129, B:11:0x011b] A[DONT_GENERATE, DONT_INLINE]] */
    public zzfaf(JsonReader jsonReader) throws JSONException, IOException {
        List list;
        byte b7;
        List list2;
        List list3;
        List listEmptyList = Collections.emptyList();
        List listEmptyList2 = Collections.emptyList();
        List listEmptyList3 = Collections.emptyList();
        List listEmptyList4 = Collections.emptyList();
        List listEmptyList5 = Collections.emptyList();
        List listEmptyList6 = Collections.emptyList();
        List listEmptyList7 = Collections.emptyList();
        List listEmptyList8 = Collections.emptyList();
        List listEmptyList9 = Collections.emptyList();
        List listEmptyList10 = Collections.emptyList();
        List listEmptyList11 = Collections.emptyList();
        List listEmptyList12 = Collections.emptyList();
        List listEmptyList13 = Collections.emptyList();
        List listEmptyList14 = Collections.emptyList();
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        JSONObject jSONObject6 = new JSONObject();
        zzfwh.zzn();
        zzfwh zzfwhVarZzn = zzfwh.zzn();
        HashMap map = new HashMap();
        jsonReader.beginObject();
        JSONObject jSONObjectF0 = jSONObject;
        JSONObject jSONObjectF1 = jSONObject2;
        JSONObject jSONObjectF2 = jSONObject3;
        JSONObject jSONObjectF3 = jSONObject4;
        JSONObject jSONObjectF4 = jSONObject5;
        JSONObject jSONObjectF5 = jSONObject6;
        List listC0 = zzfwhVarZzn;
        HashMap map2 = map;
        double dNextDouble = 0.0d;
        zzbvm zzbvmVarZza = null;
        zzfak zzfakVar = null;
        zzbwv zzbwvVarZza = null;
        zzbsu zzbsuVarZza = null;
        com.google.android.gms.ads.internal.client.zzt zztVar = null;
        String strNextString = null;
        o oVar = null;
        h hVar = null;
        String strNextString2 = "";
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        String strNextString6 = strNextString5;
        String string = strNextString6;
        String strNextString7 = string;
        String strNextString8 = strNextString7;
        String strNextString9 = strNextString8;
        String strNextString10 = strNextString9;
        String strNextString11 = strNextString10;
        String strNextString12 = strNextString11;
        String strNextString13 = strNextString12;
        String strNextString14 = strNextString13;
        String strNextString15 = strNextString14;
        String strNextString16 = strNextString15;
        String strNextString17 = strNextString16;
        String strNextString18 = strNextString17;
        String strNextString19 = strNextString18;
        String strNextString20 = strNextString19;
        int iZzd = -1;
        int iNextInt = -1;
        int iZzc = 0;
        int iZze = 0;
        int iNextInt2 = 0;
        boolean zNextBoolean = false;
        boolean zNextBoolean2 = false;
        boolean zNextBoolean3 = false;
        boolean zNextBoolean4 = false;
        boolean zNextBoolean5 = false;
        boolean zNextBoolean6 = false;
        boolean zNextBoolean7 = false;
        int iNextInt3 = 0;
        boolean zNextBoolean8 = false;
        boolean zNextBoolean9 = false;
        boolean zNextBoolean10 = false;
        int iNextInt4 = 0;
        boolean zNextBoolean11 = false;
        boolean zNextBoolean12 = false;
        boolean zNextBoolean13 = false;
        boolean zNextBoolean14 = false;
        boolean zNextBoolean15 = false;
        boolean zNextBoolean16 = false;
        boolean zNextBoolean17 = false;
        boolean zNextBoolean18 = false;
        int iNextInt5 = 0;
        boolean zNextBoolean19 = false;
        List listZza = listEmptyList14;
        List listC1 = listEmptyList13;
        List listZza2 = listEmptyList12;
        List listC2 = listEmptyList11;
        List listC3 = listEmptyList10;
        List listC4 = listEmptyList9;
        List listC5 = listEmptyList8;
        List listC6 = listEmptyList7;
        List listC7 = listEmptyList6;
        List listC8 = listEmptyList5;
        List listC9 = listEmptyList4;
        List listC10 = listEmptyList3;
        List listC11 = listEmptyList2;
        List listC12 = listEmptyList;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str = strNextName == null ? "" : strNextName;
            switch (str.hashCode()) {
                case -2138196627:
                    list = listZza;
                    if (!str.equals("ad_source_instance_name")) {
                        b7 = -1;
                    } else {
                        b7 = 59;
                    }
                    break;
                case -1980587809:
                    list = listZza;
                    if (!str.equals("debug_signals")) {
                        b7 = -1;
                    } else {
                        b7 = 28;
                    }
                    break;
                case -1965512151:
                    list = listZza;
                    if (!str.equals("omid_settings")) {
                        b7 = -1;
                    } else {
                        b7 = 41;
                    }
                    break;
                case -1964744830:
                    list = listZza;
                    if (!str.equals("offline_ad_config")) {
                        b7 = -1;
                    } else {
                        b7 = 79;
                    }
                    break;
                case -1871425831:
                    list = listZza;
                    if (!str.equals("recursive_server_response_data")) {
                        b7 = -1;
                    } else {
                        b7 = 69;
                    }
                    break;
                case -1843156475:
                    list = listZza;
                    if (!str.equals("is_consent")) {
                        b7 = -1;
                    } else {
                        b7 = 71;
                    }
                    break;
                case -1828733410:
                    list = listZza;
                    if (!str.equals("network_ping_config")) {
                        b7 = -1;
                    } else {
                        b7 = 78;
                    }
                    break;
                case -1812055556:
                    list = listZza;
                    if (!str.equals("play_prewarm_options")) {
                        b7 = -1;
                    } else {
                        b7 = 49;
                    }
                    break;
                case -1785028569:
                    list = listZza;
                    if (!str.equals("parallel_key")) {
                        b7 = -1;
                    } else {
                        b7 = 73;
                    }
                    break;
                case -1776946669:
                    list = listZza;
                    if (!str.equals("ad_source_name")) {
                        b7 = -1;
                    } else {
                        b7 = 57;
                    }
                    break;
                case -1662989631:
                    list = listZza;
                    if (!str.equals("is_interscroller")) {
                        b7 = -1;
                    } else {
                        b7 = 53;
                    }
                    break;
                case -1620470467:
                    list = listZza;
                    if (!str.equals("backend_query_id")) {
                        b7 = -1;
                    } else {
                        b7 = 47;
                    }
                    break;
                case -1550155393:
                    list = listZza;
                    if (!str.equals("nofill_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 13;
                    }
                    break;
                case -1440104884:
                    list = listZza;
                    if (!str.equals("is_custom_close_blocked")) {
                        b7 = -1;
                    } else {
                        b7 = 35;
                    }
                    break;
                case -1439500848:
                    list = listZza;
                    if (!str.equals(Device.JsonKeys.ORIENTATION)) {
                        b7 = -1;
                    } else {
                        b7 = 37;
                    }
                    break;
                case -1428969291:
                    list = listZza;
                    if (!str.equals("enable_omid")) {
                        b7 = -1;
                    } else {
                        b7 = 39;
                    }
                    break;
                case -1406227629:
                    list = listZza;
                    if (!str.equals("buffer_click_url_as_ready_to_ping")) {
                        b7 = -1;
                    } else {
                        b7 = 67;
                    }
                    break;
                case -1403779768:
                    list = listZza;
                    if (!str.equals("showable_impression_type")) {
                        b7 = -1;
                    } else {
                        b7 = 44;
                    }
                    break;
                case -1375413093:
                    list = listZza;
                    if (!str.equals("ad_cover")) {
                        b7 = -1;
                    } else {
                        b7 = 54;
                    }
                    break;
                case -1360811658:
                    list = listZza;
                    if (!str.equals("ad_sizes")) {
                        b7 = -1;
                    } else {
                        b7 = 19;
                    }
                    break;
                case -1306015996:
                    list = listZza;
                    if (!str.equals("adapters")) {
                        b7 = -1;
                    } else {
                        b7 = 20;
                    }
                    break;
                case -1303332046:
                    list = listZza;
                    if (!str.equals("test_mode_enabled")) {
                        b7 = -1;
                    } else {
                        b7 = 34;
                    }
                    break;
                case -1289032093:
                    list = listZza;
                    if (!str.equals("extras")) {
                        b7 = -1;
                    } else {
                        b7 = 29;
                    }
                    break;
                case -1240082064:
                    list = listZza;
                    if (!str.equals("ad_event_value")) {
                        b7 = -1;
                    } else {
                        b7 = 51;
                    }
                    break;
                case -1234181075:
                    list = listZza;
                    if (!str.equals("allow_pub_rendered_attribution")) {
                        b7 = -1;
                    } else {
                        b7 = 30;
                    }
                    break;
                case -1168140544:
                    list = listZza;
                    if (!str.equals("presentation_error_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 14;
                    }
                    break;
                case -1152230954:
                    list = listZza;
                    if (!str.equals("ad_type")) {
                        b7 = -1;
                    } else {
                        b7 = 1;
                    }
                    break;
                case -1146534047:
                    list = listZza;
                    if (!str.equals("is_scroll_aware")) {
                        b7 = -1;
                    } else {
                        b7 = 43;
                    }
                    break;
                case -1115838944:
                    list = listZza;
                    if (!str.equals("fill_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 12;
                    }
                    break;
                case -1081936678:
                    list = listZza;
                    if (!str.equals("allocation_id")) {
                        b7 = -1;
                    } else {
                        b7 = 21;
                    }
                    break;
                case -1078050970:
                    list = listZza;
                    if (!str.equals("video_complete_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 8;
                    }
                    break;
                case -1051269058:
                    list = listZza;
                    if (!str.equals("active_view")) {
                        b7 = -1;
                    } else {
                        b7 = 25;
                    }
                    break;
                case -982608540:
                    list = listZza;
                    if (!str.equals("valid_from_timestamp")) {
                        b7 = -1;
                    } else {
                        b7 = 10;
                    }
                    break;
                case -972056451:
                    list = listZza;
                    if (!str.equals("ad_source_instance_id")) {
                        b7 = -1;
                    } else {
                        b7 = 60;
                    }
                    break;
                case -776859333:
                    list = listZza;
                    if (!str.equals("click_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 2;
                    }
                    break;
                case -570101180:
                    list = listZza;
                    if (!str.equals("late_load_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 74;
                    }
                    break;
                case -544216775:
                    list = listZza;
                    if (!str.equals("safe_browsing")) {
                        b7 = -1;
                    } else {
                        b7 = 26;
                    }
                    break;
                case -437057161:
                    list = listZza;
                    if (!str.equals("imp_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 3;
                    }
                    break;
                case -404433734:
                    list = listZza;
                    if (!str.equals("rtb_native_required_assets")) {
                        b7 = -1;
                    } else {
                        b7 = 62;
                    }
                    break;
                case -404326515:
                    list = listZza;
                    if (!str.equals("render_timeout_ms")) {
                        b7 = -1;
                    } else {
                        b7 = 38;
                    }
                    break;
                case -397704715:
                    list = listZza;
                    if (!str.equals("ad_close_time_ms")) {
                        b7 = -1;
                    } else {
                        b7 = 45;
                    }
                    break;
                case -388807511:
                    list = listZza;
                    if (!str.equals("content_url")) {
                        b7 = -1;
                    } else {
                        b7 = 64;
                    }
                    break;
                case -369773488:
                    list = listZza;
                    if (!str.equals("is_close_button_enabled")) {
                        b7 = -1;
                    } else {
                        b7 = 50;
                    }
                    break;
                case -213449460:
                    list = listZza;
                    if (!str.equals("force_disable_hardware_acceleration")) {
                        b7 = -1;
                    } else {
                        b7 = 65;
                    }
                    break;
                case -213424028:
                    list = listZza;
                    if (!str.equals("watermark")) {
                        b7 = -1;
                    } else {
                        b7 = 46;
                    }
                    break;
                case -180214626:
                    list = listZza;
                    if (!str.equals("native_required_asset_viewability")) {
                        b7 = -1;
                    } else {
                        b7 = 63;
                    }
                    break;
                case -154616268:
                    list = listZza;
                    if (!str.equals("is_offline_ad")) {
                        b7 = -1;
                    } else {
                        b7 = 61;
                    }
                    break;
                case -29338502:
                    list = listZza;
                    if (!str.equals("allow_custom_click_gesture")) {
                        b7 = -1;
                    } else {
                        b7 = 32;
                    }
                    break;
                case 3107:
                    list = listZza;
                    if (!str.equals("ad")) {
                        b7 = -1;
                    } else {
                        b7 = 18;
                    }
                    break;
                case 3355:
                    list = listZza;
                    if (!str.equals("id")) {
                        b7 = -1;
                    } else {
                        b7 = 23;
                    }
                    break;
                case 3076010:
                    list = listZza;
                    if (!str.equals("data")) {
                        b7 = -1;
                    } else {
                        b7 = 22;
                    }
                    break;
                case 37109963:
                    list = listZza;
                    if (!str.equals("request_id")) {
                        b7 = -1;
                    } else {
                        b7 = 68;
                    }
                    break;
                case 63195984:
                    list = listZza;
                    if (!str.equals("render_test_label")) {
                        b7 = -1;
                    } else {
                        b7 = 33;
                    }
                    break;
                case 107433883:
                    list = listZza;
                    if (!str.equals("qdata")) {
                        b7 = -1;
                    } else {
                        b7 = 24;
                    }
                    break;
                case 230323073:
                    list = listZza;
                    if (!str.equals("ad_load_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 4;
                    }
                    break;
                case 418392395:
                    list = listZza;
                    if (!str.equals("is_closable_area_disabled")) {
                        b7 = -1;
                    } else {
                        b7 = 36;
                    }
                    break;
                case 542250332:
                    list = listZza;
                    if (!str.equals("consent_form_action_identifier")) {
                        b7 = -1;
                    } else {
                        b7 = 72;
                    }
                    break;
                case 549176928:
                    list = listZza;
                    if (!str.equals("presentation_error_timeout_ms")) {
                        b7 = -1;
                    } else {
                        b7 = 16;
                    }
                    break;
                case 597473788:
                    list = listZza;
                    if (!str.equals("debug_dialog_string")) {
                        b7 = -1;
                    } else {
                        b7 = 27;
                    }
                    break;
                case 754887508:
                    list = listZza;
                    if (!str.equals("container_sizes")) {
                        b7 = -1;
                    } else {
                        b7 = 17;
                    }
                    break;
                case 791122864:
                    list = listZza;
                    if (!str.equals("impression_type")) {
                        b7 = -1;
                    } else {
                        b7 = 5;
                    }
                    break;
                case 805095541:
                    list = listZza;
                    if (!str.equals("analytics_event_name_to_parameters_map")) {
                        b7 = -1;
                    } else {
                        b7 = 77;
                    }
                    break;
                case 1010584092:
                    list = listZza;
                    if (!str.equals(ProfilingTraceData.JsonKeys.TRANSACTION_ID)) {
                        b7 = -1;
                    } else {
                        b7 = 9;
                    }
                    break;
                case 1100650276:
                    list = listZza;
                    if (!str.equals("rewards")) {
                        b7 = -1;
                    } else {
                        b7 = 11;
                    }
                    break;
                case 1141602460:
                    list = listZza;
                    if (!str.equals("adapter_response_info_key")) {
                        b7 = -1;
                    } else {
                        b7 = 56;
                    }
                    break;
                case 1186014765:
                    list = listZza;
                    if (!str.equals("cache_hit_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 66;
                    }
                    break;
                case 1303622534:
                    list = listZza;
                    if (!str.equals("preload_sort_value")) {
                        b7 = -1;
                    } else {
                        b7 = 76;
                    }
                    break;
                case 1321720943:
                    list = listZza;
                    if (!str.equals("allow_pub_owned_ad_view")) {
                        b7 = -1;
                    } else {
                        b7 = 31;
                    }
                    break;
                case 1422388341:
                    list = listZza;
                    if (!str.equals("is_collapsible")) {
                        b7 = -1;
                    } else {
                        b7 = 70;
                    }
                    break;
                case 1437255331:
                    list = listZza;
                    if (!str.equals("ad_source_id")) {
                        b7 = -1;
                    } else {
                        b7 = 58;
                    }
                    break;
                case 1637553475:
                    list = listZza;
                    if (!str.equals("bid_response")) {
                        b7 = -1;
                    } else {
                        b7 = 40;
                    }
                    break;
                case 1638957285:
                    list = listZza;
                    if (!str.equals("video_start_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 6;
                    }
                    break;
                case 1686319423:
                    list = listZza;
                    if (!str.equals("ad_network_class_name")) {
                        b7 = -1;
                    } else {
                        b7 = 55;
                    }
                    break;
                case 1688341040:
                    list = listZza;
                    if (!str.equals("video_reward_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 7;
                    }
                    break;
                case 1799285870:
                    list = listZza;
                    if (!str.equals("use_third_party_container_height")) {
                        b7 = -1;
                    } else {
                        b7 = 48;
                    }
                    break;
                case 1839650832:
                    list = listZza;
                    if (!str.equals("renderers")) {
                        b7 = -1;
                    } else {
                        b7 = 0;
                    }
                    break;
                case 1875425491:
                    list = listZza;
                    if (!str.equals("is_analytics_logging_enabled")) {
                        b7 = -1;
                    } else {
                        b7 = 42;
                    }
                    break;
                case 2068142375:
                    list = listZza;
                    if (!str.equals("rule_line_external_id")) {
                        b7 = -1;
                    } else {
                        b7 = 52;
                    }
                    break;
                case 2072888499:
                    list = listZza;
                    if (!str.equals("manual_tracking_urls")) {
                        b7 = -1;
                    } else {
                        b7 = 15;
                    }
                    break;
                case 2075506442:
                    list = listZza;
                    if (!str.equals("render_serially")) {
                        b7 = -1;
                    } else {
                        b7 = 75;
                    }
                    break;
                default:
                    list = listZza;
                    b7 = -1;
                    break;
            }
            switch (b7) {
                case 0:
                    listC2 = listC2;
                    listC12 = D.C0(jsonReader);
                    listZza = list;
                    break;
                case 1:
                    listC2 = listC2;
                    iZzc = zzc(jsonReader.nextString());
                    listZza = list;
                    break;
                case 2:
                    listC2 = listC2;
                    listC11 = D.C0(jsonReader);
                    listZza = list;
                    break;
                case 3:
                    listC2 = listC2;
                    listC10 = D.C0(jsonReader);
                    listZza = list;
                    break;
                case 4:
                    listC2 = listC2;
                    listC9 = D.C0(jsonReader);
                    listZza = list;
                    break;
                case 5:
                    listC2 = listC2;
                    iZze = zze(jsonReader.nextInt());
                    listZza = list;
                    break;
                case 6:
                    listC2 = listC2;
                    listC8 = D.C0(jsonReader);
                    listZza = list;
                    break;
                case 7:
                    listC2 = listC2;
                    listC7 = D.C0(jsonReader);
                    listZza = list;
                    break;
                case 8:
                    listC2 = listC2;
                    listC6 = D.C0(jsonReader);
                    listZza = list;
                    break;
                case 9:
                    listC2 = listC2;
                    strNextString2 = jsonReader.nextString();
                    listZza = list;
                    break;
                case 10:
                    listC2 = listC2;
                    strNextString3 = jsonReader.nextString();
                    listZza = list;
                    break;
                case 11:
                    listC2 = listC2;
                    zzbvmVarZza = zzbvm.zza(D.D0(jsonReader));
                    listZza = list;
                    break;
                case 12:
                    listC2 = listC2;
                    listC5 = D.C0(jsonReader);
                    listZza = list;
                    break;
                case 13:
                    listC2 = listC2;
                    listC4 = D.C0(jsonReader);
                    listZza = list;
                    break;
                case 14:
                    listC2 = listC2;
                    listC3 = D.C0(jsonReader);
                    listZza = list;
                    break;
                case 15:
                    listC2 = D.C0(jsonReader);
                    listZza = list;
                    break;
                case 16:
                    listC2 = listC2;
                    iNextInt2 = jsonReader.nextInt();
                    listZza = list;
                    break;
                case 17:
                    listC2 = listC2;
                    listZza2 = zzfag.zza(jsonReader);
                    listZza = list;
                    break;
                case 18:
                    listC2 = listC2;
                    zzfakVar = new zzfak(jsonReader);
                    listZza = list;
                    break;
                case 19:
                    listC2 = listC2;
                    listZza = zzfag.zza(jsonReader);
                    break;
                case 20:
                    listC2 = listC2;
                    listC1 = D.C0(jsonReader);
                    listZza = list;
                    break;
                case zzbbd.zzt.zzm /* 21 */:
                    strNextString4 = jsonReader.nextString();
                    listZza = list;
                    break;
                case 22:
                    listC2 = listC2;
                    jSONObjectF0 = D.F0(jsonReader);
                    listZza = list;
                    break;
                case 23:
                    strNextString5 = jsonReader.nextString();
                    listZza = list;
                    break;
                case 24:
                    strNextString6 = jsonReader.nextString();
                    listZza = list;
                    break;
                case 25:
                    string = D.F0(jsonReader).toString();
                    listZza = list;
                    break;
                case 26:
                    listC2 = listC2;
                    zzbwvVarZza = zzbwv.zza(D.F0(jsonReader));
                    listZza = list;
                    break;
                case 27:
                    strNextString7 = jsonReader.nextString();
                    listZza = list;
                    break;
                case 28:
                    listC2 = listC2;
                    jSONObjectF1 = D.F0(jsonReader);
                    listZza = list;
                    break;
                case 29:
                    listC2 = listC2;
                    jSONObjectF2 = D.F0(jsonReader);
                    listZza = list;
                    break;
                case 30:
                    zNextBoolean = jsonReader.nextBoolean();
                    listZza = list;
                    break;
                case 31:
                    zNextBoolean2 = jsonReader.nextBoolean();
                    listZza = list;
                    break;
                case 32:
                    zNextBoolean3 = jsonReader.nextBoolean();
                    listZza = list;
                    break;
                case 33:
                    zNextBoolean4 = jsonReader.nextBoolean();
                    listZza = list;
                    break;
                case 34:
                    zNextBoolean5 = jsonReader.nextBoolean();
                    listZza = list;
                    break;
                case 35:
                    zNextBoolean6 = jsonReader.nextBoolean();
                    listZza = list;
                    break;
                case 36:
                    zNextBoolean7 = jsonReader.nextBoolean();
                    listZza = list;
                    break;
                case 37:
                    iZzd = zzd(jsonReader.nextString());
                    listZza = list;
                    break;
                case 38:
                    iNextInt3 = jsonReader.nextInt();
                    listZza = list;
                    break;
                case 39:
                    zNextBoolean8 = jsonReader.nextBoolean();
                    listZza = list;
                    break;
                case 40:
                    strNextString8 = jsonReader.nextString();
                    listZza = list;
                    break;
                case 41:
                    listC2 = listC2;
                    jSONObjectF3 = D.F0(jsonReader);
                    listZza = list;
                    break;
                case 42:
                    zNextBoolean9 = jsonReader.nextBoolean();
                    listZza = list;
                    break;
                case 43:
                    zNextBoolean10 = jsonReader.nextBoolean();
                    listZza = list;
                    break;
                case 44:
                    iNextInt4 = jsonReader.nextInt();
                    listZza = list;
                    break;
                case 45:
                    iNextInt = jsonReader.nextInt();
                    listZza = list;
                    break;
                case 46:
                    strNextString9 = jsonReader.nextString();
                    listZza = list;
                    break;
                case 47:
                    strNextString10 = jsonReader.nextString();
                    listZza = list;
                    break;
                case 48:
                    zNextBoolean11 = jsonReader.nextBoolean();
                    listZza = list;
                    break;
                case 49:
                    listC2 = listC2;
                    zzbsuVarZza = zzbsu.zza(D.F0(jsonReader));
                    listZza = list;
                    break;
                case 50:
                    listC2 = listC2;
                    list2 = listZza2;
                    list3 = listC1;
                    jsonReader.nextBoolean();
                    listC1 = list3;
                    listZza = list;
                    listZza2 = list2;
                    break;
                case 51:
                    listC2 = listC2;
                    list2 = listZza2;
                    list3 = listC1;
                    JSONObject jSONObjectF6 = D.F0(jsonReader);
                    zztVar = new com.google.android.gms.ads.internal.client.zzt(jSONObjectF6.getInt("type_num"), jSONObjectF6.getInt("precision_num"), jSONObjectF6.getLong("value"), jSONObjectF6.getString("currency"));
                    listC1 = list3;
                    listZza = list;
                    listZza2 = list2;
                    break;
                case 52:
                    strNextString11 = jsonReader.nextString();
                    listZza = list;
                    break;
                case 53:
                    zNextBoolean12 = jsonReader.nextBoolean();
                    listZza = list;
                    break;
                case 54:
                    listC2 = listC2;
                    jSONObjectF4 = D.F0(jsonReader);
                    listZza = list;
                    break;
                case 55:
                    strNextString12 = jsonReader.nextString();
                    listZza = list;
                    break;
                case 56:
                    strNextString19 = jsonReader.nextString();
                    listZza = list;
                    break;
                case 57:
                    strNextString13 = jsonReader.nextString();
                    listZza = list;
                    break;
                case 58:
                    strNextString14 = jsonReader.nextString();
                    listZza = list;
                    break;
                case 59:
                    strNextString15 = jsonReader.nextString();
                    listZza = list;
                    break;
                case 60:
                    strNextString16 = jsonReader.nextString();
                    listZza = list;
                    break;
                case 61:
                    zNextBoolean13 = jsonReader.nextBoolean();
                    listZza = list;
                    break;
                case 62:
                    listC2 = listC2;
                    jSONObjectF5 = D.F0(jsonReader);
                    listZza = list;
                    break;
                case 63:
                    zNextBoolean14 = jsonReader.nextBoolean();
                    listZza = list;
                    break;
                case 64:
                    listC2 = listC2;
                    strNextString = jsonReader.nextString();
                    listZza = list;
                    break;
                case 65:
                    zNextBoolean15 = jsonReader.nextBoolean();
                    listZza = list;
                    break;
                case 66:
                    listC2 = listC2;
                    list2 = listZza2;
                    list3 = listC1;
                    D.C0(jsonReader);
                    listC1 = list3;
                    listZza = list;
                    listZza2 = list2;
                    break;
                case 67:
                    zNextBoolean16 = jsonReader.nextBoolean();
                    listZza = list;
                    break;
                case 68:
                    strNextString17 = jsonReader.nextString();
                    listZza = list;
                    break;
                case 69:
                    strNextString18 = jsonReader.nextString();
                    listZza = list;
                    break;
                case 70:
                    zNextBoolean17 = jsonReader.nextBoolean();
                    listZza = list;
                    break;
                case 71:
                    zNextBoolean18 = jsonReader.nextBoolean();
                    listZza = list;
                    break;
                case 72:
                    iNextInt5 = jsonReader.nextInt();
                    listZza = list;
                    break;
                case 73:
                    strNextString20 = jsonReader.nextString();
                    listZza = list;
                    break;
                case 74:
                    listC2 = listC2;
                    listC0 = D.C0(jsonReader);
                    listZza = list;
                    break;
                case 75:
                    zNextBoolean19 = jsonReader.nextBoolean();
                    listZza = list;
                    break;
                case 76:
                    listC2 = listC2;
                    list2 = listZza2;
                    dNextDouble = jsonReader.nextDouble();
                    listZza = list;
                    listZza2 = list2;
                    break;
                case 77:
                    listC2 = listC2;
                    list2 = listZza2;
                    list3 = listC1;
                    if (((Boolean) zzbby.zzap.zzj()).booleanValue()) {
                        HashMap map3 = new HashMap();
                        jsonReader.beginObject();
                        while (jsonReader.hasNext()) {
                            String strNextName2 = jsonReader.nextName();
                            HashMap map4 = new HashMap();
                            jsonReader.beginObject();
                            while (jsonReader.hasNext()) {
                                map4.put(jsonReader.nextName(), jsonReader.nextString());
                            }
                            jsonReader.endObject();
                            map3.put(strNextName2, map4);
                        }
                        jsonReader.endObject();
                        map2 = map3;
                    } else {
                        jsonReader.skipValue();
                    }
                    listC1 = list3;
                    listZza = list;
                    listZza2 = list2;
                    break;
                case 78:
                    listC2 = listC2;
                    list2 = listZza2;
                    list3 = listC1;
                    if (!((Boolean) zzbby.zziB.zzj()).booleanValue()) {
                        jsonReader.skipValue();
                        listC1 = list3;
                        listZza = list;
                        listZza2 = list2;
                    } else {
                        JSONObject jSONObjectOptJSONObject = D.F0(jsonReader).optJSONObject("ping_strategy");
                        oVar = new o(jSONObjectOptJSONObject == null ? new i(1, 0, 1.0d, false) : new i(jSONObjectOptJSONObject.optInt("max_attempts", 1), jSONObjectOptJSONObject.optInt("initial_backoff_ms", 0), jSONObjectOptJSONObject.optDouble("backoff_multiplier", 1.0d), jSONObjectOptJSONObject.optBoolean("buffer_after_max_attempts", false)));
                        listC1 = list3;
                        listZza = list;
                        listZza2 = list2;
                    }
                    break;
                case 79:
                    if (!((Boolean) zzbby.zziD.zzj()).booleanValue()) {
                        listC2 = listC2;
                        list2 = listZza2;
                        list3 = listC1;
                        jsonReader.skipValue();
                        listC1 = list3;
                        listZza = list;
                        listZza2 = list2;
                    } else {
                        JSONObject jSONObjectF7 = D.F0(jsonReader);
                        list3 = listC1;
                        list2 = listZza2;
                        listC2 = listC2;
                        hVar = new h(jSONObjectF7.optInt("impression_prerequisite", 0), jSONObjectF7.optInt("click_prerequisite", 0), jSONObjectF7.optBoolean("notification_flow_enabled", false));
                        listC1 = list3;
                        listZza = list;
                        listZza2 = list2;
                    }
                    break;
                default:
                    jsonReader.skipValue();
                    listC2 = listC2;
                    list2 = listZza2;
                    list3 = listC1;
                    listC1 = list3;
                    listZza = list;
                    listZza2 = list2;
                    break;
            }
            listC2 = listC2;
        }
        jsonReader.endObject();
        this.zza = listC12;
        this.zzb = iZzc;
        this.zzc = listC11;
        this.zzd = listC10;
        this.zzf = listC9;
        this.zze = iZze;
        this.zzg = listC8;
        this.zzh = listC7;
        this.zzi = listC6;
        this.zzj = strNextString2;
        this.zzk = strNextString3;
        this.zzl = zzbvmVarZza;
        this.zzm = listC5;
        this.zzn = listC4;
        this.zzo = listC3;
        this.zzp = listC2;
        this.zzq = iNextInt2;
        this.zzr = listZza2;
        this.zzs = zzfakVar;
        this.zzt = listC1;
        this.zzu = listZza;
        this.zzw = strNextString4;
        this.zzv = jSONObjectF0;
        this.zzx = strNextString5;
        this.zzy = strNextString6;
        this.zzz = string;
        this.zzA = zzbwvVarZza;
        this.zzB = strNextString7;
        this.zzC = jSONObjectF1;
        this.zzD = jSONObjectF2;
        this.zzJ = zNextBoolean;
        this.zzK = zNextBoolean2;
        this.zzL = zNextBoolean3;
        this.zzM = zNextBoolean4;
        this.zzN = zNextBoolean5;
        this.zzO = zNextBoolean6;
        this.zzP = zNextBoolean7;
        this.zzQ = iZzd;
        this.zzR = iNextInt3;
        this.zzT = zNextBoolean8;
        this.zzU = strNextString8;
        this.zzV = new zzfbd(jSONObjectF3);
        this.zzW = zNextBoolean9;
        this.zzX = zNextBoolean10;
        this.zzY = iNextInt4;
        this.zzZ = strNextString9;
        this.zzaa = iNextInt;
        this.zzab = strNextString10;
        this.zzac = zNextBoolean11;
        this.zzad = zzbsuVarZza;
        this.zzae = zztVar;
        this.zzaf = strNextString11;
        this.zzag = zNextBoolean12;
        this.zzah = jSONObjectF4;
        this.zzE = strNextString12;
        this.zzF = strNextString13;
        this.zzG = strNextString14;
        this.zzH = strNextString15;
        this.zzI = strNextString16;
        this.zzai = zNextBoolean13;
        this.zzaj = jSONObjectF5;
        this.zzak = zNextBoolean14;
        this.zzal = strNextString;
        this.zzam = zNextBoolean15;
        this.zzS = zNextBoolean16;
        this.zzan = strNextString17;
        this.zzao = strNextString18;
        this.zzap = strNextString19;
        this.zzaq = zNextBoolean17;
        this.zzar = zNextBoolean18;
        this.zzas = iNextInt5;
        this.zzau = listC0;
        this.zzat = strNextString20;
        this.zzav = zNextBoolean19;
        this.zzaw = map2;
        this.zzax = oVar;
        this.zzay = hVar;
        this.zzaz = dNextDouble;
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
