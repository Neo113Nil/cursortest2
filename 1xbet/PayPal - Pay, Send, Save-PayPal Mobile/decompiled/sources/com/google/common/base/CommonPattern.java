package com.google.common.base;

/* loaded from: classes9.dex */
abstract class CommonPattern {
    public abstract int flags();

    public abstract com.google.common.base.CommonMatcher matcher(java.lang.CharSequence charSequence);

    public abstract java.lang.String pattern();

    public abstract java.lang.String toString();

    CommonPattern() {
    }

    public static com.google.common.base.CommonPattern compile(java.lang.String str) {
        return com.google.common.base.Platform.compilePattern(str);
    }

    public static boolean isPcreLike() {
        return com.google.common.base.Platform.patternCompilerIsPcreLike();
    }
}
