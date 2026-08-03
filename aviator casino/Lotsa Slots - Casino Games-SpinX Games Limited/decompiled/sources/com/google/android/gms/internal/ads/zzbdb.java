package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbdb extends com.google.android.gms.internal.ads.zzbdf {
    public zzbdb(com.google.android.gms.internal.ads.zzbbs zzbbsVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzaxm zzaxmVar, int i, int i2) {
        super(zzbbsVar, "GkIdfnRezKvEfAeB5157D8Ci3lpp/e7Oge9xr/GzO3KjC7JXvYHgpg7VRCtGuOw4", "kXUmyuEurXcq5mqFokC5oFFCqidwlGAMD9JpJXYa0Mk=", zzaxmVar, i, 48);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        com.google.android.gms.internal.ads.zzaxm zzaxmVar = this.zzd;
        zzaxmVar.zzae(3);
        boolean booleanValue = ((java.lang.Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
        synchronized (zzaxmVar) {
            if (booleanValue) {
                zzaxmVar.zzae(2);
            } else {
                zzaxmVar.zzae(1);
            }
        }
    }
}
