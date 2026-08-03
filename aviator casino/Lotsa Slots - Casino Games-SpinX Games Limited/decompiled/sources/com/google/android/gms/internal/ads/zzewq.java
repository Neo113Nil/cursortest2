package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzewq implements com.google.android.gms.internal.ads.zzfci {
    private final double zza;
    private final boolean zzb;

    public zzewq(double d, boolean z) {
        this.zza = d;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        android.os.Bundle zza = com.google.android.gms.internal.ads.zzfln.zza(bundle, "device");
        bundle.putBundle("device", zza);
        android.os.Bundle zza2 = com.google.android.gms.internal.ads.zzfln.zza(zza, "battery");
        zza.putBundle("battery", zza2);
        zza2.putBoolean("is_charging", this.zzb);
        zza2.putDouble("battery_level", this.zza);
    }
}
