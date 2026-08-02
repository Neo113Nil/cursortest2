package com.google.android.gms.common.server.response;

/* loaded from: classes8.dex */
public class FastParser<T extends com.google.android.gms.common.server.response.FastJsonResponse> {
    private static final char[] zaa = {kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, 'l', 'l'};
    private static final char[] zab = {'r', kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, 'e'};
    private static final char[] zac = {'r', kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, 'e', '\"'};
    private static final char[] zad = {'a', 'l', io.ktor.util.date.GMTDateParser.SECONDS, 'e'};
    private static final char[] zae = {'a', 'l', io.ktor.util.date.GMTDateParser.SECONDS, 'e', '\"'};
    private static final char[] zaf = {'\n'};
    private static final com.google.android.gms.common.server.response.zai zag = new com.google.android.gms.common.server.response.zaa();
    private static final com.google.android.gms.common.server.response.zai zah = new com.google.android.gms.common.server.response.zab();
    private static final com.google.android.gms.common.server.response.zai zai = new com.google.android.gms.common.server.response.zac();
    private static final com.google.android.gms.common.server.response.zai zaj = new com.google.android.gms.common.server.response.zad();
    private static final com.google.android.gms.common.server.response.zai zak = new com.google.android.gms.common.server.response.zae();
    private static final com.google.android.gms.common.server.response.zai zal = new com.google.android.gms.common.server.response.zaf();
    private static final com.google.android.gms.common.server.response.zai zam = new com.google.android.gms.common.server.response.zag();
    private static final com.google.android.gms.common.server.response.zai zan = new com.google.android.gms.common.server.response.zah();
    private final char[] zao = new char[1];
    private final char[] zap = new char[32];
    private final char[] zaq = new char[1024];
    private final java.lang.StringBuilder zar = new java.lang.StringBuilder(32);
    private final java.lang.StringBuilder zas = new java.lang.StringBuilder(1024);
    private final java.util.Stack zat = new java.util.Stack();

    public static class ParseException extends java.lang.Exception {
        public ParseException(java.lang.String str) {
            super(str);
        }

        public ParseException(java.lang.String str, java.lang.Throwable th) {
            super("Error instantiating inner object", th);
        }

        public ParseException(java.lang.Throwable th) {
            super(th);
        }
    }

    private static final java.lang.String zaA(java.io.BufferedReader bufferedReader, char[] cArr, java.lang.StringBuilder sb, char[] cArr2) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        sb.setLength(0);
        bufferedReader.mark(cArr.length);
        boolean z = false;
        boolean z2 = false;
        loop0: while (true) {
            int read = bufferedReader.read(cArr);
            if (read == -1) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF while parsing string");
            }
            int i = 0;
            while (i < read) {
                char c = cArr[i];
                if (!java.lang.Character.isISOControl(c) || (cArr2 != null && cArr2[0] == c)) {
                    int i2 = i + 1;
                    if (c == '\"') {
                        if (!z2) {
                            sb.append(cArr, 0, i);
                            bufferedReader.reset();
                            bufferedReader.skip(i2);
                            return z ? com.google.android.gms.common.util.JsonUtils.unescapeString(sb.toString()) : sb.toString();
                        }
                    } else if (c == '\\') {
                        z2 = !z2;
                        z = true;
                        i = i2;
                    }
                    z2 = false;
                    i = i2;
                }
            }
            sb.append(cArr, 0, read);
            bufferedReader.mark(cArr.length);
        }
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading string");
    }

    private final char zai(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        if (bufferedReader.read(this.zao) != -1) {
            while (java.lang.Character.isWhitespace(this.zao[0])) {
                if (bufferedReader.read(this.zao) == -1) {
                }
            }
            return this.zao[0];
        }
        return (char) 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final double zaj(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0.0d;
        }
        return java.lang.Double.parseDouble(new java.lang.String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float zak(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0.0f;
        }
        return java.lang.Float.parseFloat(new java.lang.String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int zal(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int i;
        int i2;
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0;
        }
        char[] cArr = this.zaq;
        if (zam2 <= 0) {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("No number to parse");
        }
        char c = cArr[0];
        int i3 = c == '-' ? Integer.MIN_VALUE : androidx.media3.common.C.RATE_UNSET_INT;
        int i4 = c == '-' ? 1 : 0;
        if (i4 < zam2) {
            i2 = i4 + 1;
            int digit = java.lang.Character.digit(cArr[i4], 10);
            if (digit < 0) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected non-digit character");
            }
            i = -digit;
        } else {
            i = 0;
            i2 = i4;
        }
        while (i2 < zam2) {
            int digit2 = java.lang.Character.digit(cArr[i2], 10);
            if (digit2 < 0) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected non-digit character");
            }
            if (i < -214748364) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Number too large");
            }
            int i5 = i * 10;
            if (i5 < i3 + digit2) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Number too large");
            }
            i = i5 - digit2;
            i2++;
        }
        if (i4 == 0) {
            return -i;
        }
        if (i2 > 1) {
            return i;
        }
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("No digits to parse");
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final int zam(java.io.BufferedReader bufferedReader, char[] cArr) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int i;
        char zai2 = zai(bufferedReader);
        if (zai2 == 0) {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF");
        }
        if (zai2 == ',') {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Missing value");
        }
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            return 0;
        }
        bufferedReader.mark(1024);
        if (zai2 == '\"') {
            i = 0;
            boolean z = false;
            while (i < 1024 && bufferedReader.read(cArr, i, 1) != -1) {
                char c = cArr[i];
                if (java.lang.Character.isISOControl(c)) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading string");
                }
                int i2 = i + 1;
                if (c == '\"') {
                    if (!z) {
                        bufferedReader.reset();
                        bufferedReader.skip(i2);
                        return i;
                    }
                } else if (c == '\\') {
                    z = !z;
                    i = i2;
                }
                z = false;
                i = i2;
            }
        } else {
            cArr[0] = zai2;
            i = 1;
            while (i < 1024 && bufferedReader.read(cArr, i, 1) != -1) {
                char c2 = cArr[i];
                if (c2 == '}' || c2 == ',' || java.lang.Character.isWhitespace(c2) || cArr[i] == ']') {
                    bufferedReader.reset();
                    bufferedReader.skip(i - 1);
                    cArr[i] = 0;
                    return i;
                }
                i++;
            }
        }
        if (i == 1024) {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Absurdly long value");
        }
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zan(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        long j;
        int i;
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return 0L;
        }
        char[] cArr = this.zaq;
        if (zam2 <= 0) {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("No number to parse");
        }
        char c = cArr[0];
        long j2 = c == '-' ? Long.MIN_VALUE : androidx.media3.common.C.TIME_UNSET;
        int i2 = c == '-' ? 1 : 0;
        if (i2 < zam2) {
            i = i2 + 1;
            int digit = java.lang.Character.digit(cArr[i2], 10);
            if (digit < 0) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected non-digit character");
            }
            j = -digit;
        } else {
            j = 0;
            i = i2;
        }
        while (i < zam2) {
            int digit2 = java.lang.Character.digit(cArr[i], 10);
            if (digit2 < 0) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected non-digit character");
            }
            if (j < -922337203685477580L) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Number too large");
            }
            long j3 = j * 10;
            int i3 = zam2;
            long j4 = digit2;
            if (j3 < j2 + j4) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Number too large");
            }
            j = j3 - j4;
            i++;
            zam2 = i3;
        }
        if (i2 == 0) {
            return -j;
        }
        if (i > 1) {
            return j;
        }
        throw new com.google.android.gms.common.server.response.FastParser.ParseException("No digits to parse");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.String zao(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        return zap(bufferedReader, this.zap, this.zar, null);
    }

    private final java.lang.String zap(java.io.BufferedReader bufferedReader, char[] cArr, java.lang.StringBuilder sb, char[] cArr2) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        char zai2 = zai(bufferedReader);
        if (zai2 == '\"') {
            return zaA(bufferedReader, cArr, sb, cArr2);
        }
        if (zai2 != 'n') {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected string");
        }
        zax(bufferedReader, zaa);
        return null;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final java.lang.String zaq(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        this.zat.push(2);
        char zai2 = zai(bufferedReader);
        if (zai2 == '\"') {
            this.zat.push(3);
            java.lang.String zaA = zaA(bufferedReader, this.zap, this.zar, null);
            zaw(3);
            if (zai(bufferedReader) == ':') {
                return zaA;
            }
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected key/value separator");
        }
        if (zai2 == ']') {
            zaw(2);
            zaw(1);
            zaw(5);
            return null;
        }
        if (zai2 == '}') {
            zaw(2);
            return null;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected token: ");
        sb.append(zai2);
        throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb.toString());
    }

    private final java.lang.String zar(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        bufferedReader.mark(1024);
        char zai2 = zai(bufferedReader);
        int i = 1;
        if (zai2 == '\"') {
            if (bufferedReader.read(this.zao) == -1) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF while parsing string");
            }
            char c = this.zao[0];
            boolean z = false;
            do {
                if (c == '\"') {
                    if (z) {
                        z = true;
                        c = '\"';
                    }
                }
                z = c == '\\' ? !z : false;
                if (bufferedReader.read(this.zao) == -1) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF while parsing string");
                }
                c = this.zao[0];
            } while (!java.lang.Character.isISOControl(c));
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading string");
        }
        if (zai2 == ',') {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Missing value");
        }
        if (zai2 == '[') {
            this.zat.push(5);
            bufferedReader.mark(32);
            if (zai(bufferedReader) == ']') {
                zaw(5);
            } else {
                bufferedReader.reset();
                boolean z2 = false;
                boolean z3 = false;
                while (i > 0) {
                    char zai3 = zai(bufferedReader);
                    if (zai3 == 0) {
                        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF while parsing array");
                    }
                    if (java.lang.Character.isISOControl(zai3)) {
                        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected control character while reading array");
                    }
                    if (zai3 == '\"') {
                        if (!z3) {
                            z2 = !z2;
                        }
                        zai3 = '\"';
                    }
                    if (zai3 == '[') {
                        if (!z2) {
                            i++;
                        }
                        zai3 = '[';
                    }
                    if (zai3 == ']' && !z2) {
                        i--;
                    }
                    z3 = (zai3 == '\\' && z2) ? !z3 : false;
                }
                zaw(5);
            }
        } else if (zai2 != '{') {
            bufferedReader.reset();
            zam(bufferedReader, this.zaq);
        } else {
            this.zat.push(1);
            bufferedReader.mark(32);
            char zai4 = zai(bufferedReader);
            if (zai4 == '}') {
                zaw(1);
            } else {
                if (zai4 != '\"') {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected token ");
                    sb.append(zai4);
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb.toString());
                }
                bufferedReader.reset();
                zaq(bufferedReader);
                while (zar(bufferedReader) != null) {
                }
                zaw(1);
            }
        }
        char zai5 = zai(bufferedReader);
        if (zai5 == ',') {
            zaw(2);
            return zaq(bufferedReader);
        }
        if (zai5 == '}') {
            zaw(2);
            return null;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unexpected token ");
        sb2.append(zai5);
        throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.math.BigDecimal zas(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return null;
        }
        return new java.math.BigDecimal(new java.lang.String(this.zaq, 0, zam2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.math.BigInteger zat(java.io.BufferedReader bufferedReader) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int zam2 = zam(bufferedReader, this.zaq);
        if (zam2 == 0) {
            return null;
        }
        return new java.math.BigInteger(new java.lang.String(this.zaq, 0, zam2));
    }

    private final java.util.ArrayList zau(java.io.BufferedReader bufferedReader, com.google.android.gms.common.server.response.zai zaiVar) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        char zai2 = zai(bufferedReader);
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            return null;
        }
        if (zai2 != '[') {
            throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected start of array");
        }
        this.zat.push(5);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (true) {
            bufferedReader.mark(1024);
            char zai3 = zai(bufferedReader);
            if (zai3 == 0) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF");
            }
            if (zai3 != ',') {
                if (zai3 == ']') {
                    zaw(5);
                    return arrayList;
                }
                bufferedReader.reset();
                arrayList.add(zaiVar.zaa(this, bufferedReader));
            }
        }
    }

    private final java.util.ArrayList zav(java.io.BufferedReader bufferedReader, com.google.android.gms.common.server.response.FastJsonResponse.Field field) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        char zai2 = zai(bufferedReader);
        if (zai2 == ']') {
            zaw(5);
            return arrayList;
        }
        if (zai2 == 'n') {
            zax(bufferedReader, zaa);
            zaw(5);
            return null;
        }
        if (zai2 != '{') {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected token: ");
            sb.append(zai2);
            throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb.toString());
        }
        this.zat.push(1);
        while (true) {
            try {
                com.google.android.gms.common.server.response.FastJsonResponse zad2 = field.zad();
                if (!zaz(bufferedReader, zad2)) {
                    return arrayList;
                }
                arrayList.add(zad2);
                char zai3 = zai(bufferedReader);
                if (zai3 != ',') {
                    if (zai3 == ']') {
                        zaw(5);
                        return arrayList;
                    }
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unexpected token: ");
                    sb2.append(zai3);
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb2.toString());
                }
                if (zai(bufferedReader) != '{') {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected start of next object in array");
                }
                this.zat.push(1);
            } catch (java.lang.IllegalAccessException e) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Error instantiating inner object", e);
            } catch (java.lang.InstantiationException e2) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Error instantiating inner object", e2);
            }
        }
    }

    private final void zaw(int i) throws com.google.android.gms.common.server.response.FastParser.ParseException {
        if (this.zat.isEmpty()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected state ");
            sb.append(i);
            sb.append(" but had empty stack");
            throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb.toString());
        }
        int intValue = ((java.lang.Integer) this.zat.pop()).intValue();
        if (intValue == i) {
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Expected state ");
        sb2.append(i);
        sb2.append(" but had ");
        sb2.append(intValue);
        throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb2.toString());
    }

    private final void zax(java.io.BufferedReader bufferedReader, char[] cArr) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int i = 0;
        while (true) {
            int length = cArr.length;
            if (i >= length) {
                return;
            }
            int read = bufferedReader.read(this.zap, 0, length - i);
            if (read == -1) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF");
            }
            for (int i2 = 0; i2 < read; i2++) {
                if (cArr[i2 + i] != this.zap[i2]) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected character");
                }
            }
            i += read;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean zay(java.io.BufferedReader bufferedReader, boolean z) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        while (true) {
            char zai2 = zai(bufferedReader);
            if (zai2 != '\"') {
                if (zai2 == 'f') {
                    zax(bufferedReader, z ? zae : zad);
                    return false;
                }
                if (zai2 == 'n') {
                    zax(bufferedReader, zaa);
                    return false;
                }
                if (zai2 == 't') {
                    zax(bufferedReader, z ? zac : zab);
                    return true;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected token: ");
                sb.append(zai2);
                throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb.toString());
            }
            if (z) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException("No boolean value found in string");
            }
            z = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x024c A[SYNTHETIC] */
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean zaz(java.io.BufferedReader bufferedReader, com.google.android.gms.common.server.response.FastJsonResponse fastJsonResponse) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
        int i;
        java.util.HashMap hashMap;
        char zai2;
        java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> fieldMappings = fastJsonResponse.getFieldMappings();
        java.lang.String zaq = zaq(bufferedReader);
        if (zaq == null) {
            zaw(1);
            return false;
        }
        while (zaq != null) {
            com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> field = fieldMappings.get(zaq);
            if (field == null) {
                zaq = zar(bufferedReader);
            } else {
                this.zat.push(4);
                int i2 = field.zaa;
                switch (i2) {
                    case 0:
                        if (field.zab) {
                            fastJsonResponse.zav(field, zau(bufferedReader, zag));
                        } else {
                            fastJsonResponse.zau(field, zal(bufferedReader));
                        }
                        i = 4;
                        zaw(i);
                        zaw(2);
                        zai2 = zai(bufferedReader);
                        if (zai2 == ',') {
                            zaq = zaq(bufferedReader);
                            break;
                        } else {
                            if (zai2 != '}') {
                                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected end of object or field separator, but found: ");
                                sb.append(zai2);
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb.toString());
                            }
                            zaq = null;
                            break;
                        }
                    case 1:
                        if (field.zab) {
                            fastJsonResponse.zag(field, zau(bufferedReader, zam));
                        } else {
                            fastJsonResponse.zae(field, zat(bufferedReader));
                        }
                        i = 4;
                        zaw(i);
                        zaw(2);
                        zai2 = zai(bufferedReader);
                        if (zai2 == ',') {
                        }
                        break;
                    case 2:
                        if (field.zab) {
                            fastJsonResponse.zay(field, zau(bufferedReader, zah));
                        } else {
                            fastJsonResponse.zax(field, zan(bufferedReader));
                        }
                        i = 4;
                        zaw(i);
                        zaw(2);
                        zai2 = zai(bufferedReader);
                        if (zai2 == ',') {
                        }
                        break;
                    case 3:
                        if (field.zab) {
                            fastJsonResponse.zas(field, zau(bufferedReader, zai));
                        } else {
                            fastJsonResponse.zaq(field, zak(bufferedReader));
                        }
                        i = 4;
                        zaw(i);
                        zaw(2);
                        zai2 = zai(bufferedReader);
                        if (zai2 == ',') {
                        }
                        break;
                    case 4:
                        if (field.zab) {
                            fastJsonResponse.zao(field, zau(bufferedReader, zaj));
                        } else {
                            fastJsonResponse.zam(field, zaj(bufferedReader));
                        }
                        i = 4;
                        zaw(i);
                        zaw(2);
                        zai2 = zai(bufferedReader);
                        if (zai2 == ',') {
                        }
                        break;
                    case 5:
                        if (field.zab) {
                            fastJsonResponse.zac(field, zau(bufferedReader, zan));
                        } else {
                            fastJsonResponse.zaa(field, zas(bufferedReader));
                        }
                        i = 4;
                        zaw(i);
                        zaw(2);
                        zai2 = zai(bufferedReader);
                        if (zai2 == ',') {
                        }
                        break;
                    case 6:
                        if (field.zab) {
                            fastJsonResponse.zaj(field, zau(bufferedReader, zak));
                        } else {
                            fastJsonResponse.zai(field, zay(bufferedReader, false));
                        }
                        i = 4;
                        zaw(i);
                        zaw(2);
                        zai2 = zai(bufferedReader);
                        if (zai2 == ',') {
                        }
                        break;
                    case 7:
                        if (field.zab) {
                            fastJsonResponse.zaC(field, zau(bufferedReader, zal));
                        } else {
                            fastJsonResponse.zaA(field, zao(bufferedReader));
                        }
                        i = 4;
                        zaw(i);
                        zaw(2);
                        zai2 = zai(bufferedReader);
                        if (zai2 == ',') {
                        }
                        break;
                    case 8:
                        fastJsonResponse.zal(field, com.google.android.gms.common.util.Base64Utils.decode(zap(bufferedReader, this.zaq, this.zas, zaf)));
                        i = 4;
                        zaw(i);
                        zaw(2);
                        zai2 = zai(bufferedReader);
                        if (zai2 == ',') {
                        }
                        break;
                    case 9:
                        fastJsonResponse.zal(field, com.google.android.gms.common.util.Base64Utils.decodeUrlSafe(zap(bufferedReader, this.zaq, this.zas, zaf)));
                        i = 4;
                        zaw(i);
                        zaw(2);
                        zai2 = zai(bufferedReader);
                        if (zai2 == ',') {
                        }
                        break;
                    case 10:
                        char zai3 = zai(bufferedReader);
                        if (zai3 == 'n') {
                            zax(bufferedReader, zaa);
                            hashMap = null;
                        } else {
                            if (zai3 != '{') {
                                throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected start of a map object");
                            }
                            this.zat.push(1);
                            hashMap = new java.util.HashMap();
                            while (true) {
                                char zai4 = zai(bufferedReader);
                                if (zai4 == 0) {
                                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Unexpected EOF");
                                }
                                if (zai4 == '\"') {
                                    java.lang.String zaA = zaA(bufferedReader, this.zap, this.zar, null);
                                    if (zai(bufferedReader) != ':') {
                                        throw new com.google.android.gms.common.server.response.FastParser.ParseException("No map value found for key ".concat(java.lang.String.valueOf(zaA)));
                                    }
                                    if (zai(bufferedReader) != '\"') {
                                        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected String value for key ".concat(java.lang.String.valueOf(zaA)));
                                    }
                                    hashMap.put(zaA, zaA(bufferedReader, this.zap, this.zar, null));
                                    char zai5 = zai(bufferedReader);
                                    if (zai5 != ',') {
                                        if (zai5 != '}') {
                                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Unexpected character while parsing string map: ");
                                            sb2.append(zai5);
                                            throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb2.toString());
                                        }
                                        zaw(1);
                                    }
                                } else if (zai4 == '}') {
                                    zaw(1);
                                }
                                i = 4;
                                zaw(i);
                                zaw(2);
                                zai2 = zai(bufferedReader);
                                if (zai2 == ',') {
                                }
                            }
                        }
                        fastJsonResponse.zaB(field, hashMap);
                        i = 4;
                        zaw(i);
                        zaw(2);
                        zai2 = zai(bufferedReader);
                        if (zai2 == ',') {
                        }
                        break;
                    case 11:
                        if (field.zab) {
                            char zai6 = zai(bufferedReader);
                            if (zai6 == 'n') {
                                zax(bufferedReader, zaa);
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, null);
                            } else {
                                this.zat.push(5);
                                if (zai6 != '[') {
                                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected array start");
                                }
                                fastJsonResponse.addConcreteTypeArrayInternal(field, field.zae, zav(bufferedReader, field));
                            }
                        } else {
                            char zai7 = zai(bufferedReader);
                            if (zai7 == 'n') {
                                zax(bufferedReader, zaa);
                                fastJsonResponse.addConcreteTypeInternal(field, field.zae, null);
                            } else {
                                this.zat.push(1);
                                if (zai7 != '{') {
                                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Expected start of object");
                                }
                                try {
                                    com.google.android.gms.common.server.response.FastJsonResponse zad2 = field.zad();
                                    zaz(bufferedReader, zad2);
                                    fastJsonResponse.addConcreteTypeInternal(field, field.zae, zad2);
                                } catch (java.lang.IllegalAccessException e) {
                                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Error instantiating inner object", e);
                                } catch (java.lang.InstantiationException e2) {
                                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("Error instantiating inner object", e2);
                                }
                            }
                        }
                        i = 4;
                        zaw(i);
                        zaw(2);
                        zai2 = zai(bufferedReader);
                        if (zai2 == ',') {
                        }
                        break;
                    default:
                        java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Invalid field type ");
                        sb3.append(i2);
                        throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb3.toString());
                }
            }
        }
        zaw(1);
        return true;
    }

    public void parse(java.io.InputStream inputStream, T t) throws com.google.android.gms.common.server.response.FastParser.ParseException {
        java.io.BufferedReader bufferedReader = new java.io.BufferedReader(new java.io.InputStreamReader(inputStream), 1024);
        try {
            try {
                this.zat.push(0);
                char zai2 = zai(bufferedReader);
                if (zai2 == 0) {
                    throw new com.google.android.gms.common.server.response.FastParser.ParseException("No data to parse");
                }
                if (zai2 == '[') {
                    this.zat.push(5);
                    java.util.Map<java.lang.String, com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?>> fieldMappings = t.getFieldMappings();
                    if (fieldMappings.size() != 1) {
                        throw new com.google.android.gms.common.server.response.FastParser.ParseException("Object array response class must have a single Field");
                    }
                    com.google.android.gms.common.server.response.FastJsonResponse.Field<?, ?> value = fieldMappings.entrySet().iterator().next().getValue();
                    t.addConcreteTypeArrayInternal(value, value.zae, zav(bufferedReader, value));
                } else {
                    if (zai2 != '{') {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unexpected token: ");
                        sb.append(zai2);
                        throw new com.google.android.gms.common.server.response.FastParser.ParseException(sb.toString());
                    }
                    this.zat.push(1);
                    zaz(bufferedReader, t);
                }
                zaw(0);
            } catch (java.io.IOException e) {
                throw new com.google.android.gms.common.server.response.FastParser.ParseException(e);
            }
        } finally {
            try {
                bufferedReader.close();
            } catch (java.io.IOException unused) {
            }
        }
    }
}
