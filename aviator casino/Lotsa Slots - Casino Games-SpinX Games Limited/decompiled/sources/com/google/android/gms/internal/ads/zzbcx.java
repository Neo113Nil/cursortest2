package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbcx extends com.google.android.gms.internal.ads.zzbdf {
    private final java.lang.StackTraceElement[] zzh;

    public zzbcx(com.google.android.gms.internal.ads.zzbbs zzbbsVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzaxm zzaxmVar, int i, int i2, java.lang.StackTraceElement[] stackTraceElementArr) {
        super(zzbbsVar, "X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=", zzaxmVar, i, 45);
        this.zzh = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        java.lang.StackTraceElement[] stackTraceElementArr = this.zzh;
        if (stackTraceElementArr != null) {
            com.google.android.gms.internal.ads.zzbbj zzbbjVar = new com.google.android.gms.internal.ads.zzbbj((java.lang.String) this.zze.invoke(null, stackTraceElementArr));
            com.google.android.gms.internal.ads.zzaxm zzaxmVar = this.zzd;
            synchronized (zzaxmVar) {
                zzaxmVar.zzC(zzbbjVar.zza.longValue());
                if (zzbbjVar.zzb.booleanValue()) {
                    zzaxmVar.zzag(true != zzbbjVar.zzc.booleanValue() ? 2 : 1);
                } else {
                    zzaxmVar.zzag(3);
                }
            }
        }
    }
}
