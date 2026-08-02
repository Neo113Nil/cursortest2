package com.datadog.android.sessionreplay.internal.utils;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u0000 +2\u00020\u0001:\u0001+B7\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0018\u001a\u00020\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u00102\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010)R\u0014\u0010$\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010*"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/utils/PathUtils;", "", "Lcom/datadog/android/api/InternalLogger;", "logger", "Lcom/datadog/android/sessionreplay/internal/recorder/resources/BitmapCachesManager;", "bitmapCachesManager", "Lcom/datadog/android/sessionreplay/recorder/wrappers/CanvasWrapper;", "canvasWrapper", "Lcom/datadog/android/sessionreplay/recorder/wrappers/BitmapWrapper;", "bitmapWrapper", "Lcom/datadog/android/sessionreplay/internal/recorder/resources/HashGenerator;", "md5Generator", "<init>", "(Lcom/datadog/android/api/InternalLogger;Lcom/datadog/android/sessionreplay/internal/recorder/resources/BitmapCachesManager;Lcom/datadog/android/sessionreplay/recorder/wrappers/CanvasWrapper;Lcom/datadog/android/sessionreplay/recorder/wrappers/BitmapWrapper;Lcom/datadog/android/sessionreplay/internal/recorder/resources/HashGenerator;)V", "Landroid/graphics/Path;", "checkPath", "", "checkmarkColor", "desiredWidth", "desiredHeight", "strokeWidth", "Landroid/graphics/Bitmap;", "convertPathToBitmap$dd_sdk_android_session_replay_release", "(Landroid/graphics/Path;IIII)Landroid/graphics/Bitmap;", "path", "maxPoints", "", "sampleInterval", "Landroid/graphics/PathMeasure;", "pathMeasure", "", "generateKeyForPath$dd_sdk_android_session_replay_release", "(Landroid/graphics/Path;IFLandroid/graphics/PathMeasure;)Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/datadog/android/sessionreplay/internal/recorder/resources/BitmapCachesManager;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Lcom/datadog/android/sessionreplay/recorder/wrappers/BitmapWrapper;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/sessionreplay/recorder/wrappers/CanvasWrapper;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/api/InternalLogger;", "Lcom/datadog/android/sessionreplay/internal/recorder/resources/HashGenerator;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class PathUtils {
    public static final int DEFAULT_MAX_PATH_LENGTH = 1000;
    public static final float DEFAULT_SAMPLE_INTERVAL = 10.0f;
    public static final java.lang.String EMPTY_POINTS = "0.0,0.0;";
    public static final java.lang.String PATH_DRAW_ERROR = "Failed to draw Path to Canvas";

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.recorder.wrappers.CanvasWrapper getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.recorder.resources.BitmapCachesManager getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.recorder.resources.HashGenerator getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.recorder.wrappers.BitmapWrapper Camera2StreamConfigurationMap;

    public PathUtils(com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.sessionreplay.internal.recorder.resources.BitmapCachesManager bitmapCachesManager, com.datadog.android.sessionreplay.recorder.wrappers.CanvasWrapper canvasWrapper, com.datadog.android.sessionreplay.recorder.wrappers.BitmapWrapper bitmapWrapper, com.datadog.android.sessionreplay.internal.recorder.resources.HashGenerator hashGenerator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmapCachesManager, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(canvasWrapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmapWrapper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(hashGenerator, "");
        this.getHighResolutionOutputSizeshNQ4ISI = internalLogger;
        this.getHighSpeedVideoFpsRangesFor = bitmapCachesManager;
        this.getHighSpeedVideoFpsRanges = canvasWrapper;
        this.Camera2StreamConfigurationMap = bitmapWrapper;
        this.getHighSpeedVideoSizes = hashGenerator;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ PathUtils(com.datadog.android.api.InternalLogger internalLogger, com.datadog.android.sessionreplay.internal.recorder.resources.BitmapCachesManager bitmapCachesManager, com.datadog.android.sessionreplay.recorder.wrappers.CanvasWrapper canvasWrapper, com.datadog.android.sessionreplay.recorder.wrappers.BitmapWrapper bitmapWrapper, com.datadog.android.sessionreplay.internal.recorder.resources.MD5HashGenerator mD5HashGenerator, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, bitmapCachesManager, (i & 4) != 0 ? new com.datadog.android.sessionreplay.recorder.wrappers.CanvasWrapper(r1) : canvasWrapper, (i & 8) != 0 ? new com.datadog.android.sessionreplay.recorder.wrappers.BitmapWrapper(null, 1, null) : bitmapWrapper, (i & 16) != 0 ? new com.datadog.android.sessionreplay.internal.recorder.resources.MD5HashGenerator(r1) : mD5HashGenerator);
        com.datadog.android.api.InternalLogger unbound = (i & 1) != 0 ? com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND() : internalLogger;
    }

    public static /* synthetic */ java.lang.String generateKeyForPath$dd_sdk_android_session_replay_release$default(com.datadog.android.sessionreplay.internal.utils.PathUtils pathUtils, android.graphics.Path path, int i, float f, android.graphics.PathMeasure pathMeasure, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 1000;
        }
        if ((i2 & 4) != 0) {
            f = 10.0f;
        }
        if ((i2 & 8) != 0) {
            pathMeasure = new android.graphics.PathMeasure(path, false);
        }
        return pathUtils.generateKeyForPath$dd_sdk_android_session_replay_release(path, i, f, pathMeasure);
    }

    public final java.lang.String generateKeyForPath$dd_sdk_android_session_replay_release(android.graphics.Path path, int maxPoints, float sampleInterval, android.graphics.PathMeasure pathMeasure) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(path, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pathMeasure, "");
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        float f = 0.0f;
        int i = 0;
        while (f < pathMeasure.getLength() && i < maxPoints) {
            pathMeasure.getPosTan(f, fArr, fArr2);
            float f2 = fArr[0];
            float f3 = fArr[1];
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(f2);
            sb2.append(",");
            sb2.append(f3);
            sb2.append(";");
            sb.append(sb2.toString());
            i++;
            f += sampleInterval;
            if (!pathMeasure.nextContour()) {
                break;
            }
        }
        java.lang.String obj = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
        if (kotlin.jvm.internal.Intrinsics.areEqual(obj, EMPTY_POINTS)) {
            return null;
        }
        com.datadog.android.sessionreplay.internal.recorder.resources.HashGenerator hashGenerator = this.getHighSpeedVideoSizes;
        byte[] bytes = obj.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        return hashGenerator.generate(bytes);
    }

    public final android.graphics.Bitmap convertPathToBitmap$dd_sdk_android_session_replay_release(android.graphics.Path checkPath, int checkmarkColor, int desiredWidth, int desiredHeight, int strokeWidth) {
        android.graphics.Canvas createCanvas;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkPath, "");
        android.graphics.RectF rectF = new android.graphics.RectF();
        checkPath.computeBounds(rectF, true);
        float min = java.lang.Math.min(desiredWidth / rectF.width(), desiredHeight / rectF.height());
        float f = (rectF.left + rectF.right) / 2.0f;
        float f2 = (rectF.top + rectF.bottom) / 2.0f;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.preTranslate((desiredWidth / 2) - (f * min), (desiredHeight / 2) - (f2 * min));
        matrix.preScale(min, min);
        checkPath.transform(matrix);
        android.graphics.Bitmap bitmapByProperties$dd_sdk_android_session_replay_release = this.getHighSpeedVideoFpsRangesFor.getBitmapByProperties$dd_sdk_android_session_replay_release(desiredWidth, desiredHeight, android.graphics.Bitmap.Config.ARGB_8888);
        if ((bitmapByProperties$dd_sdk_android_session_replay_release == null && (bitmapByProperties$dd_sdk_android_session_replay_release = com.datadog.android.sessionreplay.recorder.wrappers.BitmapWrapper.createBitmap$default(this.Camera2StreamConfigurationMap, desiredWidth, desiredHeight, android.graphics.Bitmap.Config.ARGB_8888, null, 8, null)) == null) || (createCanvas = this.getHighSpeedVideoFpsRanges.createCanvas(bitmapByProperties$dd_sdk_android_session_replay_release)) == null) {
            return null;
        }
        android.graphics.Paint paint = new android.graphics.Paint();
        paint.setColor(checkmarkColor);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(strokeWidth);
        paint.setAntiAlias(true);
        if (createCanvas != null) {
            try {
                createCanvas.drawPath(checkPath, paint);
            } catch (java.lang.IllegalArgumentException e) {
                com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighResolutionOutputSizeshNQ4ISI, com.datadog.android.api.InternalLogger.Level.WARN, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.utils.PathUtils$drawPathSafe$1
                    @Override // kotlin.jvm.functions.Function0
                    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                    public final java.lang.String invoke() {
                        return com.datadog.android.sessionreplay.internal.utils.PathUtils.PATH_DRAW_ERROR;
                    }
                }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            }
        }
        return bitmapByProperties$dd_sdk_android_session_replay_release;
    }
}
