package coil3.intercept;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0007J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/intercept/Interceptor;", "", "Lcoil3/intercept/Interceptor$Chain;", "chain", "Lcoil3/request/ImageResult;", "intercept", "(Lcoil3/intercept/Interceptor$Chain;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Chain"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface Interceptor {

    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/intercept/Interceptor$Chain;", "", "Lcoil3/request/ImageRequest;", "request", "withRequest", "(Lcoil3/request/ImageRequest;)Lcoil3/intercept/Interceptor$Chain;", "Lcoil3/size/Size;", io.ktor.http.ContentDisposition.Parameters.Size, "withSize", "(Lcoil3/size/Size;)Lcoil3/intercept/Interceptor$Chain;", "Lcoil3/request/ImageResult;", "proceed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRequest", "()Lcoil3/request/ImageRequest;", "getSize", "()Lcoil3/size/Size;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public interface Chain {
        coil3.view.ImageRequest getRequest();

        coil3.view.Size getSize();

        java.lang.Object proceed(kotlin.coroutines.Continuation<? super coil3.view.ImageResult> continuation);

        coil3.intercept.Interceptor.Chain withRequest(coil3.view.ImageRequest request);

        coil3.intercept.Interceptor.Chain withSize(coil3.view.Size size);
    }

    java.lang.Object intercept(coil3.intercept.Interceptor.Chain chain, kotlin.coroutines.Continuation<? super coil3.view.ImageResult> continuation);
}
