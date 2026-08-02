package io.reactivex.schedulers;

/* loaded from: classes3.dex */
public final class Timed<T> {
    final T Camera2StreamConfigurationMap;
    final java.util.concurrent.TimeUnit getHighSpeedVideoFpsRanges;
    final long getHighSpeedVideoSizes;

    public Timed(T t, long j, java.util.concurrent.TimeUnit timeUnit) {
        this.Camera2StreamConfigurationMap = t;
        this.getHighSpeedVideoSizes = j;
        this.getHighSpeedVideoFpsRanges = (java.util.concurrent.TimeUnit) io.reactivex.internal.functions.ObjectHelper.requireNonNull(timeUnit, "unit is null");
    }

    public final T value() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.util.concurrent.TimeUnit unit() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final long time() {
        return this.getHighSpeedVideoSizes;
    }

    public final long time(java.util.concurrent.TimeUnit timeUnit) {
        return timeUnit.convert(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof io.reactivex.schedulers.Timed)) {
            return false;
        }
        io.reactivex.schedulers.Timed timed = (io.reactivex.schedulers.Timed) obj;
        return io.reactivex.internal.functions.ObjectHelper.equals(this.Camera2StreamConfigurationMap, timed.Camera2StreamConfigurationMap) && this.getHighSpeedVideoSizes == timed.getHighSpeedVideoSizes && io.reactivex.internal.functions.ObjectHelper.equals(this.getHighSpeedVideoFpsRanges, timed.getHighSpeedVideoFpsRanges);
    }

    public final int hashCode() {
        T t = this.Camera2StreamConfigurationMap;
        int hashCode = t != null ? t.hashCode() : 0;
        long j = this.getHighSpeedVideoSizes;
        return (((hashCode * 31) + ((int) (j ^ (j >>> 31)))) * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Timed[time=");
        sb.append(this.getHighSpeedVideoSizes);
        sb.append(", unit=");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append(", value=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append("]");
        return sb.toString();
    }
}
