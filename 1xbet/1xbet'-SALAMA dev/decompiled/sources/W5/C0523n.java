package W5;

import U5.AbstractC0438e;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: renamed from: W5.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C0523n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f7290c = Logger.getLogger(AbstractC0438e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7291a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U5.F f7292b;

    public C0523n(U5.F f7, long j, String str) {
        p113p3.f.k(str, "description");
        this.f7292b = f7;
        String strConcat = str.concat(" created");
        U5.A a2 = U5.A.f6403a;
        p113p3.f.k(strConcat, "description");
        b(new U5.B(strConcat, a2, j, null));
    }

    public static void a(U5.F f7, Level level, String str) {
        Logger logger = f7290c;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + f7 + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    public final void b(U5.B b7) {
        Level level;
        int iOrdinal = b7.f6408b.ordinal();
        if (iOrdinal != 2) {
            level = iOrdinal != 3 ? Level.FINEST : Level.FINE;
        } else {
            level = Level.FINER;
        }
        synchronized (this.f7291a) {
        }
        a(this.f7292b, level, b7.f6407a);
    }
}
