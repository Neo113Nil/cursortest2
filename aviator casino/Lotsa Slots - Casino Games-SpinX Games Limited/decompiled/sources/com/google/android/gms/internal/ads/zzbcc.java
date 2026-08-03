package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbcc extends com.google.android.gms.internal.ads.zzbdf {
    private final android.app.Activity zzh;
    private final android.view.View zzi;

    public zzbcc(com.google.android.gms.internal.ads.zzbbs zzbbsVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzaxm zzaxmVar, int i, int i2, android.view.View view, android.app.Activity activity) {
        super(zzbbsVar, "9TfyKlP5TIIt3OrlcGubA3YBpCoy+oB4k/WnZndRDloYkwzEaKKPovjffC4zkV4k", "3uxZ+FD025vJO7qOv296UhrdOlNsopGnz6EvxCliHP4=", zzaxmVar, i, 62);
        this.zzi = view;
        this.zzh = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        android.view.View view = this.zzi;
        if (view == null) {
            return;
        }
        java.lang.Boolean bool = (java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzdy);
        boolean booleanValue = bool.booleanValue();
        java.lang.Object[] objArr = (java.lang.Object[]) this.zze.invoke(null, view, this.zzh, bool);
        com.google.android.gms.internal.ads.zzaxm zzaxmVar = this.zzd;
        synchronized (zzaxmVar) {
            zzaxmVar.zzS(((java.lang.Long) objArr[0]).longValue());
            zzaxmVar.zzT(((java.lang.Long) objArr[1]).longValue());
            if (booleanValue) {
                zzaxmVar.zzU((java.lang.String) objArr[2]);
            }
        }
    }
}
