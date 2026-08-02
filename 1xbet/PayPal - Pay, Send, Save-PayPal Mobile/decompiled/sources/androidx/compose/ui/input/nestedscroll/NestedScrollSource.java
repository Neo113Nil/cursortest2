package androidx.compose.ui.input.nestedscroll;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class NestedScrollSource {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.input.nestedscroll.NestedScrollSource.Companion INSTANCE = new androidx.compose.ui.input.nestedscroll.NestedScrollSource.Companion(null);
    private static final int Drag;
    private static final int Fling;
    private static final int Relocate;
    private static final int SideEffect;
    private static final int UserInput;
    private static final int Wheel;
    private final int getHighSpeedVideoFpsRangesFor;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7112constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7114equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ NestedScrollSource(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public final java.lang.String toString() {
        return m7116toStringimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m7116toStringimpl(int i) {
        return m7114equalsimpl0(i, UserInput) ? "UserInput" : m7114equalsimpl0(i, SideEffect) ? "SideEffect" : m7114equalsimpl0(i, Relocate) ? "Relocate" : "Invalid";
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR \u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\r\u0010\u0003\u001a\u0004\b\f\u0010\bR \u0010\u000e\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000f\u0010\bR \u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0012\u0010\bR \u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0015\u0010\b"}, d2 = {"Landroidx/compose/ui/input/nestedscroll/NestedScrollSource$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "UserInput", com.visa.cbp.getEncExpo.warmup, "getUserInput-WNlRxjI", "()I", "SideEffect", "getSideEffect-WNlRxjI", "Drag", "getDrag-WNlRxjI", "getDrag-WNlRxjI$annotations", "Fling", "getFling-WNlRxjI", "getFling-WNlRxjI$annotations", "Relocate", "getRelocate-WNlRxjI", "getRelocate-WNlRxjI$annotations", "Wheel", "getWheel-WNlRxjI", "getWheel-WNlRxjI$annotations"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        @kotlin.Deprecated(message = "This has been replaced by UserInput.", replaceWith = @kotlin.ReplaceWith(expression = "NestedScrollSource.UserInput", imports = {"import androidx.compose.ui.input.nestedscroll.NestedScrollSource.Companion.UserInput"}))
        /* renamed from: getDrag-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m7118getDragWNlRxjI$annotations() {
        }

        @kotlin.Deprecated(message = "This has been replaced by SideEffect.", replaceWith = @kotlin.ReplaceWith(expression = "NestedScrollSource.SideEffect", imports = {"import androidx.compose.ui.input.nestedscroll.NestedScrollSource.Companion.SideEffect"}))
        /* renamed from: getFling-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m7119getFlingWNlRxjI$annotations() {
        }

        @kotlin.Deprecated(message = "Do not use. Will be removed in the future.")
        /* renamed from: getRelocate-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m7120getRelocateWNlRxjI$annotations() {
        }

        @kotlin.Deprecated(message = "This has been replaced by UserInput.", replaceWith = @kotlin.ReplaceWith(expression = "NestedScrollSource.UserInput", imports = {"import androidx.compose.ui.input.nestedscroll.NestedScrollSource.Companion.UserInput"}))
        /* renamed from: getWheel-WNlRxjI$annotations, reason: not valid java name */
        public static /* synthetic */ void m7121getWheelWNlRxjI$annotations() {
        }

        private Companion() {
        }

        /* renamed from: getUserInput-WNlRxjI, reason: not valid java name */
        public final int m7126getUserInputWNlRxjI() {
            return androidx.compose.ui.input.nestedscroll.NestedScrollSource.UserInput;
        }

        /* renamed from: getSideEffect-WNlRxjI, reason: not valid java name */
        public final int m7125getSideEffectWNlRxjI() {
            return androidx.compose.ui.input.nestedscroll.NestedScrollSource.SideEffect;
        }

        /* renamed from: getDrag-WNlRxjI, reason: not valid java name */
        public final int m7122getDragWNlRxjI() {
            return androidx.compose.ui.input.nestedscroll.NestedScrollSource.Drag;
        }

        /* renamed from: getFling-WNlRxjI, reason: not valid java name */
        public final int m7123getFlingWNlRxjI() {
            return androidx.compose.ui.input.nestedscroll.NestedScrollSource.Fling;
        }

        /* renamed from: getRelocate-WNlRxjI, reason: not valid java name */
        public final int m7124getRelocateWNlRxjI() {
            return androidx.compose.ui.input.nestedscroll.NestedScrollSource.Relocate;
        }

        /* renamed from: getWheel-WNlRxjI, reason: not valid java name */
        public final int m7127getWheelWNlRxjI() {
            return androidx.compose.ui.input.nestedscroll.NestedScrollSource.Wheel;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        int m7112constructorimpl = m7112constructorimpl(1);
        UserInput = m7112constructorimpl;
        int m7112constructorimpl2 = m7112constructorimpl(2);
        SideEffect = m7112constructorimpl2;
        Drag = m7112constructorimpl;
        Fling = m7112constructorimpl2;
        Relocate = m7112constructorimpl(3);
        Wheel = m7112constructorimpl;
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final int hashCode() {
        return m7115hashCodeimpl(this.getHighSpeedVideoFpsRangesFor);
    }

    public final boolean equals(java.lang.Object other) {
        return m7113equalsimpl(this.getHighSpeedVideoFpsRangesFor, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7115hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7113equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.input.nestedscroll.NestedScrollSource) && i == ((androidx.compose.ui.input.nestedscroll.NestedScrollSource) obj).getGetHighSpeedVideoFpsRangesFor();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.input.nestedscroll.NestedScrollSource m7111boximpl(int i) {
        return new androidx.compose.ui.input.nestedscroll.NestedScrollSource(i);
    }
}
