package com.google.android.exoplayer2.metadata.scte35;

/* loaded from: classes3.dex */
public final class SpliceInfoDecoder extends com.google.android.exoplayer2.metadata.SimpleMetadataDecoder {
    private static final int TYPE_PRIVATE_COMMAND = 255;
    private static final int TYPE_SPLICE_INSERT = 5;
    private static final int TYPE_SPLICE_NULL = 0;
    private static final int TYPE_SPLICE_SCHEDULE = 4;
    private static final int TYPE_TIME_SIGNAL = 6;
    private final com.google.android.exoplayer2.util.ParsableByteArray sectionData = new com.google.android.exoplayer2.util.ParsableByteArray();
    private final com.google.android.exoplayer2.util.ParsableBitArray sectionHeader = new com.google.android.exoplayer2.util.ParsableBitArray();
    private com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster;

    @Override // com.google.android.exoplayer2.metadata.SimpleMetadataDecoder
    protected com.google.android.exoplayer2.metadata.Metadata decode(com.google.android.exoplayer2.metadata.MetadataInputBuffer metadataInputBuffer, java.nio.ByteBuffer byteBuffer) {
        com.google.android.exoplayer2.metadata.Metadata.Entry spliceNullCommand;
        if (this.timestampAdjuster == null || metadataInputBuffer.subsampleOffsetUs != this.timestampAdjuster.getTimestampOffsetUs()) {
            com.google.android.exoplayer2.util.TimestampAdjuster timestampAdjuster = new com.google.android.exoplayer2.util.TimestampAdjuster(metadataInputBuffer.timeUs);
            this.timestampAdjuster = timestampAdjuster;
            timestampAdjuster.adjustSampleTimestamp(metadataInputBuffer.timeUs - metadataInputBuffer.subsampleOffsetUs);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.sectionData.reset(array, limit);
        this.sectionHeader.reset(array, limit);
        this.sectionHeader.skipBits(39);
        long readBits = (this.sectionHeader.readBits(1) << 32) | this.sectionHeader.readBits(32);
        this.sectionHeader.skipBits(20);
        int readBits2 = this.sectionHeader.readBits(12);
        int readBits3 = this.sectionHeader.readBits(8);
        this.sectionData.skipBytes(14);
        if (readBits3 == 0) {
            spliceNullCommand = new com.google.android.exoplayer2.metadata.scte35.SpliceNullCommand();
        } else if (readBits3 == 255) {
            spliceNullCommand = com.google.android.exoplayer2.metadata.scte35.PrivateCommand.parseFromSection(this.sectionData, readBits2, readBits);
        } else if (readBits3 == 4) {
            spliceNullCommand = com.google.android.exoplayer2.metadata.scte35.SpliceScheduleCommand.parseFromSection(this.sectionData);
        } else if (readBits3 == 5) {
            spliceNullCommand = com.google.android.exoplayer2.metadata.scte35.SpliceInsertCommand.parseFromSection(this.sectionData, readBits, this.timestampAdjuster);
        } else {
            spliceNullCommand = readBits3 != 6 ? null : com.google.android.exoplayer2.metadata.scte35.TimeSignalCommand.parseFromSection(this.sectionData, readBits, this.timestampAdjuster);
        }
        return spliceNullCommand == null ? new com.google.android.exoplayer2.metadata.Metadata(new com.google.android.exoplayer2.metadata.Metadata.Entry[0]) : new com.google.android.exoplayer2.metadata.Metadata(spliceNullCommand);
    }
}
