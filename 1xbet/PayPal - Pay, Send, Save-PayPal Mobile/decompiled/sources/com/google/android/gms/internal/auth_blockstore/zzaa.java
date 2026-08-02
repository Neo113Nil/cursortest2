package com.google.android.gms.internal.auth_blockstore;

/* loaded from: classes8.dex */
public final class zzaa extends com.google.android.gms.common.api.GoogleApi implements com.google.android.gms.auth.blockstore.BlockstoreClient {
    private static final com.google.android.gms.common.api.Api.ClientKey zza;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder zzb;
    private static final com.google.android.gms.common.api.Api zzc;

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zza = clientKey;
        com.google.android.gms.internal.auth_blockstore.zzu zzuVar = new com.google.android.gms.internal.auth_blockstore.zzu();
        zzb = zzuVar;
        zzc = new com.google.android.gms.common.api.Api("Blockstore.API", zzuVar, clientKey);
    }

    public zzaa(android.content.Context context) {
        super(context, (com.google.android.gms.common.api.Api<com.google.android.gms.common.api.Api.ApiOptions.NoOptions>) zzc, com.google.android.gms.common.api.Api.ApiOptions.NoOptions.NO_OPTIONS, com.google.android.gms.common.api.GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    @Override // com.google.android.gms.auth.blockstore.BlockstoreClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> deleteBytes(final com.google.android.gms.auth.blockstore.DeleteBytesRequest deleteBytesRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(deleteBytesRequest, "DeleteBytesRequest cannot be null");
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.auth_blockstore.zzab.zzg).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth_blockstore.zzp
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.auth_blockstore.zzg) ((com.google.android.gms.internal.auth_blockstore.zzf) obj).getService()).zza(new com.google.android.gms.internal.auth_blockstore.zzy(com.google.android.gms.internal.auth_blockstore.zzaa.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), deleteBytesRequest);
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1669).build());
    }

    @Override // com.google.android.gms.auth.blockstore.BlockstoreClient
    public final com.google.android.gms.tasks.Task<java.lang.Boolean> isEndToEndEncryptionAvailable() {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.auth_blockstore.zzab.zze).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth_blockstore.zzr
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.auth_blockstore.zzg) ((com.google.android.gms.internal.auth_blockstore.zzf) obj).getService()).zzb(new com.google.android.gms.internal.auth_blockstore.zzz(com.google.android.gms.internal.auth_blockstore.zzaa.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1651).build());
    }

    @Override // com.google.android.gms.auth.blockstore.BlockstoreClient
    public final com.google.android.gms.tasks.Task<byte[]> retrieveBytes() {
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.auth_blockstore.zzab.zza).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth_blockstore.zzt
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.auth_blockstore.zzg) ((com.google.android.gms.internal.auth_blockstore.zzf) obj).getService()).zzc(new com.google.android.gms.internal.auth_blockstore.zzx(com.google.android.gms.internal.auth_blockstore.zzaa.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2));
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1570).build());
    }

    @Override // com.google.android.gms.auth.blockstore.BlockstoreClient
    public final com.google.android.gms.tasks.Task<java.lang.Integer> storeBytes(final com.google.android.gms.auth.blockstore.StoreBytesData storeBytesData) {
        return doWrite(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.auth_blockstore.zzab.zzd, com.google.android.gms.internal.auth_blockstore.zzab.zzf).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth_blockstore.zzq
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.auth_blockstore.zzg) ((com.google.android.gms.internal.auth_blockstore.zzf) obj).getService()).zze(new com.google.android.gms.internal.auth_blockstore.zzv(com.google.android.gms.internal.auth_blockstore.zzaa.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), storeBytesData);
            }
        }).setMethodKey(1645).setAutoResolveMissingFeatures(false).build());
    }

    @Override // com.google.android.gms.auth.blockstore.BlockstoreClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.auth.blockstore.RetrieveBytesResponse> retrieveBytes(final com.google.android.gms.auth.blockstore.RetrieveBytesRequest retrieveBytesRequest) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(retrieveBytesRequest, "RetrieveBytesRequest cannot be null");
        return doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().setFeatures(com.google.android.gms.internal.auth_blockstore.zzab.zzh).run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.auth_blockstore.zzs
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.android.gms.common.api.internal.RemoteCall
            public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                ((com.google.android.gms.internal.auth_blockstore.zzg) ((com.google.android.gms.internal.auth_blockstore.zzf) obj).getService()).zzd(new com.google.android.gms.internal.auth_blockstore.zzw(com.google.android.gms.internal.auth_blockstore.zzaa.this, (com.google.android.gms.tasks.TaskCompletionSource) obj2), retrieveBytesRequest);
            }
        }).setAutoResolveMissingFeatures(false).setMethodKey(1668).build());
    }
}
