package androidx.compose.ui.unit;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/unit/TextUnitType;", "", "", "type", "constructor-impl", "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Camera2StreamConfigurationMap", "J", "getHighResolutionOutputSizeshNQ4ISI", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class TextUnitType {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.unit.TextUnitType.Companion INSTANCE = new androidx.compose.ui.unit.TextUnitType.Companion(null);
    private static final long Unspecified = m8821constructorimpl(0);
    private static final long Sp = m8821constructorimpl(4294967296L);
    private static final long Em = m8821constructorimpl(8589934592L);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8821constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8823equalsimpl0(long j, long j2) {
        return j == j2;
    }

    private /* synthetic */ TextUnitType(long j) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
    }

    public final java.lang.String toString() {
        return m8825toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8825toStringimpl(long j) {
        return m8823equalsimpl0(j, Unspecified) ? "Unspecified" : m8823equalsimpl0(j, Sp) ? "Sp" : m8823equalsimpl0(j, Em) ? "Em" : "Invalid";
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/compose/ui/unit/TextUnitType$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/TextUnitType;", "Unspecified", "J", "getUnspecified-UIouoOA", "()J", "Sp", "getSp-UIouoOA", "Em", "getEm-UIouoOA"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getUnspecified-UIouoOA, reason: not valid java name */
        public final long m8829getUnspecifiedUIouoOA() {
            return androidx.compose.ui.unit.TextUnitType.Unspecified;
        }

        /* renamed from: getSp-UIouoOA, reason: not valid java name */
        public final long m8828getSpUIouoOA() {
            return androidx.compose.ui.unit.TextUnitType.Sp;
        }

        /* renamed from: getEm-UIouoOA, reason: not valid java name */
        public final long m8827getEmUIouoOA() {
            return androidx.compose.ui.unit.TextUnitType.Em;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int hashCode() {
        return m8824hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object other) {
        return m8822equalsimpl(this.getHighResolutionOutputSizeshNQ4ISI, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8824hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8822equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.unit.TextUnitType) && j == ((androidx.compose.ui.unit.TextUnitType) obj).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.unit.TextUnitType m8820boximpl(long j) {
        return new androidx.compose.ui.unit.TextUnitType(j);
    }
}
