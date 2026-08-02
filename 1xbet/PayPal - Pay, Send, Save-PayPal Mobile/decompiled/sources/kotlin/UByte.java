package kotlin;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Lkotlin/UByte;", "", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "constructor-impl", "(B)B", "", "toString-impl", "(B)Ljava/lang/String;", "toString", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", "B", "getData$annotations", "()V", "getHighSpeedVideoFpsRangesFor", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes3.dex */
public final class UByte implements java.lang.Comparable<kotlin.UByte> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.UByte.Companion INSTANCE = new kotlin.UByte.Companion(null);
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final byte getHighSpeedVideoFpsRangesFor;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static byte m23446constructorimpl(byte b) {
        return b;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23448equalsimpl0(byte b, byte b2) {
        return b == b2;
    }

    public static /* synthetic */ void getData$annotations() {
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(kotlin.UByte uByte) {
        return kotlin.jvm.internal.Intrinsics.compare(getGetHighSpeedVideoFpsRangesFor() & 255, uByte.getGetHighSpeedVideoFpsRangesFor() & 255);
    }

    private /* synthetic */ UByte(byte b) {
        this.getHighSpeedVideoFpsRangesFor = b;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\n"}, d2 = {"Lkotlin/UByte$Companion;", "", "<init>", "()V", "Lkotlin/UByte;", "MIN_VALUE", "B", "MAX_VALUE", "", "SIZE_BYTES", com.visa.cbp.getEncExpo.warmup, "SIZE_BITS"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m23450toStringimpl(byte b) {
        return java.lang.String.valueOf(b & 255);
    }

    public final java.lang.String toString() {
        return m23450toStringimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ byte getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int hashCode() {
        return m23449hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object other) {
        return m23447equalsimpl(this.getHighSpeedVideoFpsRangesFor, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23449hashCodeimpl(byte b) {
        return java.lang.Byte.hashCode(b);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23447equalsimpl(byte b, java.lang.Object obj) {
        return (obj instanceof kotlin.UByte) && b == ((kotlin.UByte) obj).getGetHighSpeedVideoFpsRangesFor();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.UByte m23445boximpl(byte b) {
        return new kotlin.UByte(b);
    }
}
