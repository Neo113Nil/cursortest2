package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbjk {
    public static final /* synthetic */ int zza = 0;
    private static final com.google.android.libraries.places.internal.zzbjk zzb = new com.google.android.libraries.places.internal.zzbjk(new com.google.android.libraries.places.internal.zzbjg(), com.google.android.libraries.places.internal.zzbjh.zza);
    private final java.util.concurrent.ConcurrentMap zzc = new java.util.concurrent.ConcurrentHashMap();

    zzbjk(com.google.android.libraries.places.internal.zzbjj... zzbjjVarArr) {
        for (int i = 0; i < 2; i++) {
            com.google.android.libraries.places.internal.zzbjj zzbjjVar = zzbjjVarArr[i];
            this.zzc.put(zzbjjVar.zza(), zzbjjVar);
        }
    }

    public static com.google.android.libraries.places.internal.zzbjk zza() {
        return zzb;
    }
}
