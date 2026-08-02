package We;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public interface B {

    public interface a {
        @NotNull
        InterfaceC4865g call();

        InterfaceC4870l connection();

        @NotNull
        L proceed(@NotNull G g10) throws IOException;

        int readTimeoutMillis();

        @NotNull
        G request();

        @NotNull
        a withReadTimeout(int i11, @NotNull TimeUnit timeUnit);

        @NotNull
        a withWriteTimeout(int i11, @NotNull TimeUnit timeUnit);

        int writeTimeoutMillis();
    }

    @NotNull
    L intercept(@NotNull a aVar) throws IOException;
}
