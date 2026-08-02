package com.google.zxing.oned.rss.expanded;

/* loaded from: classes9.dex */
final class ExpandedRow {
    private final java.util.List<com.google.zxing.oned.rss.expanded.ExpandedPair> pairs;
    private final int rowNumber;

    ExpandedRow(java.util.List<com.google.zxing.oned.rss.expanded.ExpandedPair> list, int i) {
        this.pairs = new java.util.ArrayList(list);
        this.rowNumber = i;
    }

    final java.util.List<com.google.zxing.oned.rss.expanded.ExpandedPair> getPairs() {
        return this.pairs;
    }

    final int getRowNumber() {
        return this.rowNumber;
    }

    final boolean isEquivalent(java.util.List<com.google.zxing.oned.rss.expanded.ExpandedPair> list) {
        return this.pairs.equals(list);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("{ ");
        sb.append(this.pairs);
        sb.append(" }");
        return sb.toString();
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.zxing.oned.rss.expanded.ExpandedRow) {
            return this.pairs.equals(((com.google.zxing.oned.rss.expanded.ExpandedRow) obj).pairs);
        }
        return false;
    }

    public final int hashCode() {
        return this.pairs.hashCode();
    }
}
