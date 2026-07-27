package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbdl extends zzbdt {
    private final StackTraceElement[] zzh;

    public zzbdl(zzbcg zzbcgVar, String str, String str2, zzaya zzayaVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(zzbcgVar, "X/GUPFxOS4avlKtq36LXcZb7PXup/zZuW1HHrjvnbrOdArq87fiVHm1/XdqEH3+6", "yUIicuApz/OaGeh0f0RdAIADq1zJ0l0UU+b4jbryt0s=", zzayaVar, i, 45);
        this.zzh = stackTraceElementArr;
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        StackTraceElement[] stackTraceElementArr = this.zzh;
        if (stackTraceElementArr != null) {
            zzbbx zzbbxVar = new zzbbx((String) this.zze.invoke(null, stackTraceElementArr));
            zzaya zzayaVar = this.zzd;
            synchronized (zzayaVar) {
                zzayaVar.zzC(zzbbxVar.zza.longValue());
                if (zzbbxVar.zzb.booleanValue()) {
                    zzayaVar.zzag(true != zzbbxVar.zzc.booleanValue() ? 2 : 1);
                } else {
                    zzayaVar.zzag(3);
                }
            }
        }
    }
}
