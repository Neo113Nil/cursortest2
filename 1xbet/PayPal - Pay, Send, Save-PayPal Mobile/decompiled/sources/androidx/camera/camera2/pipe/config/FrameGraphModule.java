package androidx.camera.camera2.pipe.config;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b!\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/camera/camera2/pipe/config/FrameGraphModule;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/framegraph/FrameGraphImpl;", "frameGraph", "Landroidx/camera/camera2/pipe/FrameGraph;", "bindFrameGraph", "(Landroidx/camera/camera2/pipe/framegraph/FrameGraphImpl;)Landroidx/camera/camera2/pipe/FrameGraph;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
@dagger.Module
/* loaded from: classes6.dex */
public abstract class FrameGraphModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.camera.camera2.pipe.config.FrameGraphModule.Companion INSTANCE = new androidx.camera.camera2.pipe.config.FrameGraphModule.Companion(null);

    @dagger.Binds
    public abstract androidx.camera.camera2.pipe.FrameGraph bindFrameGraph(androidx.camera.camera2.pipe.framegraph.FrameGraphImpl frameGraph);

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/camera/camera2/pipe/config/FrameGraphModule$Companion;", "", "<init>", "()V", "Landroidx/camera/camera2/pipe/core/Threads;", "threads", "Lkotlinx/coroutines/Job;", "cameraPipeJob", "Lkotlinx/coroutines/CoroutineScope;", "provideFrameGraphCoroutineScope", "(Landroidx/camera/camera2/pipe/core/Threads;Lkotlinx/coroutines/Job;)Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @androidx.camera.camera2.pipe.config.FrameGraphScope
        @dagger.Provides
        @androidx.camera.camera2.pipe.config.FrameGraphCoroutineScope
        public final kotlinx.coroutines.CoroutineScope provideFrameGraphCoroutineScope(androidx.camera.camera2.pipe.core.Threads threads, @androidx.camera.camera2.pipe.config.CameraPipeJob kotlinx.coroutines.Job cameraPipeJob) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(threads, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cameraPipeJob, "");
            return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.SupervisorKt.SupervisorJob(cameraPipeJob).plus(threads.getLightweightDispatcher().plus(new kotlinx.coroutines.CoroutineName("CXCP-FrameGraph"))));
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
