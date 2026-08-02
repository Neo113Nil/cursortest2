package kotlin.io.encoding;

@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0014\b\u0016\u0018\u0000 D2\u00020\u0001:\u0002EDB)\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J;\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0019\u0010\u001aJA\u0010\u001e\u001a\u00028\u0000\"\f\b\u0000\u0010\u001d*\u00060\u001bj\u0002`\u001c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00028\u00002\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010 \u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b \u0010\u0013J;\u0010!\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\u0017J)\u0010 \u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\"2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b \u0010#J;\u0010!\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\"2\u0006\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b!\u0010$J'\u0010%\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0000¢\u0006\u0004\b%\u0010\u0013J7\u0010&\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0000¢\u0006\u0004\b&\u0010\u0017J\u0017\u0010(\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u0005H\u0000¢\u0006\u0004\b(\u0010)J7\u0010+\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005H\u0002¢\u0006\u0004\b+\u0010\u0017J'\u0010,\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0000¢\u0006\u0004\b,\u0010-J'\u0010.\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0000¢\u0006\u0004\b.\u0010#J\u0017\u0010/\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b/\u00100J'\u0010+\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b+\u0010-J'\u00102\u001a\u0002012\u0006\u0010'\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0000¢\u0006\u0004\b2\u00103J'\u0010+\u001a\u0002012\u0006\u0010\u0003\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b+\u00103R\u001a\u00104\u001a\u00020\u00028\u0001X\u0080\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u00108\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R\u001a\u0010:\u001a\u00020\u00058\u0001X\u0081\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010;"}, d2 = {"Lkotlin/io/encoding/Base64;", "", "", "p0", "p1", "", "p2", "Lkotlin/io/encoding/Base64$PaddingOption;", "p3", "<init>", "(ZZILkotlin/io/encoding/Base64$PaddingOption;)V", com.paypal.oslo.feature.p2p.domain.constants.P2pConstants.Log.Attributes.OPTION, "withPadding", "(Lkotlin/io/encoding/Base64$PaddingOption;)Lkotlin/io/encoding/Base64;", "", "source", "startIndex", "endIndex", "encodeToByteArray", "([BII)[B", "destination", "destinationOffset", "encodeIntoByteArray", "([B[BIII)I", "", "encode", "([BII)Ljava/lang/String;", "Ljava/lang/Appendable;", "Lkotlin/text/getHighSpeedVideoFpsRangesFor;", "A", "encodeToAppendable", "([BLjava/lang/Appendable;II)Ljava/lang/Appendable;", "decode", "decodeIntoByteArray", "", "(Ljava/lang/CharSequence;II)[B", "(Ljava/lang/CharSequence;[BIII)I", "encodeToByteArrayImpl$kotlin_stdlib", "encodeIntoByteArrayImpl$kotlin_stdlib", "sourceSize", "encodeSize$kotlin_stdlib", "(I)I", "p4", "Camera2StreamConfigurationMap", "decodeSize$kotlin_stdlib", "([BII)I", "charsToBytesImpl$kotlin_stdlib", "bytesToStringImpl$kotlin_stdlib", "([B)Ljava/lang/String;", "", "checkSourceBounds$kotlin_stdlib", "(III)V", "isUrlSafe", "Z", "isUrlSafe$kotlin_stdlib", "()Z", "isMimeScheme", "isMimeScheme$kotlin_stdlib", "mimeLineLength", com.visa.cbp.getEncExpo.warmup, "getMimeLineLength$kotlin_stdlib", "()I", "paddingOption", "Lkotlin/io/encoding/Base64$PaddingOption;", "getPaddingOption$kotlin_stdlib", "()Lkotlin/io/encoding/Base64$PaddingOption;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoSizes", "Default", "PaddingOption"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public class Base64 {
    public static final int bytesPerGroup = 3;
    public static final byte padSymbol = 61;
    public static final int symbolsPerGroup = 4;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoSizes;
    private final boolean isMimeScheme;
    private final boolean isUrlSafe;
    private final int mimeLineLength;
    private final kotlin.io.encoding.Base64.PaddingOption paddingOption;

    /* renamed from: Default, reason: from kotlin metadata */
    public static final kotlin.io.encoding.Base64.Companion INSTANCE = new kotlin.io.encoding.Base64.Companion(null);
    private static final byte[] mimeLineSeparatorSymbols = {13, 10};
    private static final kotlin.io.encoding.Base64 UrlSafe = new kotlin.io.encoding.Base64(true, false, -1, kotlin.io.encoding.Base64.PaddingOption.PRESENT);
    private static final kotlin.io.encoding.Base64 Mime = new kotlin.io.encoding.Base64(false, true, 76, kotlin.io.encoding.Base64.PaddingOption.PRESENT);
    private static final kotlin.io.encoding.Base64 Pem = new kotlin.io.encoding.Base64(false, true, 64, kotlin.io.encoding.Base64.PaddingOption.PRESENT);

    private Base64(boolean z, boolean z2, int i, kotlin.io.encoding.Base64.PaddingOption paddingOption) {
        this.isUrlSafe = z;
        this.isMimeScheme = z2;
        this.mimeLineLength = i;
        this.paddingOption = paddingOption;
        if (z && z2) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        this.getHighSpeedVideoSizes = i / 4;
    }

    /* renamed from: isUrlSafe$kotlin_stdlib, reason: from getter */
    public final boolean getIsUrlSafe() {
        return this.isUrlSafe;
    }

    /* renamed from: isMimeScheme$kotlin_stdlib, reason: from getter */
    public final boolean getIsMimeScheme() {
        return this.isMimeScheme;
    }

    /* renamed from: getMimeLineLength$kotlin_stdlib, reason: from getter */
    public final int getMimeLineLength() {
        return this.mimeLineLength;
    }

    /* renamed from: getPaddingOption$kotlin_stdlib, reason: from getter */
    public final kotlin.io.encoding.Base64.PaddingOption getPaddingOption() {
        return this.paddingOption;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lkotlin/io/encoding/Base64$PaddingOption;", "", "<init>", "(Ljava/lang/String;I)V", "PRESENT", "ABSENT", "PRESENT_OPTIONAL", "ABSENT_OPTIONAL"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class PaddingOption {
        public static final kotlin.io.encoding.Base64.PaddingOption ABSENT;
        public static final kotlin.io.encoding.Base64.PaddingOption ABSENT_OPTIONAL;
        public static final kotlin.io.encoding.Base64.PaddingOption PRESENT;
        public static final kotlin.io.encoding.Base64.PaddingOption PRESENT_OPTIONAL;
        private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
        private static final /* synthetic */ kotlin.io.encoding.Base64.PaddingOption[] getHighSpeedVideoFpsRangesFor;

        private PaddingOption(java.lang.String str, int i) {
        }

        static {
            kotlin.io.encoding.Base64.PaddingOption paddingOption = new kotlin.io.encoding.Base64.PaddingOption("PRESENT", 0);
            PRESENT = paddingOption;
            kotlin.io.encoding.Base64.PaddingOption paddingOption2 = new kotlin.io.encoding.Base64.PaddingOption("ABSENT", 1);
            ABSENT = paddingOption2;
            kotlin.io.encoding.Base64.PaddingOption paddingOption3 = new kotlin.io.encoding.Base64.PaddingOption("PRESENT_OPTIONAL", 2);
            PRESENT_OPTIONAL = paddingOption3;
            kotlin.io.encoding.Base64.PaddingOption paddingOption4 = new kotlin.io.encoding.Base64.PaddingOption("ABSENT_OPTIONAL", 3);
            ABSENT_OPTIONAL = paddingOption4;
            kotlin.io.encoding.Base64.PaddingOption[] paddingOptionArr = {paddingOption, paddingOption2, paddingOption3, paddingOption4};
            getHighSpeedVideoFpsRangesFor = paddingOptionArr;
            getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(paddingOptionArr);
        }

        public static kotlin.io.encoding.Base64.PaddingOption[] values() {
            return (kotlin.io.encoding.Base64.PaddingOption[]) getHighSpeedVideoFpsRangesFor.clone();
        }

        public static kotlin.io.encoding.Base64.PaddingOption valueOf(java.lang.String str) {
            return (kotlin.io.encoding.Base64.PaddingOption) java.lang.Enum.valueOf(kotlin.io.encoding.Base64.PaddingOption.class, str);
        }

        public static kotlin.enums.EnumEntries<kotlin.io.encoding.Base64.PaddingOption> getEntries() {
            return getHighSpeedVideoFpsRanges;
        }
    }

    public final kotlin.io.encoding.Base64 withPadding(kotlin.io.encoding.Base64.PaddingOption option) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(option, "");
        return this.paddingOption == option ? this : new kotlin.io.encoding.Base64(this.isUrlSafe, this.isMimeScheme, this.mimeLineLength, option);
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(kotlin.io.encoding.Base64 base64, byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return base64.encodeToByteArray(bArr, i, i2);
    }

    public final byte[] encodeToByteArray(byte[] source, int startIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        return encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex);
    }

    public static /* synthetic */ int encodeIntoByteArray$default(kotlin.io.encoding.Base64 base64, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
        }
        int i5 = (i4 & 4) != 0 ? 0 : i;
        int i6 = (i4 & 8) != 0 ? 0 : i2;
        if ((i4 & 16) != 0) {
            i3 = bArr.length;
        }
        return base64.encodeIntoByteArray(bArr, bArr2, i5, i6, i3);
    }

    public final int encodeIntoByteArray(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        return encodeIntoByteArrayImpl$kotlin_stdlib(source, destination, destinationOffset, startIndex, endIndex);
    }

    public static /* synthetic */ java.lang.String encode$default(kotlin.io.encoding.Base64 base64, byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return base64.encode(bArr, i, i2);
    }

    public final java.lang.String encode(byte[] source, int startIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        return new java.lang.String(encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex), kotlin.text.Charsets.ISO_8859_1);
    }

    public static /* synthetic */ java.lang.Appendable encodeToAppendable$default(kotlin.io.encoding.Base64 base64, byte[] bArr, java.lang.Appendable appendable, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = bArr.length;
        }
        return base64.encodeToAppendable(bArr, appendable, i, i2);
    }

    @kotlin.IgnorableReturnValue
    public final <A extends java.lang.Appendable> A encodeToAppendable(byte[] source, A destination, int startIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        destination.append(new java.lang.String(encodeToByteArrayImpl$kotlin_stdlib(source, startIndex, endIndex), kotlin.text.Charsets.ISO_8859_1));
        return destination;
    }

    public static /* synthetic */ byte[] decode$default(kotlin.io.encoding.Base64 base64, byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return base64.decode(bArr, i, i2);
    }

    public final byte[] decode(byte[] source, int startIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        int decodeSize$kotlin_stdlib = decodeSize$kotlin_stdlib(source, startIndex, endIndex);
        byte[] bArr = new byte[decodeSize$kotlin_stdlib];
        if (Camera2StreamConfigurationMap(source, bArr, 0, startIndex, endIndex) == decodeSize$kotlin_stdlib) {
            return bArr;
        }
        throw new java.lang.IllegalStateException("Check failed.");
    }

    public static /* synthetic */ int decodeIntoByteArray$default(kotlin.io.encoding.Base64 base64, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        int i5 = (i4 & 4) != 0 ? 0 : i;
        int i6 = (i4 & 8) != 0 ? 0 : i2;
        if ((i4 & 16) != 0) {
            i3 = bArr.length;
        }
        return base64.decodeIntoByteArray(bArr, bArr2, i5, i6, i3);
    }

    public final int decodeIntoByteArray(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        Camera2StreamConfigurationMap(destination.length, destinationOffset, decodeSize$kotlin_stdlib(source, startIndex, endIndex));
        return Camera2StreamConfigurationMap(source, destination, destinationOffset, startIndex, endIndex);
    }

    public static /* synthetic */ byte[] decode$default(kotlin.io.encoding.Base64 base64, java.lang.CharSequence charSequence, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        return base64.decode(charSequence, i, i2);
    }

    public final byte[] decode(java.lang.CharSequence source, int startIndex, int endIndex) {
        byte[] charsToBytesImpl$kotlin_stdlib;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        if (source instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) source;
            checkSourceBounds$kotlin_stdlib(str.length(), startIndex, endIndex);
            java.lang.String substring = str.substring(startIndex, endIndex);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            java.nio.charset.Charset charset = kotlin.text.Charsets.ISO_8859_1;
            kotlin.jvm.internal.Intrinsics.checkNotNull(substring, "");
            charsToBytesImpl$kotlin_stdlib = substring.getBytes(charset);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charsToBytesImpl$kotlin_stdlib, "");
        } else {
            charsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex);
        }
        return decode$default(this, charsToBytesImpl$kotlin_stdlib, 0, 0, 6, (java.lang.Object) null);
    }

    public static /* synthetic */ int decodeIntoByteArray$default(kotlin.io.encoding.Base64 base64, java.lang.CharSequence charSequence, byte[] bArr, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        int i5 = (i4 & 4) != 0 ? 0 : i;
        int i6 = (i4 & 8) != 0 ? 0 : i2;
        if ((i4 & 16) != 0) {
            i3 = charSequence.length();
        }
        return base64.decodeIntoByteArray(charSequence, bArr, i5, i6, i3);
    }

    public final int decodeIntoByteArray(java.lang.CharSequence source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        byte[] charsToBytesImpl$kotlin_stdlib;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        if (source instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) source;
            checkSourceBounds$kotlin_stdlib(str.length(), startIndex, endIndex);
            java.lang.String substring = str.substring(startIndex, endIndex);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
            java.nio.charset.Charset charset = kotlin.text.Charsets.ISO_8859_1;
            kotlin.jvm.internal.Intrinsics.checkNotNull(substring, "");
            charsToBytesImpl$kotlin_stdlib = substring.getBytes(charset);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charsToBytesImpl$kotlin_stdlib, "");
        } else {
            charsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(source, startIndex, endIndex);
        }
        return decodeIntoByteArray$default(this, charsToBytesImpl$kotlin_stdlib, destination, destinationOffset, 0, 0, 24, (java.lang.Object) null);
    }

    public final byte[] encodeToByteArrayImpl$kotlin_stdlib(byte[] source, int startIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        byte[] bArr = new byte[encodeSize$kotlin_stdlib(endIndex - startIndex)];
        encodeIntoByteArrayImpl$kotlin_stdlib(source, bArr, 0, startIndex, endIndex);
        return bArr;
    }

    public final int encodeIntoByteArrayImpl$kotlin_stdlib(byte[] source, byte[] destination, int destinationOffset, int startIndex, int endIndex) {
        int i;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "");
        checkSourceBounds$kotlin_stdlib(source.length, startIndex, endIndex);
        Camera2StreamConfigurationMap(destination.length, destinationOffset, encodeSize$kotlin_stdlib(endIndex - startIndex));
        byte[] bArr = this.isUrlSafe ? kotlin.io.encoding.Base64Kt.getHighSpeedVideoFpsRanges : kotlin.io.encoding.Base64Kt.getHighSpeedVideoSizes;
        int i2 = this.isMimeScheme ? this.getHighSpeedVideoSizes : Integer.MAX_VALUE;
        int i3 = destinationOffset;
        while (true) {
            i = startIndex + 2;
            if (i >= endIndex) {
                break;
            }
            int min = java.lang.Math.min((endIndex - startIndex) / 3, i2);
            int i4 = 0;
            while (i4 < min) {
                int i5 = startIndex + 3;
                int i6 = (source[startIndex + 2] & 255) | ((source[startIndex] & 255) << 16) | ((source[startIndex + 1] & 255) << 8);
                destination[i3] = bArr[i6 >>> 18];
                destination[i3 + 1] = bArr[(i6 >>> 12) & 63];
                destination[i3 + 2] = bArr[(i6 >>> 6) & 63];
                destination[i3 + 3] = bArr[i6 & 63];
                i4++;
                i3 += 4;
                startIndex = i5;
            }
            if (min == i2 && startIndex != endIndex) {
                byte[] bArr2 = mimeLineSeparatorSymbols;
                destination[i3] = bArr2[0];
                destination[i3 + 1] = bArr2[1];
                i3 += 2;
            }
        }
        int i7 = endIndex - startIndex;
        if (i7 == 1) {
            int i8 = startIndex + 1;
            int i9 = (source[startIndex] & 255) << 4;
            destination[i3] = bArr[i9 >>> 6];
            int i10 = i3 + 2;
            destination[i3 + 1] = bArr[i9 & 63];
            if (this.paddingOption == kotlin.io.encoding.Base64.PaddingOption.PRESENT || this.paddingOption == kotlin.io.encoding.Base64.PaddingOption.PRESENT_OPTIONAL) {
                destination[i10] = padSymbol;
                destination[i3 + 3] = padSymbol;
                i3 += 4;
            } else {
                i3 = i10;
            }
            startIndex = i8;
        } else if (i7 == 2) {
            int i11 = ((source[startIndex + 1] & 255) << 2) | ((source[startIndex] & 255) << 10);
            destination[i3] = bArr[i11 >>> 12];
            destination[i3 + 1] = bArr[(i11 >>> 6) & 63];
            int i12 = i3 + 3;
            destination[i3 + 2] = bArr[i11 & 63];
            if (this.paddingOption == kotlin.io.encoding.Base64.PaddingOption.PRESENT || this.paddingOption == kotlin.io.encoding.Base64.PaddingOption.PRESENT_OPTIONAL) {
                i3 += 4;
                destination[i12] = padSymbol;
            } else {
                i3 = i12;
            }
            startIndex = i;
        }
        if (startIndex == endIndex) {
            return i3 - destinationOffset;
        }
        throw new java.lang.IllegalStateException("Check failed.");
    }

    public final int encodeSize$kotlin_stdlib(int sourceSize) {
        int i = sourceSize / 3;
        int i2 = sourceSize % 3;
        int i3 = 4;
        int i4 = i * 4;
        if (i2 != 0) {
            if (this.paddingOption != kotlin.io.encoding.Base64.PaddingOption.PRESENT && this.paddingOption != kotlin.io.encoding.Base64.PaddingOption.PRESENT_OPTIONAL) {
                i3 = i2 + 1;
            }
            i4 += i3;
        }
        if (i4 < 0) {
            throw new java.lang.IllegalArgumentException("Input is too big");
        }
        if (this.isMimeScheme) {
            i4 += ((i4 - 1) / this.mimeLineLength) * 2;
        }
        if (i4 >= 0) {
            return i4;
        }
        throw new java.lang.IllegalArgumentException("Input is too big");
    }

    private final int Camera2StreamConfigurationMap(byte[] p0, byte[] p1, int p2, int p3, int p4) {
        boolean z;
        int i;
        int[] iArr = this.isUrlSafe ? kotlin.io.encoding.Base64Kt.Camera2StreamConfigurationMap : kotlin.io.encoding.Base64Kt.getHighResolutionOutputSizeshNQ4ISI;
        int i2 = -8;
        int i3 = p2;
        int i4 = p3;
        int i5 = -8;
        int i6 = 0;
        while (true) {
            if (i4 >= p4) {
                z = false;
                break;
            }
            if (i5 == i2 && (i = i4 + 3) < p4) {
                int i7 = iArr[p0[i] & 255] | (iArr[p0[i4 + 2] & 255] << 6) | (iArr[p0[i4] & 255] << 18) | (iArr[p0[i4 + 1] & 255] << 12);
                if (i7 >= 0) {
                    p1[i3] = (byte) (i7 >> 16);
                    p1[i3 + 1] = (byte) (i7 >> 8);
                    p1[i3 + 2] = (byte) i7;
                    i4 += 4;
                    i3 += 3;
                    i2 = -8;
                }
            }
            int i8 = p0[i4] & 255;
            int i9 = iArr[i8];
            if (i9 >= 0) {
                i4++;
                i6 = (i6 << 6) | i9;
                int i10 = i5 + 6;
                if (i10 >= 0) {
                    p1[i3] = (byte) (i6 >>> i10);
                    i6 &= (1 << i10) - 1;
                    i5 -= 2;
                    i3++;
                } else {
                    i5 = i10;
                }
            } else if (i9 == -2) {
                if (i5 == -8) {
                    throw new java.lang.IllegalArgumentException("Redundant pad character at index ".concat(java.lang.String.valueOf(i4)));
                }
                if (i5 != -6) {
                    if (i5 != -4) {
                        if (i5 != -2) {
                            throw new java.lang.IllegalStateException("Unreachable".toString());
                        }
                    } else if (this.paddingOption != kotlin.io.encoding.Base64.PaddingOption.ABSENT) {
                        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(p0, i4 + 1, p4);
                        if (Camera2StreamConfigurationMap == p4 || p0[Camera2StreamConfigurationMap] != 61) {
                            throw new java.lang.IllegalArgumentException("Missing one pad character at index ".concat(java.lang.String.valueOf(Camera2StreamConfigurationMap)));
                        }
                        i4 = Camera2StreamConfigurationMap + 1;
                        z = true;
                    } else {
                        throw new java.lang.IllegalArgumentException("The padding option is set to ABSENT, but the input has a pad character at index ".concat(java.lang.String.valueOf(i4)));
                    }
                } else if (this.paddingOption == kotlin.io.encoding.Base64.PaddingOption.ABSENT) {
                    throw new java.lang.IllegalArgumentException("The padding option is set to ABSENT, but the input has a pad character at index ".concat(java.lang.String.valueOf(i4)));
                }
                i4++;
                z = true;
            } else {
                if (!this.isMimeScheme) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid symbol '");
                    sb.append((char) i8);
                    sb.append("'(");
                    java.lang.String num = java.lang.Integer.toString(i8, kotlin.text.CharsKt.checkRadix(8));
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num, "");
                    sb.append(num);
                    sb.append(") at index ");
                    sb.append(i4);
                    throw new java.lang.IllegalArgumentException(sb.toString());
                }
                i4++;
            }
            i2 = -8;
        }
        if (i5 == -2) {
            throw new java.lang.IllegalArgumentException("The last unit of input does not have enough bits");
        }
        if (i5 != -8 && !z && this.paddingOption == kotlin.io.encoding.Base64.PaddingOption.PRESENT) {
            throw new java.lang.IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
        }
        if (i6 != 0) {
            throw new java.lang.IllegalArgumentException("The pad bits must be zeros");
        }
        int Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(p0, i4, p4);
        if (Camera2StreamConfigurationMap2 >= p4) {
            return i3 - p2;
        }
        int i11 = p0[Camera2StreamConfigurationMap2] & 255;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Symbol '");
        sb2.append((char) i11);
        sb2.append("'(");
        java.lang.String num2 = java.lang.Integer.toString(i11, kotlin.text.CharsKt.checkRadix(8));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(num2, "");
        sb2.append(num2);
        sb2.append(") at index ");
        sb2.append(Camera2StreamConfigurationMap2 - 1);
        sb2.append(" is prohibited after the pad character");
        throw new java.lang.IllegalArgumentException(sb2.toString());
    }

    public final int decodeSize$kotlin_stdlib(byte[] source, int startIndex, int endIndex) {
        int[] iArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        int i = endIndex - startIndex;
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Input should have at least 2 symbols for Base64 decoding, startIndex: ");
            sb.append(startIndex);
            sb.append(", endIndex: ");
            sb.append(endIndex);
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        if (this.isMimeScheme) {
            while (true) {
                if (startIndex >= endIndex) {
                    break;
                }
                byte b = source[startIndex];
                iArr = kotlin.io.encoding.Base64Kt.getHighResolutionOutputSizeshNQ4ISI;
                int i2 = iArr[b & 255];
                if (i2 < 0) {
                    if (i2 == -2) {
                        i -= endIndex - startIndex;
                        break;
                    }
                    i--;
                }
                startIndex++;
            }
        } else if (source[endIndex - 1] == 61) {
            i = source[endIndex + (-2)] == 61 ? i - 2 : i - 1;
        }
        return (int) ((i * 6) / 8);
    }

    public final byte[] charsToBytesImpl$kotlin_stdlib(java.lang.CharSequence source, int startIndex, int endIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        checkSourceBounds$kotlin_stdlib(source.length(), startIndex, endIndex);
        byte[] bArr = new byte[endIndex - startIndex];
        int i = 0;
        while (startIndex < endIndex) {
            char charAt = source.charAt(startIndex);
            if (charAt <= 255) {
                bArr[i] = (byte) charAt;
            } else {
                bArr[i] = 63;
            }
            i++;
            startIndex++;
        }
        return bArr;
    }

    public final java.lang.String bytesToStringImpl$kotlin_stdlib(byte[] source) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(source, "");
        java.lang.StringBuilder sb = new java.lang.StringBuilder(source.length);
        for (byte b : source) {
            sb.append((char) b);
        }
        return sb.toString();
    }

    private final int Camera2StreamConfigurationMap(byte[] p0, int p1, int p2) {
        int[] iArr;
        if (!this.isMimeScheme) {
            return p1;
        }
        while (p1 < p2) {
            byte b = p0[p1];
            iArr = kotlin.io.encoding.Base64Kt.getHighResolutionOutputSizeshNQ4ISI;
            if (iArr[b & 255] != -1) {
                break;
            }
            p1++;
        }
        return p1;
    }

    public final void checkSourceBounds$kotlin_stdlib(int sourceSize, int startIndex, int endIndex) {
        kotlin.collections.AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(startIndex, endIndex, sourceSize);
    }

    private static void Camera2StreamConfigurationMap(int p0, int p1, int p2) {
        if (p1 < 0 || p1 > p0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("destination offset: ");
            sb.append(p1);
            sb.append(", destination size: ");
            sb.append(p0);
            throw new java.lang.IndexOutOfBoundsException(sb.toString());
        }
        int i = p1 + p2;
        if (i < 0 || i > p0) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("The destination array does not have enough capacity, destination offset: ");
            sb2.append(p1);
            sb2.append(", destination size: ");
            sb2.append(p0);
            sb2.append(", capacity needed: ");
            sb2.append(p2);
            throw new java.lang.IndexOutOfBoundsException(sb2.toString());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u00020\u000b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u00018\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013"}, d2 = {"Lkotlin/io/encoding/Base64$Default;", "Lkotlin/io/encoding/Base64;", "<init>", "()V", "", "bytesPerGroup", com.visa.cbp.getEncExpo.warmup, "symbolsPerGroup", "", "padSymbol", "B", "", "mimeLineSeparatorSymbols", "[B", "getMimeLineSeparatorSymbols$kotlin_stdlib", "()[B", "UrlSafe", "Lkotlin/io/encoding/Base64;", "getUrlSafe", "()Lkotlin/io/encoding/Base64;", "Mime", "getMime", "Pem", "getPem"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* renamed from: kotlin.io.encoding.Base64$Default, reason: from kotlin metadata */
    public static final class Companion extends kotlin.io.encoding.Base64 {
        private Companion() {
            super(false, false, -1, kotlin.io.encoding.Base64.PaddingOption.PRESENT, null);
        }

        public final byte[] getMimeLineSeparatorSymbols$kotlin_stdlib() {
            return kotlin.io.encoding.Base64.mimeLineSeparatorSymbols;
        }

        public final kotlin.io.encoding.Base64 getUrlSafe() {
            return kotlin.io.encoding.Base64.UrlSafe;
        }

        public final kotlin.io.encoding.Base64 getMime() {
            return kotlin.io.encoding.Base64.Mime;
        }

        public final kotlin.io.encoding.Base64 getPem() {
            return kotlin.io.encoding.Base64.Pem;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Base64(boolean z, boolean z2, int i, kotlin.io.encoding.Base64.PaddingOption paddingOption, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, i, paddingOption);
    }
}
