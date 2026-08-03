package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbeo extends android.content.BroadcastReceiver {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbes zza;

    zzbeo(com.google.android.gms.internal.ads.zzbes zzbesVar) {
        java.util.Objects.requireNonNull(zzbesVar);
        this.zza = zzbesVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        this.zza.zzg(3);
    }
}
