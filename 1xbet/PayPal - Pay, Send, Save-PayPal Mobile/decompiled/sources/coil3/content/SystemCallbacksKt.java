package coil3.content;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcoil3/RealImageLoader;", "imageLoader", "Lcoil3/util/SystemCallbacks;", "SystemCallbacks", "(Lcoil3/RealImageLoader;)Lcoil3/util/SystemCallbacks;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SystemCallbacksKt {
    public static final coil3.content.SystemCallbacks SystemCallbacks(coil3.RealImageLoader realImageLoader) {
        return new coil3.content.AndroidSystemCallbacks(realImageLoader);
    }
}
