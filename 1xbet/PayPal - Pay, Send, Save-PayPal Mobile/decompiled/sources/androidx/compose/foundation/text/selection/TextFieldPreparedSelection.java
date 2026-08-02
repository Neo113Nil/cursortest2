package androidx.compose.foundation.text.selection;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ0\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00102\u0019\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\r0\f¢\u0006\u0002\b\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0000¢\u0006\u0004\b\u0015\u0010\u0014J\u001b\u0010\u0018\u001a\u00020\u0016*\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010!\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b \u0010\u001c"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "Landroidx/compose/foundation/text/selection/BaseTextPreparedSelection;", "Landroidx/compose/ui/text/input/TextFieldValue;", "currentValue", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "layoutResultProxy", "Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;", "state", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/foundation/text/TextLayoutResultProxy;Landroidx/compose/foundation/text/selection/TextPreparedSelectionState;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/EditCommand;", "Lkotlin/ExtensionFunctionType;", "or", "", "deleteIfSelectedOr", "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "moveCursorUpByPage", "()Landroidx/compose/foundation/text/selection/TextFieldPreparedSelection;", "moveCursorDownByPage", "", "p0", "Camera2StreamConfigurationMap", "(Landroidx/compose/foundation/text/TextLayoutResultProxy;I)I", "Landroidx/compose/ui/text/input/TextFieldValue;", "getCurrentValue", "()Landroidx/compose/ui/text/input/TextFieldValue;", "Landroidx/compose/foundation/text/TextLayoutResultProxy;", "getLayoutResultProxy", "()Landroidx/compose/foundation/text/TextLayoutResultProxy;", "getValue", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
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
        return androidx.compose.ui.text.input.TextFieldValue.m8275copy3r_uNRQ$default(this.currentValue, getAnnotatedString(), getSelection(), (androidx.compose.ui.text.TextRange) null, 4, (java.lang.Object) null);
    }

    public final java.util.List<androidx.compose.ui.text.input.EditCommand> deleteIfSelectedOr(kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.selection.TextFieldPreparedSelection, ? extends androidx.compose.ui.text.input.EditCommand> or) {
        if (!androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(getSelection())) {
            return kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new androidx.compose.ui.text.input.EditCommand[]{new androidx.compose.ui.text.input.CommitTextCommand("", 0), new androidx.compose.ui.text.input.SetSelectionCommand(androidx.compose.ui.text.TextRange.m8037getMinimpl(getSelection()), androidx.compose.ui.text.TextRange.m8037getMinimpl(getSelection()))});
        }
        androidx.compose.ui.text.input.EditCommand invoke = or.invoke(this);
        if (invoke != null) {
            return kotlin.collections.CollectionsKt.listOf(invoke);
        }
        return null;
    }

    public final androidx.compose.foundation.text.selection.TextFieldPreparedSelection moveCursorUpByPage() {
        androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxy;
        androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection = this;
        if (textFieldPreparedSelection.getText$foundation().length() > 0 && (textLayoutResultProxy = this.layoutResultProxy) != null) {
            setCursor(Camera2StreamConfigurationMap(textLayoutResultProxy, -1));
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return textFieldPreparedSelection;
    }

    public final androidx.compose.foundation.text.selection.TextFieldPreparedSelection moveCursorDownByPage() {
        androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxy;
        androidx.compose.foundation.text.selection.TextFieldPreparedSelection textFieldPreparedSelection = this;
        if (textFieldPreparedSelection.getText$foundation().length() > 0 && (textLayoutResultProxy = this.layoutResultProxy) != null) {
            setCursor(Camera2StreamConfigurationMap(textLayoutResultProxy, 1));
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(this, "");
        return textFieldPreparedSelection;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r2 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int Camera2StreamConfigurationMap(androidx.compose.foundation.text.TextLayoutResultProxy textLayoutResultProxy, int i) {
        androidx.compose.ui.geometry.Rect zero;
        androidx.compose.ui.layout.LayoutCoordinates innerTextFieldCoordinates = textLayoutResultProxy.getInnerTextFieldCoordinates();
        if (innerTextFieldCoordinates != null) {
            androidx.compose.ui.layout.LayoutCoordinates decorationBoxCoordinates = textLayoutResultProxy.getDecorationBoxCoordinates();
            zero = decorationBoxCoordinates != null ? androidx.compose.ui.layout.LayoutCoordinates.localBoundingBoxOf$default(decorationBoxCoordinates, innerTextFieldCoordinates, false, 2, null) : null;
        }
        zero = androidx.compose.ui.geometry.Rect.INSTANCE.getZero();
        androidx.compose.ui.geometry.Rect cursorRect = textLayoutResultProxy.getValue().getCursorRect(getOffsetMapping().originalToTransformed(androidx.compose.ui.text.TextRange.m8034getEndimpl(this.currentValue.getSelection())));
        float left = cursorRect.getLeft();
        float top = cursorRect.getTop();
        return getOffsetMapping().transformedToOriginal(textLayoutResultProxy.getValue().m8011getOffsetForPositionk4lQ0M(androidx.compose.ui.geometry.Offset.m5744constructorimpl((java.lang.Float.floatToRawIntBits(top + (java.lang.Float.intBitsToFloat((int) (zero.m5785getSizeNHjbRc() & 4294967295L)) * i)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(left) << 32))));
    }
}
