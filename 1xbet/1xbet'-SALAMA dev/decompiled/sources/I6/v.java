package I6;

/* JADX INFO: loaded from: classes2.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3760a = 0;

    static {
        Object objH;
        Object objH2;
        Exception exc = new Exception();
        String simpleName = p003a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            objH = p077k6.a.class.getCanonicalName();
        } catch (Throwable th) {
            objH = p003a.a.h(th);
        }
        if (p044f6.f.a(objH) != null) {
            objH = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            objH2 = v.class.getCanonicalName();
        } catch (Throwable th2) {
            objH2 = p003a.a.h(th2);
        }
        if (p044f6.f.a(objH2) != null) {
            objH2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
