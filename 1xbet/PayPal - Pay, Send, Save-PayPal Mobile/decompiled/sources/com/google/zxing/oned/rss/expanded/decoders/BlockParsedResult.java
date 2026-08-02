package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: classes9.dex */
final class BlockParsedResult {
    private final com.google.zxing.oned.rss.expanded.decoders.DecodedInformation decodedInformation;
    private final boolean finished;

    BlockParsedResult() {
        this(null, false);
    }

    BlockParsedResult(com.google.zxing.oned.rss.expanded.decoders.DecodedInformation decodedInformation, boolean z) {
        this.finished = z;
        this.decodedInformation = decodedInformation;
    }

    final com.google.zxing.oned.rss.expanded.decoders.DecodedInformation getDecodedInformation() {
        return this.decodedInformation;
    }

    final boolean isFinished() {
        return this.finished;
    }
}
