package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
@javax.annotation.ParametersAreNonnullByDefault
@java.lang.Deprecated
/* loaded from: classes4.dex */
public final class zzbjd {
    private final java.util.Map zza = new java.util.HashMap();
    private final com.google.android.gms.internal.ads.zzbjf zzb;

    public zzbjd(com.google.android.gms.internal.ads.zzbjf zzbjfVar) {
        this.zzb = zzbjfVar;
    }

    public final void zza(java.lang.String str, com.google.android.gms.internal.ads.zzbjc zzbjcVar) {
        this.zza.put(str, zzbjcVar);
    }

    public final void zzb(java.lang.String str, java.lang.String str2, long j) {
        java.util.Map map = this.zza;
        com.google.android.gms.internal.ads.zzbjc zzbjcVar = (com.google.android.gms.internal.ads.zzbjc) map.get(str2);
        java.lang.String[] strArr = {str};
        if (zzbjcVar != null) {
            this.zzb.zzb(zzbjcVar, j, strArr);
        }
        map.put(str, new com.google.android.gms.internal.ads.zzbjc(j, null, null));
    }

    public final com.google.android.gms.internal.ads.zzbjf zzc() {
        return this.zzb;
    }
}
