package com.google.zxing.oned.rss.expanded.decoders;

/* loaded from: classes9.dex */
final class CurrentParsingState {
    private int position = 0;
    private com.google.zxing.oned.rss.expanded.decoders.CurrentParsingState.State encoding = com.google.zxing.oned.rss.expanded.decoders.CurrentParsingState.State.NUMERIC;

    enum State {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    CurrentParsingState() {
    }

    final int getPosition() {
        return this.position;
    }

    final void setPosition(int i) {
        this.position = i;
    }

    final void incrementPosition(int i) {
        this.position += i;
    }

    final boolean isAlpha() {
        return this.encoding == com.google.zxing.oned.rss.expanded.decoders.CurrentParsingState.State.ALPHA;
    }

    final boolean isNumeric() {
        return this.encoding == com.google.zxing.oned.rss.expanded.decoders.CurrentParsingState.State.NUMERIC;
    }

    final boolean isIsoIec646() {
        return this.encoding == com.google.zxing.oned.rss.expanded.decoders.CurrentParsingState.State.ISO_IEC_646;
    }

    final void setNumeric() {
        this.encoding = com.google.zxing.oned.rss.expanded.decoders.CurrentParsingState.State.NUMERIC;
    }

    final void setAlpha() {
        this.encoding = com.google.zxing.oned.rss.expanded.decoders.CurrentParsingState.State.ALPHA;
    }

    final void setIsoIec646() {
        this.encoding = com.google.zxing.oned.rss.expanded.decoders.CurrentParsingState.State.ISO_IEC_646;
    }
}
