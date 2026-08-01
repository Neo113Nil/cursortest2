package com.google.android.gms.ads.nonagon.signalgeneration;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.internal.ads.zzbjg;
import com.google.android.gms.internal.ads.zzcgj;
import com.google.android.gms.internal.ads.zzeae;
import com.google.android.gms.internal.ads.zzeao;
import com.google.android.gms.internal.ads.zzflo;
import com.google.android.gms.internal.ads.zzflw;
import com.google.android.gms.internal.ads.zzfrl;
import com.google.firebase.ktx.BuildConfig;
import com.ironsource.Fc;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzv {
    public static boolean zza(zzflo zzfloVar) {
        return zzg(zzfloVar.zza.zza) != 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String zzb(String str) {
        char c;
        if (TextUtils.isEmpty(str)) {
            return BuildConfig.VERSION_NAME;
        }
        switch (str.hashCode()) {
            case 1743582862:
                if (str.equals("requester_type_0")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1743582863:
                if (str.equals("requester_type_1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1743582864:
                if (str.equals("requester_type_2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1743582865:
                if (str.equals("requester_type_3")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1743582866:
                if (str.equals("requester_type_4")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1743582867:
                if (str.equals("requester_type_5")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1743582868:
                if (str.equals("requester_type_6")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1743582869:
                if (str.equals("requester_type_7")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1743582870:
                if (str.equals("requester_type_8")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return ExifInterface.GPS_MEASUREMENT_3D;
            case 4:
                return "4";
            case 5:
                return CampaignEx.CLICKMODE_ON;
            case 6:
                return "6";
            case 7:
                return Fc.e;
            case '\b':
                return "8";
            default:
                return str;
        }
    }

    public static String zzc(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        Bundle bundle;
        return (zzmVar == null || (bundle = zzmVar.zzc) == null) ? BuildConfig.VERSION_NAME : bundle.getString("query_info_type");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static zzfrl zzd(Bundle bundle) {
        char c;
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (TextUtils.isEmpty(string)) {
            return zzfrl.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
        switch (string.hashCode()) {
            case 1743582862:
                if (string.equals("requester_type_0")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1743582863:
                if (string.equals("requester_type_1")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1743582864:
                if (string.equals("requester_type_2")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 1743582865:
                if (string.equals("requester_type_3")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1743582866:
                if (string.equals("requester_type_4")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 1743582867:
                if (string.equals("requester_type_5")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1743582868:
                if (string.equals("requester_type_6")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 1743582869:
                if (string.equals("requester_type_7")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case 1743582870:
                if (string.equals("requester_type_8")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return zzfrl.SCAR_REQUEST_TYPE_ADMOB;
            case 1:
                return zzfrl.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
            case 2:
                return zzfrl.SCAR_REQUEST_TYPE_GBID;
            case 3:
                return zzfrl.SCAR_REQUEST_TYPE_GOLDENEYE;
            case 4:
                return zzfrl.SCAR_REQUEST_TYPE_YAVIN;
            case 5:
                return zzfrl.SCAR_REQUEST_TYPE_UNITY;
            case 6:
                return zzfrl.SCAR_REQUEST_TYPE_PAW;
            case 7:
                return zzfrl.SCAR_REQUEST_TYPE_GUILDER;
            case '\b':
                return zzfrl.SCAR_REQUEST_TYPE_GAM_S2S;
            default:
                return zzfrl.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
    }

    public static void zze(final zzeao zzeaoVar, zzeae zzeaeVar, final String str, final Pair... pairArr) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(zzbjg.zzhZ)).booleanValue()) {
            final zzeae zzeaeVar2 = null;
            zzcgj.zza.execute(new Runnable(zzeaeVar2, str, pairArr) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
                private final /* synthetic */ String zzb;
                private final /* synthetic */ Pair[] zzc;

                {
                    this.zzb = str;
                    this.zzc = pairArr;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzv.zzf(zzeao.this, null, this.zzb, this.zzc);
                }
            });
        }
    }

    static /* synthetic */ void zzf(zzeao zzeaoVar, zzeae zzeaeVar, String str, Pair[] pairArr) {
        ConcurrentHashMap zzd = zzeaoVar.zzd();
        zzh(zzd, "action", str);
        for (Pair pair : pairArr) {
            zzh(zzd, (String) pair.first, (String) pair.second);
        }
        zzeaoVar.zzb(zzd);
    }

    public static int zzg(zzflw zzflwVar) {
        if (zzflwVar.zzs) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzflwVar.zzd;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzmVar.zzs;
        if (zzcVar == null && zzmVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzmVar.zzx == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }

    private static void zzh(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }
}
