package p000;

import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

/* JADX INFO: renamed from: dg */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0137dg {

    /* JADX INFO: renamed from: c */
    public static final Logger f1641c = Logger.getLogger(AbstractC0875xf.class.getName());

    /* JADX INFO: renamed from: a */
    public final Object f1642a = new Object();

    /* JADX INFO: renamed from: b */
    public final me0 f1643b;

    public C0137dg(me0 me0Var, long j, String str) {
        this.f1643b = me0Var;
        m1202b(new ie0(str.concat(" created"), he0.f3184j, j, null));
    }

    /* JADX INFO: renamed from: a */
    public static void m1201a(me0 me0Var, Level level, String str) {
        Logger logger = f1641c;
        if (logger.isLoggable(level)) {
            LogRecord logRecord = new LogRecord(level, "[" + me0Var + "] " + str);
            logRecord.setLoggerName(logger.getName());
            logRecord.setSourceClassName(logger.getName());
            logRecord.setSourceMethodName("log");
            logger.log(logRecord);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m1202b(ie0 ie0Var) {
        Level level;
        int iOrdinal = ie0Var.f3558b.ordinal();
        if (iOrdinal != 2) {
            level = iOrdinal != 3 ? Level.FINEST : Level.FINE;
        } else {
            level = Level.FINER;
        }
        synchronized (this.f1642a) {
        }
        m1201a(this.f1643b, level, ie0Var.f3557a);
    }
}
