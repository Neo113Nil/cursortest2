package E3;

import java.util.Comparator;

/* loaded from: classes2.dex */
public final class r extends AbstractC0161t {
    public static AbstractC0161t f(int i7) {
        return i7 < 0 ? AbstractC0161t.f2069b : i7 > 0 ? AbstractC0161t.f2070c : AbstractC0161t.f2068a;
    }

    @Override // E3.AbstractC0161t
    public final AbstractC0161t a(int i7, int i8) {
        return f(i7 < i8 ? -1 : i7 > i8 ? 1 : 0);
    }

    @Override // E3.AbstractC0161t
    public final AbstractC0161t b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // E3.AbstractC0161t
    public final AbstractC0161t c(boolean z4, boolean z7) {
        return f(z4 == z7 ? 0 : z4 ? 1 : -1);
    }

    @Override // E3.AbstractC0161t
    public final AbstractC0161t d(boolean z4, boolean z7) {
        return f(z7 == z4 ? 0 : z7 ? 1 : -1);
    }

    @Override // E3.AbstractC0161t
    public final int e() {
        return 0;
    }
}
