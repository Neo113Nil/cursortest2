package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
abstract class zzigt {
    private static volatile int zza = 100;

    zzigt() {
    }

    abstract void zza(java.lang.Object obj, int i, long j);

    abstract void zzb(java.lang.Object obj, int i, int i2);

    abstract void zzc(java.lang.Object obj, int i, long j);

    abstract void zzd(java.lang.Object obj, int i, com.google.android.gms.internal.ads.zzida zzidaVar);

    abstract void zze(java.lang.Object obj, int i, java.lang.Object obj2);

    abstract java.lang.Object zzf();

    abstract java.lang.Object zzg(java.lang.Object obj);

    abstract java.lang.Object zzh(java.lang.Object obj);

    abstract void zzi(java.lang.Object obj, java.lang.Object obj2);

    abstract void zzj(java.lang.Object obj);

    final boolean zzk(java.lang.Object obj, com.google.android.gms.internal.ads.zzigc zzigcVar, int i) throws java.io.IOException {
        int zzc = zzigcVar.zzc();
        int i2 = zzc >>> 3;
        int i3 = zzc & 7;
        if (i3 == 0) {
            zza(obj, i2, zzigcVar.zzh());
            return true;
        }
        if (i3 == 1) {
            zzc(obj, i2, zzigcVar.zzj());
            return true;
        }
        if (i3 == 2) {
            zzd(obj, i2, zzigcVar.zzq());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new com.google.android.gms.internal.ads.zziet("Protocol message end-group tag did not match expected tag.");
            }
            if (i3 != 5) {
                throw new com.google.android.gms.internal.ads.zzies("Protocol message tag had invalid wire type.");
            }
            zzb(obj, i2, zzigcVar.zzk());
            return true;
        }
        java.lang.Object zzf = zzf();
        int i4 = i2 << 3;
        int i5 = i + 1;
        if (i5 >= zza) {
            throw new com.google.android.gms.internal.ads.zziet("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzigcVar.zzb() != Integer.MAX_VALUE && zzk(zzf, zzigcVar, i5)) {
        }
        if ((i4 | 4) != zzigcVar.zzc()) {
            throw new com.google.android.gms.internal.ads.zziet("Protocol message end-group tag did not match expected tag.");
        }
        zze(obj, i2, zzg(zzf));
        return true;
    }
}
