package com.google.android.gms.internal.games_v2;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes4.dex */
public final class zzfk implements com.google.android.gms.games.SnapshotsClient {
    private final com.google.android.gms.internal.games_v2.zzay zza;

    public zzfk(com.google.android.gms.internal.games_v2.zzay zzayVar) {
        this.zza = zzayVar;
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.snapshot.SnapshotMetadata> commitAndClose(final com.google.android.gms.games.snapshot.Snapshot snapshot, final com.google.android.gms.games.snapshot.SnapshotMetadataChange snapshotMetadataChange) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzax() { // from class: com.google.android.gms.internal.games_v2.zzfj
            @Override // com.google.android.gms.internal.games_v2.zzax
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                com.google.android.gms.common.api.internal.TaskApiCall.Builder builder = com.google.android.gms.common.api.internal.TaskApiCall.builder();
                final com.google.android.gms.games.snapshot.Snapshot snapshot2 = com.google.android.gms.games.snapshot.Snapshot.this;
                final com.google.android.gms.games.snapshot.SnapshotMetadataChange snapshotMetadataChange2 = snapshotMetadataChange;
                return googleApi.doWrite(builder.run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzfb
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        ((com.google.android.gms.games.internal.zzaj) obj).zzt((com.google.android.gms.tasks.TaskCompletionSource) obj2, com.google.android.gms.games.snapshot.Snapshot.this, snapshotMetadataChange2);
                    }
                }).setMethodKey(6722).build());
            }
        });
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<java.lang.String> delete(final com.google.android.gms.games.snapshot.SnapshotMetadata snapshotMetadata) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzax() { // from class: com.google.android.gms.internal.games_v2.zzfc
            @Override // com.google.android.gms.internal.games_v2.zzax
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                com.google.android.gms.common.api.internal.TaskApiCall.Builder builder = com.google.android.gms.common.api.internal.TaskApiCall.builder();
                final com.google.android.gms.games.snapshot.SnapshotMetadata snapshotMetadata2 = com.google.android.gms.games.snapshot.SnapshotMetadata.this;
                return googleApi.doWrite(builder.run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzff
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        ((com.google.android.gms.games.internal.zzaj) obj).zzu((com.google.android.gms.tasks.TaskCompletionSource) obj2, com.google.android.gms.games.snapshot.SnapshotMetadata.this.getSnapshotId());
                    }
                }).setMethodKey(6724).build());
            }
        });
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<java.lang.Void> discardAndClose(final com.google.android.gms.games.snapshot.Snapshot snapshot) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzax() { // from class: com.google.android.gms.internal.games_v2.zzey
            @Override // com.google.android.gms.internal.games_v2.zzax
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                com.google.android.gms.common.api.internal.TaskApiCall.Builder builder = com.google.android.gms.common.api.internal.TaskApiCall.builder();
                final com.google.android.gms.games.snapshot.Snapshot snapshot2 = com.google.android.gms.games.snapshot.Snapshot.this;
                return googleApi.doWrite(builder.run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzex
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        com.google.android.gms.games.snapshot.SnapshotContents snapshotContents = com.google.android.gms.games.snapshot.Snapshot.this.getSnapshotContents();
                        com.google.android.gms.common.internal.Preconditions.checkState(!snapshotContents.isClosed(), "Snapshot already closed");
                        com.google.android.gms.drive.Contents zza = snapshotContents.zza();
                        snapshotContents.zzb();
                        ((com.google.android.gms.games.internal.zzao) ((com.google.android.gms.games.internal.zzaj) obj).getService()).zzt(zza);
                        ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(null);
                    }
                }).setMethodKey(6723).build());
            }
        });
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<java.lang.Integer> getMaxCoverImageSize() {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzax() { // from class: com.google.android.gms.internal.games_v2.zzeu
            @Override // com.google.android.gms.internal.games_v2.zzax
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzfe
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(java.lang.Integer.valueOf(((com.google.android.gms.games.internal.zzao) ((com.google.android.gms.games.internal.zzaj) obj).getService()).zzd()));
                    }
                }).setMethodKey(6718).build());
            }
        });
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<java.lang.Integer> getMaxDataSize() {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzax() { // from class: com.google.android.gms.internal.games_v2.zzfi
            @Override // com.google.android.gms.internal.games_v2.zzax
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                return googleApi.doRead(com.google.android.gms.common.api.internal.TaskApiCall.builder().run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzfh
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(java.lang.Integer.valueOf(((com.google.android.gms.games.internal.zzao) ((com.google.android.gms.games.internal.zzaj) obj).getService()).zze()));
                    }
                }).setMethodKey(6717).build());
            }
        });
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<android.content.Intent> getSelectSnapshotIntent(final java.lang.String str, final boolean z, final boolean z2, final int i) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzax() { // from class: com.google.android.gms.internal.games_v2.zzez
            @Override // com.google.android.gms.internal.games_v2.zzax
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                com.google.android.gms.common.api.internal.TaskApiCall.Builder builder = com.google.android.gms.common.api.internal.TaskApiCall.builder();
                final java.lang.String str2 = str;
                final boolean z3 = z;
                final boolean z4 = z2;
                final int i2 = i;
                return googleApi.doRead(builder.run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzes
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        ((com.google.android.gms.tasks.TaskCompletionSource) obj2).setResult(((com.google.android.gms.games.internal.zzao) ((com.google.android.gms.games.internal.zzaj) obj).getService()).zzm(str2, z3, z4, i2));
                    }
                }).setMethodKey(6719).build());
            }
        });
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.AnnotatedData<com.google.android.gms.games.snapshot.SnapshotMetadataBuffer>> load(final boolean z) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzax() { // from class: com.google.android.gms.internal.games_v2.zzet
            @Override // com.google.android.gms.internal.games_v2.zzax
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                com.google.android.gms.common.api.internal.TaskApiCall.Builder builder = com.google.android.gms.common.api.internal.TaskApiCall.builder();
                final boolean z2 = z;
                return googleApi.doRead(builder.run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzfg
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        ((com.google.android.gms.games.internal.zzaj) obj).zzJ((com.google.android.gms.tasks.TaskCompletionSource) obj2, z2);
                    }
                }).setMethodKey(6720).build());
            }
        });
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> open(com.google.android.gms.games.snapshot.SnapshotMetadata snapshotMetadata) {
        return open(snapshotMetadata.getUniqueName(), false, -1);
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> resolveConflict(java.lang.String str, com.google.android.gms.games.snapshot.Snapshot snapshot) {
        com.google.android.gms.games.snapshot.SnapshotMetadata metadata = snapshot.getMetadata();
        com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder builder = new com.google.android.gms.games.snapshot.SnapshotMetadataChange.Builder();
        builder.fromMetadata(metadata);
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzfa(str, metadata.getSnapshotId(), builder.build(), snapshot.getSnapshotContents()));
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> open(com.google.android.gms.games.snapshot.SnapshotMetadata snapshotMetadata, int i) {
        return open(snapshotMetadata.getUniqueName(), false, i);
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> open(java.lang.String str, boolean z) {
        return open(str, z, -1);
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> open(final java.lang.String str, final boolean z, final int i) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzax() { // from class: com.google.android.gms.internal.games_v2.zzfd
            @Override // com.google.android.gms.internal.games_v2.zzax
            public final com.google.android.gms.tasks.Task zza(com.google.android.gms.common.api.GoogleApi googleApi) {
                com.google.android.gms.common.api.internal.TaskApiCall.Builder builder = com.google.android.gms.common.api.internal.TaskApiCall.builder();
                final java.lang.String str2 = str;
                final boolean z2 = z;
                final int i2 = i;
                return googleApi.doWrite(builder.run(new com.google.android.gms.common.api.internal.RemoteCall() { // from class: com.google.android.gms.internal.games_v2.zzev
                    @Override // com.google.android.gms.common.api.internal.RemoteCall
                    public final void accept(java.lang.Object obj, java.lang.Object obj2) {
                        ((com.google.android.gms.games.internal.zzaj) obj).zzL((com.google.android.gms.tasks.TaskCompletionSource) obj2, str2, z2, i2);
                    }
                }).setMethodKey(6721).build());
            }
        });
    }

    @Override // com.google.android.gms.games.SnapshotsClient
    public final com.google.android.gms.tasks.Task<com.google.android.gms.games.SnapshotsClient.DataOrConflict<com.google.android.gms.games.snapshot.Snapshot>> resolveConflict(java.lang.String str, java.lang.String str2, com.google.android.gms.games.snapshot.SnapshotMetadataChange snapshotMetadataChange, com.google.android.gms.games.snapshot.SnapshotContents snapshotContents) {
        return this.zza.zzb(new com.google.android.gms.internal.games_v2.zzfa(str, str2, snapshotMetadataChange, snapshotContents));
    }
}
