package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes.dex */
public final class zzfdp {
    private final zzfdi zza;
    private final I3.b zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfdp(final zzfcn zzfcnVar, final zzfdh zzfdhVar, final zzfdi zzfdiVar) {
        this.zza = zzfdiVar;
        this.zzb = zzgbc.zzf(zzgbc.zzn(zzfdhVar.zza(zzfdiVar), new zzgaj() { // from class: com.google.android.gms.internal.ads.zzfdn
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzfdp.zzb(this.zza, zzfdhVar, zzfcnVar, zzfdiVar, (zzfcw) obj);
            }
        }, zzfdiVar.zzb()), Exception.class, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzfdo
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzfdp.zza(this.zza, zzfdhVar, (Exception) obj);
            }
        }, zzfdiVar.zzb());
    }

    public static /* synthetic */ I3.b zza(zzfdp zzfdpVar, zzfdh zzfdhVar, Exception exc) {
        synchronized (zzfdpVar) {
            zzfdpVar.zzd = true;
            throw exc;
        }
    }

    public static /* synthetic */ I3.b zzb(zzfdp zzfdpVar, zzfdh zzfdhVar, zzfcn zzfcnVar, zzfdi zzfdiVar, zzfcw zzfcwVar) {
        I3.b bVarZzh;
        synchronized (zzfdpVar) {
            try {
                zzfdpVar.zzd = true;
                zzfdhVar.zzb(zzfcwVar);
                if (zzfdpVar.zzc) {
                    bVarZzh = zzgbc.zzh(new zzfdg(zzfcwVar, zzfdiVar));
                } else {
                    zzfcnVar.zzd(zzfdiVar.zza(), zzfcwVar);
                    bVarZzh = zzgbc.zzh(null);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVarZzh;
    }

    public final synchronized I3.b zzc(zzfdi zzfdiVar) {
        if (!this.zzd && !this.zzc && this.zza.zza() != null && zzfdiVar.zza() != null && this.zza.zza().equals(zzfdiVar.zza())) {
            this.zzc = true;
            return this.zzb;
        }
        return null;
    }

    public final synchronized void zzd(zzgay zzgayVar) {
        zzgbc.zzr(zzgbc.zzn(this.zzb, new zzgaj() { // from class: com.google.android.gms.internal.ads.zzfdm
            @Override // com.google.android.gms.internal.ads.zzgaj
            public final I3.b zza(Object obj) {
                return zzgbc.zzi();
            }
        }, this.zza.zzb()), zzgayVar, this.zza.zzb());
    }
}
