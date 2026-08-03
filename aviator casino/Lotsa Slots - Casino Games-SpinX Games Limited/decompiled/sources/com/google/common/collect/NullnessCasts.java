package com.google.common.collect;

@com.google.common.collect.ElementTypesAreNonnullByDefault
/* loaded from: classes3.dex */
final class NullnessCasts {
    @com.google.common.collect.ParametricNullness
    static <T> T uncheckedCastNullableTToT(@javax.annotation.CheckForNull T t) {
        return t;
    }

    @com.google.common.collect.ParametricNullness
    static <T> T unsafeNull() {
        return null;
    }

    private NullnessCasts() {
    }
}
