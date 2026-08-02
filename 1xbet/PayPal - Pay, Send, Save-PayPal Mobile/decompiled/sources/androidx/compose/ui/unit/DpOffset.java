package androidx.compose.ui.unit;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087@\u0018\u0000 %2\u00020\u0001:\u0001%B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068G¢\u0006\f\u0012\u0004\b!\u0010\"\u001a\u0004\b\u001f\u0010 R\u0017\u0010\b\u001a\u00020\u00068G¢\u0006\f\u0012\u0004\b$\u0010\"\u001a\u0004\b#\u0010 \u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/unit/DpOffset;", "", "", "packedValue", "constructor-impl", "(J)J", "Landroidx/compose/ui/unit/Dp;", "x", "y", "copy-tPigGR8", "(JFF)J", "copy", "other", "minus-CB-Mgk4", "(JJ)J", "minus", "plus-CB-Mgk4", "plus", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getPackedValue", "()J", "getX-D9Ej5fM", "(J)F", "getX-D9Ej5fM$annotations", "()V", "getY-D9Ej5fM", "getY-D9Ej5fM$annotations", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class DpOffset {
    private final long packedValue;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.unit.DpOffset.Companion INSTANCE = new androidx.compose.ui.unit.DpOffset.Companion(null);
    private static final long Zero = m8657constructorimpl(0);
    private static final long Unspecified = m8657constructorimpl(androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8657constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8661equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getX-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m8663getXD9Ej5fM$annotations() {
    }

    /* renamed from: getY-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m8665getYD9Ej5fM$annotations() {
    }

    private /* synthetic */ DpOffset(long j) {
        this.packedValue = j;
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    /* renamed from: copy-tPigGR8$default, reason: not valid java name */
    public static /* synthetic */ long m8659copytPigGR8$default(long j, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = m8662getXD9Ej5fM(j);
        }
        if ((i & 2) != 0) {
            f2 = m8664getYD9Ej5fM(j);
        }
        return m8658copytPigGR8(j, f, f2);
    }

    /* renamed from: minus-CB-Mgk4, reason: not valid java name */
    public static final long m8667minusCBMgk4(long j, long j2) {
        float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(m8662getXD9Ej5fM(j) - m8662getXD9Ej5fM(j2));
        float m8601constructorimpl2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(m8664getYD9Ej5fM(j) - m8664getYD9Ej5fM(j2));
        return m8657constructorimpl((java.lang.Float.floatToRawIntBits(m8601constructorimpl) << 32) | (4294967295L & java.lang.Float.floatToRawIntBits(m8601constructorimpl2)));
    }

    /* renamed from: plus-CB-Mgk4, reason: not valid java name */
    public static final long m8668plusCBMgk4(long j, long j2) {
        float m8601constructorimpl = androidx.compose.ui.unit.Dp.m8601constructorimpl(m8662getXD9Ej5fM(j) + m8662getXD9Ej5fM(j2));
        float m8601constructorimpl2 = androidx.compose.ui.unit.Dp.m8601constructorimpl(m8664getYD9Ej5fM(j) + m8664getYD9Ej5fM(j2));
        return m8657constructorimpl((java.lang.Float.floatToRawIntBits(m8601constructorimpl) << 32) | (4294967295L & java.lang.Float.floatToRawIntBits(m8601constructorimpl2)));
    }

    public final java.lang.String toString() {
        return m8669toStringimpl(this.packedValue);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8669toStringimpl(long j) {
        if (j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
            sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(m8662getXD9Ej5fM(j)));
            sb.append(", ");
            sb.append((java.lang.Object) androidx.compose.ui.unit.Dp.m8612toStringimpl(m8664getYD9Ej5fM(j)));
            sb.append(')');
            return sb.toString();
        }
        return "DpOffset.Unspecified";
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/ui/unit/DpOffset$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/DpOffset;", "Zero", "J", "getZero-RKDOV3M", "()J", "Unspecified", "getUnspecified-RKDOV3M"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getZero-RKDOV3M, reason: not valid java name */
        public final long m8672getZeroRKDOV3M() {
            return androidx.compose.ui.unit.DpOffset.Zero;
        }

        /* renamed from: getUnspecified-RKDOV3M, reason: not valid java name */
        public final long m8671getUnspecifiedRKDOV3M() {
            return androidx.compose.ui.unit.DpOffset.Unspecified;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public static final float m8662getXD9Ej5fM(long j) {
        return androidx.compose.ui.unit.Dp.m8601constructorimpl(java.lang.Float.intBitsToFloat((int) (j >> 32)));
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public static final float m8664getYD9Ej5fM(long j) {
        return androidx.compose.ui.unit.Dp.m8601constructorimpl(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* renamed from: copy-tPigGR8, reason: not valid java name */
    public static final long m8658copytPigGR8(long j, float f, float f2) {
        return m8657constructorimpl((java.lang.Float.floatToRawIntBits(f) << 32) | (java.lang.Float.floatToRawIntBits(f2) & 4294967295L));
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m8670unboximpl() {
        return this.packedValue;
    }

    public final int hashCode() {
        return m8666hashCodeimpl(this.packedValue);
    }

    public final boolean equals(java.lang.Object other) {
        return m8660equalsimpl(this.packedValue, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8666hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8660equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.unit.DpOffset) && j == ((androidx.compose.ui.unit.DpOffset) obj).m8670unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.unit.DpOffset m8656boximpl(long j) {
        return new androidx.compose.ui.unit.DpOffset(j);
    }
}
