package i1;

/* renamed from: i1.v, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0203v extends Q1.d {
    public static int E(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static java.util.Map F(h1.C0172d pair) {
        kotlin.jvm.internal.i.e(pair, "pair");
        java.util.Map singletonMap = java.util.Collections.singletonMap(pair.f3295a, pair.f3296b);
        kotlin.jvm.internal.i.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }
}
