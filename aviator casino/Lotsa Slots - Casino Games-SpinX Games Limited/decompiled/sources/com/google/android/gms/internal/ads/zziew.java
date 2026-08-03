package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
final class zziew implements java.util.Map.Entry {
    private final java.util.Map.Entry zza;

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
        com.google.android.gms.internal.ads.zziey zzieyVar = (com.google.android.gms.internal.ads.zziey) this.zza.getValue();
        if (zzieyVar == null) {
            return null;
        }
        zzieyVar.zzd(null);
        return zzieyVar.zza;
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.ads.zzifp) {
            return ((com.google.android.gms.internal.ads.zziey) this.zza.getValue()).zza((com.google.android.gms.internal.ads.zzifp) obj);
        }
        throw new java.lang.IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }

    public final com.google.android.gms.internal.ads.zziey zza() {
        return (com.google.android.gms.internal.ads.zziey) this.zza.getValue();
    }
}
