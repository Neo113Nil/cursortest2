package com.google.android.exoplayer2.extractor.mkv;

/* loaded from: classes3.dex */
interface EbmlReader {
    void init(com.google.android.exoplayer2.extractor.mkv.EbmlProcessor ebmlProcessor);

    boolean read(com.google.android.exoplayer2.extractor.ExtractorInput extractorInput) throws java.io.IOException;

    void reset();
}
