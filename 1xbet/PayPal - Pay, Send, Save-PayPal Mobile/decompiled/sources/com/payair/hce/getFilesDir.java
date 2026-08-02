package com.payair.hce;

/* loaded from: classes4.dex */
public final class getFilesDir extends com.payair.hce.deleteFile {
    private static int valueOf = 1;
    private static int writeReplace;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        com.payair.hce.getFilesDir getfilesdir = (com.payair.hce.getFilesDir) objArr[0];
        int i4 = valueOf;
        int i5 = (i4 & (-30)) | ((~i4) & 29);
        int i6 = (i4 & 29) << 1;
        writeReplace = ((i5 & i6) + (i6 | i5)) % 128;
        java.lang.String simpleName = getfilesdir.getClass().getSimpleName();
        int i7 = writeReplace;
        int i8 = i7 & 109;
        int i9 = ((i7 ^ 109) | i8) << 1;
        int i10 = -((i7 | 109) & (~i8));
        valueOf = (((i9 | i10) << 1) - (i10 ^ i9)) % 128;
        return simpleName;
    }

    public getFilesDir(java.lang.String str) {
        super(str);
    }

    public final java.lang.String toString() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 232372870, -232372870, java.lang.System.identityHashCode(this));
    }
}
