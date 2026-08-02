package androidx.camera.camera2.pipe.compat;

/* loaded from: classes6.dex */
public final class ConcurrentSessionSequencers_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencers> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencers get() {
        return newInstance();
    }

    public static androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencers_Factory create() {
        return androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencers_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencers newInstance() {
        return new androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencers();
    }

    static final class InstanceHolder {
        static final androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencers_Factory getHighSpeedVideoFpsRangesFor = new androidx.camera.camera2.pipe.compat.ConcurrentSessionSequencers_Factory();

        private InstanceHolder() {
        }
    }
}
