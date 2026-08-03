package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfg implements com.google.android.gms.internal.ads.zzdz {
    private static final java.util.List zza = new java.util.ArrayList(50);
    private final android.os.Handler zzb;

    public zzfg(android.os.Handler handler) {
        this.zzb = handler;
    }

    static /* synthetic */ void zzo(com.google.android.gms.internal.ads.zzff zzffVar) {
        java.util.List list = zza;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(zzffVar);
            }
        }
    }

    private static com.google.android.gms.internal.ads.zzff zzp() {
        com.google.android.gms.internal.ads.zzff zzffVar;
        java.util.List list = zza;
        synchronized (list) {
            zzffVar = list.isEmpty() ? new com.google.android.gms.internal.ads.zzff(null) : (com.google.android.gms.internal.ads.zzff) list.remove(list.size() - 1);
        }
        return zzffVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final android.os.Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final boolean zzb(int i) {
        return this.zzb.hasMessages(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final com.google.android.gms.internal.ads.zzdy zzc(int i) {
        android.os.Handler handler = this.zzb;
        com.google.android.gms.internal.ads.zzff zzp = zzp();
        zzp.zzb(handler.obtainMessage(i), this);
        return zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final com.google.android.gms.internal.ads.zzdy zzd(int i, java.lang.Object obj) {
        android.os.Handler handler = this.zzb;
        com.google.android.gms.internal.ads.zzff zzp = zzp();
        zzp.zzb(handler.obtainMessage(i, obj), this);
        return zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final com.google.android.gms.internal.ads.zzdy zze(int i, int i2, int i3) {
        android.os.Handler handler = this.zzb;
        com.google.android.gms.internal.ads.zzff zzp = zzp();
        zzp.zzb(handler.obtainMessage(i, i2, i3), this);
        return zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final com.google.android.gms.internal.ads.zzdy zzf(int i, int i2, int i3, java.lang.Object obj) {
        android.os.Handler handler = this.zzb;
        com.google.android.gms.internal.ads.zzff zzp = zzp();
        zzp.zzb(handler.obtainMessage(31, 0, 0, obj), this);
        return zzp;
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final boolean zzg(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        return ((com.google.android.gms.internal.ads.zzff) zzdyVar).zzc(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final boolean zzh(int i) {
        return this.zzb.sendEmptyMessage(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final boolean zzi(int i, int i2) {
        return this.zzb.sendEmptyMessageDelayed(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final boolean zzj(int i, long j) {
        return this.zzb.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zzk(int i) {
        this.zzb.removeMessages(i);
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final void zzl(java.lang.Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final boolean zzm(java.lang.Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzdz
    public final boolean zzn(java.lang.Runnable runnable, long j) {
        return this.zzb.postDelayed(runnable, 1000L);
    }
}
