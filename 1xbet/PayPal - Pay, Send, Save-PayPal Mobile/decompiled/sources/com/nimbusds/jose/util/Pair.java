package com.nimbusds.jose.util;

@net.jcip.annotations.Immutable
/* loaded from: classes10.dex */
public class Pair<L, R> {
    private final L left;
    private final R right;

    protected Pair(L l, R r) {
        this.left = l;
        this.right = r;
    }

    public static <L, R> com.nimbusds.jose.util.Pair<L, R> of(L l, R r) {
        return new com.nimbusds.jose.util.Pair<>(l, r);
    }

    public L getLeft() {
        return this.left;
    }

    public R getRight() {
        return this.right;
    }
}
