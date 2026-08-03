package com.google.android.exoplayer2.extractor;

/* loaded from: classes3.dex */
public final class Id3Peeker {
    private final com.google.android.exoplayer2.util.ParsableByteArray scratch = new com.google.android.exoplayer2.util.ParsableByteArray(10);

    public com.google.android.exoplayer2.metadata.Metadata peekId3Data(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput, com.google.android.exoplayer2.metadata.id3.Id3Decoder.FramePredicate framePredicate) throws java.io.IOException {
        com.google.android.exoplayer2.metadata.Metadata metadata = null;
        int i = 0;
        while (true) {
            try {
                extractorInput.peekFully(this.scratch.getData(), 0, 10);
                this.scratch.setPosition(0);
                if (this.scratch.readUnsignedInt24() != 4801587) {
                    break;
                }
                this.scratch.skipBytes(3);
                int readSynchSafeInt = this.scratch.readSynchSafeInt();
                int i2 = readSynchSafeInt + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i2];
                    java.lang.System.arraycopy(this.scratch.getData(), 0, bArr, 0, 10);
                    extractorInput.peekFully(bArr, 10, readSynchSafeInt);
                    metadata = new com.google.android.exoplayer2.metadata.id3.Id3Decoder(framePredicate).decode(bArr, i2);
                } else {
                    extractorInput.advancePeekPosition(readSynchSafeInt);
                }
                i += i2;
            } catch (java.io.EOFException unused) {
            }
        }
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i);
        return metadata;
    }
}
