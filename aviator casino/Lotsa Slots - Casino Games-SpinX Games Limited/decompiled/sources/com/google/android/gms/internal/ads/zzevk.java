package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzevk implements com.google.android.gms.internal.ads.zzfci {
    private final java.lang.String zza;
    private final boolean zzb;

    public zzevk(java.lang.String str, boolean z) {
        this.zza = str;
        this.zzb = z;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        java.lang.String str = this.zza;
        android.os.Bundle bundle = (android.os.Bundle) obj;
        if (str != null) {
            android.os.Bundle zza = com.google.android.gms.internal.ads.zzfln.zza(bundle, "pii");
            zza.putString("afai", str);
            zza.putBoolean("is_afai_lat", this.zzb);
        }
    }
}
