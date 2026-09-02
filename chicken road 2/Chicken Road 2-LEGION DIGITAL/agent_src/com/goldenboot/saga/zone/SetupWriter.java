package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.ItemGovernor;
import com.goldenboot.saga.zone.VibrationEvent;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class SetupWriter extends ProducerActivator implements VibrationEvent {
    public ActivityMutator attachConfig = new ActivityMutator(WaveBenchmark.dispatchTimezone().applyTask());
    public final BounceFacilitator connectPatch;
    public final ElevationNode notifyMessage;

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class ActivityMutator extends ScopedFormer implements VibrationEvent.ActivityMutator {
        public Object clipOrigin;
        public int detachStream;
        public int flushSample;
        public long injectMetric;
        public SessionRegistry releaseHeader;
        public static final C0155ActivityMutator updateTimer = new C0155ActivityMutator(null);
        public static final int applyTask = 8;
        public static final Object popBlueprint = new Object();

        /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
        /* renamed from: com.goldenboot.saga.zone.SetupWriter$ActivityMutator$ActivityMutator, reason: collision with other inner class name */
        public static final class C0155ActivityMutator {
            public /* synthetic */ C0155ActivityMutator(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Object evictLayout() {
                return ActivityMutator.popBlueprint;
            }

            public C0155ActivityMutator() {
            }
        }

        public ActivityMutator(long j) {
            super(j);
            this.releaseHeader = StartupSequence.evictLayout();
            this.clipOrigin = popBlueprint;
        }

        public final int connectJob(VibrationEvent vibrationEvent, ItemGovernor itemGovernor) {
            SessionRegistry growPayload;
            int i;
            int i2;
            int i3;
            int i4;
            synchronized (WaveBenchmark.mapJob()) {
                growPayload = growPayload();
            }
            int i5 = 7;
            if (!growPayload.updateTimer()) {
                return 7;
            }
            PluginScheduler injectMetric = BounceReader.injectMetric();
            Object[] objArr = injectMetric.reduceScope;
            int reduceScope = injectMetric.reduceScope();
            for (int i6 = 0; i6 < reduceScope; i6++) {
                ((AlarmInteractor) objArr[i6]).evictLayout(vibrationEvent);
            }
            try {
                Object[] objArr2 = growPayload.growPayload;
                int[] iArr = growPayload.injectMetric;
                long[] jArr = growPayload.evictLayout;
                int length = jArr.length - 2;
                if (length >= 0) {
                    i = 7;
                    int i7 = 0;
                    while (true) {
                        long j = jArr[i7];
                        if ((((~j) << i5) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8;
                            int i9 = 8 - ((~(i7 - length)) >>> 31);
                            int i10 = 0;
                            while (i10 < i9) {
                                if ((j & 255) < 128) {
                                    int i11 = (i7 << 3) + i10;
                                    i3 = i5;
                                    BorderHook borderHook = (BorderHook) objArr2[i11];
                                    i4 = i8;
                                    if (iArr[i11] == 1) {
                                        ScopedFormer purgeNode = borderHook instanceof SetupWriter ? ((SetupWriter) borderHook).purgeNode(itemGovernor) : WaveBenchmark.bindBody(borderHook.releaseHeader(), itemGovernor);
                                        i = (((i * 31) + HoverPresenter.evictLayout(purgeNode)) * 31) + Long.hashCode(purgeNode.clipOrigin());
                                    }
                                } else {
                                    i3 = i5;
                                    i4 = i8;
                                }
                                j >>= i4;
                                i10++;
                                i5 = i3;
                                i8 = i4;
                            }
                            i2 = i5;
                            if (i9 != i8) {
                                break;
                            }
                        } else {
                            i2 = i5;
                        }
                        if (i7 == length) {
                            i5 = i;
                            break;
                        }
                        i7++;
                        i5 = i2;
                    }
                }
                i = i5;
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
                Object[] objArr3 = injectMetric.reduceScope;
                int reduceScope2 = injectMetric.reduceScope();
                for (int i12 = 0; i12 < reduceScope2; i12++) {
                    ((AlarmInteractor) objArr3[i12]).growPayload(vibrationEvent);
                }
                return i;
            } catch (Throwable th) {
                Object[] objArr4 = injectMetric.reduceScope;
                int reduceScope3 = injectMetric.reduceScope();
                for (int i13 = 0; i13 < reduceScope3; i13++) {
                    ((AlarmInteractor) objArr4[i13]).growPayload(vibrationEvent);
                }
                throw th;
            }
        }

        public final void connectPatch(int i) {
            this.detachStream = i;
        }

        @Override // com.goldenboot.saga.zone.ScopedFormer
        public ScopedFormer detachStream(long j) {
            return new ActivityMutator(j);
        }

        public final boolean drawField(VibrationEvent vibrationEvent, ItemGovernor itemGovernor) {
            boolean z;
            boolean z2;
            synchronized (WaveBenchmark.mapJob()) {
                z = true;
                if (this.injectMetric == itemGovernor.applyTask()) {
                    if (this.detachStream == itemGovernor.popBlueprint()) {
                        z2 = false;
                    }
                }
                z2 = true;
            }
            if (this.clipOrigin == popBlueprint || (z2 && this.flushSample != connectJob(vibrationEvent, itemGovernor))) {
                z = false;
            }
            if (!z || !z2) {
                return z;
            }
            synchronized (WaveBenchmark.mapJob()) {
                this.injectMetric = itemGovernor.applyTask();
                this.detachStream = itemGovernor.popBlueprint();
                DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
            }
            return z;
        }

        @Override // com.goldenboot.saga.zone.VibrationEvent.ActivityMutator
        public Object evictLayout() {
            return this.clipOrigin;
        }

        @Override // com.goldenboot.saga.zone.VibrationEvent.ActivityMutator
        public SessionRegistry growPayload() {
            return this.releaseHeader;
        }

        @Override // com.goldenboot.saga.zone.ScopedFormer
        public void injectMetric(ScopedFormer scopedFormer) {
            Intrinsics.checkNotNull(scopedFormer, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState.ResultRecord>");
            ActivityMutator activityMutator = (ActivityMutator) scopedFormer;
            peekRevision(activityMutator.growPayload());
            this.clipOrigin = activityMutator.clipOrigin;
            this.flushSample = activityMutator.flushSample;
        }

        public final void notifyMessage(long j) {
            this.injectMetric = j;
        }

        public void peekRevision(SessionRegistry sessionRegistry) {
            this.releaseHeader = sessionRegistry;
        }

        public final Object popBlueprint() {
            return this.clipOrigin;
        }

        public final void reduceScope(int i) {
            this.flushSample = i;
        }

        public final void serializeOffset(Object obj) {
            this.clipOrigin = obj;
        }
    }

    public SetupWriter(ElevationNode elevationNode, BounceFacilitator bounceFacilitator) {
        this.notifyMessage = elevationNode;
        this.connectPatch = bounceFacilitator;
    }

    public static final DpadBuilder gatherAdapter(SetupWriter setupWriter, PrimaryFence primaryFence, ApplicationHook applicationHook, int i, Object obj) {
        if (obj == setupWriter) {
            throw new IllegalStateException("A derived state calculation cannot read itself");
        }
        if (obj instanceof BorderHook) {
            applicationHook.purgeNode(obj, Math.min(primaryFence.evictLayout() - i, applicationHook.releaseHeader(obj, Integer.MAX_VALUE)));
        }
        return DpadBuilder.evictLayout;
    }

    @Override // com.goldenboot.saga.zone.BorderHook
    public void applyTask(ScopedFormer scopedFormer) {
        Intrinsics.checkNotNull(scopedFormer, "null cannot be cast to non-null type androidx.compose.runtime.DerivedSnapshotState.ResultRecord<T of androidx.compose.runtime.DerivedSnapshotState>");
        this.attachConfig = (ActivityMutator) scopedFormer;
    }

    public final String decodePath() {
        ActivityMutator activityMutator = (ActivityMutator) WaveBenchmark.unlockMessage(this.attachConfig);
        return activityMutator.drawField(this, ItemGovernor.releaseHeader.injectMetric()) ? String.valueOf(activityMutator.popBlueprint()) : "<Not calculated>";
    }

    public final ActivityMutator drawRequest(ActivityMutator activityMutator, ItemGovernor itemGovernor, boolean z, ElevationNode elevationNode) {
        NativeSyncer nativeSyncer;
        ItemGovernor.ActivityMutator activityMutator2;
        NativeSyncer nativeSyncer2;
        BounceFacilitator injectMetric;
        NativeSyncer nativeSyncer3;
        NativeSyncer nativeSyncer4;
        int i;
        NativeSyncer nativeSyncer5;
        ActivityMutator activityMutator3 = activityMutator;
        int i2 = 0;
        if (!activityMutator3.drawField(this, itemGovernor)) {
            final ApplicationHook applicationHook = new ApplicationHook(0, 1, null);
            nativeSyncer = ThemeReceiver.evictLayout;
            final PrimaryFence primaryFence = (PrimaryFence) nativeSyncer.evictLayout();
            if (primaryFence == null) {
                primaryFence = new PrimaryFence(0);
                nativeSyncer3 = ThemeReceiver.evictLayout;
                nativeSyncer3.growPayload(primaryFence);
            }
            final int evictLayout = primaryFence.evictLayout();
            PluginScheduler injectMetric2 = BounceReader.injectMetric();
            Object[] objArr = injectMetric2.reduceScope;
            int reduceScope = injectMetric2.reduceScope();
            for (int i3 = 0; i3 < reduceScope; i3++) {
                ((AlarmInteractor) objArr[i3]).evictLayout(this);
            }
            try {
                primaryFence.growPayload(evictLayout + 1);
                Object flushSample = ItemGovernor.releaseHeader.flushSample(new TouchRecord() { // from class: com.goldenboot.saga.zone.ConsumerHub
                    @Override // com.goldenboot.saga.zone.TouchRecord
                    public final Object invoke(Object obj) {
                        DpadBuilder gatherAdapter;
                        gatherAdapter = SetupWriter.gatherAdapter(SetupWriter.this, primaryFence, applicationHook, evictLayout, obj);
                        return gatherAdapter;
                    }
                }, null, elevationNode);
                primaryFence.growPayload(evictLayout);
                Object[] objArr2 = injectMetric2.reduceScope;
                int reduceScope2 = injectMetric2.reduceScope();
                for (int i4 = 0; i4 < reduceScope2; i4++) {
                    ((AlarmInteractor) objArr2[i4]).growPayload(this);
                }
                synchronized (WaveBenchmark.mapJob()) {
                    try {
                        activityMutator2 = ItemGovernor.releaseHeader;
                        ItemGovernor injectMetric3 = activityMutator2.injectMetric();
                        if (activityMutator3.popBlueprint() == ActivityMutator.updateTimer.evictLayout() || (injectMetric = injectMetric()) == null || !injectMetric.evictLayout(flushSample, activityMutator3.popBlueprint())) {
                            activityMutator3 = (ActivityMutator) WaveBenchmark.resumeSignature(this.attachConfig, this, injectMetric3);
                            activityMutator3.peekRevision(applicationHook);
                            activityMutator3.reduceScope(activityMutator3.connectJob(this, injectMetric3));
                            activityMutator3.serializeOffset(flushSample);
                        } else {
                            activityMutator3.peekRevision(applicationHook);
                            activityMutator3.reduceScope(activityMutator3.connectJob(this, injectMetric3));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                nativeSyncer2 = ThemeReceiver.evictLayout;
                PrimaryFence primaryFence2 = (PrimaryFence) nativeSyncer2.evictLayout();
                if (primaryFence2 == null || primaryFence2.evictLayout() != 0) {
                    return activityMutator3;
                }
                activityMutator2.clipOrigin();
                synchronized (WaveBenchmark.mapJob()) {
                    ItemGovernor injectMetric4 = activityMutator2.injectMetric();
                    activityMutator3.notifyMessage(injectMetric4.applyTask());
                    activityMutator3.connectPatch(injectMetric4.popBlueprint());
                    DpadBuilder dpadBuilder = DpadBuilder.evictLayout;
                }
                return activityMutator3;
            } catch (Throwable th2) {
                Object[] objArr3 = injectMetric2.reduceScope;
                int reduceScope3 = injectMetric2.reduceScope();
                for (int i5 = 0; i5 < reduceScope3; i5++) {
                    ((AlarmInteractor) objArr3[i5]).growPayload(this);
                }
                throw th2;
            }
        }
        if (z) {
            PluginScheduler injectMetric5 = BounceReader.injectMetric();
            Object[] objArr4 = injectMetric5.reduceScope;
            int reduceScope4 = injectMetric5.reduceScope();
            for (int i6 = 0; i6 < reduceScope4; i6++) {
                ((AlarmInteractor) objArr4[i6]).evictLayout(this);
            }
            try {
                SessionRegistry growPayload = activityMutator3.growPayload();
                nativeSyncer4 = ThemeReceiver.evictLayout;
                PrimaryFence primaryFence3 = (PrimaryFence) nativeSyncer4.evictLayout();
                if (primaryFence3 == null) {
                    primaryFence3 = new PrimaryFence(0);
                    nativeSyncer5 = ThemeReceiver.evictLayout;
                    nativeSyncer5.growPayload(primaryFence3);
                }
                int evictLayout2 = primaryFence3.evictLayout();
                Object[] objArr5 = growPayload.growPayload;
                int[] iArr = growPayload.injectMetric;
                long[] jArr = growPayload.evictLayout;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j = jArr[i7];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8;
                            int i9 = 8 - ((~(i7 - length)) >>> 31);
                            while (i2 < i9) {
                                if ((j & 255) < 128) {
                                    int i10 = (i7 << 3) + i2;
                                    i = i8;
                                    BorderHook borderHook = (BorderHook) objArr5[i10];
                                    primaryFence3.growPayload(evictLayout2 + iArr[i10]);
                                    TouchRecord flushSample2 = itemGovernor.flushSample();
                                    if (flushSample2 != null) {
                                        flushSample2.invoke(borderHook);
                                    }
                                } else {
                                    i = i8;
                                }
                                j >>= i;
                                i2++;
                                i8 = i;
                            }
                            if (i9 != i8) {
                                break;
                            }
                        }
                        if (i7 == length) {
                            break;
                        }
                        i7++;
                        i2 = 0;
                    }
                }
                primaryFence3.growPayload(evictLayout2);
                DpadBuilder dpadBuilder2 = DpadBuilder.evictLayout;
                Object[] objArr6 = injectMetric5.reduceScope;
                int reduceScope5 = injectMetric5.reduceScope();
                for (int i11 = 0; i11 < reduceScope5; i11++) {
                    ((AlarmInteractor) objArr6[i11]).growPayload(this);
                }
            } catch (Throwable th3) {
                Object[] objArr7 = injectMetric5.reduceScope;
                int reduceScope6 = injectMetric5.reduceScope();
                for (int i12 = 0; i12 < reduceScope6; i12++) {
                    ((AlarmInteractor) objArr7[i12]).growPayload(this);
                }
                throw th3;
            }
        }
        return activityMutator3;
    }

    @Override // com.goldenboot.saga.zone.MorphCreator
    public Object getValue() {
        ItemGovernor.ActivityMutator activityMutator = ItemGovernor.releaseHeader;
        TouchRecord flushSample = activityMutator.injectMetric().flushSample();
        if (flushSample != null) {
            flushSample.invoke(this);
        }
        ItemGovernor injectMetric = activityMutator.injectMetric();
        return drawRequest((ActivityMutator) WaveBenchmark.bindBody(this.attachConfig, injectMetric), injectMetric, true, this.notifyMessage).popBlueprint();
    }

    @Override // com.goldenboot.saga.zone.VibrationEvent
    public BounceFacilitator injectMetric() {
        return this.connectPatch;
    }

    public final ScopedFormer purgeNode(ItemGovernor itemGovernor) {
        return drawRequest((ActivityMutator) WaveBenchmark.bindBody(this.attachConfig, itemGovernor), itemGovernor, false, this.notifyMessage);
    }

    @Override // com.goldenboot.saga.zone.VibrationEvent
    public VibrationEvent.ActivityMutator reduceScope() {
        ItemGovernor injectMetric = ItemGovernor.releaseHeader.injectMetric();
        return drawRequest((ActivityMutator) WaveBenchmark.bindBody(this.attachConfig, injectMetric), injectMetric, false, this.notifyMessage);
    }

    @Override // com.goldenboot.saga.zone.BorderHook
    public ScopedFormer releaseHeader() {
        return this.attachConfig;
    }

    public String toString() {
        return "DerivedState(value=" + decodePath() + ")@" + hashCode();
    }
}
