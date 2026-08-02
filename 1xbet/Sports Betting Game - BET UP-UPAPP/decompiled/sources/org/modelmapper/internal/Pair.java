package org.modelmapper.internal;

/* loaded from: classes4.dex */
public class Pair<L, R> {
    private L left;
    private R right;

    public static <L, R> Pair<L, R> of(L l, R r) {
        return new Pair<>(l, r);
    }

    private Pair(L l, R r) {
        this.left = l;
        this.right = r;
    }

    public L getLeft() {
        return this.left;
    }

    public R getRight() {
        return this.right;
    }
}
