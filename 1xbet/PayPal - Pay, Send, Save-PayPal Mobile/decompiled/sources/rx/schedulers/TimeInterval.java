package rx.schedulers;

/* loaded from: classes18.dex */
public class TimeInterval<T> {
    private final long Camera2StreamConfigurationMap;
    private final T getHighResolutionOutputSizeshNQ4ISI;

    public TimeInterval(long j, T t) {
        this.getHighResolutionOutputSizeshNQ4ISI = t;
        this.Camera2StreamConfigurationMap = j;
    }

    public long getIntervalInMilliseconds() {
        return this.Camera2StreamConfigurationMap;
    }

    public T getValue() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public int hashCode() {
        long j = this.Camera2StreamConfigurationMap;
        int i = (int) (j ^ (j >>> 32));
        T t = this.getHighResolutionOutputSizeshNQ4ISI;
        return ((i + 31) * 31) + (t == null ? 0 : t.hashCode());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        rx.schedulers.TimeInterval timeInterval = (rx.schedulers.TimeInterval) obj;
        if (this.Camera2StreamConfigurationMap != timeInterval.Camera2StreamConfigurationMap) {
            return false;
        }
        T t = this.getHighResolutionOutputSizeshNQ4ISI;
        if (t == null) {
            if (timeInterval.getHighResolutionOutputSizeshNQ4ISI != null) {
                return false;
            }
        } else if (!t.equals(timeInterval.getHighResolutionOutputSizeshNQ4ISI)) {
            return false;
        }
        return true;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TimeInterval [intervalInMilliseconds=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(", value=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append("]");
        return sb.toString();
    }
}
