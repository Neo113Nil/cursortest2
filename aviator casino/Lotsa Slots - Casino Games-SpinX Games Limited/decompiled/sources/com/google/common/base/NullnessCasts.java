package com.google.common.base;

@com.google.common.base.ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
final class NullnessCasts {
    @com.google.common.base.ParametricNullness
    static <T> T uncheckedCastNullableTToT(@javax.annotation.CheckForNull T t) {
        return t;
    }

    private NullnessCasts() {
    }
}
