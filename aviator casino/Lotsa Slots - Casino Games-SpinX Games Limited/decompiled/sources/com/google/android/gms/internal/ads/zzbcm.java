package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbcm extends com.google.android.gms.internal.ads.zzbdf {
    private final com.google.android.gms.internal.ads.zzbbt zzh;

    public zzbcm(com.google.android.gms.internal.ads.zzbbs zzbbsVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzaxm zzaxmVar, int i, int i2, com.google.android.gms.internal.ads.zzbbt zzbbtVar) {
        super(zzbbsVar, "4UiqdD16WGcqj9vsERkA6tbA4c/2yE/sXnYMi3TR5nPXoyMXncc0iB8g5zhndeqU", "5yR6P4d4j2VnbvLNLQtiv9yBd7AWiKZJ6Mp0Kq9QPto=", zzaxmVar, i, 85);
        this.zzh = zzbbtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.reflect.Method method = this.zze;
        com.google.android.gms.internal.ads.zzbbt zzbbtVar = this.zzh;
        long[] jArr = (long[]) method.invoke(null, java.lang.Long.valueOf(zzbbtVar.zzf()), java.lang.Long.valueOf(zzbbtVar.zzg()), java.lang.Long.valueOf(zzbbtVar.zzi()), java.lang.Long.valueOf(zzbbtVar.zzh()));
        com.google.android.gms.internal.ads.zzaxm zzaxmVar = this.zzd;
        synchronized (zzaxmVar) {
            zzaxmVar.zzY(jArr[0]);
            zzaxmVar.zzZ(jArr[1]);
        }
    }
}
