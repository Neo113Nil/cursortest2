package P2;

import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Logger f2286a = Logger.getLogger(c.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public static final Object f2287b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile b f2288c;

    /* renamed from: d, reason: collision with root package name */
    public static Throwable f2289d;

    public static b a() {
        try {
            Class<?> cls = Class.forName("io.opentelemetry.sdk.autoconfigure.AutoConfiguredOpenTelemetrySdk");
            boolean parseBoolean = Boolean.parseBoolean(V2.d.b("otel.java.global-autoconfigure.enabled", "false"));
            Logger logger = f2286a;
            if (!parseBoolean) {
                logger.log(Level.INFO, "AutoConfiguredOpenTelemetrySdk found on classpath but automatic configuration is disabled. To enable, run your JVM with -Dotel.java.global-autoconfigure.enabled=true");
                return null;
            }
            try {
                return new b((d) cls.getMethod("getOpenTelemetrySdk", null).invoke(cls.getMethod("initialize", null).invoke(null, null), null));
            } catch (IllegalAccessException e3) {
                e = e3;
                throw new IllegalStateException("AutoConfiguredOpenTelemetrySdk detected on classpath but could not invoke initialize method. This is a bug in OpenTelemetry.", e);
            } catch (NoSuchMethodException e6) {
                e = e6;
                throw new IllegalStateException("AutoConfiguredOpenTelemetrySdk detected on classpath but could not invoke initialize method. This is a bug in OpenTelemetry.", e);
            } catch (InvocationTargetException e7) {
                logger.log(Level.SEVERE, "Error automatically configuring OpenTelemetry SDK. OpenTelemetry will not be enabled.", e7.getTargetException());
                return null;
            }
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static void b(a aVar) {
        synchronized (f2287b) {
            try {
                if (f2288c != null) {
                    throw new IllegalStateException("GlobalOpenTelemetry.set has already been called. GlobalOpenTelemetry.set must be called only once before any calls to GlobalOpenTelemetry.get. If you are using the OpenTelemetrySdk, use OpenTelemetrySdkBuilder.buildAndRegisterGlobal instead. Previous invocation set to cause of this exception.", f2289d);
                }
                f2288c = new b(aVar);
                f2289d = new Throwable();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
