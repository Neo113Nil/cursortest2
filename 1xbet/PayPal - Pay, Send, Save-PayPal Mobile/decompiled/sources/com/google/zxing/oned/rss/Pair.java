package com.google.zxing.oned.rss;

/* loaded from: classes9.dex */
final class Pair extends com.google.zxing.oned.rss.DataCharacter {
    private int count;
    private final com.google.zxing.oned.rss.FinderPattern finderPattern;

    Pair(int i, int i2, com.google.zxing.oned.rss.FinderPattern finderPattern) {
        super(i, i2);
        this.finderPattern = finderPattern;
    }

    final com.google.zxing.oned.rss.FinderPattern getFinderPattern() {
        return this.finderPattern;
    }

    final int getCount() {
        return this.count;
    }

    final void incrementCount() {
        this.count++;
    }
}
