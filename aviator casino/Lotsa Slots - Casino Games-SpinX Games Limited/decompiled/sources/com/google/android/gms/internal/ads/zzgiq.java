package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzgiq extends com.google.android.gms.internal.ads.zzgix {
    private final android.content.Context zza;

    zzgiq(com.google.android.gms.internal.ads.zzaxm zzaxmVar, com.google.android.gms.internal.ads.zzght zzghtVar, android.content.Context context, com.google.android.gms.internal.ads.zzgqh zzgqhVar) {
        super("3M3UhsCX904mgMNqBuNkdZnNfpzyG+gyZSwZ0bLvpAGWwKiqhbJpzMhUN7osaI5H", "IGzPM7qLPT4nT5FsUvAD7EHpaGrgx3eqTo88eWb+Mf4=", zzaxmVar, zzghtVar, zzgqhVar.zza(119));
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    protected final void zza(java.lang.reflect.Method method, com.google.android.gms.internal.ads.zzaxm zzaxmVar) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.Object[] objArr = (java.lang.Object[]) method.invoke("", this.zza);
        objArr.getClass();
        java.lang.Object[] objArr2 = objArr;
        synchronized (zzaxmVar) {
            zzaxmVar.zzc(((java.lang.Long) objArr2[0]).longValue());
            zzaxmVar.zzP(((java.lang.Long) objArr2[1]).longValue());
        }
    }
}
