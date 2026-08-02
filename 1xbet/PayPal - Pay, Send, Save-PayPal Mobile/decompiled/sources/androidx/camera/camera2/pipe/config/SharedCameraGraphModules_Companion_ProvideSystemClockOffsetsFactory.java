package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class SharedCameraGraphModules_Companion_ProvideSystemClockOffsetsFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.core.SystemClockOffsets> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.core.SystemClockOffsets get() {
        return provideSystemClockOffsets();
    }

    public static androidx.camera.camera2.pipe.config.SharedCameraGraphModules_Companion_ProvideSystemClockOffsetsFactory create() {
        return androidx.camera.camera2.pipe.config.SharedCameraGraphModules_Companion_ProvideSystemClockOffsetsFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static androidx.camera.camera2.pipe.core.SystemClockOffsets provideSystemClockOffsets() {
        return (androidx.camera.camera2.pipe.core.SystemClockOffsets) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.pipe.config.SharedCameraGraphModules.INSTANCE.provideSystemClockOffsets());
    }

    static final class InstanceHolder {
        static final androidx.camera.camera2.pipe.config.SharedCameraGraphModules_Companion_ProvideSystemClockOffsetsFactory getHighSpeedVideoFpsRangesFor = new androidx.camera.camera2.pipe.config.SharedCameraGraphModules_Companion_ProvideSystemClockOffsetsFactory();

        private InstanceHolder() {
        }
    }
}
