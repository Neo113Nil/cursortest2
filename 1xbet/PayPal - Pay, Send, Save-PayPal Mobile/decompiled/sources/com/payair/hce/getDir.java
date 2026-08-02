package com.payair.hce;

/* loaded from: classes4.dex */
public class getDir extends com.payair.hce.fileList {
    private static int valueOf = 1;
    private static int values;

    public getDir(java.lang.String str, java.lang.String str2) {
        super(str, str2);
    }

    public getDir(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        super(str, str2, str3, str4);
    }

    @Override // com.payair.hce.fileList
    public java.lang.String toString() {
        int i = values;
        int i2 = ((i ^ 31) | (i & 31)) << 1;
        int i3 = -((i & (-32)) | ((~i) & 31));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        valueOf = i4 % 128;
        if (i4 % 2 != 0) {
            return "getDir";
        }
        throw null;
    }
}
