package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.5.0 */
/* loaded from: classes4.dex */
final class zznp implements com.google.android.gms.internal.measurement.zznw {
    private final com.google.android.gms.internal.measurement.zznl zza;
    private final com.google.android.gms.internal.measurement.zzoh zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.measurement.zzlr zzd;

    private zznp(com.google.android.gms.internal.measurement.zzoh zzohVar, com.google.android.gms.internal.measurement.zzlr zzlrVar, com.google.android.gms.internal.measurement.zznl zznlVar) {
        this.zzb = zzohVar;
        this.zzc = zznlVar instanceof com.google.android.gms.internal.measurement.zzmb;
        this.zzd = zzlrVar;
        this.zza = zznlVar;
    }

    static com.google.android.gms.internal.measurement.zznp zzg(com.google.android.gms.internal.measurement.zzoh zzohVar, com.google.android.gms.internal.measurement.zzlr zzlrVar, com.google.android.gms.internal.measurement.zznl zznlVar) {
        return new com.google.android.gms.internal.measurement.zznp(zzohVar, zzlrVar, zznlVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final java.lang.Object zza() {
        com.google.android.gms.internal.measurement.zznl zznlVar = this.zza;
        return zznlVar instanceof com.google.android.gms.internal.measurement.zzme ? ((com.google.android.gms.internal.measurement.zzme) zznlVar).zzch() : zznlVar.zzcC().zzbf();
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final boolean zzb(java.lang.Object obj, java.lang.Object obj2) {
        if (!((com.google.android.gms.internal.measurement.zzme) obj).zzc.equals(((com.google.android.gms.internal.measurement.zzme) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((com.google.android.gms.internal.measurement.zzmb) obj).zzb.equals(((com.google.android.gms.internal.measurement.zzmb) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final int zzc(java.lang.Object obj) {
        int hashCode = ((com.google.android.gms.internal.measurement.zzme) obj).zzc.hashCode();
        return this.zzc ? (hashCode * 53) + ((com.google.android.gms.internal.measurement.zzmb) obj).zzb.zza.hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final void zzd(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.measurement.zzny.zzD(this.zzb, obj, obj2);
        if (this.zzc) {
            com.google.android.gms.internal.measurement.zzny.zzC(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final int zze(java.lang.Object obj) {
        int zzh = ((com.google.android.gms.internal.measurement.zzme) obj).zzc.zzh();
        return this.zzc ? zzh + ((com.google.android.gms.internal.measurement.zzmb) obj).zzb.zzg() : zzh;
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final void zzf(java.lang.Object obj, com.google.android.gms.internal.measurement.zzou zzouVar) throws java.io.IOException {
        java.util.Iterator zzc = ((com.google.android.gms.internal.measurement.zzmb) obj).zzb.zzc();
        while (zzc.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) zzc.next();
            com.google.android.gms.internal.measurement.zzlu zzluVar = (com.google.android.gms.internal.measurement.zzlu) entry.getKey();
            if (zzluVar.zzc() != com.google.android.gms.internal.measurement.zzot.MESSAGE || zzluVar.zzd() || zzluVar.zze()) {
                throw new java.lang.IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof com.google.android.gms.internal.measurement.zzms) {
                zzouVar.zzv(zzluVar.zza(), ((com.google.android.gms.internal.measurement.zzms) entry).zza().zzc());
            } else {
                zzouVar.zzv(zzluVar.zza(), entry.getValue());
            }
        }
        ((com.google.android.gms.internal.measurement.zzme) obj).zzc.zzf(zzouVar);
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final void zzi(java.lang.Object obj, byte[] bArr, int i, int i2, com.google.android.gms.internal.measurement.zzkv zzkvVar) throws java.io.IOException {
        com.google.android.gms.internal.measurement.zzme zzmeVar = (com.google.android.gms.internal.measurement.zzme) obj;
        if (zzmeVar.zzc == com.google.android.gms.internal.measurement.zzoi.zza()) {
            zzmeVar.zzc = com.google.android.gms.internal.measurement.zzoi.zzb();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final void zzj(java.lang.Object obj) {
        this.zzb.zzb(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.measurement.zznw
    public final boolean zzk(java.lang.Object obj) {
        return ((com.google.android.gms.internal.measurement.zzmb) obj).zzb.zze();
    }
}
