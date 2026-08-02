package androidx.camera.lifecycle;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/camera/lifecycle/ProcessCameraProvider$Companion;", "Landroid/content/Context;", "context", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "awaitInstance", "(Landroidx/camera/lifecycle/ProcessCameraProvider$Companion;Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProcessCameraProviderExtKt {
    public static final java.lang.Object awaitInstance(androidx.camera.lifecycle.ProcessCameraProvider.Companion companion, android.content.Context context, kotlin.coroutines.Continuation<? super androidx.camera.lifecycle.ProcessCameraProvider> continuation) {
        return androidx.concurrent.futures.ListenableFutureKt.await(companion.getInstance(context), continuation);
    }
}
