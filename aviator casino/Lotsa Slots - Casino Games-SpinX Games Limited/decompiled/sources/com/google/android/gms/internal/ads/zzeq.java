package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzeq extends android.content.BroadcastReceiver {
    final /* synthetic */ com.google.android.gms.internal.ads.zzer zza;

    /* synthetic */ zzeq(com.google.android.gms.internal.ads.zzer zzerVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzerVar);
        this.zza = zzerVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(final android.content.Context context, android.content.Intent intent) {
        this.zza.zzf().execute(new java.lang.Runnable() { // from class: com.google.android.gms.internal.ads.zzep
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                com.google.android.gms.internal.ads.zzeq.this.zza.zzd(context);
            }
        });
    }
}
