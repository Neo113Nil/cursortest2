package com.goldenboot.saga.zone;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ServerBuilder extends FramePresenter {
    public int clipOrigin;

    public /* synthetic */ ServerBuilder(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public final int applyTask(int i) {
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 >>> 7;
        int i4 = i2 & 127;
        int i5 = this.detachStream;
        int i6 = i3 & i5;
        int i7 = 0;
        while (true) {
            long[] jArr = this.evictLayout;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            int i10 = 1;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = i4;
            int i11 = i7;
            long j3 = j ^ (j2 * 72340172838076673L);
            long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L);
            while (j4 != 0) {
                int numberOfTrailingZeros = ((Long.numberOfTrailingZeros(j4) >> 3) + i6) & i5;
                int i12 = i10;
                if (this.growPayload[numberOfTrailingZeros] == i) {
                    return numberOfTrailingZeros;
                }
                j4 &= j4 - 1;
                i10 = i12;
            }
            int i13 = i10;
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int popBlueprint = popBlueprint(i3);
                if (this.clipOrigin == 0 && ((this.evictLayout[popBlueprint >> 3] >> ((popBlueprint & 7) << 3)) & 255) != 254) {
                    clipOrigin();
                    popBlueprint = popBlueprint(i3);
                }
                this.releaseHeader++;
                int i14 = this.clipOrigin;
                long[] jArr2 = this.evictLayout;
                int i15 = popBlueprint >> 3;
                long j5 = jArr2[i15];
                int i16 = (popBlueprint & 7) << 3;
                this.clipOrigin = i14 - (((j5 >> i16) & 255) == 128 ? i13 : 0);
                int i17 = this.detachStream;
                long j6 = ((~(255 << i16)) & j5) | (j2 << i16);
                jArr2[i15] = j6;
                jArr2[(((popBlueprint - 7) & i17) + (i17 & 7)) >> 3] = j6;
                return popBlueprint;
            }
            i7 = i11 + 8;
            i6 = (i6 + i7) & i5;
        }
    }

    public final void attachConfig(int i, Object obj) {
        int applyTask = applyTask(i);
        this.growPayload[applyTask] = i;
        this.injectMetric[applyTask] = obj;
    }

    public final void clipOrigin() {
        if (this.detachStream <= 8 || Long.compareUnsigned(BoxSlot.evictLayout(BoxSlot.evictLayout(this.releaseHeader) * 32), BoxSlot.evictLayout(BoxSlot.evictLayout(this.detachStream) * 25)) > 0) {
            connectPatch(TileRunner.injectMetric(this.detachStream));
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

    public final void connectPatch(int i) {
        long[] jArr;
        ServerBuilder serverBuilder = this;
        long[] jArr2 = serverBuilder.evictLayout;
        int[] iArr = serverBuilder.growPayload;
        Object[] objArr = serverBuilder.injectMetric;
        int i2 = serverBuilder.detachStream;
        peekRevision(i);
        long[] jArr3 = serverBuilder.evictLayout;
        int[] iArr2 = serverBuilder.growPayload;
        Object[] objArr2 = serverBuilder.injectMetric;
        int i3 = serverBuilder.detachStream;
        int i4 = 0;
        while (i4 < i2) {
            if (((jArr2[i4 >> 3] >> ((i4 & 7) << 3)) & 255) < 128) {
                int i5 = iArr[i4];
                int hashCode = Integer.hashCode(i5) * (-862048943);
                int i6 = hashCode ^ (hashCode << 16);
                int popBlueprint = serverBuilder.popBlueprint(i6 >>> 7);
                long j = i6 & 127;
                int i7 = popBlueprint >> 3;
                int i8 = (popBlueprint & 7) << 3;
                jArr = jArr2;
                long j2 = (jArr3[i7] & (~(255 << i8))) | (j << i8);
                jArr3[i7] = j2;
                jArr3[(((popBlueprint - 7) & i3) + (i3 & 7)) >> 3] = j2;
                iArr2[popBlueprint] = i5;
                objArr2[popBlueprint] = objArr[i4];
            } else {
                jArr = jArr2;
            }
            i4++;
            serverBuilder = this;
            jArr2 = jArr;
        }
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

    public final Object notifyMessage(int i) {
        this.releaseHeader--;
        long[] jArr = this.evictLayout;
        int i2 = this.detachStream;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        Object[] objArr = this.injectMetric;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void peekRevision(int i) {
        int max = i > 0 ? Math.max(7, TileRunner.detachStream(i)) : 0;
        this.detachStream = max;
        connectJob(max);
        this.growPayload = new int[max];
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

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object reduceScope(int i) {
        int i2;
        int hashCode = Integer.hashCode(i) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.detachStream;
        int i6 = (i3 >>> 7) & i5;
        int i7 = 0;
        loop0: while (true) {
            long[] jArr = this.evictLayout;
            int i8 = i6 >> 3;
            int i9 = (i6 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i2 = ((Long.numberOfTrailingZeros(j3) >> 3) + i6) & i5;
                if (this.growPayload[i2] == i) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i7 += 8;
            i6 = (i6 + i7) & i5;
        }
        if (i2 >= 0) {
            return notifyMessage(i2);
        }
        return null;
    }

    public final Object serializeOffset(int i, Object obj) {
        int applyTask = applyTask(i);
        Object[] objArr = this.injectMetric;
        Object obj2 = objArr[applyTask];
        this.growPayload[applyTask] = i;
        objArr[applyTask] = obj;
        return obj2;
    }

    public final void updateTimer() {
        long j;
        long[] jArr = this.evictLayout;
        int i = this.detachStream;
        int[] iArr = this.growPayload;
        Object[] objArr = this.injectMetric;
        int i2 = (i + 7) >> 3;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = jArr[i4] & (-9187201950435737472L);
            jArr[i4] = (-72340172838076674L) & ((~j2) + (j2 >>> 7));
        }
        int resetValue = PluginInspector.resetValue(jArr);
        int i5 = resetValue - 1;
        long j3 = 72057594037927935L;
        jArr[i5] = (jArr[i5] & 72057594037927935L) | (-72057594037927936L);
        jArr[resetValue] = jArr[0];
        int i6 = 0;
        while (i6 != i) {
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j4 = (jArr[i7] >> i8) & 255;
            if (j4 != 128 && j4 == 254) {
                int hashCode = Integer.hashCode(iArr[i6]) * (-862048943);
                int i9 = (hashCode ^ (hashCode << 16)) >>> 7;
                int popBlueprint = popBlueprint(i9);
                int i10 = i9 & i;
                int i11 = i3;
                if (((popBlueprint - i10) & i) / 8 == ((i6 - i10) & i) / 8) {
                    jArr[i7] = ((r8 & 127) << i8) | ((~(255 << i8)) & jArr[i7]);
                    jArr[PluginInspector.resetValue(jArr)] = (jArr[i11] & j3) | Long.MIN_VALUE;
                    i6++;
                    i3 = i11;
                } else {
                    int i12 = popBlueprint >> 3;
                    long j5 = jArr[i12];
                    int i13 = (popBlueprint & 7) << 3;
                    if (((j5 >> i13) & 255) == 128) {
                        j = j3;
                        jArr[i12] = ((r8 & 127) << i13) | (j5 & (~(255 << i13)));
                        jArr[i7] = (jArr[i7] & (~(255 << i8))) | (128 << i8);
                        iArr[popBlueprint] = iArr[i6];
                        iArr[i6] = i11;
                        objArr[popBlueprint] = objArr[i6];
                        objArr[i6] = null;
                    } else {
                        j = j3;
                        jArr[i12] = ((r8 & 127) << i13) | (j5 & (~(255 << i13)));
                        int i14 = iArr[popBlueprint];
                        iArr[popBlueprint] = iArr[i6];
                        iArr[i6] = i14;
                        Object obj = objArr[popBlueprint];
                        objArr[popBlueprint] = objArr[i6];
                        objArr[i6] = obj;
                        i6--;
                    }
                    jArr[PluginInspector.resetValue(jArr)] = (jArr[i11] & j) | Long.MIN_VALUE;
                    i6++;
                    i3 = i11;
                    j3 = j;
                }
            } else {
                i6++;
            }
        }
        drawField();
    }

    public ServerBuilder(int i) {
        super(null);
        if (!(i >= 0)) {
            LifecycleCreator.evictLayout("Capacity must be a positive value.");
        }
        peekRevision(TileRunner.releaseHeader(i));
    }
}
