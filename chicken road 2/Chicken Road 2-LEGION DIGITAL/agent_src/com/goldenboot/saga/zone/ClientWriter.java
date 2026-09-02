package com.goldenboot.saga.zone;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class ClientWriter extends RestoreWrapper {
    public int clipOrigin;

    public /* synthetic */ ClientWriter(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }

    public final void applyTask() {
        if (this.detachStream <= 8 || Long.compareUnsigned(BoxSlot.evictLayout(BoxSlot.evictLayout(this.releaseHeader) * 32), BoxSlot.evictLayout(BoxSlot.evictLayout(this.detachStream) * 25)) > 0) {
            notifyMessage(TileRunner.injectMetric(this.detachStream));
        } else {
            popBlueprint();
        }
    }

    public final int connectJob(Object obj) {
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
                int drawField = drawField(i2);
                if (this.clipOrigin == 0 && ((this.evictLayout[drawField >> 3] >> ((drawField & 7) << 3)) & 255) != 254) {
                    applyTask();
                    drawField = drawField(i2);
                }
                this.releaseHeader++;
                int i10 = this.clipOrigin;
                long[] jArr2 = this.evictLayout;
                int i11 = drawField >> 3;
                long j5 = jArr2[i11];
                int i12 = (drawField & 7) << 3;
                this.clipOrigin = i10 - (((j5 >> i12) & 255) == 128 ? 1 : 0);
                int i13 = this.detachStream;
                long j6 = ((~(255 << i12)) & j5) | (j2 << i12);
                jArr2[i11] = j6;
                jArr2[(((drawField - 7) & i13) + (i13 & 7)) >> 3] = j6;
                return ~drawField;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }

    public final void connectPatch(Object obj, long j) {
        int connectJob = connectJob(obj);
        if (connectJob < 0) {
            connectJob = ~connectJob;
        }
        this.growPayload[connectJob] = obj;
        this.injectMetric[connectJob] = j;
    }

    public final int drawField(int i) {
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

    public final void notifyMessage(int i) {
        int i2;
        long[] jArr = this.evictLayout;
        Object[] objArr = this.growPayload;
        long[] jArr2 = this.injectMetric;
        int i3 = this.detachStream;
        reduceScope(i);
        long[] jArr3 = this.evictLayout;
        Object[] objArr2 = this.growPayload;
        long[] jArr4 = this.injectMetric;
        int i4 = this.detachStream;
        int i5 = 0;
        while (i5 < i3) {
            if (((jArr[i5 >> 3] >> ((i5 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i5];
                int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i6 = hashCode ^ (hashCode << 16);
                int drawField = drawField(i6 >>> 7);
                i2 = i5;
                long j = i6 & 127;
                int i7 = drawField >> 3;
                int i8 = (drawField & 7) << 3;
                long j2 = (j << i8) | (jArr3[i7] & (~(255 << i8)));
                jArr3[i7] = j2;
                jArr3[(((drawField - 7) & i4) + (i4 & 7)) >> 3] = j2;
                objArr2[drawField] = obj;
                jArr4[drawField] = jArr2[i2];
            } else {
                i2 = i5;
            }
            i5 = i2 + 1;
        }
    }

    public final void peekRevision() {
        this.clipOrigin = TileRunner.evictLayout(releaseHeader()) - this.releaseHeader;
    }

    public final void popBlueprint() {
        long j;
        long[] jArr = this.evictLayout;
        int i = this.detachStream;
        Object[] objArr = this.growPayload;
        long[] jArr2 = this.injectMetric;
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
                Object obj = objArr[i6];
                int hashCode = (obj != null ? obj.hashCode() : i3) * (-862048943);
                int i9 = (hashCode ^ (hashCode << 16)) >>> 7;
                int drawField = drawField(i9);
                int i10 = i9 & i;
                int i11 = i3;
                if (((drawField - i10) & i) / 8 == ((i6 - i10) & i) / 8) {
                    jArr[i7] = ((r8 & 127) << i8) | ((~(255 << i8)) & jArr[i7]);
                    jArr[PluginInspector.resetValue(jArr)] = (jArr[i11] & j3) | Long.MIN_VALUE;
                    i6++;
                    i3 = i11;
                } else {
                    int i12 = drawField >> 3;
                    long j5 = jArr[i12];
                    int i13 = (drawField & 7) << 3;
                    if (((j5 >> i13) & 255) == 128) {
                        j = j3;
                        jArr[i12] = ((r8 & 127) << i13) | (j5 & (~(255 << i13)));
                        jArr[i7] = (jArr[i7] & (~(255 << i8))) | (128 << i8);
                        objArr[drawField] = objArr[i6];
                        objArr[i6] = null;
                        jArr2[drawField] = jArr2[i6];
                        jArr2[i6] = 0;
                    } else {
                        j = j3;
                        jArr[i12] = ((r8 & 127) << i13) | (j5 & (~(255 << i13)));
                        Object obj2 = objArr[drawField];
                        objArr[drawField] = objArr[i6];
                        objArr[i6] = obj2;
                        long j6 = jArr2[drawField];
                        jArr2[drawField] = jArr2[i6];
                        jArr2[i6] = j6;
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
        peekRevision();
    }

    public final void reduceScope(int i) {
        int max = i > 0 ? Math.max(7, TileRunner.detachStream(i)) : 0;
        this.detachStream = max;
        serializeOffset(max);
        this.growPayload = new Object[max];
        this.injectMetric = new long[max];
    }

    public final void serializeOffset(int i) {
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
        peekRevision();
    }

    public ClientWriter(int i) {
        super(null);
        if (!(i >= 0)) {
            LifecycleCreator.evictLayout("Capacity must be a positive value.");
        }
        reduceScope(TileRunner.releaseHeader(i));
    }
}
