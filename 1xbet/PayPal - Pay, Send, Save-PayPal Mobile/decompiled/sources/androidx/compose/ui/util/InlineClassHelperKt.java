package androidx.compose.ui.util;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\t\u0010\b\u001a\u0018\u0010\n\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\n\u0010\b\u001a\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u000b\u0010\b\u001a \u0010\r\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\f2\u0006\u0010\u0002\u001a\u00020\fH\u0086\b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0018\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0003H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0010"}, d2 = {"", "val1", "val2", "", "packFloats", "(FF)J", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "unpackFloat1", "(J)F", "unpackAbsFloat1", "unpackFloat2", "unpackAbsFloat2", "", "packInts", "(II)J", "unpackInt1", "(J)I", "unpackInt2"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InlineClassHelperKt {
    public static final long packInts(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final int unpackInt1(long j) {
        return (int) (j >> 32);
    }

    public static final int unpackInt2(long j) {
        return (int) (j & 4294967295L);
    }

    public static final long packFloats(float f, float f2) {
        return (java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32);
    }

    public static final float unpackFloat1(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float unpackAbsFloat1(long j) {
        return java.lang.Float.intBitsToFloat((int) ((j >> 32) & androidx.collection.SieveCacheKt.NodeLinkMask));
    }

    public static final float unpackFloat2(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static final float unpackAbsFloat2(long j) {
        return java.lang.Float.intBitsToFloat((int) (j & androidx.collection.SieveCacheKt.NodeLinkMask));
    }
}
