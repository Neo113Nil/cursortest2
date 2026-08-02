package androidx.camera.core;

/* loaded from: classes6.dex */
public final class FocusMeteringAction {
    public static final long DEFAULT_AUTO_CANCEL_DURATION_MILLIS = 5000;
    public static final int FLAG_AE = 2;
    public static final int FLAG_AF = 1;
    public static final int FLAG_AWB = 4;
    private final java.util.List<androidx.camera.core.MeteringPoint> Camera2StreamConfigurationMap;
    private final long getHighResolutionOutputSizeshNQ4ISI;
    private final java.util.List<androidx.camera.core.MeteringPoint> getHighSpeedVideoFpsRanges;
    private final java.util.List<androidx.camera.core.MeteringPoint> getHighSpeedVideoFpsRangesFor;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface MeteringMode {
    }

    FocusMeteringAction(androidx.camera.core.FocusMeteringAction.Builder builder) {
        this.Camera2StreamConfigurationMap = java.util.Collections.unmodifiableList(builder.getHighSpeedVideoFpsRanges);
        this.getHighSpeedVideoFpsRanges = java.util.Collections.unmodifiableList(builder.Camera2StreamConfigurationMap);
        this.getHighSpeedVideoFpsRangesFor = java.util.Collections.unmodifiableList(builder.getHighSpeedVideoFpsRangesFor);
        this.getHighResolutionOutputSizeshNQ4ISI = builder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final long getAutoCancelDurationInMillis() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final java.util.List<androidx.camera.core.MeteringPoint> getMeteringPointsAf() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.util.List<androidx.camera.core.MeteringPoint> getMeteringPointsAe() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.util.List<androidx.camera.core.MeteringPoint> getMeteringPointsAwb() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final boolean isAutoCancelEnabled() {
        return this.getHighResolutionOutputSizeshNQ4ISI > 0;
    }

    /* loaded from: classes.dex */
    public static class Builder {
        final java.util.List<androidx.camera.core.MeteringPoint> Camera2StreamConfigurationMap;
        long getHighResolutionOutputSizeshNQ4ISI;
        final java.util.List<androidx.camera.core.MeteringPoint> getHighSpeedVideoFpsRanges;
        final java.util.List<androidx.camera.core.MeteringPoint> getHighSpeedVideoFpsRangesFor;

        public Builder(androidx.camera.core.MeteringPoint meteringPoint) {
            this(meteringPoint, 7);
        }

        public Builder(androidx.camera.core.MeteringPoint meteringPoint, int i) {
            this.getHighSpeedVideoFpsRanges = new java.util.ArrayList();
            this.Camera2StreamConfigurationMap = new java.util.ArrayList();
            this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList();
            this.getHighResolutionOutputSizeshNQ4ISI = 5000L;
            addPoint(meteringPoint, i);
        }

        public Builder(androidx.camera.core.FocusMeteringAction focusMeteringAction) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            this.getHighSpeedVideoFpsRanges = arrayList;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            this.Camera2StreamConfigurationMap = arrayList2;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            this.getHighSpeedVideoFpsRangesFor = arrayList3;
            this.getHighResolutionOutputSizeshNQ4ISI = 5000L;
            arrayList.addAll(focusMeteringAction.getMeteringPointsAf());
            arrayList2.addAll(focusMeteringAction.getMeteringPointsAe());
            arrayList3.addAll(focusMeteringAction.getMeteringPointsAwb());
            this.getHighResolutionOutputSizeshNQ4ISI = focusMeteringAction.getAutoCancelDurationInMillis();
        }

        public androidx.camera.core.FocusMeteringAction.Builder addPoint(androidx.camera.core.MeteringPoint meteringPoint) {
            return addPoint(meteringPoint, 7);
        }

        public androidx.camera.core.FocusMeteringAction.Builder addPoint(androidx.camera.core.MeteringPoint meteringPoint, int i) {
            androidx.core.util.Preconditions.checkArgument(meteringPoint != null, "Point cannot be null.");
            androidx.core.util.Preconditions.checkArgument(i > 0 && i <= 7, "Invalid metering mode ".concat(java.lang.String.valueOf(i)));
            if ((i & 1) != 0) {
                this.getHighSpeedVideoFpsRanges.add(meteringPoint);
            }
            if ((i & 2) != 0) {
                this.Camera2StreamConfigurationMap.add(meteringPoint);
            }
            if ((i & 4) != 0) {
                this.getHighSpeedVideoFpsRangesFor.add(meteringPoint);
            }
            return this;
        }

        public androidx.camera.core.FocusMeteringAction.Builder setAutoCancelDuration(long j, java.util.concurrent.TimeUnit timeUnit) {
            androidx.core.util.Preconditions.checkArgument(j >= 1, "autoCancelDuration must be at least 1");
            this.getHighResolutionOutputSizeshNQ4ISI = timeUnit.toMillis(j);
            return this;
        }

        public androidx.camera.core.FocusMeteringAction.Builder disableAutoCancel() {
            this.getHighResolutionOutputSizeshNQ4ISI = 0L;
            return this;
        }

        public androidx.camera.core.FocusMeteringAction.Builder removePoints(int i) {
            if ((i & 1) != 0) {
                this.getHighSpeedVideoFpsRanges.clear();
            }
            if ((i & 2) != 0) {
                this.Camera2StreamConfigurationMap.clear();
            }
            if ((i & 4) != 0) {
                this.getHighSpeedVideoFpsRangesFor.clear();
            }
            return this;
        }

        public androidx.camera.core.FocusMeteringAction build() {
            return new androidx.camera.core.FocusMeteringAction(this);
        }
    }
}
