package androidx.camera.camera2.impl;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ+\u0010\b\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\fJ#\u0010\r\u001a\u00020\u00072\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\tJ+\u0010\r\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\r\u0010\fJ#\u0010\u000e\u001a\u00020\u00072\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\tJ+\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\fJ#\u0010\u000f\u001a\u00020\u00072\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\tJ+\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\fJ#\u0010\u0010\u001a\u00020\u00072\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\tJ+\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\fR\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/camera/camera2/impl/Camera2Logger;", "", "<init>", "()V", "Lkotlin/Function0;", "", androidx.core.app.NotificationCompat.CATEGORY_MESSAGE, "", "verbose", "(Lkotlin/jvm/functions/Function0;)V", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", com.datadog.android.rum.internal.domain.event.RumEventDeserializer.TELEMETRY_TYPE_DEBUG, "info", "warn", "error", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class Camera2Logger {
    public static final androidx.camera.camera2.impl.Camera2Logger INSTANCE = new androidx.camera.camera2.impl.Camera2Logger();

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private static final java.lang.String getHighSpeedVideoFpsRanges = androidx.camera.camera2.pipe.core.Log.TAG;

    private Camera2Logger() {
    }

    public final void verbose(kotlin.jvm.functions.Function0<java.lang.String> msg) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "");
        if (androidx.camera.core.Logger.isVerboseEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = getHighSpeedVideoFpsRanges;
            msg.invoke();
        }
    }

    public final void verbose(java.lang.Throwable throwable, kotlin.jvm.functions.Function0<java.lang.String> msg) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "");
        if (androidx.camera.core.Logger.isVerboseEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = getHighSpeedVideoFpsRanges;
            msg.invoke();
        }
    }

    public final void debug(kotlin.jvm.functions.Function0<java.lang.String> msg) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "");
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = getHighSpeedVideoFpsRanges;
            msg.invoke();
        }
    }

    public final void debug(java.lang.Throwable throwable, kotlin.jvm.functions.Function0<java.lang.String> msg) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "");
        if (androidx.camera.core.Logger.isDebugEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = getHighSpeedVideoFpsRanges;
            msg.invoke();
        }
    }

    public final void info(kotlin.jvm.functions.Function0<java.lang.String> msg) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "");
        if (androidx.camera.core.Logger.isInfoEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = getHighSpeedVideoFpsRanges;
            msg.invoke();
        }
    }

    public final void info(java.lang.Throwable throwable, kotlin.jvm.functions.Function0<java.lang.String> msg) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "");
        if (androidx.camera.core.Logger.isInfoEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = getHighSpeedVideoFpsRanges;
            msg.invoke();
        }
    }

    public final void warn(kotlin.jvm.functions.Function0<java.lang.String> msg) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "");
        if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = getHighSpeedVideoFpsRanges;
            msg.invoke();
        }
    }

    public final void warn(java.lang.Throwable throwable, kotlin.jvm.functions.Function0<java.lang.String> msg) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "");
        if (androidx.camera.core.Logger.isWarnEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = getHighSpeedVideoFpsRanges;
            msg.invoke();
        }
    }

    public final void error(kotlin.jvm.functions.Function0<java.lang.String> msg) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "");
        if (androidx.camera.core.Logger.isErrorEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = getHighSpeedVideoFpsRanges;
            msg.invoke();
        }
    }

    public final void error(java.lang.Throwable throwable, kotlin.jvm.functions.Function0<java.lang.String> msg) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(throwable, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(msg, "");
        if (androidx.camera.core.Logger.isErrorEnabled(androidx.camera.camera2.pipe.core.Log.TAG)) {
            java.lang.String unused = getHighSpeedVideoFpsRanges;
            msg.invoke();
        }
    }
}
