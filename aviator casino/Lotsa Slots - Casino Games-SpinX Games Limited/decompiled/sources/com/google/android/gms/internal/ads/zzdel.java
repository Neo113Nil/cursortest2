package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzdel extends com.google.android.gms.internal.ads.zzdip implements com.google.android.gms.internal.ads.zzbog {
    private final android.os.Bundle zzb;

    zzdel(java.util.Set set) {
        super(set);
        this.zzb = new android.os.Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbog
    public final synchronized void zza(java.lang.String str, android.os.Bundle bundle) {
        this.zzb.putAll(bundle);
        zzs(com.google.android.gms.internal.ads.zzdek.zza);
    }

    public final synchronized android.os.Bundle zzb() {
        return new android.os.Bundle(this.zzb);
    }
}
