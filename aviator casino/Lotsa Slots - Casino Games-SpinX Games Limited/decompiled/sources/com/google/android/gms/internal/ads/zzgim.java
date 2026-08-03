package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgim extends com.google.android.gms.internal.ads.zzgix {
    private static volatile java.lang.Long zza;
    private static final java.lang.Object zzb = new java.lang.Object();

    zzgim(com.google.android.gms.internal.ads.zzaxm zzaxmVar, com.google.android.gms.internal.ads.zzght zzghtVar, com.google.android.gms.internal.ads.zzgqh zzgqhVar) {
        super("F5pwKdQUkBR2T28FTRLzecwttaHUl7VLDmgba7+ac24MPIR3NLD5sQMDLkLV832D", "Zvn3l46JDaJW0+pj8K/1DTe7U1wFUhv/KBF/UwuPk/A=", zzaxmVar, zzghtVar, zzgqhVar.zza(117));
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    protected final void zza(java.lang.reflect.Method method, com.google.android.gms.internal.ads.zzaxm zzaxmVar) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        if (zza == null) {
            synchronized (zzb) {
                if (zza == null) {
                    java.lang.Long l = (java.lang.Long) method.invoke("", new java.lang.Object[0]);
                    l.getClass();
                    java.lang.Long l2 = l;
                    zza = l;
                }
            }
        }
        synchronized (zzaxmVar) {
            if (zza != null) {
                zzaxmVar.zzm(zza.longValue());
            }
        }
    }
}
