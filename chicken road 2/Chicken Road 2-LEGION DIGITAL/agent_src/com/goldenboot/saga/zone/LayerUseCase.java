package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class LayerUseCase {
    public static final int evictLayout(int[] iArr, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i) {
                i2 = i5 + 1;
            } else {
                if (i6 <= i) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return (-i2) - 1;
    }

    public static final int growPayload(HeaderStep headerStep, int i) {
        Intrinsics.checkNotNullParameter(headerStep, "<this>");
        int evictLayout = evictLayout(headerStep.injectConstraint(), i + 1, 0, headerStep.storeCharset().length);
        return evictLayout >= 0 ? evictLayout : ~evictLayout;
    }
}
