package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public interface zzcag {
    public static final com.google.android.libraries.places.internal.zzcag zza;

    static {
        com.google.android.libraries.places.internal.zzcag zzbpzVar;
        try {
            java.lang.Class.forName("java.time.Instant");
            zzbpzVar = new com.google.android.libraries.places.internal.zzbtg();
        } catch (java.lang.ClassNotFoundException unused) {
            zzbpzVar = new com.google.android.libraries.places.internal.zzbpz();
        }
        zza = zzbpzVar;
    }

    long zza();
}
