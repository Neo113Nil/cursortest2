package com.paypal.oslo.feature.qrc.data.scanner;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/qrc/data/scanner/PreprocessedImageProvider;", "Lcom/paypal/oslo/feature/qrc/domain/scanner/ImageProvider;", "Landroid/content/Context;", "context", "baseProvider", "Lcom/paypal/oslo/feature/qrc/data/scanner/ImagePreprocessor;", "preprocessor", "<init>", "(Landroid/content/Context;Lcom/paypal/oslo/feature/qrc/domain/scanner/ImageProvider;Lcom/paypal/oslo/feature/qrc/data/scanner/ImagePreprocessor;)V", "Landroid/net/Uri;", "uri", "Lcom/google/mlkit/vision/common/InputImage;", "fromUri", "(Landroid/content/Context;Landroid/net/Uri;)Lcom/google/mlkit/vision/common/InputImage;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "getHighSpeedVideoSizes", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/qrc/domain/scanner/ImageProvider;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/qrc/data/scanner/ImagePreprocessor;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class PreprocessedImageProvider implements com.paypal.oslo.feature.qrc.domain.scanner.ImageProvider {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.qrc.data.scanner.ImagePreprocessor Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.qrc.domain.scanner.ImageProvider getHighSpeedVideoFpsRanges;

    public PreprocessedImageProvider(android.content.Context context, com.paypal.oslo.feature.qrc.domain.scanner.ImageProvider imageProvider, com.paypal.oslo.feature.qrc.data.scanner.ImagePreprocessor imagePreprocessor) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imageProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(imagePreprocessor, "");
        this.getHighSpeedVideoSizes = context;
        this.getHighSpeedVideoFpsRanges = imageProvider;
        this.Camera2StreamConfigurationMap = imagePreprocessor;
    }

    public /* synthetic */ PreprocessedImageProvider(android.content.Context context, com.paypal.oslo.feature.qrc.data.scanner.AndroidImageProvider androidImageProvider, com.paypal.oslo.feature.qrc.data.scanner.ImagePreprocessor imagePreprocessor, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? new com.paypal.oslo.feature.qrc.data.scanner.AndroidImageProvider() : androidImageProvider, (i & 4) != 0 ? new com.paypal.oslo.feature.qrc.data.scanner.ImagePreprocessor(context) : imagePreprocessor);
    }

    @Override // com.paypal.oslo.feature.qrc.domain.scanner.ImageProvider
    public final com.google.mlkit.vision.common.InputImage fromUri(android.content.Context context, android.net.Uri uri) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uri, "");
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) kotlinx.coroutines.BuildersKt.runBlocking(kotlinx.coroutines.Dispatchers.getDefault(), new com.paypal.oslo.feature.qrc.data.scanner.PreprocessedImageProvider$fromUri$preprocessedBitmap$1(this, uri, null));
        if (bitmap != null) {
            com.google.mlkit.vision.common.InputImage fromBitmap = com.google.mlkit.vision.common.InputImage.fromBitmap(bitmap, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fromBitmap, "");
            return fromBitmap;
        }
        return this.getHighSpeedVideoFpsRanges.fromUri(context, uri);
    }
}
