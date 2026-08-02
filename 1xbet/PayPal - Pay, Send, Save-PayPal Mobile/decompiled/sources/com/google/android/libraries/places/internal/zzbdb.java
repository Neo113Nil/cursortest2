package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbdb {
    static final com.google.android.libraries.places.internal.zzbdb zza = new com.google.android.libraries.places.internal.zzbdb(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final java.util.Map zzd;

    zzbdb() {
        this.zzd = new java.util.HashMap();
    }

    public static com.google.android.libraries.places.internal.zzbdb zza() {
        return zza;
    }

    public final com.google.android.libraries.places.internal.zzbdp zzb(com.google.android.libraries.places.internal.zzbex zzbexVar, int i) {
        return (com.google.android.libraries.places.internal.zzbdp) this.zzd.get(new com.google.android.libraries.places.internal.zzbda(zzbexVar, i));
    }

    zzbdb(boolean z) {
        this.zzd = java.util.Collections.emptyMap();
    }
}
