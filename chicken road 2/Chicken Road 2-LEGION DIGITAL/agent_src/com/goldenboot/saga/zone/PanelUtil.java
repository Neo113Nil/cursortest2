package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.LongPressGateway;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public abstract class PanelUtil implements LongPressGateway.FeedbackFlow {
    public final LongPressGateway.FeedbackFlow notifyMessage;
    public final TouchRecord reduceScope;

    public PanelUtil(LongPressGateway.FeedbackFlow baseKey, TouchRecord safeCast) {
        Intrinsics.checkNotNullParameter(baseKey, "baseKey");
        Intrinsics.checkNotNullParameter(safeCast, "safeCast");
        this.reduceScope = safeCast;
        this.notifyMessage = baseKey instanceof PanelUtil ? ((PanelUtil) baseKey).notifyMessage : baseKey;
    }

    public final boolean evictLayout(LongPressGateway.FeedbackFlow key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return key == this || this.notifyMessage == key;
    }

    public final LongPressGateway.BounceHandler growPayload(LongPressGateway.BounceHandler element) {
        Intrinsics.checkNotNullParameter(element, "element");
        return (LongPressGateway.BounceHandler) this.reduceScope.invoke(element);
    }
}
