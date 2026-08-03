package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public class zzhbr extends com.google.android.gms.internal.ads.zzhbs {
    private final com.google.common.util.concurrent.ListenableFuture zza;

    protected zzhbr(com.google.common.util.concurrent.ListenableFuture listenableFuture) {
        this.zza = listenableFuture;
    }

    @Override // com.google.android.gms.internal.ads.zzhbs, com.google.android.gms.internal.ads.zzhbq
    protected final /* synthetic */ java.util.concurrent.Future zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhbq, com.google.android.gms.internal.ads.zzgwd
    protected final /* synthetic */ java.lang.Object zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhbs
    protected final com.google.common.util.concurrent.ListenableFuture zzc() {
        return this.zza;
    }
}
