package com.google.android.exoplayer2.extractor.ogg;

/* loaded from: classes3.dex */
interface OggSeeker {
    com.google.android.exoplayer2.extractor.SeekMap createSeekMap();

    long read(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException;

    void startSeek(long j);
}
