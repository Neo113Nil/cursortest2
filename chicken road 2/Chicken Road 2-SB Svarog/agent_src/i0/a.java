package i0;

import g0.h;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* loaded from: classes.dex */
public final class a extends h0.a {
    @Override // h0.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        h.d(current, "current(...)");
        return current;
    }
}
