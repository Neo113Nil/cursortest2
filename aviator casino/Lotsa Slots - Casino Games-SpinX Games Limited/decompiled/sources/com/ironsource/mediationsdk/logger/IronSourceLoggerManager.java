package com.ironsource.mediationsdk.logger;

/* loaded from: classes5.dex */
public class IronSourceLoggerManager extends com.ironsource.mediationsdk.logger.IronSourceLogger {
    private static volatile com.ironsource.mediationsdk.logger.IronSourceLoggerManager d;
    private final java.util.List<com.ironsource.mediationsdk.logger.IronSourceLogger> c;

    private IronSourceLoggerManager(java.lang.String str) {
        super(str);
        this.c = new java.util.concurrent.CopyOnWriteArrayList();
        c();
    }

    private void c() {
        this.c.add(new com.ironsource.mediationsdk.logger.a(0));
    }

    public static com.ironsource.mediationsdk.logger.IronSourceLoggerManager getLogger() {
        if (d == null) {
            synchronized (com.ironsource.mediationsdk.logger.IronSourceLoggerManager.class) {
                if (d == null) {
                    d = new com.ironsource.mediationsdk.logger.IronSourceLoggerManager("IronSourceLoggerManager");
                }
            }
        }
        return d;
    }

    void a(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag, com.ironsource.C3044fb c3044fb) {
        if (a(c3044fb.a())) {
            return;
        }
        a(ironSourceTag, c3044fb.c(), c3044fb.a());
    }

    public void addLogger(com.ironsource.mediationsdk.logger.IronSourceLogger ironSourceLogger) {
        this.c.add(ironSourceLogger);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    @java.lang.Deprecated(forRemoval = true, since = "8.3.0")
    public void log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag, java.lang.String str, int i) {
        if (a(i)) {
            return;
        }
        a(ironSourceTag, str, i);
    }

    @Override // com.ironsource.mediationsdk.logger.IronSourceLogger
    public void logException(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag, java.lang.String str, java.lang.Throwable th) {
        if (th == null) {
            java.util.Iterator<com.ironsource.mediationsdk.logger.IronSourceLogger> it = this.c.iterator();
            while (it.hasNext()) {
                it.next().log(ironSourceTag, str, 3);
            }
        } else {
            java.util.Iterator<com.ironsource.mediationsdk.logger.IronSourceLogger> it2 = this.c.iterator();
            while (it2.hasNext()) {
                it2.next().logException(ironSourceTag, str, th);
            }
        }
    }

    public void onLog(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag, java.lang.String str, int i) {
        log(ironSourceTag, str, i);
    }

    public void setLoggerDebugLevel(java.lang.String str, int i) {
        if (str == null) {
            return;
        }
        com.ironsource.mediationsdk.logger.IronSourceLogger a2 = a(str);
        if (a2 == null) {
            log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "Failed to find logger:setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i + ")", 0);
            return;
        }
        if (i < 0 || i > 3) {
            this.c.remove(a2);
            return;
        }
        log(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.NATIVE, "setLoggerDebugLevel(loggerName:" + str + " ,debugLevel:" + i + ")", 0);
        a2.setDebugLevel(i);
    }

    private IronSourceLoggerManager(java.lang.String str, int i) {
        super(str, i);
        this.c = new java.util.concurrent.CopyOnWriteArrayList();
        c();
    }

    void a(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag, com.ironsource.C3044fb c3044fb, java.lang.Throwable th) {
        if (a(c3044fb.a())) {
            return;
        }
        logException(ironSourceTag, c3044fb.c(), th);
    }

    public static com.ironsource.mediationsdk.logger.IronSourceLoggerManager getLogger(int i) {
        com.ironsource.mediationsdk.logger.IronSourceLoggerManager logger = getLogger();
        logger.f6445a = i;
        return logger;
    }

    private boolean a(int i) {
        return i < this.f6445a;
    }

    protected void a(com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag ironSourceTag, java.lang.String str, int i) {
        for (com.ironsource.mediationsdk.logger.IronSourceLogger ironSourceLogger : this.c) {
            if (ironSourceLogger.a() <= i) {
                ironSourceLogger.log(ironSourceTag, str, i);
            }
        }
    }

    private com.ironsource.mediationsdk.logger.IronSourceLogger a(java.lang.String str) {
        for (com.ironsource.mediationsdk.logger.IronSourceLogger ironSourceLogger : this.c) {
            if (ironSourceLogger.b().equals(str)) {
                return ironSourceLogger;
            }
        }
        return null;
    }
}
