package B2;

import a.AbstractC0086a;
import d2.AbstractC0276f;
import i2.AbstractC0343b;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f182a = 0;

    static {
        Object n3;
        Object n4;
        Exception exc = new Exception();
        String simpleName = AbstractC0086a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            n3 = AbstractC0343b.class.getCanonicalName();
        } catch (Throwable th) {
            n3 = X0.a.n(th);
        }
        if (AbstractC0276f.a(n3) != null) {
            n3 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            n4 = u.class.getCanonicalName();
        } catch (Throwable th2) {
            n4 = X0.a.n(th2);
        }
        if (AbstractC0276f.a(n4) != null) {
            n4 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
