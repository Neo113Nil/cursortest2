package androidx.compose.ui.unit;

/* compiled from: Dp.kt */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087@\u0018\u0000 %2\u00020\u0001:\u0001%B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000H\u0087\nø\u0001\u0000¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\"H\u0017¢\u0006\u0004\b#\u0010$R\u0016\u0010\u0002\u001a\u00020\u00038\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u00020\t8FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\fR \u0010\r\u001a\u00020\t8FX\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\f\u0012\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\f\u0088\u0001\u0002\u0092\u0001\u00020\u0003\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006&"}, d2 = {"Landroidx/compose/ui/unit/DpOffset;", "", "packedValue", "", "constructor-impl", "(J)J", "getPackedValue$annotations", "()V", "x", "Landroidx/compose/ui/unit/Dp;", "getX-D9Ej5fM$annotations", "getX-D9Ej5fM", "(J)F", "y", "getY-D9Ej5fM$annotations", "getY-D9Ej5fM", "copy", "copy-tPigGR8", "(JFF)J", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(J)I", "minus", "minus-CB-Mgk4", "(JJ)J", "plus", "plus-CB-Mgk4", "toString", "", "toString-impl", "(J)Ljava/lang/String;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class DpOffset {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.unit.DpOffset.Companion INSTANCE = new androidx.compose.ui.unit.DpOffset.Companion(null);
    private static final long Unspecified = androidx.compose.ui.unit.DpKt.m4499DpOffsetYgX7TsA(androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM(), androidx.compose.ui.unit.Dp.INSTANCE.m4498getUnspecifiedD9Ej5fM());
    private static final long Zero;
    private final long packedValue;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.unit.DpOffset m4533boximpl(long j) {
        return new androidx.compose.ui.unit.DpOffset(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m4534constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m4537equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.unit.DpOffset) && j == ((androidx.compose.ui.unit.DpOffset) obj).getPackedValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m4538equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: getX-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4540getXD9Ej5fM$annotations() {
    }

    /* renamed from: getY-D9Ej5fM$annotations, reason: not valid java name */
    public static /* synthetic */ void m4542getYD9Ej5fM$annotations() {
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m4543hashCodeimpl(long j) {
        return kotlin.UByte$$ExternalSyntheticBackport0.m(j);
    }

    public boolean equals(java.lang.Object obj) {
        return m4537equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m4543hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    private /* synthetic */ DpOffset(long j) {
        this.packedValue = j;
    }

    /* renamed from: getX-D9Ej5fM, reason: not valid java name */
    public static final float m4539getXD9Ej5fM(long j) {
        if (j == Unspecified) {
            throw new java.lang.IllegalStateException("DpOffset is unspecified".toString());
        }
        kotlin.jvm.internal.FloatCompanionObject floatCompanionObject = kotlin.jvm.internal.FloatCompanionObject.INSTANCE;
        return androidx.compose.ui.unit.Dp.m4478constructorimpl(java.lang.Float.intBitsToFloat((int) (j >> 32)));
    }

    /* renamed from: getY-D9Ej5fM, reason: not valid java name */
    public static final float m4541getYD9Ej5fM(long j) {
        if (j == Unspecified) {
            throw new java.lang.IllegalStateException("DpOffset is unspecified".toString());
        }
        kotlin.jvm.internal.FloatCompanionObject floatCompanionObject = kotlin.jvm.internal.FloatCompanionObject.INSTANCE;
        return androidx.compose.ui.unit.Dp.m4478constructorimpl(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    /* renamed from: copy-tPigGR8, reason: not valid java name */
    public static final long m4535copytPigGR8(long j, float f, float f2) {
        return androidx.compose.ui.unit.DpKt.m4499DpOffsetYgX7TsA(f, f2);
    }

    /* renamed from: copy-tPigGR8$default, reason: not valid java name */
    public static /* synthetic */ long m4536copytPigGR8$default(long j, float f, float f2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            f = m4539getXD9Ej5fM(j);
        }
        if ((i & 2) != 0) {
            f2 = m4541getYD9Ej5fM(j);
        }
        return m4535copytPigGR8(j, f, f2);
    }

    /* renamed from: minus-CB-Mgk4, reason: not valid java name */
    public static final long m4544minusCBMgk4(long j, long j2) {
        return androidx.compose.ui.unit.DpKt.m4499DpOffsetYgX7TsA(androidx.compose.ui.unit.Dp.m4478constructorimpl(m4539getXD9Ej5fM(j) - m4539getXD9Ej5fM(j2)), androidx.compose.ui.unit.Dp.m4478constructorimpl(m4541getYD9Ej5fM(j) - m4541getYD9Ej5fM(j2)));
    }

    /* renamed from: plus-CB-Mgk4, reason: not valid java name */
    public static final long m4545plusCBMgk4(long j, long j2) {
        return androidx.compose.ui.unit.DpKt.m4499DpOffsetYgX7TsA(androidx.compose.ui.unit.Dp.m4478constructorimpl(m4539getXD9Ej5fM(j) + m4539getXD9Ej5fM(j2)), androidx.compose.ui.unit.Dp.m4478constructorimpl(m4541getYD9Ej5fM(j) + m4541getYD9Ej5fM(j2)));
    }

    public java.lang.String toString() {
        return m4546toStringimpl(this.packedValue);
    }

    /* compiled from: Dp.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0019\u0010\u0003\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\t\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/ui/unit/DpOffset$Companion;", "", "()V", "Unspecified", "Landroidx/compose/ui/unit/DpOffset;", "getUnspecified-RKDOV3M", "()J", "J", "Zero", "getZero-RKDOV3M", "ui-unit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getZero-RKDOV3M, reason: not valid java name */
        public final long m4549getZeroRKDOV3M() {
            return androidx.compose.ui.unit.DpOffset.Zero;
        }

        /* renamed from: getUnspecified-RKDOV3M, reason: not valid java name */
        public final long m4548getUnspecifiedRKDOV3M() {
            return androidx.compose.ui.unit.DpOffset.Unspecified;
        }
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m4546toStringimpl(long j) {
        if (j != INSTANCE.m4548getUnspecifiedRKDOV3M()) {
            return "(" + ((java.lang.Object) androidx.compose.ui.unit.Dp.m4489toStringimpl(m4539getXD9Ej5fM(j))) + ", " + ((java.lang.Object) androidx.compose.ui.unit.Dp.m4489toStringimpl(m4541getYD9Ej5fM(j))) + ')';
        }
        return "DpOffset.Unspecified";
    }

    static {
        float f = 0;
        Zero = androidx.compose.ui.unit.DpKt.m4499DpOffsetYgX7TsA(androidx.compose.ui.unit.Dp.m4478constructorimpl(f), androidx.compose.ui.unit.Dp.m4478constructorimpl(f));
    }
}
