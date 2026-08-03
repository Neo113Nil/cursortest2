package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzgr {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzgt zza;
    private final int zzb;
    private final boolean zzc;
    private final boolean zzd;

    zzgr(com.google.android.gms.measurement.internal.zzgt zzgtVar, int i, boolean z, boolean z2) {
        java.util.Objects.requireNonNull(zzgtVar);
        this.zza = zzgtVar;
        this.zzb = i;
        this.zzc = z;
        this.zzd = z2;
    }

    public final void zza(java.lang.String str) {
        this.zza.zzm(this.zzb, this.zzc, this.zzd, str, null, null, null);
    }

    public final void zzb(java.lang.String str, java.lang.Object obj) {
        this.zza.zzm(this.zzb, this.zzc, this.zzd, str, obj, null, null);
    }

    public final void zzc(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        this.zza.zzm(this.zzb, this.zzc, this.zzd, str, obj, obj2, null);
    }

    public final void zzd(java.lang.String str, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        this.zza.zzm(this.zzb, this.zzc, this.zzd, str, obj, obj2, obj3);
    }
}
