package androidx.core.location;

/* loaded from: classes7.dex */
public final class LocationRequestCompat {
    public static final long PASSIVE_INTERVAL = Long.MAX_VALUE;
    public static final int QUALITY_BALANCED_POWER_ACCURACY = 102;
    public static final int QUALITY_HIGH_ACCURACY = 100;
    public static final int QUALITY_LOW_POWER = 104;
    final long Camera2StreamConfigurationMap;
    final long getHighResolutionOutputSizeshNQ4ISI;
    final int getHighSpeedVideoFpsRanges;
    final long getHighSpeedVideoFpsRangesFor;
    final float getHighSpeedVideoSizes;
    final int getOutputFormats;
    final long getOutputMinFrameDuration;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface Quality {
    }

    LocationRequestCompat(long j, int i, long j2, int i2, long j3, float f, long j4) {
        this.Camera2StreamConfigurationMap = j;
        this.getOutputFormats = i;
        this.getOutputMinFrameDuration = j3;
        this.getHighResolutionOutputSizeshNQ4ISI = j2;
        this.getHighSpeedVideoFpsRanges = i2;
        this.getHighSpeedVideoSizes = f;
        this.getHighSpeedVideoFpsRangesFor = j4;
    }

    public final int getQuality() {
        return this.getOutputFormats;
    }

    public final long getIntervalMillis() {
        return this.Camera2StreamConfigurationMap;
    }

    public final long getMinUpdateIntervalMillis() {
        long j = this.getOutputMinFrameDuration;
        return j == -1 ? this.Camera2StreamConfigurationMap : j;
    }

    public final long getDurationMillis() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int getMaxUpdates() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final float getMinUpdateDistanceMeters() {
        return this.getHighSpeedVideoSizes;
    }

    public final long getMaxUpdateDelayMillis() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final android.location.LocationRequest toLocationRequest() {
        return androidx.core.location.LocationRequestCompat.Api31Impl.bU_(this);
    }

    public final android.location.LocationRequest toLocationRequest(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return toLocationRequest();
        }
        return (android.location.LocationRequest) androidx.core.location.LocationRequestCompat.Api19Impl.Camera2StreamConfigurationMap(this, str);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof androidx.core.location.LocationRequestCompat)) {
            return false;
        }
        androidx.core.location.LocationRequestCompat locationRequestCompat = (androidx.core.location.LocationRequestCompat) obj;
        return this.getOutputFormats == locationRequestCompat.getOutputFormats && this.Camera2StreamConfigurationMap == locationRequestCompat.Camera2StreamConfigurationMap && this.getOutputMinFrameDuration == locationRequestCompat.getOutputMinFrameDuration && this.getHighResolutionOutputSizeshNQ4ISI == locationRequestCompat.getHighResolutionOutputSizeshNQ4ISI && this.getHighSpeedVideoFpsRanges == locationRequestCompat.getHighSpeedVideoFpsRanges && java.lang.Float.compare(locationRequestCompat.getHighSpeedVideoSizes, this.getHighSpeedVideoSizes) == 0 && this.getHighSpeedVideoFpsRangesFor == locationRequestCompat.getHighSpeedVideoFpsRangesFor;
    }

    public final int hashCode() {
        int i = this.getOutputFormats;
        long j = this.Camera2StreamConfigurationMap;
        int i2 = (int) (j ^ (j >>> 32));
        long j2 = this.getOutputMinFrameDuration;
        return (((i * 31) + i2) * 31) + ((int) ((j2 >>> 32) ^ j2));
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Request[");
        if (this.Camera2StreamConfigurationMap != Long.MAX_VALUE) {
            sb.append("@");
            androidx.core.util.TimeUtils.formatDuration(this.Camera2StreamConfigurationMap, sb);
            int i = this.getOutputFormats;
            if (i == 100) {
                sb.append(" HIGH_ACCURACY");
            } else if (i == 102) {
                sb.append(" BALANCED");
            } else if (i == 104) {
                sb.append(" LOW_POWER");
            }
        } else {
            sb.append("PASSIVE");
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI != Long.MAX_VALUE) {
            sb.append(", duration=");
            androidx.core.util.TimeUtils.formatDuration(this.getHighResolutionOutputSizeshNQ4ISI, sb);
        }
        if (this.getHighSpeedVideoFpsRanges != Integer.MAX_VALUE) {
            sb.append(", maxUpdates=");
            sb.append(this.getHighSpeedVideoFpsRanges);
        }
        long j = this.getOutputMinFrameDuration;
        if (j != -1 && j < this.Camera2StreamConfigurationMap) {
            sb.append(", minUpdateInterval=");
            androidx.core.util.TimeUtils.formatDuration(this.getOutputMinFrameDuration, sb);
        }
        if (this.getHighSpeedVideoSizes > 0.0d) {
            sb.append(", minUpdateDistance=");
            sb.append(this.getHighSpeedVideoSizes);
        }
        if (this.getHighSpeedVideoFpsRangesFor / 2 > this.Camera2StreamConfigurationMap) {
            sb.append(", maxUpdateDelay=");
            androidx.core.util.TimeUtils.formatDuration(this.getHighSpeedVideoFpsRangesFor, sb);
        }
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }

    public static final class Builder {
        private long Camera2StreamConfigurationMap;
        private float getHighResolutionOutputSizeshNQ4ISI;
        private long getHighSpeedVideoFpsRanges;
        private long getHighSpeedVideoFpsRangesFor;
        private int getHighSpeedVideoSizes;
        private int getInputFormats;
        private long getOutputFormats;

        public Builder(long j) {
            setIntervalMillis(j);
            this.getInputFormats = 102;
            this.getHighSpeedVideoFpsRangesFor = Long.MAX_VALUE;
            this.getHighSpeedVideoSizes = Integer.MAX_VALUE;
            this.getOutputFormats = -1L;
            this.getHighResolutionOutputSizeshNQ4ISI = 0.0f;
            this.Camera2StreamConfigurationMap = 0L;
        }

        public Builder(androidx.core.location.LocationRequestCompat locationRequestCompat) {
            this.getHighSpeedVideoFpsRanges = locationRequestCompat.Camera2StreamConfigurationMap;
            this.getInputFormats = locationRequestCompat.getOutputFormats;
            this.getHighSpeedVideoFpsRangesFor = locationRequestCompat.getHighResolutionOutputSizeshNQ4ISI;
            this.getHighSpeedVideoSizes = locationRequestCompat.getHighSpeedVideoFpsRanges;
            this.getOutputFormats = locationRequestCompat.getOutputMinFrameDuration;
            this.getHighResolutionOutputSizeshNQ4ISI = locationRequestCompat.getHighSpeedVideoSizes;
            this.Camera2StreamConfigurationMap = locationRequestCompat.getHighSpeedVideoFpsRangesFor;
        }

        public final androidx.core.location.LocationRequestCompat.Builder setIntervalMillis(long j) {
            this.getHighSpeedVideoFpsRanges = androidx.core.util.Preconditions.checkArgumentInRange(j, 0L, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        public final androidx.core.location.LocationRequestCompat.Builder setQuality(int i) {
            androidx.core.util.Preconditions.checkArgument(i == 104 || i == 102 || i == 100, "quality must be a defined QUALITY constant, not %d", java.lang.Integer.valueOf(i));
            this.getInputFormats = i;
            return this;
        }

        public final androidx.core.location.LocationRequestCompat.Builder setDurationMillis(long j) {
            this.getHighSpeedVideoFpsRangesFor = androidx.core.util.Preconditions.checkArgumentInRange(j, 1L, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        public final androidx.core.location.LocationRequestCompat.Builder setMaxUpdates(int i) {
            this.getHighSpeedVideoSizes = androidx.core.util.Preconditions.checkArgumentInRange(i, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        public final androidx.core.location.LocationRequestCompat.Builder setMinUpdateIntervalMillis(long j) {
            this.getOutputFormats = androidx.core.util.Preconditions.checkArgumentInRange(j, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        public final androidx.core.location.LocationRequestCompat.Builder clearMinUpdateIntervalMillis() {
            this.getOutputFormats = -1L;
            return this;
        }

        public final androidx.core.location.LocationRequestCompat.Builder setMinUpdateDistanceMeters(float f) {
            this.getHighResolutionOutputSizeshNQ4ISI = f;
            this.getHighResolutionOutputSizeshNQ4ISI = androidx.core.util.Preconditions.checkArgumentInRange(f, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        public final androidx.core.location.LocationRequestCompat.Builder setMaxUpdateDelayMillis(long j) {
            this.Camera2StreamConfigurationMap = j;
            this.Camera2StreamConfigurationMap = androidx.core.util.Preconditions.checkArgumentInRange(j, 0L, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        public final androidx.core.location.LocationRequestCompat build() {
            androidx.core.util.Preconditions.checkState((this.getHighSpeedVideoFpsRanges == Long.MAX_VALUE && this.getOutputFormats == -1) ? false : true, "passive location requests must have an explicit minimum update interval");
            long j = this.getHighSpeedVideoFpsRanges;
            return new androidx.core.location.LocationRequestCompat(j, this.getInputFormats, this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoSizes, java.lang.Math.min(this.getOutputFormats, j), this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        public static android.location.LocationRequest bU_(androidx.core.location.LocationRequestCompat locationRequestCompat) {
            return new android.location.LocationRequest.Builder(locationRequestCompat.getIntervalMillis()).setQuality(locationRequestCompat.getQuality()).setMinUpdateIntervalMillis(locationRequestCompat.getMinUpdateIntervalMillis()).setDurationMillis(locationRequestCompat.getDurationMillis()).setMaxUpdates(locationRequestCompat.getMaxUpdates()).setMinUpdateDistanceMeters(locationRequestCompat.getMinUpdateDistanceMeters()).setMaxUpdateDelayMillis(locationRequestCompat.getMaxUpdateDelayMillis()).build();
        }
    }

    static class Api19Impl {
        private static java.lang.reflect.Method Camera2StreamConfigurationMap;
        private static java.lang.Class<?> getHighResolutionOutputSizeshNQ4ISI;
        private static java.lang.reflect.Method getHighSpeedVideoFpsRanges;
        private static java.lang.reflect.Method getHighSpeedVideoFpsRangesFor;
        private static java.lang.reflect.Method getHighSpeedVideoSizes;
        private static java.lang.reflect.Method getOutputMinFrameDuration;

        private Api19Impl() {
        }

        public static java.lang.Object Camera2StreamConfigurationMap(androidx.core.location.LocationRequestCompat locationRequestCompat, java.lang.String str) {
            try {
                if (getHighResolutionOutputSizeshNQ4ISI == null) {
                    getHighResolutionOutputSizeshNQ4ISI = java.lang.Class.forName("android.location.LocationRequest");
                }
                if (getHighSpeedVideoFpsRangesFor == null) {
                    java.lang.reflect.Method declaredMethod = getHighResolutionOutputSizeshNQ4ISI.getDeclaredMethod("createFromDeprecatedProvider", java.lang.String.class, java.lang.Long.TYPE, java.lang.Float.TYPE, java.lang.Boolean.TYPE);
                    getHighSpeedVideoFpsRangesFor = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                java.lang.Object invoke = getHighSpeedVideoFpsRangesFor.invoke(null, str, java.lang.Long.valueOf(locationRequestCompat.getIntervalMillis()), java.lang.Float.valueOf(locationRequestCompat.getMinUpdateDistanceMeters()), java.lang.Boolean.FALSE);
                if (invoke == null) {
                    return null;
                }
                if (getOutputMinFrameDuration == null) {
                    java.lang.reflect.Method declaredMethod2 = getHighResolutionOutputSizeshNQ4ISI.getDeclaredMethod("setQuality", java.lang.Integer.TYPE);
                    getOutputMinFrameDuration = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                getOutputMinFrameDuration.invoke(invoke, java.lang.Integer.valueOf(locationRequestCompat.getQuality()));
                if (Camera2StreamConfigurationMap == null) {
                    java.lang.reflect.Method declaredMethod3 = getHighResolutionOutputSizeshNQ4ISI.getDeclaredMethod("setFastestInterval", java.lang.Long.TYPE);
                    Camera2StreamConfigurationMap = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                Camera2StreamConfigurationMap.invoke(invoke, java.lang.Long.valueOf(locationRequestCompat.getMinUpdateIntervalMillis()));
                if (locationRequestCompat.getMaxUpdates() < Integer.MAX_VALUE) {
                    if (getHighSpeedVideoSizes == null) {
                        java.lang.reflect.Method declaredMethod4 = getHighResolutionOutputSizeshNQ4ISI.getDeclaredMethod("setNumUpdates", java.lang.Integer.TYPE);
                        getHighSpeedVideoSizes = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    getHighSpeedVideoSizes.invoke(invoke, java.lang.Integer.valueOf(locationRequestCompat.getMaxUpdates()));
                }
                if (locationRequestCompat.getDurationMillis() < Long.MAX_VALUE) {
                    if (getHighSpeedVideoFpsRanges == null) {
                        java.lang.reflect.Method declaredMethod5 = getHighResolutionOutputSizeshNQ4ISI.getDeclaredMethod("setExpireIn", java.lang.Long.TYPE);
                        getHighSpeedVideoFpsRanges = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    getHighSpeedVideoFpsRanges.invoke(invoke, java.lang.Long.valueOf(locationRequestCompat.getDurationMillis()));
                }
                return invoke;
            } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException unused) {
                return null;
            }
        }
    }
}
