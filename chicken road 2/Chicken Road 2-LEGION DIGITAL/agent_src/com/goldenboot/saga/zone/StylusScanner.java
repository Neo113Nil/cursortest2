package com.goldenboot.saga.zone;

import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class StylusScanner {
    public static final SelectionHub evictLayout = CellAllocator.popBlueprint(ActivityMutator.reduceScope);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends Lambda implements ElevationNode {
        public static final ActivityMutator reduceScope = new ActivityMutator();

        public ActivityMutator() {
            super(0);
        }

        @Override // com.goldenboot.saga.zone.ElevationNode
        /* renamed from: evictLayout, reason: merged with bridge method [inline-methods] */
        public final ToastSynthesizer invoke() {
            return new ToastSynthesizer(null, null, null, null, null, 31, null);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public /* synthetic */ class BounceHandler {
        public static final /* synthetic */ int[] evictLayout;

        static {
            int[] iArr = new int[BottomBarMaintainer.values().length];
            try {
                iArr[BottomBarMaintainer.CornerExtraLarge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BottomBarMaintainer.CornerExtraLargeTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BottomBarMaintainer.CornerExtraSmall.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BottomBarMaintainer.CornerExtraSmallTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BottomBarMaintainer.CornerFull.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BottomBarMaintainer.CornerLarge.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BottomBarMaintainer.CornerLargeEnd.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BottomBarMaintainer.CornerLargeTop.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BottomBarMaintainer.CornerMedium.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BottomBarMaintainer.CornerNone.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BottomBarMaintainer.CornerSmall.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            evictLayout = iArr;
        }
    }

    public static final ChannelCollector detachStream(BottomBarMaintainer bottomBarMaintainer, NotificationFence notificationFence, int i) {
        if (MorphPatch.bindBody()) {
            MorphPatch.formatPosition(1629172543, i, -1, "androidx.compose.material3.<get-value> (Shapes.kt:191)");
        }
        ChannelCollector growPayload = growPayload(StyleHelper.evictLayout.growPayload(notificationFence, 6), bottomBarMaintainer);
        if (MorphPatch.bindBody()) {
            MorphPatch.startResource();
        }
        return growPayload;
    }

    public static final FlingFabricator evictLayout(FlingFabricator flingFabricator) {
        float f = (float) 0.0d;
        return FlingFabricator.injectMetric(flingFabricator, WatcherSanitizer.growPayload(InsetsEdge.drawField(f)), null, null, WatcherSanitizer.growPayload(InsetsEdge.drawField(f)), 6, null);
    }

    public static final ChannelCollector growPayload(ToastSynthesizer toastSynthesizer, BottomBarMaintainer bottomBarMaintainer) {
        switch (BounceHandler.evictLayout[bottomBarMaintainer.ordinal()]) {
            case 1:
                return toastSynthesizer.evictLayout();
            case 2:
                return releaseHeader(toastSynthesizer.evictLayout());
            case 3:
                return toastSynthesizer.growPayload();
            case 4:
                return releaseHeader(toastSynthesizer.growPayload());
            case 5:
                return SaveCycle.releaseHeader();
            case 6:
                return toastSynthesizer.injectMetric();
            case 7:
                return evictLayout(toastSynthesizer.injectMetric());
            case 8:
                return releaseHeader(toastSynthesizer.injectMetric());
            case 9:
                return toastSynthesizer.detachStream();
            case ViewStreamer.applyTask /* 10 */:
                return ClientTunnel.evictLayout();
            case 11:
                return toastSynthesizer.releaseHeader();
            default:
                throw new EndpointArchive();
        }
    }

    public static final SelectionHub injectMetric() {
        return evictLayout;
    }

    public static final FlingFabricator releaseHeader(FlingFabricator flingFabricator) {
        float f = (float) 0.0d;
        return FlingFabricator.injectMetric(flingFabricator, null, null, WatcherSanitizer.growPayload(InsetsEdge.drawField(f)), WatcherSanitizer.growPayload(InsetsEdge.drawField(f)), 3, null);
    }
}
