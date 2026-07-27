package L3;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: f, reason: collision with root package name */
    public static final TimeUnit f1518f = TimeUnit.MINUTES;

    /* renamed from: a, reason: collision with root package name */
    public final Logger f1519a;

    /* renamed from: c, reason: collision with root package name */
    public final h f1521c;

    /* renamed from: d, reason: collision with root package name */
    public final h f1522d;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f1520b = new AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final double f1523e = 1.0d;

    public n(Logger logger) {
        this.f1519a = logger;
        TimeUnit timeUnit = f1518f;
        this.f1521c = new h(5.0d / timeUnit.toSeconds(1L), 5.0d);
        this.f1522d = new h(1.0d / timeUnit.toSeconds(1L), 1.0d);
    }

    public final void a(Level level, String str, Throwable th) {
        Logger logger = this.f1519a;
        if (logger.isLoggable(level)) {
            AtomicBoolean atomicBoolean = this.f1520b;
            boolean z = atomicBoolean.get();
            h hVar = this.f1522d;
            if (z) {
                if (hVar.a(1.0d)) {
                    if (th != null) {
                        logger.log(level, str, th);
                        return;
                    } else {
                        logger.log(level, str);
                        return;
                    }
                }
                return;
            }
            if (this.f1521c.a(1.0d)) {
                if (th != null) {
                    logger.log(level, str, th);
                    return;
                } else {
                    logger.log(level, str);
                    return;
                }
            }
            if (atomicBoolean.compareAndSet(false, true)) {
                double d6 = this.f1523e;
                hVar.a(d6);
                String obj = f1518f.toString();
                Locale locale = Locale.ROOT;
                String lowerCase = obj.toLowerCase(locale);
                logger.log(level, String.format(locale, "Too many log messages detected. Will only log %.0f time(s) per %s from now on.", Double.valueOf(d6), lowerCase.substring(0, lowerCase.length() - 1)));
                if (th != null) {
                    logger.log(level, str, th);
                } else {
                    logger.log(level, str);
                }
            }
        }
    }
}
