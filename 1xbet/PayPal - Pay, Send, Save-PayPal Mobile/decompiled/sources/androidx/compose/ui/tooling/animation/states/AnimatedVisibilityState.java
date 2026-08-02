package androidx.compose.ui.tooling.animation.states;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0081@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0010\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "Landroidx/compose/ui/tooling/animation/states/ComposeAnimationState;", "", "toString-impl", "(Ljava/lang/String;)Ljava/lang/String;", "toString", "", "other", "", "equals-impl", "(Ljava/lang/String;Ljava/lang/Object;)Z", "equals", "", "hashCode-impl", "(Ljava/lang/String;)I", "hashCode", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class AnimatedVisibilityState implements androidx.compose.ui.tooling.animation.states.ComposeAnimationState {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState.Companion INSTANCE = new androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState.Companion(null);
    private static final java.lang.String Enter = "Enter";
    private static final java.lang.String Exit = com.ingo.sdk.kotlin.common.analytics.IEventNames.Exit;
    private final java.lang.String value;

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8537toStringimpl(java.lang.String str) {
        return str;
    }

    private /* synthetic */ AnimatedVisibilityState(java.lang.String str) {
        this.value = str;
    }

    public final java.lang.String getValue() {
        return this.value;
    }

    public final java.lang.String toString() {
        return m8537toStringimpl(this.value);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b"}, d2 = {"Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/tooling/animation/states/AnimatedVisibilityState;", "Enter", "Ljava/lang/String;", "getEnter-jXw82LU", "()Ljava/lang/String;", com.ingo.sdk.kotlin.common.analytics.IEventNames.Exit, "getExit-jXw82LU"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getEnter-jXw82LU, reason: not valid java name */
        public final java.lang.String m8539getEnterjXw82LU() {
            return androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState.Enter;
        }

        /* renamed from: getExit-jXw82LU, reason: not valid java name */
        public final java.lang.String m8540getExitjXw82LU() {
            return androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState.Exit;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ java.lang.String m8538unboximpl() {
        return this.value;
    }

    public final int hashCode() {
        return m8536hashCodeimpl(this.value);
    }

    public final boolean equals(java.lang.Object obj) {
        return m8534equalsimpl(this.value, obj);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8536hashCodeimpl(java.lang.String str) {
        return str.hashCode();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8535equalsimpl0(java.lang.String str, java.lang.String str2) {
        return kotlin.jvm.internal.Intrinsics.areEqual(str, str2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8534equalsimpl(java.lang.String str, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState) && kotlin.jvm.internal.Intrinsics.areEqual(str, ((androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState) obj).m8538unboximpl());
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState m8533boximpl(java.lang.String str) {
        return new androidx.compose.ui.tooling.animation.states.AnimatedVisibilityState(str);
    }
}
