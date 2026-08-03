package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzmw {
    private final com.google.android.gms.internal.ads.zzmv zza;
    private final com.google.android.gms.internal.ads.zzmu zzb;
    private final com.google.android.gms.internal.ads.zzbf zzc;
    private int zzd;
    private java.lang.Object zze;
    private final android.os.Looper zzf;
    private final int zzg;
    private boolean zzh;
    private boolean zzi;

    public zzmw(com.google.android.gms.internal.ads.zzmu zzmuVar, com.google.android.gms.internal.ads.zzmv zzmvVar, com.google.android.gms.internal.ads.zzbf zzbfVar, int i, com.google.android.gms.internal.ads.zzdo zzdoVar, android.os.Looper looper) {
        this.zzb = zzmuVar;
        this.zza = zzmvVar;
        this.zzc = zzbfVar;
        this.zzf = looper;
        this.zzg = i;
    }

    public final com.google.android.gms.internal.ads.zzmv zza() {
        return this.zza;
    }

    public final com.google.android.gms.internal.ads.zzmw zzb(int i) {
        com.google.android.gms.internal.ads.zzgtj.zzi(!this.zzh);
        this.zzd = i;
        return this;
    }

    public final int zzc() {
        return this.zzd;
    }

    public final com.google.android.gms.internal.ads.zzmw zzd(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzgtj.zzi(!this.zzh);
        this.zze = obj;
        return this;
    }

    public final java.lang.Object zze() {
        return this.zze;
    }

    public final android.os.Looper zzf() {
        return this.zzf;
    }

    public final com.google.android.gms.internal.ads.zzmw zzg() {
        com.google.android.gms.internal.ads.zzgtj.zzi(!this.zzh);
        this.zzh = true;
        this.zzb.zzk(this);
        return this;
    }

    public final synchronized boolean zzh() {
        return false;
    }

    public final synchronized void zzi(boolean z) {
        this.zzi = z | this.zzi;
        notifyAll();
    }
}
