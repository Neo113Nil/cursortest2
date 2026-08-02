package coil3.view;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcoil3/request/ImageRequest$Builder$listener$5;", "Lcoil3/request/ImageRequest$Listener;", "Lcoil3/request/ImageRequest;", "request", "", "onStart", "(Lcoil3/request/ImageRequest;)V", "onCancel", "Lcoil3/request/ErrorResult;", "result", "onError", "(Lcoil3/request/ImageRequest;Lcoil3/request/ErrorResult;)V", "Lcoil3/request/SuccessResult;", "onSuccess", "(Lcoil3/request/ImageRequest;Lcoil3/request/SuccessResult;)V"}, k = 1, mv = {2, 1, 0}, xi = 176)
/* loaded from: classes.dex */
public final class ImageRequest$Builder$listener$5 implements coil3.request.ImageRequest.Listener {
    final /* synthetic */ kotlin.jvm.functions.Function2<coil3.view.ImageRequest, coil3.view.ErrorResult, kotlin.Unit> Camera2StreamConfigurationMap;
    final /* synthetic */ kotlin.jvm.functions.Function1<coil3.view.ImageRequest, kotlin.Unit> getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ kotlin.jvm.functions.Function1<coil3.view.ImageRequest, kotlin.Unit> getHighSpeedVideoFpsRanges;
    final /* synthetic */ kotlin.jvm.functions.Function2<coil3.view.ImageRequest, coil3.view.SuccessResult, kotlin.Unit> getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: Multi-variable type inference failed */
    public ImageRequest$Builder$listener$5(kotlin.jvm.functions.Function1<? super coil3.view.ImageRequest, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super coil3.view.ImageRequest, kotlin.Unit> function12, kotlin.jvm.functions.Function2<? super coil3.view.ImageRequest, ? super coil3.view.ErrorResult, kotlin.Unit> function2, kotlin.jvm.functions.Function2<? super coil3.view.ImageRequest, ? super coil3.view.SuccessResult, kotlin.Unit> function22) {
        this.getHighResolutionOutputSizeshNQ4ISI = function1;
        this.getHighSpeedVideoFpsRanges = function12;
        this.Camera2StreamConfigurationMap = function2;
        this.getHighSpeedVideoFpsRangesFor = function22;
    }

    @Override // coil3.request.ImageRequest.Listener
    public final void onStart(coil3.view.ImageRequest request) {
        this.getHighResolutionOutputSizeshNQ4ISI.invoke(request);
    }

    @Override // coil3.request.ImageRequest.Listener
    public final void onCancel(coil3.view.ImageRequest request) {
        this.getHighSpeedVideoFpsRanges.invoke(request);
    }

    @Override // coil3.request.ImageRequest.Listener
    public final void onError(coil3.view.ImageRequest request, coil3.view.ErrorResult result) {
        this.Camera2StreamConfigurationMap.invoke(request, result);
    }

    @Override // coil3.request.ImageRequest.Listener
    public final void onSuccess(coil3.view.ImageRequest request, coil3.view.SuccessResult result) {
        this.getHighSpeedVideoFpsRangesFor.invoke(request, result);
    }
}
