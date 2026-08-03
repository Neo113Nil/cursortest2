package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfep {
    private final com.google.android.gms.internal.ads.zzcbd zza;
    private final int zzb;

    public zzfep(com.google.android.gms.internal.ads.zzcbd zzcbdVar, int i) {
        this.zza = zzcbdVar;
        this.zzb = i;
    }

    public final java.lang.String zza() {
        return this.zza.zzd;
    }

    public final java.lang.String zzb() {
        return com.google.android.gms.internal.ads.zzgua.zza(this.zza.zza.getString("ms"));
    }

    public final android.content.pm.PackageInfo zzc() {
        return this.zza.zzf;
    }

    public final java.util.List zzd() {
        return this.zza.zze;
    }

    public final java.lang.String zze() {
        return this.zza.zzh;
    }

    public final int zzf() {
        return this.zzb;
    }

    final boolean zzg() {
        return this.zza.zzk;
    }

    final boolean zzh() {
        return this.zza.zzl;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    final int zzi() {
        char c;
        android.os.Bundle bundle = this.zza.zza.getBundle("extras");
        if (bundle != null && !bundle.isEmpty()) {
            java.lang.String string = bundle.getString("query_info_type", "");
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
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                    return 6;
                case 7:
                    return 7;
                case '\b':
                    return 8;
            }
        }
        return -1;
    }
}
