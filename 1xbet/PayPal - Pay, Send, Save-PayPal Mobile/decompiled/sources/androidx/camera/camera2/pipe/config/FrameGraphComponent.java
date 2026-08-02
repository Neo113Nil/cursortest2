package androidx.camera.camera2.pipe.config;

@androidx.camera.camera2.pipe.config.FrameGraphScope
@dagger.Subcomponent(modules = {androidx.camera.camera2.pipe.config.FrameGraphModule.class, androidx.camera.camera2.pipe.config.FrameGraphConfigModule.class})
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\ba\u0018\u00002\u00020\u0001:\u0001\u0005J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/config/FrameGraphComponent;", "", "Landroidx/camera/camera2/pipe/FrameGraph;", "frameGraph", "()Landroidx/camera/camera2/pipe/FrameGraph;", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface FrameGraphComponent {

    @dagger.Subcomponent.Builder
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/config/FrameGraphComponent$Builder;", "", "Landroidx/camera/camera2/pipe/config/FrameGraphConfigModule;", "config", "frameGraphConfigModule", "(Landroidx/camera/camera2/pipe/config/FrameGraphConfigModule;)Landroidx/camera/camera2/pipe/config/FrameGraphComponent$Builder;", "Landroidx/camera/camera2/pipe/config/FrameGraphComponent;", "build", "()Landroidx/camera/camera2/pipe/config/FrameGraphComponent;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Builder {
        androidx.camera.camera2.pipe.config.FrameGraphComponent build();

        androidx.camera.camera2.pipe.config.FrameGraphComponent.Builder frameGraphConfigModule(androidx.camera.camera2.pipe.config.FrameGraphConfigModule config);
    }

    androidx.camera.camera2.pipe.FrameGraph frameGraph();
}
