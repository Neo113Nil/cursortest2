package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzhmk {
    private static final com.google.android.gms.internal.ads.zzhmk zzb = new com.google.android.gms.internal.ads.zzhmk();
    private final java.util.Map zza = new java.util.HashMap();

    public static com.google.android.gms.internal.ads.zzhmk zza() {
        return zzb;
    }

    public final synchronized void zzb(com.google.android.gms.internal.ads.zzhmj zzhmjVar, java.lang.Class cls) throws java.security.GeneralSecurityException {
        java.util.Map map = this.zza;
        com.google.android.gms.internal.ads.zzhmj zzhmjVar2 = (com.google.android.gms.internal.ads.zzhmj) map.get(cls);
        if (zzhmjVar2 != null && !zzhmjVar2.equals(zzhmjVar)) {
            throw new java.security.GeneralSecurityException("Different key creator for parameters class already inserted");
        }
        map.put(cls, zzhmjVar);
    }
}
