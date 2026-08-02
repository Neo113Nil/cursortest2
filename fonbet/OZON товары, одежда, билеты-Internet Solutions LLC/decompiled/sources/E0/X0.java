package E0;

import android.os.CancellationSignal;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public interface X0 {
    int a(@NotNull HandwritingGesture handwritingGesture);

    boolean previewHandwritingGesture(@NotNull PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal);
}
