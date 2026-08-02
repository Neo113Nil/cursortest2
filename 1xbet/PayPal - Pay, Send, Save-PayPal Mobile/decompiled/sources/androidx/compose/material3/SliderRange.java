package androidx.compose.material3;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\b\u0081@\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00148G¢\u0006\f\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00148G¢\u0006\f\u0012\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001a\u0010\u0016\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/material3/SliderRange;", "", "", "packedValue", "constructor-impl", "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "J", "getPackedValue", "()J", "", "getStart-impl", "(J)F", "getStart$annotations", "()V", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "getEndInclusive-impl", "getEndInclusive$annotations", "endInclusive", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class SliderRange {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.material3.SliderRange.Companion INSTANCE = new androidx.compose.material3.SliderRange.Companion(null);
    private static final long Unspecified = androidx.compose.material3.SliderKt.SliderRange(Float.NaN, Float.NaN);
    private final long packedValue;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m3803constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3805equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getEndInclusive$annotations() {
    }

    public static /* synthetic */ void getStart$annotations() {
    }

    private /* synthetic */ SliderRange(long j) {
        this.packedValue = j;
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final float m3807getStartimpl(long j) {
        if (j == Unspecified) {
            throw new java.lang.IllegalStateException("SliderRange is unspecified".toString());
        }
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: getEndInclusive-impl, reason: not valid java name */
    public static final float m3806getEndInclusiveimpl(long j) {
        if (j == Unspecified) {
            throw new java.lang.IllegalStateException("SliderRange is unspecified".toString());
        }
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/material3/SliderRange$Companion;", "", "<init>", "()V", "Landroidx/compose/material3/SliderRange;", "Unspecified", "J", "getUnspecified-FYbKRX4", "()J", "getUnspecified-FYbKRX4$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        /* renamed from: getUnspecified-FYbKRX4$annotations, reason: not valid java name */
        public static /* synthetic */ void m3811getUnspecifiedFYbKRX4$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getUnspecified-FYbKRX4, reason: not valid java name */
        public final long m3812getUnspecifiedFYbKRX4() {
            return androidx.compose.material3.SliderRange.Unspecified;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final java.lang.String toString() {
        return m3809toStringimpl(this.packedValue);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m3809toStringimpl(long j) {
        if (androidx.compose.material3.SliderKt.m3800isSpecifiedIf1S1O4(j)) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(m3807getStartimpl(j));
            sb.append("..");
            sb.append(m3806getEndInclusiveimpl(j));
            return sb.toString();
        }
        return "FloatRange.Unspecified";
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m3810unboximpl() {
        return this.packedValue;
    }

    public final int hashCode() {
        return m3808hashCodeimpl(this.packedValue);
    }

    public final boolean equals(java.lang.Object other) {
        return m3804equalsimpl(this.packedValue, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3808hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m3804equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.material3.SliderRange) && j == ((androidx.compose.material3.SliderRange) obj).m3810unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.material3.SliderRange m3802boximpl(long j) {
        return new androidx.compose.material3.SliderRange(j);
    }
}
