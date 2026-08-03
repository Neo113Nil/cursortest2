package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbcv extends com.google.android.gms.internal.ads.zzbdf {
    private java.util.List zzh;
    private final android.content.Context zzi;

    public zzbcv(com.google.android.gms.internal.ads.zzbbs zzbbsVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzaxm zzaxmVar, int i, int i2, android.content.Context context) {
        super(zzbbsVar, "XXF2CX++qjQzFfJDmqd+84h356GlStFLqQSTRbbce/csPkd7M5mpQw1l7igXWffL", "FGCYjW2JaOcRH3mqSkgHIxbWzEwOVje6sx286yuA1xM=", zzaxmVar, i, 31);
        this.zzh = null;
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        com.google.android.gms.internal.ads.zzaxm zzaxmVar = this.zzd;
        zzaxmVar.zzq(-1L);
        zzaxmVar.zzr(-1L);
        android.content.Context context = this.zzi;
        if (context == null) {
            context = this.zza.zzb();
        }
        if (this.zzh == null) {
            this.zzh = (java.util.List) this.zze.invoke(null, context);
        }
        java.util.List list = this.zzh;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (zzaxmVar) {
            zzaxmVar.zzq(((java.lang.Long) this.zzh.get(0)).longValue());
            zzaxmVar.zzr(((java.lang.Long) this.zzh.get(1)).longValue());
        }
    }
}
