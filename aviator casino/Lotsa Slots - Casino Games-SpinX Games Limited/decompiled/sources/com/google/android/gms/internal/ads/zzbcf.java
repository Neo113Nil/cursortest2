package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbcf extends com.google.android.gms.internal.ads.zzbdf {
    private static final com.google.android.gms.internal.ads.zzbdg zzh = new com.google.android.gms.internal.ads.zzbdg();
    private final android.content.Context zzi;

    public zzbcf(com.google.android.gms.internal.ads.zzbbs zzbbsVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzaxm zzaxmVar, int i, int i2, android.content.Context context) {
        super(zzbbsVar, "00Zqkn2vthPYFLR6iH1rsdxNkw6KyQ/MlAMxaONveqkDgXIjpGg039P2HSigYq2Q", "KTJvuGh/PMe9EapQHUkRl8FZKF5qWyAzLDZ/DWV/log=", zzaxmVar, i, 29);
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        this.zzd.zzp(androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST);
        android.content.Context context = this.zzi;
        java.util.concurrent.atomic.AtomicReference zza = zzh.zza(context.getPackageName());
        if (zza.get() == null) {
            synchronized (zza) {
                if (zza.get() == null) {
                    zza.set((java.lang.String) this.zze.invoke(null, context));
                }
            }
        }
        java.lang.String str = (java.lang.String) zza.get();
        com.google.android.gms.internal.ads.zzaxm zzaxmVar = this.zzd;
        synchronized (zzaxmVar) {
            zzaxmVar.zzp(com.google.android.gms.internal.ads.zzazi.zza(str.getBytes(), true));
        }
    }
}
