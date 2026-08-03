package com.google.android.exoplayer2.extractor.ogg;

/* loaded from: classes3.dex */
final class OggPacket {
    private boolean populated;
    private int segmentCount;
    private final com.google.android.exoplayer2.extractor.ogg.OggPageHeader pageHeader = new com.google.android.exoplayer2.extractor.ogg.OggPageHeader();
    private final com.google.android.exoplayer2.util.ParsableByteArray packetArray = new com.google.android.exoplayer2.util.ParsableByteArray(new byte[65025], 0);
    private int currentSegmentIndex = -1;

    OggPacket() {
    }

    public void reset() {
        this.pageHeader.reset();
        this.packetArray.reset(0);
        this.currentSegmentIndex = -1;
        this.populated = false;
    }

    public boolean populate(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        int i;
        com.google.android.exoplayer2.util.Assertions.checkState(extractorInput != null);
        if (this.populated) {
            this.populated = false;
            this.packetArray.reset(0);
        }
        while (!this.populated) {
            if (this.currentSegmentIndex < 0) {
                if (!this.pageHeader.skipToNextPage(extractorInput) || !this.pageHeader.populate(extractorInput, true)) {
                    return false;
                }
                int i2 = this.pageHeader.headerSize;
                if ((this.pageHeader.type & 1) == 1 && this.packetArray.limit() == 0) {
                    i2 += calculatePacketSize(0);
                    i = this.segmentCount;
                } else {
                    i = 0;
                }
                if (!com.google.android.exoplayer2.extractor.ExtractorUtil.skipFullyQuietly(extractorInput, i2)) {
                    return false;
                }
                this.currentSegmentIndex = i;
            }
            int calculatePacketSize = calculatePacketSize(this.currentSegmentIndex);
            int i3 = this.currentSegmentIndex + this.segmentCount;
            if (calculatePacketSize > 0) {
                com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = this.packetArray;
                parsableByteArray.ensureCapacity(parsableByteArray.limit() + calculatePacketSize);
                if (!com.google.android.exoplayer2.extractor.ExtractorUtil.readFullyQuietly(extractorInput, this.packetArray.getData(), this.packetArray.limit(), calculatePacketSize)) {
                    return false;
                }
                com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray2 = this.packetArray;
                parsableByteArray2.setLimit(parsableByteArray2.limit() + calculatePacketSize);
                this.populated = this.pageHeader.laces[i3 + (-1)] != 255;
            }
            if (i3 == this.pageHeader.pageSegmentCount) {
                i3 = -1;
            }
            this.currentSegmentIndex = i3;
        }
        return true;
    }

    public com.google.android.exoplayer2.extractor.ogg.OggPageHeader getPageHeader() {
        return this.pageHeader;
    }

    public com.google.android.exoplayer2.util.ParsableByteArray getPayload() {
        return this.packetArray;
    }

    public void trimPayload() {
        if (this.packetArray.getData().length == 65025) {
            return;
        }
        com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray = this.packetArray;
        parsableByteArray.reset(java.util.Arrays.copyOf(parsableByteArray.getData(), java.lang.Math.max(65025, this.packetArray.limit())), this.packetArray.limit());
    }

    private int calculatePacketSize(int i) {
        int i2 = 0;
        this.segmentCount = 0;
        while (this.segmentCount + i < this.pageHeader.pageSegmentCount) {
            int[] iArr = this.pageHeader.laces;
            int i3 = this.segmentCount;
            this.segmentCount = i3 + 1;
            int i4 = iArr[i3 + i];
            i2 += i4;
            if (i4 != 255) {
                break;
            }
        }
        return i2;
    }
}
