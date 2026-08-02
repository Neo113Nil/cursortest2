package We;

import cf.C5824e;
import java.io.IOException;
import org.jetbrains.annotations.NotNull;

/* renamed from: We.g, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public interface InterfaceC4865g extends Cloneable {

    /* renamed from: We.g$a */
    public interface a {
        @NotNull
        InterfaceC4865g a(@NotNull G g10);
    }

    void E0(@NotNull InterfaceC4866h interfaceC4866h);

    void cancel();

    @NotNull
    L execute() throws IOException;

    boolean isCanceled();

    @NotNull
    G request();

    @NotNull
    C5824e.c timeout();
}
