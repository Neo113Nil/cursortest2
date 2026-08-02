package com.datadog.android.sessionreplay.internal.utils;

@kotlin.Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u0000 02\u00020\u0001:\u000201B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJK\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00102\b\b\u0002\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u0015\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u001f\u0010 J3\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100$2\u0006\u0010!\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\u0010H\u0002¢\u0006\u0004\b%\u0010&R\u0014\u0010)\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010*R\u0014\u0010'\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010%\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010.R\u0014\u0010,\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010/"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/utils/DrawableUtils;", "", "Lcom/datadog/android/api/InternalLogger;", "internalLogger", "Lcom/datadog/android/sessionreplay/internal/recorder/resources/BitmapCachesManager;", "bitmapCachesManager", "Ljava/util/concurrent/ExecutorService;", "executorService", "Lcom/datadog/android/sessionreplay/recorder/wrappers/BitmapWrapper;", "bitmapWrapper", "Lcom/datadog/android/sessionreplay/recorder/wrappers/CanvasWrapper;", "canvasWrapper", "<init>", "(Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/sessionreplay/internal/recorder/resources/BitmapCachesManager;Ljava/util/concurrent/ExecutorService;Lcom/datadog/android/sessionreplay/recorder/wrappers/BitmapWrapper;Lcom/datadog/android/sessionreplay/recorder/wrappers/CanvasWrapper;)V", "Landroid/graphics/drawable/Drawable;", "drawable", "", "drawableWidth", "drawableHeight", "Landroid/util/DisplayMetrics;", "displayMetrics", "requestedSizeInBytes", "Landroid/graphics/Bitmap$Config;", "config", "Lcom/datadog/android/sessionreplay/internal/recorder/resources/ResourceResolver$BitmapCreationCallback;", "bitmapCreationCallback", "", "createBitmapOfApproxSizeFromDrawable$dd_sdk_android_session_replay_release", "(Landroid/graphics/drawable/Drawable;IILandroid/util/DisplayMetrics;ILandroid/graphics/Bitmap$Config;Lcom/datadog/android/sessionreplay/internal/recorder/resources/ResourceResolver$BitmapCreationCallback;)V", "Landroid/graphics/Bitmap;", "bitmap", "createScaledBitmap$dd_sdk_android_session_replay_release", "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;", "p0", "p1", "p2", "Lkotlin/Pair;", "getHighSpeedVideoSizes", "(III)Lkotlin/Pair;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/sessionreplay/internal/recorder/resources/BitmapCachesManager;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/sessionreplay/recorder/wrappers/BitmapWrapper;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/sessionreplay/recorder/wrappers/CanvasWrapper;", "Ljava/util/concurrent/ExecutorService;", "Lcom/datadog/android/api/InternalLogger;", "Companion", "ResizeBitmapCallback"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DrawableUtils {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.datadog.android.sessionreplay.internal.utils.DrawableUtils.Companion INSTANCE = new com.datadog.android.sessionreplay.internal.utils.DrawableUtils.Companion(null);
    public static final java.lang.String DRAWABLE_DRAW_FINISHED_WITH_RUNTIME_EXCEPTION = "Drawable.draw call finished with an exception. Drawable type is";
    public static final java.lang.String FAILED_TO_CREATE_SCALED_BITMAP_ERROR = "Failed to create a scaled bitmap from the drawable";
    public static final int MAX_BITMAP_SIZE_BYTES_WITH_RESOURCE_ENDPOINT = 10485760;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.recorder.resources.BitmapCachesManager getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.concurrent.ExecutorService getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.recorder.wrappers.CanvasWrapper Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.recorder.wrappers.BitmapWrapper getHighSpeedVideoFpsRangesFor;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/utils/DrawableUtils$ResizeBitmapCallback;", "", "", "onFailure", "()V", "Landroid/graphics/Bitmap;", "bitmap", "onSuccess", "(Landroid/graphics/Bitmap;)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface ResizeBitmapCallback {
        void onFailure();

        void onSuccess(android.graphics.Bitmap bitmap);
    }

    public DrawableUtils(com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.sessionreplay.internal.recorder.resources.BitmapCachesManager bitmapCachesManager, java.util.concurrent.ExecutorService executorService, com.datadog.android.sessionreplay.recorder.wrappers.BitmapWrapper bitmapWrapper, com.datadog.android.sessionreplay.recorder.wrappers.CanvasWrapper canvasWrapper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmapCachesManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(executorService, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmapWrapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvasWrapper, "");
        this.getHighSpeedVideoFpsRanges = internalLogger;
        this.getHighResolutionOutputSizeshNQ4ISI = bitmapCachesManager;
        this.getHighSpeedVideoSizes = executorService;
        this.getHighSpeedVideoFpsRangesFor = bitmapWrapper;
        this.Camera2StreamConfigurationMap = canvasWrapper;
    }

    public /* synthetic */ DrawableUtils(com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.sessionreplay.internal.recorder.resources.BitmapCachesManager bitmapCachesManager, java.util.concurrent.ExecutorService executorService, com.datadog.android.sessionreplay.recorder.wrappers.BitmapWrapper bitmapWrapper, com.datadog.android.sessionreplay.recorder.wrappers.CanvasWrapper canvasWrapper, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(internalLogger, bitmapCachesManager, executorService, (i & 8) != 0 ? new com.datadog.android.sessionreplay.recorder.wrappers.BitmapWrapper(internalLogger) : bitmapWrapper, (i & 16) != 0 ? new com.datadog.android.sessionreplay.recorder.wrappers.CanvasWrapper(internalLogger) : canvasWrapper);
    }

    public final void createBitmapOfApproxSizeFromDrawable$dd_sdk_android_session_replay_release(android.graphics.drawable.Drawable drawable, int drawableWidth, int drawableHeight, android.util.DisplayMetrics displayMetrics, int requestedSizeInBytes, android.graphics.Bitmap.Config config, com.datadog.android.sessionreplay.internal.recorder.resources.ResourceResolver.BitmapCreationCallback bitmapCreationCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(drawable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayMetrics, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmapCreationCallback, "");
        com.datadog.android.sessionreplay.internal.utils.DrawableUtils$createBitmapOfApproxSizeFromDrawable$1 drawableUtils$createBitmapOfApproxSizeFromDrawable$1 = new com.datadog.android.sessionreplay.internal.utils.DrawableUtils$createBitmapOfApproxSizeFromDrawable$1(this, drawable, bitmapCreationCallback);
        kotlin.Pair<java.lang.Integer, java.lang.Integer> highSpeedVideoSizes = getHighSpeedVideoSizes(drawableWidth, drawableHeight, requestedSizeInBytes);
        int intValue = highSpeedVideoSizes.component1().intValue();
        int intValue2 = highSpeedVideoSizes.component2().intValue();
        android.graphics.Bitmap bitmapByProperties$dd_sdk_android_session_replay_release = this.getHighResolutionOutputSizeshNQ4ISI.getBitmapByProperties$dd_sdk_android_session_replay_release(intValue, intValue2, config);
        if (bitmapByProperties$dd_sdk_android_session_replay_release == null) {
            bitmapByProperties$dd_sdk_android_session_replay_release = this.getHighSpeedVideoFpsRangesFor.createBitmap(intValue, intValue2, config, displayMetrics);
        }
        if (bitmapByProperties$dd_sdk_android_session_replay_release == null) {
            drawableUtils$createBitmapOfApproxSizeFromDrawable$1.onFailure();
        } else {
            drawableUtils$createBitmapOfApproxSizeFromDrawable$1.onSuccess(bitmapByProperties$dd_sdk_android_session_replay_release);
        }
    }

    public static /* synthetic */ android.graphics.Bitmap createScaledBitmap$dd_sdk_android_session_replay_release$default(com.datadog.android.sessionreplay.internal.utils.DrawableUtils drawableUtils, android.graphics.Bitmap bitmap, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = MAX_BITMAP_SIZE_BYTES_WITH_RESOURCE_ENDPOINT;
        }
        return drawableUtils.createScaledBitmap$dd_sdk_android_session_replay_release(bitmap, i);
    }

    public final android.graphics.Bitmap createScaledBitmap$dd_sdk_android_session_replay_release(android.graphics.Bitmap bitmap, int requestedSizeInBytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        kotlin.Pair<java.lang.Integer, java.lang.Integer> highSpeedVideoSizes = getHighSpeedVideoSizes(bitmap.getWidth(), bitmap.getHeight(), requestedSizeInBytes);
        return this.getHighSpeedVideoFpsRangesFor.createScaledBitmap$dd_sdk_android_session_replay_release(bitmap, highSpeedVideoSizes.component1().intValue(), highSpeedVideoSizes.component2().intValue(), false);
    }

    private static kotlin.Pair<java.lang.Integer, java.lang.Integer> getHighSpeedVideoSizes(int p0, int p1, int p2) {
        if (p0 * p1 * 4 > p2) {
            double d = p0 / p1;
            p0 = (int) java.lang.Math.sqrt(p2 / 4);
            if (d > 1.0d) {
                p1 = (int) (p0 / d);
            } else {
                p1 = p0;
                p0 = (int) (p0 * d);
            }
        }
        return new kotlin.Pair<>(java.lang.Integer.valueOf(p0), java.lang.Integer.valueOf(p1));
    }

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080T¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000b\u0010\u0003"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/utils/DrawableUtils$Companion;", "", "<init>", "()V", "", "DRAWABLE_DRAW_FINISHED_WITH_RUNTIME_EXCEPTION", "Ljava/lang/String;", "FAILED_TO_CREATE_SCALED_BITMAP_ERROR", "", "MAX_BITMAP_SIZE_BYTES_WITH_RESOURCE_ENDPOINT", com.visa.cbp.getEncExpo.warmup, "getMAX_BITMAP_SIZE_BYTES_WITH_RESOURCE_ENDPOINT$dd_sdk_android_session_replay_release$annotations"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public static /* synthetic */ void getMAX_BITMAP_SIZE_BYTES_WITH_RESOURCE_ENDPOINT$dd_sdk_android_session_replay_release$annotations() {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final /* synthetic */ void access$drawOnCanvas(com.datadog.android.sessionreplay.internal.utils.DrawableUtils drawableUtils, android.graphics.Bitmap bitmap, final android.graphics.drawable.Drawable drawable, com.datadog.android.sessionreplay.internal.recorder.resources.ResourceResolver.BitmapCreationCallback bitmapCreationCallback) {
        android.graphics.Canvas createCanvas = drawableUtils.Camera2StreamConfigurationMap.createCanvas(bitmap);
        if (createCanvas == null) {
            bitmapCreationCallback.onFailure();
            return;
        }
        createCanvas.drawColor(0, android.graphics.PorterDuff.Mode.CLEAR);
        drawable.setBounds(0, 0, createCanvas.getWidth(), createCanvas.getHeight());
        try {
            drawable.draw(createCanvas);
            bitmapCreationCallback.onReady(bitmap);
        } catch (java.lang.RuntimeException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(drawableUtils.getHighSpeedVideoFpsRanges, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.TELEMETRY, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.utils.DrawableUtils$logDrawableDrawException$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Drawable.draw call finished with an exception. Drawable type is ".concat(java.lang.String.valueOf(com.datadog.android.sessionreplay.internal.utils.DrawableExtKt.resolveClassName(drawable)));
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            bitmapCreationCallback.onFailure();
        }
    }
}
