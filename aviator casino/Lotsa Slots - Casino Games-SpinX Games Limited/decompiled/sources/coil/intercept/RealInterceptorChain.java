package coil.intercept;

/* compiled from: RealInterceptorChain.kt */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u001e\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\u0003H\u0016J\u0010\u0010\u001f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010 \u001a\u00020!2\u0006\u0010\t\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010\"J\u0018\u0010#\u001a\u00020$2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010%\u001a\u00020\u0006H\u0002J&\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001d¨\u0006'"}, d2 = {"Lcoil/intercept/RealInterceptorChain;", "Lcoil/intercept/Interceptor$Chain;", "initialRequest", "Lcoil/request/ImageRequest;", "interceptors", "", "Lcoil/intercept/Interceptor;", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "request", "size", "Lcoil/size/Size;", "eventListener", "Lcoil/EventListener;", "isPlaceholderCached", "", "<init>", "(Lcoil/request/ImageRequest;Ljava/util/List;ILcoil/request/ImageRequest;Lcoil/size/Size;Lcoil/EventListener;Z)V", "getInitialRequest", "()Lcoil/request/ImageRequest;", "getInterceptors", "()Ljava/util/List;", "getIndex", "()I", "getRequest", "getSize", "()Lcoil/size/Size;", "getEventListener", "()Lcoil/EventListener;", "()Z", "withRequest", "withSize", "proceed", "Lcoil/request/ImageResult;", "(Lcoil/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "checkRequest", "", "interceptor", "copy", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RealInterceptorChain implements coil.intercept.Interceptor.Chain {
    private final coil.EventListener eventListener;
    private final int index;
    private final coil.request.ImageRequest initialRequest;
    private final java.util.List<coil.intercept.Interceptor> interceptors;
    private final boolean isPlaceholderCached;
    private final coil.request.ImageRequest request;
    private final coil.size.Size size;

    /* JADX WARN: Multi-variable type inference failed */
    public RealInterceptorChain(coil.request.ImageRequest imageRequest, java.util.List<? extends coil.intercept.Interceptor> list, int i, coil.request.ImageRequest imageRequest2, coil.size.Size size, coil.EventListener eventListener, boolean z) {
        this.initialRequest = imageRequest;
        this.interceptors = list;
        this.index = i;
        this.request = imageRequest2;
        this.size = size;
        this.eventListener = eventListener;
        this.isPlaceholderCached = z;
    }

    public final coil.request.ImageRequest getInitialRequest() {
        return this.initialRequest;
    }

    public final java.util.List<coil.intercept.Interceptor> getInterceptors() {
        return this.interceptors;
    }

    public final int getIndex() {
        return this.index;
    }

    @Override // coil.intercept.Interceptor.Chain
    public coil.request.ImageRequest getRequest() {
        return this.request;
    }

    @Override // coil.intercept.Interceptor.Chain
    public coil.size.Size getSize() {
        return this.size;
    }

    public final coil.EventListener getEventListener() {
        return this.eventListener;
    }

    /* renamed from: isPlaceholderCached, reason: from getter */
    public final boolean getIsPlaceholderCached() {
        return this.isPlaceholderCached;
    }

    @Override // coil.intercept.Interceptor.Chain
    public coil.intercept.Interceptor.Chain withRequest(coil.request.ImageRequest request) {
        int i = this.index;
        if (i > 0) {
            checkRequest(request, this.interceptors.get(i - 1));
        }
        return copy$default(this, 0, request, null, 5, null);
    }

    @Override // coil.intercept.Interceptor.Chain
    public coil.intercept.Interceptor.Chain withSize(coil.size.Size size) {
        return copy$default(this, 0, null, size, 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // coil.intercept.Interceptor.Chain
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object proceed(coil.request.ImageRequest imageRequest, kotlin.coroutines.Continuation<? super coil.request.ImageResult> continuation) {
        coil.intercept.RealInterceptorChain$proceed$1 realInterceptorChain$proceed$1;
        int i;
        coil.intercept.RealInterceptorChain realInterceptorChain;
        coil.intercept.Interceptor interceptor;
        if (continuation instanceof coil.intercept.RealInterceptorChain$proceed$1) {
            realInterceptorChain$proceed$1 = (coil.intercept.RealInterceptorChain$proceed$1) continuation;
            if ((realInterceptorChain$proceed$1.label & Integer.MIN_VALUE) != 0) {
                realInterceptorChain$proceed$1.label -= Integer.MIN_VALUE;
                java.lang.Object obj = realInterceptorChain$proceed$1.result;
                java.lang.Object coroutine_suspended = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = realInterceptorChain$proceed$1.label;
                if (i != 0) {
                    kotlin.ResultKt.throwOnFailure(obj);
                    int i2 = this.index;
                    if (i2 > 0) {
                        checkRequest(imageRequest, this.interceptors.get(i2 - 1));
                    }
                    coil.intercept.Interceptor interceptor2 = this.interceptors.get(this.index);
                    coil.intercept.RealInterceptorChain copy$default = copy$default(this, this.index + 1, imageRequest, null, 4, null);
                    realInterceptorChain$proceed$1.L$0 = this;
                    realInterceptorChain$proceed$1.L$1 = interceptor2;
                    realInterceptorChain$proceed$1.label = 1;
                    java.lang.Object intercept = interceptor2.intercept(copy$default, realInterceptorChain$proceed$1);
                    if (intercept == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    realInterceptorChain = this;
                    obj = intercept;
                    interceptor = interceptor2;
                } else {
                    if (i != 1) {
                        throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interceptor = (coil.intercept.Interceptor) realInterceptorChain$proceed$1.L$1;
                    realInterceptorChain = (coil.intercept.RealInterceptorChain) realInterceptorChain$proceed$1.L$0;
                    kotlin.ResultKt.throwOnFailure(obj);
                }
                coil.request.ImageResult imageResult = (coil.request.ImageResult) obj;
                realInterceptorChain.checkRequest(imageResult.getRequest(), interceptor);
                return imageResult;
            }
        }
        realInterceptorChain$proceed$1 = new coil.intercept.RealInterceptorChain$proceed$1(this, continuation);
        java.lang.Object obj2 = realInterceptorChain$proceed$1.result;
        java.lang.Object coroutine_suspended2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = realInterceptorChain$proceed$1.label;
        if (i != 0) {
        }
        coil.request.ImageResult imageResult2 = (coil.request.ImageResult) obj2;
        realInterceptorChain.checkRequest(imageResult2.getRequest(), interceptor);
        return imageResult2;
    }

    private final void checkRequest(coil.request.ImageRequest request, coil.intercept.Interceptor interceptor) {
        if (request.getContext() != this.initialRequest.getContext()) {
            throw new java.lang.IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's context.").toString());
        }
        if (request.getData() == coil.request.NullRequestData.INSTANCE) {
            throw new java.lang.IllegalStateException(("Interceptor '" + interceptor + "' cannot set the request's data to null.").toString());
        }
        if (request.getTarget() != this.initialRequest.getTarget()) {
            throw new java.lang.IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's target.").toString());
        }
        if (request.getLifecycle() != this.initialRequest.getLifecycle()) {
            throw new java.lang.IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's lifecycle.").toString());
        }
        if (request.getSizeResolver() == this.initialRequest.getSizeResolver()) {
            return;
        }
        throw new java.lang.IllegalStateException(("Interceptor '" + interceptor + "' cannot modify the request's size resolver. Use `Interceptor.Chain.withSize` instead.").toString());
    }

    static /* synthetic */ coil.intercept.RealInterceptorChain copy$default(coil.intercept.RealInterceptorChain realInterceptorChain, int i, coil.request.ImageRequest imageRequest, coil.size.Size size, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = realInterceptorChain.index;
        }
        if ((i2 & 2) != 0) {
            imageRequest = realInterceptorChain.getRequest();
        }
        if ((i2 & 4) != 0) {
            size = realInterceptorChain.getSize();
        }
        return realInterceptorChain.copy(i, imageRequest, size);
    }

    private final coil.intercept.RealInterceptorChain copy(int index, coil.request.ImageRequest request, coil.size.Size size) {
        return new coil.intercept.RealInterceptorChain(this.initialRequest, this.interceptors, index, request, size, this.eventListener, this.isPlaceholderCached);
    }
}
