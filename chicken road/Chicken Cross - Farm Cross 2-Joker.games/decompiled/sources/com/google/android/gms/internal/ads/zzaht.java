package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public interface zzaht {
    void zzA(zzv zzvVar);

    default void zzP(long j) {
    }

    default int zza(zzj zzjVar, int i, boolean z) throws IOException {
        return zzb(zzjVar, i, z, 0);
    }

    int zzb(zzj zzjVar, int i, boolean z, int i2) throws IOException;

    default void zzc(zzeu zzeuVar, int i) {
        zzd(zzeuVar, i, 0);
    }

    void zzd(zzeu zzeuVar, int i, int i2);

    void zze(long j, int i, int i2, int i3, zzahs zzahsVar);
}
