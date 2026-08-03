package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzql extends android.content.BroadcastReceiver {
    final /* synthetic */ com.google.android.gms.internal.ads.zzqn zza;

    /* synthetic */ zzql(com.google.android.gms.internal.ads.zzqn zzqnVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzqnVar);
        this.zza = zzqnVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        com.google.android.gms.internal.ads.zzqn zzqnVar = this.zza;
        zzqnVar.zzh(com.google.android.gms.internal.ads.zzqh.zzb(context, intent, zzqnVar.zzl(), zzqnVar.zzj(), zzqnVar.zzg()));
    }
}
