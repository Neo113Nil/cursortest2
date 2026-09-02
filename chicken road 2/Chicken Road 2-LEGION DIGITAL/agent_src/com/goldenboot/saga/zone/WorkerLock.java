package com.goldenboot.saga.zone;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class WorkerLock extends SectionLock {
    public int clipOrigin;

    public WorkerLock(int i) {
        super(null);
        if (!(i >= 0)) {
            LifecycleCreator.evictLayout("Capacity must be a positive value.");
        }
        peekRevision(TileRunner.releaseHeader(i));
    }

    public final int applyTask(long j) {
        int hashCode = Long.hashCode(j) * (-862048943);
        int i = hashCode ^ (hashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this.detachStream;
        int i5 = i2 & i4;
        int i6 = 0;
        while (true) {
            long[] jArr = this.evictLayout;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j2 = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j3 = i3;
            int i9 = i6;
            long j4 = j2 ^ (j3 * 72340172838076673L);
            for (long j5 = (~j4) & (j4 - 72340172838076673L) & (-9187201950435737472L); j5 != 0; j5 &= j5 - 1) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j5) >> 3) + i5) & i4;
                if (this.growPayload[numberOfTrailingZeros] == j) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j2) << 6) & j2 & (-9187201950435737472L)) != 0) {
                int popBlueprint = popBlueprint(i2);
                if (this.clipOrigin == 0 && ((this.evictLayout[popBlueprint >> 3] >> ((popBlueprint & 7) << 3)) & 255) != 254) {
                    clipOrigin();
                    popBlueprint = popBlueprint(i2);
                }
                this.releaseHeader++;
                int i10 = this.clipOrigin;
                long[] jArr2 = this.evictLayout;
                int i11 = popBlueprint >> 3;
                long j6 = jArr2[i11];
                int i12 = (popBlueprint & 7) << 3;
                this.clipOrigin = i10 - (((j6 >> i12) & 255) == 128 ? 1 : 0);
                int i13 = this.detachStream;
                long j7 = ((~(255 << i12)) & j6) | (j3 << i12);
                jArr2[i11] = j7;
                jArr2[(((popBlueprint - 7) & i13) + (i13 & 7)) >> 3] = j7;
                return popBlueprint;
            }
            i6 = i9 + 8;
            i5 = (i5 + i6) & i4;
        }
    }

    public final void clipOrigin() {
        if (this.detachStream <= 8 || Long.compareUnsigned(BoxSlot.evictLayout(BoxSlot.evictLayout(this.releaseHeader) * 32), BoxSlot.evictLayout(BoxSlot.evictLayout(this.detachStream) * 25)) > 0) {
            serializeOffset(TileRunner.injectMetric(this.detachStream));
        } else {
            updateTimer();
        }
    }

    public final void connectJob(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = TileRunner.evictLayout;
        } else {
            long[] jArr2 = new long[((i + 15) & (-8)) >> 3];
            InsetsReader.drawRequest(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.evictLayout = jArr;
        int i2 = i >> 3;
        long j = 255 << ((i & 7) << 3);
        jArr[i2] = (jArr[i2] & (~j)) | j;
        drawField();
    }

    public final void drawField() {
        this.clipOrigin = TileRunner.evictLayout(injectMetric()) - this.releaseHeader;
    }

    public final void flushSample() {
        this.releaseHeader = 0;
        long[] jArr = this.evictLayout;
        if (jArr != TileRunner.evictLayout) {
            InsetsReader.drawRequest(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.evictLayout;
            int i = this.detachStream;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        InsetsReader.inflateAdapter(this.injectMetric, null, 0, this.detachStream);
        drawField();
    }

    public final void peekRevision(int i) {
        int max = i > 0 ? Math.max(7, TileRunner.detachStream(i)) : 0;
        this.detachStream = max;
        connectJob(max);
        this.growPayload = new long[max];
        this.injectMetric = new Object[max];
    }

    public final int popBlueprint(int i) {
        int i2 = this.detachStream;
        int i3 = i & i2;
        int i4 = 0;
        while (true) {
            long[] jArr = this.evictLayout;
            int i5 = i3 >> 3;
            int i6 = (i3 & 7) << 3;
            long j = ((jArr[i5 + 1] << (64 - i6)) & ((-i6) >> 63)) | (jArr[i5] >>> i6);
            long j2 = j & ((~j) << 7) & (-9187201950435737472L);
            if (j2 != 0) {
                return (i3 + (Long.numberOfTrailingZeros(j2) >> 3)) & i2;
            }
            i4 += 8;
            i3 = (i3 + i4) & i2;
        }
    }

    public final void reduceScope(long j, Object obj) {
        int applyTask = applyTask(j);
        this.growPayload[applyTask] = j;
        this.injectMetric[applyTask] = obj;
    }

    public final void serializeOffset(int i) {
        long[] jArr;
        WorkerLock workerLock = this;
        long[] jArr2 = workerLock.evictLayout;
        long[] jArr3 = workerLock.growPayload;
        Object[] objArr = workerLock.injectMetric;
        int i2 = workerLock.detachStream;
        peekRevision(i);
        long[] jArr4 = workerLock.evictLayout;
        long[] jArr5 = workerLock.growPayload;
        Object[] objArr2 = workerLock.injectMetric;
        int i3 = workerLock.detachStream;
        int i4 = 0;
        while (i4 < i2) {
            if (((jArr2[i4 >> 3] >> ((i4 & 7) << 3)) & 255) < 128) {
                long j = jArr3[i4];
                int hashCode = Long.hashCode(j) * (-862048943);
                int i5 = hashCode ^ (hashCode << 16);
                int popBlueprint = workerLock.popBlueprint(i5 >>> 7);
                long j2 = i5 & 127;
                int i6 = popBlueprint >> 3;
                int i7 = (popBlueprint & 7) << 3;
                jArr = jArr2;
                long j3 = (jArr4[i6] & (~(255 << i7))) | (j2 << i7);
                jArr4[i6] = j3;
                jArr4[(((popBlueprint - 7) & i3) + (i3 & 7)) >> 3] = j3;
                jArr5[popBlueprint] = j;
                objArr2[popBlueprint] = objArr[i4];
            } else {
                jArr = jArr2;
            }
            i4++;
            workerLock = this;
            jArr2 = jArr;
        }
    }

    public final void updateTimer() {
        long j;
        long[] jArr = this.evictLayout;
        int i = this.detachStream;
        long[] jArr2 = this.growPayload;
        Object[] objArr = this.injectMetric;
        int i2 = (i + 7) >> 3;
        boolean z = false;
        for (int i3 = 0; i3 < i2; i3++) {
            long j2 = jArr[i3] & (-9187201950435737472L);
            jArr[i3] = (-72340172838076674L) & ((~j2) + (j2 >>> 7));
        }
        int resetValue = PluginInspector.resetValue(jArr);
        int i4 = resetValue - 1;
        long j3 = 72057594037927935L;
        jArr[i4] = (jArr[i4] & 72057594037927935L) | (-72057594037927936L);
        jArr[resetValue] = jArr[0];
        int i5 = 0;
        while (i5 != i) {
            int i6 = i5 >> 3;
            int i7 = (i5 & 7) << 3;
            long j4 = (jArr[i6] >> i7) & 255;
            if (j4 != 128 && j4 == 254) {
                int hashCode = Long.hashCode(jArr2[i5]) * (-862048943);
                int i8 = (hashCode ^ (hashCode << 16)) >>> 7;
                int popBlueprint = popBlueprint(i8);
                int i9 = i8 & i;
                boolean z2 = z;
                if (((popBlueprint - i9) & i) / 8 == ((i5 - i9) & i) / 8) {
                    jArr[i6] = ((r8 & 127) << i7) | ((~(255 << i7)) & jArr[i6]);
                    jArr[PluginInspector.resetValue(jArr)] = (jArr[z2 ? 1 : 0] & j3) | Long.MIN_VALUE;
                    i5++;
                    z = z2 ? 1 : 0;
                } else {
                    int i10 = popBlueprint >> 3;
                    long j5 = jArr[i10];
                    int i11 = (popBlueprint & 7) << 3;
                    if (((j5 >> i11) & 255) == 128) {
                        j = j3;
                        jArr[i10] = ((r8 & 127) << i11) | (j5 & (~(255 << i11)));
                        jArr[i6] = (jArr[i6] & (~(255 << i7))) | (128 << i7);
                        jArr2[popBlueprint] = jArr2[i5];
                        jArr2[i5] = 0;
                        objArr[popBlueprint] = objArr[i5];
                        objArr[i5] = null;
                    } else {
                        j = j3;
                        jArr[i10] = ((r8 & 127) << i11) | (j5 & (~(255 << i11)));
                        long j6 = jArr2[popBlueprint];
                        jArr2[popBlueprint] = jArr2[i5];
                        jArr2[i5] = j6;
                        Object obj = objArr[popBlueprint];
                        objArr[popBlueprint] = objArr[i5];
                        objArr[i5] = obj;
                        i5--;
                    }
                    jArr[PluginInspector.resetValue(jArr)] = (jArr[z2 ? 1 : 0] & j) | Long.MIN_VALUE;
                    i5++;
                    z = z2 ? 1 : 0;
                    j3 = j;
                }
            } else {
                i5++;
            }
        }
        drawField();
    }
}
