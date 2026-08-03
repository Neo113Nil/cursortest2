package coil.util;

/* compiled from: CoilUtils.kt */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lcoil/util/CoilUtils;", "", "<init>", "()V", "dispose", "", com.facebook.appevents.internal.ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "result", "Lcoil/request/ImageResult;", "createDefaultCache", "Lokhttp3/Cache;", "context", "Landroid/content/Context;", "coil-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CoilUtils {
    public static final coil.util.CoilUtils INSTANCE = new coil.util.CoilUtils();

    private CoilUtils() {
    }

    @kotlin.jvm.JvmStatic
    public static final void dispose(android.view.View view) {
        coil.util.Utils.getRequestManager(view).dispose();
    }

    @kotlin.jvm.JvmStatic
    public static final coil.request.ImageResult result(android.view.View view) {
        return coil.util.Utils.getRequestManager(view).getResult();
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "ImageLoaders no longer (and should not) use OkHttp's disk cache. Use 'ImageLoader.Builder.diskCache' to configure a custom disk cache.")
    @kotlin.jvm.JvmStatic
    public static final okhttp3.Cache createDefaultCache(android.content.Context context) {
        coil.util.Utils.unsupported();
        throw new kotlin.KotlinNothingValueException();
    }
}
