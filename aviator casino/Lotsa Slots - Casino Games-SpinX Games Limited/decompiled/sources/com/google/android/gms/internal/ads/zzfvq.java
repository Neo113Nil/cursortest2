package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfvq implements com.google.android.gms.internal.ads.zzfvj {
    private static com.google.android.gms.internal.ads.zzfvq zza;
    private float zzb = 0.0f;
    private com.google.android.gms.internal.ads.zzfve zzc;
    private com.google.android.gms.internal.ads.zzfvi zzd;

    public zzfvq(com.google.android.gms.internal.ads.zzfvf zzfvfVar, com.google.android.gms.internal.ads.zzfvb zzfvbVar) {
    }

    public static com.google.android.gms.internal.ads.zzfvq zza() {
        if (zza == null) {
            zza = new com.google.android.gms.internal.ads.zzfvq(new com.google.android.gms.internal.ads.zzfvf(), new com.google.android.gms.internal.ads.zzfvb());
        }
        return zza;
    }

    public final void zzb(android.content.Context context) {
        this.zzc = new com.google.android.gms.internal.ads.zzfve(new android.os.Handler(), context, new com.google.android.gms.internal.ads.zzfva(), this);
    }

    public final void zzc() {
        com.google.android.gms.internal.ads.zzfvh.zza().zzg(this);
        com.google.android.gms.internal.ads.zzfvh.zza().zze();
        com.google.android.gms.internal.ads.zzfws.zzb().zzc();
        this.zzc.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzfvj
    public final void zzd(boolean z) {
        if (z) {
            com.google.android.gms.internal.ads.zzfws.zzb().zzc();
        } else {
            com.google.android.gms.internal.ads.zzfws.zzb().zze();
        }
    }

    public final void zze() {
        com.google.android.gms.internal.ads.zzfws.zzb().zzd();
        com.google.android.gms.internal.ads.zzfvh.zza().zzf();
        this.zzc.zzb();
    }

    public final void zzf(float f) {
        this.zzb = f;
        if (this.zzd == null) {
            this.zzd = com.google.android.gms.internal.ads.zzfvi.zza();
        }
        java.util.Iterator it = this.zzd.zzf().iterator();
        while (it.hasNext()) {
            ((com.google.android.gms.internal.ads.zzfuo) it.next()).zzg().zzo(f);
        }
    }

    public final float zzg() {
        return this.zzb;
    }
}
