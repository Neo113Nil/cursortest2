package com.google.common.base;

/* loaded from: classes9.dex */
final class JdkPattern extends com.google.common.base.CommonPattern implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final java.util.regex.Pattern pattern;

    JdkPattern(java.util.regex.Pattern pattern) {
        this.pattern = (java.util.regex.Pattern) com.google.common.base.Preconditions.checkNotNull(pattern);
    }

    @Override // com.google.common.base.CommonPattern
    public final com.google.common.base.CommonMatcher matcher(java.lang.CharSequence charSequence) {
        return new com.google.common.base.JdkPattern.JdkMatcher(this.pattern.matcher(charSequence));
    }

    @Override // com.google.common.base.CommonPattern
    public final java.lang.String pattern() {
        return this.pattern.pattern();
    }

    @Override // com.google.common.base.CommonPattern
    public final int flags() {
        return this.pattern.flags();
    }

    @Override // com.google.common.base.CommonPattern
    public final java.lang.String toString() {
        return this.pattern.toString();
    }

    static final class JdkMatcher extends com.google.common.base.CommonMatcher {
        final java.util.regex.Matcher matcher;

        JdkMatcher(java.util.regex.Matcher matcher) {
            this.matcher = (java.util.regex.Matcher) com.google.common.base.Preconditions.checkNotNull(matcher);
        }

        @Override // com.google.common.base.CommonMatcher
        public final boolean matches() {
            return this.matcher.matches();
        }

        @Override // com.google.common.base.CommonMatcher
        public final boolean find() {
            return this.matcher.find();
        }

        @Override // com.google.common.base.CommonMatcher
        public final boolean find(int i) {
            return this.matcher.find(i);
        }

        @Override // com.google.common.base.CommonMatcher
        public final java.lang.String replaceAll(java.lang.String str) {
            return this.matcher.replaceAll(str);
        }

        @Override // com.google.common.base.CommonMatcher
        public final int end() {
            return this.matcher.end();
        }

        @Override // com.google.common.base.CommonMatcher
        public final int start() {
            return this.matcher.start();
        }
    }
}
