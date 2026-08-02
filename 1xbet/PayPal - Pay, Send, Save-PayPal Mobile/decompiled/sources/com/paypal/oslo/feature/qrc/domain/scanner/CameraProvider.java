package com.paypal.oslo.feature.qrc.domain.scanner;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001JP\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u001a\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0004\u0012\u00020\b0\u0006H¦@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH&¢\u0006\u0004\b\u0015\u0010\u0010J3\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u001a\u0010\f\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0004\u0012\u00020\b0\u0006H&¢\u0006\u0004\b\u0016\u0010\u0017À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/scanner/CameraProvider;", "", "Landroid/content/Context;", "context", "Landroidx/lifecycle/LifecycleOwner;", "lifecycleOwner", "Lkotlin/Function1;", "Landroidx/camera/core/SurfaceRequest;", "", "onSurfaceRequest", "", "Lcom/google/mlkit/vision/barcode/common/Barcode;", "onBarcodeAnalyzed", "initialize", "(Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unbindAll", "()V", "", "enabled", "enableFlash", "(Z)V", "pauseAnalysis", "resumeAnalysis", "(Landroid/content/Context;Lkotlin/jvm/functions/Function1;)V"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface CameraProvider {
    void enableFlash(boolean enabled);

    java.lang.Object initialize(android.content.Context context, androidx.view.LifecycleOwner lifecycleOwner, kotlin.jvm.functions.Function1<? super androidx.camera.core.SurfaceRequest, kotlin.Unit> function1, kotlin.jvm.functions.Function1<? super java.util.List<? extends com.google.mlkit.vision.barcode.common.Barcode>, kotlin.Unit> function12, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);

    void pauseAnalysis();

    void resumeAnalysis(android.content.Context context, kotlin.jvm.functions.Function1<? super java.util.List<? extends com.google.mlkit.vision.barcode.common.Barcode>, kotlin.Unit> onBarcodeAnalyzed);

    void unbindAll();
}
