package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzfcc implements com.google.android.gms.internal.ads.zzfck {
    private final boolean zza;

    zzfcc(com.google.android.gms.internal.ads.zzfia zzfiaVar) {
        this.zza = zzfiaVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final com.google.common.util.concurrent.ListenableFuture zza() {
        return com.google.android.gms.internal.ads.zzhbw.zza(new com.google.android.gms.internal.ads.zzfcb(this.zza, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final int zzb() {
        return 36;
    }
}
