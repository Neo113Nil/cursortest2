package com.goldenboot.saga.zone;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ParallelHeap extends FontBarrier {
    public int clipOrigin;

    public /* synthetic */ ParallelHeap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public final Object attachConfig(Object obj, Object obj2) {
        int serializeOffset = serializeOffset(obj);
        if (serializeOffset < 0) {
            serializeOffset = ~serializeOffset;
        }
        Object[] objArr = this.injectMetric;
        Object obj3 = objArr[serializeOffset];
        this.growPayload[serializeOffset] = obj;
        objArr[serializeOffset] = obj2;
        return obj3;
    }

    public final void connectJob() {
        long[] jArr = this.evictLayout;
        int i = this.detachStream;
        Object[] objArr = this.growPayload;
        Object[] objArr2 = this.injectMetric;
        int i2 = (i + 7) >> 3;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            long j = jArr[i4] & (-9187201950435737472L);
            jArr[i4] = (-72340172838076674L) & ((~j) + (j >>> 7));
        }
        int resetValue = PluginInspector.resetValue(jArr);
        int i5 = resetValue - 1;
        jArr[i5] = (jArr[i5] & 72057594037927935L) | (-72057594037927936L);
        jArr[resetValue] = jArr[0];
        int i6 = 0;
        while (i6 != i) {
            int i7 = i6 >> 3;
            int i8 = (i6 & 7) << 3;
            long j2 = (jArr[i7] >> i8) & 255;
            if (j2 != 128 && j2 == 254) {
                Object obj = objArr[i6];
                int hashCode = (obj != null ? obj.hashCode() : i3) * (-862048943);
                int i9 = (hashCode ^ (hashCode << 16)) >>> 7;
                int peekRevision = peekRevision(i9);
                int i10 = i9 & i;
                int i11 = i3;
                if (((peekRevision - i10) & i) / 8 == ((i6 - i10) & i) / 8) {
                    jArr[i7] = ((r8 & 127) << i8) | ((~(255 << i8)) & jArr[i7]);
                    jArr[PluginInspector.resetValue(jArr)] = jArr[i11];
                } else {
                    int i12 = peekRevision >> 3;
                    long j3 = jArr[i12];
                    int i13 = (peekRevision & 7) << 3;
                    if (((j3 >> i13) & 255) == 128) {
                        jArr[i12] = ((r8 & 127) << i13) | (j3 & (~(255 << i13)));
                        jArr[i7] = (jArr[i7] & (~(255 << i8))) | (128 << i8);
                        objArr[peekRevision] = objArr[i6];
                        objArr[i6] = null;
                        objArr2[peekRevision] = objArr2[i6];
                        objArr2[i6] = null;
                    } else {
                        jArr[i12] = ((r8 & 127) << i13) | (j3 & (~(255 << i13)));
                        Object obj2 = objArr[peekRevision];
                        objArr[peekRevision] = objArr[i6];
                        objArr[i6] = obj2;
                        Object obj3 = objArr2[peekRevision];
                        objArr2[peekRevision] = objArr2[i6];
                        objArr2[i6] = obj3;
                        i6--;
                    }
                    jArr[PluginInspector.resetValue(jArr)] = jArr[i11];
                }
                i6++;
                i3 = i11;
            } else {
                i6++;
            }
        }
        reduceScope();
    }

    public final void connectPatch(int i) {
        int max = i > 0 ? Math.max(7, TileRunner.detachStream(i)) : 0;
        this.detachStream = max;
        notifyMessage(max);
        this.growPayload = max == 0 ? IndicatorProvider.injectMetric : new Object[max];
        this.injectMetric = max == 0 ? IndicatorProvider.injectMetric : new Object[max];
    }

    public final void decodePath(Object obj, Object obj2) {
        int serializeOffset = serializeOffset(obj);
        if (serializeOffset < 0) {
            serializeOffset = ~serializeOffset;
        }
        this.growPayload[serializeOffset] = obj;
        this.injectMetric[serializeOffset] = obj2;
    }

    public final void drawField() {
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
        InsetsReader.inflateAdapter(this.growPayload, null, 0, this.detachStream);
        reduceScope();
    }

    public final Object drawRequest(int i) {
        this.releaseHeader--;
        long[] jArr = this.evictLayout;
        int i2 = this.detachStream;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.growPayload[i] = null;
        Object[] objArr = this.injectMetric;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void gatherAdapter(int i) {
        int i2;
        long[] jArr = this.evictLayout;
        Object[] objArr = this.growPayload;
        Object[] objArr2 = this.injectMetric;
        int i3 = this.detachStream;
        connectPatch(i);
        long[] jArr2 = this.evictLayout;
        Object[] objArr3 = this.growPayload;
        Object[] objArr4 = this.injectMetric;
        int i4 = this.detachStream;
        int i5 = 0;
        while (i5 < i3) {
            if (((jArr[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i5];
                int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i6 = hashCode ^ (hashCode << 16);
                int peekRevision = peekRevision(i6 >>> 7);
                i2 = i5;
                long j = i6 & 127;
                int i7 = peekRevision >> 3;
                int i8 = (peekRevision & 7) << 3;
                long j2 = (j << i8) | (jArr2[i7] & (~(255 << i8)));
                jArr2[i7] = j2;
                jArr2[(((peekRevision - 7) & i4) + (i4 & 7)) >> 3] = j2;
                objArr3[peekRevision] = obj;
                objArr4[peekRevision] = objArr2[i2];
            } else {
                i2 = i5;
            }
            i5 = i2 + 1;
        }
    }

    public final void inflateAdapter(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        for (Map.Entry entry : from.entrySet()) {
            decodePath(entry.getKey(), entry.getValue());
        }
    }

    public final void notifyMessage(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = TileRunner.evictLayout;
        } else {
            long[] jArr2 = new long[((i + 15) & (-8)) >> 3];
            InsetsReader.drawRequest(jArr2, -9187201950435737472L, 0, 0, 6, null);
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
            jArr = jArr2;
        }
        this.evictLayout = jArr;
        reduceScope();
    }

    public final int peekRevision(int i) {
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

    public final void popBlueprint() {
        if (this.detachStream <= 8 || Long.compareUnsigned(BoxSlot.evictLayout(BoxSlot.evictLayout(this.releaseHeader) * 32), BoxSlot.evictLayout(BoxSlot.evictLayout(this.detachStream) * 25)) > 0) {
            gatherAdapter(TileRunner.injectMetric(this.detachStream));
        } else {
            connectJob();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object purgeNode(Object obj) {
        int i;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.detachStream;
        int i6 = i3 >>> 7;
        loop0: while (true) {
            int i7 = i6 & i5;
            long[] jArr = this.evictLayout;
            int i8 = i7 >> 3;
            int i9 = (i7 & 7) << 3;
            long j = ((jArr[i8 + 1] << (64 - i9)) & ((-i9) >> 63)) | (jArr[i8] >>> i9);
            long j2 = (i4 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i7) & i5;
                if (Intrinsics.areEqual(this.growPayload[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i2 += 8;
            i6 = i7 + i2;
        }
        if (i >= 0) {
            return drawRequest(i);
        }
        return null;
    }

    public final void reduceScope() {
        this.clipOrigin = TileRunner.evictLayout(clipOrigin()) - this.releaseHeader;
    }

    public final void resetDelta(FontBarrier from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Object[] objArr = from.growPayload;
        Object[] objArr2 = from.injectMetric;
        long[] jArr = from.evictLayout;
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
                        decodePath(objArr[i4], objArr2[i4]);
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

    public final int serializeOffset(Object obj) {
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
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
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = i3;
            int i9 = i3;
            long j3 = j ^ (j2 * 72340172838076673L);
            for (long j4 = (~j3) & (j3 - 72340172838076673L) & (-9187201950435737472L); j4 != 0; j4 &= j4 - 1) {
                int numberOfTrailingZeros = (i5 + (Long.numberOfTrailingZeros(j4) >> 3)) & i4;
                if (Intrinsics.areEqual(this.growPayload[numberOfTrailingZeros], obj)) {
                    return numberOfTrailingZeros;
                }
            }
            if ((((~j) << 6) & j & (-9187201950435737472L)) != 0) {
                int peekRevision = peekRevision(i2);
                if (this.clipOrigin == 0 && ((this.evictLayout[peekRevision >> 3] >> ((peekRevision & 7) << 3)) & 255) != 254) {
                    popBlueprint();
                    peekRevision = peekRevision(i2);
                }
                this.releaseHeader++;
                int i10 = this.clipOrigin;
                long[] jArr2 = this.evictLayout;
                int i11 = peekRevision >> 3;
                long j5 = jArr2[i11];
                int i12 = (peekRevision & 7) << 3;
                this.clipOrigin = i10 - (((j5 >> i12) & 255) == 128 ? 1 : 0);
                int i13 = this.detachStream;
                long j6 = ((~(255 << i12)) & j5) | (j2 << i12);
                jArr2[i11] = j6;
                jArr2[(((peekRevision - 7) & i13) + (i13 & 7)) >> 3] = j6;
                return ~peekRevision;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }

    public ParallelHeap(int i) {
        super(null);
        if (!(i >= 0)) {
            LifecycleCreator.evictLayout("Capacity must be a positive value.");
        }
        connectPatch(TileRunner.releaseHeader(i));
    }
}
