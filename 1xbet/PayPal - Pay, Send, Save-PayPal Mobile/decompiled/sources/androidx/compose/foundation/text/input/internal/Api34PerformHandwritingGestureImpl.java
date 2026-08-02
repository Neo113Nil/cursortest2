package androidx.compose.foundation.text.input.internal;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/foundation/text/input/internal/Api34PerformHandwritingGestureImpl;", "", "<init>", "()V", "Landroidx/compose/foundation/text/input/internal/TextInputSession;", "p0", "Landroid/view/inputmethod/HandwritingGesture;", "p1", "Ljava/util/concurrent/Executor;", "p2", "Ljava/util/function/IntConsumer;", "p3", "", "ac_", "(Landroidx/compose/foundation/text/input/internal/TextInputSession;Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "", "ad_", "(Landroidx/compose/foundation/text/input/internal/TextInputSession;Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class Api34PerformHandwritingGestureImpl {
    public static final androidx.compose.foundation.text.input.internal.Api34PerformHandwritingGestureImpl INSTANCE = new androidx.compose.foundation.text.input.internal.Api34PerformHandwritingGestureImpl();

    private Api34PerformHandwritingGestureImpl() {
    }

    public final void ac_(androidx.compose.foundation.text.input.internal.TextInputSession p0, android.view.inputmethod.HandwritingGesture p1, java.util.concurrent.Executor p2, final java.util.function.IntConsumer p3) {
        final int performHandwritingGesture = p0.performHandwritingGesture(p1);
        if (p3 == null) {
            return;
        }
        if (p2 != null) {
            p2.execute(new java.lang.Runnable() { // from class: androidx.compose.foundation.text.input.internal.Api34PerformHandwritingGestureImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.compose.foundation.text.input.internal.Api34PerformHandwritingGestureImpl.getHighResolutionOutputSizeshNQ4ISI(p3, performHandwritingGesture);
                }
            });
        } else {
            p3.accept(performHandwritingGesture);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getHighResolutionOutputSizeshNQ4ISI(java.util.function.IntConsumer intConsumer, int i) {
        intConsumer.accept(i);
    }

    public final boolean ad_(androidx.compose.foundation.text.input.internal.TextInputSession p0, android.view.inputmethod.PreviewableHandwritingGesture p1, android.os.CancellationSignal p2) {
        return p0.previewHandwritingGesture(p1, p2);
    }
}
