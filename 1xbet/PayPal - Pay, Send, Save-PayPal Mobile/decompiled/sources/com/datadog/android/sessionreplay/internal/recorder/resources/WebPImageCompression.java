package com.datadog.android.sessionreplay.internal.recorder.resources;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\b\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/resources/WebPImageCompression;", "Lcom/datadog/android/sessionreplay/internal/recorder/resources/ImageCompression;", "Lcom/datadog/android/api/InternalLogger;", "logger", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "buildSdkVersionProvider", "<init>", "(Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/internal/system/BuildSdkVersionProvider;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "compressBitmap", "(Landroid/graphics/Bitmap;)[B", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/internal/system/BuildSdkVersionProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Camera2StreamConfigurationMap", "Lcom/datadog/android/api/InternalLogger;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class WebPImageCompression implements com.datadog.android.sessionreplay.internal.recorder.resources.ImageCompression {
    private static final byte[] getHighResolutionOutputSizeshNQ4ISI = new byte[0];

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.internal.system.BuildSdkVersionProvider getHighResolutionOutputSizeshNQ4ISI;

    public WebPImageCompression(com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(buildSdkVersionProvider, "");
        this.getHighSpeedVideoFpsRangesFor = internalLogger;
        this.getHighResolutionOutputSizeshNQ4ISI = buildSdkVersionProvider;
    }

    public /* synthetic */ WebPImageCompression(com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.internal.system.BuildSdkVersionProvider buildSdkVersionProvider, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(internalLogger, (i & 2) != 0 ? com.datadog.android.internal.system.BuildSdkVersionProvider.INSTANCE.getDEFAULT() : buildSdkVersionProvider);
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.resources.ImageCompression
    public final byte[] compressBitmap(android.graphics.Bitmap bitmap) {
        android.graphics.Bitmap.CompressFormat compressFormat;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(bitmap.getAllocationByteCount());
        if (this.getHighResolutionOutputSizeshNQ4ISI.getIsAtLeastR()) {
            compressFormat = android.graphics.Bitmap.CompressFormat.WEBP_LOSSY;
        } else {
            compressFormat = android.graphics.Bitmap.CompressFormat.WEBP;
        }
        try {
            bitmap.compress(compressFormat, 75, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(byteArray, "");
            return byteArray;
        } catch (java.lang.IllegalStateException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRangesFor, com.datadog.android.api.InternalLogger.Level.ERROR, kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.datadog.android.api.InternalLogger.Target[]{com.datadog.android.api.InternalLogger.Target.MAINTAINER, com.datadog.android.api.InternalLogger.Target.TELEMETRY}), (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.recorder.resources.WebPImageCompression$compressBitmap$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Error while compressing the image.";
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return getHighResolutionOutputSizeshNQ4ISI;
        }
    }
}
