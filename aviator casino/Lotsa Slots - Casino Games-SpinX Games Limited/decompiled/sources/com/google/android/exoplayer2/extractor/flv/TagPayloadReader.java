package com.google.android.exoplayer2.extractor.flv;

/* loaded from: classes3.dex */
abstract class TagPayloadReader {
    protected final com.google.android.exoplayer2.extractor.TrackOutput output;

    protected abstract boolean parseHeader(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray) throws com.google.android.exoplayer2.ParserException;

    protected abstract boolean parsePayload(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, long j) throws com.google.android.exoplayer2.ParserException;

    public abstract void seek();

    public static final class UnsupportedFormatException extends com.google.android.exoplayer2.ParserException {
        public UnsupportedFormatException(java.lang.String str) {
            super(str, null, false, 1);
        }
    }

    protected TagPayloadReader(com.google.android.exoplayer2.extractor.TrackOutput trackOutput) {
        this.output = trackOutput;
    }

    public final boolean consume(com.google.android.exoplayer2.util.ParsableByteArray parsableByteArray, long j) throws com.google.android.exoplayer2.ParserException {
        return parseHeader(parsableByteArray) && parsePayload(parsableByteArray, j);
    }
}
