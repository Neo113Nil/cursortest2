package com.paypal.oslo.feature.qrc.data.scanner;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/qrc/data/scanner/AndroidImageProvider;", "Lcom/paypal/oslo/feature/qrc/domain/scanner/ImageProvider;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/net/Uri;", "uri", "Lcom/google/mlkit/vision/common/InputImage;", "fromUri", "(Landroid/content/Context;Landroid/net/Uri;)Lcom/google/mlkit/vision/common/InputImage;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class AndroidImageProvider implements com.paypal.oslo.feature.qrc.domain.scanner.ImageProvider {
    public static final int $stable = 0;

    @Override // com.paypal.oslo.feature.qrc.domain.scanner.ImageProvider
    public final com.google.mlkit.vision.common.InputImage fromUri(android.content.Context context, android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        com.google.mlkit.vision.common.InputImage fromFilePath = com.google.mlkit.vision.common.InputImage.fromFilePath(context, uri);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromFilePath, "");
        return fromFilePath;
    }
}
