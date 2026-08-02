package C2;

import android.content.Context;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;
import org.jetbrains.annotations.NotNull;

/* renamed from: C2.u, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public interface InterfaceC2725u {
    boolean isAvailableOnDevice();

    void onClearCredential(@NotNull C2706a c2706a, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull r<Void, D2.a> rVar);

    void onCreateCredential(@NotNull Context context, @NotNull AbstractC2707b abstractC2707b, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull r<AbstractC2708c, D2.g> rVar);

    void onGetCredential(@NotNull Context context, @NotNull g0 g0Var, CancellationSignal cancellationSignal, @NotNull Executor executor, @NotNull r<h0, D2.o> rVar);
}
