package androidx.camera.camera2.pipe.graph;

/* loaded from: classes6.dex */
public final class GraphState3A_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.graph.GraphState3A> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.graph.GraphState3A get() {
        return newInstance();
    }

    public static androidx.camera.camera2.pipe.graph.GraphState3A_Factory create() {
        return androidx.camera.camera2.pipe.graph.GraphState3A_Factory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static androidx.camera.camera2.pipe.graph.GraphState3A newInstance() {
        return new androidx.camera.camera2.pipe.graph.GraphState3A();
    }

    static final class InstanceHolder {
        static final androidx.camera.camera2.pipe.graph.GraphState3A_Factory getHighSpeedVideoFpsRangesFor = new androidx.camera.camera2.pipe.graph.GraphState3A_Factory();

        private InstanceHolder() {
        }
    }
}
