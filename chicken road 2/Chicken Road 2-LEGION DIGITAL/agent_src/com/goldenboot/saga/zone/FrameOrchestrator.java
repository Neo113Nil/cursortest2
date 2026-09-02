package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.InlineMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0080\b¢\u0006\u0004\b\u0003\u0010\u0004\u001a9\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0081\b\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "ref", "Lcom/goldenboot/saga/zone/NativeDecoder;", "evictLayout", "(Ljava/lang/Object;)Lcom/goldenboot/saga/zone/NativeDecoder;", "R", "lock", "Lkotlin/Function0;", "block", "injectMetric", "(Lcom/goldenboot/saga/zone/NativeDecoder;Lcom/goldenboot/saga/zone/ElevationNode;)Ljava/lang/Object;", "ui-text"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class FrameOrchestrator {
    public static final NativeDecoder evictLayout(Object obj) {
        return new NativeDecoder();
    }

    public static /* synthetic */ NativeDecoder growPayload(Object obj, int i, Object obj2) {
        return new NativeDecoder();
    }

    public static final <R> R injectMetric(NativeDecoder nativeDecoder, ElevationNode elevationNode) {
        R r;
        synchronized (nativeDecoder) {
            try {
                r = (R) elevationNode.invoke();
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        return r;
    }
}
