package com.google.android.gms.games.internal.v2.resolution;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public final class zzc {
    private final boolean zza;
    private final android.content.Intent zzb;

    private zzc(boolean z, android.content.Intent intent) {
        this.zza = z;
        this.zzb = intent;
    }

    public static com.google.android.gms.games.internal.v2.resolution.zzc zzb(android.content.Intent intent) {
        return new com.google.android.gms.games.internal.v2.resolution.zzc(false, intent);
    }

    public static com.google.android.gms.games.internal.v2.resolution.zzc zzc(android.content.Intent intent) {
        return new com.google.android.gms.games.internal.v2.resolution.zzc(true, intent);
    }

    public final android.content.Intent zza() {
        return this.zzb;
    }

    public final boolean zzd() {
        return this.zza;
    }
}
