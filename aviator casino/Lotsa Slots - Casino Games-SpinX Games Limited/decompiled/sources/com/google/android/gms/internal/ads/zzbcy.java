package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbcy extends com.google.android.gms.internal.ads.zzbdf {
    public zzbcy(com.google.android.gms.internal.ads.zzbbs zzbbsVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzaxm zzaxmVar, int i, int i2) {
        super(zzbbsVar, "Qz9CKMoDCHphOXPELo049qp61nrfn738aUeATKOiX7hq+kw0ujtW3xI/vlQKBh37", "bze+wYBAHEMh8JSXqo0+D4B3Aq+R4fX2jHr7eo7ufbY=", zzaxmVar, i, 51);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        com.google.android.gms.internal.ads.zzaxm zzaxmVar = this.zzd;
        synchronized (zzaxmVar) {
            com.google.android.gms.internal.ads.zzbbn zzbbnVar = new com.google.android.gms.internal.ads.zzbbn((java.lang.String) this.zze.invoke(null, new java.lang.Object[0]));
            zzaxmVar.zzF(zzbbnVar.zza.longValue());
            zzaxmVar.zzG(zzbbnVar.zzb.longValue());
        }
    }
}
