package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzbhf extends com.google.android.gms.internal.ads.zzcfw {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbhl zza;

    zzbhf(com.google.android.gms.internal.ads.zzbhl zzbhlVar) {
        java.util.Objects.requireNonNull(zzbhlVar);
        this.zza = zzbhlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcfw, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.zza.zzb();
        return super.cancel(z);
    }
}
