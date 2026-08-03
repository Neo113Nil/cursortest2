package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfcr implements com.google.android.gms.internal.ads.zzfci {
    private final int zza;
    private final int zzb;

    zzfcr(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        int i;
        int i2 = this.zza;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (i2 == -1 || (i = this.zzb) == -1) {
            return;
        }
        bundle.putInt("sessions_without_flags", i2);
        bundle.putInt("crashes_without_flags", i);
        int i3 = com.google.android.gms.ads.internal.client.zzay.zza;
        if (com.google.android.gms.ads.internal.client.zzba.zzc().zzc()) {
            bundle.putBoolean("did_reset", true);
        }
    }
}
