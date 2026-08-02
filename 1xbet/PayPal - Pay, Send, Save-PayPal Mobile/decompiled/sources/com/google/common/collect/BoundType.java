package com.google.common.collect;

/* loaded from: classes9.dex */
public enum BoundType {
    OPEN(false),
    CLOSED(true);

    final boolean inclusive;

    BoundType(boolean z) {
        this.inclusive = z;
    }

    static com.google.common.collect.BoundType forBoolean(boolean z) {
        return z ? CLOSED : OPEN;
    }
}
