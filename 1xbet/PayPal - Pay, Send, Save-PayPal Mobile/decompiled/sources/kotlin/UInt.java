package kotlin;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087@\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0013\u0010\u0014\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Lkotlin/UInt;", "", "", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Camera2StreamConfigurationMap", com.visa.cbp.getEncExpo.warmup, "getData$annotations", "()V", "Companion"}, k = 1, mv = {2, 3, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes3.dex */
public final class UInt implements java.lang.Comparable<kotlin.UInt> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final kotlin.UInt.Companion INSTANCE = new kotlin.UInt.Companion(null);
    public static final int MAX_VALUE = -1;
    public static final int MIN_VALUE = 0;
    public static final int SIZE_BITS = 32;
    public static final int SIZE_BYTES = 4;
    private final int Camera2StreamConfigurationMap;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m23470constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m23472equalsimpl0(int i, int i2) {
        return i == i2;
    }

    public static /* synthetic */ void getData$annotations() {
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(kotlin.UInt uInt) {
        return kotlin.UnsignedKt.uintCompare(getCamera2StreamConfigurationMap(), uInt.getCamera2StreamConfigurationMap());
    }

    private /* synthetic */ UInt(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\n\u0010\u0006"}, d2 = {"Lkotlin/UInt$Companion;", "", "<init>", "()V", "Lkotlin/UInt;", "MIN_VALUE", com.visa.cbp.getEncExpo.warmup, "MAX_VALUE", "", "SIZE_BYTES", "SIZE_BITS"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m23474toStringimpl(int i) {
        return java.lang.String.valueOf(i & 4294967295L);
    }

    public final java.lang.String toString() {
        return m23474toStringimpl(this.Camera2StreamConfigurationMap);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final int hashCode() {
        return m23473hashCodeimpl(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object other) {
        return m23471equalsimpl(this.Camera2StreamConfigurationMap, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m23473hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m23471equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof kotlin.UInt) && i == ((kotlin.UInt) obj).getCamera2StreamConfigurationMap();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ kotlin.UInt m23469boximpl(int i) {
        return new kotlin.UInt(i);
    }
}
