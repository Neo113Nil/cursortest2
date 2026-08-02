package com.payair.hce;

/* loaded from: classes4.dex */
public class getOpenHelper extends java.lang.Exception {
    private static int valueOf = 0;
    private static int values = 1;
    private java.lang.Throwable writeReplace;

    public getOpenHelper() {
    }

    public getOpenHelper(java.lang.String str) {
        super(str);
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
        int i = values;
        int i2 = i & 11;
        int i3 = (i ^ 11) | i2;
        valueOf = ((i2 ^ i3) + ((i3 & i2) << 1)) % 128;
        java.lang.Throwable th = this.writeReplace;
        values = (((r2 ^ 7) - (~(-(-((r2 & 7) << 1))))) - 1) % 128;
        return th;
    }
}
