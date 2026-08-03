package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfba implements com.google.android.gms.internal.ads.zzfck {
    private final android.os.Bundle zza;

    zzfba(android.os.Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzfbb(this.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 30;
    }
}
