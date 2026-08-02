package com.google.common.io;

/* loaded from: classes9.dex */
public final class PatternFilenameFilter implements java.io.FilenameFilter {
    private final java.util.regex.Pattern pattern;

    public PatternFilenameFilter(java.lang.String str) {
        this(java.util.regex.Pattern.compile(str));
    }

    public PatternFilenameFilter(java.util.regex.Pattern pattern) {
        this.pattern = (java.util.regex.Pattern) com.google.common.base.Preconditions.checkNotNull(pattern);
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(java.io.File file, java.lang.String str) {
        return this.pattern.matcher(str).matches();
    }
}
