package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhny extends java.lang.RuntimeException {
    public zzhny(java.lang.String str) {
        super(str);
    }

    public static java.lang.Object zza(com.google.android.gms.internal.ads.zzhnx zzhnxVar) {
        try {
            return zzhnxVar.zza();
        } catch (java.lang.Exception e) {
            throw new com.google.android.gms.internal.ads.zzhny(e);
        }
    }

    public zzhny(java.lang.String str, java.lang.Throwable th) {
        super(str, th);
    }

    public zzhny(java.lang.Throwable th) {
        super(th);
    }
}
