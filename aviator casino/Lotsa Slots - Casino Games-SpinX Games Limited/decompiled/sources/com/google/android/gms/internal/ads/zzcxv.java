package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcxv implements com.google.android.gms.internal.ads.zzcxw {
    private final java.util.Map zza;

    zzcxv(java.util.Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzcxw
    public final com.google.android.gms.internal.ads.zzels zza(int i, java.lang.String str) {
        return (com.google.android.gms.internal.ads.zzels) this.zza.get(str);
    }
}
