package androidx.camera.camera2.pipe.graph;

/* loaded from: classes6.dex */
public final class Listener3A_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.graph.Listener3A> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.graph.Listener3A get() {
        return newInstance();
    }

    public static androidx.camera.camera2.pipe.graph.Listener3A_Factory create() {
        return androidx.camera.camera2.pipe.graph.Listener3A_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static androidx.camera.camera2.pipe.graph.Listener3A newInstance() {
        return new androidx.camera.camera2.pipe.graph.Listener3A();
    }

    static final class InstanceHolder {
        static final androidx.camera.camera2.pipe.graph.Listener3A_Factory Camera2StreamConfigurationMap = new androidx.camera.camera2.pipe.graph.Listener3A_Factory();

        private InstanceHolder() {
        }
    }
}
