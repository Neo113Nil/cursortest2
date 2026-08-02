package H4;

import android.util.Log;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import o4.AbstractC2227e;

/* loaded from: classes.dex */
public final class d extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public static final d f2369a = new d();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int min;
        kotlin.jvm.internal.l.f("record", logRecord);
        CopyOnWriteArraySet copyOnWriteArraySet = c.f2367a;
        String loggerName = logRecord.getLoggerName();
        kotlin.jvm.internal.l.e("record.loggerName", loggerName);
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        int i = intValue > level.intValue() ? 5 : logRecord.getLevel().intValue() == level.intValue() ? 4 : 3;
        String message = logRecord.getMessage();
        kotlin.jvm.internal.l.e("record.message", message);
        Throwable thrown = logRecord.getThrown();
        String str = (String) c.f2368b.get(loggerName);
        if (str == null) {
            str = AbstractC2227e.P0(loggerName, 23);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                message = message + '\n' + Log.getStackTraceString(thrown);
            }
            int length = message.length();
            int i5 = 0;
            while (i5 < length) {
                int F02 = AbstractC2227e.F0(message, '\n', i5, 4);
                if (F02 == -1) {
                    F02 = length;
                }
                while (true) {
                    min = Math.min(F02, i5 + 4000);
                    String substring = message.substring(i5, min);
                    kotlin.jvm.internal.l.e("this as java.lang.String…ing(startIndex, endIndex)", substring);
                    Log.println(i, str, substring);
                    if (min >= F02) {
                        break;
                    } else {
                        i5 = min;
                    }
                }
                i5 = min + 1;
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
