package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.LongPressGateway;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes2.dex */
public interface OverlayReceiver extends LongPressGateway.BounceHandler {
    public static final BounceHandler clipOrigin = BounceHandler.reduceScope;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public static LongPressGateway.BounceHandler evictLayout(OverlayReceiver overlayReceiver, LongPressGateway.FeedbackFlow key) {
            LongPressGateway.BounceHandler growPayload;
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof PanelUtil)) {
                if (OverlayReceiver.clipOrigin != key) {
                    return null;
                }
                Intrinsics.checkNotNull(overlayReceiver, "null cannot be cast to non-null type E of kotlin.coroutines.ContinuationInterceptor.get");
                return overlayReceiver;
            }
            PanelUtil panelUtil = (PanelUtil) key;
            if (!panelUtil.evictLayout(overlayReceiver.getKey()) || (growPayload = panelUtil.growPayload(overlayReceiver)) == null) {
                return null;
            }
            return growPayload;
        }

        public static LongPressGateway growPayload(OverlayReceiver overlayReceiver, LongPressGateway.FeedbackFlow key) {
            Intrinsics.checkNotNullParameter(key, "key");
            if (!(key instanceof PanelUtil)) {
                return OverlayReceiver.clipOrigin == key ? BackgroundIndex.reduceScope : overlayReceiver;
            }
            PanelUtil panelUtil = (PanelUtil) key;
            return (!panelUtil.evictLayout(overlayReceiver.getKey()) || panelUtil.growPayload(overlayReceiver) == null) ? overlayReceiver : BackgroundIndex.reduceScope;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler implements LongPressGateway.FeedbackFlow {
        public static final /* synthetic */ BounceHandler reduceScope = new BounceHandler();
    }

    void drawRequest(ServiceRegulator serviceRegulator);

    ServiceRegulator inflateAdapter(ServiceRegulator serviceRegulator);
}
