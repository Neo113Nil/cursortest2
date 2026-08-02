package y6;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import t6.h;

/* loaded from: classes2.dex */
public final class a extends x6.a {
    @Override // x6.a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        h.d(current, "current(...)");
        return current;
    }
}
