package com.google.android.exoplayer2.metadata.scte35;

/* loaded from: classes3.dex */
public abstract class SpliceCommand implements com.google.android.exoplayer2.metadata.Metadata.Entry {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ byte[] getWrappedMetadataBytes() {
        return com.google.android.exoplayer2.metadata.Metadata.Entry.CC.$default$getWrappedMetadataBytes(this);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ com.google.android.exoplayer2.Format getWrappedMetadataFormat() {
        return com.google.android.exoplayer2.metadata.Metadata.Entry.CC.$default$getWrappedMetadataFormat(this);
    }

    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    public /* synthetic */ void populateMediaMetadata(com.google.android.exoplayer2.MediaMetadata.Builder builder) {
        com.google.android.exoplayer2.metadata.Metadata.Entry.CC.$default$populateMediaMetadata(this, builder);
    }

    public java.lang.String toString() {
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }
}
