package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfnb {
    private final java.util.HashMap zza = new java.util.HashMap();

    public final com.google.android.gms.internal.ads.zzfna zza(com.google.android.gms.internal.ads.zzfmr zzfmrVar, android.content.Context context, com.google.android.gms.internal.ads.zzfmj zzfmjVar, com.google.android.gms.internal.ads.zzfng zzfngVar) {
        java.util.HashMap hashMap = this.zza;
        com.google.android.gms.internal.ads.zzfna zzfnaVar = (com.google.android.gms.internal.ads.zzfna) hashMap.get(zzfmrVar);
        if (zzfnaVar != null) {
            return zzfnaVar;
        }
        com.google.android.gms.internal.ads.zzfmo zzfmoVar = new com.google.android.gms.internal.ads.zzfmo(com.google.android.gms.internal.ads.zzfmu.zza(zzfmrVar, context));
        com.google.android.gms.internal.ads.zzfna zzfnaVar2 = new com.google.android.gms.internal.ads.zzfna(zzfmoVar, new com.google.android.gms.internal.ads.zzfnj(zzfmoVar, zzfmjVar, zzfngVar));
        hashMap.put(zzfmrVar, zzfnaVar2);
        return zzfnaVar2;
    }
}
