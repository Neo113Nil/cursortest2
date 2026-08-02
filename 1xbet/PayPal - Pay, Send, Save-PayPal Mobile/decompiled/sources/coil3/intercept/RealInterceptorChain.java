package coil3.intercept;

@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u001e\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\u001f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u000e\u0010 \u001a\u00020!H\u0096@¢\u0006\u0002\u0010\"J\u0018\u0010#\u001a\u00020$2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0006H\u0002J&\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001d¨\u0006'"}, d2 = {"Lcoil3/intercept/RealInterceptorChain;", "Lcoil3/intercept/Interceptor$Chain;", "initialRequest", "Lcoil3/request/ImageRequest;", "interceptors", "", "Lcoil3/intercept/Interceptor;", "index", "", "request", io.ktor.http.ContentDisposition.Parameters.Size, "Lcoil3/size/Size;", "eventListener", "Lcoil3/EventListener;", "isPlaceholderCached", "", "<init>", "(Lcoil3/request/ImageRequest;Ljava/util/List;ILcoil3/request/ImageRequest;Lcoil3/size/Size;Lcoil3/EventListener;Z)V", "getInitialRequest", "()Lcoil3/request/ImageRequest;", "getInterceptors", "()Ljava/util/List;", "getIndex", "()I", "getRequest", "getSize", "()Lcoil3/size/Size;", "getEventListener", "()Lcoil3/EventListener;", "()Z", "withRequest", "withSize", "proceed", "Lcoil3/request/ImageResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkRequest", "", "interceptor", "copy", "coil-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class RealInterceptorChain implements coil3.intercept.Interceptor.Chain {
    private final coil3.EventListener eventListener;
    private final int index;
    private final coil3.view.ImageRequest initialRequest;
    private final java.util.List<coil3.intercept.Interceptor> interceptors;
    private final boolean isPlaceholderCached;
    private final coil3.view.ImageRequest request;
    private final coil3.view.Size size;

    /* JADX WARN: Multi-variable type inference failed */
    public RealInterceptorChain(coil3.view.ImageRequest imageRequest, java.util.List<? extends coil3.intercept.Interceptor> list, int i, coil3.view.ImageRequest imageRequest2, coil3.view.Size size, coil3.EventListener eventListener, boolean z) {
        this.initialRequest = imageRequest;
        this.interceptors = list;
        this.index = i;
        this.request = imageRequest2;
        this.size = size;
        this.eventListener = eventListener;
        this.isPlaceholderCached = z;
    }

    public final coil3.view.ImageRequest getInitialRequest() {
        return this.initialRequest;
    }

    public final java.util.List<coil3.intercept.Interceptor> getInterceptors() {
        return this.interceptors;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // coil3.intercept.Interceptor.Chain
    public final coil3.view.ImageRequest getRequest() {
        return this.request;
    }

    @Override // coil3.intercept.Interceptor.Chain
    public final coil3.view.Size getSize() {
        return this.size;
    }

    public final coil3.EventListener getEventListener() {
        return this.eventListener;
    }

    /* renamed from: isPlaceholderCached, reason: from getter */
    public final boolean getIsPlaceholderCached() {
        return this.isPlaceholderCached;
    }

    @Override // coil3.intercept.Interceptor.Chain
    public final coil3.intercept.Interceptor.Chain withRequest(coil3.view.ImageRequest request) {
        int i = this.index;
        if (i > 0) {
            Camera2StreamConfigurationMap(request, this.interceptors.get(i - 1));
        }
        return getHighResolutionOutputSizeshNQ4ISI(this, 0, request, null, 5);
    }

    @Override // coil3.intercept.Interceptor.Chain
    public final coil3.intercept.Interceptor.Chain withSize(coil3.view.Size size) {
        return getHighResolutionOutputSizeshNQ4ISI(this, 0, null, size, 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // coil3.intercept.Interceptor.Chain
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object proceed(kotlin.coroutines.Continuation<? super coil3.view.ImageResult> continuation) {
        coil3.intercept.RealInterceptorChain$proceed$1 realInterceptorChain$proceed$1;
        int i;
        coil3.intercept.Interceptor interceptor;
        if (continuation instanceof coil3.intercept.RealInterceptorChain$proceed$1) {
            realInterceptorChain$proceed$1 = (coil3.intercept.RealInterceptorChain$proceed$1) continuation;
            if ((realInterceptorChain$proceed$1.Camera2StreamConfigurationMap & Integer.MIN_VALUE) != 0) {
                realInterceptorChain$proceed$1.Camera2StreamConfigurationMap -= 2147483648;
                java.lang.Object obj = realInterceptorChain$proceed$1.getHighResolutionOutputSizeshNQ4ISI;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = realInterceptorChain$proceed$1.Camera2StreamConfigurationMap;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    coil3.intercept.Interceptor interceptor2 = this.interceptors.get(this.index);
                    coil3.intercept.RealInterceptorChain highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this, this.index + 1, null, null, 6);
                    realInterceptorChain$proceed$1.getHighSpeedVideoFpsRanges = interceptor2;
                    realInterceptorChain$proceed$1.Camera2StreamConfigurationMap = 1;
                    java.lang.Object intercept = interceptor2.intercept(highResolutionOutputSizeshNQ4ISI, realInterceptorChain$proceed$1);
                    if (intercept == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    interceptor = interceptor2;
                    obj = intercept;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interceptor = (coil3.intercept.Interceptor) realInterceptorChain$proceed$1.getHighSpeedVideoFpsRanges;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                coil3.view.ImageResult imageResult = (coil3.view.ImageResult) obj;
                Camera2StreamConfigurationMap(imageResult.getRequest(), interceptor);
                return imageResult;
            }
        }
        realInterceptorChain$proceed$1 = new coil3.intercept.RealInterceptorChain$proceed$1(this, continuation);
        java.lang.Object obj2 = realInterceptorChain$proceed$1.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = realInterceptorChain$proceed$1.Camera2StreamConfigurationMap;
        if (i != 0) {
        }
        coil3.view.ImageResult imageResult2 = (coil3.view.ImageResult) obj2;
        Camera2StreamConfigurationMap(imageResult2.getRequest(), interceptor);
        return imageResult2;
    }

    private final void Camera2StreamConfigurationMap(coil3.view.ImageRequest imageRequest, coil3.intercept.Interceptor interceptor) {
        if (imageRequest.getContext() != this.initialRequest.getContext()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Interceptor '");
            sb.append(interceptor);
            sb.append("' cannot modify the request's context.");
            throw new java.lang.IllegalStateException(sb.toString().toString());
        }
        if (imageRequest.getData() == coil3.view.NullRequestData.INSTANCE) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Interceptor '");
            sb2.append(interceptor);
            sb2.append("' cannot set the request's data to null.");
            throw new java.lang.IllegalStateException(sb2.toString().toString());
        }
        if (imageRequest.getTarget() != this.initialRequest.getTarget()) {
            java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Interceptor '");
            sb3.append(interceptor);
            sb3.append("' cannot modify the request's target.");
            throw new java.lang.IllegalStateException(sb3.toString().toString());
        }
        if (imageRequest.getSizeResolver() == this.initialRequest.getSizeResolver()) {
            return;
        }
        java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Interceptor '");
        sb4.append(interceptor);
        sb4.append("' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.");
        throw new java.lang.IllegalStateException(sb4.toString().toString());
    }

    private static /* synthetic */ coil3.intercept.RealInterceptorChain getHighResolutionOutputSizeshNQ4ISI(coil3.intercept.RealInterceptorChain realInterceptorChain, int i, coil3.view.ImageRequest imageRequest, coil3.view.Size size, int i2) {
        if ((i2 & 1) != 0) {
            i = realInterceptorChain.index;
        }
        if ((i2 & 2) != 0) {
            imageRequest = realInterceptorChain.getRequest();
        }
        if ((i2 & 4) != 0) {
            size = realInterceptorChain.getSize();
        }
        return realInterceptorChain.getHighSpeedVideoSizes(i, imageRequest, size);
    }

    private final coil3.intercept.RealInterceptorChain getHighSpeedVideoSizes(int i, coil3.view.ImageRequest imageRequest, coil3.view.Size size) {
        return new coil3.intercept.RealInterceptorChain(this.initialRequest, this.interceptors, i, imageRequest, size, this.eventListener, this.isPlaceholderCached);
    }
}
