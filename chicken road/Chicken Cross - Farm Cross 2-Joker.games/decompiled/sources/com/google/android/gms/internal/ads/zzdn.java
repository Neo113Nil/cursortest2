package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzdn {
    private final zzea zza;
    private final zzea zzb;
    private final zzdm zzc;
    private Object zzd;
    private Object zze;
    private int zzf;

    public zzdn(Object obj, Looper looper, Looper looper2, zzdp zzdpVar, zzdm zzdmVar) {
        this.zza = zzdpVar.zzd(looper, null);
        this.zzb = zzdpVar.zzd(looper2, null);
        this.zzd = obj;
        this.zze = obj;
        this.zzc = zzdmVar;
    }

    private final void zzh(Runnable runnable) {
        zzea zzeaVar = this.zzb;
        if (zzeaVar.zza().getThread().isAlive()) {
            zzeaVar.zzm(runnable);
        }
    }

    private final void zzi(Object obj) {
        Object obj2 = this.zzd;
        this.zzd = obj;
        if (obj2.equals(obj)) {
            return;
        }
        this.zzc.zza(obj2, obj);
    }

    public final Object zza() {
        zzea zzeaVar = this.zzb;
        Looper myLooper = Looper.myLooper();
        if (myLooper == zzeaVar.zza()) {
            return this.zzd;
        }
        zzguk.zzi(myLooper == this.zza.zza());
        return this.zze;
    }

    public final void zzb(zzgub zzgubVar, final zzgub zzgubVar2) {
        zzguk.zzi(Looper.myLooper() == this.zzb.zza());
        this.zzf++;
        zzd(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdn.this.zze(zzgubVar2);
            }
        });
        zzi(zzgubVar.apply(this.zzd));
    }

    public final void zzc(final Object obj) {
        this.zze = obj;
        zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdn.this.zzf(obj);
            }
        });
    }

    public final void zzd(Runnable runnable) {
        zzea zzeaVar = this.zza;
        if (zzeaVar.zza().getThread().isAlive()) {
            zzeaVar.zzm(runnable);
        }
    }

    final /* synthetic */ void zze(zzgub zzgubVar) {
        final Object apply = zzgubVar.apply(this.zze);
        this.zze = apply;
        zzh(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzdn.this.zzg(apply);
            }
        });
    }

    final /* synthetic */ void zzf(Object obj) {
        if (this.zzf == 0) {
            zzi(obj);
        }
    }

    final /* synthetic */ void zzg(Object obj) {
        int i = this.zzf - 1;
        this.zzf = i;
        if (i == 0) {
            zzi(obj);
        }
    }
}
