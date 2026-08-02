package coil3;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcoil3/ImageLoader;", "Lcoil3/request/ImageRequest;", "request", "Lcoil3/request/ImageResult;", "executeBlocking", "(Lcoil3/ImageLoader;Lcoil3/request/ImageRequest;)Lcoil3/request/ImageResult;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImageLoaders {
    public static final coil3.view.ImageResult executeBlocking(coil3.ImageLoader imageLoader, coil3.view.ImageRequest imageRequest) {
        java.lang.Object runBlocking$default;
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new coil3.ImageLoaders$executeBlocking$1(imageLoader, imageRequest, null), 1, null);
        return (coil3.view.ImageResult) runBlocking$default;
    }
}
