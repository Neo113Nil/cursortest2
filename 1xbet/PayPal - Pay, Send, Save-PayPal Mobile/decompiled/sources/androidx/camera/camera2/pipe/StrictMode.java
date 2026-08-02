package androidx.camera.camera2.pipe;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"Landroidx/camera/camera2/pipe/StrictMode;", "", "", "enabled", "<init>", "(Z)V", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "Lkotlin/Function0;", "", "message", "", "check", "(ZLkotlin/jvm/functions/Function0;)V", "Z", "getEnabled", "()Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class StrictMode {
    private final boolean enabled;

    public StrictMode(boolean z) {
        this.enabled = z;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void check(boolean value, kotlin.jvm.functions.Function0<java.lang.String> message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
        if (value) {
            return;
        }
        java.lang.String invoke = message.invoke();
        if (getEnabled()) {
            throw new java.lang.IllegalStateException(invoke);
        }
        androidx.camera.camera2.pipe.core.Log.INSTANCE.getWARN_LOGGABLE();
    }
}
