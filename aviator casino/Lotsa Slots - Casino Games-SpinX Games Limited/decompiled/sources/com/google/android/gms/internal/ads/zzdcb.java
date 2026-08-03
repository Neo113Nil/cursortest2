package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdcb {
    private final android.content.Context zza;
    private final com.google.android.gms.internal.ads.zzfky zzb;
    private final android.os.Bundle zzc;
    private final com.google.android.gms.internal.ads.zzfkr zzd;
    private final com.google.android.gms.internal.ads.zzdbu zze;
    private final com.google.android.gms.internal.ads.zzelx zzf;

    /* synthetic */ zzdcb(com.google.android.gms.internal.ads.zzdca zzdcaVar, byte[] bArr) {
        this.zza = zzdcaVar.zzh();
        this.zzb = zzdcaVar.zzi();
        this.zzc = zzdcaVar.zzj();
        this.zzd = zzdcaVar.zzk();
        this.zze = zzdcaVar.zzl();
        this.zzf = zzdcaVar.zzm();
    }

    final com.google.android.gms.internal.ads.zzdca zza() {
        com.google.android.gms.internal.ads.zzdca zzdcaVar = new com.google.android.gms.internal.ads.zzdca();
        zzdcaVar.zza(this.zza);
        zzdcaVar.zzb(this.zzb);
        zzdcaVar.zzc(this.zzc);
        zzdcaVar.zzd(this.zze);
        zzdcaVar.zzg(this.zzf);
        return zzdcaVar;
    }

    final com.google.android.gms.internal.ads.zzfky zzb() {
        return this.zzb;
    }

    final com.google.android.gms.internal.ads.zzfkr zzc() {
        return this.zzd;
    }

    final android.os.Bundle zzd() {
        return this.zzc;
    }

    final com.google.android.gms.internal.ads.zzdbu zze() {
        return this.zze;
    }

    final android.content.Context zzf(android.content.Context context) {
        return this.zza;
    }

    final com.google.android.gms.internal.ads.zzelx zzg(java.lang.String str) {
        com.google.android.gms.internal.ads.zzelx zzelxVar = this.zzf;
        return zzelxVar != null ? zzelxVar : new com.google.android.gms.internal.ads.zzelx(str);
    }
}
