package com.google.android.gms.ads.internal.util;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes3.dex */
final class zzr extends android.content.BroadcastReceiver {
    final /* synthetic */ com.google.android.gms.ads.internal.util.zzs zza;

    /* synthetic */ zzr(com.google.android.gms.ads.internal.util.zzs zzsVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzsVar);
        this.zza = zzsVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (java.util.Objects.equals(intent.getAction(), "android.intent.action.USER_PRESENT")) {
            this.zza.zzm(true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            this.zza.zzm(false);
        }
    }
}
