package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
final class zzbzk implements zzgay {
    final /* synthetic */ zzbzm zza;

    public zzbzk(zzbzm zzbzmVar) {
        this.zza = zzbzmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zza(Throwable th) {
        AtomicInteger atomicInteger;
        atomicInteger = this.zza.zzb;
        atomicInteger.set(-1);
    }

    @Override // com.google.android.gms.internal.ads.zzgay
    public final void zzb(Object obj) {
        AtomicInteger atomicInteger;
        atomicInteger = this.zza.zzb;
        atomicInteger.set(1);
    }
}
