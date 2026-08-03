package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdwu {
    private final com.google.android.gms.internal.ads.zzgau zza;
    private final java.util.concurrent.atomic.AtomicBoolean zzb = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean zzc = new java.util.concurrent.atomic.AtomicBoolean(false);

    zzdwu(com.google.android.gms.internal.ads.zzgau zzgauVar) {
        this.zza = zzgauVar;
    }

    public final void zza(com.google.android.gms.internal.ads.zzbfl zzbflVar) {
        this.zzc.set(true);
        zzbflVar.zzg(this);
        this.zza.zza();
    }

    public final void zzb(java.lang.String str) {
        if (com.google.android.gms.internal.ads.zzgua.zzc(str) || !this.zzc.get() || this.zzb.getAndSet(true)) {
            return;
        }
        this.zza.zzb(str);
    }

    public final void zzc() {
        if (this.zzb.get()) {
            this.zza.zzg();
        }
    }

    public final void zzd() {
        if (this.zzb.getAndSet(false)) {
            this.zza.zze();
        }
    }

    public final void zze(android.app.Activity activity) {
        if (this.zzb.get()) {
            this.zza.zzd();
        }
    }

    public final void zzf(android.app.Activity activity) {
        if (this.zzb.get()) {
            this.zza.zzc();
        }
    }

    public final boolean zzg(android.app.Activity activity) {
        if (!this.zzb.getAndSet(false)) {
            return false;
        }
        this.zza.zzf();
        return false;
    }
}
