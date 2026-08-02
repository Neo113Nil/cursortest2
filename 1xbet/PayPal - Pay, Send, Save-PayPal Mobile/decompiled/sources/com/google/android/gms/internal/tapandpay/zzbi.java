package com.google.android.gms.internal.tapandpay;

/* loaded from: classes8.dex */
public final class zzbi extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.tapandpay.TapAndPaySingleUserClient {
    public zzbi(android.content.Context context) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) com.google.android.gms.tapandpay.TapAndPay.zzb, com.google.android.gms.common.api.Api.ApiOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.tapandpay.TapAndPaySingleUserClient
    public final com.google.android.gms.tasks.Task<java.lang.String> getActiveWalletId() {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzbg
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbo zzboVar = (com.google.android.gms.internal.tapandpay.zzbo) obj;
                ((com.google.android.gms.internal.tapandpay.zzk) zzboVar.getService()).zze(new com.google.android.gms.internal.tapandpay.zzbf(com.google.android.gms.internal.tapandpay.zzbi.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), com.google.android.gms.internal.tapandpay.zzf.zza(zzboVar.getContext()));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzW).setMethodKey(2103).build());
    }

    @Override // com.google.android.gms.tapandpay.TapAndPaySingleUserClient
    public final com.google.android.gms.tasks.Task<java.lang.String> getLinkingToken(final com.google.android.gms.tapandpay.internal.firstparty.GetLinkingTokenRequest getLinkingTokenRequest) {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.tapandpay.zzbh
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final /* synthetic */ void accept(java.lang.Object obj, java.lang.Object obj2) {
                com.google.android.gms.internal.tapandpay.zzbo zzboVar = (com.google.android.gms.internal.tapandpay.zzbo) obj;
                ((com.google.android.gms.internal.tapandpay.zzk) zzboVar.getService()).zzd(getLinkingTokenRequest, new com.google.android.gms.internal.tapandpay.zzbe(com.google.android.gms.internal.tapandpay.zzbi.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), com.google.android.gms.internal.tapandpay.zzf.zza(zzboVar.getContext()));
            }
        }).setFeatures(com.google.android.gms.tapandpay.zza.zzX).setMethodKey(2111).build());
    }
}
