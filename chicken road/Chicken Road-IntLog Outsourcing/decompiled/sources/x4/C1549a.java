package x4;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.i;
import w4.AbstractC1522a;

/* renamed from: x4.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1549a extends AbstractC1522a {
    @Override // w4.AbstractC1522a
    public final Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        i.d(current, "current(...)");
        return current;
    }
}
