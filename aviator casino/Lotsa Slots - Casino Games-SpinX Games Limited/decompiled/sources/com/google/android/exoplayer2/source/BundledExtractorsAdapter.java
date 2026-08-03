package com.google.android.exoplayer2.source;

/* loaded from: classes3.dex */
public final class BundledExtractorsAdapter implements com.google.android.exoplayer2.source.ProgressiveMediaExtractor {
    private com.google.android.exoplayer2.extractor.Extractor extractor;
    private com.google.android.exoplayer2.extractor.ExtractorInput extractorInput;
    private final com.google.android.exoplayer2.extractor.ExtractorsFactory extractorsFactory;

    public BundledExtractorsAdapter(com.google.android.exoplayer2.extractor.ExtractorsFactory extractorsFactory) {
        this.extractorsFactory = extractorsFactory;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x004a, code lost:
    
        if (r6.getPosition() != r11) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006d, code lost:
    
        if (r6.getPosition() != r11) goto L37;
     */
    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void init(com.google.android.exoplayer2.upstream.DataReader dataReader, android.net.Uri uri, java.util.Map<java.lang.String, java.util.List<java.lang.String>> map, long j, long j2, com.google.android.exoplayer2.extractor.ExtractorOutput extractorOutput) throws java.io.IOException {
        com.google.android.exoplayer2.extractor.DefaultExtractorInput defaultExtractorInput = new com.google.android.exoplayer2.extractor.DefaultExtractorInput(dataReader, j, j2);
        this.extractorInput = defaultExtractorInput;
        if (this.extractor != null) {
            return;
        }
        com.google.android.exoplayer2.extractor.Extractor[] createExtractors = this.extractorsFactory.createExtractors(uri, map);
        if (createExtractors.length == 1) {
            this.extractor = createExtractors[0];
        } else {
            int length = createExtractors.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                com.google.android.exoplayer2.extractor.Extractor extractor = createExtractors[i];
                try {
                } catch (java.io.EOFException unused) {
                    if (this.extractor == null) {
                    }
                } catch (java.lang.Throwable th) {
                    com.google.android.exoplayer2.util.Assertions.checkState(this.extractor != null || defaultExtractorInput.getPosition() == j);
                    defaultExtractorInput.resetPeekPosition();
                    throw th;
                }
                if (extractor.sniff(defaultExtractorInput)) {
                    this.extractor = extractor;
                    com.google.android.exoplayer2.util.Assertions.checkState(extractor != null || defaultExtractorInput.getPosition() == j);
                    defaultExtractorInput.resetPeekPosition();
                } else {
                    if (this.extractor == null) {
                    }
                    boolean z = true;
                    com.google.android.exoplayer2.util.Assertions.checkState(z);
                    defaultExtractorInput.resetPeekPosition();
                    i++;
                }
            }
            if (this.extractor == null) {
                throw new com.google.android.exoplayer2.source.UnrecognizedInputFormatException("None of the available extractors (" + com.google.android.exoplayer2.util.Util.getCommaDelimitedSimpleClassNames(createExtractors) + ") could read the stream.", (android.net.Uri) com.google.android.exoplayer2.util.Assertions.checkNotNull(uri));
            }
        }
        this.extractor.init(extractorOutput);
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void release() {
        com.google.android.exoplayer2.extractor.Extractor extractor = this.extractor;
        if (extractor != null) {
            extractor.release();
            this.extractor = null;
        }
        this.extractorInput = null;
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void disableSeekingOnMp3Streams() {
        com.google.android.exoplayer2.extractor.Extractor extractor = this.extractor;
        if (extractor instanceof com.google.android.exoplayer2.extractor.mp3.Mp3Extractor) {
            ((com.google.android.exoplayer2.extractor.mp3.Mp3Extractor) extractor).disableSeeking();
        }
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public long getCurrentInputPosition() {
        com.google.android.exoplayer2.extractor.ExtractorInput extractorInput = this.extractorInput;
        if (extractorInput != null) {
            return extractorInput.getPosition();
        }
        return -1L;
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public void seek(long j, long j2) {
        ((com.google.android.exoplayer2.extractor.Extractor) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.extractor)).seek(j, j2);
    }

    @Override // com.google.android.exoplayer2.source.ProgressiveMediaExtractor
    public int read(com.google.android.exoplayer2.extractor.PositionHolder positionHolder) throws java.io.IOException {
        return ((com.google.android.exoplayer2.extractor.Extractor) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.extractor)).read((com.google.android.exoplayer2.extractor.ExtractorInput) com.google.android.exoplayer2.util.Assertions.checkNotNull(this.extractorInput), positionHolder);
    }
}
