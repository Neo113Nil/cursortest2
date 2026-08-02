package com.google.android.gms.internal.auth;

/* loaded from: classes8.dex */
final class zzgf {
    private static final com.google.android.gms.internal.auth.zzgf zza = new com.google.android.gms.internal.auth.zzgf();
    private final java.util.concurrent.ConcurrentMap zzc = new java.util.concurrent.ConcurrentHashMap();
    private final com.google.android.gms.internal.auth.zzgj zzb = new com.google.android.gms.internal.auth.zzfp();

    private zzgf() {
    }

    public final com.google.android.gms.internal.auth.zzgi zzb(java.lang.Class cls) {
        com.google.android.gms.internal.auth.zzfa.zzc(cls, "messageType");
        com.google.android.gms.internal.auth.zzgi zzgiVar = (com.google.android.gms.internal.auth.zzgi) this.zzc.get(cls);
        if (zzgiVar != null) {
            return zzgiVar;
        }
        com.google.android.gms.internal.auth.zzgi zza2 = this.zzb.zza(cls);
        com.google.android.gms.internal.auth.zzfa.zzc(cls, "messageType");
        com.google.android.gms.internal.auth.zzgi zzgiVar2 = (com.google.android.gms.internal.auth.zzgi) this.zzc.putIfAbsent(cls, zza2);
        return zzgiVar2 == null ? zza2 : zzgiVar2;
    }

    public static com.google.android.gms.internal.auth.zzgf zza() {
        return zza;
    }
}
