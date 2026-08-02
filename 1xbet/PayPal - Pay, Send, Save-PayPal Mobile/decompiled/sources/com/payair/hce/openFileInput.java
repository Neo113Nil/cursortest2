package com.payair.hce;

/* loaded from: classes4.dex */
public final class openFileInput extends com.payair.hce.deleteFile {
    private static int valueOf = 1;
    private static int writeReplace;

    @com.payair.hce.setSelectionFromTop(valueOf = "taskId")
    private java.lang.String values;

    public static /* synthetic */ java.lang.Object DigitizedCardProfile(java.lang.Object[] objArr, int i, int i2, int i3) {
        int i4 = ~i2;
        int i5 = ~(i3 | i2);
        if ((i * (-391)) + (i2 * (-195)) + (((~(i4 | i)) | i5) * (-196)) + ((i2 | i) * my.com.softspace.reader.internal.kernelconfig.EmvConstants.EMV_READER_CURRENCY_CODE_JPY) + (((~((~i) | i4)) | i5) * com.plaid.internal.EnumC0527g.SDK_ASSET_ICON_ARROW_DOWN_VALUE) != 1) {
            return values(objArr);
        }
        com.payair.hce.openFileInput openfileinput = (com.payair.hce.openFileInput) objArr[0];
        int i6 = writeReplace;
        valueOf = (i6 + 59) % 128;
        java.lang.String str = openfileinput.values;
        int i7 = i6 & 11;
        valueOf = (i7 + ((i6 ^ 11) | i7)) % 128;
        return str;
    }

    private static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr) {
        com.payair.hce.openFileInput openfileinput = (com.payair.hce.openFileInput) objArr[0];
        int i = valueOf;
        int i2 = (i ^ 83) + ((i & 83) << 1);
        writeReplace = i2 % 128;
        java.lang.Class<?> cls = openfileinput.getClass();
        if (i2 % 2 == 0) {
            return cls.getSimpleName();
        }
        throw null;
    }

    public final java.lang.String writeReplace() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, 519602806, -519602805, java.lang.System.identityHashCode(this));
    }

    public final java.lang.String toString() {
        return (java.lang.String) DigitizedCardProfile(new java.lang.Object[]{this}, -1496407871, 1496407871, java.lang.System.identityHashCode(this));
    }
}
