package com.goldenboot.saga.zone;

import java.util.Random;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public final class RestoreLoop extends DimenSensor {
    public final ActivityMutator connectPatch = new ActivityMutator();

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // com.goldenboot.saga.zone.DimenSensor
    public Random flushSample() {
        Object obj = this.connectPatch.get();
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        return (Random) obj;
    }
}
