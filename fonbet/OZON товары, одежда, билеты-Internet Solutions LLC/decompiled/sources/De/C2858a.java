package De;

import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* renamed from: De.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2858a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private static final C2857A f6616a = new C2857A("CLOSED");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [De.d] */
    @NotNull
    public static final <N extends AbstractC2861d<N>> N b(@NotNull N n11) {
        while (true) {
            Object a11 = AbstractC2861d.a(n11);
            if (a11 == f6616a) {
                break;
            }
            ?? r02 = (AbstractC2861d) a11;
            if (r02 != 0) {
                n11 = r02;
            } else if (n11.g()) {
                break;
            }
        }
        return n11;
    }

    @NotNull
    public static final <S extends x<S>> Object c(@NotNull S s11, long j11, @NotNull Function2<? super Long, ? super S, ? extends S> function2) {
        while (true) {
            if (s11.f6654c >= j11 && !s11.f()) {
                return s11;
            }
            Object a11 = AbstractC2861d.a(s11);
            C2857A c2857a = f6616a;
            if (a11 == c2857a) {
                return c2857a;
            }
            S s12 = (x) ((AbstractC2861d) a11);
            if (s12 == null) {
                s12 = function2.invoke(Long.valueOf(s11.f6654c + 1), s11);
                if (s11.i(s12)) {
                    if (s11.f()) {
                        s11.h();
                    }
                }
            }
            s11 = s12;
        }
    }
}
