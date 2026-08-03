package com.google.android.gms.internal.consent_sdk;

/* compiled from: com.google.android.ump:user-messaging-platform@@4.0.0 */
/* loaded from: classes4.dex */
final class zzru implements com.google.android.gms.internal.consent_sdk.zzsa {
    private final com.google.android.gms.internal.consent_sdk.zzrq zza;
    private final com.google.android.gms.internal.consent_sdk.zzsp zzb;
    private final boolean zzc;
    private final com.google.android.gms.internal.consent_sdk.zzqb zzd;

    private zzru(com.google.android.gms.internal.consent_sdk.zzsp zzspVar, com.google.android.gms.internal.consent_sdk.zzqb zzqbVar, com.google.android.gms.internal.consent_sdk.zzrq zzrqVar) {
        this.zzb = zzspVar;
        this.zzc = zzrqVar instanceof com.google.android.gms.internal.consent_sdk.zzqk;
        this.zzd = zzqbVar;
        this.zza = zzrqVar;
    }

    static com.google.android.gms.internal.consent_sdk.zzru zzi(com.google.android.gms.internal.consent_sdk.zzsp zzspVar, com.google.android.gms.internal.consent_sdk.zzqb zzqbVar, com.google.android.gms.internal.consent_sdk.zzrq zzrqVar) {
        return new com.google.android.gms.internal.consent_sdk.zzru(zzspVar, zzqbVar, zzrqVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final int zza(java.lang.Object obj) {
        int zzb = ((com.google.android.gms.internal.consent_sdk.zzqm) obj).zzc.zzb();
        return this.zzc ? zzb + ((com.google.android.gms.internal.consent_sdk.zzqk) obj).zzb.zzd() : zzb;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final int zzb(java.lang.Object obj) {
        int hashCode = ((com.google.android.gms.internal.consent_sdk.zzqm) obj).zzc.hashCode();
        return this.zzc ? (hashCode * 53) + ((com.google.android.gms.internal.consent_sdk.zzqk) obj).zzb.zza.hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final java.lang.Object zzc() {
        com.google.android.gms.internal.consent_sdk.zzrq zzrqVar = this.zza;
        return zzrqVar instanceof com.google.android.gms.internal.consent_sdk.zzqm ? ((com.google.android.gms.internal.consent_sdk.zzqm) zzrqVar).zzr() : zzrqVar.zzu().zzk();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final void zzd(java.lang.Object obj) {
        this.zzb.zza(obj);
        this.zzd.zza(obj);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final void zze(java.lang.Object obj, java.lang.Object obj2) {
        com.google.android.gms.internal.consent_sdk.zzsc.zzp(this.zzb, obj, obj2);
        if (this.zzc) {
            com.google.android.gms.internal.consent_sdk.zzsc.zzo(this.zzd, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final void zzf(java.lang.Object obj, com.google.android.gms.internal.consent_sdk.zztb zztbVar) throws java.io.IOException {
        java.util.Iterator zzf = ((com.google.android.gms.internal.consent_sdk.zzqk) obj).zzb.zzf();
        while (zzf.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) zzf.next();
            com.google.android.gms.internal.consent_sdk.zzqe zzqeVar = (com.google.android.gms.internal.consent_sdk.zzqe) entry.getKey();
            if (zzqeVar.zzc() != com.google.android.gms.internal.consent_sdk.zzta.MESSAGE || zzqeVar.zze() || zzqeVar.zzd()) {
                throw new java.lang.IllegalStateException("Found invalid MessageSet item.");
            }
            if (entry instanceof com.google.android.gms.internal.consent_sdk.zzqw) {
                zztbVar.zzw(zzqeVar.zza(), ((com.google.android.gms.internal.consent_sdk.zzqw) entry).zza().zzb());
            } else {
                zztbVar.zzw(zzqeVar.zza(), entry.getValue());
            }
        }
        ((com.google.android.gms.internal.consent_sdk.zzqm) obj).zzc.zzh(zztbVar);
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final boolean zzg(java.lang.Object obj, java.lang.Object obj2) {
        if (!((com.google.android.gms.internal.consent_sdk.zzqm) obj).zzc.equals(((com.google.android.gms.internal.consent_sdk.zzqm) obj2).zzc)) {
            return false;
        }
        if (this.zzc) {
            return ((com.google.android.gms.internal.consent_sdk.zzqk) obj).zzb.equals(((com.google.android.gms.internal.consent_sdk.zzqk) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzsa
    public final boolean zzh(java.lang.Object obj) {
        return ((com.google.android.gms.internal.consent_sdk.zzqk) obj).zzb.zzj();
    }
}
