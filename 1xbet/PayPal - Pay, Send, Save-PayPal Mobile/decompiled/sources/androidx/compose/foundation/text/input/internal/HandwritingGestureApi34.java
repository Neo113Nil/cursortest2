package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u000f\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0015\u001a\u00020\u0014*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001b\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00072\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001d\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010 \u001a\u00020\u000e*\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010!J#\u0010\"\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010#J3\u0010%\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\u0018\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u00072\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0002¢\u0006\u0004\b%\u0010&J#\u0010'\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0018\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b'\u0010(J#\u0010*\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\u0018\u001a\u00020)2\u0006\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b*\u0010+J#\u0010,\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0018\u001a\u00020)2\u0006\u0010\u0019\u001a\u00020\u0007H\u0002¢\u0006\u0004\b,\u0010-J-\u0010/\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\u0018\u001a\u00020.2\u0006\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b/\u00100J-\u00102\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\u0018\u001a\u0002012\u0006\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b2\u00103J-\u00105\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\u0018\u001a\u0002042\u0006\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b5\u00106J#\u00108\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0018\u001a\u0002072\u0006\u0010\u0019\u001a\u00020\u0014H\u0002¢\u0006\u0004\b8\u00109J\u001b\u0010:\u001a\u00020\u000e*\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0005H\u0002¢\u0006\u0004\b:\u0010;J#\u0010=\u001a\u00020\n*\u00020\u00042\u0006\u0010\u0018\u001a\u0002072\u0006\u0010\u0019\u001a\u00020<H\u0002¢\u0006\u0004\b=\u0010>JC\u0010\u000f\u001a\u00020\u000e*\u00020?2\u0006\u0010@\u001a\u00020\u00052\b\u0010B\u001a\u0004\u0018\u00010A2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\n0CH\u0000¢\u0006\u0004\b\u000f\u0010FJ/\u0010\u0015\u001a\u00020\u0014*\u00020?2\u0006\u0010@\u001a\u00020\u00112\b\u0010B\u001a\u0004\u0018\u00010A2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0000¢\u0006\u0004\b\u0015\u0010GJ9\u0010H\u001a\u00020\u000e*\u00020?2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010A2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\n0CH\u0002¢\u0006\u0004\bH\u0010IJ%\u0010J\u001a\u00020\n*\u00020?2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\bJ\u0010KJ7\u0010M\u001a\u00020\u000e*\u00020?2\u0006\u0010\u0018\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020L2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\n0CH\u0002¢\u0006\u0004\bM\u0010NJ%\u0010O\u001a\u00020\n*\u00020?2\u0006\u0010\u0018\u001a\u00020\u001f2\b\u0010\u0019\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\bO\u0010PJ9\u0010Q\u001a\u00020\u000e*\u00020?2\u0006\u0010\u0018\u001a\u00020$2\b\u0010\u0019\u001a\u0004\u0018\u00010A2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\n0CH\u0002¢\u0006\u0004\bQ\u0010RJ%\u0010S\u001a\u00020\n*\u00020?2\u0006\u0010\u0018\u001a\u00020$2\b\u0010\u0019\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\bS\u0010TJ7\u0010U\u001a\u00020\u000e*\u00020?2\u0006\u0010\u0018\u001a\u00020)2\u0006\u0010\u0019\u001a\u00020L2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\n0CH\u0002¢\u0006\u0004\bU\u0010VJ%\u0010W\u001a\u00020\n*\u00020?2\u0006\u0010\u0018\u001a\u00020)2\b\u0010\u0019\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\bW\u0010XJA\u0010Z\u001a\u00020\u000e*\u00020?2\u0006\u0010\u0018\u001a\u00020.2\u0006\u0010\u0019\u001a\u00020L2\b\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0012\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\n0CH\u0002¢\u0006\u0004\bZ\u0010[J9\u0010\\\u001a\u00020\u000e*\u00020?2\u0006\u0010\u0018\u001a\u0002012\b\u0010\u0019\u001a\u0004\u0018\u00010\f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\n0CH\u0002¢\u0006\u0004\b\\\u0010]JA\u0010^\u001a\u00020\u000e*\u00020?2\u0006\u0010\u0018\u001a\u0002042\u0006\u0010\u0019\u001a\u00020L2\b\u0010\u001a\u001a\u0004\u0018\u00010\f2\u0012\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\n0CH\u0002¢\u0006\u0004\b^\u0010_J3\u0010a\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020`2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\n0CH\u0002¢\u0006\u0004\ba\u0010bJ5\u00108\u001a\u00020\n2\u0006\u0010\u0018\u001a\u0002072\b\u0010\u0019\u001a\u0004\u0018\u00010A2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\n0CH\u0002¢\u0006\u0004\b8\u0010cJ;\u00108\u001a\u00020\n2\u0006\u0010\u0018\u001a\u0002072\u0006\u0010\u0019\u001a\u00020L2\u0006\u0010\u001a\u001a\u00020\u00142\u0012\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\n0CH\u0002¢\u0006\u0004\b8\u0010dJ+\u0010e\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00052\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\n0CH\u0002¢\u0006\u0004\be\u0010fJ\u0013\u0010h\u001a\u00020g*\u00020\u000eH\u0002¢\u0006\u0004\bh\u0010i"}, d2 = {"Landroidx/compose/foundation/text/input/internal/HandwritingGestureApi34;", "", "<init>", "()V", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "Landroid/view/inputmethod/HandwritingGesture;", "handwritingGesture", "Landroidx/compose/foundation/text/input/internal/TextLayoutState;", "layoutState", "Lkotlin/Function0;", "", "updateSelectionState", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "", "performHandwritingGesture$foundation", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/platform/ViewConfiguration;)I", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "", "previewHandwritingGesture$foundation", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroid/os/CancellationSignal;)Z", "Landroid/view/inputmethod/SelectGesture;", "p0", "p1", "p2", "ar_", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Lkotlin/jvm/functions/Function0;)I", "az_", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V", "Landroid/view/inputmethod/DeleteGesture;", "ah_", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)I", "av_", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V", "Landroid/view/inputmethod/SelectRangeGesture;", "at_", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Lkotlin/jvm/functions/Function0;)I", "aB_", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V", "Landroid/view/inputmethod/DeleteRangeGesture;", "aj_", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)I", "ax_", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;)V", "Landroid/view/inputmethod/JoinOrSplitGesture;", "an_", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/JoinOrSplitGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/platform/ViewConfiguration;)I", "Landroid/view/inputmethod/InsertGesture;", "al_", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/InsertGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/platform/ViewConfiguration;)I", "Landroid/view/inputmethod/RemoveSpaceGesture;", "ap_", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/RemoveSpaceGesture;Landroidx/compose/foundation/text/input/internal/TextLayoutState;Landroidx/compose/ui/platform/ViewConfiguration;)I", "Landroidx/compose/ui/text/TextRange;", "getHighSpeedVideoFpsRangesFor", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;JZ)V", "ae_", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;Landroid/view/inputmethod/HandwritingGesture;)I", "Landroidx/compose/foundation/text/input/TextHighlightType;", "getHighSpeedVideoSizes", "(Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;JI)V", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "gesture", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "textFieldSelectionManager", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/EditCommand;", "editCommandConsumer", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroid/os/CancellationSignal;)Z", "aq_", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)I", "ay_", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "Landroidx/compose/ui/text/AnnotatedString;", "ag_", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;)I", "au_", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "as_", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)I", "aA_", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/SelectRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "ai_", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/ui/text/AnnotatedString;Lkotlin/jvm/functions/Function1;)I", "aw_", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/DeleteRangeGesture;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;)V", "p3", "am_", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/JoinOrSplitGesture;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I", "ak_", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/InsertGesture;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I", "ao_", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroid/view/inputmethod/RemoveSpaceGesture;Landroidx/compose/ui/text/AnnotatedString;Landroidx/compose/ui/platform/ViewConfiguration;Lkotlin/jvm/functions/Function1;)I", "", "getHighResolutionOutputSizeshNQ4ISI", "(ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "(JLandroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lkotlin/jvm/functions/Function1;)V", "(JLandroidx/compose/ui/text/AnnotatedString;ZLkotlin/jvm/functions/Function1;)V", "af_", "(Landroid/view/inputmethod/HandwritingGesture;Lkotlin/jvm/functions/Function1;)I", "Landroidx/compose/ui/text/TextGranularity;", "Camera2StreamConfigurationMap", "(I)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HandwritingGestureApi34 {
    public static final int $stable = 0;
    public static final androidx.compose.foundation.text.input.internal.HandwritingGestureApi34 INSTANCE = new androidx.compose.foundation.text.input.internal.HandwritingGestureApi34();

    private HandwritingGestureApi34() {
    }

    public final int performHandwritingGesture$foundation(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, android.view.inputmethod.HandwritingGesture handwritingGesture, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, kotlin.jvm.functions.Function0<kotlin.Unit> function0, androidx.compose.ui.platform.ViewConfiguration viewConfiguration) {
        if (handwritingGesture instanceof android.view.inputmethod.SelectGesture) {
            return ar_(transformedTextFieldState, (android.view.inputmethod.SelectGesture) handwritingGesture, textLayoutState, function0);
        }
        if (handwritingGesture instanceof android.view.inputmethod.DeleteGesture) {
            return ah_(transformedTextFieldState, (android.view.inputmethod.DeleteGesture) handwritingGesture, textLayoutState);
        }
        if (handwritingGesture instanceof android.view.inputmethod.SelectRangeGesture) {
            return at_(transformedTextFieldState, (android.view.inputmethod.SelectRangeGesture) handwritingGesture, textLayoutState, function0);
        }
        if (handwritingGesture instanceof android.view.inputmethod.DeleteRangeGesture) {
            return aj_(transformedTextFieldState, (android.view.inputmethod.DeleteRangeGesture) handwritingGesture, textLayoutState);
        }
        if (handwritingGesture instanceof android.view.inputmethod.JoinOrSplitGesture) {
            return an_(transformedTextFieldState, (android.view.inputmethod.JoinOrSplitGesture) handwritingGesture, textLayoutState, viewConfiguration);
        }
        if (handwritingGesture instanceof android.view.inputmethod.InsertGesture) {
            return al_(transformedTextFieldState, (android.view.inputmethod.InsertGesture) handwritingGesture, textLayoutState, viewConfiguration);
        }
        if (handwritingGesture instanceof android.view.inputmethod.RemoveSpaceGesture) {
            return ap_(transformedTextFieldState, (android.view.inputmethod.RemoveSpaceGesture) handwritingGesture, textLayoutState, viewConfiguration);
        }
        return 2;
    }

    public final boolean previewHandwritingGesture$foundation(final androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, android.view.inputmethod.PreviewableHandwritingGesture previewableHandwritingGesture, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, android.os.CancellationSignal cancellationSignal) {
        if (previewableHandwritingGesture instanceof android.view.inputmethod.SelectGesture) {
            az_(transformedTextFieldState, (android.view.inputmethod.SelectGesture) previewableHandwritingGesture, textLayoutState);
        } else if (previewableHandwritingGesture instanceof android.view.inputmethod.DeleteGesture) {
            av_(transformedTextFieldState, (android.view.inputmethod.DeleteGesture) previewableHandwritingGesture, textLayoutState);
        } else if (previewableHandwritingGesture instanceof android.view.inputmethod.SelectRangeGesture) {
            aB_(transformedTextFieldState, (android.view.inputmethod.SelectRangeGesture) previewableHandwritingGesture, textLayoutState);
        } else {
            if (!(previewableHandwritingGesture instanceof android.view.inputmethod.DeleteRangeGesture)) {
                return false;
            }
            ax_(transformedTextFieldState, (android.view.inputmethod.DeleteRangeGesture) previewableHandwritingGesture, textLayoutState);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$$ExternalSyntheticLambda1
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                androidx.compose.foundation.text.input.internal.HandwritingGestureApi34.getHighSpeedVideoSizes(androidx.compose.foundation.text.input.internal.TransformedTextFieldState.this);
            }
        });
        return true;
    }

    private final int ar_(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, android.view.inputmethod.SelectGesture selectGesture, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        long highSpeedVideoSizes;
        highSpeedVideoSizes = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.getHighSpeedVideoSizes(textLayoutState, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), Camera2StreamConfigurationMap(selectGesture.getGranularity()), androidx.compose.ui.text.TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(highSpeedVideoSizes)) {
            return INSTANCE.ae_(transformedTextFieldState, selectGesture);
        }
        transformedTextFieldState.m2275selectCharsIn5zctL8(highSpeedVideoSizes);
        if (function0 == null) {
            return 1;
        }
        function0.invoke();
        return 1;
    }

    private final void az_(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, android.view.inputmethod.SelectGesture selectGesture, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState) {
        long highSpeedVideoSizes;
        highSpeedVideoSizes = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.getHighSpeedVideoSizes(textLayoutState, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), Camera2StreamConfigurationMap(selectGesture.getGranularity()), androidx.compose.ui.text.TextInclusionStrategy.INSTANCE.getContainsCenter());
        getHighSpeedVideoSizes(transformedTextFieldState, highSpeedVideoSizes, androidx.compose.foundation.text.input.TextHighlightType.INSTANCE.m2193getHandwritingSelectPreviewsxJuwY());
    }

    private final int ah_(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, android.view.inputmethod.DeleteGesture deleteGesture, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState) {
        long highSpeedVideoSizes;
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(deleteGesture.getGranularity());
        highSpeedVideoSizes = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.getHighSpeedVideoSizes(textLayoutState, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), Camera2StreamConfigurationMap, androidx.compose.ui.text.TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(highSpeedVideoSizes)) {
            return INSTANCE.ae_(transformedTextFieldState, deleteGesture);
        }
        getHighSpeedVideoFpsRangesFor(transformedTextFieldState, highSpeedVideoSizes, androidx.compose.ui.text.TextGranularity.m7998equalsimpl0(Camera2StreamConfigurationMap, androidx.compose.ui.text.TextGranularity.INSTANCE.m8003getWordDRrd7Zo()));
        return 1;
    }

    private final void av_(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, android.view.inputmethod.DeleteGesture deleteGesture, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState) {
        long highSpeedVideoSizes;
        highSpeedVideoSizes = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.getHighSpeedVideoSizes(textLayoutState, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), Camera2StreamConfigurationMap(deleteGesture.getGranularity()), androidx.compose.ui.text.TextInclusionStrategy.INSTANCE.getContainsCenter());
        getHighSpeedVideoSizes(transformedTextFieldState, highSpeedVideoSizes, androidx.compose.foundation.text.input.TextHighlightType.INSTANCE.m2192getHandwritingDeletePreviewsxJuwY());
    }

    private final int at_(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, android.view.inputmethod.SelectRangeGesture selectRangeGesture, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        long m2231access$getRangeForScreenRectsO048IG0 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.m2231access$getRangeForScreenRectsO048IG0(textLayoutState, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), Camera2StreamConfigurationMap(selectRangeGesture.getGranularity()), androidx.compose.ui.text.TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2231access$getRangeForScreenRectsO048IG0)) {
            return INSTANCE.ae_(transformedTextFieldState, selectRangeGesture);
        }
        transformedTextFieldState.m2275selectCharsIn5zctL8(m2231access$getRangeForScreenRectsO048IG0);
        if (function0 == null) {
            return 1;
        }
        function0.invoke();
        return 1;
    }

    private final void aB_(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, android.view.inputmethod.SelectRangeGesture selectRangeGesture, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState) {
        getHighSpeedVideoSizes(transformedTextFieldState, androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.m2231access$getRangeForScreenRectsO048IG0(textLayoutState, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), Camera2StreamConfigurationMap(selectRangeGesture.getGranularity()), androidx.compose.ui.text.TextInclusionStrategy.INSTANCE.getContainsCenter()), androidx.compose.foundation.text.input.TextHighlightType.INSTANCE.m2193getHandwritingSelectPreviewsxJuwY());
    }

    private final int aj_(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, android.view.inputmethod.DeleteRangeGesture deleteRangeGesture, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState) {
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(deleteRangeGesture.getGranularity());
        long m2231access$getRangeForScreenRectsO048IG0 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.m2231access$getRangeForScreenRectsO048IG0(textLayoutState, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), Camera2StreamConfigurationMap, androidx.compose.ui.text.TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2231access$getRangeForScreenRectsO048IG0)) {
            return INSTANCE.ae_(transformedTextFieldState, deleteRangeGesture);
        }
        getHighSpeedVideoFpsRangesFor(transformedTextFieldState, m2231access$getRangeForScreenRectsO048IG0, androidx.compose.ui.text.TextGranularity.m7998equalsimpl0(Camera2StreamConfigurationMap, androidx.compose.ui.text.TextGranularity.INSTANCE.m8003getWordDRrd7Zo()));
        return 1;
    }

    private final void ax_(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, android.view.inputmethod.DeleteRangeGesture deleteRangeGesture, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState) {
        getHighSpeedVideoSizes(transformedTextFieldState, androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.m2231access$getRangeForScreenRectsO048IG0(textLayoutState, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), Camera2StreamConfigurationMap(deleteRangeGesture.getGranularity()), androidx.compose.ui.text.TextInclusionStrategy.INSTANCE.getContainsCenter()), androidx.compose.foundation.text.input.TextHighlightType.INSTANCE.m2192getHandwritingDeletePreviewsxJuwY());
    }

    private final int an_(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, android.view.inputmethod.JoinOrSplitGesture joinOrSplitGesture, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, androidx.compose.ui.platform.ViewConfiguration viewConfiguration) {
        androidx.compose.ui.text.TextLayoutResult layoutResult;
        if (transformedTextFieldState.getOutputText() != transformedTextFieldState.getUntransformedText()) {
            return 3;
        }
        int m2226access$getOffsetForHandwritingGestured4ec7I = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.m2226access$getOffsetForHandwritingGestured4ec7I(textLayoutState, androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$toOffset(joinOrSplitGesture.getJoinOrSplitPoint()), viewConfiguration);
        if (m2226access$getOffsetForHandwritingGestured4ec7I == -1 || ((layoutResult = textLayoutState.getLayoutResult()) != null && androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$isBiDiBoundary(layoutResult, m2226access$getOffsetForHandwritingGestured4ec7I))) {
            return ae_(transformedTextFieldState, joinOrSplitGesture);
        }
        long access$rangeOfWhitespaces = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$rangeOfWhitespaces(transformedTextFieldState.getVisualText(), m2226access$getOffsetForHandwritingGestured4ec7I);
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(access$rangeOfWhitespaces)) {
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState.m2268replaceTextM8tDOmk$default(transformedTextFieldState, " ", access$rangeOfWhitespaces, null, false, 12, null);
        } else {
            getHighSpeedVideoFpsRangesFor(transformedTextFieldState, access$rangeOfWhitespaces, false);
        }
        return 1;
    }

    private final int al_(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, android.view.inputmethod.InsertGesture insertGesture, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, androidx.compose.ui.platform.ViewConfiguration viewConfiguration) {
        int m2226access$getOffsetForHandwritingGestured4ec7I = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.m2226access$getOffsetForHandwritingGestured4ec7I(textLayoutState, androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$toOffset(insertGesture.getInsertionPoint()), viewConfiguration);
        if (m2226access$getOffsetForHandwritingGestured4ec7I == -1) {
            return ae_(transformedTextFieldState, insertGesture);
        }
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState.m2268replaceTextM8tDOmk$default(transformedTextFieldState, insertGesture.getTextToInsert(), androidx.compose.ui.text.TextRangeKt.TextRange(m2226access$getOffsetForHandwritingGestured4ec7I), null, false, 12, null);
        return 1;
    }

    private final int ap_(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, android.view.inputmethod.RemoveSpaceGesture removeSpaceGesture, androidx.compose.foundation.text.input.internal.TextLayoutState textLayoutState, androidx.compose.ui.platform.ViewConfiguration viewConfiguration) {
        long m2227access$getRangeForRemoveSpaceGesture5iVPX68 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.m2227access$getRangeForRemoveSpaceGesture5iVPX68(textLayoutState.getLayoutResult(), androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$toOffset(removeSpaceGesture.getStartPoint()), androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$toOffset(removeSpaceGesture.getEndPoint()), textLayoutState.getTextLayoutNodeCoordinates(), viewConfiguration);
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2227access$getRangeForRemoveSpaceGesture5iVPX68)) {
            return INSTANCE.ae_(transformedTextFieldState, removeSpaceGesture);
        }
        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        intRef.element = -1;
        final kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
        intRef2.element = -1;
        java.lang.String replace = new kotlin.text.Regex("\\s+").replace(androidx.compose.ui.text.TextRangeKt.m8046substringFDrldGo(transformedTextFieldState.getVisualText(), m2227access$getRangeForRemoveSpaceGesture5iVPX68), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.CharSequence Camera2StreamConfigurationMap;
                Camera2StreamConfigurationMap = androidx.compose.foundation.text.input.internal.HandwritingGestureApi34.Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.IntRef.this, intRef2, (kotlin.text.MatchResult) obj);
                return Camera2StreamConfigurationMap;
            }
        });
        if (intRef.element == -1 || intRef2.element == -1) {
            return ae_(transformedTextFieldState, removeSpaceGesture);
        }
        long TextRange = androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m8039getStartimpl(m2227access$getRangeForRemoveSpaceGesture5iVPX68) + intRef.element, androidx.compose.ui.text.TextRange.m8039getStartimpl(m2227access$getRangeForRemoveSpaceGesture5iVPX68) + intRef2.element);
        java.lang.String substring = replace.substring(intRef.element, replace.length() - (androidx.compose.ui.text.TextRange.m8035getLengthimpl(m2227access$getRangeForRemoveSpaceGesture5iVPX68) - intRef2.element));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState.m2268replaceTextM8tDOmk$default(transformedTextFieldState, substring, TextRange, null, false, 12, null);
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence Camera2StreamConfigurationMap(kotlin.jvm.internal.Ref.IntRef intRef, kotlin.jvm.internal.Ref.IntRef intRef2, kotlin.text.MatchResult matchResult) {
        if (intRef.element == -1) {
            intRef.element = matchResult.getRange().getFirst();
        }
        intRef2.element = matchResult.getRange().getLast() + 1;
        return "";
    }

    private final void getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, long j, boolean z) {
        if (z) {
            j = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.m2224access$adjustHandwritingDeleteGestureRange72CqOWE(j, transformedTextFieldState.getVisualText());
        }
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState.m2268replaceTextM8tDOmk$default(transformedTextFieldState, "", j, null, false, 12, null);
    }

    private final void getHighSpeedVideoSizes(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, long j, int i) {
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(j)) {
            androidx.compose.foundation.text.input.TextFieldState textFieldState = transformedTextFieldState.getHighResolutionOutputSizeshNQ4ISI;
            androidx.compose.foundation.text.input.InputTransformation inputTransformation = transformedTextFieldState.Camera2StreamConfigurationMap;
            androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
            textFieldState.getMainBuffer().getChangeTracker$foundation().clearChanges();
            androidx.compose.foundation.text.input.TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
            mainBuffer.clearHighlight$foundation();
            transformedTextFieldState.getHighResolutionOutputSizeshNQ4ISI(mainBuffer);
            androidx.compose.foundation.text.input.TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
            return;
        }
        transformedTextFieldState.m2269highlightCharsIn7RAjNK8(i, j);
    }

    public final int performHandwritingGesture$foundation(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, android.view.inputmethod.HandwritingGesture handwritingGesture, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, androidx.compose.ui.platform.ViewConfiguration viewConfiguration, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.EditCommand, kotlin.Unit> function1) {
        androidx.compose.ui.text.TextLayoutResult value;
        androidx.compose.ui.text.TextLayoutInput layoutInput;
        androidx.compose.ui.text.AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return 3;
        }
        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(untransformedText, (layoutResult == null || (value = layoutResult.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return 3;
        }
        if (handwritingGesture instanceof android.view.inputmethod.SelectGesture) {
            return aq_(legacyTextFieldState, (android.view.inputmethod.SelectGesture) handwritingGesture, textFieldSelectionManager, function1);
        }
        if (handwritingGesture instanceof android.view.inputmethod.DeleteGesture) {
            return ag_(legacyTextFieldState, (android.view.inputmethod.DeleteGesture) handwritingGesture, untransformedText, function1);
        }
        if (handwritingGesture instanceof android.view.inputmethod.SelectRangeGesture) {
            return as_(legacyTextFieldState, (android.view.inputmethod.SelectRangeGesture) handwritingGesture, textFieldSelectionManager, function1);
        }
        if (handwritingGesture instanceof android.view.inputmethod.DeleteRangeGesture) {
            return ai_(legacyTextFieldState, (android.view.inputmethod.DeleteRangeGesture) handwritingGesture, untransformedText, function1);
        }
        if (handwritingGesture instanceof android.view.inputmethod.JoinOrSplitGesture) {
            return am_(legacyTextFieldState, (android.view.inputmethod.JoinOrSplitGesture) handwritingGesture, untransformedText, viewConfiguration, function1);
        }
        if (handwritingGesture instanceof android.view.inputmethod.InsertGesture) {
            return ak_(legacyTextFieldState, (android.view.inputmethod.InsertGesture) handwritingGesture, viewConfiguration, function1);
        }
        if (handwritingGesture instanceof android.view.inputmethod.RemoveSpaceGesture) {
            return ao_(legacyTextFieldState, (android.view.inputmethod.RemoveSpaceGesture) handwritingGesture, untransformedText, viewConfiguration, function1);
        }
        return 2;
    }

    public final boolean previewHandwritingGesture$foundation(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, android.view.inputmethod.PreviewableHandwritingGesture previewableHandwritingGesture, final androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, android.os.CancellationSignal cancellationSignal) {
        androidx.compose.ui.text.TextLayoutResult value;
        androidx.compose.ui.text.TextLayoutInput layoutInput;
        androidx.compose.ui.text.AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return false;
        }
        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (!kotlin.jvm.internal.Intrinsics.areEqual(untransformedText, (layoutResult == null || (value = layoutResult.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return false;
        }
        if (previewableHandwritingGesture instanceof android.view.inputmethod.SelectGesture) {
            ay_(legacyTextFieldState, (android.view.inputmethod.SelectGesture) previewableHandwritingGesture, textFieldSelectionManager);
        } else if (previewableHandwritingGesture instanceof android.view.inputmethod.DeleteGesture) {
            au_(legacyTextFieldState, (android.view.inputmethod.DeleteGesture) previewableHandwritingGesture, textFieldSelectionManager);
        } else if (previewableHandwritingGesture instanceof android.view.inputmethod.SelectRangeGesture) {
            aA_(legacyTextFieldState, (android.view.inputmethod.SelectRangeGesture) previewableHandwritingGesture, textFieldSelectionManager);
        } else {
            if (!(previewableHandwritingGesture instanceof android.view.inputmethod.DeleteRangeGesture)) {
                return false;
            }
            aw_(legacyTextFieldState, (android.view.inputmethod.DeleteRangeGesture) previewableHandwritingGesture, textFieldSelectionManager);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$$ExternalSyntheticLambda3
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                androidx.compose.foundation.text.input.internal.HandwritingGestureApi34.getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.selection.TextFieldSelectionManager.this);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoFpsRangesFor(androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.clearPreviewHighlight$foundation();
        }
    }

    private final int aq_(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, android.view.inputmethod.SelectGesture selectGesture, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.EditCommand, kotlin.Unit> function1) {
        long highResolutionOutputSizeshNQ4ISI;
        highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.getHighResolutionOutputSizeshNQ4ISI(legacyTextFieldState, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), Camera2StreamConfigurationMap(selectGesture.getGranularity()), androidx.compose.ui.text.TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(highResolutionOutputSizeshNQ4ISI)) {
            return INSTANCE.af_(selectGesture, function1);
        }
        getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI, textFieldSelectionManager, function1);
        return 1;
    }

    private final void ay_(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, android.view.inputmethod.SelectGesture selectGesture, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        long highResolutionOutputSizeshNQ4ISI;
        if (textFieldSelectionManager != null) {
            highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.getHighResolutionOutputSizeshNQ4ISI(legacyTextFieldState, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(selectGesture.getSelectionArea()), Camera2StreamConfigurationMap(selectGesture.getGranularity()), androidx.compose.ui.text.TextInclusionStrategy.INSTANCE.getContainsCenter());
            textFieldSelectionManager.m2451setSelectionPreviewHighlight5zctL8$foundation(highResolutionOutputSizeshNQ4ISI);
        }
    }

    private final int ag_(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, android.view.inputmethod.DeleteGesture deleteGesture, androidx.compose.ui.text.AnnotatedString annotatedString, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.EditCommand, kotlin.Unit> function1) {
        long highResolutionOutputSizeshNQ4ISI;
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(deleteGesture.getGranularity());
        highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.getHighResolutionOutputSizeshNQ4ISI(legacyTextFieldState, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), Camera2StreamConfigurationMap, androidx.compose.ui.text.TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(highResolutionOutputSizeshNQ4ISI)) {
            return INSTANCE.af_(deleteGesture, function1);
        }
        getHighSpeedVideoFpsRangesFor(highResolutionOutputSizeshNQ4ISI, annotatedString, androidx.compose.ui.text.TextGranularity.m7998equalsimpl0(Camera2StreamConfigurationMap, androidx.compose.ui.text.TextGranularity.INSTANCE.m8003getWordDRrd7Zo()), function1);
        return 1;
    }

    private final void au_(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, android.view.inputmethod.DeleteGesture deleteGesture, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        long highResolutionOutputSizeshNQ4ISI;
        if (textFieldSelectionManager != null) {
            highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.getHighResolutionOutputSizeshNQ4ISI(legacyTextFieldState, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(deleteGesture.getDeletionArea()), Camera2StreamConfigurationMap(deleteGesture.getGranularity()), androidx.compose.ui.text.TextInclusionStrategy.INSTANCE.getContainsCenter());
            textFieldSelectionManager.m2449setDeletionPreviewHighlight5zctL8$foundation(highResolutionOutputSizeshNQ4ISI);
        }
    }

    private final int as_(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, android.view.inputmethod.SelectRangeGesture selectRangeGesture, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.EditCommand, kotlin.Unit> function1) {
        long m2230access$getRangeForScreenRectsO048IG0 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.m2230access$getRangeForScreenRectsO048IG0(legacyTextFieldState, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), Camera2StreamConfigurationMap(selectRangeGesture.getGranularity()), androidx.compose.ui.text.TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2230access$getRangeForScreenRectsO048IG0)) {
            return INSTANCE.af_(selectRangeGesture, function1);
        }
        getHighSpeedVideoFpsRangesFor(m2230access$getRangeForScreenRectsO048IG0, textFieldSelectionManager, function1);
        return 1;
    }

    private final void aA_(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, android.view.inputmethod.SelectRangeGesture selectRangeGesture, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m2451setSelectionPreviewHighlight5zctL8$foundation(androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.m2230access$getRangeForScreenRectsO048IG0(legacyTextFieldState, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionStartArea()), androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(selectRangeGesture.getSelectionEndArea()), Camera2StreamConfigurationMap(selectRangeGesture.getGranularity()), androidx.compose.ui.text.TextInclusionStrategy.INSTANCE.getContainsCenter()));
        }
    }

    private final int ai_(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, android.view.inputmethod.DeleteRangeGesture deleteRangeGesture, androidx.compose.ui.text.AnnotatedString annotatedString, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.EditCommand, kotlin.Unit> function1) {
        int Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(deleteRangeGesture.getGranularity());
        long m2230access$getRangeForScreenRectsO048IG0 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.m2230access$getRangeForScreenRectsO048IG0(legacyTextFieldState, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), Camera2StreamConfigurationMap, androidx.compose.ui.text.TextInclusionStrategy.INSTANCE.getContainsCenter());
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2230access$getRangeForScreenRectsO048IG0)) {
            return INSTANCE.af_(deleteRangeGesture, function1);
        }
        getHighSpeedVideoFpsRangesFor(m2230access$getRangeForScreenRectsO048IG0, annotatedString, androidx.compose.ui.text.TextGranularity.m7998equalsimpl0(Camera2StreamConfigurationMap, androidx.compose.ui.text.TextGranularity.INSTANCE.m8003getWordDRrd7Zo()), function1);
        return 1;
    }

    private final void aw_(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, android.view.inputmethod.DeleteRangeGesture deleteRangeGesture, androidx.compose.foundation.text.selection.TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.m2449setDeletionPreviewHighlight5zctL8$foundation(androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.m2230access$getRangeForScreenRectsO048IG0(legacyTextFieldState, androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionStartArea()), androidx.compose.ui.graphics.RectHelper_androidKt.toComposeRect(deleteRangeGesture.getDeletionEndArea()), Camera2StreamConfigurationMap(deleteRangeGesture.getGranularity()), androidx.compose.ui.text.TextInclusionStrategy.INSTANCE.getContainsCenter()));
        }
    }

    private final int am_(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, android.view.inputmethod.JoinOrSplitGesture joinOrSplitGesture, androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.platform.ViewConfiguration viewConfiguration, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.EditCommand, kotlin.Unit> function1) {
        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult;
        androidx.compose.ui.text.TextLayoutResult value;
        if (viewConfiguration == null) {
            return af_(joinOrSplitGesture, function1);
        }
        int m2225access$getOffsetForHandwritingGestured4ec7I = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.m2225access$getOffsetForHandwritingGestured4ec7I(legacyTextFieldState, androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$toOffset(joinOrSplitGesture.getJoinOrSplitPoint()), viewConfiguration);
        if (m2225access$getOffsetForHandwritingGestured4ec7I == -1 || ((layoutResult = legacyTextFieldState.getLayoutResult()) != null && (value = layoutResult.getValue()) != null && androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$isBiDiBoundary(value, m2225access$getOffsetForHandwritingGestured4ec7I))) {
            return af_(joinOrSplitGesture, function1);
        }
        long access$rangeOfWhitespaces = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$rangeOfWhitespaces(annotatedString, m2225access$getOffsetForHandwritingGestured4ec7I);
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(access$rangeOfWhitespaces)) {
            getHighResolutionOutputSizeshNQ4ISI(androidx.compose.ui.text.TextRange.m8039getStartimpl(access$rangeOfWhitespaces), " ", function1);
        } else {
            getHighSpeedVideoFpsRangesFor(access$rangeOfWhitespaces, annotatedString, false, function1);
        }
        return 1;
    }

    private final int ak_(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, android.view.inputmethod.InsertGesture insertGesture, androidx.compose.ui.platform.ViewConfiguration viewConfiguration, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.EditCommand, kotlin.Unit> function1) {
        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult;
        androidx.compose.ui.text.TextLayoutResult value;
        if (viewConfiguration == null) {
            return af_(insertGesture, function1);
        }
        int m2225access$getOffsetForHandwritingGestured4ec7I = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.m2225access$getOffsetForHandwritingGestured4ec7I(legacyTextFieldState, androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$toOffset(insertGesture.getInsertionPoint()), viewConfiguration);
        if (m2225access$getOffsetForHandwritingGestured4ec7I == -1 || ((layoutResult = legacyTextFieldState.getLayoutResult()) != null && (value = layoutResult.getValue()) != null && androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$isBiDiBoundary(value, m2225access$getOffsetForHandwritingGestured4ec7I))) {
            return af_(insertGesture, function1);
        }
        getHighResolutionOutputSizeshNQ4ISI(m2225access$getOffsetForHandwritingGestured4ec7I, insertGesture.getTextToInsert(), function1);
        return 1;
    }

    private final int ao_(androidx.compose.foundation.text.LegacyTextFieldState legacyTextFieldState, android.view.inputmethod.RemoveSpaceGesture removeSpaceGesture, androidx.compose.ui.text.AnnotatedString annotatedString, androidx.compose.ui.platform.ViewConfiguration viewConfiguration, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.EditCommand, kotlin.Unit> function1) {
        androidx.compose.foundation.text.TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        long m2227access$getRangeForRemoveSpaceGesture5iVPX68 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.m2227access$getRangeForRemoveSpaceGesture5iVPX68(layoutResult != null ? layoutResult.getValue() : null, androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$toOffset(removeSpaceGesture.getStartPoint()), androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$toOffset(removeSpaceGesture.getEndPoint()), legacyTextFieldState.getLayoutCoordinates(), viewConfiguration);
        if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2227access$getRangeForRemoveSpaceGesture5iVPX68)) {
            return INSTANCE.af_(removeSpaceGesture, function1);
        }
        final kotlin.jvm.internal.Ref.IntRef intRef = new kotlin.jvm.internal.Ref.IntRef();
        intRef.element = -1;
        final kotlin.jvm.internal.Ref.IntRef intRef2 = new kotlin.jvm.internal.Ref.IntRef();
        intRef2.element = -1;
        java.lang.String replace = new kotlin.text.Regex("\\s+").replace(androidx.compose.ui.text.TextRangeKt.m8046substringFDrldGo(annotatedString, m2227access$getRangeForRemoveSpaceGesture5iVPX68), new kotlin.jvm.functions.Function1() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                java.lang.CharSequence highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.input.internal.HandwritingGestureApi34.getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.internal.Ref.IntRef.this, intRef2, (kotlin.text.MatchResult) obj);
                return highResolutionOutputSizeshNQ4ISI;
            }
        });
        if (intRef.element == -1 || intRef2.element == -1) {
            return af_(removeSpaceGesture, function1);
        }
        int m8039getStartimpl = androidx.compose.ui.text.TextRange.m8039getStartimpl(m2227access$getRangeForRemoveSpaceGesture5iVPX68);
        int i = intRef.element;
        int m8039getStartimpl2 = androidx.compose.ui.text.TextRange.m8039getStartimpl(m2227access$getRangeForRemoveSpaceGesture5iVPX68);
        int i2 = intRef2.element;
        java.lang.String substring = replace.substring(intRef.element, replace.length() - (androidx.compose.ui.text.TextRange.m8035getLengthimpl(m2227access$getRangeForRemoveSpaceGesture5iVPX68) - intRef2.element));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(substring, "");
        function1.invoke(androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$compoundEditCommand(new androidx.compose.ui.text.input.SetSelectionCommand(m8039getStartimpl + i, m8039getStartimpl2 + i2), new androidx.compose.ui.text.input.CommitTextCommand(substring, 1)));
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.CharSequence getHighResolutionOutputSizeshNQ4ISI(kotlin.jvm.internal.Ref.IntRef intRef, kotlin.jvm.internal.Ref.IntRef intRef2, kotlin.text.MatchResult matchResult) {
        if (intRef.element == -1) {
            intRef.element = matchResult.getRange().getFirst();
        }
        intRef2.element = matchResult.getRange().getLast() + 1;
        return "";
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(int p0, java.lang.String p1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.EditCommand, kotlin.Unit> p2) {
        p2.invoke(androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$compoundEditCommand(new androidx.compose.ui.text.input.SetSelectionCommand(p0, p0), new androidx.compose.ui.text.input.CommitTextCommand(p1, 1)));
    }

    private final void getHighSpeedVideoFpsRangesFor(long p0, androidx.compose.foundation.text.selection.TextFieldSelectionManager p1, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.EditCommand, kotlin.Unit> p2) {
        p2.invoke(new androidx.compose.ui.text.input.SetSelectionCommand(androidx.compose.ui.text.TextRange.m8039getStartimpl(p0), androidx.compose.ui.text.TextRange.m8034getEndimpl(p0)));
        if (p1 != null) {
            p1.enterSelectionMode$foundation(true);
        }
    }

    private final void getHighSpeedVideoFpsRangesFor(long p0, androidx.compose.ui.text.AnnotatedString p1, boolean p2, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.EditCommand, kotlin.Unit> p3) {
        if (p2) {
            p0 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.m2224access$adjustHandwritingDeleteGestureRange72CqOWE(p0, p1);
        }
        p3.invoke(androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$compoundEditCommand(new androidx.compose.ui.text.input.SetSelectionCommand(androidx.compose.ui.text.TextRange.m8034getEndimpl(p0), androidx.compose.ui.text.TextRange.m8034getEndimpl(p0)), new androidx.compose.ui.text.input.DeleteSurroundingTextCommand(androidx.compose.ui.text.TextRange.m8035getLengthimpl(p0), 0)));
    }

    private final int af_(android.view.inputmethod.HandwritingGesture p0, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.EditCommand, kotlin.Unit> p1) {
        java.lang.String fallbackText = p0.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        p1.invoke(new androidx.compose.ui.text.input.CommitTextCommand(fallbackText, 1));
        return 5;
    }

    private final int Camera2StreamConfigurationMap(int i) {
        if (i == 1) {
            return androidx.compose.ui.text.TextGranularity.INSTANCE.m8003getWordDRrd7Zo();
        }
        if (i == 2) {
            return androidx.compose.ui.text.TextGranularity.INSTANCE.m8002getCharacterDRrd7Zo();
        }
        return androidx.compose.ui.text.TextGranularity.INSTANCE.m8002getCharacterDRrd7Zo();
    }

    private final int ae_(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, android.view.inputmethod.HandwritingGesture handwritingGesture) {
        androidx.compose.foundation.text.input.TextFieldState textFieldState = transformedTextFieldState.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.foundation.text.input.InputTransformation inputTransformation = transformedTextFieldState.Camera2StreamConfigurationMap;
        androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker$foundation().clearChanges();
        androidx.compose.foundation.text.input.TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.clearHighlight$foundation();
        transformedTextFieldState.getHighResolutionOutputSizeshNQ4ISI(mainBuffer);
        androidx.compose.foundation.text.input.TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
        java.lang.String fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState.replaceSelectedText$default(transformedTextFieldState, fallbackText, true, null, false, 12, null);
        return 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighSpeedVideoSizes(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState) {
        androidx.compose.foundation.text.input.TextFieldState textFieldState = transformedTextFieldState.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.foundation.text.input.InputTransformation inputTransformation = transformedTextFieldState.Camera2StreamConfigurationMap;
        androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker$foundation().clearChanges();
        androidx.compose.foundation.text.input.TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.clearHighlight$foundation();
        transformedTextFieldState.getHighResolutionOutputSizeshNQ4ISI(mainBuffer);
        androidx.compose.foundation.text.input.TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
    }
}
