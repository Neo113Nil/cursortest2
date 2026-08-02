package com.datadog.android.sessionreplay.internal.utils;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/utils/DrawableUtils$createBitmapOfApproxSizeFromDrawable$1;", "Lcom/datadog/android/sessionreplay/internal/utils/DrawableUtils$ResizeBitmapCallback;", "", "onFailure", "()V", "Landroid/graphics/Bitmap;", "bitmap", "onSuccess", "(Landroid/graphics/Bitmap;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DrawableUtils$createBitmapOfApproxSizeFromDrawable$1 implements com.datadog.android.sessionreplay.internal.utils.DrawableUtils.ResizeBitmapCallback {
    final /* synthetic */ android.graphics.drawable.Drawable getHighResolutionOutputSizeshNQ4ISI;
    final /* synthetic */ com.datadog.android.sessionreplay.internal.recorder.resources.ResourceResolver.BitmapCreationCallback getHighSpeedVideoFpsRanges;
    final /* synthetic */ com.datadog.android.sessionreplay.internal.utils.DrawableUtils getHighSpeedVideoSizes;

    DrawableUtils$createBitmapOfApproxSizeFromDrawable$1(com.datadog.android.sessionreplay.internal.utils.DrawableUtils drawableUtils, android.graphics.drawable.Drawable drawable, com.datadog.android.sessionreplay.internal.recorder.resources.ResourceResolver.BitmapCreationCallback bitmapCreationCallback) {
        this.getHighSpeedVideoSizes = drawableUtils;
        this.getHighResolutionOutputSizeshNQ4ISI = drawable;
        this.getHighSpeedVideoFpsRanges = bitmapCreationCallback;
    }

    @Override // com.datadog.android.sessionreplay.internal.utils.DrawableUtils.ResizeBitmapCallback
    public final void onSuccess(final android.graphics.Bitmap bitmap) {
        java.util.concurrent.ExecutorService executorService;
        com.datadog.android.api.InternalLogger internalLogger;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        executorService = this.getHighSpeedVideoSizes.getHighSpeedVideoSizes;
        internalLogger = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
        final com.datadog.android.sessionreplay.internal.utils.DrawableUtils drawableUtils = this.getHighSpeedVideoSizes;
        final android.graphics.drawable.Drawable drawable = this.getHighResolutionOutputSizeshNQ4ISI;
        final com.datadog.android.sessionreplay.internal.recorder.resources.ResourceResolver.BitmapCreationCallback bitmapCreationCallback = this.getHighSpeedVideoFpsRanges;
        com.datadog.android.core.internal.utils.ConcurrencyExtKt.executeSafe(executorService, "drawOnCanvas", internalLogger, new java.lang.Runnable() { // from class: com.datadog.android.sessionreplay.internal.utils.DrawableUtils$createBitmapOfApproxSizeFromDrawable$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                com.datadog.android.sessionreplay.internal.utils.DrawableUtils.access$drawOnCanvas(com.datadog.android.sessionreplay.internal.utils.DrawableUtils.this, bitmap, drawable, bitmapCreationCallback);
            }
        });
    }

    @Override // com.datadog.android.sessionreplay.internal.utils.DrawableUtils.ResizeBitmapCallback
    public final void onFailure() {
        com.datadog.android.api.InternalLogger internalLogger;
        internalLogger = this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRanges;
        com.datadog.android.api.InternalLogger.DefaultImpls.log$default(internalLogger, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.utils.DrawableUtils$createBitmapOfApproxSizeFromDrawable$1$onFailure$1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
            public final java.lang.String invoke() {
                return com.datadog.android.sessionreplay.internal.utils.DrawableUtils.FAILED_TO_CREATE_SCALED_BITMAP_ERROR;
            }
        }, (java.lang.Throwable) null, false, (java.util.Map) null, 56, (java.lang.Object) null);
        this.getHighSpeedVideoFpsRanges.onFailure();
    }
}
