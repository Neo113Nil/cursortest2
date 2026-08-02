package G;

import A0.q1;
import E.Z;
import I.O;
import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f1734a = new h();

    public final void a(Z z3, O o5, HandwritingGesture handwritingGesture, q1 q1Var, Executor executor, final IntConsumer intConsumer, i4.c cVar) {
        final int i = z3 != null ? t.f1746a.i(z3, handwritingGesture, o5, q1Var, cVar) : 3;
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new Runnable() { // from class: G.g
                @Override // java.lang.Runnable
                public final void run() {
                    intConsumer.accept(i);
                }
            });
        } else {
            intConsumer.accept(i);
        }
    }

    public final boolean b(Z z3, O o5, PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (z3 != null) {
            return t.f1746a.A(z3, previewableHandwritingGesture, o5, cancellationSignal);
        }
        return false;
    }
}
