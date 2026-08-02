package org.slf4j.helpers;

/* loaded from: classes18.dex */
public final class MessageFormatter {
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
            int indexOf = str.indexOf("{}", i3);
            if (indexOf == -1) {
                if (i3 == 0) {
                    return new org.slf4j.helpers.FormattingTuple(str, objArr, th);
                }
                sb.append((java.lang.CharSequence) str, i3, str.length());
                return new org.slf4j.helpers.FormattingTuple(sb.toString(), objArr, th);
            }
            if (indexOf == 0 || str.charAt(indexOf - 1) != '\\') {
                sb.append((java.lang.CharSequence) str, i3, indexOf);
                getHighSpeedVideoFpsRanges(sb, objArr[i2], new java.util.HashMap());
            } else if (indexOf < 2 || str.charAt(indexOf - 2) != '\\') {
                i2--;
                sb.append((java.lang.CharSequence) str, i3, indexOf - 1);
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_OBJ);
                i = indexOf + 1;
                i3 = i;
                i2++;
            } else {
                sb.append((java.lang.CharSequence) str, i3, indexOf - 1);
                getHighSpeedVideoFpsRanges(sb, objArr[i2], new java.util.HashMap());
            }
            i = indexOf + 2;
            i3 = i;
            i2++;
        }
        sb.append((java.lang.CharSequence) str, i3, str.length());
        return new org.slf4j.helpers.FormattingTuple(sb.toString(), objArr, th);
    }

    private static void getHighSpeedVideoFpsRanges(java.lang.StringBuilder sb, java.lang.Object obj, java.util.Map<java.lang.Object[], java.lang.Object> map) {
        if (obj == null) {
            sb.append("null");
            return;
        }
        if (!obj.getClass().isArray()) {
            getHighResolutionOutputSizeshNQ4ISI(sb, obj);
            return;
        }
        if (obj instanceof boolean[]) {
            getHighSpeedVideoFpsRanges(sb, (boolean[]) obj);
            return;
        }
        if (obj instanceof byte[]) {
            getHighSpeedVideoFpsRanges(sb, (byte[]) obj);
            return;
        }
        if (obj instanceof char[]) {
            getHighSpeedVideoSizes(sb, (char[]) obj);
            return;
        }
        if (obj instanceof short[]) {
            getHighSpeedVideoSizes(sb, (short[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            getHighSpeedVideoSizes(sb, (int[]) obj);
            return;
        }
        if (obj instanceof long[]) {
            getHighSpeedVideoSizes(sb, (long[]) obj);
            return;
        }
        if (obj instanceof float[]) {
            getHighSpeedVideoFpsRanges(sb, (float[]) obj);
        } else if (obj instanceof double[]) {
            getHighResolutionOutputSizeshNQ4ISI(sb, (double[]) obj);
        } else {
            getHighResolutionOutputSizeshNQ4ISI(sb, (java.lang.Object[]) obj, map);
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.StringBuilder sb, java.lang.Object obj) {
        try {
            sb.append(obj.toString());
        } catch (java.lang.Throwable th) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Failed toString() invocation on an object of type [");
            sb2.append(obj.getClass().getName());
            sb2.append("]");
            org.slf4j.helpers.Reporter.error(sb2.toString(), th);
            sb.append("[FAILED toString()]");
        }
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.StringBuilder sb, java.lang.Object[] objArr, java.util.Map<java.lang.Object[], java.lang.Object> map) {
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST);
        if (!map.containsKey(objArr)) {
            map.put(objArr, null);
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                getHighSpeedVideoFpsRanges(sb, objArr[i], map);
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

    private static void getHighSpeedVideoFpsRanges(java.lang.StringBuilder sb, boolean[] zArr) {
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

    private static void getHighSpeedVideoFpsRanges(java.lang.StringBuilder sb, byte[] bArr) {
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

    private static void getHighSpeedVideoSizes(java.lang.StringBuilder sb, char[] cArr) {
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

    private static void getHighSpeedVideoSizes(java.lang.StringBuilder sb, short[] sArr) {
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

    private static void getHighSpeedVideoSizes(java.lang.StringBuilder sb, int[] iArr) {
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

    private static void getHighSpeedVideoSizes(java.lang.StringBuilder sb, long[] jArr) {
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

    private static void getHighSpeedVideoFpsRanges(java.lang.StringBuilder sb, float[] fArr) {
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

    private static void getHighResolutionOutputSizeshNQ4ISI(java.lang.StringBuilder sb, double[] dArr) {
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
