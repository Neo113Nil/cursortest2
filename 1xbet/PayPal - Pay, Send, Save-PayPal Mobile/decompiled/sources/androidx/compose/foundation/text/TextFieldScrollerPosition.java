package androidx.compose.foundation.text;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b&\b\u0000\u0018\u0000 <2\u00020\u0001:\u0001<B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019R+\u0010\"\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00048G@GX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R+\u0010&\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00048G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R+\u0010-\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f8G@CX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00100\u001a\u00020\u00168\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R+\u0010\t\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00028G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "", "Landroidx/compose/foundation/gestures/Orientation;", "initialOrientation", "", "initial", "<init>", "(Landroidx/compose/foundation/gestures/Orientation;F)V", "()V", "orientation", "Landroidx/compose/ui/geometry/Rect;", "cursorRect", "", "containerSize", "textFieldSize", "", "update", "(Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/ui/geometry/Rect;II)V", "cursorStart", "cursorEnd", "coerceOffset$foundation", "(FFI)V", "Landroidx/compose/ui/text/TextRange;", "selection", "getOffsetToFollow-5zc-tL8", "(J)I", "getOffsetToFollow", "<set-?>", "offset$delegate", "Landroidx/compose/runtime/MutableFloatState;", "getOffset", "()F", "setOffset", "(F)V", "offset", "maximum$delegate", "getMaximum", "setMaximum", "maximum", "viewportSize$delegate", "Landroidx/compose/runtime/MutableIntState;", "getViewportSize", "()I", "setViewportSize", "(I)V", "viewportSize", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/ui/geometry/Rect;", "previousSelection", "J", "getPreviousSelection-d9O1mEE", "()J", "setPreviousSelection-5zc-tL8", "(J)V", "orientation$delegate", "Landroidx/compose/runtime/MutableState;", "getOrientation", "()Landroidx/compose/foundation/gestures/Orientation;", "setOrientation", "(Landroidx/compose/foundation/gestures/Orientation;)V", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextFieldScrollerPosition {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.foundation.text.TextFieldScrollerPosition.Companion INSTANCE = new androidx.compose.foundation.text.TextFieldScrollerPosition.Companion(null);
    private static final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.text.TextFieldScrollerPosition, java.lang.Object> Saver = androidx.compose.runtime.saveable.ListSaverKt.listSaver(new kotlin.jvm.functions.Function2() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
            java.util.List highResolutionOutputSizeshNQ4ISI;
            highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.TextFieldScrollerPosition.getHighResolutionOutputSizeshNQ4ISI((androidx.compose.foundation.text.TextFieldScrollerPosition) obj2);
            return highResolutionOutputSizeshNQ4ISI;
        }
    }, new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.TextFieldScrollerPosition$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final java.lang.Object invoke(java.lang.Object obj) {
            androidx.compose.foundation.text.TextFieldScrollerPosition highSpeedVideoFpsRanges;
            highSpeedVideoFpsRanges = androidx.compose.foundation.text.TextFieldScrollerPosition.getHighSpeedVideoFpsRanges((java.util.List) obj);
            return highSpeedVideoFpsRanges;
        }
    });
    private androidx.compose.ui.geometry.Rect getHighSpeedVideoFpsRangesFor;

    /* renamed from: maximum$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState maximum;

    /* renamed from: offset$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableFloatState offset;

    /* renamed from: orientation$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState orientation;
    private long previousSelection;

    /* renamed from: viewportSize$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableIntState viewportSize;

    public TextFieldScrollerPosition(androidx.compose.foundation.gestures.Orientation orientation, float f) {
        this.offset = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(f);
        this.maximum = androidx.compose.runtime.PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
        this.viewportSize = androidx.compose.runtime.SnapshotIntStateKt.mutableIntStateOf(0);
        this.getHighSpeedVideoFpsRangesFor = androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
        this.previousSelection = androidx.compose.ui.text.TextRange.INSTANCE.m8044getZerod9O1mEE();
        this.orientation = androidx.compose.runtime.SnapshotStateKt.mutableStateOf(orientation, androidx.compose.runtime.SnapshotStateKt.structuralEqualityPolicy());
    }

    public /* synthetic */ TextFieldScrollerPosition(androidx.compose.foundation.gestures.Orientation orientation, float f, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(orientation, (i & 2) != 0 ? 0.0f : f);
    }

    public TextFieldScrollerPosition() {
        this(androidx.compose.foundation.gestures.Orientation.Vertical, 0.0f, 2, null);
    }

    public final float getOffset() {
        return this.offset.getFloatValue();
    }

    public final void setOffset(float f) {
        this.offset.setFloatValue(f);
    }

    private final void setMaximum(float f) {
        this.maximum.setFloatValue(f);
    }

    public final float getMaximum() {
        return this.maximum.getFloatValue();
    }

    private final void setViewportSize(int i) {
        this.viewportSize.setIntValue(i);
    }

    public final int getViewportSize() {
        return this.viewportSize.getIntValue();
    }

    /* renamed from: getPreviousSelection-d9O1mEE, reason: not valid java name and from getter */
    public final long getPreviousSelection() {
        return this.previousSelection;
    }

    /* renamed from: setPreviousSelection-5zc-tL8, reason: not valid java name */
    public final void m2130setPreviousSelection5zctL8(long j) {
        this.previousSelection = j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.foundation.gestures.Orientation getOrientation() {
        return (androidx.compose.foundation.gestures.Orientation) this.orientation.getValue();
    }

    public final void setOrientation(androidx.compose.foundation.gestures.Orientation orientation) {
        this.orientation.setValue(orientation);
    }

    public final void update(androidx.compose.foundation.gestures.Orientation orientation, androidx.compose.ui.geometry.Rect cursorRect, int containerSize, int textFieldSize) {
        float f = textFieldSize - containerSize;
        setMaximum(f);
        if (cursorRect.getLeft() != this.getHighSpeedVideoFpsRangesFor.getLeft() || cursorRect.getTop() != this.getHighSpeedVideoFpsRangesFor.getTop()) {
            boolean z = orientation == androidx.compose.foundation.gestures.Orientation.Vertical;
            coerceOffset$foundation(z ? cursorRect.getTop() : cursorRect.getLeft(), z ? cursorRect.getBottom() : cursorRect.getRight(), containerSize);
            this.getHighSpeedVideoFpsRangesFor = cursorRect;
        }
        setOffset(kotlin.ranges.RangesKt.coerceIn(getOffset(), 0.0f, f));
        setViewportSize(containerSize);
    }

    public final void coerceOffset$foundation(float cursorStart, float cursorEnd, int containerSize) {
        float offset = getOffset();
        float f = containerSize;
        float f2 = offset + f;
        setOffset(getOffset() + ((cursorEnd <= f2 && (cursorStart >= offset || cursorEnd - cursorStart <= f)) ? (cursorStart >= offset || cursorEnd - cursorStart > f) ? 0.0f : cursorStart - offset : cursorEnd - f2));
    }

    /* renamed from: getOffsetToFollow-5zc-tL8, reason: not valid java name */
    public final int m2128getOffsetToFollow5zctL8(long selection) {
        return androidx.compose.ui.text.TextRange.m8039getStartimpl(selection) != androidx.compose.ui.text.TextRange.m8039getStartimpl(this.previousSelection) ? androidx.compose.ui.text.TextRange.m8039getStartimpl(selection) : androidx.compose.ui.text.TextRange.m8034getEndimpl(selection) != androidx.compose.ui.text.TextRange.m8034getEndimpl(this.previousSelection) ? androidx.compose.ui.text.TextRange.m8034getEndimpl(selection) : androidx.compose.ui.text.TextRange.m8037getMinimpl(selection);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00048\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/foundation/text/TextFieldScrollerPosition$Companion;", "", "<init>", "()V", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/foundation/text/TextFieldScrollerPosition;", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "getSaver", "()Landroidx/compose/runtime/saveable/Saver;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final androidx.compose.runtime.saveable.Saver<androidx.compose.foundation.text.TextFieldScrollerPosition, java.lang.Object> getSaver() {
            return androidx.compose.foundation.text.TextFieldScrollerPosition.Saver;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.TextFieldScrollerPosition textFieldScrollerPosition) {
        return kotlin.collections.CollectionsKt.listOf(java.lang.Float.valueOf(textFieldScrollerPosition.getOffset()), java.lang.Boolean.valueOf(textFieldScrollerPosition.getOrientation() == androidx.compose.foundation.gestures.Orientation.Vertical));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.foundation.text.TextFieldScrollerPosition getHighSpeedVideoFpsRanges(java.util.List list) {
        java.lang.Object obj = list.get(1);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "");
        androidx.compose.foundation.gestures.Orientation orientation = ((java.lang.Boolean) obj).booleanValue() ? androidx.compose.foundation.gestures.Orientation.Vertical : androidx.compose.foundation.gestures.Orientation.Horizontal;
        java.lang.Object obj2 = list.get(0);
        kotlin.jvm.internal.Intrinsics.checkNotNull(obj2, "");
        return new androidx.compose.foundation.text.TextFieldScrollerPosition(orientation, ((java.lang.Float) obj2).floatValue());
    }
}
