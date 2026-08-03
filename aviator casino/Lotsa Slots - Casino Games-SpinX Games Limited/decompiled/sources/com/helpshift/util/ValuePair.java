package com.helpshift.util;

/* loaded from: classes5.dex */
public class ValuePair<F, S> {
    public final F first;
    public final S second;

    public ValuePair(F f, S s) {
        this.first = f;
        this.second = s;
    }

    public static <F, S> com.helpshift.util.ValuePair<F, S> from(F f, S s) {
        return new com.helpshift.util.ValuePair<>(f, s);
    }
}
