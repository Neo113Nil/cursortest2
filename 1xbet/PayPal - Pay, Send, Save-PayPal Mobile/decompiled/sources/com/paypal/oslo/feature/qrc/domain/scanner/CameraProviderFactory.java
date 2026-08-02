package com.paypal.oslo.feature.qrc.domain.scanner;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/scanner/CameraProviderFactory;", "", "Landroid/content/Context;", "context", "Landroidx/camera/lifecycle/ProcessCameraProvider;", "getProcessCameraProvider", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface CameraProviderFactory {
    java.lang.Object getProcessCameraProvider(android.content.Context context, kotlin.coroutines.Continuation<? super androidx.camera.lifecycle.ProcessCameraProvider> continuation);
}
