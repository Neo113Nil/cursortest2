package com.datadog.android.sessionreplay.internal.recorder.resources;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/resources/Alpha8BitmapConverter;", "Lcom/datadog/android/sessionreplay/internal/recorder/resources/BitmapConverter;", "Lcom/datadog/android/api/InternalLogger;", "logger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "Landroid/graphics/Bitmap;", "bitmap", "convertAlpha8BitmapToArgb8888", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "Camera2StreamConfigurationMap", "Lcom/datadog/android/api/InternalLogger;", "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class Alpha8BitmapConverter implements com.datadog.android.sessionreplay.internal.recorder.resources.BitmapConverter {
    private static final com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8BitmapConverter.Companion Companion = new com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8BitmapConverter.Companion(null);

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger getHighSpeedVideoFpsRanges;

    public Alpha8BitmapConverter(com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.getHighSpeedVideoFpsRanges = internalLogger;
    }

    @Override // com.datadog.android.sessionreplay.internal.recorder.resources.BitmapConverter
    public final android.graphics.Bitmap convertAlpha8BitmapToArgb8888(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        if (bitmap.isRecycled() || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            return null;
        }
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap, "");
        try {
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            canvas.drawColor(-16777216);
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setColor(-1);
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, paint);
            return createBitmap;
        } catch (java.lang.IllegalStateException e) {
            createBitmap.recycle();
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.getHighSpeedVideoFpsRanges, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.internal.recorder.resources.Alpha8BitmapConverter$convertAlpha8BitmapToArgb8888$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Failed to draw alpha8 bitmap to ARGB_8888";
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/resources/Alpha8BitmapConverter$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
