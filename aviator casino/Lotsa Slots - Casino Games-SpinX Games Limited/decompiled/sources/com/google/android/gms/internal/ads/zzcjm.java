package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcjm implements com.google.android.gms.internal.ads.zzly {
    private final com.google.android.gms.internal.ads.zzabr zza = new com.google.android.gms.internal.ads.zzabr(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    zzcjm() {
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final void zza(com.google.android.gms.internal.ads.zzqf zzqfVar) {
        zzo(false);
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final void zzb(com.google.android.gms.internal.ads.zzlx zzlxVar, com.google.android.gms.internal.ads.zzzn zzznVar, com.google.android.gms.internal.ads.zzaba[] zzabaVarArr) {
        int i;
        this.zzf = 0;
        for (com.google.android.gms.internal.ads.zzaba zzabaVar : zzabaVarArr) {
            if (zzabaVar != null) {
                int i2 = this.zzf;
                int i3 = zzabaVar.zza().zzc;
                if (i3 == 0) {
                    i = 144310272;
                } else if (i3 == 1) {
                    i = 13107200;
                } else if (i3 != 2) {
                    i = 131072;
                    if (i3 != 3 && i3 != 5 && i3 != 6) {
                        throw new java.lang.IllegalArgumentException();
                    }
                } else {
                    i = 131072000;
                }
                this.zzf = i2 + i;
            }
        }
        this.zza.zzf(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final void zzc(com.google.android.gms.internal.ads.zzqf zzqfVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final void zzd(com.google.android.gms.internal.ads.zzqf zzqfVar) {
        zzo(true);
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final com.google.android.gms.internal.ads.zzabl zze(com.google.android.gms.internal.ads.zzqf zzqfVar) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final long zzf(com.google.android.gms.internal.ads.zzqf zzqfVar) {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final boolean zzg(com.google.android.gms.internal.ads.zzqf zzqfVar) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final boolean zzh(com.google.android.gms.internal.ads.zzlx zzlxVar) {
        long j = zzlxVar.zze;
        boolean z = true;
        char c = j > this.zzc ? (char) 0 : j < this.zzb ? (char) 2 : (char) 1;
        int zzg = this.zza.zzg();
        int i = this.zzf;
        if (c != 2 && (c != 1 || !this.zzg || zzg >= i)) {
            z = false;
        }
        this.zzg = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public final boolean zzi(com.google.android.gms.internal.ads.zzlx zzlxVar) {
        long j = zzlxVar.zzg ? this.zze : this.zzd;
        return j <= 0 || zzlxVar.zze >= j;
    }

    @Override // com.google.android.gms.internal.ads.zzly
    public /* synthetic */ boolean zzj(com.google.android.gms.internal.ads.zzqf zzqfVar, com.google.android.gms.internal.ads.zzbf zzbfVar, com.google.android.gms.internal.ads.zzxk zzxkVar, long j) {
        return com.google.android.gms.internal.ads.zzly.CC.$default$zzj(this, zzqfVar, zzbfVar, zzxkVar, j);
    }

    public final synchronized void zzk(int i) {
        this.zzb = i * 1000;
    }

    public final synchronized void zzl(int i) {
        this.zzc = i * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zzd = i * 1000;
    }

    public final synchronized void zzn(int i) {
        this.zze = i * 1000;
    }

    final void zzo(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zze();
        }
    }
}
