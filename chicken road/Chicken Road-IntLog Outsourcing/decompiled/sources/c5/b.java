package c5;

import j5.i;
import l1.j;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final i f4931a;

    static {
        i iVar = i.f10496d;
        f4931a = j.h("xn--");
    }

    public static int a(int i2, int i3, boolean z) {
        int i6 = z ? i2 / 700 : i2 / 2;
        int i7 = (i6 / i3) + i6;
        int i8 = 0;
        while (i7 > 455) {
            i7 /= 35;
            i8 += 36;
        }
        return ((i7 * 36) / (i7 + 38)) + i8;
    }

    public static int b(int i2) {
        if (i2 < 26) {
            return i2 + 97;
        }
        if (i2 < 36) {
            return i2 + 22;
        }
        throw new IllegalStateException(("unexpected digit: " + i2).toString());
    }
}
