package com.google.android.exoplayer2.extractor;

/* loaded from: classes3.dex */
public interface ExtractorOutput {
    public static final com.google.android.exoplayer2.extractor.ExtractorOutput PLACEHOLDER = new com.google.android.exoplayer2.extractor.ExtractorOutput() { // from class: com.google.android.exoplayer2.extractor.ExtractorOutput.1
        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public com.google.android.exoplayer2.extractor.TrackOutput track(int i, int i2) {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void endTracks() {
            throw new java.lang.UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
        public void seekMap(com.google.android.exoplayer2.extractor.SeekMap seekMap) {
            throw new java.lang.UnsupportedOperationException();
        }
    };

    void endTracks();

    void seekMap(com.google.android.exoplayer2.extractor.SeekMap seekMap);

    com.google.android.exoplayer2.extractor.TrackOutput track(int i, int i2);
}
