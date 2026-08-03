package R1;

/* loaded from: classes.dex */
public final class d extends java.util.logging.Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final R1.d f1692a = new R1.d();

    @Override // java.util.logging.Handler
    public final void publish(java.util.logging.LogRecord record) {
        int min;
        kotlin.jvm.internal.i.e(record, "record");
        java.util.concurrent.CopyOnWriteArraySet copyOnWriteArraySet = R1.c.f1690a;
        java.lang.String loggerName = record.getLoggerName();
        kotlin.jvm.internal.i.d(loggerName, "record.loggerName");
        int intValue = record.getLevel().intValue();
        java.util.logging.Level level = java.util.logging.Level.INFO;
        int i2 = intValue > level.intValue() ? 5 : record.getLevel().intValue() == level.intValue() ? 4 : 3;
        java.lang.String message = record.getMessage();
        kotlin.jvm.internal.i.d(message, "record.message");
        java.lang.Throwable thrown = record.getThrown();
        java.lang.String str = (java.lang.String) R1.c.f1691b.get(loggerName);
        if (str == null) {
            str = y1.g.b0(23, loggerName);
        }
        if (android.util.Log.isLoggable(str, i2)) {
            if (thrown != null) {
                message = message + '\n' + ((java.lang.Object) android.util.Log.getStackTraceString(thrown));
            }
            int length = message.length();
            int i3 = 0;
            while (i3 < length) {
                int Q2 = y1.g.Q(message, '\n', i3, false, 4);
                if (Q2 == -1) {
                    Q2 = length;
                }
                while (true) {
                    min = java.lang.Math.min(Q2, i3 + 4000);
                    java.lang.String substring = message.substring(i3, min);
                    kotlin.jvm.internal.i.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    android.util.Log.println(i2, str, substring);
                    if (min >= Q2) {
                        break;
                    } else {
                        i3 = min;
                    }
                }
                i3 = min + 1;
            }
        }
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
