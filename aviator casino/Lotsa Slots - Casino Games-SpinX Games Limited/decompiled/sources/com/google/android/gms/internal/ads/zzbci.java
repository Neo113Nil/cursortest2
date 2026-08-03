package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbci extends com.google.android.gms.internal.ads.zzbdf {
    private static volatile java.lang.Long zzh;
    private static final java.lang.Object zzi = new java.lang.Object();

    public zzbci(com.google.android.gms.internal.ads.zzbbs zzbbsVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzaxm zzaxmVar, int i, int i2) {
        super(zzbbsVar, "c2tDBlieP1HgAca8BbxZWeFItAa95IUNAJZ8eF9wTfwT8H+oJvTJgvb0TMn4OhPJ", "tm0zp+MQfD9mNSBt0r3mfYhq2ky3SeNyaSrFjHWQaT0=", zzaxmVar, i, 44);
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        if (zzh == null) {
            synchronized (zzi) {
                if (zzh == null) {
                    zzh = (java.lang.Long) this.zze.invoke(null, new java.lang.Object[0]);
                }
            }
        }
        com.google.android.gms.internal.ads.zzaxm zzaxmVar = this.zzd;
        synchronized (zzaxmVar) {
            zzaxmVar.zzB(zzh.longValue());
        }
    }
}
