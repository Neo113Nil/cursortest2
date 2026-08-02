package coil3.view;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcoil3/ImageLoader;", "imageLoader", "Lcoil3/util/SystemCallbacks;", "systemCallbacks", "Lcoil3/util/Logger;", "logger", "Lcoil3/request/RequestService;", "RequestService", "(Lcoil3/ImageLoader;Lcoil3/util/SystemCallbacks;Lcoil3/util/Logger;)Lcoil3/request/RequestService;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RequestService_androidKt {
    public static final coil3.view.RequestService RequestService(coil3.ImageLoader imageLoader, coil3.content.SystemCallbacks systemCallbacks, coil3.content.Logger logger) {
        return new coil3.view.AndroidRequestService(imageLoader, systemCallbacks, logger);
    }
}
