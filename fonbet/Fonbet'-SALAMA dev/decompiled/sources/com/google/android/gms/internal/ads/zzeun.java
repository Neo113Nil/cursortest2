package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

/* loaded from: classes.dex */
public final class zzeun {
    private final zzbuo zza;
    private final int zzb;

    public zzeun(zzbuo zzbuoVar, int i7) {
        this.zza = zzbuoVar;
        this.zzb = i7;
    }

    public final int zza() {
        return this.zzb;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final int zzb() {
        boolean z4;
        Bundle bundle = this.zza.zza;
        if (bundle == null || bundle.isEmpty()) {
            return -1;
        }
        String string = bundle.getString("query_info_type", "");
        switch (string.hashCode()) {
            case 1743582862:
                if (string.equals("requester_type_0")) {
                    z4 = false;
                    break;
                }
                z4 = -1;
                break;
            case 1743582863:
                if (string.equals("requester_type_1")) {
                    z4 = true;
                    break;
                }
                z4 = -1;
                break;
            case 1743582864:
                if (string.equals("requester_type_2")) {
                    z4 = 2;
                    break;
                }
                z4 = -1;
                break;
            case 1743582865:
                if (string.equals("requester_type_3")) {
                    z4 = 3;
                    break;
                }
                z4 = -1;
                break;
            case 1743582866:
                if (string.equals("requester_type_4")) {
                    z4 = 4;
                    break;
                }
                z4 = -1;
                break;
            case 1743582867:
                if (string.equals("requester_type_5")) {
                    z4 = 5;
                    break;
                }
                z4 = -1;
                break;
            case 1743582868:
                if (string.equals("requester_type_6")) {
                    z4 = 6;
                    break;
                }
                z4 = -1;
                break;
            case 1743582869:
                if (string.equals("requester_type_7")) {
                    z4 = 7;
                    break;
                }
                z4 = -1;
                break;
            case 1743582870:
                if (string.equals("requester_type_8")) {
                    z4 = 8;
                    break;
                }
                z4 = -1;
                break;
            default:
                z4 = -1;
                break;
        }
        switch (z4) {
            case false:
                return 0;
            case true:
                return 1;
            case true:
                return 2;
            case true:
                return 3;
            case true:
                return 4;
            case true:
                return 5;
            case true:
                return 6;
            case true:
                return 7;
            case true:
                return 8;
            default:
                return -1;
        }
    }

    public final PackageInfo zzc() {
        return this.zza.zzf;
    }

    public final String zzd() {
        return this.zza.zzd;
    }

    public final String zze() {
        return zzfty.zzc(this.zza.zza.getString("ms"));
    }

    public final String zzf() {
        return this.zza.zzh;
    }

    public final List zzg() {
        return this.zza.zze;
    }

    public final boolean zzh() {
        return this.zza.zzl;
    }

    public final boolean zzi() {
        return this.zza.zza.getBoolean("is_gbid");
    }

    public final boolean zzj() {
        return this.zza.zzk;
    }
}
