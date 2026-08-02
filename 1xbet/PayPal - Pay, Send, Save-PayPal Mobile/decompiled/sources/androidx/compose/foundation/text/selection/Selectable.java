package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u0010\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H&¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H&¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b#\u0010!J\u0017\u0010'\u001a\u00020$2\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020\u001aH&¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u001f2\u0006\u0010\u001b\u001a\u00020\u001aH&¢\u0006\u0004\b*\u0010!R\u0014\u0010.\u001a\u00020+8'X¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/compose/foundation/text/selection/Selectable;", "", "Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;", "builder", "", "appendSelectableInfoToBuilder", "(Landroidx/compose/foundation/text/selection/SelectionLayoutBuilder;)V", "Landroidx/compose/foundation/text/selection/Selection;", "getSelectAllSelection", "()Landroidx/compose/foundation/text/selection/Selection;", "selection", "", "isStartHandle", "Landroidx/compose/ui/geometry/Offset;", "getHandlePosition-dBAh8RU", "(Landroidx/compose/foundation/text/selection/Selection;Z)J", "getHandlePosition", "Landroidx/compose/ui/layout/LayoutCoordinates;", "getLayoutCoordinates", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "()Landroidx/compose/ui/text/TextLayoutResult;", "Landroidx/compose/ui/text/AnnotatedString;", "getText", "()Landroidx/compose/ui/text/AnnotatedString;", "", "offset", "Landroidx/compose/ui/geometry/Rect;", "getBoundingBox", "(I)Landroidx/compose/ui/geometry/Rect;", "", "getLineLeft", "(I)F", "getLineRight", "getCenterYForOffset", "Landroidx/compose/ui/text/TextRange;", "getRangeOfLineContaining--jx7JFs", "(I)J", "getRangeOfLineContaining", "getLastVisibleOffset", "()I", "getLineHeight", "", "getSelectableId", "()J", "selectableId"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface Selectable {
    void appendSelectableInfoToBuilder(androidx.compose.foundation.text.selection.SelectionLayoutBuilder builder);

    androidx.compose.ui.geometry.Rect getBoundingBox(int offset);

    float getCenterYForOffset(int offset);

    /* renamed from: getHandlePosition-dBAh8RU */
    long mo2374getHandlePositiondBAh8RU(androidx.compose.foundation.text.selection.Selection selection, boolean isStartHandle);

    int getLastVisibleOffset();

    androidx.compose.ui.layout.LayoutCoordinates getLayoutCoordinates();

    float getLineHeight(int offset);

    float getLineLeft(int offset);

    float getLineRight(int offset);

    /* renamed from: getRangeOfLineContaining--jx7JFs */
    long mo2375getRangeOfLineContainingjx7JFs(int offset);

    androidx.compose.foundation.text.selection.Selection getSelectAllSelection();

    long getSelectableId();

    androidx.compose.ui.text.AnnotatedString getText();

    androidx.compose.ui.text.TextLayoutResult textLayoutResult();
}
