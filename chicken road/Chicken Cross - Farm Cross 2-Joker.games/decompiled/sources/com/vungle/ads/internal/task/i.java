package com.vungle.ads.internal.task;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public abstract class i implements com.vungle.ads.internal.executor.h {
    public abstract int a();

    @Override // java.lang.Comparable
    public int compareTo(Object other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (!(other instanceof i)) {
            return -1;
        }
        return Intrinsics.compare(((i) other).a(), a());
    }
}
