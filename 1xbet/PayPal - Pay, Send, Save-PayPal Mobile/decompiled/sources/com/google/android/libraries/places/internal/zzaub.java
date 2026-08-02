package com.google.android.libraries.places.internal;

/* loaded from: classes8.dex */
public final class zzaub {
    public static boolean zza(int i) {
        return i <= 126 ? i >= 32 || i == 10 || i == 13 || i == 9 || i == 12 : i < 55296 ? i >= 160 : i < 64976 ? i > 57343 : i > 65007 && (i & org.apache.commons.imaging.formats.jpeg.JpegConstants.COM_MARKER) != 65534 && i <= 1114111;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0021 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static java.lang.String zzb(java.lang.String str, int i) {
        int length;
        int length2 = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i3 != length2) {
            char charAt = str.charAt(i3);
            if (charAt <= '~') {
                if (charAt >= ' ') {
                    i3++;
                }
                if (charAt < 55296) {
                    if (charAt > 57343) {
                        if (charAt >= 64976) {
                            if (charAt > 65007) {
                                if (charAt >= 65534) {
                                }
                            }
                        }
                        i3++;
                    } else {
                        int codePointAt = java.lang.Character.codePointAt(str, i3);
                        if (codePointAt >= 65536 && (codePointAt & org.apache.commons.imaging.formats.jpeg.JpegConstants.COM_MARKER) != 65534) {
                            i3 += 2;
                        }
                    }
                    length = str.length();
                    java.lang.StringBuilder sb = new java.lang.StringBuilder(length);
                    while (i2 < length) {
                    }
                    return sb.toString();
                }
                if (charAt != '\n' && charAt != '\r' && charAt != '\t' && charAt != '\f') {
                    length = str.length();
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder(length);
                    while (i2 < length) {
                        char charAt2 = str.charAt(i2);
                        if (zza(charAt2)) {
                            sb2.append(charAt2);
                            i2++;
                        } else {
                            int codePointAt2 = java.lang.Character.codePointAt(str, i2);
                            sb2.appendCodePoint(true != zza(codePointAt2) ? 65533 : codePointAt2);
                            i2 += java.lang.Character.charCount(codePointAt2);
                        }
                    }
                    return sb2.toString();
                }
                i3++;
            } else {
                if (charAt < 55296 && charAt >= 160) {
                    i3++;
                }
                if (charAt < 55296) {
                }
            }
        }
        return str;
    }
}
