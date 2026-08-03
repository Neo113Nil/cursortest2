package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzamq extends com.google.android.gms.internal.ads.zzamz {
    private com.google.android.gms.internal.ads.zzagl zza;
    private com.google.android.gms.internal.ads.zzamp zzb;

    zzamq() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    protected final void zza(boolean z) {
        super.zza(z);
        if (z) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    protected final long zzb(com.google.android.gms.internal.ads.zzet zzetVar) {
        if (!zzd(zzetVar.zzi())) {
            return -1L;
        }
        int i = (zzetVar.zzi()[2] & 255) >> 4;
        if (i != 6) {
            if (i == 7) {
                i = 7;
            }
            int zzc = com.google.android.gms.internal.ads.zzagg.zzc(zzetVar, i);
            zzetVar.zzh(0);
            return zzc;
        }
        zzetVar.zzk(4);
        zzetVar.zzO();
        int zzc2 = com.google.android.gms.internal.ads.zzagg.zzc(zzetVar, i);
        zzetVar.zzh(0);
        return zzc2;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"#3.format"}, result = false)
    protected final boolean zzc(com.google.android.gms.internal.ads.zzet zzetVar, long j, com.google.android.gms.internal.ads.zzamx zzamxVar) {
        byte[] zzi = zzetVar.zzi();
        com.google.android.gms.internal.ads.zzagl zzaglVar = this.zza;
        if (zzaglVar == null) {
            com.google.android.gms.internal.ads.zzagl zzaglVar2 = new com.google.android.gms.internal.ads.zzagl(zzi, 17);
            this.zza = zzaglVar2;
            com.google.android.gms.internal.ads.zzt zza = zzaglVar2.zzc(java.util.Arrays.copyOfRange(zzi, 9, zzetVar.zze()), null).zza();
            zza.zzn("audio/ogg");
            zzamxVar.zza = zza.zzO();
            return true;
        }
        if ((zzi[0] & Byte.MAX_VALUE) == 3) {
            com.google.android.gms.internal.ads.zzagk zzc = com.google.android.gms.internal.ads.zzagi.zzc(zzetVar);
            com.google.android.gms.internal.ads.zzagl zze = zzaglVar.zze(zzc);
            this.zza = zze;
            this.zzb = new com.google.android.gms.internal.ads.zzamp(zze, zzc);
            return true;
        }
        if (!zzd(zzi)) {
            return true;
        }
        com.google.android.gms.internal.ads.zzamp zzampVar = this.zzb;
        if (zzampVar != null) {
            zzampVar.zzd(j);
            zzamxVar.zzb = this.zzb;
        }
        zzamxVar.zza.getClass();
        return false;
    }
}
