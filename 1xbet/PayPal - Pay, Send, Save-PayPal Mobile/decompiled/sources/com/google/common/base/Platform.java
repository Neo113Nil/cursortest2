package com.google.common.base;

/* loaded from: classes4.dex */
final class Platform {
    private static final com.google.common.base.PatternCompiler patternCompiler = loadPatternCompiler();

    private Platform() {
    }

    static com.google.common.base.CharMatcher precomputeCharMatcher(com.google.common.base.CharMatcher charMatcher) {
        return charMatcher.precomputedInternal();
    }

    static <T extends java.lang.Enum<T>> com.google.common.base.Optional<T> getEnumIfPresent(java.lang.Class<T> cls, java.lang.String str) {
        java.lang.ref.WeakReference<? extends java.lang.Enum<?>> weakReference = com.google.common.base.Enums.getEnumConstants(cls).get(str);
        return weakReference == null ? com.google.common.base.Optional.absent() : com.google.common.base.Optional.fromNullable(cls.cast(weakReference.get()));
    }

    static java.lang.String formatCompact4Digits(double d) {
        return java.lang.String.format(java.util.Locale.ROOT, "%.4g", java.lang.Double.valueOf(d));
    }

    static boolean stringIsNullOrEmpty(java.lang.String str) {
        return str == null || str.isEmpty();
    }

    static java.lang.String nullToEmpty(java.lang.String str) {
        return str == null ? "" : str;
    }

    static java.lang.String emptyToNull(java.lang.String str) {
        if (stringIsNullOrEmpty(str)) {
            return null;
        }
        return str;
    }

    static java.lang.String lenientFormat(java.lang.String str, java.lang.Object... objArr) {
        return com.google.common.base.Strings.lenientFormat(str, objArr);
    }

    static java.lang.String stringValueOf(java.lang.Object obj) {
        return java.lang.String.valueOf(obj);
    }

    static com.google.common.base.CommonPattern compilePattern(java.lang.String str) {
        com.google.common.base.Preconditions.checkNotNull(str);
        return patternCompiler.compile(str);
    }

    static boolean patternCompilerIsPcreLike() {
        return patternCompiler.isPcreLike();
    }

    private static com.google.common.base.PatternCompiler loadPatternCompiler() {
        return new com.google.common.base.Platform.JdkPatternCompiler();
    }

    static final class JdkPatternCompiler implements com.google.common.base.PatternCompiler {
        @Override // com.google.common.base.PatternCompiler
        public final boolean isPcreLike() {
            return true;
        }

        private JdkPatternCompiler() {
        }

        @Override // com.google.common.base.PatternCompiler
        public final com.google.common.base.CommonPattern compile(java.lang.String str) {
            return new com.google.common.base.JdkPattern(java.util.regex.Pattern.compile(str));
        }
    }
}
