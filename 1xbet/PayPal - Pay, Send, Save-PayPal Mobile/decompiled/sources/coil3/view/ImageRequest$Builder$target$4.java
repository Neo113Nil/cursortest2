package coil3.view;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u0006"}, d2 = {"Lcoil3/request/ImageRequest$Builder$target$4;", "Lcoil3/target/Target;", "Lcoil3/Image;", com.datadog.android.sessionreplay.MobileSegmentConstantsKt.WIREFRAME_TYPE_PLACEHOLDER, "", "onStart", "(Lcoil3/Image;)V", "error", "onError", "result", "onSuccess"}, k = 1, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes.dex */
public final class ImageRequest$Builder$target$4 implements coil3.target.Target {
    final /* synthetic */ kotlin.jvm.functions.Function1<coil3.Image, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<coil3.Image, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function1<coil3.Image, kotlin.Unit> getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public ImageRequest$Builder$target$4(kotlin.jvm.functions.Function1<? super coil3.Image, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super coil3.Image, kotlin.Unit> function12, kotlin.jvm.functions.Function1<? super coil3.Image, kotlin.Unit> function13) {
        this.Camera2StreamConfigurationMap = function1;
        this.getHighSpeedVideoSizes = function12;
        this.getHighSpeedVideoFpsRanges = function13;
    }

    @Override // coil3.target.Target
    public final void onStart(coil3.Image placeholder) {
        this.Camera2StreamConfigurationMap.invoke(placeholder);
    }

    @Override // coil3.target.Target
    public final void onError(coil3.Image error) {
        this.getHighSpeedVideoSizes.invoke(error);
    }

    @Override // coil3.target.Target
    public final void onSuccess(coil3.Image result) {
        this.getHighSpeedVideoFpsRanges.invoke(result);
    }
}
