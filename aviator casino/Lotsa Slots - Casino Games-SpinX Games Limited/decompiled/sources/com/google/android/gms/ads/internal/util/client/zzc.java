package com.google.android.gms.ads.internal.util.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
final class zzc extends java.lang.Thread {
    final /* synthetic */ android.content.Context zza;
    final /* synthetic */ java.lang.String zzb;

    zzc(com.google.android.gms.ads.internal.util.client.zzf zzfVar, android.content.Context context, java.lang.String str) {
        this.zza = context;
        this.zzb = str;
        java.util.Objects.requireNonNull(zzfVar);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new com.google.android.gms.ads.internal.util.client.zzu(this.zza, null).zzc(this.zzb, null);
    }
}
