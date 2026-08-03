package androidx.core.location;

/* loaded from: classes.dex */
public final class LocationCompat {
    public static final java.lang.String EXTRA_BEARING_ACCURACY = "bearingAccuracy";
    public static final java.lang.String EXTRA_IS_MOCK = "mockLocation";
    public static final java.lang.String EXTRA_MSL_ALTITUDE = "androidx.core.location.extra.MSL_ALTITUDE";
    public static final java.lang.String EXTRA_MSL_ALTITUDE_ACCURACY = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";
    public static final java.lang.String EXTRA_SPEED_ACCURACY = "speedAccuracy";
    public static final java.lang.String EXTRA_VERTICAL_ACCURACY = "verticalAccuracy";
    private static java.lang.reflect.Field sFieldsMaskField;
    private static java.lang.Integer sHasBearingAccuracyMask;
    private static java.lang.Integer sHasSpeedAccuracyMask;
    private static java.lang.Integer sHasVerticalAccuracyMask;
    private static java.lang.reflect.Method sSetIsFromMockProviderMethod;

    private LocationCompat() {
    }

    public static long getElapsedRealtimeNanos(android.location.Location location) {
        return location.getElapsedRealtimeNanos();
    }

    public static long getElapsedRealtimeMillis(android.location.Location location) {
        return java.util.concurrent.TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos());
    }

    public static boolean hasVerticalAccuracy(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.location.LocationCompat.Api26Impl.hasVerticalAccuracy(location);
        }
        return containsExtra(location, "verticalAccuracy");
    }

    public static float getVerticalAccuracyMeters(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.location.LocationCompat.Api26Impl.getVerticalAccuracyMeters(location);
        }
        android.os.Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat("verticalAccuracy", 0.0f);
    }

    public static void setVerticalAccuracyMeters(android.location.Location location, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.location.LocationCompat.Api26Impl.setVerticalAccuracyMeters(location, f);
        } else {
            getOrCreateExtras(location).putFloat("verticalAccuracy", f);
        }
    }

    public static void removeVerticalAccuracy(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            androidx.core.location.LocationCompat.Api33Impl.removeVerticalAccuracy(location);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.location.LocationCompat.Api29Impl.removeVerticalAccuracy(location);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.location.LocationCompat.Api28Impl.removeVerticalAccuracy(location);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.location.LocationCompat.Api26Impl.removeVerticalAccuracy(location);
        } else {
            removeExtra(location, "verticalAccuracy");
        }
    }

    public static boolean hasSpeedAccuracy(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.location.LocationCompat.Api26Impl.hasSpeedAccuracy(location);
        }
        return containsExtra(location, EXTRA_SPEED_ACCURACY);
    }

    public static float getSpeedAccuracyMetersPerSecond(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.location.LocationCompat.Api26Impl.getSpeedAccuracyMetersPerSecond(location);
        }
        android.os.Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(EXTRA_SPEED_ACCURACY, 0.0f);
    }

    public static void setSpeedAccuracyMetersPerSecond(android.location.Location location, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.location.LocationCompat.Api26Impl.setSpeedAccuracyMetersPerSecond(location, f);
        } else {
            getOrCreateExtras(location).putFloat(EXTRA_SPEED_ACCURACY, f);
        }
    }

    public static void removeSpeedAccuracy(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            androidx.core.location.LocationCompat.Api33Impl.removeSpeedAccuracy(location);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.location.LocationCompat.Api29Impl.removeSpeedAccuracy(location);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.location.LocationCompat.Api28Impl.removeSpeedAccuracy(location);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.location.LocationCompat.Api26Impl.removeSpeedAccuracy(location);
        } else {
            removeExtra(location, EXTRA_SPEED_ACCURACY);
        }
    }

    public static boolean hasBearingAccuracy(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.location.LocationCompat.Api26Impl.hasBearingAccuracy(location);
        }
        return containsExtra(location, EXTRA_BEARING_ACCURACY);
    }

    public static float getBearingAccuracyDegrees(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return androidx.core.location.LocationCompat.Api26Impl.getBearingAccuracyDegrees(location);
        }
        android.os.Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(EXTRA_BEARING_ACCURACY, 0.0f);
    }

    public static void setBearingAccuracyDegrees(android.location.Location location, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.location.LocationCompat.Api26Impl.setBearingAccuracyDegrees(location, f);
        } else {
            getOrCreateExtras(location).putFloat(EXTRA_BEARING_ACCURACY, f);
        }
    }

    public static void removeBearingAccuracy(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 33) {
            androidx.core.location.LocationCompat.Api33Impl.removeBearingAccuracy(location);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            androidx.core.location.LocationCompat.Api29Impl.removeBearingAccuracy(location);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            androidx.core.location.LocationCompat.Api28Impl.removeBearingAccuracy(location);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            androidx.core.location.LocationCompat.Api26Impl.removeBearingAccuracy(location);
        } else {
            removeExtra(location, EXTRA_BEARING_ACCURACY);
        }
    }

    public static double getMslAltitudeMeters(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.location.LocationCompat.Api34Impl.getMslAltitudeMeters(location);
        }
        return getOrCreateExtras(location).getDouble(EXTRA_MSL_ALTITUDE);
    }

    public static void setMslAltitudeMeters(android.location.Location location, double d) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.location.LocationCompat.Api34Impl.setMslAltitudeMeters(location, d);
        } else {
            getOrCreateExtras(location).putDouble(EXTRA_MSL_ALTITUDE, d);
        }
    }

    public static boolean hasMslAltitude(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.location.LocationCompat.Api34Impl.hasMslAltitude(location);
        }
        return containsExtra(location, EXTRA_MSL_ALTITUDE);
    }

    public static void removeMslAltitude(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.location.LocationCompat.Api34Impl.removeMslAltitude(location);
        } else {
            removeExtra(location, EXTRA_MSL_ALTITUDE);
        }
    }

    public static float getMslAltitudeAccuracyMeters(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.location.LocationCompat.Api34Impl.getMslAltitudeAccuracyMeters(location);
        }
        return getOrCreateExtras(location).getFloat(EXTRA_MSL_ALTITUDE_ACCURACY);
    }

    public static void setMslAltitudeAccuracyMeters(android.location.Location location, float f) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.location.LocationCompat.Api34Impl.setMslAltitudeAccuracyMeters(location, f);
        } else {
            getOrCreateExtras(location).putFloat(EXTRA_MSL_ALTITUDE_ACCURACY, f);
        }
    }

    public static boolean hasMslAltitudeAccuracy(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.location.LocationCompat.Api34Impl.hasMslAltitudeAccuracy(location);
        }
        return containsExtra(location, EXTRA_MSL_ALTITUDE_ACCURACY);
    }

    public static void removeMslAltitudeAccuracy(android.location.Location location) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            androidx.core.location.LocationCompat.Api34Impl.removeMslAltitudeAccuracy(location);
        } else {
            removeExtra(location, EXTRA_MSL_ALTITUDE_ACCURACY);
        }
    }

    public static boolean isMock(android.location.Location location) {
        return location.isFromMockProvider();
    }

    public static void setMock(android.location.Location location, boolean z) {
        try {
            getSetIsFromMockProviderMethod().invoke(location, java.lang.Boolean.valueOf(z));
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

    private static class Api34Impl {
        private Api34Impl() {
        }

        static double getMslAltitudeMeters(android.location.Location location) {
            return location.getMslAltitudeMeters();
        }

        static void setMslAltitudeMeters(android.location.Location location, double d) {
            location.setMslAltitudeMeters(d);
        }

        static boolean hasMslAltitude(android.location.Location location) {
            return location.hasMslAltitude();
        }

        static void removeMslAltitude(android.location.Location location) {
            location.removeMslAltitude();
        }

        static float getMslAltitudeAccuracyMeters(android.location.Location location) {
            return location.getMslAltitudeAccuracyMeters();
        }

        static void setMslAltitudeAccuracyMeters(android.location.Location location, float f) {
            location.setMslAltitudeAccuracyMeters(f);
        }

        static boolean hasMslAltitudeAccuracy(android.location.Location location) {
            return location.hasMslAltitudeAccuracy();
        }

        static void removeMslAltitudeAccuracy(android.location.Location location) {
            location.removeMslAltitudeAccuracy();
        }
    }

    private static class Api33Impl {
        private Api33Impl() {
        }

        static void removeVerticalAccuracy(android.location.Location location) {
            location.removeVerticalAccuracy();
        }

        static void removeSpeedAccuracy(android.location.Location location) {
            location.removeSpeedAccuracy();
        }

        static void removeBearingAccuracy(android.location.Location location) {
            location.removeBearingAccuracy();
        }
    }

    private static class Api29Impl {
        private Api29Impl() {
        }

        static void removeVerticalAccuracy(android.location.Location location) {
            if (location.hasVerticalAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                androidx.core.location.LocationCompat.Api28Impl.removeVerticalAccuracy(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }

        static void removeSpeedAccuracy(android.location.Location location) {
            if (location.hasSpeedAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                androidx.core.location.LocationCompat.Api28Impl.removeSpeedAccuracy(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }

        static void removeBearingAccuracy(android.location.Location location) {
            if (location.hasBearingAccuracy()) {
                double elapsedRealtimeUncertaintyNanos = location.getElapsedRealtimeUncertaintyNanos();
                androidx.core.location.LocationCompat.Api28Impl.removeBearingAccuracy(location);
                location.setElapsedRealtimeUncertaintyNanos(elapsedRealtimeUncertaintyNanos);
            }
        }
    }

    private static class Api28Impl {
        private Api28Impl() {
        }

        static void removeVerticalAccuracy(android.location.Location location) {
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

        static void removeSpeedAccuracy(android.location.Location location) {
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

        static void removeBearingAccuracy(android.location.Location location) {
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

    private static class Api26Impl {
        private Api26Impl() {
        }

        static boolean hasVerticalAccuracy(android.location.Location location) {
            return location.hasVerticalAccuracy();
        }

        static float getVerticalAccuracyMeters(android.location.Location location) {
            return location.getVerticalAccuracyMeters();
        }

        static void setVerticalAccuracyMeters(android.location.Location location, float f) {
            location.setVerticalAccuracyMeters(f);
        }

        static void removeVerticalAccuracy(android.location.Location location) {
            try {
                androidx.core.location.LocationCompat.getFieldsMaskField().setByte(location, (byte) (androidx.core.location.LocationCompat.getFieldsMaskField().getByte(location) & (~androidx.core.location.LocationCompat.getHasVerticalAccuracyMask())));
            } catch (java.lang.IllegalAccessException | java.lang.NoSuchFieldException e) {
                java.lang.IllegalAccessError illegalAccessError = new java.lang.IllegalAccessError();
                illegalAccessError.initCause(e);
                throw illegalAccessError;
            }
        }

        static boolean hasSpeedAccuracy(android.location.Location location) {
            return location.hasSpeedAccuracy();
        }

        static float getSpeedAccuracyMetersPerSecond(android.location.Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        static void setSpeedAccuracyMetersPerSecond(android.location.Location location, float f) {
            location.setSpeedAccuracyMetersPerSecond(f);
        }

        static void removeSpeedAccuracy(android.location.Location location) {
            try {
                androidx.core.location.LocationCompat.getFieldsMaskField().setByte(location, (byte) (androidx.core.location.LocationCompat.getFieldsMaskField().getByte(location) & (~androidx.core.location.LocationCompat.getHasSpeedAccuracyMask())));
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

        static boolean hasBearingAccuracy(android.location.Location location) {
            return location.hasBearingAccuracy();
        }

        static float getBearingAccuracyDegrees(android.location.Location location) {
            return location.getBearingAccuracyDegrees();
        }

        static void setBearingAccuracyDegrees(android.location.Location location, float f) {
            location.setBearingAccuracyDegrees(f);
        }

        static void removeBearingAccuracy(android.location.Location location) {
            try {
                androidx.core.location.LocationCompat.getFieldsMaskField().setByte(location, (byte) (androidx.core.location.LocationCompat.getFieldsMaskField().getByte(location) & (~androidx.core.location.LocationCompat.getHasBearingAccuracyMask())));
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

    private static java.lang.reflect.Method getSetIsFromMockProviderMethod() throws java.lang.NoSuchMethodException {
        if (sSetIsFromMockProviderMethod == null) {
            java.lang.reflect.Method declaredMethod = android.location.Location.class.getDeclaredMethod("setIsFromMockProvider", java.lang.Boolean.TYPE);
            sSetIsFromMockProviderMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return sSetIsFromMockProviderMethod;
    }

    static java.lang.reflect.Field getFieldsMaskField() throws java.lang.NoSuchFieldException {
        if (sFieldsMaskField == null) {
            java.lang.reflect.Field declaredField = android.location.Location.class.getDeclaredField("mFieldsMask");
            sFieldsMaskField = declaredField;
            declaredField.setAccessible(true);
        }
        return sFieldsMaskField;
    }

    static int getHasSpeedAccuracyMask() throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
        if (sHasSpeedAccuracyMask == null) {
            java.lang.reflect.Field declaredField = android.location.Location.class.getDeclaredField("HAS_SPEED_ACCURACY_MASK");
            declaredField.setAccessible(true);
            sHasSpeedAccuracyMask = java.lang.Integer.valueOf(declaredField.getInt(null));
        }
        return sHasSpeedAccuracyMask.intValue();
    }

    static int getHasBearingAccuracyMask() throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
        if (sHasBearingAccuracyMask == null) {
            java.lang.reflect.Field declaredField = android.location.Location.class.getDeclaredField("HAS_BEARING_ACCURACY_MASK");
            declaredField.setAccessible(true);
            sHasBearingAccuracyMask = java.lang.Integer.valueOf(declaredField.getInt(null));
        }
        return sHasBearingAccuracyMask.intValue();
    }

    static int getHasVerticalAccuracyMask() throws java.lang.NoSuchFieldException, java.lang.IllegalAccessException {
        if (sHasVerticalAccuracyMask == null) {
            java.lang.reflect.Field declaredField = android.location.Location.class.getDeclaredField("HAS_VERTICAL_ACCURACY_MASK");
            declaredField.setAccessible(true);
            sHasVerticalAccuracyMask = java.lang.Integer.valueOf(declaredField.getInt(null));
        }
        return sHasVerticalAccuracyMask.intValue();
    }

    private static android.os.Bundle getOrCreateExtras(android.location.Location location) {
        android.os.Bundle extras = location.getExtras();
        if (extras != null) {
            return extras;
        }
        location.setExtras(new android.os.Bundle());
        return location.getExtras();
    }

    private static boolean containsExtra(android.location.Location location, java.lang.String str) {
        android.os.Bundle extras = location.getExtras();
        return extras != null && extras.containsKey(str);
    }

    private static void removeExtra(android.location.Location location, java.lang.String str) {
        android.os.Bundle extras = location.getExtras();
        if (extras != null) {
            extras.remove(str);
            if (extras.isEmpty()) {
                location.setExtras(null);
            }
        }
    }
}
