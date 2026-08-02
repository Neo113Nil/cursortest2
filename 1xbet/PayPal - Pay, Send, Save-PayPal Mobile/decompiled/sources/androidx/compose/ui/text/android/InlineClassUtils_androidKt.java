package androidx.compose.ui.text.android;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0080\b¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0018\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\u0007\u0010\b\u001a\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0003H\u0080\b¢\u0006\u0004\b\t\u0010\b"}, d2 = {"", "val1", "val2", "", "packInts", "(II)J", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "unpackInt1", "(J)I", "unpackInt2"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InlineClassUtils_androidKt {
    public static final long packInts(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final int unpackInt1(long j) {
        return (int) (j >> 32);
    }

    public static final int unpackInt2(long j) {
        return (int) (j & 4294967295L);
    }
}
