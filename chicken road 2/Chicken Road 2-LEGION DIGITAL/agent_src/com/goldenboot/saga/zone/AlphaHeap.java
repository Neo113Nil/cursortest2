package com.goldenboot.saga.zone;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001/B\u001d\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0014¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u0014\u0010#\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u001c\u0010'\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010%0$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010&R\u0016\u0010(\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\"R\u0014\u0010*\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010)R\u0014\u0010,\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u0014\u0010.\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010)¨\u00060"}, d2 = {"Lcom/goldenboot/saga/zone/AlphaHeap;", "", "", "isDataDifferential", "Lcom/goldenboot/saga/zone/AlphaHeap$ActivityMutator;", "strategy", "<init>", "(ZLcom/goldenboot/saga/zone/AlphaHeap$ActivityMutator;)V", "(Z)V", "", "dataPoints", "time", "", "sampleCount", "", "growPayload", "([F[FI)F", "", "timeMillis", "dataPoint", "Lcom/goldenboot/saga/zone/DpadBuilder;", "evictLayout", "(JF)V", "injectMetric", "()F", "maximumVelocity", "detachStream", "(F)F", "clipOrigin", "()V", "Z", "releaseHeader", "()Z", "Lcom/goldenboot/saga/zone/AlphaHeap$ActivityMutator;", "I", "minSampleSize", "", "Lcom/goldenboot/saga/zone/DoubleTapRecovery;", "[Lcom/goldenboot/saga/zone/DoubleTapRecovery;", "samples", "index", "[F", "reusableDataPointsArray", "flushSample", "reusableTimeArray", "updateTimer", "reusableVelocityCoefficients", "ActivityMutator", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AlphaHeap {
    public static final int applyTask = 8;

    /* renamed from: clipOrigin, reason: from kotlin metadata */
    private final float[] reusableDataPointsArray;

    /* renamed from: detachStream, reason: from kotlin metadata */
    private final DataPointAtTime[] samples;

    /* renamed from: evictLayout, reason: from kotlin metadata */
    private final boolean isDataDifferential;

    /* renamed from: flushSample, reason: from kotlin metadata */
    private final float[] reusableTimeArray;

    /* renamed from: growPayload, reason: from kotlin metadata */
    private final ActivityMutator strategy;

    /* renamed from: injectMetric, reason: from kotlin metadata */
    private final int minSampleSize;

    /* renamed from: releaseHeader, reason: from kotlin metadata */
    private int index;

    /* renamed from: updateTimer, reason: from kotlin metadata */
    private final float[] reusableVelocityCoefficients;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/goldenboot/saga/zone/AlphaHeap$ActivityMutator;", "", "<init>", "(Ljava/lang/String;I)V", "reduceScope", "notifyMessage", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ActivityMutator {
        private static final /* synthetic */ ItemProcessor attachConfig;
        private static final /* synthetic */ ActivityMutator[] connectPatch;
        public static final ActivityMutator reduceScope = new ActivityMutator("Lsq2", 0);
        public static final ActivityMutator notifyMessage = new ActivityMutator("Impulse", 1);

        static {
            ActivityMutator[] evictLayout = evictLayout();
            connectPatch = evictLayout;
            attachConfig = TranslateConductor.evictLayout(evictLayout);
        }

        private ActivityMutator(String str, int i) {
        }

        private static final /* synthetic */ ActivityMutator[] evictLayout() {
            return new ActivityMutator[]{reduceScope, notifyMessage};
        }

        public static ItemProcessor releaseHeader() {
            return attachConfig;
        }

        public static ActivityMutator valueOf(String str) {
            return (ActivityMutator) Enum.valueOf(ActivityMutator.class, str);
        }

        public static ActivityMutator[] values() {
            return (ActivityMutator[]) connectPatch.clone();
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class BounceHandler {
        public static final /* synthetic */ int[] evictLayout;

        static {
            int[] iArr = new int[ActivityMutator.values().length];
            try {
                iArr[ActivityMutator.notifyMessage.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActivityMutator.reduceScope.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            evictLayout = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AlphaHeap() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    private final float growPayload(float[] dataPoints, float[] time, int sampleCount) {
        try {
            return InternalWork.connectPatch(time, dataPoints, sampleCount, 2, this.reusableVelocityCoefficients)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void clipOrigin() {
        InsetsReader.gatherAdapter(this.samples, null, 0, 0, 6, null);
        this.index = 0;
    }

    public final float detachStream(float maximumVelocity) {
        if (!(maximumVelocity > 0.0f)) {
            PagerBridge.applyTask("maximumVelocity should be a positive value. You specified=" + maximumVelocity);
        }
        float injectMetric = injectMetric();
        if (injectMetric == 0.0f || Float.isNaN(injectMetric)) {
            return 0.0f;
        }
        return injectMetric > 0.0f ? CellEntry.flushSample(injectMetric, maximumVelocity) : CellEntry.detachStream(injectMetric, -maximumVelocity);
    }

    public final void evictLayout(long timeMillis, float dataPoint) {
        int i = (this.index + 1) % 20;
        this.index = i;
        InternalWork.resetDelta(this.samples, i, timeMillis, dataPoint);
    }

    public final float injectMetric() {
        float updateTimer;
        float[] fArr = this.reusableDataPointsArray;
        float[] fArr2 = this.reusableTimeArray;
        int i = this.index;
        DataPointAtTime dataPointAtTime = this.samples[i];
        if (dataPointAtTime == null) {
            return 0.0f;
        }
        int i2 = 0;
        DataPointAtTime dataPointAtTime2 = dataPointAtTime;
        while (true) {
            DataPointAtTime dataPointAtTime3 = this.samples[i];
            if (dataPointAtTime3 != null) {
                float time = dataPointAtTime.getTime() - dataPointAtTime3.getTime();
                float abs = Math.abs(dataPointAtTime3.getTime() - dataPointAtTime2.getTime());
                DataPointAtTime dataPointAtTime4 = (this.strategy == ActivityMutator.reduceScope || this.isDataDifferential) ? dataPointAtTime3 : dataPointAtTime;
                if (time > 100.0f || abs > 40.0f) {
                    break;
                }
                fArr[i2] = dataPointAtTime3.releaseHeader();
                fArr2[i2] = -time;
                if (i == 0) {
                    i = 20;
                }
                i--;
                i2++;
                if (i2 >= 20) {
                    break;
                }
                dataPointAtTime2 = dataPointAtTime4;
            } else {
                break;
            }
        }
        if (i2 < this.minSampleSize) {
            return 0.0f;
        }
        int i3 = BounceHandler.evictLayout[this.strategy.ordinal()];
        if (i3 == 1) {
            updateTimer = InternalWork.updateTimer(fArr, fArr2, i2, this.isDataDifferential);
        } else {
            if (i3 != 2) {
                throw new EndpointArchive();
            }
            updateTimer = growPayload(fArr, fArr2, i2);
        }
        return updateTimer * 1000;
    }

    /* renamed from: releaseHeader, reason: from getter */
    public final boolean getIsDataDifferential() {
        return this.isDataDifferential;
    }

    public AlphaHeap(boolean z, ActivityMutator activityMutator) {
        this.isDataDifferential = z;
        this.strategy = activityMutator;
        if (z && activityMutator.equals(ActivityMutator.reduceScope)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i = BounceHandler.evictLayout[activityMutator.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                throw new EndpointArchive();
            }
            i2 = 3;
        }
        this.minSampleSize = i2;
        this.samples = new DataPointAtTime[20];
        this.reusableDataPointsArray = new float[20];
        this.reusableTimeArray = new float[20];
        this.reusableVelocityCoefficients = new float[3];
    }

    public /* synthetic */ AlphaHeap(boolean z, ActivityMutator activityMutator, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? ActivityMutator.reduceScope : activityMutator);
    }

    public AlphaHeap(boolean z) {
        this(z, ActivityMutator.notifyMessage);
    }
}
