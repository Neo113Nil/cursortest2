package coil3;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0007J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u0011\u001a\u00020\fH\u0007J\u0014\u0010\u0012\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0002R\u0011\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0005X\u0082\u0004¨\u0006\u0014"}, d2 = {"Lcoil3/SingletonImageLoader;", "", "<init>", "()V", androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_REFERENCE, "Lkotlinx/atomicfu/AtomicRef;", "get", "Lcoil3/ImageLoader;", "context", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "setSafe", "", "factory", "Lcoil3/SingletonImageLoader$Factory;", "setUnsafe", "imageLoader", "reset", "newImageLoader", "Factory", "coil"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SingletonImageLoader {
    public static final coil3.SingletonImageLoader INSTANCE = new coil3.SingletonImageLoader();
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReference getHighSpeedVideoFpsRanges = new java.util.concurrent.atomic.AtomicReference(null);

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001b\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/SingletonImageLoader$Factory;", "", "Landroid/content/Context;", "Lcoil3/getHighResolutionOutputSizeshNQ4ISI;", "context", "Lcoil3/ImageLoader;", "newImageLoader", "(Landroid/content/Context;)Lcoil3/ImageLoader;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        coil3.ImageLoader newImageLoader(android.content.Context context);
    }

    private SingletonImageLoader() {
    }

    @kotlin.jvm.JvmStatic
    public static final coil3.ImageLoader get(android.content.Context context) {
        java.lang.Object obj = getHighSpeedVideoFpsRanges.get();
        coil3.ImageLoader imageLoader = obj instanceof coil3.ImageLoader ? (coil3.ImageLoader) obj : null;
        return imageLoader == null ? getHighSpeedVideoFpsRanges(context) : imageLoader;
    }

    @kotlin.jvm.JvmStatic
    public static final void setSafe(coil3.SingletonImageLoader.Factory factory) {
        java.lang.Object obj = getHighSpeedVideoFpsRanges.get();
        if (obj instanceof coil3.ImageLoader) {
            if (coil3.SingletonImageLoaderKt.access$isDefault((coil3.ImageLoader) obj)) {
                throw new java.lang.IllegalStateException("The singleton image loader has already been created. This indicates that 'setSafe' is being called after the first 'get' call. Ensure that 'setSafe' is called before any Coil API usages (e.g. `load`, `AsyncImage`, `rememberAsyncImagePainter`, etc.).".toString());
            }
        } else {
            androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(getHighSpeedVideoFpsRanges, obj, factory);
        }
    }

    @kotlin.jvm.JvmStatic
    public static final void setUnsafe(coil3.ImageLoader imageLoader) {
        getHighSpeedVideoFpsRanges.set(imageLoader);
    }

    @kotlin.jvm.JvmStatic
    public static final void setUnsafe(coil3.SingletonImageLoader.Factory factory) {
        getHighSpeedVideoFpsRanges.set(factory);
    }

    @kotlin.jvm.JvmStatic
    public static final void reset() {
        getHighSpeedVideoFpsRanges.set(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static coil3.ImageLoader getHighSpeedVideoFpsRanges(android.content.Context context) {
        java.lang.Object obj;
        coil3.ImageLoader imageLoader;
        coil3.SingletonImageLoader.Factory factory;
        coil3.ImageLoader newImageLoader;
        java.util.concurrent.atomic.AtomicReference atomicReference = getHighSpeedVideoFpsRanges;
        coil3.ImageLoader imageLoader2 = null;
        do {
            obj = atomicReference.get();
            if (obj instanceof coil3.ImageLoader) {
                imageLoader = (coil3.ImageLoader) obj;
            } else {
                if (imageLoader2 == null) {
                    android.content.Context applicationContext = coil3.SingletonImageLoader_androidKt.applicationContext(context);
                    coil3.SingletonImageLoader.Factory factory2 = obj instanceof coil3.SingletonImageLoader.Factory ? (coil3.SingletonImageLoader.Factory) obj : null;
                    if (factory2 == null || (newImageLoader = factory2.newImageLoader(applicationContext)) == null) {
                        coil3.SingletonImageLoader.Factory factory3 = applicationContext instanceof coil3.SingletonImageLoader.Factory ? (coil3.SingletonImageLoader.Factory) applicationContext : null;
                        if (factory3 != null) {
                            imageLoader2 = factory3.newImageLoader(applicationContext);
                        } else {
                            factory = coil3.SingletonImageLoaderKt.getHighResolutionOutputSizeshNQ4ISI;
                            imageLoader2 = factory.newImageLoader(applicationContext);
                        }
                    } else {
                        imageLoader2 = newImageLoader;
                    }
                }
                imageLoader = imageLoader2;
            }
        } while (!androidx.camera.view.PreviewView$1$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, obj, imageLoader));
        kotlin.jvm.internal.Intrinsics.checkNotNull(imageLoader, "");
        return imageLoader;
    }
}
