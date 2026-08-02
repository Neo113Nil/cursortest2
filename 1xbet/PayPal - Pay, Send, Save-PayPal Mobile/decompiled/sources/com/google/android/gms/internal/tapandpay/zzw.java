package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
final class zzw extends com.google.android.gms.internal.tapandpay.zzbj {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;

    zzw(com.google.android.gms.internal.tapandpay.zzbd zzbdVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzbj, com.google.android.gms.internal.tapandpay.zzj
    public final void zzW(com.google.android.gms.common.api.Status status, com.google.android.gms.tapandpay.issuer.ReachableDeviceWalletInfo[] reachableDeviceWalletInfoArr) {
        if (reachableDeviceWalletInfoArr == null) {
            reachableDeviceWalletInfoArr = new com.google.android.gms.tapandpay.issuer.ReachableDeviceWalletInfo[0];
        }
        com.google.android.gms.common.api.internal.TaskUtil.trySetResultOrApiException(status, com.google.android.gms.internal.tapandpay.zzby.zzg(reachableDeviceWalletInfoArr), this.zza);
    }
}
