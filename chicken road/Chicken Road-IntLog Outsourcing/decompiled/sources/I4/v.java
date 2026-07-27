package I4;

import a.AbstractC0169a;
import f4.AbstractC0432i;
import m4.AbstractC1293a;

/* loaded from: classes.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1324a = 0;

    static {
        Object l2;
        Object l6;
        Exception exc = new Exception();
        String simpleName = AbstractC0169a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            l2 = AbstractC1293a.class.getCanonicalName();
        } catch (Throwable th) {
            l2 = e5.g.l(th);
        }
        if (AbstractC0432i.a(l2) != null) {
            l2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            l6 = v.class.getCanonicalName();
        } catch (Throwable th2) {
            l6 = e5.g.l(th2);
        }
        if (AbstractC0432i.a(l6) != null) {
            l6 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
