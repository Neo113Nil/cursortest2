package De;

import De.x;
import ed.InterfaceC6346b;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes.dex */
public final class y<S extends x<S>> {
    @NotNull
    public static final S a(Object obj) {
        C2857A c2857a;
        c2857a = C2858a.f6616a;
        if (obj != c2857a) {
            return (S) obj;
        }
        throw new IllegalStateException("Does not contain segment");
    }

    public static final boolean b(Object obj) {
        C2857A c2857a;
        c2857a = C2858a.f6616a;
        return obj == c2857a;
    }
}
