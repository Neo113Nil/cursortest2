package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbpb {
    private final com.google.android.libraries.places.internal.zzcag zza;
    private final com.google.android.libraries.places.internal.zzbug zzb = com.google.android.libraries.places.internal.zzbuh.zza();
    private final com.google.android.libraries.places.internal.zzbug zzc = com.google.android.libraries.places.internal.zzbuh.zza();
    private final com.google.android.libraries.places.internal.zzbug zzd = com.google.android.libraries.places.internal.zzbuh.zza();
    private volatile long zze;

    zzbpb(com.google.android.libraries.places.internal.zzcag zzcagVar) {
        this.zza = zzcagVar;
    }

    public final void zza() {
        this.zzb.zza(1L);
        this.zze = this.zza.zza();
    }

    public final void zzb(boolean z) {
        if (z) {
            this.zzc.zza(1L);
        } else {
            this.zzd.zza(1L);
        }
    }
}
