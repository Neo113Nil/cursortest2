package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
final class zzcf extends android.content.BroadcastReceiver {
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzcg zza;

    zzcf(com.google.android.gms.ads.internal.util.zzcg zzcgVar) {
        java.util.Objects.requireNonNull(zzcgVar);
        this.zza = zzcgVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        this.zza.zzd(context, intent);
    }
}
