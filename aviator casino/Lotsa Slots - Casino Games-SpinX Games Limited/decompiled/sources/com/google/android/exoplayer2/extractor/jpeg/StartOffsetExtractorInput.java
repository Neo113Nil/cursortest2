package com.google.android.exoplayer2.extractor.jpeg;

/* loaded from: classes3.dex */
final class StartOffsetExtractorInput extends com.google.android.exoplayer2.extractor.ForwardingExtractorInput {
    private final long startOffset;

    public StartOffsetExtractorInput(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput, long j) {
        super(extractorInput);
        com.google.android.exoplayer2.util.Assertions.checkArgument(extractorInput.getPosition() >= j);
        this.startOffset = j;
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput, com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPosition() {
        return super.getPosition() - this.startOffset;
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput, com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPeekPosition() {
        return super.getPeekPosition() - this.startOffset;
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput, com.google.android.exoplayer2.extractor.ExtractorInput
    public long getLength() {
        return super.getLength() - this.startOffset;
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput, com.google.android.exoplayer2.extractor.ExtractorInput
    public <E extends java.lang.Throwable> void setRetryPosition(long j, E e) throws java.lang.Throwable {
        super.setRetryPosition(j + this.startOffset, e);
    }
}
