package androidx.core.location;

/* loaded from: classes7.dex */
public final class LocationCompat {
    private static java.lang.Integer Camera2StreamConfigurationMap = null;
    public static final java.lang.String EXTRA_BEARING_ACCURACY = "bearingAccuracy";
    public static final java.lang.String EXTRA_IS_MOCK = "mockLocation";
    public static final java.lang.String EXTRA_MSL_ALTITUDE = "androidx.core.location.extra.MSL_ALTITUDE";
    public static final java.lang.String EXTRA_MSL_ALTITUDE_ACCURACY = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";
    public static final java.lang.String EXTRA_SPEED_ACCURACY = "speedAccuracy";
    public static final java.lang.String EXTRA_VERTICAL_ACCURACY = "verticalAccuracy";
    private static java.lang.reflect.Field getHighResolutionOutputSizeshNQ4ISI;
    private static java.lang.Integer getHighSpeedVideoFpsRanges;
    private static java.lang.Integer getHighSpeedVideoFpsRangesFor;
    private static java.lang.reflect.Method getHighSpeedVideoSizes;

    private LocationCompat() {
    }

    @androidx.annotation.ReplaceWith(expression = "location.getElapsedRealtimeNanos()")
    @java.lang.Deprecated
    public static long getElapsedRealtimeNanos(android.location.Location location) {
        return location.getElapsedRealtimeNanos();
    }

    public static long getElapsedRealtimeMillis(android.location.Location location) {
        return java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos());
    }

    public static boolean hasVerticalAccuracy(android.location.Location location) {
        return androidx.core.location.LocationCompat.Api26Impl.getInputSizeshNQ4ISI(location);
    }

    public static float getVerticalAccuracyMeters(android.location.Location location) {
        return androidx.core.location.LocationCompat.Api26Impl.getHighSpeedVideoFpsRanges(location);
    }

    public static void setVerticalAccuracyMeters(android.location.Location location, float f) {
        androidx.core.location.LocationCompat.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(location, f);
    }

    public static void removeVerticalAccuracy(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            androidx.core.location.LocationCompat.Api33Impl.getHighSpeedVideoSizes(location);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.location.LocationCompat.Api29Impl.getHighResolutionOutputSizeshNQ4ISI(location);
        } else if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.location.LocationCompat.Api28Impl.getHighSpeedVideoFpsRanges(location);
        } else {
            androidx.core.location.LocationCompat.Api26Impl.getOutputFormats(location);
        }
    }

    public static boolean hasSpeedAccuracy(android.location.Location location) {
        return androidx.core.location.LocationCompat.Api26Impl.getHighSpeedVideoSizes(location);
    }

    public static float getSpeedAccuracyMetersPerSecond(android.location.Location location) {
        return androidx.core.location.LocationCompat.Api26Impl.Camera2StreamConfigurationMap(location);
    }

    public static void setSpeedAccuracyMetersPerSecond(android.location.Location location, float f) {
        androidx.core.location.LocationCompat.Api26Impl.getHighSpeedVideoFpsRanges(location, f);
    }

    public static void removeSpeedAccuracy(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            androidx.core.location.LocationCompat.Api33Impl.getHighSpeedVideoFpsRangesFor(location);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.location.LocationCompat.Api29Impl.getHighSpeedVideoFpsRangesFor(location);
        } else if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.location.LocationCompat.Api28Impl.getHighSpeedVideoFpsRangesFor(location);
        } else {
            androidx.core.location.LocationCompat.Api26Impl.getHighSpeedVideoSizesFor(location);
        }
    }

    public static boolean hasBearingAccuracy(android.location.Location location) {
        return androidx.core.location.LocationCompat.Api26Impl.getHighResolutionOutputSizeshNQ4ISI(location);
    }

    public static float getBearingAccuracyDegrees(android.location.Location location) {
        return androidx.core.location.LocationCompat.Api26Impl.getHighSpeedVideoFpsRangesFor(location);
    }

    public static void setBearingAccuracyDegrees(android.location.Location location, float f) {
        androidx.core.location.LocationCompat.Api26Impl.Camera2StreamConfigurationMap(location, f);
    }

    public static void removeBearingAccuracy(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            androidx.core.location.LocationCompat.Api33Impl.getHighResolutionOutputSizeshNQ4ISI(location);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.location.LocationCompat.Api29Impl.getHighSpeedVideoFpsRanges(location);
        } else if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.location.LocationCompat.Api28Impl.getHighResolutionOutputSizeshNQ4ISI(location);
        } else {
            androidx.core.location.LocationCompat.Api26Impl.getInputFormats(location);
        }
    }

    public static double getMslAltitudeMeters(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.location.LocationCompat.Api34Impl.getHighSpeedVideoFpsRanges(location);
        }
        return getHighSpeedVideoFpsRanges(location).getDouble(EXTRA_MSL_ALTITUDE);
    }

    public static void setMslAltitudeMeters(android.location.Location location, double d) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.location.LocationCompat.Api34Impl.getHighSpeedVideoFpsRanges(location, d);
        } else {
            getHighSpeedVideoFpsRanges(location).putDouble(EXTRA_MSL_ALTITUDE, d);
        }
    }

    public static boolean hasMslAltitude(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.location.LocationCompat.Api34Impl.getHighResolutionOutputSizeshNQ4ISI(location);
        }
        return Camera2StreamConfigurationMap(location, EXTRA_MSL_ALTITUDE);
    }

    public static void removeMslAltitude(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.location.LocationCompat.Api34Impl.Camera2StreamConfigurationMap(location);
        } else {
            getHighResolutionOutputSizeshNQ4ISI(location, EXTRA_MSL_ALTITUDE);
        }
    }

    public static float getMslAltitudeAccuracyMeters(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.location.LocationCompat.Api34Impl.getHighSpeedVideoSizes(location);
        }
        return getHighSpeedVideoFpsRanges(location).getFloat(EXTRA_MSL_ALTITUDE_ACCURACY);
    }

    public static void setMslAltitudeAccuracyMeters(android.location.Location location, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.location.LocationCompat.Api34Impl.getHighResolutionOutputSizeshNQ4ISI(location, f);
        } else {
            getHighSpeedVideoFpsRanges(location).putFloat(EXTRA_MSL_ALTITUDE_ACCURACY, f);
        }
    }

    public static boolean hasMslAltitudeAccuracy(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.location.LocationCompat.Api34Impl.getHighSpeedVideoFpsRangesFor(location);
        }
        return Camera2StreamConfigurationMap(location, EXTRA_MSL_ALTITUDE_ACCURACY);
    }

    public static void removeMslAltitudeAccuracy(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.location.LocationCompat.Api34Impl.getOutputFormats(location);
        } else {
            getHighResolutionOutputSizeshNQ4ISI(location, EXTRA_MSL_ALTITUDE_ACCURACY);
        }
    }

    public static boolean isMock(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            return androidx.core.location.LocationCompat.Api31Impl.getHighSpeedVideoSizes(location);
        }
        return location.isFromMockProvider();
    }

    public static void setMock(android.location.Location location, boolean z) {
        try {
            Camera2StreamConfigurationMap().invoke(location, java.lang.Boolean.valueOf(z));
        } catch (java.lang.IllegalAccessException e) {
            java.lang.IllegalAccessError illegalAccessError = new java.lang.IllegalAccessError();
            illegalAccessError.initCause(e);
            throw illegalAccessError;
        } catch (java.lang.NoSuchMethodException e2) {
            java.lang.NoSuchMethodError noSuchMethodError = new java.lang.NoSuchMethodError();
            noSuchMethodError.initCause(e2);
            throw noSuchMethodError;
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }

    static class Api34Impl {
        private Api34Impl() {
        }

        static double getHighSpeedVideoFpsRanges(android.location.Location location) {
            return location.getMslAltitudeMeters();
        }

        static void getHighSpeedVideoFpsRanges(android.location.Location location, double d) {
            location.setMslAltitudeMeters(d);
        }

        static boolean getHighResolutionOutputSizeshNQ4ISI(android.location.Location location) {
            return location.hasMslAltitude();
        }

        static void Camera2StreamConfigurationMap(android.location.Location location) {
            location.removeMslAltitude();
        }

        static float getHighSpeedVideoSizes(android.location.Location location) {
            return location.getMslAltitudeAccuracyMeters();
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.location.Location location, float f) {
            location.setMslAltitudeAccuracyMeters(f);
        }

        static boolean getHighSpeedVideoFpsRangesFor(android.location.Location location) {
            return location.hasMslAltitudeAccuracy();
        }

        static void getOutputFormats(android.location.Location location) {
            location.removeMslAltitudeAccuracy();
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static void getHighSpeedVideoSizes(android.location.Location location) {
            location.removeVerticalAccuracy();
        }

        static void getHighSpeedVideoFpsRangesFor(android.location.Location location) {
            location.removeSpeedAccuracy();
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.location.Location location) {
            location.removeBearingAccuracy();
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.location.Location location) {
            if (location.hasVerticalAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                androidx.core.location.LocationCompat.Api28Impl.getHighSpeedVideoFpsRanges(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }

        static void getHighSpeedVideoFpsRangesFor(android.location.Location location) {
            if (location.hasSpeedAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                androidx.core.location.LocationCompat.Api28Impl.getHighSpeedVideoFpsRangesFor(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }

        static void getHighSpeedVideoFpsRanges(android.location.Location location) {
            if (location.hasBearingAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                androidx.core.location.LocationCompat.Api28Impl.getHighResolutionOutputSizeshNQ4ISI(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static void getHighSpeedVideoFpsRanges(android.location.Location location) {
            if (location.hasVerticalAccuracy()) {
                java.lang.String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean hasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean hasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean hasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean hasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean hasSpeedAccuracy = location.hasSpeedAccuracy();
                float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                boolean hasBearingAccuracy = location.hasBearingAccuracy();
                float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                android.os.Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (hasAltitude) {
                    location.setAltitude(altitude);
                }
                if (hasSpeed) {
                    location.setSpeed(speed);
                }
                if (hasBearing) {
                    location.setBearing(bearing);
                }
                if (hasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (hasSpeedAccuracy) {
                    location.setSpeedAccuracyMetersPerSecond(speedAccuracyMetersPerSecond);
                }
                if (hasBearingAccuracy) {
                    location.setBearingAccuracyDegrees(bearingAccuracyDegrees);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }

        static void getHighSpeedVideoFpsRangesFor(android.location.Location location) {
            if (location.hasSpeedAccuracy()) {
                java.lang.String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean hasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean hasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean hasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean hasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean hasVerticalAccuracy = location.hasVerticalAccuracy();
                float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                boolean hasBearingAccuracy = location.hasBearingAccuracy();
                float bearingAccuracyDegrees = location.getBearingAccuracyDegrees();
                android.os.Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (hasAltitude) {
                    location.setAltitude(altitude);
                }
                if (hasSpeed) {
                    location.setSpeed(speed);
                }
                if (hasBearing) {
                    location.setBearing(bearing);
                }
                if (hasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (hasVerticalAccuracy) {
                    location.setVerticalAccuracyMeters(verticalAccuracyMeters);
                }
                if (hasBearingAccuracy) {
                    location.setBearingAccuracyDegrees(bearingAccuracyDegrees);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.location.Location location) {
            if (location.hasBearingAccuracy()) {
                java.lang.String provider = location.getProvider();
                long time = location.getTime();
                long elapsedRealtimeNanos = location.getElapsedRealtimeNanos();
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                boolean hasAltitude = location.hasAltitude();
                double altitude = location.getAltitude();
                boolean hasSpeed = location.hasSpeed();
                float speed = location.getSpeed();
                boolean hasBearing = location.hasBearing();
                float bearing = location.getBearing();
                boolean hasAccuracy = location.hasAccuracy();
                float accuracy = location.getAccuracy();
                boolean hasVerticalAccuracy = location.hasVerticalAccuracy();
                float verticalAccuracyMeters = location.getVerticalAccuracyMeters();
                boolean hasSpeedAccuracy = location.hasSpeedAccuracy();
                float speedAccuracyMetersPerSecond = location.getSpeedAccuracyMetersPerSecond();
                android.os.Bundle extras = location.getExtras();
                location.reset();
                location.setProvider(provider);
                location.setTime(time);
                location.setElapsedRealtimeNanos(elapsedRealtimeNanos);
                location.setLatitude(latitude);
                location.setLongitude(longitude);
                if (hasAltitude) {
                    location.setAltitude(altitude);
                }
                if (hasSpeed) {
                    location.setSpeed(speed);
                }
                if (hasBearing) {
                    location.setBearing(bearing);
                }
                if (hasAccuracy) {
                    location.setAccuracy(accuracy);
                }
                if (hasVerticalAccuracy) {
                    location.setVerticalAccuracyMeters(verticalAccuracyMeters);
                }
                if (hasSpeedAccuracy) {
                    location.setBearingAccuracyDegrees(speedAccuracyMetersPerSecond);
                }
                if (extras != null) {
                    location.setExtras(extras);
                }
            }
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static boolean getInputSizeshNQ4ISI(android.location.Location location) {
            return location.hasVerticalAccuracy();
        }

        static float getHighSpeedVideoFpsRanges(android.location.Location location) {
            return location.getVerticalAccuracyMeters();
        }

        static void getHighResolutionOutputSizeshNQ4ISI(android.location.Location location, float f) {
            location.setVerticalAccuracyMeters(f);
        }

        static void getOutputFormats(android.location.Location location) {
            try {
                androidx.core.location.LocationCompat.getHighSpeedVideoFpsRangesFor().setByte(location, (byte) (androidx.core.location.LocationCompat.getHighSpeedVideoFpsRangesFor().getByte(location) & (~androidx.core.location.LocationCompat.getHighSpeedVideoSizes())));
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchFieldException e) {
                java.lang.IllegalAccessError illegalAccessError = new java.lang.IllegalAccessError();
                illegalAccessError.initCause(e);
                throw illegalAccessError;
            }
        }

        static boolean getHighSpeedVideoSizes(android.location.Location location) {
            return location.hasSpeedAccuracy();
        }

        static float Camera2StreamConfigurationMap(android.location.Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        static void getHighSpeedVideoFpsRanges(android.location.Location location, float f) {
            location.setSpeedAccuracyMetersPerSecond(f);
        }

        static void getHighSpeedVideoSizesFor(android.location.Location location) {
            try {
                androidx.core.location.LocationCompat.getHighSpeedVideoFpsRangesFor().setByte(location, (byte) (androidx.core.location.LocationCompat.getHighSpeedVideoFpsRangesFor().getByte(location) & (~androidx.core.location.LocationCompat.getHighSpeedVideoFpsRanges())));
            } catch (java.lang.IllegalAccessException e) {
                java.lang.IllegalAccessError illegalAccessError = new java.lang.IllegalAccessError();
                illegalAccessError.initCause(e);
                throw illegalAccessError;
            } catch (java.lang.NoSuchFieldException e2) {
                java.lang.NoSuchFieldError noSuchFieldError = new java.lang.NoSuchFieldError();
                noSuchFieldError.initCause(e2);
                throw noSuchFieldError;
            }
        }

        static boolean getHighResolutionOutputSizeshNQ4ISI(android.location.Location location) {
            return location.hasBearingAccuracy();
        }

        static float getHighSpeedVideoFpsRangesFor(android.location.Location location) {
            return location.getBearingAccuracyDegrees();
        }

        static void Camera2StreamConfigurationMap(android.location.Location location, float f) {
            location.setBearingAccuracyDegrees(f);
        }

        static void getInputFormats(android.location.Location location) {
            try {
                androidx.core.location.LocationCompat.getHighSpeedVideoFpsRangesFor().setByte(location, (byte) (androidx.core.location.LocationCompat.getHighSpeedVideoFpsRangesFor().getByte(location) & (~androidx.core.location.LocationCompat.getHighResolutionOutputSizeshNQ4ISI())));
            } catch (java.lang.IllegalAccessException e) {
                java.lang.IllegalAccessError illegalAccessError = new java.lang.IllegalAccessError();
                illegalAccessError.initCause(e);
                throw illegalAccessError;
            } catch (java.lang.NoSuchFieldException e2) {
                java.lang.NoSuchFieldError noSuchFieldError = new java.lang.NoSuchFieldError();
                noSuchFieldError.initCause(e2);
                throw noSuchFieldError;
            }
        }
    }

    private static java.lang.reflect.Method Camera2StreamConfigurationMap() throws java.lang.NoSuchMethodException {
        if (getHighSpeedVideoSizes == null) {
            java.lang.reflect.Method declaredMethod = android.location.Location.class.getDeclaredMethod("setIsFromMockProvider", java.lang.Boolean.TYPE);
            getHighSpeedVideoSizes = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return getHighSpeedVideoSizes;
    }

    static java.lang.reflect.Field getHighSpeedVideoFpsRangesFor() throws java.lang.NoSuchFieldException {
        if (getHighResolutionOutputSizeshNQ4ISI == null) {
            java.lang.reflect.Field declaredField = android.location.Location.class.getDeclaredField("mFieldsMask");
            getHighResolutionOutputSizeshNQ4ISI = declaredField;
            declaredField.setAccessible(true);
        }
        return getHighResolutionOutputSizeshNQ4ISI;
    }

    static int getHighSpeedVideoFpsRanges() throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
        if (Camera2StreamConfigurationMap == null) {
            java.lang.reflect.Field declaredField = android.location.Location.class.getDeclaredField("HAS_SPEED_ACCURACY_MASK");
            declaredField.setAccessible(true);
            Camera2StreamConfigurationMap = java.lang.Integer.valueOf(declaredField.getInt(null));
        }
        return Camera2StreamConfigurationMap.intValue();
    }

    static int getHighResolutionOutputSizeshNQ4ISI() throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
        if (getHighSpeedVideoFpsRangesFor == null) {
            java.lang.reflect.Field declaredField = android.location.Location.class.getDeclaredField("HAS_BEARING_ACCURACY_MASK");
            declaredField.setAccessible(true);
            getHighSpeedVideoFpsRangesFor = java.lang.Integer.valueOf(declaredField.getInt(null));
        }
        return getHighSpeedVideoFpsRangesFor.intValue();
    }

    static int getHighSpeedVideoSizes() throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
        if (getHighSpeedVideoFpsRanges == null) {
            java.lang.reflect.Field declaredField = android.location.Location.class.getDeclaredField("HAS_VERTICAL_ACCURACY_MASK");
            declaredField.setAccessible(true);
            getHighSpeedVideoFpsRanges = java.lang.Integer.valueOf(declaredField.getInt(null));
        }
        return getHighSpeedVideoFpsRanges.intValue();
    }

    private static android.os.Bundle getHighSpeedVideoFpsRanges(android.location.Location location) {
        android.os.Bundle extras = location.getExtras();
        if (extras != null) {
            return extras;
        }
        location.setExtras(new android.os.Bundle());
        return location.getExtras();
    }

    private static boolean Camera2StreamConfigurationMap(android.location.Location location, java.lang.String str) {
        android.os.Bundle extras = location.getExtras();
        return extras != null && extras.containsKey(str);
    }

    private static void getHighResolutionOutputSizeshNQ4ISI(android.location.Location location, java.lang.String str) {
        android.os.Bundle extras = location.getExtras();
        if (extras != null) {
            extras.remove(str);
            if (extras.isEmpty()) {
                location.setExtras(null);
            }
        }
    }

    static class Api31Impl {
        private Api31Impl() {
        }

        static boolean getHighSpeedVideoSizes(android.location.Location location) {
            return location.isMock();
        }
    }
}
