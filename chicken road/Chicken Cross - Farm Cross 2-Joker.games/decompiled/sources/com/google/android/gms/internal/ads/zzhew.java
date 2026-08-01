package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhew {
    private boolean zza;

    @Nullable
    private final zzhfj zzc;
    private final zzheu zzb = zzheu.zza;
    private zzhex zzd = null;

    @Nullable
    private zzhey zze = null;

    /* synthetic */ zzhew(zzhfj zzhfjVar, byte[] bArr) {
        this.zzc = zzhfjVar;
    }

    public final zzhew zza() {
        zzhey zzheyVar = this.zze;
        if (zzheyVar != null) {
            zzheyVar.zzc();
        }
        this.zza = true;
        return this;
    }

    public final zzhew zzb() {
        zzhex zzhexVar;
        zzhexVar = zzhex.zza;
        this.zzd = zzhexVar;
        return this;
    }

    final /* synthetic */ boolean zzc() {
        return this.zza;
    }

    final /* synthetic */ void zzd(boolean z) {
        this.zza = false;
    }

    final /* synthetic */ zzheu zze() {
        return this.zzb;
    }

    final /* synthetic */ zzhfj zzf() {
        return this.zzc;
    }

    final /* synthetic */ zzhex zzg() {
        return this.zzd;
    }

    final /* synthetic */ zzhey zzh() {
        return this.zze;
    }

    final /* synthetic */ void zzi(zzhey zzheyVar) {
        this.zze = zzheyVar;
    }
}
