package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.AttrSemaphore;
import com.goldenboot.saga.zone.ConfigDelta;
import com.goldenboot.saga.zone.DrawableSynthesizer;
import com.goldenboot.saga.zone.GroupSegment;
import com.goldenboot.saga.zone.ItemGovernor;
import com.goldenboot.saga.zone.LongPressCollector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class LongPressCollector extends WorkerIndex {
    public final PluginScheduler applyTask;
    public GroupSegment attachConfig;
    public final List clipOrigin;
    public final ParallelHeap connectJob;
    public Set connectPatch;
    public final NativeSyncer decodePath;
    public DrawableSynthesizer detachStream;
    public final List drawField;
    public boolean drawRequest;
    public final HapticDiff drawScope;
    public long evictLayout;
    public final LongPressGateway expandArgs;
    public SlotWorkflow findTask;
    public List flushSample;
    public final WrapperState gatherAdapter;
    public final FlexDirector growPayload;
    public boolean inflateAdapter;
    public final Object injectMetric;
    public final FeedbackFlow mergeLocale;
    public List notifyMessage;
    public final SurfaceCollection peekRevision;
    public final List popBlueprint;
    public BounceHandler purgeNode;
    public final ParallelHeap reduceScope;
    public Throwable releaseHeader;
    public int resetDelta;
    public final ParallelHeap serializeOffset;
    public CustomStore updateTimer;
    public static final ActivityMutator syncScope = new ActivityMutator(null);
    public static final int flattenPackage = 8;
    public static final WrapperState injectConstraint = PaddingImporter.evictLayout(PopupOperation.injectMetric());
    public static final AtomicReference storeCharset = new AtomicReference(Boolean.FALSE);

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public /* synthetic */ ActivityMutator(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void detachStream(FeedbackFlow feedbackFlow) {
            InsetsPhase insetsPhase;
            InsetsPhase remove;
            do {
                insetsPhase = (InsetsPhase) LongPressCollector.injectConstraint.getValue();
                remove = insetsPhase.remove((Object) feedbackFlow);
                if (insetsPhase == remove) {
                    return;
                }
            } while (!LongPressCollector.injectConstraint.evictLayout(insetsPhase, remove));
        }

        public final void injectMetric(FeedbackFlow feedbackFlow) {
            InsetsPhase insetsPhase;
            InsetsPhase add;
            do {
                insetsPhase = (InsetsPhase) LongPressCollector.injectConstraint.getValue();
                add = insetsPhase.add((Object) feedbackFlow);
                if (insetsPhase == add) {
                    return;
                }
            } while (!LongPressCollector.injectConstraint.evictLayout(insetsPhase, add));
        }

        public ActivityMutator() {
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class BounceHandler {
        public final boolean evictLayout;
        public final Throwable growPayload;

        public BounceHandler(boolean z, Throwable th) {
            this.evictLayout = z;
            this.growPayload = th;
        }

        public Throwable evictLayout() {
            return this.growPayload;
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class EndpointList extends PanelRevision implements IconExporter {
        public /* synthetic */ Object notifyMessage;
        public int reduceScope;

        public EndpointList(ServiceRegulator serviceRegulator) {
            super(2, serviceRegulator);
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
            EndpointList endpointList = new EndpointList(serviceRegulator);
            endpointList.notifyMessage = obj;
            return endpointList;
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        /* renamed from: detachStream, reason: merged with bridge method [inline-methods] */
        public final Object invoke(LayerUseCase layerUseCase, ServiceRegulator serviceRegulator) {
            return ((EndpointList) create(layerUseCase, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final Object invokeSuspend(Object obj) {
            RotateReceiver.releaseHeader();
            if (this.reduceScope != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ColumnForger.growPayload(obj);
            return WindowRevision.evictLayout(((LayerUseCase) this.notifyMessage) == LayerUseCase.reduceScope);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public final class FeedbackFlow {
        public FeedbackFlow() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class LayerUseCase {
        public static final /* synthetic */ ItemProcessor drawRequest;
        public static final /* synthetic */ LayerUseCase[] purgeNode;
        public static final LayerUseCase reduceScope = new LayerUseCase("ShutDown", 0);
        public static final LayerUseCase notifyMessage = new LayerUseCase("ShuttingDown", 1);
        public static final LayerUseCase connectPatch = new LayerUseCase("Inactive", 2);
        public static final LayerUseCase attachConfig = new LayerUseCase("InactivePendingWork", 3);
        public static final LayerUseCase resetDelta = new LayerUseCase("Idle", 4);
        public static final LayerUseCase inflateAdapter = new LayerUseCase("PendingWork", 5);

        static {
            LayerUseCase[] evictLayout = evictLayout();
            purgeNode = evictLayout;
            drawRequest = TranslateConductor.evictLayout(evictLayout);
        }

        public LayerUseCase(String str, int i) {
        }

        public static final /* synthetic */ LayerUseCase[] evictLayout() {
            return new LayerUseCase[]{reduceScope, notifyMessage, connectPatch, attachConfig, resetDelta, inflateAdapter};
        }

        public static LayerUseCase valueOf(String str) {
            return (LayerUseCase) Enum.valueOf(LayerUseCase.class, str);
        }

        public static LayerUseCase[] values() {
            return (LayerUseCase[]) purgeNode.clone();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ScopedMigration extends PanelRevision implements ConfigListener {
        public Object attachConfig;
        public Object connectPatch;
        public /* synthetic */ Object decodePath;
        public Object drawRequest;
        public int gatherAdapter;
        public Object inflateAdapter;
        public Object notifyMessage;
        public Object purgeNode;
        public Object reduceScope;
        public Object resetDelta;

        public ScopedMigration(ServiceRegulator serviceRegulator) {
            super(3, serviceRegulator);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:183:0x030a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:199:0x0342 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static final DpadBuilder applyTask(LongPressCollector longPressCollector, CustomStore customStore, CustomStore customStore2, List list, List list2, CustomStore customStore3, List list3, CustomStore customStore4, Set set, long j) {
            boolean z;
            char c;
            long j2;
            long j3;
            LongPressCollector longPressCollector2 = longPressCollector;
            List list4 = list;
            List list5 = list3;
            CustomStore customStore5 = customStore4;
            if (longPressCollector2.peekDescriptor()) {
                AnchorAnalyzer anchorAnalyzer = AnchorAnalyzer.evictLayout;
                Object evictLayout = anchorAnalyzer.evictLayout("Recomposer:animation");
                try {
                    longPressCollector2.growPayload.findTask(j);
                    ItemGovernor.releaseHeader.peekRevision();
                    DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
                    anchorAnalyzer.growPayload(evictLayout);
                } finally {
                    AnchorAnalyzer.evictLayout.growPayload(evictLayout);
                }
            }
            Object evictLayout2 = AnchorAnalyzer.evictLayout.evictLayout("Recomposer:recompose");
            try {
                longPressCollector2.queryData();
                synchronized (longPressCollector2.injectMetric) {
                    try {
                        PluginScheduler pluginScheduler = longPressCollector2.applyTask;
                        Object[] objArr = pluginScheduler.reduceScope;
                        int reduceScope = pluginScheduler.reduceScope();
                        z = 0;
                        for (int i = 0; i < reduceScope; i++) {
                            list4.add((ScrollAggregator) objArr[i]);
                        }
                        longPressCollector2.applyTask.popBlueprint();
                        DpadBuilder dpadBuilder2 = DpadBuilder.evictLayout;
                    } finally {
                    }
                }
                customStore.peekRevision();
                customStore2.peekRevision();
            } catch (Throwable th) {
                throw th;
            }
            while (true) {
                if (list4.isEmpty() && list2.isEmpty()) {
                    break;
                }
                List list6 = list4;
                List list7 = list5;
                try {
                    int size = list6.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ScrollAggregator scrollAggregator = (ScrollAggregator) list6.get(i2);
                        ScrollAggregator executeConfig = longPressCollector2.executeConfig(scrollAggregator, customStore);
                        if (executeConfig != null) {
                            list7.add(executeConfig);
                            DpadBuilder dpadBuilder3 = DpadBuilder.evictLayout;
                        }
                        customStore2.updateTimer(scrollAggregator);
                    }
                    list6.clear();
                    if (!customStore.releaseHeader() && longPressCollector2.applyTask.reduceScope() == 0) {
                        if (list6.isEmpty()) {
                            longPressCollector2 = longPressCollector;
                            list4 = list;
                            list5 = list3;
                            customStore5 = customStore4;
                            z = 0;
                        } else {
                            try {
                                updateTimer(list2, longPressCollector2);
                                while (!list2.isEmpty()) {
                                    customStore3.gatherAdapter(longPressCollector2.appendEvent(list2, customStore));
                                    updateTimer(list2, longPressCollector2);
                                }
                                list4 = list6;
                                list5 = list7;
                                z = 0;
                                customStore5 = customStore4;
                            } catch (Throwable th2) {
                                LongPressCollector.acquireArchive(longPressCollector2, th2, null, true, 2, null);
                                flushSample(longPressCollector, list6, list2, list7, customStore3, customStore4, customStore, customStore2);
                                return DpadBuilder.evictLayout;
                            }
                        }
                    }
                    synchronized (longPressCollector2.injectMetric) {
                        try {
                            List formatMessage = longPressCollector2.formatMessage();
                            int size2 = formatMessage.size();
                            for (int i3 = 0; i3 < size2; i3++) {
                                ScrollAggregator scrollAggregator2 = (ScrollAggregator) formatMessage.get(i3);
                                if (!customStore2.evictLayout(scrollAggregator2) && scrollAggregator2.updateTimer(set)) {
                                    list6.add(scrollAggregator2);
                                }
                            }
                            PluginScheduler pluginScheduler2 = longPressCollector2.applyTask;
                            int reduceScope2 = pluginScheduler2.reduceScope();
                            int i4 = 0;
                            for (int i5 = 0; i5 < reduceScope2; i5++) {
                                ScrollAggregator scrollAggregator3 = (ScrollAggregator) pluginScheduler2.reduceScope[i5];
                                if (!customStore2.evictLayout(scrollAggregator3) && !list6.contains(scrollAggregator3)) {
                                    list6.add(scrollAggregator3);
                                    i4++;
                                } else if (i4 > 0) {
                                    Object[] objArr2 = pluginScheduler2.reduceScope;
                                    objArr2[i5 - i4] = objArr2[i5];
                                }
                            }
                            int i6 = reduceScope2 - i4;
                            InsetsReader.inflateAdapter(pluginScheduler2.reduceScope, null, i6, reduceScope2);
                            pluginScheduler2.syncScope(i6);
                            DpadBuilder dpadBuilder4 = DpadBuilder.evictLayout;
                        } finally {
                        }
                    }
                    if (list6.isEmpty()) {
                    }
                } catch (Throwable th3) {
                    try {
                        LongPressCollector.acquireArchive(longPressCollector, th3, null, true, 2, null);
                        flushSample(longPressCollector, list, list2, list3, customStore3, customStore4, customStore, customStore2);
                        return DpadBuilder.evictLayout;
                    } finally {
                        list.clear();
                    }
                }
                throw th;
            }
            ItemGovernor injectMetric = ItemGovernor.releaseHeader.injectMetric();
            ItemGovernor touchEntry = injectMetric instanceof TypographySynthesizer ? new TouchEntry((TypographySynthesizer) injectMetric, null, null, true, false) : new RailMaterializer(injectMetric, null, true, z);
            try {
                ItemGovernor connectJob = touchEntry.connectJob();
                try {
                    if (!list5.isEmpty()) {
                        longPressCollector2.evictLayout = longPressCollector2.transformCurrency() + 1;
                        try {
                            int size3 = list5.size();
                            for (int i7 = z; i7 < size3; i7++) {
                                customStore5.updateTimer((ScrollAggregator) list5.get(i7));
                            }
                            int size4 = list5.size();
                            for (int i8 = z; i8 < size4; i8++) {
                                ((ScrollAggregator) list5.get(i8)).connectPatch();
                            }
                            list5.clear();
                        } catch (Throwable th4) {
                            try {
                                LongPressCollector.acquireArchive(longPressCollector2, th4, null, false, 6, null);
                                flushSample(longPressCollector, list4, list2, list5, customStore3, customStore5, customStore, customStore2);
                                DpadBuilder dpadBuilder5 = DpadBuilder.evictLayout;
                                touchEntry.resetDelta(connectJob);
                                return dpadBuilder5;
                            } finally {
                                list3.clear();
                            }
                        }
                    }
                    if (customStore3.releaseHeader()) {
                        try {
                            customStore5.drawRequest(customStore3);
                            Object[] objArr3 = customStore3.growPayload;
                            long[] jArr = customStore3.evictLayout;
                            c = 7;
                            int length = jArr.length - 2;
                            j2 = 128;
                            int i9 = z;
                            if (length >= 0) {
                                while (true) {
                                    long j4 = jArr[i9];
                                    j3 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i10 = 8 - ((~(i9 - length)) >>> 31);
                                        for (int i11 = 0; i11 < i10; i11++) {
                                            if ((j4 & 255) < 128) {
                                                ((ScrollAggregator) objArr3[(i9 << 3) + i11]).connectJob();
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i10 != 8) {
                                            break;
                                        }
                                    }
                                    if (i9 == length) {
                                        break;
                                    }
                                    i9++;
                                }
                            } else {
                                j3 = 255;
                            }
                        } catch (Throwable th5) {
                            try {
                                LongPressCollector.acquireArchive(longPressCollector, th5, null, false, 6, null);
                                flushSample(longPressCollector, list, list2, list3, customStore3, customStore5, customStore, customStore2);
                                DpadBuilder dpadBuilder6 = DpadBuilder.evictLayout;
                                touchEntry.resetDelta(connectJob);
                                return dpadBuilder6;
                            } finally {
                                customStore3.peekRevision();
                            }
                        }
                    } else {
                        c = 7;
                        j2 = 128;
                        j3 = 255;
                    }
                    if (customStore5.releaseHeader()) {
                        try {
                            Object[] objArr4 = customStore5.growPayload;
                            long[] jArr2 = customStore5.evictLayout;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j5 = jArr2[i12];
                                    if ((((~j5) << c) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j5 & j3) < j2) {
                                                ((ScrollAggregator) objArr4[(i12 << 3) + i14]).expandArgs();
                                            }
                                            j5 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        }
                                    }
                                    if (i12 == length2) {
                                        break;
                                    }
                                    i12++;
                                }
                            }
                            customStore5.peekRevision();
                        } catch (Throwable th6) {
                            try {
                                LongPressCollector.acquireArchive(longPressCollector, th6, null, false, 6, null);
                                flushSample(longPressCollector, list, list2, list3, customStore3, customStore5, customStore, customStore2);
                                DpadBuilder dpadBuilder7 = DpadBuilder.evictLayout;
                                touchEntry.resetDelta(connectJob);
                                return dpadBuilder7;
                            } finally {
                                customStore4.peekRevision();
                            }
                        }
                    }
                    DpadBuilder dpadBuilder8 = DpadBuilder.evictLayout;
                    touchEntry.resetDelta(connectJob);
                    touchEntry.detachStream();
                    synchronized (longPressCollector.injectMetric) {
                        longPressCollector.removeCount();
                    }
                    ItemGovernor.releaseHeader.clipOrigin();
                    customStore2.peekRevision();
                    customStore.peekRevision();
                    longPressCollector.connectPatch = null;
                    AnchorAnalyzer.evictLayout.growPayload(evictLayout2);
                    return DpadBuilder.evictLayout;
                } catch (Throwable th7) {
                    touchEntry.resetDelta(connectJob);
                    throw th7;
                }
            } finally {
                touchEntry.detachStream();
            }
        }

        public static final void flushSample(LongPressCollector longPressCollector, List list, List list2, List list3, CustomStore customStore, CustomStore customStore2, CustomStore customStore3, CustomStore customStore4) {
            char c;
            long j;
            long j2;
            synchronized (longPressCollector.injectMetric) {
                try {
                    list.clear();
                    list2.clear();
                    int size = list3.size();
                    for (int i = 0; i < size; i++) {
                        ScrollAggregator scrollAggregator = (ScrollAggregator) list3.get(i);
                        scrollAggregator.drawScope();
                        longPressCollector.syncPool(scrollAggregator);
                    }
                    list3.clear();
                    Object[] objArr = customStore.growPayload;
                    long[] jArr = customStore.evictLayout;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        j = 255;
                        while (true) {
                            long j3 = jArr[i2];
                            c = 7;
                            j2 = -9187201950435737472L;
                            if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (int i4 = 0; i4 < i3; i4++) {
                                    if ((j3 & 255) < 128) {
                                        ScrollAggregator scrollAggregator2 = (ScrollAggregator) objArr[(i2 << 3) + i4];
                                        scrollAggregator2.drawScope();
                                        longPressCollector.syncPool(scrollAggregator2);
                                    }
                                    j3 >>= 8;
                                }
                                if (i3 != 8) {
                                    break;
                                }
                            }
                            if (i2 == length) {
                                break;
                            } else {
                                i2++;
                            }
                        }
                    } else {
                        c = 7;
                        j = 255;
                        j2 = -9187201950435737472L;
                    }
                    customStore.peekRevision();
                    Object[] objArr2 = customStore2.growPayload;
                    long[] jArr2 = customStore2.evictLayout;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j4 = jArr2[i5];
                            if ((((~j4) << c) & j4 & j2) != j2) {
                                int i6 = 8 - ((~(i5 - length2)) >>> 31);
                                for (int i7 = 0; i7 < i6; i7++) {
                                    if ((j4 & j) < 128) {
                                        ((ScrollAggregator) objArr2[(i5 << 3) + i7]).expandArgs();
                                    }
                                    j4 >>= 8;
                                }
                                if (i6 != 8) {
                                    break;
                                }
                            }
                            if (i5 == length2) {
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                    customStore2.peekRevision();
                    customStore3.peekRevision();
                    Object[] objArr3 = customStore4.growPayload;
                    long[] jArr3 = customStore4.evictLayout;
                    int length3 = jArr3.length - 2;
                    if (length3 >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j5 = jArr3[i8];
                            if ((((~j5) << c) & j5 & j2) != j2) {
                                int i9 = 8 - ((~(i8 - length3)) >>> 31);
                                for (int i10 = 0; i10 < i9; i10++) {
                                    if ((j5 & j) < 128) {
                                        ScrollAggregator scrollAggregator3 = (ScrollAggregator) objArr3[(i8 << 3) + i10];
                                        scrollAggregator3.drawScope();
                                        longPressCollector.syncPool(scrollAggregator3);
                                    }
                                    j5 >>= 8;
                                }
                                if (i9 != 8) {
                                    break;
                                }
                            }
                            if (i8 == length3) {
                                break;
                            } else {
                                i8++;
                            }
                        }
                    }
                    customStore4.peekRevision();
                    DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public static final void updateTimer(List list, LongPressCollector longPressCollector) {
            list.clear();
            synchronized (longPressCollector.injectMetric) {
                try {
                    List list2 = longPressCollector.drawField;
                    int size = list2.size();
                    for (int i = 0; i < size; i++) {
                        list.add((InputChannel) list2.get(i));
                    }
                    longPressCollector.drawField.clear();
                    DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.goldenboot.saga.zone.ConfigListener
        /* renamed from: clipOrigin, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ProgressValve progressValve, VibrationSignal vibrationSignal, ServiceRegulator serviceRegulator) {
            ScopedMigration scopedMigration = LongPressCollector.this.new ScopedMigration(serviceRegulator);
            scopedMigration.decodePath = vibrationSignal;
            return scopedMigration.invokeSuspend(DpadBuilder.evictLayout);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x010f  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0118  */
        /* JADX WARN: Removed duplicated region for block: B:9:0x00b4  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0101 -> B:6:0x0109). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x010f -> B:7:0x00ac). Please report as a decompilation issue!!! */
        @Override // com.goldenboot.saga.zone.ConfigValidator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            VibrationSignal vibrationSignal;
            CustomStore growPayload;
            CustomStore growPayload2;
            List list;
            Set set;
            final List list2;
            CustomStore customStore;
            List list3;
            CustomStore customStore2;
            final List list4;
            final CustomStore customStore3;
            final List list5;
            final CustomStore customStore4;
            Object releaseHeader = RotateReceiver.releaseHeader();
            int i = this.gatherAdapter;
            int i2 = 1;
            if (i == 0) {
                ColumnForger.growPayload(obj);
                vibrationSignal = (VibrationSignal) this.decodePath;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                growPayload = SelectionMapper.growPayload();
                CustomStore growPayload3 = SelectionMapper.growPayload();
                CustomStore customStore5 = new CustomStore(0, i2, null);
                Set evictLayout = StyleCurator.evictLayout(customStore5);
                growPayload2 = SelectionMapper.growPayload();
                list = arrayList;
                set = evictLayout;
                list2 = arrayList2;
                customStore = customStore5;
                list3 = arrayList3;
                customStore2 = growPayload3;
                if (!LongPressCollector.this.commitBounds()) {
                }
            } else if (i == 1) {
                CustomStore customStore6 = (CustomStore) this.drawRequest;
                set = (Set) this.purgeNode;
                customStore = (CustomStore) this.inflateAdapter;
                customStore2 = (CustomStore) this.resetDelta;
                CustomStore customStore7 = (CustomStore) this.attachConfig;
                List list6 = (List) this.connectPatch;
                list2 = (List) this.notifyMessage;
                List list7 = (List) this.reduceScope;
                VibrationSignal vibrationSignal2 = (VibrationSignal) this.decodePath;
                ColumnForger.growPayload(obj);
                customStore4 = customStore6;
                vibrationSignal = vibrationSignal2;
                list4 = list6;
                list5 = list7;
                customStore3 = customStore7;
                final Set set2 = set;
                final CustomStore customStore8 = customStore2;
                final CustomStore customStore9 = customStore;
                if (LongPressCollector.this.queryData()) {
                }
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                CustomStore customStore10 = (CustomStore) this.drawRequest;
                set = (Set) this.purgeNode;
                customStore = (CustomStore) this.inflateAdapter;
                customStore2 = (CustomStore) this.resetDelta;
                growPayload = (CustomStore) this.attachConfig;
                list3 = (List) this.connectPatch;
                list2 = (List) this.notifyMessage;
                list = (List) this.reduceScope;
                VibrationSignal vibrationSignal3 = (VibrationSignal) this.decodePath;
                ColumnForger.growPayload(obj);
                growPayload2 = customStore10;
                vibrationSignal = vibrationSignal3;
                LongPressCollector.this.protectGauge();
                if (!LongPressCollector.this.commitBounds()) {
                    LongPressCollector longPressCollector = LongPressCollector.this;
                    this.decodePath = vibrationSignal;
                    this.reduceScope = list;
                    this.notifyMessage = list2;
                    this.connectPatch = list3;
                    this.attachConfig = growPayload;
                    this.resetDelta = customStore2;
                    this.inflateAdapter = customStore;
                    this.purgeNode = set;
                    this.drawRequest = growPayload2;
                    this.gatherAdapter = 1;
                    if (longPressCollector.locateSignal(this) != releaseHeader) {
                        List list8 = list;
                        customStore3 = growPayload;
                        customStore4 = growPayload2;
                        list4 = list3;
                        list5 = list8;
                        final Set set22 = set;
                        final CustomStore customStore82 = customStore2;
                        final CustomStore customStore92 = customStore;
                        if (LongPressCollector.this.queryData()) {
                            List list9 = list4;
                            growPayload2 = customStore4;
                            growPayload = customStore3;
                            list = list5;
                            list3 = list9;
                            customStore = customStore92;
                            customStore2 = customStore82;
                            set = set22;
                            if (!LongPressCollector.this.commitBounds()) {
                            }
                        } else {
                            final LongPressCollector longPressCollector2 = LongPressCollector.this;
                            TouchRecord touchRecord = new TouchRecord() { // from class: com.goldenboot.saga.zone.TranslateBinder
                                @Override // com.goldenboot.saga.zone.TouchRecord
                                public final Object invoke(Object obj2) {
                                    DpadBuilder applyTask;
                                    applyTask = LongPressCollector.ScopedMigration.applyTask(LongPressCollector.this, customStore92, customStore4, list5, list2, customStore3, list4, customStore82, set22, ((Long) obj2).longValue());
                                    return applyTask;
                                }
                            };
                            this.decodePath = vibrationSignal;
                            this.reduceScope = list5;
                            this.notifyMessage = list2;
                            this.connectPatch = list4;
                            this.attachConfig = customStore3;
                            this.resetDelta = customStore82;
                            this.inflateAdapter = customStore92;
                            this.purgeNode = set22;
                            this.drawRequest = customStore4;
                            this.gatherAdapter = 2;
                            if (vibrationSignal.drawScope(touchRecord, this) != releaseHeader) {
                                List list10 = list4;
                                growPayload2 = customStore4;
                                growPayload = customStore3;
                                list = list5;
                                list3 = list10;
                                customStore = customStore92;
                                customStore2 = customStore82;
                                set = set22;
                                LongPressCollector.this.protectGauge();
                                if (!LongPressCollector.this.commitBounds()) {
                                    return DpadBuilder.evictLayout;
                                }
                            }
                        }
                    }
                    return releaseHeader;
                }
            }
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class StylusConverter extends PanelRevision implements IconExporter {
        public /* synthetic */ Object connectPatch;
        public final /* synthetic */ VibrationSignal inflateAdapter;
        public int notifyMessage;
        public Object reduceScope;
        public final /* synthetic */ ConfigListener resetDelta;

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        public static final class ActivityMutator extends PanelRevision implements IconExporter {
            public final /* synthetic */ VibrationSignal attachConfig;
            public final /* synthetic */ ConfigListener connectPatch;
            public /* synthetic */ Object notifyMessage;
            public int reduceScope;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ActivityMutator(ConfigListener configListener, VibrationSignal vibrationSignal, ServiceRegulator serviceRegulator) {
                super(2, serviceRegulator);
                this.connectPatch = configListener;
                this.attachConfig = vibrationSignal;
            }

            @Override // com.goldenboot.saga.zone.ConfigValidator
            public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
                ActivityMutator activityMutator = new ActivityMutator(this.connectPatch, this.attachConfig, serviceRegulator);
                activityMutator.notifyMessage = obj;
                return activityMutator;
            }

            @Override // com.goldenboot.saga.zone.IconExporter
            public final Object invoke(ProgressValve progressValve, ServiceRegulator serviceRegulator) {
                return ((ActivityMutator) create(progressValve, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
            }

            @Override // com.goldenboot.saga.zone.ConfigValidator
            public final Object invokeSuspend(Object obj) {
                Object releaseHeader = RotateReceiver.releaseHeader();
                int i = this.reduceScope;
                if (i == 0) {
                    ColumnForger.growPayload(obj);
                    ProgressValve progressValve = (ProgressValve) this.notifyMessage;
                    ConfigListener configListener = this.connectPatch;
                    VibrationSignal vibrationSignal = this.attachConfig;
                    this.reduceScope = 1;
                    if (configListener.invoke(progressValve, vibrationSignal, this) == releaseHeader) {
                        return releaseHeader;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ColumnForger.growPayload(obj);
                }
                return DpadBuilder.evictLayout;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StylusConverter(ConfigListener configListener, VibrationSignal vibrationSignal, ServiceRegulator serviceRegulator) {
            super(2, serviceRegulator);
            this.resetDelta = configListener;
            this.inflateAdapter = vibrationSignal;
        }

        public static final DpadBuilder clipOrigin(LongPressCollector longPressCollector, Set set, ItemGovernor itemGovernor) {
            GroupSegment groupSegment;
            synchronized (longPressCollector.injectMetric) {
                try {
                    if (((LayerUseCase) longPressCollector.gatherAdapter.getValue()).compareTo(LayerUseCase.resetDelta) >= 0) {
                        CustomStore customStore = longPressCollector.updateTimer;
                        if (set instanceof AccentRealizer) {
                            ElevationInspector releaseHeader = ((AccentRealizer) set).releaseHeader();
                            Object[] objArr = releaseHeader.growPayload;
                            long[] jArr = releaseHeader.evictLayout;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i = 0;
                                while (true) {
                                    long j = jArr[i];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i2 = 8 - ((~(i - length)) >>> 31);
                                        for (int i3 = 0; i3 < i2; i3++) {
                                            if ((255 & j) < 128) {
                                                Object obj = objArr[(i << 3) + i3];
                                                if (!(obj instanceof ProducerActivator) || ((ProducerActivator) obj).connectPatch(GlobalSignal.evictLayout(1))) {
                                                    customStore.updateTimer(obj);
                                                }
                                            }
                                            j >>= 8;
                                        }
                                        if (i2 != 8) {
                                            break;
                                        }
                                    }
                                    if (i == length) {
                                        break;
                                    }
                                    i++;
                                }
                            }
                        } else {
                            for (Object obj2 : set) {
                                if (!(obj2 instanceof ProducerActivator) || ((ProducerActivator) obj2).connectPatch(GlobalSignal.evictLayout(1))) {
                                    customStore.updateTimer(obj2);
                                }
                            }
                        }
                        groupSegment = longPressCollector.removeCount();
                    } else {
                        groupSegment = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (groupSegment != null) {
                AttrSemaphore.ActivityMutator activityMutator = AttrSemaphore.notifyMessage;
                groupSegment.resumeWith(AttrSemaphore.growPayload(DpadBuilder.evictLayout));
            }
            return DpadBuilder.evictLayout;
        }

        @Override // com.goldenboot.saga.zone.ConfigValidator
        public final ServiceRegulator create(Object obj, ServiceRegulator serviceRegulator) {
            StylusConverter stylusConverter = LongPressCollector.this.new StylusConverter(this.resetDelta, this.inflateAdapter, serviceRegulator);
            stylusConverter.connectPatch = obj;
            return stylusConverter;
        }

        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(ProgressValve progressValve, ServiceRegulator serviceRegulator) {
            return ((StylusConverter) create(progressValve, serviceRegulator)).invokeSuspend(DpadBuilder.evictLayout);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.goldenboot.saga.zone.ConfigValidator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            DrawableSynthesizer drawField;
            StackBlock stackBlock;
            Throwable th;
            Object obj2;
            Object releaseHeader = RotateReceiver.releaseHeader();
            int i = this.notifyMessage;
            if (i == 0) {
                ColumnForger.growPayload(obj);
                drawField = ProxyArbitrator.drawField(((ProgressValve) this.connectPatch).getCoroutineContext());
                LongPressCollector.this.flattenToken(drawField);
                ItemGovernor.ActivityMutator activityMutator = ItemGovernor.releaseHeader;
                final LongPressCollector longPressCollector = LongPressCollector.this;
                StackBlock updateTimer = activityMutator.updateTimer(new IconExporter() { // from class: com.goldenboot.saga.zone.TranslateAnalyzer
                    @Override // com.goldenboot.saga.zone.IconExporter
                    public final Object invoke(Object obj3, Object obj4) {
                        DpadBuilder clipOrigin;
                        clipOrigin = LongPressCollector.StylusConverter.clipOrigin(LongPressCollector.this, (Set) obj3, (ItemGovernor) obj4);
                        return clipOrigin;
                    }
                });
                LongPressCollector.syncScope.injectMetric(LongPressCollector.this.mergeLocale);
                try {
                    List expandScope = LongPressCollector.this.expandScope();
                    int size = expandScope.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((ScrollAggregator) expandScope.get(i2)).syncScope();
                    }
                    ActivityMutator activityMutator2 = new ActivityMutator(this.resetDelta, this.inflateAdapter, null);
                    this.connectPatch = drawField;
                    this.reduceScope = updateTimer;
                    this.notifyMessage = 1;
                    if (LayerArray.releaseHeader(activityMutator2, this) == releaseHeader) {
                        return releaseHeader;
                    }
                    stackBlock = updateTimer;
                } catch (Throwable th2) {
                    stackBlock = updateTimer;
                    th = th2;
                    stackBlock.evictLayout();
                    obj2 = LongPressCollector.this.injectMetric;
                    LongPressCollector longPressCollector2 = LongPressCollector.this;
                    synchronized (obj2) {
                        try {
                            if (longPressCollector2.detachStream == drawField) {
                                longPressCollector2.detachStream = null;
                            }
                            longPressCollector2.removeCount();
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    LongPressCollector.syncScope.detachStream(LongPressCollector.this.mergeLocale);
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                stackBlock = (StackBlock) this.reduceScope;
                drawField = (DrawableSynthesizer) this.connectPatch;
                try {
                    ColumnForger.growPayload(obj);
                } catch (Throwable th4) {
                    th = th4;
                    stackBlock.evictLayout();
                    obj2 = LongPressCollector.this.injectMetric;
                    LongPressCollector longPressCollector22 = LongPressCollector.this;
                    synchronized (obj2) {
                    }
                }
            }
            stackBlock.evictLayout();
            Object obj3 = LongPressCollector.this.injectMetric;
            LongPressCollector longPressCollector3 = LongPressCollector.this;
            synchronized (obj3) {
                try {
                    if (longPressCollector3.detachStream == drawField) {
                        longPressCollector3.detachStream = null;
                    }
                    longPressCollector3.removeCount();
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            LongPressCollector.syncScope.detachStream(LongPressCollector.this.mergeLocale);
            return DpadBuilder.evictLayout;
        }
    }

    public LongPressCollector(LongPressGateway longPressGateway) {
        FlexDirector flexDirector = new FlexDirector(new ElevationNode() { // from class: com.goldenboot.saga.zone.NativeMaker
            @Override // com.goldenboot.saga.zone.ElevationNode
            public final Object invoke() {
                DpadBuilder emitStrategy;
                emitStrategy = LongPressCollector.emitStrategy(LongPressCollector.this);
                return emitStrategy;
            }
        });
        this.growPayload = flexDirector;
        this.injectMetric = new Object();
        this.clipOrigin = new ArrayList();
        this.updateTimer = new CustomStore(0, 1, null);
        this.applyTask = new PluginScheduler(new ScrollAggregator[16], 0);
        this.popBlueprint = new ArrayList();
        this.drawField = new ArrayList();
        this.connectJob = KeyboardMap.releaseHeader(null, 1, null);
        this.peekRevision = new SurfaceCollection();
        this.serializeOffset = TileRunner.growPayload();
        this.reduceScope = KeyboardMap.releaseHeader(null, 1, null);
        this.gatherAdapter = PaddingImporter.evictLayout(LayerUseCase.connectPatch);
        this.decodePath = new NativeSyncer();
        HapticDiff evictLayout = ProxyArbitrator.evictLayout((DrawableSynthesizer) longPressGateway.evictLayout(DrawableSynthesizer.popBlueprint));
        evictLayout.attachConfig(new TouchRecord() { // from class: com.goldenboot.saga.zone.CursorDirector
            @Override // com.goldenboot.saga.zone.TouchRecord
            public final Object invoke(Object obj) {
                DpadBuilder refreshCounter;
                refreshCounter = LongPressCollector.refreshCounter(LongPressCollector.this, (Throwable) obj);
                return refreshCounter;
            }
        });
        this.drawScope = evictLayout;
        this.expandArgs = longPressGateway.growPayload(flexDirector).growPayload(evictLayout);
        this.mergeLocale = new FeedbackFlow();
    }

    public static /* synthetic */ void acquireArchive(LongPressCollector longPressCollector, Throwable th, ScrollAggregator scrollAggregator, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            scrollAggregator = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        longPressCollector.updateConstraint(th, scrollAggregator, z);
    }

    public static final DpadBuilder compressVersion(LongPressCollector longPressCollector, Throwable th, Throwable th2) {
        synchronized (longPressCollector.injectMetric) {
            if (th == null) {
                th = null;
            } else if (th2 != null) {
                try {
                    if (th2 instanceof CancellationException) {
                        th2 = null;
                    }
                    if (th2 != null) {
                        SubscriberDrain.evictLayout(th, th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            longPressCollector.releaseHeader = th;
            longPressCollector.gatherAdapter.setValue(LayerUseCase.reduceScope);
        }
        return DpadBuilder.evictLayout;
    }

    public static final DpadBuilder emitStrategy(LongPressCollector longPressCollector) {
        GroupSegment removeCount;
        synchronized (longPressCollector.injectMetric) {
            removeCount = longPressCollector.removeCount();
            if (((LayerUseCase) longPressCollector.gatherAdapter.getValue()).compareTo(LayerUseCase.notifyMessage) <= 0) {
                throw SequenceLink.evictLayout("Recomposer shutdown; frame clock awaiter will never resume", longPressCollector.releaseHeader);
            }
        }
        if (removeCount != null) {
            AttrSemaphore.ActivityMutator activityMutator = AttrSemaphore.notifyMessage;
            removeCount.resumeWith(AttrSemaphore.growPayload(DpadBuilder.evictLayout));
        }
        return DpadBuilder.evictLayout;
    }

    public static final DpadBuilder loadItem(CustomStore customStore, ScrollAggregator scrollAggregator) {
        Object[] objArr = customStore.growPayload;
        long[] jArr = customStore.evictLayout;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            scrollAggregator.gatherAdapter(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return DpadBuilder.evictLayout;
    }

    public static final DpadBuilder measureEndpoint(ScrollAggregator scrollAggregator, CustomStore customStore, Object obj) {
        scrollAggregator.gatherAdapter(obj);
        if (customStore != null) {
            customStore.updateTimer(obj);
        }
        return DpadBuilder.evictLayout;
    }

    public static final DpadBuilder refreshCounter(final LongPressCollector longPressCollector, final Throwable th) {
        GroupSegment groupSegment;
        GroupSegment groupSegment2;
        CancellationException evictLayout = SequenceLink.evictLayout("Recomposer effect job completed", th);
        synchronized (longPressCollector.injectMetric) {
            try {
                DrawableSynthesizer drawableSynthesizer = longPressCollector.detachStream;
                groupSegment = null;
                if (drawableSynthesizer != null) {
                    longPressCollector.gatherAdapter.setValue(LayerUseCase.notifyMessage);
                    if (longPressCollector.inflateAdapter) {
                        groupSegment2 = longPressCollector.attachConfig;
                        if (groupSegment2 != null) {
                            longPressCollector.attachConfig = null;
                            drawableSynthesizer.attachConfig(new TouchRecord() { // from class: com.goldenboot.saga.zone.DelegateSerializer
                                @Override // com.goldenboot.saga.zone.TouchRecord
                                public final Object invoke(Object obj) {
                                    DpadBuilder compressVersion;
                                    compressVersion = LongPressCollector.compressVersion(LongPressCollector.this, th, (Throwable) obj);
                                    return compressVersion;
                                }
                            });
                            groupSegment = groupSegment2;
                        }
                    } else {
                        drawableSynthesizer.clipOrigin(evictLayout);
                    }
                    groupSegment2 = null;
                    longPressCollector.attachConfig = null;
                    drawableSynthesizer.attachConfig(new TouchRecord() { // from class: com.goldenboot.saga.zone.DelegateSerializer
                        @Override // com.goldenboot.saga.zone.TouchRecord
                        public final Object invoke(Object obj) {
                            DpadBuilder compressVersion;
                            compressVersion = LongPressCollector.compressVersion(LongPressCollector.this, th, (Throwable) obj);
                            return compressVersion;
                        }
                    });
                    groupSegment = groupSegment2;
                } else {
                    longPressCollector.releaseHeader = evictLayout;
                    longPressCollector.gatherAdapter.setValue(LayerUseCase.reduceScope);
                    DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (groupSegment != null) {
            AttrSemaphore.ActivityMutator activityMutator = AttrSemaphore.notifyMessage;
            groupSegment.resumeWith(AttrSemaphore.growPayload(DpadBuilder.evictLayout));
        }
        return DpadBuilder.evictLayout;
    }

    public static final DpadBuilder searchHolder(ScrollAggregator scrollAggregator, Object obj) {
        scrollAggregator.growPayload(obj);
        return DpadBuilder.evictLayout;
    }

    public static final void subscribeEvent(List list, LongPressCollector longPressCollector, ScrollAggregator scrollAggregator) {
        list.clear();
        synchronized (longPressCollector.injectMetric) {
            try {
                Iterator it = longPressCollector.drawField.iterator();
                while (it.hasNext()) {
                    InputChannel inputChannel = (InputChannel) it.next();
                    if (Intrinsics.areEqual(inputChannel.growPayload(), scrollAggregator)) {
                        list.add(inputChannel);
                        it.remove();
                    }
                }
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void acquireAsset(ScrollAggregator scrollAggregator) {
        SlotWorkflow slotWorkflow = this.findTask;
        if (slotWorkflow != null) {
            Object[] objArr = slotWorkflow.evictLayout;
            int i = slotWorkflow.growPayload;
            for (int i2 = 0; i2 < i; i2++) {
                TransitionMemento.evictLayout(objArr[i2]);
                if (scrollAggregator instanceof RestoreAdapter) {
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x0125, code lost:
    
        r3 = r10.size();
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x012a, code lost:
    
        if (r4 >= r3) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0136, code lost:
    
        if (((com.goldenboot.saga.zone.AlarmFacilitator) r10.get(r4)).detachStream() == null) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0138, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013b, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0149, code lost:
    
        if (r9 >= r4) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014b, code lost:
    
        r11 = (com.goldenboot.saga.zone.AlarmFacilitator) r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0155, code lost:
    
        if (r11.detachStream() != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0157, code lost:
    
        r11 = (com.goldenboot.saga.zone.InputChannel) r11.injectMetric();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0161, code lost:
    
        if (r11 == null) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0163, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0166, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0160, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0169, code lost:
    
        r4 = r16.injectMetric;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016b, code lost:
    
        monitor-enter(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x016c, code lost:
    
        com.goldenboot.saga.zone.ReceiverCollection.expandArgs(r16.drawField, r3);
        r3 = com.goldenboot.saga.zone.DpadBuilder.evictLayout;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0173, code lost:
    
        monitor-exit(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0174, code lost:
    
        r3 = new java.util.ArrayList(r10.size());
        r4 = r10.size();
        r9 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0182, code lost:
    
        if (r9 >= r4) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0184, code lost:
    
        r11 = r10.get(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018f, code lost:
    
        if (((com.goldenboot.saga.zone.AlarmFacilitator) r11).detachStream() == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0191, code lost:
    
        r3.add(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0194, code lost:
    
        r9 = r9 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0197, code lost:
    
        r10 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List appendEvent(List list, CustomStore customStore) {
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            ScrollAggregator growPayload = ((InputChannel) obj).growPayload();
            Object obj2 = hashMap.get(growPayload);
            if (obj2 == null) {
                obj2 = new ArrayList();
                hashMap.put(growPayload, obj2);
            }
            ((ArrayList) obj2).add(obj);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            ScrollAggregator scrollAggregator = (ScrollAggregator) entry.getKey();
            List list2 = (List) entry.getValue();
            if (scrollAggregator.attachConfig()) {
                MorphPatch.inflateAdapter("Check failed");
            }
            TypographySynthesizer serializeOffset = ItemGovernor.releaseHeader.serializeOffset(offerHash(scrollAggregator), compressBody(scrollAggregator, customStore));
            try {
                ItemGovernor connectJob = serializeOffset.connectJob();
                try {
                    synchronized (this.injectMetric) {
                        try {
                            arrayList = new ArrayList(list2.size());
                            int size2 = list2.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                InputChannel inputChannel = (InputChannel) list2.get(i2);
                                ParallelHeap parallelHeap = this.connectJob;
                                inputChannel.injectMetric();
                                Object connectJob2 = KeyboardMap.connectJob(parallelHeap, null);
                                InputChannel inputChannel2 = (InputChannel) connectJob2;
                                if (inputChannel2 != null) {
                                    this.peekRevision.releaseHeader(inputChannel2);
                                }
                                arrayList.add(PagerValidator.evictLayout(inputChannel, connectJob2));
                            }
                            if (PopupRepository.growPayload) {
                                int size3 = arrayList.size();
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= size3) {
                                        break;
                                    }
                                    AlarmFacilitator alarmFacilitator = (AlarmFacilitator) arrayList.get(i3);
                                    if (alarmFacilitator.detachStream() == null) {
                                        SurfaceCollection surfaceCollection = this.peekRevision;
                                        ((InputChannel) alarmFacilitator.injectMetric()).injectMetric();
                                        if (surfaceCollection.injectMetric(null)) {
                                            ArrayList arrayList2 = new ArrayList(ContainerStage.gatherAdapter(arrayList, 10));
                                            int size4 = arrayList.size();
                                            int i4 = 0;
                                            while (i4 < size4) {
                                                Object obj3 = arrayList.get(i4);
                                                i4++;
                                                AlarmFacilitator alarmFacilitator2 = (AlarmFacilitator) obj3;
                                                if (alarmFacilitator2.detachStream() == null) {
                                                    SurfaceCollection surfaceCollection2 = this.peekRevision;
                                                    ((InputChannel) alarmFacilitator2.injectMetric()).injectMetric();
                                                    surfaceCollection2.detachStream(null);
                                                }
                                                arrayList2.add(alarmFacilitator2);
                                            }
                                            arrayList = arrayList2;
                                        }
                                    }
                                    i3++;
                                }
                            }
                        } finally {
                        }
                    }
                    int size5 = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size5) {
                            break;
                        }
                        if (((AlarmFacilitator) arrayList.get(i5)).detachStream() != null) {
                            break;
                        }
                        i5++;
                    }
                    scrollAggregator.drawRequest(arrayList);
                    DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
                    serializeOffset.resetDelta(connectJob);
                } catch (Throwable th) {
                    serializeOffset.resetDelta(connectJob);
                    throw th;
                }
            } finally {
                computeTarget(serializeOffset);
            }
        }
        return CursorCollector.appendEvent(hashMap.keySet());
    }

    public final void appendKey(ScrollAggregator scrollAggregator) {
        this.clipOrigin.add(scrollAggregator);
        this.flushSample = null;
    }

    @Override // com.goldenboot.saga.zone.WorkerIndex
    public void attachConfig(ColumnValve columnValve) {
        CustomStore customStore = (CustomStore) this.decodePath.evictLayout();
        if (customStore == null) {
            customStore = SelectionMapper.growPayload();
            this.decodePath.growPayload(customStore);
        }
        customStore.updateTimer(columnValve);
    }

    @Override // com.goldenboot.saga.zone.WorkerIndex
    public boolean clipOrigin() {
        return MorphPatch.mergeLocale();
    }

    public final Object closePayload(ServiceRegulator serviceRegulator) {
        Object notifyMessage = RailParser.notifyMessage(validateOffset(), new EndpointList(null), serviceRegulator);
        return notifyMessage == RotateReceiver.releaseHeader() ? notifyMessage : DpadBuilder.evictLayout;
    }

    public final boolean commitBounds() {
        boolean z;
        synchronized (this.injectMetric) {
            z = this.inflateAdapter;
        }
        if (!z) {
            return true;
        }
        Iterator it = this.drawScope.peekRevision().iterator();
        while (it.hasNext()) {
            if (((DrawableSynthesizer) it.next()).popBlueprint()) {
                return true;
            }
        }
        return false;
    }

    public final void commitKey(ScrollAggregator scrollAggregator) {
        synchronized (this.injectMetric) {
            List list = this.drawField;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (Intrinsics.areEqual(((InputChannel) list.get(i)).growPayload(), scrollAggregator)) {
                    DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
                    ArrayList arrayList = new ArrayList();
                    subscribeEvent(arrayList, this, scrollAggregator);
                    while (!arrayList.isEmpty()) {
                        appendEvent(arrayList, null);
                        subscribeEvent(arrayList, this, scrollAggregator);
                    }
                    return;
                }
            }
        }
    }

    public final TouchRecord compressBody(final ScrollAggregator scrollAggregator, final CustomStore customStore) {
        return new TouchRecord() { // from class: com.goldenboot.saga.zone.ParallelAction
            @Override // com.goldenboot.saga.zone.TouchRecord
            public final Object invoke(Object obj) {
                DpadBuilder measureEndpoint;
                measureEndpoint = LongPressCollector.measureEndpoint(ScrollAggregator.this, customStore, obj);
                return measureEndpoint;
            }
        };
    }

    public final void computeTarget(TypographySynthesizer typographySynthesizer) {
        try {
            if (typographySynthesizer.syncScope() instanceof ConfigDelta.ActivityMutator) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
        } finally {
            typographySynthesizer.detachStream();
        }
    }

    @Override // com.goldenboot.saga.zone.WorkerIndex
    public void connectJob(InputChannel inputChannel) {
        GroupSegment removeCount;
        synchronized (this.injectMetric) {
            this.drawField.add(inputChannel);
            removeCount = removeCount();
        }
        if (removeCount != null) {
            AttrSemaphore.ActivityMutator activityMutator = AttrSemaphore.notifyMessage;
            removeCount.resumeWith(AttrSemaphore.growPayload(DpadBuilder.evictLayout));
        }
    }

    @Override // com.goldenboot.saga.zone.WorkerIndex
    public boolean detachStream() {
        return ((Boolean) storeCharset.get()).booleanValue();
    }

    public final boolean drawConfig() {
        return this.applyTask.reduceScope() != 0 || growCallback() || KeyboardMap.popBlueprint(this.connectJob);
    }

    @Override // com.goldenboot.saga.zone.WorkerIndex
    public void drawRequest(ScrollAggregator scrollAggregator) {
        synchronized (this.injectMetric) {
            prepareCount(scrollAggregator);
            this.applyTask.purgeNode(scrollAggregator);
            this.popBlueprint.remove(scrollAggregator);
            DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
        }
    }

    @Override // com.goldenboot.saga.zone.WorkerIndex
    public void evictLayout(ScrollAggregator scrollAggregator, IconExporter iconExporter) {
        LayerUseCase layerUseCase;
        boolean z;
        LongPressCollector longPressCollector;
        boolean attachConfig = scrollAggregator.attachConfig();
        synchronized (this.injectMetric) {
            LayerUseCase layerUseCase2 = (LayerUseCase) this.gatherAdapter.getValue();
            layerUseCase = LayerUseCase.notifyMessage;
            if (layerUseCase2.compareTo(layerUseCase) > 0) {
                boolean contains = formatMessage().contains(scrollAggregator);
                z = !contains;
                if (!contains) {
                    acquireAsset(scrollAggregator);
                }
            } else {
                z = true;
            }
        }
        try {
            ItemGovernor.ActivityMutator activityMutator = ItemGovernor.releaseHeader;
            TypographySynthesizer serializeOffset = activityMutator.serializeOffset(offerHash(scrollAggregator), compressBody(scrollAggregator, null));
            try {
                ItemGovernor connectJob = serializeOffset.connectJob();
                try {
                    scrollAggregator.purgeNode(iconExporter);
                    DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
                    serializeOffset.resetDelta(connectJob);
                    computeTarget(serializeOffset);
                    synchronized (this.injectMetric) {
                        try {
                            if (((LayerUseCase) this.gatherAdapter.getValue()).compareTo(layerUseCase) <= 0) {
                                unwrapRecord(scrollAggregator);
                            } else if (!formatMessage().contains(scrollAggregator)) {
                                appendKey(scrollAggregator);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (!attachConfig) {
                        activityMutator.clipOrigin();
                    }
                    try {
                        commitKey(scrollAggregator);
                        try {
                            scrollAggregator.connectPatch();
                            scrollAggregator.connectJob();
                            if (attachConfig) {
                                return;
                            }
                            activityMutator.clipOrigin();
                        } catch (Throwable th2) {
                            acquireArchive(this, th2, null, false, 6, null);
                        }
                    } catch (Throwable th3) {
                        updateConstraint(th3, scrollAggregator, true);
                    }
                } catch (Throwable th4) {
                    longPressCollector = this;
                    try {
                        serializeOffset.resetDelta(connectJob);
                        throw th4;
                    } catch (Throwable th5) {
                        th = th5;
                        Throwable th6 = th;
                        try {
                            longPressCollector.computeTarget(serializeOffset);
                            throw th6;
                        } catch (Throwable th7) {
                            th = th7;
                            Throwable th8 = th;
                            if (z) {
                                synchronized (longPressCollector.injectMetric) {
                                    longPressCollector.unwrapRecord(scrollAggregator);
                                    DpadBuilder dpadBuilder2 = DpadBuilder.evictLayout;
                                }
                            }
                            longPressCollector.updateConstraint(th8, scrollAggregator, true);
                        }
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                longPressCollector = this;
            }
        } catch (Throwable th10) {
            th = th10;
            longPressCollector = this;
        }
    }

    public final ScrollAggregator executeConfig(final ScrollAggregator scrollAggregator, final CustomStore customStore) {
        Set set;
        if (scrollAggregator.attachConfig() || scrollAggregator.serializeOffset() || ((set = this.connectPatch) != null && set.contains(scrollAggregator))) {
            return null;
        }
        TypographySynthesizer serializeOffset = ItemGovernor.releaseHeader.serializeOffset(offerHash(scrollAggregator), compressBody(scrollAggregator, customStore));
        try {
            ItemGovernor connectJob = serializeOffset.connectJob();
            if (customStore != null) {
                try {
                    if (customStore.releaseHeader()) {
                        scrollAggregator.popBlueprint(new ElevationNode() { // from class: com.goldenboot.saga.zone.SubscriberFormer
                            @Override // com.goldenboot.saga.zone.ElevationNode
                            public final Object invoke() {
                                DpadBuilder loadItem;
                                loadItem = LongPressCollector.loadItem(CustomStore.this, scrollAggregator);
                                return loadItem;
                            }
                        });
                    }
                } catch (Throwable th) {
                    serializeOffset.resetDelta(connectJob);
                    throw th;
                }
            }
            boolean mergeLocale = scrollAggregator.mergeLocale();
            serializeOffset.resetDelta(connectJob);
            if (mergeLocale) {
                return scrollAggregator;
            }
            return null;
        } finally {
            computeTarget(serializeOffset);
        }
    }

    public final void executeRecord() {
        synchronized (this.injectMetric) {
            this.drawRequest = true;
            DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
        }
    }

    public final List expandScope() {
        List formatMessage;
        synchronized (this.injectMetric) {
            formatMessage = formatMessage();
        }
        return formatMessage;
    }

    public final void flattenToken(DrawableSynthesizer drawableSynthesizer) {
        synchronized (this.injectMetric) {
            Throwable th = this.releaseHeader;
            if (th != null) {
                throw th;
            }
            if (((LayerUseCase) this.gatherAdapter.getValue()).compareTo(LayerUseCase.notifyMessage) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.detachStream != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.detachStream = drawableSynthesizer;
            removeCount();
        }
    }

    @Override // com.goldenboot.saga.zone.WorkerIndex
    public long flushSample() {
        return 1000;
    }

    public final List formatMessage() {
        List list = this.flushSample;
        if (list != null) {
            return list;
        }
        List list2 = this.clipOrigin;
        List peekRevision = list2.isEmpty() ? CursorBuilder.peekRevision() : new ArrayList(list2);
        this.flushSample = peekRevision;
        return peekRevision;
    }

    public final boolean growCallback() {
        return !this.drawRequest && this.growPayload.expandArgs();
    }

    @Override // com.goldenboot.saga.zone.WorkerIndex
    public ElevationInspector growPayload(ScrollAggregator scrollAggregator, TimelineMaker timelineMaker, IconExporter iconExporter) {
        try {
            TimelineMaker applyTask = scrollAggregator.applyTask(timelineMaker);
            try {
                evictLayout(scrollAggregator, iconExporter);
                ElevationInspector elevationInspector = (CustomStore) this.decodePath.evictLayout();
                if (elevationInspector == null) {
                    elevationInspector = SelectionMapper.evictLayout();
                }
                return elevationInspector;
            } finally {
                scrollAggregator.applyTask(applyTask);
            }
        } finally {
            this.decodePath.growPayload(null);
        }
    }

    public final void handleFooter() {
        synchronized (this.injectMetric) {
            try {
                if (((LayerUseCase) this.gatherAdapter.getValue()).compareTo(LayerUseCase.resetDelta) >= 0) {
                    this.gatherAdapter.setValue(LayerUseCase.notifyMessage);
                }
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            } catch (Throwable th) {
                throw th;
            }
        }
        DrawableSynthesizer.ActivityMutator.evictLayout(this.drawScope, null, 1, null);
    }

    public final Object locateSignal(ServiceRegulator serviceRegulator) {
        DragMutex dragMutex;
        if (normalizeBundle()) {
            return DpadBuilder.evictLayout;
        }
        DragMutex dragMutex2 = new DragMutex(ChipExporter.injectMetric(serviceRegulator), 1);
        dragMutex2.expandArgs();
        synchronized (this.injectMetric) {
            if (normalizeBundle()) {
                dragMutex = dragMutex2;
            } else {
                this.attachConfig = dragMutex2;
                dragMutex = null;
            }
        }
        if (dragMutex != null) {
            AttrSemaphore.ActivityMutator activityMutator = AttrSemaphore.notifyMessage;
            dragMutex.resumeWith(AttrSemaphore.growPayload(DpadBuilder.evictLayout));
        }
        Object inflateAdapter = dragMutex2.inflateAdapter();
        if (inflateAdapter == RotateReceiver.releaseHeader()) {
            FeatureMeter.injectMetric(serviceRegulator);
        }
        return inflateAdapter == RotateReceiver.releaseHeader() ? inflateAdapter : DpadBuilder.evictLayout;
    }

    public final boolean normalizeBundle() {
        boolean z;
        synchronized (this.injectMetric) {
            if (!this.updateTimer.releaseHeader() && this.applyTask.reduceScope() == 0) {
                z = growCallback();
            }
        }
        return z;
    }

    public final TouchRecord offerHash(final ScrollAggregator scrollAggregator) {
        return new TouchRecord() { // from class: com.goldenboot.saga.zone.ClickFlow
            @Override // com.goldenboot.saga.zone.TouchRecord
            public final Object invoke(Object obj) {
                DpadBuilder searchHolder;
                searchHolder = LongPressCollector.searchHolder(ScrollAggregator.this, obj);
                return searchHolder;
            }
        };
    }

    public final boolean peekDescriptor() {
        boolean growCallback;
        synchronized (this.injectMetric) {
            growCallback = growCallback();
        }
        return growCallback;
    }

    @Override // com.goldenboot.saga.zone.WorkerIndex
    public void peekRevision(ScrollAggregator scrollAggregator) {
        GroupSegment groupSegment;
        synchronized (this.injectMetric) {
            if (this.applyTask.drawField(scrollAggregator)) {
                groupSegment = null;
            } else {
                this.applyTask.growPayload(scrollAggregator);
                groupSegment = removeCount();
            }
        }
        if (groupSegment != null) {
            AttrSemaphore.ActivityMutator activityMutator = AttrSemaphore.notifyMessage;
            groupSegment.resumeWith(AttrSemaphore.growPayload(DpadBuilder.evictLayout));
        }
    }

    @Override // com.goldenboot.saga.zone.WorkerIndex
    public LongPressGateway popBlueprint() {
        return this.expandArgs;
    }

    public final void prepareCount(ScrollAggregator scrollAggregator) {
        if (this.clipOrigin.remove(scrollAggregator)) {
            this.flushSample = null;
            unwrapRecord(scrollAggregator);
        }
    }

    public final Object protectChannel(ServiceRegulator serviceRegulator) {
        Object saveSnapshot = saveSnapshot(new ScopedMigration(null), serviceRegulator);
        return saveSnapshot == RotateReceiver.releaseHeader() ? saveSnapshot : DpadBuilder.evictLayout;
    }

    public final void protectGauge() {
        int i;
        TriggerBus triggerBus;
        synchronized (this.injectMetric) {
            try {
                if (KeyboardMap.popBlueprint(this.connectJob)) {
                    TriggerBus notifyMessage = KeyboardMap.notifyMessage(this.connectJob);
                    KeyboardMap.injectMetric(this.connectJob);
                    this.peekRevision.growPayload();
                    KeyboardMap.injectMetric(this.reduceScope);
                    SlotWorkflow slotWorkflow = new SlotWorkflow(notifyMessage.detachStream());
                    Object[] objArr = notifyMessage.evictLayout;
                    int i2 = notifyMessage.growPayload;
                    for (int i3 = 0; i3 < i2; i3++) {
                        InputChannel inputChannel = (InputChannel) objArr[i3];
                        slotWorkflow.drawField(PagerValidator.evictLayout(inputChannel, this.serializeOffset.releaseHeader(inputChannel)));
                    }
                    this.serializeOffset.drawField();
                    triggerBus = slotWorkflow;
                } else {
                    triggerBus = TranslateAdministrator.growPayload();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object[] objArr2 = triggerBus.evictLayout;
        int i4 = triggerBus.growPayload;
        for (i = 0; i < i4; i++) {
            AlarmFacilitator alarmFacilitator = (AlarmFacilitator) objArr2[i];
        }
    }

    public final void purgeMetric() {
        Iterator it = formatMessage().iterator();
        while (it.hasNext()) {
            unwrapRecord((ScrollAggregator) it.next());
        }
        this.clipOrigin.clear();
        this.flushSample = CursorBuilder.peekRevision();
    }

    public final boolean queryData() {
        boolean drawConfig;
        CursorBuilder.peekRevision();
        synchronized (this.injectMetric) {
            if (this.updateTimer.detachStream()) {
                return drawConfig();
            }
            List formatMessage = formatMessage();
            Set evictLayout = StyleCurator.evictLayout(this.updateTimer);
            int i = 0;
            this.updateTimer = new CustomStore(i, 1, null);
            try {
                int size = formatMessage.size();
                while (i < size) {
                    ((ScrollAggregator) formatMessage.get(i)).reduceScope(evictLayout);
                    if (((LayerUseCase) this.gatherAdapter.getValue()).compareTo(LayerUseCase.notifyMessage) <= 0) {
                        break;
                    }
                    i++;
                }
                synchronized (this.injectMetric) {
                    if (removeCount() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    drawConfig = drawConfig();
                }
                return drawConfig;
            } catch (Throwable th) {
                synchronized (this.injectMetric) {
                    this.updateTimer.popBlueprint(evictLayout);
                    throw th;
                }
            }
        }
    }

    @Override // com.goldenboot.saga.zone.WorkerIndex
    public ElevationInspector reduceScope(ScrollAggregator scrollAggregator, TimelineMaker timelineMaker, ElevationInspector elevationInspector) {
        try {
            queryData();
            scrollAggregator.reduceScope(StyleCurator.evictLayout(elevationInspector));
            TimelineMaker applyTask = scrollAggregator.applyTask(timelineMaker);
            try {
                ScrollAggregator executeConfig = executeConfig(scrollAggregator, null);
                if (executeConfig != null) {
                    commitKey(scrollAggregator);
                    executeConfig.connectPatch();
                    executeConfig.connectJob();
                }
                ElevationInspector elevationInspector2 = (CustomStore) this.decodePath.evictLayout();
                if (elevationInspector2 == null) {
                    elevationInspector2 = SelectionMapper.evictLayout();
                }
                return elevationInspector2;
            } finally {
                scrollAggregator.applyTask(applyTask);
            }
        } finally {
            this.decodePath.growPayload(null);
        }
    }

    @Override // com.goldenboot.saga.zone.WorkerIndex
    public boolean releaseHeader() {
        return false;
    }

    public final GroupSegment removeCount() {
        LayerUseCase layerUseCase;
        int i = 0;
        int i2 = 1;
        DefaultConstructorMarker defaultConstructorMarker = null;
        if (((LayerUseCase) this.gatherAdapter.getValue()).compareTo(LayerUseCase.notifyMessage) <= 0) {
            purgeMetric();
            this.updateTimer = new CustomStore(i, i2, defaultConstructorMarker);
            this.applyTask.popBlueprint();
            this.popBlueprint.clear();
            this.drawField.clear();
            this.notifyMessage = null;
            GroupSegment groupSegment = this.attachConfig;
            if (groupSegment != null) {
                GroupSegment.ActivityMutator.evictLayout(groupSegment, null, 1, null);
            }
            this.attachConfig = null;
            this.purgeNode = null;
            return null;
        }
        if (this.purgeNode != null) {
            layerUseCase = LayerUseCase.connectPatch;
        } else if (this.detachStream == null) {
            this.updateTimer = new CustomStore(i, i2, defaultConstructorMarker);
            this.applyTask.popBlueprint();
            layerUseCase = growCallback() ? LayerUseCase.attachConfig : LayerUseCase.connectPatch;
        } else {
            layerUseCase = (this.applyTask.reduceScope() == 0 && !this.updateTimer.releaseHeader() && this.popBlueprint.isEmpty() && this.drawField.isEmpty() && this.resetDelta <= 0 && !growCallback() && !KeyboardMap.popBlueprint(this.connectJob)) ? LayerUseCase.resetDelta : LayerUseCase.inflateAdapter;
        }
        this.gatherAdapter.setValue(layerUseCase);
        if (layerUseCase != LayerUseCase.inflateAdapter) {
            return null;
        }
        GroupSegment groupSegment2 = this.attachConfig;
        this.attachConfig = null;
        return groupSegment2;
    }

    @Override // com.goldenboot.saga.zone.WorkerIndex
    public void resetDelta(ScrollAggregator scrollAggregator) {
        synchronized (this.injectMetric) {
            try {
                Set set = this.connectPatch;
                if (set == null) {
                    set = new LinkedHashSet();
                    this.connectPatch = set;
                }
                set.add(scrollAggregator);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object saveSnapshot(ConfigListener configListener, ServiceRegulator serviceRegulator) {
        Object clipOrigin = LazyStep.clipOrigin(this.growPayload, new StylusConverter(configListener, BundleMeter.evictLayout(serviceRegulator.getContext()), null), serviceRegulator);
        return clipOrigin == RotateReceiver.releaseHeader() ? clipOrigin : DpadBuilder.evictLayout;
    }

    @Override // com.goldenboot.saga.zone.WorkerIndex
    public GroupBatch serializeOffset(InputChannel inputChannel) {
        GroupBatch groupBatch;
        synchronized (this.injectMetric) {
            groupBatch = (GroupBatch) this.serializeOffset.purgeNode(inputChannel);
        }
        return groupBatch;
    }

    public final void sortSnapshot() {
        GroupSegment groupSegment;
        synchronized (this.injectMetric) {
            if (this.drawRequest) {
                this.drawRequest = false;
                groupSegment = removeCount();
            } else {
                groupSegment = null;
            }
        }
        if (groupSegment != null) {
            AttrSemaphore.ActivityMutator activityMutator = AttrSemaphore.notifyMessage;
            groupSegment.resumeWith(AttrSemaphore.growPayload(DpadBuilder.evictLayout));
        }
    }

    public final void syncPool(ScrollAggregator scrollAggregator) {
        List list = this.notifyMessage;
        if (list == null) {
            list = new ArrayList();
            this.notifyMessage = list;
        }
        if (!list.contains(scrollAggregator)) {
            list.add(scrollAggregator);
        }
        prepareCount(scrollAggregator);
    }

    public final long transformCurrency() {
        return this.evictLayout;
    }

    public final void unwrapRecord(ScrollAggregator scrollAggregator) {
        SlotWorkflow slotWorkflow = this.findTask;
        if (slotWorkflow != null) {
            Object[] objArr = slotWorkflow.evictLayout;
            int i = slotWorkflow.growPayload;
            for (int i2 = 0; i2 < i; i2++) {
                TransitionMemento.evictLayout(objArr[i2]);
                if (scrollAggregator instanceof RestoreAdapter) {
                    throw null;
                }
            }
        }
    }

    public final void updateConstraint(Throwable th, ScrollAggregator scrollAggregator, boolean z) {
        int i = 0;
        if (!((Boolean) storeCharset.get()).booleanValue() || (th instanceof PluginRollback)) {
            synchronized (this.injectMetric) {
                BounceHandler bounceHandler = this.purgeNode;
                if (bounceHandler != null) {
                    throw bounceHandler.evictLayout();
                }
                this.purgeNode = new BounceHandler(false, th);
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            }
            throw th;
        }
        synchronized (this.injectMetric) {
            try {
                GlowMigration.evictLayout("Error was captured in composition while live edit was enabled.", th);
                this.popBlueprint.clear();
                this.applyTask.popBlueprint();
                this.updateTimer = new CustomStore(i, 1, null);
                this.drawField.clear();
                KeyboardMap.injectMetric(this.connectJob);
                this.serializeOffset.drawField();
                this.purgeNode = new BounceHandler(z, th);
                if (scrollAggregator != null) {
                    syncPool(scrollAggregator);
                }
                removeCount();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.goldenboot.saga.zone.WorkerIndex
    public FrameHub updateTimer() {
        return null;
    }

    public final AccentFactory validateOffset() {
        return this.gatherAdapter;
    }

    @Override // com.goldenboot.saga.zone.WorkerIndex
    public void notifyMessage(Set set) {
    }
}
