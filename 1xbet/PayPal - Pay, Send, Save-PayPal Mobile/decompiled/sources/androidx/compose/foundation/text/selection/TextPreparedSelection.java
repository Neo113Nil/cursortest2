package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/foundation/text/selection/TextPreparedSelection;", "Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "Landroidx/compose/ui/text/AnnotatedString;", "originalText", "Landroidx/compose/ui/text/TextRange;", "originalSelection", "Landroidx/compose/ui/text/TextLayoutResult;", "layoutResult", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "state", "<init>", "(Landroidx/compose/ui/text/AnnotatedString;JLandroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;Lkotlin/jvm/internal/DefaultConstructorMarker;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextPreparedSelection extends androidx.compose.foundation.text.selection.BaseTextPreparedSelection<androidx.compose.foundation.text.selection.TextPreparedSelection> {
    public static final int $stable = 8;

    private TextPreparedSelection(androidx.compose.ui.text.AnnotatedString annotatedString, long j, androidx.compose.ui.text.TextLayoutResult textLayoutResult, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.foundation.text.selection.TextPreparedSelectionState textPreparedSelectionState) {
        super(annotatedString, j, textLayoutResult, offsetMapping, textPreparedSelectionState, null);
    }

    public /* synthetic */ TextPreparedSelection(androidx.compose.ui.text.AnnotatedString annotatedString, long j, androidx.compose.ui.text.TextLayoutResult textLayoutResult, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.foundation.text.selection.TextPreparedSelectionState textPreparedSelectionState, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j, (i & 4) != 0 ? null : textLayoutResult, (i & 8) != 0 ? androidx.compose.ui.text.input.OffsetMapping.INSTANCE.getIdentity() : offsetMapping, (i & 16) != 0 ? new androidx.compose.foundation.text.selection.TextPreparedSelectionState() : textPreparedSelectionState, null);
    }

    public /* synthetic */ TextPreparedSelection(androidx.compose.ui.text.AnnotatedString annotatedString, long j, androidx.compose.ui.text.TextLayoutResult textLayoutResult, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.foundation.text.selection.TextPreparedSelectionState textPreparedSelectionState, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, j, textLayoutResult, offsetMapping, textPreparedSelectionState);
    }
}
