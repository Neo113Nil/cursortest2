package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzec {
    public final java.lang.Object zza;
    private com.google.android.gms.internal.ads.zzr zzb = new com.google.android.gms.internal.ads.zzr();
    private boolean zzc;
    private boolean zzd;

    public zzec(java.lang.Object obj) {
        this.zza = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((com.google.android.gms.internal.ads.zzec) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(int i, com.google.android.gms.internal.ads.zzea zzeaVar) {
        if (this.zzd) {
            return;
        }
        if (i != -1) {
            this.zzb.zza(i);
        }
        this.zzc = true;
        zzeaVar.zza(this.zza);
    }

    public final void zzb(com.google.android.gms.internal.ads.zzeb zzebVar) {
        if (this.zzd || !this.zzc) {
            return;
        }
        com.google.android.gms.internal.ads.zzs zzb = this.zzb.zzb();
        this.zzb = new com.google.android.gms.internal.ads.zzr();
        this.zzc = false;
        zzebVar.zza(this.zza, zzb);
    }

    final /* synthetic */ void zzc(com.google.android.gms.internal.ads.zzeb zzebVar) {
        this.zzd = true;
        if (zzebVar == null || !this.zzc) {
            return;
        }
        this.zzc = false;
        zzebVar.zza(this.zza, this.zzb.zzb());
    }
}
