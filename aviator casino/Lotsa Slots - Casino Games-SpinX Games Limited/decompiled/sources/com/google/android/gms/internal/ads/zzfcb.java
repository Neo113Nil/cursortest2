package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzfcb implements com.google.android.gms.internal.ads.zzfci {
    private final boolean zza;

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (this.zza) {
            bundle.putBoolean("sdk_prefetch", true);
        }
    }
}
