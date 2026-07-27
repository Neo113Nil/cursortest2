package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzajn implements zzao {
    public final int zza;
    public final String zzb;
    public final String zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final byte[] zzh;

    public zzajn(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.zza = i;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = i2;
        this.zze = i3;
        this.zzf = i4;
        this.zzg = i5;
        this.zzh = bArr;
    }

    public static zzajn zzb(zzeu zzeuVar) {
        int zzB = zzeuVar.zzB();
        String zzh = zzas.zzh(zzeuVar.zzK(zzeuVar.zzB(), StandardCharsets.US_ASCII));
        String zzK = zzeuVar.zzK(zzeuVar.zzB(), StandardCharsets.UTF_8);
        int zzB2 = zzeuVar.zzB();
        int zzB3 = zzeuVar.zzB();
        int zzB4 = zzeuVar.zzB();
        int zzB5 = zzeuVar.zzB();
        int zzB6 = zzeuVar.zzB();
        byte[] bArr = new byte[zzB6];
        zzeuVar.zzm(bArr, 0, zzB6);
        return new zzajn(zzB, zzh, zzK, zzB2, zzB3, zzB4, zzB5, bArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzajn zzajnVar = (zzajn) obj;
            if (this.zza == zzajnVar.zza && this.zzb.equals(zzajnVar.zzb) && this.zzc.equals(zzajnVar.zzc) && this.zzd == zzajnVar.zzd && this.zze == zzajnVar.zze && this.zzf == zzajnVar.zzf && this.zzg == zzajnVar.zzg && Arrays.equals(this.zzh, zzajnVar.zzh)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.zza + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb.hashCode()) * 31) + this.zzc.hashCode()) * 31) + this.zzd) * 31) + this.zze) * 31) + this.zzf) * 31) + this.zzg) * 31) + Arrays.hashCode(this.zzh);
    }

    public final String toString() {
        String str = this.zzb;
        int length = String.valueOf(str).length();
        String str2 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 32 + str2.length());
        sb.append("Picture: mimeType=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzao
    public final void zza(zzam zzamVar) {
        zzamVar.zzf(this.zzh, this.zza);
    }
}
