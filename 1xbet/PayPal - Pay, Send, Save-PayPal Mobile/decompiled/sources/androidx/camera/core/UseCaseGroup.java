package androidx.camera.core;

/* loaded from: classes6.dex */
public final class UseCaseGroup {
    private final java.util.List<androidx.camera.core.UseCase> Camera2StreamConfigurationMap;
    private final java.util.List<androidx.camera.core.CameraEffect> getHighSpeedVideoFpsRanges;
    private final androidx.camera.core.ViewPort getHighSpeedVideoFpsRangesFor;

    UseCaseGroup(androidx.camera.core.ViewPort viewPort, java.util.List<androidx.camera.core.UseCase> list, java.util.List<androidx.camera.core.CameraEffect> list2) {
        this.getHighSpeedVideoFpsRangesFor = viewPort;
        this.Camera2StreamConfigurationMap = list;
        this.getHighSpeedVideoFpsRanges = list2;
    }

    public final androidx.camera.core.ViewPort getViewPort() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public final java.util.List<androidx.camera.core.UseCase> getUseCases() {
        return this.Camera2StreamConfigurationMap;
    }

    public final java.util.List<androidx.camera.core.CameraEffect> getEffects() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public static final class Builder {
        private static final java.util.List<java.lang.Integer> getHighSpeedVideoFpsRangesFor = java.util.Arrays.asList(1, 2, 4, 3, 7);
        private androidx.camera.core.ViewPort getHighSpeedVideoFpsRanges;
        private final java.util.List<androidx.camera.core.UseCase> getHighSpeedVideoSizes = new java.util.ArrayList();
        private final java.util.List<androidx.camera.core.CameraEffect> Camera2StreamConfigurationMap = new java.util.ArrayList();

        public final androidx.camera.core.UseCaseGroup.Builder setViewPort(androidx.camera.core.ViewPort viewPort) {
            this.getHighSpeedVideoFpsRanges = viewPort;
            return this;
        }

        public final androidx.camera.core.UseCaseGroup.Builder addEffect(androidx.camera.core.CameraEffect cameraEffect) {
            this.Camera2StreamConfigurationMap.add(cameraEffect);
            return this;
        }

        public final androidx.camera.core.UseCaseGroup.Builder addUseCase(androidx.camera.core.UseCase useCase) {
            this.getHighSpeedVideoSizes.add(useCase);
            return this;
        }

        public final androidx.camera.core.UseCaseGroup build() {
            androidx.core.util.Preconditions.checkArgument(!this.getHighSpeedVideoSizes.isEmpty(), "UseCase must not be empty.");
            java.util.Iterator<androidx.camera.core.CameraEffect> it = this.Camera2StreamConfigurationMap.iterator();
            int i = 0;
            while (it.hasNext()) {
                int targets = it.next().getTargets();
                androidx.camera.core.processing.TargetUtils.checkSupportedTargets(getHighSpeedVideoFpsRangesFor, targets);
                int i2 = i & targets;
                if (i2 > 0) {
                    throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "More than one effects has targets %s.", androidx.camera.core.processing.TargetUtils.getHumanReadableName(i2)));
                }
                i |= targets;
            }
            return new androidx.camera.core.UseCaseGroup(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap);
        }
    }
}
