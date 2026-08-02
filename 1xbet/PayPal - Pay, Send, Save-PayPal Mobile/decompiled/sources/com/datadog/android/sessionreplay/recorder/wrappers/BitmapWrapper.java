package com.datadog.android.sessionreplay.recorder.wrappers;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/datadog/android/sessionreplay/recorder/wrappers/BitmapWrapper;", "", "Lcom/datadog/android/api/InternalLogger;", "logger", "<init>", "(Lcom/datadog/android/api/InternalLogger;)V", "", "bitmapWidth", "bitmapHeight", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/util/DisplayMetrics;", "displayMetrics", "Landroid/graphics/Bitmap;", "createBitmap", "(IILandroid/graphics/Bitmap$Config;Landroid/util/DisplayMetrics;)Landroid/graphics/Bitmap;", "src", "dstWidth", "dstHeight", "", com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.Ledger.FILTER, "createScaledBitmap$dd_sdk_android_session_replay_release", "(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;", "getHighSpeedVideoFpsRangesFor", "Lcom/datadog/android/api/InternalLogger;", "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BitmapWrapper {
    private static final com.datadog.android.sessionreplay.recorder.wrappers.BitmapWrapper.Companion Companion = new com.datadog.android.sessionreplay.recorder.wrappers.BitmapWrapper.Companion(null);

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.datadog.android.api.InternalLogger Camera2StreamConfigurationMap;

    public BitmapWrapper(com.datadog.android.api.InternalLogger internalLogger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(internalLogger, "");
        this.Camera2StreamConfigurationMap = internalLogger;
    }

    public /* synthetic */ BitmapWrapper(com.datadog.android.api.InternalLogger internalLogger, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND() : internalLogger);
    }

    public static /* synthetic */ android.graphics.Bitmap createBitmap$default(com.datadog.android.sessionreplay.recorder.wrappers.BitmapWrapper bitmapWrapper, int i, int i2, android.graphics.Bitmap.Config config, android.util.DisplayMetrics displayMetrics, int i3, java.lang.Object obj) {
        if ((i3 & 8) != 0) {
            displayMetrics = null;
        }
        return bitmapWrapper.createBitmap(i, i2, config, displayMetrics);
    }

    public final android.graphics.Bitmap createBitmap(int bitmapWidth, int bitmapHeight, android.graphics.Bitmap.Config config, android.util.DisplayMetrics displayMetrics) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(config, "");
        try {
            if (displayMetrics != null) {
                return android.graphics.Bitmap.createBitmap(displayMetrics, bitmapWidth, bitmapHeight, config);
            }
            return android.graphics.Bitmap.createBitmap(bitmapWidth, bitmapHeight, config);
        } catch (java.lang.IllegalArgumentException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.Camera2StreamConfigurationMap, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.recorder.wrappers.BitmapWrapper$createBitmap$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighSpeedVideoFpsRangesFor, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Failed to create bitmap";
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    public final android.graphics.Bitmap createScaledBitmap$dd_sdk_android_session_replay_release(android.graphics.Bitmap src, int dstWidth, int dstHeight, boolean filter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(src, "");
        try {
            return android.graphics.Bitmap.createScaledBitmap(src, dstWidth, dstHeight, filter);
        } catch (java.lang.IllegalArgumentException e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.Camera2StreamConfigurationMap, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.MAINTAINER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.recorder.wrappers.BitmapWrapper$createScaledBitmap$1
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Failed to create scaled bitmap";
                }
            }, (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        } catch (java.lang.RuntimeException e2) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(this.Camera2StreamConfigurationMap, com.datadog.android.api.InternalLogger.Level.ERROR, com.datadog.android.api.InternalLogger.Target.USER, (kotlin.jvm.functions.Function0) new kotlin.jvm.functions.Function0<java.lang.String>() { // from class: com.datadog.android.sessionreplay.recorder.wrappers.BitmapWrapper$createScaledBitmap$2
                @Override // kotlin.jvm.functions.Function0
                /* renamed from: Camera2StreamConfigurationMap, reason: merged with bridge method [inline-methods] */
                public final java.lang.String invoke() {
                    return "Failed to create scaled bitmap";
                }
            }, (java.lang.Throwable) e2, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/datadog/android/sessionreplay/recorder/wrappers/BitmapWrapper$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BitmapWrapper() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
