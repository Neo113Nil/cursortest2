package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzciz implements java.lang.Runnable {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ java.lang.String zzd;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcja zze;

    zzciz(com.google.android.gms.internal.ads.zzcja zzcjaVar, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        java.util.Objects.requireNonNull(zzcjaVar);
        this.zze = zzcjaVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // java.lang.Runnable
    public final void run() {
        char c;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(androidx.core.app.NotificationCompat.CATEGORY_EVENT, "precacheCanceled");
        hashMap.put("src", this.zza);
        java.lang.String str = this.zzb;
        if (!android.text.TextUtils.isEmpty(str)) {
            hashMap.put("cachedSrc", str);
        }
        java.lang.String str2 = this.zzc;
        switch (str2.hashCode()) {
            case -1947652542:
                if (str2.equals("interrupted")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -1396664534:
                if (str2.equals("badUrl")) {
                    c = '\b';
                    break;
                }
                c = 65535;
                break;
            case -1347010958:
                if (str2.equals("inProgress")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -918817863:
                if (str2.equals("downloadTimeout")) {
                    c = '\t';
                    break;
                }
                c = 65535;
                break;
            case -659376217:
                if (str2.equals("contentLengthMissing")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -642208130:
                if (str2.equals("playerFailed")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -354048396:
                if (str2.equals("sizeExceeded")) {
                    c = 11;
                    break;
                }
                c = 65535;
                break;
            case -32082395:
                if (str2.equals("externalAbort")) {
                    c = '\n';
                    break;
                }
                c = 65535;
                break;
            case 3387234:
                if (str2.equals("noop")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 96784904:
                if (str2.equals("error")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 580119100:
                if (str2.equals("expireFailed")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 725497484:
                if (str2.equals("noCacheDir")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        java.lang.String str3 = "internal";
        switch (c) {
            case 6:
            case 7:
                str3 = "io";
                break;
            case '\b':
            case '\t':
                str3 = "network";
                break;
            case '\n':
            case 11:
                str3 = "policy";
                break;
        }
        hashMap.put("type", str3);
        hashMap.put("reason", str2);
        java.lang.String str4 = this.zzd;
        if (!android.text.TextUtils.isEmpty(str4)) {
            hashMap.put("message", str4);
        }
        this.zze.zzw("onPrecacheEvent", hashMap);
    }
}
