package y6;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends x6.a {
    @Override // x6.a
    public final Random a() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        h.d(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
