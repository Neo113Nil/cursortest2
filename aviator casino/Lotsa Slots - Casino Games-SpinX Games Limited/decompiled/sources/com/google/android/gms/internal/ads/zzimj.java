package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzimj extends com.google.android.gms.internal.ads.zzimm {
    final java.util.logging.Logger zza;

    public zzimj(java.lang.String str) {
        this.zza = java.util.logging.Logger.getLogger(str);
    }

    @Override // com.google.android.gms.internal.ads.zzimm
    public final void zza(java.lang.String str) {
        this.zza.logp(java.util.logging.Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
