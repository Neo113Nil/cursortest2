package com.google.android.gms.ads.nonagon.signalgeneration;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
final class zzn extends java.util.LinkedHashMap {
    final /* synthetic */ com.google.android.gms.ads.nonagon.signalgeneration.zzq zza;

    zzn(com.google.android.gms.ads.nonagon.signalgeneration.zzq zzqVar) {
        java.util.Objects.requireNonNull(zzqVar);
        this.zza = zzqVar;
    }

    @Override // java.util.LinkedHashMap
    protected final boolean removeEldestEntry(java.util.Map.Entry entry) {
        com.google.android.gms.ads.nonagon.signalgeneration.zzq zzqVar = this.zza;
        synchronized (zzqVar) {
            if (size() <= zzqVar.zzg()) {
                return false;
            }
            zzqVar.zzh().add(new android.util.Pair((java.lang.String) entry.getKey(), ((com.google.android.gms.ads.nonagon.signalgeneration.zzo) entry.getValue()).zzb));
            return size() > zzqVar.zzg();
        }
    }
}
