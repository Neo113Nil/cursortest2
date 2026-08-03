package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbcq extends com.google.android.gms.internal.ads.zzbdf {
    private final com.google.android.gms.internal.ads.zzbav zzh;
    private final long zzi;
    private final long zzj;

    public zzbcq(com.google.android.gms.internal.ads.zzbbs zzbbsVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzaxm zzaxmVar, int i, int i2, com.google.android.gms.internal.ads.zzbav zzbavVar, long j, long j2) {
        super(zzbbsVar, "0RGuaC1LZ8p4RZIWK5IFPvVh1XqX7pdLKGQgqTXZ1mkub6VwNtebK8xyUGpHkvMn", "mIcXOfgrOloP6pQFjXZ3aL2iJ7mq+own2SaqzDvu6Tk=", zzaxmVar, i, 11);
        this.zzh = zzbavVar;
        this.zzi = j;
        this.zzj = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        com.google.android.gms.internal.ads.zzbav zzbavVar = this.zzh;
        if (zzbavVar != null) {
            com.google.android.gms.internal.ads.zzbat zzbatVar = new com.google.android.gms.internal.ads.zzbat((java.lang.String) this.zze.invoke(null, zzbavVar.zzb(), java.lang.Long.valueOf(this.zzi), java.lang.Long.valueOf(this.zzj)));
            com.google.android.gms.internal.ads.zzaxm zzaxmVar = this.zzd;
            synchronized (zzaxmVar) {
                zzaxmVar.zzf(zzbatVar.zza.longValue());
                if (zzbatVar.zzb.longValue() >= 0) {
                    zzaxmVar.zzW(zzbatVar.zzb.longValue());
                }
                if (zzbatVar.zzc.longValue() >= 0) {
                    zzaxmVar.zzX(zzbatVar.zzc.longValue());
                }
            }
        }
    }
}
