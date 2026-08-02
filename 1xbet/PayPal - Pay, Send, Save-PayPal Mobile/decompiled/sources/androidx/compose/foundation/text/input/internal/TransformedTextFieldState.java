package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 q2\u00020\u0001:\u0002rqB3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u0016J\u001d\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\f¢\u0006\u0004\b&\u0010%J1\u0010.\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\u0006\u0010'\u001a\u00020\u00132\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J3\u00100\u001a\u00020\f2\u0006\u0010!\u001a\u00020 2\b\b\u0002\u0010/\u001a\u00020*2\b\b\u0002\u0010)\u001a\u00020(2\b\b\u0002\u0010+\u001a\u00020*¢\u0006\u0004\b0\u00101J\r\u00102\u001a\u00020\f¢\u0006\u0004\b2\u0010%J\r\u00103\u001a\u00020\f¢\u0006\u0004\b3\u0010%J\r\u00104\u001a\u00020\f¢\u0006\u0004\b4\u0010%J\r\u00105\u001a\u00020\f¢\u0006\u0004\b5\u0010%J3\u0010:\u001a\u00020\f2\b\b\u0002\u0010+\u001a\u00020*2\u0017\u00109\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\f06¢\u0006\u0002\b8H\u0086\b¢\u0006\u0004\b:\u0010;J\u0013\u0010<\u001a\u00020\f*\u000207H\u0002¢\u0006\u0004\b<\u0010=J\u0015\u0010A\u001a\u00020\u00132\u0006\u0010>\u001a\u00020\u000f¢\u0006\u0004\b?\u0010@J\u0015\u0010A\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013¢\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001a\u00020\u00132\u0006\u0010>\u001a\u00020\u000f¢\u0006\u0004\bD\u0010@J\u0015\u0010E\u001a\u00020\u00132\u0006\u0010'\u001a\u00020\u0013¢\u0006\u0004\bF\u0010CJ\u0018\u0010J\u001a\u00020I2\u0006\u0010H\u001a\u00020GH\u0086@¢\u0006\u0004\bJ\u0010KJ\u001a\u0010M\u001a\u00020*2\b\u0010L\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\u000fH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bR\u0010SR\u0014\u0010<\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010W\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010VR\u0016\u0010Y\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010[\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001e\u0010^\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010]\u0018\u00010\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u001e\u0010T\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010]\u0018\u00010\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010_R\u0011\u0010c\u001a\u00020`8G¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0011\u0010e\u001a\u00020`8G¢\u0006\u0006\u001a\u0004\bd\u0010bR\u0011\u0010g\u001a\u00020`8G¢\u0006\u0006\u001a\u0004\bf\u0010bR+\u0010p\u001a\u00020h2\u0006\u0010i\u001a\u00020h8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010o"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState;", "", "Landroidx/compose/foundation/text/input/TextFieldState;", "textFieldState", "Landroidx/compose/foundation/text/input/InputTransformation;", "inputTransformation", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "codepointTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "outputTransformation", "<init>", "(Landroidx/compose/foundation/text/input/TextFieldState;Landroidx/compose/foundation/text/input/InputTransformation;Landroidx/compose/foundation/text/input/internal/CodepointTransformation;Landroidx/compose/foundation/text/input/OutputTransformation;)V", "", "update", "(Landroidx/compose/foundation/text/input/InputTransformation;)V", "", "transformedOffset", "placeCursorBeforeCharAt", "(I)V", "Landroidx/compose/ui/text/TextRange;", "transformedRange", "selectCharsIn-5zc-tL8", "(J)V", "selectCharsIn", "untransformedRange", "selectUntransformedCharsIn-5zc-tL8", "selectUntransformedCharsIn", "Landroidx/compose/foundation/text/input/TextHighlightType;", "type", "highlightCharsIn-7RAjNK8", "(IJ)V", "highlightCharsIn", "", "newText", "replaceAll", "(Ljava/lang/CharSequence;)V", "selectAll", "()V", "deleteSelectedText", "range", "Landroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;", "undoBehavior", "", "restartImeIfContentChanges", "replaceText-M8tDOmk", "(Ljava/lang/CharSequence;JLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;Z)V", "replaceText", "clearComposition", "replaceSelectedText", "(Ljava/lang/CharSequence;ZLandroidx/compose/foundation/text/input/internal/undo/TextFieldEditUndoBehavior;Z)V", "collapseSelectionToMax", "collapseSelectionToEnd", "undo", "redo", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/input/TextFieldBuffer;", "Lkotlin/ExtensionFunctionType;", "block", "editUntransformedTextAsUser", "(ZLkotlin/jvm/functions/Function1;)V", "getHighResolutionOutputSizeshNQ4ISI", "(Landroidx/compose/foundation/text/input/TextFieldBuffer;)V", "offset", "mapToTransformed--jx7JFs", "(I)J", "mapToTransformed", "mapToTransformed-GEjPoXI", "(J)J", "mapFromTransformed--jx7JFs", "mapFromTransformed", "mapFromTransformed-GEjPoXI", "Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;", "notifyImeListener", "", "collectImeNotifications", "(Landroidx/compose/foundation/text/input/TextFieldState$NotifyImeListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizesFor", "Landroidx/compose/foundation/text/input/TextFieldState;", "Landroidx/compose/foundation/text/input/InputTransformation;", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "getHighSpeedVideoSizes", "Landroidx/compose/foundation/text/input/OutputTransformation;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$TransformedText;", "getHighSpeedVideoFpsRangesFor", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getUntransformedText", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "untransformedText", "getOutputText", "outputText", "getVisualText", "visualText", "Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "<set-?>", "selectionWedgeAffinity$delegate", "Landroidx/compose/runtime/MutableState;", "getSelectionWedgeAffinity", "()Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "setSelectionWedgeAffinity", "(Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;)V", "selectionWedgeAffinity", "Companion", "TransformedText"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransformedTextFieldState {
    public static final int $stable = 0;
    private static final androidx.compose.foundation.text.input.internal.TransformedTextFieldState.Companion Companion = new androidx.compose.foundation.text.input.internal.TransformedTextFieldState.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.internal.CodepointTransformation getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private androidx.compose.foundation.text.input.InputTransformation Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.compose.runtime.State<androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText> getHighSpeedVideoSizesFor;
    private final androidx.compose.runtime.State<androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.OutputTransformation getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final androidx.compose.foundation.text.input.TextFieldState getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: selectionWedgeAffinity$delegate, reason: from kotlin metadata */
    private final androidx.compose.runtime.MutableState selectionWedgeAffinity;

    public TransformedTextFieldState(androidx.compose.foundation.text.input.TextFieldState textFieldState, androidx.compose.foundation.text.input.InputTransformation inputTransformation, final androidx.compose.foundation.text.input.internal.CodepointTransformation codepointTransformation, final androidx.compose.foundation.text.input.OutputTransformation outputTransformation) {
        this.getHighResolutionOutputSizeshNQ4ISI = textFieldState;
        this.Camera2StreamConfigurationMap = inputTransformation;
        this.getHighSpeedVideoSizes = codepointTransformation;
        this.getHighSpeedVideoFpsRanges = outputTransformation;
        this.getHighSpeedVideoFpsRangesFor = outputTransformation != null ? androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText highResolutionOutputSizeshNQ4ISI;
                highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.input.internal.TransformedTextFieldState.Companion.getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.input.internal.TransformedTextFieldState.Companion, r0.getHighResolutionOutputSizeshNQ4ISI.getValue$foundation(), outputTransformation, androidx.compose.foundation.text.input.internal.TransformedTextFieldState.this.getSelectionWedgeAffinity());
                return highResolutionOutputSizeshNQ4ISI;
            }
        }) : null;
        this.getHighSpeedVideoSizesFor = codepointTransformation != null ? androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0() { // from class: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.compose.foundation.text.input.internal.TransformedTextFieldState.$r8$lambda$0gOvt5vGmAbtxux9b89F_pmNnXA(androidx.compose.foundation.text.input.internal.TransformedTextFieldState.this, codepointTransformation);
            }
        }) : null;
        this.selectionWedgeAffinity = androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity(androidx.compose.foundation.text.input.internal.WedgeAffinity.Start), null, 2, null);
    }

    public /* synthetic */ TransformedTextFieldState(androidx.compose.foundation.text.input.TextFieldState textFieldState, androidx.compose.foundation.text.input.InputTransformation inputTransformation, androidx.compose.foundation.text.input.internal.CodepointTransformation codepointTransformation, androidx.compose.foundation.text.input.OutputTransformation outputTransformation, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(textFieldState, (i & 2) != 0 ? null : inputTransformation, (i & 4) != 0 ? null : codepointTransformation, (i & 8) != 0 ? null : outputTransformation);
    }

    public final androidx.compose.foundation.text.input.TextFieldCharSequence getUntransformedText() {
        return this.getHighResolutionOutputSizeshNQ4ISI.getValue$foundation();
    }

    public final androidx.compose.foundation.text.input.TextFieldCharSequence getOutputText() {
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText value;
        androidx.compose.foundation.text.input.TextFieldCharSequence getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.State<androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText> state = this.getHighSpeedVideoFpsRangesFor;
        return (state == null || (value = state.getValue()) == null || (getHighSpeedVideoFpsRangesFor = value.getGetHighSpeedVideoFpsRangesFor()) == null) ? getUntransformedText() : getHighSpeedVideoFpsRangesFor;
    }

    public final androidx.compose.foundation.text.input.TextFieldCharSequence getVisualText() {
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText value;
        androidx.compose.foundation.text.input.TextFieldCharSequence getHighSpeedVideoFpsRangesFor;
        androidx.compose.runtime.State<androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText> state = this.getHighSpeedVideoSizesFor;
        return (state == null || (value = state.getValue()) == null || (getHighSpeedVideoFpsRangesFor = value.getGetHighSpeedVideoFpsRangesFor()) == null) ? getOutputText() : getHighSpeedVideoFpsRangesFor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity getSelectionWedgeAffinity() {
        return (androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity) this.selectionWedgeAffinity.getValue();
    }

    public final void setSelectionWedgeAffinity(androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity selectionWedgeAffinity) {
        this.selectionWedgeAffinity.setValue(selectionWedgeAffinity);
    }

    public final void update(androidx.compose.foundation.text.input.InputTransformation inputTransformation) {
        this.Camera2StreamConfigurationMap = inputTransformation;
    }

    public final void placeCursorBeforeCharAt(int transformedOffset) {
        m2275selectCharsIn5zctL8(androidx.compose.ui.text.TextRangeKt.TextRange(transformedOffset));
    }

    /* renamed from: selectCharsIn-5zc-tL8, reason: not valid java name */
    public final void m2275selectCharsIn5zctL8(long transformedRange) {
        m2276selectUntransformedCharsIn5zctL8(m2271mapFromTransformedGEjPoXI(transformedRange));
    }

    /* renamed from: selectUntransformedCharsIn-5zc-tL8, reason: not valid java name */
    public final void m2276selectUntransformedCharsIn5zctL8(long untransformedRange) {
        androidx.compose.foundation.text.input.TextFieldState textFieldState = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.foundation.text.input.InputTransformation inputTransformation = this.Camera2StreamConfigurationMap;
        androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker$foundation().clearChanges();
        androidx.compose.foundation.text.input.TextFieldBufferKt.setSelectionCoerced(textFieldState.getMainBuffer(), androidx.compose.ui.text.TextRange.m8039getStartimpl(untransformedRange), androidx.compose.ui.text.TextRange.m8034getEndimpl(untransformedRange));
        androidx.compose.foundation.text.input.TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* renamed from: highlightCharsIn-7RAjNK8, reason: not valid java name */
    public final void m2269highlightCharsIn7RAjNK8(int type, long transformedRange) {
        long m2271mapFromTransformedGEjPoXI = m2271mapFromTransformedGEjPoXI(transformedRange);
        androidx.compose.foundation.text.input.TextFieldState textFieldState = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.foundation.text.input.InputTransformation inputTransformation = this.Camera2StreamConfigurationMap;
        androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker$foundation().clearChanges();
        textFieldState.getMainBuffer().m2174setHighlightK7f2yys$foundation(type, androidx.compose.ui.text.TextRange.m8039getStartimpl(m2271mapFromTransformedGEjPoXI), androidx.compose.ui.text.TextRange.m8034getEndimpl(m2271mapFromTransformedGEjPoXI));
        androidx.compose.foundation.text.input.TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void replaceAll(java.lang.CharSequence newText) {
        androidx.compose.foundation.text.input.TextFieldState textFieldState = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.foundation.text.input.InputTransformation inputTransformation = this.Camera2StreamConfigurationMap;
        androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker$foundation().clearChanges();
        androidx.compose.foundation.text.input.TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        androidx.compose.foundation.text.input.TextFieldBufferKt.delete(mainBuffer, 0, mainBuffer.getLength());
        mainBuffer.append(newText.toString());
        getHighResolutionOutputSizeshNQ4ISI(mainBuffer);
        androidx.compose.foundation.text.input.TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void selectAll() {
        androidx.compose.foundation.text.input.TextFieldState textFieldState = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.foundation.text.input.InputTransformation inputTransformation = this.Camera2StreamConfigurationMap;
        androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker$foundation().clearChanges();
        androidx.compose.foundation.text.input.TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        androidx.compose.foundation.text.input.TextFieldBufferKt.setSelectionCoerced(mainBuffer, 0, mainBuffer.getLength());
        androidx.compose.foundation.text.input.TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void deleteSelectedText() {
        androidx.compose.foundation.text.input.TextFieldState textFieldState = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.foundation.text.input.InputTransformation inputTransformation = this.Camera2StreamConfigurationMap;
        androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.NeverMerge;
        textFieldState.getMainBuffer().getChangeTracker$foundation().clearChanges();
        androidx.compose.foundation.text.input.TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        androidx.compose.foundation.text.input.TextFieldBufferKt.delete(mainBuffer, androidx.compose.ui.text.TextRange.m8037getMinimpl(mainBuffer.getGetHighResolutionOutputSizeshNQ4ISI()), androidx.compose.ui.text.TextRange.m8036getMaximpl(mainBuffer.getGetHighResolutionOutputSizeshNQ4ISI()));
        androidx.compose.foundation.text.input.TextFieldBufferKt.setSelectionCoerced$default(mainBuffer, androidx.compose.ui.text.TextRange.m8037getMinimpl(mainBuffer.getGetHighResolutionOutputSizeshNQ4ISI()), 0, 2, null);
        getHighResolutionOutputSizeshNQ4ISI(mainBuffer);
        androidx.compose.foundation.text.input.TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* renamed from: replaceText-M8tDOmk$default, reason: not valid java name */
    public static /* synthetic */ void m2268replaceTextM8tDOmk$default(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, java.lang.CharSequence charSequence, long j, androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            textFieldEditUndoBehavior = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
        }
        androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior2 = textFieldEditUndoBehavior;
        if ((i & 8) != 0) {
            z = true;
        }
        transformedTextFieldState.m2274replaceTextM8tDOmk(charSequence, j, textFieldEditUndoBehavior2, z);
    }

    /* renamed from: replaceText-M8tDOmk, reason: not valid java name */
    public final void m2274replaceTextM8tDOmk(java.lang.CharSequence newText, long range, androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior undoBehavior, boolean restartImeIfContentChanges) {
        androidx.compose.foundation.text.input.TextFieldState textFieldState = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.foundation.text.input.InputTransformation inputTransformation = this.Camera2StreamConfigurationMap;
        textFieldState.getMainBuffer().getChangeTracker$foundation().clearChanges();
        androidx.compose.foundation.text.input.TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        long m2271mapFromTransformedGEjPoXI = m2271mapFromTransformedGEjPoXI(range);
        mainBuffer.replace(androidx.compose.ui.text.TextRange.m8037getMinimpl(m2271mapFromTransformedGEjPoXI), androidx.compose.ui.text.TextRange.m8036getMaximpl(m2271mapFromTransformedGEjPoXI), newText);
        androidx.compose.foundation.text.input.TextFieldBufferKt.setSelectionCoerced$default(mainBuffer, androidx.compose.ui.text.TextRange.m8037getMinimpl(m2271mapFromTransformedGEjPoXI) + newText.length(), 0, 2, null);
        getHighResolutionOutputSizeshNQ4ISI(mainBuffer);
        androidx.compose.foundation.text.input.TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, restartImeIfContentChanges, undoBehavior);
    }

    public static /* synthetic */ void replaceSelectedText$default(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, java.lang.CharSequence charSequence, boolean z, androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior, boolean z2, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            textFieldEditUndoBehavior = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        transformedTextFieldState.replaceSelectedText(charSequence, z, textFieldEditUndoBehavior, z2);
    }

    public final void replaceSelectedText(java.lang.CharSequence newText, boolean clearComposition, androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior undoBehavior, boolean restartImeIfContentChanges) {
        androidx.compose.foundation.text.input.TextFieldState textFieldState = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.foundation.text.input.InputTransformation inputTransformation = this.Camera2StreamConfigurationMap;
        textFieldState.getMainBuffer().getChangeTracker$foundation().clearChanges();
        androidx.compose.foundation.text.input.TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        if (clearComposition) {
            mainBuffer.commitComposition$foundation();
        }
        long getHighResolutionOutputSizeshNQ4ISI = mainBuffer.getGetHighResolutionOutputSizeshNQ4ISI();
        mainBuffer.replace(androidx.compose.ui.text.TextRange.m8037getMinimpl(getHighResolutionOutputSizeshNQ4ISI), androidx.compose.ui.text.TextRange.m8036getMaximpl(getHighResolutionOutputSizeshNQ4ISI), newText);
        androidx.compose.foundation.text.input.TextFieldBufferKt.setSelectionCoerced$default(mainBuffer, androidx.compose.ui.text.TextRange.m8037getMinimpl(getHighResolutionOutputSizeshNQ4ISI) + newText.length(), 0, 2, null);
        getHighResolutionOutputSizeshNQ4ISI(mainBuffer);
        androidx.compose.foundation.text.input.TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, restartImeIfContentChanges, undoBehavior);
    }

    public final void collapseSelectionToMax() {
        androidx.compose.foundation.text.input.TextFieldState textFieldState = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.foundation.text.input.InputTransformation inputTransformation = this.Camera2StreamConfigurationMap;
        androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker$foundation().clearChanges();
        androidx.compose.foundation.text.input.TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        androidx.compose.foundation.text.input.TextFieldBufferKt.setSelectionCoerced$default(mainBuffer, androidx.compose.ui.text.TextRange.m8036getMaximpl(mainBuffer.getGetHighResolutionOutputSizeshNQ4ISI()), 0, 2, null);
        androidx.compose.foundation.text.input.TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void collapseSelectionToEnd() {
        androidx.compose.foundation.text.input.TextFieldState textFieldState = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.foundation.text.input.InputTransformation inputTransformation = this.Camera2StreamConfigurationMap;
        androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker$foundation().clearChanges();
        androidx.compose.foundation.text.input.TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        androidx.compose.foundation.text.input.TextFieldBufferKt.setSelectionCoerced$default(mainBuffer, androidx.compose.ui.text.TextRange.m8034getEndimpl(mainBuffer.getGetHighResolutionOutputSizeshNQ4ISI()), 0, 2, null);
        androidx.compose.foundation.text.input.TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void undo() {
        this.getHighResolutionOutputSizeshNQ4ISI.getUndoState().undo();
    }

    public final void redo() {
        this.getHighResolutionOutputSizeshNQ4ISI.getUndoState().redo();
    }

    public static /* synthetic */ void editUntransformedTextAsUser$default(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        androidx.compose.foundation.text.input.TextFieldState textFieldState = transformedTextFieldState.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.foundation.text.input.InputTransformation inputTransformation = transformedTextFieldState.Camera2StreamConfigurationMap;
        androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker$foundation().clearChanges();
        androidx.compose.foundation.text.input.TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        function1.invoke(mainBuffer);
        transformedTextFieldState.getHighResolutionOutputSizeshNQ4ISI(mainBuffer);
        androidx.compose.foundation.text.input.TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, z, textFieldEditUndoBehavior);
    }

    public final void editUntransformedTextAsUser(boolean restartImeIfContentChanges, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text.input.TextFieldBuffer, kotlin.Unit> block) {
        androidx.compose.foundation.text.input.TextFieldState textFieldState = this.getHighResolutionOutputSizeshNQ4ISI;
        androidx.compose.foundation.text.input.InputTransformation inputTransformation = this.Camera2StreamConfigurationMap;
        androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer().getChangeTracker$foundation().clearChanges();
        androidx.compose.foundation.text.input.TextFieldBuffer mainBuffer = textFieldState.getMainBuffer();
        block.invoke(mainBuffer);
        getHighResolutionOutputSizeshNQ4ISI(mainBuffer);
        androidx.compose.foundation.text.input.TextFieldState.access$commitEditAsUser(textFieldState, inputTransformation, restartImeIfContentChanges, textFieldEditUndoBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer) {
        if (textFieldBuffer.getChangeTracker$foundation().getChangeCount() <= 0 || !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(textFieldBuffer.getGetHighResolutionOutputSizeshNQ4ISI())) {
            return;
        }
        setSelectionWedgeAffinity(new androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity(androidx.compose.foundation.text.input.internal.WedgeAffinity.Start));
    }

    /* renamed from: mapToTransformed--jx7JFs, reason: not valid java name */
    public final long m2272mapToTransformedjx7JFs(int offset) {
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText value;
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText value2;
        androidx.compose.runtime.State<androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText> state = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.foundation.text.input.internal.OffsetMappingCalculator offsetMappingCalculator = null;
        androidx.compose.foundation.text.input.internal.OffsetMappingCalculator camera2StreamConfigurationMap = (state == null || (value2 = state.getValue()) == null) ? null : value2.getCamera2StreamConfigurationMap();
        androidx.compose.runtime.State<androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText> state2 = this.getHighSpeedVideoSizesFor;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMappingCalculator = value.getCamera2StreamConfigurationMap();
        }
        long m2239mapFromSourcejx7JFs = camera2StreamConfigurationMap != null ? camera2StreamConfigurationMap.m2239mapFromSourcejx7JFs(offset) : androidx.compose.ui.text.TextRangeKt.TextRange(offset);
        return offsetMappingCalculator != null ? androidx.compose.foundation.text.input.internal.TransformedTextFieldState.Companion.getHighSpeedVideoFpsRangesFor(m2239mapFromSourcejx7JFs, offsetMappingCalculator, getSelectionWedgeAffinity()) : m2239mapFromSourcejx7JFs;
    }

    /* renamed from: mapToTransformed-GEjPoXI, reason: not valid java name */
    public final long m2273mapToTransformedGEjPoXI(long range) {
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText value;
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText value2;
        androidx.compose.runtime.State<androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText> state = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.foundation.text.input.internal.OffsetMappingCalculator offsetMappingCalculator = null;
        androidx.compose.foundation.text.input.internal.OffsetMappingCalculator camera2StreamConfigurationMap = (state == null || (value2 = state.getValue()) == null) ? null : value2.getCamera2StreamConfigurationMap();
        androidx.compose.runtime.State<androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText> state2 = this.getHighSpeedVideoSizesFor;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMappingCalculator = value.getCamera2StreamConfigurationMap();
        }
        if (camera2StreamConfigurationMap != null) {
            range = androidx.compose.foundation.text.input.internal.TransformedTextFieldState.Companion.getHighResolutionOutputSizeshNQ4ISI(range, camera2StreamConfigurationMap);
        }
        return offsetMappingCalculator != null ? androidx.compose.foundation.text.input.internal.TransformedTextFieldState.Companion.getHighSpeedVideoFpsRangesFor(range, offsetMappingCalculator, getSelectionWedgeAffinity()) : range;
    }

    /* renamed from: mapFromTransformed--jx7JFs, reason: not valid java name */
    public final long m2270mapFromTransformedjx7JFs(int offset) {
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText value;
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText value2;
        androidx.compose.runtime.State<androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText> state = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.foundation.text.input.internal.OffsetMappingCalculator offsetMappingCalculator = null;
        androidx.compose.foundation.text.input.internal.OffsetMappingCalculator camera2StreamConfigurationMap = (state == null || (value2 = state.getValue()) == null) ? null : value2.getCamera2StreamConfigurationMap();
        androidx.compose.runtime.State<androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText> state2 = this.getHighSpeedVideoSizesFor;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMappingCalculator = value.getCamera2StreamConfigurationMap();
        }
        long m2238mapFromDestjx7JFs = offsetMappingCalculator != null ? offsetMappingCalculator.m2238mapFromDestjx7JFs(offset) : androidx.compose.ui.text.TextRangeKt.TextRange(offset);
        return camera2StreamConfigurationMap != null ? androidx.compose.foundation.text.input.internal.TransformedTextFieldState.Companion.getHighSpeedVideoFpsRanges(m2238mapFromDestjx7JFs, camera2StreamConfigurationMap) : m2238mapFromDestjx7JFs;
    }

    /* renamed from: mapFromTransformed-GEjPoXI, reason: not valid java name */
    public final long m2271mapFromTransformedGEjPoXI(long range) {
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText value;
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText value2;
        androidx.compose.runtime.State<androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText> state = this.getHighSpeedVideoFpsRangesFor;
        androidx.compose.foundation.text.input.internal.OffsetMappingCalculator offsetMappingCalculator = null;
        androidx.compose.foundation.text.input.internal.OffsetMappingCalculator camera2StreamConfigurationMap = (state == null || (value2 = state.getValue()) == null) ? null : value2.getCamera2StreamConfigurationMap();
        androidx.compose.runtime.State<androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText> state2 = this.getHighSpeedVideoSizesFor;
        if (state2 != null && (value = state2.getValue()) != null) {
            offsetMappingCalculator = value.getCamera2StreamConfigurationMap();
        }
        if (offsetMappingCalculator != null) {
            range = androidx.compose.foundation.text.input.internal.TransformedTextFieldState.Companion.getHighSpeedVideoFpsRanges(range, offsetMappingCalculator);
        }
        return camera2StreamConfigurationMap != null ? androidx.compose.foundation.text.input.internal.TransformedTextFieldState.Companion.getHighSpeedVideoFpsRanges(range, camera2StreamConfigurationMap) : range;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object collectImeNotifications(final androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener notifyImeListener, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1 transformedTextFieldState$collectImeNotifications$1;
        int i;
        if (continuation instanceof androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1) {
            transformedTextFieldState$collectImeNotifications$1 = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1) continuation;
            if ((transformedTextFieldState$collectImeNotifications$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                transformedTextFieldState$collectImeNotifications$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = transformedTextFieldState$collectImeNotifications$1.getHighSpeedVideoFpsRangesFor;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = transformedTextFieldState$collectImeNotifications$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    if (this.getHighSpeedVideoFpsRanges != null) {
                        notifyImeListener = new androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener() { // from class: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$$ExternalSyntheticLambda0
                            @Override // androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener
                            public final void onChange(androidx.compose.foundation.text.input.TextFieldCharSequence textFieldCharSequence, androidx.compose.foundation.text.input.TextFieldCharSequence textFieldCharSequence2, boolean z) {
                                androidx.compose.foundation.text.input.internal.TransformedTextFieldState.m2267$r8$lambda$n8atZGvl6kXmOn3Soi9tVP6z4(androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener.this, this, textFieldCharSequence, textFieldCharSequence2, z);
                            }
                        };
                    }
                    transformedTextFieldState$collectImeNotifications$1.getHighSpeedVideoFpsRanges = notifyImeListener;
                    transformedTextFieldState$collectImeNotifications$1.Camera2StreamConfigurationMap = 1;
                    androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1 transformedTextFieldState$collectImeNotifications$12 = transformedTextFieldState$collectImeNotifications$1;
                    kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(transformedTextFieldState$collectImeNotifications$12), 1);
                    cancellableContinuationImpl.initCancellability();
                    this.getHighResolutionOutputSizeshNQ4ISI.addNotifyImeListener$foundation(notifyImeListener);
                    cancellableContinuationImpl.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$2$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                            androidx.compose.foundation.text.input.internal.TransformedTextFieldState.this.getHighResolutionOutputSizeshNQ4ISI.removeNotifyImeListener$foundation(notifyImeListener);
                            return kotlin.Unit.INSTANCE;
                        }
                    });
                    java.lang.Object result = cancellableContinuationImpl.getResult();
                    if (result == kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(transformedTextFieldState$collectImeNotifications$12);
                    }
                    if (result == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                throw new kotlin.KotlinNothingValueException();
            }
        }
        transformedTextFieldState$collectImeNotifications$1 = new androidx.compose.foundation.text.input.internal.TransformedTextFieldState$collectImeNotifications$1(this, continuation);
        java.lang.Object obj2 = transformedTextFieldState$collectImeNotifications$1.getHighSpeedVideoFpsRangesFor;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = transformedTextFieldState$collectImeNotifications$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        throw new kotlin.KotlinNothingValueException();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.text.input.internal.TransformedTextFieldState)) {
            return false;
        }
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState) other;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, transformedTextFieldState.getHighResolutionOutputSizeshNQ4ISI) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, transformedTextFieldState.getHighSpeedVideoSizes)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, transformedTextFieldState.getHighSpeedVideoFpsRanges);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
        androidx.compose.foundation.text.input.internal.CodepointTransformation codepointTransformation = this.getHighSpeedVideoSizes;
        int hashCode2 = codepointTransformation != null ? codepointTransformation.hashCode() : 0;
        androidx.compose.foundation.text.input.OutputTransformation outputTransformation = this.getHighSpeedVideoFpsRanges;
        return (((hashCode * 31) + hashCode2) * 31) + (outputTransformation != null ? outputTransformation.hashCode() : 0);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TransformedTextFieldState(textFieldState=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", outputTransformation=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", outputTransformedText=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", codepointTransformation=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", codepointTransformedText=");
        sb.append(this.getHighSpeedVideoSizesFor);
        sb.append(", outputText=\"");
        sb.append((java.lang.Object) getOutputText());
        sb.append("\", visualText=\"");
        sb.append((java.lang.Object) getVisualText());
        sb.append("\")");
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0015\u0010\u0018"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$TransformedText;", "", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "p0", "Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "p1", "<init>", "(Landroidx/compose/foundation/text/input/TextFieldCharSequence;Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getHighSpeedVideoSizes", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getHighSpeedVideoFpsRangesFor", "Camera2StreamConfigurationMap", "Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "()Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final /* data */ class TransformedText {
        private final androidx.compose.foundation.text.input.internal.OffsetMappingCalculator Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final androidx.compose.foundation.text.input.TextFieldCharSequence getHighSpeedVideoFpsRangesFor;

        public TransformedText(androidx.compose.foundation.text.input.TextFieldCharSequence textFieldCharSequence, androidx.compose.foundation.text.input.internal.OffsetMappingCalculator offsetMappingCalculator) {
            this.getHighSpeedVideoFpsRangesFor = textFieldCharSequence;
            this.Camera2StreamConfigurationMap = offsetMappingCalculator;
        }

        /* renamed from: getHighSpeedVideoSizes, reason: from getter */
        public final androidx.compose.foundation.text.input.TextFieldCharSequence getGetHighSpeedVideoFpsRangesFor() {
            return this.getHighSpeedVideoFpsRangesFor;
        }

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from getter */
        public final androidx.compose.foundation.text.input.internal.OffsetMappingCalculator getCamera2StreamConfigurationMap() {
            return this.Camera2StreamConfigurationMap;
        }

        public final java.lang.String toString() {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("TransformedText(getHighSpeedVideoFpsRangesFor=");
            sb.append((java.lang.Object) this.getHighSpeedVideoFpsRangesFor);
            sb.append(", Camera2StreamConfigurationMap=");
            sb.append(this.Camera2StreamConfigurationMap);
            sb.append(')');
            return sb.toString();
        }

        public final int hashCode() {
            return (this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + this.Camera2StreamConfigurationMap.hashCode();
        }

        public final boolean equals(java.lang.Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText)) {
                return false;
            }
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText transformedText = (androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText) p0;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, transformedText.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, transformedText.Camera2StreamConfigurationMap);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0003J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0003J+\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000bH\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$Companion;", "", "<init>", "()V", "calculateTransformedText", "Landroidx/compose/foundation/text/input/internal/TransformedTextFieldState$TransformedText;", "untransformedValue", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "outputTransformation", "Landroidx/compose/foundation/text/input/OutputTransformation;", "wedgeAffinity", "Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;", "codepointTransformation", "Landroidx/compose/foundation/text/input/internal/CodepointTransformation;", "mapToTransformed", "Landroidx/compose/ui/text/TextRange;", "range", "mapping", "Landroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;", "selectionWedgeAffinity", "mapToTransformed-XGyztTk", "(JLandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;Landroidx/compose/foundation/text/input/internal/SelectionWedgeAffinity;)J", "mapFromTransformed", "mapFromTransformed-xdX6-G0", "(JLandroidx/compose/foundation/text/input/internal/OffsetMappingCalculator;)J", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    static final class Companion {
        private Companion() {
        }

        static /* synthetic */ long getHighResolutionOutputSizeshNQ4ISI(long j, androidx.compose.foundation.text.input.internal.OffsetMappingCalculator offsetMappingCalculator) {
            return getHighSpeedVideoFpsRangesFor(j, offsetMappingCalculator, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @kotlin.jvm.JvmStatic
        public static long getHighSpeedVideoFpsRangesFor(long j, androidx.compose.foundation.text.input.internal.OffsetMappingCalculator offsetMappingCalculator, androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity selectionWedgeAffinity) {
            long TextRange;
            long m2239mapFromSourcejx7JFs = offsetMappingCalculator.m2239mapFromSourcejx7JFs(androidx.compose.ui.text.TextRange.m8039getStartimpl(j));
            long m2239mapFromSourcejx7JFs2 = androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(j) ? m2239mapFromSourcejx7JFs : offsetMappingCalculator.m2239mapFromSourcejx7JFs(androidx.compose.ui.text.TextRange.m8034getEndimpl(j));
            androidx.compose.foundation.text.input.internal.WedgeAffinity wedgeAffinity = null;
            androidx.compose.foundation.text.input.internal.WedgeAffinity startAffinity = selectionWedgeAffinity != null ? selectionWedgeAffinity.getStartAffinity() : null;
            if (androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(j)) {
                wedgeAffinity = startAffinity;
            } else if (selectionWedgeAffinity != null) {
                wedgeAffinity = selectionWedgeAffinity.getEndAffinity();
            }
            if (startAffinity != null && !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2239mapFromSourcejx7JFs)) {
                int i = androidx.compose.foundation.text.input.internal.TransformedTextFieldState.Companion.WhenMappings.$EnumSwitchMapping$0[startAffinity.ordinal()];
                if (i == 1) {
                    m2239mapFromSourcejx7JFs = androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m8039getStartimpl(m2239mapFromSourcejx7JFs));
                } else {
                    if (i != 2) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    m2239mapFromSourcejx7JFs = androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m8034getEndimpl(m2239mapFromSourcejx7JFs));
                }
            }
            if (wedgeAffinity != null && !androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(m2239mapFromSourcejx7JFs2)) {
                int i2 = androidx.compose.foundation.text.input.internal.TransformedTextFieldState.Companion.WhenMappings.$EnumSwitchMapping$0[wedgeAffinity.ordinal()];
                if (i2 == 1) {
                    TextRange = androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m8039getStartimpl(m2239mapFromSourcejx7JFs2));
                } else {
                    if (i2 != 2) {
                        throw new kotlin.NoWhenBranchMatchedException();
                    }
                    TextRange = androidx.compose.ui.text.TextRangeKt.TextRange(androidx.compose.ui.text.TextRange.m8034getEndimpl(m2239mapFromSourcejx7JFs2));
                }
                m2239mapFromSourcejx7JFs2 = TextRange;
            }
            int min = java.lang.Math.min(androidx.compose.ui.text.TextRange.m8037getMinimpl(m2239mapFromSourcejx7JFs), androidx.compose.ui.text.TextRange.m8037getMinimpl(m2239mapFromSourcejx7JFs2));
            int max = java.lang.Math.max(androidx.compose.ui.text.TextRange.m8036getMaximpl(m2239mapFromSourcejx7JFs), androidx.compose.ui.text.TextRange.m8036getMaximpl(m2239mapFromSourcejx7JFs2));
            if (androidx.compose.ui.text.TextRange.m8038getReversedimpl(j)) {
                return androidx.compose.ui.text.TextRangeKt.TextRange(max, min);
            }
            return androidx.compose.ui.text.TextRangeKt.TextRange(min, max);
        }

        public static final /* synthetic */ androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText getHighResolutionOutputSizeshNQ4ISI(androidx.compose.foundation.text.input.internal.TransformedTextFieldState.Companion companion, androidx.compose.foundation.text.input.TextFieldCharSequence textFieldCharSequence, androidx.compose.foundation.text.input.OutputTransformation outputTransformation, androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity selectionWedgeAffinity) {
            androidx.compose.ui.text.TextRange textRange;
            java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.AnnotatedString.Annotation>> list;
            androidx.compose.foundation.text.input.internal.OffsetMappingCalculator offsetMappingCalculator = new androidx.compose.foundation.text.input.internal.OffsetMappingCalculator();
            androidx.compose.foundation.text.input.TextFieldBuffer textFieldBuffer = new androidx.compose.foundation.text.input.TextFieldBuffer(textFieldCharSequence, null, null, offsetMappingCalculator, 6, null);
            textFieldBuffer.setCanCallAddStyle$foundation(true);
            outputTransformation.transformOutput(textFieldBuffer);
            textFieldBuffer.setCanCallAddStyle$foundation(false);
            java.util.List<androidx.compose.ui.text.AnnotatedString.Range<androidx.compose.ui.text.AnnotatedString.Annotation>> outputTransformationAnnotations$foundation = textFieldBuffer.getOutputTransformationAnnotations$foundation();
            if (textFieldBuffer.getChanges().getChangeCount() == 0 && ((list = outputTransformationAnnotations$foundation) == null || list.isEmpty())) {
                return null;
            }
            long highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(textFieldCharSequence.getSelection(), offsetMappingCalculator, selectionWedgeAffinity);
            androidx.compose.ui.text.TextRange composition = textFieldCharSequence.getComposition();
            if (composition != null) {
                long getHighResolutionOutputSizeshNQ4ISI = composition.getGetHighResolutionOutputSizeshNQ4ISI();
                androidx.compose.foundation.text.input.internal.TransformedTextFieldState.Companion unused = androidx.compose.foundation.text.input.internal.TransformedTextFieldState.Companion;
                textRange = androidx.compose.ui.text.TextRange.m8027boximpl(getHighSpeedVideoFpsRangesFor(getHighResolutionOutputSizeshNQ4ISI, offsetMappingCalculator, selectionWedgeAffinity));
            } else {
                textRange = null;
            }
            return new androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText(androidx.compose.foundation.text.input.TextFieldBuffer.m2170toTextFieldCharSequencewFTz33Y$foundation$default(textFieldBuffer, highSpeedVideoFpsRangesFor, textRange, null, outputTransformationAnnotations$foundation, 4, null), offsetMappingCalculator);
        }

        public static final /* synthetic */ androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText getHighSpeedVideoSizes(androidx.compose.foundation.text.input.internal.TransformedTextFieldState.Companion companion, androidx.compose.foundation.text.input.TextFieldCharSequence textFieldCharSequence, androidx.compose.foundation.text.input.internal.CodepointTransformation codepointTransformation, androidx.compose.foundation.text.input.internal.SelectionWedgeAffinity selectionWedgeAffinity) {
            androidx.compose.ui.text.TextRange textRange;
            androidx.compose.foundation.text.input.internal.OffsetMappingCalculator offsetMappingCalculator = new androidx.compose.foundation.text.input.internal.OffsetMappingCalculator();
            java.lang.CharSequence visualText = androidx.compose.foundation.text.input.internal.CodepointTransformationKt.toVisualText(textFieldCharSequence, codepointTransformation, offsetMappingCalculator);
            if (visualText == textFieldCharSequence) {
                return null;
            }
            long highSpeedVideoFpsRangesFor = getHighSpeedVideoFpsRangesFor(textFieldCharSequence.getSelection(), offsetMappingCalculator, selectionWedgeAffinity);
            androidx.compose.ui.text.TextRange composition = textFieldCharSequence.getComposition();
            if (composition != null) {
                long getHighResolutionOutputSizeshNQ4ISI = composition.getGetHighResolutionOutputSizeshNQ4ISI();
                androidx.compose.foundation.text.input.internal.TransformedTextFieldState.Companion unused = androidx.compose.foundation.text.input.internal.TransformedTextFieldState.Companion;
                textRange = androidx.compose.ui.text.TextRange.m8027boximpl(getHighSpeedVideoFpsRangesFor(getHighResolutionOutputSizeshNQ4ISI, offsetMappingCalculator, selectionWedgeAffinity));
            } else {
                textRange = null;
            }
            return new androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText(new androidx.compose.foundation.text.input.TextFieldCharSequence(visualText, highSpeedVideoFpsRangesFor, textRange, null, null, null, 56, null), offsetMappingCalculator);
        }

        public static final /* synthetic */ long getHighSpeedVideoFpsRanges(long j, androidx.compose.foundation.text.input.internal.OffsetMappingCalculator offsetMappingCalculator) {
            long m2238mapFromDestjx7JFs = offsetMappingCalculator.m2238mapFromDestjx7JFs(androidx.compose.ui.text.TextRange.m8039getStartimpl(j));
            long m2238mapFromDestjx7JFs2 = androidx.compose.ui.text.TextRange.m8033getCollapsedimpl(j) ? m2238mapFromDestjx7JFs : offsetMappingCalculator.m2238mapFromDestjx7JFs(androidx.compose.ui.text.TextRange.m8034getEndimpl(j));
            int min = java.lang.Math.min(androidx.compose.ui.text.TextRange.m8037getMinimpl(m2238mapFromDestjx7JFs), androidx.compose.ui.text.TextRange.m8037getMinimpl(m2238mapFromDestjx7JFs2));
            int max = java.lang.Math.max(androidx.compose.ui.text.TextRange.m8036getMaximpl(m2238mapFromDestjx7JFs), androidx.compose.ui.text.TextRange.m8036getMaximpl(m2238mapFromDestjx7JFs2));
            if (androidx.compose.ui.text.TextRange.m8038getReversedimpl(j)) {
                return androidx.compose.ui.text.TextRangeKt.TextRange(max, min);
            }
            return androidx.compose.ui.text.TextRangeKt.TextRange(min, max);
        }

        @kotlin.Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[androidx.compose.foundation.text.input.internal.WedgeAffinity.values().length];
                try {
                    iArr[androidx.compose.foundation.text.input.internal.WedgeAffinity.Start.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.compose.foundation.text.input.internal.WedgeAffinity.End.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static /* synthetic */ androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText $r8$lambda$0gOvt5vGmAbtxux9b89F_pmNnXA(androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text.input.internal.CodepointTransformation codepointTransformation) {
        androidx.compose.foundation.text.input.TextFieldCharSequence value$foundation;
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText value;
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState.Companion companion = Companion;
        androidx.compose.runtime.State<androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText> state = transformedTextFieldState.getHighSpeedVideoFpsRangesFor;
        if (state == null || (value = state.getValue()) == null || (value$foundation = value.getGetHighSpeedVideoFpsRangesFor()) == null) {
            value$foundation = transformedTextFieldState.getHighResolutionOutputSizeshNQ4ISI.getValue$foundation();
        }
        return androidx.compose.foundation.text.input.internal.TransformedTextFieldState.Companion.getHighSpeedVideoSizes(companion, value$foundation, codepointTransformation, transformedTextFieldState.getSelectionWedgeAffinity());
    }

    /* renamed from: $r8$lambda$n8atZGvl6k-XmOn3-Soi9tVP6z4, reason: not valid java name */
    public static /* synthetic */ void m2267$r8$lambda$n8atZGvl6kXmOn3Soi9tVP6z4(androidx.compose.foundation.text.input.TextFieldState.NotifyImeListener notifyImeListener, androidx.compose.foundation.text.input.internal.TransformedTextFieldState transformedTextFieldState, androidx.compose.foundation.text.input.TextFieldCharSequence textFieldCharSequence, androidx.compose.foundation.text.input.TextFieldCharSequence textFieldCharSequence2, boolean z) {
        androidx.compose.foundation.text.input.TextFieldCharSequence getHighSpeedVideoFpsRangesFor;
        androidx.compose.foundation.text.input.internal.TransformedTextFieldState.TransformedText highResolutionOutputSizeshNQ4ISI = androidx.compose.foundation.text.input.internal.TransformedTextFieldState.Companion.getHighResolutionOutputSizeshNQ4ISI(Companion, textFieldCharSequence, transformedTextFieldState.getHighSpeedVideoFpsRanges, transformedTextFieldState.getSelectionWedgeAffinity());
        if (highResolutionOutputSizeshNQ4ISI != null && (getHighSpeedVideoFpsRangesFor = highResolutionOutputSizeshNQ4ISI.getGetHighSpeedVideoFpsRangesFor()) != null) {
            textFieldCharSequence = getHighSpeedVideoFpsRangesFor;
        }
        notifyImeListener.onChange(textFieldCharSequence, transformedTextFieldState.getVisualText(), z);
    }
}
