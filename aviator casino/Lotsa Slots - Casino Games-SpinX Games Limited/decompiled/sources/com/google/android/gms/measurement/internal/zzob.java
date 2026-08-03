package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
public final class zzob extends com.google.android.gms.measurement.internal.zzg {
    protected final com.google.android.gms.measurement.internal.zzoa zza;
    protected final com.google.android.gms.measurement.internal.zznz zzb;
    protected final com.google.android.gms.measurement.internal.zznx zzc;
    private android.os.Handler zzd;
    private boolean zze;

    zzob(com.google.android.gms.measurement.internal.zzib zzibVar) {
        super(zzibVar);
        this.zze = true;
        this.zza = new com.google.android.gms.measurement.internal.zzoa(this);
        this.zzb = new com.google.android.gms.measurement.internal.zznz(this);
        this.zzc = new com.google.android.gms.measurement.internal.zznx(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzn, reason: merged with bridge method [inline-methods] */
    public final void zzj() {
        zzg();
        if (this.zzd == null) {
            this.zzd = new com.google.android.gms.internal.measurement.zzcn(android.os.Looper.getMainLooper());
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzg
    protected final boolean zze() {
        return false;
    }

    final void zzh(boolean z) {
        zzg();
        this.zze = z;
    }

    final boolean zzi() {
        zzg();
        return this.zze;
    }

    final /* synthetic */ void zzk(long j) {
        zzg();
        zzj();
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        zzibVar.zzaV().zzk().zzb("Activity resumed, time", java.lang.Long.valueOf(j));
        if (zzibVar.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzaU)) {
            if (zzibVar.zzc().zzv() || this.zze) {
                this.zzb.zza(j);
            }
        } else if (zzibVar.zzc().zzv() || zzibVar.zzd().zzn.zza()) {
            this.zzb.zza(j);
        }
        this.zzc.zza();
        com.google.android.gms.measurement.internal.zzoa zzoaVar = this.zza;
        com.google.android.gms.measurement.internal.zzob zzobVar = zzoaVar.zza;
        zzobVar.zzg();
        if (zzobVar.zzu.zzB()) {
            zzoaVar.zzb(zzobVar.zzu.zzaZ().currentTimeMillis(), false);
        }
    }

    final /* synthetic */ void zzl(long j) {
        zzg();
        zzj();
        com.google.android.gms.measurement.internal.zzib zzibVar = this.zzu;
        zzibVar.zzaV().zzk().zzb("Activity paused, time", java.lang.Long.valueOf(j));
        this.zzc.zzb(j);
        if (zzibVar.zzc().zzv()) {
            this.zzb.zzb(j);
        }
    }

    final /* synthetic */ android.os.Handler zzm() {
        return this.zzd;
    }
}
