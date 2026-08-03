package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzuv extends android.os.Handler {
    final /* synthetic */ com.google.android.gms.internal.ads.zzux zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzuv(com.google.android.gms.internal.ads.zzux zzuxVar, android.os.Looper looper) {
        super(looper);
        java.util.Objects.requireNonNull(zzuxVar);
        this.zza = zzuxVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        this.zza.zzh(message);
    }
}
