package net.zetetic.database.sqlcipher;

/* loaded from: classes5.dex */
public final class CloseGuard {
    private java.lang.Throwable allocationSite;
    private static final net.zetetic.database.sqlcipher.CloseGuard NOOP = new net.zetetic.database.sqlcipher.CloseGuard();
    private static volatile boolean ENABLED = true;
    private static volatile net.zetetic.database.sqlcipher.CloseGuard.Reporter REPORTER = new net.zetetic.database.sqlcipher.CloseGuard.DefaultReporter();

    public interface Reporter {
        void report(java.lang.String str, java.lang.Throwable th);
    }

    public static net.zetetic.database.sqlcipher.CloseGuard get() {
        if (!ENABLED) {
            return NOOP;
        }
        return new net.zetetic.database.sqlcipher.CloseGuard();
    }

    public static void setEnabled(boolean z) {
        ENABLED = z;
    }

    public static void setReporter(net.zetetic.database.sqlcipher.CloseGuard.Reporter reporter) {
        if (reporter == null) {
            throw new java.lang.NullPointerException("reporter == null");
        }
        REPORTER = reporter;
    }

    public static net.zetetic.database.sqlcipher.CloseGuard.Reporter getReporter() {
        return REPORTER;
    }

    private CloseGuard() {
    }

    public final void open(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("closer == null");
        }
        if (this == NOOP || !ENABLED) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Explicit termination method '");
        sb.append(str);
        sb.append("' not called");
        this.allocationSite = new java.lang.Throwable(sb.toString());
    }

    public final void close() {
        this.allocationSite = null;
    }

    public final void warnIfOpen() {
        if (this.allocationSite == null || !ENABLED) {
            return;
        }
        REPORTER.report("A resource was acquired at attached stack trace but never released. See java.io.Closeable for information on avoiding resource leaks.", this.allocationSite);
    }

    static final class DefaultReporter implements net.zetetic.database.sqlcipher.CloseGuard.Reporter {
        @Override // net.zetetic.database.sqlcipher.CloseGuard.Reporter
        public final void report(java.lang.String str, java.lang.Throwable th) {
        }

        private DefaultReporter() {
        }
    }
}
