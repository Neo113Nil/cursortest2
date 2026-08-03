package androidx.compose.foundation.text.selection;

/* compiled from: AndroidSelectionHandles.android.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J2\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\u00020\bX\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/text/selection/HandlePositionProvider;", "Landroidx/compose/ui/window/PopupPositionProvider;", "handleReferencePoint", "Landroidx/compose/foundation/text/selection/HandleReferencePoint;", "positionProvider", "Landroidx/compose/foundation/text/selection/OffsetProvider;", "(Landroidx/compose/foundation/text/selection/HandleReferencePoint;Landroidx/compose/foundation/text/selection/OffsetProvider;)V", "prevPosition", "Landroidx/compose/ui/geometry/Offset;", "J", "calculatePosition", "Landroidx/compose/ui/unit/IntOffset;", "anchorBounds", "Landroidx/compose/ui/unit/IntRect;", "windowSize", "Landroidx/compose/ui/unit/IntSize;", "layoutDirection", "Landroidx/compose/ui/unit/LayoutDirection;", "popupContentSize", "calculatePosition-llwVHH4", "(Landroidx/compose/ui/unit/IntRect;JLandroidx/compose/ui/unit/LayoutDirection;J)J", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class HandlePositionProvider implements androidx.compose.ui.window.PopupPositionProvider {
    public static final int $stable = 0;
    private final androidx.compose.foundation.text.selection.HandleReferencePoint handleReferencePoint;
    private final androidx.compose.foundation.text.selection.OffsetProvider positionProvider;
    private long prevPosition = androidx.compose.ui.geometry.Offset.INSTANCE.m1887getZeroF1C5BW0();

    /* compiled from: AndroidSelectionHandles.android.kt */
    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[androidx.compose.foundation.text.selection.HandleReferencePoint.values().length];
            try {
                iArr[androidx.compose.foundation.text.selection.HandleReferencePoint.TopLeft.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.compose.foundation.text.selection.HandleReferencePoint.TopMiddle.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[androidx.compose.foundation.text.selection.HandleReferencePoint.TopRight.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public HandlePositionProvider(androidx.compose.foundation.text.selection.HandleReferencePoint handleReferencePoint, androidx.compose.foundation.text.selection.OffsetProvider offsetProvider) {
        this.handleReferencePoint = handleReferencePoint;
        this.positionProvider = offsetProvider;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4, reason: not valid java name */
    public long mo1002calculatePositionllwVHH4(androidx.compose.ui.unit.IntRect anchorBounds, long windowSize, androidx.compose.ui.unit.LayoutDirection layoutDirection, long popupContentSize) {
        int i;
        long mo850provideF1C5BW0 = this.positionProvider.mo850provideF1C5BW0();
        if (!androidx.compose.ui.geometry.OffsetKt.m1890isSpecifiedk4lQ0M(mo850provideF1C5BW0)) {
            mo850provideF1C5BW0 = this.prevPosition;
        }
        this.prevPosition = mo850provideF1C5BW0;
        int i2 = androidx.compose.foundation.text.selection.HandlePositionProvider.WhenMappings.$EnumSwitchMapping$0[this.handleReferencePoint.ordinal()];
        if (i2 == 1) {
            i = 0;
        } else if (i2 == 2) {
            i = androidx.compose.ui.unit.IntSize.m4652getWidthimpl(popupContentSize) / 2;
        } else {
            if (i2 != 3) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            i = androidx.compose.ui.unit.IntSize.m4652getWidthimpl(popupContentSize);
        }
        long IntOffset = androidx.compose.ui.unit.IntOffsetKt.IntOffset(kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Offset.m1871getXimpl(mo850provideF1C5BW0)), kotlin.math.MathKt.roundToInt(androidx.compose.ui.geometry.Offset.m1872getYimpl(mo850provideF1C5BW0)));
        return androidx.compose.ui.unit.IntOffsetKt.IntOffset((anchorBounds.getLeft() + androidx.compose.ui.unit.IntOffset.m4610getXimpl(IntOffset)) - i, anchorBounds.getTop() + androidx.compose.ui.unit.IntOffset.m4611getYimpl(IntOffset));
    }
}
