package R3;

import b2.AbstractC0279e;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/* loaded from: classes.dex */
public final class u implements X2.q {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f2652f = Logger.getLogger(u.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f2653g = true;

    /* renamed from: h, reason: collision with root package name */
    public static final Pattern f2654h = Pattern.compile("([A-Za-z]){1}([A-Za-z0-9\\_\\-\\./]){0,254}");

    /* renamed from: i, reason: collision with root package name */
    public static final X2.q f2655i = X2.h.f3518a.a("noop").build();

    /* renamed from: a, reason: collision with root package name */
    public final Object f2656a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f2657b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final Y3.b f2658c;

    /* renamed from: d, reason: collision with root package name */
    public final J3.a f2659d;

    /* renamed from: e, reason: collision with root package name */
    public final Map f2660e;

    public u(Y3.b bVar, J3.a aVar, List list, S3.a aVar2) {
        this.f2659d = aVar;
        this.f2658c = bVar;
        this.f2660e = (Map) list.stream().collect(Collectors.toMap(Function.identity(), new A3.b(17)));
    }

    public static boolean e(String str) {
        if (str != null && f2654h.matcher(str).matches()) {
            return true;
        }
        Level level = Level.WARNING;
        Logger logger = f2652f;
        if (!logger.isLoggable(level)) {
            return false;
        }
        logger.log(level, AbstractC0279e.f("Instrument name \"", str, "\" is invalid, returning noop instrument. Instrument names must consist of 255 or fewer characters including alphanumeric, _, ., -, /, and start with a letter."), (Throwable) new AssertionError());
        return false;
    }

    @Override // X2.q
    public final X2.p a(String str) {
        return !e(str) ? f2655i.a("noop") : f2653g ? new k(this, str, 2) : new o(this, str, 2);
    }

    @Override // X2.q
    public final X2.i b(String str) {
        return !e(str) ? f2655i.b("noop") : f2653g ? new e(this, str, 0) : new o(this, str, 0);
    }

    @Override // X2.q
    public final X2.k c(String str) {
        return !e(str) ? f2655i.c("noop") : f2653g ? new f(this, str) : new p(this, str);
    }

    @Override // X2.q
    public final X2.m d(String str) {
        return !e(str) ? f2655i.d("noop") : f2653g ? new h(this, str, 1) : new o(this, str, 1);
    }

    public final String toString() {
        return "SdkMeter{instrumentationScopeInfo=" + this.f2659d + "}";
    }
}
