package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfbr implements com.google.android.gms.internal.ads.zzfci {
    private final java.lang.String zza;
    private final android.os.Bundle zzb;
    private final java.lang.String zzc;

    public zzfbr(java.lang.String str, android.os.Bundle bundle, java.lang.String str2) {
        this.zza = str;
        this.zzb = bundle;
        this.zzc = str2;
    }

    @Override // com.google.android.gms.internal.ads.zzfci
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        bundle.putString("rtb", this.zza);
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzfd)).booleanValue()) {
            java.lang.String str = this.zzc;
            if (!str.isEmpty()) {
                bundle.putString("cld_status", str);
            }
        }
        android.os.Bundle bundle2 = this.zzb;
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("adapter_initialization_status", bundle2);
    }
}
