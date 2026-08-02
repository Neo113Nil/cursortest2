package androidx.window.core;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroidx/window/core/AndroidLogger;", "Landroidx/window/core/Logger;", "<init>", "()V", "", "tag", "message", "", com.datadog.android.rum.internal.domain.event.RumEventDeserializer.TELEMETRY_TYPE_DEBUG, "(Ljava/lang/String;Ljava/lang/String;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidLogger implements androidx.window.core.Logger {
    public static final androidx.window.core.AndroidLogger INSTANCE = new androidx.window.core.AndroidLogger();

    @Override // androidx.window.core.Logger
    public final void debug(java.lang.String tag, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "");
    }

    private AndroidLogger() {
    }
}
