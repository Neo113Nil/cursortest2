package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhnc {
    private static final com.google.android.gms.internal.ads.zziaz zza = com.google.android.gms.internal.ads.zziaz.zza(new byte[0]);
    private final java.util.Map zzb;

    public final java.lang.Iterable zza(byte[] bArr) {
        java.util.Map map = this.zzb;
        java.util.List list = (java.util.List) map.get(zza);
        java.util.List list2 = bArr.length >= 5 ? (java.util.List) map.get(com.google.android.gms.internal.ads.zziaz.zzb(bArr, 0, 5)) : null;
        return (list == null && list2 == null) ? new java.util.ArrayList() : list == null ? list2 : list2 == null ? list : new com.google.android.gms.internal.ads.zzhmz(this, list2, list);
    }
}
