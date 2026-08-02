package kotlinx.coroutines.channels;

import kotlinx.coroutines.channels.g;

/* loaded from: classes5.dex */
public final class j {
    public static b a(int i, a aVar, int i2) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            aVar = a.a;
        }
        if (i == -2) {
            if (aVar != a.a) {
                return new q(1, aVar);
            }
            g.h.getClass();
            return new b(g.a.b);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? aVar == a.a ? new b(i) : new q(i, aVar) : new b(Integer.MAX_VALUE) : aVar == a.a ? new b(0) : new q(1, aVar);
        }
        if (aVar == a.a) {
            return new q(1, a.b);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }
}
