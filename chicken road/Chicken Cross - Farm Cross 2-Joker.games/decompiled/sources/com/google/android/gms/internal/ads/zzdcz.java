package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdcz {
    private final Context zza;
    private final zzflw zzb;
    private final Bundle zzc;
    private final zzflp zzd;
    private final zzdcs zze;
    private final zzemv zzf;

    /* synthetic */ zzdcz(zzdcy zzdcyVar, byte[] bArr) {
        this.zza = zzdcyVar.zzh();
        this.zzb = zzdcyVar.zzi();
        this.zzc = zzdcyVar.zzj();
        this.zzd = zzdcyVar.zzk();
        this.zze = zzdcyVar.zzl();
        this.zzf = zzdcyVar.zzm();
    }

    final zzdcy zza() {
        zzdcy zzdcyVar = new zzdcy();
        zzdcyVar.zza(this.zza);
        zzdcyVar.zzb(this.zzb);
        zzdcyVar.zzc(this.zzc);
        zzdcyVar.zzd(this.zze);
        zzdcyVar.zzg(this.zzf);
        return zzdcyVar;
    }

    final zzflw zzb() {
        return this.zzb;
    }

    final zzflp zzc() {
        return this.zzd;
    }

    final Bundle zzd() {
        return this.zzc;
    }

    final zzdcs zze() {
        return this.zze;
    }

    final Context zzf(Context context) {
        return this.zza;
    }

    final zzemv zzg(String str) {
        zzemv zzemvVar = this.zzf;
        return zzemvVar != null ? zzemvVar : new zzemv(str);
    }
}
