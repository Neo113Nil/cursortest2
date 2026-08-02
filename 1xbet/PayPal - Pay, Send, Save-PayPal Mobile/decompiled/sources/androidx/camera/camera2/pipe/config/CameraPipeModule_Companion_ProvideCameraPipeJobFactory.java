package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class CameraPipeModule_Companion_ProvideCameraPipeJobFactory implements dagger.internal.Factory<kotlinx.coroutines.Job> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.coroutines.Job get() {
        return provideCameraPipeJob();
    }

    public static androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraPipeJobFactory create() {
        return androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraPipeJobFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static kotlinx.coroutines.Job provideCameraPipeJob() {
        return (kotlinx.coroutines.Job) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.pipe.config.CameraPipeModule.INSTANCE.provideCameraPipeJob());
    }

    static final class InstanceHolder {
        static final androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraPipeJobFactory getHighSpeedVideoFpsRanges = new androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraPipeJobFactory();

        private InstanceHolder() {
        }
    }
}
