package com.datadog.trace.core.util;

/* loaded from: classes3.dex */
public final class Matchers {
    private Matchers() {
    }

    public static com.datadog.trace.core.util.Matcher compileGlob(java.lang.String str) {
        if (str == null || str.equals("*")) {
            return null;
        }
        if (str.indexOf(42) == -1 && str.indexOf(63) == -1) {
            return new com.datadog.trace.core.util.Matchers.ExactMatcher(str);
        }
        return new com.datadog.trace.core.util.Matchers.PatternMatcher(com.datadog.trace.core.util.GlobPattern.globToRegexPattern(str));
    }

    public static boolean matches(com.datadog.trace.core.util.Matcher matcher, java.lang.String str) {
        return matcher == null || matcher.matches(str);
    }

    public static boolean matches(com.datadog.trace.core.util.Matcher matcher, java.lang.CharSequence charSequence) {
        return matcher == null || matcher.matches(charSequence);
    }

    static boolean Camera2StreamConfigurationMap(java.lang.String str) {
        return str.indexOf(42) == -1 && str.indexOf(63) == -1;
    }

    static final class ExactMatcher implements com.datadog.trace.core.util.Matcher {
        private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;

        ExactMatcher(java.lang.String str) {
            this.getHighResolutionOutputSizeshNQ4ISI = str;
        }

        @Override // com.datadog.trace.core.util.Matcher
        public final boolean matches(java.lang.String str) {
            return this.getHighResolutionOutputSizeshNQ4ISI.equals(str);
        }

        @Override // com.datadog.trace.core.util.Matcher
        public final boolean matches(java.lang.CharSequence charSequence) {
            return this.getHighResolutionOutputSizeshNQ4ISI.contentEquals(charSequence);
        }
    }

    static final class PatternMatcher implements com.datadog.trace.core.util.Matcher {
        private final java.util.regex.Pattern getHighResolutionOutputSizeshNQ4ISI;

        PatternMatcher(java.util.regex.Pattern pattern) {
            this.getHighResolutionOutputSizeshNQ4ISI = pattern;
        }

        @Override // com.datadog.trace.core.util.Matcher
        public final boolean matches(java.lang.CharSequence charSequence) {
            return this.getHighResolutionOutputSizeshNQ4ISI.matcher(charSequence).matches();
        }

        @Override // com.datadog.trace.core.util.Matcher
        public final boolean matches(java.lang.String str) {
            return this.getHighResolutionOutputSizeshNQ4ISI.matcher(str).matches();
        }
    }
}
