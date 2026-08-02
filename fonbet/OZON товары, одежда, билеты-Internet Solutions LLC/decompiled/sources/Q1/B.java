package Q1;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
final class B extends y {
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(@NotNull HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        InputConnection b11 = b();
        if (b11 != null) {
            b11.performHandwritingGesture(handwritingGesture, executor, intConsumer);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(@NotNull PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        boolean previewHandwritingGesture;
        InputConnection b11 = b();
        if (b11 == null) {
            return false;
        }
        previewHandwritingGesture = b11.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
        return previewHandwritingGesture;
    }
}
