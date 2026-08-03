package io.ktor.http;

/* compiled from: Codecs.kt */
@kotlin.Metadata(d1 = {"\u0000T\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\b\u001a3\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\r\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\n\u001a\u001b\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0017\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\n\u001a=\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00012\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u001c\u0010\u001d\u001a3\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u001e\u0010\u001f\u001a7\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b \u0010\u001d\u001a?\u0010#\u001a\u00020\u0000*\u00020!2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b#\u0010$\u001a\u0013\u0010\u0015\u001a\u00020\u0000*\u00020%H\u0002¢\u0006\u0004\b\u0015\u0010&\u001a\u0017\u0010(\u001a\u00020\u00182\u0006\u0010'\u001a\u00020\u0013H\u0002¢\u0006\u0004\b(\u0010)\u001a\u0017\u0010+\u001a\u00020\u00132\u0006\u0010*\u001a\u00020\u0018H\u0002¢\u0006\u0004\b+\u0010,\u001a'\u00101\u001a\u00020/*\u00020-2\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020/0.H\u0002¢\u0006\u0004\b1\u00102\"\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020%0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104\"\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00104\"\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00104\"\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020%078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109\"\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00104\" \u0010;\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0000X\u0080\u0004¢\u0006\f\n\u0004\b;\u00104\u001a\u0004\b<\u0010=\"\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020%078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00109¨\u0006?"}, d2 = {"", "", "encodeFull", "spaceToPlus", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charset", "encodeURLQueryComponent", "(Ljava/lang/String;ZZLjava/nio/charset/Charset;)Ljava/lang/String;", "encodeURLPathPart", "(Ljava/lang/String;)Ljava/lang/String;", "encodeSlash", "encodeEncoded", "encodeURLPath", "(Ljava/lang/String;ZZ)Ljava/lang/String;", "encodeOAuth", "encodeURLParameter", "(Ljava/lang/String;Z)Ljava/lang/String;", "", "", "allowedSet", "percentEncode", "(Ljava/lang/String;Ljava/util/Set;)Ljava/lang/String;", "encodeURLParameterValue", "", "start", "end", "plusIsSpace", "decodeURLQueryComponent", "(Ljava/lang/String;IIZLjava/nio/charset/Charset;)Ljava/lang/String;", "decodeURLPart", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Ljava/lang/String;", "decodeScan", "", "prefixEnd", "decodeImpl", "(Ljava/lang/CharSequence;IIIZLjava/nio/charset/Charset;)Ljava/lang/String;", "", "(B)Ljava/lang/String;", "c2", "charToHexDigit", "(C)I", "digit", "hexDigitToChar", "(I)C", "Lkotlinx/io/Source;", "Lkotlin/Function1;", "", "block", "forEach", "(Lkotlinx/io/Source;Lkotlin/jvm/functions/Function1;)V", "URL_ALPHABET", "Ljava/util/Set;", "URL_ALPHABET_CHARS", "HEX_ALPHABET", "", "URL_PROTOCOL_PART", "Ljava/util/List;", "VALID_PATH_PART", "ATTRIBUTE_CHARACTERS", "getATTRIBUTE_CHARACTERS", "()Ljava/util/Set;", "SPECIAL_SYMBOLS", "ktor-http"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CodecsKt {
    private static final java.util.Set<java.lang.Character> ATTRIBUTE_CHARACTERS;
    private static final java.util.Set<java.lang.Character> HEX_ALPHABET;
    private static final java.util.List<java.lang.Byte> SPECIAL_SYMBOLS;
    private static final java.util.Set<java.lang.Byte> URL_ALPHABET;
    private static final java.util.Set<java.lang.Character> URL_ALPHABET_CHARS;
    private static final java.util.List<java.lang.Byte> URL_PROTOCOL_PART;
    private static final java.util.Set<java.lang.Character> VALID_PATH_PART;

    private static final int charToHexDigit(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        if ('a' > c || c >= 'g') {
            return -1;
        }
        return c - 'W';
    }

    private static final char hexDigitToChar(int i) {
        return (char) ((i < 0 || i >= 10) ? ((char) (i + 65)) - '\n' : i + 48);
    }

    static {
        java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.plus((java.lang.Iterable) new kotlin.ranges.CharRange('a', io.ktor.util.date.GMTDateParser.ZONE), (java.lang.Iterable) new kotlin.ranges.CharRange('A', 'Z')), (java.lang.Iterable) new kotlin.ranges.CharRange('0', '9'));
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(plus, 10));
        java.util.Iterator it = plus.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Byte.valueOf((byte) ((java.lang.Character) it.next()).charValue()));
        }
        URL_ALPHABET = kotlin.collections.CollectionsKt.toSet(arrayList);
        URL_ALPHABET_CHARS = kotlin.collections.CollectionsKt.toSet(kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.plus((java.lang.Iterable) new kotlin.ranges.CharRange('a', io.ktor.util.date.GMTDateParser.ZONE), (java.lang.Iterable) new kotlin.ranges.CharRange('A', 'Z')), (java.lang.Iterable) new kotlin.ranges.CharRange('0', '9')));
        HEX_ALPHABET = kotlin.collections.CollectionsKt.toSet(kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.plus((java.lang.Iterable) new kotlin.ranges.CharRange('a', 'f'), (java.lang.Iterable) new kotlin.ranges.CharRange('A', 'F')), (java.lang.Iterable) new kotlin.ranges.CharRange('0', '9')));
        java.util.Set of = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Character[]{java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON), java.lang.Character.valueOf(kotlinx.io.files.FileSystemKt.UnixPathSeparator), '?', '#', java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST), java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST), '@', '!', java.lang.Character.valueOf(kotlin.text.Typography.dollar), java.lang.Character.valueOf(kotlin.text.Typography.amp), '\'', '(', ')', java.lang.Character.valueOf(io.ktor.util.date.GMTDateParser.ANY), java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA), ';', java.lang.Character.valueOf(com.ironsource.B5.U), '-', '.', '_', '~', '+'});
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(of, 10));
        java.util.Iterator it2 = of.iterator();
        while (it2.hasNext()) {
            arrayList2.add(java.lang.Byte.valueOf((byte) ((java.lang.Character) it2.next()).charValue()));
        }
        URL_PROTOCOL_PART = arrayList2;
        VALID_PATH_PART = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Character[]{java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON), '@', '!', java.lang.Character.valueOf(kotlin.text.Typography.dollar), java.lang.Character.valueOf(kotlin.text.Typography.amp), '\'', '(', ')', java.lang.Character.valueOf(io.ktor.util.date.GMTDateParser.ANY), '+', java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA), ';', java.lang.Character.valueOf(com.ironsource.B5.U), '-', '.', '_', '~'});
        ATTRIBUTE_CHARACTERS = kotlin.collections.SetsKt.plus((java.util.Set) URL_ALPHABET_CHARS, (java.lang.Iterable) kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Character[]{'!', '#', java.lang.Character.valueOf(kotlin.text.Typography.dollar), java.lang.Character.valueOf(kotlin.text.Typography.amp), '+', '-', '.', '^', '_', '`', '|', '~'}));
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Character[]{'-', '.', '_', '~'});
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listOf, 10));
        java.util.Iterator it3 = listOf.iterator();
        while (it3.hasNext()) {
            arrayList3.add(java.lang.Byte.valueOf((byte) ((java.lang.Character) it3.next()).charValue()));
        }
        SPECIAL_SYMBOLS = arrayList3;
    }

    public static final java.util.Set<java.lang.Character> getATTRIBUTE_CHARACTERS() {
        return ATTRIBUTE_CHARACTERS;
    }

    public static /* synthetic */ java.lang.String encodeURLQueryComponent$default(java.lang.String str, boolean z, boolean z2, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return encodeURLQueryComponent(str, z, z2, charset);
    }

    public static final java.lang.String encodeURLQueryComponent(java.lang.String str, final boolean z, final boolean z2, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        final java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.nio.charset.CharsetEncoder newEncoder = charset.newEncoder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newEncoder, "newEncoder(...)");
        forEach(io.ktor.utils.io.charsets.EncodingKt.encode$default(newEncoder, str, 0, 0, 6, null), new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.CodecsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit encodeURLQueryComponent$lambda$4$lambda$3;
                encodeURLQueryComponent$lambda$4$lambda$3 = io.ktor.http.CodecsKt.encodeURLQueryComponent$lambda$4$lambda$3(z2, sb, z, ((java.lang.Byte) obj).byteValue());
                return encodeURLQueryComponent$lambda$4$lambda$3;
            }
        });
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit encodeURLQueryComponent$lambda$4$lambda$3(boolean z, java.lang.StringBuilder sb, boolean z2, byte b) {
        if (b == 32) {
            if (z) {
                sb.append('+');
            } else {
                sb.append("%20");
            }
        } else if (URL_ALPHABET.contains(java.lang.Byte.valueOf(b)) || (!z2 && URL_PROTOCOL_PART.contains(java.lang.Byte.valueOf(b)))) {
            sb.append((char) b);
        } else {
            sb.append(percentEncode(b));
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final java.lang.String encodeURLPathPart(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return encodeURLPath$default(str, true, false, 2, null);
    }

    public static /* synthetic */ java.lang.String encodeURLPath$default(java.lang.String str, boolean z, boolean z2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        return encodeURLPath(str, z, z2);
    }

    public static final java.lang.String encodeURLPath(java.lang.String str, boolean z, boolean z2) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        final java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.nio.charset.Charset charset = kotlin.text.Charsets.UTF_8;
        int i2 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if ((!z && charAt == '/') || URL_ALPHABET_CHARS.contains(java.lang.Character.valueOf(charAt)) || VALID_PATH_PART.contains(java.lang.Character.valueOf(charAt))) {
                sb.append(charAt);
                i2++;
            } else {
                if (!z2 && charAt == '%' && (i = i2 + 2) < str.length()) {
                    java.util.Set<java.lang.Character> set = HEX_ALPHABET;
                    int i3 = i2 + 1;
                    if (set.contains(java.lang.Character.valueOf(str.charAt(i3))) && set.contains(java.lang.Character.valueOf(str.charAt(i)))) {
                        sb.append(charAt);
                        sb.append(str.charAt(i3));
                        sb.append(str.charAt(i));
                        i2 += 3;
                    }
                }
                int i4 = kotlin.text.CharsKt.isSurrogate(charAt) ? 2 : 1;
                java.nio.charset.CharsetEncoder newEncoder = charset.newEncoder();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newEncoder, "newEncoder(...)");
                int i5 = i4 + i2;
                forEach(io.ktor.utils.io.charsets.EncodingKt.encode(newEncoder, str, i2, i5), new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.CodecsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        kotlin.Unit encodeURLPath$lambda$6$lambda$5;
                        encodeURLPath$lambda$6$lambda$5 = io.ktor.http.CodecsKt.encodeURLPath$lambda$6$lambda$5(sb, ((java.lang.Byte) obj).byteValue());
                        return encodeURLPath$lambda$6$lambda$5;
                    }
                });
                i2 = i5;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit encodeURLPath$lambda$6$lambda$5(java.lang.StringBuilder sb, byte b) {
        sb.append(percentEncode(b));
        return kotlin.Unit.INSTANCE;
    }

    public static final java.lang.String encodeOAuth(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return encodeURLParameter$default(str, false, 1, null);
    }

    public static /* synthetic */ java.lang.String encodeURLParameter$default(java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return encodeURLParameter(str, z);
    }

    public static final java.lang.String encodeURLParameter(java.lang.String str, final boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        final java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.nio.charset.CharsetEncoder newEncoder = kotlin.text.Charsets.UTF_8.newEncoder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newEncoder, "newEncoder(...)");
        forEach(io.ktor.utils.io.charsets.EncodingKt.encode$default(newEncoder, str, 0, 0, 6, null), new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.CodecsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                kotlin.Unit encodeURLParameter$lambda$8$lambda$7;
                encodeURLParameter$lambda$8$lambda$7 = io.ktor.http.CodecsKt.encodeURLParameter$lambda$8$lambda$7(sb, z, ((java.lang.Byte) obj).byteValue());
                return encodeURLParameter$lambda$8$lambda$7;
            }
        });
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.Unit encodeURLParameter$lambda$8$lambda$7(java.lang.StringBuilder sb, boolean z, byte b) {
        if (URL_ALPHABET.contains(java.lang.Byte.valueOf(b)) || SPECIAL_SYMBOLS.contains(java.lang.Byte.valueOf(b))) {
            sb.append((char) b);
        } else if (z && b == 32) {
            sb.append('+');
        } else {
            sb.append(percentEncode(b));
        }
        return kotlin.Unit.INSTANCE;
    }

    public static final java.lang.String percentEncode(java.lang.String str, java.util.Set<java.lang.Character> allowedSet) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(allowedSet, "allowedSet");
        java.lang.String str2 = str;
        int i = 0;
        for (int i2 = 0; i2 < str2.length(); i2++) {
            if (!allowedSet.contains(java.lang.Character.valueOf(str2.charAt(i2)))) {
                i++;
            }
        }
        if (i == 0) {
            return str;
        }
        byte[] byteArray = io.ktor.utils.io.core.StringsKt.toByteArray(str, kotlin.text.Charsets.UTF_8);
        int length = str.length() - i;
        char[] cArr = new char[length + ((byteArray.length - length) * 3)];
        int i3 = 0;
        for (byte b : byteArray) {
            char c = (char) b;
            if (allowedSet.contains(java.lang.Character.valueOf(c))) {
                cArr[i3] = c;
                i3++;
            } else {
                cArr[i3] = '%';
                int i4 = i3 + 2;
                cArr[i3 + 1] = hexDigitToChar((b & 255) >> 4);
                i3 += 3;
                cArr[i4] = hexDigitToChar(b & com.google.common.base.Ascii.SI);
            }
        }
        return kotlin.text.StringsKt.concatToString(cArr);
    }

    public static final java.lang.String encodeURLParameterValue(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return encodeURLParameter(str, true);
    }

    public static /* synthetic */ java.lang.String decodeURLQueryComponent$default(java.lang.String str, int i, int i2, boolean z, java.nio.charset.Charset charset, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        if ((i3 & 8) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return decodeURLQueryComponent(str, i, i2, z, charset);
    }

    public static final java.lang.String decodeURLQueryComponent(java.lang.String str, int i, int i2, boolean z, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        return decodeScan(str, i, i2, z, charset);
    }

    public static /* synthetic */ java.lang.String decodeURLPart$default(java.lang.String str, int i, int i2, java.nio.charset.Charset charset, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        return decodeURLPart(str, i, i2, charset);
    }

    public static final java.lang.String decodeURLPart(java.lang.String str, int i, int i2, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        return decodeScan(str, i, i2, false, charset);
    }

    private static final java.lang.String decodeScan(java.lang.String str, int i, int i2, boolean z, java.nio.charset.Charset charset) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (z && charAt == '+')) {
                return decodeImpl(str, i, i2, i3, z, charset);
            }
        }
        if (i == 0 && i2 == str.length()) {
            return str.toString();
        }
        java.lang.String substring = str.substring(i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    private static final java.lang.String decodeImpl(java.lang.CharSequence charSequence, int i, int i2, int i3, boolean z, java.nio.charset.Charset charset) {
        int i4;
        java.lang.Integer valueOf;
        int i5 = i2 - i;
        if (i5 > 255) {
            i5 /= 3;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(i5);
        if (i3 > i) {
            sb.append(charSequence, i, i3);
        }
        byte[] bArr = null;
        while (i3 < i2) {
            char charAt = charSequence.charAt(i3);
            if (z && charAt == '+') {
                sb.append(' ');
                i4 = i3 + 1;
                valueOf = java.lang.Integer.valueOf(i3);
            } else if (charAt == '%') {
                if (bArr == null) {
                    bArr = new byte[(i2 - i3) / 3];
                }
                int i6 = 0;
                while (i3 < i2 && charSequence.charAt(i3) == '%') {
                    int i7 = i3 + 2;
                    if (i7 >= i2) {
                        throw new io.ktor.http.URLDecodeException("Incomplete trailing HEX escape: " + charSequence.subSequence(i3, charSequence.length()).toString() + ", in " + ((java.lang.Object) charSequence) + " at " + i3);
                    }
                    int i8 = i3 + 1;
                    int charToHexDigit = charToHexDigit(charSequence.charAt(i8));
                    int charToHexDigit2 = charToHexDigit(charSequence.charAt(i7));
                    if (charToHexDigit == -1 || charToHexDigit2 == -1) {
                        throw new io.ktor.http.URLDecodeException("Wrong HEX escape: %" + charSequence.charAt(i8) + charSequence.charAt(i7) + ", in " + ((java.lang.Object) charSequence) + ", at " + i3);
                    }
                    bArr[i6] = (byte) ((charToHexDigit * 16) + charToHexDigit2);
                    i3 += 3;
                    i6++;
                }
                sb.append(kotlin.text.StringsKt.decodeToString$default(bArr, 0, i6, false, 4, null));
            } else {
                sb.append(charAt);
                i4 = i3 + 1;
                valueOf = java.lang.Integer.valueOf(i3);
            }
            i3 = i4;
        }
        java.lang.String sb2 = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }

    private static final java.lang.String percentEncode(byte b) {
        return kotlin.text.StringsKt.concatToString(new char[]{'%', hexDigitToChar((b & 255) >> 4), hexDigitToChar(b & com.google.common.base.Ascii.SI)});
    }

    private static final void forEach(kotlinx.io.Source source, final kotlin.jvm.functions.Function1<? super java.lang.Byte, kotlin.Unit> function1) {
        io.ktor.utils.io.core.ByteReadPacketKt.takeWhile(source, new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.CodecsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                boolean forEach$lambda$11;
                forEach$lambda$11 = io.ktor.http.CodecsKt.forEach$lambda$11(kotlin.jvm.functions.Function1.this, (kotlinx.io.Buffer) obj);
                return java.lang.Boolean.valueOf(forEach$lambda$11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean forEach$lambda$11(kotlin.jvm.functions.Function1 function1, kotlinx.io.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "buffer");
        while (io.ktor.utils.io.core.BufferKt.canRead(buffer)) {
            function1.invoke(java.lang.Byte.valueOf(buffer.readByte()));
        }
        return true;
    }
}
