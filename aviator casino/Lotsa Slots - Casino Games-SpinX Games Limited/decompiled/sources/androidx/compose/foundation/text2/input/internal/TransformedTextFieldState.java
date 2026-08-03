package androidx.compose.foundation.text2.input.internal;

/* compiled from: TransformedTextFieldState.kt */
@kotlin.Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0001\u0018\u0000 H2\u00020\u0001:\u0002HIB!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0086@¢\u0006\u0002\u0010\u0019J\u0006\u0010\u001a\u001a\u00020\u0013J,\u0010\u001b\u001a\u00020\u00132\b\b\u0002\u0010\u001c\u001a\u00020\u001d2\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00130\u001f¢\u0006\u0002\b!H\u0086\bJ\u0013\u0010\"\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\u0018\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020'ø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u000e\u0010&\u001a\u00020%2\u0006\u0010+\u001a\u00020%J\u0018\u0010,\u001a\u00020'2\u0006\u0010(\u001a\u00020'ø\u0001\u0000¢\u0006\u0004\b-\u0010*J\u001b\u0010,\u001a\u00020'2\u0006\u0010+\u001a\u00020%ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u000e\u00100\u001a\u00020\u00132\u0006\u00101\u001a\u00020%J\u0006\u00102\u001a\u00020\u0013J\u000e\u00103\u001a\u00020\u00132\u0006\u00104\u001a\u000205J\"\u00106\u001a\u00020\u00132\u0006\u00104\u001a\u0002052\b\b\u0002\u00107\u001a\u00020\u001d2\b\b\u0002\u00108\u001a\u000209J*\u0010:\u001a\u00020\u00132\u0006\u00104\u001a\u0002052\u0006\u0010(\u001a\u00020'2\b\b\u0002\u00108\u001a\u000209ø\u0001\u0000¢\u0006\u0004\b;\u0010<J\u0006\u0010=\u001a\u00020\u0013J\u0018\u0010>\u001a\u00020\u00132\u0006\u0010?\u001a\u00020'ø\u0001\u0000¢\u0006\u0004\b@\u0010AJ\u0018\u0010B\u001a\u00020\u00132\u0006\u0010C\u001a\u00020'ø\u0001\u0000¢\u0006\u0004\bD\u0010AJ\b\u0010E\u001a\u00020FH\u0016J\u0006\u0010G\u001a\u00020\u0013R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\f\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006J"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState;", "", "textFieldState", "Landroidx/compose/foundation/text2/input/TextFieldState;", "inputTransformation", "Landroidx/compose/foundation/text2/input/InputTransformation;", "codepointTransformation", "Landroidx/compose/foundation/text2/input/CodepointTransformation;", "(Landroidx/compose/foundation/text2/input/TextFieldState;Landroidx/compose/foundation/text2/input/InputTransformation;Landroidx/compose/foundation/text2/input/CodepointTransformation;)V", "text", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "getText", "()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "transformedText", "Landroidx/compose/runtime/State;", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;", "untransformedText", "getUntransformedText", "collapseSelectionToEnd", "", "collapseSelectionToMax", "collectImeNotifications", "", "notifyImeListener", "Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;", "(Landroidx/compose/foundation/text2/input/TextFieldState$NotifyImeListener;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteSelectedText", "editUntransformedTextAsUser", "notifyImeOfChanges", "", "block", "Lkotlin/Function1;", "Landroidx/compose/foundation/text2/input/internal/EditingBuffer;", "Lkotlin/ExtensionFunctionType;", "equals", "other", "hashCode", "", "mapFromTransformed", "Landroidx/compose/ui/text/TextRange;", "range", "mapFromTransformed-GEjPoXI", "(J)J", "offset", "mapToTransformed", "mapToTransformed-GEjPoXI", "mapToTransformed--jx7JFs", "(I)J", "placeCursorBeforeCharAt", "transformedOffset", "redo", "replaceAll", "newText", "", "replaceSelectedText", "clearComposition", "undoBehavior", "Landroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;", "replaceText", "replaceText-Sb-Bc2M", "(Ljava/lang/CharSequence;JLandroidx/compose/foundation/text2/input/internal/undo/TextFieldEditUndoBehavior;)V", "selectAll", "selectCharsIn", "transformedRange", "selectCharsIn-5zc-tL8", "(J)V", "selectUntransformedCharsIn", "untransformedRange", "selectUntransformedCharsIn-5zc-tL8", "toString", "", "undo", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "TransformedText", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TransformedTextFieldState {
    public static final int $stable = 0;
    private static final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.Companion Companion = new androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.Companion(null);
    private final androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation;
    private final androidx.compose.foundation.text2.input.InputTransformation inputTransformation;
    private final androidx.compose.foundation.text2.input.TextFieldState textFieldState;
    private final androidx.compose.runtime.State<androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.TransformedText> transformedText;

    @kotlin.jvm.JvmStatic
    private static final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.TransformedText calculateTransformedText(androidx.compose.foundation.text2.input.TextFieldCharSequence textFieldCharSequence, androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation) {
        return Companion.calculateTransformedText(textFieldCharSequence, codepointTransformation);
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: mapFromTransformed-xdX6-G0, reason: not valid java name */
    private static final long m1164mapFromTransformedxdX6G0(long j, androidx.compose.foundation.text2.input.internal.OffsetMappingCalculator offsetMappingCalculator) {
        return Companion.m1175mapFromTransformedxdX6G0(j, offsetMappingCalculator);
    }

    @kotlin.jvm.JvmStatic
    /* renamed from: mapToTransformed-xdX6-G0, reason: not valid java name */
    private static final long m1165mapToTransformedxdX6G0(long j, androidx.compose.foundation.text2.input.internal.OffsetMappingCalculator offsetMappingCalculator) {
        return Companion.m1176mapToTransformedxdX6G0(j, offsetMappingCalculator);
    }

    public TransformedTextFieldState(androidx.compose.foundation.text2.input.TextFieldState textFieldState, androidx.compose.foundation.text2.input.InputTransformation inputTransformation, final androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation) {
        this.textFieldState = textFieldState;
        this.inputTransformation = inputTransformation;
        this.codepointTransformation = codepointTransformation;
        this.transformedText = codepointTransformation != null ? androidx.compose.runtime.SnapshotStateKt.derivedStateOf(new kotlin.jvm.functions.Function0<androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.TransformedText>() { // from class: androidx.compose.foundation.text2.input.internal.TransformedTextFieldState$transformedText$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.TransformedText invoke() {
                return androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.Companion.calculateTransformedText(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.this.textFieldState.getText(), codepointTransformation);
            }
        }) : null;
    }

    public final androidx.compose.foundation.text2.input.TextFieldCharSequence getText() {
        androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.TransformedText value;
        androidx.compose.foundation.text2.input.TextFieldCharSequence text;
        androidx.compose.runtime.State<androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.TransformedText> state = this.transformedText;
        return (state == null || (value = state.getValue()) == null || (text = value.getText()) == null) ? this.textFieldState.getText() : text;
    }

    public final androidx.compose.foundation.text2.input.TextFieldCharSequence getUntransformedText() {
        return this.textFieldState.getText();
    }

    public final void placeCursorBeforeCharAt(int transformedOffset) {
        m1171selectCharsIn5zctL8(androidx.compose.ui.text.TextRangeKt.TextRange(transformedOffset));
    }

    /* renamed from: selectCharsIn-5zc-tL8, reason: not valid java name */
    public final void m1171selectCharsIn5zctL8(long transformedRange) {
        m1172selectUntransformedCharsIn5zctL8(m1167mapFromTransformedGEjPoXI(transformedRange));
    }

    /* renamed from: selectUntransformedCharsIn-5zc-tL8, reason: not valid java name */
    public final void m1172selectUntransformedCharsIn5zctL8(long untransformedRange) {
        androidx.compose.foundation.text2.input.TextFieldState textFieldState = this.textFieldState;
        androidx.compose.foundation.text2.input.InputTransformation inputTransformation = this.inputTransformation;
        androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
        androidx.compose.foundation.text2.input.TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        textFieldState.getMainBuffer().setSelection(androidx.compose.ui.text.TextRange.m3964getStartimpl(untransformedRange), androidx.compose.ui.text.TextRange.m3959getEndimpl(untransformedRange));
        if (textFieldState.getMainBuffer().getChangeTracker().getChangeCount() == 0 && androidx.compose.ui.text.TextRange.m3957equalsimpl0(text.getSelectionInChars(), textFieldState.getMainBuffer().m1120getSelectiond9O1mEE()) && kotlin.jvm.internal.Intrinsics.areEqual(text.getCompositionInChars(), textFieldState.getMainBuffer().m1119getCompositionMzsxiRA())) {
            return;
        }
        textFieldState.commitEditAsUser(text, inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void replaceAll(java.lang.CharSequence newText) {
        androidx.compose.foundation.text2.input.TextFieldState textFieldState = this.textFieldState;
        androidx.compose.foundation.text2.input.InputTransformation inputTransformation = this.inputTransformation;
        androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
        androidx.compose.foundation.text2.input.TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        androidx.compose.foundation.text2.input.internal.EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        androidx.compose.foundation.text2.input.internal.EditCommandKt.deleteAll(mainBuffer);
        androidx.compose.foundation.text2.input.internal.EditCommandKt.commitText(mainBuffer, newText.toString(), 1);
        if (textFieldState.getMainBuffer().getChangeTracker().getChangeCount() == 0 && androidx.compose.ui.text.TextRange.m3957equalsimpl0(text.getSelectionInChars(), textFieldState.getMainBuffer().m1120getSelectiond9O1mEE()) && kotlin.jvm.internal.Intrinsics.areEqual(text.getCompositionInChars(), textFieldState.getMainBuffer().m1119getCompositionMzsxiRA())) {
            return;
        }
        textFieldState.commitEditAsUser(text, inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void selectAll() {
        androidx.compose.foundation.text2.input.TextFieldState textFieldState = this.textFieldState;
        androidx.compose.foundation.text2.input.InputTransformation inputTransformation = this.inputTransformation;
        androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
        androidx.compose.foundation.text2.input.TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        androidx.compose.foundation.text2.input.internal.EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.setSelection(0, mainBuffer.getLength());
        if (textFieldState.getMainBuffer().getChangeTracker().getChangeCount() == 0 && androidx.compose.ui.text.TextRange.m3957equalsimpl0(text.getSelectionInChars(), textFieldState.getMainBuffer().m1120getSelectiond9O1mEE()) && kotlin.jvm.internal.Intrinsics.areEqual(text.getCompositionInChars(), textFieldState.getMainBuffer().m1119getCompositionMzsxiRA())) {
            return;
        }
        textFieldState.commitEditAsUser(text, inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void deleteSelectedText() {
        androidx.compose.foundation.text2.input.TextFieldState textFieldState = this.textFieldState;
        androidx.compose.foundation.text2.input.InputTransformation inputTransformation = this.inputTransformation;
        androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior.NeverMerge;
        androidx.compose.foundation.text2.input.TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        androidx.compose.foundation.text2.input.internal.EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.delete(androidx.compose.ui.text.TextRange.m3962getMinimpl(mainBuffer.m1120getSelectiond9O1mEE()), androidx.compose.ui.text.TextRange.m3961getMaximpl(mainBuffer.m1120getSelectiond9O1mEE()));
        mainBuffer.setSelection(androidx.compose.ui.text.TextRange.m3962getMinimpl(mainBuffer.m1120getSelectiond9O1mEE()), androidx.compose.ui.text.TextRange.m3962getMinimpl(mainBuffer.m1120getSelectiond9O1mEE()));
        if (textFieldState.getMainBuffer().getChangeTracker().getChangeCount() == 0 && androidx.compose.ui.text.TextRange.m3957equalsimpl0(text.getSelectionInChars(), textFieldState.getMainBuffer().m1120getSelectiond9O1mEE()) && kotlin.jvm.internal.Intrinsics.areEqual(text.getCompositionInChars(), textFieldState.getMainBuffer().m1119getCompositionMzsxiRA())) {
            return;
        }
        textFieldState.commitEditAsUser(text, inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* renamed from: replaceText-Sb-Bc2M$default, reason: not valid java name */
    public static /* synthetic */ void m1166replaceTextSbBc2M$default(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState, java.lang.CharSequence charSequence, long j, androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            textFieldEditUndoBehavior = androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
        }
        transformedTextFieldState.m1170replaceTextSbBc2M(charSequence, j, textFieldEditUndoBehavior);
    }

    /* renamed from: replaceText-Sb-Bc2M, reason: not valid java name */
    public final void m1170replaceTextSbBc2M(java.lang.CharSequence newText, long range, androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior undoBehavior) {
        androidx.compose.foundation.text2.input.TextFieldState textFieldState = this.textFieldState;
        androidx.compose.foundation.text2.input.InputTransformation inputTransformation = this.inputTransformation;
        androidx.compose.foundation.text2.input.TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        androidx.compose.foundation.text2.input.internal.EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        long m1167mapFromTransformedGEjPoXI = m1167mapFromTransformedGEjPoXI(range);
        mainBuffer.replace(androidx.compose.ui.text.TextRange.m3962getMinimpl(m1167mapFromTransformedGEjPoXI), androidx.compose.ui.text.TextRange.m3961getMaximpl(m1167mapFromTransformedGEjPoXI), newText);
        int m3962getMinimpl = androidx.compose.ui.text.TextRange.m3962getMinimpl(m1167mapFromTransformedGEjPoXI) + newText.length();
        mainBuffer.setSelection(m3962getMinimpl, m3962getMinimpl);
        if (textFieldState.getMainBuffer().getChangeTracker().getChangeCount() == 0 && androidx.compose.ui.text.TextRange.m3957equalsimpl0(text.getSelectionInChars(), textFieldState.getMainBuffer().m1120getSelectiond9O1mEE()) && kotlin.jvm.internal.Intrinsics.areEqual(text.getCompositionInChars(), textFieldState.getMainBuffer().m1119getCompositionMzsxiRA())) {
            return;
        }
        textFieldState.commitEditAsUser(text, inputTransformation, true, undoBehavior);
    }

    public static /* synthetic */ void replaceSelectedText$default(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState, java.lang.CharSequence charSequence, boolean z, androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            textFieldEditUndoBehavior = androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
        }
        transformedTextFieldState.replaceSelectedText(charSequence, z, textFieldEditUndoBehavior);
    }

    public final void replaceSelectedText(java.lang.CharSequence newText, boolean clearComposition, androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior undoBehavior) {
        androidx.compose.foundation.text2.input.TextFieldState textFieldState = this.textFieldState;
        androidx.compose.foundation.text2.input.InputTransformation inputTransformation = this.inputTransformation;
        androidx.compose.foundation.text2.input.TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        androidx.compose.foundation.text2.input.internal.EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        if (clearComposition) {
            mainBuffer.commitComposition();
        }
        long m1120getSelectiond9O1mEE = mainBuffer.m1120getSelectiond9O1mEE();
        mainBuffer.replace(androidx.compose.ui.text.TextRange.m3962getMinimpl(m1120getSelectiond9O1mEE), androidx.compose.ui.text.TextRange.m3961getMaximpl(m1120getSelectiond9O1mEE), newText);
        int m3962getMinimpl = androidx.compose.ui.text.TextRange.m3962getMinimpl(m1120getSelectiond9O1mEE) + newText.length();
        mainBuffer.setSelection(m3962getMinimpl, m3962getMinimpl);
        if (textFieldState.getMainBuffer().getChangeTracker().getChangeCount() == 0 && androidx.compose.ui.text.TextRange.m3957equalsimpl0(text.getSelectionInChars(), textFieldState.getMainBuffer().m1120getSelectiond9O1mEE()) && kotlin.jvm.internal.Intrinsics.areEqual(text.getCompositionInChars(), textFieldState.getMainBuffer().m1119getCompositionMzsxiRA())) {
            return;
        }
        textFieldState.commitEditAsUser(text, inputTransformation, true, undoBehavior);
    }

    public final void collapseSelectionToMax() {
        androidx.compose.foundation.text2.input.TextFieldState textFieldState = this.textFieldState;
        androidx.compose.foundation.text2.input.InputTransformation inputTransformation = this.inputTransformation;
        androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
        androidx.compose.foundation.text2.input.TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        androidx.compose.foundation.text2.input.internal.EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.setSelection(androidx.compose.ui.text.TextRange.m3961getMaximpl(mainBuffer.m1120getSelectiond9O1mEE()), androidx.compose.ui.text.TextRange.m3961getMaximpl(mainBuffer.m1120getSelectiond9O1mEE()));
        if (textFieldState.getMainBuffer().getChangeTracker().getChangeCount() == 0 && androidx.compose.ui.text.TextRange.m3957equalsimpl0(text.getSelectionInChars(), textFieldState.getMainBuffer().m1120getSelectiond9O1mEE()) && kotlin.jvm.internal.Intrinsics.areEqual(text.getCompositionInChars(), textFieldState.getMainBuffer().m1119getCompositionMzsxiRA())) {
            return;
        }
        textFieldState.commitEditAsUser(text, inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void collapseSelectionToEnd() {
        androidx.compose.foundation.text2.input.TextFieldState textFieldState = this.textFieldState;
        androidx.compose.foundation.text2.input.InputTransformation inputTransformation = this.inputTransformation;
        androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
        androidx.compose.foundation.text2.input.TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        androidx.compose.foundation.text2.input.internal.EditingBuffer mainBuffer = textFieldState.getMainBuffer();
        mainBuffer.setSelection(androidx.compose.ui.text.TextRange.m3959getEndimpl(mainBuffer.m1120getSelectiond9O1mEE()), androidx.compose.ui.text.TextRange.m3959getEndimpl(mainBuffer.m1120getSelectiond9O1mEE()));
        if (textFieldState.getMainBuffer().getChangeTracker().getChangeCount() == 0 && androidx.compose.ui.text.TextRange.m3957equalsimpl0(text.getSelectionInChars(), textFieldState.getMainBuffer().m1120getSelectiond9O1mEE()) && kotlin.jvm.internal.Intrinsics.areEqual(text.getCompositionInChars(), textFieldState.getMainBuffer().m1119getCompositionMzsxiRA())) {
            return;
        }
        textFieldState.commitEditAsUser(text, inputTransformation, true, textFieldEditUndoBehavior);
    }

    public final void undo() {
        this.textFieldState.getUndoState().undo();
    }

    public final void redo() {
        this.textFieldState.getUndoState().redo();
    }

    public static /* synthetic */ void editUntransformedTextAsUser$default(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState, boolean z, kotlin.jvm.functions.Function1 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        androidx.compose.foundation.text2.input.TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        androidx.compose.foundation.text2.input.InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
        androidx.compose.foundation.text2.input.TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        function1.invoke(textFieldState.getMainBuffer());
        if (textFieldState.getMainBuffer().getChangeTracker().getChangeCount() == 0 && androidx.compose.ui.text.TextRange.m3957equalsimpl0(text.getSelectionInChars(), textFieldState.getMainBuffer().m1120getSelectiond9O1mEE()) && kotlin.jvm.internal.Intrinsics.areEqual(text.getCompositionInChars(), textFieldState.getMainBuffer().m1119getCompositionMzsxiRA())) {
            return;
        }
        textFieldState.commitEditAsUser(text, inputTransformation, z, textFieldEditUndoBehavior);
    }

    public final void editUntransformedTextAsUser(boolean notifyImeOfChanges, kotlin.jvm.functions.Function1<? super androidx.compose.foundation.text2.input.internal.EditingBuffer, kotlin.Unit> block) {
        androidx.compose.foundation.text2.input.TextFieldState textFieldState = this.textFieldState;
        androidx.compose.foundation.text2.input.InputTransformation inputTransformation = this.inputTransformation;
        androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior textFieldEditUndoBehavior = androidx.compose.foundation.text2.input.internal.undo.TextFieldEditUndoBehavior.MergeIfPossible;
        androidx.compose.foundation.text2.input.TextFieldCharSequence text = textFieldState.getText();
        textFieldState.getMainBuffer().getChangeTracker().clearChanges();
        block.invoke(textFieldState.getMainBuffer());
        if (textFieldState.getMainBuffer().getChangeTracker().getChangeCount() == 0 && androidx.compose.ui.text.TextRange.m3957equalsimpl0(text.getSelectionInChars(), textFieldState.getMainBuffer().m1120getSelectiond9O1mEE()) && kotlin.jvm.internal.Intrinsics.areEqual(text.getCompositionInChars(), textFieldState.getMainBuffer().m1119getCompositionMzsxiRA())) {
            return;
        }
        textFieldState.commitEditAsUser(text, inputTransformation, notifyImeOfChanges, textFieldEditUndoBehavior);
    }

    /* renamed from: mapToTransformed--jx7JFs, reason: not valid java name */
    public final long m1168mapToTransformedjx7JFs(int offset) {
        androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.TransformedText value;
        androidx.compose.foundation.text2.input.internal.OffsetMappingCalculator offsetMapping;
        androidx.compose.runtime.State<androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.TransformedText> state = this.transformedText;
        if (state == null || (value = state.getValue()) == null || (offsetMapping = value.getOffsetMapping()) == null) {
            return androidx.compose.ui.text.TextRangeKt.TextRange(offset);
        }
        return offsetMapping.m1125mapFromSourcejx7JFs(offset);
    }

    /* renamed from: mapToTransformed-GEjPoXI, reason: not valid java name */
    public final long m1169mapToTransformedGEjPoXI(long range) {
        androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.TransformedText value;
        androidx.compose.foundation.text2.input.internal.OffsetMappingCalculator offsetMapping;
        androidx.compose.runtime.State<androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.TransformedText> state = this.transformedText;
        return (state == null || (value = state.getValue()) == null || (offsetMapping = value.getOffsetMapping()) == null) ? range : Companion.m1176mapToTransformedxdX6G0(range, offsetMapping);
    }

    public final int mapFromTransformed(int offset) {
        androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.TransformedText value;
        androidx.compose.foundation.text2.input.internal.OffsetMappingCalculator offsetMapping;
        androidx.compose.runtime.State<androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.TransformedText> state = this.transformedText;
        return (state == null || (value = state.getValue()) == null || (offsetMapping = value.getOffsetMapping()) == null) ? offset : androidx.compose.ui.text.TextRange.m3962getMinimpl(offsetMapping.m1124mapFromDestjx7JFs(offset));
    }

    /* renamed from: mapFromTransformed-GEjPoXI, reason: not valid java name */
    public final long m1167mapFromTransformedGEjPoXI(long range) {
        androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.TransformedText value;
        androidx.compose.foundation.text2.input.internal.OffsetMappingCalculator offsetMapping;
        androidx.compose.runtime.State<androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.TransformedText> state = this.transformedText;
        return (state == null || (value = state.getValue()) == null || (offsetMapping = value.getOffsetMapping()) == null) ? range : Companion.m1175mapFromTransformedxdX6G0(range, offsetMapping);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object collectImeNotifications(final androidx.compose.foundation.text2.input.TextFieldState.NotifyImeListener notifyImeListener, kotlin.coroutines.Continuation<?> continuation) {
        androidx.compose.foundation.text2.input.internal.TransformedTextFieldState$collectImeNotifications$1 transformedTextFieldState$collectImeNotifications$1;
        int i;
        if (continuation instanceof androidx.compose.foundation.text2.input.internal.TransformedTextFieldState$collectImeNotifications$1) {
            transformedTextFieldState$collectImeNotifications$1 = (androidx.compose.foundation.text2.input.internal.TransformedTextFieldState$collectImeNotifications$1) continuation;
            if ((transformedTextFieldState$collectImeNotifications$1.label & Integer.MIN_VALUE) != 0) {
                transformedTextFieldState$collectImeNotifications$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = transformedTextFieldState$collectImeNotifications$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = transformedTextFieldState$collectImeNotifications$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    transformedTextFieldState$collectImeNotifications$1.L$0 = this;
                    transformedTextFieldState$collectImeNotifications$1.L$1 = notifyImeListener;
                    transformedTextFieldState$collectImeNotifications$1.label = 1;
                    androidx.compose.foundation.text2.input.internal.TransformedTextFieldState$collectImeNotifications$1 transformedTextFieldState$collectImeNotifications$12 = transformedTextFieldState$collectImeNotifications$1;
                    kotlinx.coroutines.CancellableContinuationImpl cancellableContinuationImpl = new kotlinx.coroutines.CancellableContinuationImpl(kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(transformedTextFieldState$collectImeNotifications$12), 1);
                    cancellableContinuationImpl.initCancellability();
                    this.textFieldState.addNotifyImeListener$foundation_release(notifyImeListener);
                    cancellableContinuationImpl.invokeOnCancellation(new kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit>() { // from class: androidx.compose.foundation.text2.input.internal.TransformedTextFieldState$collectImeNotifications$2$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable th) {
                            invoke2(th);
                            return kotlin.Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(java.lang.Throwable th) {
                            androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.this.textFieldState.removeNotifyImeListener$foundation_release(notifyImeListener);
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
        transformedTextFieldState$collectImeNotifications$1 = new androidx.compose.foundation.text2.input.internal.TransformedTextFieldState$collectImeNotifications$1(this, continuation);
        java.lang.Object obj2 = transformedTextFieldState$collectImeNotifications$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = transformedTextFieldState$collectImeNotifications$1.label;
        if (i != 0) {
        }
        throw new kotlin.KotlinNothingValueException();
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof androidx.compose.foundation.text2.input.internal.TransformedTextFieldState)) {
            return false;
        }
        androidx.compose.foundation.text2.input.internal.TransformedTextFieldState transformedTextFieldState = (androidx.compose.foundation.text2.input.internal.TransformedTextFieldState) other;
        if (kotlin.jvm.internal.Intrinsics.areEqual(this.textFieldState, transformedTextFieldState.textFieldState)) {
            return kotlin.jvm.internal.Intrinsics.areEqual(this.codepointTransformation, transformedTextFieldState.codepointTransformation);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.textFieldState.hashCode() * 31;
        androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation = this.codepointTransformation;
        return hashCode + (codepointTransformation != null ? codepointTransformation.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "TransformedTextFieldState(textFieldState=" + this.textFieldState + ", codepointTransformation=" + this.codepointTransformation + ", transformedText=" + this.transformedText + ", text=\"" + ((java.lang.Object) getText()) + "\")";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TransformedTextFieldState.kt */
    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;", "", "text", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "offsetMapping", "Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;", "(Landroidx/compose/foundation/text2/input/TextFieldCharSequence;Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)V", "getOffsetMapping", "()Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;", "getText", "()Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final /* data */ class TransformedText {
        private final androidx.compose.foundation.text2.input.internal.OffsetMappingCalculator offsetMapping;
        private final androidx.compose.foundation.text2.input.TextFieldCharSequence text;

        public static /* synthetic */ androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.TransformedText copy$default(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.TransformedText transformedText, androidx.compose.foundation.text2.input.TextFieldCharSequence textFieldCharSequence, androidx.compose.foundation.text2.input.internal.OffsetMappingCalculator offsetMappingCalculator, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                textFieldCharSequence = transformedText.text;
            }
            if ((i & 2) != 0) {
                offsetMappingCalculator = transformedText.offsetMapping;
            }
            return transformedText.copy(textFieldCharSequence, offsetMappingCalculator);
        }

        /* renamed from: component1, reason: from getter */
        public final androidx.compose.foundation.text2.input.TextFieldCharSequence getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final androidx.compose.foundation.text2.input.internal.OffsetMappingCalculator getOffsetMapping() {
            return this.offsetMapping;
        }

        public final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.TransformedText copy(androidx.compose.foundation.text2.input.TextFieldCharSequence text, androidx.compose.foundation.text2.input.internal.OffsetMappingCalculator offsetMapping) {
            return new androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.TransformedText(text, offsetMapping);
        }

        public boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.TransformedText)) {
                return false;
            }
            androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.TransformedText transformedText = (androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.TransformedText) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.text, transformedText.text) && kotlin.jvm.internal.Intrinsics.areEqual(this.offsetMapping, transformedText.offsetMapping);
        }

        public int hashCode() {
            return (this.text.hashCode() * 31) + this.offsetMapping.hashCode();
        }

        public java.lang.String toString() {
            return "TransformedText(text=" + ((java.lang.Object) this.text) + ", offsetMapping=" + this.offsetMapping + ')';
        }

        public TransformedText(androidx.compose.foundation.text2.input.TextFieldCharSequence textFieldCharSequence, androidx.compose.foundation.text2.input.internal.OffsetMappingCalculator offsetMappingCalculator) {
            this.text = textFieldCharSequence;
            this.offsetMapping = offsetMappingCalculator;
        }

        public final androidx.compose.foundation.text2.input.TextFieldCharSequence getText() {
            return this.text;
        }

        public final androidx.compose.foundation.text2.input.internal.OffsetMappingCalculator getOffsetMapping() {
            return this.offsetMapping;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TransformedTextFieldState.kt */
    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0003J\"\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0003ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0003ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$Companion;", "", "()V", "calculateTransformedText", "Landroidx/compose/foundation/text2/input/internal/TransformedTextFieldState$TransformedText;", "untransformedText", "Landroidx/compose/foundation/text2/input/TextFieldCharSequence;", "codepointTransformation", "Landroidx/compose/foundation/text2/input/CodepointTransformation;", "mapFromTransformed", "Landroidx/compose/ui/text/TextRange;", "range", "mapping", "Landroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;", "mapFromTransformed-xdX6-G0", "(JLandroidx/compose/foundation/text2/input/internal/OffsetMappingCalculator;)J", "mapToTransformed", "mapToTransformed-xdX6-G0", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @kotlin.jvm.JvmStatic
        public final androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.TransformedText calculateTransformedText(androidx.compose.foundation.text2.input.TextFieldCharSequence untransformedText, androidx.compose.foundation.text2.input.CodepointTransformation codepointTransformation) {
            androidx.compose.foundation.text2.input.internal.OffsetMappingCalculator offsetMappingCalculator = new androidx.compose.foundation.text2.input.internal.OffsetMappingCalculator();
            java.lang.CharSequence visualText = androidx.compose.foundation.text2.input.CodepointTransformationKt.toVisualText(untransformedText, codepointTransformation, offsetMappingCalculator);
            androidx.compose.ui.text.TextRange textRange = null;
            if (visualText == untransformedText) {
                return null;
            }
            long m1176mapToTransformedxdX6G0 = m1176mapToTransformedxdX6G0(untransformedText.getSelectionInChars(), offsetMappingCalculator);
            androidx.compose.ui.text.TextRange compositionInChars = untransformedText.getCompositionInChars();
            if (compositionInChars != null) {
                textRange = androidx.compose.ui.text.TextRange.m3952boximpl(androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.Companion.m1176mapToTransformedxdX6G0(compositionInChars.getPackedValue(), offsetMappingCalculator));
            }
            return new androidx.compose.foundation.text2.input.internal.TransformedTextFieldState.TransformedText(androidx.compose.foundation.text2.input.TextFieldCharSequenceKt.m1101TextFieldCharSequence3r_uNRQ(visualText, m1176mapToTransformedxdX6G0, textRange), offsetMappingCalculator);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @kotlin.jvm.JvmStatic
        /* renamed from: mapToTransformed-xdX6-G0, reason: not valid java name */
        public final long m1176mapToTransformedxdX6G0(long range, androidx.compose.foundation.text2.input.internal.OffsetMappingCalculator mapping) {
            long m1125mapFromSourcejx7JFs = mapping.m1125mapFromSourcejx7JFs(androidx.compose.ui.text.TextRange.m3964getStartimpl(range));
            long m1125mapFromSourcejx7JFs2 = androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(range) ? m1125mapFromSourcejx7JFs : mapping.m1125mapFromSourcejx7JFs(androidx.compose.ui.text.TextRange.m3959getEndimpl(range));
            int min = java.lang.Math.min(androidx.compose.ui.text.TextRange.m3962getMinimpl(m1125mapFromSourcejx7JFs), androidx.compose.ui.text.TextRange.m3962getMinimpl(m1125mapFromSourcejx7JFs2));
            int max = java.lang.Math.max(androidx.compose.ui.text.TextRange.m3961getMaximpl(m1125mapFromSourcejx7JFs), androidx.compose.ui.text.TextRange.m3961getMaximpl(m1125mapFromSourcejx7JFs2));
            if (androidx.compose.ui.text.TextRange.m3963getReversedimpl(range)) {
                return androidx.compose.ui.text.TextRangeKt.TextRange(max, min);
            }
            return androidx.compose.ui.text.TextRangeKt.TextRange(min, max);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @kotlin.jvm.JvmStatic
        /* renamed from: mapFromTransformed-xdX6-G0, reason: not valid java name */
        public final long m1175mapFromTransformedxdX6G0(long range, androidx.compose.foundation.text2.input.internal.OffsetMappingCalculator mapping) {
            long m1124mapFromDestjx7JFs = mapping.m1124mapFromDestjx7JFs(androidx.compose.ui.text.TextRange.m3964getStartimpl(range));
            long m1124mapFromDestjx7JFs2 = androidx.compose.ui.text.TextRange.m3958getCollapsedimpl(range) ? m1124mapFromDestjx7JFs : mapping.m1124mapFromDestjx7JFs(androidx.compose.ui.text.TextRange.m3959getEndimpl(range));
            int min = java.lang.Math.min(androidx.compose.ui.text.TextRange.m3962getMinimpl(m1124mapFromDestjx7JFs), androidx.compose.ui.text.TextRange.m3962getMinimpl(m1124mapFromDestjx7JFs2));
            int max = java.lang.Math.max(androidx.compose.ui.text.TextRange.m3961getMaximpl(m1124mapFromDestjx7JFs), androidx.compose.ui.text.TextRange.m3961getMaximpl(m1124mapFromDestjx7JFs2));
            if (androidx.compose.ui.text.TextRange.m3963getReversedimpl(range)) {
                return androidx.compose.ui.text.TextRangeKt.TextRange(max, min);
            }
            return androidx.compose.ui.text.TextRangeKt.TextRange(min, max);
        }
    }
}
