package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzezl implements com.google.android.gms.internal.ads.zzfci {
    private final java.lang.Integer zza;

    public zzezl(java.lang.Integer num) {
        this.zza = num;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        java.lang.Integer num = this.zza;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (num != null) {
            bundle.putInt("dspct", java.lang.Math.min(num.intValue(), 20));
        }
    }
}
