package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfmm {
    private final int zzb;
    private final int zzc;
    private final java.util.LinkedList zza = new java.util.LinkedList();
    private final com.google.android.gms.internal.ads.zzfnl zzd = new com.google.android.gms.internal.ads.zzfnl();

    public zzfmm(int i, int i2) {
        this.zzb = i;
        this.zzc = i2;
    }

    private final void zzi() {
        while (true) {
            java.util.LinkedList linkedList = this.zza;
            if (linkedList.isEmpty()) {
                return;
            }
            if (com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - ((com.google.android.gms.internal.ads.zzfmw) linkedList.getFirst()).zzd < this.zzc) {
                return;
            }
            this.zzd.zzc();
            linkedList.remove();
        }
    }

    public final boolean zza(com.google.android.gms.internal.ads.zzfmw zzfmwVar) {
        this.zzd.zza();
        zzi();
        java.util.LinkedList linkedList = this.zza;
        if (linkedList.size() == this.zzb) {
            return false;
        }
        linkedList.add(zzfmwVar);
        return true;
    }

    public final com.google.android.gms.internal.ads.zzfmw zzb() {
        com.google.android.gms.internal.ads.zzfnl zzfnlVar = this.zzd;
        zzfnlVar.zza();
        zzi();
        java.util.LinkedList linkedList = this.zza;
        if (linkedList.isEmpty()) {
            return null;
        }
        com.google.android.gms.internal.ads.zzfmw zzfmwVar = (com.google.android.gms.internal.ads.zzfmw) linkedList.remove();
        if (zzfmwVar != null) {
            zzfnlVar.zzb();
        }
        return zzfmwVar;
    }

    public final int zzc() {
        zzi();
        return this.zza.size();
    }

    public final long zzd() {
        return this.zzd.zzd();
    }

    public final long zze() {
        return this.zzd.zze();
    }

    public final int zzf() {
        return this.zzd.zzf();
    }

    public final java.lang.String zzg() {
        return this.zzd.zzh();
    }

    public final com.google.android.gms.internal.ads.zzfnk zzh() {
        return this.zzd.zzg();
    }
}
