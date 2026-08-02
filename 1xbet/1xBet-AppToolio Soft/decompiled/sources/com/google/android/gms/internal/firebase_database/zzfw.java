package com.google.android.gms.internal.firebase_database;

import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public interface zzfw {
    void beginTransaction();

    void endTransaction();

    void setTransactionSuccessful();

    zzja zza(zzch zzchVar);

    Set<zzid> zza(Set<Long> set);

    void zza(long j);

    void zza(long j, Set<zzid> set);

    void zza(long j, Set<zzid> set, Set<zzid> set2);

    void zza(zzch zzchVar, zzbv zzbvVar);

    void zza(zzch zzchVar, zzbv zzbvVar, long j);

    void zza(zzch zzchVar, zzfx zzfxVar);

    void zza(zzch zzchVar, zzja zzjaVar);

    void zza(zzch zzchVar, zzja zzjaVar, long j);

    void zza(zzgb zzgbVar);

    void zzb(long j);

    void zzb(zzch zzchVar, zzja zzjaVar);

    void zzc(long j);

    Set<zzid> zzd(long j);

    List<zzfa> zzj();

    long zzk();

    List<zzgb> zzl();

    void zzm();
}
