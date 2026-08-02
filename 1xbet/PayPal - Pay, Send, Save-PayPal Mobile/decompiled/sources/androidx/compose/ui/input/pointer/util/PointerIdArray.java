package androidx.compose.ui.input.pointer.util;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\rJ\u0018\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b\u0017\u0010\rJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u001f\u0010\u001aJ\r\u0010 \u001a\u00020\u0018¢\u0006\u0004\b \u0010\u0003J\u0018\u0010\"\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006H\u0086\b¢\u0006\u0004\b!\u0010\rJ\u0015\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010\rR$\u0010#\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00048\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0012\u0010(\u001a\u00020\u00048Ç\u0002¢\u0006\u0006\u001a\u0004\b'\u0010&R\u0016\u0010+\u001a\u00020\u001c8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b)\u0010*"}, d2 = {"Landroidx/compose/ui/input/pointer/util/PointerIdArray;", "", "<init>", "()V", "", "index", "Landroidx/compose/ui/input/pointer/PointerId;", "get-_I2yYro", "(I)J", "get", "pointerId", "", "remove-0FcD4WY", "(J)Z", "remove", "", "pointerIdValue", "removeAt", "(I)Z", "isEmpty", "()Z", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.ADD, "add-0FcD4WY", "", "set", "(IJ)V", "p0", "", "getHighSpeedVideoSizes", "(I)[J", "set-DmW0f2w", "clear", "contains-0FcD4WY", "contains", io.ktor.http.ContentDisposition.Parameters.Size, com.visa.cbp.getEncExpo.warmup, "getSize", "()I", "getLastIndex", "lastIndex", "getHighResolutionOutputSizeshNQ4ISI", "[J", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PointerIdArray {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private long[] getHighSpeedVideoFpsRanges = new long[2];
    private int size;

    public final int getSize() {
        return this.size;
    }

    public final int getLastIndex() {
        return getSize() - 1;
    }

    /* renamed from: get-_I2yYro, reason: not valid java name */
    public final long m7327get_I2yYro(int index) {
        return androidx.compose.ui.input.pointer.PointerId.m7211constructorimpl(this.getHighSpeedVideoFpsRanges[index]);
    }

    /* renamed from: remove-0FcD4WY, reason: not valid java name */
    public final boolean m7328remove0FcD4WY(long pointerId) {
        return remove(pointerId);
    }

    public final boolean remove(long pointerIdValue) {
        int i = this.size;
        int i2 = 0;
        while (i2 < i) {
            if (pointerIdValue == this.getHighSpeedVideoFpsRanges[i2]) {
                int i3 = this.size;
                while (i2 < i3 - 1) {
                    long[] jArr = this.getHighSpeedVideoFpsRanges;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.size--;
                return true;
            }
            i2++;
        }
        return false;
    }

    public final boolean removeAt(int index) {
        int i = this.size;
        if (index >= i) {
            return false;
        }
        while (index < i - 1) {
            long[] jArr = this.getHighSpeedVideoFpsRanges;
            int i2 = index + 1;
            jArr[index] = jArr[i2];
            index = i2;
        }
        this.size--;
        return true;
    }

    public final boolean isEmpty() {
        return this.size == 0;
    }

    public final boolean add(long value) {
        if (contains(value)) {
            return false;
        }
        set(this.size, value);
        return true;
    }

    /* renamed from: add-0FcD4WY, reason: not valid java name */
    public final boolean m7325add0FcD4WY(long pointerId) {
        return add(pointerId);
    }

    public final void set(int index, long value) {
        long[] jArr = this.getHighSpeedVideoFpsRanges;
        if (index >= jArr.length) {
            jArr = getHighSpeedVideoSizes(index + 1);
        }
        jArr[index] = value;
        if (index >= this.size) {
            this.size = index + 1;
        }
    }

    private final long[] getHighSpeedVideoSizes(int p0) {
        long[] jArr = this.getHighSpeedVideoFpsRanges;
        long[] copyOf = java.util.Arrays.copyOf(jArr, java.lang.Math.max(p0, jArr.length * 2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(copyOf, "");
        this.getHighSpeedVideoFpsRanges = copyOf;
        return copyOf;
    }

    /* renamed from: set-DmW0f2w, reason: not valid java name */
    public final void m7329setDmW0f2w(int index, long pointerId) {
        set(index, pointerId);
    }

    public final void clear() {
        this.size = 0;
    }

    /* renamed from: contains-0FcD4WY, reason: not valid java name */
    public final boolean m7326contains0FcD4WY(long pointerId) {
        return contains(pointerId);
    }

    public final boolean contains(long pointerIdValue) {
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.getHighSpeedVideoFpsRanges[i2] == pointerIdValue) {
                return true;
            }
        }
        return false;
    }
}
