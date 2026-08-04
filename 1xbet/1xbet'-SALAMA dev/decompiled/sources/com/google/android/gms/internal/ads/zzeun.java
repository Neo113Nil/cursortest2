package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
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

    public final int zzb() {
        Bundle bundle = this.zza.zza;
        if (bundle == null || bundle.isEmpty()) {
            return -1;
        }
        switch (bundle.getString("query_info_type", "")) {
            case "requester_type_0":
                return 0;
            case "requester_type_1":
                return 1;
            case "requester_type_2":
                return 2;
            case "requester_type_3":
                return 3;
            case "requester_type_4":
                return 4;
            case "requester_type_5":
                return 5;
            case "requester_type_6":
                return 6;
            case "requester_type_7":
                return 7;
            case "requester_type_8":
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
