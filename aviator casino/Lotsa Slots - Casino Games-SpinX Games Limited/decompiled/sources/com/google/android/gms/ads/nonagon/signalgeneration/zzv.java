package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzv {
    public static boolean zza(com.google.android.gms.internal.ads.zzfkq zzfkqVar) {
        return zzg(zzfkqVar.zza.zza) != 1;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static java.lang.String zzb(java.lang.String str) {
        char c;
        if (android.text.TextUtils.isEmpty(str)) {
            return com.google.firebase.ktx.BuildConfig.VERSION_NAME;
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
                return androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_3D;
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return com.ironsource.Fc.e;
            case '\b':
                return "8";
            default:
                return str;
        }
    }

    public static java.lang.String zzc(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        android.os.Bundle bundle;
        return (zzmVar == null || (bundle = zzmVar.zzc) == null) ? com.google.firebase.ktx.BuildConfig.VERSION_NAME : bundle.getString("query_info_type");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static com.google.android.gms.internal.ads.zzfql zzd(android.os.Bundle bundle) {
        char c;
        android.os.Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        java.lang.String string = bundle.getString("query_info_type");
        if (android.text.TextUtils.isEmpty(string)) {
            return com.google.android.gms.internal.ads.zzfql.SCAR_REQUEST_TYPE_UNSPECIFIED;
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
                return com.google.android.gms.internal.ads.zzfql.SCAR_REQUEST_TYPE_ADMOB;
            case 1:
                return com.google.android.gms.internal.ads.zzfql.SCAR_REQUEST_TYPE_INBOUND_MEDIATION;
            case 2:
                return com.google.android.gms.internal.ads.zzfql.SCAR_REQUEST_TYPE_GBID;
            case 3:
                return com.google.android.gms.internal.ads.zzfql.SCAR_REQUEST_TYPE_GOLDENEYE;
            case 4:
                return com.google.android.gms.internal.ads.zzfql.SCAR_REQUEST_TYPE_YAVIN;
            case 5:
                return com.google.android.gms.internal.ads.zzfql.SCAR_REQUEST_TYPE_UNITY;
            case 6:
                return com.google.android.gms.internal.ads.zzfql.SCAR_REQUEST_TYPE_PAW;
            case 7:
                return com.google.android.gms.internal.ads.zzfql.SCAR_REQUEST_TYPE_GUILDER;
            case '\b':
                return com.google.android.gms.internal.ads.zzfql.SCAR_REQUEST_TYPE_GAM_S2S;
            default:
                return com.google.android.gms.internal.ads.zzfql.SCAR_REQUEST_TYPE_UNSPECIFIED;
        }
    }

    public static void zze(final com.google.android.gms.internal.ads.zzdzq zzdzqVar, com.google.android.gms.internal.ads.zzdzg zzdzgVar, final java.lang.String str, final android.util.Pair... pairArr) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzhT)).booleanValue()) {
            final com.google.android.gms.internal.ads.zzdzg zzdzgVar2 = null;
            com.google.android.gms.internal.ads.zzcfr.zza.execute(new java.lang.Runnable(zzdzgVar2, str, pairArr) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzu
                private final /* synthetic */ java.lang.String zzb;
                private final /* synthetic */ android.util.Pair[] zzc;

                {
                    this.zzb = str;
                    this.zzc = pairArr;
                }

                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    com.google.android.gms.ads.nonagon.signalgeneration.zzv.zzf(com.google.android.gms.internal.ads.zzdzq.this, null, this.zzb, this.zzc);
                }
            });
        }
    }

    static /* synthetic */ void zzf(com.google.android.gms.internal.ads.zzdzq zzdzqVar, com.google.android.gms.internal.ads.zzdzg zzdzgVar, java.lang.String str, android.util.Pair[] pairArr) {
        java.util.concurrent.ConcurrentHashMap zzd = zzdzqVar.zzd();
        zzh(zzd, "action", str);
        for (android.util.Pair pair : pairArr) {
            zzh(zzd, (java.lang.String) pair.first, (java.lang.String) pair.second);
        }
        zzdzqVar.zzb(zzd);
    }

    public static int zzg(com.google.android.gms.internal.ads.zzfky zzfkyVar) {
        if (zzfkyVar.zzs) {
            return 2;
        }
        com.google.android.gms.ads.internal.client.zzm zzmVar = zzfkyVar.zzd;
        com.google.android.gms.ads.internal.client.zzc zzcVar = zzmVar.zzs;
        if (zzcVar == null && zzmVar.zzx == null) {
            return 1;
        }
        if (zzcVar == null || zzmVar.zzx == null) {
            return zzcVar != null ? 3 : 4;
        }
        return 5;
    }

    private static void zzh(java.util.Map map, java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }
}
