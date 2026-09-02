package com.goldenboot.saga.zone;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class PopupToggle {
    public static final PublisherSender evictLayout;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler extends Lambda implements TouchRecord {
        public static final BounceHandler reduceScope = new BounceHandler();

        public BounceHandler() {
            super(1);
        }

        public final List evictLayout(int i) {
            return CursorBuilder.peekRevision();
        }

        @Override // com.goldenboot.saga.zone.TouchRecord
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return evictLayout(((Number) obj).intValue());
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class FeedbackFlow extends Lambda implements ElevationNode {
        public final /* synthetic */ int notifyMessage;
        public final /* synthetic */ int reduceScope;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FeedbackFlow(int i, int i2) {
            super(0);
            this.reduceScope = i;
            this.notifyMessage = i2;
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final SwipeRouter invoke() {
            return new SwipeRouter(this.reduceScope, this.notifyMessage);
        }
    }

    static {
        ActivityMutator activityMutator = new ActivityMutator();
        List peekRevision = CursorBuilder.peekRevision();
        BounceSplitter bounceSplitter = BounceSplitter.Vertical;
        evictLayout = new PublisherSender(null, 0, false, 0.0f, activityMutator, false, LayerArray.evictLayout(BackgroundIndex.reduceScope), EmbeddedProbe.growPayload(1.0f, 0.0f, 2, null), 0, BounceHandler.reduceScope, peekRevision, 0, 0, 0, false, bounceSplitter, 0, 0);
    }

    public static final SwipeRouter growPayload(int i, int i2, NotificationFence notificationFence, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = 0;
        }
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if (MorphPatch.bindBody()) {
            MorphPatch.formatPosition(29186956, i3, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:71)");
        }
        Object[] objArr = new Object[0];
        PaletteMap evictLayout2 = SwipeRouter.drawRequest.evictLayout();
        boolean z = ((((i3 & 14) ^ 6) > 4 && notificationFence.updateTimer(i)) || (i3 & 6) == 4) | ((((i3 & 112) ^ 48) > 32 && notificationFence.updateTimer(i2)) || (i3 & 48) == 32);
        Object clipOrigin = notificationFence.clipOrigin();
        if (z || clipOrigin == NotificationFence.evictLayout.evictLayout()) {
            clipOrigin = new FeedbackFlow(i, i2);
            notificationFence.bindBody(clipOrigin);
        }
        SwipeRouter swipeRouter = (SwipeRouter) BaseHook.clipOrigin(objArr, evictLayout2, null, (ElevationNode) clipOrigin, notificationFence, 0, 4);
        if (MorphPatch.bindBody()) {
            MorphPatch.startResource();
        }
        return swipeRouter;
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator implements ContentConfigurator {
        public final int evictLayout;
        public final int growPayload;
        public final Map injectMetric = AttrConductor.updateTimer();

        @Override // com.goldenboot.saga.zone.ContentConfigurator
        /* renamed from: getHeight */
        public int getGrowPayload() {
            return this.growPayload;
        }

        @Override // com.goldenboot.saga.zone.ContentConfigurator
        /* renamed from: getWidth */
        public int getEvictLayout() {
            return this.evictLayout;
        }

        @Override // com.goldenboot.saga.zone.ContentConfigurator
        public Map injectConstraint() {
            return this.injectMetric;
        }

        @Override // com.goldenboot.saga.zone.ContentConfigurator
        public void popBlueprint() {
        }
    }
}
