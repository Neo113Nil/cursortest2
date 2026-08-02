package com.google.gson;

/* loaded from: classes4.dex */
public class FormattingStyle {
    public static final com.google.gson.FormattingStyle COMPACT = new com.google.gson.FormattingStyle("", "", false);
    public static final com.google.gson.FormattingStyle PRETTY = new com.google.gson.FormattingStyle(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, "  ", true);
    private final java.lang.String indent;
    private final java.lang.String newline;
    private final boolean spaceAfterSeparators;

    private FormattingStyle(java.lang.String str, java.lang.String str2, boolean z) {
        java.util.Objects.requireNonNull(str, "newline == null");
        java.util.Objects.requireNonNull(str2, "indent == null");
        if (!str.matches("[\r\n]*")) {
            throw new java.lang.IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new java.lang.IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.newline = str;
        this.indent = str2;
        this.spaceAfterSeparators = z;
    }

    public com.google.gson.FormattingStyle withNewline(java.lang.String str) {
        return new com.google.gson.FormattingStyle(str, this.indent, this.spaceAfterSeparators);
    }

    public com.google.gson.FormattingStyle withIndent(java.lang.String str) {
        return new com.google.gson.FormattingStyle(this.newline, str, this.spaceAfterSeparators);
    }

    public com.google.gson.FormattingStyle withSpaceAfterSeparators(boolean z) {
        return new com.google.gson.FormattingStyle(this.newline, this.indent, z);
    }

    public java.lang.String getNewline() {
        return this.newline;
    }

    public java.lang.String getIndent() {
        return this.indent;
    }

    public boolean usesSpaceAfterSeparators() {
        return this.spaceAfterSeparators;
    }
}
