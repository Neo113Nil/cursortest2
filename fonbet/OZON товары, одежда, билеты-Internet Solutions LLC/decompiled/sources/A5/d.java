package A5;

import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sf.AbstractC9688n;
import sf.D;

/* loaded from: classes8.dex */
public final class d {
    public static final void a(@NotNull AbstractC9688n abstractC9688n, @NotNull D d11) {
        try {
            IOException iOException = null;
            for (D path : abstractC9688n.f(d11)) {
                try {
                    if (abstractC9688n.g(path).e()) {
                        a(abstractC9688n, path);
                    }
                    Intrinsics.checkNotNullParameter(path, "path");
                    abstractC9688n.c(path);
                } catch (IOException e11) {
                    if (iOException == null) {
                        iOException = e11;
                    }
                }
            }
            if (iOException != null) {
                throw iOException;
            }
        } catch (FileNotFoundException unused) {
        }
    }
}
