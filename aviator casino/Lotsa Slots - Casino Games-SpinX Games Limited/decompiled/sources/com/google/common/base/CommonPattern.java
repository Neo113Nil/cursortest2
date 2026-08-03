package com.google.common.base;

@com.google.common.base.ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
abstract class CommonPattern {
    public abstract int flags();

    public abstract com.google.common.base.CommonMatcher matcher(java.lang.CharSequence t);

    public abstract java.lang.String pattern();

    public abstract java.lang.String toString();

    CommonPattern() {
    }

    public static com.google.common.base.CommonPattern compile(java.lang.String pattern) {
        return com.google.common.base.Platform.compilePattern(pattern);
    }

    public static boolean isPcreLike() {
        return com.google.common.base.Platform.patternCompilerIsPcreLike();
    }
}
