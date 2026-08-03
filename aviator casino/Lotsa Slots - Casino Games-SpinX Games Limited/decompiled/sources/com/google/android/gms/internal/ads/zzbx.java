package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbx extends android.content.BroadcastReceiver {
    private final com.google.android.gms.internal.ads.zzdz zza;

    /* synthetic */ zzbx(com.google.android.gms.internal.ads.zzbz zzbzVar, com.google.android.gms.internal.ads.zzdz zzdzVar, com.google.android.gms.internal.ads.zzby zzbyVar, byte[] bArr) {
        java.util.Objects.requireNonNull(zzbzVar);
        this.zza = zzdzVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.zza.zzm(new java.lang.Runnable(this) { // from class: com.google.android.gms.internal.ads.zzbw
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                }
            });
        }
    }
}
