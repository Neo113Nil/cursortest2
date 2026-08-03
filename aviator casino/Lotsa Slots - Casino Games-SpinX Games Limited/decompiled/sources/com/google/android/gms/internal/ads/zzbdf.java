package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzbdf implements java.util.concurrent.Callable {
    protected final com.google.android.gms.internal.ads.zzbbs zza;
    protected final java.lang.String zzb;
    protected final java.lang.String zzc;
    protected final com.google.android.gms.internal.ads.zzaxm zzd;
    protected java.lang.reflect.Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzbdf(com.google.android.gms.internal.ads.zzbbs zzbbsVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzaxm zzaxmVar, int i, int i2) {
        getClass().getSimpleName();
        this.zza = zzbbsVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzaxmVar;
        this.zzf = i;
        this.zzg = i2;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        int i;
        try {
            long nanoTime = java.lang.System.nanoTime();
            com.google.android.gms.internal.ads.zzbbs zzbbsVar = this.zza;
            java.lang.reflect.Method zzo = zzbbsVar.zzo(this.zzb, this.zzc);
            this.zze = zzo;
            if (zzo == null) {
                return null;
            }
            zza();
            com.google.android.gms.internal.ads.zzbaj zzh = zzbbsVar.zzh();
            if (zzh == null || (i = this.zzf) == Integer.MIN_VALUE) {
                return null;
            }
            zzh.zza(this.zzg, i, (java.lang.System.nanoTime() - nanoTime) / 1000, null, null);
            return null;
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException unused) {
            return null;
        }
    }

    protected abstract void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException;
}
