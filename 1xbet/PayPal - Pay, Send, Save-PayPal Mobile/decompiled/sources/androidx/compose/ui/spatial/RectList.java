package androidx.compose.ui.spatial;

@kotlin.Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJg\u0010\u0017\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0004¢\u0006\u0004\b\u0017\u0010\u0018JU\u0010\u001d\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010 J5\u0010!\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J%\u0010#\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012¢\u0006\u0004\b#\u0010$J\u001d\u0010%\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b%\u0010&J5\u0010'\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b'\u0010(J=\u0010)\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004¢\u0006\u0004\b)\u0010*J%\u0010.\u001a\u00020\t2\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0004¢\u0006\u0004\b.\u0010/J'\u00101\u001a\u00020\t2\u0006\u0010\u0005\u001a\u0002002\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b3\u00104J;\u00107\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00042$\u00106\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t05¢\u0006\u0004\b7\u00108J/\u0010:\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u00042\u0018\u00106\u001a\u0014\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\t09¢\u0006\u0004\b:\u0010;J\u0015\u0010<\u001a\u0002002\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b<\u0010=J\u0018\u0010>\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b>\u0010 J\u0015\u0010?\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b?\u0010@J\u0015\u0010A\u001a\u0002002\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\bA\u0010=JD\u0010C\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0BH\u0086\b¢\u0006\u0004\bC\u0010DJD\u0010E\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0BH\u0086\b¢\u0006\u0004\bE\u0010DJD\u0010F\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0BH\u0086\b¢\u0006\u0004\bF\u0010DJ<\u0010H\u001a\u00020\t2*\u00106\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0GH\u0086\b¢\u0006\u0004\bH\u0010IJ4\u0010C\u001a\u00020\t2\u0006\u0010J\u001a\u00020\u00042\u0006\u0010K\u001a\u00020\u00042\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0BH\u0086\b¢\u0006\u0004\bC\u0010LJD\u0010N\u001a\u00020\t2\u0006\u0010M\u001a\u00020\u00042*\u00106\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0GH\u0086\b¢\u0006\u0004\bN\u0010OJ7\u0010R\u001a\u00020Q2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0000¢\u0006\u0004\bR\u0010SJ\u0090\u0001\u0010W\u001a\u00020\t2\u0006\u0010P\u001a\u00020\u00042\u0006\u0010T\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042N\u00106\u001aJ\u0012\t\u0012\u00070\u0004¢\u0006\u0002\bV\u0012\t\u0012\u00070\u0004¢\u0006\u0002\bV\u0012\t\u0012\u00070\u0004¢\u0006\u0002\bV\u0012\t\u0012\u00070\u0004¢\u0006\u0002\bV\u0012\t\u0012\u00070\u0004¢\u0006\u0002\bV\u0012\t\u0012\u00070\u0004¢\u0006\u0002\bV\u0012\u0004\u0012\u00020\t0UH\u0086\b¢\u0006\u0004\bW\u0010XJ8\u0010Y\u001a\u00020\u00042\u0006\u0010P\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\bY\u0010ZJ\r\u0010[\u001a\u00020\t¢\u0006\u0004\b[\u0010\u0003J\r\u0010\\\u001a\u00020\t¢\u0006\u0004\b\\\u0010\u0003J0\u0010^\u001a\u00020\t2\u001e\u00106\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020\t0]H\u0086\b¢\u0006\u0004\b^\u0010_J\r\u0010a\u001a\u00020`¢\u0006\u0004\ba\u0010bR\u0016\u0010c\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010e\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\be\u0010dR\u0016\u0010f\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0011\u0010j\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\bh\u0010i"}, d2 = {"Landroidx/compose/ui/spatial/RectList;", "", "<init>", "()V", "", "p0", "p1", "", "p2", "", "getHighSpeedVideoFpsRanges", "(II[J)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "l", "t", "r", util.h.xy.cb.b.f1091, "parentId", "", "focusable", "gesturable", "hasCallbacks", "parentIndexInRectList", "insert", "(IIIIIIZZZI)V", "offsetFromParentX", "offsetFromParentY", "width", "height", "insertBasedOnParentOffset", "(IIIIIIZZZ)V", "remove", "(I)Z", "update", "(IIIII)Z", "updateFlagsFor", "(IZZ)Z", "updateHasCallbacks", "(IZ)Z", "move", "(IIIII)V", "moveBasedOnParentOffset", "(IIIIII)V", "id", "deltaX", "deltaY", "updateSubhierarchy", "(III)V", "", "getHighResolutionOutputSizeshNQ4ISI", "(JII)V", "markUpdated", "(I)V", "Lkotlin/Function4;", "block", "withRect", "(ILkotlin/jvm/functions/Function4;)Z", "Lkotlin/Function2;", "withTopLeftBottomRight", "(ILkotlin/jvm/functions/Function2;)Z", "getTopLeft", "(I)J", "contains", "indexOf", "(I)I", "metaFor", "Lkotlin/Function1;", "forEachIntersection", "(IIIILkotlin/jvm/functions/Function1;)V", "forEachGesturableIntersection", "forEachFocusableIntersection", "Lkotlin/Function5;", "forEachRect", "(Lkotlin/jvm/functions/Function5;)V", "x", "y", "(IILkotlin/jvm/functions/Function1;)V", "index", "forEachIntersectingRectWithValueAt", "(ILkotlin/jvm/functions/Function5;)V", "searchAxis", "", "neighborsScoredByDistance$ui", "(IIIII)[I", "k", "Lkotlin/Function6;", "Lkotlin/ParameterName;", "findKNearestNeighbors", "(IIIIIILkotlin/jvm/functions/Function6;)V", "findNearestNeighbor", "(IIIII)I", "defragment", "clearUpdated", "Lkotlin/Function3;", "forEachUpdatedRect", "(Lkotlin/jvm/functions/Function3;)V", "", "debugString", "()Ljava/lang/String;", "items", "[J", com.datadog.android.trace.api.DatadogTracingConstants.LogAttributes.STACK, "itemsSize", com.visa.cbp.getEncExpo.warmup, "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RectList {
    public static final int $stable = 8;
    public int itemsSize;
    public long[] items = new long[192];
    public long[] stack = new long[192];

    public final int getSize() {
        return this.itemsSize / 3;
    }

    private final void getHighSpeedVideoFpsRanges(int p0, int p1, long[] p2) {
        int max = java.lang.Math.max(p0 * 2, p1 + 3);
        long[] copyOf = java.util.Arrays.copyOf(p2, max);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        this.items = copyOf;
        long[] copyOf2 = java.util.Arrays.copyOf(this.stack, max);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf2, "");
        this.stack = copyOf2;
    }

    public final void insertBasedOnParentOffset(int value, int parentId, int offsetFromParentX, int offsetFromParentY, int width, int height, boolean focusable, boolean gesturable, boolean hasCallbacks) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            if ((((int) jArr[i2 + 2]) & 33554431) == parentId) {
                long j = jArr[i2];
                int i3 = ((int) (j >> 32)) + offsetFromParentX;
                int i4 = ((int) j) + offsetFromParentY;
                insert(value & 33554431, i3, i4, i3 + width, i4 + height, parentId, focusable, gesturable, hasCallbacks, i2);
                return;
            }
        }
    }

    public final boolean remove(int value) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            int i3 = i2 + 2;
            if ((((int) jArr[i3]) & 33554431) == (33554431 & value)) {
                jArr[i2] = -1;
                jArr[i2 + 1] = -1;
                jArr[i3] = androidx.compose.ui.spatial.RectListKt.getTombStone();
                return true;
            }
        }
        return false;
    }

    public final boolean update(int value, int l, int t, int r, int b) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            int i3 = i2 + 2;
            long j = jArr[i3];
            if ((((int) j) & 33554431) == (33554431 & value)) {
                jArr[i2] = (l << 32) | (t & 4294967295L);
                jArr[i2 + 1] = (r << 32) | (b & 4294967295L);
                jArr[i3] = (((j >> 63) & 1) << 60) | j;
                return true;
            }
        }
        return false;
    }

    public final boolean updateFlagsFor(int value, boolean focusable, boolean gesturable) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            int i3 = i2 + 2;
            long j = jArr[i3];
            if ((((int) j) & 33554431) == (33554431 & value)) {
                jArr[i3] = ((focusable ? 1L : 0L) * kotlinx.coroutines.internal.LockFreeTaskQueueCore.CLOSED_MASK) | (j & (-6917529027641081857L)) | ((gesturable ? 1L : 0L) * 4611686018427387904L);
                return true;
            }
        }
        return false;
    }

    public final boolean updateHasCallbacks(int value, boolean hasCallbacks) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            int i3 = i2 + 2;
            long j = jArr[i3];
            if ((((int) j) & 33554431) == (33554431 & value)) {
                long j2 = hasCallbacks ? 1L : 0L;
                jArr[i3] = (j2 * kotlinx.coroutines.internal.LockFreeTaskQueueCore.FROZEN_MASK) | (j & 8070450532247928831L) | (Long.MIN_VALUE * j2);
                return true;
            }
        }
        return false;
    }

    public final void move(int value, int l, int t, int r, int b) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            int i3 = i2 + 2;
            long j = jArr[i3];
            if ((((int) j) & 33554431) == (value & 33554431)) {
                long j2 = jArr[i2];
                jArr[i2] = (t & 4294967295L) | (l << 32);
                jArr[i2 + 1] = (r << 32) | (b & 4294967295L);
                jArr[i3] = (((j >> 63) & 1) << 60) | j;
                int i4 = l - ((int) (j2 >> 32));
                int i5 = t - ((int) j2);
                if ((i4 != 0) || (i5 != 0)) {
                    getHighResolutionOutputSizeshNQ4ISI((androidx.compose.ui.spatial.RectListKt.getEverythingButParentId() & j) | ((33554431 & (i2 + 3)) << 25), i4, i5);
                    return;
                }
                return;
            }
        }
    }

    public final void moveBasedOnParentOffset(int value, int parentId, int offsetFromParentX, int offsetFromParentY, int width, int height) {
        int i;
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        int i3 = 0;
        while (i3 < jArr.length - 2 && i3 < i2) {
            if ((((int) jArr[i3 + 2]) & 33554431) == parentId) {
                long j = jArr[i3];
                int i4 = ((int) (j >> 32)) + offsetFromParentX;
                int i5 = ((int) j) + offsetFromParentY;
                while (true) {
                    i = i3 + 3;
                    if (i >= jArr.length - 2 || i >= i2) {
                        break;
                    }
                    int i6 = i3 + 5;
                    long j2 = jArr[i6];
                    if ((((int) j2) & 33554431) == (value & 33554431)) {
                        long j3 = jArr[i];
                        int i7 = i4 - ((int) (j3 >> 32));
                        int i8 = i5 - ((int) j3);
                        jArr[i] = (i5 & 4294967295L) | (i4 << 32);
                        jArr[i3 + 4] = ((i4 + width) << 32) | ((i5 + height) & 4294967295L);
                        jArr[i6] = (((j2 >> 63) & 1) << 60) | j2;
                        if (i7 == 0 && i8 == 0) {
                            return;
                        }
                        getHighResolutionOutputSizeshNQ4ISI((androidx.compose.ui.spatial.RectListKt.getEverythingButParentId() & j2) | (((i3 + 6) & 33554431) << 25), i7, i8);
                        return;
                    }
                    i3 = i;
                }
                i3 = i;
            }
            i3 += 3;
        }
    }

    public final void updateSubhierarchy(int id, int deltaX, int deltaY) {
        getHighResolutionOutputSizeshNQ4ISI((java.lang.Math.min(this.itemsSize / 3, 1023) << 50) | (id & 33554431), deltaX, deltaY);
    }

    private final void getHighResolutionOutputSizeshNQ4ISI(long p0, int p1, int p2) {
        int i;
        int i2;
        char c;
        long[] jArr = this.items;
        long[] jArr2 = this.stack;
        getSize();
        jArr2[0] = p0;
        int i3 = 1;
        while (i3 > 0) {
            i3--;
            long j = jArr2[i3];
            int i4 = (int) j;
            int i5 = 33554431;
            int i6 = ((int) (j >> 25)) & 33554431;
            char c2 = 1023;
            int i7 = ((int) (j >> 50)) & 1023;
            int i8 = i7 == 1023 ? this.itemsSize : (i7 * 3) + i6;
            if (i6 < 0) {
                return;
            }
            while (i6 < jArr.length - 2 && i6 < i8) {
                int i9 = i6 + 2;
                long j2 = jArr[i9];
                if ((((int) (j2 >> 25)) & i5) == (i4 & i5)) {
                    long j3 = jArr[i6];
                    int i10 = i6 + 1;
                    i = i4;
                    long j4 = jArr[i10];
                    jArr[i6] = ((((int) j3) + p2) & 4294967295L) | ((((int) (j3 >> 32)) + p1) << 32);
                    jArr[i10] = ((((int) j4) + p2) & 4294967295L) | ((((int) (j4 >> 32)) + p1) << 32);
                    jArr[i9] = (((j2 >> 63) & 1) << 60) | j2;
                    c = 1023;
                    if ((((int) (j2 >> 50)) & 1023) > 0) {
                        i2 = 33554431;
                        jArr2[i3] = (((i6 + 3) & 33554431) << 25) | (androidx.compose.ui.spatial.RectListKt.getEverythingButParentId() & j2);
                        i3++;
                    } else {
                        i2 = 33554431;
                    }
                } else {
                    i = i4;
                    i2 = i5;
                    c = c2;
                }
                i6 += 3;
                i4 = i;
                c2 = c;
                i5 = i2;
            }
        }
    }

    public final void markUpdated(int value) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            int i3 = i2 + 2;
            long j = jArr[i3];
            if ((((int) j) & 33554431) == (33554431 & value)) {
                jArr[i3] = (((j >> 63) & 1) << 60) | j;
                return;
            }
        }
    }

    public final boolean withRect(int value, kotlin.jvm.functions.Function4<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> block) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            if ((((int) jArr[i2 + 2]) & 33554431) == (33554431 & value)) {
                long j = jArr[i2];
                long j2 = jArr[i2 + 1];
                block.invoke(java.lang.Integer.valueOf((int) (j >> 32)), java.lang.Integer.valueOf((int) j), java.lang.Integer.valueOf((int) (j2 >> 32)), java.lang.Integer.valueOf((int) j2));
                return true;
            }
        }
        return false;
    }

    public final boolean withTopLeftBottomRight(int value, kotlin.jvm.functions.Function2<? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> block) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            if ((((int) jArr[i2 + 2]) & 33554431) == (33554431 & value)) {
                block.invoke(java.lang.Long.valueOf(jArr[i2]), java.lang.Long.valueOf(jArr[i2 + 1]));
                return true;
            }
        }
        return false;
    }

    public final long getTopLeft(int value) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            if ((((int) jArr[i2 + 2]) & 33554431) == (33554431 & value)) {
                return jArr[i2];
            }
        }
        return Long.MAX_VALUE;
    }

    public final boolean contains(int value) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            if ((((int) jArr[i2 + 2]) & 33554431) == (33554431 & value)) {
                return true;
            }
        }
        return false;
    }

    public final int indexOf(int value) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            if ((((int) jArr[i2 + 2]) & 33554431) == (33554431 & value)) {
                return i2;
            }
        }
        return -1;
    }

    public final long metaFor(int value) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j = jArr[i2 + 2];
            if ((((int) j) & 33554431) == (33554431 & value)) {
                return j;
            }
        }
        return androidx.compose.ui.spatial.RectListKt.getTombStone();
    }

    public final void forEachIntersection(int l, int t, int r, int b, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> block) {
        long j = l;
        long j2 = t;
        long j3 = r;
        long j4 = b;
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            if (((((((j3 << 32) | (j4 & 4294967295L)) - jArr[i2]) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) | ((jArr[i2 + 1] - ((j << 32) | (j2 & 4294967295L))) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                block.invoke(java.lang.Integer.valueOf(((int) jArr[i2 + 2]) & 33554431));
            }
        }
    }

    public final void forEachGesturableIntersection(int l, int t, int r, int b, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> block) {
        long j = l;
        long j2 = t;
        long j3 = r;
        long j4 = b;
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j5 = jArr[i2 + 2];
            if ((((int) (j5 >> 62)) & 1) != 0) {
                if (((((((j3 << 32) | (j4 & 4294967295L)) - jArr[i2]) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) | ((jArr[i2 + 1] - ((j << 32) | (j2 & 4294967295L))) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    block.invoke(java.lang.Integer.valueOf(((int) j5) & 33554431));
                }
            }
        }
    }

    public final void forEachFocusableIntersection(int l, int t, int r, int b, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> block) {
        long j = l;
        long j2 = t;
        long j3 = r;
        long j4 = b;
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j5 = jArr[i2 + 2];
            if ((((int) (j5 >> 61)) & 1) != 0) {
                if (((((((j3 << 32) | (j4 & 4294967295L)) - jArr[i2]) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) | ((jArr[i2 + 1] - ((j << 32) | (j2 & 4294967295L))) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    block.invoke(java.lang.Integer.valueOf(((int) j5) & 33554431));
                }
            }
        }
    }

    public final void forEachRect(kotlin.jvm.functions.Function5<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> block) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j = jArr[i2];
            long j2 = jArr[i2 + 1];
            block.invoke(java.lang.Integer.valueOf(33554431 & ((int) jArr[i2 + 2])), java.lang.Integer.valueOf((int) (j >> 32)), java.lang.Integer.valueOf((int) j), java.lang.Integer.valueOf((int) (j2 >> 32)), java.lang.Integer.valueOf((int) j2));
        }
    }

    public final void forEachIntersection(int x, int y, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> block) {
        long j = (y & 4294967295L) | (x << 32);
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            if (((((j - jArr[i2]) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) | ((jArr[i2 + 1] - j) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                block.invoke(java.lang.Integer.valueOf(((int) jArr[i2 + 2]) & 33554431));
            }
        }
    }

    public final void forEachIntersectingRectWithValueAt(int index, kotlin.jvm.functions.Function5<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> block) {
        int i = index;
        long[] jArr = this.items;
        int i2 = this.itemsSize;
        long j = jArr[i];
        long j2 = jArr[i + 1];
        int i3 = 0;
        while (i3 < jArr.length - 2 && i3 < i2) {
            if (i3 != i) {
                long j3 = jArr[i3];
                long j4 = jArr[i3 + 1];
                if (((((j2 - j3) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32) | ((j4 - j) - androidx.compose.ui.geometry.InlineClassHelperKt.Uint64Low32)) & (-9223372034707292160L)) == 0) {
                    block.invoke(java.lang.Integer.valueOf((int) (j3 >> 32)), java.lang.Integer.valueOf((int) j3), java.lang.Integer.valueOf((int) (j4 >> 32)), java.lang.Integer.valueOf((int) j4), java.lang.Integer.valueOf(33554431 & ((int) jArr[i3 + 2])));
                }
            }
            i3 += 3;
            i = index;
        }
    }

    public final int[] neighborsScoredByDistance$ui(int searchAxis, int l, int t, int r, int b) {
        long[] jArr = this.items;
        int i = this.itemsSize / 3;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 * 3;
            if (i3 < 0 || i3 >= jArr.length - 1) {
                break;
            }
            long j = jArr[i3];
            long j2 = jArr[i3 + 1];
            iArr[i2] = androidx.compose.ui.spatial.RectListKt.distanceScore(searchAxis, l, t, r, b, (int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
        }
        return iArr;
    }

    public final void findKNearestNeighbors(int searchAxis, int k, int l, int t, int r, int b, kotlin.jvm.functions.Function6<? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> block) {
        int[] iArr;
        int i;
        int[] neighborsScoredByDistance$ui = neighborsScoredByDistance$ui(searchAxis, l, t, r, b);
        long[] jArr = this.items;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 <= k) {
            int i5 = Integer.MAX_VALUE;
            int i6 = 0;
            while (i6 < neighborsScoredByDistance$ui.length) {
                int i7 = neighborsScoredByDistance$ui[i6];
                if (i7 > i2) {
                    i5 = java.lang.Math.min(i5, i7);
                }
                if (i7 == i2) {
                    int i8 = i6 * 3;
                    long j = jArr[i8];
                    long j2 = jArr[i8 + 1];
                    i = i3;
                    iArr = neighborsScoredByDistance$ui;
                    block.invoke(java.lang.Integer.valueOf(i7), java.lang.Integer.valueOf(((int) jArr[i8 + 2]) & 33554431), java.lang.Integer.valueOf((int) (j >> 32)), java.lang.Integer.valueOf((int) j), java.lang.Integer.valueOf((int) (j2 >> 32)), java.lang.Integer.valueOf((int) j2));
                    i4++;
                    if (i4 == k) {
                        return;
                    }
                } else {
                    iArr = neighborsScoredByDistance$ui;
                    i = i3;
                }
                i6++;
                i3 = i;
                neighborsScoredByDistance$ui = iArr;
            }
            i3++;
            i2 = i5;
        }
    }

    public final int findNearestNeighbor(int searchAxis, int l, int t, int r, int b) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        int i2 = Integer.MAX_VALUE;
        int i3 = -1;
        for (int i4 = 0; i4 < jArr.length - 2 && i4 < i; i4 += 3) {
            long j = jArr[i4];
            int i5 = i4 + 1;
            long j2 = jArr[i5];
            int distanceScore = androidx.compose.ui.spatial.RectListKt.distanceScore(searchAxis, l, t, r, b, (int) (j >> 32), (int) j, (int) (j2 >> 32), (int) j2);
            boolean z = (distanceScore < i2) & (distanceScore > 0);
            if (z) {
                i2 = distanceScore;
            }
            if (z) {
                i3 = i5;
            }
        }
        if (i3 < 0 || i3 >= jArr.length) {
            return -1;
        }
        return ((int) jArr[i3]) & 33554431;
    }

    public final void defragment() {
        long[] jArr = this.items;
        int i = this.itemsSize;
        long[] jArr2 = this.stack;
        int i2 = 0;
        for (int i3 = 0; i3 < jArr.length - 2 && i2 < jArr2.length - 2 && i3 < i; i3 += 3) {
            int i4 = i3 + 2;
            if (jArr[i4] != androidx.compose.ui.spatial.RectListKt.getTombStone()) {
                jArr2[i2] = jArr[i3];
                jArr2[i2 + 1] = jArr[i3 + 1];
                jArr2[i2 + 2] = jArr[i4];
                i2 += 3;
            }
        }
        this.itemsSize = i2;
        this.items = jArr2;
        this.stack = jArr;
    }

    public final void clearUpdated() {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            int i3 = i2 + 2;
            jArr[i3] = jArr[i3] & (-1152921504606846977L);
        }
    }

    public final void forEachUpdatedRect(kotlin.jvm.functions.Function3<? super java.lang.Integer, ? super java.lang.Long, ? super java.lang.Long, kotlin.Unit> block) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        for (int i2 = 0; i2 < jArr.length - 2 && i2 < i; i2 += 3) {
            long j = jArr[i2 + 2];
            if ((((int) (j >> 60)) & 1) != 0) {
                block.invoke(java.lang.Integer.valueOf(((int) j) & 33554431), java.lang.Long.valueOf(jArr[i2]), java.lang.Long.valueOf(jArr[i2 + 1]));
            }
        }
    }

    public final java.lang.String debugString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        long[] jArr = this.items;
        int i = this.itemsSize;
        int i2 = 0;
        while (i2 < jArr.length - 2 && i2 < i) {
            long j = jArr[i2];
            long j2 = jArr[i2 + 1];
            long j3 = jArr[i2 + 2];
            long[] jArr2 = jArr;
            int i3 = i;
            int i4 = (int) (j >> 32);
            int i5 = (int) j;
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("id=");
            sb2.append(((int) j3) & 33554431);
            sb2.append(", rect=[");
            sb2.append(i4);
            sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            sb2.append(i5);
            sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            sb2.append((int) (j2 >> 32));
            sb2.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            sb2.append((int) j2);
            sb2.append("], parent=");
            sb2.append(((int) (j3 >> 25)) & 33554431);
            sb2.append(", lastChildOffset=");
            sb2.append(((int) (j3 >> 50)) & 1023);
            sb2.append(", updated=");
            sb2.append(((int) (j3 >> 60)) & 1);
            sb2.append(", focusable=");
            sb2.append(((int) (j3 >> 61)) & 1);
            sb2.append(", gesturable=");
            sb2.append(((int) (j3 >> 62)) & 1);
            sb.append(sb2.toString());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
            sb.append('\n');
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sb, "");
            i2 += 3;
            i = i3;
            jArr = jArr2;
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final void insert(int value, int l, int t, int r, int b, int parentId, boolean focusable, boolean gesturable, boolean hasCallbacks, int parentIndexInRectList) {
        long[] jArr = this.items;
        int i = this.itemsSize;
        int i2 = i + 3;
        this.itemsSize = i2;
        int length = jArr.length;
        if (length <= i2) {
            getHighSpeedVideoFpsRanges(length, i, jArr);
        }
        long[] jArr2 = this.items;
        jArr2[i] = (l << 32) | (t & 4294967295L);
        jArr2[i + 1] = (r << 32) | (b & 4294967295L);
        int i3 = parentId & 33554431;
        jArr2[i + 2] = ((hasCallbacks ? 1L : 0L) << 63) | ((gesturable ? 1L : 0L) << 62) | ((focusable ? 1L : 0L) << 61) | kotlinx.coroutines.internal.LockFreeTaskQueueCore.FROZEN_MASK | (java.lang.Math.min(0, 1023) << 50) | (i3 << 25) | (value & 33554431);
        if (parentId >= 0) {
            for (int i4 = parentIndexInRectList != -1 ? parentIndexInRectList : i - 3; i4 >= 0; i4 -= 3) {
                int i5 = i4 + 2;
                long j = jArr2[i5];
                if ((((int) j) & 33554431) == i3) {
                    jArr2[i5] = (java.lang.Math.min((i - i4) / 3, 1023) << 50) | (j & androidx.compose.ui.spatial.RectListKt.getEverythingButLastChildOffset());
                    return;
                }
            }
        }
    }
}
