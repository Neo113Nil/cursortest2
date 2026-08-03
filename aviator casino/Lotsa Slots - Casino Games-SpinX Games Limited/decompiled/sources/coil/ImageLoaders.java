package coil;

/* compiled from: ImageLoaders.kt */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\b\u0004\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"ImageLoader", "Lcoil/ImageLoader;", "context", "Landroid/content/Context;", "create", "executeBlocking", "Lcoil/request/ImageResult;", "request", "Lcoil/request/ImageRequest;", "coil-base_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ImageLoaders {
    public static final coil.ImageLoader create(android.content.Context context) {
        return new coil.ImageLoader.Builder(context).build();
    }

    public static final coil.request.ImageResult executeBlocking(coil.ImageLoader imageLoader, coil.request.ImageRequest imageRequest) {
        java.lang.Object runBlocking$default;
        runBlocking$default = kotlinx.coroutines.BuildersKt__BuildersKt.runBlocking$default(null, new coil.ImageLoaders$executeBlocking$1(imageLoader, imageRequest, null), 1, null);
        return (coil.request.ImageResult) runBlocking$default;
    }
}
