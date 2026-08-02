package coil3.content;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a2\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0086\b¢\u0006\u0004\b\u0006\u0010\n\u001a2\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0086\b¢\u0006\u0004\b\u0006\u0010\r"}, d2 = {"Lcoil3/util/Logger;", "", "tag", "", com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY, "", "log", "(Lcoil3/util/Logger;Ljava/lang/String;Ljava/lang/Throwable;)V", "Lkotlin/Function0;", "message", "(Lcoil3/util/Logger;Ljava/lang/String;Ljava/lang/Throwable;Lkotlin/jvm/functions/Function0;)V", "Lcoil3/util/Logger$Level;", "level", "(Lcoil3/util/Logger;Ljava/lang/String;Lcoil3/util/Logger$Level;Lkotlin/jvm/functions/Function0;)V"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoggingKt {
    public static final void log(coil3.content.Logger logger, java.lang.String str, java.lang.Throwable th) {
        if (logger.getMinLevel().compareTo(coil3.util.Logger.Level.Error) <= 0) {
            logger.log(str, coil3.util.Logger.Level.Error, null, th);
        }
    }

    public static final void log(coil3.content.Logger logger, java.lang.String str, java.lang.Throwable th, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        if (logger.getMinLevel().compareTo(coil3.util.Logger.Level.Error) <= 0) {
            logger.log(str, coil3.util.Logger.Level.Error, function0.invoke(), th);
        }
    }

    public static final void log(coil3.content.Logger logger, java.lang.String str, coil3.util.Logger.Level level, kotlin.jvm.functions.Function0<java.lang.String> function0) {
        if (logger.getMinLevel().compareTo(level) <= 0) {
            logger.log(str, level, function0.invoke(), null);
        }
    }
}
