package androidx.compose.ui.text.input;

/* compiled from: CursorAnchorInfoController.android.kt */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\"\u001a\u00020\u001dJ6\u0010#\u001a\u00020\u001d2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010%\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eJ\b\u0010&\u001a\u00020\u001dH\u0002JB\u0010'\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!2\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0015\u001a\u00020\u0016X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006("}, d2 = {"Landroidx/compose/ui/text/input/CursorAnchorInfoController;", "", "rootPositionCalculator", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "inputMethodManager", "Landroidx/compose/ui/text/input/InputMethodManager;", "(Landroidx/compose/ui/input/pointer/PositionCalculator;Landroidx/compose/ui/text/input/InputMethodManager;)V", "androidMatrix", "Landroid/graphics/Matrix;", "builder", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "decorationBoxBounds", "Landroidx/compose/ui/geometry/Rect;", "hasPendingImmediateRequest", "", "includeCharacterBounds", "includeEditorBounds", "includeInsertionMarker", "includeLineBounds", "innerTextFieldBounds", "lock", "matrix", "Landroidx/compose/ui/graphics/Matrix;", "[F", "monitorEnabled", "offsetMapping", "Landroidx/compose/ui/text/input/OffsetMapping;", "textFieldToRootTransform", "Lkotlin/Function1;", "", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "textLayoutResult", "Landroidx/compose/ui/text/TextLayoutResult;", "invalidate", "requestUpdate", "immediate", "monitor", "updateCursorAnchorInfo", "updateTextLayoutResult", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class CursorAnchorInfoController {
    public static final int $stable = 8;
    private androidx.compose.ui.geometry.Rect decorationBoxBounds;
    private boolean hasPendingImmediateRequest;
    private boolean includeCharacterBounds;
    private boolean includeEditorBounds;
    private boolean includeInsertionMarker;
    private boolean includeLineBounds;
    private androidx.compose.ui.geometry.Rect innerTextFieldBounds;
    private final androidx.compose.ui.text.input.InputMethodManager inputMethodManager;
    private boolean monitorEnabled;
    private androidx.compose.ui.text.input.OffsetMapping offsetMapping;
    private final androidx.compose.ui.input.pointer.PositionCalculator rootPositionCalculator;
    private androidx.compose.ui.text.input.TextFieldValue textFieldValue;
    private androidx.compose.ui.text.TextLayoutResult textLayoutResult;
    private final java.lang.Object lock = new java.lang.Object();
    private kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Matrix, kotlin.Unit> textFieldToRootTransform = new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.Matrix, kotlin.Unit>() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$textFieldToRootTransform$1
        /* renamed from: invoke-58bKbWc, reason: not valid java name */
        public final void m4124invoke58bKbWc(float[] fArr) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.Matrix matrix) {
            m4124invoke58bKbWc(matrix.m2373unboximpl());
            return kotlin.Unit.INSTANCE;
        }
    };
    private final android.view.inputmethod.CursorAnchorInfo.Builder builder = new android.view.inputmethod.CursorAnchorInfo.Builder();
    private final float[] matrix = androidx.compose.ui.graphics.Matrix.m2352constructorimpl$default(null, 1, null);
    private final android.graphics.Matrix androidMatrix = new android.graphics.Matrix();

    public CursorAnchorInfoController(androidx.compose.ui.input.pointer.PositionCalculator positionCalculator, androidx.compose.ui.text.input.InputMethodManager inputMethodManager) {
        this.rootPositionCalculator = positionCalculator;
        this.inputMethodManager = inputMethodManager;
    }

    public final void requestUpdate(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
        synchronized (this.lock) {
            this.includeInsertionMarker = includeInsertionMarker;
            this.includeCharacterBounds = includeCharacterBounds;
            this.includeEditorBounds = includeEditorBounds;
            this.includeLineBounds = includeLineBounds;
            if (immediate) {
                this.hasPendingImmediateRequest = true;
                if (this.textFieldValue != null) {
                    updateCursorAnchorInfo();
                }
            }
            this.monitorEnabled = monitor;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void updateTextLayoutResult(androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.ui.text.TextLayoutResult textLayoutResult, kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Matrix, kotlin.Unit> textFieldToRootTransform, androidx.compose.ui.geometry.Rect innerTextFieldBounds, androidx.compose.ui.geometry.Rect decorationBoxBounds) {
        synchronized (this.lock) {
            this.textFieldValue = textFieldValue;
            this.offsetMapping = offsetMapping;
            this.textLayoutResult = textLayoutResult;
            this.textFieldToRootTransform = textFieldToRootTransform;
            this.innerTextFieldBounds = innerTextFieldBounds;
            this.decorationBoxBounds = decorationBoxBounds;
            if (this.hasPendingImmediateRequest || this.monitorEnabled) {
                updateCursorAnchorInfo();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void invalidate() {
        synchronized (this.lock) {
            this.textFieldValue = null;
            this.offsetMapping = null;
            this.textLayoutResult = null;
            this.textFieldToRootTransform = new kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.Matrix, kotlin.Unit>() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$invalidate$1$1
                /* renamed from: invoke-58bKbWc, reason: not valid java name */
                public final void m4123invoke58bKbWc(float[] fArr) {
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ kotlin.Unit invoke(androidx.compose.ui.graphics.Matrix matrix) {
                    m4123invoke58bKbWc(matrix.m2373unboximpl());
                    return kotlin.Unit.INSTANCE;
                }
            };
            this.innerTextFieldBounds = null;
            this.decorationBoxBounds = null;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    private final void updateCursorAnchorInfo() {
        if (this.inputMethodManager.isActive()) {
            this.textFieldToRootTransform.invoke(androidx.compose.ui.graphics.Matrix.m2350boximpl(this.matrix));
            this.rootPositionCalculator.mo3357localToScreen58bKbWc(this.matrix);
            androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt.m1983setFromEL8BTi8(this.androidMatrix, this.matrix);
            androidx.compose.ui.text.input.InputMethodManager inputMethodManager = this.inputMethodManager;
            android.view.inputmethod.CursorAnchorInfo.Builder builder = this.builder;
            androidx.compose.ui.text.input.TextFieldValue textFieldValue = this.textFieldValue;
            kotlin.jvm.internal.Intrinsics.checkNotNull(textFieldValue);
            androidx.compose.ui.text.input.OffsetMapping offsetMapping = this.offsetMapping;
            kotlin.jvm.internal.Intrinsics.checkNotNull(offsetMapping);
            androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.textLayoutResult;
            kotlin.jvm.internal.Intrinsics.checkNotNull(textLayoutResult);
            android.graphics.Matrix matrix = this.androidMatrix;
            androidx.compose.ui.geometry.Rect rect = this.innerTextFieldBounds;
            kotlin.jvm.internal.Intrinsics.checkNotNull(rect);
            androidx.compose.ui.geometry.Rect rect2 = this.decorationBoxBounds;
            kotlin.jvm.internal.Intrinsics.checkNotNull(rect2);
            inputMethodManager.updateCursorAnchorInfo(androidx.compose.ui.text.input.CursorAnchorInfoBuilder_androidKt.build(builder, textFieldValue, offsetMapping, textLayoutResult, matrix, rect, rect2, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds));
            this.hasPendingImmediateRequest = false;
        }
    }
}
