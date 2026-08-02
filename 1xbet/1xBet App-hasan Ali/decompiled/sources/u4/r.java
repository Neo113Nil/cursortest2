package u4;

import a.AbstractC0444a;
import c4.AbstractC0540a;

/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f20114a = 0;

    static {
        Object p5;
        Object p6;
        Exception exc = new Exception();
        String simpleName = AbstractC0444a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            p5 = AbstractC0540a.class.getCanonicalName();
        } catch (Throwable th) {
            p5 = G4.l.p(th);
        }
        if (W3.k.a(p5) != null) {
            p5 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            p6 = r.class.getCanonicalName();
        } catch (Throwable th2) {
            p6 = G4.l.p(th2);
        }
        if (W3.k.a(p6) != null) {
            p6 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
