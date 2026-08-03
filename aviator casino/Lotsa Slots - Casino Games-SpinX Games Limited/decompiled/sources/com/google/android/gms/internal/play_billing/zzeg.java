package com.google.android.gms.internal.play_billing;

/* compiled from: com.android.billingclient:billing@@7.0.0 */
/* loaded from: classes4.dex */
final class zzeg implements com.google.android.gms.internal.play_billing.zzeo {
    private final com.google.android.gms.internal.play_billing.zzec zza;
    private final com.google.android.gms.internal.play_billing.zzff zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.play_billing.zzce zzd;

    private zzeg(com.google.android.gms.internal.play_billing.zzff zzffVar, com.google.android.gms.internal.play_billing.zzce zzceVar, com.google.android.gms.internal.play_billing.zzec zzecVar) {
        this.zzb = zzffVar;
        this.zzc = zzceVar.zzf(zzecVar);
        this.zzd = zzceVar;
        this.zza = zzecVar;
    }

    static com.google.android.gms.internal.play_billing.zzeg zzc(com.google.android.gms.internal.play_billing.zzff zzffVar, com.google.android.gms.internal.play_billing.zzce zzceVar, com.google.android.gms.internal.play_billing.zzec zzecVar) {
        return new com.google.android.gms.internal.play_billing.zzeg(zzffVar, zzceVar, zzecVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final int zza(java.lang.Object obj) {
        com.google.android.gms.internal.play_billing.zzff zzffVar = this.zzb;
        int zzb = zzffVar.zzb(zzffVar.zzd(obj));
        return this.zzc ? zzb + this.zzd.zzb(obj).zzc() : zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final int zzb(java.lang.Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        return this.zzc ? (hashCode * 53) + this.zzd.zzb(obj).zza.hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final java.lang.Object zze() {
        com.google.android.gms.internal.play_billing.zzec zzecVar = this.zza;
        return zzecVar instanceof com.google.android.gms.internal.play_billing.zzcs ? ((com.google.android.gms.internal.play_billing.zzcs) zzecVar).zzl() : zzecVar.zzE().zzg();
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzf(java.lang.Object obj) {
        this.zzb.zzg(obj);
        this.zzd.zzd(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzg(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.play_billing.zzeq.zzq(this.zzb, obj, obj2);
        if (this.zzc) {
            com.google.android.gms.internal.play_billing.zzeq.zzp(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzh(java.lang.Object obj, byte[] bArr, int i, int i2, com.google.android.gms.internal.play_billing.zzbc zzbcVar) throws java.io.IOException {
        com.google.android.gms.internal.play_billing.zzcs zzcsVar = (com.google.android.gms.internal.play_billing.zzcs) obj;
        if (zzcsVar.zzc == com.google.android.gms.internal.play_billing.zzfg.zzc()) {
            zzcsVar.zzc = com.google.android.gms.internal.play_billing.zzfg.zzf();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final void zzi(java.lang.Object obj, com.google.android.gms.internal.play_billing.zzfx zzfxVar) throws java.io.IOException {
        java.util.Iterator zzf = this.zzd.zzb(obj).zzf();
        while (zzf.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) zzf.next();
            com.google.android.gms.internal.play_billing.zzch zzchVar = (com.google.android.gms.internal.play_billing.zzch) entry.getKey();
            if (zzchVar.zze() != com.google.android.gms.internal.play_billing.zzfw.MESSAGE || zzchVar.zzg() || zzchVar.zzf()) {
                throw new java.lang.IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof com.google.android.gms.internal.play_billing.zzdf) {
                zzfxVar.zzw(zzchVar.zza(), ((com.google.android.gms.internal.play_billing.zzdf) entry).zza().zzb());
            } else {
                zzfxVar.zzw(zzchVar.zza(), entry.getValue());
            }
        }
        com.google.android.gms.internal.play_billing.zzff zzffVar = this.zzb;
        zzffVar.zzi(zzffVar.zzd(obj), zzfxVar);
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final boolean zzj(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.play_billing.zzff zzffVar = this.zzb;
        if (!zzffVar.zzd(obj).equals(zzffVar.zzd(obj2))) {
            return false;
        }
        if (this.zzc) {
            return this.zzd.zzb(obj).equals(this.zzd.zzb(obj2));
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeo
    public final boolean zzk(java.lang.Object obj) {
        return this.zzd.zzb(obj).zzj();
    }
}
