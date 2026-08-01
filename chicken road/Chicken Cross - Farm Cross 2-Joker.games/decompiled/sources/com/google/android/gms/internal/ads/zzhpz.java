package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhpz extends zzhqc {
    private final int zza;
    private final int zzb;
    private final zzhpy zzc;
    private final zzhpx zzd;

    /* synthetic */ zzhpz(int i, int i2, zzhpy zzhpyVar, zzhpx zzhpxVar, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzhpyVar;
        this.zzd = zzhpxVar;
    }

    public static zzhpw zzb() {
        return new zzhpw(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhpz)) {
            return false;
        }
        zzhpz zzhpzVar = (zzhpz) obj;
        return zzhpzVar.zza == this.zza && zzhpzVar.zze() == zze() && zzhpzVar.zzc == this.zzc && zzhpzVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzhpz.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        zzhpx zzhpxVar = this.zzd;
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(zzhpxVar);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int i = this.zzb;
        int length3 = String.valueOf(i).length();
        int i2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 38 + length2 + 2 + length3 + 16 + String.valueOf(i2).length() + 10);
        sb.append("HMAC Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", hashType: ");
        sb.append(valueOf2);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte tags, and ");
        sb.append(i2);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zzc != zzhpy.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() {
        zzhpy zzhpyVar = this.zzc;
        if (zzhpyVar == zzhpy.zzd) {
            return this.zzb;
        }
        if (zzhpyVar == zzhpy.zza || zzhpyVar == zzhpy.zzb || zzhpyVar == zzhpy.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzhpy zzf() {
        return this.zzc;
    }

    public final zzhpx zzg() {
        return this.zzd;
    }
}
