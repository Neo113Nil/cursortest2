package io.sentry.android.replay.util;

import io.sentry.util.Random;
import t6.h;

/* JADX INFO: loaded from: classes2.dex */
public final class SamplingKt {
    public static final boolean sample(Random random, Double d7) {
        h.e(random, "<this>");
        return d7 != null && d7.doubleValue() >= random.nextDouble();
    }
}
