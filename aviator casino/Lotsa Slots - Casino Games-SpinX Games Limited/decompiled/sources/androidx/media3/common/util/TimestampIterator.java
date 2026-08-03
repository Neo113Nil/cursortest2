package androidx.media3.common.util;

/* loaded from: classes2.dex */
public interface TimestampIterator {

    /* renamed from: androidx.media3.common.util.TimestampIterator$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static long $default$getLastTimestampUs(androidx.media3.common.util.TimestampIterator _this) {
            return -9223372036854775807L;
        }
    }

    androidx.media3.common.util.TimestampIterator copyOf();

    long getLastTimestampUs();

    boolean hasNext();

    long next();
}
