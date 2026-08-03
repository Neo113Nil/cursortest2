package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbcw extends com.google.android.gms.internal.ads.zzbdf {
    private final boolean zzh;

    public zzbcw(com.google.android.gms.internal.ads.zzbbs zzbbsVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzaxm zzaxmVar, int i, int i2) {
        super(zzbbsVar, "NrTiKoqiGsnW0YmEvrYFxN8MEHR3HtreklnLu5ZS2/gdKln4kN9VtqKQ3DYD1lNw", "GRpsnBes2qRtyDPKutW4bBWph7anTp6FUrz2DgBHtv0=", zzaxmVar, i, 61);
        this.zzh = zzbbsVar.zzj();
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        long longValue = ((java.lang.Long) this.zze.invoke(null, this.zza.zzb(), java.lang.Boolean.valueOf(this.zzh))).longValue();
        com.google.android.gms.internal.ads.zzaxm zzaxmVar = this.zzd;
        synchronized (zzaxmVar) {
            zzaxmVar.zzQ(longValue);
        }
    }
}
