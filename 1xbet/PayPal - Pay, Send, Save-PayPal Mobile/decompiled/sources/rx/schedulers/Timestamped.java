package rx.schedulers;

/* loaded from: classes18.dex */
public final class Timestamped<T> {
    private final T getHighResolutionOutputSizeshNQ4ISI;
    private final long getHighSpeedVideoFpsRangesFor;

    public Timestamped(long j, T t) {
        this.getHighResolutionOutputSizeshNQ4ISI = t;
        this.getHighSpeedVideoFpsRangesFor = j;
    }

    public final long getTimestampMillis() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final T getValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final boolean equals(java.lang.Object obj) {
        T t;
        T t2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof rx.schedulers.Timestamped)) {
            return false;
        }
        rx.schedulers.Timestamped timestamped = (rx.schedulers.Timestamped) obj;
        return this.getHighSpeedVideoFpsRangesFor == timestamped.getHighSpeedVideoFpsRangesFor && ((t = this.getHighResolutionOutputSizeshNQ4ISI) == (t2 = timestamped.getHighResolutionOutputSizeshNQ4ISI) || (t != null && t.equals(t2)));
    }

    public final int hashCode() {
        long j = this.getHighSpeedVideoFpsRangesFor;
        int i = (int) (j ^ (j >>> 32));
        T t = this.getHighResolutionOutputSizeshNQ4ISI;
        return ((i + 31) * 31) + (t == null ? 0 : t.hashCode());
    }

    public final java.lang.String toString() {
        long j = this.getHighSpeedVideoFpsRangesFor;
        return java.lang.String.format("Timestamped(timestampMillis = %d, value = %s)", java.lang.Long.valueOf(j), this.getHighResolutionOutputSizeshNQ4ISI.toString());
    }
}
