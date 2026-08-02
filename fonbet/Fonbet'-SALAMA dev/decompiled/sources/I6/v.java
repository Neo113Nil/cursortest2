package I6;

import a.AbstractC0603a;
import f6.C1113f;
import k6.AbstractC1354a;

/* loaded from: classes2.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3760a = 0;

    static {
        Object h6;
        Object h7;
        Exception exc = new Exception();
        String simpleName = AbstractC0603a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            h6 = AbstractC1354a.class.getCanonicalName();
        } catch (Throwable th) {
            h6 = AbstractC0603a.h(th);
        }
        if (C1113f.a(h6) != null) {
            h6 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            h7 = v.class.getCanonicalName();
        } catch (Throwable th2) {
            h7 = AbstractC0603a.h(th2);
        }
        if (C1113f.a(h7) != null) {
            h7 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
