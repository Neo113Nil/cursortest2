package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.VibrationEvent;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.TypeIntrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class FocusSupervisor {
    public static final int connectJob = 8;
    public boolean applyTask;
    public final TouchRecord evictLayout;
    public boolean injectMetric;
    public ActivityMutator popBlueprint;
    public StackBlock updateTimer;
    public final AtomicReference growPayload = new AtomicReference(null);
    public final IconExporter detachStream = new IconExporter() { // from class: com.goldenboot.saga.zone.BreadcrumbChain
        @Override // com.goldenboot.saga.zone.IconExporter
        public final Object invoke(Object obj, Object obj2) {
            DpadBuilder releaseHeader;
            releaseHeader = FocusSupervisor.releaseHeader(FocusSupervisor.this, (Set) obj, (ItemGovernor) obj2);
            return releaseHeader;
        }
    };
    public final TouchRecord releaseHeader = new TouchRecord() { // from class: com.goldenboot.saga.zone.TimelineChain
        @Override // com.goldenboot.saga.zone.TouchRecord
        public final Object invoke(Object obj) {
            DpadBuilder connectJob2;
            connectJob2 = FocusSupervisor.connectJob(FocusSupervisor.this, obj);
            return connectJob2;
        }
    };
    public final PluginScheduler clipOrigin = new PluginScheduler(new ActivityMutator[16], 0);
    public final Object flushSample = new Object();
    public long drawField = -1;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator {
        public final TouchRecord evictLayout;
        public Object growPayload;
        public ApplicationHook injectMetric;
        public int popBlueprint;
        public int detachStream = -1;
        public final ParallelHeap releaseHeader = LabelPipeline.detachStream(null, 1, null);
        public final ParallelHeap clipOrigin = new ParallelHeap(0, 1, null);
        public final CustomStore flushSample = new CustomStore(0, 1, null);
        public final PluginScheduler updateTimer = new PluginScheduler(new VibrationEvent[16], 0);
        public final AlarmInteractor applyTask = new C0110ActivityMutator();
        public final ParallelHeap drawField = LabelPipeline.detachStream(null, 1, null);
        public final HashMap connectJob = new HashMap();

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        /* renamed from: com.goldenboot.saga.zone.FocusSupervisor$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public static final class C0110ActivityMutator implements AlarmInteractor {
            public C0110ActivityMutator() {
            }

            @Override // com.goldenboot.saga.zone.AlarmInteractor
            public void evictLayout(VibrationEvent vibrationEvent) {
                ActivityMutator.this.popBlueprint++;
            }

            @Override // com.goldenboot.saga.zone.AlarmInteractor
            public void growPayload(VibrationEvent vibrationEvent) {
                ActivityMutator.this.popBlueprint--;
            }
        }

        public ActivityMutator(TouchRecord touchRecord) {
            this.evictLayout = touchRecord;
        }

        public final void applyTask(Object obj, TouchRecord touchRecord, ElevationNode elevationNode) {
            Object obj2 = this.growPayload;
            ApplicationHook applicationHook = this.injectMetric;
            int i = this.detachStream;
            this.growPayload = obj;
            this.injectMetric = (ApplicationHook) this.clipOrigin.releaseHeader(obj);
            if (this.detachStream == -1) {
                this.detachStream = Long.hashCode(WaveBenchmark.dispatchTimezone().applyTask());
            }
            AlarmInteractor alarmInteractor = this.applyTask;
            PluginScheduler injectMetric = BounceReader.injectMetric();
            try {
                injectMetric.growPayload(alarmInteractor);
                ItemGovernor.releaseHeader.flushSample(touchRecord, null, elevationNode);
                injectMetric.gatherAdapter(injectMetric.reduceScope() - 1);
                Object obj3 = this.growPayload;
                Intrinsics.checkNotNull(obj3);
                detachStream(obj3);
                this.growPayload = obj2;
                this.injectMetric = applicationHook;
                this.detachStream = i;
            } catch (Throwable th) {
                injectMetric.gatherAdapter(injectMetric.reduceScope() - 1);
                throw th;
            }
        }

        public final TouchRecord clipOrigin() {
            return this.evictLayout;
        }

        public final void connectJob(Object obj, int i, Object obj2, ApplicationHook applicationHook) {
            int i2;
            int i3;
            int i4;
            if (this.popBlueprint > 0) {
                return;
            }
            int connectPatch = applicationHook.connectPatch(obj, i, -1);
            int i5 = 2;
            if (!(obj instanceof VibrationEvent) || connectPatch == i) {
                i2 = 2;
                i3 = -1;
            } else {
                VibrationEvent.ActivityMutator reduceScope = ((VibrationEvent) obj).reduceScope();
                this.connectJob.put(obj, reduceScope.evictLayout());
                SessionRegistry growPayload = reduceScope.growPayload();
                ParallelHeap parallelHeap = this.drawField;
                LabelPipeline.updateTimer(parallelHeap, obj);
                Object[] objArr = growPayload.growPayload;
                long[] jArr = growPayload.evictLayout;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i6 = 0;
                    while (true) {
                        long j = jArr[i6];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i7 = 8 - ((~(i6 - length)) >>> 31);
                            int i8 = 0;
                            while (i8 < i7) {
                                if ((j & 255) < 128) {
                                    i4 = i5;
                                    BorderHook borderHook = (BorderHook) objArr[(i6 << 3) + i8];
                                    if (borderHook instanceof ProducerActivator) {
                                        ((ProducerActivator) borderHook).attachConfig(GlobalSignal.evictLayout(i4));
                                    }
                                    LabelPipeline.evictLayout(parallelHeap, borderHook, obj);
                                } else {
                                    i4 = i5;
                                }
                                j >>= 8;
                                i8++;
                                i5 = i4;
                            }
                            i2 = i5;
                            if (i7 != 8) {
                                break;
                            }
                        } else {
                            i2 = i5;
                        }
                        if (i6 == length) {
                            break;
                        }
                        i6++;
                        i5 = i2;
                    }
                } else {
                    i2 = 2;
                }
                i3 = -1;
            }
            if (connectPatch == i3) {
                if (obj instanceof ProducerActivator) {
                    ((ProducerActivator) obj).attachConfig(GlobalSignal.evictLayout(i2));
                }
                LabelPipeline.evictLayout(this.releaseHeader, obj, obj2);
            }
        }

        public final void detachStream(Object obj) {
            int i = this.detachStream;
            ApplicationHook applicationHook = this.injectMetric;
            if (applicationHook == null) {
                return;
            }
            long[] jArr = applicationHook.evictLayout;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            Object obj2 = applicationHook.growPayload[i5];
                            boolean z = applicationHook.injectMetric[i5] != i;
                            if (z) {
                                peekRevision(obj, obj2);
                            }
                            if (z) {
                                applicationHook.resetDelta(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        return;
                    }
                }
                if (i2 == length) {
                    return;
                } else {
                    i2++;
                }
            }
        }

        public final void drawField(Object obj) {
            Object obj2 = this.growPayload;
            Intrinsics.checkNotNull(obj2);
            int i = this.detachStream;
            ApplicationHook applicationHook = this.injectMetric;
            if (applicationHook == null) {
                applicationHook = new ApplicationHook(0, 1, null);
                this.injectMetric = applicationHook;
                this.clipOrigin.decodePath(obj2, applicationHook);
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            }
            connectJob(obj, i, obj2, applicationHook);
        }

        public final boolean flushSample() {
            return this.clipOrigin.applyTask();
        }

        public final void injectMetric() {
            LabelPipeline.growPayload(this.releaseHeader);
            this.clipOrigin.drawField();
            LabelPipeline.growPayload(this.drawField);
            this.connectJob.clear();
        }

        public final void peekRevision(Object obj, Object obj2) {
            LabelPipeline.flushSample(this.releaseHeader, obj2, obj);
            if (!(obj2 instanceof VibrationEvent) || LabelPipeline.releaseHeader(this.releaseHeader, obj2)) {
                return;
            }
            LabelPipeline.updateTimer(this.drawField, obj2);
            this.connectJob.remove(obj2);
        }

        /* JADX WARN: Removed duplicated region for block: B:238:0x04e7  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean popBlueprint(Set set) {
            boolean z;
            Iterator it;
            ParallelHeap parallelHeap;
            Object releaseHeader;
            int i;
            Object releaseHeader2;
            long[] jArr;
            Object[] objArr;
            Iterator it2;
            ParallelHeap parallelHeap2;
            long[] jArr2;
            Object[] objArr2;
            long j;
            long[] jArr3;
            Object[] objArr3;
            String str;
            int i2;
            long[] jArr4;
            Object[] objArr4;
            String str2;
            int i3;
            int i4;
            long j2;
            int i5;
            int i6;
            Object obj;
            Object obj2;
            String str3;
            Object obj3;
            int i7;
            long j3;
            int i8;
            int i9;
            ParallelHeap parallelHeap3 = this.drawField;
            HashMap hashMap = this.connectJob;
            ParallelHeap parallelHeap4 = this.releaseHeader;
            CustomStore customStore = this.flushSample;
            String str4 = "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>";
            int i10 = 8;
            if (set instanceof AccentRealizer) {
                ElevationInspector releaseHeader3 = ((AccentRealizer) set).releaseHeader();
                Object[] objArr5 = releaseHeader3.growPayload;
                long[] jArr5 = releaseHeader3.evictLayout;
                int length = jArr5.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    z = false;
                    while (true) {
                        long j4 = jArr5[i11];
                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            int i13 = 0;
                            while (i13 < i12) {
                                if ((j4 & 255) < 128) {
                                    int i14 = i10;
                                    Object obj4 = objArr5[(i11 << 3) + i13];
                                    jArr4 = jArr5;
                                    if (obj4 instanceof ProducerActivator) {
                                        objArr4 = objArr5;
                                        if (!((ProducerActivator) obj4).connectPatch(GlobalSignal.evictLayout(2))) {
                                            str2 = str4;
                                            i3 = length;
                                            i4 = i11;
                                            j2 = j4;
                                            i5 = i12;
                                            i6 = 8;
                                        }
                                    } else {
                                        objArr4 = objArr5;
                                    }
                                    if (LabelPipeline.releaseHeader(parallelHeap3, obj4)) {
                                        Object releaseHeader4 = parallelHeap3.releaseHeader(obj4);
                                        if (releaseHeader4 != null) {
                                            if (releaseHeader4 instanceof CustomStore) {
                                                CustomStore customStore2 = (CustomStore) releaseHeader4;
                                                Object[] objArr6 = customStore2.growPayload;
                                                long[] jArr6 = customStore2.evictLayout;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    j2 = j4;
                                                    int i15 = 0;
                                                    boolean z2 = z;
                                                    while (true) {
                                                        long j5 = jArr6[i15];
                                                        i3 = length;
                                                        i4 = i11;
                                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                            int i17 = 0;
                                                            while (i17 < i16) {
                                                                if ((j5 & 255) < 128) {
                                                                    i7 = i17;
                                                                    VibrationEvent vibrationEvent = (VibrationEvent) objArr6[(i15 << 3) + i17];
                                                                    Intrinsics.checkNotNull(vibrationEvent, str4);
                                                                    j3 = j5;
                                                                    Object obj5 = hashMap.get(vibrationEvent);
                                                                    BounceFacilitator injectMetric = vibrationEvent.injectMetric();
                                                                    if (injectMetric == null) {
                                                                        injectMetric = BounceReader.attachConfig();
                                                                    }
                                                                    boolean z3 = z2;
                                                                    if (injectMetric.evictLayout(vibrationEvent.reduceScope().evictLayout(), obj5)) {
                                                                        str3 = str4;
                                                                        obj3 = obj4;
                                                                        i8 = i12;
                                                                        this.updateTimer.growPayload(vibrationEvent);
                                                                        z2 = z3;
                                                                    } else {
                                                                        Object releaseHeader5 = parallelHeap4.releaseHeader(vibrationEvent);
                                                                        if (releaseHeader5 != null) {
                                                                            if (releaseHeader5 instanceof CustomStore) {
                                                                                CustomStore customStore3 = (CustomStore) releaseHeader5;
                                                                                Object[] objArr7 = customStore3.growPayload;
                                                                                long[] jArr7 = customStore3.evictLayout;
                                                                                int length3 = jArr7.length - 2;
                                                                                if (length3 >= 0) {
                                                                                    i8 = i12;
                                                                                    int i18 = 0;
                                                                                    while (true) {
                                                                                        long j6 = jArr7[i18];
                                                                                        str3 = str4;
                                                                                        obj3 = obj4;
                                                                                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                                            int i19 = 8 - ((~(i18 - length3)) >>> 31);
                                                                                            int i20 = 0;
                                                                                            while (i20 < i19) {
                                                                                                if ((j6 & 255) < 128) {
                                                                                                    i9 = i20;
                                                                                                    customStore.updateTimer(objArr7[(i18 << 3) + i20]);
                                                                                                    z3 = true;
                                                                                                } else {
                                                                                                    i9 = i20;
                                                                                                }
                                                                                                j6 >>= i14;
                                                                                                i20 = i9 + 1;
                                                                                            }
                                                                                            if (i19 != i14) {
                                                                                                break;
                                                                                            }
                                                                                        }
                                                                                        if (i18 == length3) {
                                                                                            break;
                                                                                        }
                                                                                        i18++;
                                                                                        str4 = str3;
                                                                                        obj4 = obj3;
                                                                                        i14 = 8;
                                                                                    }
                                                                                    z2 = z3;
                                                                                    DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
                                                                                }
                                                                            } else {
                                                                                str3 = str4;
                                                                                obj3 = obj4;
                                                                                i8 = i12;
                                                                                customStore.updateTimer(releaseHeader5);
                                                                                z2 = true;
                                                                                DpadBuilder dpadBuilder2 = DpadBuilder.evictLayout;
                                                                            }
                                                                        }
                                                                        str3 = str4;
                                                                        obj3 = obj4;
                                                                        i8 = i12;
                                                                        z2 = z3;
                                                                        DpadBuilder dpadBuilder22 = DpadBuilder.evictLayout;
                                                                    }
                                                                } else {
                                                                    str3 = str4;
                                                                    obj3 = obj4;
                                                                    i7 = i17;
                                                                    j3 = j5;
                                                                    i8 = i12;
                                                                }
                                                                j5 = j3 >> 8;
                                                                i17 = i7 + 1;
                                                                i14 = 8;
                                                                i12 = i8;
                                                                str4 = str3;
                                                                obj4 = obj3;
                                                            }
                                                            str2 = str4;
                                                            obj2 = obj4;
                                                            boolean z4 = z2;
                                                            i5 = i12;
                                                            if (i16 != i14) {
                                                                z = z4;
                                                                break;
                                                            }
                                                            z2 = z4;
                                                        } else {
                                                            str2 = str4;
                                                            obj2 = obj4;
                                                            i5 = i12;
                                                        }
                                                        if (i15 == length2) {
                                                            z = z2;
                                                            break;
                                                        }
                                                        i15++;
                                                        length = i3;
                                                        i11 = i4;
                                                        i12 = i5;
                                                        str4 = str2;
                                                        obj4 = obj2;
                                                        i14 = 8;
                                                    }
                                                }
                                            } else {
                                                str2 = str4;
                                                obj2 = obj4;
                                                i3 = length;
                                                i4 = i11;
                                                j2 = j4;
                                                i5 = i12;
                                                VibrationEvent vibrationEvent2 = (VibrationEvent) releaseHeader4;
                                                Object obj6 = hashMap.get(vibrationEvent2);
                                                BounceFacilitator injectMetric2 = vibrationEvent2.injectMetric();
                                                if (injectMetric2 == null) {
                                                    injectMetric2 = BounceReader.attachConfig();
                                                }
                                                if (injectMetric2.evictLayout(vibrationEvent2.reduceScope().evictLayout(), obj6)) {
                                                    this.updateTimer.growPayload(vibrationEvent2);
                                                } else {
                                                    Object releaseHeader6 = parallelHeap4.releaseHeader(vibrationEvent2);
                                                    if (releaseHeader6 != null) {
                                                        if (releaseHeader6 instanceof CustomStore) {
                                                            CustomStore customStore4 = (CustomStore) releaseHeader6;
                                                            Object[] objArr8 = customStore4.growPayload;
                                                            long[] jArr8 = customStore4.evictLayout;
                                                            int length4 = jArr8.length - 2;
                                                            if (length4 >= 0) {
                                                                int i21 = 0;
                                                                while (true) {
                                                                    long j7 = jArr8[i21];
                                                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                        int i22 = 8 - ((~(i21 - length4)) >>> 31);
                                                                        for (int i23 = 0; i23 < i22; i23++) {
                                                                            if ((j7 & 255) < 128) {
                                                                                customStore.updateTimer(objArr8[(i21 << 3) + i23]);
                                                                                z = true;
                                                                            }
                                                                            j7 >>= 8;
                                                                        }
                                                                        if (i22 != 8) {
                                                                            break;
                                                                        }
                                                                    }
                                                                    if (i21 == length4) {
                                                                        break;
                                                                    }
                                                                    i21++;
                                                                }
                                                            }
                                                        } else {
                                                            customStore.updateTimer(releaseHeader6);
                                                            z = true;
                                                        }
                                                    }
                                                    DpadBuilder dpadBuilder3 = DpadBuilder.evictLayout;
                                                }
                                            }
                                            obj = obj2;
                                        }
                                        str2 = str4;
                                        obj2 = obj4;
                                        i3 = length;
                                        i4 = i11;
                                        j2 = j4;
                                        i5 = i12;
                                        obj = obj2;
                                    } else {
                                        str2 = str4;
                                        i3 = length;
                                        i4 = i11;
                                        j2 = j4;
                                        i5 = i12;
                                        obj = obj4;
                                    }
                                    Object releaseHeader7 = parallelHeap4.releaseHeader(obj);
                                    if (releaseHeader7 != null) {
                                        if (releaseHeader7 instanceof CustomStore) {
                                            CustomStore customStore5 = (CustomStore) releaseHeader7;
                                            Object[] objArr9 = customStore5.growPayload;
                                            long[] jArr9 = customStore5.evictLayout;
                                            int length5 = jArr9.length - 2;
                                            if (length5 >= 0) {
                                                int i24 = 0;
                                                while (true) {
                                                    long j8 = jArr9[i24];
                                                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i25 = 8 - ((~(i24 - length5)) >>> 31);
                                                        for (int i26 = 0; i26 < i25; i26++) {
                                                            if ((j8 & 255) < 128) {
                                                                customStore.updateTimer(objArr9[(i24 << 3) + i26]);
                                                                z = true;
                                                            }
                                                            j8 >>= 8;
                                                        }
                                                        if (i25 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i24 == length5) {
                                                        break;
                                                    }
                                                    i24++;
                                                }
                                            }
                                        } else {
                                            customStore.updateTimer(releaseHeader7);
                                            z = true;
                                        }
                                    }
                                    i6 = 8;
                                } else {
                                    jArr4 = jArr5;
                                    objArr4 = objArr5;
                                    str2 = str4;
                                    i3 = length;
                                    i4 = i11;
                                    j2 = j4;
                                    i5 = i12;
                                    i6 = i10;
                                }
                                j4 = j2 >> i6;
                                i13++;
                                objArr5 = objArr4;
                                i10 = i6;
                                jArr5 = jArr4;
                                length = i3;
                                i11 = i4;
                                i12 = i5;
                                str4 = str2;
                            }
                            jArr3 = jArr5;
                            objArr3 = objArr5;
                            str = str4;
                            int i27 = length;
                            int i28 = i11;
                            if (i12 != i10) {
                                break;
                            }
                            length = i27;
                            i2 = i28;
                        } else {
                            jArr3 = jArr5;
                            objArr3 = objArr5;
                            str = str4;
                            i2 = i11;
                        }
                        if (i2 == length) {
                            break;
                        }
                        i11 = i2 + 1;
                        objArr5 = objArr3;
                        jArr5 = jArr3;
                        str4 = str;
                        i10 = 8;
                    }
                } else {
                    z = false;
                }
            } else {
                Iterator it3 = set.iterator();
                z = false;
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (!(next instanceof ProducerActivator) || ((ProducerActivator) next).connectPatch(GlobalSignal.evictLayout(2))) {
                        if (LabelPipeline.releaseHeader(parallelHeap3, next) && (releaseHeader2 = parallelHeap3.releaseHeader(next)) != null) {
                            if (releaseHeader2 instanceof CustomStore) {
                                CustomStore customStore6 = (CustomStore) releaseHeader2;
                                Object[] objArr10 = customStore6.growPayload;
                                long[] jArr10 = customStore6.evictLayout;
                                int length6 = jArr10.length - 2;
                                if (length6 >= 0) {
                                    int i29 = 0;
                                    while (true) {
                                        long j9 = jArr10[i29];
                                        if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i30 = 8 - ((~(i29 - length6)) >>> 31);
                                            int i31 = 0;
                                            while (i31 < i30) {
                                                if ((j9 & 255) < 128) {
                                                    it2 = it3;
                                                    VibrationEvent vibrationEvent3 = (VibrationEvent) objArr10[(i29 << 3) + i31];
                                                    parallelHeap2 = parallelHeap3;
                                                    Intrinsics.checkNotNull(vibrationEvent3, "null cannot be cast to non-null type androidx.compose.runtime.DerivedState<kotlin.Any?>");
                                                    Object obj7 = hashMap.get(vibrationEvent3);
                                                    BounceFacilitator injectMetric3 = vibrationEvent3.injectMetric();
                                                    if (injectMetric3 == null) {
                                                        injectMetric3 = BounceReader.attachConfig();
                                                    }
                                                    jArr2 = jArr10;
                                                    objArr2 = objArr10;
                                                    if (injectMetric3.evictLayout(vibrationEvent3.reduceScope().evictLayout(), obj7)) {
                                                        j = j9;
                                                        this.updateTimer.growPayload(vibrationEvent3);
                                                    } else {
                                                        Object releaseHeader8 = parallelHeap4.releaseHeader(vibrationEvent3);
                                                        if (releaseHeader8 != null) {
                                                            if (releaseHeader8 instanceof CustomStore) {
                                                                CustomStore customStore7 = (CustomStore) releaseHeader8;
                                                                Object[] objArr11 = customStore7.growPayload;
                                                                long[] jArr11 = customStore7.evictLayout;
                                                                int length7 = jArr11.length - 2;
                                                                if (length7 >= 0) {
                                                                    int i32 = 0;
                                                                    while (true) {
                                                                        long j10 = jArr11[i32];
                                                                        j = j9;
                                                                        boolean z5 = z;
                                                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                            int i33 = 8 - ((~(i32 - length7)) >>> 31);
                                                                            int i34 = 0;
                                                                            while (i34 < i33) {
                                                                                if ((j10 & 255) < 128) {
                                                                                    customStore.updateTimer(objArr11[(i32 << 3) + i34]);
                                                                                    z5 = true;
                                                                                }
                                                                                i34++;
                                                                                j10 >>= 8;
                                                                            }
                                                                            if (i33 != 8) {
                                                                                z = z5;
                                                                                break;
                                                                            }
                                                                        }
                                                                        z = z5;
                                                                        if (i32 == length7) {
                                                                            break;
                                                                        }
                                                                        i32++;
                                                                        j9 = j;
                                                                    }
                                                                }
                                                            } else {
                                                                j = j9;
                                                                customStore.updateTimer(releaseHeader8);
                                                                z = true;
                                                            }
                                                            DpadBuilder dpadBuilder4 = DpadBuilder.evictLayout;
                                                        }
                                                        j = j9;
                                                        DpadBuilder dpadBuilder42 = DpadBuilder.evictLayout;
                                                    }
                                                } else {
                                                    it2 = it3;
                                                    parallelHeap2 = parallelHeap3;
                                                    jArr2 = jArr10;
                                                    objArr2 = objArr10;
                                                    j = j9;
                                                }
                                                j9 = j >> 8;
                                                i31++;
                                                it3 = it2;
                                                parallelHeap3 = parallelHeap2;
                                                jArr10 = jArr2;
                                                objArr10 = objArr2;
                                            }
                                            it = it3;
                                            parallelHeap = parallelHeap3;
                                            jArr = jArr10;
                                            objArr = objArr10;
                                            if (i30 != 8) {
                                                break;
                                            }
                                        } else {
                                            it = it3;
                                            parallelHeap = parallelHeap3;
                                            jArr = jArr10;
                                            objArr = objArr10;
                                        }
                                        if (i29 == length6) {
                                            break;
                                        }
                                        i29++;
                                        it3 = it;
                                        parallelHeap3 = parallelHeap;
                                        jArr10 = jArr;
                                        objArr10 = objArr;
                                    }
                                }
                            } else {
                                it = it3;
                                parallelHeap = parallelHeap3;
                                VibrationEvent vibrationEvent4 = (VibrationEvent) releaseHeader2;
                                Object obj8 = hashMap.get(vibrationEvent4);
                                BounceFacilitator injectMetric4 = vibrationEvent4.injectMetric();
                                if (injectMetric4 == null) {
                                    injectMetric4 = BounceReader.attachConfig();
                                }
                                if (injectMetric4.evictLayout(vibrationEvent4.reduceScope().evictLayout(), obj8)) {
                                    this.updateTimer.growPayload(vibrationEvent4);
                                } else {
                                    Object releaseHeader9 = parallelHeap4.releaseHeader(vibrationEvent4);
                                    if (releaseHeader9 != null) {
                                        if (releaseHeader9 instanceof CustomStore) {
                                            CustomStore customStore8 = (CustomStore) releaseHeader9;
                                            Object[] objArr12 = customStore8.growPayload;
                                            long[] jArr12 = customStore8.evictLayout;
                                            int length8 = jArr12.length - 2;
                                            if (length8 >= 0) {
                                                int i35 = 0;
                                                while (true) {
                                                    long j11 = jArr12[i35];
                                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i36 = 8 - ((~(i35 - length8)) >>> 31);
                                                        for (int i37 = 0; i37 < i36; i37++) {
                                                            if ((j11 & 255) < 128) {
                                                                customStore.updateTimer(objArr12[(i35 << 3) + i37]);
                                                                z = true;
                                                            }
                                                            j11 >>= 8;
                                                        }
                                                        if (i36 != 8) {
                                                            break;
                                                        }
                                                    }
                                                    if (i35 == length8) {
                                                        break;
                                                    }
                                                    i35++;
                                                }
                                            }
                                        } else {
                                            customStore.updateTimer(releaseHeader9);
                                            z = true;
                                        }
                                    }
                                    DpadBuilder dpadBuilder5 = DpadBuilder.evictLayout;
                                }
                            }
                            releaseHeader = parallelHeap4.releaseHeader(next);
                            if (releaseHeader != null) {
                                if (releaseHeader instanceof CustomStore) {
                                    CustomStore customStore9 = (CustomStore) releaseHeader;
                                    Object[] objArr13 = customStore9.growPayload;
                                    long[] jArr13 = customStore9.evictLayout;
                                    int length9 = jArr13.length - 2;
                                    if (length9 >= 0) {
                                        while (true) {
                                            long j12 = jArr13[i];
                                            if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i38 = 8 - ((~(i - length9)) >>> 31);
                                                for (int i39 = 0; i39 < i38; i39++) {
                                                    if ((j12 & 255) < 128) {
                                                        customStore.updateTimer(objArr13[(i << 3) + i39]);
                                                        z = true;
                                                    }
                                                    j12 >>= 8;
                                                }
                                                if (i38 != 8) {
                                                    break;
                                                }
                                            }
                                            i = i != length9 ? i + 1 : 0;
                                        }
                                    }
                                } else {
                                    customStore.updateTimer(releaseHeader);
                                    z = true;
                                }
                                it3 = it;
                                parallelHeap3 = parallelHeap;
                            }
                        }
                        it = it3;
                        parallelHeap = parallelHeap3;
                        releaseHeader = parallelHeap4.releaseHeader(next);
                        if (releaseHeader != null) {
                        }
                    } else {
                        it = it3;
                        parallelHeap = parallelHeap3;
                    }
                    it3 = it;
                    parallelHeap3 = parallelHeap;
                }
            }
            if (this.updateTimer.reduceScope() != 0) {
                PluginScheduler pluginScheduler = this.updateTimer;
                Object[] objArr14 = pluginScheduler.reduceScope;
                int reduceScope = pluginScheduler.reduceScope();
                for (int i40 = 0; i40 < reduceScope; i40++) {
                    reduceScope((VibrationEvent) objArr14[i40]);
                }
                this.updateTimer.popBlueprint();
            }
            return z;
        }

        public final void reduceScope(VibrationEvent vibrationEvent) {
            long[] jArr;
            long[] jArr2;
            int i;
            ApplicationHook applicationHook;
            ParallelHeap parallelHeap = this.clipOrigin;
            int hashCode = Long.hashCode(WaveBenchmark.dispatchTimezone().applyTask());
            Object releaseHeader = this.releaseHeader.releaseHeader(vibrationEvent);
            if (releaseHeader == null) {
                return;
            }
            if (!(releaseHeader instanceof CustomStore)) {
                ApplicationHook applicationHook2 = (ApplicationHook) parallelHeap.releaseHeader(releaseHeader);
                if (applicationHook2 == null) {
                    applicationHook2 = new ApplicationHook(0, 1, null);
                    parallelHeap.decodePath(releaseHeader, applicationHook2);
                    DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
                }
                connectJob(vibrationEvent, hashCode, releaseHeader, applicationHook2);
                return;
            }
            CustomStore customStore = (CustomStore) releaseHeader;
            Object[] objArr = customStore.growPayload;
            long[] jArr3 = customStore.evictLayout;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j = jArr3[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j & 255) < 128) {
                            i = i3;
                            Object obj = objArr[(i2 << 3) + i5];
                            ApplicationHook applicationHook3 = (ApplicationHook) parallelHeap.releaseHeader(obj);
                            jArr2 = jArr3;
                            if (applicationHook3 == null) {
                                applicationHook = new ApplicationHook(0, 1, null);
                                parallelHeap.decodePath(obj, applicationHook);
                                DpadBuilder dpadBuilder2 = DpadBuilder.evictLayout;
                            } else {
                                applicationHook = applicationHook3;
                            }
                            connectJob(vibrationEvent, hashCode, obj, applicationHook);
                        } else {
                            jArr2 = jArr3;
                            i = i3;
                        }
                        j >>= i;
                        i5++;
                        i3 = i;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i4 != i3) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    return;
                }
                i2++;
                jArr3 = jArr;
            }
        }

        public final void releaseHeader(Object obj) {
            ApplicationHook applicationHook = (ApplicationHook) this.clipOrigin.purgeNode(obj);
            if (applicationHook == null) {
                return;
            }
            Object[] objArr = applicationHook.growPayload;
            int[] iArr = applicationHook.injectMetric;
            long[] jArr = applicationHook.evictLayout;
            int length = jArr.length - 2;
            if (length < 0) {
                return;
            }
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj2 = objArr[i4];
                            int i5 = iArr[i4];
                            peekRevision(obj, obj2);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        return;
                    }
                }
                if (i == length) {
                    return;
                } else {
                    i++;
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void serializeOffset(TouchRecord touchRecord) {
            long[] jArr;
            long[] jArr2;
            long j;
            char c;
            long j2;
            int i;
            long j3;
            ParallelHeap parallelHeap = this.clipOrigin;
            long[] jArr3 = parallelHeap.evictLayout;
            int length = jArr3.length - 2;
            if (length < 0) {
                return;
            }
            int i2 = 0;
            while (true) {
                long j4 = jArr3[i2];
                char c2 = 7;
                long j5 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    while (i5 < i4) {
                        if ((j4 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            c = c2;
                            Object obj = parallelHeap.growPayload[i6];
                            j2 = j5;
                            ApplicationHook applicationHook = (ApplicationHook) parallelHeap.injectMetric[i6];
                            Boolean bool = (Boolean) touchRecord.invoke(obj);
                            if (bool.booleanValue()) {
                                Object[] objArr = applicationHook.growPayload;
                                int[] iArr = applicationHook.injectMetric;
                                long[] jArr4 = applicationHook.evictLayout;
                                int i7 = i3;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    jArr2 = jArr3;
                                    j = j4;
                                    int i8 = 0;
                                    while (true) {
                                        long j6 = jArr4[i8];
                                        long[] jArr5 = jArr4;
                                        if ((((~j6) << c) & j6 & j2) != j2) {
                                            int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                            for (int i10 = 0; i10 < i9; i10++) {
                                                if ((j6 & 255) < 128) {
                                                    int i11 = (i8 << 3) + i10;
                                                    j3 = j6;
                                                    Object obj2 = objArr[i11];
                                                    int i12 = iArr[i11];
                                                    peekRevision(obj, obj2);
                                                } else {
                                                    j3 = j6;
                                                }
                                                j6 = j3 >> i7;
                                            }
                                            if (i9 != i7) {
                                                break;
                                            }
                                        }
                                        if (i8 == length2) {
                                            break;
                                        }
                                        i8++;
                                        jArr4 = jArr5;
                                        i7 = 8;
                                    }
                                    if (bool.booleanValue()) {
                                        parallelHeap.drawRequest(i6);
                                    }
                                    i = 8;
                                }
                            }
                            jArr2 = jArr3;
                            j = j4;
                            if (bool.booleanValue()) {
                            }
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            j = j4;
                            c = c2;
                            j2 = j5;
                            i = i3;
                        }
                        i5++;
                        i3 = i;
                        j4 = j >> i;
                        c2 = c;
                        j5 = j2;
                        jArr3 = jArr2;
                    }
                    jArr = jArr3;
                    if (i4 != i3) {
                        return;
                    }
                } else {
                    jArr = jArr3;
                }
                if (i2 == length) {
                    return;
                }
                i2++;
                jArr3 = jArr;
            }
        }

        public final void updateTimer() {
            CustomStore customStore = this.flushSample;
            TouchRecord touchRecord = this.evictLayout;
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
                                touchRecord.invoke(objArr[(i << 3) + i3]);
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            customStore.peekRevision();
        }
    }

    public FocusSupervisor(TouchRecord touchRecord) {
        this.evictLayout = touchRecord;
    }

    public static final DpadBuilder connectJob(FocusSupervisor focusSupervisor, Object obj) {
        if (!focusSupervisor.applyTask) {
            synchronized (focusSupervisor.flushSample) {
                ActivityMutator activityMutator = focusSupervisor.popBlueprint;
                Intrinsics.checkNotNull(activityMutator);
                activityMutator.drawField(obj);
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            }
        }
        return DpadBuilder.evictLayout;
    }

    public static final DpadBuilder notifyMessage(FocusSupervisor focusSupervisor) {
        do {
            synchronized (focusSupervisor.flushSample) {
                try {
                    if (!focusSupervisor.injectMetric) {
                        focusSupervisor.injectMetric = true;
                        try {
                            PluginScheduler pluginScheduler = focusSupervisor.clipOrigin;
                            Object[] objArr = pluginScheduler.reduceScope;
                            int reduceScope = pluginScheduler.reduceScope();
                            for (int i = 0; i < reduceScope; i++) {
                                ((ActivityMutator) objArr[i]).updateTimer();
                            }
                            focusSupervisor.injectMetric = false;
                        } finally {
                        }
                    }
                    DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (focusSupervisor.applyTask());
        return DpadBuilder.evictLayout;
    }

    public static final DpadBuilder releaseHeader(FocusSupervisor focusSupervisor, Set set, ItemGovernor itemGovernor) {
        focusSupervisor.detachStream(set);
        if (focusSupervisor.applyTask()) {
            focusSupervisor.reduceScope();
        }
        return DpadBuilder.evictLayout;
    }

    public final boolean applyTask() {
        boolean z;
        synchronized (this.flushSample) {
            z = this.injectMetric;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            Set peekRevision = peekRevision();
            if (peekRevision == null) {
                return z2;
            }
            synchronized (this.flushSample) {
                try {
                    PluginScheduler pluginScheduler = this.clipOrigin;
                    Object[] objArr = pluginScheduler.reduceScope;
                    int reduceScope = pluginScheduler.reduceScope();
                    for (int i = 0; i < reduceScope; i++) {
                        if (!((ActivityMutator) objArr[i]).popBlueprint(peekRevision) && !z2) {
                            z2 = false;
                        }
                        z2 = true;
                    }
                    DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void attachConfig() {
        StackBlock stackBlock = this.updateTimer;
        if (stackBlock != null) {
            stackBlock.evictLayout();
        }
    }

    public final void clipOrigin() {
        synchronized (this.flushSample) {
            try {
                PluginScheduler pluginScheduler = this.clipOrigin;
                Object[] objArr = pluginScheduler.reduceScope;
                int reduceScope = pluginScheduler.reduceScope();
                for (int i = 0; i < reduceScope; i++) {
                    ((ActivityMutator) objArr[i]).injectMetric();
                }
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void connectPatch() {
        this.updateTimer = ItemGovernor.releaseHeader.updateTimer(this.detachStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void detachStream(Set set) {
        Object obj;
        Set refreshCounter;
        do {
            obj = this.growPayload.get();
            if (obj == null) {
                refreshCounter = set;
            } else if (obj instanceof Set) {
                refreshCounter = CursorBuilder.notifyMessage(obj, set);
            } else {
                if (!(obj instanceof List)) {
                    serializeOffset();
                    throw new ShadowBroadcaster();
                }
                refreshCounter = CursorCollector.refreshCounter((Collection) obj, DefaultBenchmark.releaseHeader(set));
            }
        } while (!RipplePipe.evictLayout(this.growPayload, obj, refreshCounter));
    }

    public final void drawField(Object obj, TouchRecord touchRecord, ElevationNode elevationNode) {
        ActivityMutator popBlueprint;
        synchronized (this.flushSample) {
            popBlueprint = popBlueprint(touchRecord);
        }
        boolean z = this.applyTask;
        ActivityMutator activityMutator = this.popBlueprint;
        long j = this.drawField;
        if (j != -1) {
            if (!(j == FlexFence.evictLayout())) {
                NotificationCoordinator.evictLayout("Detected multithreaded access to SnapshotStateObserver: previousThreadId=" + j + "), currentThread={id=" + FlexFence.evictLayout() + ", name=" + FlexFence.growPayload() + "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            }
        }
        try {
            this.applyTask = false;
            this.popBlueprint = popBlueprint;
            this.drawField = FlexFence.evictLayout();
            popBlueprint.applyTask(obj, this.releaseHeader, elevationNode);
        } finally {
            this.popBlueprint = activityMutator;
            this.applyTask = z;
            this.drawField = j;
        }
    }

    public final void flushSample(Object obj) {
        synchronized (this.flushSample) {
            try {
                PluginScheduler pluginScheduler = this.clipOrigin;
                int reduceScope = pluginScheduler.reduceScope();
                int i = 0;
                for (int i2 = 0; i2 < reduceScope; i2++) {
                    ActivityMutator activityMutator = (ActivityMutator) pluginScheduler.reduceScope[i2];
                    activityMutator.releaseHeader(obj);
                    if (!activityMutator.flushSample()) {
                        i++;
                    } else if (i > 0) {
                        Object[] objArr = pluginScheduler.reduceScope;
                        objArr[i2 - i] = objArr[i2];
                    }
                }
                int i3 = reduceScope - i;
                InsetsReader.inflateAdapter(pluginScheduler.reduceScope, null, i3, reduceScope);
                pluginScheduler.syncScope(i3);
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Set peekRevision() {
        Object obj;
        Object obj2;
        Set set;
        do {
            obj = this.growPayload.get();
            obj2 = null;
            if (obj == null) {
                return null;
            }
            if (obj instanceof Set) {
                set = (Set) obj;
            } else {
                if (!(obj instanceof List)) {
                    serializeOffset();
                    throw new ShadowBroadcaster();
                }
                List list = (List) obj;
                Set set2 = (Set) list.get(0);
                if (list.size() == 2) {
                    obj2 = list.get(1);
                } else if (list.size() > 2) {
                    obj2 = list.subList(1, list.size());
                }
                set = set2;
            }
        } while (!RipplePipe.evictLayout(this.growPayload, obj, obj2));
        return set;
    }

    public final ActivityMutator popBlueprint(TouchRecord touchRecord) {
        Object obj;
        PluginScheduler pluginScheduler = this.clipOrigin;
        Object[] objArr = pluginScheduler.reduceScope;
        int reduceScope = pluginScheduler.reduceScope();
        int i = 0;
        while (true) {
            if (i >= reduceScope) {
                obj = null;
                break;
            }
            obj = objArr[i];
            if (((ActivityMutator) obj).clipOrigin() == touchRecord) {
                break;
            }
            i++;
        }
        ActivityMutator activityMutator = (ActivityMutator) obj;
        if (activityMutator != null) {
            return activityMutator;
        }
        Intrinsics.checkNotNull(touchRecord, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
        ActivityMutator activityMutator2 = new ActivityMutator((TouchRecord) TypeIntrinsics.beforeCheckcastToFunctionOfArity(touchRecord, 1));
        this.clipOrigin.growPayload(activityMutator2);
        return activityMutator2;
    }

    public final void reduceScope() {
        this.evictLayout.invoke(new ElevationNode() { // from class: com.goldenboot.saga.zone.VibrationAllocator
            @Override // com.goldenboot.saga.zone.ElevationNode
            public final Object invoke() {
                DpadBuilder notifyMessage;
                notifyMessage = FocusSupervisor.notifyMessage(FocusSupervisor.this);
                return notifyMessage;
            }
        });
    }

    public final Void serializeOffset() {
        MorphPatch.purgeNode("Unexpected notification");
        throw new ShadowBroadcaster();
    }

    public final void updateTimer(TouchRecord touchRecord) {
        synchronized (this.flushSample) {
            try {
                PluginScheduler pluginScheduler = this.clipOrigin;
                int reduceScope = pluginScheduler.reduceScope();
                int i = 0;
                for (int i2 = 0; i2 < reduceScope; i2++) {
                    ActivityMutator activityMutator = (ActivityMutator) pluginScheduler.reduceScope[i2];
                    activityMutator.serializeOffset(touchRecord);
                    if (!activityMutator.flushSample()) {
                        i++;
                    } else if (i > 0) {
                        Object[] objArr = pluginScheduler.reduceScope;
                        objArr[i2 - i] = objArr[i2];
                    }
                }
                int i3 = reduceScope - i;
                InsetsReader.inflateAdapter(pluginScheduler.reduceScope, null, i3, reduceScope);
                pluginScheduler.syncScope(i3);
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
