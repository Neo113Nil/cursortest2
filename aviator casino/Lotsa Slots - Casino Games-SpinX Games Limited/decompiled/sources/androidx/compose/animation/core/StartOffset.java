package androidx.compose.animation.core;

/* compiled from: AnimationSpec.kt */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0002\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\u0006\u0010\nJ\u001a\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0015\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00058Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u000e\u0010\b\u001a\u00020\tX\u0080\u0004¢\u0006\u0002\n\u0000\u0088\u0001\b\u0092\u0001\u00020\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0019"}, d2 = {"Landroidx/compose/animation/core/StartOffset;", "", "offsetMillis", "", "offsetType", "Landroidx/compose/animation/core/StartOffsetType;", "constructor-impl", "(II)J", "value", "", "(J)J", "getOffsetMillis-impl", "(J)I", "getOffsetType-Eo1U57Q", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class StartOffset {
    private final long value;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.animation.core.StartOffset m147boximpl(long j) {
        return new androidx.compose.animation.core.StartOffset(j);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static long m149constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m151equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.animation.core.StartOffset) && j == ((androidx.compose.animation.core.StartOffset) obj).getValue();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m152equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m155hashCodeimpl(long j) {
        return kotlin.UByte$$ExternalSyntheticBackport0.m(j);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m156toStringimpl(long j) {
        return "StartOffset(value=" + j + ')';
    }

    public boolean equals(java.lang.Object obj) {
        return m151equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m155hashCodeimpl(this.value);
    }

    public java.lang.String toString() {
        return m156toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getValue() {
        return this.value;
    }

    private /* synthetic */ StartOffset(long j) {
        this.value = j;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m148constructorimpl(int i, int i2) {
        return m149constructorimpl(i * i2);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ long m150constructorimpl$default(int i, int i2, int i3, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i3 & 2) != 0) {
            i2 = androidx.compose.animation.core.StartOffsetType.INSTANCE.m165getDelayEo1U57Q();
        }
        return m148constructorimpl(i, i2);
    }

    /* renamed from: getOffsetMillis-impl, reason: not valid java name */
    public static final int m153getOffsetMillisimpl(long j) {
        return java.lang.Math.abs((int) j);
    }

    /* renamed from: getOffsetType-Eo1U57Q, reason: not valid java name */
    public static final int m154getOffsetTypeEo1U57Q(long j) {
        boolean z = j > 0;
        if (z) {
            return androidx.compose.animation.core.StartOffsetType.INSTANCE.m166getFastForwardEo1U57Q();
        }
        if (z) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return androidx.compose.animation.core.StartOffsetType.INSTANCE.m165getDelayEo1U57Q();
    }
}
