package com.google.android.gms.tapandpay;

/* loaded from: classes8.dex */
public final class zze extends com.google.android.gms.internal.tapandpay.zzbj {
    private static final com.google.android.gms.common.api.internal.ListenerHolder.Notifier zzb = new com.google.android.gms.tapandpay.zzd();
    private final com.google.android.gms.common.api.internal.ListenerHolder zza;

    public zze(com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder resultHolder, com.google.android.gms.common.api.internal.ListenerHolder listenerHolder) {
        this.zza = listenerHolder;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbj, com.google.android.gms.internal.tapandpay.zzj
    public final void zza(com.google.android.gms.common.api.Status status) {
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbj, com.google.android.gms.internal.tapandpay.zzj
    public final void zzb() {
        this.zza.notifyListener(zzb);
    }
}
