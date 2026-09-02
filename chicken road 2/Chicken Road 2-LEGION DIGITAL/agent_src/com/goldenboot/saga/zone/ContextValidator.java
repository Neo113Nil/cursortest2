package com.goldenboot.saga.zone;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ContextValidator {
    public final AtomicBoolean evictLayout;

    public ContextValidator(boolean z) {
        this.evictLayout = new AtomicBoolean(z);
    }

    public final boolean evictLayout() {
        return this.evictLayout.get();
    }

    public final void growPayload(boolean z) {
        this.evictLayout.set(z);
    }
}
