package coil.intercept;

/* compiled from: Interceptor.kt */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0007J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcoil/intercept/Interceptor;", "", "intercept", "Lcoil/request/ImageResult;", "chain", "Lcoil/intercept/Interceptor$Chain;", "(Lcoil/intercept/Interceptor$Chain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Chain", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface Interceptor {

    /* compiled from: Interceptor.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\n\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H'J\u0010\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u000eR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Lcoil/intercept/Interceptor$Chain;", "", "request", "Lcoil/request/ImageRequest;", "getRequest", "()Lcoil/request/ImageRequest;", "size", "Lcoil/size/Size;", "getSize", "()Lcoil/size/Size;", "withRequest", "withSize", "proceed", "Lcoil/request/ImageResult;", "(Lcoil/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Chain {
        coil.request.ImageRequest getRequest();

        coil.size.Size getSize();

        java.lang.Object proceed(coil.request.ImageRequest imageRequest, kotlin.coroutines.Continuation<? super coil.request.ImageResult> continuation);

        coil.intercept.Interceptor.Chain withRequest(coil.request.ImageRequest request);

        coil.intercept.Interceptor.Chain withSize(coil.size.Size size);
    }

    java.lang.Object intercept(coil.intercept.Interceptor.Chain chain, kotlin.coroutines.Continuation<? super coil.request.ImageResult> continuation);
}
