package com.goldenboot.saga.zone;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-8a937589efc37ca14c210e73e18b8757b60a107ea08aacc80d18a198c868531e */
/* loaded from: classes.dex */
public final class CustomStore extends ElevationInspector {
    public int releaseHeader;

    public CustomStore(int i) {
        super(null);
        if (!(i >= 0)) {
            LifecycleCreator.evictLayout("Capacity must be a positive value.");
        }
        resetDelta(TileRunner.releaseHeader(i));
    }

    public final boolean applyTask(ElevationInspector elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int injectMetric = injectMetric();
        drawRequest(elements);
        return injectMetric != injectMetric();
    }

    public final void attachConfig(int i) {
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
        connectPatch();
    }

    public final Set connectJob() {
        return new CardOrchestrator(this);
    }

    public final void connectPatch() {
        this.releaseHeader = TileRunner.evictLayout(growPayload()) - this.detachStream;
    }

    public final void decodePath(Object obj) {
        this.growPayload[reduceScope(obj)] = obj;
    }

    public final void drawField() {
        if (this.injectMetric <= 8 || Long.compareUnsigned(BoxSlot.evictLayout(BoxSlot.evictLayout(this.detachStream) * 32), BoxSlot.evictLayout(BoxSlot.evictLayout(this.injectMetric) * 25)) > 0) {
            mergeLocale(TileRunner.injectMetric(this.injectMetric));
        } else {
            serializeOffset();
        }
    }

    public final void drawRequest(ElevationInspector elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = elements.growPayload;
        long[] jArr = elements.evictLayout;
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
                        decodePath(objArr[(i << 3) + i3]);
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

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (((r7 & ((~r7) << 6)) & (-9187201950435737472L)) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        r11 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean drawScope(Object obj) {
        int i;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i2 = hashCode ^ (hashCode << 16);
        int i3 = i2 & 127;
        int i4 = this.injectMetric;
        int i5 = (i2 >>> 7) & i4;
        int i6 = 0;
        loop0: while (true) {
            long[] jArr = this.evictLayout;
            int i7 = i5 >> 3;
            int i8 = (i5 & 7) << 3;
            long j = ((jArr[i7 + 1] << (64 - i8)) & ((-i8) >> 63)) | (jArr[i7] >>> i8);
            long j2 = (i3 * 72340172838076673L) ^ j;
            long j3 = (~j2) & (j2 - 72340172838076673L) & (-9187201950435737472L);
            while (true) {
                if (j3 == 0) {
                    break;
                }
                i = ((Long.numberOfTrailingZeros(j3) >> 3) + i5) & i4;
                if (Intrinsics.areEqual(this.growPayload[i], obj)) {
                    break loop0;
                }
                j3 &= j3 - 1;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
        }
        boolean z = i >= 0;
        if (z) {
            findTask(i);
        }
        return z;
    }

    public final boolean expandArgs(Iterable elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int injectMetric = injectMetric();
        inflateAdapter(elements);
        return injectMetric != injectMetric();
    }

    public final void findTask(int i) {
        this.detachStream--;
        long[] jArr = this.evictLayout;
        int i2 = this.injectMetric;
        int i3 = i >> 3;
        int i4 = (i & 7) << 3;
        long j = (jArr[i3] & (~(255 << i4))) | (254 << i4);
        jArr[i3] = j;
        jArr[(((i - 7) & i2) + (i2 & 7)) >> 3] = j;
        this.growPayload[i] = null;
    }

    public final void gatherAdapter(Iterable elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            decodePath(it.next());
        }
    }

    public final void inflateAdapter(Iterable elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            purgeNode(it.next());
        }
    }

    public final void mergeLocale(int i) {
        long[] jArr = this.evictLayout;
        Object[] objArr = this.growPayload;
        int i2 = this.injectMetric;
        resetDelta(i);
        long[] jArr2 = this.evictLayout;
        Object[] objArr2 = this.growPayload;
        int i3 = this.injectMetric;
        for (int i4 = 0; i4 < i2; i4++) {
            if (((jArr[i4 >> 3] >> ((i4 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i4];
                int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i5 = hashCode ^ (hashCode << 16);
                int notifyMessage = notifyMessage(i5 >>> 7);
                long j = i5 & 127;
                int i6 = notifyMessage >> 3;
                int i7 = (notifyMessage & 7) << 3;
                long j2 = (jArr2[i6] & (~(255 << i7))) | (j << i7);
                jArr2[i6] = j2;
                jArr2[(((notifyMessage - 7) & i3) + (i3 & 7)) >> 3] = j2;
                objArr2[notifyMessage] = obj;
            }
        }
    }

    public final int notifyMessage(int i) {
        int i2 = this.injectMetric;
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

    public final void peekRevision() {
        this.detachStream = 0;
        long[] jArr = this.evictLayout;
        if (jArr != TileRunner.evictLayout) {
            InsetsReader.drawRequest(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.evictLayout;
            int i = this.injectMetric;
            int i2 = i >> 3;
            long j = 255 << ((i & 7) << 3);
            jArr2[i2] = (jArr2[i2] & (~j)) | j;
        }
        InsetsReader.inflateAdapter(this.growPayload, null, 0, this.injectMetric);
        connectPatch();
    }

    public final boolean popBlueprint(Iterable elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int injectMetric = injectMetric();
        gatherAdapter(elements);
        return injectMetric != injectMetric();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
    
        if (((r4 & ((~r4) << 6)) & (-9187201950435737472L)) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        r10 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void purgeNode(Object obj) {
        int i;
        int i2 = 0;
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i3 = hashCode ^ (hashCode << 16);
        int i4 = i3 & 127;
        int i5 = this.injectMetric;
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
                } else {
                    j3 &= j3 - 1;
                }
            }
            i2 += 8;
            i6 = i7 + i2;
        }
        if (i >= 0) {
            findTask(i);
        }
    }

    public final int reduceScope(Object obj) {
        int hashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i = hashCode ^ (hashCode << 16);
        int i2 = i >>> 7;
        int i3 = i & 127;
        int i4 = this.injectMetric;
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
                int notifyMessage = notifyMessage(i2);
                if (this.releaseHeader == 0 && ((this.evictLayout[notifyMessage >> 3] >> ((notifyMessage & 7) << 3)) & 255) != 254) {
                    drawField();
                    notifyMessage = notifyMessage(i2);
                }
                this.detachStream++;
                int i10 = this.releaseHeader;
                long[] jArr2 = this.evictLayout;
                int i11 = notifyMessage >> 3;
                long j5 = jArr2[i11];
                int i12 = (notifyMessage & 7) << 3;
                this.releaseHeader = i10 - (((j5 >> i12) & 255) == 128 ? 1 : 0);
                int i13 = this.injectMetric;
                long j6 = ((~(255 << i12)) & j5) | (j2 << i12);
                jArr2[i11] = j6;
                jArr2[(((notifyMessage - 7) & i13) + (i13 & 7)) >> 3] = j6;
                return notifyMessage;
            }
            i6 += 8;
            i5 = (i5 + i6) & i4;
            i3 = i9;
        }
    }

    public final void resetDelta(int i) {
        int max = i > 0 ? Math.max(7, TileRunner.detachStream(i)) : 0;
        this.injectMetric = max;
        attachConfig(max);
        this.growPayload = max == 0 ? IndicatorProvider.injectMetric : new Object[max];
    }

    public final void serializeOffset() {
        long j;
        long[] jArr = this.evictLayout;
        int i = this.injectMetric;
        Object[] objArr = this.growPayload;
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
                int notifyMessage = notifyMessage(i9);
                int i10 = i9 & i;
                int i11 = i3;
                if (((notifyMessage - i10) & i) / 8 == ((i6 - i10) & i) / 8) {
                    jArr[i7] = ((r7 & 127) << i8) | ((~(255 << i8)) & jArr[i7]);
                    jArr[PluginInspector.resetValue(jArr)] = (jArr[i11] & j3) | Long.MIN_VALUE;
                    i6++;
                    i3 = i11;
                } else {
                    int i12 = notifyMessage >> 3;
                    long j5 = jArr[i12];
                    int i13 = (notifyMessage & 7) << 3;
                    if (((j5 >> i13) & 255) == 128) {
                        j = j3;
                        jArr[i12] = ((r7 & 127) << i13) | (j5 & (~(255 << i13)));
                        jArr[i7] = (jArr[i7] & (~(255 << i8))) | (128 << i8);
                        objArr[notifyMessage] = objArr[i6];
                        objArr[i6] = null;
                    } else {
                        j = j3;
                        jArr[i12] = ((r7 & 127) << i13) | (j5 & (~(255 << i13)));
                        Object obj2 = objArr[notifyMessage];
                        objArr[notifyMessage] = objArr[i6];
                        objArr[i6] = obj2;
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
        connectPatch();
    }

    public final boolean syncScope(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Object[] objArr = this.growPayload;
        int i = this.detachStream;
        long[] jArr = this.evictLayout;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128) {
                            int i5 = (i2 << 3) + i4;
                            if (!CursorCollector.updateAction(elements, objArr[i5])) {
                                findTask(i5);
                            }
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    }
                }
                if (i2 == length) {
                    break;
                }
                i2++;
            }
        }
        return i != this.detachStream;
    }

    public final boolean updateTimer(Object obj) {
        int injectMetric = injectMetric();
        this.growPayload[reduceScope(obj)] = obj;
        return injectMetric() != injectMetric;
    }

    public /* synthetic */ CustomStore(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 6 : i);
    }
}
