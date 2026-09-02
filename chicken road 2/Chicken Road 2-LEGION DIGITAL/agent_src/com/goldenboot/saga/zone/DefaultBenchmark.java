package com.goldenboot.saga.zone;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class DefaultBenchmark {
    public static Object[] clipOrigin(int i, Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (i < array.length) {
            array[i] = null;
        }
        return array;
    }

    public static List detachStream(int i) {
        return new TouchLoader(i);
    }

    public static List evictLayout(List builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((TouchLoader) builder).storeCharset();
    }

    public static final Object[] growPayload(Object[] objArr, boolean z) {
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        if (z && Intrinsics.areEqual(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return copyOf;
    }

    public static List injectMetric() {
        return new TouchLoader(0, 1, null);
    }

    public static List releaseHeader(Object obj) {
        List singletonList = Collections.singletonList(obj);
        Intrinsics.checkNotNullExpressionValue(singletonList, "singletonList(...)");
        return singletonList;
    }
}
