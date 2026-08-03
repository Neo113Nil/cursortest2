package androidx.compose.foundation.text.selection;

/* compiled from: TextPreparedSelection.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ)\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0019\u0010\u0014\u001a\u0015\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0015¢\u0006\u0002\b\u0016J\u0006\u0010\u0017\u001a\u00020\u0000J\u0006\u0010\u0018\u001a\u00020\u0000J\u0014\u0010\u0019\u001a\u00020\u001a*\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\f¨\u0006\u001c"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "currentValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "layoutResultProxy", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "state", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/TextLayoutResultProxy;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;)V", "getCurrentValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "getLayoutResultProxy", "()Landroidx/compose/foundation/text/TextLayoutResultProxy;", "value", "getValue", "deleteIfSelectedOr", "", "Landroidx/compose/ui/text/input/EditCommand;", "or", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "moveCursorDownByPage", "moveCursorUpByPage", "jumpByPagesOffset", "", "pagesAmount", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextFieldPreparedSelection extends androidx.compose.foundation.text.selection.BaseTextPreparedSelection<androidx.compose.foundation.text.selection.TextFieldPreparedSelection> {
    public static final int $stable = 8;
    private final androidx.compose.ui.text.input.TextFieldValue currentValue;
    private final androidx.compose.foundation.text.TextLayoutResultProxy layoutResultProxy;

    public final androidx.compose.ui.text.input.TextFieldValue getCurrentValue() {
        return this.currentValue;
    }

    public /* synthetic */ TextFieldPreparedSelection(androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxy, androidx.compose.foundation.text.selection.TextPreparedSelectionState textPreparedSelectionState, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldValue, (i & 2) != 0 ? androidx.compose.ui.text.input.OffsetMapping.INSTANCE.getIdentity() : offsetMapping, textLayoutResultProxy, (i & 8) != 0 ? new androidx.compose.foundation.text.selection.TextPreparedSelectionState() : textPreparedSelectionState);
    }

    public final androidx.compose.foundation.text.TextLayoutResultProxy getLayoutResultProxy() {
        return this.layoutResultProxy;
    }

    public TextFieldPreparedSelection(androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxy, androidx.compose.foundation.text.selection.TextPreparedSelectionState textPreparedSelectionState) {
        super(textFieldValue.getAnnotatedString(), textFieldValue.getSelection(), textLayoutResultProxy != null ? textLayoutResultProxy.getValue() : null, offsetMapping, textPreparedSelectionState, null);
        this.currentValue = textFieldValue;
        this.layoutResultProxy = textLayoutResultProxy;
    }

    public final androidx.compose.ui.text.input.TextFieldValue getValue() {
        return androidx.compose.ui.text.input.TextFieldValue.m4200copy3r_uNRQ$default(this.currentValue, getAnnotatedString(), getSelection(), (androidx.compose.ui.text.TextRange) null, 4, (java.lang.Object) null);
    }

    public final java.util.List<androidx.compose.ui.text.input.EditCommand> deleteIfSelectedOr(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.selection.TextFieldPreparedSelection, ? extends androidx.compose.ui.text.input.EditCommand> or) {
        if (androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(getSelection())) {
            androidx.compose.ui.text.input.EditCommand invoke = or.invoke(this);
            if (invoke != null) {
                return kotlin.collections.CollectionsKt.listOf(invoke);
            }
            return null;
        }
        return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.text.input.EditCommand[]{new androidx.compose.ui.text.input.CommitTextCommand("", 0), new androidx.compose.ui.text.input.SetSelectionCommand(androidx.compose.ui.text.TextRange.m3962getMinimpl(getSelection()), androidx.compose.ui.text.TextRange.m3962getMinimpl(getSelection()))});
    }

    public final androidx.compose.foundation.text.selection.TextFieldPreparedSelection moveCursorUpByPage() {
        androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxy;
        androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection = this;
        if (textFieldPreparedSelection.getText$foundation_release().length() > 0 && (textLayoutResultProxy = this.layoutResultProxy) != null) {
            setCursor(jumpByPagesOffset(textLayoutResultProxy, -1));
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return textFieldPreparedSelection;
    }

    public final androidx.compose.foundation.text.selection.TextFieldPreparedSelection moveCursorDownByPage() {
        androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxy;
        androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection = this;
        if (textFieldPreparedSelection.getText$foundation_release().length() > 0 && (textLayoutResultProxy = this.layoutResultProxy) != null) {
            setCursor(jumpByPagesOffset(textLayoutResultProxy, 1));
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return textFieldPreparedSelection;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r2 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int jumpByPagesOffset(androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxy, int i) {
        androidx.compose.ui.geometry.Rect zero;
        androidx.compose.ui.layout.LayoutCoordinates innerTextFieldCoordinates = textLayoutResultProxy.getInnerTextFieldCoordinates();
        if (innerTextFieldCoordinates != null) {
            androidx.compose.ui.layout.LayoutCoordinates decorationBoxCoordinates = textLayoutResultProxy.getDecorationBoxCoordinates();
            zero = decorationBoxCoordinates != null ? androidx.compose.ui.layout.LayoutCoordinates.CC.localBoundingBoxOf$default(decorationBoxCoordinates, innerTextFieldCoordinates, false, 2, null) : null;
        }
        zero = androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
        androidx.compose.ui.geometry.Rect cursorRect = textLayoutResultProxy.getValue().getCursorRect(getOffsetMapping().originalToTransformed(androidx.compose.ui.text.TextRange.m3959getEndimpl(this.currentValue.getSelection())));
        return getOffsetMapping().transformedToOriginal(textLayoutResultProxy.getValue().m3936getOffsetForPositionk4lQ0M(androidx.compose.ui.geometry.OffsetKt.Offset(cursorRect.getLeft(), cursorRect.getTop() + (androidx.compose.ui.geometry.Size.m1937getHeightimpl(zero.m1904getSizeNHjbRc()) * i))));
    }
}
