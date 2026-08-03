package androidx.media3.extractor.metadata.scte35;

/* loaded from: classes2.dex */
public final class SpliceInfoDecoder extends androidx.media3.extractor.metadata.SimpleMetadataDecoder {
    private static final int TYPE_PRIVATE_COMMAND = 255;
    private static final int TYPE_SPLICE_INSERT = 5;
    private static final int TYPE_SPLICE_NULL = 0;
    private static final int TYPE_SPLICE_SCHEDULE = 4;
    private static final int TYPE_TIME_SIGNAL = 6;
    private final androidx.media3.common.util.ParsableByteArray sectionData = new androidx.media3.common.util.ParsableByteArray();
    private final androidx.media3.common.util.ParsableBitArray sectionHeader = new androidx.media3.common.util.ParsableBitArray();
    private androidx.media3.common.util.TimestampAdjuster timestampAdjuster;

    @Override // androidx.media3.extractor.metadata.SimpleMetadataDecoder
    protected androidx.media3.common.Metadata decode(androidx.media3.extractor.metadata.MetadataInputBuffer metadataInputBuffer, java.nio.ByteBuffer byteBuffer) {
        androidx.media3.common.Metadata.Entry spliceNullCommand;
        if (this.timestampAdjuster == null || metadataInputBuffer.subsampleOffsetUs != this.timestampAdjuster.getTimestampOffsetUs()) {
            androidx.media3.common.util.TimestampAdjuster timestampAdjuster = new androidx.media3.common.util.TimestampAdjuster(metadataInputBuffer.timeUs);
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
            spliceNullCommand = new androidx.media3.extractor.metadata.scte35.SpliceNullCommand();
        } else if (readBits3 == 255) {
            spliceNullCommand = androidx.media3.extractor.metadata.scte35.PrivateCommand.parseFromSection(this.sectionData, readBits2, readBits);
        } else if (readBits3 == 4) {
            spliceNullCommand = androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand.parseFromSection(this.sectionData);
        } else if (readBits3 == 5) {
            spliceNullCommand = androidx.media3.extractor.metadata.scte35.SpliceInsertCommand.parseFromSection(this.sectionData, readBits, this.timestampAdjuster);
        } else {
            spliceNullCommand = readBits3 != 6 ? null : androidx.media3.extractor.metadata.scte35.TimeSignalCommand.parseFromSection(this.sectionData, readBits, this.timestampAdjuster);
        }
        return spliceNullCommand == null ? new androidx.media3.common.Metadata(new androidx.media3.common.Metadata.Entry[0]) : new androidx.media3.common.Metadata(spliceNullCommand);
    }
}
