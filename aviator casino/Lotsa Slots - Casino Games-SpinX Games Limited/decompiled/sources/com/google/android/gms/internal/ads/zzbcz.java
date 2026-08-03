package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbcz extends com.google.android.gms.internal.ads.zzbdf {
    private final com.google.android.gms.internal.ads.zzbbz zzh;
    private long zzi;

    public zzbcz(com.google.android.gms.internal.ads.zzbbs zzbbsVar, java.lang.String str, java.lang.String str2, com.google.android.gms.internal.ads.zzaxm zzaxmVar, int i, int i2, com.google.android.gms.internal.ads.zzbbz zzbbzVar) {
        super(zzbbsVar, "CX4J+2yEJ2HtJzNjBSAFoPZxV3S124qFqsrwrEik3kHdsHRX3oIIB4d/zi0EQ0fu", "gfLiyhD2OvLSOj6bwf+kcmK11rwQ90aeBshxHD6xXgk=", zzaxmVar, i, 53);
        this.zzh = zzbbzVar;
        if (zzbbzVar != null) {
            this.zzi = zzbbzVar.zzc();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbdf
    protected final void zza() throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        if (this.zzh != null) {
            this.zzd.zzH(((java.lang.Long) this.zze.invoke(null, java.lang.Long.valueOf(this.zzi))).longValue());
        }
    }
}
