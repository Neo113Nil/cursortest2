package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u000bR\u0012\u0010\u0013\u001a\u00020\u00078Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0015\u001a\u00020\u00078Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012R\u0012\u0010\u0017\u001a\u00020\u00078Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/ProcessResult;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", com.visa.cbp.getEncExpo.warmup, "getValue", "getDispatchedToAPointerInputModifier-impl", "(I)Z", "dispatchedToAPointerInputModifier", "getAnyMovementConsumed-impl", "anyMovementConsumed", "getAnyChangeConsumed-impl", "anyChangeConsumed"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class ProcessResult {
    private final int value;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7311constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7313equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: getAnyChangeConsumed-impl, reason: not valid java name */
    public static final boolean m7314getAnyChangeConsumedimpl(int i) {
        return (i & 4) != 0;
    }

    /* renamed from: getAnyMovementConsumed-impl, reason: not valid java name */
    public static final boolean m7315getAnyMovementConsumedimpl(int i) {
        return (i & 2) != 0;
    }

    /* renamed from: getDispatchedToAPointerInputModifier-impl, reason: not valid java name */
    public static final boolean m7316getDispatchedToAPointerInputModifierimpl(int i) {
        return (i & 1) != 0;
    }

    private /* synthetic */ ProcessResult(int i) {
        this.value = i;
    }

    public final int getValue() {
        return this.value;
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7319unboximpl() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m7318toStringimpl(this.value);
    }

    public final int hashCode() {
        return m7317hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object other) {
        return m7312equalsimpl(this.value, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m7318toStringimpl(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ProcessResult(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7317hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7312equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.input.pointer.ProcessResult) && i == ((androidx.compose.ui.input.pointer.ProcessResult) obj).m7319unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.input.pointer.ProcessResult m7310boximpl(int i) {
        return new androidx.compose.ui.input.pointer.ProcessResult(i);
    }
}
