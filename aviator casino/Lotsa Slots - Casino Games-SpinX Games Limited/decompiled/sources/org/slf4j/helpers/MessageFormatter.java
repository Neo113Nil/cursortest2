package org.slf4j.helpers;

/* loaded from: classes6.dex */
public final class MessageFormatter {
    static final char DELIM_START = '{';
    static final char DELIM_STOP = '}';
    static final java.lang.String DELIM_STR = "{}";
    private static final char ESCAPE_CHAR = '\\';

    public static final org.slf4j.helpers.FormattingTuple format(java.lang.String str, java.lang.Object obj) {
        return arrayFormat(str, new java.lang.Object[]{obj});
    }

    public static final org.slf4j.helpers.FormattingTuple format(java.lang.String str, java.lang.Object obj, java.lang.Object obj2) {
        return arrayFormat(str, new java.lang.Object[]{obj, obj2});
    }

    public static final org.slf4j.helpers.FormattingTuple arrayFormat(java.lang.String str, java.lang.Object[] objArr) {
        java.lang.Throwable throwableCandidate = getThrowableCandidate(objArr);
        if (throwableCandidate != null) {
            objArr = trimmedCopy(objArr);
        }
        return arrayFormat(str, objArr, throwableCandidate);
    }

    public static final java.lang.String basicArrayFormat(java.lang.String str, java.lang.Object[] objArr) {
        return arrayFormat(str, objArr, null).getMessage();
    }

    public static java.lang.String basicArrayFormat(org.slf4j.helpers.NormalizedParameters normalizedParameters) {
        return basicArrayFormat(normalizedParameters.getMessage(), normalizedParameters.getArguments());
    }

    public static final org.slf4j.helpers.FormattingTuple arrayFormat(java.lang.String str, java.lang.Object[] objArr, java.lang.Throwable th) {
        int i;
        if (str == null) {
            return new org.slf4j.helpers.FormattingTuple(null, objArr, th);
        }
        if (objArr == null) {
            return new org.slf4j.helpers.FormattingTuple(str);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length() + 50);
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr.length) {
            int indexOf = str.indexOf(DELIM_STR, i3);
            if (indexOf == -1) {
                if (i3 == 0) {
                    return new org.slf4j.helpers.FormattingTuple(str, objArr, th);
                }
                sb.append((java.lang.CharSequence) str, i3, str.length());
                return new org.slf4j.helpers.FormattingTuple(sb.toString(), objArr, th);
            }
            if (isEscapedDelimeter(str, indexOf)) {
                if (!isDoubleEscaped(str, indexOf)) {
                    i2--;
                    sb.append((java.lang.CharSequence) str, i3, indexOf - 1);
                    sb.append('{');
                    i = indexOf + 1;
                    i3 = i;
                    i2++;
                } else {
                    sb.append((java.lang.CharSequence) str, i3, indexOf - 1);
                    deeplyAppendParameter(sb, objArr[i2], new java.util.HashMap());
                }
            } else {
                sb.append((java.lang.CharSequence) str, i3, indexOf);
                deeplyAppendParameter(sb, objArr[i2], new java.util.HashMap());
            }
            i = indexOf + 2;
            i3 = i;
            i2++;
        }
        sb.append((java.lang.CharSequence) str, i3, str.length());
        return new org.slf4j.helpers.FormattingTuple(sb.toString(), objArr, th);
    }

    static final boolean isEscapedDelimeter(java.lang.String str, int i) {
        return i != 0 && str.charAt(i - 1) == '\\';
    }

    static final boolean isDoubleEscaped(java.lang.String str, int i) {
        return i >= 2 && str.charAt(i - 2) == '\\';
    }

    private static void deeplyAppendParameter(java.lang.StringBuilder sb, java.lang.Object obj, java.util.Map<java.lang.Object[], java.lang.Object> map) {
        if (obj == null) {
            sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.NULL);
            return;
        }
        if (!obj.getClass().isArray()) {
            safeObjectAppend(sb, obj);
            return;
        }
        if (obj instanceof boolean[]) {
            booleanArrayAppend(sb, (boolean[]) obj);
            return;
        }
        if (obj instanceof byte[]) {
            byteArrayAppend(sb, (byte[]) obj);
            return;
        }
        if (obj instanceof char[]) {
            charArrayAppend(sb, (char[]) obj);
            return;
        }
        if (obj instanceof short[]) {
            shortArrayAppend(sb, (short[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            intArrayAppend(sb, (int[]) obj);
            return;
        }
        if (obj instanceof long[]) {
            longArrayAppend(sb, (long[]) obj);
            return;
        }
        if (obj instanceof float[]) {
            floatArrayAppend(sb, (float[]) obj);
        } else if (obj instanceof double[]) {
            doubleArrayAppend(sb, (double[]) obj);
        } else {
            objectArrayAppend(sb, (java.lang.Object[]) obj, map);
        }
    }

    private static void safeObjectAppend(java.lang.StringBuilder sb, java.lang.Object obj) {
        try {
            sb.append(obj.toString());
        } catch (java.lang.Throwable th) {
            org.slf4j.helpers.Util.report("SLF4J: Failed toString() invocation on an object of type [" + obj.getClass().getName() + com.ironsource.X3.j.e, th);
            sb.append("[FAILED toString()]");
        }
    }

    private static void objectArrayAppend(java.lang.StringBuilder sb, java.lang.Object[] objArr, java.util.Map<java.lang.Object[], java.lang.Object> map) {
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        if (!map.containsKey(objArr)) {
            map.put(objArr, null);
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                deeplyAppendParameter(sb, objArr[i], map);
                if (i != length - 1) {
                    sb.append(", ");
                }
            }
            map.remove(objArr);
        } else {
            sb.append("...");
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
    }

    private static void booleanArrayAppend(java.lang.StringBuilder sb, boolean[] zArr) {
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(zArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
    }

    private static void byteArrayAppend(java.lang.StringBuilder sb, byte[] bArr) {
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            sb.append((int) bArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
    }

    private static void charArrayAppend(java.lang.StringBuilder sb, char[] cArr) {
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(cArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
    }

    private static void shortArrayAppend(java.lang.StringBuilder sb, short[] sArr) {
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            sb.append((int) sArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
    }

    private static void intArrayAppend(java.lang.StringBuilder sb, int[] iArr) {
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(iArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
    }

    private static void longArrayAppend(java.lang.StringBuilder sb, long[] jArr) {
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(jArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
    }

    private static void floatArrayAppend(java.lang.StringBuilder sb, float[] fArr) {
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(fArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
    }

    private static void doubleArrayAppend(java.lang.StringBuilder sb, double[] dArr) {
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            sb.append(dArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
    }

    public static java.lang.Throwable getThrowableCandidate(java.lang.Object[] objArr) {
        return org.slf4j.helpers.NormalizedParameters.getThrowableCandidate(objArr);
    }

    public static java.lang.Object[] trimmedCopy(java.lang.Object[] objArr) {
        return org.slf4j.helpers.NormalizedParameters.trimmedCopy(objArr);
    }
}
