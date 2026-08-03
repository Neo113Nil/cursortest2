package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzeum implements com.google.android.gms.internal.ads.zzfci {
    private final java.lang.String zza;

    public zzeum(java.lang.String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        java.lang.String str = this.zza;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (str != null) {
            bundle.putString("arek", str);
        }
    }
}
