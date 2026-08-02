package androidx.compose.runtime.internal;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/runtime/internal/AtomicBoolean;", "", "Landroidx/compose/runtime/internal/AtomicInt;", "wrapped", "constructor-impl", "(Landroidx/compose/runtime/internal/AtomicInt;)Landroidx/compose/runtime/internal/AtomicInt;", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "(Z)Landroidx/compose/runtime/internal/AtomicInt;", "get-impl", "(Landroidx/compose/runtime/internal/AtomicInt;)Z", "get", "", "set-impl", "(Landroidx/compose/runtime/internal/AtomicInt;Z)V", "set", com.paypal.oslo.feature.inappcheckout.domain.util.LoggerParameterKeys.NEW_VALUE_KEY, "getAndSet-impl", "(Landroidx/compose/runtime/internal/AtomicInt;Z)Z", "getAndSet", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/internal/AtomicInt;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class AtomicBoolean {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final androidx.compose.runtime.internal.AtomicInt getHighSpeedVideoSizes;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static androidx.compose.runtime.internal.AtomicInt m5419constructorimpl(androidx.compose.runtime.internal.AtomicInt atomicInt) {
        return atomicInt;
    }

    private /* synthetic */ AtomicBoolean(androidx.compose.runtime.internal.AtomicInt atomicInt) {
        this.getHighSpeedVideoSizes = atomicInt;
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ androidx.compose.runtime.internal.AtomicInt m5421constructorimpl$default(androidx.compose.runtime.internal.AtomicInt atomicInt, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 1) != 0) {
            atomicInt = new androidx.compose.runtime.internal.AtomicInt(0);
        }
        return m5419constructorimpl(atomicInt);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static androidx.compose.runtime.internal.AtomicInt m5420constructorimpl(boolean z) {
        return m5419constructorimpl(new androidx.compose.runtime.internal.AtomicInt(z ? 1 : 0));
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final boolean m5424getimpl(androidx.compose.runtime.internal.AtomicInt atomicInt) {
        return atomicInt.get() != 0;
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m5427setimpl(androidx.compose.runtime.internal.AtomicInt atomicInt, boolean z) {
        atomicInt.set(z ? 1 : 0);
    }

    /* renamed from: getAndSet-impl, reason: not valid java name */
    public static final boolean m5425getAndSetimpl(androidx.compose.runtime.internal.AtomicInt atomicInt, boolean z) {
        return atomicInt.compareAndSet(1, z ? 1 : 0);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ androidx.compose.runtime.internal.AtomicInt getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    public final java.lang.String toString() {
        return m5428toStringimpl(this.getHighSpeedVideoSizes);
    }

    public final int hashCode() {
        return m5426hashCodeimpl(this.getHighSpeedVideoSizes);
    }

    public final boolean equals(java.lang.Object other) {
        return m5422equalsimpl(this.getHighSpeedVideoSizes, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m5428toStringimpl(androidx.compose.runtime.internal.AtomicInt atomicInt) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AtomicBoolean(wrapped=");
        sb.append(atomicInt);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5426hashCodeimpl(androidx.compose.runtime.internal.AtomicInt atomicInt) {
        return atomicInt.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5423equalsimpl0(androidx.compose.runtime.internal.AtomicInt atomicInt, androidx.compose.runtime.internal.AtomicInt atomicInt2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(atomicInt, atomicInt2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5422equalsimpl(androidx.compose.runtime.internal.AtomicInt atomicInt, java.lang.Object obj) {
        return (obj instanceof androidx.compose.runtime.internal.AtomicBoolean) && kotlin.jvm.internal.Intrinsics.areEqual(atomicInt, ((androidx.compose.runtime.internal.AtomicBoolean) obj).getGetHighSpeedVideoSizes());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.runtime.internal.AtomicBoolean m5418boximpl(androidx.compose.runtime.internal.AtomicInt atomicInt) {
        return new androidx.compose.runtime.internal.AtomicBoolean(atomicInt);
    }
}
