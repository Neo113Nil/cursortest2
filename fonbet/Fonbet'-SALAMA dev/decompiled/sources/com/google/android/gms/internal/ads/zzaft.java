package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzaft implements zzau {
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzaft(int i7, String str, String str2, int i8, int i9, int i10, int i11, byte[] bArr) {
        this.zza = i7;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i8;
        this.zze = i9;
        this.zzf = i10;
        this.zzg = i11;
        this.zzh = bArr;
    }

    public static zzaft zzb(zzed zzedVar) {
        int zzg = zzedVar.zzg();
        String zze = zzay.zze(zzedVar.zzB(zzedVar.zzg(), StandardCharsets.US_ASCII));
        String zzB = zzedVar.zzB(zzedVar.zzg(), StandardCharsets.UTF_8);
        int zzg2 = zzedVar.zzg();
        int zzg3 = zzedVar.zzg();
        int zzg4 = zzedVar.zzg();
        int zzg5 = zzedVar.zzg();
        int zzg6 = zzedVar.zzg();
        byte[] bArr = new byte[zzg6];
        zzedVar.zzH(bArr, 0, zzg6);
        return new zzaft(zzg, zze, zzB, zzg2, zzg3, zzg4, zzg5, bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaft.class == obj.getClass()) {
            zzaft zzaftVar = (zzaft) obj;
            if (this.zza == zzaftVar.zza && this.zzb.equals(zzaftVar.zzb) && this.zzc.equals(zzaftVar.zzc) && this.zzd == zzaftVar.zzd && this.zze == zzaftVar.zze && this.zzf == zzaftVar.zzf && this.zzg == zzaftVar.zzg && Arrays.equals(this.zzh, zzaftVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i7 = this.zza + 527;
        int hashCode = this.zzb.hashCode() + (i7 * 31);
        int hashCode2 = this.zzc.hashCode() + (hashCode * 31);
        byte[] bArr = this.zzh;
        return Arrays.hashCode(bArr) + (((((((((hashCode2 * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31);
    }

    public final String toString() {
        return "Picture: mimeType=" + this.zzb + ", description=" + this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzau
    public final void zza(zzar zzarVar) {
        zzarVar.zza(this.zzh, this.zza);
    }
}
