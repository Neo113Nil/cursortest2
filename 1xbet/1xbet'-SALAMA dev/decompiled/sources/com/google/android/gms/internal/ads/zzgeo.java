package com.google.android.gms.internal.ads;

import java.util.Objects;
import p031e1.k;

/* JADX INFO: loaded from: classes.dex */
public final class zzgeo extends zzgdx {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzgem zze;
    private final zzgel zzf;

    public /* synthetic */ zzgeo(int i7, int i8, int i9, int i10, zzgem zzgemVar, zzgel zzgelVar, zzgen zzgenVar) {
        this.zza = i7;
        this.zzb = i8;
        this.zzc = i9;
        this.zzd = i10;
        this.zze = zzgemVar;
        this.zzf = zzgelVar;
    }

    public static zzgek zzf() {
        return new zzgek(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgeo)) {
            return false;
        }
        zzgeo zzgeoVar = (zzgeo) obj;
        return zzgeoVar.zza == this.zza && zzgeoVar.zzb == this.zzb && zzgeoVar.zzc == this.zzc && zzgeoVar.zzd == this.zzd && zzgeoVar.zze == this.zze && zzgeoVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Objects.hash(zzgeo.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        StringBuilder sbL = k.l("AesCtrHmacAead Parameters (variant: ", String.valueOf(this.zze), ", hashType: ", String.valueOf(this.zzf), ", ");
        sbL.append(this.zzc);
        sbL.append("-byte IV, and ");
        sbL.append(this.zzd);
        sbL.append("-byte tags, and ");
        sbL.append(this.zza);
        sbL.append("-byte AES key, and ");
        return k.g(sbL, this.zzb, "-byte HMAC key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgdf
    public final boolean zza() {
        return this.zze != zzgem.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        return this.zzd;
    }

    public final zzgel zzg() {
        return this.zzf;
    }

    public final zzgem zzh() {
        return this.zze;
    }
}
