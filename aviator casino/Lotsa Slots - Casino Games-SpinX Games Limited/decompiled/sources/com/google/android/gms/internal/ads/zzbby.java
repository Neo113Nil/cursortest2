package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbby extends android.content.BroadcastReceiver {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbbz zza;

    zzbby(com.google.android.gms.internal.ads.zzbbz zzbbzVar) {
        java.util.Objects.requireNonNull(zzbbzVar);
        this.zza = zzbbzVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        this.zza.zzd();
    }
}
