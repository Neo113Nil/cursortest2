package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public abstract class zzgix implements com.google.android.gms.internal.ads.zzgiw {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final com.google.android.gms.internal.ads.zzght zzc;
    private final com.google.android.gms.internal.ads.zzaxm zzd;
    private final com.google.android.gms.internal.ads.zzgqf zze;

    public zzgix(java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzaxm zzaxmVar, com.google.android.gms.internal.ads.zzght zzghtVar, com.google.android.gms.internal.ads.zzgqf zzgqfVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzd = zzaxmVar;
        this.zzc = zzghtVar;
        this.zze = zzgqfVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ java.lang.Object call() throws java.lang.Exception {
        try {
            this.zze.zza();
            java.lang.reflect.Method zzc = this.zzc.zzc(this.zza, this.zzb);
            if (zzc != null) {
                zza(zzc, this.zzd);
            }
            this.zze.zzc();
            return null;
        } catch (java.lang.Throwable th) {
            try {
                this.zze.zzb(th);
                throw th;
            } catch (java.lang.Throwable th2) {
                this.zze.zzc();
                throw th2;
            }
        }
    }

    protected abstract void zza(java.lang.reflect.Method method, com.google.android.gms.internal.ads.zzaxm zzaxmVar) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException;
}
