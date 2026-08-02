package com.paypal.oslo.feature.qrc.domain.scanner;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/paypal/oslo/feature/qrc/domain/scanner/CameraComponentsFactoryImpl;", "Lcom/paypal/oslo/feature/qrc/domain/scanner/CameraComponentsFactory;", "<init>", "()V", "Landroidx/camera/core/Preview;", "createPreview", "()Landroidx/camera/core/Preview;", "Landroidx/camera/core/ImageAnalysis;", "createImageAnalysis", "()Landroidx/camera/core/ImageAnalysis;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class CameraComponentsFactoryImpl implements com.paypal.oslo.feature.qrc.domain.scanner.CameraComponentsFactory {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.qrc.domain.scanner.CameraComponentsFactory
    public final androidx.camera.core.Preview createPreview() {
        androidx.camera.core.Preview build = new androidx.camera.core.Preview.Builder().build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }

    @Override // com.paypal.oslo.feature.qrc.domain.scanner.CameraComponentsFactory
    public final androidx.camera.core.ImageAnalysis createImageAnalysis() {
        androidx.camera.core.ImageAnalysis build = new androidx.camera.core.ImageAnalysis.Builder().setBackpressureStrategy(0).build();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(build, "");
        return build;
    }
}
