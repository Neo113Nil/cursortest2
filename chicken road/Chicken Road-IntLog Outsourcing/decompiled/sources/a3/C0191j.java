package a3;

import java.lang.ref.Reference;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/* renamed from: a3.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0191j implements InterfaceC0183b, AutoCloseable {

    /* renamed from: b, reason: collision with root package name */
    public static final Logger f3872b = Logger.getLogger(C0191j.class.getName());

    /* renamed from: a, reason: collision with root package name */
    public final C0189h f3873a;

    public C0191j() {
        EnumC0194m enumC0194m = EnumC0194m.f3880a;
        this.f3873a = new C0189h(new ConcurrentHashMap());
    }

    public static AssertionError c(C0188g c0188g) {
        AssertionError assertionError = new AssertionError("Thread [" + c0188g.f3864a + "] opened a scope of " + c0188g.f3866c + " here:");
        assertionError.setStackTrace(c0188g.getStackTrace());
        return assertionError;
    }

    @Override // a3.InterfaceC0183b
    public final C0182a a() {
        return EnumC0194m.f3880a.a();
    }

    @Override // a3.InterfaceC0183b
    public final InterfaceC0187f b(C0182a c0182a) {
        int i2;
        InterfaceC0187f b6 = EnumC0194m.f3880a.b(c0182a);
        C0188g c0188g = new C0188g(c0182a);
        StackTraceElement[] stackTrace = c0188g.getStackTrace();
        for (int i3 = 0; i3 < stackTrace.length; i3++) {
            StackTraceElement stackTraceElement = stackTrace[i3];
            if (stackTraceElement.getClassName().equals(C0182a.class.getName()) && stackTraceElement.getMethodName().equals("makeCurrent") && (i2 = i3 + 2) < stackTrace.length) {
                StackTraceElement stackTraceElement2 = stackTrace[i2];
                if (stackTraceElement2.getClassName().equals("kotlin.coroutines.jvm.internal.BaseContinuationImpl") && stackTraceElement2.getMethodName().equals("resumeWith")) {
                    throw new AssertionError("Attempting to call Context.makeCurrent from inside a Kotlin coroutine. This is not allowed. Use Context.asContextElement provided by opentelemetry-extension-kotlin instead of makeCurrent.");
                }
            }
        }
        int i6 = 1;
        while (i6 < stackTrace.length) {
            String className = stackTrace[i6].getClassName();
            if (!className.startsWith("io.opentelemetry.api.") && !className.startsWith("io.opentelemetry.sdk.testing.context.SettableContextStorageProvider") && !className.startsWith("io.opentelemetry.context.")) {
                break;
            }
            i6++;
        }
        c0188g.setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i6, stackTrace.length));
        return new C0190i(this, b6, c0188g);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        C0189h c0189h;
        while (true) {
            c0189h = this.f3873a;
            Reference poll = c0189h.poll();
            if (poll == null) {
                break;
            } else {
                c0189h.f4824a.remove(poll);
            }
        }
        ConcurrentHashMap concurrentHashMap = c0189h.f3868d;
        List list = (List) concurrentHashMap.values().stream().filter(new D3.f(1)).collect(Collectors.toList());
        concurrentHashMap.clear();
        if (list.isEmpty()) {
            return;
        }
        if (list.size() > 1) {
            Level level = Level.SEVERE;
            Logger logger = f3872b;
            logger.log(level, "Multiple scopes leaked - first will be thrown as an error.");
            Iterator it = list.iterator();
            while (it.hasNext()) {
                logger.log(Level.SEVERE, "Scope leaked", (Throwable) c((C0188g) it.next()));
            }
        }
        throw c((C0188g) list.get(0));
    }
}
