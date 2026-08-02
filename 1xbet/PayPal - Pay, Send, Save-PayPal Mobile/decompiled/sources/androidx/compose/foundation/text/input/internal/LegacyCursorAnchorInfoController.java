package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ=\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\u0012J5\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0004H\u0002¢\u0006\u0004\b \u0010\u001fR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010(\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010*R\u0016\u0010.\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010*R\u0016\u0010/\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010*R\u0016\u00100\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010*R\u0016\u0010#\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010*R\u0018\u0010-\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00107\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010)\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u00108R\u0018\u0010&\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u00108R\u0014\u0010!\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010:R\u0014\u0010<\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010;R\u0014\u00101\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010>"}, d2 = {"Landroidx/compose/foundation/text/input/internal/LegacyCursorAnchorInfoController;", "", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Matrix;", "", "localToScreen", "Landroidx/compose/foundation/text/input/internal/InputMethodManager;", "inputMethodManager", "<init>", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/input/internal/InputMethodManager;)V", "", "immediate", "monitor", "includeInsertionMarker", "includeCharacterBounds", "includeEditorBounds", "includeLineBounds", "requestUpdate", "(ZZZZZZ)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "Landroidx/compose/ui/text/input/OffsetMapping;", "offsetMapping", "Landroidx/compose/ui/text/TextLayoutResult;", "textLayoutResult", "Landroidx/compose/ui/geometry/Rect;", "innerTextFieldBounds", "decorationBoxBounds", "updateTextLayoutResult", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/OffsetMapping;Landroidx/compose/ui/text/TextLayoutResult;Landroidx/compose/ui/geometry/Rect;Landroidx/compose/ui/geometry/Rect;)V", "invalidate", "()V", "getHighSpeedVideoFpsRangesFor", "getOutputStallDuration", "Lkotlin/jvm/functions/Function1;", "getOutputFormats", "Landroidx/compose/foundation/text/input/internal/InputMethodManager;", "getHighSpeedVideoFpsRanges", "getOutputMinFrameDurationlomOqCM", "Ljava/lang/Object;", "Camera2StreamConfigurationMap", "getOutputSizeshNQ4ISI", "Z", "getHighSpeedVideoSizes", "getHighResolutionOutputSizeshNQ4ISI", "getInputSizeshNQ4ISI", "getHighSpeedVideoSizesFor", "getOutputMinFrameDuration", "getInputFormats", "isOutputSupportedFor", "Landroidx/compose/ui/text/input/TextFieldValue;", "isOutputSupportedForhNQ4ISI", "Landroidx/compose/ui/text/TextLayoutResult;", "getOutputSizes", "Landroidx/compose/ui/text/input/OffsetMapping;", "getOutputStallDurationlomOqCM", "Landroidx/compose/ui/geometry/Rect;", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "Landroid/view/inputmethod/CursorAnchorInfo$Builder;", "[F", "toString", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LegacyCursorAnchorInfoController {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getOutputMinFrameDuration;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private androidx.compose.ui.geometry.Rect getOutputMinFrameDurationlomOqCM;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private boolean getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private androidx.compose.ui.geometry.Rect getOutputSizeshNQ4ISI;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private boolean getOutputFormats;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizesFor;

    /* renamed from: getOutputFormats, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.internal.InputMethodManager getHighSpeedVideoFpsRanges;

    /* renamed from: getOutputMinFrameDuration, reason: from kotlin metadata */
    private boolean getInputFormats;

    /* renamed from: getOutputSizes, reason: from kotlin metadata */
    private androidx.compose.ui.text.input.OffsetMapping getOutputStallDurationlomOqCM;

    /* renamed from: getOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizes;

    /* renamed from: getOutputStallDuration, reason: from kotlin metadata */
    private final kotlin.jvm.functions.Function1<androidx.compose.ui.graphics.Matrix, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* renamed from: isOutputSupportedFor, reason: from kotlin metadata */
    private androidx.compose.ui.text.input.TextFieldValue getInputSizeshNQ4ISI;

    /* renamed from: isOutputSupportedForhNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.ui.text.TextLayoutResult getOutputSizes;

    /* renamed from: getOutputMinFrameDurationlomOqCM, reason: from kotlin metadata */
    private final java.lang.Object Camera2StreamConfigurationMap = new java.lang.Object();

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final android.view.inputmethod.CursorAnchorInfo.Builder getOutputStallDuration = new android.view.inputmethod.CursorAnchorInfo.Builder();

    /* renamed from: getOutputStallDurationlomOqCM, reason: from kotlin metadata */
    private final float[] toString = androidx.compose.ui.graphics.Matrix.m6223constructorimpl$default(null, 1, null);

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.graphics.Matrix isOutputSupportedFor = new android.graphics.Matrix();

    /* JADX WARN: Multi-variable type inference failed */
    public LegacyCursorAnchorInfoController(kotlin.jvm.functions.Function1<? super androidx.compose.ui.graphics.Matrix, kotlin.Unit> function1, androidx.compose.foundation.text.input.internal.InputMethodManager inputMethodManager) {
        this.getHighSpeedVideoFpsRangesFor = function1;
        this.getHighSpeedVideoFpsRanges = inputMethodManager;
    }

    public final void requestUpdate(boolean immediate, boolean monitor, boolean includeInsertionMarker, boolean includeCharacterBounds, boolean includeEditorBounds, boolean includeLineBounds) {
        synchronized (this.Camera2StreamConfigurationMap) {
            this.getHighSpeedVideoSizesFor = includeInsertionMarker;
            this.getOutputMinFrameDuration = includeCharacterBounds;
            this.getInputFormats = includeEditorBounds;
            this.getOutputFormats = includeLineBounds;
            if (immediate) {
                this.getHighResolutionOutputSizeshNQ4ISI = true;
                if (this.getInputSizeshNQ4ISI != null) {
                    getHighSpeedVideoFpsRangesFor();
                }
            }
            this.getHighSpeedVideoSizes = monitor;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void updateTextLayoutResult(androidx.compose.ui.text.input.TextFieldValue textFieldValue, androidx.compose.ui.text.input.OffsetMapping offsetMapping, androidx.compose.ui.text.TextLayoutResult textLayoutResult, androidx.compose.ui.geometry.Rect innerTextFieldBounds, androidx.compose.ui.geometry.Rect decorationBoxBounds) {
        synchronized (this.Camera2StreamConfigurationMap) {
            this.getInputSizeshNQ4ISI = textFieldValue;
            this.getOutputStallDurationlomOqCM = offsetMapping;
            this.getOutputSizes = textLayoutResult;
            this.getOutputSizeshNQ4ISI = innerTextFieldBounds;
            this.getOutputMinFrameDurationlomOqCM = decorationBoxBounds;
            if (this.getHighResolutionOutputSizeshNQ4ISI || this.getHighSpeedVideoSizes) {
                getHighSpeedVideoFpsRangesFor();
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    public final void invalidate() {
        synchronized (this.Camera2StreamConfigurationMap) {
            this.getInputSizeshNQ4ISI = null;
            this.getOutputStallDurationlomOqCM = null;
            this.getOutputSizes = null;
            this.getOutputSizeshNQ4ISI = null;
            this.getOutputMinFrameDurationlomOqCM = null;
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    private final void getHighSpeedVideoFpsRangesFor() {
        if (!this.getHighSpeedVideoFpsRanges.isActive() || this.getInputSizeshNQ4ISI == null || this.getOutputStallDurationlomOqCM == null || this.getOutputSizes == null || this.getOutputSizeshNQ4ISI == null || this.getOutputMinFrameDurationlomOqCM == null) {
            return;
        }
        androidx.compose.ui.graphics.Matrix.m6232resetimpl(this.toString);
        this.getHighSpeedVideoFpsRangesFor.invoke(androidx.compose.ui.graphics.Matrix.m6221boximpl(this.toString));
        float[] fArr = this.toString;
        androidx.compose.ui.geometry.Rect rect = this.getOutputMinFrameDurationlomOqCM;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rect);
        float f = -rect.getLeft();
        androidx.compose.ui.geometry.Rect rect2 = this.getOutputMinFrameDurationlomOqCM;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rect2);
        androidx.compose.ui.graphics.Matrix.m6244translateimpl(fArr, f, -rect2.getTop(), 0.0f);
        androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt.m5864setFromEL8BTi8(this.isOutputSupportedFor, this.toString);
        androidx.compose.foundation.text.input.internal.InputMethodManager inputMethodManager = this.getHighSpeedVideoFpsRanges;
        android.view.inputmethod.CursorAnchorInfo.Builder builder = this.getOutputStallDuration;
        androidx.compose.ui.text.input.TextFieldValue textFieldValue = this.getInputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(textFieldValue);
        androidx.compose.ui.text.input.OffsetMapping offsetMapping = this.getOutputStallDurationlomOqCM;
        kotlin.jvm.internal.Intrinsics.checkNotNull(offsetMapping);
        androidx.compose.ui.text.TextLayoutResult textLayoutResult = this.getOutputSizes;
        kotlin.jvm.internal.Intrinsics.checkNotNull(textLayoutResult);
        android.graphics.Matrix matrix = this.isOutputSupportedFor;
        androidx.compose.ui.geometry.Rect rect3 = this.getOutputSizeshNQ4ISI;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rect3);
        androidx.compose.ui.geometry.Rect rect4 = this.getOutputMinFrameDurationlomOqCM;
        kotlin.jvm.internal.Intrinsics.checkNotNull(rect4);
        inputMethodManager.updateCursorAnchorInfo(androidx.compose.foundation.text.input.internal.LegacyCursorAnchorInfoBuilder_androidKt.build(builder, textFieldValue, offsetMapping, textLayoutResult, matrix, rect3, rect4, this.getHighSpeedVideoSizesFor, this.getOutputMinFrameDuration, this.getInputFormats, this.getOutputFormats));
        this.getHighResolutionOutputSizeshNQ4ISI = false;
    }
}
