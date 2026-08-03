package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzimy extends com.google.android.gms.internal.ads.zzimq {
    static {
        com.google.android.gms.internal.ads.zzimv.zza(java.util.Collections.emptyMap());
    }

    /* synthetic */ zzimy(java.util.Map map, com.google.android.gms.internal.ads.zzimw zzimwVar) {
        super(map);
    }

    public static com.google.android.gms.internal.ads.zzimx zzc(int i) {
        return new com.google.android.gms.internal.ads.zzimx(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzinj, com.google.android.gms.internal.ads.zzini
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final java.util.Map zzb() {
        java.util.LinkedHashMap zzc = com.google.android.gms.internal.ads.zzimr.zzc(zza().size());
        for (java.util.Map.Entry entry : zza().entrySet()) {
            zzc.put(entry.getKey(), ((com.google.android.gms.internal.ads.zzind) entry.getValue()).zzb());
        }
        return java.util.Collections.unmodifiableMap(zzc);
    }
}
