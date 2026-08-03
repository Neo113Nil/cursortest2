package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzamw extends com.google.android.gms.internal.ads.zzamz {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    zzamw() {
    }

    public static boolean zzd(com.google.android.gms.internal.ads.zzet zzetVar) {
        return zzk(zzetVar, zza);
    }

    private static boolean zzk(com.google.android.gms.internal.ads.zzet zzetVar, byte[] bArr) {
        if (zzetVar.zzd() < 8) {
            return false;
        }
        int zzg = zzetVar.zzg();
        byte[] bArr2 = new byte[8];
        zzetVar.zzm(bArr2, 0, 8);
        zzetVar.zzh(zzg);
        return java.util.Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    protected final long zzb(com.google.android.gms.internal.ads.zzet zzetVar) {
        return zzi(com.google.android.gms.internal.ads.zzgv.zzd(zzetVar.zzi()));
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(com.google.android.gms.internal.ads.zzet zzetVar, long j, com.google.android.gms.internal.ads.zzamx zzamxVar) throws com.google.android.gms.internal.ads.zzat {
        if (zzk(zzetVar, zza)) {
            byte[] copyOf = java.util.Arrays.copyOf(zzetVar.zzi(), zzetVar.zze());
            int i = copyOf[9] & 255;
            java.util.List zza2 = com.google.android.gms.internal.ads.zzgv.zza(copyOf);
            if (zzamxVar.zza != null) {
                return true;
            }
            com.google.android.gms.internal.ads.zzt zztVar = new com.google.android.gms.internal.ads.zzt();
            zztVar.zzn("audio/ogg");
            zztVar.zzo("audio/opus");
            zztVar.zzG(i);
            zztVar.zzH(48000);
            zztVar.zzr(zza2);
            zzamxVar.zza = zztVar.zzO();
            return true;
        }
        if (!zzk(zzetVar, zzb)) {
            zzamxVar.zza.getClass();
            return false;
        }
        zzamxVar.zza.getClass();
        if (this.zzc) {
            return true;
        }
        this.zzc = true;
        zzetVar.zzk(8);
        com.google.android.gms.internal.ads.zzap zzb2 = com.google.android.gms.internal.ads.zzahm.zzb(com.google.android.gms.internal.ads.zzgwm.zzr(com.google.android.gms.internal.ads.zzhe.zzb(zzetVar, false, false).zza));
        if (zzb2 == null) {
            return true;
        }
        com.google.android.gms.internal.ads.zzt zza3 = zzamxVar.zza.zza();
        zza3.zzl(zzb2.zzf(zzamxVar.zza.zzl));
        zzamxVar.zza = zza3.zzO();
        return true;
    }
}
