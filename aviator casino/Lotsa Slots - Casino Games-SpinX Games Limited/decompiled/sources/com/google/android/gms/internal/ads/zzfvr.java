package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfvr extends android.content.BroadcastReceiver {
    final /* synthetic */ com.google.android.gms.internal.ads.zzfvs zza;

    zzfvr(com.google.android.gms.internal.ads.zzfvs zzfvsVar) {
        java.util.Objects.requireNonNull(zzfvsVar);
        this.zza = zzfvsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            com.google.android.gms.internal.ads.zzfvs zzfvsVar = this.zza;
            zzfvsVar.zzd(true, zzfvsVar.zzf());
            zzfvsVar.zze(true);
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            com.google.android.gms.internal.ads.zzfvs zzfvsVar2 = this.zza;
            zzfvsVar2.zzd(false, zzfvsVar2.zzf());
            zzfvsVar2.zze(false);
        }
    }
}
