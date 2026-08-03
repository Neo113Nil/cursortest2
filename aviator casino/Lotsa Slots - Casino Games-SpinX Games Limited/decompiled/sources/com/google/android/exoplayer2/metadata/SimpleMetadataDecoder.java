package com.google.android.exoplayer2.metadata;

/* loaded from: classes3.dex */
public abstract class SimpleMetadataDecoder implements com.google.android.exoplayer2.metadata.MetadataDecoder {
    protected abstract com.google.android.exoplayer2.metadata.Metadata decode(com.google.android.exoplayer2.metadata.MetadataInputBuffer metadataInputBuffer, java.nio.ByteBuffer byteBuffer);

    @Override // com.google.android.exoplayer2.metadata.MetadataDecoder
    public final com.google.android.exoplayer2.metadata.Metadata decode(com.google.android.exoplayer2.metadata.MetadataInputBuffer metadataInputBuffer) {
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) com.google.android.exoplayer2.util.Assertions.checkNotNull(metadataInputBuffer.data);
        com.google.android.exoplayer2.util.Assertions.checkArgument(byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0);
        if (metadataInputBuffer.isDecodeOnly()) {
            return null;
        }
        return decode(metadataInputBuffer, byteBuffer);
    }
}
