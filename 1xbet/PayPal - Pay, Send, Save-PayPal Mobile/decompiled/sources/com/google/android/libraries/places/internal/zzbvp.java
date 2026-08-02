package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
final class zzbvp extends com.google.android.libraries.places.internal.zzbol {
    final com.google.android.libraries.places.internal.zzbld zza;
    final com.google.android.libraries.places.internal.zzbku zzb;
    final com.google.android.libraries.places.internal.zzbpc zzc;
    final com.google.android.libraries.places.internal.zzbpd zzd;
    java.util.List zze;
    com.google.android.libraries.places.internal.zzbua zzf;
    boolean zzg;
    boolean zzh;
    com.google.android.libraries.places.internal.zzbnw zzi;
    final /* synthetic */ com.google.android.libraries.places.internal.zzbvr zzj;

    zzbvp(com.google.android.libraries.places.internal.zzbvr zzbvrVar, com.google.android.libraries.places.internal.zzbld zzbldVar) {
        java.util.Objects.requireNonNull(zzbvrVar);
        this.zzj = zzbvrVar;
        com.google.common.base.Preconditions.checkNotNull(zzbldVar, "args");
        this.zze = zzbldVar.zza();
        this.zza = zzbldVar;
        com.google.android.libraries.places.internal.zzbku zzb = com.google.android.libraries.places.internal.zzbku.zzb("Subchannel", zzbvrVar.zzb());
        this.zzb = zzb;
        com.google.android.libraries.places.internal.zzbpd zzbpdVar = new com.google.android.libraries.places.internal.zzbpd(zzb, 0, zzbvrVar.zzy().zza(), "Subchannel for ".concat(java.lang.String.valueOf(java.lang.String.valueOf(zzbldVar.zza()))));
        this.zzd = zzbpdVar;
        this.zzc = new com.google.android.libraries.places.internal.zzbpc(zzbpdVar, zzbvrVar.zzy());
    }

    public final java.lang.String toString() {
        return this.zzb.toString();
    }

    @Override // com.google.android.libraries.places.internal.zzblm
    public final void zza(com.google.android.libraries.places.internal.zzblo zzbloVar) {
        com.google.android.libraries.places.internal.zzbvr zzbvrVar = this.zzj;
        com.google.android.libraries.places.internal.zzbnx zzbnxVar = zzbvrVar.zze;
        zzbnxVar.zzc();
        com.google.common.base.Preconditions.checkState(!this.zzg, "already started");
        com.google.common.base.Preconditions.checkState(!this.zzh, "already shutdown");
        com.google.common.base.Preconditions.checkState(!zzbvrVar.zzQ(), "Channel is being terminated");
        this.zzg = true;
        java.lang.String zzb = zzbvrVar.zzb();
        java.util.concurrent.ScheduledExecutorService zzb2 = zzbvrVar.zzv().zzb();
        com.google.android.libraries.places.internal.zzbvn zzbvnVar = new com.google.android.libraries.places.internal.zzbvn(this, zzbloVar);
        com.google.android.libraries.places.internal.zzbmo zzaj = zzbvrVar.zzF().zzb.zzaj();
        com.google.android.libraries.places.internal.zzbkn zzX = zzbvrVar.zzX();
        com.google.android.libraries.places.internal.zzbpb zza = zzbvrVar.zzT().zza();
        com.google.android.libraries.places.internal.zzbpd zzbpdVar = this.zzd;
        com.google.android.libraries.places.internal.zzbku zzbkuVar = this.zzb;
        com.google.android.libraries.places.internal.zzbua zzbuaVar = new com.google.android.libraries.places.internal.zzbua(this.zza, zzb, zzbvrVar.zzD(), zzbvrVar.zzan(), zzbvrVar.zzv(), zzb2, zzbvrVar.zzA(), zzbnxVar, zzbvnVar, zzX, zza, zzbpdVar, zzbkuVar, this.zzc, zzbvrVar.zzC(), zzbvrVar.zzu(), zzaj);
        com.google.android.libraries.places.internal.zzbkj zzbkjVar = new com.google.android.libraries.places.internal.zzbkj();
        zzbkjVar.zza("Child Subchannel started");
        zzbkjVar.zzc(com.google.android.libraries.places.internal.zzbkk.CT_INFO);
        zzbkjVar.zzb(zzbvrVar.zzy().zza());
        zzbkjVar.zzd(zzbuaVar);
        zzbvrVar.zzV().zza(zzbkjVar.zze());
        this.zzf = zzbuaVar;
        zzbvrVar.zzX().zzb(zzbuaVar);
        zzbvrVar.zzH().add(zzbuaVar);
    }

    @Override // com.google.android.libraries.places.internal.zzblm
    public final void zzb() {
        com.google.android.libraries.places.internal.zzbnw zzbnwVar;
        com.google.android.libraries.places.internal.zzbvr zzbvrVar = this.zzj;
        com.google.android.libraries.places.internal.zzbnx zzbnxVar = zzbvrVar.zze;
        zzbnxVar.zzc();
        if (this.zzf == null) {
            this.zzh = true;
            return;
        }
        if (!this.zzh) {
            this.zzh = true;
        } else {
            if (!zzbvrVar.zzQ() || (zzbnwVar = this.zzi) == null) {
                return;
            }
            zzbnwVar.zza();
            this.zzi = null;
        }
        if (zzbvrVar.zzQ()) {
            this.zzf.zzd(com.google.android.libraries.places.internal.zzbvr.zzc);
        } else {
            this.zzi = zzbnxVar.zzd(new com.google.android.libraries.places.internal.zzbuf(new com.google.android.libraries.places.internal.zzbvo(this)), 5L, java.util.concurrent.TimeUnit.SECONDS, zzbvrVar.zzv().zzb());
        }
    }

    @Override // com.google.android.libraries.places.internal.zzblm
    public final void zzc() {
        this.zzj.zze.zzc();
        com.google.common.base.Preconditions.checkState(this.zzg, "not started");
        if (this.zzh) {
            return;
        }
        this.zzf.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzblm
    public final void zzd(java.util.List list) {
        this.zzj.zze.zzc();
        this.zze = list;
        this.zzf.zzb(list);
    }

    @Override // com.google.android.libraries.places.internal.zzblm
    public final java.lang.Object zze() {
        com.google.common.base.Preconditions.checkState(this.zzg, "Subchannel is not started");
        return this.zzf;
    }
}
