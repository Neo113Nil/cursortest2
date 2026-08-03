package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfce implements com.google.android.gms.internal.ads.zzfci {
    private final android.os.Bundle zza;

    public zzfce(android.os.Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        android.os.Bundle bundle = this.zza;
        android.os.Bundle bundle2 = (android.os.Bundle) obj;
        if (bundle.isEmpty()) {
            return;
        }
        bundle2.putBundle("shared_pref", bundle);
    }
}
