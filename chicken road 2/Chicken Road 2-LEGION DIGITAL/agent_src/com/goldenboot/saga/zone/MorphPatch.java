package com.goldenboot.saga.zone;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class MorphPatch {
    public static boolean evictLayout;
    public static final Object growPayload = new MenuTranslator("provider");
    public static final Object injectMetric = new MenuTranslator("provider");
    public static final Object detachStream = new MenuTranslator("compositionLocalMap");
    public static final Object releaseHeader = new MenuTranslator("providerValues");
    public static final Object clipOrigin = new MenuTranslator("providers");
    public static final Object flushSample = new MenuTranslator("reference");
    public static final Comparator updateTimer = new Comparator() { // from class: com.goldenboot.saga.zone.AlarmNotifier
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            int detachStream2;
            detachStream2 = MorphPatch.detachStream((GridPipe) obj, (GridPipe) obj2);
            return detachStream2;
        }
    };

    public static final DpadBuilder attachCallback(BounceRouter bounceRouter, int i, Object obj) {
        if (obj instanceof MarginBootstrapper) {
            bounceRouter.evictLayout((MarginBootstrapper) obj);
        }
        if (obj instanceof TimelineHeap) {
            bounceRouter.detachStream((TimelineHeap) obj);
        }
        if (obj instanceof ColumnValve) {
            ((ColumnValve) obj).findTask();
        }
        return DpadBuilder.evictLayout;
    }

    public static final List attachConfig(ComponentSender componentSender, TouchEvaluator touchEvaluator) {
        ArrayList arrayList = new ArrayList();
        PointerEdge unlockMessage = componentSender.unlockMessage();
        try {
            resetDelta(unlockMessage, arrayList, componentSender.clipOrigin(touchEvaluator));
            DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            return arrayList;
        } finally {
            unlockMessage.detachStream();
        }
    }

    public static final boolean bindBody() {
        return false;
    }

    public static final void connectComponent(List list, int i, int i2) {
        int drawScope = drawScope(list, i);
        while (drawScope < list.size() && ((GridPipe) list.get(drawScope)).growPayload() < i2) {
        }
    }

    public static final int decodePath(PointerEdge pointerEdge, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = pointerEdge.prepareTask(i);
            i3++;
        }
        return i3;
    }

    public static final int detachStream(GridPipe gridPipe, GridPipe gridPipe2) {
        return Intrinsics.compare(gridPipe.growPayload(), gridPipe2.growPayload());
    }

    public static final ParallelHeap dispatchTimezone(int i) {
        return KeyboardMap.detachStream(new ParallelHeap(i));
    }

    public static final void drawRequest(final ElevationStack elevationStack, final BounceRouter bounceRouter) {
        elevationStack.groupArchive(elevationStack.resetValue(), new IconExporter() { // from class: com.goldenboot.saga.zone.SetupNotifier
            @Override // com.goldenboot.saga.zone.IconExporter
            public final Object invoke(Object obj, Object obj2) {
                DpadBuilder gatherAdapter;
                gatherAdapter = MorphPatch.gatherAdapter(BounceRouter.this, elevationStack, ((Integer) obj).intValue(), obj2);
                return gatherAdapter;
            }
        });
    }

    public static final int drawScope(List list, int i) {
        int expandArgs = expandArgs(list, i);
        return expandArgs < 0 ? -(expandArgs + 1) : expandArgs;
    }

    public static final int expandArgs(List list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int compare = Intrinsics.compare(((GridPipe) list.get(i3)).growPayload(), i);
            if (compare < 0) {
                i2 = i3 + 1;
            } else {
                if (compare <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final Object filterPayload() {
        return clipOrigin;
    }

    public static final GridPipe findTask(List list, int i, int i2) {
        int drawScope = drawScope(list, i);
        if (drawScope >= list.size()) {
            return null;
        }
        GridPipe gridPipe = (GridPipe) list.get(drawScope);
        if (gridPipe.growPayload() < i2) {
            return gridPipe;
        }
        return null;
    }

    public static final Object flattenPackage() {
        return growPayload;
    }

    public static final DpadBuilder gatherAdapter(BounceRouter bounceRouter, ElevationStack elevationStack, int i, Object obj) {
        if (obj instanceof MarginBootstrapper) {
            bounceRouter.growPayload((MarginBootstrapper) obj);
        } else if (obj instanceof TimelineHeap) {
            TimelineHeap timelineHeap = (TimelineHeap) obj;
            if (!(timelineHeap.growPayload() instanceof TriggerMulticaster)) {
                prepareTask(elevationStack, i, obj);
                bounceRouter.detachStream(timelineHeap);
            }
        } else if (obj instanceof ColumnValve) {
            prepareTask(elevationStack, i, obj);
            ((ColumnValve) obj).findTask();
        }
        return DpadBuilder.evictLayout;
    }

    public static final void inflateAdapter(String str) {
        throw new PluginRollback("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final Object inflateEdge() {
        return flushSample;
    }

    public static final Object injectConstraint(ServerScanner serverScanner) {
        return serverScanner.detachStream() != null ? new FeedbackAlerter(Integer.valueOf(serverScanner.evictLayout()), serverScanner.detachStream()) : Integer.valueOf(serverScanner.evictLayout());
    }

    public static final void mapJob(ElevationStack elevationStack, final BounceRouter bounceRouter) {
        elevationStack.groupArchive(elevationStack.resetValue(), new IconExporter() { // from class: com.goldenboot.saga.zone.HapticCustodian
            @Override // com.goldenboot.saga.zone.IconExporter
            public final Object invoke(Object obj, Object obj2) {
                DpadBuilder attachCallback;
                attachCallback = MorphPatch.attachCallback(BounceRouter.this, ((Integer) obj).intValue(), obj2);
                return attachCallback;
            }
        });
        elevationStack.acquireAsset();
    }

    public static final boolean mergeLocale() {
        return evictLayout;
    }

    public static final boolean notifyMessage(int i) {
        return i != 0;
    }

    public static final boolean packPackage(PointerEdge pointerEdge) {
        return pointerEdge.drawField() > pointerEdge.purgeNode() + 1;
    }

    public static final int parseAsset(PointerEdge pointerEdge, int i, int i2, int i3) {
        if (i != i2) {
            if (i == i3 || i2 == i3) {
                return i3;
            }
            if (pointerEdge.prepareTask(i) == i2) {
                return i2;
            }
            if (pointerEdge.prepareTask(i2) != i) {
                if (pointerEdge.prepareTask(i) == pointerEdge.prepareTask(i2)) {
                    return pointerEdge.prepareTask(i);
                }
                int decodePath = decodePath(pointerEdge, i, i3);
                int decodePath2 = decodePath(pointerEdge, i2, i3);
                int i4 = decodePath - decodePath2;
                for (int i5 = 0; i5 < i4; i5++) {
                    i = pointerEdge.prepareTask(i);
                }
                int i6 = decodePath2 - decodePath;
                for (int i7 = 0; i7 < i6; i7++) {
                    i2 = pointerEdge.prepareTask(i2);
                }
                while (i != i2) {
                    i = pointerEdge.prepareTask(i);
                    i2 = pointerEdge.prepareTask(i2);
                }
                return i;
            }
        }
        return i;
    }

    public static final void prepareTask(ElevationStack elevationStack, int i, Object obj) {
        Object inflateEdge = elevationStack.inflateEdge(i);
        if (obj == inflateEdge) {
            return;
        }
        inflateAdapter("Slot table is out of sync (expected " + obj + ", got " + inflateEdge + ')');
    }

    public static final Void purgeNode(String str) {
        throw new PluginRollback("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void queryModel(List list, int i, ColumnValve columnValve, Object obj) {
        int expandArgs = expandArgs(list, i);
        if (expandArgs < 0) {
            int i2 = -(expandArgs + 1);
            if (!(obj instanceof VibrationEvent)) {
                obj = null;
            }
            list.add(i2, new GridPipe(columnValve, i, obj));
            return;
        }
        GridPipe gridPipe = (GridPipe) list.get(expandArgs);
        if (!(obj instanceof VibrationEvent)) {
            gridPipe.releaseHeader(null);
            return;
        }
        Object evictLayout2 = gridPipe.evictLayout();
        if (evictLayout2 == null) {
            gridPipe.releaseHeader(obj);
        } else if (evictLayout2 instanceof CustomStore) {
            ((CustomStore) evictLayout2).updateTimer(obj);
        } else {
            gridPipe.releaseHeader(SelectionMapper.injectMetric(evictLayout2, obj));
        }
    }

    public static final void resetDelta(PointerEdge pointerEdge, List list, int i) {
        if (pointerEdge.unlockMessage(i)) {
            list.add(pointerEdge.dispatchTimezone(i));
            return;
        }
        int i2 = i + 1;
        int storeCharset = i + pointerEdge.storeCharset(i);
        while (i2 < storeCharset) {
            resetDelta(pointerEdge, list, i2);
            i2 += pointerEdge.storeCharset(i2);
        }
    }

    public static final Object storeCharset() {
        return injectMetric;
    }

    public static final Object syncScope() {
        return detachStream;
    }

    public static final boolean unlockMessage(ElevationStack elevationStack) {
        return elevationStack.resetValue() > elevationStack.serializeTask() + 1;
    }

    public static final GridPipe updateAction(List list, int i) {
        int expandArgs = expandArgs(list, i);
        if (expandArgs >= 0) {
            return (GridPipe) list.remove(expandArgs);
        }
        return null;
    }

    public static final void startResource() {
    }

    public static final int connectPatch(boolean z) {
        return z ? 1 : 0;
    }

    public static final void formatPosition(int i, int i2, int i3, String str) {
    }
}
