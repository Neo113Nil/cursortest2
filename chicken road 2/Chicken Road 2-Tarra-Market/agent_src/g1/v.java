package g1;

import a.AbstractC0009a;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1180a = 0;

    static {
        Object k2;
        Object k3;
        Exception exc = new Exception();
        String simpleName = AbstractC0009a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            k2 = O0.b.class.getCanonicalName();
        } catch (Throwable th) {
            k2 = V.a.k(th);
        }
        if (K0.f.a(k2) != null) {
            k2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            k3 = v.class.getCanonicalName();
        } catch (Throwable th2) {
            k3 = V.a.k(th2);
        }
        if (K0.f.a(k3) != null) {
            k3 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
