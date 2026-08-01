package androidx.compose.foundation.text.selection;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: MultiWidgetSelectionDelegate.kt */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J(\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\n\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0016J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\n\u0010\u001d\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u001e\u001a\u00020\u001fH\u0016J_\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0012\u0004\u0012\u00020\u00150!2\u0006\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\u00112\b\u0010$\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010%\u001a\u00020\u00062\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0013H\u0016ø\u0001\u0000ø\u0001\u0002¢\u0006\u0004\b)\u0010*R\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006+"}, d2 = {"Landroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate;", "Landroidx/compose/foundation/text/selection/Selectable;", "selectableId", "", "coordinatesCallback", "Lkotlin/Function0;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "layoutResultCallback", "Landroidx/compose/ui/text/TextLayoutResult;", "(JLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getSelectableId", "()J", "getBoundingBox", "Landroidx/compose/ui/geometry/Rect;", "offset", "", "getHandlePosition", "Landroidx/compose/ui/geometry/Offset;", "selection", "Landroidx/compose/foundation/text/selection/Selection;", "isStartHandle", "", "getHandlePosition-dBAh8RU", "(Landroidx/compose/foundation/text/selection/Selection;Z)J", "getLayoutCoordinates", "getRangeOfLineContaining", "Landroidx/compose/ui/text/TextRange;", "getRangeOfLineContaining--jx7JFs", "(I)J", "getSelectAllSelection", "getText", "Landroidx/compose/ui/text/AnnotatedString;", "updateSelection", "Lkotlin/Pair;", "startHandlePosition", "endHandlePosition", "previousHandlePosition", "containerLayoutCoordinates", "adjustment", "Landroidx/compose/foundation/text/selection/SelectionAdjustment;", "previousSelection", "updateSelection-qCDeeow", "(JJLandroidx/compose/ui/geometry/Offset;ZLandroidx/compose/ui/layout/LayoutCoordinates;Landroidx/compose/foundation/text/selection/SelectionAdjustment;Landroidx/compose/foundation/text/selection/Selection;)Lkotlin/Pair;", "foundation_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MultiWidgetSelectionDelegate implements Selectable {
    private final Function0<LayoutCoordinates> coordinatesCallback;
    private final Function0<TextLayoutResult> layoutResultCallback;
    private final long selectableId;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiWidgetSelectionDelegate(long j, Function0<? extends LayoutCoordinates> coordinatesCallback, Function0<TextLayoutResult> layoutResultCallback) {
        Intrinsics.checkNotNullParameter(coordinatesCallback, "coordinatesCallback");
        Intrinsics.checkNotNullParameter(layoutResultCallback, "layoutResultCallback");
        this.selectableId = j;
        this.coordinatesCallback = coordinatesCallback;
        this.layoutResultCallback = layoutResultCallback;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public long getSelectableId() {
        return this.selectableId;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* renamed from: updateSelection-qCDeeow, reason: not valid java name */
    public Pair<Selection, Boolean> mo785updateSelectionqCDeeow(long startHandlePosition, long endHandlePosition, Offset previousHandlePosition, boolean isStartHandle, LayoutCoordinates containerLayoutCoordinates, SelectionAdjustment adjustment, Selection previousSelection) {
        TextLayoutResult invoke;
        Intrinsics.checkNotNullParameter(containerLayoutCoordinates, "containerLayoutCoordinates");
        Intrinsics.checkNotNullParameter(adjustment, "adjustment");
        if (previousSelection != null && (getSelectableId() != previousSelection.getStart().getSelectableId() || getSelectableId() != previousSelection.getEnd().getSelectableId())) {
            throw new IllegalArgumentException("The given previousSelection doesn't belong to this selectable.".toString());
        }
        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates != null && (invoke = this.layoutResultCallback.invoke()) != null) {
            long mo3124localPositionOfR5De75A = containerLayoutCoordinates.mo3124localPositionOfR5De75A(layoutCoordinates, Offset.INSTANCE.m1408getZeroF1C5BW0());
            return MultiWidgetSelectionDelegateKt.m789getTextSelectionInfoyM0VcXU(invoke, Offset.m1396minusMKHz9U(startHandlePosition, mo3124localPositionOfR5De75A), Offset.m1396minusMKHz9U(endHandlePosition, mo3124localPositionOfR5De75A), previousHandlePosition != null ? Offset.m1381boximpl(Offset.m1396minusMKHz9U(previousHandlePosition.getPackedValue(), mo3124localPositionOfR5De75A)) : null, getSelectableId(), adjustment, previousSelection, isStartHandle);
        }
        return new Pair<>(null, false);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public Selection getSelectAllSelection() {
        Selection m787getAssembledSelectionInfovJH6DeI;
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return null;
        }
        m787getAssembledSelectionInfovJH6DeI = MultiWidgetSelectionDelegateKt.m787getAssembledSelectionInfovJH6DeI(TextRangeKt.TextRange(0, invoke.getLayoutInput().getText().length()), false, getSelectableId(), invoke);
        return m787getAssembledSelectionInfovJH6DeI;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* renamed from: getHandlePosition-dBAh8RU, reason: not valid java name */
    public long mo783getHandlePositiondBAh8RU(Selection selection, boolean isStartHandle) {
        TextLayoutResult invoke;
        Intrinsics.checkNotNullParameter(selection, "selection");
        if ((isStartHandle && selection.getStart().getSelectableId() != getSelectableId()) || (!isStartHandle && selection.getEnd().getSelectableId() != getSelectableId())) {
            return Offset.INSTANCE.m1408getZeroF1C5BW0();
        }
        if (getLayoutCoordinates() != null && (invoke = this.layoutResultCallback.invoke()) != null) {
            return TextSelectionDelegateKt.getSelectionHandleCoordinates(invoke, (isStartHandle ? selection.getStart() : selection.getEnd()).getOffset(), isStartHandle, selection.getHandlesCrossed());
        }
        return Offset.INSTANCE.m1408getZeroF1C5BW0();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates invoke = this.coordinatesCallback.invoke();
        if (invoke == null || !invoke.isAttached()) {
            return null;
        }
        return invoke;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public AnnotatedString getText() {
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        return invoke == null ? new AnnotatedString("", null, null, 6, null) : invoke.getLayoutInput().getText();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public Rect getBoundingBox(int offset) {
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return Rect.INSTANCE.getZero();
        }
        int length = invoke.getLayoutInput().getText().length();
        if (length < 1) {
            return Rect.INSTANCE.getZero();
        }
        return invoke.getBoundingBox(RangesKt.coerceIn(offset, 0, length - 1));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* renamed from: getRangeOfLineContaining--jx7JFs, reason: not valid java name */
    public long mo784getRangeOfLineContainingjx7JFs(int offset) {
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return TextRange.INSTANCE.m3491getZerod9O1mEE();
        }
        int length = invoke.getLayoutInput().getText().length();
        if (length < 1) {
            return TextRange.INSTANCE.m3491getZerod9O1mEE();
        }
        int lineForOffset = invoke.getLineForOffset(RangesKt.coerceIn(offset, 0, length - 1));
        return TextRangeKt.TextRange(invoke.getLineStart(lineForOffset), invoke.getLineEnd(lineForOffset, true));
    }
}
