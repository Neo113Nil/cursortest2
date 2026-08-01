package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* compiled from: com.google.android.gms:play-services-ads@@25.4.0 */
/* loaded from: classes9.dex */
public final class zzbdn extends zzbdt {
    private final zzbcn zzh;
    private long zzi;

    public zzbdn(zzbcg zzbcgVar, String str, String str2, zzaya zzayaVar, int i, int i2, zzbcn zzbcnVar) {
        super(zzbcgVar, "CX4J+2yEJ2HtJzNjBSAFoPZxV3S124qFqsrwrEik3kHdsHRX3oIIB4d/zi0EQ0fu", "gfLiyhD2OvLSOj6bwf+kcmK11rwQ90aeBshxHD6xXgk=", zzayaVar, i, 53);
        this.zzh = zzbcnVar;
        if (zzbcnVar != null) {
            this.zzi = zzbcnVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdt
    protected final void zza() throws IllegalAccessException, InvocationTargetException {
        if (this.zzh != null) {
            this.zzd.zzH(((Long) this.zze.invoke(null, Long.valueOf(this.zzi))).longValue());
        }
    }
}
