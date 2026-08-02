package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0014\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u0019\u001a\u00020\u00182\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00162\b\u0010\u000b\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001a"}, d2 = {"Landroidx/compose/foundation/text/input/internal/Api34LegacyPerformHandwritingGestureImpl;", "", "<init>", "()V", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "p0", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "p1", "Landroid/view/inputmethod/HandwritingGesture;", "p2", "Landroidx/compose/ui/platform/ViewConfiguration;", "p3", "Ljava/util/concurrent/Executor;", "p4", "Ljava/util/function/IntConsumer;", "p5", "Lkotlin/Function1;", "Landroidx/compose/ui/text/input/EditCommand;", "", "p6", "aa_", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroid/view/inputmethod/HandwritingGesture;Landroidx/compose/ui/platform/ViewConfiguration;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "", "ab_", "(Landroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class Api34LegacyPerformHandwritingGestureImpl {
    public static final androidx.compose.foundation.text.input.internal.Api34LegacyPerformHandwritingGestureImpl INSTANCE = new androidx.compose.foundation.text.input.internal.Api34LegacyPerformHandwritingGestureImpl();

    private Api34LegacyPerformHandwritingGestureImpl() {
    }

    public final void aa_(androidx.compose.foundation.text.LegacyTextFieldState p0, androidx.compose.foundation.text.selection.TextFieldSelectionManager p1, android.view.inputmethod.HandwritingGesture p2, androidx.compose.ui.platform.ViewConfiguration p3, java.util.concurrent.Executor p4, final java.util.function.IntConsumer p5, kotlin.jvm.functions.Function1<? super androidx.compose.ui.text.input.EditCommand, kotlin.Unit> p6) {
        final int performHandwritingGesture$foundation = p0 != null ? androidx.compose.foundation.text.input.internal.HandwritingGestureApi34.INSTANCE.performHandwritingGesture$foundation(p0, p2, p1, p3, p6) : 3;
        if (p5 == null) {
            return;
        }
        if (p4 != null) {
            p4.execute(new java.lang.Runnable() { // from class: androidx.compose.foundation.text.input.internal.Api34LegacyPerformHandwritingGestureImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.compose.foundation.text.input.internal.Api34LegacyPerformHandwritingGestureImpl.getHighResolutionOutputSizeshNQ4ISI(p5, performHandwritingGesture$foundation);
                }
            });
        } else {
            p5.accept(performHandwritingGesture$foundation);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighResolutionOutputSizeshNQ4ISI(java.util.function.IntConsumer intConsumer, int i) {
        intConsumer.accept(i);
    }

    public final boolean ab_(androidx.compose.foundation.text.LegacyTextFieldState p0, androidx.compose.foundation.text.selection.TextFieldSelectionManager p1, android.view.inputmethod.PreviewableHandwritingGesture p2, android.os.CancellationSignal p3) {
        if (p0 != null) {
            return androidx.compose.foundation.text.input.internal.HandwritingGestureApi34.INSTANCE.previewHandwritingGesture$foundation(p0, p2, p1, p3);
        }
        return false;
    }
}
