package kotlin.uuid;

@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u0000 /2\b\u0012\u0004\u0012\u00020\u00000\u00012\u00060\u0002j\u0002`\u0003:\u0001/B\u0019\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\r\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0010J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0015\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010$\u001a\u00020#2\n\u0010\"\u001a\u00060 j\u0002`!H\u0002¢\u0006\u0004\b$\u0010%R \u0010&\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010+\u001a\u0004\b(\u0010)R \u0010,\u001a\u00020\u00048\u0001X\u0080\u0004¢\u0006\u0012\n\u0004\b,\u0010'\u0012\u0004\b.\u0010+\u001a\u0004\b-\u0010)"}, d2 = {"Lkotlin/uuid/Uuid;", "", "Ljava/io/Serializable;", "Lkotlin/io/Camera2StreamConfigurationMap;", "", "p0", "p1", "<init>", "(JJ)V", "", "toString", "()Ljava/lang/String;", "toHexDashString", "toHexString", "", "toByteArray", "()[B", "Lkotlin/UByteArray;", "toUByteArray-TcUX1vc", "toUByteArray", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "compareTo", "(Lkotlin/uuid/Uuid;)I", "hashCode", "()I", "writeReplace", "()Ljava/lang/Object;", "Ljava/io/ObjectInputStream;", "Lkotlin/internal/getHighSpeedVideoSizes;", "input", "", "readObject", "(Ljava/io/ObjectInputStream;)V", "mostSignificantBits", "J", "getMostSignificantBits", "()J", "getMostSignificantBits$annotations", "()V", "leastSignificantBits", "getLeastSignificantBits", "getLeastSignificantBits$annotations", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Uuid implements java.lang.Comparable<kotlin.uuid.Uuid>, java.io.Serializable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.uuid.Uuid.Companion INSTANCE = new kotlin.uuid.Uuid.Companion(null);
    private static final kotlin.uuid.Uuid NIL = new kotlin.uuid.Uuid(0, 0);
    public static final int SIZE_BITS = 128;
    public static final int SIZE_BYTES = 16;
    private final long leastSignificantBits;
    private final long mostSignificantBits;

    public static /* synthetic */ void getLeastSignificantBits$annotations() {
    }

    public static /* synthetic */ void getMostSignificantBits$annotations() {
    }

    private Uuid(long j, long j2) {
        this.mostSignificantBits = j;
        this.leastSignificantBits = j2;
    }

    public final long getMostSignificantBits() {
        return this.mostSignificantBits;
    }

    public final long getLeastSignificantBits() {
        return this.leastSignificantBits;
    }

    public final java.lang.String toString() {
        return toHexDashString();
    }

    public final java.lang.String toHexDashString() {
        byte[] bArr = new byte[36];
        kotlin.uuid.UuidKt.formatBytesInto(this.mostSignificantBits, bArr, 0, 0, 4);
        bArr[8] = 45;
        kotlin.uuid.UuidKt.formatBytesInto(this.mostSignificantBits, bArr, 9, 4, 6);
        bArr[13] = 45;
        kotlin.uuid.UuidKt.formatBytesInto(this.mostSignificantBits, bArr, 14, 6, 8);
        bArr[18] = 45;
        kotlin.uuid.UuidKt.formatBytesInto(this.leastSignificantBits, bArr, 19, 0, 2);
        bArr[23] = 45;
        kotlin.uuid.UuidKt.formatBytesInto(this.leastSignificantBits, bArr, 24, 2, 8);
        return kotlin.text.StringsKt.decodeToString(bArr);
    }

    public final java.lang.String toHexString() {
        byte[] bArr = new byte[32];
        kotlin.uuid.UuidKt.formatBytesInto(this.mostSignificantBits, bArr, 0, 0, 8);
        kotlin.uuid.UuidKt.formatBytesInto(this.leastSignificantBits, bArr, 16, 0, 8);
        return kotlin.text.StringsKt.decodeToString(bArr);
    }

    public final byte[] toByteArray() {
        byte[] bArr = new byte[16];
        kotlin.uuid.UuidKt.setLongAt(bArr, 0, this.mostSignificantBits);
        kotlin.uuid.UuidKt.setLongAt(bArr, 8, this.leastSignificantBits);
        return bArr;
    }

    /* renamed from: toUByteArray-TcUX1vc, reason: not valid java name */
    public final byte[] m24051toUByteArrayTcUX1vc() {
        return kotlin.UByteArray.m23454constructorimpl(toByteArray());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof kotlin.uuid.Uuid)) {
            return false;
        }
        kotlin.uuid.Uuid uuid = (kotlin.uuid.Uuid) other;
        return this.mostSignificantBits == uuid.mostSignificantBits && this.leastSignificantBits == uuid.leastSignificantBits;
    }

    @Override // java.lang.Comparable
    public final int compareTo(kotlin.uuid.Uuid other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "");
        long j = this.mostSignificantBits;
        if (j != other.mostSignificantBits) {
            return java.lang.Long.compareUnsigned(kotlin.ULong.m23494constructorimpl(j), kotlin.ULong.m23494constructorimpl(other.mostSignificantBits));
        }
        return java.lang.Long.compareUnsigned(kotlin.ULong.m23494constructorimpl(this.leastSignificantBits), kotlin.ULong.m23494constructorimpl(other.leastSignificantBits));
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.mostSignificantBits ^ this.leastSignificantBits);
    }

    private final java.lang.Object writeReplace() {
        return kotlin.uuid.UuidKt.serializedUuid(this);
    }

    private final void readObject(java.io.ObjectInputStream input) {
        throw new java.io.InvalidObjectException("Deserialization is supported via proxy only");
    }

    @kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\f\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\tJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0010J\u0015\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001b\u0010\u0018J\u0017\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001a\u001a\u00020\u0015¢\u0006\u0004\b\u001c\u0010\u0018J\u0015\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u0018J\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u0015¢\u0006\u0004\b\u001f\u0010\u0018J\r\u0010 \u001a\u00020\u0007¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010!J\r\u0010#\u001a\u00020\u0007¢\u0006\u0004\b#\u0010!J\u0015\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b*\u0010+R\u0017\u0010,\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010!R\u0014\u00100\u001a\u00020/8\u0006X\u0087T¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020/8\u0006X\u0087T¢\u0006\u0006\n\u0004\b2\u00101R*\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u000703j\b\u0012\u0004\u0012\u00020\u0007`48GX\u0087\u0004¢\u0006\f\u0012\u0004\b7\u0010\u0003\u001a\u0004\b5\u00106"}, d2 = {"Lkotlin/uuid/Uuid$Companion;", "", "<init>", "()V", "", "mostSignificantBits", "leastSignificantBits", "Lkotlin/uuid/Uuid;", "fromLongs", "(JJ)Lkotlin/uuid/Uuid;", "Lkotlin/ULong;", "fromULongs-eb3DHEI", "fromULongs", "", "byteArray", "fromByteArray", "([B)Lkotlin/uuid/Uuid;", "Lkotlin/UByteArray;", "ubyteArray", "fromUByteArray-GBYM_sE", "fromUByteArray", "", "uuidString", "parse", "(Ljava/lang/String;)Lkotlin/uuid/Uuid;", "parseOrNull", "hexDashString", "parseHexDash", "parseHexDashOrNull", "hexString", "parseHex", "parseHexOrNull", "random", "()Lkotlin/uuid/Uuid;", "generateV4", "generateV7", "Lkotlin/time/Instant;", "timestamp", "generateV7NonMonotonicAt", "(Lkotlin/time/Instant;)Lkotlin/uuid/Uuid;", "Lkotlin/time/Clock;", "clock", "generateV7$kotlin_stdlib", "(Lkotlin/time/Clock;)Lkotlin/uuid/Uuid;", "NIL", "Lkotlin/uuid/Uuid;", "getNIL", "", "SIZE_BYTES", com.visa.cbp.getEncExpo.warmup, "SIZE_BITS", "Ljava/util/Comparator;", "Lkotlin/getOutputStallDuration;", "getLEXICAL_ORDER", "()Ljava/util/Comparator;", "getLEXICAL_ORDER$annotations", "LEXICAL_ORDER"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        @kotlin.Deprecated(message = "Use naturalOrder<Uuid>() instead", replaceWith = @kotlin.ReplaceWith(expression = "naturalOrder<Uuid>()", imports = {"kotlin.comparisons.naturalOrder"}))
        @kotlin.DeprecatedSinceKotlin(warningSince = "2.1")
        public static /* synthetic */ void getLEXICAL_ORDER$annotations() {
        }

        private Companion() {
        }

        public final kotlin.uuid.Uuid getNIL() {
            return kotlin.uuid.Uuid.NIL;
        }

        public final kotlin.uuid.Uuid fromLongs(long mostSignificantBits, long leastSignificantBits) {
            if (mostSignificantBits == 0 && leastSignificantBits == 0) {
                return getNIL();
            }
            return new kotlin.uuid.Uuid(mostSignificantBits, leastSignificantBits, null);
        }

        /* renamed from: fromULongs-eb3DHEI, reason: not valid java name */
        public final kotlin.uuid.Uuid m24053fromULongseb3DHEI(long mostSignificantBits, long leastSignificantBits) {
            return fromLongs(mostSignificantBits, leastSignificantBits);
        }

        public final kotlin.uuid.Uuid fromByteArray(byte[] byteArray) {
            java.lang.String joinToString$default;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(byteArray, "");
            if (byteArray.length != 16) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected exactly 16 bytes, but was ");
                joinToString$default = kotlin.collections.ArraysKt.joinToString$default(byteArray, (java.lang.CharSequence) null, (java.lang.CharSequence) "[", (java.lang.CharSequence) "]", 32, (java.lang.CharSequence) null, (kotlin.jvm.functions.Function1) null, 49, (java.lang.Object) null);
                sb.append(joinToString$default);
                sb.append(" of size ");
                sb.append(byteArray.length);
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            return fromLongs(kotlin.uuid.UuidKt.getLongAt(byteArray, 0), kotlin.uuid.UuidKt.getLongAt(byteArray, 8));
        }

        /* renamed from: fromUByteArray-GBYM_sE, reason: not valid java name */
        public final kotlin.uuid.Uuid m24052fromUByteArrayGBYM_sE(byte[] ubyteArray) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ubyteArray, "");
            return fromByteArray(ubyteArray);
        }

        public final kotlin.uuid.Uuid parse(java.lang.String uuidString) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuidString, "");
            int length = uuidString.length();
            if (length == 32) {
                return kotlin.uuid.UuidKt.uuidParseHex(uuidString);
            }
            if (length == 36) {
                return kotlin.uuid.UuidKt.uuidParseHexDash(uuidString);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \"");
            sb.append(kotlin.uuid.UuidKt__UuidKt.access$truncateForErrorMessage(uuidString, 64));
            sb.append("\" of length ");
            sb.append(uuidString.length());
            throw new java.lang.IllegalArgumentException(sb.toString());
        }

        public final kotlin.uuid.Uuid parseOrNull(java.lang.String uuidString) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uuidString, "");
            int length = uuidString.length();
            if (length == 32) {
                return parseHexOrNull(uuidString);
            }
            if (length != 36) {
                return null;
            }
            return parseHexDashOrNull(uuidString);
        }

        public final kotlin.uuid.Uuid parseHexDash(java.lang.String hexDashString) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hexDashString, "");
            if (hexDashString.length() != 36) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a 36-char string in the standard hex-and-dash UUID format, but was \"");
                sb.append(kotlin.uuid.UuidKt__UuidKt.access$truncateForErrorMessage(hexDashString, 64));
                sb.append("\" of length ");
                sb.append(hexDashString.length());
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            return kotlin.uuid.UuidKt.uuidParseHexDash(hexDashString);
        }

        public final kotlin.uuid.Uuid parseHexDashOrNull(java.lang.String hexDashString) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hexDashString, "");
            if (hexDashString.length() != 36) {
                return null;
            }
            return kotlin.uuid.UuidKt.uuidParseHexDashOrNull(hexDashString);
        }

        public final kotlin.uuid.Uuid parseHex(java.lang.String hexString) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hexString, "");
            if (hexString.length() != 32) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Expected a 32-char hexadecimal string, but was \"");
                sb.append(kotlin.uuid.UuidKt__UuidKt.access$truncateForErrorMessage(hexString, 64));
                sb.append("\" of length ");
                sb.append(hexString.length());
                throw new java.lang.IllegalArgumentException(sb.toString().toString());
            }
            return kotlin.uuid.UuidKt.uuidParseHex(hexString);
        }

        public final kotlin.uuid.Uuid parseHexOrNull(java.lang.String hexString) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hexString, "");
            if (hexString.length() != 32) {
                return null;
            }
            return kotlin.uuid.UuidKt.uuidParseHexOrNull(hexString);
        }

        public final kotlin.uuid.Uuid random() {
            return generateV4();
        }

        public final kotlin.uuid.Uuid generateV4() {
            return kotlin.uuid.UuidKt.secureRandomUuid();
        }

        public final kotlin.uuid.Uuid generateV7() {
            return generateV7$kotlin_stdlib(kotlin.time.Clock.System.INSTANCE);
        }

        public final kotlin.uuid.Uuid generateV7NonMonotonicAt(kotlin.time.Instant timestamp) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timestamp, "");
            byte[] bArr = new byte[10];
            kotlin.uuid.UuidKt.secureRandomBytes(bArr);
            byte b = bArr[8];
            byte b2 = bArr[9];
            long epochMilliseconds = timestamp.toEpochMilliseconds();
            long j = (((b & com.google.common.base.Ascii.SI) | 112) << 8) | (b2 & 255);
            bArr[0] = (byte) (((byte) (bArr[0] & 63)) | Byte.MIN_VALUE);
            return fromLongs((epochMilliseconds << 16) | j, kotlin.uuid.UuidKt.getLongAt(bArr, 0));
        }

        public final kotlin.uuid.Uuid generateV7$kotlin_stdlib(kotlin.time.Clock clock) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clock, "");
            kotlin.uuid.UuidV7Generator uuidV7Generator = kotlin.uuid.UuidV7Generator.getHighSpeedVideoFpsRanges;
            return kotlin.uuid.UuidV7Generator.getHighResolutionOutputSizeshNQ4ISI(clock);
        }

        public final java.util.Comparator<kotlin.uuid.Uuid> getLEXICAL_ORDER() {
            return kotlin.comparisons.ComparisonsKt.naturalOrder();
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ Uuid(long j, long j2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2);
    }
}
