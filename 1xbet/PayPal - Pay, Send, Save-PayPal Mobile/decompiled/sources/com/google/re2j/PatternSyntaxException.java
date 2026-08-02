package com.google.re2j;

/* loaded from: classes9.dex */
public class PatternSyntaxException extends java.lang.RuntimeException {
    private final java.lang.String error;
    private final java.lang.String input;

    public int getIndex() {
        return -1;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PatternSyntaxException(java.lang.String str, java.lang.String str2) {
        super(r0.toString());
        java.lang.StringBuilder sb = new java.lang.StringBuilder("error parsing regexp: ");
        sb.append(str);
        sb.append(": `");
        sb.append(str2);
        sb.append("`");
        this.error = str;
        this.input = str2;
    }

    public PatternSyntaxException(java.lang.String str) {
        super("error parsing regexp: ".concat(java.lang.String.valueOf(str)));
        this.error = str;
        this.input = "";
    }

    public java.lang.String getDescription() {
        return this.error;
    }

    public java.lang.String getPattern() {
        return this.input;
    }
}
