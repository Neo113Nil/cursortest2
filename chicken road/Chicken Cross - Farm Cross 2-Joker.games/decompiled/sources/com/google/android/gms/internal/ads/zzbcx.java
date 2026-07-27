package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbcx extends zzbdt {
    private final long zzh;

    public zzbcx(zzbcg zzbcgVar, String str, String str2, zzaya zzayaVar, long j, int i, int i2) {
        super(zzbcgVar, "y0L1OSEMWW8/imV1M3pvQITWJfkGk5GAMqJuL5aNLdq8sTbK6BFpI8/D5pLc65zr", "dBSRUGPKY8JzIPoAEV0GB9RkRHGvAJPAM3BhqN1QQjE=", zzayaVar, i, 25);
        this.zzh = j;
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.zze.invoke(null, new Object[0])).longValue();
        zzaya zzayaVar = this.zzd;
        synchronized (zzayaVar) {
            zzayaVar.zzac(longValue);
            long j = this.zzh;
            if (j != 0) {
                zzayaVar.zzk(longValue - j);
                zzayaVar.zzn(j);
            }
        }
    }
}
