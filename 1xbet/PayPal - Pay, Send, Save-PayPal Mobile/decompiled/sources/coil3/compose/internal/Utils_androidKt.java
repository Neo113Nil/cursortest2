package coil3.compose.internal;

@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcoil3/request/ImageRequest;", "request", "", "validateRequestProperties", "(Lcoil3/request/ImageRequest;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class Utils_androidKt {
    public static final void validateRequestProperties(coil3.view.ImageRequest imageRequest) {
        if (imageRequest.getTarget() != null) {
            throw new java.lang.IllegalArgumentException("request.target must be null.".toString());
        }
        if (coil3.view.ImageRequests_androidKt.getLifecycle(imageRequest) != null) {
            throw new java.lang.IllegalArgumentException("request.lifecycle must be null.".toString());
        }
    }
}
