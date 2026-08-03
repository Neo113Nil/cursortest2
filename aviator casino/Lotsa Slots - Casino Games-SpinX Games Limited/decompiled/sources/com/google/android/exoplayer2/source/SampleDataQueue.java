package com.google.android.exoplayer2.source;

/* loaded from: classes3.dex */
class SampleDataQueue {
    private static final int INITIAL_SCRATCH_SIZE = 32;
    private final int allocationLength;
    private final com.google.android.exoplayer2.upstream.Allocator allocator;
    private com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode firstAllocationNode;
    private com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode readAllocationNode;
    private final com.google.android.exoplayer2.util.ParsableByteArray scratch;
    private long totalBytesWritten;
    private com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode writeAllocationNode;

    public SampleDataQueue(com.google.android.exoplayer2.upstream.Allocator allocator) {
        this.allocator = allocator;
        int individualAllocationLength = allocator.getIndividualAllocationLength();
        this.allocationLength = individualAllocationLength;
        this.scratch = new com.google.android.exoplayer2.util.ParsableByteArray(32);
        com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode allocationNode = new com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode(0L, individualAllocationLength);
        this.firstAllocationNode = allocationNode;
        this.readAllocationNode = allocationNode;
        this.writeAllocationNode = allocationNode;
    }

    public void reset() {
        clearAllocationNodes(this.firstAllocationNode);
        this.firstAllocationNode.reset(0L, this.allocationLength);
        com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode allocationNode = this.firstAllocationNode;
        this.readAllocationNode = allocationNode;
        this.writeAllocationNode = allocationNode;
        this.totalBytesWritten = 0L;
        this.allocator.trim();
    }

    public void discardUpstreamSampleBytes(long j) {
        com.google.android.exoplayer2.util.Assertions.checkArgument(j <= this.totalBytesWritten);
        this.totalBytesWritten = j;
        if (j == 0 || j == this.firstAllocationNode.startPosition) {
            clearAllocationNodes(this.firstAllocationNode);
            com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode allocationNode = new com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode(this.totalBytesWritten, this.allocationLength);
            this.firstAllocationNode = allocationNode;
            this.readAllocationNode = allocationNode;
            this.writeAllocationNode = allocationNode;
            return;
        }
        com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode allocationNode2 = this.firstAllocationNode;
        while (this.totalBytesWritten > allocationNode2.endPosition) {
            allocationNode2 = allocationNode2.next;
        }
        com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode allocationNode3 = (com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode) com.google.android.exoplayer2.util.Assertions.checkNotNull(allocationNode2.next);
        clearAllocationNodes(allocationNode3);
        allocationNode2.next = new com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode(allocationNode2.endPosition, this.allocationLength);
        this.writeAllocationNode = this.totalBytesWritten == allocationNode2.endPosition ? allocationNode2.next : allocationNode2;
        if (this.readAllocationNode == allocationNode3) {
            this.readAllocationNode = allocationNode2.next;
        }
    }

    public void rewind() {
        this.readAllocationNode = this.firstAllocationNode;
    }

    public void readToBuffer(com.google.android.exoplayer2.decoder.DecoderInputBuffer decoderInputBuffer, com.google.android.exoplayer2.source.SampleQueue.SampleExtrasHolder sampleExtrasHolder) {
        this.readAllocationNode = readSampleData(this.readAllocationNode, decoderInputBuffer, sampleExtrasHolder, this.scratch);
    }

    public void peekToBuffer(com.google.android.exoplayer2.decoder.DecoderInputBuffer decoderInputBuffer, com.google.android.exoplayer2.source.SampleQueue.SampleExtrasHolder sampleExtrasHolder) {
        readSampleData(this.readAllocationNode, decoderInputBuffer, sampleExtrasHolder, this.scratch);
    }

    public void discardDownstreamTo(long j) {
        if (j == -1) {
            return;
        }
        while (j >= this.firstAllocationNode.endPosition) {
            this.allocator.release(this.firstAllocationNode.allocation);
            this.firstAllocationNode = this.firstAllocationNode.clear();
        }
        if (this.readAllocationNode.startPosition < this.firstAllocationNode.startPosition) {
            this.readAllocationNode = this.firstAllocationNode;
        }
    }

    public long getTotalBytesWritten() {
        return this.totalBytesWritten;
    }

    public int sampleData(com.google.android.exoplayer2.upstream.DataReader dataReader, int i, boolean z) throws java.io.IOException {
        int read = dataReader.read(this.writeAllocationNode.allocation.data, this.writeAllocationNode.translateOffset(this.totalBytesWritten), preAppend(i));
        if (read != -1) {
            postAppend(read);
            return read;
        }
        if (z) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    public void sampleData(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, int i) {
        while (i > 0) {
            int preAppend = preAppend(i);
            parsableByteArray.readBytes(this.writeAllocationNode.allocation.data, this.writeAllocationNode.translateOffset(this.totalBytesWritten), preAppend);
            i -= preAppend;
            postAppend(preAppend);
        }
    }

    private void clearAllocationNodes(com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode allocationNode) {
        if (allocationNode.allocation == null) {
            return;
        }
        this.allocator.release(allocationNode);
        allocationNode.clear();
    }

    private int preAppend(int i) {
        if (this.writeAllocationNode.allocation == null) {
            this.writeAllocationNode.initialize(this.allocator.allocate(), new com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode(this.writeAllocationNode.endPosition, this.allocationLength));
        }
        return java.lang.Math.min(i, (int) (this.writeAllocationNode.endPosition - this.totalBytesWritten));
    }

    private void postAppend(int i) {
        long j = this.totalBytesWritten + i;
        this.totalBytesWritten = j;
        if (j == this.writeAllocationNode.endPosition) {
            this.writeAllocationNode = this.writeAllocationNode.next;
        }
    }

    private static com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode readSampleData(com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode allocationNode, com.google.android.exoplayer2.decoder.DecoderInputBuffer decoderInputBuffer, com.google.android.exoplayer2.source.SampleQueue.SampleExtrasHolder sampleExtrasHolder, com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        if (decoderInputBuffer.isEncrypted()) {
            allocationNode = readEncryptionData(allocationNode, decoderInputBuffer, sampleExtrasHolder, parsableByteArray);
        }
        if (decoderInputBuffer.hasSupplementalData()) {
            parsableByteArray.reset(4);
            com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode readData = readData(allocationNode, sampleExtrasHolder.offset, parsableByteArray.getData(), 4);
            int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            sampleExtrasHolder.offset += 4;
            sampleExtrasHolder.size -= 4;
            decoderInputBuffer.ensureSpaceForWrite(readUnsignedIntToInt);
            com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode readData2 = readData(readData, sampleExtrasHolder.offset, decoderInputBuffer.data, readUnsignedIntToInt);
            sampleExtrasHolder.offset += readUnsignedIntToInt;
            sampleExtrasHolder.size -= readUnsignedIntToInt;
            decoderInputBuffer.resetSupplementalData(sampleExtrasHolder.size);
            return readData(readData2, sampleExtrasHolder.offset, decoderInputBuffer.supplementalData, sampleExtrasHolder.size);
        }
        decoderInputBuffer.ensureSpaceForWrite(sampleExtrasHolder.size);
        return readData(allocationNode, sampleExtrasHolder.offset, decoderInputBuffer.data, sampleExtrasHolder.size);
    }

    private static com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode readEncryptionData(com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode allocationNode, com.google.android.exoplayer2.decoder.DecoderInputBuffer decoderInputBuffer, com.google.android.exoplayer2.source.SampleQueue.SampleExtrasHolder sampleExtrasHolder, com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) {
        int i;
        long j = sampleExtrasHolder.offset;
        parsableByteArray.reset(1);
        com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode readData = readData(allocationNode, j, parsableByteArray.getData(), 1);
        long j2 = j + 1;
        byte b = parsableByteArray.getData()[0];
        boolean z = (b & 128) != 0;
        int i2 = b & Byte.MAX_VALUE;
        com.google.android.exoplayer2.decoder.CryptoInfo cryptoInfo = decoderInputBuffer.cryptoInfo;
        if (cryptoInfo.iv == null) {
            cryptoInfo.iv = new byte[16];
        } else {
            java.util.Arrays.fill(cryptoInfo.iv, (byte) 0);
        }
        com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode readData2 = readData(readData, j2, cryptoInfo.iv, i2);
        long j3 = j2 + i2;
        if (z) {
            parsableByteArray.reset(2);
            readData2 = readData(readData2, j3, parsableByteArray.getData(), 2);
            j3 += 2;
            i = parsableByteArray.readUnsignedShort();
        } else {
            i = 1;
        }
        int[] iArr = cryptoInfo.numBytesOfClearData;
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr3 == null || iArr3.length < i) {
            iArr3 = new int[i];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i3 = i * 6;
            parsableByteArray.reset(i3);
            readData2 = readData(readData2, j3, parsableByteArray.getData(), i3);
            j3 += i3;
            parsableByteArray.setPosition(0);
            for (int i4 = 0; i4 < i; i4++) {
                iArr2[i4] = parsableByteArray.readUnsignedShort();
                iArr4[i4] = parsableByteArray.readUnsignedIntToInt();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = sampleExtrasHolder.size - ((int) (j3 - sampleExtrasHolder.offset));
        }
        com.google.android.exoplayer2.extractor.TrackOutput.CryptoData cryptoData = (com.google.android.exoplayer2.extractor.TrackOutput.CryptoData) com.google.android.exoplayer2.util.Util.castNonNull(sampleExtrasHolder.cryptoData);
        cryptoInfo.set(i, iArr2, iArr4, cryptoData.encryptionKey, cryptoInfo.iv, cryptoData.cryptoMode, cryptoData.encryptedBlocks, cryptoData.clearBlocks);
        int i5 = (int) (j3 - sampleExtrasHolder.offset);
        sampleExtrasHolder.offset += i5;
        sampleExtrasHolder.size -= i5;
        return readData2;
    }

    private static com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode readData(com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode allocationNode, long j, java.nio.ByteBuffer byteBuffer, int i) {
        com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode nodeContainingPosition = getNodeContainingPosition(allocationNode, j);
        while (i > 0) {
            int min = java.lang.Math.min(i, (int) (nodeContainingPosition.endPosition - j));
            byteBuffer.put(nodeContainingPosition.allocation.data, nodeContainingPosition.translateOffset(j), min);
            i -= min;
            j += min;
            if (j == nodeContainingPosition.endPosition) {
                nodeContainingPosition = nodeContainingPosition.next;
            }
        }
        return nodeContainingPosition;
    }

    private static com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode readData(com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode allocationNode, long j, byte[] bArr, int i) {
        com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode nodeContainingPosition = getNodeContainingPosition(allocationNode, j);
        int i2 = i;
        while (i2 > 0) {
            int min = java.lang.Math.min(i2, (int) (nodeContainingPosition.endPosition - j));
            java.lang.System.arraycopy(nodeContainingPosition.allocation.data, nodeContainingPosition.translateOffset(j), bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == nodeContainingPosition.endPosition) {
                nodeContainingPosition = nodeContainingPosition.next;
            }
        }
        return nodeContainingPosition;
    }

    private static com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode getNodeContainingPosition(com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode allocationNode, long j) {
        while (j >= allocationNode.endPosition) {
            allocationNode = allocationNode.next;
        }
        return allocationNode;
    }

    private static final class AllocationNode implements com.google.android.exoplayer2.upstream.Allocator.AllocationNode {
        public com.google.android.exoplayer2.upstream.Allocation allocation;
        public long endPosition;
        public com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode next;
        public long startPosition;

        public AllocationNode(long j, int i) {
            reset(j, i);
        }

        public void reset(long j, int i) {
            com.google.android.exoplayer2.util.Assertions.checkState(this.allocation == null);
            this.startPosition = j;
            this.endPosition = j + i;
        }

        public void initialize(com.google.android.exoplayer2.upstream.Allocation allocation, com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode allocationNode) {
            this.allocation = allocation;
            this.next = allocationNode;
        }

        public int translateOffset(long j) {
            return ((int) (j - this.startPosition)) + this.allocation.offset;
        }

        public com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode clear() {
            this.allocation = null;
            com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode allocationNode = this.next;
            this.next = null;
            return allocationNode;
        }

        @Override // com.google.android.exoplayer2.upstream.Allocator.AllocationNode
        public com.google.android.exoplayer2.upstream.Allocation getAllocation() {
            return (com.google.android.exoplayer2.upstream.Allocation) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.allocation);
        }

        @Override // com.google.android.exoplayer2.upstream.Allocator.AllocationNode
        public com.google.android.exoplayer2.upstream.Allocator.AllocationNode next() {
            com.google.android.exoplayer2.source.SampleDataQueue.AllocationNode allocationNode = this.next;
            if (allocationNode == null || allocationNode.allocation == null) {
                return null;
            }
            return allocationNode;
        }
    }
}
