package com.payair.hce;

/* loaded from: classes4.dex */
public class databaseList extends com.payair.hce.fileList {
    private static int DigitizedCardProfile = 1;
    private static int values;
    private java.util.List<com.payair.hce.isNetworkError> valueOf;

    public static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr, int i, int i2, int i3) {
        return writeReplace(objArr);
    }

    public databaseList(java.lang.String str, java.lang.String str2, java.util.List<com.payair.hce.isNetworkError> list) {
        super(str, str2);
        this.valueOf = list;
    }

    public databaseList(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        super(str, str2, str3, str4);
    }

    private static /* synthetic */ java.lang.Object writeReplace(java.lang.Object[] objArr) {
        com.payair.hce.databaseList databaselist = (com.payair.hce.databaseList) objArr[0];
        int i = values;
        int i2 = i & 13;
        int i3 = (i2 + ((i ^ 13) | i2)) % 128;
        DigitizedCardProfile = i3;
        java.util.List<com.payair.hce.isNetworkError> list = databaselist.valueOf;
        int i4 = (i3 ^ 27) + ((i3 & 27) << 1);
        values = i4 % 128;
        if (i4 % 2 == 0) {
            return list;
        }
        throw new java.lang.ArithmeticException();
    }

    @Override // com.payair.hce.fileList
    public java.lang.String toString() {
        int i = values;
        int i2 = (((i | 33) << 1) - (~(-((i & (-34)) | ((~i) & 33))))) - 1;
        DigitizedCardProfile = i2 % 128;
        if (i2 % 2 != 0) {
            return "databaseList";
        }
        throw new java.lang.ArithmeticException();
    }

    public final java.util.List<com.payair.hce.isNetworkError> values() {
        return (java.util.List) writeReplace(new java.lang.Object[]{this}, -524184704, 524184704, java.lang.System.identityHashCode(this));
    }
}
