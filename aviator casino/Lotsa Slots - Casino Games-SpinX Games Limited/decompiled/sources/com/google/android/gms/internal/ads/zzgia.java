package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzgia extends com.google.android.gms.internal.ads.zzgix {
    private final android.app.Activity zza;
    private final android.view.View zzb;

    zzgia(com.google.android.gms.internal.ads.zzaxm zzaxmVar, com.google.android.gms.internal.ads.zzght zzghtVar, android.view.View view, android.app.Activity activity, com.google.android.gms.internal.ads.zzgqh zzgqhVar) {
        super("kICru+RlF37DZcClNNNafekAyIWCS20ItrldPwSS9IbAVJbkDXFc3qpTOJ54cMxf", "nLYdoqqtMnuDPwVM1aO+ZLMTTK034noiKo5dDDQLXK0=", zzaxmVar, zzghtVar, zzgqhVar.zza(111));
        this.zzb = view;
        this.zza = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzgix
    protected final void zza(java.lang.reflect.Method method, com.google.android.gms.internal.ads.zzaxm zzaxmVar) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.Object[] objArr = (java.lang.Object[]) method.invoke("", this.zzb, this.zza);
        objArr.getClass();
        java.lang.Object[] objArr2 = objArr;
        synchronized (zzaxmVar) {
            zzaxmVar.zzS(((java.lang.Long) objArr2[0]).longValue());
            zzaxmVar.zzT(((java.lang.Long) objArr2[1]).longValue());
            zzaxmVar.zzU((java.lang.String) objArr2[2]);
        }
    }
}
