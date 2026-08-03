package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzwq implements com.google.android.gms.internal.ads.zzxv, com.google.android.gms.internal.ads.zzuj {
    final /* synthetic */ com.google.android.gms.internal.ads.zzws zza;
    private final java.lang.Object zzb;
    private com.google.android.gms.internal.ads.zzxu zzc;
    private com.google.android.gms.internal.ads.zzui zzd;

    public zzwq(com.google.android.gms.internal.ads.zzws zzwsVar, java.lang.Object obj) {
        java.util.Objects.requireNonNull(zzwsVar);
        this.zza = zzwsVar;
        this.zzc = zzwsVar.zzf(null);
        this.zzd = zzwsVar.zzh(null);
        this.zzb = obj;
    }

    private final boolean zzf(int i, com.google.android.gms.internal.ads.zzxk zzxkVar) {
        com.google.android.gms.internal.ads.zzxk zzxkVar2;
        if (zzxkVar != null) {
            zzxkVar2 = this.zza.zzx(this.zzb, zzxkVar);
            if (zzxkVar2 == null) {
                return false;
            }
        } else {
            zzxkVar2 = null;
        }
        com.google.android.gms.internal.ads.zzws zzwsVar = this.zza;
        zzwsVar.zzw(this.zzb, 0);
        com.google.android.gms.internal.ads.zzxu zzxuVar = this.zzc;
        int i2 = zzxuVar.zza;
        if (!java.util.Objects.equals(zzxuVar.zzb, zzxkVar2)) {
            this.zzc = zzwsVar.zzg(0, zzxkVar2);
        }
        com.google.android.gms.internal.ads.zzui zzuiVar = this.zzd;
        int i3 = zzuiVar.zza;
        if (java.util.Objects.equals(zzuiVar.zzb, zzxkVar2)) {
            return true;
        }
        this.zzd = zzwsVar.zzi(0, zzxkVar2);
        return true;
    }

    private final com.google.android.gms.internal.ads.zzxg zzg(com.google.android.gms.internal.ads.zzxg zzxgVar, com.google.android.gms.internal.ads.zzxk zzxkVar) {
        com.google.android.gms.internal.ads.zzws zzwsVar = this.zza;
        java.lang.Object obj = this.zzb;
        zzwsVar.zzy(obj, zzxgVar.zzc, zzxkVar);
        zzwsVar.zzy(obj, zzxgVar.zzd, zzxkVar);
        return zzxgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void zzai(int i, com.google.android.gms.internal.ads.zzxk zzxkVar, com.google.android.gms.internal.ads.zzxb zzxbVar, com.google.android.gms.internal.ads.zzxg zzxgVar, int i2) {
        if (zzf(0, zzxkVar)) {
            com.google.android.gms.internal.ads.zzxu zzxuVar = this.zzc;
            zzg(zzxgVar, zzxkVar);
            zzxuVar.zzd(zzxbVar, zzxgVar, i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void zzaj(int i, com.google.android.gms.internal.ads.zzxk zzxkVar, com.google.android.gms.internal.ads.zzxb zzxbVar, com.google.android.gms.internal.ads.zzxg zzxgVar) {
        if (zzf(0, zzxkVar)) {
            com.google.android.gms.internal.ads.zzxu zzxuVar = this.zzc;
            zzg(zzxgVar, zzxkVar);
            zzxuVar.zze(zzxbVar, zzxgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void zzak(int i, com.google.android.gms.internal.ads.zzxk zzxkVar, com.google.android.gms.internal.ads.zzxb zzxbVar, com.google.android.gms.internal.ads.zzxg zzxgVar) {
        if (zzf(0, zzxkVar)) {
            com.google.android.gms.internal.ads.zzxu zzxuVar = this.zzc;
            zzg(zzxgVar, zzxkVar);
            zzxuVar.zzf(zzxbVar, zzxgVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void zzal(int i, com.google.android.gms.internal.ads.zzxk zzxkVar, com.google.android.gms.internal.ads.zzxb zzxbVar, com.google.android.gms.internal.ads.zzxg zzxgVar, java.io.IOException iOException, boolean z) {
        if (zzf(0, zzxkVar)) {
            com.google.android.gms.internal.ads.zzxu zzxuVar = this.zzc;
            zzg(zzxgVar, zzxkVar);
            zzxuVar.zzg(zzxbVar, zzxgVar, iOException, z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final void zzam(int i, com.google.android.gms.internal.ads.zzxk zzxkVar, com.google.android.gms.internal.ads.zzxg zzxgVar) {
        if (zzf(0, zzxkVar)) {
            com.google.android.gms.internal.ads.zzxu zzxuVar = this.zzc;
            zzg(zzxgVar, zzxkVar);
            zzxuVar.zzh(zzxgVar);
        }
    }
}
