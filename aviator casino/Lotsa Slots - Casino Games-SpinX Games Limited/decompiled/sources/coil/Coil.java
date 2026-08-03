package coil;

/* compiled from: Coil.kt */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0007J\b\u0010\r\u001a\u00020\u000bH\u0007J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0087@¢\u0006\u0002\u0010\u0015R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcoil/Coil;", "", "<init>", "()V", "imageLoader", "Lcoil/ImageLoader;", "imageLoaderFactory", "Lcoil/ImageLoaderFactory;", "context", "Landroid/content/Context;", "setImageLoader", "", "factory", "reset", "newImageLoader", "enqueue", "Lcoil/request/Disposable;", "request", "Lcoil/request/ImageRequest;", "execute", "Lcoil/request/ImageResult;", "(Lcoil/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "coil-singleton_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Coil {
    public static final coil.Coil INSTANCE = new coil.Coil();
    private static coil.ImageLoader imageLoader;
    private static coil.ImageLoaderFactory imageLoaderFactory;

    private Coil() {
    }

    @kotlin.jvm.JvmStatic
    public static final coil.ImageLoader imageLoader(android.content.Context context) {
        coil.ImageLoader imageLoader2 = imageLoader;
        return imageLoader2 == null ? INSTANCE.newImageLoader(context) : imageLoader2;
    }

    @kotlin.jvm.JvmStatic
    public static final synchronized void setImageLoader(coil.ImageLoader imageLoader2) {
        synchronized (coil.Coil.class) {
            imageLoaderFactory = null;
            imageLoader = imageLoader2;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final synchronized void setImageLoader(coil.ImageLoaderFactory factory) {
        synchronized (coil.Coil.class) {
            imageLoaderFactory = factory;
            imageLoader = null;
        }
    }

    @kotlin.jvm.JvmStatic
    public static final synchronized void reset() {
        synchronized (coil.Coil.class) {
            imageLoader = null;
            imageLoaderFactory = null;
        }
    }

    private final synchronized coil.ImageLoader newImageLoader(android.content.Context context) {
        coil.ImageLoader newImageLoader;
        coil.ImageLoader imageLoader2 = imageLoader;
        if (imageLoader2 != null) {
            return imageLoader2;
        }
        coil.ImageLoaderFactory imageLoaderFactory2 = imageLoaderFactory;
        if (imageLoaderFactory2 == null || (newImageLoader = imageLoaderFactory2.newImageLoader()) == null) {
            java.lang.Object applicationContext = context.getApplicationContext();
            coil.ImageLoaderFactory imageLoaderFactory3 = applicationContext instanceof coil.ImageLoaderFactory ? (coil.ImageLoaderFactory) applicationContext : null;
            newImageLoader = imageLoaderFactory3 != null ? imageLoaderFactory3.newImageLoader() : coil.ImageLoaders.create(context);
        }
        imageLoaderFactory = null;
        imageLoader = newImageLoader;
        return newImageLoader;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Replace with 'context.imageLoader.enqueue(request)'.", replaceWith = @kotlin.ReplaceWith(expression = "request.context.imageLoader.enqueue(request)", imports = {"coil.imageLoader"}))
    @kotlin.jvm.JvmStatic
    public static final coil.request.Disposable enqueue(coil.request.ImageRequest request) {
        throw new java.lang.IllegalStateException("Unsupported".toString());
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Replace with 'context.imageLoader.execute(request)'.", replaceWith = @kotlin.ReplaceWith(expression = "request.context.imageLoader.execute(request)", imports = {"coil.imageLoader"}))
    @kotlin.jvm.JvmStatic
    public static final java.lang.Object execute(coil.request.ImageRequest imageRequest, kotlin.coroutines.Continuation<? super coil.request.ImageResult> continuation) {
        throw new java.lang.IllegalStateException("Unsupported".toString());
    }
}
