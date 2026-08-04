package com.google.android.gms.internal.ads;

import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class zzpp {
    private final Handler zza;
    private final zzpq zzb;

    public zzpp(Handler handler, zzpq zzpqVar) {
        this.zza = zzpqVar == null ? null : handler;
        this.zzb = zzpqVar;
    }

    public static /* synthetic */ void zza(zzpp zzppVar, zzhq zzhqVar) {
        int i7 = zzen.zza;
        zzppVar.zzb.zze(zzhqVar);
    }

    public static /* synthetic */ void zzb(zzpp zzppVar, String str) {
        int i7 = zzen.zza;
        zzppVar.zzb.zzc(str);
    }

    public static /* synthetic */ void zzc(zzpp zzppVar, long j) {
        int i7 = zzen.zza;
        zzppVar.zzb.zzg(j);
    }

    public static /* synthetic */ void zzd(zzpp zzppVar, zzpr zzprVar) {
        int i7 = zzen.zza;
        zzppVar.zzb.zzj(zzprVar);
    }

    public static /* synthetic */ void zze(zzpp zzppVar, int i7, long j, long j3) {
        int i8 = zzen.zza;
        zzppVar.zzb.zzk(i7, j, j3);
    }

    public static /* synthetic */ void zzf(zzpp zzppVar, Exception exc) {
        int i7 = zzen.zza;
        zzppVar.zzb.zzh(exc);
    }

    public static /* synthetic */ void zzg(zzpp zzppVar, Exception exc) {
        int i7 = zzen.zza;
        zzppVar.zzb.zza(exc);
    }

    public static /* synthetic */ void zzh(zzpp zzppVar, zzz zzzVar, zzhr zzhrVar) {
        int i7 = zzen.zza;
        zzppVar.zzb.zzf(zzzVar, zzhrVar);
    }

    public static /* synthetic */ void zzi(zzpp zzppVar, boolean z4) {
        int i7 = zzen.zza;
        zzppVar.zzb.zzn(z4);
    }

    public static /* synthetic */ void zzj(zzpp zzppVar, zzpr zzprVar) {
        int i7 = zzen.zza;
        zzppVar.zzb.zzi(zzprVar);
    }

    public static /* synthetic */ void zzk(zzpp zzppVar, String str, long j, long j3) {
        int i7 = zzen.zza;
        zzppVar.zzb.zzb(str, j, j3);
    }

    public static /* synthetic */ void zzl(zzpp zzppVar, zzhq zzhqVar) {
        zzhqVar.zza();
        int i7 = zzen.zza;
        zzppVar.zzb.zzd(zzhqVar);
    }

    public final void zzm(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpj
                @Override // java.lang.Runnable
                public final void run() {
                    zzpp.zzg(this.zza, exc);
                }
            });
        }
    }

    public final void zzn(final Exception exc) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpk
                @Override // java.lang.Runnable
                public final void run() {
                    zzpp.zzf(this.zza, exc);
                }
            });
        }
    }

    public final void zzo(final zzpr zzprVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzph
                @Override // java.lang.Runnable
                public final void run() {
                    zzpp.zzj(this.zza, zzprVar);
                }
            });
        }
    }

    public final void zzp(final zzpr zzprVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpi
                @Override // java.lang.Runnable
                public final void run() {
                    zzpp.zzd(this.zza, zzprVar);
                }
            });
        }
    }

    public final void zzq(final String str, final long j, final long j3) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpn
                @Override // java.lang.Runnable
                public final void run() {
                    zzpp.zzk(this.zza, str, j, j3);
                }
            });
        }
    }

    public final void zzr(final String str) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpo
                @Override // java.lang.Runnable
                public final void run() {
                    zzpp.zzb(this.zza, str);
                }
            });
        }
    }

    public final void zzs(final zzhq zzhqVar) {
        zzhqVar.zza();
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpe
                @Override // java.lang.Runnable
                public final void run() {
                    zzpp.zzl(this.zza, zzhqVar);
                }
            });
        }
    }

    public final void zzt(final zzhq zzhqVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpd
                @Override // java.lang.Runnable
                public final void run() {
                    zzpp.zza(this.zza, zzhqVar);
                }
            });
        }
    }

    public final void zzu(final zzz zzzVar, final zzhr zzhrVar) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpl
                @Override // java.lang.Runnable
                public final void run() {
                    zzpp.zzh(this.zza, zzzVar, zzhrVar);
                }
            });
        }
    }

    public final void zzv(final long j) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpf
                @Override // java.lang.Runnable
                public final void run() {
                    zzpp.zzc(this.zza, j);
                }
            });
        }
    }

    public final void zzw(final boolean z4) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpm
                @Override // java.lang.Runnable
                public final void run() {
                    zzpp.zzi(this.zza, z4);
                }
            });
        }
    }

    public final void zzx(final int i7, final long j, final long j3) {
        Handler handler = this.zza;
        if (handler != null) {
            handler.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzpg
                @Override // java.lang.Runnable
                public final void run() {
                    zzpp.zze(this.zza, i7, j, j3);
                }
            });
        }
    }
}
