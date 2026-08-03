package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbce extends com.google.android.gms.internal.ads.zzbdf {
    public zzbce(com.google.android.gms.internal.ads.zzbbs zzbbsVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzaxm zzaxmVar, int i, int i2) {
        super(zzbbsVar, "2JfLKOCWe20PaEte0oViJ9E/+ELRHfLHNO4trOuu7IQ3kQ71vgp9bwF5/QP32+2T", "LVYC8EvnYnoIGxefzdW+bkgnD7TMgzMx712oMyZcYTg=", zzaxmVar, i, 49);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        com.google.android.gms.internal.ads.zzaxm zzaxmVar = this.zzd;
        zzaxmVar.zzaf(3);
        try {
            int i = 1;
            if (true == ((java.lang.Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue()) {
                i = 2;
            }
            zzaxmVar.zzaf(i);
        } catch (java.lang.reflect.InvocationTargetException e) {
            if (!(e.getTargetException() instanceof android.provider.Settings.SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
