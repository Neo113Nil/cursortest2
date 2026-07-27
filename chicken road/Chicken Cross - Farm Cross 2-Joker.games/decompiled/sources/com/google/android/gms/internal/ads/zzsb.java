package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzsb {
    public final zzv zza;

    @Deprecated
    public final int zzb = 0;
    public final zzhbf zzc;
    public final zzbf zzd;
    public final zzxo zze;

    /* synthetic */ zzsb(zzsa zzsaVar, byte[] bArr) {
        this.zza = zzsaVar.zze();
        this.zzc = zzsaVar.zzf();
        this.zzd = zzsaVar.zzg();
        this.zze = zzsaVar.zzh();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzsb)) {
            return false;
        }
        zzsb zzsbVar = (zzsb) obj;
        int i = zzsbVar.zzb;
        return this.zza.equals(zzsbVar.zza) && Objects.equals(this.zzc, zzsbVar.zzc) && this.zzd.equals(zzsbVar.zzd) && Objects.equals(this.zze, zzsbVar.zze);
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() * 961;
        zzhbf zzhbfVar = this.zzc;
        int hashCode2 = ((hashCode + (zzhbfVar == null ? 0 : zzhbfVar.hashCode())) * 31) + this.zzd.hashCode();
        zzxo zzxoVar = this.zze;
        return (hashCode2 * 31) + (zzxoVar != null ? zzxoVar.hashCode() : 0);
    }
}
