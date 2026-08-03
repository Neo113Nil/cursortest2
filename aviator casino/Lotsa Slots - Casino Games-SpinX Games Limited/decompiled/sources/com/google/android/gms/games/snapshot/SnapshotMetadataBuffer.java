package com.google.android.gms.games.snapshot;

/* compiled from: com.google.android.gms:play-services-games-v2@@20.0.0 */
/* loaded from: classes3.dex */
public class SnapshotMetadataBuffer extends com.google.android.gms.common.data.AbstractDataBuffer<com.google.android.gms.games.snapshot.SnapshotMetadata> {
    public SnapshotMetadataBuffer(com.google.android.gms.common.data.DataHolder dataHolder) {
        super(dataHolder);
    }

    @Override // com.google.android.gms.common.data.AbstractDataBuffer, com.google.android.gms.common.data.DataBuffer
    public com.google.android.gms.games.snapshot.SnapshotMetadata get(int i) {
        return new com.google.android.gms.games.snapshot.SnapshotMetadataRef(this.mDataHolder, i);
    }
}
