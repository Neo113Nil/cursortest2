package coil3.content;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J3\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0003\u001a\u00020\u00028\u0017@\u0017X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0005"}, d2 = {"Lcoil3/util/DebugLogger;", "Lcoil3/util/Logger;", "Lcoil3/util/Logger$Level;", "minLevel", "<init>", "(Lcoil3/util/Logger$Level;)V", "", "tag", "level", "message", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "log", "(Ljava/lang/String;Lcoil3/util/Logger$Level;Ljava/lang/String;Ljava/lang/Throwable;)V", "Lcoil3/util/Logger$Level;", "getMinLevel", "()Lcoil3/util/Logger$Level;", "setMinLevel"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DebugLogger implements coil3.content.Logger {
    private coil3.util.Logger.Level minLevel;

    public DebugLogger(coil3.util.Logger.Level level) {
        this.minLevel = level;
    }

    public /* synthetic */ DebugLogger(coil3.util.Logger.Level level, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? coil3.util.Logger.Level.Debug : level);
    }

    @Override // coil3.content.Logger
    public final coil3.util.Logger.Level getMinLevel() {
        return this.minLevel;
    }

    @Override // coil3.content.Logger
    public final void setMinLevel(coil3.util.Logger.Level level) {
        this.minLevel = level;
    }

    @Override // coil3.content.Logger
    public final void log(java.lang.String tag, coil3.util.Logger.Level level, java.lang.String message, java.lang.Throwable throwable) {
        if (message != null) {
            coil3.content.Utils_androidKt.println(level, tag, message);
        }
        if (throwable != null) {
            coil3.content.Utils_androidKt.println(level, tag, kotlin.ExceptionsKt.stackTraceToString(throwable));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DebugLogger() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
