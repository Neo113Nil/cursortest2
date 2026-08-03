package org.slf4j.helpers;

/* loaded from: classes6.dex */
public class FormattingTuple {
    public static org.slf4j.helpers.FormattingTuple NULL = new org.slf4j.helpers.FormattingTuple(null);
    private final java.lang.Object[] argArray;
    private final java.lang.String message;
    private final java.lang.Throwable throwable;

    public FormattingTuple(java.lang.String str) {
        this(str, null, null);
    }

    public FormattingTuple(java.lang.String str, java.lang.Object[] objArr, java.lang.Throwable th) {
        this.message = str;
        this.throwable = th;
        this.argArray = objArr;
    }

    public java.lang.String getMessage() {
        return this.message;
    }

    public java.lang.Object[] getArgArray() {
        return this.argArray;
    }

    public java.lang.Throwable getThrowable() {
        return this.throwable;
    }
}
