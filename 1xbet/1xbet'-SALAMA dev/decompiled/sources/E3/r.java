package E3;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends AbstractC0161t {
    public static AbstractC0161t f(int i7) {
        if (i7 < 0) {
            return AbstractC0161t.f2069b;
        }
        return i7 > 0 ? AbstractC0161t.f2070c : AbstractC0161t.f2068a;
    }

    @Override // E3.AbstractC0161t
    public final AbstractC0161t a(int i7, int i8) {
        int i9;
        if (i7 < i8) {
            i9 = -1;
        } else {
            i9 = i7 > i8 ? 1 : 0;
        }
        return f(i9);
    }

    @Override // E3.AbstractC0161t
    public final AbstractC0161t b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // E3.AbstractC0161t
    public final AbstractC0161t c(boolean z4, boolean z7) {
        int i7;
        if (z4 == z7) {
            i7 = 0;
        } else {
            i7 = z4 ? 1 : -1;
        }
        return f(i7);
    }

    @Override // E3.AbstractC0161t
    public final AbstractC0161t d(boolean z4, boolean z7) {
        int i7;
        if (z7 == z4) {
            i7 = 0;
        } else {
            i7 = z7 ? 1 : -1;
        }
        return f(i7);
    }

    @Override // E3.AbstractC0161t
    public final int e() {
        return 0;
    }
}
