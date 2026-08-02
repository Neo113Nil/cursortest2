package E0;

import Q1.InterfaceC3841j;
import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.ui.platform.c2;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* renamed from: E0.l, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C2932l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final C2932l f7259a = new C2932l();

    public final void a(B0.O0 o02, I0.W0 w02, @NotNull HandwritingGesture handwritingGesture, c2 c2Var, Executor executor, IntConsumer intConsumer, @NotNull Function1<? super InterfaceC3841j, Unit> function1) {
        int j11 = o02 != null ? X.f7124a.j(o02, handwritingGesture, w02, c2Var, function1) : 3;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new RunnableC2930k(j11, 0, intConsumer));
        } else {
            intConsumer.accept(j11);
        }
    }

    public final boolean b(B0.O0 o02, I0.W0 w02, @NotNull PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (o02 != null) {
            return X.f7124a.B(o02, previewableHandwritingGesture, w02, cancellationSignal);
        }
        return false;
    }
}
