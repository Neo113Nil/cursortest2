package kotlin;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0017B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Lkotlin/UShort;", "", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "constructor-impl", "(S)S", "", "toString-impl", "(S)Ljava/lang/String;", "toString", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Camera2StreamConfigurationMap", "S", "getData$annotations", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes3.dex */
public final class UShort implements java.lang.Comparable<kotlin.UShort> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.UShort.Companion INSTANCE = new kotlin.UShort.Companion(null);
    public static final short MAX_VALUE = -1;
    public static final short MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final short getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static short m23518constructorimpl(short s) {
        return s;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23520equalsimpl0(short s, short s2) {
        return s == s2;
    }

    public static /* synthetic */ void getData$annotations() {
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(kotlin.UShort uShort) {
        return kotlin.jvm.internal.Intrinsics.compare(getGetHighResolutionOutputSizeshNQ4ISI() & MAX_VALUE, uShort.getGetHighResolutionOutputSizeshNQ4ISI() & MAX_VALUE);
    }

    private /* synthetic */ UShort(short s) {
        this.getHighResolutionOutputSizeshNQ4ISI = s;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\n"}, d2 = {"Lkotlin/UShort$Companion;", "", "<init>", "()V", "Lkotlin/UShort;", "MIN_VALUE", "S", "MAX_VALUE", "", "SIZE_BYTES", com.visa.cbp.getEncExpo.warmup, "SIZE_BITS"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m23522toStringimpl(short s) {
        return java.lang.String.valueOf(s & MAX_VALUE);
    }

    public final java.lang.String toString() {
        return m23522toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ short getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int hashCode() {
        return m23521hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object other) {
        return m23519equalsimpl(this.getHighResolutionOutputSizeshNQ4ISI, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23521hashCodeimpl(short s) {
        return java.lang.Short.hashCode(s);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23519equalsimpl(short s, java.lang.Object obj) {
        return (obj instanceof kotlin.UShort) && s == ((kotlin.UShort) obj).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.UShort m23517boximpl(short s) {
        return new kotlin.UShort(s);
    }
}
