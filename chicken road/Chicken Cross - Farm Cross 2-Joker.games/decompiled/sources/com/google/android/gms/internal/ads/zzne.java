package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public interface zzne extends zzmz {
    String zzV();

    default long zzW(long j, long j2) {
        if (zze() == 1) {
            return (zzab() || zzac()) ? 1000000L : 10000L;
        }
        return 10000L;
    }

    default boolean zzX(long j) {
        return false;
    }

    default void zzY(float f, float f2) throws zzjn {
    }

    default void zzZ() {
    }

    int zza();

    void zzaa(long j, long j2) throws zzjn;

    boolean zzab();

    boolean zzac();

    zzng zzb();

    void zzc(int i, zzqj zzqjVar, zzdp zzdpVar);

    void zzcT() throws zzjn;

    void zzcU(zzv[] zzvVarArr, zzzg zzzgVar, long j, long j2, zzxo zzxoVar) throws zzjn;

    zzzg zzcV();

    boolean zzcW();

    zzmf zzd();

    int zze();

    void zzf(zznh zznhVar, zzv[] zzvVarArr, zzzg zzzgVar, long j, boolean z, boolean z2, long j2, long j3, zzxo zzxoVar) throws zzjn;

    long zzk();

    void zzl();

    boolean zzm();

    void zzn() throws IOException;

    void zzo(zzbf zzbfVar);

    void zzp(long j, boolean z) throws zzjn;

    void zzq();

    void zzr();

    void zzs();

    default void zzt() {
    }
}
