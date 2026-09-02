package com.goldenboot.saga.zone;

import com.goldenboot.saga.zone.MenuImpl;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public abstract class CoreTranslator extends SwipeBatch {
    public ContainerBridge evictLayout;
    public boolean growPayload;
    public static final Logger injectMetric = Logger.getLogger(CoreTranslator.class.getName());
    public static final boolean detachStream = SpacerBroadcaster.injectConstraint();

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static abstract class BounceHandler extends CoreTranslator {
        public final int clipOrigin;
        public int flushSample;
        public final byte[] releaseHeader;
        public int updateTimer;

        public BounceHandler(int i) {
            super();
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            byte[] bArr = new byte[Math.max(i, 20)];
            this.releaseHeader = bArr;
            this.clipOrigin = bArr.length;
        }

        public final void closeComponent(int i) {
            if (i >= 0) {
                trimState(i);
            } else {
                escapeBounds(i);
            }
        }

        public final void closeSource(long j) {
            byte[] bArr = this.releaseHeader;
            int i = this.flushSample;
            int i2 = i + 1;
            this.flushSample = i2;
            bArr[i] = (byte) (j & 255);
            int i3 = i + 2;
            this.flushSample = i3;
            bArr[i2] = (byte) ((j >> 8) & 255);
            int i4 = i + 3;
            this.flushSample = i4;
            bArr[i3] = (byte) ((j >> 16) & 255);
            int i5 = i + 4;
            this.flushSample = i5;
            bArr[i4] = (byte) (255 & (j >> 24));
            int i6 = i + 5;
            this.flushSample = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & LayoutMap.flushSample);
            int i7 = i + 6;
            this.flushSample = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & LayoutMap.flushSample);
            int i8 = i + 7;
            this.flushSample = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & LayoutMap.flushSample);
            this.flushSample = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & LayoutMap.flushSample);
            this.updateTimer += 8;
        }

        public final void escapeBounds(long j) {
            if (!CoreTranslator.detachStream) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.releaseHeader;
                    int i = this.flushSample;
                    this.flushSample = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | ContentOperation.SpotShadowColor);
                    this.updateTimer++;
                    j >>>= 7;
                }
                byte[] bArr2 = this.releaseHeader;
                int i2 = this.flushSample;
                this.flushSample = i2 + 1;
                bArr2[i2] = (byte) j;
                this.updateTimer++;
                return;
            }
            long j2 = this.flushSample;
            while ((j & (-128)) != 0) {
                byte[] bArr3 = this.releaseHeader;
                int i3 = this.flushSample;
                this.flushSample = i3 + 1;
                SpacerBroadcaster.unlockMessage(bArr3, i3, (byte) ((((int) j) & 127) | ContentOperation.SpotShadowColor));
                j >>>= 7;
            }
            byte[] bArr4 = this.releaseHeader;
            int i4 = this.flushSample;
            this.flushSample = i4 + 1;
            SpacerBroadcaster.unlockMessage(bArr4, i4, (byte) j);
            this.updateTimer += (int) (this.flushSample - j2);
        }

        public final void observeNode(int i, int i2) {
            trimState(TransitionRestore.injectMetric(i, i2));
        }

        public final void prependArchive(byte b) {
            byte[] bArr = this.releaseHeader;
            int i = this.flushSample;
            this.flushSample = i + 1;
            bArr[i] = b;
            this.updateTimer++;
        }

        public final void trimCallback(int i) {
            byte[] bArr = this.releaseHeader;
            int i2 = this.flushSample;
            int i3 = i2 + 1;
            this.flushSample = i3;
            bArr[i2] = (byte) (i & LayoutMap.flushSample);
            int i4 = i2 + 2;
            this.flushSample = i4;
            bArr[i3] = (byte) ((i >> 8) & LayoutMap.flushSample);
            int i5 = i2 + 3;
            this.flushSample = i5;
            bArr[i4] = (byte) ((i >> 16) & LayoutMap.flushSample);
            this.flushSample = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & LayoutMap.flushSample);
            this.updateTimer += 4;
        }

        public final void trimState(int i) {
            if (!CoreTranslator.detachStream) {
                while ((i & (-128)) != 0) {
                    byte[] bArr = this.releaseHeader;
                    int i2 = this.flushSample;
                    this.flushSample = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | ContentOperation.SpotShadowColor);
                    this.updateTimer++;
                    i >>>= 7;
                }
                byte[] bArr2 = this.releaseHeader;
                int i3 = this.flushSample;
                this.flushSample = i3 + 1;
                bArr2[i3] = (byte) i;
                this.updateTimer++;
                return;
            }
            long j = this.flushSample;
            while ((i & (-128)) != 0) {
                byte[] bArr3 = this.releaseHeader;
                int i4 = this.flushSample;
                this.flushSample = i4 + 1;
                SpacerBroadcaster.unlockMessage(bArr3, i4, (byte) ((i & 127) | ContentOperation.SpotShadowColor));
                i >>>= 7;
            }
            byte[] bArr4 = this.releaseHeader;
            int i5 = this.flushSample;
            this.flushSample = i5 + 1;
            SpacerBroadcaster.unlockMessage(bArr4, i5, (byte) i);
            this.updateTimer += (int) (this.flushSample - j);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static class FeedbackFlow extends IOException {
        public FeedbackFlow(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    /* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
    public static final class LayerUseCase extends BounceHandler {
        public final OutputStream applyTask;

        public LayerUseCase(OutputStream outputStream, int i) {
            super(i);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.applyTask = outputStream;
        }

        @Override // com.goldenboot.saga.zone.CoreTranslator
        public void appendEvent(GlowFormatter glowFormatter) {
            unwrapRecord(glowFormatter.growPayload());
            glowFormatter.injectMetric(this);
        }

        @Override // com.goldenboot.saga.zone.CoreTranslator
        public void compressBody(int i, long j) {
            queryDescriptor(20);
            observeNode(i, 0);
            escapeBounds(j);
        }

        @Override // com.goldenboot.saga.zone.CoreTranslator
        public void compressVersion(int i) {
            queryDescriptor(4);
            trimCallback(i);
        }

        @Override // com.goldenboot.saga.zone.CoreTranslator
        public void computeTarget(byte[] bArr, int i, int i2) {
            unwrapRecord(i2);
            transformCount(bArr, i, i2);
        }

        @Override // com.goldenboot.saga.zone.CoreTranslator
        public void emitStrategy(AbstractBucket abstractBucket) {
            unwrapRecord(abstractBucket.size());
            abstractBucket.storeCharset(this);
        }

        @Override // com.goldenboot.saga.zone.CoreTranslator, com.goldenboot.saga.zone.SwipeBatch
        public void evictLayout(byte[] bArr, int i, int i2) {
            transformCount(bArr, i, i2);
        }

        public void evictOrigin(GlowFormatter glowFormatter, ColorRestore colorRestore) {
            unwrapRecord(((AlarmCreator) glowFormatter).flushSample(colorRestore));
            colorRestore.detachStream(glowFormatter, this.evictLayout);
        }

        @Override // com.goldenboot.saga.zone.CoreTranslator
        public void executeConfig(int i, GlowFormatter glowFormatter) {
            sortSnapshot(1, 3);
            protectChannel(2, i);
            updateRule(3, glowFormatter);
            sortSnapshot(1, 4);
        }

        @Override // com.goldenboot.saga.zone.CoreTranslator
        public void expandScope(int i, int i2) {
            queryDescriptor(20);
            observeNode(i, 0);
            closeComponent(i2);
        }

        @Override // com.goldenboot.saga.zone.CoreTranslator
        public void flattenToken(int i, String str) {
            sortSnapshot(i, 2);
            prepareCount(str);
        }

        @Override // com.goldenboot.saga.zone.CoreTranslator
        public void formatMessage(int i) {
            if (i >= 0) {
                unwrapRecord(i);
            } else {
                measureEndpoint(i);
            }
        }

        @Override // com.goldenboot.saga.zone.CoreTranslator
        public void loadItem(int i, AbstractBucket abstractBucket) {
            sortSnapshot(1, 3);
            protectChannel(2, i);
            locateSignal(3, abstractBucket);
            sortSnapshot(1, 4);
        }

        @Override // com.goldenboot.saga.zone.CoreTranslator
        public void locateSignal(int i, AbstractBucket abstractBucket) {
            sortSnapshot(i, 2);
            emitStrategy(abstractBucket);
        }

        @Override // com.goldenboot.saga.zone.CoreTranslator
        public void measureEndpoint(long j) {
            queryDescriptor(10);
            escapeBounds(j);
        }

        public final void openJob() {
            this.applyTask.write(this.releaseHeader, 0, this.flushSample);
            this.flushSample = 0;
        }

        @Override // com.goldenboot.saga.zone.CoreTranslator
        public void prepareCount(String str) {
            int flushSample;
            try {
                int length = str.length() * 3;
                int prepareTask = CoreTranslator.prepareTask(length);
                int i = prepareTask + length;
                int i2 = this.clipOrigin;
                if (i > i2) {
                    byte[] bArr = new byte[length];
                    int clipOrigin = MenuImpl.clipOrigin(str, bArr, 0, length);
                    unwrapRecord(clipOrigin);
                    evictLayout(bArr, 0, clipOrigin);
                    return;
                }
                if (i > i2 - this.flushSample) {
                    openJob();
                }
                int prepareTask2 = CoreTranslator.prepareTask(str.length());
                int i3 = this.flushSample;
                try {
                    if (prepareTask2 == prepareTask) {
                        int i4 = i3 + prepareTask2;
                        this.flushSample = i4;
                        int clipOrigin2 = MenuImpl.clipOrigin(str, this.releaseHeader, i4, this.clipOrigin - i4);
                        this.flushSample = i3;
                        flushSample = (clipOrigin2 - i3) - prepareTask2;
                        trimState(flushSample);
                        this.flushSample = clipOrigin2;
                    } else {
                        flushSample = MenuImpl.flushSample(str);
                        trimState(flushSample);
                        this.flushSample = MenuImpl.clipOrigin(str, this.releaseHeader, this.flushSample, flushSample);
                    }
                    this.updateTimer += flushSample;
                } catch (MenuImpl.LayerUseCase e) {
                    this.updateTimer -= this.flushSample - i3;
                    this.flushSample = i3;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new FeedbackFlow(e2);
                }
            } catch (MenuImpl.LayerUseCase e3) {
                groupArchive(str, e3);
            }
        }

        @Override // com.goldenboot.saga.zone.CoreTranslator
        public void protectChannel(int i, int i2) {
            queryDescriptor(20);
            observeNode(i, 0);
            trimState(i2);
        }

        public final void queryDescriptor(int i) {
            if (this.clipOrigin - this.flushSample < i) {
                openJob();
            }
        }

        @Override // com.goldenboot.saga.zone.CoreTranslator
        public void refreshCounter(int i, int i2) {
            queryDescriptor(14);
            observeNode(i, 5);
            trimCallback(i2);
        }

        @Override // com.goldenboot.saga.zone.CoreTranslator
        public void resetValue(byte b) {
            if (this.flushSample == this.clipOrigin) {
                openJob();
            }
            prependArchive(b);
        }

        @Override // com.goldenboot.saga.zone.CoreTranslator
        public void resumeSignature() {
            if (this.flushSample > 0) {
                openJob();
            }
        }

        @Override // com.goldenboot.saga.zone.CoreTranslator
        public void serializeTask(int i, boolean z) {
            queryDescriptor(11);
            observeNode(i, 0);
            prependArchive(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.goldenboot.saga.zone.CoreTranslator
        public void sortSnapshot(int i, int i2) {
            unwrapRecord(TransitionRestore.injectMetric(i, i2));
        }

        @Override // com.goldenboot.saga.zone.CoreTranslator
        public void subscribeEvent(int i, GlowFormatter glowFormatter, ColorRestore colorRestore) {
            sortSnapshot(i, 2);
            evictOrigin(glowFormatter, colorRestore);
        }

        public void transformCount(byte[] bArr, int i, int i2) {
            int i3 = this.clipOrigin;
            int i4 = this.flushSample;
            if (i3 - i4 >= i2) {
                System.arraycopy(bArr, i, this.releaseHeader, i4, i2);
                this.flushSample += i2;
                this.updateTimer += i2;
                return;
            }
            int i5 = i3 - i4;
            System.arraycopy(bArr, i, this.releaseHeader, i4, i5);
            int i6 = i + i5;
            int i7 = i2 - i5;
            this.flushSample = this.clipOrigin;
            this.updateTimer += i5;
            openJob();
            if (i7 <= this.clipOrigin) {
                System.arraycopy(bArr, i6, this.releaseHeader, 0, i7);
                this.flushSample = i7;
            } else {
                this.applyTask.write(bArr, i6, i7);
            }
            this.updateTimer += i7;
        }

        @Override // com.goldenboot.saga.zone.CoreTranslator
        public void transformCurrency(int i, long j) {
            queryDescriptor(18);
            observeNode(i, 1);
            closeSource(j);
        }

        @Override // com.goldenboot.saga.zone.CoreTranslator
        public void unwrapRecord(int i) {
            queryDescriptor(5);
            trimState(i);
        }

        public void updateRule(int i, GlowFormatter glowFormatter) {
            sortSnapshot(i, 2);
            appendEvent(glowFormatter);
        }

        @Override // com.goldenboot.saga.zone.CoreTranslator
        public void validateOffset(long j) {
            queryDescriptor(8);
            closeSource(j);
        }
    }

    public static int applyTask(double d) {
        return 8;
    }

    public static int attachCallback(int i, int i2) {
        return mapJob(i) + prepareTask(i2);
    }

    public static int attachConfig(int i, GlowFormatter glowFormatter, ColorRestore colorRestore) {
        return (mapJob(i) * 2) + inflateAdapter(glowFormatter, colorRestore);
    }

    public static int bindBody(long j) {
        return connectComponent(formatPosition(j));
    }

    public static int clipOrigin(int i, AbstractBucket abstractBucket) {
        return mapJob(i) + flushSample(abstractBucket);
    }

    public static int connectComponent(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int connectJob(int i, int i2) {
        return mapJob(i) + peekRevision(i2);
    }

    public static int connectPatch(float f) {
        return 4;
    }

    public static int decodePath(long j) {
        return connectComponent(j);
    }

    public static int detachStream(boolean z) {
        return 1;
    }

    public static int dispatchTimezone(int i, String str) {
        return mapJob(i) + parseAsset(str);
    }

    public static int drawField(int i) {
        return drawRequest(i);
    }

    public static int drawRequest(int i) {
        if (i >= 0) {
            return prepareTask(i);
        }
        return 10;
    }

    public static int drawScope(int i) {
        return prepareTask(i) + i;
    }

    public static int expandArgs(int i, GlowFormatter glowFormatter, ColorRestore colorRestore) {
        return mapJob(i) + mergeLocale(glowFormatter, colorRestore);
    }

    public static int filterPayload(int i, long j) {
        return mapJob(i) + inflateEdge(j);
    }

    public static int findTask(GlowFormatter glowFormatter) {
        return drawScope(glowFormatter.growPayload());
    }

    public static int flattenPackage(int i, AbstractBucket abstractBucket) {
        return (mapJob(1) * 2) + attachCallback(2, i) + clipOrigin(3, abstractBucket);
    }

    public static int flushSample(AbstractBucket abstractBucket) {
        return drawScope(abstractBucket.size());
    }

    public static long formatPosition(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int gatherAdapter(int i, long j) {
        return mapJob(i) + decodePath(j);
    }

    public static int inflateAdapter(GlowFormatter glowFormatter, ColorRestore colorRestore) {
        return ((AlarmCreator) glowFormatter).flushSample(colorRestore);
    }

    public static int inflateEdge(long j) {
        return 8;
    }

    public static int injectConstraint(int i, int i2) {
        return mapJob(i) + storeCharset(i2);
    }

    public static int injectMetric(int i, boolean z) {
        return mapJob(i) + detachStream(z);
    }

    public static int mapJob(int i) {
        return prepareTask(TransitionRestore.injectMetric(i, 0));
    }

    public static int mergeLocale(GlowFormatter glowFormatter, ColorRestore colorRestore) {
        return drawScope(((AlarmCreator) glowFormatter).flushSample(colorRestore));
    }

    public static int notifyMessage(int i, float f) {
        return mapJob(i) + connectPatch(f);
    }

    public static int packPackage(int i) {
        return prepareTask(startResource(i));
    }

    public static int parseAsset(String str) {
        int length;
        try {
            length = MenuImpl.flushSample(str);
        } catch (MenuImpl.LayerUseCase unused) {
            length = str.getBytes(ProxyTask.growPayload).length;
        }
        return drawScope(length);
    }

    public static int peekRevision(int i) {
        return 4;
    }

    public static int popBlueprint(int i, int i2) {
        return mapJob(i) + drawField(i2);
    }

    public static int prepareTask(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int purgeNode(int i, int i2) {
        return mapJob(i) + drawRequest(i2);
    }

    public static int queryModel(int i, int i2) {
        return mapJob(i) + packPackage(i2);
    }

    public static int reduceScope(long j) {
        return 8;
    }

    public static int releaseHeader(byte[] bArr) {
        return drawScope(bArr.length);
    }

    public static int resetDelta(GlowFormatter glowFormatter) {
        return glowFormatter.growPayload();
    }

    public static CoreTranslator resolveDelta(OutputStream outputStream, int i) {
        return new LayerUseCase(outputStream, i);
    }

    public static int serializeOffset(int i, long j) {
        return mapJob(i) + reduceScope(j);
    }

    public static int startResource(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public static int storeCharset(int i) {
        return 4;
    }

    public static int syncScope(int i) {
        return i > 4096 ? ContentOperation.TransformOrigin : i;
    }

    public static int unlockMessage(int i, long j) {
        return mapJob(i) + bindBody(j);
    }

    public static int updateAction(int i, long j) {
        return mapJob(i) + connectComponent(j);
    }

    public static int updateTimer(int i, double d) {
        return mapJob(i) + applyTask(d);
    }

    public final void acquireArchive(int i) {
        compressVersion(i);
    }

    public final void acquireAsset(long j) {
        measureEndpoint(formatPosition(j));
    }

    public abstract void appendEvent(GlowFormatter glowFormatter);

    public final void appendKey(byte[] bArr) {
        computeTarget(bArr, 0, bArr.length);
    }

    public boolean cancelArchive() {
        return this.growPayload;
    }

    public final void closePayload(GlowFormatter glowFormatter, ColorRestore colorRestore) {
        colorRestore.detachStream(glowFormatter, this.evictLayout);
    }

    public final void commitBounds(GlowFormatter glowFormatter) {
        glowFormatter.injectMetric(this);
    }

    public final void commitKey(long j) {
        measureEndpoint(j);
    }

    public abstract void compressBody(int i, long j);

    public abstract void compressVersion(int i);

    public abstract void computeTarget(byte[] bArr, int i, int i2);

    public final void drawConfig(int i, GlowFormatter glowFormatter) {
        sortSnapshot(i, 3);
        commitBounds(glowFormatter);
        sortSnapshot(i, 4);
    }

    public abstract void emitStrategy(AbstractBucket abstractBucket);

    @Override // com.goldenboot.saga.zone.SwipeBatch
    public abstract void evictLayout(byte[] bArr, int i, int i2);

    public abstract void executeConfig(int i, GlowFormatter glowFormatter);

    public final void executeRecord(int i, long j) {
        compressBody(i, j);
    }

    public abstract void expandScope(int i, int i2);

    public abstract void flattenToken(int i, String str);

    public abstract void formatMessage(int i);

    public final void groupArchive(String str, MenuImpl.LayerUseCase layerUseCase) {
        injectMetric.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) layerUseCase);
        byte[] bytes = str.getBytes(ProxyTask.growPayload);
        try {
            unwrapRecord(bytes.length);
            evictLayout(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new FeedbackFlow(e);
        }
    }

    public final void growCallback(float f) {
        compressVersion(Float.floatToRawIntBits(f));
    }

    public final void handleFooter(int i, double d) {
        transformCurrency(i, Double.doubleToRawLongBits(d));
    }

    public final void injectField(boolean z) {
        resetValue(z ? (byte) 1 : (byte) 0);
    }

    public abstract void loadItem(int i, AbstractBucket abstractBucket);

    public abstract void locateSignal(int i, AbstractBucket abstractBucket);

    public abstract void measureEndpoint(long j);

    public final void normalizeBundle(int i, GlowFormatter glowFormatter, ColorRestore colorRestore) {
        sortSnapshot(i, 3);
        closePayload(glowFormatter, colorRestore);
        sortSnapshot(i, 4);
    }

    public final void offerHash(int i, long j) {
        transformCurrency(i, j);
    }

    public final void peekDescriptor(int i, float f) {
        refreshCounter(i, Float.floatToRawIntBits(f));
    }

    public abstract void prepareCount(String str);

    public abstract void protectChannel(int i, int i2);

    public final void protectGauge(int i) {
        formatMessage(i);
    }

    public final void purgeMetric(double d) {
        validateOffset(Double.doubleToRawLongBits(d));
    }

    public final void queryData(int i) {
        unwrapRecord(startResource(i));
    }

    public abstract void refreshCounter(int i, int i2);

    public final void removeCount(int i, int i2) {
        expandScope(i, i2);
    }

    public abstract void resetValue(byte b);

    public abstract void resumeSignature();

    public final void saveSnapshot(int i, int i2) {
        protectChannel(i, startResource(i2));
    }

    public final void searchHolder(long j) {
        validateOffset(j);
    }

    public abstract void serializeTask(int i, boolean z);

    public abstract void sortSnapshot(int i, int i2);

    public abstract void subscribeEvent(int i, GlowFormatter glowFormatter, ColorRestore colorRestore);

    public final void syncPool(int i, long j) {
        compressBody(i, formatPosition(j));
    }

    public abstract void transformCurrency(int i, long j);

    public abstract void unwrapRecord(int i);

    public final void updateConstraint(int i, int i2) {
        refreshCounter(i, i2);
    }

    public abstract void validateOffset(long j);

    public CoreTranslator() {
    }
}
