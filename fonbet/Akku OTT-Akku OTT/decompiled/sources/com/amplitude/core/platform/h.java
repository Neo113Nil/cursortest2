package com.amplitude.core.platform;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface h extends k {
    default com.amplitude.core.events.c a(com.amplitude.core.events.c payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return payload;
    }

    default com.amplitude.core.events.g d(com.amplitude.core.events.g payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return payload;
    }

    default com.amplitude.core.events.a e(com.amplitude.core.events.a payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return payload;
    }

    default void flush() {
    }

    default com.amplitude.core.events.b g(com.amplitude.core.events.b payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        return payload;
    }
}
