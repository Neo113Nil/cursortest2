package W2;

import W2.f;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class g {
    @NotNull
    public static final b a() {
        return new b(true, 1);
    }

    @NotNull
    public static final b b(@NotNull f.b<?>... pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        b bVar = new b(false, 1);
        f.b[] pairs2 = (f.b[]) Arrays.copyOf(pairs, pairs.length);
        Intrinsics.checkNotNullParameter(pairs2, "pairs");
        bVar.e();
        if (pairs2.length <= 0) {
            return bVar;
        }
        pairs2[0].getClass();
        bVar.j(null, null);
        throw null;
    }
}
