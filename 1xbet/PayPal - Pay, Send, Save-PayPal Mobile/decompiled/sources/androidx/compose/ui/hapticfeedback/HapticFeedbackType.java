package androidx.compose.ui.hapticfeedback;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class HapticFeedbackType {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.hapticfeedback.HapticFeedbackType.Companion INSTANCE = new androidx.compose.ui.hapticfeedback.HapticFeedbackType.Companion(null);
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m6706constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6708equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ HapticFeedbackType(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    public final java.lang.String toString() {
        return m6710toStringimpl(this.getHighSpeedVideoFpsRanges);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m6710toStringimpl(int i) {
        androidx.compose.ui.hapticfeedback.HapticFeedbackType.Companion companion = INSTANCE;
        return m6708equalsimpl0(i, companion.m6712getConfirm5zf0vsI()) ? "Confirm" : m6708equalsimpl0(i, companion.m6713getContextClick5zf0vsI()) ? "ContextClick" : m6708equalsimpl0(i, companion.m6714getGestureEnd5zf0vsI()) ? "GestureEnd" : m6708equalsimpl0(i, companion.m6715getGestureThresholdActivate5zf0vsI()) ? "GestureThresholdActivate" : m6708equalsimpl0(i, companion.m6716getKeyboardTap5zf0vsI()) ? "KeyboardTap" : m6708equalsimpl0(i, companion.m6717getLongPress5zf0vsI()) ? "LongPress" : m6708equalsimpl0(i, companion.m6718getReject5zf0vsI()) ? "Reject" : m6708equalsimpl0(i, companion.m6719getSegmentFrequentTick5zf0vsI()) ? "SegmentFrequentTick" : m6708equalsimpl0(i, companion.m6720getSegmentTick5zf0vsI()) ? "SegmentTick" : m6708equalsimpl0(i, companion.m6721getTextHandleMove5zf0vsI()) ? "TextHandleMove" : m6708equalsimpl0(i, companion.m6722getToggleOff5zf0vsI()) ? "ToggleOff" : m6708equalsimpl0(i, companion.m6723getToggleOn5zf0vsI()) ? "ToggleOn" : m6708equalsimpl0(i, companion.m6724getVirtualKey5zf0vsI()) ? "VirtualKey" : "Invalid";
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0011\u0010\f\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u000e\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\r\u0010\tR\u0011\u0010\u0010\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\tR\u0011\u0010\u0012\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0011\u0010\u0014\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\tR\u0011\u0010\u0016\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\tR\u0011\u0010\u0018\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\tR\u0011\u0010\u001a\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\tR\u0011\u0010\u001c\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\tR\u0011\u0010\u001e\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\tR\u0011\u0010 \u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\tR\u0011\u0010\"\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b!\u0010\t"}, d2 = {"Landroidx/compose/ui/hapticfeedback/HapticFeedbackType$Companion;", "", "<init>", "()V", "", "Landroidx/compose/ui/hapticfeedback/HapticFeedbackType;", "values", "()Ljava/util/List;", "getConfirm-5zf0vsI", "()I", "Confirm", "getContextClick-5zf0vsI", "ContextClick", "getGestureEnd-5zf0vsI", "GestureEnd", "getGestureThresholdActivate-5zf0vsI", "GestureThresholdActivate", "getKeyboardTap-5zf0vsI", "KeyboardTap", "getLongPress-5zf0vsI", "LongPress", "getReject-5zf0vsI", "Reject", "getSegmentFrequentTick-5zf0vsI", "SegmentFrequentTick", "getSegmentTick-5zf0vsI", "SegmentTick", "getTextHandleMove-5zf0vsI", "TextHandleMove", "getToggleOff-5zf0vsI", "ToggleOff", "getToggleOn-5zf0vsI", "ToggleOn", "getVirtualKey-5zf0vsI", "VirtualKey"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getConfirm-5zf0vsI, reason: not valid java name */
        public final int m6712getConfirm5zf0vsI() {
            return androidx.compose.ui.hapticfeedback.PlatformHapticFeedbackType.INSTANCE.m6725getConfirm5zf0vsI();
        }

        /* renamed from: getContextClick-5zf0vsI, reason: not valid java name */
        public final int m6713getContextClick5zf0vsI() {
            return androidx.compose.ui.hapticfeedback.PlatformHapticFeedbackType.INSTANCE.m6726getContextClick5zf0vsI();
        }

        /* renamed from: getGestureEnd-5zf0vsI, reason: not valid java name */
        public final int m6714getGestureEnd5zf0vsI() {
            return androidx.compose.ui.hapticfeedback.PlatformHapticFeedbackType.INSTANCE.m6727getGestureEnd5zf0vsI();
        }

        /* renamed from: getGestureThresholdActivate-5zf0vsI, reason: not valid java name */
        public final int m6715getGestureThresholdActivate5zf0vsI() {
            return androidx.compose.ui.hapticfeedback.PlatformHapticFeedbackType.INSTANCE.m6728getGestureThresholdActivate5zf0vsI();
        }

        /* renamed from: getKeyboardTap-5zf0vsI, reason: not valid java name */
        public final int m6716getKeyboardTap5zf0vsI() {
            return androidx.compose.ui.hapticfeedback.PlatformHapticFeedbackType.INSTANCE.m6729getKeyboardTap5zf0vsI();
        }

        /* renamed from: getLongPress-5zf0vsI, reason: not valid java name */
        public final int m6717getLongPress5zf0vsI() {
            return androidx.compose.ui.hapticfeedback.PlatformHapticFeedbackType.INSTANCE.m6730getLongPress5zf0vsI();
        }

        /* renamed from: getReject-5zf0vsI, reason: not valid java name */
        public final int m6718getReject5zf0vsI() {
            return androidx.compose.ui.hapticfeedback.PlatformHapticFeedbackType.INSTANCE.m6731getReject5zf0vsI();
        }

        /* renamed from: getSegmentFrequentTick-5zf0vsI, reason: not valid java name */
        public final int m6719getSegmentFrequentTick5zf0vsI() {
            return androidx.compose.ui.hapticfeedback.PlatformHapticFeedbackType.INSTANCE.m6732getSegmentFrequentTick5zf0vsI();
        }

        /* renamed from: getSegmentTick-5zf0vsI, reason: not valid java name */
        public final int m6720getSegmentTick5zf0vsI() {
            return androidx.compose.ui.hapticfeedback.PlatformHapticFeedbackType.INSTANCE.m6733getSegmentTick5zf0vsI();
        }

        /* renamed from: getTextHandleMove-5zf0vsI, reason: not valid java name */
        public final int m6721getTextHandleMove5zf0vsI() {
            return androidx.compose.ui.hapticfeedback.PlatformHapticFeedbackType.INSTANCE.m6734getTextHandleMove5zf0vsI();
        }

        /* renamed from: getToggleOff-5zf0vsI, reason: not valid java name */
        public final int m6722getToggleOff5zf0vsI() {
            return androidx.compose.ui.hapticfeedback.PlatformHapticFeedbackType.INSTANCE.m6735getToggleOff5zf0vsI();
        }

        /* renamed from: getToggleOn-5zf0vsI, reason: not valid java name */
        public final int m6723getToggleOn5zf0vsI() {
            return androidx.compose.ui.hapticfeedback.PlatformHapticFeedbackType.INSTANCE.m6736getToggleOn5zf0vsI();
        }

        /* renamed from: getVirtualKey-5zf0vsI, reason: not valid java name */
        public final int m6724getVirtualKey5zf0vsI() {
            return androidx.compose.ui.hapticfeedback.PlatformHapticFeedbackType.INSTANCE.m6737getVirtualKey5zf0vsI();
        }

        public final java.util.List<androidx.compose.ui.hapticfeedback.HapticFeedbackType> values() {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.hapticfeedback.HapticFeedbackType[]{androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6705boximpl(m6712getConfirm5zf0vsI()), androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6705boximpl(m6713getContextClick5zf0vsI()), androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6705boximpl(m6714getGestureEnd5zf0vsI()), androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6705boximpl(m6715getGestureThresholdActivate5zf0vsI()), androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6705boximpl(m6716getKeyboardTap5zf0vsI()), androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6705boximpl(m6717getLongPress5zf0vsI()), androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6705boximpl(m6718getReject5zf0vsI()), androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6705boximpl(m6719getSegmentFrequentTick5zf0vsI()), androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6705boximpl(m6720getSegmentTick5zf0vsI()), androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6705boximpl(m6721getTextHandleMove5zf0vsI()), androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6705boximpl(m6722getToggleOff5zf0vsI()), androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6705boximpl(m6723getToggleOn5zf0vsI()), androidx.compose.ui.hapticfeedback.HapticFeedbackType.m6705boximpl(m6724getVirtualKey5zf0vsI())});
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final int hashCode() {
        return m6709hashCodeimpl(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object other) {
        return m6707equalsimpl(this.getHighSpeedVideoFpsRanges, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6709hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6707equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.hapticfeedback.HapticFeedbackType) && i == ((androidx.compose.ui.hapticfeedback.HapticFeedbackType) obj).getGetHighSpeedVideoFpsRanges();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.hapticfeedback.HapticFeedbackType m6705boximpl(int i) {
        return new androidx.compose.ui.hapticfeedback.HapticFeedbackType(i);
    }
}
