package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzhgu extends zzhga {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzhgt zzd;

    /* synthetic */ zzhgu(int i, int i2, int i3, zzhgt zzhgtVar, byte[] bArr) {
        this.zza = i;
        this.zzb = i2;
        this.zzd = zzhgtVar;
    }

    public static zzhgs zzb() {
        return new zzhgs(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhgu)) {
            return false;
        }
        zzhgu zzhguVar = (zzhgu) obj;
        if (zzhguVar.zza == this.zza && zzhguVar.zzb == this.zzb) {
            int i = zzhguVar.zzc;
            if (zzhguVar.zzd == this.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(zzhgu.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        int length = String.valueOf(valueOf).length();
        int i = this.zzb;
        int length2 = String.valueOf(i).length();
        int length3 = String.valueOf(16).length();
        int i2 = this.zza;
        StringBuilder sb = new StringBuilder(length + 30 + length2 + 10 + length3 + 15 + String.valueOf(i2).length() + 10);
        sb.append("AesEax Parameters (variant: ");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(i);
        sb.append("-byte IV, 16-byte tag, and ");
        sb.append(i2);
        sb.append("-byte key)");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzhfj
    public final boolean zza() {
        return this.zzd != zzhgt.zzc;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final zzhgt zze() {
        return this.zzd;
    }
}
