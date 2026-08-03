package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbcu extends com.google.android.gms.internal.ads.zzbdf {
    public zzbcu(com.google.android.gms.internal.ads.zzbbs zzbbsVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzaxm zzaxmVar, int i, int i2) {
        super(zzbbsVar, "sg/K0s1GwOZuQX5eitJmxib+wj81rdd8azNpkdJxx1Al3KmlPY0wLfmj2TGTYSv2", "x4M1RpSRK9uX9iukrRpM6KxHxc9F29fR3cS53OKE4Bs=", zzaxmVar, i, 73);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        try {
            int i = 1;
            boolean booleanValue = ((java.lang.Boolean) this.zze.invoke(null, this.zza.zzb())).booleanValue();
            com.google.android.gms.internal.ads.zzaxm zzaxmVar = this.zzd;
            if (true == booleanValue) {
                i = 2;
            }
            zzaxmVar.zzah(i);
        } catch (java.lang.reflect.InvocationTargetException unused) {
            this.zzd.zzah(3);
        }
    }
}
