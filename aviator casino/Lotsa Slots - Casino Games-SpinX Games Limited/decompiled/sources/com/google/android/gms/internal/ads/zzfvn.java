package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfvn {
    private static final com.google.android.gms.internal.ads.zzfvn zza = new com.google.android.gms.internal.ads.zzfvn();
    private android.content.Context zzb;

    private zzfvn() {
    }

    public static com.google.android.gms.internal.ads.zzfvn zza() {
        return zza;
    }

    public final android.content.Context zzb() {
        return this.zzb;
    }

    public final void zzc(android.content.Context context) {
        this.zzb = context != null ? context.getApplicationContext() : null;
    }
}
