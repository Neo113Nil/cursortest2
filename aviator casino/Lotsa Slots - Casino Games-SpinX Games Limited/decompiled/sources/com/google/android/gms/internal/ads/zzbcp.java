package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbcp extends com.google.android.gms.internal.ads.zzbdf {
    private final com.google.android.gms.internal.ads.zzbbk zzh;

    public zzbcp(com.google.android.gms.internal.ads.zzbbs zzbbsVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzaxm zzaxmVar, int i, int i2, com.google.android.gms.internal.ads.zzbbk zzbbkVar) {
        super(zzbbsVar, "/BhgxpXYgahRBmZkS3xjCzPdid3mZtzdZmJFkhACyEa2oS6asfWgI5KysEGcSPE9", "ngST2QkCVNtF272EQbVjeXMfCtACYPfIcakPMgsny7g=", zzaxmVar, i, 94);
        this.zzh = zzbbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        int intValue = ((java.lang.Integer) this.zze.invoke(null, this.zzh.zzb())).intValue();
        com.google.android.gms.internal.ads.zzaxm zzaxmVar = this.zzd;
        synchronized (zzaxmVar) {
            zzaxmVar.zzaj(com.google.android.gms.internal.ads.zzaya.zza(intValue));
        }
    }
}
