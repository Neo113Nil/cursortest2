package androidx.compose.runtime;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u000eJ\u001d\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u0018\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0011\u0010\"\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Landroidx/compose/runtime/BitVector;", "", "<init>", "()V", "", "index", "", "get", "(I)Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "set", "(IZ)V", "nextSet", "(I)I", "nextClear", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "setRange", "(II)V", "", "toString", "()Ljava/lang/String;", "", "getHighResolutionOutputSizeshNQ4ISI", "J", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "", "getHighSpeedVideoFpsRanges", "[J", "getSize", "()I", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class BitVector {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private long Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private long[] getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private long getHighSpeedVideoSizes;

    public BitVector() {
        long[] jArr;
        jArr = androidx.compose.runtime.SlotTableKt.getHighSpeedVideoFpsRangesFor;
        this.getHighResolutionOutputSizeshNQ4ISI = jArr;
    }

    public final int getSize() {
        return (this.getHighResolutionOutputSizeshNQ4ISI.length + 2) * 64;
    }

    public final boolean get(int index) {
        int i;
        if (index < 64) {
            return ((1 << index) & this.Camera2StreamConfigurationMap) != 0;
        }
        if (index < 128) {
            return ((1 << (index - 64)) & this.getHighSpeedVideoSizes) != 0;
        }
        long[] jArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int length = jArr.length;
        return (length == 0 || (i = (index / 64) + (-2)) >= length || ((1 << (index % 64)) & jArr[i]) == 0) ? false : true;
    }

    public final void set(int index, boolean value) {
        if (index < 64) {
            this.Camera2StreamConfigurationMap = ((~(1 << index)) & this.Camera2StreamConfigurationMap) | ((value ? 1L : 0L) << index);
            return;
        }
        if (index < 128) {
            this.getHighSpeedVideoSizes = ((~(1 << (index - 64))) & this.getHighSpeedVideoSizes) | ((value ? 1L : 0L) << index);
            return;
        }
        int i = index / 64;
        int i2 = i - 2;
        int i3 = index % 64;
        long[] jArr = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i2 >= jArr.length) {
            jArr = java.util.Arrays.copyOf(jArr, i - 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jArr, "");
            this.getHighResolutionOutputSizeshNQ4ISI = jArr;
        }
        jArr[i2] = ((~(1 << i3)) & jArr[i2]) | ((value ? 1L : 0L) << i3);
    }

    public final void setRange(int start, int end) {
        long j = start < end ? -1L : 0L;
        this.Camera2StreamConfigurationMap = ((((start < 64 ? 1 : 0) * j) >>> (64 - (java.lang.Math.min(64, end) - start))) << start) | this.Camera2StreamConfigurationMap;
        if (end > 64) {
            int max = java.lang.Math.max(start, 64);
            this.getHighSpeedVideoSizes = (((j * (max < 128 ? 1 : 0)) >>> (128 - (java.lang.Math.min(128, end) - max))) << max) | this.getHighSpeedVideoSizes;
            if (end > 128) {
                for (int max2 = java.lang.Math.max(max, 128); max2 < end; max2++) {
                    set(max2, true);
                }
            }
        }
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("BitVector [");
        int size = getSize();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            if (get(i)) {
                if (!z) {
                    sb.append(", ");
                }
                sb.append(i);
                z = false;
            }
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        return obj;
    }

    public final int nextSet(int index) {
        int numberOfTrailingZeros;
        if (index < 64 && (numberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros((this.Camera2StreamConfigurationMap >>> index) << index)) < 64) {
            return numberOfTrailingZeros;
        }
        if (index < 128) {
            int i = index - 64;
            int numberOfTrailingZeros2 = java.lang.Long.numberOfTrailingZeros((this.getHighSpeedVideoSizes >>> i) << i);
            if (numberOfTrailingZeros2 < 64) {
                return numberOfTrailingZeros2 + 64;
            }
        }
        int max = java.lang.Math.max(index, 128);
        int i2 = (max / 64) - 2;
        long[] jArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int length = jArr.length;
        for (int i3 = i2; i3 < length; i3++) {
            long j = jArr[i3];
            if (i3 == i2) {
                int i4 = max % 64;
                j = (j >>> i4) << i4;
            }
            int numberOfTrailingZeros3 = java.lang.Long.numberOfTrailingZeros(j);
            if (numberOfTrailingZeros3 < 64) {
                return (i3 * 64) + 128 + numberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }

    public final int nextClear(int index) {
        int numberOfTrailingZeros;
        if (index < 64 && (numberOfTrailingZeros = java.lang.Long.numberOfTrailingZeros(((~this.Camera2StreamConfigurationMap) >>> index) << index)) < 64) {
            return numberOfTrailingZeros;
        }
        if (index < 128) {
            int i = index - 64;
            int numberOfTrailingZeros2 = java.lang.Long.numberOfTrailingZeros(((~this.getHighSpeedVideoSizes) >>> i) << i);
            if (numberOfTrailingZeros2 < 64) {
                return numberOfTrailingZeros2 + 64;
            }
        }
        int max = java.lang.Math.max(index, 128);
        int i2 = (max / 64) - 2;
        long[] jArr = this.getHighResolutionOutputSizeshNQ4ISI;
        int length = jArr.length;
        for (int i3 = i2; i3 < length; i3++) {
            long j = ~jArr[i3];
            if (i3 == i2) {
                int i4 = max % 64;
                j = (j >>> i4) << i4;
            }
            int numberOfTrailingZeros3 = java.lang.Long.numberOfTrailingZeros(j);
            if (numberOfTrailingZeros3 < 64) {
                return (i3 * 64) + 128 + numberOfTrailingZeros3;
            }
        }
        return Integer.MAX_VALUE;
    }
}
