package androidx.media3.common.util;

/* loaded from: classes7.dex */
public interface TimestampIterator {
    androidx.media3.common.util.TimestampIterator copyOf();

    default long getLastTimestampUs() {
        return androidx.media3.common.C.TIME_UNSET;
    }

    boolean hasNext();

    long next();
}
