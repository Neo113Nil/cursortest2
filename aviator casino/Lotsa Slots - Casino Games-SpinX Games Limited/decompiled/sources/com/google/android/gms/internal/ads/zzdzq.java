package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdzq extends com.google.android.gms.internal.ads.zzdzu {
    private final com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults zzf;

    public zzdzq(java.util.concurrent.Executor executor, com.google.android.gms.ads.internal.util.client.zzu zzuVar, com.google.android.gms.ads.nonagon.util.logging.csi.CsiParamDefaults csiParamDefaults, com.google.android.gms.ads.nonagon.util.logging.csi.CsiUrlBuilder csiUrlBuilder, android.content.Context context) {
        super(executor, zzuVar, csiUrlBuilder, context);
        this.zzf = csiParamDefaults;
        csiParamDefaults.set(this.zza);
    }

    public final java.util.Map zza() {
        return new java.util.HashMap(this.zza);
    }
}
