package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzezp implements com.google.android.gms.internal.ads.zzfci {
    private final boolean zza;

    public zzezp(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        ((android.os.Bundle) obj).putBoolean("is_gbid", this.zza);
    }
}
