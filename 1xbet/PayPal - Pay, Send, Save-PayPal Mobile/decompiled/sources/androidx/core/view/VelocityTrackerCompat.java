package androidx.core.view;

/* loaded from: classes7.dex */
public final class VelocityTrackerCompat {
    private static java.util.Map<android.view.VelocityTracker, androidx.core.view.VelocityTrackerFallback> getHighResolutionOutputSizeshNQ4ISI = java.util.Collections.synchronizedMap(new java.util.WeakHashMap());

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface VelocityTrackableMotionEventAxis {
    }

    @androidx.annotation.ReplaceWith(expression = "tracker.getXVelocity(pointerId)")
    @java.lang.Deprecated
    public static float getXVelocity(android.view.VelocityTracker velocityTracker, int i) {
        return velocityTracker.getXVelocity(i);
    }

    @androidx.annotation.ReplaceWith(expression = "tracker.getYVelocity(pointerId)")
    @java.lang.Deprecated
    public static float getYVelocity(android.view.VelocityTracker velocityTracker, int i) {
        return velocityTracker.getYVelocity(i);
    }

    public static boolean isAxisSupported(android.view.VelocityTracker velocityTracker, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.view.VelocityTrackerCompat.Api34Impl.getHighSpeedVideoFpsRanges(velocityTracker, i);
        }
        return i == 26 || i == 0 || i == 1;
    }

    public static float getAxisVelocity(android.view.VelocityTracker velocityTracker, int i) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.view.VelocityTrackerCompat.Api34Impl.getHighSpeedVideoFpsRangesFor(velocityTracker, i);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i == 1) {
            return velocityTracker.getYVelocity();
        }
        androidx.core.view.VelocityTrackerFallback Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(velocityTracker);
        if (Camera2StreamConfigurationMap == null || i != 26) {
            return 0.0f;
        }
        return Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor;
    }

    public static float getAxisVelocity(android.view.VelocityTracker velocityTracker, int i, int i2) {
        if (android.os.Build.VERSION.SDK_INT >= 34) {
            return androidx.core.view.VelocityTrackerCompat.Api34Impl.getHighSpeedVideoFpsRangesFor(velocityTracker, i, i2);
        }
        if (i == 0) {
            return velocityTracker.getXVelocity(i2);
        }
        if (i == 1) {
            return velocityTracker.getYVelocity(i2);
        }
        return 0.0f;
    }

    public static void clear(android.view.VelocityTracker velocityTracker) {
        velocityTracker.clear();
        getHighSpeedVideoSizes(velocityTracker);
    }

    public static void recycle(android.view.VelocityTracker velocityTracker) {
        velocityTracker.recycle();
        getHighSpeedVideoSizes(velocityTracker);
    }

    public static void computeCurrentVelocity(android.view.VelocityTracker velocityTracker, int i, float f) {
        long[] jArr;
        long j;
        velocityTracker.computeCurrentVelocity(i, f);
        androidx.core.view.VelocityTrackerFallback Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(velocityTracker);
        if (Camera2StreamConfigurationMap != null) {
            int i2 = Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
            float f2 = 0.0f;
            if (i2 >= 2) {
                int i3 = Camera2StreamConfigurationMap.getHighSpeedVideoSizes;
                int i4 = ((i3 + 20) - (i2 - 1)) % 20;
                long j2 = Camera2StreamConfigurationMap.Camera2StreamConfigurationMap[i3];
                while (true) {
                    jArr = Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
                    j = jArr[i4];
                    if (j2 - j <= 100) {
                        break;
                    }
                    Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges--;
                    i4 = (i4 + 1) % 20;
                }
                int i5 = Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges;
                if (i5 >= 2) {
                    if (i5 == 2) {
                        int i6 = (i4 + 1) % 20;
                        if (j != jArr[i6]) {
                            f2 = Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI[i6] / (r6 - j);
                        }
                    } else {
                        int i7 = 0;
                        for (int i8 = 0; i8 < Camera2StreamConfigurationMap.getHighSpeedVideoFpsRanges - 1; i8++) {
                            int i9 = i8 + i4;
                            long[] jArr2 = Camera2StreamConfigurationMap.Camera2StreamConfigurationMap;
                            long j3 = jArr2[i9 % 20];
                            int i10 = (i9 + 1) % 20;
                            if (jArr2[i10] != j3) {
                                i7++;
                                float Camera2StreamConfigurationMap2 = androidx.core.view.VelocityTrackerFallback.Camera2StreamConfigurationMap(f2);
                                float f3 = Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI[i10] / (Camera2StreamConfigurationMap.Camera2StreamConfigurationMap[i10] - j3);
                                f2 += (f3 - Camera2StreamConfigurationMap2) * java.lang.Math.abs(f3);
                                if (i7 == 1) {
                                    f2 *= 0.5f;
                                }
                            }
                        }
                        f2 = androidx.core.view.VelocityTrackerFallback.Camera2StreamConfigurationMap(f2);
                    }
                }
            }
            float f4 = f2 * i;
            Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor = f4;
            if (f4 < (-java.lang.Math.abs(f))) {
                Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor = -java.lang.Math.abs(f);
            } else if (Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor > java.lang.Math.abs(f)) {
                Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor = java.lang.Math.abs(f);
            }
        }
    }

    public static void computeCurrentVelocity(android.view.VelocityTracker velocityTracker, int i) {
        computeCurrentVelocity(velocityTracker, i, Float.MAX_VALUE);
    }

    public static void addMovement(android.view.VelocityTracker velocityTracker, android.view.MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (android.os.Build.VERSION.SDK_INT >= 34 || motionEvent.getSource() != 4194304) {
            return;
        }
        if (!getHighResolutionOutputSizeshNQ4ISI.containsKey(velocityTracker)) {
            getHighResolutionOutputSizeshNQ4ISI.put(velocityTracker, new androidx.core.view.VelocityTrackerFallback());
        }
        androidx.core.view.VelocityTrackerFallback velocityTrackerFallback = getHighResolutionOutputSizeshNQ4ISI.get(velocityTracker);
        long eventTime = motionEvent.getEventTime();
        if (velocityTrackerFallback.getHighSpeedVideoFpsRanges != 0 && eventTime - velocityTrackerFallback.Camera2StreamConfigurationMap[velocityTrackerFallback.getHighSpeedVideoSizes] > 40) {
            velocityTrackerFallback.getHighSpeedVideoFpsRanges = 0;
            velocityTrackerFallback.getHighSpeedVideoFpsRangesFor = 0.0f;
        }
        int i = (velocityTrackerFallback.getHighSpeedVideoSizes + 1) % 20;
        velocityTrackerFallback.getHighSpeedVideoSizes = i;
        int i2 = velocityTrackerFallback.getHighSpeedVideoFpsRanges;
        if (i2 != 20) {
            velocityTrackerFallback.getHighSpeedVideoFpsRanges = i2 + 1;
        }
        velocityTrackerFallback.getHighResolutionOutputSizeshNQ4ISI[i] = motionEvent.getAxisValue(26);
        velocityTrackerFallback.Camera2StreamConfigurationMap[velocityTrackerFallback.getHighSpeedVideoSizes] = eventTime;
    }

    private static void getHighSpeedVideoSizes(android.view.VelocityTracker velocityTracker) {
        getHighResolutionOutputSizeshNQ4ISI.remove(velocityTracker);
    }

    private static androidx.core.view.VelocityTrackerFallback Camera2StreamConfigurationMap(android.view.VelocityTracker velocityTracker) {
        return getHighResolutionOutputSizeshNQ4ISI.get(velocityTracker);
    }

    static class Api34Impl {
        private Api34Impl() {
        }

        static boolean getHighSpeedVideoFpsRanges(android.view.VelocityTracker velocityTracker, int i) {
            return velocityTracker.isAxisSupported(i);
        }

        static float getHighSpeedVideoFpsRangesFor(android.view.VelocityTracker velocityTracker, int i, int i2) {
            return velocityTracker.getAxisVelocity(i, i2);
        }

        static float getHighSpeedVideoFpsRangesFor(android.view.VelocityTracker velocityTracker, int i) {
            return velocityTracker.getAxisVelocity(i);
        }
    }

    private VelocityTrackerCompat() {
    }
}
