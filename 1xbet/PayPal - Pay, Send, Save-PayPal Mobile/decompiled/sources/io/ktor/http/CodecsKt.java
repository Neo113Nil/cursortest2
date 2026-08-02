package io.ktor.http;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0005\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\u001a3\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\r\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00012\b\b\u0002\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u000f\u0010\n\u001a\u001b\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0015\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0017\u001a\u00020\u0000*\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\n\u001a=\u0010\u001c\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u00012\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u001c\u0010\u001d\u001a3\u0010\u001e\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001a\u001a\u00020\u00182\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u001e\u0010\u001f\u001a7\u0010$\u001a\u00020\u0000*\u00020\u00002\u0006\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u00012\n\u0010#\u001a\u00060\u0004j\u0002`\u0005H\u0002¢\u0006\u0004\b$\u0010%\u001a\u0013\u0010'\u001a\u00020\u0000*\u00020&H\u0002¢\u0006\u0004\b'\u0010(\u001a\u0017\u0010'\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u0013H\u0002¢\u0006\u0004\b'\u0010)\"\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020&0\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010*\"\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*\"\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*\"\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010.\"\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010*\" \u00101\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0001X\u0080\u0004¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u00103\"\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020&0-8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u0010."}, d2 = {"", "", "encodeFull", "spaceToPlus", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Camera2StreamConfigurationMap;", io.ktor.http.auth.HttpAuthHeader.Parameters.Charset, "encodeURLQueryComponent", "(Ljava/lang/String;ZZLjava/nio/charset/Charset;)Ljava/lang/String;", "encodeURLPathPart", "(Ljava/lang/String;)Ljava/lang/String;", "encodeSlash", "encodeEncoded", "encodeURLPath", "(Ljava/lang/String;ZZ)Ljava/lang/String;", "encodeOAuth", "encodeURLParameter", "(Ljava/lang/String;Z)Ljava/lang/String;", "", "", "allowedSet", "percentEncode", "(Ljava/lang/String;Ljava/util/Set;)Ljava/lang/String;", "encodeURLParameterValue", "", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "plusIsSpace", "decodeURLQueryComponent", "(Ljava/lang/String;IIZLjava/nio/charset/Charset;)Ljava/lang/String;", "decodeURLPart", "(Ljava/lang/String;IILjava/nio/charset/Charset;)Ljava/lang/String;", "p0", "p1", "p2", "p3", "getHighSpeedVideoFpsRangesFor", "(Ljava/lang/String;IIZ)Ljava/lang/String;", "", "getHighSpeedVideoSizes", "(B)Ljava/lang/String;", "(C)I", "Ljava/util/Set;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "", "Ljava/util/List;", "getInputFormats", "getHighSpeedVideoFpsRanges", "ATTRIBUTE_CHARACTERS", "getATTRIBUTE_CHARACTERS", "()Ljava/util/Set;", "getInputSizeshNQ4ISI"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CodecsKt {
    private static final java.util.Set<java.lang.Character> ATTRIBUTE_CHARACTERS;
    private static final java.util.Set<java.lang.Character> Camera2StreamConfigurationMap;
    private static final java.util.Set<java.lang.Character> getHighResolutionOutputSizeshNQ4ISI;
    private static final java.util.List<java.lang.Byte> getHighSpeedVideoFpsRanges;
    private static final java.util.List<java.lang.Byte> getHighSpeedVideoFpsRangesFor;
    private static final java.util.Set<java.lang.Byte> getHighSpeedVideoSizes;
    private static final java.util.Set<java.lang.Character> getInputFormats;

    private static final int getHighSpeedVideoSizes(char c) {
        if ('0' <= c && c < ':') {
            return c - com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask;
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        if ('a' > c || c >= 'g') {
            return -1;
        }
        return c - 'W';
    }

    static {
        java.util.List plus = kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.plus((java.lang.Iterable) new kotlin.ranges.CharRange('a', io.ktor.util.date.GMTDateParser.ZONE), (java.lang.Iterable) new kotlin.ranges.CharRange('A', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_ZERO)), (java.lang.Iterable) new kotlin.ranges.CharRange(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '9'));
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(plus, 10));
        java.util.Iterator it = plus.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Byte.valueOf((byte) ((java.lang.Character) it.next()).charValue()));
        }
        getHighSpeedVideoSizes = kotlin.collections.CollectionsKt.toSet(arrayList);
        Camera2StreamConfigurationMap = kotlin.collections.CollectionsKt.toSet(kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.plus((java.lang.Iterable) new kotlin.ranges.CharRange('a', io.ktor.util.date.GMTDateParser.ZONE), (java.lang.Iterable) new kotlin.ranges.CharRange('A', org.bouncycastle.pqc.math.linearalgebra.Matrix.MATRIX_TYPE_ZERO)), (java.lang.Iterable) new kotlin.ranges.CharRange(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '9')));
        getHighResolutionOutputSizeshNQ4ISI = kotlin.collections.CollectionsKt.toSet(kotlin.collections.CollectionsKt.plus((java.util.Collection) kotlin.collections.CollectionsKt.plus((java.lang.Iterable) new kotlin.ranges.CharRange('a', 'f'), (java.lang.Iterable) new kotlin.ranges.CharRange('A', 'F')), (java.lang.Iterable) new kotlin.ranges.CharRange(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.Mask, '9')));
        java.util.Set of = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Character[]{java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON), java.lang.Character.valueOf(kotlinx.io.files.FileSystemKt.UnixPathSeparator), '?', '#', java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.BEGIN_LIST), java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST), '@', '!', java.lang.Character.valueOf(kotlin.text.Typography.dollar), java.lang.Character.valueOf(kotlin.text.Typography.amp), '\'', '(', ')', '*', java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA), ';', '=', '-', java.lang.Character.valueOf(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR), '_', '~', '+'});
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(of, 10));
        java.util.Iterator it2 = of.iterator();
        while (it2.hasNext()) {
            arrayList2.add(java.lang.Byte.valueOf((byte) ((java.lang.Character) it2.next()).charValue()));
        }
        getHighSpeedVideoFpsRangesFor = arrayList2;
        getInputFormats = kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Character[]{java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COLON), '@', '!', java.lang.Character.valueOf(kotlin.text.Typography.dollar), java.lang.Character.valueOf(kotlin.text.Typography.amp), '\'', '(', ')', '*', '+', java.lang.Character.valueOf(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA), ';', '=', '-', java.lang.Character.valueOf(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR), '_', '~'});
        ATTRIBUTE_CHARACTERS = kotlin.collections.SetsKt.plus((java.util.Set) Camera2StreamConfigurationMap, (java.lang.Iterable) kotlin.collections.SetsKt.setOf((java.lang.Object[]) new java.lang.Character[]{'!', '#', java.lang.Character.valueOf(kotlin.text.Typography.dollar), java.lang.Character.valueOf(kotlin.text.Typography.amp), '+', '-', java.lang.Character.valueOf(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR), java.lang.Character.valueOf(com.paypal.pds.components.textinput.NumberMaskingOutputTransformationKt.ObscuredMaskString), '_', '`', '|', '~'}));
        java.util.List listOf = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Character[]{'-', java.lang.Character.valueOf(com.paypal.oslo.core.money.MoneyKt.DECIMALSEPARATOR), '_', '~'});
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(listOf, 10));
        java.util.Iterator it3 = listOf.iterator();
        while (it3.hasNext()) {
            arrayList3.add(java.lang.Byte.valueOf((byte) ((java.lang.Character) it3.next()).charValue()));
        }
        getHighSpeedVideoFpsRanges = arrayList3;
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        final java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.nio.charset.CharsetEncoder newEncoder = charset.newEncoder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newEncoder, "");
        io.ktor.utils.io.core.ByteReadPacketKt.takeWhile(io.ktor.utils.io.charsets.EncodingKt.encode$default(newEncoder, str, 0, 0, 6, null), new io.ktor.http.CodecsKt$$ExternalSyntheticLambda0(new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.CodecsKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.http.CodecsKt.$r8$lambda$VhGaCOeDEjPPUwOafTQex9a9JC8(z2, sb, z, ((java.lang.Byte) obj).byteValue());
            }
        }));
        return sb.toString();
    }

    public static final java.lang.String encodeURLPathPart(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        final java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.nio.charset.Charset charset = kotlin.text.Charsets.UTF_8;
        int i2 = 0;
        while (i2 < str.length()) {
            char charAt = str.charAt(i2);
            if ((!z && charAt == '/') || Camera2StreamConfigurationMap.contains(java.lang.Character.valueOf(charAt)) || getInputFormats.contains(java.lang.Character.valueOf(charAt))) {
                sb.append(charAt);
                i2++;
            } else {
                if (!z2 && charAt == '%' && (i = i2 + 2) < str.length()) {
                    java.util.Set<java.lang.Character> set = getHighResolutionOutputSizeshNQ4ISI;
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
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newEncoder, "");
                int i5 = i4 + i2;
                io.ktor.utils.io.core.ByteReadPacketKt.takeWhile(io.ktor.utils.io.charsets.EncodingKt.encode(newEncoder, str, i2, i5), new io.ktor.http.CodecsKt$$ExternalSyntheticLambda0(new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.CodecsKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final java.lang.Object invoke(java.lang.Object obj) {
                        return io.ktor.http.CodecsKt.$r8$lambda$zCCgAoNTZGBg9GIDEyGspEeHJaY(sb, ((java.lang.Byte) obj).byteValue());
                    }
                }));
                i2 = i5;
            }
        }
        return sb.toString();
    }

    public static final java.lang.String encodeOAuth(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return encodeURLParameter$default(str, false, 1, null);
    }

    public static /* synthetic */ java.lang.String encodeURLParameter$default(java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return encodeURLParameter(str, z);
    }

    public static final java.lang.String encodeURLParameter(java.lang.String str, final boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        final java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.nio.charset.CharsetEncoder newEncoder = kotlin.text.Charsets.UTF_8.newEncoder();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newEncoder, "");
        io.ktor.utils.io.core.ByteReadPacketKt.takeWhile(io.ktor.utils.io.charsets.EncodingKt.encode$default(newEncoder, str, 0, 0, 6, null), new io.ktor.http.CodecsKt$$ExternalSyntheticLambda0(new kotlin.jvm.functions.Function1() { // from class: io.ktor.http.CodecsKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return io.ktor.http.CodecsKt.$r8$lambda$lcyxztdDx0UjFn3zKkBFjc6yh4s(sb, z, ((java.lang.Byte) obj).byteValue());
            }
        }));
        return sb.toString();
    }

    public static final java.lang.String percentEncode(java.lang.String str, java.util.Set<java.lang.Character> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        java.lang.String str2 = str;
        int i = 0;
        for (int i2 = 0; i2 < str2.length(); i2++) {
            if (!set.contains(java.lang.Character.valueOf(str2.charAt(i2)))) {
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
            if (set.contains(java.lang.Character.valueOf(c))) {
                cArr[i3] = c;
                i3++;
            } else {
                cArr[i3] = '%';
                int i4 = (b & 255) >> 4;
                cArr[i3 + 1] = (char) ((i4 < 0 || i4 >= 10) ? ((char) (i4 + 65)) - '\n' : i4 + 48);
                int i5 = i3 + 3;
                int i6 = i3 + 2;
                int i7 = b & com.google.common.base.Ascii.SI;
                cArr[i6] = (char) ((i7 < 0 || i7 >= 10) ? ((char) (i7 + 65)) - '\n' : i7 + 48);
                i3 = i5;
            }
        }
        return kotlin.text.StringsKt.concatToString(cArr);
    }

    public static final java.lang.String encodeURLParameterValue(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        return getHighSpeedVideoFpsRangesFor(str, i, i2, z);
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
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "");
        return getHighSpeedVideoFpsRangesFor(str, i, i2, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0080, code lost:
    
        r13 = new java.lang.StringBuilder("Wrong HEX escape: %");
        r13.append(r12.charAt(r7));
        r13.append(r12.charAt(r2));
        r13.append(", in ");
        r13.append((java.lang.Object) r12);
        r13.append(", at ");
        r13.append(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ac, code lost:
    
        throw new io.ktor.http.URLDecodeException(r13.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00db, code lost:
    
        r5.append(kotlin.text.StringsKt.decodeToString$default(r13, 0, r8, false, 4, null));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final java.lang.String getHighSpeedVideoFpsRangesFor(java.lang.String str, int i, int i2, boolean z) {
        int i3;
        java.lang.Integer valueOf;
        int i4 = i;
        while (i4 < i2) {
            char charAt = str.charAt(i4);
            if (charAt == '%' || (z && charAt == '+')) {
                java.lang.String str2 = str;
                int i5 = i2 - i;
                if (i5 > 255) {
                    i5 /= 3;
                }
                java.lang.StringBuilder sb = new java.lang.StringBuilder(i5);
                if (i4 > i) {
                    sb.append((java.lang.CharSequence) str2, i, i4);
                }
                byte[] bArr = null;
                loop1: while (i4 < i2) {
                    char charAt2 = str2.charAt(i4);
                    if (z && charAt2 == '+') {
                        sb.append(' ');
                        i3 = i4 + 1;
                        valueOf = java.lang.Integer.valueOf(i4);
                    } else if (charAt2 == '%') {
                        if (bArr == null) {
                            bArr = new byte[(i2 - i4) / 3];
                        }
                        int i6 = 0;
                        while (true) {
                            int i7 = i6;
                            if (i4 >= i2 || str2.charAt(i4) != '%') {
                                break;
                            }
                            int i8 = i4 + 2;
                            if (i8 >= i2) {
                                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Incomplete trailing HEX escape: ");
                                sb2.append(str2.subSequence(i4, str2.length()).toString());
                                sb2.append(", in ");
                                sb2.append((java.lang.Object) str2);
                                sb2.append(" at ");
                                sb2.append(i4);
                                throw new io.ktor.http.URLDecodeException(sb2.toString());
                            }
                            int i9 = i4 + 1;
                            int highSpeedVideoSizes = getHighSpeedVideoSizes(str2.charAt(i9));
                            int highSpeedVideoSizes2 = getHighSpeedVideoSizes(str2.charAt(i8));
                            if (highSpeedVideoSizes == -1 || highSpeedVideoSizes2 == -1) {
                                break loop1;
                            }
                            i6 = i7 + 1;
                            bArr[i7] = (byte) ((highSpeedVideoSizes * 16) + highSpeedVideoSizes2);
                            i4 += 3;
                        }
                    } else {
                        sb.append(charAt2);
                        i3 = i4 + 1;
                        valueOf = java.lang.Integer.valueOf(i4);
                    }
                    i4 = i3;
                }
                java.lang.String obj = sb.toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                return obj;
            }
            i4++;
        }
        if (i == 0 && i2 == str.length()) {
            return str.toString();
        }
        java.lang.String substring = str.substring(i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        return substring;
    }

    private static final java.lang.String getHighSpeedVideoSizes(byte b) {
        int i = (b & 255) >> 4;
        char c = (char) ((i < 0 || i >= 10) ? ((char) (i + 65)) - '\n' : i + 48);
        int i2 = b & com.google.common.base.Ascii.SI;
        return kotlin.text.StringsKt.concatToString(new char[]{'%', c, (char) ((i2 < 0 || i2 >= 10) ? ((char) (i2 + 65)) - '\n' : i2 + 48)});
    }

    public static /* synthetic */ boolean $r8$lambda$OjSjEERTe3VUgSdD96JyOKNEZcE(kotlin.jvm.functions.Function1 function1, kotlinx.io.Buffer buffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buffer, "");
        while (io.ktor.utils.io.core.BufferKt.canRead(buffer)) {
            function1.invoke(java.lang.Byte.valueOf(buffer.readByte()));
        }
        return true;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$VhGaCOeDEjPPUwOafTQex9a9JC8(boolean z, java.lang.StringBuilder sb, boolean z2, byte b) {
        if (b == 32) {
            if (z) {
                sb.append('+');
            } else {
                sb.append("%20");
            }
        } else if (getHighSpeedVideoSizes.contains(java.lang.Byte.valueOf(b)) || (!z2 && getHighSpeedVideoFpsRangesFor.contains(java.lang.Byte.valueOf(b)))) {
            sb.append((char) b);
        } else {
            sb.append(getHighSpeedVideoSizes(b));
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$lcyxztdDx0UjFn3zKkBFjc6yh4s(java.lang.StringBuilder sb, boolean z, byte b) {
        if (getHighSpeedVideoSizes.contains(java.lang.Byte.valueOf(b)) || getHighSpeedVideoFpsRanges.contains(java.lang.Byte.valueOf(b))) {
            sb.append((char) b);
        } else if (z && b == 32) {
            sb.append('+');
        } else {
            sb.append(getHighSpeedVideoSizes(b));
        }
        return kotlin.Unit.INSTANCE;
    }

    public static /* synthetic */ kotlin.Unit $r8$lambda$zCCgAoNTZGBg9GIDEyGspEeHJaY(java.lang.StringBuilder sb, byte b) {
        sb.append(getHighSpeedVideoSizes(b));
        return kotlin.Unit.INSTANCE;
    }
}
