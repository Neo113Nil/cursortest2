package com.paypal.oslo.feature.qrc.domain.scanner;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/scanner/CameraProviderFactoryImpl;", "Lcom/paypal/oslo/feature/qrc/domain/scanner/CameraProviderFactory;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "getProcessCameraProvider", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CameraProviderFactoryImpl implements com.paypal.oslo.feature.qrc.domain.scanner.CameraProviderFactory {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.qrc.domain.scanner.CameraProviderFactory
    public final java.lang.Object getProcessCameraProvider(android.content.Context context, kotlin.coroutines.Continuation<? super androidx.camera.lifecycle.ProcessCameraProvider> continuation) {
        return kotlinx.coroutines.guava.ListenableFutureKt.await(androidx.camera.lifecycle.ProcessCameraProvider.INSTANCE.getInstance(context), continuation);
    }
}
