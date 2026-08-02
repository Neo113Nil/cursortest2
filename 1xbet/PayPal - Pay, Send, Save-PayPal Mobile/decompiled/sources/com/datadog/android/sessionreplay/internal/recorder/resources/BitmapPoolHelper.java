package com.datadog.android.sessionreplay.internal.recorder.resources;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ)\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\t\u0010\u0010J%\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00112\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/resources/BitmapPoolHelper;", "", "Lcom/datadog/android/sessionreplay/internal/utils/InvocationUtils;", "invocationUtils", "<init>", "(Lcom/datadog/android/sessionreplay/internal/utils/InvocationUtils;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "generateKey$dd_sdk_android_session_replay_release", "(Landroid/graphics/Bitmap;)Ljava/lang/String;", "", "width", "height", "Landroid/graphics/Bitmap$Config;", "config", "(IILandroid/graphics/Bitmap$Config;)Ljava/lang/String;", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function0;", androidx.core.app.NotificationCompat.CATEGORY_CALL, "safeCall$dd_sdk_android_session_replay_release", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "getHighSpeedVideoFpsRanges", "Lcom/datadog/android/sessionreplay/internal/utils/InvocationUtils;", "getHighSpeedVideoSizes", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class BitmapPoolHelper {
    private static final com.datadog.android.sessionreplay.internal.recorder.resources.BitmapPoolHelper.Companion Companion = new com.datadog.android.sessionreplay.internal.recorder.resources.BitmapPoolHelper.Companion(null);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final com.datadog.android.sessionreplay.internal.utils.InvocationUtils getHighSpeedVideoSizes;

    public BitmapPoolHelper(com.datadog.android.sessionreplay.internal.utils.InvocationUtils invocationUtils) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(invocationUtils, "");
        this.getHighSpeedVideoSizes = invocationUtils;
    }

    public /* synthetic */ BitmapPoolHelper(com.datadog.android.sessionreplay.internal.utils.InvocationUtils invocationUtils, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new com.datadog.android.sessionreplay.internal.utils.InvocationUtils() : invocationUtils);
    }

    public final java.lang.String generateKey$dd_sdk_android_session_replay_release(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        return generateKey$dd_sdk_android_session_replay_release(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    public final java.lang.String generateKey$dd_sdk_android_session_replay_release(int width, int height, android.graphics.Bitmap.Config config) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(width);
        sb.append("-");
        sb.append(height);
        sb.append("-");
        sb.append(config);
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/datadog/android/sessionreplay/internal/recorder/resources/BitmapPoolHelper$Companion;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final <R> R safeCall$dd_sdk_android_session_replay_release(kotlin.jvm.functions.Function0<? extends R> call) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(call, "");
        com.datadog.android.api.InternalLogger unbound = com.datadog.android.api.InternalLogger.INSTANCE.getUNBOUND();
        com.datadog.android.api.InternalLogger.Level level = com.datadog.android.api.InternalLogger.Level.WARN;
        com.datadog.android.api.InternalLogger.Target target = com.datadog.android.api.InternalLogger.Target.MAINTAINER;
        try {
            return call.invoke();
        } catch (java.lang.Exception e) {
            com.datadog.android.api.InternalLogger.DefaultImpls.log$default(unbound, level, target, (kotlin.jvm.functions.Function0) new com.datadog.android.sessionreplay.internal.utils.InvocationUtils$safeCallWithErrorLogging$1("operation failed for bitmap pool"), (java.lang.Throwable) e, false, (java.util.Map) null, 48, (java.lang.Object) null);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BitmapPoolHelper() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
