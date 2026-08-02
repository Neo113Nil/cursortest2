package coil3.compose;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\tJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lcoil3/compose/AsyncImagePreviewHandler;", "", "Lcoil3/ImageLoader;", "imageLoader", "Lcoil3/request/ImageRequest;", "request", "Lcoil3/compose/AsyncImagePainter$State;", "handle", "(Lcoil3/ImageLoader;Lcoil3/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AsyncImagePreviewHandler {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final coil3.compose.AsyncImagePreviewHandler.Companion INSTANCE = coil3.compose.AsyncImagePreviewHandler.Companion.getHighSpeedVideoFpsRanges;
    public static final coil3.compose.AsyncImagePreviewHandler Default = coil3.compose.AsyncImagePreviewHandler$Companion$Default$1.Camera2StreamConfigurationMap;

    java.lang.Object handle(coil3.ImageLoader imageLoader, coil3.view.ImageRequest imageRequest, kotlin.coroutines.Continuation<? super coil3.compose.AsyncImagePainter.State> continuation);

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0001"}, d2 = {"Lcoil3/compose/AsyncImagePreviewHandler$Companion;", "", "<init>", "()V", "Lcoil3/compose/AsyncImagePreviewHandler;", "Default", "Lcoil3/compose/AsyncImagePreviewHandler;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes7.dex */
    public static final class Companion {
        static final /* synthetic */ coil3.compose.AsyncImagePreviewHandler.Companion getHighSpeedVideoFpsRanges = new coil3.compose.AsyncImagePreviewHandler.Companion();

        private Companion() {
        }
    }
}
