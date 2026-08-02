package E0;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import org.jetbrains.annotations.NotNull;

/* renamed from: E0.n, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2936n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2936n f7277a = new C2936n();

    public final void a(@NotNull X0 x02, @NotNull HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        int a11 = x02.a(handwritingGesture);
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new RunnableC2934m(a11, 0, intConsumer));
        } else {
            intConsumer.accept(a11);
        }
    }

    public final boolean b(@NotNull X0 x02, @NotNull PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        return x02.previewHandwritingGesture(previewableHandwritingGesture, cancellationSignal);
    }
}
