package androidx.camera.camera2.pipe.media;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0002\u001a\u001bJ\b\u0010\u0018\u001a\u00020\u0019H&R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u0004\u0018\u00010\rX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u0013X¦\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001cÀ\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/media/ImageReaderWrapper;", "Landroidx/camera/camera2/pipe/UnsafeWrapper;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "surface", "Landroid/view/Surface;", "getSurface", "()Landroid/view/Surface;", "capacity", "", "getCapacity", "()I", "onImageListener", "Landroidx/camera/camera2/pipe/media/ImageReaderWrapper$OnImageListener;", "getOnImageListener", "()Landroidx/camera/camera2/pipe/media/ImageReaderWrapper$OnImageListener;", "setOnImageListener", "(Landroidx/camera/camera2/pipe/media/ImageReaderWrapper$OnImageListener;)V", "onExpectedOutputsListener", "Landroidx/camera/camera2/pipe/media/ImageReaderWrapper$OnExpectedOutputsListener;", "getOnExpectedOutputsListener", "()Landroidx/camera/camera2/pipe/media/ImageReaderWrapper$OnExpectedOutputsListener;", "setOnExpectedOutputsListener", "(Landroidx/camera/camera2/pipe/media/ImageReaderWrapper$OnExpectedOutputsListener;)V", "flush", "", "OnImageListener", "OnExpectedOutputsListener", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ImageReaderWrapper extends androidx.camera.camera2.pipe.UnsafeWrapper, java.lang.AutoCloseable {

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/media/ImageReaderWrapper$OnExpectedOutputsListener;", "", "", "timestamp", "", "Landroidx/camera/camera2/pipe/OutputId;", "outputIds", "", "onExpectedOutputs", "(JLjava/util/Set;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnExpectedOutputsListener {
        void onExpectedOutputs(long timestamp, java.util.Set<androidx.camera.camera2.pipe.OutputId> outputIds);
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J'\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/media/ImageReaderWrapper$OnImageListener;", "", "Landroidx/camera/camera2/pipe/StreamId;", "streamId", "Landroidx/camera/camera2/pipe/OutputId;", "outputId", "Landroidx/camera/camera2/pipe/media/ImageWrapper;", "image", "", "onImage-AQuxepk", "(IILandroidx/camera/camera2/pipe/media/ImageWrapper;)V", "onImage"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface OnImageListener {
        /* renamed from: onImage-AQuxepk */
        void mo999onImageAQuxepk(int streamId, int outputId, androidx.camera.camera2.pipe.media.ImageWrapper image);
    }

    void flush();

    int getCapacity();

    androidx.camera.camera2.pipe.media.ImageReaderWrapper.OnExpectedOutputsListener getOnExpectedOutputsListener();

    androidx.camera.camera2.pipe.media.ImageReaderWrapper.OnImageListener getOnImageListener();

    android.view.Surface getSurface();

    void setOnExpectedOutputsListener(androidx.camera.camera2.pipe.media.ImageReaderWrapper.OnExpectedOutputsListener onExpectedOutputsListener);

    void setOnImageListener(androidx.camera.camera2.pipe.media.ImageReaderWrapper.OnImageListener onImageListener);
}
