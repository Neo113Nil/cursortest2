package org.bouncycastle.util;

/* loaded from: classes17.dex */
public final class Strings {
    private static java.lang.String getHighSpeedVideoFpsRanges;

    static class StringListImpl extends java.util.ArrayList<java.lang.String> implements org.bouncycastle.util.StringList {
        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ void add(int i, java.lang.Object obj) {
            super.add(i, (java.lang.String) obj);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object set(int i, java.lang.Object obj) {
            return (java.lang.String) super.set(i, (java.lang.String) obj);
        }

        @Override // org.bouncycastle.util.StringList
        public java.lang.String[] toStringArray(int i, int i2) {
            java.lang.String[] strArr = new java.lang.String[i2 - i];
            for (int i3 = i; i3 != size() && i3 != i2; i3++) {
                strArr[i3 - i] = get(i3);
            }
            return strArr;
        }

        @Override // org.bouncycastle.util.StringList
        public java.lang.String[] toStringArray() {
            int size = size();
            java.lang.String[] strArr = new java.lang.String[size];
            for (int i = 0; i != size; i++) {
                strArr[i] = get(i);
            }
            return strArr;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List, org.bouncycastle.util.StringList
        public /* bridge */ /* synthetic */ java.lang.String get(int i) {
            return (java.lang.String) super.get(i);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(java.lang.String str) {
            return super.add((org.bouncycastle.util.Strings.StringListImpl) str);
        }

        /* synthetic */ StringListImpl(byte b) {
            this();
        }

        private StringListImpl() {
        }
    }

    public static java.lang.String toUpperCase(java.lang.String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) (c - ' ');
                z = true;
            }
        }
        return z ? new java.lang.String(charArray) : str;
    }

    public static byte[] toUTF8ByteArray(char[] cArr) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            toUTF8ByteArray(cArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (java.io.IOException unused) {
            throw new java.lang.IllegalStateException("cannot encode string to byte array!");
        }
    }

    public static byte[] toUTF8ByteArray(java.lang.String str) {
        return toUTF8ByteArray(str.toCharArray());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void toUTF8ByteArray(char[] cArr, java.io.OutputStream outputStream) throws java.io.IOException {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 0;
        while (i5 < cArr.length) {
            char c = cArr[i5];
            if (c >= 128) {
                if (c < 2048) {
                    i3 = (c >> 6) | 192;
                    i4 = c;
                } else {
                    if (c < 55296 || c > 57343) {
                        i = (c >> 12) | 224;
                        i2 = c;
                    } else {
                        i5++;
                        if (i5 >= cArr.length) {
                            throw new java.lang.IllegalStateException("invalid UTF-16 codepoint");
                        }
                        char c2 = cArr[i5];
                        if (c > 56319) {
                            throw new java.lang.IllegalStateException("invalid UTF-16 codepoint");
                        }
                        int i6 = (((c & 1023) << 10) | (c2 & 1023)) + 65536;
                        outputStream.write((i6 >> 18) | com.plaid.internal.EnumC0527g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
                        i = ((i6 >> 12) & 63) | 128;
                        i2 = i6;
                    }
                    outputStream.write(i);
                    i3 = ((i2 >> 6) & 63) | 128;
                    i4 = i2;
                }
                outputStream.write(i3);
                c = (i4 & 63) | 128;
            }
            outputStream.write(c);
            i5++;
        }
    }

    public static java.lang.String toLowerCase(java.lang.String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) (c + ' ');
                z = true;
            }
        }
        return z ? new java.lang.String(charArray) : str;
    }

    public static byte[] toByteArray(char[] cArr) {
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) cArr[i];
        }
        return bArr;
    }

    public static byte[] toByteArray(java.lang.String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    public static int toByteArray(java.lang.String str, byte[] bArr, int i) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i + i2] = (byte) str.charAt(i2);
        }
        return length;
    }

    public static java.lang.String[] split(java.lang.String str, char c) {
        int i;
        java.util.Vector vector = new java.util.Vector();
        boolean z = true;
        while (true) {
            if (!z) {
                break;
            }
            int indexOf = str.indexOf(c);
            if (indexOf > 0) {
                vector.addElement(str.substring(0, indexOf));
                str = str.substring(indexOf + 1);
            } else {
                vector.addElement(str);
                z = false;
            }
        }
        int size = vector.size();
        java.lang.String[] strArr = new java.lang.String[size];
        for (i = 0; i != size; i++) {
            strArr[i] = (java.lang.String) vector.elementAt(i);
        }
        return strArr;
    }

    public static org.bouncycastle.util.StringList newList() {
        return new org.bouncycastle.util.Strings.StringListImpl((byte) 0);
    }

    public static java.lang.String lineSeparator() {
        return getHighSpeedVideoFpsRanges;
    }

    public static java.lang.String fromUTF8ByteArray(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int transcodeToUTF16 = org.bouncycastle.util.encoders.UTF8.transcodeToUTF16(bArr, cArr);
        if (transcodeToUTF16 >= 0) {
            return new java.lang.String(cArr, 0, transcodeToUTF16);
        }
        throw new java.lang.IllegalArgumentException("Invalid UTF-8 input");
    }

    public static java.lang.String fromByteArray(byte[] bArr) {
        return new java.lang.String(asCharArray(bArr));
    }

    public static boolean constantTimeAreEqual(java.lang.String str, java.lang.String str2) {
        boolean z = str.length() == str2.length();
        int length = str.length();
        for (int i = 0; i != length; i++) {
            z &= str.charAt(i) == str2.charAt(i);
        }
        return z;
    }

    public static char[] asCharArray(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return cArr;
    }

    static {
        try {
            try {
                getHighSpeedVideoFpsRanges = (java.lang.String) java.security.AccessController.doPrivileged(new java.security.PrivilegedAction<java.lang.String>() { // from class: org.bouncycastle.util.Strings.1
                    @Override // java.security.PrivilegedAction
                    public final /* synthetic */ java.lang.String run() {
                        return java.lang.System.getProperty("line.separator");
                    }
                });
            } catch (java.lang.Exception unused) {
                getHighSpeedVideoFpsRanges = java.lang.String.format("%n", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception unused2) {
            getHighSpeedVideoFpsRanges = com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE;
        }
    }
}
