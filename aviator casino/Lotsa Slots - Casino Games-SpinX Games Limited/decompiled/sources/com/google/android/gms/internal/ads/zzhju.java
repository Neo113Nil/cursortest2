package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhju implements com.google.android.gms.internal.ads.zzhdi {
    private final com.google.android.gms.internal.ads.zzhdi zza;
    private final byte[] zzb;

    private zzhju(com.google.android.gms.internal.ads.zzhdi zzhdiVar, byte[] bArr) {
        this.zza = zzhdiVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new java.lang.IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static com.google.android.gms.internal.ads.zzhdi zzb(com.google.android.gms.internal.ads.zzhlz zzhlzVar) throws java.security.GeneralSecurityException {
        byte[] zzc;
        com.google.android.gms.internal.ads.zzhnm zzc2 = zzhlzVar.zzc(com.google.android.gms.internal.ads.zzhdo.zza());
        com.google.android.gms.internal.ads.zzhdi zzhdiVar = (com.google.android.gms.internal.ads.zzhdi) com.google.android.gms.internal.ads.zzhlo.zza().zzc(zzc2.zzg(), com.google.android.gms.internal.ads.zzhdi.class).zza(zzc2.zzb());
        com.google.android.gms.internal.ads.zzhtm zzd = zzc2.zzd();
        int ordinal = zzd.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    zzc = com.google.android.gms.internal.ads.zzhms.zza.zzc();
                } else if (ordinal != 4) {
                    java.lang.String valueOf = java.lang.String.valueOf(zzd);
                    java.lang.String.valueOf(valueOf);
                    throw new java.security.GeneralSecurityException("unknown output prefix type ".concat(java.lang.String.valueOf(valueOf)));
                }
            }
            zzc = com.google.android.gms.internal.ads.zzhms.zza(zzhlzVar.zzb().intValue()).zzc();
        } else {
            zzc = com.google.android.gms.internal.ads.zzhms.zzb(zzhlzVar.zzb().intValue()).zzc();
        }
        return new com.google.android.gms.internal.ads.zzhju(zzhdiVar, zzc);
    }

    public static com.google.android.gms.internal.ads.zzhdi zzc(com.google.android.gms.internal.ads.zzhdi zzhdiVar, com.google.android.gms.internal.ads.zziaz zziazVar) {
        return new com.google.android.gms.internal.ads.zzhju(zzhdiVar, zziazVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzhdi
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws java.security.GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (com.google.android.gms.internal.ads.zzhnz.zze(bArr3, bArr)) {
            return this.zza.zza(java.util.Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new java.security.GeneralSecurityException("wrong prefix");
    }
}
