package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzff implements com.google.android.gms.internal.ads.zzdy {
    private android.os.Message zza;

    private zzff() {
        throw null;
    }

    /* synthetic */ zzff(byte[] bArr) {
    }

    public final com.google.android.gms.internal.ads.zzff zzb(android.os.Message message, com.google.android.gms.internal.ads.zzfg zzfgVar) {
        this.zza = message;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdy
    public final void zza() {
        android.os.Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        this.zza = null;
        com.google.android.gms.internal.ads.zzfg.zzo(this);
    }

    public final boolean zzc(android.os.Handler handler) {
        android.os.Message message = this.zza;
        message.getClass();
        boolean sendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.zza = null;
        com.google.android.gms.internal.ads.zzfg.zzo(this);
        return sendMessageAtFrontOfQueue;
    }
}
